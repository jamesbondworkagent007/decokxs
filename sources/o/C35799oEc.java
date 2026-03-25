package o;

import com.okinc.im.usecase.kyc.FetchRequireDataAfterKycUpdateUseCase$execute$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35799oEc {
    public final sGF AEQbTJ;
    public final C35859oGi KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final oDA copydefault;

    @yCM
    public C35799oEc(@NotNull sGF sgf, @NotNull C35859oGi c35859oGi, @NotNull oDA oda, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sgf, "");
        Intrinsics.checkNotNullParameter(c35859oGi, "");
        Intrinsics.checkNotNullParameter(oda, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = sgf;
        this.KWHzl = c35859oGi;
        this.copydefault = oda;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object AEQbTJ(java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new FetchRequireDataAfterKycUpdateUseCase$execute$2(str, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
