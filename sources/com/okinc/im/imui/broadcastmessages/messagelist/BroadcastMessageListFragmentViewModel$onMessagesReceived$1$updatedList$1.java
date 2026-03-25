package com.okinc.im.imui.broadcastmessages.messagelist;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35254nrp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.oGH;
import o.yDY;
import o.yET;

/* JADX INFO: loaded from: classes23.dex */
public final class BroadcastMessageListFragmentViewModel$onMessagesReceived$1$updatedList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends C35254nrp>>, Object> {
    final /* synthetic */ List<OKMessage> $messages;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ BroadcastMessageListFragmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessageListFragmentViewModel$onMessagesReceived$1$updatedList$1(BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel, List<OKMessage> list, Continuation<? super BroadcastMessageListFragmentViewModel$onMessagesReceived$1$updatedList$1> continuation) {
        super(2, continuation);
        this.this$0 = broadcastMessageListFragmentViewModel;
        this.$messages = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessageListFragmentViewModel$onMessagesReceived$1$updatedList$1(this.this$0, this.$messages, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends C35254nrp>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<C35254nrp>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<C35254nrp>> continuation) {
        return ((BroadcastMessageListFragmentViewModel$onMessagesReceived$1$updatedList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00cd -> B:19:0x00d3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map;
        Iterator it;
        BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) CollectionsKt___CollectionsKt.AuCTelauCTel(this.this$0.KWHzl.getReplayCache()));
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listFJNWhG, 10)), 16));
            for (Object obj2 : listFJNWhG) {
                linkedHashMap.put(C56443yFo.KWHzl(((C35254nrp) obj2).OLrzqt().getSeq()), obj2);
            }
            Map mapIsConnected = C56424yEw.isConnected(linkedHashMap);
            List<OKMessage> list = this.$messages;
            BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel2 = this.this$0;
            map = mapIsConnected;
            it = list.iterator();
            broadcastMessageListFragmentViewModel = broadcastMessageListFragmentViewModel2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            OKMessage oKMessage = (OKMessage) this.L$3;
            Iterator it2 = (Iterator) this.L$2;
            BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel3 = (BroadcastMessageListFragmentViewModel) this.L$1;
            Map map2 = (Map) this.L$0;
            C56391yDq.AEQbTJ(obj);
            OKMessage oKMessage2 = oKMessage;
            it = it2;
            broadcastMessageListFragmentViewModel = broadcastMessageListFragmentViewModel3;
            map = map2;
            Object objEZpvd = obj;
            map.put(C56443yFo.KWHzl(oKMessage2.getSeq()), (C35254nrp) objEZpvd);
            if (it.hasNext()) {
                OKMessage oKMessage3 = (OKMessage) it.next();
                oGH ogh = broadcastMessageListFragmentViewModel.djBIcL;
                this.L$0 = map;
                this.L$1 = broadcastMessageListFragmentViewModel;
                this.L$2 = it;
                this.L$3 = oKMessage3;
                this.label = 1;
                oKMessage2 = oKMessage3;
                Map map3 = map;
                BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel4 = broadcastMessageListFragmentViewModel;
                Iterator it3 = it;
                objEZpvd = ogh.EZpvd(oKMessage3, (256 & 2) != 0 ? yDY.AhwBna() : null, (256 & 4) != 0 ? null : null, (256 & 8) != 0 ? null : null, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? null : null, (256 & 64) != 0 ? null : null, (256 & 128) != 0 ? 0 : null, (256 & 256) != 0 ? null : null, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                map = map3;
                it = it3;
                broadcastMessageListFragmentViewModel = broadcastMessageListFragmentViewModel4;
                map.put(C56443yFo.KWHzl(oKMessage2.getSeq()), (C35254nrp) objEZpvd);
                if (it.hasNext()) {
                    return CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(map.values()), new Activity());
                }
            }
        }
    }

    public static final class Activity<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Long.valueOf(((C35254nrp) t).OLrzqt().getSeq()), Long.valueOf(((C35254nrp) t2).OLrzqt().getSeq()));
        }
    }
}
