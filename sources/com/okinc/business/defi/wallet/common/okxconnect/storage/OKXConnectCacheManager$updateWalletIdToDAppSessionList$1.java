package com.okinc.business.defi.wallet.common.okxconnect.storage;

import android.content.SharedPreferences;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import java.util.List;
import java.util.Map;
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
public final class OKXConnectCacheManager$updateWalletIdToDAppSessionList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, List<DAppSession>> $newList;
    int label;
    final /* synthetic */ C16011ebq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OKXConnectCacheManager$updateWalletIdToDAppSessionList$1(C16011ebq c16011ebq, Map<String, ? extends List<DAppSession>> map, Continuation<? super OKXConnectCacheManager$updateWalletIdToDAppSessionList$1> continuation) {
        super(2, continuation);
        this.this$0 = c16011ebq;
        this.$newList = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectCacheManager$updateWalletIdToDAppSessionList$1(this.this$0, this.$newList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectCacheManager$updateWalletIdToDAppSessionList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C16011ebq c16011ebq = this.this$0;
            this.label = 1;
            obj = c16011ebq.KWHzl((Continuation<? super SharedPreferences>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        SharedPreferences sharedPreferences = (SharedPreferences) obj;
        if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString("KEY_OKXC_SESSION_LIST", C33489mxS.KWHzl.KWHzl(this.this$0.KWHzl, this.$newList))) != null) {
            editorPutString.apply();
        }
        return Unit.INSTANCE;
    }
}
