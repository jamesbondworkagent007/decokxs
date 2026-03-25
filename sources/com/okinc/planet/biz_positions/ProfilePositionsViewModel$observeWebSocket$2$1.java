package com.okinc.planet.biz_positions;

import com.google.gson.JsonObject;
import com.okinc.planet.biz_positions.data.Position;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.serialization.internal.ArrayListSerializer;
import o.AbstractC46197tLk;
import o.C33129mqd;
import o.C46055tGd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56407yEf;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.InterfaceC46072tGu;
import o.tWG;
import o.yDY;
import o.yET;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfilePositionsViewModel$observeWebSocket$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C46055tGd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePositionsViewModel$observeWebSocket$2$1(C46055tGd c46055tGd, Continuation<? super ProfilePositionsViewModel$observeWebSocket$2$1> continuation) {
        super(2, continuation);
        this.this$0 = c46055tGd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfilePositionsViewModel$observeWebSocket$2$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfilePositionsViewModel$observeWebSocket$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tWG twg = this.this$0.AYXKKw;
            JsonObject jsonObject = new JsonObject();
            String strAEQbTJ = this.this$0.AEQbTJ();
            Intrinsics.copydefault((Object) strAEQbTJ);
            jsonObject.addProperty("uniqueName", strAEQbTJ);
            Unit unit = Unit.INSTANCE;
            SharedFlow sharedFlowEZpvd = twg.EZpvd(new ArrayListSerializer(Position.Companion.serializer()), new WsArgV5("community-positions", null, null, null, null, null, null, jsonObject, WebSocketProtocol.PAYLOAD_SHORT, null));
            final C46055tGd c46055tGd = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_positions.ProfilePositionsViewModel$observeWebSocket$2$1.5

                /* JADX INFO: renamed from: com.okinc.planet.biz_positions.ProfilePositionsViewModel$observeWebSocket$2$1$5$ActionBar */
                public static final class ActionBar<T> implements Comparator {
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return yET.KWHzl(((InterfaceC46072tGu.Activity) t2).gEmmrt(), ((InterfaceC46072tGu.Activity) t).gEmmrt());
                    }
                }

                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<Position> list, Continuation<? super Unit> continuation) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (T t : list) {
                        if (C33129mqd.OLrzqt(((Position) t).getPos(), C56443yFo.AEQbTJ(0))) {
                            arrayList.add(t);
                        } else {
                            arrayList2.add(t);
                        }
                    }
                    Pair pair = new Pair(arrayList, arrayList2);
                    List list2 = (List) pair.component1();
                    List list3 = (List) pair.component2();
                    ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((Position) it.next()).getPosId());
                    }
                    Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList3);
                    List listAhwBna = (List) ((AbstractC46197tLk) c46055tGd.EZpvd.getValue()).copydefault();
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
                    Iterator<T> it2 = listAhwBna.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((InterfaceC46072tGu.Activity) it2.next()).ejfBZ());
                    }
                    Set setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    for (T t2 : list3) {
                        if (setOqFWZa2.contains(((Position) t2).getPosId())) {
                            arrayList5.add(t2);
                        } else {
                            arrayList6.add(t2);
                        }
                    }
                    Pair pair2 = new Pair(arrayList5, arrayList6);
                    List list4 = (List) pair2.component1();
                    List list5 = (List) pair2.component2();
                    C46055tGd c46055tGd2 = c46055tGd;
                    ArrayList arrayList7 = new ArrayList(C56403yEb.AYXKKw(list4, 10));
                    Iterator<T> it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList7.add(c46055tGd2.values.AEQbTJ((Position) it3.next()));
                    }
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj2 : arrayList7) {
                        if (true ^ listAhwBna.contains((InterfaceC46072tGu.Activity) obj2)) {
                            arrayList8.add(obj2);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList8, 10)), 16));
                    for (T t3 : arrayList8) {
                        linkedHashMap.put(((InterfaceC46072tGu.Activity) t3).ejfBZ(), t3);
                    }
                    ArrayList<InterfaceC46072tGu.Activity> arrayList9 = new ArrayList();
                    for (T t4 : listAhwBna) {
                        if (!setOqFWZa.contains(((InterfaceC46072tGu.Activity) t4).ejfBZ())) {
                            arrayList9.add(t4);
                        }
                    }
                    ArrayList arrayList10 = new ArrayList(C56403yEb.AYXKKw(arrayList9, 10));
                    for (InterfaceC46072tGu.Activity activity : arrayList9) {
                        arrayList10.add((InterfaceC46072tGu.Activity) linkedHashMap.getOrDefault(activity.ejfBZ(), activity));
                    }
                    List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList10);
                    C46055tGd c46055tGd3 = c46055tGd;
                    ArrayList arrayList11 = new ArrayList(C56403yEb.AYXKKw(list5, 10));
                    Iterator<T> it4 = list5.iterator();
                    while (it4.hasNext()) {
                        arrayList11.add(c46055tGd3.values.AEQbTJ((Position) it4.next()));
                    }
                    listFJNWhG.addAll(arrayList11);
                    if (listFJNWhG.size() > 1) {
                        C56407yEf.copydefault(listFJNWhG, new ActionBar());
                    }
                    C46055tGd c46055tGd4 = c46055tGd;
                    if ((!setOqFWZa.isEmpty()) || (!list5.isEmpty()) || (!linkedHashMap.isEmpty())) {
                        c46055tGd4.EZpvd.setValue(AbstractC46197tLk.Companion.KWHzl(listFJNWhG));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
