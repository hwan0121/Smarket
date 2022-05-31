package net.lele.controller;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import net.lele.domain.Ask;
import net.lele.domain.Category;
import net.lele.domain.City;
import net.lele.domain.Message;
import net.lele.domain.Product;
import net.lele.domain.Product_image;
import net.lele.domain.State;
import net.lele.domain.User;
import net.lele.repository.ProductRepository;
import net.lele.repository.UserRepository;
import net.lele.service.AskService;
import net.lele.service.CategoryService;
import net.lele.service.CityService;
import net.lele.service.CommentService;
import net.lele.service.Interest_productService;
import net.lele.service.MessageService;
import net.lele.service.ProductService;
import net.lele.service.Product_imageService;
import net.lele.service.StateService;
import net.lele.service.UserService;
import net.lele.utils.EncryptionUtils;
import net.lele.utils.UploadFileUtils;

@Controller
public class UploadController {

	@RequestMapping("upload/dnpqtnpf1tpxmtm4")
	public String test(){
		return "upload/dnpqtnpf1tpxmtm4";
	}

}
