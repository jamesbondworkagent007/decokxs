package com.okinc.business.defi.wallet.tee.activate.viewmodel;

import com.okinc.business.defi.wallet.tee.activate.model.TeeOperateSuccessState;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class ReEnableViewModel$enable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $autoRenew;
    final /* synthetic */ int $day;
    final /* synthetic */ ReNewEnableViewModel.ActionBar $dialog;
    final /* synthetic */ String $password;
    int label;
    final /* synthetic */ ReEnableViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReEnableViewModel$enable$1(ReEnableViewModel reEnableViewModel, String str, int i, boolean z, ReNewEnableViewModel.ActionBar actionBar, Continuation<? super ReEnableViewModel$enable$1> continuation) {
        super(2, continuation);
        this.this$0 = reEnableViewModel;
        this.$password = str;
        this.$day = i;
        this.$autoRenew = z;
        this.$dialog = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReEnableViewModel$enable$1(this.this$0, this.$password, this.$day, this.$autoRenew, this.$dialog, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReEnableViewModel$enable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ReEnableViewModel reEnableViewModel = this.this$0;
            String str = this.$password;
            int i2 = this.$day;
            boolean z = this.$autoRenew;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dialog, reEnableViewModel, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$dialog, this.this$0, null);
            this.label = 1;
            if (reEnableViewModel.EZpvd(str, i2, z, anonymousClass1, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.activate.viewmodel.ReEnableViewModel$enable$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends TeeOperateSuccessState>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReNewEnableViewModel.ActionBar $dialog;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ReEnableViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReNewEnableViewModel.ActionBar actionBar, ReEnableViewModel reEnableViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dialog = actionBar;
            this.this$0 = reEnableViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dialog, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends TeeOperateSuccessState> list, Continuation<? super Unit> continuation) {
            return invoke2((List<TeeOperateSuccessState>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<TeeOperateSuccessState> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                List list2 = (List) this.L$0;
                if (this.$dialog instanceof ReNewEnableViewModel.ActionBar.C0320ActionBar) {
                    ReEnableViewModel reEnableViewModel = this.this$0;
                    this.L$0 = list2;
                    this.label = 1;
                    if (reEnableViewModel.KWHzl((Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    list = list2;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            this.this$0.gEmmrt.invoke(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.activate.viewmodel.ReEnableViewModel$enable$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ ReNewEnableViewModel.ActionBar $dialog;
        int label;
        final /* synthetic */ ReEnableViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ReNewEnableViewModel.ActionBar actionBar, ReEnableViewModel reEnableViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$dialog = actionBar;
            this.this$0 = reEnableViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$dialog, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.$dialog instanceof ReNewEnableViewModel.ActionBar.C0320ActionBar) {
                    this.this$0.valueOf();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
