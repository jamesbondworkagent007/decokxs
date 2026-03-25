package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C19878gSr;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingBuyInputPanelViewModel$getCurrencyTokenList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $existTokenAddress;
    int label;
    final /* synthetic */ CopyTradingBuyInputPanelViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingBuyInputPanelViewModel$getCurrencyTokenList$1(CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModel, String str, String str2, Continuation<? super CopyTradingBuyInputPanelViewModel$getCurrencyTokenList$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingBuyInputPanelViewModel;
        this.$chainId = str;
        this.$existTokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingBuyInputPanelViewModel$getCurrencyTokenList$1(this.this$0, this.$chainId, this.$existTokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingBuyInputPanelViewModel$getCurrencyTokenList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object obj2;
        Object next;
        Object next2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C19878gSr c19878gSr = this.this$0.DbNXlk;
            String str = this.$chainId;
            this.label = 1;
            objOLrzqt = c19878gSr.OLrzqt(str, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("CopyTradingBuySettingViewModel", "getCurrencyList error", thM7380exceptionOrNullimpl);
        }
        CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModel = this.this$0;
        String str2 = this.$existTokenAddress;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            List list = (List) objOLrzqt;
            copyTradingBuyInputPanelViewModel.values = list;
            MutableStateFlow mutableStateFlow = copyTradingBuyInputPanelViewModel.AEQbTJ;
            Iterator it = list.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((DexMultiTokenInfoBean) next).isMainChainCoin()) {
                    break;
                }
            }
            mutableStateFlow.setValue(next);
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (Intrinsics.EZpvd((Object) ((DexMultiTokenInfoBean) next2).getTokenContractAddress(), (Object) str2)) {
                    break;
                }
            }
            DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) next2;
            if (dexMultiTokenInfoBean == null) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    if (((DexMultiTokenInfoBean) next3).isMainChainCoin()) {
                        obj2 = next3;
                        break;
                    }
                }
                dexMultiTokenInfoBean = (DexMultiTokenInfoBean) obj2;
                if (dexMultiTokenInfoBean == null) {
                    dexMultiTokenInfoBean = (DexMultiTokenInfoBean) CollectionsKt___CollectionsKt.firstOrNull(list);
                }
            }
            copyTradingBuyInputPanelViewModel.EZpvd(dexMultiTokenInfoBean);
        }
        return Unit.INSTANCE;
    }
}
