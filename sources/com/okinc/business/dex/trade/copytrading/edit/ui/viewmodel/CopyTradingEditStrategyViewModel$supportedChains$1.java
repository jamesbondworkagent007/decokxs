package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.kUO;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyViewModel$supportedChains$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Result<? extends List<? extends DefiChainInfo>>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CopyTradingEditStrategyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyViewModel$supportedChains$1(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, Continuation<? super CopyTradingEditStrategyViewModel$supportedChains$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyViewModel$supportedChains$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Result<? extends List<DefiChainInfo>>> continuation) {
        return ((CopyTradingEditStrategyViewModel$supportedChains$1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Result<? extends List<? extends DefiChainInfo>>> continuation) {
        return invoke(num.intValue(), (Continuation<? super Result<? extends List<DefiChainInfo>>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel;
        String strEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                copyTradingEditStrategyViewModel = (CopyTradingEditStrategyViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel2 = this.this$0;
                Result.Application application = Result.Companion;
                kUO kuo = copyTradingEditStrategyViewModel2.getNewProxyInstance;
                this.L$0 = copyTradingEditStrategyViewModel2;
                this.label = 1;
                Object objKWHzl = kuo.KWHzl(this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                copyTradingEditStrategyViewModel = copyTradingEditStrategyViewModel2;
                obj = objKWHzl;
            }
            Iterable iterable = (Iterable) ((AbstractC43419rot) obj).AEQbTJ();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (((DefiChainInfo) obj2).getSupportCopyTradeCreate()) {
                    arrayList.add(obj2);
                }
            }
            MutableStateFlow mutableStateFlow = copyTradingEditStrategyViewModel.isConnected;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((Object) ((DefiChainInfo) it.next()).getChainId(), (Object) copyTradingEditStrategyViewModel.EZpvd())) {
                        strEZpvd = copyTradingEditStrategyViewModel.EZpvd();
                        break;
                    }
                }
            }
            DefiChainInfo defiChainInfo = (DefiChainInfo) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            strEZpvd = defiChainInfo != null ? defiChainInfo.getChainId() : null;
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            mutableStateFlow.setValue(strEZpvd);
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
