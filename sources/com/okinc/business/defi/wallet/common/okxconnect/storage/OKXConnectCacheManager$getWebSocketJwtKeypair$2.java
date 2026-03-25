package com.okinc.business.defi.wallet.common.okxconnect.storage;

import android.content.SharedPreferences;
import com.okinc.business.defi.wallet.common.okxconnect.util.Ed25519KeyPair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.C16011ebq;
import o.C33489mxS;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectCacheManager$getWebSocketJwtKeypair$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Ed25519KeyPair>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C16011ebq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectCacheManager$getWebSocketJwtKeypair$2(C16011ebq c16011ebq, Continuation<? super OKXConnectCacheManager$getWebSocketJwtKeypair$2> continuation) {
        super(2, continuation);
        this.this$0 = c16011ebq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectCacheManager$getWebSocketJwtKeypair$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Ed25519KeyPair> continuation) {
        return ((OKXConnectCacheManager$getWebSocketJwtKeypair$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C33489mxS c33489mxS;
        DeserializationStrategy deserializationStrategy;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                c33489mxS = C33489mxS.KWHzl;
                KSerializer<Ed25519KeyPair> kSerializerSerializer = Ed25519KeyPair.Companion.serializer();
                C16011ebq c16011ebq = this.this$0;
                this.L$0 = c33489mxS;
                this.L$1 = kSerializerSerializer;
                this.label = 1;
                Object objKWHzl = c16011ebq.KWHzl((Continuation<? super SharedPreferences>) this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                deserializationStrategy = kSerializerSerializer;
                obj = objKWHzl;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                deserializationStrategy = (DeserializationStrategy) this.L$1;
                c33489mxS = (C33489mxS) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            SharedPreferences sharedPreferences = (SharedPreferences) obj;
            String str = "";
            String string = sharedPreferences != null ? sharedPreferences.getString("KEY_OKXC_JWT_KEYPAIR", "") : null;
            if (string != null) {
                str = string;
            }
            return (Ed25519KeyPair) c33489mxS.OLrzqt(deserializationStrategy, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
