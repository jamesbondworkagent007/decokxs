package o;

import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.disable.usecase.RemoveTeeUseCase$removeTee$1;
import com.okinc.business.defi.wallet.tee.disable.usecase.RemoveTeeUseCase$removeTee$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fVh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17869fVh {
    public final C10948byA AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final fTU KWHzl;
    public final java.lang.String OLrzqt;
    public final fTW copydefault;
    public final C13934dbu djBIcL;
    public final fTV valueOf;

    @yCM
    public C17869fVh(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull fTU ftu, @NotNull fTV ftv, @NotNull fTW ftw, @NotNull C10948byA c10948byA, @NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(ftu, "");
        Intrinsics.checkNotNullParameter(ftv, "");
        Intrinsics.checkNotNullParameter(ftw, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = ftu;
        this.valueOf = ftv;
        this.copydefault = ftw;
        this.AEQbTJ = c10948byA;
        this.djBIcL = c13934dbu;
        this.OLrzqt = "RemoveTeeUseCase";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull ActivateTeeModel activateTeeModel, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        RemoveTeeUseCase$removeTee$1 removeTeeUseCase$removeTee$1;
        if (continuation instanceof RemoveTeeUseCase$removeTee$1) {
            removeTeeUseCase$removeTee$1 = (RemoveTeeUseCase$removeTee$1) continuation;
            int i = removeTeeUseCase$removeTee$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                removeTeeUseCase$removeTee$1.label = i - Integer.MIN_VALUE;
            } else {
                removeTeeUseCase$removeTee$1 = new RemoveTeeUseCase$removeTee$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = removeTeeUseCase$removeTee$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = removeTeeUseCase$removeTee$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            RemoveTeeUseCase$removeTee$2 removeTeeUseCase$removeTee$2 = new RemoveTeeUseCase$removeTee$2(this, abstractC12782ctV, str, activateTeeModel, null);
            removeTeeUseCase$removeTee$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, removeTeeUseCase$removeTee$2, removeTeeUseCase$removeTee$1);
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
