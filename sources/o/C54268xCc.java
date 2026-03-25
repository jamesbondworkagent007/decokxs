package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BaseInstrument;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xCc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54268xCc extends xKE<java.util.List<? extends InstrumentInfo>> {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xKE, o.xKK
    public java.lang.String bB_() {
        return "com.okinc.unify_trade.SwapSimpleProductUseCase";
    }

    /* JADX INFO: renamed from: o.xCc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xCc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final SwapInstrument EZpvd(@NotNull InstrumentInfo instrumentInfo) {
            Intrinsics.checkNotNullParameter(instrumentInfo, "");
            SwapInstrument swapInstrument = new SwapInstrument(new BaseInstrument("SWAP", instrumentInfo.getInstId(), instrumentInfo.getTickSz(), instrumentInfo.getLotSz(), instrumentInfo.getMinSz(), instrumentInfo.getState(), instrumentInfo.getNewTag(), instrumentInfo.getNewLabel(), instrumentInfo.getCoinName(), (java.lang.String) null, 512, (DefaultConstructorMarker) null), instrumentInfo.getUly(), instrumentInfo.getInstFamily(), instrumentInfo.getSettleCcy(), instrumentInfo.getCtVal(), instrumentInfo.getCtMult(), instrumentInfo.getCtValCcy(), instrumentInfo.getLever(), !Intrinsics.EZpvd((java.lang.Object) instrumentInfo.getIsoFlag(), (java.lang.Object) "0"), instrumentInfo.getCtType(), instrumentInfo.getIndexMaxThresholdRate(), instrumentInfo.getTenMinsAfterContractGeneration(), instrumentInfo.getWithinTenMinsOfContractGeneration(), instrumentInfo.getMaxLmtSz(), instrumentInfo.getMaxMktSz(), instrumentInfo.getMaxLmtAmt(), instrumentInfo.getMaxMktAmt(), instrumentInfo.getStatus(), instrumentInfo.getListTime(), instrumentInfo.getUserPositionMaxPercent(), instrumentInfo.getUserPositionMaxValueUSD(), instrumentInfo.getPlatformSidePositionMaxValueUSD(), instrumentInfo.getLpX1(), instrumentInfo.getLpX2(), instrumentInfo.getLpY1(), instrumentInfo.getLpY2(), instrumentInfo.getLpZ1(), instrumentInfo.getLpZ2(), instrumentInfo.getPreQuote(), instrumentInfo.getListStage(), instrumentInfo.getRuleType());
            swapInstrument.setPreMarket(Intrinsics.EZpvd((java.lang.Object) instrumentInfo.getRuleType(), (java.lang.Object) "pre_market"));
            swapInstrument.setRebasePair(Intrinsics.EZpvd((java.lang.Object) instrumentInfo.getRuleType(), (java.lang.Object) "rebase_contract"));
            return swapInstrument;
        }
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.InstrumentInfo>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends InstrumentInfo>>> EZpvd() {
        return BizApiService.TaskDescription.getSimpleInstrumentsInfo$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), "SWAP", 0, 2, null);
    }
}
