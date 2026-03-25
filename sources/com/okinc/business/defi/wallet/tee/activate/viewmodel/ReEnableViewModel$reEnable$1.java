package com.okinc.business.defi.wallet.tee.activate.viewmodel;

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
import o.yDY;
import o.yEE;

/* JADX INFO: loaded from: classes18.dex */
public final class ReEnableViewModel$reEnable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $autoRenew;
    final /* synthetic */ int $day;
    final /* synthetic */ String $password;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReEnableViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReEnableViewModel$reEnable$1(ReEnableViewModel reEnableViewModel, String str, int i, boolean z, Continuation<? super ReEnableViewModel$reEnable$1> continuation) {
        super(2, continuation);
        this.this$0 = reEnableViewModel;
        this.$password = str;
        this.$day = i;
        this.$autoRenew = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReEnableViewModel$reEnable$1 reEnableViewModel$reEnable$1 = new ReEnableViewModel$reEnable$1(this.this$0, this.$password, this.$day, this.$autoRenew, continuation);
        reEnableViewModel$reEnable$1.L$0 = obj;
        return reEnableViewModel$reEnable$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReEnableViewModel$reEnable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Set setCopydefault;
        Set setCopydefault2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List listGEmmrt = yDY.gEmmrt(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReEnableViewModel$reEnable$1$checkTasks$1(this.this$0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReEnableViewModel$reEnable$1$checkTasks$2(this.this$0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReEnableViewModel$reEnable$1$checkTasks$3(this.this$0, null), 3, null));
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
        if (this.this$0.fARcdN == null || this.this$0.fetchVPNInfo == null || this.this$0.getFieldNames == null) {
            this.this$0.valueOf();
            return Unit.INSTANCE;
        }
        SingleTeeStatus singleTeeStatus = this.this$0.fetchVPNInfo;
        Intrinsics.copydefault(singleTeeStatus);
        if (!singleTeeStatus.getTeeStatus().isActive()) {
            if (!((Boolean) this.this$0.AEQbTJ.getValue()).booleanValue() && this.this$0.AuCTel != 1) {
                Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(this.this$0.getNewProxyInstance);
                SingleTeeStatus singleTeeStatus2 = this.this$0.fetchVPNInfo;
                Intrinsics.copydefault(singleTeeStatus2);
                ArrayList<Long> chainIndexList = singleTeeStatus2.getChainIndexList();
                if (chainIndexList == null || (setCopydefault = CollectionsKt___CollectionsKt.OqFWZa(chainIndexList)) == null) {
                    setCopydefault = yEE.copydefault();
                }
                AbstractC12782ctV abstractC12782ctV = this.this$0.getFieldNames;
                Intrinsics.copydefault(abstractC12782ctV);
                Set<Long> setCopydefault3 = C17922fXg.copydefault(abstractC12782ctV);
                if (setCopydefault3.containsAll(setOqFWZa)) {
                    ReEnableViewModel reEnableViewModel = this.this$0;
                    String str = this.$password;
                    int i2 = this.$day;
                    boolean z = this.$autoRenew;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(reEnableViewModel, null);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0.djBIcL);
                    this.label = 2;
                    if (reEnableViewModel.EZpvd(str, i2, z, anonymousClass1, anonymousClass2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (!setCopydefault3.containsAll(setCopydefault)) {
                    AbstractC12782ctV abstractC12782ctV2 = this.this$0.getFieldNames;
                    Intrinsics.copydefault(abstractC12782ctV2);
                    Set<Long> setCopydefault4 = C17922fXg.copydefault(abstractC12782ctV2);
                    SingleTeeStatus singleTeeStatus3 = this.this$0.fetchVPNInfo;
                    Intrinsics.copydefault(singleTeeStatus3);
                    ArrayList<Long> chainIndexList2 = singleTeeStatus3.getChainIndexList();
                    if (chainIndexList2 == null || (setCopydefault2 = CollectionsKt___CollectionsKt.OqFWZa(chainIndexList2)) == null) {
                        setCopydefault2 = yEE.copydefault();
                    }
                    Set setAYXKKw = CollectionsKt___CollectionsKt.AYXKKw((Iterable) setCopydefault2, (Iterable) setCopydefault4);
                    this.this$0.valueOf.clear();
                    this.this$0.valueOf.addAll(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(setAYXKKw));
                    this.this$0.OLrzqt.setValue(new ReNewEnableViewModel.ActionBar.C0320ActionBar(this.$password, this.this$0.KWHzl()));
                } else {
                    ReEnableViewModel reEnableViewModel2 = this.this$0;
                    String str2 = this.$password;
                    int i3 = this.$day;
                    boolean z2 = this.$autoRenew;
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(reEnableViewModel2, null);
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0.djBIcL);
                    this.label = 3;
                    if (reEnableViewModel2.EZpvd(str2, i3, z2, anonymousClass3, anonymousClass4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.activate.viewmodel.ReEnableViewModel$reEnable$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends TeeOperateSuccessState>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ReEnableViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReEnableViewModel reEnableViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = reEnableViewModel;
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
                ReEnableViewModel reEnableViewModel = this.this$0;
                this.L$0 = list2;
                this.label = 1;
                if (reEnableViewModel.KWHzl((Continuation<? super Unit>) this) == objCopydefault) {
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
            this.this$0.gEmmrt.invoke(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.activate.viewmodel.ReEnableViewModel$reEnable$1$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Object obj) {
            super(1, obj, Intrinsics.StateListAnimator.class, "suspendConversion2", "invokeSuspend$suspendConversion2(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ReEnableViewModel$reEnable$1.invokeSuspend$suspendConversion2((Function0) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion2(Function0 function0, Continuation continuation) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.activate.viewmodel.ReEnableViewModel$reEnable$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<List<? extends TeeOperateSuccessState>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ReEnableViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ReEnableViewModel reEnableViewModel, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = reEnableViewModel;
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
                ReEnableViewModel reEnableViewModel = this.this$0;
                this.L$0 = list2;
                this.label = 1;
                if (reEnableViewModel.KWHzl((Continuation<? super Unit>) this) == objCopydefault) {
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
            this.this$0.gEmmrt.invoke(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.activate.viewmodel.ReEnableViewModel$reEnable$1$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Object obj) {
            super(1, obj, Intrinsics.StateListAnimator.class, "suspendConversion3", "invokeSuspend$suspendConversion3(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ReEnableViewModel$reEnable$1.invokeSuspend$suspendConversion3((Function0) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion3(Function0 function0, Continuation continuation) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
