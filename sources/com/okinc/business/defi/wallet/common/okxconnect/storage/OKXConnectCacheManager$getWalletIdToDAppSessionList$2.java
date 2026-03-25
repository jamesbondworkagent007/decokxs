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
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.C16011ebq;
import o.C33489mxS;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectCacheManager$getWalletIdToDAppSessionList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends List<? extends DAppSession>>>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C16011ebq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectCacheManager$getWalletIdToDAppSessionList$2(C16011ebq c16011ebq, Continuation<? super OKXConnectCacheManager$getWalletIdToDAppSessionList$2> continuation) {
        super(2, continuation);
        this.this$0 = c16011ebq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectCacheManager$getWalletIdToDAppSessionList$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends List<? extends DAppSession>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Map<String, ? extends List<DAppSession>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends List<DAppSession>>> continuation) {
        return ((OKXConnectCacheManager$getWalletIdToDAppSessionList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                KSerializer kSerializer = this.this$0.KWHzl;
                C16011ebq c16011ebq = this.this$0;
                this.L$0 = c33489mxS;
                this.L$1 = kSerializer;
                this.label = 1;
                Object objKWHzl = c16011ebq.KWHzl((Continuation<? super SharedPreferences>) this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                deserializationStrategy = kSerializer;
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
            String string = sharedPreferences != null ? sharedPreferences.getString("KEY_OKXC_SESSION_LIST", "") : null;
            if (string != null) {
                str = string;
            }
            return (Map) c33489mxS.OLrzqt(deserializationStrategy, str);
        } catch (Exception unused) {
            return C56424yEw.KWHzl();
        }
    }
}
