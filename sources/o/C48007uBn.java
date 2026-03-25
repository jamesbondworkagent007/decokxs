package o;

import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.okinc.tradeuilib.widget.oktinputlayout.appendview.InputLayoutBothSidesViewState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uBn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48007uBn extends ConstraintLayout implements InterfaceC48003uBj {
    public boolean AEQbTJ;
    public android.widget.TextView AYXKKw;
    public android.widget.ImageView EZpvd;
    public int KWHzl;
    public boolean OLrzqt;
    public int copydefault;
    public InputLayoutBothSidesViewState djBIcL;
    public boolean valueOf;

    /* JADX INFO: renamed from: o.uBn$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InputLayoutBothSidesViewState.values().length];
            try {
                iArr[InputLayoutBothSidesViewState.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InputLayoutBothSidesViewState.DISABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InputLayoutBothSidesViewState.READ_ONLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputLayoutBothSidesViewState OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMLayoutId(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTvLeftText(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.AYXKKw = textView;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:21) call: o.uBn.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C48007uBn(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48007uBn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = InputLayoutBothSidesViewState.NORMAL;
        this.copydefault = C49511upt.StateListAnimator.RJOkX;
        this.KWHzl = 8388611;
    }

    public final android.widget.TextView gEmmrt() {
        android.widget.TextView textView = this.AYXKKw;
        if (textView != null) {
            return textView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void setStatus(@NotNull InputLayoutBothSidesViewState inputLayoutBothSidesViewState) {
        Intrinsics.checkNotNullParameter(inputLayoutBothSidesViewState, "");
        if (inputLayoutBothSidesViewState == this.djBIcL) {
            return;
        }
        this.djBIcL = inputLayoutBothSidesViewState;
        int i = Activity.AEQbTJ[inputLayoutBothSidesViewState.ordinal()];
        android.widget.ImageView imageView = null;
        if (i == 1) {
            android.widget.TextView textViewGEmmrt = gEmmrt();
            int i2 = C52761wXj.Activity.fdOvFl;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textViewGEmmrt.setTextColor(C33070mpX.OLrzqt(i2, context));
            android.widget.ImageView imageView2 = this.EZpvd;
            if (imageView2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                imageView = imageView2;
            }
            imageView.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl)));
            return;
        }
        if (i == 2) {
            gEmmrt().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.hfdhUn));
            android.widget.ImageView imageView3 = this.EZpvd;
            if (imageView3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                imageView = imageView3;
            }
            imageView.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.GiPPlLgiPPlL)));
            return;
        }
        if (i == 3) {
            gEmmrt().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
            android.widget.ImageView imageView4 = this.EZpvd;
            if (imageView4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                imageView = imageView4;
            }
            imageView.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.GiPPlLgiPPlL)));
            return;
        }
        gEmmrt().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.v));
        android.widget.ImageView imageView5 = this.EZpvd;
        if (imageView5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imageView = imageView5;
        }
        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab)));
    }

    public final void valueOf() {
        android.view.View.inflate(getContext(), EZpvd(), this);
        setTvLeftText((android.widget.TextView) findViewById(C49511upt.Application.vLaW));
        this.EZpvd = (android.widget.ImageView) findViewById(C49511upt.Application.QUSxYX);
        gEmmrt().setEllipsize(TextUtils.TruncateAt.END);
        gEmmrt().setMaxLines(1);
        gEmmrt().setSingleLine(true);
    }

    @Override // o.InterfaceC48003uBj
    public java.lang.String KWHzl() {
        return gEmmrt().getText().toString();
    }

    public void setLabel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        gEmmrt().setText(str);
    }

    public void setLabelBolded(boolean z) {
        this.OLrzqt = z;
        if (z) {
            gEmmrt().setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl));
        } else {
            gEmmrt().setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.v));
        }
    }

    public void setSupportClick(boolean z) {
        this.valueOf = z;
        setClickable(z);
        android.widget.ImageView imageView = this.EZpvd;
        if (imageView == null) {
            Intrinsics.gEmmrt("");
            imageView = null;
        }
        imageView.setVisibility(z ? 0 : 8);
        if (z) {
            setStatus(InputLayoutBothSidesViewState.ACTIVE);
        } else {
            setStatus(InputLayoutBothSidesViewState.NORMAL);
        }
    }

    public final void setUnClickButShowArrow() {
        setClickable(false);
        android.widget.ImageView imageView = this.EZpvd;
        if (imageView == null) {
            Intrinsics.gEmmrt("");
            imageView = null;
        }
        imageView.setVisibility(0);
        setStatus(InputLayoutBothSidesViewState.DISABLE);
    }

    public void setLabelSelected(boolean z) {
        this.AEQbTJ = z;
        android.widget.ImageView imageView = this.EZpvd;
        if (imageView == null) {
            Intrinsics.gEmmrt("");
            imageView = null;
        }
        imageView.setSelected(z);
    }

    public final void setContentGravity(int i) {
        this.KWHzl = i;
        gEmmrt().setGravity(i);
    }
}
