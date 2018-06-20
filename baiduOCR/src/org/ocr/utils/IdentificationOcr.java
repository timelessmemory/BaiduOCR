package org.ocr.utils;

import java.net.URLEncoder;

public class IdentificationOcr {
	public static String identify(byte[] is, String accessToken) {
		 	String idcardIdentificate = "https://aip.baidubce.com/rest/2.0/ocr/v1/idcard";
	        try {
	            String imgStr = Base64Util.encode(is);
	            // 识别身份证正面id_card_side=front;识别身份证背面id_card_side=back;
	            String params = "id_card_side=front&" + URLEncoder.encode("image", "UTF-8") + "="
	                    + URLEncoder.encode(imgStr, "UTF-8");
	            return HttpUtil.post(idcardIdentificate, accessToken, params);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
    }
}
