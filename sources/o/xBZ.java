package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BaseInstrument;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xBZ extends xKE<java.util.List<? extends InstrumentInfo>> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xKE, o.xKK
    public java.lang.String bB_() {
        return "com.okinc.unify_trade.MarginSimpleProductUseCase";
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xBZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final SpotInstrument EZpvd(@NotNull InstrumentInfo instrumentInfo) {
            java.lang.String instId;
            Intrinsics.checkNotNullParameter(instrumentInfo, "");
            BaseInstrument baseInstrument = new BaseInstrument("MARGIN", instrumentInfo.getInstId(), instrumentInfo.getTickSz(), instrumentInfo.getLotSz(), instrumentInfo.getMinSz(), instrumentInfo.getState(), instrumentInfo.getNewTag(), instrumentInfo.getNewLabel(), instrumentInfo.getCoinName(), (java.lang.String) null, 512, (DefaultConstructorMarker) null);
            if (instrumentInfo.getUly().length() > 0) {
                instId = instrumentInfo.getUly();
            } else if (Intrinsics.EZpvd((java.lang.Object) AEQbTJ(instrumentInfo.getInstId()), (java.lang.Object) "USDC")) {
                instId = KWHzl(instrumentInfo.getInstId()) + "-USD";
            } else {
                instId = instrumentInfo.getInstId();
            }
            SpotInstrument spotInstrument = new SpotInstrument(baseInstrument, instId, instrumentInfo.getInstId(), KWHzl(instrumentInfo.getInstId()), AEQbTJ(instrumentInfo.getInstId()), instrumentInfo.getLever(), null, instrumentInfo.getPreQuote(), instrumentInfo.getContinuous(), !Intrinsics.EZpvd((java.lang.Object) instrumentInfo.getIsoFlag(), (java.lang.Object) "0"), null, null, instrumentInfo.getMaxLmtAmt(), instrumentInfo.getMaxMktAmt(), instrumentInfo.getWithinTenMinsOfContractGeneration(), instrumentInfo.getTenMinsAfterContractGeneration(), instrumentInfo.getIndexMaxThresholdRate(), instrumentInfo.getPriceLimitStatus(), instrumentInfo.getSpotLpH1(), instrumentInfo.getSpotLpH2(), instrumentInfo.getSpotLpH3(), instrumentInfo.getSpotLpJ1(), instrumentInfo.getSpotLpJ2(), instrumentInfo.getLpX1(), instrumentInfo.getLpX2(), instrumentInfo.getLpY1(), instrumentInfo.getLpY2(), instrumentInfo.getLpZ1(), instrumentInfo.getLpZ2(), null, null, null, null, -536867776, 1, null);
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) instrumentInfo.getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() == 2) {
                spotInstrument.setBaseCcy((java.lang.String) listSplit$default.get(0));
                spotInstrument.setQuoteCcy((java.lang.String) listSplit$default.get(1));
            }
            return spotInstrument;
        }

        public final java.lang.String KWHzl(java.lang.String str) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            return listSplit$default.size() == 2 ? (java.lang.String) listSplit$default.get(0) : "";
        }

        public final java.lang.String AEQbTJ(java.lang.String str) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            return listSplit$default.size() == 2 ? (java.lang.String) listSplit$default.get(1) : "";
        }
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.InstrumentInfo>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends InstrumentInfo>>> EZpvd() {
        return BizApiService.TaskDescription.getSimpleInstrumentsInfo$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), "MARGIN", 0, 2, null);
    }
}
