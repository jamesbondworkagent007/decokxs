package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.tradingbot.impl.dto.ArbFundingFeeVo;
import com.okinc.tradingbot.impl.dto.FundingFeeIncomeResponse;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wON extends AbstractC59533zio<FundingFeeIncomeResponse, Activity> {
    public final Function2<java.lang.Long, Function1<? super java.lang.Long, ? extends android.os.CountDownTimer>, Unit> AEQbTJ;
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends android.os.CountDownTimer>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public wON(@NotNull java.lang.String str, @NotNull Function2<? super java.lang.Long, ? super Function1<? super java.lang.Long, ? extends android.os.CountDownTimer>, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = str;
        this.AEQbTJ = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uMC umcOLrzqt = uMC.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(umcOLrzqt, "");
        return new Activity(this, umcOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull FundingFeeIncomeResponse fundingFeeIncomeResponse) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(fundingFeeIncomeResponse, "");
        uMC umcOLrzqt = activity.OLrzqt();
        umcOLrzqt.AEQbTJ.setText(pTA.formatDate$default(new Date(C33129mqd.valueOf(fundingFeeIncomeResponse.AEQbTJ())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null));
        android.widget.TextView textView = umcOLrzqt.KWHzl;
        textView.setText(C56033xvF.copydefault(fundingFeeIncomeResponse.KWHzl(), this.EZpvd, (88 & 4) != 0 ? false : true, (88 & 8) != 0 ? null : "3", (88 & 16) != 0 ? false : false, (88 & 32) == 0, (88 & 64) == 0 ? 2 : null));
        textView.setTextColor(C56033xvF.OLrzqt((java.lang.Object) fundingFeeIncomeResponse.KWHzl()));
        Ref.IntRef intRef = new Ref.IntRef();
        RecyclerView recyclerView = umcOLrzqt.EZpvd;
        recyclerView.setTag(java.lang.Boolean.FALSE);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        C59534zip c59534zip = new C59534zip();
        recyclerView.setAdapter(c59534zip);
        c59534zip.register(ArbFundingFeeVo.class, new wOK(this.EZpvd, this.AEQbTJ));
        C33064mpR.OLrzqt(c59534zip, fundingFeeIncomeResponse.EZpvd());
        umcOLrzqt.EZpvd.measure(-1, -2);
        intRef.element = umcOLrzqt.EZpvd.getMeasuredHeight();
        LinearLayoutCompat linearLayoutCompat = umcOLrzqt.AYXKKw;
        linearLayoutCompat.setOnClickListener(new TaskDescription(linearLayoutCompat, 300L, umcOLrzqt, intRef));
        if (activity.getAbsoluteAdapterPosition() == 0) {
            umcOLrzqt.AYXKKw.performClick();
        }
    }

    public static final class Application implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ uMC OLrzqt;
        public final /* synthetic */ Ref.IntRef copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(uMC umc, Ref.IntRef intRef) {
            this.OLrzqt = umc;
            this.copydefault = intRef;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            java.lang.Float f = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
            if (f != null) {
                float fFloatValue = f.floatValue();
                this.OLrzqt.OLrzqt.setRotation(180 * fFloatValue);
                this.OLrzqt.EZpvd.getLayoutParams().height = C56548yJl.copydefault(C33129mqd.AhwBna(java.lang.Float.valueOf(fFloatValue * this.copydefault.element)), 1);
                this.OLrzqt.EZpvd.requestLayout();
            }
        }
    }

    public static final class StateListAnimator implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ Ref.IntRef AEQbTJ;
        public final /* synthetic */ uMC KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(uMC umc, Ref.IntRef intRef) {
            this.KWHzl = umc;
            this.AEQbTJ = intRef;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            java.lang.Float f = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
            if (f != null) {
                float fFloatValue = 1 - f.floatValue();
                this.KWHzl.OLrzqt.setRotation(180 * fFloatValue);
                this.KWHzl.EZpvd.getLayoutParams().height = C56548yJl.copydefault(C33129mqd.AhwBna(java.lang.Float.valueOf(fFloatValue * this.AEQbTJ.element)), 1);
                this.KWHzl.EZpvd.requestLayout();
            }
        }
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ wON EZpvd;
        public final uMC OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uMC OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull wON won, uMC umc) {
            super(umc.getRoot());
            Intrinsics.checkNotNullParameter(umc, "");
            this.EZpvd = won;
            this.OLrzqt = umc;
        }
    }

    public static final class ActionBar implements Animator.AnimatorListener {
        public final /* synthetic */ uMC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public ActionBar(uMC umc) {
            this.copydefault = umc;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            RecyclerView recyclerView = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(8);
        }
    }

    public static final class LoaderManager implements Animator.AnimatorListener {
        public final /* synthetic */ uMC EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public LoaderManager(uMC umc) {
            this.EZpvd = umc;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            RecyclerView recyclerView = this.EZpvd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(0);
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Ref.IntRef KWHzl;
        public final /* synthetic */ uMC OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, uMC umc, Ref.IntRef intRef) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = umc;
            this.KWHzl = intRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                java.lang.Object tag = this.OLrzqt.EZpvd.getTag();
                java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
                if (bool != null) {
                    boolean z = !bool.booleanValue();
                    this.OLrzqt.EZpvd.setTag(java.lang.Boolean.valueOf(z));
                    android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                    if (z) {
                        Intrinsics.copydefault(valueAnimatorOfFloat);
                        valueAnimatorOfFloat.addListener(new LoaderManager(this.OLrzqt));
                        valueAnimatorOfFloat.addUpdateListener(new Application(this.OLrzqt, this.KWHzl));
                    } else {
                        valueAnimatorOfFloat.addUpdateListener(new StateListAnimator(this.OLrzqt, this.KWHzl));
                        Intrinsics.copydefault(valueAnimatorOfFloat);
                        valueAnimatorOfFloat.addListener(new ActionBar(this.OLrzqt));
                    }
                    valueAnimatorOfFloat.start();
                }
            }
        }
    }
}
