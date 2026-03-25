package o;

import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55312xha extends android.widget.RelativeLayout {
    public int AEQbTJ;
    public boolean EZpvd;
    public int KWHzl;
    public C55318xhg OLrzqt;
    public C55320xhi copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55312xha(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55312xha(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55318xhg EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55320xhi KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondView(C55318xhg c55318xhg) {
        this.OLrzqt = c55318xhg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnderlineTextView(C55320xhi c55320xhi) {
        this.copydefault = c55320xhi;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.xha.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55312xha(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public C55312xha(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void setShowUnderline(boolean z) {
        this.EZpvd = z;
        if (z) {
            OLrzqt();
        } else {
            copydefault();
        }
    }

    public final void setUnderlineStyle(int i) {
        this.KWHzl = i;
        C55320xhi c55320xhi = this.copydefault;
        if (c55320xhi != null) {
            c55320xhi.setLineStyle(i);
        }
    }

    public final void setLayoutRule(int i) {
        C55320xhi c55320xhi;
        this.AEQbTJ = i;
        if (i == 12 && (c55320xhi = this.copydefault) != null) {
            c55320xhi.setVerticalAlignment(8);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        android.view.View childAt = getChildAt(0);
        Intrinsics.copydefault(childAt, "");
        this.copydefault = (C55320xhi) childAt;
        if (this.EZpvd) {
            OLrzqt();
        }
    }

    public void OLrzqt() {
        C55320xhi c55320xhi = this.copydefault;
        if (c55320xhi != null) {
            c55320xhi.gEmmrt();
        }
    }

    public void copydefault() {
        C55320xhi c55320xhi = this.copydefault;
        if (c55320xhi != null) {
            c55320xhi.AYXKKw();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C55320xhi c55320xhi;
        super.setOnClickListener(onClickListener);
        if (onClickListener == null || (c55320xhi = this.copydefault) == null) {
            return;
        }
        c55320xhi.setOnClickListener(onClickListener);
    }
}
