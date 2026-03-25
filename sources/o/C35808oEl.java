package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35808oEl {
    public final C35800oEd AEQbTJ;
    public final C35813oEq KWHzl;

    @yCM
    public C35808oEl(@NotNull C35813oEq c35813oEq, @NotNull C35800oEd c35800oEd) {
        Intrinsics.checkNotNullParameter(c35813oEq, "");
        Intrinsics.checkNotNullParameter(c35800oEd, "");
        this.KWHzl = c35813oEq;
        this.AEQbTJ = c35800oEd;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super OKMessage> continuation) {
        if (this.AEQbTJ.KWHzl(str2)) {
            return this.KWHzl.OLrzqt(str, continuation);
        }
        return null;
    }
}
