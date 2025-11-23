package PO;

import java.io.Serializable;
import java.util.List;

/**
 * @author wch
 */
public class DistTree implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String pid;
    private String code;
    private String text;
    private String type;
    private String districtType;
    private Boolean isLeaf;
    private Boolean editPrivilege;
    private Boolean addPrivilege;
    private List<DistTree> children;
    private String name;
    private String fullName;
    private String nameBone;
    private String status;
}
