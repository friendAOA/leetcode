package PO;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 祈越（张春鹏）
 * @date 2020/6/11
 * @description
 */
@Data
@NoArgsConstructor
public class TreeVO {

    /**
     * code
     */
    private String value;
    /**
     * name
     */
    private String label;
    private List<TreeVO> children;
}
