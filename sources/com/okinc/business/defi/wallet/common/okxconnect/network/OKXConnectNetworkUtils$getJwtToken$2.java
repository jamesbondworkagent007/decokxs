package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.okinc.business.defi.wallet.common.okxconnect.util.Ed25519KeyPair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C16000ebf;
import o.C16011ebq;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$getJwtToken$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$getJwtToken$2(C16000ebf c16000ebf, Continuation<? super OKXConnectNetworkUtils$getJwtToken$2> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectNetworkUtils$getJwtToken$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((OKXConnectNetworkUtils$getJwtToken$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #0 {Exception -> 0x0072, blocks: (B:7:0x0013, B:26:0x0055, B:30:0x0066, B:32:0x006a, B:11:0x001f, B:17:0x0035, B:19:0x0039, B:22:0x0042, B:14:0x0026), top: B:37:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ed25519KeyPair ed25519KeyPair;
        String strInvokeSuspend$generateJwt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C16011ebq c16011ebq = this.this$0.DbNXlk;
                this.label = 1;
                obj = c16011ebq.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ed25519KeyPair = (Ed25519KeyPair) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    if (invokeSuspend$isValidJwt(this.this$0, (String) obj, ed25519KeyPair.KWHzl())) {
                        obj = null;
                    }
                    strInvokeSuspend$generateJwt = (String) obj;
                    if (strInvokeSuspend$generateJwt == null) {
                        strInvokeSuspend$generateJwt = invokeSuspend$generateJwt(this.this$0, ed25519KeyPair);
                    }
                    return strInvokeSuspend$generateJwt;
                }
                C56391yDq.AEQbTJ(obj);
            }
            Ed25519KeyPair ed25519KeyPairInvokeSuspend$generateKeypair = (Ed25519KeyPair) obj;
            if (ed25519KeyPairInvokeSuspend$generateKeypair == null && (ed25519KeyPairInvokeSuspend$generateKeypair = invokeSuspend$generateKeypair(this.this$0)) == null) {
                return null;
            }
            C16011ebq c16011ebq2 = this.this$0.DbNXlk;
            this.L$0 = ed25519KeyPairInvokeSuspend$generateKeypair;
            this.label = 2;
            Object objEZpvd = c16011ebq2.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            ed25519KeyPair = ed25519KeyPairInvokeSuspend$generateKeypair;
            obj = objEZpvd;
            if (invokeSuspend$isValidJwt(this.this$0, (String) obj, ed25519KeyPair.KWHzl())) {
            }
            strInvokeSuspend$generateJwt = (String) obj;
            if (strInvokeSuspend$generateJwt == null) {
            }
            return strInvokeSuspend$generateJwt;
        } catch (Exception e) {
            pUU.AEQbTJ("OKXConnectNetworkUtils", "Error generating jwt " + e.getMessage(), e);
            return null;
        }
    }

    private static final Ed25519KeyPair invokeSuspend$generateKeypair(C16000ebf c16000ebf) {
        Ed25519KeyPair ed25519KeyPairAEQbTJ = c16000ebf.AEQbTJ.AEQbTJ();
        c16000ebf.DbNXlk.EZpvd(ed25519KeyPairAEQbTJ);
        return ed25519KeyPairAEQbTJ;
    }

    private static final String invokeSuspend$generateJwt(C16000ebf c16000ebf, Ed25519KeyPair ed25519KeyPair) {
        String strKWHzl = c16000ebf.djBIcL.KWHzl(ed25519KeyPair);
        c16000ebf.DbNXlk.AEQbTJ(strKWHzl);
        return strKWHzl;
    }

    private static final boolean invokeSuspend$isValidJwt(C16000ebf c16000ebf, String str, byte[] bArr) {
        if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return false;
        }
        return c16000ebf.djBIcL.KWHzl(str, bArr);
    }
}
