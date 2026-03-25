package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uLp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48279uLp implements InterfaceC48286uLw {
    public final java.lang.String EZpvd;
    public final yHT<RowScope, Modifier, Composer, java.lang.Integer, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48286uLw
    public java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHT<RowScope, Modifier, Composer, java.lang.Integer, Unit> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHT<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C48279uLp(@NotNull java.lang.String str, @NotNull yHT<? super RowScope, ? super Modifier, ? super Composer, ? super java.lang.Integer, Unit> yht) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yht, "");
        this.EZpvd = str;
        this.OLrzqt = yht;
    }
}
