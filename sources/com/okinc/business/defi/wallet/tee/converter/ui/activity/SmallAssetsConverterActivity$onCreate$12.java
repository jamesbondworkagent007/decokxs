package com.okinc.business.defi.wallet.tee.converter.ui.activity;

import android.app.Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC17837fUc;
import o.C16434ejp;
import o.C56391yDq;
import o.C56442yFn;
import o.fTY;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterActivity$onCreate$12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17837fUc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterActivity$onCreate$12(ActivityC17837fUc activityC17837fUc, Continuation<? super SmallAssetsConverterActivity$onCreate$12> continuation) {
        super(2, continuation);
        this.this$0 = activityC17837fUc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmallAssetsConverterActivity$onCreate$12(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmallAssetsConverterActivity$onCreate$12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$onCreate$12$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<fTY, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC17837fUc this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17837fUc activityC17837fUc, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17837fUc;
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
        public final Object invoke(fTY fty, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(fty, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                fTY fty = (fTY) this.L$0;
                if ((!fty.KWHzl().isEmpty()) || (!fty.OLrzqt().isEmpty())) {
                    C16434ejp c16434ejp = this.this$0.valueOf;
                    if (c16434ejp == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp = null;
                    }
                    c16434ejp.isConnected.setVisibility(8);
                    C16434ejp c16434ejp2 = this.this$0.valueOf;
                    if (c16434ejp2 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp2 = null;
                    }
                    c16434ejp2.fetchVPNInfo.setVisibility(0);
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                }
                this.this$0.copydefault(fty);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<fTY> stateFlowIsConnected = this.this$0.AYXKKw().isConnected();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowIsConnected, anonymousClass1, this) == objCopydefault) {
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
