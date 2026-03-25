package o;

import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tAw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45912tAw {
    public final tQV copydefault;

    public C45912tAw(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.copydefault = tqv;
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation) {
        return this.copydefault.AEQbTJ(new C45910tAu(list), continuation);
    }
}
