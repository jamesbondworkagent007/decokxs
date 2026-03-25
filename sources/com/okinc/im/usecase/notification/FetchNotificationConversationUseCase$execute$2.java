package com.okinc.im.usecase.notification;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.InHouseIMChannelType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.UnViewedNotificationResp;
import com.okinc.okimcore.model.im.conversation.InAppConversationExtra;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C35831oFh;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.rXL;
import o.sGI;

/* JADX INFO: loaded from: classes18.dex */
public final class FetchNotificationConversationUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<rXL> $notificationChannels;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C35831oFh this$0;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InHouseIMChannelType.values().length];
            try {
                iArr[InHouseIMChannelType.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InHouseIMChannelType.Group.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InHouseIMChannelType.Individual.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InHouseIMChannelType.SystemNotification.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchNotificationConversationUseCase$execute$2(List<rXL> list, C35831oFh c35831oFh, Continuation<? super FetchNotificationConversationUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$notificationChannels = list;
        this.this$0 = c35831oFh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FetchNotificationConversationUseCase$execute$2 fetchNotificationConversationUseCase$execute$2 = new FetchNotificationConversationUseCase$execute$2(this.$notificationChannels, this.this$0, continuation);
        fetchNotificationConversationUseCase$execute$2.L$0 = obj;
        return fetchNotificationConversationUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FetchNotificationConversationUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x014a -> B:29:0x0152). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x02a4 -> B:92:0x02a8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map;
        Object objAwait;
        List list;
        UnViewedNotificationResp unViewedNotificationResp;
        List list2;
        Map linkedHashMap;
        Iterator it;
        Map<String, Integer> unviewMap;
        List list3;
        Map<String, Integer> map2;
        Object next;
        Iterator it2;
        Map map3;
        Map<String, Integer> map4;
        C35831oFh c35831oFh;
        com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType inHouseIMChannelType;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) this.$notificationChannels);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FetchNotificationConversationUseCase$execute$2$unreadCountTask$1(this.this$0, this.$notificationChannels, null), 3, null);
            List<rXL> list4 = this.$notificationChannels;
            C35831oFh c35831oFh2 = this.this$0;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list4, 10)), 16));
            for (rXL rxl : list4) {
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                Pair pairOLrzqt = C56390yDp.OLrzqt(rxl.AEQbTJ(), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FetchNotificationConversationUseCase$execute$2$notificationListTasks$1$1(c35831oFh2, rxl, null), 3, null));
                linkedHashMap3.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                linkedHashMap2 = linkedHashMap3;
                c35831oFh2 = c35831oFh2;
            }
            map = linkedHashMap2;
            this.L$0 = listFJNWhG;
            this.L$1 = map;
            this.label = 1;
            objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            list = listFJNWhG;
        } else if (i == 1) {
            Map map5 = (Map) this.L$1;
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            map = map5;
            objAwait = obj;
        } else {
            if (i != 2) {
                if (i == 3) {
                    map2 = (Map) this.L$2;
                    linkedHashMap = (Map) this.L$1;
                    list3 = (List) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    List list5 = list3;
                    unviewMap = map2;
                    list2 = list5;
                    C35831oFh c35831oFh3 = this.this$0;
                    it2 = list2.iterator();
                    map3 = linkedHashMap;
                    map4 = unviewMap;
                    c35831oFh = c35831oFh3;
                    while (it2.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterator it3 = (Iterator) this.L$3;
                C35831oFh c35831oFh4 = (C35831oFh) this.L$2;
                Map<String, Integer> map6 = (Map) this.L$1;
                Map map7 = (Map) this.L$0;
                C56391yDq.AEQbTJ(obj);
                it2 = it3;
                c35831oFh = c35831oFh4;
                map4 = map6;
                map3 = map7;
                while (it2.hasNext()) {
                    rXL rxl2 = (rXL) it2.next();
                    if (rxl2 != null) {
                        int iIntValue = map4.getOrDefault(rxl2.AEQbTJ(), C56443yFo.AEQbTJ(0)).intValue();
                        List list6 = (List) map3.get(rxl2.AEQbTJ());
                        SystemNotification systemNotification = (list6 == null || list6.isEmpty()) ? null : (SystemNotification) CollectionsKt___CollectionsKt.AuCTelauCTel(list6);
                        sGI sgi = c35831oFh.OLrzqt;
                        String strEZpvd = rxl2.EZpvd();
                        int i2 = StateListAnimator.EZpvd[rxl2.valueOf().ordinal()];
                        if (i2 == 1) {
                            inHouseIMChannelType = com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType.Unknown;
                        } else if (i2 == 2) {
                            inHouseIMChannelType = com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType.Group;
                        } else if (i2 == 3) {
                            inHouseIMChannelType = com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType.Individual;
                        } else {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            inHouseIMChannelType = com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType.SystemNotification;
                        }
                        com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType inHouseIMChannelType2 = inHouseIMChannelType;
                        InAppConversationExtra inAppConversationExtra = new InAppConversationExtra(systemNotification != null ? systemNotification.getTitle() : null);
                        Long pushTime = systemNotification != null ? systemNotification.getPushTime() : null;
                        Integer numAEQbTJ = C56443yFo.AEQbTJ(iIntValue);
                        this.L$0 = map3;
                        this.L$1 = map4;
                        this.L$2 = c35831oFh;
                        this.L$3 = it2;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 4;
                        if (sgi.copydefault(strEZpvd, inHouseIMChannelType2, inAppConversationExtra, pushTime, numAEQbTJ, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        it3 = it2;
                        c35831oFh4 = c35831oFh;
                        map6 = map4;
                        map7 = map3;
                        it2 = it3;
                        c35831oFh = c35831oFh4;
                        map4 = map6;
                        map3 = map7;
                        while (it2.hasNext()) {
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            Object obj2 = this.L$5;
            linkedHashMap = (Map) this.L$4;
            Iterator it4 = (Iterator) this.L$3;
            Map map8 = (Map) this.L$2;
            UnViewedNotificationResp unViewedNotificationResp2 = (UnViewedNotificationResp) this.L$1;
            List list7 = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            UnViewedNotificationResp unViewedNotificationResp3 = unViewedNotificationResp2;
            Iterator it5 = it4;
            Map map9 = map8;
            Object objAwait2 = obj;
            linkedHashMap.put(obj2, (List) objAwait2);
            linkedHashMap = map9;
            it = it5;
            list2 = list7;
            unViewedNotificationResp = unViewedNotificationResp3;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                Deferred deferred = (Deferred) entry.getValue();
                this.L$0 = list2;
                this.L$1 = unViewedNotificationResp;
                this.L$2 = linkedHashMap;
                this.L$3 = it;
                this.L$4 = linkedHashMap;
                this.L$5 = key;
                this.label = 2;
                objAwait2 = deferred.await(this);
                if (objAwait2 == objCopydefault) {
                    return objCopydefault;
                }
                unViewedNotificationResp3 = unViewedNotificationResp;
                it5 = it;
                map9 = linkedHashMap;
                list7 = list2;
                obj2 = key;
                linkedHashMap.put(obj2, (List) objAwait2);
                linkedHashMap = map9;
                it = it5;
                list2 = list7;
                unViewedNotificationResp = unViewedNotificationResp3;
                if (it.hasNext()) {
                    unviewMap = unViewedNotificationResp.getUnviewMap();
                    if (unviewMap == null) {
                        unviewMap = C56424yEw.KWHzl();
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    List<rXL> list8 = this.$notificationChannels;
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        String str = (String) entry2.getKey();
                        if (((List) entry2.getValue()).isEmpty()) {
                            Iterator<T> it6 = list8.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it6.next();
                                if (Intrinsics.EZpvd((Object) ((rXL) next).AEQbTJ(), (Object) str)) {
                                    break;
                                }
                            }
                            rXL rxl3 = (rXL) next;
                            if (rxl3 != null) {
                                linkedHashSet.add(rxl3.EZpvd());
                                list2.remove(rxl3);
                            }
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        sGI sgi2 = this.this$0.OLrzqt;
                        this.L$0 = list2;
                        this.L$1 = linkedHashMap;
                        this.L$2 = unviewMap;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 3;
                        if (sgi2.OLrzqt(linkedHashSet, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        Map<String, Integer> map10 = unviewMap;
                        list3 = list2;
                        map2 = map10;
                        List list52 = list3;
                        unviewMap = map2;
                        list2 = list52;
                    }
                    C35831oFh c35831oFh32 = this.this$0;
                    it2 = list2.iterator();
                    map3 = linkedHashMap;
                    map4 = unviewMap;
                    c35831oFh = c35831oFh32;
                    while (it2.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        unViewedNotificationResp = (UnViewedNotificationResp) objAwait;
        list2 = list;
        linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        it = map.entrySet().iterator();
        if (it.hasNext()) {
        }
    }
}
