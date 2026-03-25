package com.okinc.business.defi.wallet.tee.review.viewmodel;

import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.wallet.tee.activate.model.TeeOperateSuccessState;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C17922fXg;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;
import o.yEE;

/* JADX INFO: loaded from: classes18.dex */
public final class ReNewEnableViewModel$reEnable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $password;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReNewEnableViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableViewModel$reEnable$1(ReNewEnableViewModel reNewEnableViewModel, String str, Continuation<? super ReNewEnableViewModel$reEnable$1> continuation) {
        super(2, continuation);
        this.this$0 = reNewEnableViewModel;
        this.$password = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReNewEnableViewModel$reEnable$1 reNewEnableViewModel$reEnable$1 = new ReNewEnableViewModel$reEnable$1(this.this$0, this.$password, continuation);
        reNewEnableViewModel$reEnable$1.L$0 = obj;
        return reNewEnableViewModel$reEnable$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableViewModel$reEnable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Set setCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List listGEmmrt = yDY.gEmmrt(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReNewEnableViewModel$reEnable$1$checkTasks$1(this.this$0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReNewEnableViewModel$reEnable$1$checkTasks$2(this.this$0, null), 3, null));
            this.label = 1;
            if (AwaitKt.awaitAll(listGEmmrt, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (Intrinsics.EZpvd(this.this$0.EZpvd.getValue(), ReNewEnableViewModel.Activity.C0321Activity.OLrzqt)) {
            this.this$0.valueOf.setValue(C56443yFo.AEQbTJ(1));
        }
        if (this.this$0.zuBGHE == null || this.this$0.AxsJAY == null || this.this$0.QbewEr == null) {
            this.this$0.iwGUEr();
            return Unit.INSTANCE;
        }
        this.this$0.KWHzl();
        SingleTeeStatus singleTeeStatus = this.this$0.AxsJAY;
        Intrinsics.copydefault(singleTeeStatus);
        if (!singleTeeStatus.getTeeStatus().isActive()) {
            if (!((Boolean) this.this$0.AhwBna.getValue()).booleanValue() && this.this$0.DTwDnp != 1) {
                Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(this.this$0.QUSxYX);
                SingleTeeStatus singleTeeStatus2 = this.this$0.AxsJAY;
                Intrinsics.copydefault(singleTeeStatus2);
                ArrayList<Long> chainIndexList = singleTeeStatus2.getChainIndexList();
                if (chainIndexList == null || (setCopydefault = CollectionsKt___CollectionsKt.OqFWZa(chainIndexList)) == null) {
                    setCopydefault = yEE.copydefault();
                }
                AbstractC12782ctV abstractC12782ctV = this.this$0.QbewEr;
                Intrinsics.copydefault(abstractC12782ctV);
                Set<Long> setCopydefault2 = C17922fXg.copydefault(abstractC12782ctV);
                if (setCopydefault2.containsAll(setOqFWZa)) {
                    ReNewEnableViewModel reNewEnableViewModel = this.this$0;
                    String str = this.$password;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(reNewEnableViewModel, null);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0.isConnected);
                    this.label = 2;
                    if (reNewEnableViewModel.copydefault(str, (6 & 2) != 0 ? false : false, (6 & 4) != 0 ? 0L : 0L, anonymousClass1, anonymousClass2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (!setCopydefault2.containsAll(setCopydefault)) {
                    this.this$0.copydefault.setValue(new ReNewEnableViewModel.ActionBar.C0320ActionBar(this.$password, this.this$0.hDKMBd()));
                } else {
                    ReNewEnableViewModel reNewEnableViewModel2 = this.this$0;
                    String str2 = this.$password;
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(reNewEnableViewModel2, null);
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0.isConnected);
                    this.label = 3;
                    if (reNewEnableViewModel2.copydefault(str2, (6 & 2) != 0 ? false : false, (6 & 4) != 0 ? 0L : 0L, anonymousClass3, anonymousClass4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reEnable$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends TeeOperateSuccessState>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ReNewEnableViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReNewEnableViewModel reNewEnableViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = reNewEnableViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
                ReNewEnableViewModel reNewEnableViewModel = this.this$0;
                this.L$0 = list2;
                this.label = 1;
                if (reNewEnableViewModel.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                list = list2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            this.this$0.ejfBZ.invoke(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reEnable$1$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Object obj) {
            super(1, obj, Intrinsics.StateListAnimator.class, "suspendConversion2", "invokeSuspend$suspendConversion2(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ReNewEnableViewModel$reEnable$1.invokeSuspend$suspendConversion2((Function0) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion2(Function0 function0, Continuation continuation) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reEnable$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<List<? extends TeeOperateSuccessState>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ReNewEnableViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ReNewEnableViewModel reNewEnableViewModel, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = reNewEnableViewModel;
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
        public /* bridge */ /* synthetic */ Object invoke(List<? extends TeeOperateSuccessState> list, Continuation<? super Unit> continuation) {
            return invoke2((List<TeeOperateSuccessState>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<TeeOperateSuccessState> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                List list2 = (List) this.L$0;
                ReNewEnableViewModel reNewEnableViewModel = this.this$0;
                this.L$0 = list2;
                this.label = 1;
                if (reNewEnableViewModel.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                list = list2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            this.this$0.ejfBZ.invoke(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reEnable$1$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Object obj) {
            super(1, obj, Intrinsics.StateListAnimator.class, "suspendConversion3", "invokeSuspend$suspendConversion3(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ReNewEnableViewModel$reEnable$1.invokeSuspend$suspendConversion3((Function0) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion3(Function0 function0, Continuation continuation) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
