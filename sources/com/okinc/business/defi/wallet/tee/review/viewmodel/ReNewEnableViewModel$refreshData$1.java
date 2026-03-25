package com.okinc.business.defi.wallet.tee.review.viewmodel;

import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.TeeStatus;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C17922fXg;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;
import o.yEE;

/* JADX INFO: loaded from: classes18.dex */
public final class ReNewEnableViewModel$refreshData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReNewEnableViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableViewModel$refreshData$1(ReNewEnableViewModel reNewEnableViewModel, Continuation<? super ReNewEnableViewModel$refreshData$1> continuation) {
        super(2, continuation);
        this.this$0 = reNewEnableViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReNewEnableViewModel$refreshData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableViewModel$refreshData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$refreshData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
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
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            SingleTeeStatus singleTeeStatus;
            TeeStatus teeStatus;
            Set setCopydefault;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                List listGEmmrt = yDY.gEmmrt(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReNewEnableViewModel$refreshData$1$1$fetchTasks$1(this.this$0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReNewEnableViewModel$refreshData$1$1$fetchTasks$2(this.this$0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReNewEnableViewModel$refreshData$1$1$fetchTasks$3(this.this$0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReNewEnableViewModel$refreshData$1$1$fetchTasks$4(this.this$0, null), 3, null));
                this.label = 1;
                if (AwaitKt.awaitAll(listGEmmrt, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            if (this.this$0.QbewEr == null) {
                this.this$0.EZpvd.setValue(ReNewEnableViewModel.Activity.Application.EZpvd);
            }
            this.this$0.OLrzqt.setValue(C56443yFo.KWHzl(this.this$0.zuBGHE == null || this.this$0.AxsJAY == null || this.this$0.valueOf.getValue() == null || this.this$0.QbewEr == null));
            if (!Intrinsics.EZpvd(this.this$0.OLrzqt.getValue(), C56443yFo.KWHzl(true))) {
                this.this$0.KWHzl();
                if (Intrinsics.EZpvd(this.this$0.EZpvd.getValue(), ReNewEnableViewModel.Activity.C0321Activity.OLrzqt)) {
                    this.this$0.valueOf.setValue(C56443yFo.AEQbTJ(1));
                }
                if (this.this$0.AxsJAY != null && this.this$0.zuBGHE != null && (singleTeeStatus = this.this$0.AxsJAY) != null && (teeStatus = singleTeeStatus.getTeeStatus()) != null && teeStatus.isCreated()) {
                    AbstractC12782ctV abstractC12782ctV = this.this$0.QbewEr;
                    Intrinsics.copydefault(abstractC12782ctV);
                    Set<Long> setCopydefault2 = C17922fXg.copydefault(abstractC12782ctV);
                    SingleTeeStatus singleTeeStatus2 = this.this$0.AxsJAY;
                    Intrinsics.copydefault(singleTeeStatus2);
                    ArrayList<Long> chainIndexList = singleTeeStatus2.getChainIndexList();
                    if (chainIndexList == null || (setCopydefault = CollectionsKt___CollectionsKt.OqFWZa(chainIndexList)) == null) {
                        setCopydefault = yEE.copydefault();
                    }
                    Set setAYXKKw = CollectionsKt___CollectionsKt.AYXKKw((Iterable) setCopydefault, (Iterable) setCopydefault2);
                    if (!setAYXKKw.isEmpty()) {
                        this.this$0.fIwbmz.clear();
                        this.this$0.fIwbmz.addAll(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(setAYXKKw));
                        SingleTeeStatus singleTeeStatus3 = this.this$0.AxsJAY;
                        Intrinsics.copydefault(singleTeeStatus3);
                        if (!singleTeeStatus3.getTeeStatus().isActive()) {
                            ReNewEnableViewModel reNewEnableViewModel = this.this$0;
                            this.label = 2;
                            if (reNewEnableViewModel.copydefault((Continuation<? super Unit>) this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
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
            CoroutineDispatcher coroutineDispatcherOLrzqt = this.this$0.OLrzqt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcherOLrzqt, anonymousClass1, this) == objCopydefault) {
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
