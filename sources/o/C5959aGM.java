package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5959aGM extends ConstraintLayout {
    public C5636aAH KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5959aGM(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5959aGM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:11) call: o.aGM.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C5959aGM(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5959aGM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C5636aAH.EZpvd(android.view.LayoutInflater.from(context).inflate(C8206ayP.Application.DCUTEI, (android.view.ViewGroup) this, true));
    }

    public final void setReadyToVerify(boolean z) {
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        java.lang.String strAYXKKw;
        android.widget.TextView textView2;
        java.lang.String strAYXKKw2;
        this.OLrzqt = z;
        C5636aAH c5636aAH = this.KWHzl;
        if (c5636aAH != null && (textView2 = c5636aAH.AEQbTJ) != null) {
            if (z) {
                strAYXKKw2 = C33070mpX.AYXKKw(C8206ayP.Dialog.swzYdv);
            } else {
                strAYXKKw2 = C33070mpX.AYXKKw(C8206ayP.Dialog.sVXHln);
            }
            textView2.setText(strAYXKKw2);
        }
        C5636aAH c5636aAH2 = this.KWHzl;
        if (c5636aAH2 != null && (textView = c5636aAH2.copydefault) != null) {
            if (z) {
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.gmHjFq);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.iPSTqm);
            }
            textView.setText(strAYXKKw);
        }
        C5636aAH c5636aAH3 = this.KWHzl;
        if (c5636aAH3 == null || (imageView = c5636aAH3.KWHzl) == null) {
            return;
        }
        imageView.setImageResource(z ? C8206ayP.Activity.djBIcL : C8206ayP.Activity.AYXKKw);
    }
}
