package com.okinc.okimcore.facade;

import com.okinc.okimcore.model.im.inhouseim.ws.WSMessageListResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C44489sRs;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class TransactionFacade$loadMissingLookupMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<WSSendMessageDetailData>>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ Set<Long> $lookupMessageSeq;
    final /* synthetic */ C44489sRs $webSocketMessageRepository;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionFacade$loadMissingLookupMessage$2(Set<Long> set, C44489sRs c44489sRs, String str, Continuation<? super TransactionFacade$loadMissingLookupMessage$2> continuation) {
        super(2, continuation);
        this.$lookupMessageSeq = set;
        this.$webSocketMessageRepository = c44489sRs;
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransactionFacade$loadMissingLookupMessage$2 transactionFacade$loadMissingLookupMessage$2 = new TransactionFacade$loadMissingLookupMessage$2(this.$lookupMessageSeq, this.$webSocketMessageRepository, this.$channelId, continuation);
        transactionFacade$loadMissingLookupMessage$2.L$0 = obj;
        return transactionFacade$loadMissingLookupMessage$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<WSSendMessageDetailData>> continuation) {
        return ((TransactionFacade$loadMissingLookupMessage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List listValueOf = CollectionsKt___CollectionsKt.valueOf(this.$lookupMessageSeq, 100);
            C44489sRs c44489sRs = this.$webSocketMessageRepository;
            String str = this.$channelId;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            Iterator it = listValueOf.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new TransactionFacade$loadMissingLookupMessage$2$tasks$1$1(c44489sRs, str, (List) it.next(), null), 3, null));
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
        List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF((Iterable) obj);
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listQfsBiF, 10));
        Iterator it2 = listQfsBiF.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((WSMessageListResponse) it2.next()).EZpvd());
        }
        List listQOLQEE = C56403yEb.QOLQEE(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(listQOLQEE);
        return arrayList3;
    }
}
