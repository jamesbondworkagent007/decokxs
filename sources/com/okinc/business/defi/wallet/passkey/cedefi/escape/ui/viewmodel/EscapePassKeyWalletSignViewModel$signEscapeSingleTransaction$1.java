package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignAddressData;
import com.okinc.business.defi.wallet.passkey.common.bean.EscapePasskeyWalletInfoReq;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.KSerializer;
import o.C17652fNg;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.fLT;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletSignViewModel$signEscapeSingleTransaction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fLT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletSignViewModel$signEscapeSingleTransaction$1(fLT flt, Continuation<? super EscapePassKeyWalletSignViewModel$signEscapeSingleTransaction$1> continuation) {
        super(2, continuation);
        this.this$0 = flt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletSignViewModel$signEscapeSingleTransaction$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletSignViewModel$signEscapeSingleTransaction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.copydefault.setValue(new InterfaceC49371unL.ActionBar(null, 1, null));
                fLT flt = this.this$0;
                Result.Application application = Result.Companion;
                C17652fNg c17652fNg = flt.gEmmrt;
                KSerializer<EscapePasskeyWalletInfoReq> kSerializerSerializer = EscapePasskeyWalletInfoReq.Companion.serializer();
                EscapePasskeyWalletInfoReq escapePasskeyWalletInfoReq = new EscapePasskeyWalletInfoReq(0, ((EscapeSignAddressData) flt.AYXKKw.get(flt.djBIcL)).getChainAddress(), C33129mqd.gEmmrt(C56443yFo.KWHzl(((EscapeSignAddressData) flt.AYXKKw.get(flt.djBIcL)).getChainIndex())), flt.AhwBna, flt.fetchVPNInfo, 1, (DefaultConstructorMarker) null);
                this.label = 1;
                objEZpvd = c17652fNg.EZpvd("20305", kSerializerSerializer, escapePasskeyWalletInfoReq, this);
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
            objM7377constructorimpl = Result.m7377constructorimpl((PasskeyWalletCreateUopRes) objEZpvd);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        fLT flt2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            flt2.copydefault.setValue(new InterfaceC49371unL.Activity((PasskeyWalletCreateUopRes) objM7377constructorimpl));
        }
        fLT flt3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            flt3.copydefault.setValue(new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null));
        }
        return Unit.INSTANCE;
    }
}
