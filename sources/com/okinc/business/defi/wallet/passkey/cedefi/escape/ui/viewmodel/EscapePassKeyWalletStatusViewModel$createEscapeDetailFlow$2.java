package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeChainBean;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeDetailDataResp;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedStatusUIData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.fJR;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletStatusViewModel$createEscapeDetailFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends Result<? extends EscapedStatusUIData>>>, Object> {
    int label;
    final /* synthetic */ EscapePassKeyWalletStatusViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletStatusViewModel$createEscapeDetailFlow$2(EscapePassKeyWalletStatusViewModel escapePassKeyWalletStatusViewModel, Continuation<? super EscapePassKeyWalletStatusViewModel$createEscapeDetailFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = escapePassKeyWalletStatusViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletStatusViewModel$createEscapeDetailFlow$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends Result<? extends EscapedStatusUIData>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Flow<Result<EscapedStatusUIData>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Flow<Result<EscapedStatusUIData>>> continuation) {
        return ((EscapePassKeyWalletStatusViewModel$createEscapeDetailFlow$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Result resultM7376boximpl;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                EscapePassKeyWalletStatusViewModel escapePassKeyWalletStatusViewModel = this.this$0;
                Result.Application application = Result.Companion;
                fJR fjr = escapePassKeyWalletStatusViewModel.EZpvd;
                int value = AccountType.CeDeFi.getValue();
                String strKWHzl = escapePassKeyWalletStatusViewModel.KWHzl();
                this.label = 1;
                objOLrzqt = fjr.OLrzqt(value, strKWHzl, this);
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
            C56391yDq.AEQbTJ(objOLrzqt);
            objM7377constructorimpl = Result.m7377constructorimpl((EscapeDetailDataResp) objOLrzqt);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        EscapePassKeyWalletStatusViewModel escapePassKeyWalletStatusViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            EscapeDetailDataResp escapeDetailDataResp = (EscapeDetailDataResp) objM7377constructorimpl;
            List<EscapeChainBean> escapeChainList = escapeDetailDataResp.getEscapeChainList();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(escapeChainList, 10));
            Iterator<T> it = escapeChainList.iterator();
            while (it.hasNext()) {
                arrayList.add(C56443yFo.KWHzl(((EscapeChainBean) it.next()).getOrderId()));
            }
            escapePassKeyWalletStatusViewModel2.copydefault = arrayList;
            Result.Application application3 = Result.Companion;
            resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl(escapePassKeyWalletStatusViewModel2.EZpvd(escapeDetailDataResp)));
        } else {
            Result.Application application4 = Result.Companion;
            resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
        }
        return FlowKt.flowOf(resultM7376boximpl);
    }
}
