package com.okinc.business.defi.wallet.home.addressDetail;

import android.graphics.drawable.Drawable;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C33129mqd;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.eVR;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletProfileAssetDetailFragment$initListener$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProfileAssetDetailFragment$initListener$5(eVR evr, Continuation<? super DefiWalletProfileAssetDetailFragment$initListener$5> continuation) {
        super(2, continuation);
        this.this$0 = evr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletProfileAssetDetailFragment$initListener$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletProfileAssetDetailFragment$initListener$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$5$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AddressProfileAssetInfoViewModel.FollowUiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AddressProfileAssetInfoViewModel.FollowUiState followUiState, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(followUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Integer numKWHzl;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AddressProfileAssetInfoViewModel.FollowUiState followUiState = (AddressProfileAssetInfoViewModel.FollowUiState) this.L$0;
                if (followUiState instanceof AddressProfileAssetInfoViewModel.FollowUiState.ActionBar) {
                    this.this$0.copydefault(((AddressProfileAssetInfoViewModel.FollowUiState.ActionBar) followUiState).AEQbTJ());
                    this.this$0.valueOf().KWHzl(this.this$0.sSMYrx());
                } else {
                    if (!(followUiState instanceof AddressProfileAssetInfoViewModel.FollowUiState.StateListAnimator)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AddressProfileAssetInfoViewModel.FollowUiState.StateListAnimator stateListAnimator = (AddressProfileAssetInfoViewModel.FollowUiState.StateListAnimator) followUiState;
                    String strEZpvd = this.this$0.EZpvd(stateListAnimator.KWHzl());
                    if (C33129mqd.OLrzqt((CharSequence) strEZpvd)) {
                        C55326xho.toast$default(strEZpvd, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    }
                    Integer numKWHzl2 = stateListAnimator.KWHzl();
                    if ((numKWHzl2 != null && numKWHzl2.intValue() == 10060) || ((numKWHzl = stateListAnimator.KWHzl()) != null && numKWHzl.intValue() == 10061)) {
                        this.this$0.gEmmrt();
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
            SharedFlow<AddressProfileAssetInfoViewModel.FollowUiState> sharedFlowKWHzl = this.this$0.valueOf().KWHzl();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowKWHzl, anonymousClass1, this) == objCopydefault) {
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
