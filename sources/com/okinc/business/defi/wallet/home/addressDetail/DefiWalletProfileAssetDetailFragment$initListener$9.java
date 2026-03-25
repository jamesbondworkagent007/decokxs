package com.okinc.business.defi.wallet.home.addressDetail;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC16600emw;
import o.C13754dXa;
import o.C33070mpX;
import o.C33546myW;
import o.C43453rpa;
import o.C55173xeu;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.eVR;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletProfileAssetDetailFragment$initListener$9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProfileAssetDetailFragment$initListener$9(eVR evr, Continuation<? super DefiWalletProfileAssetDetailFragment$initListener$9> continuation) {
        super(2, continuation);
        this.this$0 = evr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletProfileAssetDetailFragment$initListener$9(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletProfileAssetDetailFragment$initListener$9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$9$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ eVR this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eVR evr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = evr;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$9$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02691 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ eVR this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02691(eVR evr, Continuation<? super C02691> continuation) {
                super(2, continuation);
                this.this$0 = evr;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02691 c02691 = new C02691(this.this$0, continuation);
                c02691.Z$0 = ((Boolean) obj).booleanValue();
                return c02691;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((C02691) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C55173xeu c55173xeu;
                C55173xeu c55173xeu2;
                C33546myW c33546myW;
                C33546myW c33546myW2;
                C55173xeu c55173xeu3;
                C33546myW c33546myW3;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    boolean z = this.Z$0;
                    this.this$0.zLjUOn = z;
                    if (z) {
                        AbstractC16600emw abstractC16600emw = this.this$0.fetchVPNInfo;
                        if (abstractC16600emw != null && (c33546myW3 = abstractC16600emw.zsXlph) != null) {
                            c33546myW3.setVisibility(0);
                        }
                        AbstractC16600emw abstractC16600emw2 = this.this$0.fetchVPNInfo;
                        if (abstractC16600emw2 != null && (c55173xeu3 = abstractC16600emw2.AkhnZx) != null) {
                            c55173xeu3.setVisibility(8);
                        }
                    } else {
                        AbstractC16600emw abstractC16600emw3 = this.this$0.fetchVPNInfo;
                        if (abstractC16600emw3 != null && (c33546myW2 = abstractC16600emw3.zsXlph) != null) {
                            c33546myW2.AEQbTJ();
                        }
                        this.this$0.AYXKKw();
                        if (this.this$0.DbNXlk().AYXKKw() <= 1 && !this.this$0.ejfBZ) {
                            AbstractC16600emw abstractC16600emw4 = this.this$0.fetchVPNInfo;
                            if (abstractC16600emw4 != null && (c33546myW = abstractC16600emw4.zsXlph) != null) {
                                c33546myW.setVisibility(4);
                            }
                            AbstractC16600emw abstractC16600emw5 = this.this$0.fetchVPNInfo;
                            if (abstractC16600emw5 != null && (c55173xeu2 = abstractC16600emw5.AkhnZx) != null) {
                                c55173xeu2.setVisibility(0);
                            }
                            AbstractC16600emw abstractC16600emw6 = this.this$0.fetchVPNInfo;
                            if (abstractC16600emw6 != null && (c55173xeu = abstractC16600emw6.AkhnZx) != null) {
                                final eVR evr = this.this$0;
                                Context context = c55173xeu.getContext();
                                if (context != null) {
                                    c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKOmnske));
                                    c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gGvvIC));
                                    if (C43453rpa.AEQbTJ.KWHzl(context)) {
                                        c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.onViewAttachedToWindow));
                                        c55173xeu.setEmptyTypeImage(9);
                                    } else {
                                        c55173xeu.setEmptyTypeImage(8);
                                        c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.R));
                                    }
                                    c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.eWo
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(android.view.View view) {
                                            eVR.zsXlph(evr);
                                        }
                                    });
                                }
                            }
                        } else {
                            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.registerCallbackMessenger), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                        }
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
                MutableSharedFlow<Boolean> mutableSharedFlowAhwBna = this.this$0.DbNXlk().AhwBna();
                C02691 c02691 = new C02691(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableSharedFlowAhwBna, c02691, this) == objCopydefault) {
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
            eVR evr = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(evr, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(evr, state, anonymousClass1, this) == objCopydefault) {
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
