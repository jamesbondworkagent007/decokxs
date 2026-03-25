package com.okinc.kline.ui.cr;

import android.content.DialogInterface;
import android.view.View;
import com.okinc.kline.api.bean.KlineEventCalendarEntity;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.ui.cr.StandardChartViewFragment$showKlineEventDialog$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C36246oUr;
import o.C36250oUv;
import o.C37771pAb;
import o.C39232poS;
import o.C39285ppS;
import o.C56391yDq;
import o.C56442yFn;
import o.oLP;
import o.pGZ;
import o.pUU;

/* JADX INFO: loaded from: classes16.dex */
public final class StandardChartViewFragment$showKlineEventDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<oLP> $eventList;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C39232poS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.oLP> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StandardChartViewFragment$showKlineEventDialog$1(List<? extends oLP> list, C39232poS c39232poS, Continuation<? super StandardChartViewFragment$showKlineEventDialog$1> continuation) {
        super(2, continuation);
        this.$eventList = list;
        this.this$0 = c39232poS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StandardChartViewFragment$showKlineEventDialog$1 standardChartViewFragment$showKlineEventDialog$1 = new StandardChartViewFragment$showKlineEventDialog$1(this.$eventList, this.this$0, continuation);
        standardChartViewFragment$showKlineEventDialog$1.L$0 = obj;
        return standardChartViewFragment$showKlineEventDialog$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StandardChartViewFragment$showKlineEventDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0075 -> B:20:0x0078). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        CoroutineScope coroutineScope;
        C39232poS c39232poS;
        Iterator it;
        C39285ppS c39285ppS;
        String alias;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            jCurrentTimeMillis = System.currentTimeMillis();
            List<oLP> list = this.$eventList;
            if (list != null) {
                coroutineScope = coroutineScope2;
                c39232poS = this.this$0;
                it = list.iterator();
                while (it.hasNext()) {
                }
            }
            C39232poS c39232poS2 = this.this$0;
            C39285ppS.ActionBar actionBar = C39285ppS.Companion;
            String str = c39232poS2.fJNWhG;
            if (str != null) {
            }
            String str2 = this.this$0.getFieldNames;
            if (str2 != null) {
            }
            BizInstrument bizInstrument = this.this$0.isConnected;
            if (!(bizInstrument instanceof FutureInstrument)) {
            }
            c39232poS2.uzCIH = actionBar.AEQbTJ(false, str, str, (futureInstrument != null || (alias = futureInstrument.getAlias()) == null) ? "" : alias, true, Intrinsics.EZpvd((Object) this.this$0.getNewProxyInstance, (Object) "lite_mode"));
            c39285ppS = this.this$0.uzCIH;
            if (c39285ppS != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jCurrentTimeMillis = this.J$0;
        oLP olp = (oLP) this.L$3;
        it = (Iterator) this.L$2;
        c39232poS = (C39232poS) this.L$1;
        coroutineScope = (CoroutineScope) this.L$0;
        C56391yDq.AEQbTJ(obj);
        KlineEventCalendarEntity klineEventCalendarEntity = (KlineEventCalendarEntity) obj;
        if (klineEventCalendarEntity == null) {
            KLineEventBean kLineEventBean = (KLineEventBean) olp;
            kLineEventBean.setAddReminder(klineEventCalendarEntity.getEventId() > -1);
            kLineEventBean.setEventId(klineEventCalendarEntity.getEventId());
        } else {
            KLineEventBean kLineEventBean2 = (KLineEventBean) olp;
            kLineEventBean2.setAddReminder(false);
            kLineEventBean2.setEventId(-1L);
        }
        while (it.hasNext()) {
            olp = (oLP) it.next();
            if (olp instanceof KLineEventBean) {
                KLineEventBean kLineEventBean3 = (KLineEventBean) olp;
                if (kLineEventBean3.getDate() > jCurrentTimeMillis) {
                    pGZ pgzDjBIcL = c39232poS.djBIcL();
                    String calendarId = kLineEventBean3.getCalendarId();
                    this.L$0 = coroutineScope;
                    this.L$1 = c39232poS;
                    this.L$2 = it;
                    this.L$3 = olp;
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 1;
                    obj = pgzDjBIcL.EZpvd(calendarId, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    KlineEventCalendarEntity klineEventCalendarEntity2 = (KlineEventCalendarEntity) obj;
                    if (klineEventCalendarEntity2 == null) {
                    }
                    while (it.hasNext()) {
                    }
                }
            }
        }
        C39232poS c39232poS22 = this.this$0;
        C39285ppS.ActionBar actionBar2 = C39285ppS.Companion;
        String str3 = c39232poS22.fJNWhG;
        String str4 = str3 != null ? "" : str3;
        String str22 = this.this$0.getFieldNames;
        String str5 = str22 != null ? "" : str22;
        BizInstrument bizInstrument2 = this.this$0.isConnected;
        FutureInstrument futureInstrument = !(bizInstrument2 instanceof FutureInstrument) ? (FutureInstrument) bizInstrument2 : null;
        c39232poS22.uzCIH = actionBar2.AEQbTJ(false, str4, str5, (futureInstrument != null || (alias = futureInstrument.getAlias()) == null) ? "" : alias, true, Intrinsics.EZpvd((Object) this.this$0.getNewProxyInstance, (Object) "lite_mode"));
        c39285ppS = this.this$0.uzCIH;
        if (c39285ppS != null) {
            List<? extends oLP> arrayList = this.$eventList;
            final C39232poS c39232poS3 = this.this$0;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            c39285ppS.EZpvd(arrayList);
            c39285ppS.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.ppa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    StandardChartViewFragment$showKlineEventDialog$1.invokeSuspend$lambda$4$lambda$3(c39232poS3, dialogInterface);
                }
            });
            C39232poS c39232poS4 = this.this$0;
            if (!c39232poS4.isAdded() || c39232poS4.getChildFragmentManager().isStateSaved()) {
                c39285ppS = null;
            }
            if (c39285ppS != null) {
                C39232poS c39232poS5 = this.this$0;
                try {
                    c39285ppS.show(c39232poS5.getChildFragmentManager(), C39232poS.class.getSimpleName());
                } catch (IllegalStateException e) {
                    pUU.copydefault(c39232poS5.getTAG(), "Failed to show KlineEventDialog: " + e.getMessage());
                    C36246oUr.copydefault().djBIcL();
                    C37771pAb c37771pAb = c39232poS5.hDKMBd;
                    View viewDjBIcL = c37771pAb != null ? c37771pAb.djBIcL() : null;
                    C36250oUv c36250oUv = viewDjBIcL instanceof C36250oUv ? (C36250oUv) viewDjBIcL : null;
                    if (c36250oUv != null) {
                        c36250oUv.invalidate();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$4$lambda$3(C39232poS c39232poS, DialogInterface dialogInterface) {
        C36246oUr.copydefault().djBIcL();
        C37771pAb c37771pAb = c39232poS.hDKMBd;
        View viewDjBIcL = c37771pAb != null ? c37771pAb.djBIcL() : null;
        C36250oUv c36250oUv = viewDjBIcL instanceof C36250oUv ? (C36250oUv) viewDjBIcL : null;
        if (c36250oUv != null) {
            c36250oUv.invalidate();
        }
    }
}
