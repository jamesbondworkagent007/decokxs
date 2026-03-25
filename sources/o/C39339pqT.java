package o;

import android.content.DialogInterface;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import o.ViewOnClickListenerC39320pqA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pqT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39339pqT extends AbstractC49393unh implements InterfaceC35976oKr, InterfaceC35979oKu {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public android.widget.LinearLayout AYXKKw;
    public android.widget.LinearLayout AhwBna;
    public RecyclerView AkhnZx;
    public TemplateSetting DbNXlk;
    public boolean OLrzqt;
    public android.widget.TextView fJNWhG;
    public Function1<? super MarketTypeSelect, Unit> fetchVPNInfo;
    public RecyclerView isConnected;
    public java.util.ArrayList<java.lang.Object> values = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.Object> gEmmrt = new java.util.ArrayList<>();
    public final C43316rmw djBIcL = new C43316rmw();
    public final C43316rmw valueOf = new C43316rmw();
    public int copydefault = C55298xhM.dp2px$default(24.0f, null, 1, null);
    public int EZpvd = C55298xhM.dp2px$default(16.0f, null, 1, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35979oKu
    public void OLrzqt(@NotNull Function1<? super MarketTypeSelect, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.fetchVPNInfo = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35976oKr
    public void OLrzqt(@NotNull oKD okd) {
        Intrinsics.checkNotNullParameter(okd, "");
    }

    /* JADX INFO: renamed from: o.pqT$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pqT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C39339pqT newInstance$default(TaskDescription taskDescription, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return taskDescription.OLrzqt(z, z2);
        }

        public final C39339pqT OLrzqt(boolean z, boolean z2) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("is_from_full_screen", z);
            bundle.putBoolean("have_market_cap", z2);
            C39339pqT c39339pqT = new C39339pqT();
            c39339pqT.setArguments(bundle);
            return c39339pqT;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        oMV.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.gasjUx));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout constraintLayout;
        android.view.View rootView;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C54946xaf binding = getBinding();
        if (binding != null && (constraintLayout = binding.AEQbTJ) != null && (rootView = constraintLayout.getRootView()) != null) {
            android.os.Bundle arguments = getArguments();
            this.OLrzqt = arguments != null ? arguments.getBoolean("is_from_full_screen") : false;
            android.os.Bundle arguments2 = getArguments();
            this.AEQbTJ = arguments2 != null ? arguments2.getBoolean("have_market_cap") : false;
            this.isConnected = (RecyclerView) rootView.findViewById(C35964oKf.StateListAnimator.ITrustedWebActivityCallback);
            this.AkhnZx = (RecyclerView) rootView.findViewById(C35964oKf.StateListAnimator.IPostMessageServiceStub);
            this.AYXKKw = (android.widget.LinearLayout) rootView.findViewById(C35964oKf.StateListAnimator.OHsvZP);
            this.fJNWhG = (android.widget.TextView) rootView.findViewById(C35964oKf.StateListAnimator.getOptionsList);
            this.AhwBna = (android.widget.LinearLayout) rootView.findViewById(C35964oKf.StateListAnimator.iOIMNp);
            EZpvd();
            KWHzl();
            AEQbTJ();
            copydefault();
            OLrzqt();
        }
        view.post(new java.lang.Runnable() { // from class: o.pqV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C39339pqT.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public static final void OLrzqt(C39339pqT c39339pqT) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39339pqT, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void KWHzl() {
        if (C55608xnE.OLrzqt()) {
            android.widget.TextView textView = this.fJNWhG;
            if (textView != null) {
                int i = this.copydefault;
                textView.setPadding(i, 0, i, 0);
            }
            RecyclerView recyclerView = this.AkhnZx;
            if (recyclerView != null) {
                recyclerView.setPadding(this.copydefault, 0, this.EZpvd, 0);
            }
            android.widget.LinearLayout linearLayout = this.AhwBna;
            if (linearLayout != null) {
                int i2 = this.copydefault;
                linearLayout.setPadding(i2, 0, i2, 0);
            }
            RecyclerView recyclerView2 = this.isConnected;
            if (recyclerView2 != null) {
                recyclerView2.setPadding(this.copydefault, 0, this.EZpvd, 0);
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pFQ.fastDoubleClickListener$default(android.view.View, long, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    private final void EZpvd() {
        android.widget.LinearLayout linearLayout = this.AYXKKw;
        if (linearLayout != null) {
            pFQ.fastDoubleClickListener$default(linearLayout, 0L, new Function1() { // from class: o.pqW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39339pqT.KWHzl(this.copydefault, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pqA.TaskDescription.newInstance$default(o.pqA$TaskDescription, boolean, boolean, int, java.lang.Object):o.pqA */
    public static final Unit KWHzl(final C39339pqT c39339pqT, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewOnClickListenerC39320pqA viewOnClickListenerC39320pqANewInstance$default = ViewOnClickListenerC39320pqA.TaskDescription.newInstance$default(ViewOnClickListenerC39320pqA.Companion, c39339pqT.OLrzqt, false, 2, null);
        viewOnClickListenerC39320pqANewInstance$default.copydefault(new Function0() { // from class: o.pqY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39339pqT.KWHzl(this.copydefault);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = c39339pqT.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String simpleName = C39339pqT.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        viewOnClickListenerC39320pqANewInstance$default.AEQbTJ(childFragmentManager, simpleName);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_TimeframePop_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.prb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39339pqT.AEQbTJ(this.OLrzqt, (EventParamsList) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C39339pqT c39339pqT) {
        c39339pqT.valueOf();
        c39339pqT.valueOf.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C39339pqT c39339pqT, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("setting_button", "setting_entry_click", true);
        eventParamsList.put("chart_layout", c39339pqT.OLrzqt ? "fullscreen" : "classic", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        java.util.ArrayList<TimeIntervalItem> arrayListKWHzl;
        this.gEmmrt.clear();
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
        if (interfaceC39509ptgDjBIcL == null || (arrayListKWHzl = interfaceC39509ptgDjBIcL.KWHzl()) == null) {
            return;
        }
        int size = arrayListKWHzl.size();
        for (int i = 0; i < size; i++) {
            java.util.ArrayList<java.lang.Object> arrayList = this.gEmmrt;
            java.lang.String displayName = arrayListKWHzl.get(i).getDisplayName();
            TemplateSetting templateSetting = this.DbNXlk;
            arrayList.add(new MarketTypeSelect(displayName, templateSetting != null && templateSetting.getSPTimeInterval() == arrayListKWHzl.get(i).timeInterval, 0, arrayListKWHzl.get(i)));
        }
    }

    private final void AEQbTJ() {
        java.util.ArrayList<TimeIntervalItem> arrayListAEQbTJ;
        this.DbNXlk = C36246oUr.copydefault().KWHzl("ds0");
        this.values.clear();
        pFN pfn = pFN.OLrzqt;
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pfn.djBIcL();
        if (interfaceC39509ptgDjBIcL != null) {
            interfaceC39509ptgDjBIcL.valueOf();
        }
        InterfaceC39509ptg interfaceC39509ptgDjBIcL2 = pfn.djBIcL();
        if (interfaceC39509ptgDjBIcL2 != null && (arrayListAEQbTJ = interfaceC39509ptgDjBIcL2.AEQbTJ()) != null) {
            int size = arrayListAEQbTJ.size();
            for (int i = 0; i < size; i++) {
                java.util.ArrayList<java.lang.Object> arrayList = this.values;
                java.lang.String displayName = arrayListAEQbTJ.get(i).getDisplayName();
                TemplateSetting templateSetting = this.DbNXlk;
                arrayList.add(new MarketTypeSelect(displayName, templateSetting != null && templateSetting.getSPTimeInterval() == arrayListAEQbTJ.get(i).timeInterval, 0, arrayListAEQbTJ.get(i)));
            }
        }
        valueOf();
    }

    public final void copydefault() {
        C43316rmw c43316rmw = this.djBIcL;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c43316rmw.register(MarketTypeSelect.class, new C39485ptI(contextRequireContext, new Function1() { // from class: o.pqX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39339pqT.KWHzl(this.AEQbTJ, (MarketTypeSelect) obj);
            }
        }, new Function1() { // from class: o.pqZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39339pqT.AYXKKw(this.EZpvd, (MarketTypeSelect) obj);
            }
        }));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        RecyclerView recyclerView = this.isConnected;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView2 = this.isConnected;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.djBIcL);
        }
        this.djBIcL.setItems(this.values);
    }

    public static final Unit KWHzl(C39339pqT c39339pqT, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        c39339pqT.OLrzqt(marketTypeSelect);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C39339pqT c39339pqT, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        Function1<? super MarketTypeSelect, Unit> function1 = c39339pqT.fetchVPNInfo;
        if (function1 != null) {
            function1.invoke(marketTypeSelect);
        }
        pXB.EZpvd.AEQbTJ("Kline_Time_Select", C56423yEv.EZpvd(C56390yDp.OLrzqt("timeframe_type", marketTypeSelect.getSelectTypeName())));
        c39339pqT.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        C43316rmw c43316rmw = this.valueOf;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c43316rmw.register(MarketTypeSelect.class, new C39485ptI(contextRequireContext, new Function1() { // from class: o.pqR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39339pqT.gEmmrt(this.EZpvd, (MarketTypeSelect) obj);
            }
        }, new Function1() { // from class: o.pqU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39339pqT.AhwBna(this.copydefault, (MarketTypeSelect) obj);
            }
        }));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        RecyclerView recyclerView = this.AkhnZx;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView2 = this.AkhnZx;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.valueOf);
        }
        this.valueOf.setItems(this.gEmmrt);
    }

    public static final Unit gEmmrt(C39339pqT c39339pqT, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        c39339pqT.OLrzqt(marketTypeSelect);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C39339pqT c39339pqT, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        Function1<? super MarketTypeSelect, Unit> function1 = c39339pqT.fetchVPNInfo;
        if (function1 != null) {
            function1.invoke(marketTypeSelect);
        }
        c39339pqT.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC35979oKu
    public void KWHzl(@NotNull DialogInterface.OnDismissListener onDismissListener) {
        Intrinsics.checkNotNullParameter(onDismissListener, "");
        setOnDismissListener(onDismissListener);
    }

    @Override // o.InterfaceC35979oKu
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (fragmentManager.isStateSaved() || fragmentManager.isDestroyed()) {
                return;
            }
            show(fragmentManager, str);
        } catch (java.lang.Exception e) {
            pUU.copydefault("KlineTimeSelectFragment", "Error showFragment: " + e.getMessage());
        }
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // o.InterfaceC35976oKr
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (fragmentManager.isStateSaved() || fragmentManager.isDestroyed()) {
                return;
            }
            show(fragmentManager, str);
        } catch (java.lang.IllegalStateException e) {
            pUU.copydefault("KlineTimeSelectFragment", "Error showDialog: " + e.getMessage());
        }
    }

    public final void OLrzqt(MarketTypeSelect marketTypeSelect) {
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            if (this.values.get(i) instanceof MarketTypeSelect) {
                java.lang.Object obj = this.values.get(i);
                Intrinsics.copydefault(obj, "");
                MarketTypeSelect marketTypeSelect2 = (MarketTypeSelect) obj;
                if (marketTypeSelect2.getGroup() == marketTypeSelect.getGroup()) {
                    if (Intrinsics.EZpvd((java.lang.Object) marketTypeSelect2.getSelectTypeName(), (java.lang.Object) marketTypeSelect.getSelectTypeName())) {
                        marketTypeSelect2.setSelect(!marketTypeSelect2.isSelect());
                    } else {
                        marketTypeSelect2.setSelect(false);
                    }
                }
            }
        }
        int size2 = this.gEmmrt.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (this.gEmmrt.get(i2) instanceof MarketTypeSelect) {
                java.lang.Object obj2 = this.gEmmrt.get(i2);
                Intrinsics.copydefault(obj2, "");
                MarketTypeSelect marketTypeSelect3 = (MarketTypeSelect) obj2;
                if (marketTypeSelect3.getGroup() == marketTypeSelect.getGroup()) {
                    if (Intrinsics.EZpvd((java.lang.Object) marketTypeSelect3.getSelectTypeName(), (java.lang.Object) marketTypeSelect.getSelectTypeName())) {
                        marketTypeSelect3.setSelect(!marketTypeSelect3.isSelect());
                    } else {
                        marketTypeSelect3.setSelect(false);
                    }
                }
            }
        }
        this.djBIcL.notifyDataSetChanged();
        this.valueOf.notifyDataSetChanged();
    }
}
