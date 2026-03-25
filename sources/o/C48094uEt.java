package o;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uEt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48094uEt implements VisualTransformation {
    public final int AEQbTJ;
    public final long EZpvd;
    public final long KWHzl;
    public final long copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long), (r3v0 long), (r5v0 long), (r7v0 int) A[MD:(long, long, long, int):void (m)] call: o.uEt.<init>(long, long, long, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C48094uEt(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, i);
    }

    public C48094uEt(long j, long j2, long j3, int i) {
        this.copydefault = j;
        this.KWHzl = j2;
        this.EZpvd = j3;
        this.AEQbTJ = i;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(@NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "");
        return new TransformedText(C48093uEs.EZpvd.copydefault(annotatedString.getText(), this.copydefault, this.KWHzl, Color.m3139boximpl(this.EZpvd), this.AEQbTJ), OffsetMapping.Companion.getIdentity());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(C48094uEt.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        C48094uEt c48094uEt = (C48094uEt) obj;
        return Color.m3150equalsimpl0(this.copydefault, c48094uEt.copydefault) && Color.m3150equalsimpl0(this.KWHzl, c48094uEt.KWHzl) && Color.m3150equalsimpl0(this.EZpvd, c48094uEt.EZpvd) && this.AEQbTJ == c48094uEt.AEQbTJ;
    }

    public int hashCode() {
        int iM3156hashCodeimpl = Color.m3156hashCodeimpl(this.copydefault);
        return (((((iM3156hashCodeimpl * 31) + Color.m3156hashCodeimpl(this.KWHzl)) * 31) + Color.m3156hashCodeimpl(this.EZpvd)) * 31) + this.AEQbTJ;
    }
}
