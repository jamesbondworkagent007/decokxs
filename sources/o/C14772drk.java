package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.drk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14772drk extends ConstraintLayout {
    public final AbstractC16934etL AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14772drk(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14772drk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.drk.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C14772drk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14772drk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C13754dXa.TaskDescription.RWIpjU, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC16934etL abstractC16934etL = (AbstractC16934etL) viewDataBindingInflate;
        this.AEQbTJ = abstractC16934etL;
        AppCompatTextView appCompatTextView = abstractC16934etL.EZpvd;
        appCompatTextView.setOnClickListener(new TaskDescription(appCompatTextView, 1000L, this));
        AppCompatImageView appCompatImageView = abstractC16934etL.KWHzl;
        appCompatImageView.setOnClickListener(new StateListAnimator(appCompatImageView, 1000L, this));
    }

    public final void setData(java.lang.String str, boolean z) {
        java.lang.String priceChangePercentage$default = (str == null || str.length() == 0) ? "--" : C54873xYm.formatPriceChangePercentage$default(C33129mqd.copydefault(str), 0, 0, false, null, null, 31, null);
        AppCompatTextView appCompatTextView = this.AEQbTJ.AEQbTJ;
        android.content.Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        appCompatTextView.setTextColor(C14773drl.getPnlTextColor$default(str, context, null, 2, null));
        if (z) {
            priceChangePercentage$default = C13821dZn.EZpvd.KWHzl(priceChangePercentage$default);
        }
        appCompatTextView.setText(priceChangePercentage$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.UUsvzU);
        viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.aLnfMH);
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.zeUJxr, new View.OnClickListener() { // from class: o.drm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14772drk.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.drk$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C14772drk EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C14772drk c14772drk) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c14772drk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.drk$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C14772drk OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C14772drk c14772drk) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c14772drk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.KWHzl();
            }
        }
    }
}
