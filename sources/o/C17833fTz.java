package o;

import com.okinc.business.defi.wallet.tee.activate.model.ViewDataReady;
import com.okinc.business.defi.wallet.tee.activate.usecase.ActivateTeeViewDataReadyUseCase$invoke$1;
import com.okinc.business.defi.wallet.tee.activate.usecase.ActivateTeeViewDataReadyUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fTz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17833fTz {
    public final C10407bnq AEQbTJ;
    public final InterfaceC46553tYp EZpvd;
    public final java.lang.String KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final fTX copydefault;

    @yCM
    public C17833fTz(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C10407bnq c10407bnq, @NotNull InterfaceC46553tYp interfaceC46553tYp, @NotNull fTX ftx) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c10407bnq, "");
        Intrinsics.checkNotNullParameter(interfaceC46553tYp, "");
        Intrinsics.checkNotNullParameter(ftx, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = c10407bnq;
        this.EZpvd = interfaceC46553tYp;
        this.copydefault = ftx;
        this.KWHzl = "ActivateTeeViewDataReadyUseCase";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, boolean z, @NotNull Continuation<? super Result<ViewDataReady>> continuation) throws java.lang.Throwable {
        ActivateTeeViewDataReadyUseCase$invoke$1 activateTeeViewDataReadyUseCase$invoke$1;
        if (continuation instanceof ActivateTeeViewDataReadyUseCase$invoke$1) {
            activateTeeViewDataReadyUseCase$invoke$1 = (ActivateTeeViewDataReadyUseCase$invoke$1) continuation;
            int i = activateTeeViewDataReadyUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                activateTeeViewDataReadyUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                activateTeeViewDataReadyUseCase$invoke$1 = new ActivateTeeViewDataReadyUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = activateTeeViewDataReadyUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = activateTeeViewDataReadyUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            ActivateTeeViewDataReadyUseCase$invoke$2 activateTeeViewDataReadyUseCase$invoke$2 = new ActivateTeeViewDataReadyUseCase$invoke$2(this, abstractC12782ctV, z, null);
            activateTeeViewDataReadyUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, activateTeeViewDataReadyUseCase$invoke$2, activateTeeViewDataReadyUseCase$invoke$1);
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
