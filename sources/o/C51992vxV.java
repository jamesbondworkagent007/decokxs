package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.nmp.my_bot.presenter.BotNmpPresenter;
import com.okinc.tradingbot.impl.nmp.my_bot.presenter.SortType;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import o.C56058xve;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51992vxV extends AbstractC51989vxS<AbstractC48540uVe, BotNmpPresenter> {
    public final int AEQbTJ = C48033uCm.Activity.DlmWDR;
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        KWHzl();
        EZpvd();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        android.os.Bundle arguments = getArguments();
        this.KWHzl = arguments != null ? arguments.getString(AppsFlyerProperties.CHANNEL) : null;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            C56058xve.Companion.copydefault().AEQbTJ(C56058xve.Activity.Companion.copydefault(arguments2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        android.view.View viewInflate = android.view.LayoutInflater.from(requireActivity()).inflate(C48033uCm.Activity.FQMcgE, (android.view.ViewGroup) ((AbstractC48540uVe) gGvvIC()).OLrzqt, false);
        android.view.View viewFindViewById = viewInflate.findViewById(C48033uCm.Application.invokespecialaKhcqp);
        viewFindViewById.setOnClickListener(new TaskDescription(viewFindViewById, 1000L, this));
        Intrinsics.copydefault(viewInflate);
        C55296xhK.margin$default(viewInflate, null, null, java.lang.Float.valueOf(12.0f), null, 11, null);
        C55254xgV c55254xgV = ((AbstractC48540uVe) gGvvIC()).OLrzqt;
        Intrinsics.copydefault(viewInflate);
        c55254xgV.OLrzqt(viewInflate);
    }

    /* JADX INFO: renamed from: o.vxV$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity KWHzl = new Activity();

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "tooltip", false, 4, null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        final java.util.List<C52113vzk> listAEQbTJ = ((BotNmpPresenter) dxcTrN()).AEQbTJ();
        ((AbstractC48540uVe) gGvvIC()).EZpvd.setAdapter(new C47976uAj(this, listAEQbTJ, null, 4, null));
        ((AbstractC48540uVe) gGvvIC()).EZpvd.setOffscreenPageLimit(listAEQbTJ.size());
        new TabLayoutMediator(((AbstractC48540uVe) gGvvIC()).OLrzqt.copydefault(), ((AbstractC48540uVe) gGvvIC()).EZpvd, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vxT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C51992vxV.AEQbTJ(listAEQbTJ, tab, i);
            }
        }).attach();
        ((AbstractC48540uVe) gGvvIC()).OLrzqt.copydefault().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Application());
        android.view.View childAt = ((AbstractC48540uVe) gGvvIC()).EZpvd.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setOverScrollMode(2);
        }
        AEQbTJ();
    }

    public static final void AEQbTJ(java.util.List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setTag(((C52113vzk) list.get(i)).OLrzqt());
        tab.setText(C33070mpX.AYXKKw(((C52113vzk) list.get(i)).OLrzqt().getTitle()));
    }

    /* JADX INFO: renamed from: o.vxV$Application */
    public static final class Application implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Application() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String str;
            C51992vxV.this.AEQbTJ();
            java.lang.Object tag = tab != null ? tab.getTag() : null;
            if (tag == SortType.BOT) {
                str = "bot_marketplace";
            } else {
                str = tag == SortType.SIGNAL ? "signal_marketplace" : "";
            }
            C55867xrz.KWHzl.EZpvd(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        AbstractC48540uVe abstractC48540uVe = (AbstractC48540uVe) gGvvIC();
        C55254xgV c55254xgV = abstractC48540uVe.OLrzqt;
        TabLayout.Tab tabCopydefault = c55254xgV.copydefault(c55254xgV.AEQbTJ());
        abstractC48540uVe.OLrzqt.KWHzl().setVisibility((tabCopydefault != null ? tabCopydefault.getTag() : null) == SortType.BOT ? 0 : 8);
    }

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        java.lang.String str = this.KWHzl;
        if (str != null) {
            C56058xve.Companion.copydefault().AEQbTJ(str);
        }
    }

    /* JADX INFO: renamed from: o.vxV$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C51992vxV AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51992vxV c51992vxV) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c51992vxV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C53274wiR c53274wiRAEQbTJ = C53274wiR.Companion.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.QVMIlx), yDY.copydefault(new ExplainItemModel("", C33070mpX.AYXKKw(C55688xof.Application.compare)), new ExplainItemModel("", C33070mpX.AYXKKw(C55688xof.Application.DDDCac))));
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c53274wiRAEQbTJ.show(childFragmentManager);
                C32866mlf.onEvent$default("TradingBot_Full_Button_Click", (TrackChannel[]) null, Activity.KWHzl, 1, (java.lang.Object) null);
            }
        }
    }
}
