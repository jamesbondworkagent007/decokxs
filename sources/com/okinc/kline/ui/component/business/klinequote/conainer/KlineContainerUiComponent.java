package com.okinc.kline.ui.component.business.klinequote.conainer;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.compose.material3.TooltipKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent;
import com.okinc.kline.ui.component.business.klinequote.conainer.KlineContainerUiComponent;
import com.okinc.kline.ui.component.business.klinequote.viemodel.KlineQuoteViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.stateful.StatefulView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.ActivityC38834pgs;
import o.ActivityC38952pjD;
import o.C32869mli;
import o.C33070mpX;
import o.C33546myW;
import o.C35964oKf;
import o.C36246oUr;
import o.C38908piM;
import o.C39043pkp;
import o.C39214poA;
import o.C39781pyn;
import o.C39798pzD;
import o.C39810pzP;
import o.C43251rlk;
import o.C49402unq;
import o.C52761wXj;
import o.C55113xdn;
import o.C55173xeu;
import o.C55237xgE;
import o.C55254xgV;
import o.C55328xhq;
import o.C55372xih;
import o.C55608xnE;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56423yEv;
import o.C57676yms;
import o.C58156yvv;
import o.InterfaceC39046pks;
import o.InterfaceC39502ptZ;
import o.InterfaceC43033rhe;
import o.InterfaceC43034rhf;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC57903yrG;
import o.InterfaceC57934yrl;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.oML;
import o.oWN;
import o.pCW;
import o.pFP;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineContainerUiComponent implements InterfaceC39046pks {
    public InterfaceC43034rhf AEQbTJ;
    public InterfaceC58217yxC AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final KlineQuoteDataComponent EZpvd;
    public boolean KWHzl;
    public C39781pyn OLrzqt;
    public boolean copydefault;
    public C38908piM gEmmrt;
    public final C39043pkp<oML> valueOf;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
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
        public final /* synthetic */ void onChanged(Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineQuoteDataComponent AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39043pkp<oML> KWHzl() {
        return this.valueOf;
    }

    public KlineContainerUiComponent(@NotNull C39043pkp<oML> c39043pkp, @NotNull KlineQuoteDataComponent klineQuoteDataComponent) {
        Intrinsics.checkNotNullParameter(c39043pkp, "");
        Intrinsics.checkNotNullParameter(klineQuoteDataComponent, "");
        this.valueOf = c39043pkp;
        this.EZpvd = klineQuoteDataComponent;
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.pnO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KlineContainerUiComponent.copydefault();
            }
        });
    }

    private final ValueAnimator AYXKKw() {
        return (ValueAnimator) this.AhwBna.getValue();
    }

    public static final ValueAnimator copydefault() {
        return ValueAnimator.ofFloat(0.1f, 1.0f);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        this.EZpvd.values().AxsJAY().observe(lifecycleOwner, new Application(new Function1() { // from class: o.pnL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KlineContainerUiComponent.AhwBna(this.copydefault, (java.lang.String) obj);
            }
        }));
        this.EZpvd.values().gHZMYf().observe(lifecycleOwner, new Application(new Function1() { // from class: o.pnR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KlineContainerUiComponent.valueOf(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        this.EZpvd.values().AubY().observe(lifecycleOwner, new Application(new Function1() { // from class: o.pnS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KlineContainerUiComponent.AhwBna(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        this.EZpvd.values().getNewProxyInstance().observe(lifecycleOwner, new Application(new Function1() { // from class: o.pnU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KlineContainerUiComponent.AYXKKw(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        this.EZpvd.values().QfsBiF().observe(lifecycleOwner, new Application(new Function1() { // from class: o.pnV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KlineContainerUiComponent.gEmmrt(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        EZpvd();
    }

    public static final Unit AhwBna(KlineContainerUiComponent klineContainerUiComponent, String str) {
        LinearLayout linearLayout;
        if (Intrinsics.EZpvd((Object) "notNet", (Object) str)) {
            oML oml = (oML) klineContainerUiComponent.valueOf.KWHzl();
            if (oml != null && (linearLayout = oml.values) != null) {
                linearLayout.setVisibility(0);
            }
            klineContainerUiComponent.gEmmrt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(KlineContainerUiComponent klineContainerUiComponent, Boolean bool) {
        pUU.KWHzl("KlinePageInit", "show3dLoadingLiveData: " + bool);
        if (bool.booleanValue()) {
            klineContainerUiComponent.isConnected();
        } else {
            klineContainerUiComponent.gEmmrt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(KlineContainerUiComponent klineContainerUiComponent, Boolean bool) {
        FragmentActivity activity;
        Window window;
        C39798pzD c39798pzD;
        oML oml = (oML) klineContainerUiComponent.valueOf.KWHzl();
        if (oml != null && (c39798pzD = oml.AuCTelauCTel) != null) {
            c39798pzD.KWHzl(klineContainerUiComponent.KWHzl);
        }
        if (SPUtils.getBoolean("key_screen_on", false) && (activity = klineContainerUiComponent.EZpvd.OLrzqt().getActivity()) != null && (window = activity.getWindow()) != null) {
            window.addFlags(128);
        }
        klineContainerUiComponent.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(KlineContainerUiComponent klineContainerUiComponent, Boolean bool) {
        FragmentActivity activity;
        Window window;
        if (SPUtils.getBoolean("key_screen_on", false) && (activity = klineContainerUiComponent.EZpvd.OLrzqt().getActivity()) != null && (window = activity.getWindow()) != null) {
            window.clearFlags(128);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(KlineContainerUiComponent klineContainerUiComponent, Boolean bool) {
        klineContainerUiComponent.djBIcL();
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        C55173xeu c55173xeu;
        C33546myW c33546myW;
        InterfaceC39502ptZ interfaceC39502ptZCopydefault;
        InterfaceC39502ptZ interfaceC39502ptZCopydefault2;
        C39810pzP c39810pzP;
        C55372xih c55372xihOLrzqt;
        FragmentActivity activity = this.EZpvd.OLrzqt().getActivity();
        if (activity != null) {
            InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
            InterfaceC43034rhf interfaceC43034rhfCopydefault = interfaceC43033rhe != null ? interfaceC43033rhe.copydefault(activity) : null;
            this.AEQbTJ = interfaceC43034rhfCopydefault;
            if (interfaceC43034rhfCopydefault instanceof View) {
                C39781pyn c39781pyn = new C39781pyn(activity);
                this.OLrzqt = c39781pyn;
                c39781pyn.setMaxLine(2);
                InterfaceC43034rhf interfaceC43034rhf = this.AEQbTJ;
                if (interfaceC43034rhf != null) {
                    interfaceC43034rhf.OLrzqt(c39781pyn, new ViewGroup.LayoutParams(-1, -2));
                }
                oML oml = (oML) this.valueOf.KWHzl();
                if (oml != null && (c39810pzP = oml.hDKMBd) != null && (c55372xihOLrzqt = c39810pzP.OLrzqt()) != null) {
                    Object obj = this.AEQbTJ;
                    Intrinsics.copydefault(obj, "");
                    c55372xihOLrzqt.addView((View) obj, new ViewGroup.LayoutParams(-1, -2));
                }
            }
        }
        oWN.KWHzl(C57676yms.AEQbTJ(this.EZpvd.OLrzqt().getContext()));
        this.EZpvd.values().dxcTrN();
        if (!Intrinsics.EZpvd((Object) "kline_follow_app", (Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (Intrinsics.EZpvd((Object) "kline_dark", (Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
                if (this.EZpvd.copydefault() != null && (interfaceC39502ptZCopydefault2 = this.EZpvd.copydefault()) != null) {
                    interfaceC39502ptZCopydefault2.AkhnZx(true);
                }
            } else if (this.EZpvd.copydefault() != null && (interfaceC39502ptZCopydefault = this.EZpvd.copydefault()) != null) {
                interfaceC39502ptZCopydefault.AkhnZx(false);
            }
        }
        oML oml2 = (oML) this.valueOf.KWHzl();
        if (oml2 != null && (c33546myW = oml2.DTwDnp) != null) {
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.pnZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    KlineContainerUiComponent.EZpvd(this.copydefault, interfaceC57934yrl);
                }
            });
        }
        djBIcL();
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("up_down_time_changed");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this.EZpvd.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.pnW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return KlineContainerUiComponent.copydefault(this.copydefault, (java.lang.String) obj2);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pnK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                KlineContainerUiComponent.copydefault(function1, obj2);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("kline_full_screen");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ2, this.EZpvd.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.pnJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return KlineContainerUiComponent.AYXKKw(this.copydefault, (java.lang.String) obj2);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pnH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                KlineContainerUiComponent.KWHzl(function12, obj2);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ3 = RxBus.AEQbTJ("hide_drawing_line");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ3, "");
        AbstractC58185ywX abstractC58185ywXEZpvd3 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ3, this.EZpvd.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.pnI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return KlineContainerUiComponent.AEQbTJ((java.lang.String) obj2);
            }
        };
        abstractC58185ywXEZpvd3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pnP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                KlineContainerUiComponent.valueOf(function13, obj2);
            }
        });
        oML oml3 = (oML) this.valueOf.KWHzl();
        if (oml3 != null && (c55173xeu = oml3.gHZMYf) != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.pnQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    KlineContainerUiComponent.EZpvd(this.KWHzl, view);
                }
            });
        }
        if (!this.EZpvd.QVAiDq()) {
            KlineQuoteDataComponent klineQuoteDataComponent = this.EZpvd;
            klineQuoteDataComponent.AEQbTJ(klineQuoteDataComponent.ejfBZ().AkhnZx());
            this.EZpvd.AYXKKw(new ArrayList());
            KlineQuoteViewModel klineQuoteViewModelValues = this.EZpvd.values();
            ValueAnimator valueAnimatorAYXKKw = AYXKKw();
            Intrinsics.checkNotNullExpressionValue(valueAnimatorAYXKKw, "");
            klineQuoteViewModelValues.copydefault(valueAnimatorAYXKKw);
        }
        this.EZpvd.values().values().observe(this.EZpvd.OLrzqt(), new Application(new Function1() { // from class: o.pnN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return KlineContainerUiComponent.AEQbTJ(this.KWHzl, (kotlin.Pair) obj2);
            }
        }));
        this.EZpvd.ejfBZ().isConnected().observe(this.EZpvd.OLrzqt().getViewLifecycleOwner(), new Application(new Function1() { // from class: o.pnM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return KlineContainerUiComponent.djBIcL(this.OLrzqt, (java.lang.Boolean) obj2);
            }
        }));
    }

    public static final void EZpvd(KlineContainerUiComponent klineContainerUiComponent, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        if (klineContainerUiComponent.EZpvd.hDKMBd() != null) {
            if (Intrinsics.EZpvd((Object) klineContainerUiComponent.EZpvd.AuCTel(), (Object) "OPTION")) {
                if (!Intrinsics.EZpvd((Object) klineContainerUiComponent.EZpvd.ejfBZ().gEmmrt(), (Object) "TYPE_MARK_PRICE_KLINE")) {
                    klineContainerUiComponent.EZpvd.values().getNewProxyInstance().setValue(Boolean.TRUE);
                }
            } else if (!Intrinsics.EZpvd((Object) klineContainerUiComponent.EZpvd.ejfBZ().gEmmrt(), (Object) "TYPE_KLINE") || C36246oUr.copydefault().zLjUOn().isFastKLineMode()) {
                klineContainerUiComponent.EZpvd.values().getNewProxyInstance().setValue(Boolean.TRUE);
            }
            Iterator<T> it = klineContainerUiComponent.EZpvd.OLrzqt().KWHzl().OLrzqt().iterator();
            while (it.hasNext()) {
                ((InterfaceC39046pks) it.next()).onResume(klineContainerUiComponent.EZpvd.OLrzqt());
            }
            KlineQuoteDataComponent klineQuoteDataComponent = klineContainerUiComponent.EZpvd;
            klineQuoteDataComponent.onResume(klineQuoteDataComponent.OLrzqt());
            interfaceC57934yrl.AEQbTJ();
        }
    }

    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(KlineContainerUiComponent klineContainerUiComponent, String str) {
        C36246oUr.copydefault().zLjUOn().setUtc8(pFP.OLrzqt.AEQbTJ());
        klineContainerUiComponent.EZpvd.values().gkJEwt();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(KlineContainerUiComponent klineContainerUiComponent, String str) {
        C39798pzD c39798pzD;
        oML oml = (oML) klineContainerUiComponent.valueOf.KWHzl();
        if (oml != null && (c39798pzD = oml.AuCTelauCTel) != null) {
            c39798pzD.setVisibility(8);
        }
        klineContainerUiComponent.EZpvd.dNCPSb();
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(String str) {
        C55328xhq.show$default(C55328xhq.OLrzqt, Integer.valueOf(C35964oKf.Fragment.RSmiaq), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(KlineContainerUiComponent klineContainerUiComponent, View view) {
        C33546myW c33546myW;
        LinearLayout linearLayout;
        if (klineContainerUiComponent.EZpvd.hDKMBd() != null) {
            oML oml = (oML) klineContainerUiComponent.valueOf.KWHzl();
            if (oml != null && (linearLayout = oml.values) != null) {
                linearLayout.setVisibility(8);
            }
            FragmentActivity activity = klineContainerUiComponent.EZpvd.OLrzqt().getActivity();
            if (activity != null) {
                if (activity instanceof ActivityC38834pgs) {
                    ((ActivityC38834pgs) activity).fetchVPNInfo();
                } else if (activity instanceof ActivityC38952pjD) {
                    ((ActivityC38952pjD) activity).valueOf();
                }
            }
            klineContainerUiComponent.djBIcL();
            KlineQuoteDataComponent klineQuoteDataComponent = klineContainerUiComponent.EZpvd;
            klineQuoteDataComponent.onResume(klineQuoteDataComponent.OLrzqt());
            oML oml2 = (oML) klineContainerUiComponent.valueOf.KWHzl();
            if (oml2 != null && (c33546myW = oml2.DTwDnp) != null) {
                c33546myW.AEQbTJ();
            }
            InterfaceC39502ptZ interfaceC39502ptZCopydefault = klineContainerUiComponent.EZpvd.copydefault();
            if (interfaceC39502ptZCopydefault != null) {
                interfaceC39502ptZCopydefault.QSLkRj();
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.piM.setData$default(o.piM, com.okinc.kline.api.bean.MarketCoinInfo, boolean, boolean, int, java.lang.Object):void */
    public static final Unit AEQbTJ(KlineContainerUiComponent klineContainerUiComponent, Pair pair) {
        if (klineContainerUiComponent.gEmmrt == null || ((Boolean) pair.getSecond()).booleanValue()) {
            klineContainerUiComponent.AhwBna();
            C38908piM c38908piM = klineContainerUiComponent.gEmmrt;
            if (c38908piM != null) {
                MarketCoinInfo marketCoinInfoHDKMBd = klineContainerUiComponent.EZpvd.hDKMBd();
                Intrinsics.copydefault(marketCoinInfoHDKMBd);
                C38908piM.setData$default(c38908piM, marketCoinInfoHDKMBd, false, false, 6, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(final KlineContainerUiComponent klineContainerUiComponent, Boolean bool) {
        C55254xgV c55254xgV;
        oML oml = (oML) klineContainerUiComponent.valueOf.KWHzl();
        if (oml != null && (c55254xgV = oml.zLjUOn) != null) {
            c55254xgV.post(new Runnable() { // from class: o.pnX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    KlineContainerUiComponent.copydefault(this.KWHzl);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(KlineContainerUiComponent klineContainerUiComponent) {
        klineContainerUiComponent.valueOf();
    }

    public final void valueOf() {
        C55254xgV c55254xgV;
        oML oml = (oML) this.valueOf.KWHzl();
        if (oml == null || (c55254xgV = oml.zLjUOn) == null || !Intrinsics.EZpvd(this.EZpvd.ejfBZ().isConnected().getValue(), Boolean.TRUE) || c55254xgV.copydefault().getTabCount() <= 0) {
            return;
        }
        try {
            Result.Application application = Result.Companion;
            c55254xgV.EZpvd(c55254xgV.copydefault().getTabCount() - 1, true);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    private final void AhwBna() {
        C39798pzD c39798pzD;
        final C55254xgV c55254xgV;
        C55254xgV c55254xgV2;
        C39798pzD c39798pzD2;
        C39798pzD c39798pzD3;
        C55254xgV c55254xgV3;
        C39798pzD c39798pzD4;
        C55254xgV c55254xgV4;
        TabLayout tabLayoutCopydefault;
        if (this.EZpvd.hDKMBd() == null) {
            return;
        }
        oML oml = (oML) this.valueOf.KWHzl();
        if (oml != null && (c55254xgV4 = oml.zLjUOn) != null && (tabLayoutCopydefault = c55254xgV4.copydefault()) != null) {
            tabLayoutCopydefault.removeAllTabs();
        }
        oML oml2 = (oML) this.valueOf.KWHzl();
        if (oml2 != null && (c39798pzD4 = oml2.AuCTelauCTel) != null) {
            c39798pzD4.removeAllViews();
        }
        if (this.EZpvd.hDKMBd() != null) {
            this.gEmmrt = null;
            List<Fragment> fragments = this.EZpvd.OLrzqt().getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "");
            Iterator<T> it = fragments.iterator();
            while (it.hasNext()) {
                this.EZpvd.OLrzqt().getChildFragmentManager().beginTransaction().remove((Fragment) it.next()).commitNowAllowingStateLoss();
            }
            FragmentManager childFragmentManager = this.EZpvd.OLrzqt().getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            this.gEmmrt = new C38908piM(childFragmentManager);
            oML oml3 = (oML) this.valueOf.KWHzl();
            if (oml3 != null && (c55254xgV3 = oml3.zLjUOn) != null) {
                oML oml4 = (oML) this.valueOf.KWHzl();
                c55254xgV3.setupWithViewPager(oml4 != null ? oml4.AuCTelauCTel : null);
            }
            oML oml5 = (oML) this.valueOf.KWHzl();
            if (oml5 != null && (c39798pzD3 = oml5.AuCTelauCTel) != null) {
                c39798pzD3.setAdapter(this.gEmmrt);
            }
            oML oml6 = (oML) this.valueOf.KWHzl();
            if (oml6 != null && (c39798pzD2 = oml6.AuCTelauCTel) != null) {
                C38908piM c38908piM = this.gEmmrt;
                Integer numValueOf = c38908piM != null ? Integer.valueOf(c38908piM.getCount()) : null;
                Intrinsics.copydefault(numValueOf);
                c39798pzD2.setOffscreenPageLimit(numValueOf.intValue());
            }
        }
        oML oml7 = (oML) this.valueOf.KWHzl();
        if (oml7 != null && (c55254xgV2 = oml7.zLjUOn) != null) {
            c55254xgV2.AEQbTJ(new ActionBar());
        }
        oML oml8 = (oML) this.valueOf.KWHzl();
        if (oml8 != null && (c55254xgV = oml8.zLjUOn) != null) {
            C39214poA.KWHzl(c55254xgV.copydefault(), TooltipKt.TooltipDuration, new Function0() { // from class: o.pnT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return KlineContainerUiComponent.copydefault(c55254xgV, this);
                }
            });
        }
        oML oml9 = (oML) this.valueOf.KWHzl();
        if (oml9 == null || (c39798pzD = oml9.AuCTelauCTel) == null) {
            return;
        }
        c39798pzD.addOnPageChangeListener(new TaskDescription());
    }

    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            C55254xgV c55254xgV;
            C39798pzD c39798pzD;
            String strValueOf = String.valueOf(tab != null ? tab.getText() : null);
            KlineContainerUiComponent klineContainerUiComponent = KlineContainerUiComponent.this;
            klineContainerUiComponent.KWHzl = Intrinsics.EZpvd((Object) strValueOf, (Object) klineContainerUiComponent.AEQbTJ().OLrzqt().getResources().getString(C35964oKf.Fragment.AxsJAYaxsJAY));
            if (Intrinsics.EZpvd((Object) strValueOf, (Object) C33070mpX.AYXKKw(C35964oKf.Fragment.hpmliR))) {
                SPUtils.put("market_event_red_dot_key", Boolean.FALSE);
            }
            oML oml = (oML) KlineContainerUiComponent.this.KWHzl().KWHzl();
            if (oml != null && (c39798pzD = oml.AuCTelauCTel) != null) {
                c39798pzD.KWHzl(KlineContainerUiComponent.this.KWHzl);
            }
            C49402unq.clickTrack$default("KLine_Chart_Order_Book_Click", C56423yEv.EZpvd(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, strValueOf)), null, 4, null);
            if (tab != null) {
                int position = tab.getPosition();
                KlineContainerUiComponent klineContainerUiComponent2 = KlineContainerUiComponent.this;
                oML oml2 = (oML) klineContainerUiComponent2.KWHzl().KWHzl();
                if (oml2 != null && (c55254xgV = oml2.zLjUOn) != null) {
                    c55254xgV.EZpvd(position, false);
                }
                if (position != 0) {
                    klineContainerUiComponent2.AEQbTJ().ejfBZ().isConnected().setValue(Boolean.FALSE);
                }
            }
        }
    }

    public static final Unit copydefault(C55254xgV c55254xgV, KlineContainerUiComponent klineContainerUiComponent) {
        String strAEQbTJ;
        C38908piM c38908piM = klineContainerUiComponent.gEmmrt;
        if (c38908piM != null && c55254xgV.copydefault().getTabCount() == c38908piM.getCount()) {
            int tabCount = c55254xgV.copydefault().getTabCount();
            for (int i = 0; i < tabCount; i++) {
                TabLayout.Tab tabAt = c55254xgV.copydefault().getTabAt(i);
                C38908piM c38908piM2 = klineContainerUiComponent.gEmmrt;
                if (c38908piM2 != null && (strAEQbTJ = c38908piM2.AEQbTJ(i)) != null && tabAt != null) {
                    tabAt.setContentDescription(strAEQbTJ);
                }
                if (!C55608xnE.OLrzqt() && i == c55254xgV.copydefault().getTabCount() - 1 && tabAt != null) {
                    klineContainerUiComponent.valueOf();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public TaskDescription() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPageSelected(int i) {
            boolean z;
            C39798pzD c39798pzD;
            KlineContainerUiComponent klineContainerUiComponent = KlineContainerUiComponent.this;
            MarketCoinInfo marketCoinInfoHDKMBd = klineContainerUiComponent.AEQbTJ().hDKMBd();
            if (Intrinsics.EZpvd((Object) "SPOT", (Object) (marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentType() : null))) {
                z = i == 1;
            } else {
                MarketCoinInfo marketCoinInfoHDKMBd2 = KlineContainerUiComponent.this.AEQbTJ().hDKMBd();
                if (!Intrinsics.EZpvd((Object) "MARGIN", (Object) (marketCoinInfoHDKMBd2 != null ? marketCoinInfoHDKMBd2.getInstrumentType() : null))) {
                    MarketCoinInfo marketCoinInfoHDKMBd3 = KlineContainerUiComponent.this.AEQbTJ().hDKMBd();
                    if (!Intrinsics.EZpvd((Object) "FUTURES", (Object) (marketCoinInfoHDKMBd3 != null ? marketCoinInfoHDKMBd3.getInstrumentType() : null))) {
                        MarketCoinInfo marketCoinInfoHDKMBd4 = KlineContainerUiComponent.this.AEQbTJ().hDKMBd();
                        if (Intrinsics.EZpvd((Object) "SWAP", (Object) (marketCoinInfoHDKMBd4 != null ? marketCoinInfoHDKMBd4.getInstrumentType() : null))) {
                        }
                    }
                }
            }
            klineContainerUiComponent.KWHzl = z;
            oML oml = (oML) KlineContainerUiComponent.this.KWHzl().KWHzl();
            if (oml != null && (c39798pzD = oml.AuCTelauCTel) != null) {
                c39798pzD.KWHzl(KlineContainerUiComponent.this.KWHzl);
            }
            if (i == 0) {
                KlineContainerUiComponent.this.KWHzl(OtcExtraKeys.ORDER);
            } else if (i == 1) {
                MarketCoinInfo marketCoinInfoHDKMBd5 = KlineContainerUiComponent.this.AEQbTJ().hDKMBd();
                if (Intrinsics.EZpvd((Object) "OPTION", (Object) (marketCoinInfoHDKMBd5 != null ? marketCoinInfoHDKMBd5.getInstrumentType() : null))) {
                    KlineContainerUiComponent.this.KWHzl(ExtJson.BRC20TYPE_TRADE);
                } else {
                    KlineContainerUiComponent.this.KWHzl("depth");
                }
            } else if (i == 2) {
                MarketCoinInfo marketCoinInfoHDKMBd6 = KlineContainerUiComponent.this.AEQbTJ().hDKMBd();
                if (Intrinsics.EZpvd((Object) "OPTION", (Object) (marketCoinInfoHDKMBd6 != null ? marketCoinInfoHDKMBd6.getInstrumentType() : null))) {
                    KlineContainerUiComponent.this.KWHzl("info");
                } else {
                    KlineContainerUiComponent.this.KWHzl(ExtJson.BRC20TYPE_TRADE);
                }
            } else if (i == 3) {
                KlineContainerUiComponent.this.KWHzl("info");
            }
            pCW pcwAkhnZx = KlineContainerUiComponent.this.AEQbTJ().AkhnZx();
            pcwAkhnZx.KWHzl(pcwAkhnZx.copydefault(Integer.valueOf(i)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(final String str) {
        C32869mli.onNewOKexEventWithParams$default("app_tab_enter", null, new Function1() { // from class: o.pnG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KlineContainerUiComponent.OLrzqt(str, this, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(String str, KlineContainerUiComponent klineContainerUiComponent, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_id", "page_k", false);
        eventParamsList.put("sub_tab", str, false);
        String strFIwbmz = klineContainerUiComponent.EZpvd.fIwbmz();
        if (strFIwbmz != null) {
            eventParamsList.put("coin_name", strFIwbmz, false);
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        C39810pzP c39810pzP;
        C55372xih c55372xihOLrzqt;
        if (this.EZpvd.OLrzqt().isAdded()) {
            oML oml = (oML) this.valueOf.KWHzl();
            if (oml != null && (c39810pzP = oml.hDKMBd) != null && (c55372xihOLrzqt = c39810pzP.OLrzqt()) != null) {
                c55372xihOLrzqt.setVisibility(0);
            }
            this.EZpvd.copydefault(this.AEQbTJ);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onDestroy(lifecycleOwner);
        InterfaceC43034rhf interfaceC43034rhf = this.AEQbTJ;
        if (interfaceC43034rhf != null) {
            interfaceC43034rhf.copydefault();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AYXKKw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        ValueAnimator valueAnimatorAYXKKw = AYXKKw();
        if (valueAnimatorAYXKKw != null) {
            valueAnimatorAYXKKw.cancel();
        }
    }

    private final void isConnected() {
        C55237xgE c55237xgE;
        C55237xgE c55237xgE2;
        C55113xdn c55113xdn;
        C55237xgE c55237xgE3;
        oML oml = (oML) this.valueOf.KWHzl();
        View viewAEQbTJ = (oml == null || (c55237xgE3 = oml.QKVWgx) == null) ? null : c55237xgE3.AEQbTJ(StatefulView.Status.Loading);
        if (viewAEQbTJ != null && (c55113xdn = (C55113xdn) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.zblBkD)) != null) {
            c55113xdn.playAnimation();
        }
        oML oml2 = (oML) this.valueOf.KWHzl();
        if (oml2 != null && (c55237xgE2 = oml2.QKVWgx) != null) {
            c55237xgE2.setLoadingDelayedTime(0L);
        }
        oML oml3 = (oML) this.valueOf.KWHzl();
        if (oml3 == null || (c55237xgE = oml3.QKVWgx) == null) {
            return;
        }
        c55237xgE.setStatus(StatefulView.Status.Loading);
    }

    private final void gEmmrt() {
        pUU.KWHzl("KlinePageInit", "dismiss3DLoading now!");
        FragmentActivity activity = this.EZpvd.OLrzqt().getActivity();
        if (activity != null) {
            if (activity instanceof ActivityC38834pgs) {
                ((ActivityC38834pgs) activity).OLrzqt();
            } else if (activity instanceof ActivityC38952pjD) {
                ((ActivityC38952pjD) activity).KWHzl();
            }
        }
        this.copydefault = true;
    }
}
