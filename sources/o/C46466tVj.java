package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tVj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46466tVj extends ConstraintLayout {
    public C46310tPp AEQbTJ;
    public kotlin.Pair<java.lang.String, java.lang.String> KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46466tVj(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46466tVj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.tVj.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C46466tVj(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46466tVj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        C55258xgZ c55258xgZ;
        android.widget.TextView textView;
        C55258xgZ c55258xgZ2;
        C55258xgZ c55258xgZ3;
        java.lang.String string;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        C55258xgZ c55258xgZ4;
        android.widget.TextView textView4;
        C55258xgZ c55258xgZ5;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        android.widget.TextView textView5;
        C55258xgZ c55258xgZ6;
        C55312xha c55312xhaValueOf2;
        C55320xhi c55320xhiKWHzl2;
        C55258xgZ c55258xgZ7;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new kotlin.Pair<>("", "");
        this.AEQbTJ = C46310tPp.EZpvd(android.view.LayoutInflater.from(context), this);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C47501trL.FragmentManager.UeEOUB);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.fZBcTu, false);
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C47501trL.FragmentManager.dxcTrN);
        setHint(typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.finit, false));
        int integer = typedArrayObtainStyledAttributes.getInteger(C47501trL.FragmentManager.fFgQHt, 100);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(C47501trL.FragmentManager.dvKsVJ, 2);
        int color = typedArrayObtainStyledAttributes.getColor(C47501trL.FragmentManager.giSNqX, C33070mpX.OLrzqt(C52761wXj.Activity.aappFQ, context));
        int color2 = typedArrayObtainStyledAttributes.getColor(C47501trL.FragmentManager.RcXXUw, C33070mpX.OLrzqt(C52761wXj.Activity.fdOvFl, context));
        C46310tPp c46310tPp = this.AEQbTJ;
        if (c46310tPp != null && (c55258xgZ7 = c46310tPp.OLrzqt) != null) {
            c55258xgZ7.setTextAppearance(C32113mPz.Dialog.fIwbmz);
        }
        C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C47501trL.FragmentManager.dNCPSb, C32113mPz.Dialog.getNewProxyInstance), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.tVm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46466tVj.EZpvd(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        });
        C46310tPp c46310tPp2 = this.AEQbTJ;
        if (c46310tPp2 != null && (c55258xgZ6 = c46310tPp2.OLrzqt) != null && (c55312xhaValueOf2 = c55258xgZ6.valueOf()) != null && (c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl2.setTextColor(color);
        }
        C46310tPp c46310tPp3 = this.AEQbTJ;
        if (c46310tPp3 != null && (textView5 = c46310tPp3.AEQbTJ) != null) {
            textView5.setTextColor(color2);
        }
        C46310tPp c46310tPp4 = this.AEQbTJ;
        if (c46310tPp4 != null && (c55258xgZ5 = c46310tPp4.OLrzqt) != null && (c55312xhaValueOf = c55258xgZ5.valueOf()) != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setMaxLines(integer);
        }
        C46310tPp c46310tPp5 = this.AEQbTJ;
        if (c46310tPp5 != null && (textView4 = c46310tPp5.AEQbTJ) != null) {
            textView4.setMaxLines(integer2);
        }
        if (z) {
            C46310tPp c46310tPp6 = this.AEQbTJ;
            if (c46310tPp6 != null && (c55258xgZ4 = c46310tPp6.OLrzqt) != null) {
                c55258xgZ4.setGravity(8388613);
            }
            C46310tPp c46310tPp7 = this.AEQbTJ;
            if (c46310tPp7 != null && (textView3 = c46310tPp7.AEQbTJ) != null) {
                textView3.setGravity(8388613);
            }
        }
        C46310tPp c46310tPp8 = this.AEQbTJ;
        if (c46310tPp8 != null && (textView2 = c46310tPp8.AEQbTJ) != null) {
            textView2.setText(string2);
        }
        C46310tPp c46310tPp9 = this.AEQbTJ;
        if (c46310tPp9 != null && (c55258xgZ3 = c46310tPp9.OLrzqt) != null) {
            if (typedArrayObtainStyledAttributes.getResourceId(C47501trL.FragmentManager.gGvvIC, 0) != 0) {
                string = typedArrayObtainStyledAttributes.getString(C47501trL.FragmentManager.gGvvIC);
            } else {
                string = typedArrayObtainStyledAttributes.getString(C47501trL.FragmentManager.gasjUx);
            }
            c55258xgZ3.setTextValue(string);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.fvQaOB, -1.0f);
        if (dimension > 0.0f) {
            C46310tPp c46310tPp10 = this.AEQbTJ;
            if (c46310tPp10 != null && (c55258xgZ2 = c46310tPp10.OLrzqt) != null) {
                c55258xgZ2.setPaddingRelative(C33129mqd.AhwBna(java.lang.Float.valueOf(dimension)), 0, 0, 0);
            }
            C46310tPp c46310tPp11 = this.AEQbTJ;
            if (c46310tPp11 != null && (textView = c46310tPp11.AEQbTJ) != null) {
                textView.setPaddingRelative(C33129mqd.AhwBna(java.lang.Float.valueOf(dimension)), 0, 0, 0);
            }
        }
        C46310tPp c46310tPp12 = this.AEQbTJ;
        if (c46310tPp12 != null && (c55258xgZ = c46310tPp12.OLrzqt) != null) {
            c55258xgZ.setAttachmentViewVisibility(false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setHint(boolean z) {
        C55258xgZ c55258xgZ;
        C55312xha c55312xhaValueOf;
        this.OLrzqt = z;
        C46310tPp c46310tPp = this.AEQbTJ;
        if (c46310tPp == null || (c55258xgZ = c46310tPp.OLrzqt) == null || (c55312xhaValueOf = c55258xgZ.valueOf()) == null) {
            return;
        }
        c55312xhaValueOf.setShowUnderline(z);
    }

    public final void setContent(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        this.KWHzl = pair;
        setTitle(pair.getFirst());
        setContentValue(this.KWHzl.getSecond());
    }

    public static final Unit EZpvd(C46466tVj c46466tVj, int i) {
        android.widget.TextView textView;
        C46310tPp c46310tPp = c46466tVj.AEQbTJ;
        if (c46310tPp != null && (textView = c46310tPp.AEQbTJ) != null) {
            textView.setTextAppearance(i);
        }
        return Unit.INSTANCE;
    }

    public final void setTitle(@NotNull java.lang.String str) {
        C55258xgZ c55258xgZ;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        C46310tPp c46310tPp = this.AEQbTJ;
        if (c46310tPp == null || (c55258xgZ = c46310tPp.OLrzqt) == null || (c55312xhaValueOf = c55258xgZ.valueOf()) == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(str);
    }

    public final void setContentColor(int i) {
        android.widget.TextView textView;
        C46310tPp c46310tPp = this.AEQbTJ;
        if (c46310tPp == null || (textView = c46310tPp.AEQbTJ) == null) {
            return;
        }
        textView.setTextColor(i);
    }

    public final void setLabelColor(int i) {
        C55258xgZ c55258xgZ;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        C46310tPp c46310tPp = this.AEQbTJ;
        if (c46310tPp == null || (c55258xgZ = c46310tPp.OLrzqt) == null || (c55312xhaValueOf = c55258xgZ.valueOf()) == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextColor(i);
    }

    public final void setContentValue(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        C46310tPp c46310tPp = this.AEQbTJ;
        if (c46310tPp == null || (textView = c46310tPp.AEQbTJ) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void setContentTextSize(int i) {
        android.widget.TextView textView;
        C46310tPp c46310tPp = this.AEQbTJ;
        if (c46310tPp == null || (textView = c46310tPp.AEQbTJ) == null) {
            return;
        }
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView, 8, i, 1, 2);
    }

    public final void setHintClickListener(Function0<Unit> function0) {
        C55258xgZ c55258xgZ;
        C55258xgZ c55258xgZ2;
        if (function0 == null) {
            C46310tPp c46310tPp = this.AEQbTJ;
            if (c46310tPp == null || (c55258xgZ2 = c46310tPp.OLrzqt) == null) {
                return;
            }
            c55258xgZ2.setOnClickListener(null);
            return;
        }
        C46310tPp c46310tPp2 = this.AEQbTJ;
        if (c46310tPp2 == null || (c55258xgZ = c46310tPp2.OLrzqt) == null) {
            return;
        }
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 300L, c55258xgZ, function0));
    }

    /* JADX INFO: renamed from: o.tVj$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, android.view.View view2, Function0 function0) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = view2;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.invoke();
            }
        }
    }
}
