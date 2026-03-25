package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iZS extends ConstraintLayout {
    public final C23793iJn KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iZS(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iZS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.iZS.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ iZS(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iZS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C23793iJn.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
    }

    public final void setTwoLineValueData(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C23793iJn c23793iJn = this.KWHzl;
        c23793iJn.EZpvd.setText(str);
        c23793iJn.KWHzl.setText(str2);
        if (z) {
            android.widget.TextView textView = c23793iJn.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            if (str3 != null) {
                android.widget.TextView textView2 = c23793iJn.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(0);
                c23793iJn.AEQbTJ.setText(str3);
                c23793iJn.AEQbTJ.setTextColor(getContext().getColor(C52761wXj.Activity.QwvEab));
                return;
            }
            android.widget.TextView textView3 = c23793iJn.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
            return;
        }
        if (str3 != null) {
            c23793iJn.valueOf.setText(str3);
            android.widget.TextView textView4 = c23793iJn.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(0);
        } else {
            android.widget.TextView textView5 = c23793iJn.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
        }
        if (str4 != null) {
            android.widget.TextView textView6 = c23793iJn.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            textView6.setVisibility(0);
            c23793iJn.AEQbTJ.setText(str4);
            android.widget.TextView textView7 = c23793iJn.AEQbTJ;
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView7.setTextColor(C27569jxf.getAssetColor$default(c27569jxf, context, C33129mqd.gEmmrt(str5), 0, 2, null));
            return;
        }
        android.widget.TextView textView8 = c23793iJn.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView8, "");
        textView8.setVisibility(8);
    }
}
