package com.okinc.business.defi.wallet.tee.review.ui;

import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$2;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC16363eiX;
import o.C13754dXa;
import o.C52761wXj;
import o.C55296xhK;
import o.C56123xwq;
import o.C56391yDq;
import o.C56442yFn;
import o.fTR;
import o.fVU;
import o.fWG;
import o.wXX;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class ReNewEnableActivity$observeViewModelState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fVU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableActivity$observeViewModelState$2(fVU fvu, Continuation<? super ReNewEnableActivity$observeViewModelState$2> continuation) {
        super(2, continuation);
        this.this$0 = fvu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReNewEnableActivity$observeViewModelState$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableActivity$observeViewModelState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ fVU this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fVU fvu, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fvu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$2$1$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ fVU KWHzl;
            public final /* synthetic */ View OLrzqt;
            public final /* synthetic */ ReNewEnableViewModel.StateListAnimator copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(View view, long j, fVU fvu, ReNewEnableViewModel.StateListAnimator stateListAnimator) {
                this.OLrzqt = view;
                this.EZpvd = j;
                this.KWHzl = fvu;
                this.copydefault = stateListAnimator;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    Integer value = this.KWHzl.gEmmrt().AkhnZx().getValue();
                    if (value != null && value.intValue() == 0) {
                        fWG fwgCopydefault = fWG.Companion.copydefault();
                        FragmentTransaction fragmentTransactionBeginTransaction = this.KWHzl.getSupportFragmentManager().beginTransaction();
                        fragmentTransactionBeginTransaction.setCustomAnimations(C52761wXj.Application.isConnected, C52761wXj.Application.values, C52761wXj.Application.DbNXlk, C52761wXj.Application.AuCTel);
                        fragmentTransactionBeginTransaction.add(C13754dXa.ActionBar.gCNefq, fwgCopydefault, "upgrade_fragment_tag");
                        fragmentTransactionBeginTransaction.addToBackStack(null);
                        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                        return;
                    }
                    fTR.TaskDescription taskDescription = fTR.Companion;
                    int i = C13754dXa.FragmentManager.isScanInProgress;
                    int i2 = C13754dXa.FragmentManager.gqESXP;
                    int i3 = C13754dXa.FragmentManager.sVaiLC;
                    ArrayList<Integer> arrayList = new ArrayList<>(this.copydefault.KWHzl());
                    int iCopydefault = this.copydefault.copydefault();
                    Boolean bool = this.KWHzl.AYXKKw;
                    fTR ftrCopydefault = taskDescription.copydefault(i, i2, i3, arrayList, iCopydefault, bool != null ? bool.booleanValue() : this.copydefault.EZpvd(), new Application(this.KWHzl));
                    FragmentManager supportFragmentManager = this.KWHzl.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    ftrCopydefault.show(supportFragmentManager);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleOwner lifecycleOwner;
            TextView textView;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C56123xwq c56123xwq = C56123xwq.copydefault;
                StateFlow<ReNewEnableViewModel.StateListAnimator> stateFlowAYXKKw = this.this$0.gEmmrt().AYXKKw();
                AbstractC16363eiX abstractC16363eiX = this.this$0.gEmmrt;
                if (abstractC16363eiX == null || (textView = abstractC16363eiX.getFieldNames) == null || (lifecycleOwner = ViewTreeLifecycleOwner.get(textView)) == null) {
                    lifecycleOwner = this.this$0;
                }
                final fVU fvu = this.this$0;
                c56123xwq.OLrzqt(stateFlowAYXKKw, lifecycleOwner, new Function1() { // from class: o.fWg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ReNewEnableActivity$observeViewModelState$2.AnonymousClass1.invokeSuspend$lambda$2(fvu, (ReNewEnableViewModel.StateListAnimator) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(fVU fvu, ReNewEnableViewModel.StateListAnimator stateListAnimator) {
            ConstraintLayout constraintLayout;
            AbstractC16363eiX abstractC16363eiX = fvu.gEmmrt;
            if (abstractC16363eiX != null && (constraintLayout = abstractC16363eiX.ejfBZ) != null) {
                constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, fvu, stateListAnimator));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$2$1$Application */
        public static final class Application implements yHO<Integer, Boolean, wXX, Unit> {
            public final /* synthetic */ fVU copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(fVU fvu) {
                this.copydefault = fvu;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHO
            public /* synthetic */ Unit invoke(Integer num, Boolean bool, wXX wxx) {
                OLrzqt(num.intValue(), bool.booleanValue(), wxx);
                return Unit.INSTANCE;
            }

            public final void OLrzqt(int i, boolean z, wXX wxx) {
                Intrinsics.checkNotNullParameter(wxx, "");
                this.copydefault.AEQbTJ(i, z, wxx);
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
