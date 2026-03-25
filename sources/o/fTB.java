package o;

import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.activate.model.TeeActivateOperateSuccessState;
import com.okinc.business.defi.wallet.tee.activate.usecase.ActivateTeeUseCase$activateTee$1;
import com.okinc.business.defi.wallet.tee.activate.usecase.ActivateTeeUseCase$activateTee$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fTB {
    public final java.lang.String AEQbTJ;
    public final C13934dbu AYXKKw;
    public final CoroutineDispatcher EZpvd;
    public final fTU KWHzl;
    public final fTV OLrzqt;
    public final fTT copydefault;

    @yCM
    public fTB(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull fTU ftu, @NotNull fTV ftv, @NotNull fTT ftt, @NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(ftu, "");
        Intrinsics.checkNotNullParameter(ftv, "");
        Intrinsics.checkNotNullParameter(ftt, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = ftu;
        this.OLrzqt = ftv;
        this.copydefault = ftt;
        this.AYXKKw = c13934dbu;
        this.AEQbTJ = "ActivateTeeUseCase";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull ActivateTeeModel activateTeeModel, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super Result<TeeActivateOperateSuccessState>> continuation) throws java.lang.Throwable {
        ActivateTeeUseCase$activateTee$1 activateTeeUseCase$activateTee$1;
        if (continuation instanceof ActivateTeeUseCase$activateTee$1) {
            activateTeeUseCase$activateTee$1 = (ActivateTeeUseCase$activateTee$1) continuation;
            int i = activateTeeUseCase$activateTee$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                activateTeeUseCase$activateTee$1.label = i - Integer.MIN_VALUE;
            } else {
                activateTeeUseCase$activateTee$1 = new ActivateTeeUseCase$activateTee$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = activateTeeUseCase$activateTee$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = activateTeeUseCase$activateTee$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            ActivateTeeUseCase$activateTee$2 activateTeeUseCase$activateTee$2 = new ActivateTeeUseCase$activateTee$2(this, abstractC12782ctV, str, activateTeeModel, null);
            activateTeeUseCase$activateTee$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, activateTeeUseCase$activateTee$2, activateTeeUseCase$activateTee$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
