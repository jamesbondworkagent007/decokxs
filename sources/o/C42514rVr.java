package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rVr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42514rVr extends ConstraintLayout {
    public final C43805rwH EZpvd;
    public final C42519rVw copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42514rVr(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42514rVr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.rVr.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42514rVr(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42514rVr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42519rVw c42519rVw = new C42519rVw(context, attributeSet, i);
        this.copydefault = c42519rVw;
        C43805rwH c43805rwHEZpvd = C43805rwH.EZpvd(android.view.LayoutInflater.from(context), this, true);
        this.EZpvd = c43805rwHEZpvd;
        android.widget.TextView textView = c43805rwHEZpvd.AEQbTJ;
        TextViewCompat.setTextAppearance(textView, c42519rVw.AkhnZx());
        textView.setTextSize(0, c42519rVw.DbNXlk());
        textView.setTextColor(c42519rVw.fetchVPNInfo());
        android.widget.TextView textView2 = c43805rwHEZpvd.OLrzqt;
        TextViewCompat.setTextAppearance(textView2, c42519rVw.AkhnZx());
        textView2.setTextSize(0, c42519rVw.DbNXlk());
        textView2.setTextColor(c42519rVw.fetchVPNInfo());
    }

    public final void setData(java.lang.String str, java.lang.String str2, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (str != null) {
            this.EZpvd.OLrzqt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.EZpvd.OLrzqt.setText(C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.rVs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42514rVr.EZpvd(function0, (java.util.List) obj);
                }
            }, 14, null));
        }
        if (str2 != null) {
            this.EZpvd.AEQbTJ.setText(str2);
        }
    }

    /* JADX INFO: renamed from: o.rVr$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function0<Unit> copydefault;

        public Application(Function0<Unit> function0) {
            this.copydefault = function0;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault.invoke();
        }
    }

    public static final Unit EZpvd(Function0 function0, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new Application(function0));
        return Unit.INSTANCE;
    }
}
