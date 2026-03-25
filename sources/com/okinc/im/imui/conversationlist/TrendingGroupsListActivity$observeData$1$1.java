package com.okinc.im.imui.conversationlist;

import android.app.Activity;
import android.view.View;
import android.widget.Checkable;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.im.imui.conversationlist.viewmodel.TrendingGroupListViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C52794wYp;
import o.C55173xeu;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.nIZ;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class TrendingGroupsListActivity$observeData$1$1 extends SuspendLambda implements yHO<CoroutineScope, TrendingGroupListViewModel.ActionBar, Continuation<? super Unit>, Object> {
    final /* synthetic */ TrendingGroupListViewModel $this_with;
    int label;
    final /* synthetic */ TrendingGroupsListActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendingGroupsListActivity$observeData$1$1(TrendingGroupsListActivity trendingGroupsListActivity, TrendingGroupListViewModel trendingGroupListViewModel, Continuation<? super TrendingGroupsListActivity$observeData$1$1> continuation) {
        super(3, continuation);
        this.this$0 = trendingGroupsListActivity;
        this.$this_with = trendingGroupListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, TrendingGroupListViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
        return new TrendingGroupsListActivity$observeData$1$1(this.this$0, this.$this_with, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            nIZ niz = this.this$0.djBIcL;
            if (niz == null) {
                Intrinsics.gEmmrt("");
                niz = null;
            }
            TrendingGroupListViewModel trendingGroupListViewModel = this.$this_with;
            TrendingGroupsListActivity trendingGroupsListActivity = this.this$0;
            TrendingGroupListViewModel.ActionBar value = trendingGroupListViewModel.KWHzl().getValue();
            if (Intrinsics.EZpvd(value, TrendingGroupListViewModel.ActionBar.Application.EZpvd)) {
                RecyclerView recyclerView = niz.copydefault;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                recyclerView.setVisibility(0);
                LottieAnimationView lottieAnimationView = niz.EZpvd;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
                lottieAnimationView.setVisibility(8);
                niz.EZpvd.pauseAnimation();
                C55173xeu c55173xeu = niz.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(8);
                rVN.reportFullyDrawn$default((Activity) trendingGroupsListActivity, true, (String) null, 2, (Object) null);
            } else if (Intrinsics.EZpvd(value, TrendingGroupListViewModel.ActionBar.C0410ActionBar.KWHzl)) {
                RecyclerView recyclerView2 = niz.copydefault;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                recyclerView2.setVisibility(8);
                LottieAnimationView lottieAnimationView2 = niz.EZpvd;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
                lottieAnimationView2.setVisibility(8);
                niz.EZpvd.pauseAnimation();
                C55173xeu c55173xeu2 = niz.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                c55173xeu2.setVisibility(0);
                C52794wYp c52794wYpAEQbTJ = niz.OLrzqt.AEQbTJ();
                c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, trendingGroupsListActivity));
                rVN.reportFullyDrawn$default((Activity) trendingGroupsListActivity, false, (String) null, 2, (Object) null);
            } else {
                if (!Intrinsics.EZpvd(value, TrendingGroupListViewModel.ActionBar.Activity.OLrzqt)) {
                    throw new NoWhenBranchMatchedException();
                }
                RecyclerView recyclerView3 = niz.copydefault;
                Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                recyclerView3.setVisibility(8);
                LottieAnimationView lottieAnimationView3 = niz.EZpvd;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView3, "");
                lottieAnimationView3.setVisibility(0);
                niz.EZpvd.playAnimation();
                C55173xeu c55173xeu3 = niz.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                c55173xeu3.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ TrendingGroupsListActivity AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, TrendingGroupsListActivity trendingGroupsListActivity) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = trendingGroupsListActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.AYXKKw();
            }
        }
    }
}
