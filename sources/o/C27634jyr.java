package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27634jyr {
    public final kKG KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final jRO copydefault;

    @yCM
    public C27634jyr(@NotNull jRO jro, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jro, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = jro;
        this.KWHzl = kkg;
        this.OLrzqt = coroutineDispatcher;
    }

    public static /* synthetic */ java.lang.Object getEmojiAddressMapping$default(C27634jyr c27634jyr, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c27634jyr.EZpvd(z, continuation);
    }

    public final java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) {
        return this.copydefault.OLrzqt(this.KWHzl.copydefault("1"), z, continuation);
    }
}
