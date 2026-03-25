package com.okinc.oklive.app.ui.list.fragment;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$observeUiState$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33546myW;
import o.C44573sUy;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.rVN;
import o.sUN;
import o.sWg;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamListFragment$observeUiState$2 extends SuspendLambda implements Function2<sUN.TaskDescription, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44573sUy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListFragment$observeUiState$2(C44573sUy c44573sUy, Continuation<? super LivestreamListFragment$observeUiState$2> continuation) {
        super(2, continuation);
        this.this$0 = c44573sUy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LivestreamListFragment$observeUiState$2 livestreamListFragment$observeUiState$2 = new LivestreamListFragment$observeUiState$2(this.this$0, continuation);
        livestreamListFragment$observeUiState$2.L$0 = obj;
        return livestreamListFragment$observeUiState$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(sUN.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        return ((LivestreamListFragment$observeUiState$2) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sWg swgAEQbTJ;
        RecyclerView recyclerView;
        C33546myW c33546myW;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            sUN.TaskDescription taskDescription = (sUN.TaskDescription) this.L$0;
            this.this$0.AEQbTJ(taskDescription);
            if (taskDescription instanceof sUN.TaskDescription.Activity) {
                return Unit.INSTANCE;
            }
            sWg swgAEQbTJ2 = this.this$0.AEQbTJ();
            if (swgAEQbTJ2 != null && (c33546myW = swgAEQbTJ2.AYXKKw) != null) {
                c33546myW.AEQbTJ();
            }
            if (this.this$0.valueOf && (taskDescription instanceof sUN.TaskDescription.FragmentManager) && (swgAEQbTJ = this.this$0.AEQbTJ()) != null && (recyclerView = swgAEQbTJ.EZpvd) != null) {
                final C44573sUy c44573sUy = this.this$0;
                C56443yFo.KWHzl(recyclerView.post(new Runnable() { // from class: o.sUO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        LivestreamListFragment$observeUiState$2.invokeSuspend$lambda$0(c44573sUy);
                    }
                }));
            }
            if (!this.this$0.KWHzl && !this.this$0.valueOf) {
                this.this$0.KWHzl = true;
                if (taskDescription instanceof sUN.TaskDescription.FragmentManager) {
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else if (!(taskDescription instanceof sUN.TaskDescription.C0943TaskDescription) && !(taskDescription instanceof sUN.TaskDescription.StateListAnimator)) {
                    this.this$0.KWHzl = false;
                } else {
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                }
            }
            if (this.this$0.valueOf) {
                this.this$0.valueOf = false;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(C44573sUy c44573sUy) {
        RecyclerView recyclerView;
        c44573sUy.copydefault();
        sWg swgAEQbTJ = c44573sUy.AEQbTJ();
        if (swgAEQbTJ == null || (recyclerView = swgAEQbTJ.EZpvd) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }
}
