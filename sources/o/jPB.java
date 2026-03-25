package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jPB extends ConstraintLayout {
    public final InterfaceC56387yDm AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jPB(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jPB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.jPB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ jPB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jPB(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jPC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jPB.AEQbTJ(context, this);
            }
        });
    }

    private final C21638hGu copydefault() {
        return (C21638hGu) this.AEQbTJ.getValue();
    }

    public static final C21638hGu AEQbTJ(android.content.Context context, jPB jpb) {
        return C21638hGu.OLrzqt(android.view.LayoutInflater.from(context), jpb, true);
    }

    public final void setData(@NotNull final C26047jPz c26047jPz) {
        Intrinsics.checkNotNullParameter(c26047jPz, "");
        C21638hGu c21638hGuCopydefault = copydefault();
        c21638hGuCopydefault.copydefault.setText(C33070mpX.AYXKKw(c26047jPz.AEQbTJ()));
        if (c26047jPz.KWHzl() != null) {
            c21638hGuCopydefault.copydefault.setHelperLabelType(1);
            C25352ivB.setOnDoubleCheckClickListener$default(c21638hGuCopydefault.copydefault, 0L, new Function1() { // from class: o.jPF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jPB.copydefault(this.KWHzl, c26047jPz, (android.view.View) obj);
                }
            }, 1, null);
        } else {
            c21638hGuCopydefault.copydefault.setHelperLabelType(2);
            c21638hGuCopydefault.copydefault.setOnClickListener(null);
        }
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) c26047jPz.copydefault());
        android.widget.ImageView imageView = c21638hGuCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(zOLrzqt ? 0 : 8);
        if (zOLrzqt) {
            android.widget.ImageView imageView2 = c21638hGuCopydefault.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            java.lang.String strCopydefault = c26047jPz.copydefault();
            Intrinsics.copydefault((java.lang.Object) strCopydefault);
            C25386ivj.loadCircleImage$default(imageView2, strCopydefault, false, 2, null);
        }
        android.widget.TextView textView = c21638hGuCopydefault.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c26047jPz.EZpvd()) ? 0 : 8);
        c21638hGuCopydefault.AYXKKw.setText(c26047jPz.EZpvd());
        c21638hGuCopydefault.AYXKKw.setTextColor(c26047jPz.AhwBna());
        boolean zFARcdN = StringsKt__StringsKt.fARcdN(c26047jPz.djBIcL());
        android.widget.TextView textView2 = c21638hGuCopydefault.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(zFARcdN ^ true ? 0 : 8);
        c21638hGuCopydefault.gEmmrt.setText(c26047jPz.djBIcL());
        if (c26047jPz.gEmmrt() != null) {
            android.widget.TextView textView3 = c21638hGuCopydefault.gEmmrt;
            int iIntValue = c26047jPz.gEmmrt().intValue();
            android.content.Context context = c21638hGuCopydefault.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView3.setTextColor(C25382ivf.copydefault(iIntValue, context));
        }
        boolean z = c26047jPz.OLrzqt() != null;
        android.widget.ImageView imageView3 = c21638hGuCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(z ? 0 : 8);
        if (z) {
            c21638hGuCopydefault.KWHzl.setImageResource(c26047jPz.OLrzqt().intValue());
        }
        c21638hGuCopydefault.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.jPE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jPB.setData$lambda$3$lambda$2(c26047jPz, view);
            }
        });
    }

    public static final Unit copydefault(jPB jpb, C26047jPz c26047jPz, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = jpb.getContext();
        if (context != null) {
            C25352ivB.OLrzqt(context, C33070mpX.AYXKKw(c26047jPz.KWHzl().EZpvd()), C33070mpX.AYXKKw(c26047jPz.KWHzl().OLrzqt()), c26047jPz.KWHzl().AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    public static final void setData$lambda$3$lambda$2(C26047jPz c26047jPz, android.view.View view) {
        Function0<Unit> function0ValueOf = c26047jPz.valueOf();
        if (function0ValueOf != null) {
            function0ValueOf.invoke();
        }
    }
}
