package o;

import android.content.ClipData;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rPw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42357rPw extends OKEditText {
    public final GradientDrawable AEQbTJ;
    public boolean EZpvd;
    public final GradientDrawable KWHzl;
    public java.lang.String OLrzqt;
    public final int copydefault;
    public Function1<? super java.lang.String, Unit> djBIcL;
    public Function0<Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GradientDrawable AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GradientDrawable EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.View
    public boolean isEnabled() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentCode(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnBackListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.valueOf = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnPasteListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42357rPw(@NotNull android.content.Context context, @androidx.annotation.DimenRes int i) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = i;
        this.djBIcL = new Function1() { // from class: o.rPt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42357rPw.OLrzqt((java.lang.String) obj);
            }
        };
        this.valueOf = new Function0() { // from class: o.rPv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42357rPw.copydefault();
            }
        };
        this.EZpvd = true;
        this.OLrzqt = "";
        this.KWHzl = createCodeInputDrawable$default(this, context, i, C52761wXj.Activity.invokespecialDPHOMC, 0, java.lang.Integer.valueOf(C52761wXj.Activity.QVAiDq), 0, 40, null);
        GradientDrawable gradientDrawableCreateCodeInputDrawable$default = createCodeInputDrawable$default(this, context, i, C52761wXj.Activity.invokespecialDPHOMC, 0, null, 0, 56, null);
        this.AEQbTJ = gradientDrawableCreateCodeInputDrawable$default;
        setGravity(17);
        setInputType(2);
        setTextIsSelectable(false);
        setBackground(gradientDrawableCreateCodeInputDrawable$default);
        setOnKeyListener(new View.OnKeyListener() { // from class: o.rPs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(android.view.View view, int i2, android.view.KeyEvent keyEvent) {
                return C42357rPw.AEQbTJ(this.KWHzl, view, i2, keyEvent);
            }
        });
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.rPz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C42357rPw.AEQbTJ(this.copydefault, view, z);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42357rPw(@NotNull android.content.Context context) {
        this(context, C43662rtX.StateListAnimator.AEQbTJ);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final Unit OLrzqt(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public static final boolean AEQbTJ(C42357rPw c42357rPw, android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (i != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        c42357rPw.valueOf.invoke();
        return false;
    }

    public static final void AEQbTJ(C42357rPw c42357rPw, android.view.View view, boolean z) {
        GradientDrawable gradientDrawable;
        if (z) {
            gradientDrawable = c42357rPw.KWHzl;
        } else {
            gradientDrawable = c42357rPw.AEQbTJ;
        }
        c42357rPw.setBackground(gradientDrawable);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.EZpvd) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        android.content.ClipData primaryClip;
        ClipData.Item itemAt;
        java.lang.CharSequence text;
        if (i == 16908322 || i == 16908337) {
            java.lang.Object systemService = getContext().getSystemService("clipboard");
            java.lang.String string = null;
            android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
            if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && (itemAt = primaryClip.getItemAt(0)) != null && (text = itemAt.getText()) != null) {
                string = text.toString();
            }
            this.djBIcL.invoke(string);
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public static /* synthetic */ GradientDrawable createCodeInputDrawable$default(C42357rPw c42357rPw, android.content.Context context, int i, int i2, int i3, java.lang.Integer num, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 8) != 0) {
            i3 = C43662rtX.StateListAnimator.OLrzqt;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            num = null;
        }
        java.lang.Integer num2 = num;
        if ((i5 & 32) != 0) {
            i4 = 1;
        }
        return c42357rPw.KWHzl(context, i, i2, i6, num2, i4);
    }

    public final GradientDrawable KWHzl(android.content.Context context, @androidx.annotation.DimenRes int i, @androidx.annotation.ColorRes int i2, @androidx.annotation.DimenRes int i3, @androidx.annotation.ColorRes java.lang.Integer num, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(ContextCompat.getColor(context, i2));
        gradientDrawable.setCornerRadius(context.getResources().getDimensionPixelSize(i3));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        gradientDrawable.setSize(dimensionPixelSize, dimensionPixelSize);
        if (num != null) {
            gradientDrawable.setStroke((int) android.util.TypedValue.applyDimension(1, i4, context.getResources().getDisplayMetrics()), ContextCompat.getColor(context, num.intValue()));
        }
        return gradientDrawable;
    }
}
