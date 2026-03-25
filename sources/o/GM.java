package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class GM implements GG {
    public static final GM OLrzqt = new GM();

    private GM() {
    }

    @Override // o.GG
    public GE AEQbTJ(@NotNull java.lang.String str, @NotNull Function1<? super GD<java.lang.Long>, Unit> function1, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return GJ.AEQbTJ;
    }

    @Override // o.GG
    public GI EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return GN.OLrzqt;
    }

    @Override // o.GG
    public GB<java.lang.Double> AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return GL.EZpvd;
    }
}
