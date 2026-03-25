package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hXE extends android.widget.FrameLayout {
    public hGB EZpvd;
    public android.text.SpannableStringBuilder KWHzl;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hXE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new android.text.SpannableStringBuilder("");
        AEQbTJ(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXE(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hXE.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void AEQbTJ(android.content.Context context) {
        AppCompatTextView appCompatTextView;
        hGB hgbCopydefault = hGB.copydefault(android.view.LayoutInflater.from(context), this, true);
        this.EZpvd = hgbCopydefault;
        if (hgbCopydefault == null || (appCompatTextView = hgbCopydefault.copydefault) == null) {
            return;
        }
        appCompatTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public final void EZpvd(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl.clear();
        this.KWHzl.clearSpans();
        if (Intrinsics.EZpvd((java.lang.Object) dexMultiChildOrderInfoVo.getExtendStatus(), (java.lang.Object) "1")) {
            java.lang.String str2 = getContext().getString(C23274hvD.Fragment.RXzakW) + " ";
            java.lang.String string = getContext().getString(C23274hvD.Fragment.QIZEnU);
            hGB hgb = this.EZpvd;
            if (hgb != null && (appCompatTextView3 = hgb.copydefault) != null) {
                appCompatTextView3.setTag("closeSwap");
            }
            this.KWHzl.append((java.lang.CharSequence) str2);
            str = string;
        } else {
            hGB hgb2 = this.EZpvd;
            if (hgb2 != null && (appCompatTextView = hgb2.copydefault) != null) {
                appCompatTextView.setTag("");
            }
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            this.KWHzl.append((java.lang.CharSequence) str);
            this.KWHzl.setSpan(new TaskDescription(function2, dexMultiChildOrderInfoVo), this.KWHzl.length() - str.length(), this.KWHzl.length(), 18);
        }
        hGB hgb3 = this.EZpvd;
        if (hgb3 != null && (appCompatTextView2 = hgb3.copydefault) != null) {
            appCompatTextView2.setText(this.KWHzl);
        }
        setDecBackgroundStyle();
    }

    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function2<java.lang.String, DexMultiChildOrderInfoVo, Unit> AEQbTJ;
        public final /* synthetic */ DexMultiChildOrderInfoVo KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
            this.AEQbTJ = function2;
            this.KWHzl = dexMultiChildOrderInfoVo;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            AppCompatTextView appCompatTextView;
            Intrinsics.checkNotNullParameter(view, "");
            hGB hgb = hXE.this.EZpvd;
            if (Intrinsics.EZpvd((hgb == null || (appCompatTextView = hgb.copydefault) == null) ? null : appCompatTextView.getTag(), (java.lang.Object) "closeSwap")) {
                this.AEQbTJ.invoke("1", this.KWHzl);
                return;
            }
            android.content.Context context = hXE.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C25352ivB.OLrzqt(context, this.KWHzl.getToastGuideUrl());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            int i = C52761wXj.Activity.DeEinT;
            android.content.Context context = hXE.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textPaint.setColor(C25382ivf.copydefault(i, context));
            textPaint.setUnderlineText(true);
        }
    }

    public final void setDecBackgroundStyle() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        hGB hgb = this.EZpvd;
        if (hgb != null && (constraintLayout2 = hgb.AEQbTJ) != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iCopydefault = C55298xhM.copydefault(8.0f, context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iCopydefault2 = C55298xhM.copydefault(8.0f, context2);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iCopydefault3 = C55298xhM.copydefault(8.0f, context3);
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            constraintLayout2.setPadding(iCopydefault, iCopydefault2, iCopydefault3, C55298xhM.copydefault(8.0f, context4));
        }
        hGB hgb2 = this.EZpvd;
        if (hgb2 == null || (constraintLayout = hgb2.AEQbTJ) == null) {
            return;
        }
        constraintLayout.setBackground(ContextCompat.getDrawable(getContext(), C23274hvD.ActionBar.fIwbmz));
    }
}
