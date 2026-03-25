package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27235jrP extends ConstraintLayout {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public int AEQbTJ;
    public java.lang.Boolean AYXKKw;
    public java.lang.String EZpvd;
    public java.lang.String OLrzqt;
    public iKP copydefault;
    public View.OnTouchListener gEmmrt;

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
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFlagText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHotZoneSingleSided(java.lang.Boolean bool) {
        this.AYXKKw = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTouchListener(View.OnTouchListener onTouchListener) {
        this.gEmmrt = onTouchListener;
    }

    /* JADX INFO: renamed from: o.jrP$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jrP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27235jrP(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = -1;
        this.OLrzqt = "";
        this.EZpvd = "";
        AhwBna();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27235jrP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = -1;
        this.OLrzqt = "";
        this.EZpvd = "";
        AhwBna();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27235jrP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = -1;
        this.OLrzqt = "";
        this.EZpvd = "";
        AhwBna();
    }

    public final void AhwBna() {
        this.copydefault = iKP.KWHzl(android.view.LayoutInflater.from(getContext()), this, true);
    }

    public final void setText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        iKP ikp = this.copydefault;
        iKP ikp2 = null;
        if (ikp == null) {
            Intrinsics.gEmmrt("");
            ikp = null;
        }
        ikp.djBIcL.setText(str);
        iKP ikp3 = this.copydefault;
        if (ikp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikp2 = ikp3;
        }
        ikp2.copydefault.setText(str);
    }

    public final android.view.View EZpvd() {
        android.view.View view;
        java.lang.String str;
        iKP ikp = null;
        if (Intrinsics.EZpvd(this.AYXKKw, java.lang.Boolean.TRUE)) {
            iKP ikp2 = this.copydefault;
            if (ikp2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikp = ikp2;
            }
            view = ikp.AEQbTJ;
            str = "hotZone";
        } else {
            iKP ikp3 = this.copydefault;
            if (ikp3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikp = ikp3;
            }
            view = ikp.EZpvd;
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
        iKP ikp = this.copydefault;
        iKP ikp2 = null;
        if (ikp == null) {
            Intrinsics.gEmmrt("");
            ikp = null;
        }
        ikp.valueOf.setVisibility(this.AEQbTJ == 0 ? 0 : 4);
        iKP ikp3 = this.copydefault;
        if (ikp3 == null) {
            Intrinsics.gEmmrt("");
            ikp3 = null;
        }
        ikp3.djBIcL.setVisibility(this.AEQbTJ == 0 ? 0 : 4);
        iKP ikp4 = this.copydefault;
        if (ikp4 == null) {
            Intrinsics.gEmmrt("");
            ikp4 = null;
        }
        ikp4.KWHzl.setVisibility(this.AEQbTJ == 1 ? 0 : 4);
        iKP ikp5 = this.copydefault;
        if (ikp5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikp2 = ikp5;
        }
        ikp2.copydefault.setVisibility(this.AEQbTJ != 1 ? 4 : 0);
    }

    public final void valueOf() {
        android.content.Context context;
        float f;
        iKP ikp = this.copydefault;
        if (ikp == null) {
            Intrinsics.gEmmrt("");
            ikp = null;
        }
        android.view.View view = ikp.AEQbTJ;
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
        marginLayoutParams.topMargin = C55298xhM.copydefault(f, context);
        view.setLayoutParams(marginLayoutParams);
    }

    public final float copydefault() {
        float y = getY();
        iKP ikp = this.copydefault;
        iKP ikp2 = null;
        if (ikp == null) {
            Intrinsics.gEmmrt("");
            ikp = null;
        }
        float y2 = ikp.EZpvd.getY();
        iKP ikp3 = this.copydefault;
        if (ikp3 == null) {
            Intrinsics.gEmmrt("");
            ikp3 = null;
        }
        float y3 = ikp3.OLrzqt.getY();
        iKP ikp4 = this.copydefault;
        if (ikp4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikp2 = ikp4;
        }
        return y + y2 + y3 + (ikp2.OLrzqt.getHeight() / 2);
    }

    public final float AEQbTJ() {
        iKP ikp = this.copydefault;
        iKP ikp2 = null;
        if (ikp == null) {
            Intrinsics.gEmmrt("");
            ikp = null;
        }
        float y = ikp.EZpvd.getY();
        iKP ikp3 = this.copydefault;
        if (ikp3 == null) {
            Intrinsics.gEmmrt("");
            ikp3 = null;
        }
        float y2 = ikp3.OLrzqt.getY();
        iKP ikp4 = this.copydefault;
        if (ikp4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikp2 = ikp4;
        }
        return y + y2 + (ikp2.OLrzqt.getHeight() / 2);
    }

    public final float KWHzl() {
        iKP ikp = this.copydefault;
        if (ikp == null) {
            Intrinsics.gEmmrt("");
            ikp = null;
        }
        return ikp.OLrzqt.getHeight() / 2.0f;
    }

    public final void setHotArea(boolean z) {
        if (Intrinsics.EZpvd(java.lang.Boolean.valueOf(z), this.AYXKKw)) {
            return;
        }
        EZpvd().setTag(null);
        EZpvd().setOnTouchListener(null);
        this.AYXKKw = java.lang.Boolean.valueOf(z);
        EZpvd().setTag(this.EZpvd);
        EZpvd().setOnTouchListener(this.gEmmrt);
    }
}
