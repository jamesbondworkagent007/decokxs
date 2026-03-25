package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeStatus;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAccountBean;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAccountInfoRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAddressBean;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.fJP;
import o.fLJ;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletSetAddressViewModel$getEscapeAddressNetworkInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EscapePassKeyWalletSetAddressViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletSetAddressViewModel$getEscapeAddressNetworkInfo$1(EscapePassKeyWalletSetAddressViewModel escapePassKeyWalletSetAddressViewModel, Continuation<? super EscapePassKeyWalletSetAddressViewModel$getEscapeAddressNetworkInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = escapePassKeyWalletSetAddressViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletSetAddressViewModel$getEscapeAddressNetworkInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletSetAddressViewModel$getEscapeAddressNetworkInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String chainName;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt.setValue(new InterfaceC49371unL.ActionBar(null, 1, null));
                EscapePassKeyWalletSetAddressViewModel escapePassKeyWalletSetAddressViewModel = this.this$0;
                Result.Application application = Result.Companion;
                fJP fjp = escapePassKeyWalletSetAddressViewModel.KWHzl;
                int value = AccountType.CeDeFi.getValue();
                this.label = 1;
                Object objEZpvd = fjp.EZpvd(value, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objEZpvd;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objM7386unboximpl);
            objM7377constructorimpl = Result.m7377constructorimpl((PasskeyWalletAccountInfoRes) objM7386unboximpl);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        EscapePassKeyWalletSetAddressViewModel escapePassKeyWalletSetAddressViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            PasskeyWalletAccountBean passkeyWalletAccountBean = (PasskeyWalletAccountBean) CollectionsKt___CollectionsKt.firstOrNull(((PasskeyWalletAccountInfoRes) objM7377constructorimpl).getAccountList());
            if (passkeyWalletAccountBean == null || passkeyWalletAccountBean.getStatus() != EscapeStatus.ESCAPE_STATUS_NORMAL.getValue()) {
                escapePassKeyWalletSetAddressViewModel2.OLrzqt.setValue(new InterfaceC49371unL.TaskDescription(null, 1, null));
            } else {
                List<PasskeyWalletAddressBean> addressList = passkeyWalletAccountBean.getAddressList();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : addressList) {
                    if (((PasskeyWalletAddressBean) obj2).getHasDeployed()) {
                        arrayList.add(obj2);
                    }
                }
                escapePassKeyWalletSetAddressViewModel2.copydefault = arrayList;
                List list = escapePassKeyWalletSetAddressViewModel2.copydefault;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list) {
                    Integer numAEQbTJ = C56443yFo.AEQbTJ(((PasskeyWalletAddressBean) obj3).getChainType());
                    Object arrayList2 = linkedHashMap.get(numAEQbTJ);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(numAEQbTJ, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    List list2 = (List) entry.getValue();
                    ArrayList arrayList3 = escapePassKeyWalletSetAddressViewModel2.EZpvd;
                    if (list2.size() > 1) {
                        chainName = escapePassKeyWalletSetAddressViewModel2.KWHzl(iIntValue, (List<PasskeyWalletAddressBean>) list2);
                    } else {
                        PasskeyWalletAddressBean passkeyWalletAddressBean = (PasskeyWalletAddressBean) CollectionsKt___CollectionsKt.firstOrNull(list2);
                        if (passkeyWalletAddressBean == null || (chainName = passkeyWalletAddressBean.getChainName()) == null) {
                            chainName = "Other";
                        }
                    }
                    arrayList3.add(new fLJ(chainName, iIntValue, ((PasskeyWalletAddressBean) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).getChainIndex(), null, false, false, 56, null));
                }
                if (escapePassKeyWalletSetAddressViewModel2.EZpvd.isEmpty()) {
                    escapePassKeyWalletSetAddressViewModel2.OLrzqt.setValue(new InterfaceC49371unL.TaskDescription(null, 1, null));
                } else {
                    escapePassKeyWalletSetAddressViewModel2.OLrzqt.setValue(new InterfaceC49371unL.Activity(escapePassKeyWalletSetAddressViewModel2.EZpvd));
                }
            }
        }
        EscapePassKeyWalletSetAddressViewModel escapePassKeyWalletSetAddressViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            escapePassKeyWalletSetAddressViewModel3.OLrzqt.setValue(new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null));
        }
        return Unit.INSTANCE;
    }
}
