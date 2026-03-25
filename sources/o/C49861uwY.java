package o;

import androidx.databinding.ObservableField;
import com.google.android.material.tabs.TabLayout;
import com.okinc.biz.TradeType;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uwY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49861uwY extends C55249xgQ {
    public TabLayout.Tab AEQbTJ;
    public TabLayout.Tab AhwBna;
    public java.lang.Boolean OLrzqt;
    public final java.lang.String copydefault;
    public java.lang.String valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public static final ObservableField<TradeType> EZpvd = new ObservableField<>();

    /* JADX INFO: renamed from: o.uwY$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.SELL_CLOSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49861uwY(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:33) call: o.uwY.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C49861uwY(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49861uwY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = "unified_" + C49861uwY.class.getSimpleName();
        addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: o.uwY.5
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab == null) {
                    pUU.copydefault(C49861uwY.this.copydefault, "Tab instance is null");
                    return;
                }
                C49861uwY c49861uwY = C49861uwY.this;
                if (tab.isSelected()) {
                    java.lang.Object tag = tab.getTag();
                    StateListAnimator stateListAnimator = tag instanceof StateListAnimator ? (StateListAnimator) tag : null;
                    if (stateListAnimator != null) {
                        java.lang.String unused = c49861uwY.copydefault;
                        Objects.toString(stateListAnimator.AEQbTJ());
                        C49861uwY.Companion.copydefault().set(stateListAnimator.AEQbTJ());
                    }
                }
            }
        });
        initTab$default(this, null, 1, null);
    }

    /* JADX INFO: renamed from: o.uwY$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uwY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ObservableField<TradeType> copydefault() {
            return C49861uwY.EZpvd;
        }
    }

    public static /* synthetic */ void initTab$default(C49861uwY c49861uwY, TradeType tradeType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradeType = null;
        }
        c49861uwY.copydefault(tradeType);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(TradeType tradeType) {
        int i;
        removeAllTabs();
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        java.lang.String strAYXKKw = c56059xvf.AYXKKw();
        this.valueOf = strAYXKKw;
        if (!Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "OPTION")) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt("FUTURES", "SWAP")), this.valueOf) && c56059xvf.values()) {
                EZpvd.set(null);
                i = 8;
            } else {
                TabLayout.Tab tabNewTab = newTab();
                java.lang.String strAYXKKw2 = c56059xvf.AYXKKw();
                if (strAYXKKw2 == null) {
                    strAYXKKw2 = "";
                }
                i = 0;
                StateListAnimator stateListAnimatorCopydefault = copydefault(0, strAYXKKw2);
                if (stateListAnimatorCopydefault != null) {
                    tabNewTab.setTag(stateListAnimatorCopydefault);
                    tabNewTab.setText(stateListAnimatorCopydefault.copydefault());
                }
                KWHzl(tabNewTab.view);
                Unit unit = Unit.INSTANCE;
                this.AEQbTJ = tabNewTab;
                addTab(tabNewTab);
                TabLayout.Tab tabNewTab2 = newTab();
                java.lang.String strAYXKKw3 = c56059xvf.AYXKKw();
                StateListAnimator stateListAnimatorCopydefault2 = copydefault(1, strAYXKKw3 != null ? strAYXKKw3 : "");
                if (stateListAnimatorCopydefault2 != null) {
                    tabNewTab2.setTag(stateListAnimatorCopydefault2);
                    tabNewTab2.setText(stateListAnimatorCopydefault2.copydefault());
                }
                KWHzl(tabNewTab2.view);
                this.AhwBna = tabNewTab2;
                addTab(tabNewTab2);
                addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TaskDescription());
                AEQbTJ(tradeType);
                EZpvd(tradeType);
            }
        }
        setVisibility(i);
    }

    /* JADX INFO: renamed from: o.uwY$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            C49861uwY c49861uwY = C49861uwY.this;
            java.lang.Object tag = tab != null ? tab.getTag() : null;
            StateListAnimator stateListAnimator = tag instanceof StateListAnimator ? (StateListAnimator) tag : null;
            c49861uwY.EZpvd(stateListAnimator != null ? stateListAnimator.AEQbTJ() : null);
        }
    }

    public static /* synthetic */ void refreshTab$default(C49861uwY c49861uwY, TradeType tradeType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradeType = TradeType.BUY_OPEN;
        }
        c49861uwY.OLrzqt(tradeType);
    }

    public final void OLrzqt(TradeType tradeType) {
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        if (Intrinsics.EZpvd((java.lang.Object) c56059xvf.AYXKKw(), (java.lang.Object) this.valueOf) && Intrinsics.EZpvd(java.lang.Boolean.valueOf(c56059xvf.values()), this.OLrzqt)) {
            return;
        }
        this.OLrzqt = java.lang.Boolean.valueOf(c56059xvf.values());
        copydefault(tradeType);
    }

    public final void KWHzl(android.view.View view) {
        if (view != null) {
            view.setPaddingRelative(0, 0, 0, 0);
        }
    }

    private final void AEQbTJ(TradeType tradeType) {
        TabLayout.Tab tabAt;
        if (tradeType == null) {
            if (getTabCount() <= 0 || (tabAt = getTabAt(0)) == null) {
                return;
            }
            tabAt.select();
            return;
        }
        int tabCount = getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt2 = getTabAt(i);
            if (tabAt2 != null) {
                java.lang.Object tag = tabAt2.getTag();
                Intrinsics.copydefault(tag, "");
                if (((StateListAnimator) tag).AEQbTJ() == tradeType) {
                    tabAt2.select();
                }
            }
        }
    }

    public final void EZpvd(TradeType tradeType) {
        if (tradeType != null && Activity.copydefault[tradeType.ordinal()] == 1) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            KWHzl(C33512mxp.tradeFallHighlightsFill$default(c33512mxp, context, 0.0f, 2, null));
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            OLrzqt(C33512mxp.tradeFallHighlightsContent$default(c33512mxp, context2, 0.0f, 2, null));
        } else {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            KWHzl(C33512mxp.tradeRiseHighlightsFill$default(c33512mxp2, context3, 0.0f, 2, null));
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            OLrzqt(C33512mxp.tradeRiseHighlightsContent$default(c33512mxp2, context4, 0.0f, 2, null));
        }
        TabLayout.Tab tab = this.AEQbTJ;
        KWHzl(tab != null ? tab.view : null);
        TabLayout.Tab tab2 = this.AhwBna;
        KWHzl(tab2 != null ? tab2.view : null);
    }

    public final void OLrzqt(@androidx.annotation.ColorInt int i) {
        TabLayout.TabView tabView;
        android.widget.TextView textView;
        int tabCount = getTabCount();
        int i2 = 0;
        while (i2 < tabCount) {
            TabLayout.Tab tabAt = getTabAt(i2);
            if (tabAt != null && (tabView = tabAt.view) != null && (textView = (android.widget.TextView) tabView.findViewById(android.R.id.text1)) != null) {
                textView.setTextColor(i2 == getSelectedTabPosition() ? i : C33070mpX.copydefault(C32113mPz.ActionBar.uzCIH));
            }
            i2++;
        }
    }

    /* JADX DEBUG: Possible override for method o.xgQ.copydefault()I */
    public final TradeType copydefault() {
        return EZpvd.get();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StateListAnimator copydefault(int i, java.lang.String str) {
        java.lang.String strAuCTelauCTel;
        xOW newProxyInstance;
        switch (str.hashCode()) {
            case -2027980370:
                if (!str.equals("MARGIN")) {
                    return null;
                }
                if (i != 0) {
                    TradeType tradeType = TradeType.BUY_OPEN;
                    java.lang.String string = getContext().getString(C55688xof.Application.setPipParamsSourceRectHint);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    return new StateListAnimator(this, tradeType, string);
                }
                if (i != 1) {
                    return null;
                }
                TradeType tradeType2 = TradeType.SELL_CLOSE;
                java.lang.String string2 = getContext().getString(C55688xof.Application.addMenuProvider);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                return new StateListAnimator(this, tradeType2, string2);
            case -1956807563:
                str.equals("OPTION");
                return null;
            case 2552066:
                if (!str.equals("SPOT")) {
                    return null;
                }
                if (i != 0) {
                }
                break;
            case 2558355:
                if (!str.equals("SWAP")) {
                    return null;
                }
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                strAuCTelauCTel = (interfaceC54581xNrOLrzqt != null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.AuCTelauCTel();
                if (Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "long_short_mode")) {
                    Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "net_mode");
                    return null;
                }
                if (i == 0) {
                    TradeType tradeType3 = TradeType.BUY_OPEN;
                    java.lang.String string3 = getContext().getString(C55688xof.Application.initViewTreeOwners);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    return new StateListAnimator(this, tradeType3, string3);
                }
                if (i != 1) {
                    return null;
                }
                TradeType tradeType4 = TradeType.SELL_CLOSE;
                java.lang.String string4 = getContext().getString(C55688xof.Application.r8lambdah2i_RK2mddCIbAsGubaI4eL8_cU);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                return new StateListAnimator(this, tradeType4, string4);
            case 214415088:
                if (!str.equals("FUTURES")) {
                    return null;
                }
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt2 != null) {
                }
                if (Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "long_short_mode")) {
                }
                break;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: o.uwY$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final class StateListAnimator {
        public java.lang.String EZpvd;
        public TradeType KWHzl;
        public final /* synthetic */ C49861uwY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TradeType AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        public StateListAnimator(@NotNull C49861uwY c49861uwY, @NotNull TradeType tradeType, java.lang.String str) {
            Intrinsics.checkNotNullParameter(tradeType, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = c49861uwY;
            this.KWHzl = tradeType;
            this.EZpvd = str;
        }
    }
}
