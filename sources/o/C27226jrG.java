package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27226jrG extends ConstraintLayout {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public int AEQbTJ;
    public View.OnTouchListener AhwBna;
    public java.lang.String EZpvd;
    public iKO KWHzl;
    public java.lang.String copydefault;
    public java.lang.Boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFlagSide(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFlagTag(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFlagText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTouchListener(View.OnTouchListener onTouchListener) {
        this.AhwBna = onTouchListener;
    }

    /* JADX INFO: renamed from: o.jrG$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jrG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27226jrG(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = -1;
        this.EZpvd = "";
        this.copydefault = "";
        EZpvd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27226jrG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = -1;
        this.EZpvd = "";
        this.copydefault = "";
        EZpvd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27226jrG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = -1;
        this.EZpvd = "";
        this.copydefault = "";
        EZpvd();
    }

    public final void EZpvd() {
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.KWHzl = iKO.KWHzl(android.view.LayoutInflater.from(c27569jxf.AEQbTJ(context)), this, true);
    }

    public final void setText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        iKO iko = this.KWHzl;
        iKO iko2 = null;
        if (iko == null) {
            Intrinsics.gEmmrt("");
            iko = null;
        }
        iko.OLrzqt.setText(str);
        iKO iko3 = this.KWHzl;
        if (iko3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            iko2 = iko3;
        }
        iko2.gEmmrt.setText(str);
    }

    private final android.view.View djBIcL() {
        android.view.View view;
        java.lang.String str;
        iKO iko = null;
        if (Intrinsics.EZpvd(this.gEmmrt, java.lang.Boolean.TRUE)) {
            iKO iko2 = this.KWHzl;
            if (iko2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                iko = iko2;
            }
            view = iko.copydefault;
            str = "hotZone";
        } else {
            iKO iko3 = this.KWHzl;
            if (iko3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                iko = iko3;
            }
            view = iko.AEQbTJ;
            str = "clickableArea";
        }
        Intrinsics.checkNotNullExpressionValue(view, str);
        return view;
    }

    public final void setFlagDirection(int i) {
        if (this.AEQbTJ == i) {
            return;
        }
        this.AEQbTJ = i;
        iKO iko = this.KWHzl;
        iKO iko2 = null;
        if (iko == null) {
            Intrinsics.gEmmrt("");
            iko = null;
        }
        iko.KWHzl.setVisibility(this.AEQbTJ == 0 ? 0 : 4);
        iKO iko3 = this.KWHzl;
        if (iko3 == null) {
            Intrinsics.gEmmrt("");
            iko3 = null;
        }
        iko3.OLrzqt.setVisibility(this.AEQbTJ == 0 ? 0 : 4);
        iKO iko4 = this.KWHzl;
        if (iko4 == null) {
            Intrinsics.gEmmrt("");
            iko4 = null;
        }
        iko4.AYXKKw.setVisibility(this.AEQbTJ == 1 ? 0 : 4);
        iKO iko5 = this.KWHzl;
        if (iko5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            iko2 = iko5;
        }
        iko2.gEmmrt.setVisibility(this.AEQbTJ != 1 ? 4 : 0);
    }

    public final void AYXKKw() {
        android.content.Context context;
        float f;
        iKO iko = this.KWHzl;
        if (iko == null) {
            Intrinsics.gEmmrt("");
            iko = null;
        }
        android.view.View view = iko.copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (this.AEQbTJ == 0) {
            context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            f = 0.0f;
        } else {
            context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            f = 10.0f;
        }
        marginLayoutParams.leftMargin = C55298xhM.copydefault(f, context);
        view.setLayoutParams(marginLayoutParams);
    }

    public final float copydefault() {
        float x = getX();
        iKO iko = this.KWHzl;
        iKO iko2 = null;
        if (iko == null) {
            Intrinsics.gEmmrt("");
            iko = null;
        }
        float x2 = iko.AEQbTJ.getX();
        iKO iko3 = this.KWHzl;
        if (iko3 == null) {
            Intrinsics.gEmmrt("");
            iko3 = null;
        }
        float x3 = iko3.EZpvd.getX();
        iKO iko4 = this.KWHzl;
        if (iko4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            iko2 = iko4;
        }
        return x + x2 + x3 + (iko2.EZpvd.getWidth() / 2);
    }

    public final float AEQbTJ() {
        iKO iko = this.KWHzl;
        iKO iko2 = null;
        if (iko == null) {
            Intrinsics.gEmmrt("");
            iko = null;
        }
        float x = iko.AEQbTJ.getX();
        iKO iko3 = this.KWHzl;
        if (iko3 == null) {
            Intrinsics.gEmmrt("");
            iko3 = null;
        }
        float x2 = iko3.EZpvd.getX();
        iKO iko4 = this.KWHzl;
        if (iko4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            iko2 = iko4;
        }
        return x + x2 + (iko2.EZpvd.getWidth() / 2);
    }

    public final float KWHzl() {
        iKO iko = this.KWHzl;
        if (iko == null) {
            Intrinsics.gEmmrt("");
            iko = null;
        }
        return iko.EZpvd.getWidth() / 2.0f;
    }

    public final void setHotArea(boolean z) {
        if (Intrinsics.EZpvd(java.lang.Boolean.valueOf(z), this.gEmmrt)) {
            return;
        }
        djBIcL().setTag(null);
        djBIcL().setOnTouchListener(null);
        this.gEmmrt = java.lang.Boolean.valueOf(z);
        djBIcL().setTag(this.copydefault);
        djBIcL().setOnTouchListener(this.AhwBna);
    }
}
