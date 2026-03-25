package o;

import com.okinc.buysell.domain.GetConvertInitDataUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyU {
    public final lyZ AEQbTJ;
    public final lyO EZpvd;
    public final lyV OLrzqt;

    @yCM
    public lyU(@NotNull lyO lyo, @NotNull lyV lyv, @NotNull lyZ lyz) {
        Intrinsics.checkNotNullParameter(lyo, "");
        Intrinsics.checkNotNullParameter(lyv, "");
        Intrinsics.checkNotNullParameter(lyz, "");
        this.EZpvd = lyo;
        this.OLrzqt = lyv;
        this.AEQbTJ = lyz;
    }

    public static /* synthetic */ java.lang.Object invoke$default(lyU lyu, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return lyu.copydefault(str, str2, str3, continuation);
    }

    public final java.lang.Object copydefault(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super C31653lza> continuation) {
        return CoroutineScopeKt.coroutineScope(new GetConvertInitDataUseCase$invoke$2(str, str2, this, str3, null), continuation);
    }
}
