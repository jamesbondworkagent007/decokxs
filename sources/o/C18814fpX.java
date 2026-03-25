package o;

import com.okinc.business.defi.wallet.mine.checkversion.domain.usecase.CheckWalletTermsVersionUseCase$invoke$1;
import com.okinc.business.defi.wallet.mine.checkversion.domain.usecase.CheckWalletTermsVersionUseCase$invoke$2;
import com.okinc.components.track.ABTestManager;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18814fpX {
    public java.lang.Boolean AEQbTJ;
    public final C13934dbu EZpvd;
    public final C12827cuN KWHzl;
    public boolean OLrzqt;

    @yCM
    public C18814fpX(@NotNull C12827cuN c12827cuN, @NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.KWHzl = c12827cuN;
        this.EZpvd = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<? extends AbstractC18810fpT>> continuation) {
        CheckWalletTermsVersionUseCase$invoke$1 checkWalletTermsVersionUseCase$invoke$1;
        if (continuation instanceof CheckWalletTermsVersionUseCase$invoke$1) {
            checkWalletTermsVersionUseCase$invoke$1 = (CheckWalletTermsVersionUseCase$invoke$1) continuation;
            int i = checkWalletTermsVersionUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkWalletTermsVersionUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkWalletTermsVersionUseCase$invoke$1 = new CheckWalletTermsVersionUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = checkWalletTermsVersionUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkWalletTermsVersionUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            CheckWalletTermsVersionUseCase$invoke$2 checkWalletTermsVersionUseCase$invoke$2 = new CheckWalletTermsVersionUseCase$invoke$2(this, null);
            checkWalletTermsVersionUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, checkWalletTermsVersionUseCase$invoke$2, checkWalletTermsVersionUseCase$invoke$1);
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

    public final boolean AEQbTJ() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "e2e_disable_wallet_terms_update_pop_up", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON));
        }
        return Intrinsics.EZpvd(this.AEQbTJ, java.lang.Boolean.TRUE);
    }
}
