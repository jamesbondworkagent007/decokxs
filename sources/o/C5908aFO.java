package o;

import android.os.Build;
import com.okinc.auth.impl.passkey.domain.PasskeyCheckDeviceSupportUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5908aFO {
    public final CoroutineDispatcher EZpvd;
    public final C6609aSa copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @yCM
    public C5908aFO(@NotNull C6609aSa c6609aSa, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c6609aSa, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c6609aSa;
        this.EZpvd = coroutineDispatcher;
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.EZpvd, new PasskeyCheckDeviceSupportUseCase$invoke$2(this, null), continuation);
    }

    public final boolean OLrzqt() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(this.copydefault.OLrzqt()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = java.lang.Boolean.FALSE;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }
}
