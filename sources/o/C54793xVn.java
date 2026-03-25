package o;

import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xVn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54793xVn {
    public static final C54793xVn OLrzqt = new C54793xVn();

    private C54793xVn() {
    }

    public final xMJ.TaskDescription KWHzl(@NotNull IndexTickersData indexTickersData) {
        Intrinsics.checkNotNullParameter(indexTickersData, "");
        xMJ.TaskDescription taskDescription = new xMJ.TaskDescription();
        taskDescription.copydefault(indexTickersData.getIdxPx());
        taskDescription.OLrzqt(indexTickersData.getHigh24h());
        taskDescription.KWHzl(indexTickersData.getLow24h());
        taskDescription.EZpvd(indexTickersData.getOpen24h());
        taskDescription.djBIcL(C54787xVh.copydefault.KWHzl(indexTickersData.getOpen24h(), indexTickersData.getSodUtc0(), indexTickersData.getSodUtc8()));
        taskDescription.AEQbTJ(C54789xVj.EZpvd.AEQbTJ(indexTickersData.getIdxPx(), indexTickersData.getOpen24h(), indexTickersData.getSodUtc0(), indexTickersData.getSodUtc8()).getSecond());
        return taskDescription;
    }

    public final xMJ.Application copydefault(@NotNull TickersData tickersData) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        xMJ.Application application = new xMJ.Application();
        application.AhwBna(tickersData.getLast());
        application.KWHzl(tickersData.getLastSz());
        application.djBIcL(tickersData.getOpen24h());
        application.AkhnZx(tickersData.getSodUtc0());
        application.values(tickersData.getSodUtc8());
        application.isConnected(C54787xVh.copydefault.KWHzl(tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8()));
        application.AYXKKw(tickersData.getHigh24h());
        application.valueOf(tickersData.getLow24h());
        application.DbNXlk(tickersData.getVolCcy24h());
        application.fetchVPNInfo(tickersData.getVol24h());
        java.lang.String askPx = tickersData.getAskPx();
        if (askPx == null) {
            askPx = "";
        }
        application.OLrzqt(askPx);
        java.lang.String bidPx = tickersData.getBidPx();
        application.AEQbTJ(bidPx != null ? bidPx : "");
        kotlin.Pair<java.lang.Double, java.lang.String> pairAEQbTJ = C54789xVj.EZpvd.AEQbTJ(tickersData.getLast(), tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8());
        application.copydefault(C33129mqd.gEmmrt(pairAEQbTJ.getFirst()));
        application.EZpvd(pairAEQbTJ.getSecond());
        application.gEmmrt(tickersData.getInstId());
        return application;
    }

    public final AbstractC58185ywX<xMJ.Application> KWHzl(@NotNull final java.lang.String str, @NotNull Function1<? super xMJ.Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return xMJ.KWHzl.EZpvd(new InterfaceC58187ywZ() { // from class: o.xVm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C54793xVn.copydefault(str, interfaceC58184ywW);
            }
        });
    }

    /* JADX INFO: renamed from: o.xVn$Application */
    public static final class Application implements InterfaceC55701xos<TickersData> {
        public final /* synthetic */ InterfaceC58184ywW<xMJ.Application> OLrzqt;

        public Application(InterfaceC58184ywW<xMJ.Application> interfaceC58184ywW) {
            this.OLrzqt = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, TickersData tickersData, java.lang.Exception exc) {
            if (!z || tickersData == null) {
                return;
            }
            this.OLrzqt.onNext(C54793xVn.OLrzqt.copydefault(tickersData));
        }
    }

    public static final void copydefault(java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        C56131xwy c56131xwyFetchVPNInfo;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (c56131xwyFetchVPNInfo = interfaceC54581xNrOLrzqt.fetchVPNInfo()) == null) {
            return;
        }
        c56131xwyFetchVPNInfo.AEQbTJ(str, new Application(interfaceC58184ywW));
    }
}
