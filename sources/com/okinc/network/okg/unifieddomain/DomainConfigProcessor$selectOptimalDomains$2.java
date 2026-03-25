package com.okinc.network.okg.unifieddomain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C43381roH;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class DomainConfigProcessor$selectOptimalDomains$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends String>>, Object> {
    final /* synthetic */ String $countryCode;
    final /* synthetic */ List<DomainConfig> $scenarios;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C43381roH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DomainConfigProcessor$selectOptimalDomains$2(List<DomainConfig> list, C43381roH c43381roH, String str, Continuation<? super DomainConfigProcessor$selectOptimalDomains$2> continuation) {
        super(2, continuation);
        this.$scenarios = list;
        this.this$0 = c43381roH;
        this.$countryCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DomainConfigProcessor$selectOptimalDomains$2 domainConfigProcessor$selectOptimalDomains$2 = new DomainConfigProcessor$selectOptimalDomains$2(this.$scenarios, this.this$0, this.$countryCode, continuation);
        domainConfigProcessor$selectOptimalDomains$2.L$0 = obj;
        return domainConfigProcessor$selectOptimalDomains$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Map<String, String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, String>> continuation) {
        return ((DomainConfigProcessor$selectOptimalDomains$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ArrayList arrayList = new ArrayList();
            List<DomainConfig> list = this.$scenarios;
            C43381roH c43381roH = this.this$0;
            String str = this.$countryCode;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DomainConfigProcessor$selectOptimalDomains$2$1$job$1(c43381roH, (DomainConfig) it.next(), str, null), 3, null));
            }
            this.label = 1;
            obj = AwaitKt.awaitAll(arrayList, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Map mapCopydefault = C56424yEw.copydefault((Iterable) obj);
        pUU.KWHzl("DomainConfigProcessor", "selectOptimalDomains, completed: " + mapCopydefault);
        return mapCopydefault;
    }
}
