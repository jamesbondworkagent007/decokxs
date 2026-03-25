package com.okinc.business.market.features.jwt.domain;

import android.os.Bundle;
import com.okinc.business.market.data.model.position_pnl.AddressLoginRequest;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28595kdj;
import o.C28600kdo;
import o.C28603kdr;
import o.C28605kdt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.jwt.domain.GenericJwtUseCase$login-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GenericJwtUseCase$loginBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ String $address$inlined;
    final /* synthetic */ long $chainId$inlined;
    final /* synthetic */ Bundle $signingResult$inlined;
    int label;
    final /* synthetic */ C28603kdr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericJwtUseCase$loginBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C28603kdr c28603kdr, Bundle bundle, String str, long j) {
        super(2, continuation);
        this.this$0 = c28603kdr;
        this.$signingResult$inlined = bundle;
        this.$address$inlined = str;
        this.$chainId$inlined = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericJwtUseCase$loginBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$signingResult$inlined, this.$address$inlined, this.$chainId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return ((GenericJwtUseCase$loginBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        Object objCopydefault;
        Object objAEQbTJ;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
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
            C28605kdt c28605kdt = this.this$0.AYXKKw;
            Bundle bundle = this.$signingResult$inlined;
            this.label = 1;
            objEZpvd = c28605kdt.EZpvd(bundle, this);
            if (objEZpvd == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objAEQbTJ = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    objM7377constructorimpl = Result.m7377constructorimpl(objAEQbTJ);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objCopydefault)) {
                    obj2 = objCopydefault;
                }
                C28595kdj c28595kdj = this.this$0.copydefault;
                this.label = 3;
                objAEQbTJ = c28595kdj.AEQbTJ((AddressLoginRequest) obj2, this);
                if (objAEQbTJ == objCopydefault2) {
                    return objCopydefault2;
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                objM7377constructorimpl = Result.m7377constructorimpl(objAEQbTJ);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objEZpvd);
        String str = (String) objEZpvd;
        Bundle bundle2 = this.$signingResult$inlined;
        String string = bundle2 != null ? bundle2.getString("publicKey") : null;
        C28600kdo c28600kdo = this.this$0.EZpvd;
        String str2 = this.$address$inlined;
        long j = this.$chainId$inlined;
        if (string == null) {
            string = "";
        }
        String str3 = string;
        this.label = 2;
        objCopydefault = c28600kdo.copydefault(str2, j, str, str3, this);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        if (Result.m7383isFailureimpl(objCopydefault)) {
        }
        C28595kdj c28595kdj2 = this.this$0.copydefault;
        this.label = 3;
        objAEQbTJ = c28595kdj2.AEQbTJ((AddressLoginRequest) obj2, this);
        if (objAEQbTJ == objCopydefault2) {
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        objM7377constructorimpl = Result.m7377constructorimpl(objAEQbTJ);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
