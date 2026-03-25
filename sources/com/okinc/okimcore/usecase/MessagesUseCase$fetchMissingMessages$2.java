package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.im.inhouseim.ws.WSMessageListResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C44502sSe;
import o.C56391yDq;
import o.C56403yEb;
import o.C56406yEe;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$fetchMissingMessages$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WSSendMessageDetailData>>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ List<Long> $missingMessageIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$fetchMissingMessages$2(List<Long> list, C44502sSe c44502sSe, String str, Continuation<? super MessagesUseCase$fetchMissingMessages$2> continuation) {
        super(2, continuation);
        this.$missingMessageIds = list;
        this.this$0 = c44502sSe;
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessagesUseCase$fetchMissingMessages$2 messagesUseCase$fetchMissingMessages$2 = new MessagesUseCase$fetchMissingMessages$2(this.$missingMessageIds, this.this$0, this.$channelId, continuation);
        messagesUseCase$fetchMissingMessages$2.L$0 = obj;
        return messagesUseCase$fetchMissingMessages$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WSSendMessageDetailData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<WSSendMessageDetailData>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<WSSendMessageDetailData>> continuation) {
        return ((MessagesUseCase$fetchMissingMessages$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List listValueOf = CollectionsKt___CollectionsKt.valueOf((Iterable) this.$missingMessageIds, 100);
            C44502sSe c44502sSe = this.this$0;
            String str = this.$channelId;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            Iterator it = listValueOf.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, c44502sSe.AEQbTJ(), null, new MessagesUseCase$fetchMissingMessages$2$tasks$1$1(c44502sSe, str, (List) it.next(), null), 2, null));
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
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listQfsBiF.iterator();
        while (it2.hasNext()) {
            C56406yEe.KWHzl(arrayList2, ((WSMessageListResponse) it2.next()).EZpvd());
        }
        return arrayList2;
    }
}
