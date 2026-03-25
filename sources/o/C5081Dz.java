package o;

import aws.smithy.kotlin.runtime.net.DefaultHostResolver$resolve$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5081Dz implements DE {
    public static final C5081Dz KWHzl = new C5081Dz();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.DE
    public void KWHzl(@NotNull DD dd) {
        Intrinsics.checkNotNullParameter(dd, "");
    }

    private C5081Dz() {
    }

    @Override // o.DE
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<DD>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new DefaultHostResolver$resolve$2(str, null), continuation);
    }
}
