package com.okinc.business.defi.wallet.mine.addressbook.detail;

import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C16623enS;
import o.C18713fnb;
import o.C55008xbo;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletAddressBookDetailFragment$observeNameErrorState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18713fnb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBookDetailFragment$observeNameErrorState$1(C18713fnb c18713fnb, Continuation<? super WalletAddressBookDetailFragment$observeNameErrorState$1> continuation) {
        super(2, continuation);
        this.this$0 = c18713fnb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBookDetailFragment$observeNameErrorState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletAddressBookDetailFragment$observeNameErrorState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<WalletAddressBookDetailViewModel.NameInputFieldState> stateFlowAYXKKw = this.this$0.gEmmrt().AYXKKw();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAYXKKw, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$observeNameErrorState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WalletAddressBookDetailViewModel.NameInputFieldState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C18713fnb this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18713fnb c18713fnb, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18713fnb;
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
        public final Object invoke(WalletAddressBookDetailViewModel.NameInputFieldState nameInputFieldState, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(nameInputFieldState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C55008xbo c55008xbo;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                WalletAddressBookDetailViewModel.NameInputFieldState nameInputFieldState = (WalletAddressBookDetailViewModel.NameInputFieldState) this.L$0;
                if (nameInputFieldState instanceof WalletAddressBookDetailViewModel.NameInputFieldState.Activity) {
                    C18713fnb.KWHzl(this.this$0, ((WalletAddressBookDetailViewModel.NameInputFieldState.Activity) nameInputFieldState).KWHzl());
                } else if (Intrinsics.EZpvd(nameInputFieldState, WalletAddressBookDetailViewModel.NameInputFieldState.ActionBar.copydefault)) {
                    C16623enS c16623enS = this.this$0.djBIcL;
                    if (c16623enS != null && (c55008xbo = c16623enS.OLrzqt) != null) {
                        c55008xbo.values();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
