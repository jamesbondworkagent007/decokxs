package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23211htu {
    public final Function1<java.lang.String, Unit> AEQbTJ;
    public final java.util.HashMap<java.lang.String, C23210htt> EZpvd;
    public final boolean KWHzl;
    public final java.util.HashMap<java.lang.String, C23210htt> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC23211htu(boolean z, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = z;
        this.AEQbTJ = function1;
        this.OLrzqt = new java.util.HashMap<>();
        this.EZpvd = new java.util.HashMap<>();
    }

    public C23210htt AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C23174htJ> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (this.OLrzqt.get(str2) == null) {
            C23210htt c23210htt = new C23210htt(str, str2, list, this.KWHzl, this.AEQbTJ);
            this.OLrzqt.put(str2, c23210htt);
            return c23210htt;
        }
        C23210htt c23210htt2 = this.OLrzqt.get(str2);
        Intrinsics.copydefault(c23210htt2);
        return c23210htt2;
    }

    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C23174htJ> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (C22416heu.ejfBZ()) {
            return;
        }
        AEQbTJ(str, str2, list).AEQbTJ();
    }

    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C23210htt c23210htt = this.OLrzqt.get(str2);
        if (c23210htt != null) {
            c23210htt.copydefault();
        }
        this.OLrzqt.remove(str2);
    }
}
