package com.okinc.kline.ui;

import android.content.DialogInterface;
import com.okinc.kline.api.bean.KlineEventCalendarEntity;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.ui.KLineQuotesFullScreenFragment$showKlineEventDialog$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36246oUr;
import o.C36250oUv;
import o.C39285ppS;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC38659pdc;
import o.oLP;
import o.pGZ;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineQuotesFullScreenFragment$showKlineEventDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<oLP> $eventList;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ViewOnClickListenerC38659pdc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.oLP> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KLineQuotesFullScreenFragment$showKlineEventDialog$1(List<? extends oLP> list, ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, Continuation<? super KLineQuotesFullScreenFragment$showKlineEventDialog$1> continuation) {
        super(2, continuation);
        this.$eventList = list;
        this.this$0 = viewOnClickListenerC38659pdc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KLineQuotesFullScreenFragment$showKlineEventDialog$1 kLineQuotesFullScreenFragment$showKlineEventDialog$1 = new KLineQuotesFullScreenFragment$showKlineEventDialog$1(this.$eventList, this.this$0, continuation);
        kLineQuotesFullScreenFragment$showKlineEventDialog$1.L$0 = obj;
        return kLineQuotesFullScreenFragment$showKlineEventDialog$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KLineQuotesFullScreenFragment$showKlineEventDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0075 -> B:20:0x0078). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        CoroutineScope coroutineScope;
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc;
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
                viewOnClickListenerC38659pdc = this.this$0;
                it = list.iterator();
                while (it.hasNext()) {
                }
            }
            ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc2 = this.this$0;
            C39285ppS.ActionBar actionBar = C39285ppS.Companion;
            String strOcIXYQ = viewOnClickListenerC38659pdc2.OcIXYQ();
            if (strOcIXYQ != null) {
            }
            String strORxRYg = this.this$0.ORxRYg();
            if (strORxRYg != null) {
            }
            BizInstrument bizInstrumentHDKMBd = this.this$0.hDKMBd();
            C39285ppS c39285ppS2 = null;
            if (!(bizInstrumentHDKMBd instanceof FutureInstrument)) {
            }
            viewOnClickListenerC38659pdc2.aUsmxb = actionBar.AEQbTJ(false, str, str, (futureInstrument != null || (alias = futureInstrument.getAlias()) == null) ? "" : alias, true, this.this$0.QKVWgx());
            c39285ppS = this.this$0.aUsmxb;
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
        viewOnClickListenerC38659pdc = (ViewOnClickListenerC38659pdc) this.L$1;
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
                    pGZ pgzDWgRXt = viewOnClickListenerC38659pdc.DWgRXt();
                    String calendarId = kLineEventBean3.getCalendarId();
                    this.L$0 = coroutineScope;
                    this.L$1 = viewOnClickListenerC38659pdc;
                    this.L$2 = it;
                    this.L$3 = olp;
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 1;
                    obj = pgzDWgRXt.EZpvd(calendarId, this);
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
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc22 = this.this$0;
        C39285ppS.ActionBar actionBar2 = C39285ppS.Companion;
        String strOcIXYQ2 = viewOnClickListenerC38659pdc22.OcIXYQ();
        String str = strOcIXYQ2 != null ? "" : strOcIXYQ2;
        String strORxRYg2 = this.this$0.ORxRYg();
        String str2 = strORxRYg2 != null ? "" : strORxRYg2;
        BizInstrument bizInstrumentHDKMBd2 = this.this$0.hDKMBd();
        C39285ppS c39285ppS22 = null;
        FutureInstrument futureInstrument = !(bizInstrumentHDKMBd2 instanceof FutureInstrument) ? (FutureInstrument) bizInstrumentHDKMBd2 : null;
        viewOnClickListenerC38659pdc22.aUsmxb = actionBar2.AEQbTJ(false, str, str2, (futureInstrument != null || (alias = futureInstrument.getAlias()) == null) ? "" : alias, true, this.this$0.QKVWgx());
        c39285ppS = this.this$0.aUsmxb;
        if (c39285ppS != null) {
            List<? extends oLP> arrayList = this.$eventList;
            final ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc3 = this.this$0;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            c39285ppS.EZpvd(arrayList);
            c39285ppS.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.pew
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    KLineQuotesFullScreenFragment$showKlineEventDialog$1.invokeSuspend$lambda$4$lambda$3(viewOnClickListenerC38659pdc3, dialogInterface);
                }
            });
            ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc4 = this.this$0;
            if (viewOnClickListenerC38659pdc4.isAdded() && !viewOnClickListenerC38659pdc4.getChildFragmentManager().isStateSaved()) {
                c39285ppS22 = c39285ppS;
            }
            if (c39285ppS22 != null) {
                ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc5 = this.this$0;
                try {
                    c39285ppS22.show(viewOnClickListenerC38659pdc5.getChildFragmentManager(), ViewOnClickListenerC38659pdc.class.getSimpleName());
                } catch (Exception e) {
                    pUU.copydefault(viewOnClickListenerC38659pdc5.getTAG(), "Failed to show KlineEventDialog: " + e.getMessage());
                    C36246oUr.copydefault().djBIcL();
                    C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc5.QVAiDq();
                    if (c36250oUvQVAiDq != null) {
                        c36250oUvQVAiDq.invalidate();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$4$lambda$3(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, DialogInterface dialogInterface) {
        C36246oUr.copydefault().djBIcL();
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38659pdc.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.invalidate();
        }
    }
}
