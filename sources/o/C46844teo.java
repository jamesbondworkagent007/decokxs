package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.market.common.biz_spot.bean.PriceRemindRulesListBean;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.teo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46844teo {
    public static final C46844teo OLrzqt = new C46844teo();

    private C46844teo() {
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String[] KWHzl(@NotNull AlertRemindPo alertRemindPo, AbstractC54531xLw abstractC54531xLw) {
        java.lang.String strGEmmrt;
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLValues;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLIsConnected;
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        xMW xmwKWHzl2;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLValues2;
        C54536xML c54536xMLAkhnZx2;
        C54536xML c54536xMLIsConnected2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(alertRemindPo, "");
        java.lang.String instrumentName = alertRemindPo.getInstrumentName();
        java.lang.String promptThreshold = alertRemindPo.getPromptThreshold();
        C54536xML c54536xMLDjBIcL = null;
        java.lang.String localized$default = pTB.formatLocalized$default(promptThreshold, null, 1, null);
        BizInstrument bizInstrumentValueOf = abstractC54531xLw != null ? abstractC54531xLw.valueOf(instrumentName) : null;
        if (bizInstrumentValueOf != null) {
            int bizType = alertRemindPo.getBizType();
            C27553jxP c27553jxP = C27553jxP.KWHzl;
            if (bizType == c27553jxP.OLrzqt()) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                if (interfaceC54581xNrOLrzqt != null && (xmwKWHzl2 = interfaceC54581xNrOLrzqt.KWHzl()) != null && (c54536xMLAYXKKw2 = xmwKWHzl2.AYXKKw(promptThreshold)) != null && (c54536xMLValues2 = c54536xMLAYXKKw2.values()) != null && (c54536xMLAkhnZx2 = c54536xMLValues2.AkhnZx()) != null && (c54536xMLIsConnected2 = c54536xMLAkhnZx2.isConnected()) != null) {
                    c54536xMLDjBIcL = c54536xMLIsConnected2.djBIcL();
                }
                strGEmmrt = C33129mqd.gEmmrt(c54536xMLDjBIcL);
            } else if ((bizType == c27553jxP.KWHzl() || bizType == c27553jxP.AEQbTJ()) && Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw.copydefault(bizInstrumentValueOf), (java.lang.Object) "inverse")) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
                if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt2 == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null) ? null : value.getIsoCode()), (java.lang.Object) "USD")) {
                    strGEmmrt = "";
                } else {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = pWO.KWHzl().OLrzqt();
                    if (interfaceC54581xNrOLrzqt3 != null && (xmwKWHzl = interfaceC54581xNrOLrzqt3.KWHzl()) != null && (c54536xMLAYXKKw = xmwKWHzl.AYXKKw(promptThreshold)) != null && (c54536xMLValues = c54536xMLAYXKKw.values()) != null && (c54536xMLAkhnZx = c54536xMLValues.AkhnZx()) != null && (c54536xMLIsConnected = c54536xMLAkhnZx.isConnected()) != null) {
                        c54536xMLDjBIcL = c54536xMLIsConnected.djBIcL();
                    }
                    strGEmmrt = C33129mqd.gEmmrt(c54536xMLDjBIcL);
                }
            }
        }
        if ((alertRemindPo.getPromptType() == 1 || alertRemindPo.getPromptType() == 2 || alertRemindPo.getPromptType() == 5) && !Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "")) {
            str = "(" + ((java.lang.Object) strGEmmrt) + ")";
        }
        return new java.lang.String[]{localized$default, str};
    }

    public final java.lang.String KWHzl(@NotNull AlertRemindPo alertRemindPo) {
        Intrinsics.checkNotNullParameter(alertRemindPo, "");
        return pTB.formatPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(C33129mqd.divS$default(alertRemindPo.getPromptThreshold(), 100, null, null, null, 14, null)))), 2, 0, null, null, 12, null);
    }

    public final java.util.List<C46705tcH> AEQbTJ(@NotNull java.util.List<AlertRemindPo> list, @NotNull AbstractC54531xLw abstractC54531xLw) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(abstractC54531xLw, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (AlertRemindPo alertRemindPo : list) {
            int promptType = alertRemindPo.getPromptType();
            if (promptType == 1 || promptType == 2 || promptType == 5) {
                strKWHzl = OLrzqt.KWHzl(alertRemindPo, abstractC54531xLw)[0];
            } else {
                strKWHzl = OLrzqt.KWHzl(alertRemindPo);
            }
            arrayList.add(new C46705tcH(C33129mqd.gEmmrt(java.lang.Long.valueOf(alertRemindPo.getRuleId())), alertRemindPo.getBizType(), alertRemindPo.getInstrumentName(), null, alertRemindPo.getPromptType(), alertRemindPo.getRepeatType(), strKWHzl, OLrzqt.KWHzl(alertRemindPo, abstractC54531xLw)[1], false, alertRemindPo.getActive(), alertRemindPo.getCustomMsg(), alertRemindPo.getModifyTime(), alertRemindPo.getSourceType(), null, null, null, null, null, alertRemindPo.getTimePeriod(), alertRemindPo.getIndicatorType(), alertRemindPo.getSignalType(), alertRemindPo.getCondition1(), alertRemindPo.getCondition2(), alertRemindPo.getPresetCondition(), 254216, null));
        }
        return arrayList;
    }

    public final java.util.List<C46705tcH> OLrzqt(@NotNull java.util.List<AlertRemindPo> list) {
        java.lang.String localized$default;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (AlertRemindPo alertRemindPo : list) {
            int promptType = alertRemindPo.getPromptType();
            if (promptType == 1 || promptType == 2 || promptType == 5) {
                localized$default = pTB.formatLocalized$default(alertRemindPo.getPromptThreshold(), null, 1, null);
            } else {
                localized$default = OLrzqt.KWHzl(alertRemindPo);
            }
            arrayList.add(new C46705tcH(C33129mqd.gEmmrt(java.lang.Long.valueOf(alertRemindPo.getRuleId())), alertRemindPo.getBizType(), alertRemindPo.getInstrumentName(), null, alertRemindPo.getPromptType(), alertRemindPo.getRepeatType(), localized$default, "", false, alertRemindPo.getActive(), alertRemindPo.getCustomMsg(), alertRemindPo.getModifyTime(), alertRemindPo.getSourceType(), alertRemindPo.getChainId(), alertRemindPo.getTokenAddress(), alertRemindPo.getTokenLogoUrl(), alertRemindPo.getChainLogoUrl(), alertRemindPo.getToken(), 0, null, null, null, null, 0, 16515336, null));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.ArrayList<C46707tcJ> EZpvd(java.util.List<PriceRemindRulesListBean> list, @NotNull java.util.List<? extends MutableLiveData<AbstractC54531xLw>> list2) {
        java.lang.String str;
        java.lang.Object next;
        AbstractC54531xLw abstractC54531xLw;
        java.lang.String tokenAddress;
        java.lang.String chainLogoUrl;
        java.lang.String tokenLogoUrl;
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList<C46707tcJ> arrayList = new java.util.ArrayList<>();
        if (list != null) {
            for (PriceRemindRulesListBean priceRemindRulesListBean : list) {
                int bizType = priceRemindRulesListBean.getBizType();
                C27553jxP c27553jxP = C27553jxP.KWHzl;
                if (bizType == c27553jxP.OLrzqt()) {
                    str = "SPOT";
                } else if (bizType == c27553jxP.KWHzl()) {
                    str = "FUTURES";
                } else {
                    str = bizType == c27553jxP.AEQbTJ() ? "SWAP" : null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (str != null) {
                    java.lang.String titleByIdAndType$default = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, priceRemindRulesListBean.getName(), str, false, false, false, 28, null);
                    java.util.Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        AbstractC54531xLw abstractC54531xLw2 = (AbstractC54531xLw) ((MutableLiveData) next).getValue();
                        if (Intrinsics.EZpvd((java.lang.Object) (abstractC54531xLw2 != null ? abstractC54531xLw2.AYXKKw() : null), (java.lang.Object) str)) {
                            break;
                        }
                    }
                    MutableLiveData mutableLiveData = (MutableLiveData) next;
                    if (mutableLiveData != null && (abstractC54531xLw = (AbstractC54531xLw) mutableLiveData.getValue()) != null) {
                        arrayList2.addAll(OLrzqt.AEQbTJ(priceRemindRulesListBean.getRules(), abstractC54531xLw));
                        AlertRemindPo alertRemindPo = (AlertRemindPo) CollectionsKt___CollectionsKt.firstOrNull(priceRemindRulesListBean.getRules());
                        java.lang.String strCopydefault = C44585sZg.AEQbTJ(alertRemindPo != null ? alertRemindPo.getInstrumentName() : null).copydefault();
                        java.util.Locale locale = java.util.Locale.ROOT;
                        Intrinsics.checkNotNullExpressionValue(locale, "");
                        java.lang.String upperCase = strCopydefault.toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                        arrayList.add(new C46707tcJ(titleByIdAndType$default, priceRemindRulesListBean.getName(), priceRemindRulesListBean.getDisplayId(), arrayList2, true, false, false, C55687xoe.AEQbTJ.OLrzqt(upperCase), null, "", 352, null));
                    }
                } else {
                    java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((java.lang.CharSequence) priceRemindRulesListBean.getName(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null));
                    java.lang.String str3 = str2 == null ? "" : str2;
                    arrayList2.addAll(OLrzqt.OLrzqt(priceRemindRulesListBean.getRules()));
                    AlertRemindPo alertRemindPo2 = (AlertRemindPo) CollectionsKt___CollectionsKt.firstOrNull(priceRemindRulesListBean.getRules());
                    arrayList.add(new C46707tcJ(str3, priceRemindRulesListBean.getName(), priceRemindRulesListBean.getDisplayId(), arrayList2, true, false, false, (alertRemindPo2 == null || (tokenLogoUrl = alertRemindPo2.getTokenLogoUrl()) == null) ? "" : tokenLogoUrl, (alertRemindPo2 == null || (chainLogoUrl = alertRemindPo2.getChainLogoUrl()) == null) ? "" : chainLogoUrl, (alertRemindPo2 == null || (tokenAddress = alertRemindPo2.getTokenAddress()) == null) ? "" : tokenAddress, 96, null));
                }
            }
        }
        return arrayList;
    }
}
