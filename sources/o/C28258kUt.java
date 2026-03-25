package o;

import com.okinc.business.trade.features.home.domain.model.BridgeForceUpdateState;
import com.okinc.business.trade.features.home.domain.model.SingleForceUpdateState;
import com.okinc.business.trade.features.home.domain.usecase.CheckAppForceUpdateUseCase$getForceUpdateState$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kUt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28258kUt {
    public final kYD AEQbTJ;
    public final kUE EZpvd;
    public final kUD OLrzqt;

    @yCM
    public C28258kUt(@NotNull kYD kyd, @NotNull kUD kud, @NotNull kUE kue) {
        Intrinsics.checkNotNullParameter(kyd, "");
        Intrinsics.checkNotNullParameter(kud, "");
        Intrinsics.checkNotNullParameter(kue, "");
        this.AEQbTJ = kyd;
        this.OLrzqt = kud;
        this.EZpvd = kue;
    }

    public final kUC EZpvd() {
        return C22416heu.djBIcL() ? this.OLrzqt : this.EZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super C28242kUd> continuation) throws java.lang.Throwable {
        CheckAppForceUpdateUseCase$getForceUpdateState$1 checkAppForceUpdateUseCase$getForceUpdateState$1;
        C28258kUt c28258kUt;
        SingleForceUpdateState singleForceUpdateState;
        if (continuation instanceof CheckAppForceUpdateUseCase$getForceUpdateState$1) {
            checkAppForceUpdateUseCase$getForceUpdateState$1 = (CheckAppForceUpdateUseCase$getForceUpdateState$1) continuation;
            int i = checkAppForceUpdateUseCase$getForceUpdateState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkAppForceUpdateUseCase$getForceUpdateState$1.label = i - Integer.MIN_VALUE;
            } else {
                checkAppForceUpdateUseCase$getForceUpdateState$1 = new CheckAppForceUpdateUseCase$getForceUpdateState$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = checkAppForceUpdateUseCase$getForceUpdateState$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = checkAppForceUpdateUseCase$getForceUpdateState$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            kYD kyd = this.AEQbTJ;
            checkAppForceUpdateUseCase$getForceUpdateState$1.L$0 = this;
            checkAppForceUpdateUseCase$getForceUpdateState$1.label = 1;
            objCopydefault = kyd.copydefault(checkAppForceUpdateUseCase$getForceUpdateState$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c28258kUt = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                singleForceUpdateState = (SingleForceUpdateState) checkAppForceUpdateUseCase$getForceUpdateState$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                return new C28242kUd(singleForceUpdateState, (BridgeForceUpdateState) objCopydefault);
            }
            c28258kUt = (C28258kUt) checkAppForceUpdateUseCase$getForceUpdateState$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        SingleForceUpdateState singleForceUpdateState2 = (SingleForceUpdateState) ((AbstractC43419rot) objCopydefault).copydefault();
        if (singleForceUpdateState2 == null) {
            singleForceUpdateState2 = new SingleForceUpdateState(0, 0, 0, 0, 15, null);
        }
        kUC kucEZpvd = c28258kUt.EZpvd();
        checkAppForceUpdateUseCase$getForceUpdateState$1.L$0 = singleForceUpdateState2;
        checkAppForceUpdateUseCase$getForceUpdateState$1.label = 2;
        java.lang.Object objAEQbTJ = kucEZpvd.AEQbTJ(checkAppForceUpdateUseCase$getForceUpdateState$1);
        if (objAEQbTJ == objCopydefault2) {
            return objCopydefault2;
        }
        singleForceUpdateState = singleForceUpdateState2;
        objCopydefault = objAEQbTJ;
        return new C28242kUd(singleForceUpdateState, (BridgeForceUpdateState) objCopydefault);
    }

    public final void AEQbTJ() {
        this.AEQbTJ.EZpvd();
    }
}
