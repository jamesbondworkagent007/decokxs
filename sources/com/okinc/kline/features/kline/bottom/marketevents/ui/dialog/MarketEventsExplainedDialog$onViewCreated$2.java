package com.okinc.kline.features.kline.bottom.marketevents.ui.dialog;

import android.content.Context;
import android.view.View;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import com.okinc.kline.features.kline.bottom.marketevents.ui.dialog.MarketEventsExplainedDialog$onViewCreated$2;
import com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventExplainViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C32266mVq;
import o.C33069mpW;
import o.C33129mqd;
import o.C35964oKf;
import o.C43056riA;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.oOP;
import o.oQM;
import o.pFN;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketEventsExplainedDialog$onViewCreated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ oQM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketEventsExplainedDialog$onViewCreated$2(oQM oqm, Continuation<? super MarketEventsExplainedDialog$onViewCreated$2> continuation) {
        super(2, continuation);
        this.this$0 = oqm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketEventsExplainedDialog$onViewCreated$2 marketEventsExplainedDialog$onViewCreated$2 = new MarketEventsExplainedDialog$onViewCreated$2(this.this$0, continuation);
        marketEventsExplainedDialog$onViewCreated$2.L$0 = obj;
        return marketEventsExplainedDialog$onViewCreated$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketEventsExplainedDialog$onViewCreated$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final oQM oqm;
        ArrayList arrayList;
        CoroutineScope coroutineScope;
        List<String> listOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        ArrayList arrayList2 = null;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            oqm = this.this$0;
            Result.Application application2 = Result.Companion;
            MarketEventsVo.Content contentAEQbTJ = oqm.AEQbTJ();
            if (contentAEQbTJ == null || (listOLrzqt = contentAEQbTJ.OLrzqt()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    arrayList.add(C56443yFo.KWHzl(Long.parseLong((String) it.next())));
                }
            }
            if (C33129mqd.KWHzl((Collection) arrayList) && arrayList != null) {
                MarketEventExplainViewModel marketEventExplainViewModelGEmmrt = oqm.gEmmrt();
                this.L$0 = oqm;
                this.L$1 = coroutineScope2;
                this.label = 1;
                Object objOLrzqt = marketEventExplainViewModelGEmmrt.OLrzqt(arrayList, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope = coroutineScope2;
                obj = objOLrzqt;
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineScope = (CoroutineScope) this.L$1;
        oqm = (oQM) this.L$0;
        C56391yDq.AEQbTJ(obj);
        List list = (List) obj;
        if (CoroutineScopeKt.isActive(coroutineScope) && oqm.getContext() != null) {
            if (list != null) {
                arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C32266mVq) it2.next()).copydefault());
                }
            }
            oqm.copydefault((List<String>) arrayList2);
            oOP oop = oqm.djBIcL;
            if (oop != null) {
                oop.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.oQP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        MarketEventsExplainedDialog$onViewCreated$2.invokeSuspend$lambda$6$lambda$5$lambda$4(oqm, view);
                    }
                });
            }
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6$lambda$5$lambda$4(oQM oqm, View view) {
        MarketEventsVo.Content contentAEQbTJ = oqm.AEQbTJ();
        if (contentAEQbTJ != null) {
            String summaryContentId = contentAEQbTJ.djBIcL().getSummaryContentId();
            if (summaryContentId == null) {
                summaryContentId = "";
            }
            Pair[] pairArr = new Pair[3];
            int i = C35964oKf.Fragment.OAjjVP;
            String sourceCount = contentAEQbTJ.djBIcL().getSourceCount();
            pairArr[0] = C56390yDp.OLrzqt("title", C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", sourceCount != null ? sourceCount : ""))));
            pairArr[1] = C56390yDp.OLrzqt("contentId", summaryContentId);
            pairArr[2] = C56390yDp.OLrzqt("theme", Intrinsics.EZpvd((Object) pFN.OLrzqt.AEQbTJ(), (Object) "kline_dark") ? "dark" : "light");
            Map<String, ? extends Object> mapGEmmrt = C56424yEw.gEmmrt(pairArr);
            Context context = oqm.getContext();
            if (context != null) {
                C43056riA.AEQbTJ.OLrzqt(context, "market", "/feed/klineMajorEvent", mapGEmmrt);
            }
        }
    }
}
