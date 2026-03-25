package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.okinc.web3Uilib.bean.TransactionTopHeaderInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57431yiL extends ConstraintLayout {
    public final C57384yhR copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57431yiL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57431yiL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.yiL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57431yiL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57431yiL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57384yhR c57384yhRAEQbTJ = C57384yhR.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57384yhRAEQbTJ, "");
        this.copydefault = c57384yhRAEQbTJ;
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    private final android.widget.TextView OLrzqt() {
        android.widget.TextView textView = this.copydefault.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.copydefault.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView KWHzl() {
        android.widget.TextView textView = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final void setViewDataBean(@NotNull TransactionTopHeaderInfoBean transactionTopHeaderInfoBean) {
        Intrinsics.checkNotNullParameter(transactionTopHeaderInfoBean, "");
        Glide.KWHzl(this).KWHzl(transactionTopHeaderInfoBean.getMainIcon()).EZpvd(transactionTopHeaderInfoBean.getMainDefaultIcon()).OLrzqt(transactionTopHeaderInfoBean.getMainDefaultIcon()).EZpvd(this.copydefault.EZpvd);
        android.widget.TextView textView = this.copydefault.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, transactionTopHeaderInfoBean.getTitle());
        android.widget.TextView textView2 = this.copydefault.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        C55307xhV.AEQbTJ(textView2, transactionTopHeaderInfoBean.getTitleSecondaryLine());
        if (transactionTopHeaderInfoBean.getTitleIcon() != null) {
            if (transactionTopHeaderInfoBean.getTitleSecondaryLine().length() > 0) {
                this.copydefault.valueOf.setMaxLines(1);
                this.copydefault.copydefault.setVisibility(0);
                Glide.KWHzl(this).KWHzl(transactionTopHeaderInfoBean.getTitleIcon()).EZpvd(this.copydefault.copydefault);
                if (transactionTopHeaderInfoBean.getTitleIconCallback() != null) {
                    android.widget.ImageView imageView = this.copydefault.copydefault;
                    imageView.setOnClickListener(new Activity(imageView, 1000L, transactionTopHeaderInfoBean));
                }
                this.copydefault.OLrzqt.setVisibility(8);
            } else {
                this.copydefault.OLrzqt.setVisibility(0);
                Glide.KWHzl(this).KWHzl(transactionTopHeaderInfoBean.getTitleIcon()).EZpvd(this.copydefault.OLrzqt);
                if (transactionTopHeaderInfoBean.getTitleIconCallback() != null) {
                    android.widget.ImageView imageView2 = this.copydefault.OLrzqt;
                    imageView2.setOnClickListener(new ActionBar(imageView2, 1000L, transactionTopHeaderInfoBean));
                }
            }
        } else {
            this.copydefault.OLrzqt.setVisibility(8);
            this.copydefault.OLrzqt.setOnClickListener(null);
        }
        android.widget.TextView textView3 = this.copydefault.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        C55307xhV.AEQbTJ(textView3, transactionTopHeaderInfoBean.getSubTitle());
        android.widget.TextView textView4 = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        C55307xhV.AEQbTJ(textView4, transactionTopHeaderInfoBean.getSubChildTitle());
    }

    public final void setHeaderTitleInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55307xhV.AEQbTJ(OLrzqt(), str);
    }

    public final void setSubTitleInfo(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        C55307xhV.AEQbTJ(EZpvd(), charSequence);
    }

    public final void setSubChildTitleInfo(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        C55307xhV.AEQbTJ(KWHzl(), charSequence);
    }

    /* JADX INFO: renamed from: o.yiL$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ TransactionTopHeaderInfoBean EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, TransactionTopHeaderInfoBean transactionTopHeaderInfoBean) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = transactionTopHeaderInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0<Unit> titleIconCallback = this.EZpvd.getTitleIconCallback();
                Intrinsics.copydefault(titleIconCallback);
                titleIconCallback.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.yiL$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ TransactionTopHeaderInfoBean EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, TransactionTopHeaderInfoBean transactionTopHeaderInfoBean) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = transactionTopHeaderInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0<Unit> titleIconCallback = this.EZpvd.getTitleIconCallback();
                Intrinsics.copydefault(titleIconCallback);
                titleIconCallback.invoke();
            }
        }
    }
}
