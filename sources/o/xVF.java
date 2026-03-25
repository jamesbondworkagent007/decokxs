package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TickConfig;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xVF {
    public static final xVF OLrzqt = new xVF();

    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((TickConfig) t).getMinPrice())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((TickConfig) t2).getMinPrice())));
        }
    }

    private xVF() {
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        C54536xML c54536xMLKWHzl;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAEQbTJ;
        java.lang.String safeString$default;
        xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(str, "OPTION");
        return (xmsAEQbTJ == null || (c54536xMLKWHzl = xmsAEQbTJ.KWHzl(str2)) == null || (c54536xMLCopydefault = c54536xMLKWHzl.copydefault()) == null || (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) == null || (c54536xMLAEQbTJ = c54536xMLDjBIcL.AEQbTJ(true)) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String strEZpvd = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("OPTION")) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str2)) == null) {
            return null;
        }
        java.util.List<TickConfig> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(((xLJ) abstractC54531xLwOLrzqt).AhwBna(bizInstrumentValueOf), new ActionBar());
        if (listEZpvd.isEmpty()) {
            return null;
        }
        TickConfig tickConfig = (TickConfig) CollectionsKt___CollectionsKt.AuCTelauCTel(listEZpvd);
        if (dAEQbTJ <= C33129mqd.AEQbTJ(tickConfig != null ? tickConfig.getMinPrice() : null)) {
            TickConfig tickConfig2 = (TickConfig) CollectionsKt___CollectionsKt.AuCTelauCTel(listEZpvd);
            Intrinsics.copydefault(tickConfig2);
            java.lang.String strEZpvd2 = EZpvd(str2, tickConfig2.getPriceIncrement());
            return C56390yDp.OLrzqt(strEZpvd2, strEZpvd2);
        }
        TickConfig tickConfig3 = (TickConfig) CollectionsKt___CollectionsKt.AubY(listEZpvd);
        if (dAEQbTJ >= C33129mqd.AEQbTJ(tickConfig3 != null ? tickConfig3.getMaxPrice() : null)) {
            TickConfig tickConfig4 = (TickConfig) CollectionsKt___CollectionsKt.AubY(listEZpvd);
            Intrinsics.copydefault(tickConfig4);
            return C56390yDp.OLrzqt(EZpvd(str2, tickConfig4.getPriceIncrement()), EZpvd(str2, ((TickConfig) CollectionsKt___CollectionsKt.AubY(listEZpvd)).getMaxPrice()));
        }
        for (TickConfig tickConfig5 : listEZpvd) {
            if (dAEQbTJ >= C33129mqd.AEQbTJ(tickConfig5.getMinPrice()) && dAEQbTJ < C33129mqd.AEQbTJ(tickConfig5.getMaxPrice())) {
                strEZpvd = EZpvd(str2, tickConfig5.getPriceIncrement());
            }
        }
        return xVK.EZpvd.KWHzl(strEZpvd, str, str2, "OPTION");
    }

    public final java.lang.String[] AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        xOW newProxyInstance;
        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.ejfBZ() || (pairCopydefault = copydefault(str, str2)) == null) {
            return null;
        }
        return xVK.EZpvd.KWHzl(pairCopydefault);
    }

    public final java.lang.String[] KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        BizInstrument suggestedInstrument$default;
        java.lang.String lotSize;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "OPTION", str2, null, null, 12, null)) == null || (lotSize = suggestedInstrument$default.getLotSize()) == null) {
            return null;
        }
        xVK xvk = xVK.EZpvd;
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, "OPTION", null, false, null, 28, null);
        if (c54571xNhCreateAmtConvertor$default != null && (c54536xMLDjBIcL = c54571xNhCreateAmtConvertor$default.djBIcL(lotSize)) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
            str3 = safeString$default;
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = xvk.copydefault(str, str3, str2, "OPTION");
        if (pairCopydefault == null) {
            return null;
        }
        return xvk.EZpvd(pairCopydefault);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        C54589xNz c54589xNz;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strMulS$default;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        xOW newProxyInstance;
        xOW newProxyInstance2;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        java.lang.String safeString$default2 = str2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(safeString$default2, "");
        if (str4 == null || str4.length() == 0 || (interfaceC54581xNrOLrzqt = (c54589xNz = C54589xNz.EZpvd).OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("OPTION")) == null) {
            return "";
        }
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str3 == null ? "" : str3);
        if (bizInstrumentValueOf == null) {
            return "";
        }
        java.lang.String strGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentValueOf);
        if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "0")) {
            safeString$default2 = Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "1") ? C54536xML.toSafeString$default(((xLJ) abstractC54531xLwOLrzqt).OLrzqt(bizInstrumentValueOf.getInstFamily()).djBIcL(safeString$default2), false, 1, null) : "";
        }
        if (safeString$default2.length() == 0) {
            return "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null && newProxyInstance.ejfBZ()) {
            java.lang.String strMulS$default2 = C33129mqd.mulS$default(C33129mqd.mulS$default(str, str4, null, null, null, 14, null), safeString$default2, null, null, null, 14, null);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
            strMulS$default = C33129mqd.mulS$default(strMulS$default2, (interfaceC54581xNrOLrzqt3 == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt3.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance2.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null) ? null : value.getUsdToThisRate(), null, null, null, 14, null);
        } else {
            strMulS$default = C33129mqd.mulS$default(str, safeString$default2, null, null, null, 14, null);
        }
        C54536xML c54536xMLKWHzl = ((xLJ) abstractC54531xLwOLrzqt).KWHzl(bizInstrumentValueOf.getInstFamily()).KWHzl(strMulS$default);
        return (c54536xMLKWHzl == null || (c54536xMLCopydefault = c54536xMLKWHzl.copydefault()) == null || (c54536xMLAkhnZx = c54536xMLCopydefault.AkhnZx()) == null || (c54536xMLDjBIcL = c54536xMLAkhnZx.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        C54589xNz c54589xNz;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strMulS$default;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        xOW newProxyInstance;
        xOW newProxyInstance2;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        java.lang.String safeString$default2 = str2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(safeString$default2, "");
        if (str4 == null || str4.length() == 0 || (interfaceC54581xNrOLrzqt = (c54589xNz = C54589xNz.EZpvd).OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("OPTION")) == null) {
            return "";
        }
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str3 == null ? "" : str3);
        if (bizInstrumentValueOf == null) {
            return "";
        }
        java.lang.String strGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentValueOf);
        if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "0")) {
            safeString$default2 = Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "1") ? C54536xML.toSafeString$default(((xLJ) abstractC54531xLwOLrzqt).OLrzqt(bizInstrumentValueOf.getInstFamily()).djBIcL(safeString$default2), false, 1, null) : "";
        }
        if (safeString$default2.length() == 0) {
            return "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null && newProxyInstance.ejfBZ()) {
            java.lang.String strMulS$default2 = C33129mqd.mulS$default(C33129mqd.mulS$default(str, str4, null, null, null, 14, null), safeString$default2, null, null, null, 14, null);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
            strMulS$default = C33129mqd.mulS$default(strMulS$default2, (interfaceC54581xNrOLrzqt3 == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt3.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance2.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null) ? null : value.getUsdToThisRate(), null, null, null, 14, null);
        } else {
            strMulS$default = C33129mqd.mulS$default(str, safeString$default2, null, null, null, 14, null);
        }
        C54536xML c54536xMLKWHzl = ((xLJ) abstractC54531xLwOLrzqt).KWHzl(bizInstrumentValueOf.getInstFamily()).KWHzl(strMulS$default);
        return (c54536xMLKWHzl == null || (c54536xMLCopydefault = c54536xMLKWHzl.copydefault()) == null || (c54536xMLAkhnZx = c54536xMLCopydefault.AkhnZx()) == null || (c54536xMLDjBIcL = c54536xMLAkhnZx.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "" : safeString$default;
    }
}
