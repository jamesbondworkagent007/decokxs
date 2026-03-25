package com.okinc.business.defi.wallet.home.addressDetail.ui;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C13754dXa;
import o.C15852eXr;
import o.C16601emx;
import o.C33064mpR;
import o.C33070mpX;
import o.C55326xho;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.eWR;
import o.eWS;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletPnlTokenFragment$initViewData$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15852eXr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletPnlTokenFragment$initViewData$8(C15852eXr c15852eXr, Continuation<? super DefiWalletPnlTokenFragment$initViewData$8> continuation) {
        super(2, continuation);
        this.this$0 = c15852eXr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletPnlTokenFragment$initViewData$8(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletPnlTokenFragment$initViewData$8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$initViewData$8$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$initViewData$8$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02751 extends SuspendLambda implements Function2<List<? extends eWR>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C15852eXr this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02751(C15852eXr c15852eXr, Continuation<? super C02751> continuation) {
                super(2, continuation);
                this.this$0 = c15852eXr;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02751 c02751 = new C02751(this.this$0, continuation);
                c02751.L$0 = obj;
                return c02751;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends eWR> list, Continuation<? super Unit> continuation) {
                return invoke2((List<eWR>) list, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<eWR> list, Continuation<? super Unit> continuation) {
                return ((C02751) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List<eWR> list = (List) this.L$0;
                    C16601emx c16601emx = this.this$0.gEmmrt;
                    if (c16601emx == null) {
                        Intrinsics.gEmmrt("");
                        c16601emx = null;
                    }
                    c16601emx.copydefault.AEQbTJ();
                    C16601emx c16601emx2 = this.this$0.gEmmrt;
                    if (c16601emx2 == null) {
                        Intrinsics.gEmmrt("");
                        c16601emx2 = null;
                    }
                    c16601emx2.copydefault.valueOf();
                    if (list == null) {
                        pUU.copydefault(this.this$0.getTAG(), "tokenList is null");
                        C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.registerCallbackMessenger), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    } else if (!list.isEmpty()) {
                        eWS ewsAEQbTJ = this.this$0.isConnected().AEQbTJ(this.this$0.AYXKKw);
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                        for (eWR ewr : list) {
                            ewr.KWHzl(ewsAEQbTJ != null ? ewsAEQbTJ.AEQbTJ() : null);
                            arrayList.add(ewr);
                        }
                        C33064mpR.AEQbTJ(this.this$0.KWHzl, arrayList);
                    } else {
                        pUU.copydefault(this.this$0.getTAG(), "tokenList is empty");
                    }
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
                SharedFlow<List<eWR>> sharedFlowOLrzqt = this.this$0.AEQbTJ().OLrzqt();
                C02751 c02751 = new C02751(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowOLrzqt, c02751, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15852eXr c15852eXr = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c15852eXr, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c15852eXr, state, anonymousClass1, this) == objCopydefault) {
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
