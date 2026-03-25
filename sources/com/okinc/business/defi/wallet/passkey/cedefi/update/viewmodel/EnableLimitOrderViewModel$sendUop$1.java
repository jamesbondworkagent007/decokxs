package com.okinc.business.defi.wallet.passkey.cedefi.update.viewmodel;

import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopReq;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSignedMsg;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C17657fNl;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.fMW;

/* JADX INFO: loaded from: classes23.dex */
public final class EnableLimitOrderViewModel$sendUop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyWalletSignedMsg $signedMsg;
    Object L$0;
    int label;
    final /* synthetic */ fMW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnableLimitOrderViewModel$sendUop$1(fMW fmw, PasskeyWalletSignedMsg passkeyWalletSignedMsg, Continuation<? super EnableLimitOrderViewModel$sendUop$1> continuation) {
        super(2, continuation);
        this.this$0 = fmw;
        this.$signedMsg = passkeyWalletSignedMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EnableLimitOrderViewModel$sendUop$1(this.this$0, this.$signedMsg, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EnableLimitOrderViewModel$sendUop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result<PasskeyWalletCreateUopRes> value = this.this$0.copydefault().getValue();
            if (value != null) {
                Object objM7386unboximpl = value.m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                PasskeyWalletCreateUopRes passkeyWalletCreateUopRes = (PasskeyWalletCreateUopRes) objM7386unboximpl;
                String uopHash = passkeyWalletCreateUopRes != null ? passkeyWalletCreateUopRes.getUopHash() : null;
                if (uopHash == null) {
                    uopHash = "";
                }
                str = uopHash;
                C17657fNl c17657fNl = this.this$0.AhwBna;
                PasskeyWalletSendUopReq passkeyWalletSendUopReq = new PasskeyWalletSendUopReq(this.$signedMsg, str, 0, 4, (DefaultConstructorMarker) null);
                this.L$0 = str;
                this.label = 1;
                objKWHzl = c17657fNl.KWHzl("20304", passkeyWalletSendUopReq, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        str = (String) this.L$0;
        C56391yDq.AEQbTJ(obj);
        objKWHzl = ((Result) obj).m7386unboximpl();
        MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            Result.Application application = Result.Companion;
            Boolean skipOnChain = ((PasskeyWalletSendUopRes) objKWHzl).getSkipOnChain();
            objKWHzl = C56390yDp.OLrzqt(str, C56443yFo.KWHzl(skipOnChain != null ? skipOnChain.booleanValue() : false));
        }
        Result resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl(objKWHzl));
        this.L$0 = null;
        this.label = 2;
        if (mutableSharedFlow.emit(resultM7376boximpl, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
