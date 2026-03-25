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
public final class ReNewEnableViewModel$reNewEnable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isUpgrade;
    final /* synthetic */ String $password;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReNewEnableViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableViewModel$reNewEnable$1(ReNewEnableViewModel reNewEnableViewModel, String str, boolean z, Continuation<? super ReNewEnableViewModel$reNewEnable$1> continuation) {
        super(2, continuation);
        this.this$0 = reNewEnableViewModel;
        this.$password = str;
        this.$isUpgrade = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReNewEnableViewModel$reNewEnable$1 reNewEnableViewModel$reNewEnable$1 = new ReNewEnableViewModel$reNewEnable$1(this.this$0, this.$password, this.$isUpgrade, continuation);
        reNewEnableViewModel$reNewEnable$1.L$0 = obj;
        return reNewEnableViewModel$reNewEnable$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableViewModel$reNewEnable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Set setCopydefault;
        Set setCopydefault2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                List listGEmmrt = yDY.gEmmrt(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReNewEnableViewModel$reNewEnable$1$checkTasks$1(this.this$0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReNewEnableViewModel$reNewEnable$1$checkTasks$2(this.this$0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReNewEnableViewModel$reNewEnable$1$checkTasks$3(this.this$0, null), 3, null));
                this.label = 1;
                if (AwaitKt.awaitAll(listGEmmrt, this) == objCopydefault) {
                    return objCopydefault;
                }
                if (Intrinsics.EZpvd(this.this$0.EZpvd.getValue(), ReNewEnableViewModel.Activity.C0321Activity.OLrzqt)) {
                    this.this$0.valueOf.setValue(C56443yFo.AEQbTJ(1));
                }
                if (((Boolean) this.this$0.AhwBna.getValue()).booleanValue() && this.this$0.DTwDnp != 1) {
                    if (this.this$0.zuBGHE == null || this.this$0.AxsJAY == null) {
                        this.this$0.ejfBZ();
                        return Unit.INSTANCE;
                    }
                    SingleTeeStatus singleTeeStatus = this.this$0.AxsJAY;
                    Intrinsics.copydefault(singleTeeStatus);
                    if (!singleTeeStatus.getTeeStatus().isActive()) {
                        this.this$0.fIwbmz();
                        return Unit.INSTANCE;
                    }
                    this.this$0.KWHzl();
                    Integer value = this.this$0.AkhnZx().getValue();
                    if (value != null && value.intValue() == 1) {
                        SingleTeeStatus singleTeeStatus2 = this.this$0.AxsJAY;
                        Intrinsics.copydefault(singleTeeStatus2);
                        ArrayList<Long> chainIndexList = singleTeeStatus2.getChainIndexList();
                        if (chainIndexList == null || !chainIndexList.containsAll(this.this$0.QUSxYX)) {
                            Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(this.this$0.QUSxYX);
                            SingleTeeStatus singleTeeStatus3 = this.this$0.AxsJAY;
                            Intrinsics.copydefault(singleTeeStatus3);
                            ArrayList<Long> chainIndexList2 = singleTeeStatus3.getChainIndexList();
                            if (chainIndexList2 == null || (setCopydefault2 = CollectionsKt___CollectionsKt.OqFWZa(chainIndexList2)) == null) {
                                setCopydefault2 = yEE.copydefault();
                            }
                            AbstractC12782ctV abstractC12782ctV = this.this$0.QbewEr;
                            Intrinsics.copydefault(abstractC12782ctV);
                            Set<Long> setCopydefault3 = C17922fXg.copydefault(abstractC12782ctV);
                            Set set = setOqFWZa;
                            Set set2 = setCopydefault2;
                            if (C17922fXg.OLrzqt(setCopydefault3, CollectionsKt___CollectionsKt.AYXKKw((Iterable) set, (Iterable) set2))) {
                                Set set3 = setCopydefault2;
                                if (!setCopydefault3.containsAll(set3)) {
                                    this.this$0.copydefault.setValue(new ReNewEnableViewModel.ActionBar.TaskDescription(this.$password, this.this$0.hDKMBd(), this.this$0.getNewProxyInstance));
                                } else if (setOqFWZa.containsAll(set3)) {
                                    ReNewEnableViewModel reNewEnableViewModel = this.this$0;
                                    String str = this.$password;
                                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0.AubY);
                                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0.hDKMBd);
                                    this.label = 3;
                                    if (reNewEnableViewModel.copydefault(str, (6 & 2) != 0 ? false : false, (6 & 4) != 0 ? 0L : 0L, anonymousClass3, anonymousClass4, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                } else {
                                    Set setAYXKKw = CollectionsKt___CollectionsKt.AYXKKw((Iterable) set2, (Iterable) set);
                                    this.this$0.getNewProxyInstance = "";
                                    this.this$0.fIwbmz.clear();
                                    this.this$0.fIwbmz.addAll(setAYXKKw);
                                    this.this$0.copydefault.setValue(new ReNewEnableViewModel.ActionBar.TaskDescription(this.$password, this.this$0.hDKMBd(), this.this$0.getNewProxyInstance));
                                }
                            } else {
                                ReNewEnableViewModel reNewEnableViewModel2 = this.this$0;
                                String str2 = this.$password;
                                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0.zLjUOn);
                                AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.this$0.hDKMBd);
                                this.label = 4;
                                if (reNewEnableViewModel2.AEQbTJ(str2, anonymousClass5, anonymousClass6, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        } else {
                            ReNewEnableViewModel reNewEnableViewModel3 = this.this$0;
                            String str3 = this.$password;
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0.zLjUOn);
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0.hDKMBd);
                            this.label = 2;
                            if (reNewEnableViewModel3.AEQbTJ(str3, anonymousClass1, anonymousClass2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else {
                        Set setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(this.this$0.QUSxYX);
                        SingleTeeStatus singleTeeStatus4 = this.this$0.AxsJAY;
                        Intrinsics.copydefault(singleTeeStatus4);
                        ArrayList<Long> chainIndexList3 = singleTeeStatus4.getChainIndexList();
                        if (chainIndexList3 == null || (setCopydefault = CollectionsKt___CollectionsKt.OqFWZa(chainIndexList3)) == null) {
                            setCopydefault = yEE.copydefault();
                        }
                        SingleTeeStatus singleTeeStatus5 = this.this$0.AxsJAY;
                        Intrinsics.copydefault(singleTeeStatus5);
                        long expiredTimestamp = singleTeeStatus5.getTeeStatus().getExpiredTimestamp();
                        AbstractC12782ctV abstractC12782ctV2 = this.this$0.QbewEr;
                        Intrinsics.copydefault(abstractC12782ctV2);
                        Set<Long> setCopydefault4 = C17922fXg.copydefault(abstractC12782ctV2);
                        if (setCopydefault4.containsAll(setOqFWZa2)) {
                            Set set4 = setCopydefault;
                            if (!setCopydefault4.containsAll(set4)) {
                                this.this$0.copydefault.setValue(new ReNewEnableViewModel.ActionBar.TaskDescription(this.$password, this.this$0.hDKMBd(), this.this$0.getNewProxyInstance));
                            } else if (setOqFWZa2.containsAll(set4)) {
                                ReNewEnableViewModel reNewEnableViewModel4 = this.this$0;
                                String str4 = this.$password;
                                boolean z = this.$isUpgrade;
                                AnonymousClass7 anonymousClass7 = new AnonymousClass7(z ? reNewEnableViewModel4.RJOkX : reNewEnableViewModel4.AubY);
                                AnonymousClass8 anonymousClass8 = new AnonymousClass8(this.$isUpgrade ? this.this$0.QfsBiF : this.this$0.hDKMBd);
                                this.label = 5;
                                if (reNewEnableViewModel4.copydefault(str4, z, expiredTimestamp, anonymousClass7, anonymousClass8, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.AYXKKw((Iterable) setCopydefault, (Iterable) setOqFWZa2));
                                this.this$0.getNewProxyInstance = "";
                                this.this$0.fIwbmz.clear();
                                this.this$0.fIwbmz.addAll(listAxsJAYsNCnLh);
                                this.this$0.copydefault.setValue(new ReNewEnableViewModel.ActionBar.TaskDescription(this.$password, this.this$0.hDKMBd(), this.this$0.getNewProxyInstance));
                            }
                        } else if (!setCopydefault4.containsAll(setCopydefault)) {
                            this.this$0.copydefault.setValue(new ReNewEnableViewModel.ActionBar.TaskDescription(this.$password, this.this$0.hDKMBd(), this.this$0.getNewProxyInstance));
                        } else {
                            ReNewEnableViewModel reNewEnableViewModel5 = this.this$0;
                            String str5 = this.$password;
                            boolean z2 = this.$isUpgrade;
                            AnonymousClass9 anonymousClass9 = new AnonymousClass9(z2 ? reNewEnableViewModel5.RJOkX : reNewEnableViewModel5.AubY);
                            AnonymousClass10 anonymousClass10 = new AnonymousClass10(this.$isUpgrade ? this.this$0.QfsBiF : this.this$0.hDKMBd);
                            this.label = 6;
                            if (reNewEnableViewModel5.copydefault(str5, z2, expiredTimestamp, anonymousClass9, anonymousClass10, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                if (Intrinsics.EZpvd(this.this$0.EZpvd.getValue(), ReNewEnableViewModel.Activity.C0321Activity.OLrzqt)) {
                }
                if (((Boolean) this.this$0.AhwBna.getValue()).booleanValue()) {
                    break;
                }
                return Unit.INSTANCE;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reNewEnable$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<TeeOperateSuccessState, Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Object obj) {
            super(2, obj, Intrinsics.StateListAnimator.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/okinc/business/defi/wallet/tee/activate/model/TeeOperateSuccessState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TeeOperateSuccessState teeOperateSuccessState, Continuation<? super Unit> continuation) {
            return ReNewEnableViewModel$reNewEnable$1.invokeSuspend$suspendConversion0((Function1) this.receiver, teeOperateSuccessState, continuation);
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reNewEnable$1$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Object obj) {
            super(1, obj, Intrinsics.StateListAnimator.class, "suspendConversion1", "invokeSuspend$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ReNewEnableViewModel$reNewEnable$1.invokeSuspend$suspendConversion1((Function0) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion0(Function1 function1, TeeOperateSuccessState teeOperateSuccessState, Continuation continuation) {
        function1.invoke(teeOperateSuccessState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion1(Function0 function0, Continuation continuation) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reNewEnable$1$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function2<List<? extends TeeOperateSuccessState>, Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Object obj) {
            super(2, obj, Intrinsics.StateListAnimator.class, "suspendConversion5", "invokeSuspend$suspendConversion5(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends TeeOperateSuccessState> list, Continuation<? super Unit> continuation) {
            return invoke2((List<TeeOperateSuccessState>) list, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<TeeOperateSuccessState> list, Continuation<? super Unit> continuation) {
            return ReNewEnableViewModel$reNewEnable$1.invokeSuspend$suspendConversion5((Function1) this.receiver, list, continuation);
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reNewEnable$1$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Object obj) {
            super(1, obj, Intrinsics.StateListAnimator.class, "suspendConversion6", "invokeSuspend$suspendConversion6(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ReNewEnableViewModel$reNewEnable$1.invokeSuspend$suspendConversion6((Function0) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion5(Function1 function1, List list, Continuation continuation) {
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion6(Function0 function0, Continuation continuation) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reNewEnable$1$5, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function2<TeeOperateSuccessState, Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5(Object obj) {
            super(2, obj, Intrinsics.StateListAnimator.class, "suspendConversion7", "invokeSuspend$suspendConversion7(Lkotlin/jvm/functions/Function1;Lcom/okinc/business/defi/wallet/tee/activate/model/TeeOperateSuccessState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TeeOperateSuccessState teeOperateSuccessState, Continuation<? super Unit> continuation) {
            return ReNewEnableViewModel$reNewEnable$1.invokeSuspend$suspendConversion7((Function1) this.receiver, teeOperateSuccessState, continuation);
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reNewEnable$1$6, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass6(Object obj) {
            super(1, obj, Intrinsics.StateListAnimator.class, "suspendConversion8", "invokeSuspend$suspendConversion8(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ReNewEnableViewModel$reNewEnable$1.invokeSuspend$suspendConversion8((Function0) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion7(Function1 function1, TeeOperateSuccessState teeOperateSuccessState, Continuation continuation) {
        function1.invoke(teeOperateSuccessState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion8(Function0 function0, Continuation continuation) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reNewEnable$1$7, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function2<List<? extends TeeOperateSuccessState>, Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass7(Object obj) {
            super(2, obj, Intrinsics.StateListAnimator.class, "suspendConversion11", "invokeSuspend$suspendConversion11(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends TeeOperateSuccessState> list, Continuation<? super Unit> continuation) {
            return invoke2((List<TeeOperateSuccessState>) list, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<TeeOperateSuccessState> list, Continuation<? super Unit> continuation) {
            return ReNewEnableViewModel$reNewEnable$1.invokeSuspend$suspendConversion11((Function1) this.receiver, list, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion11(Function1 function1, List list, Continuation continuation) {
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reNewEnable$1$8, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass8 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass8(Object obj) {
            super(1, obj, Intrinsics.StateListAnimator.class, "suspendConversion12", "invokeSuspend$suspendConversion12(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ReNewEnableViewModel$reNewEnable$1.invokeSuspend$suspendConversion12((Function0) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion12(Function0 function0, Continuation continuation) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reNewEnable$1$9, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass9 extends FunctionReferenceImpl implements Function2<List<? extends TeeOperateSuccessState>, Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass9(Object obj) {
            super(2, obj, Intrinsics.StateListAnimator.class, "suspendConversion13", "invokeSuspend$suspendConversion13(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends TeeOperateSuccessState> list, Continuation<? super Unit> continuation) {
            return invoke2((List<TeeOperateSuccessState>) list, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<TeeOperateSuccessState> list, Continuation<? super Unit> continuation) {
            return ReNewEnableViewModel$reNewEnable$1.invokeSuspend$suspendConversion13((Function1) this.receiver, list, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion13(Function1 function1, List list, Continuation continuation) {
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$reNewEnable$1$10, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass10 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass10(Object obj) {
            super(1, obj, Intrinsics.StateListAnimator.class, "suspendConversion14", "invokeSuspend$suspendConversion14(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ReNewEnableViewModel$reNewEnable$1.invokeSuspend$suspendConversion14((Function0) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$suspendConversion14(Function0 function0, Continuation continuation) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
