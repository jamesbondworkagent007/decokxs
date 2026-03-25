package o;

import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vwz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51969vwz extends ConstraintLayout {
    public final AbstractC48639uYw EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51969vwz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51969vwz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.vwz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51969vwz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51969vwz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC48639uYw abstractC48639uYwKWHzl = AbstractC48639uYw.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC48639uYwKWHzl, "");
        this.EZpvd = abstractC48639uYwKWHzl;
    }

    public final boolean AEQbTJ() {
        return this.EZpvd.KWHzl.isChecked();
    }

    public final void setChecked(boolean z) {
        this.EZpvd.KWHzl.setChecked(z);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        final AbstractC48639uYw abstractC48639uYw = this.EZpvd;
        abstractC48639uYw.copydefault.setHighlightColor(0);
        abstractC48639uYw.copydefault.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        java.lang.String strReplace$default = C59449zhJ.replace$default(str, str2, "", false, 4, (java.lang.Object) null);
        AppCompatTextView appCompatTextView = abstractC48639uYw.copydefault;
        MatchPattern matchPattern = MatchPattern.CONTAINS;
        appCompatTextView.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str2}, 0, matchPattern, false, new Function1() { // from class: o.vwB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51969vwz.copydefault(this.AEQbTJ, str3, (java.util.List) obj);
            }
        }, 10, null), new java.lang.String[]{strReplace$default}, 0, matchPattern, false, new Function1() { // from class: o.vwI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51969vwz.AEQbTJ(abstractC48639uYw, (java.util.List) obj);
            }
        }, 10, null));
    }

    /* JADX INFO: renamed from: o.vwz$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.lang.String KWHzl;

        public StateListAnimator(java.lang.String str) {
            this.KWHzl = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(C51969vwz.this), BundleKt.bundleOf(C56390yDp.OLrzqt("url", this.KWHzl)), null, 4, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    public static final Unit copydefault(C51969vwz c51969vwz, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        list.add(c51969vwz.new StateListAnimator(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vwz$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public final /* synthetic */ AbstractC48639uYw OLrzqt;

        public Application(AbstractC48639uYw abstractC48639uYw) {
            this.OLrzqt = abstractC48639uYw;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt.KWHzl.setChecked(!this.OLrzqt.KWHzl.isChecked());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
        }
    }

    public static final Unit AEQbTJ(AbstractC48639uYw abstractC48639uYw, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new Application(abstractC48639uYw));
        return Unit.INSTANCE;
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.EZpvd.KWHzl.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
