package com.okinc.network.okg.unifieddomain;

import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C43381roH;
import o.C43461rpi;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43456rpd;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class DomainConfigProcessor$checkDomainAvailability$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<DomainConfigType, Pair<String, String>> $checkMap;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C43381roH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DomainConfigProcessor$checkDomainAvailability$2(Map<DomainConfigType, Pair<String, String>> map, C43381roH c43381roH, Continuation<? super DomainConfigProcessor$checkDomainAvailability$2> continuation) {
        super(2, continuation);
        this.$checkMap = map;
        this.this$0 = c43381roH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DomainConfigProcessor$checkDomainAvailability$2(this.$checkMap, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DomainConfigProcessor$checkDomainAvailability$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a1 -> B:23:0x00a4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator<Map.Entry<DomainConfigType, Pair<String, String>>> it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$checkMap.isEmpty()) {
                return Unit.INSTANCE;
            }
            it = this.$checkMap.entrySet().iterator();
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String first = (String) this.L$2;
        Map.Entry<DomainConfigType, Pair<String, String>> next = (Map.Entry) this.L$1;
        it = (Iterator) this.L$0;
        C56391yDq.AEQbTJ(obj);
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        pUU.KWHzl("DomainConfigProcessor", "checkDomainAvailability, check:" + next + ", connected:" + zBooleanValue);
        C43461rpi.copydefault.copydefault(next.getKey().getTypeName(), first, zBooleanValue);
        while (it.hasNext()) {
            next = it.next();
            first = next.getValue().getFirst();
            String second = next.getValue().getSecond();
            if (!StringsKt__StringsKt.fARcdN((CharSequence) first) && !StringsKt__StringsKt.fARcdN((CharSequence) second)) {
                InterfaceC43456rpd interfaceC43456rpd = this.this$0.OLrzqt;
                CoroutineDispatcher coroutineDispatcher = this.this$0.EZpvd;
                this.L$0 = it;
                this.L$1 = next;
                this.L$2 = first;
                this.label = 1;
                obj = interfaceC43456rpd.OLrzqt(this.this$0.AEQbTJ.build(), first + second, coroutineDispatcher, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                pUU.KWHzl("DomainConfigProcessor", "checkDomainAvailability, check:" + next + ", connected:" + zBooleanValue2);
                C43461rpi.copydefault.copydefault(next.getKey().getTypeName(), first, zBooleanValue2);
                while (it.hasNext()) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
