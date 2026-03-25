package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.trade.copytrading.home.data.CTPositionsResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter;
import com.okinc.network.okg.response.OKServerException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C20009gXn;
import o.C20050gZa;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC20068gZs;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyPositionViewModel$loadPositions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StrategyPositionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyPositionViewModel$loadPositions$1(StrategyPositionViewModel strategyPositionViewModel, Continuation<? super StrategyPositionViewModel$loadPositions$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyPositionViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyPositionViewModel$loadPositions$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrategyPositionViewModel$loadPositions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z2 = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C20009gXn c20009gXn = this.this$0.copydefault;
            String str = this.this$0.djBIcL;
            AdvancedAssetsFilter advancedAssetsFilterCopydefault = this.this$0.copydefault();
            this.label = 1;
            objOLrzqt = c20009gXn.OLrzqt(str, advancedAssetsFilterCopydefault, this);
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
        StrategyPositionViewModel strategyPositionViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            CTPositionsResponse cTPositionsResponse = (CTPositionsResponse) objOLrzqt;
            if (cTPositionsResponse.getPositions().isEmpty()) {
                strategyPositionViewModel.KWHzl.setValue(new InterfaceC20068gZs.ActionBar(false, 1, null));
            } else {
                List<C20050gZa> listEZpvd = C20050gZa.Companion.EZpvd(cTPositionsResponse);
                MutableStateFlow mutableStateFlow = strategyPositionViewModel.AEQbTJ;
                if ((listEZpvd instanceof Collection) && listEZpvd.isEmpty()) {
                    z = false;
                    mutableStateFlow.setValue(C56443yFo.KWHzl(z));
                    strategyPositionViewModel.KWHzl.setValue(new InterfaceC20068gZs.StateListAnimator(listEZpvd, false, null, 4, null));
                } else {
                    Iterator<T> it = listEZpvd.iterator();
                    while (it.hasNext()) {
                        if (((C20050gZa) it.next()).valueOf()) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    mutableStateFlow.setValue(C56443yFo.KWHzl(z));
                    strategyPositionViewModel.KWHzl.setValue(new InterfaceC20068gZs.StateListAnimator(listEZpvd, false, null, 4, null));
                }
            }
        }
        StrategyPositionViewModel strategyPositionViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow2 = strategyPositionViewModel2.KWHzl;
            if (!(thM7380exceptionOrNullimpl instanceof WalletJwtException)) {
                z2 = thM7380exceptionOrNullimpl instanceof OKServerException ? ((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException : false;
            }
            mutableStateFlow2.setValue(new InterfaceC20068gZs.Application(z2));
            strategyPositionViewModel2.AEQbTJ.setValue(C56443yFo.KWHzl(false));
        }
        return Unit.INSTANCE;
    }
}
