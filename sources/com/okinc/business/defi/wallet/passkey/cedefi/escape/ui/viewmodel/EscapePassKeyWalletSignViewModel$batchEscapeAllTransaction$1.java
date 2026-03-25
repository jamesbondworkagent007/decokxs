package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignAddressData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeTransactionData;
import com.okinc.business.defi.wallet.passkey.common.bean.EscapeBatchSendUopBean;
import com.okinc.business.defi.wallet.passkey.common.bean.EscapeBatchSendUopReq;
import com.okinc.business.defi.wallet.passkey.common.bean.EscapeBatchSendUopRes;
import com.okinc.business.defi.wallet.passkey.common.bean.EscapeSingleSendUopBean;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSignedMsg;
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
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.fJO;
import o.fLT;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletSignViewModel$batchEscapeAllTransaction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fLT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletSignViewModel$batchEscapeAllTransaction$1(fLT flt, Continuation<? super EscapePassKeyWalletSignViewModel$batchEscapeAllTransaction$1> continuation) {
        super(2, continuation);
        this.this$0 = flt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletSignViewModel$batchEscapeAllTransaction$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletSignViewModel$batchEscapeAllTransaction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objKWHzl;
        String strOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.EZpvd.setValue(new InterfaceC49371unL.ActionBar(null, 1, null));
                fLT flt = this.this$0;
                Result.Application application = Result.Companion;
                ArrayList<EscapeSignAddressData> arrayList = flt.AYXKKw;
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (EscapeSignAddressData escapeSignAddressData : arrayList) {
                    EscapeTransactionData escapeTransactionData = escapeSignAddressData.getEscapeTransactionData();
                    PasskeyWalletSignedMsg passkeyWalletSignedMsg = new PasskeyWalletSignedMsg(escapeTransactionData != null ? escapeTransactionData.AEQbTJ() : null);
                    EscapeTransactionData escapeTransactionData2 = escapeSignAddressData.getEscapeTransactionData();
                    if (escapeTransactionData2 == null || (strOLrzqt = escapeTransactionData2.OLrzqt()) == null) {
                        strOLrzqt = "";
                    }
                    arrayList2.add(new EscapeSingleSendUopBean(passkeyWalletSignedMsg, strOLrzqt));
                }
                fJO fjo = flt.valueOf;
                EscapeBatchSendUopReq escapeBatchSendUopReq = new EscapeBatchSendUopReq(arrayList2);
                this.label = 1;
                objKWHzl = fjo.KWHzl(escapeBatchSendUopReq, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objKWHzl);
            objM7377constructorimpl = Result.m7377constructorimpl((EscapeBatchSendUopRes) objKWHzl);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        fLT flt2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            List<EscapeBatchSendUopBean> uopList = ((EscapeBatchSendUopRes) objM7377constructorimpl).getUopList();
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(uopList, 10));
            Iterator<T> it = uopList.iterator();
            while (it.hasNext()) {
                arrayList3.add(C56443yFo.KWHzl(((EscapeBatchSendUopBean) it.next()).getOrderId()));
            }
            flt2.EZpvd.setValue(new InterfaceC49371unL.Activity(arrayList3));
        }
        fLT flt3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            flt3.EZpvd.setValue(new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null));
        }
        return Unit.INSTANCE;
    }
}
