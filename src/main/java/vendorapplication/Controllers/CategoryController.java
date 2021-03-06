package vendorapplication.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vendorapplication.entities.CategoryEntity;
import vendorapplication.form.CategoryForm;
import vendorapplication.services.CategoryService;
import vendorapplication.validators.CategoryValidator;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;

@Controller
public class CategoryController {


    @Autowired
    CategoryService vendorService;

    @Autowired
    CategoryValidator categoryValidator;

    private static final Logger logger = LoggerFactory.getLogger(RolesController.class);

    @RequestMapping(value = "/getcategory", method = RequestMethod.GET)
    public String createRole(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
        model.addAttribute("categoryForm", new CategoryForm());
        return "categories";
       }
    }




    @RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
    public String saveCategory(@ModelAttribute("categoryForm") CategoryForm roleForm, BindingResult bindingResult, Model model, HttpServletRequest request) {
        categoryValidator.validate(roleForm, bindingResult);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
        if (bindingResult.hasErrors()) {
            return "categories";
        }
        try {
            CategoryEntity rolesEntity = new CategoryEntity();
            rolesEntity.setActive(true);
            rolesEntity.setCategoryName(roleForm.getCategoryName());
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            Date date = new Date(timestamp.getTime());
            rolesEntity.setCreatedDate(date);
            CategoryEntity savedData = vendorService.saveRole(rolesEntity);
            roleForm.setCategoryName("");
            request.getSession().setAttribute("successMessage", savedData.getCategoryName() + " Category Successfully Saved. ID is" + savedData.getCategoryID());
            return "categories";
        } catch (Exception ex) {
            roleForm.setCategoryName("");
            model.addAttribute("serverError", ex.toString());
            return "categories";
        }
          }


    }



}
