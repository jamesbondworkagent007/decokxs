package com.okinc.business.dex.trade.component.walletorderlist.ui.viewmodel;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.trade.order.domain.model.OpenOrderData;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C20064gZo;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56532yIw;
import o.gRD;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPageOderListViewModel$loadMoreOrderList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WalletPageOderListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPageOderListViewModel$loadMoreOrderList$1(WalletPageOderListViewModel walletPageOderListViewModel, Continuation<? super WalletPageOderListViewModel$loadMoreOrderList$1> continuation) {
        super(2, continuation);
        this.this$0 = walletPageOderListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletPageOderListViewModel$loadMoreOrderList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletPageOderListViewModel$loadMoreOrderList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object value;
        boolean z;
        gRD actionBar;
        Object value2;
        Object value3;
        Object value4;
        List<Object> listKWHzl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WalletPageOderListViewModel walletPageOderListViewModel = this.this$0;
            this.label = 1;
            objCopydefault = walletPageOderListViewModel.copydefault((Continuation<? super Result<OrderListPagerResult<OpenOrderData>>>) this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        WalletPageOderListViewModel walletPageOderListViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            OrderListPagerResult orderListPagerResult = (OrderListPagerResult) objCopydefault;
            gRD.Application applicationCopydefault = walletPageOderListViewModel2.copydefault();
            List listFJNWhG = (applicationCopydefault == null || (listKWHzl = applicationCopydefault.KWHzl()) == null) ? null : CollectionsKt___CollectionsKt.fJNWhG((Collection) listKWHzl);
            List list = C56532yIw.DbNXlk(listFJNWhG) ? listFJNWhG : null;
            if (list == null) {
                MutableStateFlow mutableStateFlow = walletPageOderListViewModel2.EZpvd;
                do {
                    value4 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value4, gRD.FragmentManager.copydefault));
            } else {
                List dataList = orderListPagerResult.getDataList();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(dataList, 10));
                Iterator it = dataList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C20064gZo.Companion.OLrzqt((OpenOrderData) it.next(), walletPageOderListViewModel2.AYXKKw.KWHzl()));
                }
                list.addAll(arrayList);
                List listAEQbTJ = walletPageOderListViewModel2.KWHzl.AEQbTJ(list);
                if (listAEQbTJ.isEmpty()) {
                    MutableStateFlow mutableStateFlow2 = walletPageOderListViewModel2.EZpvd;
                    do {
                        value3 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value3, gRD.TaskDescription.OLrzqt));
                }
                MutableStateFlow mutableStateFlow3 = walletPageOderListViewModel2.EZpvd;
                do {
                    value2 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value2, new gRD.Application(listAEQbTJ, orderListPagerResult.getHasNext())));
            }
        }
        WalletPageOderListViewModel walletPageOderListViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow4 = walletPageOderListViewModel3.EZpvd;
            do {
                value = mutableStateFlow4.getValue();
                boolean z2 = thM7380exceptionOrNullimpl instanceof WalletJwtException;
                if (z2 || ((thM7380exceptionOrNullimpl instanceof OKServerException) && (((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException))) {
                    if (z2) {
                        z = true;
                    } else {
                        z = thM7380exceptionOrNullimpl instanceof OKServerException ? ((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException : false;
                    }
                    actionBar = new gRD.ActionBar(z);
                } else {
                    actionBar = gRD.FragmentManager.copydefault;
                }
            } while (!mutableStateFlow4.compareAndSet(value, actionBar));
        }
        return Unit.INSTANCE;
    }
}
