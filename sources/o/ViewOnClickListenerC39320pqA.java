package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pqA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewOnClickListenerC39320pqA extends wXX implements InterfaceC35976oKr, View.OnClickListener {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public android.widget.LinearLayout AYXKKw;
    public boolean AhwBna;
    public android.widget.TextView AkhnZx;
    public C52794wYp EZpvd;
    public C52794wYp OLrzqt;
    public boolean gEmmrt;
    public RecyclerView isConnected;
    public android.widget.LinearLayout valueOf;
    public Function0<Unit> values;
    public java.util.ArrayList<TimeIntervalItem> DbNXlk = new java.util.ArrayList<>();
    public java.util.ArrayList<TimeIntervalItem> fetchVPNInfo = new java.util.ArrayList<>();
    public final C43316rmw djBIcL = new C43316rmw();
    public int KWHzl = C55298xhM.dp2px$default(24.0f, null, 1, null);
    public int AEQbTJ = C55298xhM.dp2px$default(16.0f, null, 1, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35976oKr
    public void OLrzqt(@NotNull oKD okd) {
        Intrinsics.checkNotNullParameter(okd, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.values = function0;
    }

    /* JADX INFO: renamed from: o.pqA$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pqA.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ ViewOnClickListenerC39320pqA newInstance$default(TaskDescription taskDescription, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return taskDescription.EZpvd(z, z2);
        }

        public final ViewOnClickListenerC39320pqA EZpvd(boolean z, boolean z2) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("is_from_full_screen", z);
            bundle.putBoolean("have_market_cap", z2);
            ViewOnClickListenerC39320pqA viewOnClickListenerC39320pqA = new ViewOnClickListenerC39320pqA();
            viewOnClickListenerC39320pqA.setArguments(bundle);
            return viewOnClickListenerC39320pqA;
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
        oMI.AEQbTJ(getLayoutInflater(), constraintLayout, true);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.gasjUx));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout constraintLayout;
        android.view.View rootView;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        this.AhwBna = arguments != null ? arguments.getBoolean("is_from_full_screen") : false;
        android.os.Bundle arguments2 = getArguments();
        this.gEmmrt = arguments2 != null ? arguments2.getBoolean("have_market_cap") : false;
        C54946xaf binding = getBinding();
        if (binding != null && (constraintLayout = binding.AEQbTJ) != null && (rootView = constraintLayout.getRootView()) != null) {
            this.isConnected = (RecyclerView) rootView.findViewById(C35964oKf.StateListAnimator.ITrustedWebActivityCallback);
            this.OLrzqt = (C52794wYp) rootView.findViewById(C35964oKf.StateListAnimator.fFgQHt);
            this.EZpvd = (C52794wYp) rootView.findViewById(C35964oKf.StateListAnimator.dxcTrN);
            this.AkhnZx = (android.widget.TextView) rootView.findViewById(C35964oKf.StateListAnimator.rateWithExtras);
            this.valueOf = (android.widget.LinearLayout) rootView.findViewById(C35964oKf.StateListAnimator.iRgjgR);
            this.AYXKKw = (android.widget.LinearLayout) rootView.findViewById(C35964oKf.StateListAnimator.HJWChPfvRMlC);
            djBIcL();
            gEmmrt();
            AYXKKw();
            valueOf();
        }
        view.post(new java.lang.Runnable() { // from class: o.pqE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC39320pqA.copydefault(this.copydefault);
            }
        });
    }

    public static final void copydefault(ViewOnClickListenerC39320pqA viewOnClickListenerC39320pqA) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewOnClickListenerC39320pqA, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void djBIcL() {
        if (C55608xnE.OLrzqt()) {
            android.widget.LinearLayout linearLayout = this.valueOf;
            if (linearLayout != null) {
                int i = this.KWHzl;
                linearLayout.setPadding(i, 0, i, 0);
            }
            RecyclerView recyclerView = this.isConnected;
            if (recyclerView != null) {
                recyclerView.setPadding(this.KWHzl, 0, this.AEQbTJ, 0);
            }
            android.widget.LinearLayout linearLayout2 = this.AYXKKw;
            if (linearLayout2 != null) {
                int i2 = this.KWHzl;
                linearLayout2.setPadding(i2, 0, i2, 0);
            }
        }
    }

    private final void gEmmrt() {
        C52794wYp c52794wYp = this.OLrzqt;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(this);
        }
        C52794wYp c52794wYp2 = this.EZpvd;
        if (c52794wYp2 != null) {
            c52794wYp2.setOnClickListener(this);
        }
    }

    private final void AYXKKw() {
        java.util.ArrayList<TimeIntervalItem> arrayList;
        java.util.ArrayList<TimeIntervalItem> arrayList2;
        java.util.ArrayList<TimeIntervalItem> arrayListKWHzl;
        pFN pfn = pFN.OLrzqt;
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pfn.djBIcL();
        if (interfaceC39509ptgDjBIcL == null || (arrayList = interfaceC39509ptgDjBIcL.AEQbTJ()) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        this.DbNXlk = arrayList;
        InterfaceC39509ptg interfaceC39509ptgDjBIcL2 = pfn.djBIcL();
        if (interfaceC39509ptgDjBIcL2 == null || (arrayListKWHzl = interfaceC39509ptgDjBIcL2.KWHzl()) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayListKWHzl, 10));
            java.util.Iterator<T> it = arrayListKWHzl.iterator();
            while (it.hasNext()) {
                arrayList2.add((TimeIntervalItem) xVA.EZpvd((TimeIntervalItem) it.next()));
            }
        }
        Intrinsics.copydefault(arrayList2, "");
        this.fetchVPNInfo = arrayList2;
        java.util.Iterator<T> it2 = this.DbNXlk.iterator();
        while (it2.hasNext()) {
            ((TimeIntervalItem) it2.next()).setSelected(false);
        }
        if (this.gEmmrt && this.fetchVPNInfo.size() > 3) {
            this.fetchVPNInfo = new java.util.ArrayList<>(this.fetchVPNInfo.subList(0, 3));
        }
        AEQbTJ();
        EZpvd();
    }

    public final void AEQbTJ() {
        java.lang.String str;
        android.widget.TextView textView = this.AkhnZx;
        if (textView != null) {
            if (this.gEmmrt) {
                str = C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.fetchVPNInfo.size())) + "/3";
            } else {
                str = C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.fetchVPNInfo.size())) + "/4";
            }
            textView.setText(str);
        }
    }

    public final void EZpvd() {
        int size = this.fetchVPNInfo.size();
        for (int i = 0; i < size; i++) {
            int size2 = this.DbNXlk.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                if (this.fetchVPNInfo.get(i).timeInterval == this.DbNXlk.get(i2).timeInterval) {
                    this.DbNXlk.get(i2).setSelected(true);
                    break;
                }
                i2++;
            }
        }
    }

    private final void valueOf() {
        C43316rmw c43316rmw = this.djBIcL;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c43316rmw.register(TimeIntervalItem.class, new C39482ptF(contextRequireContext, new Function1() { // from class: o.pqC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC39320pqA.copydefault(this.KWHzl, (TimeIntervalItem) obj);
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
        this.djBIcL.setItems(this.DbNXlk);
    }

    public static final Unit copydefault(ViewOnClickListenerC39320pqA viewOnClickListenerC39320pqA, TimeIntervalItem timeIntervalItem) {
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        viewOnClickListenerC39320pqA.OLrzqt(timeIntervalItem);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (fragmentManager.isStateSaved() || fragmentManager.isDestroyed()) {
                return;
            }
            show(fragmentManager, str);
        } catch (java.lang.Exception e) {
            pUU.copydefault("KlineLikeTimeSelectFragment", "Error showFragment: " + e.getMessage());
        }
    }

    @Override // androidx.fragment.app.Fragment
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
        } catch (java.lang.Exception e) {
            pUU.copydefault("KlineLikeTimeSelectFragment", "Error showDialog: " + e.getMessage());
        }
    }

    public final void OLrzqt(TimeIntervalItem timeIntervalItem) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        if (timeIntervalItem.isSelected()) {
            timeIntervalItem.setSelected(false);
            KWHzl();
            if (this.fetchVPNInfo.size() < 2 && (c52794wYp2 = this.EZpvd) != null) {
                c52794wYp2.setEnabled(false);
            }
        } else {
            if (this.gEmmrt) {
                if (this.fetchVPNInfo.size() >= 3) {
                    C55328xhq.show$default(C55328xhq.OLrzqt, C33069mpW.copydefault(this, C35964oKf.Fragment.QVMIlx, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", 3))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                } else {
                    timeIntervalItem.setSelected(true);
                    KWHzl();
                }
            } else if (this.fetchVPNInfo.size() >= 4) {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33069mpW.copydefault(this, C35964oKf.Fragment.QVMIlx, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", 4))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            } else {
                timeIntervalItem.setSelected(true);
                KWHzl();
            }
            if (this.fetchVPNInfo.size() >= 2 && (c52794wYp = this.EZpvd) != null) {
                c52794wYp.setEnabled(true);
            }
        }
        this.djBIcL.notifyDataSetChanged();
    }

    public final void KWHzl() {
        this.fetchVPNInfo.clear();
        for (TimeIntervalItem timeIntervalItem : this.DbNXlk) {
            if (timeIntervalItem.isSelected()) {
                this.fetchVPNInfo.add(timeIntervalItem);
            }
        }
        AEQbTJ();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C35964oKf.StateListAnimator.fFgQHt;
        if (numValueOf != null && numValueOf.intValue() == i) {
            copydefault();
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("KLine_TimeframePop_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pqF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39320pqA.EZpvd(this.KWHzl, (EventParamsList) obj);
                }
            });
            return;
        }
        int i2 = C35964oKf.StateListAnimator.dxcTrN;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            OLrzqt();
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("KLine_TimeframePop_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pqB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39320pqA.KWHzl(this.AEQbTJ, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(ViewOnClickListenerC39320pqA viewOnClickListenerC39320pqA, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("setting_button", "reset", true);
        eventParamsList.put("chart_layout", viewOnClickListenerC39320pqA.AhwBna ? "fullscreen" : "classic", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ViewOnClickListenerC39320pqA viewOnClickListenerC39320pqA, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("setting_button", Web3SecurityTrackEvent.VALUE_CONFIRM, true);
        eventParamsList.put("chart_layout", viewOnClickListenerC39320pqA.AhwBna ? "fullscreen" : "classic", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        pFN pfn = pFN.OLrzqt;
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pfn.djBIcL();
        if (interfaceC39509ptgDjBIcL != null) {
            interfaceC39509ptgDjBIcL.KWHzl(this.fetchVPNInfo);
        }
        InterfaceC39509ptg interfaceC39509ptgDjBIcL2 = pfn.djBIcL();
        if (interfaceC39509ptgDjBIcL2 != null) {
            interfaceC39509ptgDjBIcL2.gEmmrt();
        }
        Function0<Unit> function0 = this.values;
        if (function0 != null) {
            function0.invoke();
        }
        dismiss();
    }

    public final void copydefault() {
        java.util.Iterator<T> it = this.DbNXlk.iterator();
        while (it.hasNext()) {
            ((TimeIntervalItem) it.next()).setSelected(false);
        }
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
        java.util.ArrayList<TimeIntervalItem> arrayListEZpvd = interfaceC39509ptgDjBIcL != null ? interfaceC39509ptgDjBIcL.EZpvd() : null;
        java.util.ArrayList<TimeIntervalItem> arrayListCopydefault = C33129mqd.KWHzl((java.util.Collection) arrayListEZpvd) ? arrayListEZpvd : null;
        if (arrayListCopydefault == null) {
            arrayListCopydefault = pEW.EZpvd.copydefault();
        }
        this.fetchVPNInfo = arrayListCopydefault;
        if (this.gEmmrt && arrayListCopydefault.size() > 3) {
            this.fetchVPNInfo = new java.util.ArrayList<>(this.fetchVPNInfo.subList(0, 3));
        }
        EZpvd();
        AEQbTJ();
        C52794wYp c52794wYp = this.EZpvd;
        if (c52794wYp != null) {
            c52794wYp.setEnabled(true);
        }
        this.djBIcL.notifyDataSetChanged();
    }
}
