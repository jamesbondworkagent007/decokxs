package com.okinc.business.defi.wallet.common.okxconnect.storage;

import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C16011ebq;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectCacheManager$removeDAppSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $dAppClientId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C16011ebq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectCacheManager$removeDAppSession$1(C16011ebq c16011ebq, String str, Continuation<? super OKXConnectCacheManager$removeDAppSession$1> continuation) {
        super(2, continuation);
        this.this$0 = c16011ebq;
        this.$dAppClientId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectCacheManager$removeDAppSession$1(this.this$0, this.$dAppClientId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectCacheManager$removeDAppSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Map mapOLrzqt;
        Map map;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) this.L$2;
            mapOLrzqt = (Map) this.L$1;
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            C16011ebq c16011ebq = this.this$0;
            str = this.$dAppClientId;
            mapOLrzqt = C56423yEv.OLrzqt();
            this.L$0 = str;
            this.L$1 = mapOLrzqt;
            this.L$2 = mapOLrzqt;
            this.label = 1;
            obj = c16011ebq.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            map = mapOLrzqt;
        }
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!Intrinsics.EZpvd((Object) ((DAppSession) obj2).getClientId(), (Object) str)) {
                    arrayList.add(obj2);
                }
            }
            map.put(str2, arrayList);
        }
        this.this$0.copydefault((Map<String, ? extends List<DAppSession>>) C56423yEv.AYXKKw(mapOLrzqt));
        return Unit.INSTANCE;
    }
}
