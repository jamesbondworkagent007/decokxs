package o;

import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeMiddleModel;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.common.model.AttestationParseData;
import com.okinc.business.defi.wallet.tee.common.usecase.GetActivateTeeMiddleModelUseCase$invoke$1;
import com.okinc.business.defi.wallet.tee.common.usecase.GetActivateTeeMiddleModelUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fTT {
    public final fTV AEQbTJ;
    public final fTW EZpvd;
    public final java.lang.String KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C10948byA copydefault;
    public final C17835fUa gEmmrt;

    @yCM
    public fTT(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull fTV ftv, @NotNull fTW ftw, @NotNull C17835fUa c17835fUa, @NotNull C10948byA c10948byA) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(ftv, "");
        Intrinsics.checkNotNullParameter(ftw, "");
        Intrinsics.checkNotNullParameter(c17835fUa, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = ftv;
        this.EZpvd = ftw;
        this.gEmmrt = c17835fUa;
        this.copydefault = c10948byA;
        this.KWHzl = "GetActivateTeeMiddleModelUseCase";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str, @NotNull ActivateTeeModel activateTeeModel, @NotNull AttestationParseData attestationParseData, @NotNull Continuation<? super Result<ActivateTeeMiddleModel>> continuation) throws java.lang.Throwable {
        GetActivateTeeMiddleModelUseCase$invoke$1 getActivateTeeMiddleModelUseCase$invoke$1;
        if (continuation instanceof GetActivateTeeMiddleModelUseCase$invoke$1) {
            getActivateTeeMiddleModelUseCase$invoke$1 = (GetActivateTeeMiddleModelUseCase$invoke$1) continuation;
            int i = getActivateTeeMiddleModelUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getActivateTeeMiddleModelUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getActivateTeeMiddleModelUseCase$invoke$1 = new GetActivateTeeMiddleModelUseCase$invoke$1(this, continuation);
            }
        }
        GetActivateTeeMiddleModelUseCase$invoke$1 getActivateTeeMiddleModelUseCase$invoke$12 = getActivateTeeMiddleModelUseCase$invoke$1;
        java.lang.Object objWithContext = getActivateTeeMiddleModelUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getActivateTeeMiddleModelUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            GetActivateTeeMiddleModelUseCase$invoke$2 getActivateTeeMiddleModelUseCase$invoke$2 = new GetActivateTeeMiddleModelUseCase$invoke$2(this, abstractC12782ctV, str, activateTeeModel, attestationParseData, null);
            getActivateTeeMiddleModelUseCase$invoke$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getActivateTeeMiddleModelUseCase$invoke$2, getActivateTeeMiddleModelUseCase$invoke$12);
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
