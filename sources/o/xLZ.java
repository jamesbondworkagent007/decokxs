package o;

import com.okinc.unify_trade.biz.BaseInstrument;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.SpotInstrument;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xLZ implements InterfaceC54501xKt<java.util.List<? extends InstrumentInfo>, java.util.List<? extends SpotInstrument>> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* synthetic */ java.util.List<? extends SpotInstrument> KWHzl(java.util.List<? extends InstrumentInfo> list) {
        return AEQbTJ((java.util.List<InstrumentInfo>) list);
    }

    public java.util.List<SpotInstrument> AEQbTJ(@NotNull java.util.List<InstrumentInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return OLrzqt(list);
    }

    public final java.util.List<SpotInstrument> OLrzqt(java.util.List<InstrumentInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<InstrumentInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ(it.next()));
        }
        return arrayList;
    }

    public final SpotInstrument AEQbTJ(@NotNull InstrumentInfo instrumentInfo) {
        Intrinsics.checkNotNullParameter(instrumentInfo, "");
        SpotInstrument spotInstrument = new SpotInstrument(new BaseInstrument("SPOT", instrumentInfo.getInstId(), instrumentInfo.getTickSz(), instrumentInfo.getLotSz(), instrumentInfo.getMinSz(), instrumentInfo.getState(), instrumentInfo.getNewTag(), instrumentInfo.getNewLabel(), instrumentInfo.getCoinName(), instrumentInfo.getOnlineTime()), null, null, EZpvd(instrumentInfo.getInstId()), AEQbTJ(instrumentInfo.getInstId()), instrumentInfo.getLever(), instrumentInfo.getCoinLever(), instrumentInfo.getPreQuote(), instrumentInfo.getContinuous(), !Intrinsics.EZpvd((java.lang.Object) instrumentInfo.getIsoFlag(), (java.lang.Object) "0"), instrumentInfo.getStatus(), instrumentInfo.getListTime(), instrumentInfo.getMaxLmtAmt(), instrumentInfo.getMaxMktAmt(), instrumentInfo.getWithinTenMinsOfContractGeneration(), instrumentInfo.getTenMinsAfterContractGeneration(), instrumentInfo.getIndexMaxThresholdRate(), instrumentInfo.getPriceLimitStatus(), instrumentInfo.getSpotLpH1(), instrumentInfo.getSpotLpH2(), instrumentInfo.getSpotLpH3(), instrumentInfo.getSpotLpJ1(), instrumentInfo.getSpotLpJ2(), instrumentInfo.getLpX1(), instrumentInfo.getLpX2(), instrumentInfo.getLpY1(), instrumentInfo.getLpY2(), instrumentInfo.getLpZ1(), instrumentInfo.getLpZ2(), instrumentInfo.getDisplayId(), AEQbTJ(instrumentInfo.getDisplayId()), instrumentInfo.getTradeQuoteCcyList(), instrumentInfo.getListStage(), 6, 0, null);
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) instrumentInfo.getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() == 2) {
            spotInstrument.setBaseCcy((java.lang.String) listSplit$default.get(0));
            spotInstrument.setQuoteCcy((java.lang.String) listSplit$default.get(1));
        }
        return spotInstrument;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        return listSplit$default.size() == 2 ? (java.lang.String) listSplit$default.get(0) : "";
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        return listSplit$default.size() == 2 ? (java.lang.String) listSplit$default.get(1) : "";
    }
}
