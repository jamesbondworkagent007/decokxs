package com.okinc.okrisk;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C47004thp;
import o.C47005thq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC47027tiL;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskDeviceFingerprintService$profile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $attributes;
    final /* synthetic */ InterfaceC47027tiL $callback;
    final /* synthetic */ OKRiskLibrarySource $source;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRiskDeviceFingerprintService$profile$1(Map<String, String> map, OKRiskLibrarySource oKRiskLibrarySource, InterfaceC47027tiL interfaceC47027tiL, Continuation<? super OKRiskDeviceFingerprintService$profile$1> continuation) {
        super(2, continuation);
        this.$attributes = map;
        this.$source = oKRiskLibrarySource;
        this.$callback = interfaceC47027tiL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKRiskDeviceFingerprintService$profile$1 oKRiskDeviceFingerprintService$profile$1 = new OKRiskDeviceFingerprintService$profile$1(this.$attributes, this.$source, this.$callback, continuation);
        oKRiskDeviceFingerprintService$profile$1.L$0 = obj;
        return oKRiskDeviceFingerprintService$profile$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKRiskDeviceFingerprintService$profile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            try {
                C47005thq c47005thq = C47005thq.KWHzl;
                c47005thq.EZpvd(this.$attributes);
                OKRiskPayloadManager.copydefault.KWHzl(c47005thq.AEQbTJ().copydefault(), C47004thp.EZpvd.EZpvd(this.$source), (8 & 4) != 0 ? null : this.$callback, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : coroutineScope, (8 & 32) != 0 ? OKRiskLibrarySource.UNKNOWN : this.$source);
            } catch (Exception e) {
                pUU.copydefault("OKRiskDeviceFingerprintService", "profile collection failed: " + e.getMessage());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
