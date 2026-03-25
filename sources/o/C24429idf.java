package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.DexQuoteInfo;
import com.okinc.business.dexlogic.bean.DexRouterList;
import com.okinc.business.dexlogic.bean.SubRouter;
import com.okinc.business.dexlogic.main.swap.route.SmartRoutingViewModel;
import com.okinc.business.dexui.main.swap.route.SmartRoutingData;
import com.okinc.business.domain.model.PathRouterUi;
import com.okinc.rxutils.SubHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C24364icT;
import o.C24441idr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.idf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24429idf extends AbstractC24351icG {
    public Function1<? super AbstractC24351icG, Unit> AYXKKw;
    public Function0<Unit> DbNXlk;
    public Function0<Unit> djBIcL;
    public hBB gEmmrt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AhwBna = 8;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.idl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24429idf.fARcdN();
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.idk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24429idf.AhwBna(this.copydefault);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.idm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24429idf.valueOf(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.ido
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24429idf.djBIcL(this.copydefault);
        }
    });
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.idp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24429idf.copydefault(this.copydefault);
        }
    });

    /* JADX INFO: renamed from: o.idf$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.idf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.idf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C24429idf OLrzqt(@NotNull java.lang.String str, @NotNull SmartRoutingData smartRoutingData, PathRouterUi pathRouterUi, @NotNull Function1<? super AbstractC24351icG, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(smartRoutingData, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            C24429idf c24429idf = new C24429idf();
            c24429idf.AYXKKw = function1;
            c24429idf.DbNXlk = function0;
            c24429idf.djBIcL = function02;
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("data", smartRoutingData);
            bundle.putParcelable("selected_router", pathRouterUi);
            c24429idf.setArguments(bundle);
            return c24429idf;
        }
    }

    private final C43316rmw DbNXlk() {
        return (C43316rmw) this.valueOf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw fARcdN() {
        return new C43316rmw();
    }

    public final SmartRoutingViewModel AhwBna() {
        return (SmartRoutingViewModel) this.isConnected.getValue();
    }

    public static final SmartRoutingViewModel AhwBna(C24429idf c24429idf) {
        return (SmartRoutingViewModel) new ViewModelProvider(c24429idf).get(SmartRoutingViewModel.class);
    }

    public final C24408idK AYXKKw() {
        return (C24408idK) this.fetchVPNInfo.getValue();
    }

    public static final C24408idK valueOf(final C24429idf c24429idf) {
        return new C24408idK(c24429idf.AhwBna(), new Function1() { // from class: o.idn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24429idf.EZpvd(this.AEQbTJ, (SubRouter) obj);
            }
        });
    }

    public static final Unit EZpvd(C24429idf c24429idf, SubRouter subRouter) {
        Intrinsics.checkNotNullParameter(subRouter, "");
        c24429idf.AEQbTJ(subRouter);
        return Unit.INSTANCE;
    }

    public final C24409idL djBIcL() {
        return (C24409idL) this.AkhnZx.getValue();
    }

    public static final C24409idL djBIcL(final C24429idf c24429idf) {
        return new C24409idL(c24429idf.AhwBna(), new Function1() { // from class: o.idt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24429idf.AEQbTJ(this.EZpvd, (SubRouter) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C24429idf c24429idf, SubRouter subRouter) {
        Intrinsics.checkNotNullParameter(subRouter, "");
        c24429idf.AEQbTJ(subRouter);
        return Unit.INSTANCE;
    }

    public final C24406idI gEmmrt() {
        return (C24406idI) this.values.getValue();
    }

    public static final C24406idI copydefault(final C24429idf c24429idf) {
        return new C24406idI(c24429idf.AhwBna(), new Function2() { // from class: o.ids
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C24429idf.AEQbTJ(this.EZpvd, (DexQuoteBridgeVO) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(C24429idf c24429idf, DexQuoteBridgeVO dexQuoteBridgeVO, java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexQuoteBridgeVO, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iCopydefault = c24429idf.copydefault();
        C24364icT.StateListAnimator stateListAnimator = C24364icT.Companion;
        Function0<Unit> function0 = c24429idf.DbNXlk;
        Intrinsics.copydefault(function0);
        Function0<Unit> function02 = c24429idf.djBIcL;
        Intrinsics.copydefault(function02);
        C24364icT c24364icTOLrzqt = stateListAnimator.OLrzqt(str, dexQuoteBridgeVO, iCopydefault, function0, function02);
        Function1<? super AbstractC24351icG, Unit> function1 = c24429idf.AYXKKw;
        if (function1 != null) {
            function1.invoke(c24364icTOLrzqt);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC24351icG
    public void OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.gEmmrt = hBB.OLrzqt(layoutInflater, viewGroup, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl(true);
        isConnected();
        fetchVPNInfo();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void fetchVPNInfo() {
        C24491ieo c24491ieo;
        AhwBna().KWHzl(getArguments());
        SmartRoutingData smartRoutingDataAhwBna = AhwBna().AhwBna();
        java.lang.String strAEQbTJ = smartRoutingDataAhwBna != null ? smartRoutingDataAhwBna.AEQbTJ() : null;
        if (strAEQbTJ != null) {
            switch (strAEQbTJ.hashCode()) {
                case 48:
                    if (strAEQbTJ.equals("0")) {
                        AhwBna().KWHzl("0");
                        break;
                    }
                    break;
                case 49:
                    if (strAEQbTJ.equals("1")) {
                        AhwBna().isConnected();
                        hBB hbb = this.gEmmrt;
                        if (hbb != null && (c24491ieo = hbb.EZpvd) != null) {
                            c24491ieo.KWHzl(AhwBna().AYXKKw(), new Function1() { // from class: o.idq
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C24429idf.copydefault(this.EZpvd, (java.lang.String) obj);
                                }
                            });
                        }
                        AhwBna().KWHzl(AhwBna().EZpvd());
                        break;
                    }
                    break;
                case 50:
                    if (strAEQbTJ.equals("2")) {
                        AhwBna().KWHzl("2");
                        break;
                    }
                    break;
            }
        }
    }

    public static final Unit copydefault(C24429idf c24429idf, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c24429idf.EZpvd(str);
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        values();
        AkhnZx();
        if (AEQbTJ() != null) {
            C33566myq c33566myq = C33566myq.EZpvd;
            android.content.Context applicationContext = requireContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            int iEZpvd = c33566myq.EZpvd(applicationContext);
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            int iEZpvd2 = C33052mpF.EZpvd(16.0f, contextRequireContext);
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            int iEZpvd3 = C33052mpF.EZpvd(44.0f, contextRequireContext2);
            android.content.Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            int iEZpvd4 = C33052mpF.EZpvd(23.0f, contextRequireContext3);
            wXQ wxqKWHzl = KWHzl();
            if (wxqKWHzl != null) {
                wxqKWHzl.AYXKKw().setText(C25352ivB.findEclipsePlace$default(wxqKWHzl.AYXKKw(), C33070mpX.AYXKKw(C23274hvD.Fragment.getCallerContract), ((iEZpvd - iEZpvd2) - iEZpvd3) - iEZpvd4, null, 0, 12, null));
                wxqKWHzl.AYXKKw().setContentDescription("titleContainer");
            }
        }
    }

    private final void values() {
        wXQ wxqKWHzl = KWHzl();
        if (wxqKWHzl != null) {
            wxqKWHzl.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.idv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C24429idf.AEQbTJ(this.OLrzqt, view);
                }
            });
            wxqKWHzl.EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.idh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C24429idf.copydefault(this.KWHzl, view);
                }
            });
            wxqKWHzl.EZpvd().setContentDescription("web3_dex_swap_provider_route_back_button");
        }
        AhwBna().OLrzqt().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.idi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24429idf.AEQbTJ(this.KWHzl, (java.util.List) obj);
            }
        }));
        AhwBna().AEQbTJ().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.idj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24429idf.OLrzqt(this.EZpvd, (java.lang.Integer) obj);
            }
        }));
    }

    public static final void AEQbTJ(C24429idf c24429idf, android.view.View view) {
        Function0<Unit> function0 = c24429idf.djBIcL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void copydefault(C24429idf c24429idf, android.view.View view) {
        Function0<Unit> function0 = c24429idf.DbNXlk;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final Unit AEQbTJ(C24429idf c24429idf, java.util.List list) {
        c24429idf.AkhnZx();
        c24429idf.DbNXlk().AhwBna(list);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c24429idf, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C24429idf c24429idf, java.lang.Integer num) {
        RecyclerView recyclerView;
        hBB hbb = c24429idf.gEmmrt;
        if (hbb != null && (recyclerView = hbb.copydefault) != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            android.content.Context context = recyclerView.getContext();
            layoutParams2.height = C57676yms.EZpvd(context != null ? context.getApplicationContext() : null, java.lang.Float.parseFloat(C23313hvq.mulCheckS$default(74, num, null, null, null, 14, null)));
            recyclerView.setLayoutParams(layoutParams2);
        }
        return Unit.INSTANCE;
    }

    private final void AkhnZx() {
        RecyclerView recyclerView;
        hBB hbb = this.gEmmrt;
        if (hbb == null || (recyclerView = hbb.copydefault) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        DbNXlk().register(DexRouterList.class).copydefault(AYXKKw(), djBIcL()).AEQbTJ(new InterfaceC59531zim() { // from class: o.idu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i, java.lang.Object obj) {
                return C24429idf.KWHzl(i, (DexRouterList) obj);
            }
        });
        DbNXlk().register(DexQuoteBridgeVO.class, gEmmrt());
        recyclerView.setAdapter(DbNXlk());
    }

    public static final int KWHzl(int i, DexRouterList dexRouterList) {
        Intrinsics.checkNotNullParameter(dexRouterList, "");
        return dexRouterList.getType() == 0 ? 0 : 1;
    }

    public final void AEQbTJ(SubRouter subRouter) {
        java.lang.String tokenSymbol;
        java.lang.String tokenSymbol2;
        if (C33129mqd.KWHzl((java.util.Collection) subRouter.getDexQuoteInfoList())) {
            C24441idr.TaskDescription taskDescription = C24441idr.Companion;
            java.lang.String strOLrzqt = OLrzqt();
            java.util.ArrayList<DexQuoteInfo> dexQuoteInfoList = subRouter.getDexQuoteInfoList();
            Intrinsics.copydefault(dexQuoteInfoList);
            DexMultiTokenInfoBean fromToken = subRouter.getFromToken();
            if (fromToken == null || (tokenSymbol = fromToken.getTokenSymbol()) == null) {
                tokenSymbol = "";
            }
            DexMultiTokenInfoBean toToken = subRouter.getToToken();
            java.lang.String str = (toToken == null || (tokenSymbol2 = toToken.getTokenSymbol()) == null) ? "" : tokenSymbol2;
            int iCopydefault = copydefault();
            Function0<Unit> function0 = this.DbNXlk;
            Intrinsics.copydefault(function0);
            Function0<Unit> function02 = this.djBIcL;
            Intrinsics.copydefault(function02);
            C24441idr c24441idrCopydefault = taskDescription.copydefault(strOLrzqt, dexQuoteInfoList, tokenSymbol, str, iCopydefault, function0, function02);
            Function1<? super AbstractC24351icG, Unit> function1 = this.AYXKKw;
            if (function1 != null) {
                function1.invoke(c24441idrCopydefault);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void EZpvd(java.lang.String str) {
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    AhwBna().KWHzl("1");
                    AhwBna().EZpvd(OLrzqt());
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    AhwBna().KWHzl("2");
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    AhwBna().KWHzl("3");
                    break;
                }
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        SubHelper.AEQbTJ(this);
    }
}
