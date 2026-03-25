package com.okinc.business.defi.wallet.common.okxconnect.storage;

import android.content.SharedPreferences;
import com.okinc.business.defi.wallet.common.okxconnect.util.Ed25519KeyPair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C16011ebq;
import o.C33489mxS;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectCacheManager$updateWebSocketJwtKeyPair$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ed25519KeyPair $newKeyPair;
    Object L$0;
    int label;
    final /* synthetic */ C16011ebq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectCacheManager$updateWebSocketJwtKeyPair$1(Ed25519KeyPair ed25519KeyPair, C16011ebq c16011ebq, Continuation<? super OKXConnectCacheManager$updateWebSocketJwtKeyPair$1> continuation) {
        super(2, continuation);
        this.$newKeyPair = ed25519KeyPair;
        this.this$0 = c16011ebq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectCacheManager$updateWebSocketJwtKeyPair$1(this.$newKeyPair, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectCacheManager$updateWebSocketJwtKeyPair$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ed25519KeyPair ed25519KeyPair = this.$newKeyPair;
            String strKWHzl = ed25519KeyPair != null ? C33489mxS.KWHzl.KWHzl(Ed25519KeyPair.Companion.serializer(), ed25519KeyPair) : null;
            C16011ebq c16011ebq = this.this$0;
            this.L$0 = strKWHzl;
            this.label = 1;
            Object objKWHzl = c16011ebq.KWHzl((Continuation<? super SharedPreferences>) this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            str = strKWHzl;
            obj = objKWHzl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        SharedPreferences sharedPreferences = (SharedPreferences) obj;
        if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString("KEY_OKXC_JWT_KEYPAIR", str)) != null) {
            editorPutString.apply();
        }
        return Unit.INSTANCE;
    }
}
