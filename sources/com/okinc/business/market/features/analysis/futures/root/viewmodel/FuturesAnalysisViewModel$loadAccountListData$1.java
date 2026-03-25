package com.okinc.business.market.features.analysis.futures.root.viewmodel;

import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.okuser.data.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jHT;
import o.jHV;
import o.jLI;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class FuturesAnalysisViewModel$loadAccountListData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ FuturesAnalysisViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisViewModel$loadAccountListData$1(FuturesAnalysisViewModel futuresAnalysisViewModel, Continuation<? super FuturesAnalysisViewModel$loadAccountListData$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresAnalysisViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisViewModel$loadAccountListData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisViewModel$loadAccountListData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        FuturesAnalysisViewModel.StateListAnimator stateListAnimator;
        String strKWHzl;
        jHT jht;
        jLI jli;
        User userOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jHV jhv = this.this$0.values;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            obj = jhv.EZpvd(unit, this);
            if (obj == objCopydefault) {
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
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                stateListAnimator = (FuturesAnalysisViewModel.StateListAnimator) obj;
                if (stateListAnimator.AEQbTJ().KWHzl() != null) {
                    strKWHzl = this.this$0.KWHzl().EZpvd().getValue().AEQbTJ().OLrzqt();
                    if (strKWHzl.length() <= 0 && ((userOLrzqt = this.this$0.fJNWhG.OLrzqt()) == null || (strKWHzl = userOLrzqt.getUid()) == null)) {
                        jHT jht2 = (jHT) CollectionsKt___CollectionsKt.firstOrNull(list);
                        strKWHzl = jht2 != null ? jht2.EZpvd() : null;
                    }
                    jli = new jLI(list, strKWHzl);
                    if (!Intrinsics.EZpvd(stateListAnimator.AEQbTJ(), jli)) {
                        pUU.KWHzl("FuturesAnalysisViewModel", "updateAccountState: newAccountState.selectedAccountUid='" + jli.KWHzl() + "'");
                        FuturesAnalysisViewModel futuresAnalysisViewModel = this.this$0;
                        this.L$0 = null;
                        this.label = 3;
                        if (futuresAnalysisViewModel.copydefault(jli, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else if ((list instanceof Collection) && list.isEmpty()) {
                    jht = (jHT) CollectionsKt___CollectionsKt.firstOrNull(list);
                    if (jht == null) {
                    }
                    jli = new jLI(list, strKWHzl);
                    if (!Intrinsics.EZpvd(stateListAnimator.AEQbTJ(), jli)) {
                    }
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((Object) ((jHT) it.next()).EZpvd(), (Object) stateListAnimator.AEQbTJ().KWHzl())) {
                            strKWHzl = stateListAnimator.AEQbTJ().KWHzl();
                            break;
                        }
                    }
                    jht = (jHT) CollectionsKt___CollectionsKt.firstOrNull(list);
                    if (jht == null) {
                        strKWHzl = jht.EZpvd();
                    }
                    jli = new jLI(list, strKWHzl);
                    if (!Intrinsics.EZpvd(stateListAnimator.AEQbTJ(), jli)) {
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        list = (List) obj;
        FuturesAnalysisViewModel futuresAnalysisViewModel2 = this.this$0;
        this.L$0 = list;
        this.label = 2;
        obj = futuresAnalysisViewModel2.OLrzqt(futuresAnalysisViewModel2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        stateListAnimator = (FuturesAnalysisViewModel.StateListAnimator) obj;
        if (stateListAnimator.AEQbTJ().KWHzl() != null) {
        }
        return Unit.INSTANCE;
    }
}
