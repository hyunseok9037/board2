package shop.mtcoding.demo.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import shop.mtcoding.demo.model.Board;
import shop.mtcoding.demo.model.BoardRepository;
import shop.mtcoding.demo.model.User;

@Controller
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private HttpSession session;

    @GetMapping({ "/", "/board" })
    public String home(Model model) {
        User user = (User) session.getAttribute("principal");
        List<Board> boardList = boardRepository.findById(user.getId());
        model.addAttribute("boardList", boardList);
        return "board/list";
    }

}
