package com.okinc.business.defi.wallet.home.addressDetail.ui;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C15852eXr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C59534zip;
import o.eWR;
import o.eWS;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletPnlTokenFragment$initViewData$10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15852eXr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletPnlTokenFragment$initViewData$10(C15852eXr c15852eXr, Continuation<? super DefiWalletPnlTokenFragment$initViewData$10> continuation) {
        super(2, continuation);
        this.this$0 = c15852eXr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletPnlTokenFragment$initViewData$10(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletPnlTokenFragment$initViewData$10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$initViewData$10$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<eWS, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C15852eXr this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15852eXr c15852eXr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15852eXr;
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
        public final Object invoke(eWS ews, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(ews, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                eWS ews = (eWS) this.L$0;
                if (this.this$0.DbNXlk != 1) {
                    return Unit.INSTANCE;
                }
                C59534zip c59534zip = this.this$0.KWHzl;
                List<?> items = c59534zip.getItems();
                Intrinsics.checkNotNullExpressionValue(items, "");
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(items, 10));
                for (Object obj2 : items) {
                    if (obj2 instanceof eWR) {
                        ((eWR) obj2).KWHzl(ews.AEQbTJ());
                    }
                    arrayList.add(obj2);
                }
                c59534zip.setItems(arrayList);
                c59534zip.notifyDataSetChanged();
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
            StateFlow<eWS> stateFlowGEmmrt = this.this$0.isConnected().gEmmrt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowGEmmrt, anonymousClass1, this) == objCopydefault) {
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
