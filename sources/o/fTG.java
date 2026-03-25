package o;

import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.activate.model.TeeOperateSuccessState;
import com.okinc.business.defi.wallet.tee.activate.usecase.ReactivateTeeUseCase$batchUpgradeTee$1;
import com.okinc.business.defi.wallet.tee.activate.usecase.ReactivateTeeUseCase$batchUpgradeTee$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fTG {
    public final fTV AEQbTJ;
    public final C13934dbu AhwBna;
    public final fTT EZpvd;
    public final java.lang.String KWHzl;
    public final fTU OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public fTG(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull fTU ftu, @NotNull fTV ftv, @NotNull fTT ftt, @NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(ftu, "");
        Intrinsics.checkNotNullParameter(ftv, "");
        Intrinsics.checkNotNullParameter(ftt, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = ftu;
        this.AEQbTJ = ftv;
        this.EZpvd = ftt;
        this.AhwBna = c13934dbu;
        this.KWHzl = "ReactivateTeeUseCase";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull ActivateTeeModel activateTeeModel, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super Result<? extends java.util.List<TeeOperateSuccessState>>> continuation) {
        ReactivateTeeUseCase$batchUpgradeTee$1 reactivateTeeUseCase$batchUpgradeTee$1;
        if (continuation instanceof ReactivateTeeUseCase$batchUpgradeTee$1) {
            reactivateTeeUseCase$batchUpgradeTee$1 = (ReactivateTeeUseCase$batchUpgradeTee$1) continuation;
            int i = reactivateTeeUseCase$batchUpgradeTee$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reactivateTeeUseCase$batchUpgradeTee$1.label = i - Integer.MIN_VALUE;
            } else {
                reactivateTeeUseCase$batchUpgradeTee$1 = new ReactivateTeeUseCase$batchUpgradeTee$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = reactivateTeeUseCase$batchUpgradeTee$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = reactivateTeeUseCase$batchUpgradeTee$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            ReactivateTeeUseCase$batchUpgradeTee$2 reactivateTeeUseCase$batchUpgradeTee$2 = new ReactivateTeeUseCase$batchUpgradeTee$2(this, abstractC12782ctV, str, activateTeeModel, null);
            reactivateTeeUseCase$batchUpgradeTee$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, reactivateTeeUseCase$batchUpgradeTee$2, reactivateTeeUseCase$batchUpgradeTee$1);
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
