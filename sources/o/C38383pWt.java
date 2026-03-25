package o;

import com.okinc.market.alert.data.MarketUserAlert;
import com.okinc.market.alert.usecase.CommonUserAlertUseCase$checkUserAlert$1;
import com.okinc.market.alert.usecase.CommonUserAlertUseCase$checkUserAlertByDexInstrument$1;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pWt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38383pWt {
    public final C38384pWu AEQbTJ;

    public C38383pWt(@NotNull C38384pWu c38384pWu) {
        Intrinsics.checkNotNullParameter(c38384pWu, "");
        this.AEQbTJ = c38384pWu;
    }

    public final java.lang.Object EZpvd(@NotNull MarketUserAlert marketUserAlert, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl;
        return (C55608xnE.OLrzqt() || (objKWHzl = this.AEQbTJ.KWHzl(marketUserAlert, continuation)) != C56442yFn.copydefault()) ? Unit.INSTANCE : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        CommonUserAlertUseCase$checkUserAlert$1 commonUserAlertUseCase$checkUserAlert$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof CommonUserAlertUseCase$checkUserAlert$1) {
            commonUserAlertUseCase$checkUserAlert$1 = (CommonUserAlertUseCase$checkUserAlert$1) continuation;
            int i = commonUserAlertUseCase$checkUserAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonUserAlertUseCase$checkUserAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                commonUserAlertUseCase$checkUserAlert$1 = new CommonUserAlertUseCase$checkUserAlert$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = commonUserAlertUseCase$checkUserAlert$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = commonUserAlertUseCase$checkUserAlert$1.label;
        boolean zBooleanValue = false;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (!C55608xnE.OLrzqt()) {
                Result.Application application2 = Result.Companion;
                C38384pWu c38384pWu = this.AEQbTJ;
                java.lang.String strKWHzl = C55686xod.KWHzl();
                commonUserAlertUseCase$checkUserAlert$1.label = 1;
                objEZpvd = c38384pWu.EZpvd(strKWHzl, str, str2, commonUserAlertUseCase$checkUserAlert$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(zBooleanValue);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objEZpvd);
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((java.lang.Boolean) objEZpvd).booleanValue()));
        java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = boolKWHzl;
        }
        zBooleanValue = ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
        return C56443yFo.KWHzl(zBooleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull DexInstrument dexInstrument, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        CommonUserAlertUseCase$checkUserAlertByDexInstrument$1 commonUserAlertUseCase$checkUserAlertByDexInstrument$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof CommonUserAlertUseCase$checkUserAlertByDexInstrument$1) {
            commonUserAlertUseCase$checkUserAlertByDexInstrument$1 = (CommonUserAlertUseCase$checkUserAlertByDexInstrument$1) continuation;
            int i = commonUserAlertUseCase$checkUserAlertByDexInstrument$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonUserAlertUseCase$checkUserAlertByDexInstrument$1.label = i - Integer.MIN_VALUE;
            } else {
                commonUserAlertUseCase$checkUserAlertByDexInstrument$1 = new CommonUserAlertUseCase$checkUserAlertByDexInstrument$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = commonUserAlertUseCase$checkUserAlertByDexInstrument$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = commonUserAlertUseCase$checkUserAlertByDexInstrument$1.label;
        boolean zBooleanValue = false;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (!C55608xnE.OLrzqt()) {
                Result.Application application2 = Result.Companion;
                C38384pWu c38384pWu = this.AEQbTJ;
                java.lang.String strKWHzl = C55686xod.KWHzl();
                java.lang.String chainId = dexInstrument.getChainId();
                java.lang.String tokenContractAddress = dexInstrument.getTokenContractAddress();
                commonUserAlertUseCase$checkUserAlertByDexInstrument$1.label = 1;
                objAEQbTJ = c38384pWu.AEQbTJ(strKWHzl, chainId, tokenContractAddress, commonUserAlertUseCase$checkUserAlertByDexInstrument$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(zBooleanValue);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((java.lang.Boolean) objAEQbTJ).booleanValue()));
        java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = boolKWHzl;
        }
        zBooleanValue = ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
        return C56443yFo.KWHzl(zBooleanValue);
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<MarketUserAlert> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCopydefault;
        return (C55608xnE.OLrzqt() || (objCopydefault = this.AEQbTJ.copydefault(list, continuation)) != C56442yFn.copydefault()) ? Unit.INSTANCE : objCopydefault;
    }

    public final java.lang.Object copydefault(@NotNull MarketUserAlert marketUserAlert, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objAEQbTJ;
        return (C55608xnE.OLrzqt() || (objAEQbTJ = this.AEQbTJ.AEQbTJ(marketUserAlert, continuation)) != C56442yFn.copydefault()) ? Unit.INSTANCE : objAEQbTJ;
    }

    public final java.lang.Object EZpvd(@NotNull java.util.List<MarketUserAlert> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objAEQbTJ = this.AEQbTJ.AEQbTJ(C55686xod.KWHzl(), list, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }
}
