package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.poB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39215poB {
    public static final C39215poB OLrzqt = new C39215poB();

    public final java.lang.String AEQbTJ(boolean z, java.lang.String str) {
        if (z) {
            return str;
        }
        return null;
    }

    private C39215poB() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -2040464843:
                return !str.equals("LSAcco") ? str : "long_short_account";
            case 2522:
                return !str.equals("OI") ? str : "open_interest";
            case 63511234:
                return !str.equals("BSVol") ? str : "buy_sell";
            case 72740685:
                return !str.equals("LSPos") ? str : "long_short_position";
            case 1185755844:
                return !str.equals("LSRatio") ? str : "long_short";
            default:
                return str;
        }
    }

    public final void KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull oLU olu, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(olu, "");
        EventData eventData = new EventData();
        eventData.setAct("kline_page_end");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pauseTime", str2);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str);
        linkedHashMap.put("inst_id", str3);
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("application_attach", str5);
        linkedHashMap.put("otherTime", C33129mqd.gEmmrt(java.lang.Integer.valueOf(C36246oUr.copydefault().ODWQjV())));
        linkedHashMap.put("pic_url", valueOf());
        linkedHashMap.put("pic_size", gEmmrt());
        linkedHashMap.put("totalTime", str4);
        linkedHashMap.put("activity_render", olu.AkhnZx() ? ExtJson.BRC20TYPE_TRADE : "other");
        linkedHashMap.put(OtcExtraKeys.CRYPTO_ORDER_TYPE, djBIcL());
        linkedHashMap.put("payment_channel", OLrzqt());
        linkedHashMap.put("renderTime", EZpvd());
        linkedHashMap.put("start_mode", KWHzl());
        linkedHashMap.put("trade_type", copydefault());
        linkedHashMap.put("debugBlockerAttacked", AEQbTJ());
        linkedHashMap.put("debugBlockerFailed", AhwBna());
        linkedHashMap.putAll(olu.values());
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("KlineTrackUtils", "reportTradeInit: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void copydefault(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, java.lang.String str5, @NotNull oLU olu) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(olu, "");
        EventData eventData = new EventData();
        eventData.setAct("kline_page_operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pauseTime", str2);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str);
        linkedHashMap.put("inst_id", str3);
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("application_attach", str5);
        linkedHashMap.put("activity_render", z ? ExtJson.BRC20TYPE_TRADE : "other");
        linkedHashMap.put("totalTime", str4);
        linkedHashMap.put("otherTime", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.fIwbmz())));
        linkedHashMap.put("pic_url", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.copydefault())));
        linkedHashMap.put("pic_size", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.fARcdN())));
        linkedHashMap.put(OtcExtraKeys.CRYPTO_ORDER_TYPE, C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.fJNWhG())));
        linkedHashMap.put("payment_channel", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.AuCTel())));
        linkedHashMap.put("renderTime", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.KWHzl())));
        linkedHashMap.put("start_mode", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.iwGUEr())));
        linkedHashMap.put("trade_type", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.ejfBZ())));
        linkedHashMap.put("system_avail_mem", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.DbNXlk())));
        linkedHashMap.put("system_total_mem", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.gEmmrt())));
        linkedHashMap.put("txType", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.fetchVPNInfo())));
        linkedHashMap.put("type", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.AYXKKw())));
        linkedHashMap.put("unified_amount", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.AEQbTJ())));
        linkedHashMap.put("walletType", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.djBIcL())));
        linkedHashMap.put("fiat_amount", C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.AhwBna())));
        linkedHashMap.put(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, C33129mqd.gEmmrt(java.lang.Integer.valueOf(olu.valueOf())));
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("addKlinePageOperationTrackEvent", "参数: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void AEQbTJ(@NotNull oLU olu) {
        Intrinsics.checkNotNullParameter(olu, "");
        EventData eventData = new EventData();
        eventData.setAct("kline_chart_setting_end");
        olu.values().put("isFileTampered", SPUtils.getInt("chart_height", 0).toString());
        eventData.setAttrs(olu.values());
        pUU.EZpvd("KlineTrackUtils", "reportAfterChartSetting for params: " + olu.values());
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void copydefault(@NotNull oLU olu) {
        Intrinsics.checkNotNullParameter(olu, "");
        EventData eventData = new EventData();
        eventData.setAct("kline_chart_setting_end");
        eventData.setAttrs(olu.values());
        pUU.EZpvd("KlineTrackUtils", "reportAfterTeachViewing for params: " + olu.values());
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final java.lang.String copydefault() {
        return SPUtils.getBoolean("kline_zoom_type_column_chart", true) ? "Candle" : "Line";
    }

    public final java.lang.String KWHzl() {
        return C36246oUr.copydefault().QVAiDq() == 1 ? TypedValues.Custom.S_FLOAT : "top";
    }

    public final java.lang.String EZpvd() {
        pEM pem = pEM.AEQbTJ;
        return (C33129mqd.OLrzqt((java.lang.CharSequence) pem.copydefault()) || C33129mqd.OLrzqt((java.lang.CharSequence) pem.KWHzl())) ? "custom" : C33512mxp.AEQbTJ.isConnected() == 0 ? "green_up" : "red_up";
    }

    public final java.lang.String OLrzqt() {
        return Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark")) ? "kline_dark" : Intrinsics.EZpvd((java.lang.Object) "kline_white", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark")) ? "kline_white" : "kline_follow_app";
    }

    public final java.lang.String djBIcL() {
        return pEI.EZpvd.AEQbTJ() ? "tv" : SPUtils.getBoolean("kline_layout_style_default", true) ? "native_classic" : "native_full";
    }

    public final java.lang.String gEmmrt() {
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        TemplateSetting templateSettingKWHzl = C36246oUr.copydefault().KWHzl("ds0");
        java.lang.String str = "";
        if (templateSettingKWHzl != null && (sideIndicatorNames = templateSettingKWHzl.getSideIndicatorNames()) != null) {
            for (java.lang.String str2 : sideIndicatorNames) {
                if (str.length() != 0) {
                    str2 = "," + str2;
                }
                str = ((java.lang.Object) str) + str2;
            }
        }
        return str;
    }

    public final java.lang.String valueOf() {
        java.util.ArrayList<java.lang.String> mainIndicatorNames;
        TemplateSetting templateSettingKWHzl = C36246oUr.copydefault().KWHzl("ds0");
        java.lang.String str = "";
        if (templateSettingKWHzl != null && (mainIndicatorNames = templateSettingKWHzl.getMainIndicatorNames()) != null) {
            for (java.lang.String str2 : mainIndicatorNames) {
                if (str.length() != 0) {
                    str2 = "," + str2;
                }
                str = ((java.lang.Object) str) + str2;
            }
        }
        return str;
    }

    public final java.lang.String AEQbTJ() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn = C36246oUr.copydefault().zLjUOn();
        C39215poB c39215poB = OLrzqt;
        java.lang.String strAEQbTJ = c39215poB.AEQbTJ(chartViewOutSideConfigZLjUOn.getMShowPriceLine(), "last_px");
        if (strAEQbTJ != null) {
            arrayList.add(strAEQbTJ);
        }
        java.lang.String strAEQbTJ2 = c39215poB.AEQbTJ(chartViewOutSideConfigZLjUOn.getMShowAxis(), "y_axis");
        if (strAEQbTJ2 != null) {
            arrayList.add(strAEQbTJ2);
        }
        java.lang.String strAEQbTJ3 = c39215poB.AEQbTJ(chartViewOutSideConfigZLjUOn.getMShowCountdown(), "count_down");
        if (strAEQbTJ3 != null) {
            arrayList.add(strAEQbTJ3);
        }
        java.lang.String strAEQbTJ4 = c39215poB.AEQbTJ(chartViewOutSideConfigZLjUOn.getMShowPriceWarning(), NotificationCompat.CATEGORY_ALARM);
        if (strAEQbTJ4 != null) {
            arrayList.add(strAEQbTJ4);
        }
        java.lang.String strAEQbTJ5 = c39215poB.AEQbTJ(chartViewOutSideConfigZLjUOn.getControlBeanAfterInit().copydefault(), "px_change");
        if (strAEQbTJ5 != null) {
            arrayList.add(strAEQbTJ5);
        }
        java.lang.String strAEQbTJ6 = c39215poB.AEQbTJ(chartViewOutSideConfigZLjUOn.getControlBeanAfterInit().OLrzqt(), "quick_trade");
        if (strAEQbTJ6 != null) {
            arrayList.add(strAEQbTJ6);
        }
        java.lang.String string = arrayList.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String AhwBna() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn = C36246oUr.copydefault().zLjUOn();
        C39215poB c39215poB = OLrzqt;
        java.lang.String strAEQbTJ = c39215poB.AEQbTJ(chartViewOutSideConfigZLjUOn.getMShowHistoryOrder(), "history_orders");
        if (strAEQbTJ != null) {
            arrayList.add(strAEQbTJ);
        }
        java.lang.String strAEQbTJ2 = c39215poB.AEQbTJ(chartViewOutSideConfigZLjUOn.getMShowCurrentOrder(), "open_orders");
        if (strAEQbTJ2 != null) {
            arrayList.add(strAEQbTJ2);
        }
        java.lang.String strAEQbTJ3 = c39215poB.AEQbTJ(chartViewOutSideConfigZLjUOn.getMShowCostLine(), "position_cost");
        if (strAEQbTJ3 != null) {
            arrayList.add(strAEQbTJ3);
        }
        java.lang.String strAEQbTJ4 = c39215poB.AEQbTJ(chartViewOutSideConfigZLjUOn.isShowSpotAveragePrice(), "spot_cost");
        if (strAEQbTJ4 != null) {
            arrayList.add(strAEQbTJ4);
        }
        java.lang.String string = arrayList.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
