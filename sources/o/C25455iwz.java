package o;

import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25455iwz extends android.widget.LinearLayout {
    public java.util.List<C25406iwC> AEQbTJ;
    public final hGJ EZpvd;
    public float KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25455iwz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25455iwz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.iwz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C25455iwz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25455iwz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = yDY.AhwBna();
        this.EZpvd = hGJ.EZpvd(android.view.LayoutInflater.from(context), this, true);
        setupPillBackground();
        EZpvd();
    }

    public static /* synthetic */ void setSelection$default(C25455iwz c25455iwz, java.util.List list, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        c25455iwz.setSelection(list, z, f);
    }

    public final void setSelection(@NotNull java.util.List<C25406iwC> list, boolean z, float f) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.OLrzqt = z;
        this.KWHzl = f;
        AEQbTJ();
        EZpvd();
    }

    public final void setupPillBackground() {
        setBackground(C25386ivj.OLrzqt(50, java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.invokespecialDPHOMC)), 0.0f, java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.zuBGHE))));
    }

    public final void AEQbTJ() {
        int size = this.AEQbTJ.size();
        if (size == 0) {
            android.widget.LinearLayout linearLayout = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            android.widget.LinearLayout linearLayout2 = this.EZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
        } else if (size == 1) {
            C25406iwC c25406iwC = (C25406iwC) CollectionsKt___CollectionsKt.AuCTelauCTel(this.AEQbTJ);
            android.widget.LinearLayout linearLayout3 = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            linearLayout3.setVisibility(0);
            android.widget.LinearLayout linearLayout4 = this.EZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
            linearLayout4.setVisibility(8);
            android.widget.ImageView imageView = this.EZpvd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            KWHzl(imageView, c25406iwC);
            this.EZpvd.gEmmrt.setText(c25406iwC.copydefault());
        } else {
            android.widget.LinearLayout linearLayout5 = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
            linearLayout5.setVisibility(8);
            android.widget.LinearLayout linearLayout6 = this.EZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout6, "");
            linearLayout6.setVisibility(0);
            setupMultipleIcons();
        }
        KWHzl();
    }

    public final void setupMultipleIcons() {
        this.EZpvd.AEQbTJ.removeAllViews();
        int i = 0;
        for (java.lang.Object obj : CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) this.AEQbTJ, 4)) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C25406iwC c25406iwC = (C25406iwC) obj;
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            if (i > 0) {
                layoutParams.setMarginStart(C55298xhM.dpInt$default(this.KWHzl, (android.content.Context) null, 1, (java.lang.Object) null));
            }
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            KWHzl(imageView, c25406iwC);
            this.EZpvd.AEQbTJ.addView(imageView);
            i++;
        }
    }

    public final void KWHzl(android.widget.ImageView imageView, C25406iwC c25406iwC) {
        java.lang.String strKWHzl = c25406iwC.KWHzl();
        if (strKWHzl != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
            AEQbTJ(imageView, c25406iwC.KWHzl(), c25406iwC);
            return;
        }
        java.lang.Integer numAEQbTJ = c25406iwC.AEQbTJ();
        if (numAEQbTJ == null) {
            numAEQbTJ = c25406iwC.OLrzqt();
        }
        imageView.setImageDrawable(AEQbTJ(numAEQbTJ));
    }

    public final void AEQbTJ(android.widget.ImageView imageView, java.lang.String str, C25406iwC c25406iwC) {
        java.lang.Integer numOLrzqt = c25406iwC.OLrzqt();
        C25386ivj.KWHzl(imageView, str, new C25385ivi(null, numOLrzqt != null ? C33070mpX.KWHzl(numOLrzqt.intValue()) : null, 0.0f, 0, 9, null));
    }

    public final android.graphics.drawable.Drawable AEQbTJ(java.lang.Integer num) {
        if (num != null) {
            try {
                return C33070mpX.KWHzl(num.intValue());
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public final void KWHzl() {
        android.widget.ImageView imageView = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(this.OLrzqt ? 0 : 8);
        if (this.OLrzqt) {
            this.EZpvd.EZpvd.setImageDrawable(C33070mpX.KWHzl(this.copydefault ? C52761wXj.TaskDescription.dUDNAs : C52761wXj.TaskDescription.QSLkRj));
        }
    }

    public final void KWHzl(boolean z) {
        this.copydefault = z;
        if (this.OLrzqt) {
            this.EZpvd.EZpvd.setImageDrawable(C33070mpX.KWHzl(z ? C52761wXj.TaskDescription.dUDNAs : C52761wXj.TaskDescription.QSLkRj));
        }
    }

    public final void EZpvd() {
        setVisibility(this.AEQbTJ.isEmpty() ^ true ? 0 : 8);
    }
}
