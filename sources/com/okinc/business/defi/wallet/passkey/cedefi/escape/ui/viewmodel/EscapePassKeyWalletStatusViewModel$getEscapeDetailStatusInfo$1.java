package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeChainBean;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeDetailDataResp;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedDetailStatus;
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
import o.C13934dbu;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletStatusViewModel$getEscapeDetailStatusInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFromFullScreen;
    int label;
    final /* synthetic */ EscapePassKeyWalletStatusViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletStatusViewModel$getEscapeDetailStatusInfo$1(EscapePassKeyWalletStatusViewModel escapePassKeyWalletStatusViewModel, boolean z, Continuation<? super EscapePassKeyWalletStatusViewModel$getEscapeDetailStatusInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = escapePassKeyWalletStatusViewModel;
        this.$isFromFullScreen = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletStatusViewModel$getEscapeDetailStatusInfo$1(this.this$0, this.$isFromFullScreen, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletStatusViewModel$getEscapeDetailStatusInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt.setValue(new InterfaceC49371unL.ActionBar(C56390yDp.OLrzqt(C56443yFo.KWHzl(this.$isFromFullScreen), new EscapedStatusUIData(EscapedDetailStatus.IN_PROGRESS, yDY.AhwBna(), "", false))));
                EscapePassKeyWalletStatusViewModel escapePassKeyWalletStatusViewModel = this.this$0;
                Result.Application application = Result.Companion;
                C13934dbu c13934dbu = escapePassKeyWalletStatusViewModel.valueOf;
                int value = AccountType.CeDeFi.getValue();
                String strKWHzl = escapePassKeyWalletStatusViewModel.KWHzl();
                this.label = 1;
                objOLrzqt = c13934dbu.OLrzqt(value, strKWHzl, (Continuation<? super Result<EscapeDetailDataResp>>) this);
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
        boolean z = this.$isFromFullScreen;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            EscapeDetailDataResp escapeDetailDataResp = (EscapeDetailDataResp) objM7377constructorimpl;
            EscapedStatusUIData escapedStatusUIDataEZpvd = escapePassKeyWalletStatusViewModel2.EZpvd(escapeDetailDataResp);
            List<EscapeChainBean> escapeChainList = escapeDetailDataResp.getEscapeChainList();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(escapeChainList, 10));
            Iterator<T> it = escapeChainList.iterator();
            while (it.hasNext()) {
                arrayList.add(C56443yFo.KWHzl(((EscapeChainBean) it.next()).getOrderId()));
            }
            escapePassKeyWalletStatusViewModel2.copydefault = arrayList;
            if (escapedStatusUIDataEZpvd.getEscapedAddressTabItem().isEmpty()) {
                escapePassKeyWalletStatusViewModel2.OLrzqt.setValue(new InterfaceC49371unL.TaskDescription(C56390yDp.OLrzqt(C56443yFo.KWHzl(z), escapedStatusUIDataEZpvd)));
            } else {
                escapePassKeyWalletStatusViewModel2.OLrzqt.setValue(new InterfaceC49371unL.Activity(C56390yDp.OLrzqt(C56443yFo.KWHzl(z), escapedStatusUIDataEZpvd)));
            }
        }
        EscapePassKeyWalletStatusViewModel escapePassKeyWalletStatusViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            escapePassKeyWalletStatusViewModel3.OLrzqt.setValue(new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null));
        }
        return Unit.INSTANCE;
    }
}
