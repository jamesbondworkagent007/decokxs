package com.okinc.kline.ui.component.business.klinequote.chart;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.okinc.kline.api.bean.KlineEventCalendarEntity;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent$showKlineEventDialog$1;
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
import o.C39285ppS;
import o.C56391yDq;
import o.C56442yFn;
import o.oLP;
import o.oML;
import o.pGZ;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ChartUIComponent$showKlineEventDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<oLP> $eventList;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ChartUIComponent this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.oLP> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChartUIComponent$showKlineEventDialog$1(ChartUIComponent chartUIComponent, List<? extends oLP> list, Continuation<? super ChartUIComponent$showKlineEventDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = chartUIComponent;
        this.$eventList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChartUIComponent$showKlineEventDialog$1 chartUIComponent$showKlineEventDialog$1 = new ChartUIComponent$showKlineEventDialog$1(this.this$0, this.$eventList, continuation);
        chartUIComponent$showKlineEventDialog$1.L$0 = obj;
        return chartUIComponent$showKlineEventDialog$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartUIComponent$showKlineEventDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009b -> B:20:0x009e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentManager childFragmentManager;
        CoroutineScope coroutineScope;
        FragmentManager fragmentManager;
        long j;
        Iterator it;
        ChartUIComponent chartUIComponent;
        C39285ppS c39285ppS;
        C36250oUv c36250oUv;
        String alias;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            childFragmentManager = this.this$0.AYXKKw().OLrzqt().getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<oLP> list = this.$eventList;
            if (list != null) {
                ChartUIComponent chartUIComponent2 = this.this$0;
                coroutineScope = coroutineScope2;
                fragmentManager = childFragmentManager;
                j = jCurrentTimeMillis;
                it = list.iterator();
                chartUIComponent = chartUIComponent2;
                while (it.hasNext()) {
                }
                childFragmentManager = fragmentManager;
            }
            ChartUIComponent chartUIComponent3 = this.this$0;
            C39285ppS.ActionBar actionBar = C39285ppS.Companion;
            String strFIwbmz = chartUIComponent3.AYXKKw().fIwbmz();
            if (strFIwbmz != null) {
            }
            String strAuCTel = this.this$0.AYXKKw().AuCTel();
            if (strAuCTel != null) {
            }
            BizInstrument bizInstrumentAYXKKw = this.this$0.AYXKKw().AYXKKw();
            C39285ppS c39285ppS2 = null;
            if (!(bizInstrumentAYXKKw instanceof FutureInstrument)) {
            }
            chartUIComponent3.DbNXlk = C39285ppS.ActionBar.newInstance$default(actionBar, true, str, str, (futureInstrument != null || (alias = futureInstrument.getAlias()) == null) ? "" : alias, true, false, 32, null);
            c39285ppS = this.this$0.DbNXlk;
            if (c39285ppS != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = this.J$0;
        oLP olp = (oLP) this.L$4;
        it = (Iterator) this.L$3;
        chartUIComponent = (ChartUIComponent) this.L$2;
        fragmentManager = (FragmentManager) this.L$1;
        coroutineScope = (CoroutineScope) this.L$0;
        C56391yDq.AEQbTJ(obj);
        Object objEZpvd = obj;
        KlineEventCalendarEntity klineEventCalendarEntity = (KlineEventCalendarEntity) objEZpvd;
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
                if (kLineEventBean3.getDate() > j) {
                    pGZ pgzDjBIcL = chartUIComponent.AYXKKw().djBIcL();
                    String calendarId = kLineEventBean3.getCalendarId();
                    this.L$0 = coroutineScope;
                    this.L$1 = fragmentManager;
                    this.L$2 = chartUIComponent;
                    this.L$3 = it;
                    this.L$4 = olp;
                    this.J$0 = j;
                    this.label = 1;
                    objEZpvd = pgzDjBIcL.EZpvd(calendarId, this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    KlineEventCalendarEntity klineEventCalendarEntity2 = (KlineEventCalendarEntity) objEZpvd;
                    if (klineEventCalendarEntity2 == null) {
                    }
                    while (it.hasNext()) {
                    }
                }
            }
        }
        childFragmentManager = fragmentManager;
        ChartUIComponent chartUIComponent32 = this.this$0;
        C39285ppS.ActionBar actionBar2 = C39285ppS.Companion;
        String strFIwbmz2 = chartUIComponent32.AYXKKw().fIwbmz();
        String str = strFIwbmz2 != null ? "" : strFIwbmz2;
        String strAuCTel2 = this.this$0.AYXKKw().AuCTel();
        String str2 = strAuCTel2 != null ? "" : strAuCTel2;
        BizInstrument bizInstrumentAYXKKw2 = this.this$0.AYXKKw().AYXKKw();
        C39285ppS c39285ppS22 = null;
        FutureInstrument futureInstrument = !(bizInstrumentAYXKKw2 instanceof FutureInstrument) ? (FutureInstrument) bizInstrumentAYXKKw2 : null;
        chartUIComponent32.DbNXlk = C39285ppS.ActionBar.newInstance$default(actionBar2, true, str, str2, (futureInstrument != null || (alias = futureInstrument.getAlias()) == null) ? "" : alias, true, false, 32, null);
        c39285ppS = this.this$0.DbNXlk;
        if (c39285ppS != null) {
            List<? extends oLP> arrayList = this.$eventList;
            final ChartUIComponent chartUIComponent4 = this.this$0;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            c39285ppS.EZpvd(arrayList);
            c39285ppS.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.pnD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    ChartUIComponent$showKlineEventDialog$1.invokeSuspend$lambda$4$lambda$3(chartUIComponent4, dialogInterface);
                }
            });
            if (this.this$0.AYXKKw().OLrzqt().isAdded() && !childFragmentManager.isStateSaved()) {
                c39285ppS22 = c39285ppS;
            }
            if (c39285ppS22 != null) {
                ChartUIComponent chartUIComponent5 = this.this$0;
                try {
                    c39285ppS22.show(childFragmentManager, chartUIComponent5.AYXKKw().OLrzqt().getClass().getSimpleName());
                } catch (Exception e) {
                    pUU.copydefault("ChartUIComponent", "Failed to show KlineEventDialog: " + e.getMessage());
                    C36246oUr.copydefault().djBIcL();
                    oML oml = (oML) chartUIComponent5.isConnected().KWHzl();
                    if (oml != null && (c36250oUv = oml.AuCTel) != null) {
                        c36250oUv.invalidate();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$4$lambda$3(ChartUIComponent chartUIComponent, DialogInterface dialogInterface) {
        C36250oUv c36250oUv;
        C36246oUr.copydefault().djBIcL();
        oML oml = (oML) chartUIComponent.isConnected().KWHzl();
        if (oml == null || (c36250oUv = oml.AuCTel) == null) {
            return;
        }
        c36250oUv.invalidate();
    }
}
