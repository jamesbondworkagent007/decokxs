package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment;
import com.okinc.okex.rating.viewmodel.RatingSubmitViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class syO extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm EZpvd;
    public AbstractC47385toz KWHzl;

    public static final class Activity implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ syO AEQbTJ;
        public final /* synthetic */ android.widget.LinearLayout EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ int OLrzqt;

        public Activity(android.view.View view, syO syo, int i, android.widget.LinearLayout linearLayout) {
            this.KWHzl = view;
            this.AEQbTJ = syo;
            this.OLrzqt = i;
            this.EZpvd = linearLayout;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.KWHzl.isLaidOut()) {
                this.KWHzl.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                android.content.res.Resources resources = this.AEQbTJ.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                int iEZpvd = yII.EZpvd(((double) C55302xhQ.AEQbTJ(resources)) * 0.75d);
                C44760scx.log$default("expandBottomSheet-targetHeight: " + iEZpvd, null, 2, null);
                android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(this.OLrzqt, iEZpvd);
                valueAnimatorOfInt.addUpdateListener(new Application(this.EZpvd));
                Intrinsics.copydefault(valueAnimatorOfInt);
                valueAnimatorOfInt.addListener(new ActionBar(this.EZpvd));
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.start();
            }
        }
    }

    public syO() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RatingSubmitViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.rating.ui.submit.RatingSubmitBottomSheetFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.rating.ui.submit.RatingSubmitBottomSheetFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.rating.ui.submit.RatingSubmitBottomSheetFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.syO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final syO OLrzqt() {
            return new syO();
        }
    }

    private final RatingSubmitViewModel AEQbTJ() {
        return (RatingSubmitViewModel) this.EZpvd.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
        wxq.setCloseVisibility(true);
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = AbstractC47385toz.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(C47315tni.TaskDescription.QVAiDq, RatingSubmitContentFragment.Companion.KWHzl("KEY_ID_SUBMIT_FRAGMENT"));
        fragmentTransactionBeginTransaction.replace(C47315tni.TaskDescription.QbewEr, C45829syv.Companion.copydefault());
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        constraintLayout.post(new java.lang.Runnable() { // from class: o.syP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                syO.KWHzl(this.EZpvd);
            }
        });
        getChildFragmentManager().setFragmentResultListener("KEY_ID_SUBMIT_FRAGMENT", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.syT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                syO.copydefault(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void KWHzl(syO syo) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) syo, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void copydefault(syO syo, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        RatingSubmitContentFragment.Event eventOLrzqt = RatingSubmitContentFragment.Event.Companion.OLrzqt(bundle);
        if ((eventOLrzqt instanceof RatingSubmitContentFragment.Event.UpdateStarRating) || (eventOLrzqt instanceof RatingSubmitContentFragment.Event.UpdateLabel)) {
            syo.OLrzqt();
        } else if (eventOLrzqt instanceof RatingSubmitContentFragment.Event.Complete) {
            syo.dismissAllowingStateLoss();
        }
    }

    public static final class ActionBar implements Animator.AnimatorListener {
        public final /* synthetic */ android.widget.LinearLayout AEQbTJ;

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

        public ActionBar(android.widget.LinearLayout linearLayout) {
            this.AEQbTJ = linearLayout;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            android.widget.LinearLayout linearLayout = this.AEQbTJ;
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -2;
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    public final void OLrzqt() {
        AbstractC47385toz abstractC47385toz;
        android.widget.LinearLayout linearLayout;
        if (!AEQbTJ().fetchVPNInfo() || (abstractC47385toz = this.KWHzl) == null || (linearLayout = abstractC47385toz.KWHzl) == null) {
            return;
        }
        int iEZpvd = EZpvd(linearLayout);
        C44760scx.log$default("expandBottomSheet-currentHeight: " + iEZpvd, null, 2, null);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iEZpvd;
            linearLayout.setLayoutParams(layoutParams);
            AEQbTJ().KWHzl(false);
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new Activity(linearLayout, this, iEZpvd, linearLayout));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final class Application implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ android.widget.LinearLayout AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.widget.LinearLayout linearLayout) {
            this.AEQbTJ = linearLayout;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.copydefault(animatedValue, "");
            int iIntValue = ((java.lang.Integer) animatedValue).intValue();
            android.widget.LinearLayout linearLayout = this.AEQbTJ;
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iIntValue;
                linearLayout.setLayoutParams(layoutParams);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final int EZpvd(android.view.View view) {
        view.measure(0, 0);
        return view.getMeasuredHeight();
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ syO OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, syO syo) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = syo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
