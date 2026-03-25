package o;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.market_place.presenter.BotLeadSignalBotPresenter;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC51880vvP extends AbstractC54505xKx<uOT, BotLeadSignalBotPresenter> {
    public C43316rmw OLrzqt = new C43316rmw();

    /* JADX INFO: renamed from: o.vvP$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43316rmw AEQbTJ() {
        return this.OLrzqt;
    }

    public abstract void EZpvd();

    public abstract void KWHzl();

    public abstract void copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.igXuih;
    }

    @Override // o.AbstractC54505xKx
    public void uzCIH() {
        super.uzCIH();
        KWHzl();
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        EZpvd();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        RecyclerView recyclerView = gGvvIC().KWHzl;
        copydefault();
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.OLrzqt);
        gGvvIC().AEQbTJ.KWHzl(new InterfaceC57900yrD() { // from class: o.vvL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                AbstractC51880vvP.AEQbTJ(this.KWHzl, interfaceC57934yrl);
            }
        });
    }

    public static final void AEQbTJ(AbstractC51880vvP abstractC51880vvP, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        abstractC51880vvP.KWHzl();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        dxcTrN().AEQbTJ().observe(this, new Application(new Function1() { // from class: o.vvT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC51880vvP.KWHzl(this.OLrzqt, (java.util.List) obj);
            }
        }));
        dxcTrN().KWHzl().AhwBna().observe(this, new Application(new Function1() { // from class: o.vvQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC51880vvP.KWHzl(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
        dxcTrN().OLrzqt().observe(this, new Application(new Function1() { // from class: o.vvR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC51880vvP.OLrzqt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
    }

    public static final Unit KWHzl(AbstractC51880vvP abstractC51880vvP, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C49952uyJ.updateDataOrEmpty$default(abstractC51880vvP.OLrzqt, list, C33070mpX.AYXKKw(C55688xof.Application.ddauOi), 60, null, null, false, 56, null);
        abstractC51880vvP.gGvvIC().AEQbTJ.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC51880vvP abstractC51880vvP, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        C33064mpR.OLrzqt(abstractC51880vvP.OLrzqt, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, null, 60, false, null, null, false, 61, null));
        abstractC51880vvP.gGvvIC().AEQbTJ.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC51880vvP abstractC51880vvP, boolean z) {
        abstractC51880vvP.gGvvIC().AEQbTJ.AhwBna(z);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("OrderManagement_Full_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.vvS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC51880vvP.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }
}
