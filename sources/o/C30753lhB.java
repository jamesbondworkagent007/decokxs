package o;

import com.google.android.material.tabs.TabLayout;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30753lhB extends C55249xgQ {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30753lhB(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:14) call: o.lhB.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30753lhB(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30753lhB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void AEQbTJ(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        TabLayout.Tab tabNewTab = newTab();
        tabNewTab.setContentDescription("web3_dex_advance_direction_buy");
        addTab(tabNewTab.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getRatingType)));
        TabLayout.Tab tabNewTab2 = newTab();
        tabNewTab2.setContentDescription("web3_dex_advance_direction_sell");
        addTab(tabNewTab2.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getPlaybackState)));
        EZpvd(true);
        clearOnTabSelectedListeners();
        addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new StateListAnimator(function0, function02));
    }

    /* JADX INFO: renamed from: o.lhB$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ Function0<Unit> EZpvd;
        public final /* synthetic */ Function0<Unit> OLrzqt;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator(Function0<Unit> function0, Function0<Unit> function02) {
            this.EZpvd = function0;
            this.OLrzqt = function02;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                C30753lhB c30753lhB = C30753lhB.this;
                Function0<Unit> function0 = this.EZpvd;
                Function0<Unit> function02 = this.OLrzqt;
                if (tab.getPosition() == 0) {
                    c30753lhB.EZpvd(true);
                    function0.invoke();
                } else {
                    c30753lhB.EZpvd(false);
                    function02.invoke();
                }
            }
        }
    }

    public final void EZpvd(boolean z) {
        if (z) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            KWHzl(C33512mxp.tradeRiseHighlightsFill$default(c33512mxp, context, 0.0f, 2, null));
            KWHzl(C25382ivf.copydefault(C23274hvD.StateListAnimator.QVAiDq));
            return;
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        KWHzl(C33512mxp.tradeFallHighlightsFill$default(c33512mxp2, context2, 0.0f, 2, null));
        KWHzl(C25382ivf.copydefault(C23274hvD.StateListAnimator.OcIXYQ));
    }

    public final void copydefault(@NotNull AdvancedTradeType advancedTradeType) {
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        selectTab(getTabAt(advancedTradeType == AdvancedTradeType.SELL ? 1 : 0));
    }
}
