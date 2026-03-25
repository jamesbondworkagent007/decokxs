package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.bot.config.SpotTpSlStopType;
import com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC55914xst;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55850xri extends C55912xsr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55850xri(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(str, str2, str3, str4);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    public final boolean OLrzqt() {
        java.lang.String upperCase;
        java.lang.String string;
        if (C56044xvQ.AEQbTJ(values())) {
            java.lang.String strAYXKKw = AYXKKw();
            if (strAYXKKw == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strAYXKKw).toString()) == null) {
                upperCase = null;
            } else {
                upperCase = string.toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
            }
            if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "USDT")) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String EZpvd() {
        if (OLrzqt()) {
            return SpotTpSlStopType.CLOSURE_RETURN_USDT.getValue();
        }
        return SpotTpSlStopType.CLOSURE_RETURN_QUOTE.getValue();
    }

    public final java.util.List<C55276xgr> OLrzqt(TpSlTriggerParam tpSlTriggerParam) {
        TpSLTriggerItem tp;
        InterfaceC56445yFq<SpotTpSlTypeConfigData> entries = SpotTpSlTypeConfigData.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
        for (SpotTpSlTypeConfigData spotTpSlTypeConfigData : entries) {
            arrayList.add(new C55276xgr(C33070mpX.AYXKKw(spotTpSlTypeConfigData.getTitle()), spotTpSlTypeConfigData.getType(), null, Intrinsics.EZpvd((java.lang.Object) spotTpSlTypeConfigData.getType(), (java.lang.Object) ((tpSlTriggerParam == null || (tp = tpSlTriggerParam.getTp()) == null) ? null : tp.getIndicator())), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    public final java.util.List<C55276xgr> AEQbTJ(TpSlTriggerParam tpSlTriggerParam) {
        TpSLTriggerItem sl;
        InterfaceC56445yFq<SpotTpSlTypeConfigData> entries = SpotTpSlTypeConfigData.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
        for (SpotTpSlTypeConfigData spotTpSlTypeConfigData : entries) {
            arrayList.add(new C55276xgr(C33070mpX.AYXKKw(spotTpSlTypeConfigData.getTitle()), spotTpSlTypeConfigData.getType(), null, Intrinsics.EZpvd((java.lang.Object) spotTpSlTypeConfigData.getType(), (java.lang.Object) ((tpSlTriggerParam == null || (sl = tpSlTriggerParam.getSl()) == null) ? null : sl.getIndicator())), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    public final java.util.List<C55276xgr> KWHzl(TpSlTriggerParam tpSlTriggerParam) {
        java.lang.String stopType = tpSlTriggerParam != null ? tpSlTriggerParam.getStopType() : null;
        java.lang.String strEZpvd = C33129mqd.OLrzqt((java.lang.CharSequence) stopType) ? stopType : null;
        if (strEZpvd == null) {
            strEZpvd = EZpvd();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (OLrzqt()) {
            SpotTpSlStopType spotTpSlStopType = SpotTpSlStopType.CLOSURE_RETURN_USDT;
            arrayList.add(new C55276xgr(spotTpSlStopType.getTitle(), spotTpSlStopType.getValue(), null, Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) spotTpSlStopType.getValue()), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        } else {
            SpotTpSlStopType spotTpSlStopType2 = SpotTpSlStopType.CLOSURE_RETURN_QUOTE;
            arrayList.add(new C55276xgr(spotTpSlStopType2.getTitle(), spotTpSlStopType2.getValue(), null, Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) spotTpSlStopType2.getValue()), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        SpotTpSlStopType spotTpSlStopType3 = SpotTpSlStopType.CLOSURE_RETURN_BASE_QUOTE;
        arrayList.add(new C55276xgr(spotTpSlStopType3.getTitle(), spotTpSlStopType3.getValue(), null, Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) spotTpSlStopType3.getValue()), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        return arrayList;
    }

    public final C55851xrj copydefault(@NotNull TpSlTriggerParam tpSlTriggerParam, @NotNull SpotGridTpSlConfig spotGridTpSlConfig) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        Intrinsics.checkNotNullParameter(spotGridTpSlConfig, "");
        InterfaceC55914xst interfaceC55914xstAhwBna = AhwBna(tpSlTriggerParam);
        if (interfaceC55914xstAhwBna != null) {
            int iDjBIcL = djBIcL();
            java.lang.String strAYXKKw = AEQbTJ().AYXKKw();
            C55851xrj inputConfigData$default = InterfaceC55914xst.StateListAnimator.getInputConfigData$default(interfaceC55914xstAhwBna, iDjBIcL, strAYXKKw == null ? "" : strAYXKKw, valueOf(), AYXKKw(), KWHzl(), AhwBna(), spotGridTpSlConfig, null, 128, null);
            if (inputConfigData$default != null) {
                return inputConfigData$default;
            }
        }
        return new C55851xrj("", 0, null, null, 12, null);
    }

    public final C55851xrj OLrzqt(@NotNull TpSlTriggerParam tpSlTriggerParam, @NotNull SpotGridTpSlConfig spotGridTpSlConfig, java.lang.String str) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        Intrinsics.checkNotNullParameter(spotGridTpSlConfig, "");
        InterfaceC55914xst interfaceC55914xstAYXKKw = AYXKKw(tpSlTriggerParam);
        if (interfaceC55914xstAYXKKw != null) {
            int iDjBIcL = djBIcL();
            java.lang.String strAYXKKw = AEQbTJ().AYXKKw();
            C55851xrj c55851xrjAEQbTJ = interfaceC55914xstAYXKKw.AEQbTJ(iDjBIcL, strAYXKKw == null ? "" : strAYXKKw, valueOf(), AYXKKw(), KWHzl(), AhwBna(), spotGridTpSlConfig, str);
            if (c55851xrjAEQbTJ != null) {
                return c55851xrjAEQbTJ;
            }
        }
        return new C55851xrj("", 0, null, null, 12, null);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull TpSlTriggerParam tpSlTriggerParam) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        InterfaceC55914xst interfaceC55914xstAhwBna = AhwBna(tpSlTriggerParam);
        return (interfaceC55914xstAhwBna == null || (strKWHzl = interfaceC55914xstAhwBna.KWHzl(AhwBna(), KWHzl(), str)) == null) ? "" : strKWHzl;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull TpSlTriggerParam tpSlTriggerParam) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        InterfaceC55914xst interfaceC55914xstAYXKKw = AYXKKw(tpSlTriggerParam);
        return (interfaceC55914xstAYXKKw == null || (strKWHzl = interfaceC55914xstAYXKKw.KWHzl(AhwBna(), KWHzl(), str)) == null) ? "" : strKWHzl;
    }

    public final java.lang.String EZpvd(@NotNull TpSlTriggerParam tpSlTriggerParam) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        InterfaceC55914xst interfaceC55914xstAhwBna = AhwBna(tpSlTriggerParam);
        return (interfaceC55914xstAhwBna == null || (strOLrzqt = interfaceC55914xstAhwBna.OLrzqt(AhwBna(), KWHzl(), tpSlTriggerParam.getTp().getValue())) == null) ? "" : strOLrzqt;
    }

    public final java.lang.String copydefault(@NotNull TpSlTriggerParam tpSlTriggerParam) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        InterfaceC55914xst interfaceC55914xstAYXKKw = AYXKKw(tpSlTriggerParam);
        return (interfaceC55914xstAYXKKw == null || (strOLrzqt = interfaceC55914xstAYXKKw.OLrzqt(AhwBna(), KWHzl(), tpSlTriggerParam.getSl().getValue())) == null) ? "" : strOLrzqt;
    }

    public final java.lang.String EZpvd(TpSlTriggerParam tpSlTriggerParam, @NotNull java.lang.String str, @NotNull SpotGridTpSlConfig spotGridTpSlConfig, @NotNull java.lang.String str2) {
        InterfaceC55914xst interfaceC55914xstAYXKKw;
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(spotGridTpSlConfig, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return (tpSlTriggerParam == null || (interfaceC55914xstAYXKKw = AYXKKw(tpSlTriggerParam)) == null || (strAEQbTJ = interfaceC55914xstAYXKKw.AEQbTJ(tpSlTriggerParam.getSl().getValue(), str, AYXKKw(), valueOf(), spotGridTpSlConfig, KWHzl(), AhwBna(), str2)) == null) ? "" : strAEQbTJ;
    }

    public final java.lang.String AEQbTJ(TpSlTriggerParam tpSlTriggerParam, @NotNull SpotGridTpSlConfig spotGridTpSlConfig, @NotNull java.lang.String str) {
        InterfaceC55914xst interfaceC55914xstAhwBna;
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(spotGridTpSlConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        return (tpSlTriggerParam == null || (interfaceC55914xstAhwBna = AhwBna(tpSlTriggerParam)) == null || (strAEQbTJ = interfaceC55914xstAhwBna.AEQbTJ(tpSlTriggerParam.getTp().getValue(), "", AYXKKw(), valueOf(), spotGridTpSlConfig, KWHzl(), AhwBna(), str)) == null) ? "" : strAEQbTJ;
    }
}
