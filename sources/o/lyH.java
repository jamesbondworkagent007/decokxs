package o;

import com.okinc.buysell.domain.FromTokenSwitchedUseCase$invoke$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyH {
    public final CoroutineDispatcher KWHzl;
    public final lyV OLrzqt;

    @yCM
    public lyH(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull lyV lyv) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(lyv, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = lyv;
    }

    public static /* synthetic */ java.lang.Object invoke$default(lyH lyh, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = null;
        }
        return lyh.OLrzqt(z2, str, str2, str3, continuation);
    }

    public final java.lang.Object OLrzqt(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<C31394ltG, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new FromTokenSwitchedUseCase$invoke$2(this, z, str, str3, str2, null), continuation);
    }
}
