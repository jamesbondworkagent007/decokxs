package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import o.yQR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQU {
    public static final void EZpvd(@NotNull yQR yqr, @NotNull yQV yqv, @NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull C56935yXu c56935yXu) {
        yQT location;
        Intrinsics.checkNotNullParameter(yqr, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        if (yqr == yQR.ActionBar.EZpvd || (location = yqv.getLocation()) == null) {
            return;
        }
        Position positionEZpvd = yqr.OLrzqt() ? location.EZpvd() : Position.Companion.EZpvd();
        java.lang.String strAEQbTJ = location.AEQbTJ();
        java.lang.String strKWHzl = yYH.AEQbTJ((InterfaceC56665yNu) interfaceC56658yNn).KWHzl();
        ScopeKind scopeKind = ScopeKind.CLASSIFIER;
        java.lang.String strAEQbTJ2 = c56935yXu.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ2, "");
        yqr.AEQbTJ(strAEQbTJ, positionEZpvd, strKWHzl, scopeKind, strAEQbTJ2);
    }

    public static final void KWHzl(@NotNull yQR yqr, @NotNull yQV yqv, @NotNull yNW ynw, @NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(yqr, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        Intrinsics.checkNotNullParameter(ynw, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        java.lang.String strKWHzl = ynw.KWHzl().KWHzl();
        java.lang.String strAEQbTJ = c56935yXu.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        AEQbTJ(yqr, yqv, strKWHzl, strAEQbTJ);
    }

    public static final void AEQbTJ(@NotNull yQR yqr, @NotNull yQV yqv, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        yQT location;
        Intrinsics.checkNotNullParameter(yqr, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (yqr == yQR.ActionBar.EZpvd || (location = yqv.getLocation()) == null) {
            return;
        }
        yqr.AEQbTJ(location.AEQbTJ(), yqr.OLrzqt() ? location.EZpvd() : Position.Companion.EZpvd(), str, ScopeKind.PACKAGE, str2);
    }
}
