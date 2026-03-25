package com.okinc.business.market.market.fragment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C27903kHp;
import o.C33064mpR;
import o.C33070mpX;
import o.C33129mqd;
import o.C41428qqd;
import o.C44585sZg;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54581xNr;
import o.kFO;
import o.qZH;
import o.xLJ;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class OptionChainFragment$handleTradeResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isSuccess;
    final /* synthetic */ InterfaceC54581xNr $trade;
    int label;
    final /* synthetic */ C27903kHp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainFragment$handleTradeResult$1(boolean z, InterfaceC54581xNr interfaceC54581xNr, C27903kHp c27903kHp, Continuation<? super OptionChainFragment$handleTradeResult$1> continuation) {
        super(2, continuation);
        this.$isSuccess = z;
        this.$trade = interfaceC54581xNr;
        this.this$0 = c27903kHp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionChainFragment$handleTradeResult$1(this.$isSuccess, this.$trade, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionChainFragment$handleTradeResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC54581xNr interfaceC54581xNr;
        Collection collectionAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$isSuccess && (interfaceC54581xNr = this.$trade) != null) {
                this.label = 1;
                obj = interfaceC54581xNr.EZpvd("OPTION", this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        AbstractC54531xLw abstractC54531xLw = (AbstractC54531xLw) obj;
        if (abstractC54531xLw != null && (!this.this$0.KWHzl || this.this$0.fetchVPNInfo.isEmpty())) {
            this.this$0.KWHzl = true;
            C27903kHp c27903kHp = this.this$0;
            xLJ xlj = abstractC54531xLw instanceof xLJ ? (xLJ) abstractC54531xLw : null;
            c27903kHp.AuCTel = xlj != null ? xlj.zsXlph() : null;
            List list = this.this$0.AuCTel;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).getFirst());
                }
                C27903kHp c27903kHp2 = this.this$0;
                List<String> listOLrzqt = C41428qqd.OLrzqt.OLrzqt(arrayList);
                if (true ^ listOLrzqt.isEmpty()) {
                    c27903kHp2.fetchVPNInfo.clear();
                    List list2 = c27903kHp2.AuCTel;
                    if (list2 == null) {
                        collectionAhwBna = yDY.AhwBna();
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (listOLrzqt.contains(((Pair) obj2).getFirst())) {
                                arrayList2.add(obj2);
                            }
                        }
                        collectionAhwBna = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            collectionAhwBna.add((String) ((Pair) it2.next()).getSecond());
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj3 : collectionAhwBna) {
                        String strAEQbTJ = C44585sZg.AEQbTJ((String) obj3).AEQbTJ();
                        Object arrayList3 = linkedHashMap.get(strAEQbTJ);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap.put(strAEQbTJ, arrayList3);
                        }
                        ((List) arrayList3).add(obj3);
                    }
                    if (!C33129mqd.OLrzqt(C56443yFo.AEQbTJ(linkedHashMap.size()), C56443yFo.AEQbTJ(2))) {
                        C56443yFo.KWHzl(c27903kHp2.fetchVPNInfo.addAll(collectionAhwBna));
                    } else {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            String str = (String) entry.getKey();
                            List list3 = (List) entry.getValue();
                            String upperCase = str.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "");
                            if (Intrinsics.EZpvd((Object) upperCase, (Object) "USD")) {
                                c27903kHp2.fetchVPNInfo.add(new kFO(C33070mpX.AYXKKw(qZH.PendingIntent.iWlNch)));
                            } else if (Intrinsics.EZpvd((Object) upperCase, (Object) "USDT")) {
                                c27903kHp2.fetchVPNInfo.add(new kFO(C33070mpX.AYXKKw(qZH.PendingIntent.RWIpjU)));
                            }
                            c27903kHp2.fetchVPNInfo.addAll(list3);
                        }
                    }
                    C33064mpR.OLrzqt(c27903kHp2.valueOf(), (List<? extends Object>) c27903kHp2.fetchVPNInfo);
                    c27903kHp2.AYXKKw();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
