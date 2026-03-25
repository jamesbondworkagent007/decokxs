package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeStatus;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAccountBean;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAccountInfoRes;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.fJP;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletCheckStatusViewModel$getEscapeStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EscapePassKeyWalletCheckStatusViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletCheckStatusViewModel$getEscapeStatus$1(EscapePassKeyWalletCheckStatusViewModel escapePassKeyWalletCheckStatusViewModel, Continuation<? super EscapePassKeyWalletCheckStatusViewModel$getEscapeStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = escapePassKeyWalletCheckStatusViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletCheckStatusViewModel$getEscapeStatus$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletCheckStatusViewModel$getEscapeStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.KWHzl.setValue(new InterfaceC49371unL.ActionBar(null, 1, null));
                EscapePassKeyWalletCheckStatusViewModel escapePassKeyWalletCheckStatusViewModel = this.this$0;
                Result.Application application = Result.Companion;
                fJP fjp = escapePassKeyWalletCheckStatusViewModel.EZpvd;
                int value = AccountType.CeDeFi.getValue();
                this.label = 1;
                objEZpvd = fjp.EZpvd(value, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objEZpvd);
            objM7377constructorimpl = Result.m7377constructorimpl((PasskeyWalletAccountInfoRes) objEZpvd);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        EscapePassKeyWalletCheckStatusViewModel escapePassKeyWalletCheckStatusViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            PasskeyWalletAccountBean passkeyWalletAccountBean = (PasskeyWalletAccountBean) CollectionsKt___CollectionsKt.firstOrNull(((PasskeyWalletAccountInfoRes) objM7377constructorimpl).getAccountList());
            MutableStateFlow mutableStateFlow = escapePassKeyWalletCheckStatusViewModel2.KWHzl;
            if ((passkeyWalletAccountBean == null || passkeyWalletAccountBean.getStatus() != EscapeStatus.ESCAPE_STATUS_ESCAPED.getValue()) && (passkeyWalletAccountBean == null || passkeyWalletAccountBean.getStatus() != EscapeStatus.ESCAPE_STATUS_ESCAPING.getValue())) {
                z = false;
            }
            mutableStateFlow.setValue(new InterfaceC49371unL.Activity(C56443yFo.KWHzl(z)));
        }
        EscapePassKeyWalletCheckStatusViewModel escapePassKeyWalletCheckStatusViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            escapePassKeyWalletCheckStatusViewModel3.KWHzl.setValue(new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null));
        }
        return Unit.INSTANCE;
    }
}
