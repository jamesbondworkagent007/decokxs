package com.okinc.business.defi.wallet.tee.activate.ui;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC17792fSl;
import o.C13754dXa;
import o.C56391yDq;
import o.C56442yFn;
import o.fTR;
import o.wXX;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivateSAActivity$initSingleClick$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17792fSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAActivity$initSingleClick$1$1(ActivityC17792fSl activityC17792fSl, Continuation<? super ActivateSAActivity$initSingleClick$1$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC17792fSl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAActivity$initSingleClick$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAActivity$initSingleClick$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC17792fSl activityC17792fSl = this.this$0;
            ActivateSAViewModel activateSAViewModelAEQbTJ = activityC17792fSl.AEQbTJ();
            this.label = 1;
            obj = activityC17792fSl.copydefault(activateSAViewModelAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        ActivityC17792fSl activityC17792fSl2 = this.this$0;
        ActivateSAViewModel.Application application = (ActivateSAViewModel.Application) obj;
        fTR ftrCopydefault = fTR.Companion.copydefault(C13754dXa.FragmentManager.isInitInProgress, C13754dXa.FragmentManager.DXXBbs, C13754dXa.FragmentManager.hfFNez, new ArrayList<>(application.AEQbTJ()), application.EZpvd(), application.copydefault(), new Activity(activityC17792fSl2));
        FragmentManager supportFragmentManager = activityC17792fSl2.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        ftrCopydefault.show(supportFragmentManager);
        return Unit.INSTANCE;
    }

    public static final class Activity implements yHO<Integer, Boolean, wXX, Unit> {
        public final /* synthetic */ ActivityC17792fSl KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ActivityC17792fSl activityC17792fSl) {
            this.KWHzl = activityC17792fSl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(Integer num, Boolean bool, wXX wxx) {
            KWHzl(num.intValue(), bool.booleanValue(), wxx);
            return Unit.INSTANCE;
        }

        public final void KWHzl(int i, boolean z, wXX wxx) {
            Intrinsics.checkNotNullParameter(wxx, "");
            this.KWHzl.AEQbTJ().AEQbTJ(i, z);
            wxx.dismissAllowingStateLoss();
        }
    }
}
