package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57436yiQ extends ConstraintLayout {
    public final C57386yhT KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57436yiQ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57436yiQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.yiQ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57436yiQ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57436yiQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57386yhT c57386yhTOLrzqt = C57386yhT.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57386yhTOLrzqt, "");
        this.KWHzl = c57386yhTOLrzqt;
        c57386yhTOLrzqt.AEQbTJ.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        c57386yhTOLrzqt.KWHzl.getPaint().setUnderlineText(true);
        c57386yhTOLrzqt.copydefault.getPaint().setUnderlineText(true);
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final void setViewDataBean(@NotNull TransactionTopReminderInfoBean transactionTopReminderInfoBean) {
        Intrinsics.checkNotNullParameter(transactionTopReminderInfoBean, "");
        this.KWHzl.AEQbTJ.setText(transactionTopReminderInfoBean.getOriginText());
        if (transactionTopReminderInfoBean.getPrimaryClickText().length() == 0) {
            this.KWHzl.KWHzl.setVisibility(8);
        } else {
            this.KWHzl.KWHzl.setVisibility(0);
            this.KWHzl.KWHzl.setText(transactionTopReminderInfoBean.getPrimaryClickText());
            C57498yjZ c57498yjZ = C57498yjZ.EZpvd;
            android.widget.TextView textView = this.KWHzl.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c57498yjZ.KWHzl(textView, 8, 8, 8, 8);
            android.widget.TextView textView2 = this.KWHzl.KWHzl;
            textView2.setOnClickListener(new Activity(textView2, 1000L, transactionTopReminderInfoBean));
        }
        if (transactionTopReminderInfoBean.getSecondaryClickText().length() == 0) {
            this.KWHzl.copydefault.setVisibility(8);
        } else {
            this.KWHzl.copydefault.setVisibility(0);
            this.KWHzl.copydefault.setText(transactionTopReminderInfoBean.getSecondaryClickText());
            C57498yjZ c57498yjZ2 = C57498yjZ.EZpvd;
            android.widget.TextView textView3 = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            c57498yjZ2.KWHzl(textView3, 8, 8, 8, 8);
            android.widget.TextView textView4 = this.KWHzl.copydefault;
            textView4.setOnClickListener(new Application(textView4, 1000L, transactionTopReminderInfoBean));
        }
        int i = C57406yhn.Activity.UeEOUB;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(i, context);
        Glide.KWHzl(this).EZpvd(transactionTopReminderInfoBean.getImage()).EZpvd(drawableEZpvd).OLrzqt(drawableEZpvd).EZpvd(this.KWHzl.OLrzqt);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.KWHzl.KWHzl.getVisibility() == 0 && this.KWHzl.copydefault.getVisibility() == 0) {
            this.KWHzl.KWHzl.measure(i, i2);
            this.KWHzl.copydefault.measure(i, i2);
            android.text.Layout layout = this.KWHzl.KWHzl.getLayout();
            if (layout == null) {
                super.onMeasure(i, i2);
                return;
            }
            float lineWidth = layout.getLineWidth(layout.getLineCount() - 1);
            android.text.Layout layout2 = this.KWHzl.copydefault.getLayout();
            if (layout2 == null) {
                super.onMeasure(i, i2);
                return;
            }
            if (C55298xhM.dpInt$default(80, (android.content.Context) null, 1, (java.lang.Object) null) + lineWidth + layout2.getLineWidth(layout2.getLineCount() - 1) > View.MeasureSpec.getSize(i)) {
                ViewGroup.LayoutParams layoutParams = this.KWHzl.KWHzl.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.bottomToBottom = -1;
                layoutParams2.bottomToTop = this.KWHzl.copydefault.getId();
                layoutParams2.endToStart = -1;
                layoutParams2.endToEnd = 0;
                this.KWHzl.KWHzl.setLayoutParams(layoutParams2);
                ViewGroup.LayoutParams layoutParams3 = this.KWHzl.copydefault.getLayoutParams();
                Intrinsics.copydefault(layoutParams3, "");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.setMarginStart(0);
                layoutParams4.getMarginStart();
                layoutParams4.startToEnd = -1;
                layoutParams4.startToStart = this.KWHzl.KWHzl.getId();
                layoutParams4.topToBottom = this.KWHzl.KWHzl.getId();
                this.KWHzl.copydefault.setLayoutParams(layoutParams4);
                super.onMeasure(i, i2);
                return;
            }
        }
        ViewGroup.LayoutParams layoutParams5 = this.KWHzl.KWHzl.getLayoutParams();
        Intrinsics.copydefault(layoutParams5, "");
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        layoutParams6.bottomToBottom = 0;
        layoutParams6.bottomToTop = -1;
        layoutParams6.endToStart = this.KWHzl.copydefault.getId();
        layoutParams6.endToEnd = -1;
        this.KWHzl.KWHzl.setLayoutParams(layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = this.KWHzl.copydefault.getLayoutParams();
        Intrinsics.copydefault(layoutParams7, "");
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        layoutParams8.setMarginStart(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
        layoutParams8.getMarginStart();
        layoutParams8.startToEnd = this.KWHzl.KWHzl.getId();
        layoutParams8.startToStart = -1;
        layoutParams8.topToBottom = this.KWHzl.AEQbTJ.getId();
        this.KWHzl.copydefault.setLayoutParams(layoutParams8);
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: o.yiQ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ TransactionTopReminderInfoBean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, TransactionTopReminderInfoBean transactionTopReminderInfoBean) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = transactionTopReminderInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0<Unit> primaryClickCallback = this.OLrzqt.getPrimaryClickCallback();
                if (primaryClickCallback != null) {
                    primaryClickCallback.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yiQ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ TransactionTopReminderInfoBean AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, TransactionTopReminderInfoBean transactionTopReminderInfoBean) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = transactionTopReminderInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0<Unit> secondaryClickCallback = this.AEQbTJ.getSecondaryClickCallback();
                if (secondaryClickCallback != null) {
                    secondaryClickCallback.invoke();
                }
            }
        }
    }
}
