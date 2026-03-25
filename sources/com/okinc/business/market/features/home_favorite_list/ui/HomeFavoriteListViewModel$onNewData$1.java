package com.okinc.business.market.features.home_favorite_list.ui;

import com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28409kaI;
import o.C28422kaV;
import o.C28456kbC;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28457kbD;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListViewModel$onNewData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<C28422kaV> $items;
    final /* synthetic */ HomeFavoriteListFilter $newFilter;
    final /* synthetic */ boolean $resetPosition;
    int label;
    final /* synthetic */ HomeFavoriteListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavoriteListViewModel$onNewData$1(HomeFavoriteListViewModel homeFavoriteListViewModel, List<C28422kaV> list, HomeFavoriteListFilter homeFavoriteListFilter, boolean z, Continuation<? super HomeFavoriteListViewModel$onNewData$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFavoriteListViewModel;
        this.$items = list;
        this.$newFilter = homeFavoriteListFilter;
        this.$resetPosition = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFavoriteListViewModel$onNewData$1(this.this$0, this.$items, this.$newFilter, this.$resetPosition, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeFavoriteListViewModel$onNewData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        C28456kbC c28456kbC;
        Object value;
        Object stateListAnimator;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28409kaI c28409kaI = this.this$0.valueOf;
            List<C28422kaV> list = this.$items;
            HomeFavoriteListFilter homeFavoriteListFilter = this.$newFilter;
            this.label = 1;
            objAEQbTJ = c28409kaI.AEQbTJ(list, homeFavoriteListFilter, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        HomeFavoriteListViewModel homeFavoriteListViewModel = this.this$0;
        HomeFavoriteListFilter homeFavoriteListFilter2 = this.$newFilter;
        boolean z = this.$resetPosition;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            List<HomeToken> list2 = (List) objAEQbTJ;
            homeFavoriteListViewModel.DbNXlk = list2;
            List<HomeToken> listOLrzqt = homeFavoriteListViewModel.AkhnZx.OLrzqt(list2, homeFavoriteListFilter2);
            if (list2.isEmpty()) {
                c28456kbC = new C28456kbC(yDY.AhwBna(), false, 2, null);
            } else {
                c28456kbC = new C28456kbC(listOLrzqt, z);
            }
            boolean zCopydefault = HomeFavoriteListFilter.Companion.copydefault(homeFavoriteListFilter2);
            MutableStateFlow mutableStateFlow = homeFavoriteListViewModel.EZpvd;
            do {
                value = mutableStateFlow.getValue();
                if (list2.isEmpty() && zCopydefault) {
                    stateListAnimator = InterfaceC28457kbD.Activity.EZpvd;
                } else {
                    stateListAnimator = (!list2.isEmpty() || zCopydefault) ? new InterfaceC28457kbD.StateListAnimator(c28456kbC, false) : InterfaceC28457kbD.Application.OLrzqt;
                }
            } while (!mutableStateFlow.compareAndSet(value, stateListAnimator));
        }
        return Unit.INSTANCE;
    }
}
