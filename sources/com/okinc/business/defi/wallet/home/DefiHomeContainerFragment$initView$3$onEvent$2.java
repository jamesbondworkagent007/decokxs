package com.okinc.business.defi.wallet.home;

import com.okinc.business.defi.api.bean.AlertChainIdListResponse;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.AbstractC58260yxt;
import o.C10954byG;
import o.C12827cuN;
import o.C13912dbY;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC13426dKx;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeContainerFragment$initView$3$onEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DefiHomeContainerFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeContainerFragment$initView$3$onEvent$2(DefiHomeContainerFragment defiHomeContainerFragment, Continuation<? super DefiHomeContainerFragment$initView$3$onEvent$2> continuation) {
        super(2, continuation);
        this.this$0 = defiHomeContainerFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeContainerFragment$initView$3$onEvent$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeContainerFragment$initView$3$onEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeContainerFragment$initView$3$onEvent$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        final /* synthetic */ DefiHomeContainerFragment this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefiHomeContainerFragment defiHomeContainerFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = defiHomeContainerFragment;
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

        /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            AbstractC12782ctV abstractC12782ctV;
            boolean zQfsBiF;
            Set<Long> setCopydefault;
            Set<Long> setAYXKKw;
            Object objAEQbTJ;
            AbstractC43419rot abstractC43419rot;
            Object objAwait;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C12827cuN.Application application2 = C12827cuN.Companion;
                List<AbstractC12782ctV> listCopydefault = C12827cuN.Application.getInstance$default(application2, null, 1, null).copydefault();
                if (listCopydefault != null && !listCopydefault.isEmpty()) {
                    abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(listCopydefault);
                    if (abstractC12782ctV != null) {
                        return Unit.INSTANCE;
                    }
                    zQfsBiF = abstractC12782ctV.QfsBiF();
                    WalletUpdateWorker.Application application3 = WalletUpdateWorker.Companion;
                    setCopydefault = WalletUpdateWorker.Application.getInstance$default(application3, null, 1, null).copydefault();
                    setAYXKKw = WalletUpdateWorker.Application.getInstance$default(application3, null, 1, null).AYXKKw();
                    pUU.copydefault(this.this$0.getTAG(), "defaultAddChainSet = " + setCopydefault + " passwordAddChainSet = " + setAYXKKw);
                    if (setCopydefault.isEmpty() && setAYXKKw.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    if (setCopydefault.isEmpty() && zQfsBiF) {
                        return Unit.INSTANCE;
                    }
                    C13934dbu c13934dbuDTwDnp = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).DTwDnp();
                    this.L$0 = setCopydefault;
                    this.L$1 = setAYXKKw;
                    this.Z$0 = zQfsBiF;
                    this.label = 2;
                    objAEQbTJ = c13934dbuDTwDnp.AEQbTJ(this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
                    DefiHomeContainerFragment defiHomeContainerFragment = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    }
                    return Unit.INSTANCE;
                }
                Result.Application application4 = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(application2, null, 1, null).copydefault(false);
                this.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    zQfsBiF = this.Z$0;
                    Set<Long> set = (Set) this.L$1;
                    Set<Long> set2 = (Set) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    setCopydefault = set2;
                    setAYXKKw = set;
                    objAEQbTJ = obj;
                    abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
                    DefiHomeContainerFragment defiHomeContainerFragment2 = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                        AlertChainIdListResponse alertChainIdListResponse = (AlertChainIdListResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                        ArrayList arrayList = new ArrayList();
                        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        ArrayList<Long> arrayListAEQbTJ = C13912dbY.copydefault.AEQbTJ();
                        pUU.copydefault(defiHomeContainerFragment2.getTAG(), "before localShowChainList = " + arrayListAEQbTJ);
                        List<Long> chainIndexes = alertChainIdListResponse.getChainIndexes();
                        if (chainIndexes != null) {
                            Iterator<T> it = chainIndexes.iterator();
                            while (it.hasNext()) {
                                long jLongValue = ((Number) it.next()).longValue();
                                if (C10954byG.EZpvd.valueOf().copydefault(jLongValue) != null && !arrayListAEQbTJ.contains(C56443yFo.KWHzl(jLongValue))) {
                                    if (setCopydefault.contains(C56443yFo.KWHzl(jLongValue))) {
                                        arrayList.add(C56443yFo.KWHzl(jLongValue));
                                        arrayListAEQbTJ.add(C56443yFo.KWHzl(jLongValue));
                                    }
                                    if (!zQfsBiF && setAYXKKw.contains(C56443yFo.KWHzl(jLongValue))) {
                                        arrayList.add(0, C56443yFo.KWHzl(jLongValue));
                                        booleanRef.element = true;
                                        arrayListAEQbTJ.add(C56443yFo.KWHzl(jLongValue));
                                    }
                                }
                            }
                        }
                        pUU.copydefault(defiHomeContainerFragment2.getTAG(), "after localShowChainList = " + arrayListAEQbTJ);
                        pUU.copydefault(defiHomeContainerFragment2.getTAG(), "newShowChainList = " + arrayList);
                        if (arrayList.isEmpty()) {
                            WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).KWHzl();
                            return Unit.INSTANCE;
                        }
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        DefiHomeContainerFragment$initView$3$onEvent$2$1$1$2 defiHomeContainerFragment$initView$3$onEvent$2$1$1$2 = new DefiHomeContainerFragment$initView$3$onEvent$2$1$1$2(arrayListAEQbTJ, defiHomeContainerFragment2, arrayList, booleanRef, null);
                        this.L$0 = abstractC43419rot;
                        this.L$1 = null;
                        this.label = 3;
                        if (BuildersKt.withContext(main, defiHomeContainerFragment$initView$3$onEvent$2$1$1$2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objAwait = obj;
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) objAwait);
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl;
            if (abstractC12782ctV != null) {
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
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
