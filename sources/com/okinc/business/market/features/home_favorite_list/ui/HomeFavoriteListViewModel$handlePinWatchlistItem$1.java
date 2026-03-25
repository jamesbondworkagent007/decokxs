package com.okinc.business.market.features.home_favorite_list.ui;

import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C28456kbC;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC28457kbD;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListViewModel$handlePinWatchlistItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeToken $token;
    Object L$0;
    int label;
    final /* synthetic */ HomeFavoriteListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavoriteListViewModel$handlePinWatchlistItem$1(HomeFavoriteListViewModel homeFavoriteListViewModel, HomeToken homeToken, Continuation<? super HomeFavoriteListViewModel$handlePinWatchlistItem$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFavoriteListViewModel;
        this.$token = homeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFavoriteListViewModel$handlePinWatchlistItem$1(this.this$0, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeFavoriteListViewModel$handlePinWatchlistItem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC28457kbD interfaceC28457kbD;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28457kbD interfaceC28457kbD2 = (InterfaceC28457kbD) this.this$0.EZpvd.getValue();
            if (!(interfaceC28457kbD2 instanceof InterfaceC28457kbD.StateListAnimator)) {
                return Unit.INSTANCE;
            }
            this.this$0.AkhnZx();
            HomeFavoriteListViewModel homeFavoriteListViewModel = this.this$0;
            HomeToken homeToken = this.$token;
            this.L$0 = interfaceC28457kbD2;
            this.label = 1;
            Object objOLrzqt = homeFavoriteListViewModel.OLrzqt(homeToken, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            interfaceC28457kbD = interfaceC28457kbD2;
            objM7386unboximpl = objOLrzqt;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC28457kbD = (InterfaceC28457kbD) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        HomeFavoriteListViewModel homeFavoriteListViewModel2 = this.this$0;
        HomeToken homeToken2 = this.$token;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            ((Boolean) objM7386unboximpl).booleanValue();
            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) ((InterfaceC28457kbD.StateListAnimator) interfaceC28457kbD).KWHzl().KWHzl());
            List listFJNWhG2 = CollectionsKt___CollectionsKt.fJNWhG((Collection) homeFavoriteListViewModel2.DbNXlk);
            int iIndexOf = listFJNWhG.indexOf(homeToken2);
            int iIndexOf2 = listFJNWhG2.indexOf(homeToken2);
            if (iIndexOf != -1) {
                if (iIndexOf2 != -1) {
                    listFJNWhG2.remove(iIndexOf2);
                    listFJNWhG2.add(0, homeToken2);
                    homeFavoriteListViewModel2.DbNXlk = listFJNWhG2;
                }
                listFJNWhG.remove(iIndexOf);
                listFJNWhG.add(0, homeToken2);
                homeFavoriteListViewModel2.EZpvd.setValue(new InterfaceC28457kbD.StateListAnimator(new C28456kbC(listFJNWhG, false), false));
            }
            HomeFavoriteListViewModel.loadData$default(homeFavoriteListViewModel2, false, false, false, 7, null);
        }
        HomeFavoriteListViewModel homeFavoriteListViewModel3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
            homeFavoriteListViewModel3.AEQbTJ.setValue(C56443yFo.AEQbTJ(C23274hvD.Fragment.UscePu));
            homeFavoriteListViewModel3.isConnected();
        }
        return Unit.INSTANCE;
    }
}
