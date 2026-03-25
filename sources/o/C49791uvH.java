package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradeuilib.menu.mvp.ContractDualAdjustLeverP;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.AdjustLeverRequiredData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DualLeverageResp;
import com.okinc.unify_trade.biz.LeverIntervalData;
import com.okinc.widget.dialog.view.CenterLayoutManager;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33565myp;
import o.C49511upt;
import o.C55001xbh;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uvH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49791uvH extends AbstractC54505xKx<AbstractC49600urc, ContractDualAdjustLeverP> {
    public boolean AYXKKw;
    public Function1<? super android.content.Context, Unit> AhwBna;
    public android.animation.ObjectAnimator copydefault;
    public InterfaceC58217yxC ejfBZ;
    public boolean fIwbmz;
    public int getNewProxyInstance;
    public boolean valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.uwd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49791uvH.DbNXlk(this.EZpvd);
        }
    });
    public final int KWHzl = 6;
    public java.lang.String AkhnZx = "";
    public java.lang.String isConnected = "";
    public java.lang.String EZpvd = "";
    public final InterfaceC56387yDm fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.uwf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49791uvH.fIwbmz(this.OLrzqt);
        }
    });
    public java.lang.String fJNWhG = "";
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.uwg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49791uvH.copydefault();
        }
    });
    public final java.util.ArrayList<C49777uuu> fetchVPNInfo = new java.util.ArrayList<>();
    public final uBH AuCTel = new uBH(new Function0() { // from class: o.uwe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49791uvH.fARcdN(this.OLrzqt);
        }
    });
    public final uBH djBIcL = new uBH(new Function0() { // from class: o.uwh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49791uvH.isConnected(this.EZpvd);
        }
    });
    public final android.os.Handler values = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.lang.Runnable OLrzqt = new java.lang.Runnable() { // from class: o.uwi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            C49791uvH.valueOf(this.OLrzqt);
        }
    };
    public final Activity hDKMBd = new Activity();

    /* JADX INFO: renamed from: o.uvH$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C49511upt.StateListAnimator.zLjUOn;
    }

    public static final /* synthetic */ AbstractC49600urc gEmmrt(C49791uvH c49791uvH) {
        return c49791uvH.gGvvIC();
    }

    /* JADX INFO: renamed from: o.uvH$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uvH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C49791uvH AEQbTJ(android.os.Bundle bundle, @NotNull java.lang.String str, @NotNull Function1<? super android.content.Context, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C49791uvH c49791uvH = new C49791uvH();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putAll(bundle);
            bundle2.putString("posSide", str);
            c49791uvH.setArguments(bundle2);
            c49791uvH.AhwBna = function1;
            return c49791uvH;
        }
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.DbNXlk.getValue();
    }

    public static final java.lang.String DbNXlk(C49791uvH c49791uvH) {
        return c49791uvH.getString(C55688xof.Application.ActivityResultCallerKtExternalSyntheticLambda0);
    }

    public static final ContractDualAdjustLeverP fIwbmz(C49791uvH c49791uvH) {
        androidx.fragment.app.Fragment parentFragment = c49791uvH.getParentFragment();
        Intrinsics.copydefault(parentFragment, "");
        return (ContractDualAdjustLeverP) new ViewModelProvider(parentFragment).get(ContractDualAdjustLeverP.class);
    }

    public final ContractDualAdjustLeverP EZpvd() {
        return (ContractDualAdjustLeverP) this.fARcdN.getValue();
    }

    private final C43316rmw AYXKKw() {
        return (C43316rmw) this.gEmmrt.getValue();
    }

    public static final C43316rmw copydefault() {
        return new C43316rmw();
    }

    @Override // o.AbstractC54505xKx, o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("posSide")) == null) {
            string = "";
        }
        this.fJNWhG = string;
        dxcTrN().KWHzl(getArguments());
        this.EZpvd = Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "long") ? dxcTrN().valueOf() : dxcTrN().gEmmrt();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        TradeLiveData<Triple<java.lang.Boolean, LeverIntervalData, java.lang.String>> tradeLiveDataValues = EZpvd().values();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataValues.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.uvQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49791uvH.EZpvd(this.copydefault, (Triple) obj);
            }
        }));
        TradeLiveData<Triple<java.lang.Boolean, AdjustLeverRequiredData, java.lang.Exception>> tradeLiveDataEZpvd = dxcTrN().EZpvd();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner2, new ActionBar(new Function1() { // from class: o.uvP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49791uvH.OLrzqt(this.OLrzqt, (Triple) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = dxcTrN().fetchVPNInfo().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner3, new ActionBar(new Function1() { // from class: o.uvT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49791uvH.OLrzqt(this.copydefault, (java.lang.Exception) obj);
            }
        }));
        TradeLiveData<java.util.List<DualLeverageResp>> tradeLiveDataKWHzl = EZpvd().KWHzl();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner4, new ActionBar(new Function1() { // from class: o.uvS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49791uvH.EZpvd(this.copydefault, (java.util.List) obj);
            }
        }));
        dxcTrN().copydefault(this.EZpvd, this.fJNWhG);
        gGvvIC().EZpvd.setText(Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "long") ? C33070mpX.AYXKKw(C49511upt.Activity.zLjUOn) : C33070mpX.AYXKKw(C49511upt.Activity.AuCTelauCTel));
        AkhnZx();
        C55001xbh c55001xbh = gGvvIC().AEQbTJ;
        c55001xbh.setShowThousandsSeparator(true);
        c55001xbh.addTextChangedListener(this.djBIcL);
        c55001xbh.addTextChangedListener(this.AuCTel);
        c55001xbh.setModel(C55001xbh.ActionBar.copy$default(c55001xbh.DbNXlk(), 0, 0, 2, 3, null));
        AEQbTJ(C54797xVr.getCorrectShowLeverage$default(C54797xVr.copydefault, this.EZpvd, false, null, false, 14, null));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            c55001xbh.setTextColor(Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "long") ? C33508mxl.copydefault(activity) : C33508mxl.AEQbTJ(activity));
            gGvvIC().djBIcL.setTextColor(Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "long") ? C33508mxl.copydefault(activity) : C33508mxl.AEQbTJ(activity));
        }
        c55001xbh.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.uvV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view2, boolean z) {
                C49791uvH.KWHzl(this.EZpvd, view2, z);
            }
        });
        OKReminder oKReminder = gGvvIC().getFieldNames;
        oKReminder.setStyle(2);
        oKReminder.setCloseIconVisibility(true);
        oKReminder.setOnCloseIconCallback(new Function0() { // from class: o.uvU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49791uvH.fetchVPNInfo(this.copydefault);
            }
        });
        oKReminder.setPrimaryAction(C33070mpX.AYXKKw(C49511upt.Activity.copydefault), new Function0() { // from class: o.uvW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49791uvH.values(this.OLrzqt);
            }
        });
    }

    public static final Unit EZpvd(C49791uvH c49791uvH, Triple triple) {
        LeverIntervalData leverIntervalData;
        Intrinsics.checkNotNullParameter(triple, "");
        if (((java.lang.Boolean) triple.getFirst()).booleanValue() && (leverIntervalData = (LeverIntervalData) triple.getSecond()) != null) {
            int i = 0;
            c49791uvH.AYXKKw = leverIntervalData.isBeyondMax() == 1;
            c49791uvH.KWHzl(leverIntervalData.getMinLevel(), leverIntervalData.getMaxLevel());
            try {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) leverIntervalData.getPercents(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                if (listSplit$default.size() != 1 || !Intrinsics.EZpvd(listSplit$default.get(0), (java.lang.Object) "")) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
                    for (java.lang.Object obj : listSplit$default) {
                        if (i < 0) {
                            yDY.AYXKKw();
                        }
                        java.lang.String str = (java.lang.String) obj;
                        arrayList.add(new C49777uuu(str + "x", str, C33129mqd.OLrzqt(str, c49791uvH.EZpvd), i));
                        i++;
                    }
                    if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
                        c49791uvH.EZpvd(arrayList);
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C49791uvH c49791uvH, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        if (((java.lang.Boolean) triple.getFirst()).booleanValue()) {
            c49791uvH.AEQbTJ(true, (AdjustLeverRequiredData) triple.getSecond(), (java.lang.Exception) triple.getThird());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C49791uvH c49791uvH, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c49791uvH.AEQbTJ(false, (AdjustLeverRequiredData) null, exc);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C49791uvH c49791uvH, java.util.List list) {
        DualLeverageResp dualLeverageResp = null;
        java.lang.Object obj = null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DualLeverageResp) next).getPosSide(), (java.lang.Object) c49791uvH.fJNWhG)) {
                    obj = next;
                    break;
                }
            }
            dualLeverageResp = (DualLeverageResp) obj;
        }
        if (dualLeverageResp != null && C33129mqd.AhwBna(dualLeverageResp.getCode(), 0)) {
            c49791uvH.EZpvd(dualLeverageResp.getErrorMessage());
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C49791uvH c49791uvH, android.view.View view, boolean z) {
        Intrinsics.copydefault(view);
        c49791uvH.KWHzl(view);
    }

    public static final Unit fetchVPNInfo(C49791uvH c49791uvH) {
        c49791uvH.gGvvIC().getFieldNames.setVisibility(8);
        return Unit.INSTANCE;
    }

    public static final Unit values(C49791uvH c49791uvH) {
        FragmentActivity activity = c49791uvH.getActivity();
        if (activity != null) {
            Function1<? super android.content.Context, Unit> function1 = c49791uvH.AhwBna;
            if (function1 != null) {
                function1.invoke(activity);
            }
            C32866mlf.onEvent$default("MarginTradePage_ProMarginWarningSheet_Errorscreen_Click", (TrackChannel[]) null, new Function1() { // from class: o.uvN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49791uvH.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "get_higher_leverage", false, 4, null);
        return Unit.INSTANCE;
    }

    private final void AkhnZx() {
        android.content.Context context = getContext();
        if (context != null) {
            gGvvIC().ejfBZ.setLayoutManager(new CenterLayoutManager(context, 0, false));
            AYXKKw().register(C49777uuu.class, new C49776uut(new Function2() { // from class: o.uvM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C49791uvH.copydefault(this.AEQbTJ, (C49777uuu) obj, ((java.lang.Boolean) obj2).booleanValue());
                }
            }));
            gGvvIC().ejfBZ.setAdapter(AYXKKw());
            gGvvIC().uzCIH.setOnClickListener(new View.OnClickListener() { // from class: o.uvL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C49791uvH.OLrzqt(this.AEQbTJ, view);
                }
            });
            if (this.fetchVPNInfo.size() > this.KWHzl) {
                gGvvIC().ejfBZ.addOnScrollListener(this.hDKMBd);
            } else {
                gGvvIC().uzCIH.setVisibility(8);
                gGvvIC().ejfBZ.removeOnScrollListener(this.hDKMBd);
            }
        }
        gGvvIC().gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.uvY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49791uvH.copydefault(this.copydefault, view);
            }
        });
        gGvvIC().valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.uwb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49791uvH.gEmmrt(this.AEQbTJ, view);
            }
        });
        android.widget.TextView textView = gGvvIC().fIwbmz;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(values() ? 0 : 8);
    }

    public static final Unit copydefault(C49791uvH c49791uvH, C49777uuu c49777uuu, boolean z) {
        Intrinsics.checkNotNullParameter(c49777uuu, "");
        RecyclerView.LayoutManager layoutManager = c49791uvH.gGvvIC().ejfBZ.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            c49791uvH.copydefault(linearLayoutManager, true);
        }
        if (z) {
            c49791uvH.gGvvIC().AEQbTJ.removeTextChangedListener(c49791uvH.AuCTel);
            c49791uvH.AEQbTJ(C54797xVr.getCorrectShowLeverage$default(C54797xVr.copydefault, c49777uuu.AEQbTJ(), false, null, false, 14, null));
            c49791uvH.gGvvIC().AEQbTJ.addTextChangedListener(c49791uvH.AuCTel);
            android.widget.TextView textView = c49791uvH.gGvvIC().AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
        }
        c49791uvH.gGvvIC().getFieldNames.setVisibility(8);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C49791uvH c49791uvH, android.view.View view) {
        c49791uvH.gGvvIC().ejfBZ.smoothScrollToPosition(c49791uvH.fetchVPNInfo.size() - 1);
    }

    public static final void copydefault(C49791uvH c49791uvH, android.view.View view) {
        java.lang.String strSubS$default = C33129mqd.subS$default(c49791uvH.gGvvIC().AEQbTJ.isConnected(), 1, 2, java.lang.Boolean.FALSE, null, 8, null);
        c49791uvH.gGvvIC().getFieldNames.setVisibility(8);
        if (C33129mqd.gEmmrt(strSubS$default, c49791uvH.AkhnZx)) {
            return;
        }
        c49791uvH.gGvvIC().AEQbTJ.setPlainNumericText(strSubS$default);
    }

    public static final void gEmmrt(C49791uvH c49791uvH, android.view.View view) {
        java.lang.String strAddS$default = C33129mqd.addS$default(c49791uvH.gGvvIC().AEQbTJ.isConnected(), 1, 2, java.lang.Boolean.FALSE, null, 8, null);
        if (C33129mqd.AEQbTJ(strAddS$default, c49791uvH.isConnected)) {
            c49791uvH.djBIcL();
        } else {
            c49791uvH.gGvvIC().AEQbTJ.setPlainNumericText(strAddS$default);
        }
    }

    public final void djBIcL() {
        if (this.AYXKKw) {
            gGvvIC().getFieldNames.setVisibility(0);
        }
    }

    private final boolean values() {
        C56084xwD fieldNames;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String strCopydefault = null;
        strCopydefault = null;
        if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(dxcTrN().djBIcL())) != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            strCopydefault = abstractC54531xLwOLrzqt.copydefault(interfaceC54581xNrOLrzqt2 != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, dxcTrN().djBIcL(), dxcTrN().AhwBna(), null, null, 12, null) : null);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
        return interfaceC54581xNrOLrzqt3 != null && (fieldNames = interfaceC54581xNrOLrzqt3.getFieldNames()) != null && fieldNames.gEmmrt() && Intrinsics.EZpvd((java.lang.Object) "SWAP", (java.lang.Object) dxcTrN().djBIcL()) && Intrinsics.EZpvd((java.lang.Object) "linear", (java.lang.Object) strCopydefault);
    }

    public static final Unit fARcdN(C49791uvH c49791uvH) {
        c49791uvH.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(final C49791uvH c49791uvH) {
        java.lang.String strIsConnected = c49791uvH.gGvvIC().AEQbTJ.isConnected();
        java.lang.String str = "";
        if (strIsConnected == null || strIsConnected.length() == 0 || C33129mqd.AEQbTJ(strIsConnected) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            strIsConnected = "";
        }
        if (c49791uvH.isConnected.length() > 0 && C33129mqd.AEQbTJ(strIsConnected, c49791uvH.isConnected)) {
            c49791uvH.gGvvIC().AEQbTJ.postDelayed(new java.lang.Runnable() { // from class: o.uvK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C49791uvH.AkhnZx(this.copydefault);
                }
            }, 50L);
            c49791uvH.djBIcL();
            return Unit.INSTANCE;
        }
        if (!c49791uvH.fIwbmz) {
            c49791uvH.gGvvIC().getFieldNames.setVisibility(8);
        }
        c49791uvH.fIwbmz = false;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(strIsConnected)));
        if (C33129mqd.AEQbTJ(strGEmmrt) != C33129mqd.AEQbTJ(c49791uvH.EZpvd)) {
            if ((c49791uvH.AkhnZx.length() == 0 && c49791uvH.isConnected.length() == 0) || (C33129mqd.subD$default(strGEmmrt, c49791uvH.AkhnZx, null, null, null, 14, null) >= AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.subD$default(strGEmmrt, c49791uvH.isConnected, null, null, null, 14, null) <= AudioStats.AUDIO_AMPLITUDE_NONE)) {
                str = strGEmmrt;
            }
            c49791uvH.EZpvd = str;
            c49791uvH.OLrzqt(str);
            if (!c49791uvH.AYXKKw) {
                c49791uvH.gGvvIC().valueOf.setEnabled(C33129mqd.valueOf(C33129mqd.addS$default(c49791uvH.EZpvd, 1, null, null, null, 14, null), c49791uvH.isConnected));
            }
            c49791uvH.gGvvIC().gEmmrt.setEnabled(C33129mqd.copydefault(C33129mqd.subS$default(c49791uvH.EZpvd, 1, null, null, null, 14, null), c49791uvH.AkhnZx));
            c49791uvH.KWHzl(c49791uvH.EZpvd);
        }
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(C49791uvH c49791uvH) {
        c49791uvH.fIwbmz = true;
        c49791uvH.AEQbTJ(C33129mqd.formatS$default(c49791uvH.isConnected, null, null, null, 7, null));
    }

    public final void OLrzqt(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "long")) {
            EZpvd().KWHzl(str);
        } else {
            EZpvd().copydefault(str);
        }
    }

    private final void KWHzl(final java.lang.String str) {
        InterfaceC58217yxC interfaceC58217yxC = this.ejfBZ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.just("").delay(300L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.uvX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49791uvH.AEQbTJ(str, this, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uwa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49791uvH.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.uvZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49791uvH.OLrzqt((java.lang.Throwable) obj);
            }
        };
        this.ejfBZ = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uwc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49791uvH.EZpvd(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.String str, C49791uvH c49791uvH, java.lang.String str2) {
        if (str.length() == 0) {
            c49791uvH.AYXKKw(str);
            return Unit.INSTANCE;
        }
        c49791uvH.dxcTrN().copydefault(str, c49791uvH.fJNWhG);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    private final void EZpvd(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            android.widget.TextView textView = gGvvIC().AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            gGvvIC().AhwBna.setText(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        java.lang.String str5;
        java.lang.String strAYXKKw;
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default;
        java.lang.String safeString$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLIsConnected2;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLDjBIcL4;
        C54536xML c54536xMLFetchVPNInfo2;
        java.lang.String safeString$default2;
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default2;
        str5 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (isAdded() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd)) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            java.lang.String strEZpvd = null;
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, dxcTrN().djBIcL(), dxcTrN().AhwBna(), null, null, 12, null) : null;
            java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.OLrzqt(dxcTrN().djBIcL()) : null;
            if (str2.length() == 0) {
                if (abstractC54531xLwOLrzqt != null) {
                    c54571xNhCreateTradeConverterWithIndex$default2 = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily == null ? "" : instFamily, null, 2, null);
                } else {
                    c54571xNhCreateTradeConverterWithIndex$default2 = null;
                }
                copydefault(C33070mpX.AYXKKw(C49511upt.Activity.AxsJAYaxsJAY), "-- " + (c54571xNhCreateTradeConverterWithIndex$default2 != null ? c54571xNhCreateTradeConverterWithIndex$default2.OLrzqt() : null));
            } else {
                xMJ.Application value = EZpvd().isConnected().getValue();
                if (value == null || (strAYXKKw = value.AYXKKw()) == null) {
                    strAYXKKw = "";
                }
                if (abstractC54531xLwOLrzqt != null) {
                    c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily == null ? "" : instFamily, null, 2, null);
                } else {
                    c54571xNhCreateTradeConverterWithIndex$default = null;
                }
                if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                    c54571xNhCreateTradeConverterWithIndex$default.AhwBna(strAYXKKw);
                }
                if (c54571xNhCreateTradeConverterWithIndex$default == null || (c54536xMLDjBIcL = c54571xNhCreateTradeConverterWithIndex$default.djBIcL(str2)) == null || (c54536xMLIsConnected = c54536xMLDjBIcL.isConnected()) == null || (c54536xMLDjBIcL2 = c54536xMLIsConnected.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
                    safeString$default = "";
                }
                copydefault(C33070mpX.AYXKKw(C49511upt.Activity.AxsJAYaxsJAY), safeString$default);
            }
            if (str3.length() == 0) {
                AEQbTJ("", "");
            } else if (abstractC54531xLwOLrzqt != null) {
                xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily == null ? "" : instFamily);
                if (xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(str3)) == null || (c54536xMLIsConnected2 = c54536xMLAYXKKw.isConnected()) == null || (c54536xMLDjBIcL3 = c54536xMLIsConnected2.djBIcL()) == null || (c54536xMLAkhnZx = c54536xMLDjBIcL3.AkhnZx()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAkhnZx, false, 1, null)) == null) {
                }
                AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDCKfqP), safeString$default);
            } else {
                java.lang.String safeString$default3 = "";
                AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDCKfqP), safeString$default3);
            }
            if (str4.length() == 0) {
                if (abstractC54531xLwOLrzqt != null) {
                    xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily != null ? instFamily : "", null, 2, null);
                    if (xmvCreateSizeConverterWithIndex$default != null) {
                        strEZpvd = xmvCreateSizeConverterWithIndex$default.EZpvd();
                    }
                }
                KWHzl((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.ORmwhf), "-- " + strEZpvd);
                return;
            }
            if (abstractC54531xLwOLrzqt != null) {
                if (instFamily == null) {
                    instFamily = "";
                }
                xMV xmvCreateSizeConverterWithIndex$default2 = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
                if (xmvCreateSizeConverterWithIndex$default2 != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default2.copydefault(str4)) != null && (c54536xMLAuCTel = c54536xMLCopydefault.AuCTel()) != null && (c54536xMLDjBIcL4 = c54536xMLAuCTel.djBIcL()) != null && (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL4.fetchVPNInfo()) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null)) != null) {
                    str5 = safeString$default2;
                }
            }
            KWHzl((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.ORmwhf), str5);
        }
    }

    public final void KWHzl(java.lang.CharSequence charSequence, java.lang.String str) {
        android.widget.TextView textView = gGvvIC().DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(charSequence.length() > 0 ? 0 : 8);
        android.widget.TextView textView2 = gGvvIC().fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(charSequence.length() > 0 ? 0 : 8);
        gGvvIC().DbNXlk.setText(charSequence);
        gGvvIC().fetchVPNInfo.setText(str);
    }

    public final void copydefault(java.lang.CharSequence charSequence, java.lang.String str) {
        gGvvIC().values.setText(charSequence);
        gGvvIC().fARcdN.setText(str);
    }

    public final void AEQbTJ(java.lang.CharSequence charSequence, java.lang.String str) {
        if (str.length() == 0) {
            gGvvIC().AkhnZx.setVisibility(8);
            gGvvIC().isConnected.setVisibility(8);
        } else {
            gGvvIC().AkhnZx.setVisibility(0);
            gGvvIC().isConnected.setVisibility(0);
            gGvvIC().AkhnZx.setText(charSequence);
            gGvvIC().isConnected.setText(str);
        }
    }

    public final void AEQbTJ(boolean z, AdjustLeverRequiredData adjustLeverRequiredData, java.lang.Exception exc) {
        java.lang.String maxAmount;
        java.lang.String liqPx;
        java.lang.String margin;
        java.lang.String availTransfer;
        java.lang.String second;
        java.lang.String message;
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairEZpvd = dxcTrN().EZpvd(z, adjustLeverRequiredData, exc);
        if (!pairEZpvd.getFirst().booleanValue() && (((second = pairEZpvd.getSecond()) == null || second.length() == 0) && exc != null && (message = exc.getMessage()) != null)) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        java.lang.String strAkhnZx = dxcTrN().AkhnZx();
        java.lang.String str = "";
        if (adjustLeverRequiredData == null || (maxAmount = adjustLeverRequiredData.getMaxAmount()) == null) {
            maxAmount = "";
        }
        if (adjustLeverRequiredData == null || (liqPx = adjustLeverRequiredData.getLiqPx()) == null) {
            liqPx = "";
        }
        if (adjustLeverRequiredData == null || (margin = adjustLeverRequiredData.getMargin()) == null) {
            margin = "";
        }
        AEQbTJ(strAkhnZx, maxAmount, liqPx, margin);
        java.lang.String strAkhnZx2 = dxcTrN().AkhnZx();
        boolean zBooleanValue = pairEZpvd.getFirst().booleanValue();
        java.lang.String second2 = pairEZpvd.getSecond();
        if (adjustLeverRequiredData != null && (availTransfer = adjustLeverRequiredData.getAvailTransfer()) != null) {
            str = availTransfer;
        }
        KWHzl(strAkhnZx2, zBooleanValue, second2, str);
    }

    public static final void EZpvd(C49791uvH c49791uvH, java.lang.String str) {
        if (str == null || str.length() == 0) {
            java.lang.String string = c49791uvH.getString(C49511upt.Activity.QHmsKR);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c49791uvH.copydefault(string);
        } else {
            c49791uvH.copydefault(str);
        }
        c49791uvH.OLrzqt(false);
    }

    public static final void OLrzqt(C49791uvH c49791uvH, java.lang.String str) {
        c49791uvH.copydefault(str);
        c49791uvH.AEQbTJ(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(C49791uvH c49791uvH, java.lang.String str) {
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLDjBIcL;
        c49791uvH.AEQbTJ(true);
        if (C33129mqd.AEQbTJ(str) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            c49791uvH.copydefault("");
            return;
        }
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, c49791uvH.dxcTrN().djBIcL(), c49791uvH.dxcTrN().AhwBna(), null, null, 12, null) : null;
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.OLrzqt(c49791uvH.dxcTrN().djBIcL()) : null;
        if (abstractC54531xLwOLrzqt == null) {
            c54536xMLCopydefault = null;
        } else {
            if (instFamily == null) {
                instFamily = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null) {
                c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.abs(dAEQbTJ))));
            }
        }
        java.lang.String strGEmmrt = c54536xMLCopydefault != null ? c54536xMLCopydefault.gEmmrt() : null;
        if (c54536xMLCopydefault == null || (c54536xMLAuCTel = c54536xMLCopydefault.AuCTel()) == null || (c54536xMLDjBIcL = c54536xMLAuCTel.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
            safeString$default = "";
        }
        if (dAEQbTJ > AudioStats.AUDIO_AMPLITUDE_NONE) {
            c49791uvH.copydefault("");
        } else {
            int i = C49511upt.Activity.AubY;
            java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", safeString$default), C56390yDp.OLrzqt("unit", strGEmmrt));
            Intrinsics.copydefault(mapGEmmrt, "");
            c49791uvH.copydefault(C33069mpW.copydefault(c49791uvH, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) mapGEmmrt));
        }
        if (c49791uvH.gEmmrt().length() != 0 || C33129mqd.AEQbTJ(c49791uvH.EZpvd) < 3.0d) {
            return;
        }
        c49791uvH.copydefault(c49791uvH.valueOf());
    }

    public final void KWHzl(@NotNull java.lang.String str, boolean z, java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd)) {
            if (z) {
                EZpvd(this, str2);
            } else if (str2 != null && str2.length() != 0) {
                OLrzqt(this, str2);
            } else {
                copydefault(this, str3);
            }
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        gGvvIC().AEQbTJ.setPlainNumericText(str);
    }

    private final void copydefault(java.lang.String str) {
        android.widget.TextView textView = gGvvIC().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str) ? 0 : 8);
        gGvvIC().AYXKKw.setText(str);
    }

    private final java.lang.String gEmmrt() {
        return C33129mqd.gEmmrt(gGvvIC().AYXKKw.getText());
    }

    private final void OLrzqt(boolean z) {
        gGvvIC().AEQbTJ.setEnabled(z);
        AEQbTJ(z);
    }

    private final void AEQbTJ(boolean z) {
        if (Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "long")) {
            EZpvd().OLrzqt(z);
        } else {
            EZpvd().EZpvd(z);
        }
    }

    private final void AYXKKw(java.lang.String str) {
        if (isAdded() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd)) {
            AEQbTJ(str, "", "", "");
            copydefault("");
            AEQbTJ(false);
        }
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        if (C33129mqd.AEQbTJ(str2) > AudioStats.AUDIO_AMPLITUDE_NONE && (!Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) str) || !Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) str2))) {
            C54797xVr c54797xVr = C54797xVr.copydefault;
            this.AkhnZx = C54797xVr.getCorrectShowLeverage$default(c54797xVr, str, false, null, false, 14, null);
            this.isConnected = C54797xVr.getCorrectShowLeverage$default(c54797xVr, str2, false, null, false, 14, null);
        }
        gGvvIC().valueOf.setEnabled(C33129mqd.valueOf(C33129mqd.addS$default(this.EZpvd, 1, null, null, null, 14, null), str2));
        gGvvIC().gEmmrt.setEnabled(C33129mqd.copydefault(C33129mqd.subS$default(this.EZpvd, 1, null, null, null, 14, null), str));
        gGvvIC().getFieldNames.setMessage(C33069mpW.copydefault(this, C49511upt.Activity.OLrzqt, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("maxLeverage", str2 + "x"))));
    }

    public static final void valueOf(C49791uvH c49791uvH) {
        RecyclerView.LayoutManager layoutManager = c49791uvH.gGvvIC().ejfBZ.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            c49791uvH.copydefault(linearLayoutManager, true);
        }
    }

    public final void EZpvd(@NotNull java.util.List<C49777uuu> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.fetchVPNInfo.clear();
        this.fetchVPNInfo.addAll(list);
        if (this.fetchVPNInfo.size() > this.KWHzl) {
            gGvvIC().ejfBZ.addOnScrollListener(this.hDKMBd);
        } else {
            gGvvIC().ejfBZ.removeOnScrollListener(this.hDKMBd);
            gGvvIC().uzCIH.setVisibility(8);
        }
        C33064mpR.OLrzqt(AYXKKw(), (java.util.List<? extends java.lang.Object>) this.fetchVPNInfo);
        this.values.removeCallbacks(this.OLrzqt);
        this.values.postDelayed(this.OLrzqt, 100L);
    }

    /* JADX INFO: renamed from: o.uvH$Activity */
    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                RecyclerView.LayoutManager layoutManager = C49791uvH.gEmmrt(C49791uvH.this).ejfBZ.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    C49791uvH.this.copydefault(linearLayoutManager, false);
                }
            }
        }
    }

    public final void copydefault(LinearLayoutManager linearLayoutManager, boolean z) {
        java.lang.Object next;
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() != this.fetchVPNInfo.size() - 1 && this.fetchVPNInfo.size() > this.KWHzl) {
            gGvvIC().uzCIH.setVisibility(0);
        } else {
            gGvvIC().uzCIH.setVisibility(8);
        }
        if (z) {
            java.util.Iterator<T> it = this.fetchVPNInfo.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((C49777uuu) next).KWHzl()) {
                        break;
                    }
                }
            }
            C49777uuu c49777uuu = (C49777uuu) next;
            int iCopydefault = c49777uuu != null ? c49777uuu.copydefault() : -1;
            if (iCopydefault == -1) {
                return;
            }
            gGvvIC().ejfBZ.smoothScrollToPosition(iCopydefault);
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C33565myp.EZpvd().copydefault(requireActivity(), new C33565myp.Application() { // from class: o.uvO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C33565myp.Application
            public final void EZpvd(int i, boolean z) {
                C49791uvH.EZpvd(this.AEQbTJ, i, z);
            }
        });
    }

    public static final void EZpvd(C49791uvH c49791uvH, int i, boolean z) {
        if (c49791uvH.valueOf == z) {
            return;
        }
        c49791uvH.valueOf = z;
        c49791uvH.getNewProxyInstance = i;
        if (z) {
            if (c49791uvH.gGvvIC().AEQbTJ.hasFocus()) {
                C55001xbh c55001xbh = c49791uvH.gGvvIC().AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
                c49791uvH.KWHzl(c55001xbh);
                return;
            }
            return;
        }
        if (c49791uvH.gGvvIC().AEQbTJ.hasFocus()) {
            c49791uvH.gGvvIC().AEQbTJ.clearFocus();
        }
        android.view.View viewKWHzl = c49791uvH.KWHzl();
        if (viewKWHzl != null) {
            c49791uvH.OLrzqt(viewKWHzl, viewKWHzl.getTranslationY(), 0.0f);
        }
    }

    public final void OLrzqt(android.view.View view, float f, float f2) {
        if (C33129mqd.OLrzqt(java.lang.Float.valueOf(view.getTranslationY()), java.lang.Float.valueOf(f2))) {
            return;
        }
        android.animation.ObjectAnimator objectAnimator = this.copydefault;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", f, f2);
        this.copydefault = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(100L);
        }
        android.animation.ObjectAnimator objectAnimator2 = this.copydefault;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C33565myp.EZpvd().OLrzqt();
    }

    public final void KWHzl(android.view.View view) {
        android.content.res.Resources resources;
        if (getContext() == null || !isAdded()) {
            return;
        }
        if (view.hasFocus()) {
            android.content.Context context = getContext();
            if (context == null || (resources = context.getResources()) == null) {
                return;
            }
            final int iAEQbTJ = C55302xhQ.AEQbTJ(resources);
            gGvvIC().OLrzqt.postDelayed(new java.lang.Runnable() { // from class: o.uvR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C49791uvH.KWHzl(this.EZpvd, iAEQbTJ);
                }
            }, 70L);
            return;
        }
        android.view.View viewKWHzl = KWHzl();
        if (viewKWHzl != null) {
            OLrzqt(viewKWHzl, viewKWHzl.getTranslationY(), 0.0f);
        }
    }

    public static final void KWHzl(C49791uvH c49791uvH, int i) {
        android.view.View viewKWHzl;
        int[] iArr = new int[2];
        c49791uvH.gGvvIC().KWHzl.getLocationOnScreen(iArr);
        int height = (c49791uvH.getNewProxyInstance - ((i - iArr[1]) - c49791uvH.gGvvIC().KWHzl.getHeight())) - C55298xhM.dp2px$default(10.0f, null, 1, null);
        if (height <= 0 || (viewKWHzl = c49791uvH.KWHzl()) == null) {
            return;
        }
        c49791uvH.OLrzqt(viewKWHzl, 0.0f, -height);
    }

    public final android.view.View KWHzl() {
        android.view.View view;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (view = parentFragment.getView()) == null) {
            return null;
        }
        return view.findViewById(C49511upt.Application.sSMYrx);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        gGvvIC().AEQbTJ.clearFocus();
        gGvvIC().AEQbTJ.setOnFocusChangeListener(null);
    }

    public final void OLrzqt() {
        for (C49777uuu c49777uuu : this.fetchVPNInfo) {
            c49777uuu.KWHzl(C33129mqd.OLrzqt(c49777uuu.AEQbTJ(), this.EZpvd));
        }
        AYXKKw().notifyDataSetChanged();
        RecyclerView.LayoutManager layoutManager = gGvvIC().ejfBZ.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            copydefault(linearLayoutManager, true);
        }
        android.widget.TextView textView = gGvvIC().AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
    }
}
