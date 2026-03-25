package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.TokenBusinessData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34877nkj extends AbstractC32996moC {
    public boolean AEQbTJ;
    public C54822xWp AYXKKw;
    public boolean OLrzqt;
    public C42663raf copydefault;
    public final InterfaceC56387yDm valueOf;
    public MarketCoinInfo KWHzl = new MarketCoinInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
    public boolean EZpvd = true;

    /* JADX INFO: renamed from: o.nkj$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.QOLQEE;
    }

    public C34877nkj() {
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54472xJr.class), new Function0<ViewModelStore>() { // from class: com.okinc.find_ui.bigdataui.KLineBigDataFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.find_ui.bigdataui.KLineBigDataFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.find_ui.bigdataui.KLineBigDataFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final C54472xJr KWHzl() {
        return (C54472xJr) this.valueOf.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46688tbr.registerTradeFragmentTrack$default(C46688tbr.KWHzl, this, "KLineBigDataFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C42663raf c42663rafOLrzqt = C42663raf.OLrzqt(view);
        Intrinsics.copydefault(c42663rafOLrzqt);
        this.copydefault = c42663rafOLrzqt;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelProvider.Factory defaultViewModelProviderFactory = requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            C54822xWp c54822xWp = (C54822xWp) new ViewModelProvider(activity, defaultViewModelProviderFactory).get(C54822xWp.class);
            if (c54822xWp != null) {
                this.AYXKKw = c54822xWp;
                c54822xWp.KWHzl().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.nko
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C34877nkj.OLrzqt(this.EZpvd, (MarketCoinInfo) obj);
                    }
                }));
                KWHzl().ejfBZ().observe(this, new ActionBar(new Function1() { // from class: o.nkr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C34877nkj.KWHzl(this.EZpvd, (java.util.ArrayList) obj);
                    }
                }));
                return;
            }
        }
        pUU.copydefault("KlineFragment", "Activity is null, cannot init sharedViewModel");
    }

    public static final Unit OLrzqt(C34877nkj c34877nkj, MarketCoinInfo marketCoinInfo) {
        if (!Intrinsics.EZpvd((java.lang.Object) c34877nkj.KWHzl.getInstrumentId(), (java.lang.Object) marketCoinInfo.getInstrumentId()) || !Intrinsics.EZpvd((java.lang.Object) c34877nkj.KWHzl.getInstrumentType(), (java.lang.Object) marketCoinInfo.getInstrumentType())) {
            c34877nkj.EZpvd = true;
            c34877nkj.KWHzl.setInstrumentId(marketCoinInfo.getInstrumentId());
            c34877nkj.KWHzl.setInstrumentType(marketCoinInfo.getInstrumentType());
            if (c34877nkj.OLrzqt) {
                if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "MARGIN")) {
                    c34877nkj.EZpvd();
                } else if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "FUTURES")) {
                    c34877nkj.OLrzqt(marketCoinInfo.getInstrumentType());
                }
                c34877nkj.OLrzqt = false;
            }
            C43296rmc.KWHzl(c34877nkj.getTAG(), "sharedViewModel: 币对信息：" + marketCoinInfo.getInstrumentId());
        } else {
            c34877nkj.EZpvd = false;
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C34877nkj c34877nkj, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (c34877nkj.EZpvd) {
            C42663raf c42663raf = c34877nkj.copydefault;
            if (c42663raf == null) {
                Intrinsics.gEmmrt("");
                c42663raf = null;
            }
            c42663raf.valueOf.smoothScrollTo(0, 0);
            if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
                c34877nkj.AEQbTJ = false;
                java.util.Iterator it = arrayList.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "");
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "");
                    TokenBusinessData tokenBusinessData = (TokenBusinessData) next;
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) tokenBusinessData.getInstType()) && Intrinsics.EZpvd((java.lang.Object) tokenBusinessData.getInstType(), (java.lang.Object) oLT.isConnected()) && tokenBusinessData.getAvailable()) {
                        c34877nkj.AEQbTJ = true;
                    }
                }
            }
            c34877nkj.OLrzqt = true;
            if (Intrinsics.EZpvd((java.lang.Object) c34877nkj.KWHzl.getInstrumentType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) c34877nkj.KWHzl.getInstrumentType(), (java.lang.Object) "MARGIN")) {
                c34877nkj.EZpvd();
            } else if (Intrinsics.EZpvd((java.lang.Object) c34877nkj.KWHzl.getInstrumentType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) c34877nkj.KWHzl.getInstrumentType(), (java.lang.Object) "FUTURES")) {
                c34877nkj.OLrzqt(c34877nkj.KWHzl.getInstrumentType());
            }
            C43296rmc.KWHzl(c34877nkj.getTAG(), "mTokenBusinessViewModel: 业务线数据：isSurpotMargin = " + c34877nkj.AEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C34791njC.class);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ, childFragmentManager, qZH.StateListAnimator.DcMfJK, null, null, null, 28, null);
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ2 = C56524yIo.AEQbTJ(C34811njW.class);
        androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
        C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ2, childFragmentManager2, qZH.StateListAnimator.RkASWs, null, null, null, 28, null);
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ3 = C56524yIo.AEQbTJ(C34879nkl.class);
        androidx.fragment.app.FragmentManager childFragmentManager3 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
        C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ3, childFragmentManager3, qZH.StateListAnimator.RTWSvT, null, null, null, 28, null);
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ4 = C56524yIo.AEQbTJ(C34800njL.class);
        androidx.fragment.app.FragmentManager childFragmentManager4 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "");
        C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ4, childFragmentManager4, qZH.StateListAnimator.DQzvGNdrmXxudrmXxu, null, null, null, 28, null);
        C42663raf c42663raf = null;
        if (this.AEQbTJ) {
            C42663raf c42663raf2 = this.copydefault;
            if (c42663raf2 == null) {
                Intrinsics.gEmmrt("");
                c42663raf2 = null;
            }
            c42663raf2.copydefault.setVisibility(0);
            C42663raf c42663raf3 = this.copydefault;
            if (c42663raf3 == null) {
                Intrinsics.gEmmrt("");
                c42663raf3 = null;
            }
            c42663raf3.KWHzl.setVisibility(0);
        } else {
            C42663raf c42663raf4 = this.copydefault;
            if (c42663raf4 == null) {
                Intrinsics.gEmmrt("");
                c42663raf4 = null;
            }
            c42663raf4.copydefault.setVisibility(8);
            C42663raf c42663raf5 = this.copydefault;
            if (c42663raf5 == null) {
                Intrinsics.gEmmrt("");
                c42663raf5 = null;
            }
            c42663raf5.KWHzl.setVisibility(8);
        }
        C42663raf c42663raf6 = this.copydefault;
        if (c42663raf6 == null) {
            Intrinsics.gEmmrt("");
            c42663raf6 = null;
        }
        c42663raf6.AhwBna.setVisibility(0);
        C42663raf c42663raf7 = this.copydefault;
        if (c42663raf7 == null) {
            Intrinsics.gEmmrt("");
            c42663raf7 = null;
        }
        c42663raf7.OLrzqt.setVisibility(8);
        C42663raf c42663raf8 = this.copydefault;
        if (c42663raf8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c42663raf = c42663raf8;
        }
        c42663raf.AEQbTJ.setVisibility(8);
    }

    public final void OLrzqt(java.lang.String str) {
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C34881nkn.class);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ, childFragmentManager, qZH.StateListAnimator.DcMfJK, null, null, null, 28, null);
        C42663raf c42663raf = null;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP")) {
            C42663raf c42663raf2 = this.copydefault;
            if (c42663raf2 == null) {
                Intrinsics.gEmmrt("");
                c42663raf2 = null;
            }
            c42663raf2.AhwBna.setVisibility(0);
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ2 = C56524yIo.AEQbTJ(C34868nka.class);
            androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ2, childFragmentManager2, qZH.StateListAnimator.RkASWs, null, null, null, 28, null);
        } else {
            C42663raf c42663raf3 = this.copydefault;
            if (c42663raf3 == null) {
                Intrinsics.gEmmrt("");
                c42663raf3 = null;
            }
            c42663raf3.AhwBna.setVisibility(8);
        }
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ3 = C56524yIo.AEQbTJ(C34873nkf.class);
        androidx.fragment.app.FragmentManager childFragmentManager3 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
        C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ3, childFragmentManager3, qZH.StateListAnimator.RTWSvT, null, null, null, 28, null);
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ4 = C56524yIo.AEQbTJ(C34806njR.class);
        androidx.fragment.app.FragmentManager childFragmentManager4 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "");
        C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ4, childFragmentManager4, qZH.StateListAnimator.RIuxYh, null, null, null, 28, null);
        C42663raf c42663raf4 = this.copydefault;
        if (c42663raf4 == null) {
            Intrinsics.gEmmrt("");
            c42663raf4 = null;
        }
        c42663raf4.copydefault.setVisibility(0);
        C42663raf c42663raf5 = this.copydefault;
        if (c42663raf5 == null) {
            Intrinsics.gEmmrt("");
            c42663raf5 = null;
        }
        c42663raf5.KWHzl.setVisibility(8);
        C42663raf c42663raf6 = this.copydefault;
        if (c42663raf6 == null) {
            Intrinsics.gEmmrt("");
            c42663raf6 = null;
        }
        c42663raf6.OLrzqt.setVisibility(0);
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ5 = C56524yIo.AEQbTJ(C34814njZ.class);
        androidx.fragment.app.FragmentManager childFragmentManager5 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager5, "");
        C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ5, childFragmentManager5, qZH.StateListAnimator.RSDDiY, null, null, null, 28, null);
        C42663raf c42663raf7 = this.copydefault;
        if (c42663raf7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c42663raf = c42663raf7;
        }
        c42663raf.AEQbTJ.setVisibility(0);
    }
}
