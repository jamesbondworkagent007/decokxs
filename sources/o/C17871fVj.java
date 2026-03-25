package o;

import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.activate.model.TeeOperateSuccessState;
import com.okinc.business.defi.wallet.tee.extend.usecase.ExtendTeeUseCase$extendTee$1;
import com.okinc.business.defi.wallet.tee.extend.usecase.ExtendTeeUseCase$extendTee$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fVj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17871fVj {
    public final java.lang.String AEQbTJ;
    public final fTV AYXKKw;
    public final CoroutineDispatcher EZpvd;
    public final fTW KWHzl;
    public final C10948byA OLrzqt;
    public final fTU copydefault;
    public final C13934dbu djBIcL;

    @yCM
    public C17871fVj(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull fTU ftu, @NotNull fTV ftv, @NotNull fTW ftw, @NotNull C10948byA c10948byA, @NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(ftu, "");
        Intrinsics.checkNotNullParameter(ftv, "");
        Intrinsics.checkNotNullParameter(ftw, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = ftu;
        this.AYXKKw = ftv;
        this.KWHzl = ftw;
        this.OLrzqt = c10948byA;
        this.djBIcL = c13934dbu;
        this.AEQbTJ = "ExtendTeeUseCase";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull ActivateTeeModel activateTeeModel, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super Result<TeeOperateSuccessState>> continuation) {
        ExtendTeeUseCase$extendTee$1 extendTeeUseCase$extendTee$1;
        if (continuation instanceof ExtendTeeUseCase$extendTee$1) {
            extendTeeUseCase$extendTee$1 = (ExtendTeeUseCase$extendTee$1) continuation;
            int i = extendTeeUseCase$extendTee$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                extendTeeUseCase$extendTee$1.label = i - Integer.MIN_VALUE;
            } else {
                extendTeeUseCase$extendTee$1 = new ExtendTeeUseCase$extendTee$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = extendTeeUseCase$extendTee$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = extendTeeUseCase$extendTee$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            ExtendTeeUseCase$extendTee$2 extendTeeUseCase$extendTee$2 = new ExtendTeeUseCase$extendTee$2(this, abstractC12782ctV, str, activateTeeModel, null);
            extendTeeUseCase$extendTee$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, extendTeeUseCase$extendTee$2, extendTeeUseCase$extendTee$1);
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
