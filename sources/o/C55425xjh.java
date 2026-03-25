package o;

import android.widget.TextView;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.uilab.util.SpanUtils;
import com.okinc.uilib.core.icon.TextEndLineIconAlignment;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xjh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55425xjh extends AbstractC55423xjf {
    public java.lang.CharSequence AEQbTJ;
    public TextEndLineIconAlignment OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55425xjh(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55425xjh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachmentViewAlignment(@NotNull TextEndLineIconAlignment textEndLineIconAlignment) {
        Intrinsics.checkNotNullParameter(textEndLineIconAlignment, "");
        this.OLrzqt = textEndLineIconAlignment;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.xjh.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55425xjh(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55425xjh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = TextEndLineIconAlignment.ALIGN_CENTER;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        setTextDirection(C55296xhK.AEQbTJ(this) ? 4 : 3);
    }

    public void copydefault(@androidx.annotation.DrawableRes int i, int i2, java.lang.Integer num) {
        java.lang.CharSequence text = getText();
        this.AEQbTJ = text;
        if (text == null) {
            this.AEQbTJ = "";
        }
        android.graphics.drawable.Drawable drawableCopydefault = AEQbTJ().copydefault(i, i2, num, getCurrentTextColor());
        SpanUtils.Activity activity = drawableCopydefault != null ? new SpanUtils.Activity(drawableCopydefault, this.OLrzqt.getId()) : null;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(((java.lang.Object) this.AEQbTJ) + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
        if (activity != null) {
            Activity activity2 = new Activity(this);
            spannableStringBuilder.setSpan(activity, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            spannableStringBuilder.setSpan(activity2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }

    /* JADX INFO: renamed from: o.xjh$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Activity extends android.text.style.ClickableSpan {
        public final WeakReference<C55425xjh> EZpvd;

        public Activity(@NotNull C55425xjh c55425xjh) {
            Intrinsics.checkNotNullParameter(c55425xjh, "");
            this.EZpvd = new WeakReference<>(c55425xjh);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull android.view.View view) {
            Function0 function0OLrzqt;
            Intrinsics.checkNotNullParameter(view, "");
            C55425xjh c55425xjh = this.EZpvd.get();
            if (c55425xjh == null || (function0OLrzqt = c55425xjh.OLrzqt()) == null) {
                return;
            }
            function0OLrzqt.invoke();
        }
    }
}
