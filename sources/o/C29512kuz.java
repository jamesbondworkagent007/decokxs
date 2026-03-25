package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import com.okinc.business.market.features.smart_money.signal.domain.GetSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSmartMoneyConfigUseCase$getSmartMoneySignalConfigIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.core.util.SPUtils;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29512kuz {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC29466kuF KWHzl;
    public final C29464kuD OLrzqt;
    public final C29471kuK copydefault;

    @yCM
    public C29512kuz(@NotNull InterfaceC29466kuF interfaceC29466kuF, @NotNull C29471kuK c29471kuK, @NotNull C29464kuD c29464kuD, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29466kuF, "");
        Intrinsics.checkNotNullParameter(c29471kuK, "");
        Intrinsics.checkNotNullParameter(c29464kuD, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC29466kuF;
        this.copydefault = c29471kuK;
        this.OLrzqt = c29464kuD;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0029, B:29:0x0072, B:31:0x0080, B:32:0x0093, B:26:0x0063), top: B:36:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<SmartMoneyConfig>> continuation) throws java.lang.Throwable {
        GetSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1 getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1;
        C29512kuz c29512kuz;
        SmartMoneyConfig smartMoneyConfig;
        if (continuation instanceof GetSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1) {
            getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1 = (GetSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1) continuation;
            int i = getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1 = new GetSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                GetSmartMoneyConfigUseCase$getSmartMoneySignalConfigIoAF18A$$inlined$dexRunCatching$1 getSmartMoneyConfigUseCase$getSmartMoneySignalConfigIoAF18A$$inlined$dexRunCatching$1 = new GetSmartMoneyConfigUseCase$getSmartMoneySignalConfigIoAF18A$$inlined$dexRunCatching$1(null, this);
                getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1.L$0 = this;
                getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, getSmartMoneyConfigUseCase$getSmartMoneySignalConfigIoAF18A$$inlined$dexRunCatching$1, getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c29512kuz = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objWithContext);
                    java.lang.String str = (java.lang.String) objWithContext;
                    smartMoneyConfig = (SmartMoneyConfig) SPUtils.getObject("dex_market_signal_config", SmartMoneyConfig.class);
                    if (smartMoneyConfig == null) {
                        smartMoneyConfig = new SmartMoneyConfig(str, null, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
                    }
                    return Result.m7377constructorimpl(smartMoneyConfig.KWHzl((TypedValues.PositionType.TYPE_POSITION_TYPE & 1) != 0 ? smartMoneyConfig.KWHzl : str, (TypedValues.PositionType.TYPE_POSITION_TYPE & 2) != 0 ? smartMoneyConfig.AEQbTJ : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 4) != 0 ? smartMoneyConfig.AYXKKw : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 8) != 0 ? smartMoneyConfig.OLrzqt : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 16) != 0 ? smartMoneyConfig.valueOf : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 32) != 0 ? smartMoneyConfig.djBIcL : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 64) != 0 ? smartMoneyConfig.EZpvd : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 128) != 0 ? smartMoneyConfig.copydefault : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 256) != 0 ? smartMoneyConfig.AhwBna : null));
                }
                c29512kuz = (C29512kuz) getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
            }
            java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
            if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) == null) {
                return objM7386unboximpl;
            }
            Result.Application application = Result.Companion;
            C29464kuD c29464kuD = c29512kuz.OLrzqt;
            getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1.L$0 = null;
            getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1.label = 2;
            objWithContext = c29464kuD.OLrzqt(getSmartMoneyConfigUseCase$getSmartMoneySignalConfig$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            java.lang.String str2 = (java.lang.String) objWithContext;
            smartMoneyConfig = (SmartMoneyConfig) SPUtils.getObject("dex_market_signal_config", SmartMoneyConfig.class);
            if (smartMoneyConfig == null) {
            }
            return Result.m7377constructorimpl(smartMoneyConfig.KWHzl((TypedValues.PositionType.TYPE_POSITION_TYPE & 1) != 0 ? smartMoneyConfig.KWHzl : str2, (TypedValues.PositionType.TYPE_POSITION_TYPE & 2) != 0 ? smartMoneyConfig.AEQbTJ : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 4) != 0 ? smartMoneyConfig.AYXKKw : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 8) != 0 ? smartMoneyConfig.OLrzqt : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 16) != 0 ? smartMoneyConfig.valueOf : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 32) != 0 ? smartMoneyConfig.djBIcL : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 64) != 0 ? smartMoneyConfig.EZpvd : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 128) != 0 ? smartMoneyConfig.copydefault : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 256) != 0 ? smartMoneyConfig.AhwBna : null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
