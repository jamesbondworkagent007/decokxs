package com.okinc.lifecycle.impl.deeplink.service;

import com.okinc.modular.deeplinkv2.LinkSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AVG;
import o.AbstractC2693AVp;
import o.AbstractC43238rlX;
import o.C33077mpe;
import o.C38109pMo;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class CoreDeeplinkService$processDeeplink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $deeplink;
    final /* synthetic */ Map<String, Object> $params;
    final /* synthetic */ Function1<AbstractC43238rlX, Unit> $resultCallback;
    final /* synthetic */ boolean $shouldOpenExternal;
    final /* synthetic */ LinkSource $source;
    int label;
    final /* synthetic */ C38109pMo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super o.rlX, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoreDeeplinkService$processDeeplink$1(String str, Map<String, ? extends Object> map, C38109pMo c38109pMo, LinkSource linkSource, boolean z, Function1<? super AbstractC43238rlX, Unit> function1, Continuation<? super CoreDeeplinkService$processDeeplink$1> continuation) {
        super(2, continuation);
        this.$deeplink = str;
        this.$params = map;
        this.this$0 = c38109pMo;
        this.$source = linkSource;
        this.$shouldOpenExternal = z;
        this.$resultCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoreDeeplinkService$processDeeplink$1(this.$deeplink, this.$params, this.this$0, this.$source, this.$shouldOpenExternal, this.$resultCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoreDeeplinkService$processDeeplink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        } else {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("DeeplinkRustLayer", "processDeeplink called with deeplink: " + this.$deeplink);
            Map<String, Object> map = this.$params;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() instanceof String) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
            }
            AVG avgAEQbTJ = this.this$0.EZpvd.AEQbTJ(this.$deeplink, linkedHashMap2, this.$source.getSource(), this.$shouldOpenExternal);
            C33077mpe c33077mpe = new C33077mpe(new CoreDeeplinkService$processDeeplink$1$wrapper$1(avgAEQbTJ), new CoreDeeplinkService$processDeeplink$1$wrapper$2(avgAEQbTJ), new CoreDeeplinkService$processDeeplink$1$wrapper$3(avgAEQbTJ), new CoreDeeplinkService$processDeeplink$1$wrapper$4(avgAEQbTJ), null, 16, null);
            this.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = null;
        }
        AbstractC2693AVp abstractC2693AVp = (AbstractC2693AVp) objAEQbTJ;
        if (abstractC2693AVp == null || (abstractC2693AVp instanceof AbstractC2693AVp.Application)) {
            this.$resultCallback.invoke(AbstractC43238rlX.Application.AEQbTJ);
        } else {
            this.$resultCallback.invoke(AbstractC43238rlX.StateListAnimator.OLrzqt);
        }
        return Unit.INSTANCE;
    }
}
