package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27449jvR extends android.widget.FrameLayout {
    public final InterfaceC56387yDm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27449jvR(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27449jvR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.jvR.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27449jvR(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27449jvR(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.jvW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27449jvR.copydefault(context, this);
            }
        });
        AEQbTJ();
    }

    private final AbstractC23899iNl AYXKKw() {
        return (AbstractC23899iNl) this.KWHzl.getValue();
    }

    public static final AbstractC23899iNl copydefault(android.content.Context context, C27449jvR c27449jvR) {
        AbstractC23899iNl abstractC23899iNlEZpvd = AbstractC23899iNl.EZpvd(android.view.LayoutInflater.from(context), c27449jvR, true);
        Intrinsics.checkNotNullExpressionValue(abstractC23899iNlEZpvd, "");
        return abstractC23899iNlEZpvd;
    }

    public final void AEQbTJ() {
        android.widget.ImageView imageView = AYXKKw().EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        android.widget.ImageView imageView2 = AYXKKw().copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
        android.widget.ImageView imageView3 = AYXKKw().KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(8);
    }

    private final void copydefault(int i) {
        int i2 = (int) (i * getResources().getDisplayMetrics().density);
        AbstractC23899iNl abstractC23899iNlAYXKKw = AYXKKw();
        ViewGroup.LayoutParams layoutParams = abstractC23899iNlAYXKKw.OLrzqt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i2;
            abstractC23899iNlAYXKKw.OLrzqt.setLayoutParams(marginLayoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = abstractC23899iNlAYXKKw.gEmmrt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = i2;
            abstractC23899iNlAYXKKw.gEmmrt.setLayoutParams(marginLayoutParams2);
        }
    }

    public static /* synthetic */ void setFirstToken$default(C27449jvR c27449jvR, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        c27449jvR.setFirstToken(str, str2, str3, str4);
    }

    public final void setFirstToken(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        AbstractC23899iNl abstractC23899iNlAYXKKw = AYXKKw();
        C27516jwf c27516jwf = abstractC23899iNlAYXKKw.AEQbTJ;
        if (!(c27516jwf instanceof C27516jwf)) {
            c27516jwf = null;
        }
        if (c27516jwf != null) {
            c27516jwf.setAmountAndSymbolWithColorRes(str, str2, C52761wXj.Activity.fdOvFl, C52761wXj.Activity.QwvEab);
        }
        abstractC23899iNlAYXKKw.OLrzqt.setText(str3);
        abstractC23899iNlAYXKKw.OLrzqt.setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab));
        android.widget.ImageView imageView = abstractC23899iNlAYXKKw.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
    }

    public static /* synthetic */ void setSecondToken$default(C27449jvR c27449jvR, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        c27449jvR.setSecondToken(str, str2, str3, str4);
    }

    public final void setSecondToken(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        AbstractC23899iNl abstractC23899iNlAYXKKw = AYXKKw();
        C27516jwf c27516jwf = abstractC23899iNlAYXKKw.valueOf;
        if (!(c27516jwf instanceof C27516jwf)) {
            c27516jwf = null;
        }
        if (c27516jwf != null) {
            c27516jwf.setAmountAndSymbolWithColorRes(str, str2, C52761wXj.Activity.fdOvFl, C52761wXj.Activity.QwvEab);
        }
        abstractC23899iNlAYXKKw.gEmmrt.setText(str3);
        abstractC23899iNlAYXKKw.gEmmrt.setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab));
        android.widget.ImageView imageView = abstractC23899iNlAYXKKw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
    }

    public final void setPlusSignVisible(boolean z) {
        android.widget.ImageView imageView = AYXKKw().EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
    }

    public final void setTokens(@NotNull java.util.List<C27522jwl> list) {
        Intrinsics.checkNotNullParameter(list, "");
        int size = list.size();
        if (size == 0) {
            copydefault();
            return;
        }
        if (size == 1) {
            setFirstToken(list.get(0).OLrzqt(), list.get(0).copydefault(), list.get(0).AEQbTJ(), list.get(0).EZpvd());
            EZpvd();
            android.widget.ImageView imageView = AYXKKw().EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            copydefault(16);
            return;
        }
        if (size == 2) {
            setFirstToken(list.get(0).OLrzqt(), list.get(0).copydefault(), list.get(0).AEQbTJ(), list.get(0).EZpvd());
            setSecondToken(list.get(1).OLrzqt(), list.get(1).copydefault(), list.get(1).AEQbTJ(), list.get(1).EZpvd());
            android.widget.ImageView imageView2 = AYXKKw().EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(0);
            KWHzl();
            copydefault(4);
            return;
        }
        setFirstToken(list.get(0).OLrzqt(), list.get(0).copydefault(), list.get(0).AEQbTJ(), list.get(0).EZpvd());
        setSecondToken(list.get(1).OLrzqt(), list.get(1).copydefault(), list.get(1).AEQbTJ(), list.get(1).EZpvd());
        android.widget.ImageView imageView3 = AYXKKw().EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(0);
        KWHzl();
        copydefault(4);
    }

    public final void EZpvd() {
        AbstractC23899iNl abstractC23899iNlAYXKKw = AYXKKw();
        C27516jwf c27516jwf = abstractC23899iNlAYXKKw.valueOf;
        if (!(c27516jwf instanceof C27516jwf)) {
            c27516jwf = null;
        }
        if (c27516jwf != null) {
            c27516jwf.AEQbTJ();
        }
        abstractC23899iNlAYXKKw.gEmmrt.setText("");
        android.widget.ImageView imageView = abstractC23899iNlAYXKKw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
    }

    public final void OLrzqt() {
        AbstractC23899iNl abstractC23899iNlAYXKKw = AYXKKw();
        C27516jwf c27516jwf = abstractC23899iNlAYXKKw.AEQbTJ;
        if (!(c27516jwf instanceof C27516jwf)) {
            c27516jwf = null;
        }
        if (c27516jwf != null) {
            c27516jwf.setMaxTextSize(48);
        }
        C27516jwf c27516jwf2 = abstractC23899iNlAYXKKw.valueOf;
        C27516jwf c27516jwf3 = c27516jwf2 instanceof C27516jwf ? c27516jwf2 : null;
        if (c27516jwf3 != null) {
            c27516jwf3.setMaxTextSize(48);
        }
        android.widget.ImageView imageView = abstractC23899iNlAYXKKw.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = abstractC23899iNlAYXKKw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
    }

    public final void KWHzl() {
        AbstractC23899iNl abstractC23899iNlAYXKKw = AYXKKw();
        C27516jwf c27516jwf = abstractC23899iNlAYXKKw.AEQbTJ;
        if (!(c27516jwf instanceof C27516jwf)) {
            c27516jwf = null;
        }
        if (c27516jwf != null) {
            c27516jwf.setMaxTextSize(32);
        }
        C27516jwf c27516jwf2 = abstractC23899iNlAYXKKw.valueOf;
        C27516jwf c27516jwf3 = c27516jwf2 instanceof C27516jwf ? c27516jwf2 : null;
        if (c27516jwf3 != null) {
            c27516jwf3.setMaxTextSize(32);
        }
        android.widget.ImageView imageView = abstractC23899iNlAYXKKw.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = abstractC23899iNlAYXKKw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
    }

    public final void copydefault() {
        AbstractC23899iNl abstractC23899iNlAYXKKw = AYXKKw();
        C27516jwf c27516jwf = abstractC23899iNlAYXKKw.AEQbTJ;
        if (!(c27516jwf instanceof C27516jwf)) {
            c27516jwf = null;
        }
        if (c27516jwf != null) {
            c27516jwf.AEQbTJ();
        }
        abstractC23899iNlAYXKKw.OLrzqt.setText("");
        android.widget.ImageView imageView = abstractC23899iNlAYXKKw.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        C27516jwf c27516jwf2 = abstractC23899iNlAYXKKw.valueOf;
        C27516jwf c27516jwf3 = c27516jwf2 instanceof C27516jwf ? c27516jwf2 : null;
        if (c27516jwf3 != null) {
            c27516jwf3.AEQbTJ();
        }
        abstractC23899iNlAYXKKw.gEmmrt.setText("");
        android.widget.ImageView imageView2 = abstractC23899iNlAYXKKw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
        android.widget.ImageView imageView3 = abstractC23899iNlAYXKKw.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(8);
    }
}
