package PO;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: 昊辰（汪程昊）
 * @Date : 2021/10/31
 * @Description :
 * @Modified By : Copyright(c) cai-inc.com
 */
public class DistrictDTO {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String code;
    private Integer type;
    private String districtType;
    private String hierarchy;
    private String name;
    private String fullname;
    private String namebone;
    private Long parentId;
    private Boolean isLeaf;
    private String status;
    private String tier;
    private Long regionId;
    private String districtConfig;
    private String remark;
    private Date tsPublishInt;
    private Date tsDeprecatedInt;
    private Date tsUpdated;
    private Date tsCreated;
    private String outDistCode;
    private List<DistrictDTO> parents;
    private String extFields;
    private Map<String, String> ext;
    private List<DistrictDTO> children;
}
