package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BaseInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xBV extends xKE<java.util.List<? extends InstrumentInfo>> {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xKE, o.xKK
    public java.lang.String bB_() {
        return "com.okinc.unify_trade.FutureSimpleProductUseCase";
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xBV.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final FutureInstrument copydefault(@NotNull InstrumentInfo instrumentInfo) {
            Intrinsics.checkNotNullParameter(instrumentInfo, "");
            FutureInstrument futureInstrument = new FutureInstrument(new BaseInstrument("FUTURES", instrumentInfo.getInstId(), instrumentInfo.getTickSz(), instrumentInfo.getLotSz(), instrumentInfo.getMinSz(), instrumentInfo.getState(), instrumentInfo.getNewTag(), instrumentInfo.getNewLabel(), instrumentInfo.getCoinName(), (java.lang.String) null, 512, (DefaultConstructorMarker) null), instrumentInfo.getUly(), instrumentInfo.getInstFamily(), instrumentInfo.getSettleCcy(), instrumentInfo.getCtVal(), instrumentInfo.getCtMult(), instrumentInfo.getCtValCcy(), instrumentInfo.getListTime(), instrumentInfo.getExpTime(), instrumentInfo.getLever(), !Intrinsics.EZpvd((java.lang.Object) instrumentInfo.getIsoFlag(), (java.lang.Object) "0"), instrumentInfo.getCtType(), instrumentInfo.getAlias(), instrumentInfo.getCloseMaxThresholdRateWeek(), instrumentInfo.getIndexMaxThresholdRate(), instrumentInfo.getTenMinsAfterContractGeneration(), instrumentInfo.getWithinTenMinsOfContractGeneration(), instrumentInfo.getMaxLmtSz(), instrumentInfo.getMaxMktSz(), instrumentInfo.getMaxLmtAmt(), instrumentInfo.getMaxMktAmt(), instrumentInfo.getExpiryDisplay(), instrumentInfo.getFutureSettlement(), instrumentInfo.getNextSettleTime(), instrumentInfo.getUserPositionMaxPercent(), instrumentInfo.getUserPositionMaxValueUSD(), instrumentInfo.getPlatformSidePositionMaxValueUSD(), instrumentInfo.getLpX1(), instrumentInfo.getLpX2(), instrumentInfo.getLpY1(), instrumentInfo.getLpY2(), instrumentInfo.getLpZ1(), instrumentInfo.getLpZ2(), instrumentInfo.getLpC1(), instrumentInfo.getLpC2());
            futureInstrument.setPreMarket(Intrinsics.EZpvd((java.lang.Object) instrumentInfo.getRuleType(), (java.lang.Object) "pre_market"));
            futureInstrument.setRebasePair(Intrinsics.EZpvd((java.lang.Object) instrumentInfo.getRuleType(), (java.lang.Object) "rebase_contract"));
            return futureInstrument;
        }
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.InstrumentInfo>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends InstrumentInfo>>> EZpvd() {
        return BizApiService.TaskDescription.getSimpleInstrumentsInfo$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), "FUTURES", 0, 2, null);
    }
}
