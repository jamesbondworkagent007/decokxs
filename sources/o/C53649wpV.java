package o;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53649wpV {
    public final long AEQbTJ;
    public final kotlin.Pair<java.lang.Float, Color>[] KWHzl;
    public final Modifier OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 kotlin.Pair[]), (r2v0 boolean), (r3v0 androidx.compose.ui.Modifier), (r4v0 long) A[MD:(kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[], boolean, androidx.compose.ui.Modifier, long):void (m)] call: o.wpV.<init>(kotlin.Pair[], boolean, androidx.compose.ui.Modifier, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C53649wpV(kotlin.Pair[] pairArr, boolean z, Modifier modifier, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(pairArr, z, modifier, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.wpV */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-g2O1Hgs$default, reason: not valid java name */
    public static /* synthetic */ C53649wpV m8788copyg2O1Hgs$default(C53649wpV c53649wpV, kotlin.Pair[] pairArr, boolean z, Modifier modifier, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pairArr = c53649wpV.KWHzl;
        }
        if ((i & 2) != 0) {
            z = c53649wpV.copydefault;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            modifier = c53649wpV.OLrzqt;
        }
        Modifier modifier2 = modifier;
        if ((i & 8) != 0) {
            j = c53649wpV.AEQbTJ;
        }
        return c53649wpV.OLrzqt(pairArr, z2, modifier2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Modifier OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53649wpV OLrzqt(@NotNull kotlin.Pair<java.lang.Float, Color>[] pairArr, boolean z, @NotNull Modifier modifier, long j) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        Intrinsics.checkNotNullParameter(modifier, "");
        return new C53649wpV(pairArr, z, modifier, j, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BotItemUiState(gradientStops=" + java.util.Arrays.toString(this.KWHzl) + ", isInPreview=" + this.copydefault + ", backgroundModifier=" + this.OLrzqt + ", primaryColor=" + Color.m3157toStringimpl(this.AEQbTJ) + ")";
    }

    public C53649wpV(kotlin.Pair<java.lang.Float, Color>[] pairArr, boolean z, Modifier modifier, long j) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        Intrinsics.checkNotNullParameter(modifier, "");
        this.KWHzl = pairArr;
        this.copydefault = z;
        this.OLrzqt = modifier;
        this.AEQbTJ = j;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(C53649wpV.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        C53649wpV c53649wpV = (C53649wpV) obj;
        return this.copydefault == c53649wpV.copydefault && java.util.Arrays.equals(this.KWHzl, c53649wpV.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c53649wpV.OLrzqt) && Color.m3150equalsimpl0(this.AEQbTJ, c53649wpV.AEQbTJ);
    }

    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode2 = java.util.Arrays.hashCode(this.KWHzl);
        return (((((iHashCode * 31) + iHashCode2) * 31) + this.OLrzqt.hashCode()) * 31) + Color.m3156hashCodeimpl(this.AEQbTJ);
    }
}
