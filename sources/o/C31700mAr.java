package o;

import android.graphics.drawable.AnimationDrawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;

/* JADX INFO: renamed from: o.mAr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31700mAr extends AbstractC31702mAt {
    public android.widget.ImageView AEQbTJ;
    public java.lang.String KWHzl;
    public android.widget.TextView OLrzqt;
    public AnimationDrawable copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C31700mAr() {
        this(null, null, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C31700mAr(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C31700mAr(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxtNoMore(java.lang.String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:android.content.Context:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null android.content.Context) : (r2v0 android.content.Context))
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.mAr.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C31700mAr(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public C31700mAr(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // o.AbstractC31702mAt
    public android.view.View OLrzqt() {
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C52761wXj.Fragment.finit, (android.view.ViewGroup) null);
        android.view.View viewFindViewById = viewInflate.findViewById(C52761wXj.FragmentManager.RSDDiY);
        Intrinsics.copydefault(viewFindViewById, "");
        this.OLrzqt = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = viewInflate.findViewById(C52761wXj.FragmentManager.OHqIaq);
        Intrinsics.copydefault(viewFindViewById2, "");
        android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById2;
        this.AEQbTJ = imageView;
        Intrinsics.copydefault(imageView);
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        Intrinsics.copydefault(drawable, "");
        this.copydefault = (AnimationDrawable) drawable;
        this.KWHzl = getContext().getString(C33089mpq.EZpvd.AEQbTJ());
        Intrinsics.copydefault(viewInflate);
        return viewInflate;
    }

    @Override // o.AbstractC31702mAt
    public void copydefault() {
        AnimationDrawable animationDrawable;
        android.widget.TextView textView = this.OLrzqt;
        if (textView != null) {
            textView.setText(getContext().getString(C33089mpq.EZpvd.valueOf()));
        }
        android.widget.ImageView imageView = this.AEQbTJ;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        AnimationDrawable animationDrawable2 = this.copydefault;
        Intrinsics.copydefault(animationDrawable2);
        if (animationDrawable2.isRunning() || (animationDrawable = this.copydefault) == null) {
            return;
        }
        animationDrawable.start();
    }

    @Override // o.AbstractC31702mAt
    public void AEQbTJ(boolean z) {
        android.widget.TextView textView = this.OLrzqt;
        if (textView != null) {
            textView.setText(z ? this.KWHzl : "");
        }
        android.widget.ImageView imageView = this.AEQbTJ;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }
}
