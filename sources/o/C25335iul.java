package o;

import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25335iul extends android.widget.LinearLayout {
    public hFO EZpvd;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChecked(boolean z) {
        this.copydefault = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25335iul(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25335iul(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25335iul(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25335iul(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void copydefault() {
        if (getContext() == null) {
            return;
        }
        this.EZpvd = hFO.EZpvd(android.view.LayoutInflater.from(getContext()), this, true);
    }

    public final wYK AEQbTJ() {
        hFO hfo = this.EZpvd;
        if (hfo != null) {
            return hfo.EZpvd;
        }
        return null;
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        hFO hfo = this.EZpvd;
        if (hfo != null) {
            hfo.OLrzqt.setText(AEQbTJ(str));
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.DzkRMH, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", C23311hvo.formatPercent$default(str, false, 0, 0, null, null, 31, null))));
    }
}
