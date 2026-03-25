package com.okinc.business.defi.wallet.mine.addressbook.list;

import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.Point;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBookListViewModel$collectAllAddressBooks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WalletAddressBookListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBookListViewModel$collectAllAddressBooks$1(WalletAddressBookListViewModel walletAddressBookListViewModel, Continuation<? super WalletAddressBookListViewModel$collectAllAddressBooks$1> continuation) {
        super(2, continuation);
        this.this$0 = walletAddressBookListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBookListViewModel$collectAllAddressBooks$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletAddressBookListViewModel$collectAllAddressBooks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowM7441catch = FlowKt.m7441catch(FlowKt.onStart(this.this$0.copydefault.KWHzl(), new AnonymousClass1(this.this$0, null)), new AnonymousClass2(this.this$0, null));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowM7441catch, anonymousClass3, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.addressbook.list.WalletAddressBookListViewModel$collectAllAddressBooks$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends AddressBookEntity>>, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ WalletAddressBookListViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WalletAddressBookListViewModel walletAddressBookListViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = walletAddressBookListViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends AddressBookEntity>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<AddressBookEntity>>) flowCollector, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<AddressBookEntity>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd.setValue(new Point.StateListAnimator(null, 1, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.addressbook.list.WalletAddressBookListViewModel$collectAllAddressBooks$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends AddressBookEntity>>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ WalletAddressBookListViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WalletAddressBookListViewModel walletAddressBookListViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
            this.this$0 = walletAddressBookListViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHO
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends AddressBookEntity>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<AddressBookEntity>>) flowCollector, th, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<AddressBookEntity>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = th;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd.setValue(new Point.TaskDescription(((Throwable) this.L$0).getMessage()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.addressbook.list.WalletAddressBookListViewModel$collectAllAddressBooks$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<List<? extends AddressBookEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ WalletAddressBookListViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(WalletAddressBookListViewModel walletAddressBookListViewModel, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = walletAddressBookListViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AddressBookEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AddressBookEntity>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AddressBookEntity> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.copydefault((List) this.L$0);
                WalletAddressBookListViewModel walletAddressBookListViewModel = this.this$0;
                walletAddressBookListViewModel.AEQbTJ(walletAddressBookListViewModel.valueOf);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
