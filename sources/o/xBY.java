package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BaseInstrument;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xBY extends xKE<java.util.List<? extends InstrumentInfo>> {
    public static final Application Companion = new Application(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xKE, o.xKK
    public java.lang.String bB_() {
        return "com.okinc.unify_trade.core.usecase.ipublic.bizProduct";
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xBY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final OptionInstrument OLrzqt(@NotNull InstrumentInfo instrumentInfo) {
            Intrinsics.checkNotNullParameter(instrumentInfo, "");
            return new OptionInstrument(new BaseInstrument("OPTION", instrumentInfo.getInstId(), instrumentInfo.getTickSz(), instrumentInfo.getLotSz(), instrumentInfo.getMinSz(), instrumentInfo.getState(), instrumentInfo.getNewTag(), instrumentInfo.getNewLabel(), instrumentInfo.getCoinName(), (java.lang.String) null, 512, (DefaultConstructorMarker) null), instrumentInfo.getUly(), instrumentInfo.getInstFamily(), instrumentInfo.getSettleCcy(), instrumentInfo.getCtVal(), instrumentInfo.getCtMult(), instrumentInfo.getCtValCcy(), instrumentInfo.getOptType(), instrumentInfo.getStk(), !Intrinsics.EZpvd((java.lang.Object) instrumentInfo.getIsoFlag(), (java.lang.Object) "0"), instrumentInfo.getListTime(), instrumentInfo.getExpTime(), instrumentInfo.getAlias(), instrumentInfo.getSpreadWidthOblMinBaseSpread(), instrumentInfo.getSpreadWidthOblDeltaFactor(), instrumentInfo.getPxLimitFactor(), instrumentInfo.getMasPaDeltaThreshold(), instrumentInfo.getSpreadWidthOblMinBaseSpreadV2(), instrumentInfo.getSpreadWidthOblDeltaFactorGtHaftV2(), instrumentInfo.getSpreadWidthOblDeltaFactorLtHaftV2(), instrumentInfo.getSpreadWidthOblMinBaseSpreadV3(), instrumentInfo.getSpreadWidthOblDeltaFactorGtHaftV3(), instrumentInfo.getSpreadWidthOblDeltaFactorLtHaftV3(), instrumentInfo.getMaxLmtAmt(), instrumentInfo.getMaxMktAmt(), instrumentInfo.getCtType());
        }
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.InstrumentInfo>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends InstrumentInfo>>> EZpvd() {
        return BizApiService.TaskDescription.getSimpleInstrumentsInfo$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), "OPTION", 0, 2, null);
    }
}
