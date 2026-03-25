package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import io.reactivex.BackpressureStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46845tep extends AbstractC54517xLi {
    @Override // o.AbstractC54517xLi
    public void copydefault(Function1<? super java.lang.Boolean, Unit> function1) {
    }

    public final AbstractC58185ywX<C37936pGe> AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        final java.lang.String tradeSymbol;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "INDEX")) {
            java.lang.String strAEQbTJ = o.TaskDescription.AEQbTJ(str).AEQbTJ();
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            tradeSymbol = strAEQbTJ.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(tradeSymbol, "");
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str)) == null || (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) == null) {
                tradeSymbol = "";
            }
        }
        AbstractC58185ywX<C37936pGe> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.tew
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C46845tep.EZpvd(str2, str, tradeSymbol, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        C37936pGe c37936pGe = new C37936pGe();
        final java.util.ArrayList<java.lang.Object> arrayListCopydefault = yDY.copydefault(new ActionBar(str2, c37936pGe, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))), new TaskDescription(str3, c37936pGe, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        java.util.ArrayList<java.lang.Object> arrayListCopydefault2 = yDY.copydefault(new Activity(str2, c37936pGe, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) {
            arrayListCopydefault = arrayListCopydefault2;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(arrayListCopydefault);
        }
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.tex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                C46845tep.OLrzqt(arrayListCopydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.tep$ActionBar */
    public static final class ActionBar extends AbstractC55737xpb {
        public final /* synthetic */ C37936pGe KWHzl;
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> OLrzqt;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
        @Override // o.AbstractC55755xpt
        public /* bridge */ /* synthetic */ void EZpvd(java.util.List<? extends TickersData> list, java.lang.String str) {
            EZpvd2((java.util.List<TickersData>) list, str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(java.lang.String str, C37936pGe c37936pGe, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2, false, 4, null);
            this.KWHzl = c37936pGe;
            this.OLrzqt = interfaceC58184ywW;
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(java.util.List<TickersData> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C37936pGe c37936pGe = this.KWHzl;
            InterfaceC58184ywW<C37936pGe> interfaceC58184ywW = this.OLrzqt;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                c37936pGe.copydefault(C55692xoj.KWHzl.AEQbTJ((TickersData) it.next()));
                interfaceC58184ywW.onNext(c37936pGe);
            }
        }
    }

    /* JADX INFO: renamed from: o.tep$TaskDescription */
    public static final class TaskDescription extends AbstractC55744xpi {
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> OLrzqt;
        public final /* synthetic */ C37936pGe copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(java.lang.String str, C37936pGe c37936pGe, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2, false, null, 12, null);
            this.copydefault = c37936pGe;
            this.OLrzqt = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(TickersData tickersData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(tickersData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault.AEQbTJ(C55692xoj.KWHzl.AEQbTJ(tickersData));
            this.OLrzqt.onNext(this.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.tep$Activity */
    public static final class Activity extends AbstractC55737xpb {
        public final /* synthetic */ C37936pGe KWHzl;
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(java.lang.String str, C37936pGe c37936pGe, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2, false, 4, null);
            this.KWHzl = c37936pGe;
            this.OLrzqt = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<TickersData> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C37936pGe c37936pGe = this.KWHzl;
            InterfaceC58184ywW<C37936pGe> interfaceC58184ywW = this.OLrzqt;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                c37936pGe.copydefault(C55692xoj.KWHzl.AEQbTJ((TickersData) it.next()));
                interfaceC58184ywW.onNext(c37936pGe);
            }
        }
    }

    public static final void OLrzqt(java.util.ArrayList arrayList) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ((java.util.ArrayList<java.lang.Object>) arrayList);
        }
    }
}
