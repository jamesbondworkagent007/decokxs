package com.okinc.business.market.features.jwt.domain;

import com.okinc.business.market.data.model.AddressLoginResponse;
import com.okinc.business.market.data.model.position_pnl.AddressLoginRequest;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27612jyV;
import o.C28595kdj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC27595jyE;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.jwt.domain.AddressLoginUseCase$login-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AddressLoginUseCase$logingIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ AddressLoginRequest $request$inlined;
    int label;
    final /* synthetic */ C28595kdj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressLoginUseCase$logingIAlus$$inlined$dexRunCatching$1(Continuation continuation, C28595kdj c28595kdj, AddressLoginRequest addressLoginRequest) {
        super(2, continuation);
        this.this$0 = c28595kdj;
        this.$request$inlined = addressLoginRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressLoginUseCase$logingIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$request$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return ((AddressLoginUseCase$logingIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.AEQbTJ;
            AddressLoginRequest addressLoginRequest = this.$request$inlined;
            this.label = 1;
            obj = interfaceC27595jyE.AEQbTJ(addressLoginRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                boolKWHzl = C56443yFo.KWHzl(((Boolean) obj).booleanValue());
                objM7377constructorimpl = Result.m7377constructorimpl(boolKWHzl);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
        }
        AddressLoginResponse addressLoginResponse = (AddressLoginResponse) ((ResponseData) obj).getData();
        boolKWHzl = null;
        if (addressLoginResponse != null) {
            C27612jyV c27612jyV = this.this$0.EZpvd;
            AddressLoginRequest addressLoginRequest2 = this.$request$inlined;
            String strOLrzqt = addressLoginRequest2 != null ? addressLoginRequest2.OLrzqt() : null;
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            this.label = 2;
            obj = c27612jyV.OLrzqt(strOLrzqt, addressLoginResponse, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            boolKWHzl = C56443yFo.KWHzl(((Boolean) obj).booleanValue());
        }
        objM7377constructorimpl = Result.m7377constructorimpl(boolKWHzl);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
