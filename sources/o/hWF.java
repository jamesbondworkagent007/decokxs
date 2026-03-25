package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hWF extends ConstraintLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public java.lang.String KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hWF(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hWF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.hWF.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hWF(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hWF(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hWG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hWF.AYXKKw(this.KWHzl);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hWH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hWF.AEQbTJ(this.copydefault);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hWJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hWF.KWHzl(this.AEQbTJ);
            }
        });
        this.copydefault = "";
        this.KWHzl = "";
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.xxhdY, (android.view.ViewGroup) this, true);
        OLrzqt().setOnClickListener(new View.OnClickListener() { // from class: o.hWI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                hWF.KWHzl(context, this, view);
            }
        });
    }

    public static final AppCompatTextView AYXKKw(hWF hwf) {
        return (AppCompatTextView) hwf.findViewById(C23274hvD.Application.addState);
    }

    private final AppCompatTextView EZpvd() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    private final AppCompatTextView AEQbTJ() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView AEQbTJ(hWF hwf) {
        return (AppCompatTextView) hwf.findViewById(C23274hvD.Application.open);
    }

    public static final AppCompatImageView KWHzl(hWF hwf) {
        return (AppCompatImageView) hwf.findViewById(C23274hvD.Application.sendSocketRequest);
    }

    private final AppCompatImageView OLrzqt() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final void KWHzl(android.content.Context context, hWF hwf, android.view.View view) {
        C33570myu.EZpvd(context, C25352ivB.OLrzqt(hwf.KWHzl, hwf.copydefault));
        C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.DGOPHZDGOPHZ), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
    }

    public final void setAddressValue(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.KWHzl = str2 != null ? str2 : "";
        AEQbTJ().setText(C25352ivB.OLrzqt(str2, str));
    }

    public final void setAddressValue(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str2;
        this.KWHzl = str3 != null ? str3 : "";
        EZpvd().setText(str);
        AEQbTJ().setText(C25352ivB.OLrzqt(str3, str2));
    }
}
