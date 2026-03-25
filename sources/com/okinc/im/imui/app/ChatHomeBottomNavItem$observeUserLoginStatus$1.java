package com.okinc.im.imui.app;

import com.google.android.material.navigation.NavigationBarView;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC47263tmj;
import o.C35343ntY;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class ChatHomeBottomNavItem$observeUserLoginStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NavigationBarView $navigationBarView;
    int label;
    final /* synthetic */ C35343ntY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHomeBottomNavItem$observeUserLoginStatus$1(C35343ntY c35343ntY, NavigationBarView navigationBarView, Continuation<? super ChatHomeBottomNavItem$observeUserLoginStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = c35343ntY;
        this.$navigationBarView = navigationBarView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatHomeBottomNavItem$observeUserLoginStatus$1(this.this$0, this.$navigationBarView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatHomeBottomNavItem$observeUserLoginStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<AbstractC47263tmj> flowFIwbmz = C44157sFk.gEmmrt().fIwbmz();
            final C35343ntY c35343ntY = this.this$0;
            final NavigationBarView navigationBarView = this.$navigationBarView;
            FlowCollector<? super AbstractC47263tmj> flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.app.ChatHomeBottomNavItem$observeUserLoginStatus$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
                    if (abstractC47263tmj instanceof AbstractC47263tmj.Activity) {
                        pUU.EZpvd("ChatHomeBottomNavItem", "UserEvent: Logout");
                        Job job = c35343ntY.KWHzl;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        c35343ntY.KWHzl = null;
                    } else if (abstractC47263tmj instanceof AbstractC47263tmj.StateListAnimator) {
                        pUU.EZpvd("ChatHomeBottomNavItem", "UserEvent: Switched");
                        c35343ntY.OLrzqt(navigationBarView);
                    } else {
                        if (!(abstractC47263tmj instanceof AbstractC47263tmj.ActionBar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pUU.EZpvd("ChatHomeBottomNavItem", "UserEvent: Login");
                        c35343ntY.OLrzqt(navigationBarView);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowFIwbmz.collect(flowCollector, this) == objCopydefault) {
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
