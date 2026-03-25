package com.okinc.business.defi.wallet.passkey.cedefi.transaction.viewmodel;

import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopReq;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSignedMsg;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C17657fNl;
import o.C56391yDq;
import o.C56442yFn;
import o.fMC;

/* JADX INFO: loaded from: classes23.dex */
public final class SignAndSendTransactionViewModel$sendUop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyWalletSignedMsg $signedMsg;
    Object L$0;
    int label;
    final /* synthetic */ fMC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignAndSendTransactionViewModel$sendUop$1(fMC fmc, PasskeyWalletSignedMsg passkeyWalletSignedMsg, Continuation<? super SignAndSendTransactionViewModel$sendUop$1> continuation) {
        super(2, continuation);
        this.this$0 = fmc;
        this.$signedMsg = passkeyWalletSignedMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignAndSendTransactionViewModel$sendUop$1(this.this$0, this.$signedMsg, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignAndSendTransactionViewModel$sendUop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String uopHash;
        String str;
        Object objKWHzl;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result<PasskeyWalletCreateUopRes> value = this.this$0.OLrzqt().getValue();
            if (value != null) {
                Object objM7386unboximpl = value.m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                PasskeyWalletCreateUopRes passkeyWalletCreateUopRes = (PasskeyWalletCreateUopRes) objM7386unboximpl;
                if (passkeyWalletCreateUopRes != null) {
                    uopHash = passkeyWalletCreateUopRes.getUopHash();
                }
                if (uopHash == null) {
                    uopHash = "";
                }
                str = uopHash;
                C17657fNl c17657fNl = this.this$0.gEmmrt;
                String strKWHzl = this.this$0.KWHzl();
                PasskeyWalletSendUopReq passkeyWalletSendUopReq = new PasskeyWalletSendUopReq(this.$signedMsg, str, 0, 4, (DefaultConstructorMarker) null);
                this.L$0 = str;
                this.label = 1;
                objKWHzl = c17657fNl.KWHzl(strKWHzl, passkeyWalletSendUopReq, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            }
            uopHash = null;
            if (uopHash == null) {
            }
            str = uopHash;
            C17657fNl c17657fNl2 = this.this$0.gEmmrt;
            String strKWHzl2 = this.this$0.KWHzl();
            PasskeyWalletSendUopReq passkeyWalletSendUopReq2 = new PasskeyWalletSendUopReq(this.$signedMsg, str, 0, 4, (DefaultConstructorMarker) null);
            this.L$0 = str;
            this.label = 1;
            objKWHzl = c17657fNl2.KWHzl(strKWHzl2, passkeyWalletSendUopReq2, this);
            if (objKWHzl == objCopydefault) {
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objKWHzl)) {
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
            if (thM7380exceptionOrNullimpl instanceof OKServerException) {
                OKServerException oKServerExceptionOLrzqt = this.this$0.OLrzqt((OKServerException) thM7380exceptionOrNullimpl);
                MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
                Result.Application application = Result.Companion;
                Result resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(oKServerExceptionOLrzqt)));
                this.L$0 = null;
                this.label = 2;
                if (mutableSharedFlow.emit(resultM7376boximpl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }
        MutableSharedFlow mutableSharedFlow2 = this.this$0.copydefault;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(str);
        } else {
            objM7377constructorimpl = Result.m7377constructorimpl(objKWHzl);
        }
        Result resultM7376boximpl2 = Result.m7376boximpl(objM7377constructorimpl);
        this.L$0 = null;
        this.label = 3;
        if (mutableSharedFlow2.emit(resultM7376boximpl2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
