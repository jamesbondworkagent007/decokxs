package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60057zug {
    public final C60022zty EZpvd;
    public final java.util.Map<java.lang.String, java.lang.Object> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60022zty KWHzl() {
        return this.EZpvd;
    }

    public C60057zug(@NotNull C60022zty c60022zty) {
        Intrinsics.checkNotNullParameter(c60022zty, "");
        this.EZpvd = c60022zty;
        this.OLrzqt = C60071zuu.OLrzqt.copydefault();
    }

    public final <T> void AEQbTJ(@NotNull java.lang.String str, @NotNull T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.OLrzqt.put(str, t);
    }
}
