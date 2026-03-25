package com.okinc.kline.library.template;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.okinc.core.util.SPUtils;
import java.util.ArrayList;
import o.C32979mnm;
import o.C36246oUr;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class TemplateSetting {
    public static final String MAIN_NO_LAST = "M";
    public static final int MARKET_CAP_SCALE = 24;
    public static final float MARKET_CAP_SCALE_WIDTH = 45.0f;
    public static final String SP_FILENAME = "TemplateSetting3";
    public static final String SP_FILENAME_CEDEFI = "TemplateSettingCEDEFI";
    public static final String SP_FILENAME_DEFI_DEX = "TemplateSettingDefi_dex";
    public static final String SP_FILENAME_DEFI_WALLET = "TemplateSettingDefi_wallet";
    public static final String SP_FILENAME_LITE = "TemplateSettingLite";
    public static final String SP_FILENAME_NFT = "TemplateSetting_nft";
    public static final String SP_FILENAME_SOCIAL = "TemplateSetting_social_trading";
    private String dsName;
    private String mainIndicatorLastName;
    private String mainIndicatorName;
    private int timeInterval = 15;
    private int timelineScale = 10;
    private final ArrayList<String> sideIndicatorNames = new ArrayList<>();
    private final ArrayList<String> sideTradeIndicatorNames = new ArrayList<>();
    private final ArrayList<String> mainIndicatorNames = new ArrayList<>();
    private float timelineScaleWidth = 0.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDsName() {
        return this.dsName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMainIndicatorName() {
        return this.mainIndicatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMainLastIndicatorName() {
        return this.mainIndicatorLastName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArrayList<String> getRealMainIndicators() {
        return this.mainIndicatorNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArrayList<String> getRealSubIndicators() {
        return this.sideIndicatorNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getTimelineScale() {
        if (this.timeInterval == -2) {
            return 24;
        }
        return this.timelineScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getTimelineScaleWidth() {
        if (this.timeInterval == -2) {
            return 45.0f;
        }
        return this.timelineScaleWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArrayList<String> getTradeSideIndicatorNames() {
        return this.sideTradeIndicatorNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDsName(String str) {
        this.dsName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTimelineScale(int i) {
        this.timelineScale = i;
    }

    private TemplateSetting() {
    }

    public static TemplateSetting load(String str) {
        int iIntValue;
        Context contextAubY = C36246oUr.copydefault().AubY();
        if (contextAubY == null) {
            contextAubY = C32979mnm.EZpvd.OLrzqt();
        }
        String string = contextAubY.getSharedPreferences(getSPKey(), 0).getString(str, "");
        try {
            iIntValue = SPUtils.getInt(C36246oUr.copydefault().getFieldNames(), C36246oUr.copydefault().AwvSrB()).intValue();
        } catch (Exception unused) {
            pUU.copydefault("templateTag" + C36246oUr.copydefault().getFieldNames());
            iIntValue = 15;
        }
        C36246oUr.copydefault().isConnected(iIntValue);
        if (!TextUtils.isEmpty(string)) {
            TemplateSetting templateSetting = (TemplateSetting) new Gson().fromJson(string, TemplateSetting.class);
            templateSetting.timeInterval = iIntValue;
            String str2 = templateSetting.mainIndicatorName;
            if (str2 != null && !str2.isEmpty()) {
                if (!templateSetting.mainIndicatorName.equals("M")) {
                    templateSetting.mainIndicatorNames.add(templateSetting.mainIndicatorName);
                    templateSetting.mainIndicatorName = "";
                } else {
                    templateSetting.mainIndicatorName = "";
                }
                templateSetting.save();
            }
            String str3 = templateSetting.mainIndicatorLastName;
            if (str3 != null && !str3.isEmpty()) {
                if (!templateSetting.mainIndicatorLastName.equals("M")) {
                    templateSetting.mainIndicatorNames.add(templateSetting.mainIndicatorLastName);
                    templateSetting.mainIndicatorLastName = "";
                } else {
                    templateSetting.mainIndicatorLastName = "";
                }
                templateSetting.save();
            }
            if (templateSetting.dsName != null) {
                return templateSetting;
            }
        }
        TemplateSetting templateSetting2 = new TemplateSetting();
        templateSetting2.timeInterval = iIntValue;
        templateSetting2.dsName = str;
        templateSetting2.addSideIndicator("VOLUME");
        templateSetting2.mainIndicatorNames.add("MA");
        templateSetting2.save();
        SPUtils.put(C36246oUr.copydefault().getFieldNames(), Integer.valueOf(templateSetting2.timeInterval));
        return templateSetting2;
    }

    public void save() {
        Context contextAubY = C36246oUr.copydefault().AubY();
        if (contextAubY == null) {
            contextAubY = C32979mnm.EZpvd.OLrzqt();
        }
        SharedPreferences.Editor editorEdit = contextAubY.getSharedPreferences(getSPKey(), 0).edit();
        editorEdit.putString(this.dsName, new Gson().toJson(this));
        editorEdit.apply();
    }

    private static String getSPKey() {
        return C36246oUr.copydefault().getFieldNames().equals("sp_timeinterval_okx_lite") ? SP_FILENAME_LITE : C36246oUr.copydefault().getFieldNames().equals("kline_dex_market_time_preference") ? SP_FILENAME_DEFI_DEX : C36246oUr.copydefault().getFieldNames().equals("sp_timeinterval_okx_cedefi") ? SP_FILENAME_CEDEFI : C36246oUr.copydefault().getFieldNames().equals("wallet_trade_kline_tag") ? SP_FILENAME_DEFI_WALLET : C36246oUr.copydefault().getFieldNames().equals("sp_timeinterval_okx_nft") ? SP_FILENAME_NFT : C36246oUr.copydefault().getFieldNames().equals("sp_timeinterval_okx_social_trading") ? SP_FILENAME_SOCIAL : SP_FILENAME;
    }

    public int getSPTimeInterval() {
        try {
            return SPUtils.getInt(C36246oUr.copydefault().getFieldNames(), C36246oUr.copydefault().AwvSrB()).intValue();
        } catch (Exception unused) {
            pUU.copydefault(C36246oUr.copydefault().getFieldNames());
            return C36246oUr.copydefault().AwvSrB();
        }
    }

    public void putTimeInterval(int i) {
        this.timeInterval = i;
        SPUtils.put(C36246oUr.copydefault().getFieldNames(), Integer.valueOf(this.timeInterval));
        C36246oUr.copydefault().isConnected(this.timeInterval);
    }

    public void putTimelineScale(int i) {
        if (i == this.timelineScale) {
            return;
        }
        this.timelineScale = i;
        save();
    }

    public void putTimelineScaleWidth(float f) {
        if (f == this.timelineScaleWidth) {
            return;
        }
        this.timelineScaleWidth = f;
        save();
    }

    public void putMainLastIndicatorName(String str) {
        if (str.equals(this.mainIndicatorLastName)) {
            return;
        }
        this.mainIndicatorLastName = str;
        save();
    }

    public void putMainIndicatorName(String str) {
        if (str.equals(this.mainIndicatorName)) {
            return;
        }
        this.mainIndicatorName = str;
        save();
    }

    public ArrayList<String> getSideIndicatorNames() {
        return C36246oUr.copydefault().zLjUOn().isCeFiMCapMode() ? new ArrayList<>() : this.sideIndicatorNames;
    }

    public ArrayList<String> getMainIndicatorNames() {
        return C36246oUr.copydefault().zLjUOn().isCeFiMCapMode() ? new ArrayList<>() : this.mainIndicatorNames;
    }

    public void addSideIndicator(String str) {
        for (int i = 0; i < this.sideIndicatorNames.size(); i++) {
            if (this.sideIndicatorNames.get(i).equals(str)) {
                return;
            }
        }
        if (this.sideIndicatorNames.size() == 4) {
            this.sideIndicatorNames.remove(0);
        }
        this.sideIndicatorNames.add(str);
        if (this.sideTradeIndicatorNames.size() == 4) {
            this.sideTradeIndicatorNames.remove(0);
        }
        this.sideTradeIndicatorNames.add(str);
        if (str.equals("VOLUME")) {
            C36246oUr.copydefault().AuCTelauCTel(true);
        }
        save();
    }

    public void removeSideIndicator(String str) {
        this.sideIndicatorNames.remove(str);
        this.sideTradeIndicatorNames.remove(str);
        if (str.equals("VOLUME")) {
            C36246oUr.copydefault().AuCTelauCTel(false);
        }
        save();
    }

    public boolean hasVolumeIndicator() {
        return this.sideIndicatorNames.contains("VOLUME");
    }

    public void addMainIndicatorName(@NotNull String str) {
        this.mainIndicatorNames.add(str);
        save();
    }

    public void removeMainIndicatorName(@NotNull String str) {
        this.mainIndicatorNames.remove(str);
        save();
    }
}
