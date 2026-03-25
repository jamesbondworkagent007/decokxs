package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hXl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22088hXl extends ConstraintLayout {
    public java.lang.String AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22088hXl(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22088hXl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.hXl.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22088hXl(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22088hXl(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = "";
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hXn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22088hXl.AYXKKw(this.copydefault);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hXm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22088hXl.copydefault(this.copydefault);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hXj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22088hXl.AEQbTJ(this.copydefault);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.DGgkXd, (android.view.ViewGroup) this, true);
        EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.hXk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C22088hXl.copydefault(context, this, view);
            }
        });
    }

    private final AppCompatTextView AEQbTJ() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView AYXKKw(C22088hXl c22088hXl) {
        return (AppCompatTextView) c22088hXl.findViewById(C23274hvD.Application.onLayoutDirectionChanged);
    }

    private final C55390xiz KWHzl() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C55390xiz) value;
    }

    public static final C55390xiz copydefault(C22088hXl c22088hXl) {
        return (C55390xiz) c22088hXl.findViewById(C23274hvD.Application.DrawerArrowDrawable);
    }

    public static final AppCompatImageView AEQbTJ(C22088hXl c22088hXl) {
        return (AppCompatImageView) c22088hXl.findViewById(C23274hvD.Application.sendSocketRequest);
    }

    private final AppCompatImageView EZpvd() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final void copydefault(android.content.Context context, C22088hXl c22088hXl, android.view.View view) {
        C33570myu.EZpvd(context, c22088hXl.AEQbTJ);
        C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.DGOPHZDGOPHZ), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
    }

    public final void setTxHashTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().setText(str);
    }

    public final void setTxHashValue(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            this.AEQbTJ = str;
            KWHzl().setText(C25352ivB.OLrzqt(str));
            KWHzl().AEQbTJ(true);
            EZpvd().setVisibility(0);
            return;
        }
        KWHzl().setText("--");
        KWHzl().AEQbTJ(false);
        EZpvd().setVisibility(8);
    }

    public final void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25352ivB.setOnDoubleCheckClickListener$default(KWHzl(), 0L, new Function1() { // from class: o.hXr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22088hXl.copydefault(this.KWHzl, str, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(C22088hXl c22088hXl, java.lang.String str, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = c22088hXl.getContext();
        if (context != null) {
            C25352ivB.OLrzqt(context, str);
        }
        return Unit.INSTANCE;
    }
}
