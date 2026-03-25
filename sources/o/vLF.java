package o;

import android.os.Build;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.rxutils.RxBus;
import com.okinc.tradingbot.impl.order.strategy.dcd.constant.DcdCreateSegmentType;
import com.okinc.unify_trade.biz.DcdRecommendedParams;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import com.okinc.unify_trade.bot.dcd.presenter.DcdCreatePresenter;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.InterfaceC8104awT;
import o.vLF;
import o.wJM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class vLF extends AbstractC54505xKx<AbstractC50785vah, DcdCreatePresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public C47976uAj<DcdCreateSegmentType> AEQbTJ;
    public InterfaceC58217yxC EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vLN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vLF.AEQbTJ(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.fDu;
    }

    public static final /* synthetic */ AbstractC50785vah OLrzqt(vLF vlf) {
        return vlf.gGvvIC();
    }

    public final DcdProductListReq EZpvd() {
        return (DcdProductListReq) this.KWHzl.getValue();
    }

    public static final DcdProductListReq AEQbTJ(vLF vlf) {
        java.lang.Object parcelable;
        android.os.Bundle arguments = vlf.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("bot_copy_req", DcdProductListReq.class);
        } else {
            java.lang.Object parcelable2 = arguments.getParcelable("bot_copy_req");
            parcelable = (DcdProductListReq) (parcelable2 instanceof DcdProductListReq ? parcelable2 : null);
        }
        return (DcdProductListReq) parcelable;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        wPQ.OLrzqt(view);
        copydefault();
        AEQbTJ();
        C56028xvA.registerBotFragmentTrack$default(this, "DcdCreateFragment", new kotlin.Pair[0], null, 8, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ() {
        pUU.KWHzl(getTAG(), "initListener");
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C55790xqb.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.vLM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLF.copydefault(this.OLrzqt, (C55790xqb) obj);
            }
        };
        this.EZpvd = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.vLJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                vLF.EZpvd(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(vLF vlf, C55790xqb c55790xqb) {
        pUU.KWHzl(vlf.getTAG(), "receive event " + c55790xqb.OLrzqt() + " " + c55790xqb.AEQbTJ());
        if (Intrinsics.EZpvd((java.lang.Object) c55790xqb.OLrzqt(), (java.lang.Object) "LUA_DCD_AI_STRATEGY_COPY_TO_MANUAL")) {
            C55249xgQ c55249xgQ = vlf.gGvvIC().copydefault;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(vlf.KWHzl().size() - 1);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                return Unit.INSTANCE;
            }
            TabLayout.Tab tabAt = c55249xgQ.getTabAt(numValueOf.intValue());
            if (tabAt != null) {
                tabAt.select();
            }
            vlf.getChildFragmentManager().setFragmentResult("copy_to_manual_data", BundleKt.bundleOf(C56390yDp.OLrzqt("bot_copy_req", DcdRecommendedParams.Keys.copydefault(c55790xqb.AEQbTJ()))));
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC54505xKx, o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C32866mlf.onEvent$default("DCDBot_PlaceOrder_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public final void copydefault() {
        final java.util.List<DcdCreateSegmentType> listKWHzl = KWHzl();
        this.AEQbTJ = new C47976uAj<>(this, listKWHzl, null, 4, null);
        gGvvIC().KWHzl.setAdapter(this.AEQbTJ);
        new TabLayoutMediator(gGvvIC().copydefault, gGvvIC().KWHzl, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vLK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                vLF.copydefault(listKWHzl, tab, i);
            }
        }).attach();
        gGvvIC().KWHzl.setUserInputEnabled(false);
        android.view.View childAt = gGvvIC().KWHzl.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        gGvvIC().copydefault.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new StateListAnimator(listKWHzl, this));
        gGvvIC().copydefault.post(new java.lang.Runnable() { // from class: o.vLL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                vLF.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(java.util.List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        DcdCreateSegmentType.Segment segmentCopydefault = ((DcdCreateSegmentType) list.get(i)).copydefault();
        tab.setText(C33070mpX.AYXKKw(segmentCopydefault.getTitle()));
        tab.setContentDescription(segmentCopydefault.getE2eKey());
    }

    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ vLF AEQbTJ;
        public final /* synthetic */ java.util.List<DcdCreateSegmentType> EZpvd;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator(java.util.List<DcdCreateSegmentType> list, vLF vlf) {
            this.EZpvd = list;
            this.AEQbTJ = vlf;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            InterfaceC8104awT interfaceC8104awT;
            final DcdCreateSegmentType dcdCreateSegmentType = (DcdCreateSegmentType) CollectionsKt___CollectionsKt.AkhnZx(this.EZpvd, tab != null ? tab.getPosition() : 0);
            if (dcdCreateSegmentType != null) {
                C32866mlf.onEvent$default("DCDBot_PlaceOrder_Fullbutton_Click", (TrackChannel[]) null, new Function1() { // from class: o.vLS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return vLF.StateListAnimator.AEQbTJ(dcdCreateSegmentType, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }
            if (C33129mqd.AEQbTJ(tab != null ? java.lang.Integer.valueOf(tab.getPosition()) : null, java.lang.Integer.valueOf(this.EZpvd.size() - 1))) {
                return;
            }
            if (tab != null && tab.getPosition() == 1 && !C55697xoo.OLrzqt.isConnected()) {
                android.content.Context context = this.AEQbTJ.getContext();
                if (context == null || (interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class)) == null) {
                    return;
                }
                InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
                return;
            }
            vLF.OLrzqt(this.AEQbTJ).KWHzl.setCurrentItem(tab != null ? tab.getPosition() : 0, false);
        }

        public static final Unit AEQbTJ(DcdCreateSegmentType dcdCreateSegmentType, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("button_type", dcdCreateSegmentType.copydefault().getEventName(), true);
            return Unit.INSTANCE;
        }
    }

    public static final void copydefault(vLF vlf) {
        TabLayout.Tab tabAt;
        if (vlf.EZpvd() == null || (tabAt = vlf.gGvvIC().copydefault.getTabAt(1)) == null) {
            return;
        }
        vlf.gGvvIC().copydefault.selectTab(tabAt);
    }

    public final java.util.List<DcdCreateSegmentType> KWHzl() {
        DcdCreateSegmentType.Segment[] segmentArrValues = DcdCreateSegmentType.Segment.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(segmentArrValues.length);
        for (DcdCreateSegmentType.Segment segment : segmentArrValues) {
            arrayList.add(new DcdCreateSegmentType(segment, getArguments()));
        }
        return arrayList;
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        if (!SPUtils.getBoolean("bot_dcd_teach_key", false)) {
            java.util.ArrayList<BotGuideData> arrayListAkhnZx = C51468vnb.AkhnZx();
            SPUtils.put("bot_dcd_teach_key", java.lang.Boolean.TRUE);
            wJM.StateListAnimator stateListAnimator = wJM.Companion;
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            stateListAnimator.KWHzl(parentFragmentManager, arrayListAkhnZx);
        }
        if (!C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(gGvvIC().copydefault.getSelectedTabPosition()), (java.lang.Object) 1) || C55697xoo.OLrzqt.isConnected()) {
            return;
        }
        gGvvIC().copydefault.selectTab(gGvvIC().copydefault.getTabAt(0));
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vLF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }
}
