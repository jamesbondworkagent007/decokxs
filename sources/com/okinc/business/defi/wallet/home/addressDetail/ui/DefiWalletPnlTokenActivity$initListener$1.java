package com.okinc.business.defi.wallet.home.addressDetail.ui;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.biz.net.bean.SupportPnlChainResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC16290ehD;
import o.ActivityC15848eXn;
import o.C13754dXa;
import o.C33070mpX;
import o.C43453rpa;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletPnlTokenActivity$initListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC15848eXn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletPnlTokenActivity$initListener$1(ActivityC15848eXn activityC15848eXn, Continuation<? super DefiWalletPnlTokenActivity$initListener$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC15848eXn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletPnlTokenActivity$initListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletPnlTokenActivity$initListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenActivity$initListener$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC15848eXn this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC15848eXn activityC15848eXn, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC15848eXn;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenActivity$initListener$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02701 extends SuspendLambda implements Function2<List<? extends SupportPnlChainResponse>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ActivityC15848eXn this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02701(ActivityC15848eXn activityC15848eXn, Continuation<? super C02701> continuation) {
                super(2, continuation);
                this.this$0 = activityC15848eXn;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02701 c02701 = new C02701(this.this$0, continuation);
                c02701.L$0 = obj;
                return c02701;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends SupportPnlChainResponse> list, Continuation<? super Unit> continuation) {
                return invoke2((List<SupportPnlChainResponse>) list, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<SupportPnlChainResponse> list, Continuation<? super Unit> continuation) {
                return ((C02701) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List list = (List) this.L$0;
                    if (list == null || list.isEmpty()) {
                        AbstractC16290ehD abstractC16290ehD = this.this$0.OLrzqt;
                        if (abstractC16290ehD != null) {
                            final ActivityC15848eXn activityC15848eXn = this.this$0;
                            C55173xeu c55173xeu = abstractC16290ehD.EZpvd;
                            c55173xeu.setVisibility(0);
                            c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKOmnske));
                            c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gGvvIC));
                            if (C43453rpa.AEQbTJ.KWHzl(activityC15848eXn)) {
                                c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.onViewAttachedToWindow));
                                c55173xeu.setEmptyTypeImage(9);
                            } else {
                                c55173xeu.setEmptyTypeImage(8);
                                c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.R));
                            }
                            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.eXm
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    ActivityC15848eXn.djBIcL(activityC15848eXn);
                                }
                            });
                            abstractC16290ehD.copydefault.setVisibility(8);
                            abstractC16290ehD.OLrzqt.setVisibility(8);
                        }
                        rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                    } else {
                        AbstractC16290ehD abstractC16290ehD2 = this.this$0.OLrzqt;
                        if (abstractC16290ehD2 != null) {
                            abstractC16290ehD2.EZpvd.setVisibility(8);
                            abstractC16290ehD2.copydefault.setVisibility(0);
                            abstractC16290ehD2.OLrzqt.setVisibility(0);
                        }
                        ActivityC15848eXn activityC15848eXn2 = this.this$0;
                        AbstractC16290ehD abstractC16290ehD3 = activityC15848eXn2.OLrzqt;
                        if (abstractC16290ehD3 == null) {
                            return Unit.INSTANCE;
                        }
                        activityC15848eXn2.KWHzl(abstractC16290ehD3, list);
                        rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    }
                    this.this$0.AhwBna();
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
                SharedFlow<List<SupportPnlChainResponse>> sharedFlowAhwBna = this.this$0.djBIcL().AhwBna();
                C02701 c02701 = new C02701(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowAhwBna, c02701, this) == objCopydefault) {
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
            ActivityC15848eXn activityC15848eXn = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC15848eXn, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC15848eXn, state, anonymousClass1, this) == objCopydefault) {
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
