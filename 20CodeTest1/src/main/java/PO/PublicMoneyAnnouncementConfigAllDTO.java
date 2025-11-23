package PO;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 昊辰（汪程昊）
 * @Date : 2021/10/19
 * @Description :
 * @Modified By : Copyright(c) cai-inc.com
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PublicMoneyAnnouncementConfigAllDTO implements Serializable {
    /**
     * "省级"区划Code
     */
    private String provinceDistrictCode;

    /**
     * "省级"名称
     */
    private String provinceName;

    /**
     * "市级"区划Code
     */
    private String cityDistrictCode;

    /**
     * "市级"名称
     */
    private String cityName;

    /**
     * "区级"区划Code
     */
    private String regionDistrictCode;

    /**
     * "区级"名称
     */
    private String regionName;

}
