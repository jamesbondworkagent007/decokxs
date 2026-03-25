package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C35966oKh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39842pzv extends ConstraintLayout {
    public oOF AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39842pzv(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39842pzv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.pzv.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C39842pzv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39842pzv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = (oOF) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C35964oKf.Application.zSsVtY, this, true);
    }

    public final void setEmotionClick(@NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        Intrinsics.checkNotNullParameter(function1, "");
        oOF oof = this.AEQbTJ;
        if (oof != null && (linearLayout2 = oof.copydefault) != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.pzx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39842pzv.setEmotionClick$lambda$0(this.copydefault, function1, view);
                }
            });
        }
        oOF oof2 = this.AEQbTJ;
        if (oof2 == null || (linearLayout = oof2.valueOf) == null) {
            return;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.pzB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39842pzv.setEmotionClick$lambda$1(this.EZpvd, function1, view);
            }
        });
    }

    public static final void setEmotionClick$lambda$0(C39842pzv c39842pzv, Function1 function1, android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.LinearLayout linearLayout3;
        android.widget.LinearLayout linearLayout4;
        android.widget.RelativeLayout relativeLayout;
        android.widget.RelativeLayout relativeLayout2;
        oOF oof = c39842pzv.AEQbTJ;
        if (oof != null && (relativeLayout2 = oof.gEmmrt) != null) {
            relativeLayout2.setBackgroundResource(0);
        }
        oOF oof2 = c39842pzv.AEQbTJ;
        if (oof2 != null && (relativeLayout = oof2.gEmmrt) != null) {
            relativeLayout.setBackgroundResource(C35966oKh.Activity.AhwBna);
        }
        oOF oof3 = c39842pzv.AEQbTJ;
        if (oof3 != null && (linearLayout4 = oof3.djBIcL) != null) {
            linearLayout4.setBackgroundResource(0);
        }
        oOF oof4 = c39842pzv.AEQbTJ;
        if (oof4 != null && (linearLayout3 = oof4.djBIcL) != null) {
            linearLayout3.setBackgroundResource(C35966oKh.Activity.OLrzqt);
        }
        oOF oof5 = c39842pzv.AEQbTJ;
        if (oof5 != null && (imageView2 = oof5.AEQbTJ) != null) {
            imageView2.setImageResource(C35966oKh.Activity.AEQbTJ);
        }
        oOF oof6 = c39842pzv.AEQbTJ;
        if (oof6 != null && (imageView = oof6.OLrzqt) != null) {
            imageView.setImageResource(C35966oKh.Activity.EZpvd);
        }
        oOF oof7 = c39842pzv.AEQbTJ;
        if (oof7 != null && (linearLayout2 = oof7.valueOf) != null) {
            linearLayout2.setClickable(false);
        }
        oOF oof8 = c39842pzv.AEQbTJ;
        if (oof8 != null && (linearLayout = oof8.copydefault) != null) {
            linearLayout.setClickable(false);
        }
        function1.invoke(java.lang.Boolean.TRUE);
    }

    public static final void setEmotionClick$lambda$1(C39842pzv c39842pzv, Function1 function1, android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.LinearLayout linearLayout3;
        android.widget.LinearLayout linearLayout4;
        android.widget.RelativeLayout relativeLayout;
        android.widget.RelativeLayout relativeLayout2;
        oOF oof = c39842pzv.AEQbTJ;
        if (oof != null && (relativeLayout2 = oof.gEmmrt) != null) {
            relativeLayout2.setBackgroundResource(0);
        }
        oOF oof2 = c39842pzv.AEQbTJ;
        if (oof2 != null && (relativeLayout = oof2.gEmmrt) != null) {
            relativeLayout.setBackgroundResource(C35966oKh.Activity.OLrzqt);
        }
        oOF oof3 = c39842pzv.AEQbTJ;
        if (oof3 != null && (linearLayout4 = oof3.djBIcL) != null) {
            linearLayout4.setBackgroundResource(0);
        }
        oOF oof4 = c39842pzv.AEQbTJ;
        if (oof4 != null && (linearLayout3 = oof4.djBIcL) != null) {
            linearLayout3.setBackgroundResource(C35966oKh.Activity.AhwBna);
        }
        oOF oof5 = c39842pzv.AEQbTJ;
        if (oof5 != null && (imageView2 = oof5.AEQbTJ) != null) {
            imageView2.setImageResource(C35966oKh.Activity.KWHzl);
        }
        oOF oof6 = c39842pzv.AEQbTJ;
        if (oof6 != null && (imageView = oof6.OLrzqt) != null) {
            imageView.setImageResource(C35966oKh.Activity.copydefault);
        }
        oOF oof7 = c39842pzv.AEQbTJ;
        if (oof7 != null && (linearLayout2 = oof7.valueOf) != null) {
            linearLayout2.setClickable(false);
        }
        oOF oof8 = c39842pzv.AEQbTJ;
        if (oof8 != null && (linearLayout = oof8.copydefault) != null) {
            linearLayout.setClickable(false);
        }
        function1.invoke(java.lang.Boolean.FALSE);
    }
}
