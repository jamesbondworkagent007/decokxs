package com.okinc.business.market.features.overview.ui;

import com.okinc.business.invest_api.bean.EarnRecommendApyBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33129mqd;
import o.C43251rlk;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC25429iwZ;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class OverviewViewModel$loadEarnApyList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contractAddress;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OverviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewViewModel$loadEarnApyList$1(OverviewViewModel overviewViewModel, String str, Continuation<? super OverviewViewModel$loadEarnApyList$1> continuation) {
        super(2, continuation);
        this.this$0 = overviewViewModel;
        this.$contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OverviewViewModel$loadEarnApyList$1 overviewViewModel$loadEarnApyList$1 = new OverviewViewModel$loadEarnApyList$1(this.this$0, this.$contractAddress, continuation);
        overviewViewModel$loadEarnApyList$1.L$0 = obj;
        return overviewViewModel$loadEarnApyList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverviewViewModel$loadEarnApyList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        OverviewViewModel overviewViewModel;
        String str;
        Object obj2;
        List listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$2;
            overviewViewModel = (OverviewViewModel) this.L$1;
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
            if (interfaceC25429iwZ == null) {
                this.this$0.copydefault.setValue(yDY.AhwBna());
                return Unit.INSTANCE;
            }
            overviewViewModel = this.this$0;
            String str2 = this.$contractAddress;
            long jValueOf = C33129mqd.valueOf(overviewViewModel.AEQbTJ().getChainId());
            String tokenSymbol = overviewViewModel.AEQbTJ().getTokenSymbol();
            this.L$0 = coroutineScope;
            this.L$1 = overviewViewModel;
            this.L$2 = str2;
            this.label = 1;
            obj = interfaceC25429iwZ.OLrzqt(jValueOf, str2, tokenSymbol, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            str = str2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : (Iterable) obj) {
            EarnRecommendApyBean earnRecommendApyBean = (EarnRecommendApyBean) obj3;
            if (Intrinsics.EZpvd((Object) String.valueOf(earnRecommendApyBean.copydefault()), (Object) overviewViewModel.AEQbTJ().getChainId()) && Intrinsics.EZpvd((Object) earnRecommendApyBean.AEQbTJ(), (Object) str)) {
                arrayList.add(obj3);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double dAEQbTJ = C33129mqd.AEQbTJ(((EarnRecommendApyBean) next).OLrzqt());
                do {
                    Object next2 = it.next();
                    double dAEQbTJ2 = C33129mqd.AEQbTJ(((EarnRecommendApyBean) next2).OLrzqt());
                    if (Double.compare(dAEQbTJ, dAEQbTJ2) < 0) {
                        next = next2;
                        dAEQbTJ = dAEQbTJ2;
                    }
                } while (it.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        EarnRecommendApyBean earnRecommendApyBean2 = (EarnRecommendApyBean) obj2;
        MutableStateFlow mutableStateFlow = overviewViewModel.copydefault;
        if (earnRecommendApyBean2 == null || (listAhwBna = C56402yEa.EZpvd(earnRecommendApyBean2)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        mutableStateFlow.setValue(listAhwBna);
        return Unit.INSTANCE;
    }
}
