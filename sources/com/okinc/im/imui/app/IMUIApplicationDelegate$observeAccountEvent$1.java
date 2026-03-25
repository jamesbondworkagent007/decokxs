package com.okinc.im.imui.app;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.okinc.okimcore.model.remote.UserInfo;
import com.okinc.okuser.data.User;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC47263tmj;
import o.C33069mpW;
import o.C33070mpX;
import o.C35397nua;
import o.C35399nuc;
import o.C43251rlk;
import o.C54819xWm;
import o.C55284xgz;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.InterfaceC44177sGd;
import o.sHZ;

/* JADX INFO: loaded from: classes8.dex */
public final class IMUIApplicationDelegate$observeAccountEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35397nua this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMUIApplicationDelegate$observeAccountEvent$1(C35397nua c35397nua, Continuation<? super IMUIApplicationDelegate$observeAccountEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = c35397nua;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IMUIApplicationDelegate$observeAccountEvent$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IMUIApplicationDelegate$observeAccountEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.app.IMUIApplicationDelegate$observeAccountEvent$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC47263tmj, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C35397nua this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C35397nua c35397nua, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c35397nua;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC47263tmj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            sHZ shzAEQbTJ;
            InterfaceC44177sGd interfaceC44177sGdAEQbTJ;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC47263tmj abstractC47263tmj = (AbstractC47263tmj) this.L$0;
                if ((abstractC47263tmj instanceof AbstractC47263tmj.ActionBar) || (abstractC47263tmj instanceof AbstractC47263tmj.StateListAnimator)) {
                    InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                    if (interfaceC35180nqU != null && (shzAEQbTJ = interfaceC35180nqU.AEQbTJ()) != null && (interfaceC44177sGdAEQbTJ = shzAEQbTJ.AEQbTJ()) != null) {
                        this.label = 1;
                        obj = interfaceC44177sGdAEQbTJ.KWHzl(false, (Continuation<? super UserInfo>) this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    if (this.this$0.dNCPSb().isConnected()) {
                        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                        String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.extraCallback);
                        User userOLrzqt = this.this$0.dNCPSb().OLrzqt();
                        String username = userOLrzqt != null ? userOLrzqt.getUsername() : null;
                        if (username == null) {
                            username = "";
                        }
                        String strOLrzqt = C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", username)));
                        if (activityAEQbTJ != null) {
                            C55284xgz.Activity activity = C55284xgz.Companion;
                            View decorView = activityAEQbTJ.getWindow().getDecorView();
                            Intrinsics.copydefault(decorView, "");
                            C55284xgz c55284xgzKWHzl = activity.KWHzl((ViewGroup) decorView, strOLrzqt);
                            if (c55284xgzKWHzl != null) {
                                c55284xgzKWHzl.isConnected(0);
                                c55284xgzKWHzl.AEQbTJ(strOLrzqt);
                                c55284xgzKWHzl.hDKMBd();
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (!Intrinsics.EZpvd(abstractC47263tmj, AbstractC47263tmj.Activity.OLrzqt)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.dNCPSb().isConnected()) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<AbstractC47263tmj> flowFIwbmz = this.this$0.dNCPSb().fIwbmz();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFIwbmz, anonymousClass1, this) == objCopydefault) {
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
