package com.okinc.business.defi.assets.coinmanagement;

import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC12782ctV;
import o.ActivityC9955bfO;
import o.C18012faP;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class SelectCoinActivity$initAppbarIcon$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC9955bfO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCoinActivity$initAppbarIcon$1$1(ActivityC9955bfO activityC9955bfO, Continuation<? super SelectCoinActivity$initAppbarIcon$1$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC9955bfO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectCoinActivity$initAppbarIcon$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectCoinActivity$initAppbarIcon$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            SelectCoinActivity$initAppbarIcon$1$1$wallet$1 selectCoinActivity$initAppbarIcon$1$1$wallet$1 = new SelectCoinActivity$initAppbarIcon$1$1$wallet$1(null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, selectCoinActivity$initAppbarIcon$1$1$wallet$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C18012faP c18012faPAEQbTJ = C18012faP.Companion.AEQbTJ();
        c18012faPAEQbTJ.AEQbTJ(new Activity(this.this$0, c18012faPAEQbTJ));
        FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c18012faPAEQbTJ.copydefault(supportFragmentManager, "ChooseNetworkDialogFragment", (AbstractC12782ctV) obj, (32 & 8) != 0 ? Long.MIN_VALUE : this.this$0.AEQbTJ, (32 & 16) != 0 ? true : true, (32 & 32) != 0);
        return Unit.INSTANCE;
    }

    public static final class Activity implements Function2<C18012faP.ActionBar, Integer, Unit> {
        public final /* synthetic */ C18012faP AEQbTJ;
        public final /* synthetic */ ActivityC9955bfO OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ActivityC9955bfO activityC9955bfO, C18012faP c18012faP) {
            this.OLrzqt = activityC9955bfO;
            this.AEQbTJ = c18012faP;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(C18012faP.ActionBar actionBar, Integer num) {
            EZpvd(actionBar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(C18012faP.ActionBar actionBar, int i) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            this.OLrzqt.copydefault(actionBar);
            this.AEQbTJ.dismissAllowingStateLoss();
        }
    }
}
