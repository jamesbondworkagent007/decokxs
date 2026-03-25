package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.market_place.presenter.BotLeadUserOrderHistoryPresenter;
import com.okinc.unify_trade.biz.BotLeadUserOrderHistoryModel;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadUserOrderHistoryShowData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC52272wFg;
import o.C48033uCm;
import o.C53698wqR;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vuA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51812vuA extends AbstractC54505xKx<AbstractC48374uPc, BotLeadUserOrderHistoryPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public java.lang.String AhwBna;
    public boolean KWHzl;
    public final C43316rmw copydefault = new C43316rmw();
    public java.lang.String OLrzqt = "";
    public java.lang.String AEQbTJ = "";

    /* JADX INFO: renamed from: o.vuA$TaskDescription */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.ixgjPv;
    }

    public static final /* synthetic */ BotLeadUserOrderHistoryPresenter KWHzl(C51812vuA c51812vuA) {
        return c51812vuA.dxcTrN();
    }

    /* JADX INFO: renamed from: o.vuA$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vuA.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C51812vuA EZpvd(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C51812vuA c51812vuA = new C51812vuA();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("id", str);
            bundle.putBoolean("type", z);
            bundle.putString("path", str2);
            bundle.putString("name", str3);
            c51812vuA.setArguments(bundle);
            return c51812vuA;
        }
    }

    @Override // o.AbstractC54505xKx, o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments == null || (string = arguments.getString("id", "")) == null) {
            string = "";
        }
        this.AhwBna = string;
        android.os.Bundle arguments2 = getArguments();
        this.KWHzl = arguments2 != null ? arguments2.getBoolean("type", false) : false;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("path", "")) == null) {
            string2 = "";
        }
        this.OLrzqt = string2;
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 != null && (string3 = arguments4.getString("name", "")) != null) {
            str = string3;
        }
        this.AEQbTJ = str;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        this.copydefault.register(BotLeadUserOrderHistoryShowData.class, new C51899vvi(new ActionBar()));
        this.copydefault.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vuF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51812vuA.KWHzl(this.AEQbTJ, (EmptyData) obj);
            }
        }));
        RecyclerView recyclerView = gGvvIC().KWHzl;
        recyclerView.setAdapter(this.copydefault);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        gGvvIC().EZpvd.OLrzqt(new InterfaceC57903yrG() { // from class: o.vuD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C51812vuA.AEQbTJ(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        gGvvIC().EZpvd.KWHzl(new InterfaceC57900yrD() { // from class: o.vuE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C51812vuA.copydefault(this.copydefault, interfaceC57934yrl);
            }
        });
        dxcTrN().KWHzl(KWHzl());
    }

    /* JADX INFO: renamed from: o.vuA$ActionBar */
    public static final class ActionBar implements InterfaceC51898vvh {
        public ActionBar() {
        }

        @Override // o.InterfaceC51898vvh
        public void AEQbTJ(BotLeadUserOrderHistoryShowData botLeadUserOrderHistoryShowData) {
            Intrinsics.checkNotNullParameter(botLeadUserOrderHistoryShowData, "");
            C51812vuA.KWHzl(C51812vuA.this).EZpvd(botLeadUserOrderHistoryShowData, C51812vuA.this.OLrzqt, C51812vuA.this.AEQbTJ, C51812vuA.this.KWHzl);
        }

        @Override // o.InterfaceC51898vvh
        public void copydefault(BotLeadUserOrderHistoryShowData botLeadUserOrderHistoryShowData) {
            BotLeadUserOrderHistoryModel originData;
            android.content.Context context;
            Intrinsics.checkNotNullParameter(botLeadUserOrderHistoryShowData, "");
            if (!C51812vuA.this.KWHzl || (originData = botLeadUserOrderHistoryShowData.getOriginData()) == null || (context = C51812vuA.this.getContext()) == null) {
                return;
            }
            ActivityC52272wFg.Application application = ActivityC52272wFg.Companion;
            java.lang.String algoId = originData.getAlgoId();
            java.lang.String str = algoId == null ? "" : algoId;
            java.lang.String algoOrdType = originData.getAlgoOrdType();
            application.KWHzl(context, str, algoOrdType == null ? "" : algoOrdType, (984 & 8) != 0 ? null : null, (984 & 16) != 0 ? "" : null, (984 & 32) != 0 ? null : null, (984 & 64) != 0 ? null : null, (984 & 128) != 0 ? null : null, (984 & 256) != 0 ? false : false, (984 & 512) != 0 ? false : false);
        }
    }

    public static final Unit KWHzl(C51812vuA c51812vuA, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        c51812vuA.dxcTrN().KWHzl(c51812vuA.KWHzl());
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C51812vuA c51812vuA, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c51812vuA.gGvvIC().EZpvd.AhwBna(true);
        c51812vuA.dxcTrN().KWHzl(c51812vuA.KWHzl());
    }

    public static final void copydefault(C51812vuA c51812vuA, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c51812vuA.dxcTrN().KWHzl();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        super.bt_();
        TradeLiveData<java.util.List<BotLeadUserOrderHistoryShowData>> tradeLiveDataAEQbTJ = dxcTrN().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.vuG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51812vuA.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataOLrzqt = dxcTrN().OLrzqt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataOLrzqt.observe(viewLifecycleOwner2, new TaskDescription(new Function1() { // from class: o.vuH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51812vuA.OLrzqt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = dxcTrN().copydefault().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner3, new TaskDescription(new Function1() { // from class: o.vuJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51812vuA.copydefault(this.EZpvd, (java.lang.Exception) obj);
            }
        }));
        C56111xwe<TacticsData> c56111xweEZpvd = dxcTrN().EZpvd();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweEZpvd.observe(viewLifecycleOwner4, new TaskDescription(new Function1() { // from class: o.vuK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51812vuA.EZpvd(this.AEQbTJ, (TacticsData) obj);
            }
        }));
    }

    public static final Unit KWHzl(C51812vuA c51812vuA, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c51812vuA.AEQbTJ();
        if (list.isEmpty()) {
            c51812vuA.copydefault(false);
        } else {
            C33064mpR.OLrzqt(c51812vuA.copydefault, (java.util.List<? extends java.lang.Object>) list);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51812vuA, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51812vuA c51812vuA, boolean z) {
        c51812vuA.gGvvIC().EZpvd.AhwBna(z);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51812vuA c51812vuA, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c51812vuA.AEQbTJ();
        c51812vuA.copydefault(true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51812vuA, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C51812vuA c51812vuA, final TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        final FragmentActivity activity = c51812vuA.getActivity();
        if (activity != null) {
            c51812vuA.dxcTrN().AEQbTJ(tacticsData.getAlgoId(), new Function1() { // from class: o.vuB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51812vuA.KWHzl(this.EZpvd, tacticsData, activity, (java.util.List) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51812vuA c51812vuA, TacticsData tacticsData, FragmentActivity fragmentActivity, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C53698wqR.TaskDescription.share$default(C53698wqR.Companion, tacticsData, fragmentActivity, ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).AEQbTJ(c51812vuA.KWHzl()), list, false, null, 32, null);
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl() {
        java.lang.String str = this.AhwBna;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void AEQbTJ() {
        gGvvIC().EZpvd.AEQbTJ();
        gGvvIC().EZpvd.valueOf();
    }

    public final void copydefault(boolean z) {
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(requireContext(), "");
        if ((!c43453rpa.KWHzl(r1)) || z) {
            C33064mpR.OLrzqt(this.copydefault, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, C33070mpX.AYXKKw(C55688xof.Application.iwGUEr), 60, false, null, null, false, 60, null));
        } else {
            C49952uyJ.updateDataOrEmpty$default(this.copydefault, yDY.AhwBna(), C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistryOwner), 60, null, null, false, 56, null);
        }
    }
}
