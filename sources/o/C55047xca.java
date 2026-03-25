package o;

import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.google.android.material.tabs.TabLayout;
import com.okinc.uilab.filter.FilterChip;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55274xgp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55047xca extends TabLayout {
    public android.widget.PopupWindow AEQbTJ;
    public int EZpvd;
    public java.util.List<C54982xbO> KWHzl;
    public Function1<? super C54982xbO, ? extends FilterChip> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55047xca(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.PopupWindow KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomChip(@NotNull Function1<? super C54982xbO, ? extends FilterChip> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOKDSSize$OKUILib_uilib(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectionDropdown$OKUILib_uilib(android.widget.PopupWindow popupWindow) {
        this.AEQbTJ = popupWindow;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:12) call: o.xca.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55047xca(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55047xca(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = -4;
        this.copydefault = new Function1() { // from class: o.xcc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55047xca.AEQbTJ(context, (C54982xbO) obj);
            }
        };
    }

    public static final C54993xbZ AEQbTJ(android.content.Context context, C54982xbO c54982xbO) {
        Intrinsics.checkNotNullParameter(c54982xbO, "");
        C54993xbZ c54993xbZ = new C54993xbZ(context);
        C54985xbR.AEQbTJ(c54993xbZ, c54982xbO);
        ViewGroup.LayoutParams layoutParams = c54993xbZ.getTitleView().getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ((ConstraintLayout.LayoutParams) layoutParams).goneStartMargin = 0;
        return c54993xbZ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xca */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$OKUILib_uilib$default(C55047xca c55047xca, java.util.List list, Function2 function2, Function2 function22, Function2 function23, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = null;
        }
        if ((i & 8) != 0) {
            function23 = null;
        }
        c55047xca.setData$OKUILib_uilib(list, function2, function22, function23);
    }

    public final void setData$OKUILib_uilib(@NotNull java.util.List<C54982xbO> list, Function2<? super TabLayout.Tab, ? super java.lang.Integer, Unit> function2, Function2<? super TabLayout.Tab, ? super java.lang.Integer, Unit> function22, Function2<? super TabLayout.Tab, ? super java.lang.Integer, Unit> function23) {
        Intrinsics.checkNotNullParameter(list, "");
        removeAllTabs();
        this.KWHzl = list;
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C54982xbO c54982xbO = (C54982xbO) obj;
            FilterChip filterChipInvoke = this.copydefault.invoke(c54982xbO);
            filterChipInvoke.setOKDSSize(this.EZpvd);
            C54985xbR.AEQbTJ(filterChipInvoke, c54982xbO);
            addTab(filterChipInvoke.getNewTab(this, i), false);
            i++;
        }
        selectTab(null);
        addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Application(function2, list, function22, function23));
        OLrzqt();
    }

    /* JADX INFO: renamed from: o.xca$Application */
    public static final class Application implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ Function2<TabLayout.Tab, java.lang.Integer, Unit> EZpvd;
        public final /* synthetic */ java.util.List<C54982xbO> KWHzl;
        public final /* synthetic */ Function2<TabLayout.Tab, java.lang.Integer, Unit> OLrzqt;
        public final /* synthetic */ Function2<TabLayout.Tab, java.lang.Integer, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super com.google.android.material.tabs.TabLayout$Tab, ? super java.lang.Integer, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super com.google.android.material.tabs.TabLayout$Tab, ? super java.lang.Integer, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super com.google.android.material.tabs.TabLayout$Tab, ? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function2<? super TabLayout.Tab, ? super java.lang.Integer, Unit> function2, java.util.List<C54982xbO> list, Function2<? super TabLayout.Tab, ? super java.lang.Integer, Unit> function22, Function2<? super TabLayout.Tab, ? super java.lang.Integer, Unit> function23) {
            this.EZpvd = function2;
            this.KWHzl = list;
            this.copydefault = function22;
            this.OLrzqt = function23;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (C55047xca.this.OLrzqt(tab)) {
                java.lang.Object tag = tab != null ? tab.getTag() : null;
                Intrinsics.copydefault(tag, "");
                kotlin.Pair pair = (kotlin.Pair) tag;
                Function2<TabLayout.Tab, java.lang.Integer, Unit> function2 = this.EZpvd;
                if (function2 != null) {
                    function2.invoke(tab, (java.lang.Integer) pair.getSecond());
                }
                C54982xbO c54982xbO = this.KWHzl.get(((java.lang.Number) pair.getSecond()).intValue());
                if (c54982xbO.fARcdN()) {
                    return;
                }
                c54982xbO.EZpvd(true);
                ((FilterChip) pair.getFirst()).setSelected(true);
                Function0<java.lang.Boolean> function0Values = c54982xbO.values();
                if (function0Values == null || !function0Values.invoke().booleanValue()) {
                    C55047xca.this.EZpvd(c54982xbO);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            if (C55047xca.this.OLrzqt(tab)) {
                java.lang.Object tag = tab != null ? tab.getTag() : null;
                Intrinsics.copydefault(tag, "");
                kotlin.Pair pair = (kotlin.Pair) tag;
                ((FilterChip) pair.getFirst()).setSelected(false);
                this.KWHzl.get(((java.lang.Number) pair.getSecond()).intValue()).EZpvd(false);
                Function2<TabLayout.Tab, java.lang.Integer, Unit> function2 = this.copydefault;
                if (function2 != null) {
                    function2.invoke(tab, (java.lang.Integer) pair.getSecond());
                }
                android.widget.PopupWindow popupWindowKWHzl = C55047xca.this.KWHzl();
                if (popupWindowKWHzl != null) {
                    popupWindowKWHzl.dismiss();
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            if (C55047xca.this.OLrzqt(tab)) {
                java.lang.Object tag = tab != null ? tab.getTag() : null;
                Intrinsics.copydefault(tag, "");
                kotlin.Pair pair = (kotlin.Pair) tag;
                Function2<TabLayout.Tab, java.lang.Integer, Unit> function2 = this.OLrzqt;
                if (function2 != null) {
                    function2.invoke(tab, (java.lang.Integer) pair.getSecond());
                }
            }
        }
    }

    private final void OLrzqt() {
        android.view.View customView;
        TabLayout.Tab tabAt = getTabAt(0);
        if (tabAt == null || (customView = tabAt.getCustomView()) == null) {
            return;
        }
        customView.post(new java.lang.Runnable() { // from class: o.xcd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C55047xca.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public static final void OLrzqt(C55047xca c55047xca) {
        android.view.View customView;
        try {
            android.view.View childAt = c55047xca.getChildAt(0);
            ViewGroup.LayoutParams layoutParams = c55047xca.getChildAt(0).getLayoutParams();
            TabLayout.Tab tabAt = c55047xca.getTabAt(0);
            java.lang.Integer numValueOf = (tabAt == null || (customView = tabAt.getCustomView()) == null) ? null : java.lang.Integer.valueOf(customView.getHeight());
            Intrinsics.copydefault(numValueOf);
            layoutParams.height = numValueOf.intValue();
            childAt.setLayoutParams(layoutParams);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            getChildAt(0).setMinimumHeight(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean OLrzqt(TabLayout.Tab tab) {
        if ((tab != null ? tab.getTag() : null) == null || !(tab.getTag() instanceof kotlin.Pair)) {
            return false;
        }
        java.lang.Object tag = tab.getTag();
        Intrinsics.copydefault(tag, "");
        java.lang.Object first = ((kotlin.Pair) tag).getFirst();
        Intrinsics.copydefault(first, "");
        return ((FilterChip) first).isEnabled();
    }

    public final void copydefault() {
        selectTab(null, false);
    }

    public final void copydefault(TabLayout.Tab tab, @NotNull C54982xbO c54982xbO) {
        C54982xbO c54982xbO2;
        Intrinsics.checkNotNullParameter(c54982xbO, "");
        if (tab != null) {
            java.lang.Object tag = tab.getTag();
            Intrinsics.copydefault(tag, "");
            int iIntValue = ((java.lang.Number) ((kotlin.Pair) tag).getSecond()).intValue();
            java.util.List<C54982xbO> list = this.KWHzl;
            if (list == null || (c54982xbO2 = list.get(iIntValue)) == null) {
                return;
            }
            c54982xbO2.EZpvd(c54982xbO.AuCTel());
            c54982xbO2.AEQbTJ(c54982xbO.copydefault());
            c54982xbO2.EZpvd(c54982xbO.fARcdN());
            c54982xbO2.AEQbTJ(c54982xbO.OLrzqt());
            c54982xbO2.KWHzl(c54982xbO.KWHzl());
            c54982xbO2.AEQbTJ(c54982xbO.ejfBZ());
            c54982xbO2.EZpvd(c54982xbO.fJNWhG());
            c54982xbO2.copydefault(c54982xbO.AEQbTJ());
        }
    }

    public final InterfaceC55274xgp KWHzl(C54982xbO c54982xbO) {
        java.util.List<C55276xgr> listInvoke;
        java.util.List<C55276xgr> listInvoke2;
        InterfaceC55274xgp.TaskDescription taskDescription = InterfaceC55274xgp.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        InterfaceC55274xgp interfaceC55274xgpEZpvd = taskDescription.EZpvd(context);
        Function1<java.util.List<C55276xgr>, Unit> function1AYXKKw = c54982xbO.AYXKKw();
        if (function1AYXKKw != null) {
            Function0<java.util.List<C55276xgr>> function0AhwBna = c54982xbO.AhwBna();
            if (function0AhwBna != null && (listInvoke2 = function0AhwBna.invoke()) != null) {
                interfaceC55274xgpEZpvd.setMultipleOneColumnData(listInvoke2, function1AYXKKw);
            }
        } else {
            Function0<java.util.List<C55276xgr>> function0AhwBna2 = c54982xbO.AhwBna();
            if (function0AhwBna2 != null && (listInvoke = function0AhwBna2.invoke()) != null) {
                interfaceC55274xgpEZpvd.setMultipleColumnData(listInvoke, c54982xbO.valueOf(), c54982xbO.gEmmrt(), c54982xbO.DbNXlk());
            }
        }
        Function2<java.lang.CharSequence, MutableLiveData<java.util.List<C55276xgr>>, Unit> function2FetchVPNInfo = c54982xbO.fetchVPNInfo();
        if (function2FetchVPNInfo != null) {
            interfaceC55274xgpEZpvd.AEQbTJ(function2FetchVPNInfo, c54982xbO.AkhnZx(), c54982xbO.djBIcL());
        }
        return interfaceC55274xgpEZpvd;
    }

    public final boolean EZpvd(C54982xbO c54982xbO) {
        InterfaceC55274xgp interfaceC55274xgpKWHzl = KWHzl(c54982xbO);
        final int selectedTabPosition = getSelectedTabPosition();
        Function1<InterfaceC55274xgp, java.lang.Boolean> function1IsConnected = c54982xbO.isConnected();
        java.lang.Boolean boolInvoke = function1IsConnected != null ? function1IsConnected.invoke(interfaceC55274xgpKWHzl) : null;
        if (boolInvoke != null && boolInvoke.booleanValue()) {
            return false;
        }
        android.widget.PopupWindow popupWindow = this.AEQbTJ;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.AEQbTJ = interfaceC55274xgpKWHzl.OLrzqt(this, new PopupWindow.OnDismissListener() { // from class: o.xbY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C55047xca.EZpvd(this.KWHzl, selectedTabPosition);
            }
        });
        return true;
    }

    public static final void EZpvd(C55047xca c55047xca, int i) {
        c55047xca.copydefault(i);
    }

    public final void copydefault(int i) {
        if (i == getSelectedTabPosition()) {
            selectTab(null);
        }
    }
}
