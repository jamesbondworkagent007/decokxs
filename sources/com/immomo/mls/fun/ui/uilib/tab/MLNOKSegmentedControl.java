package com.immomo.mls.fun.ui.uilib.tab;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.tab.MLNOKSegmentedControl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55249xgQ;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.InterfaceC7719apD;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKSegmentedControl extends UDView<C55249xgQ> implements InterfaceC7719apD {
    public final Integer[] KWHzl;
    public final Integer[] copydefault;
    public final Integer[] djBIcL;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public static final String[] OLrzqt = {"setItems", "setSelectedIndex", "selectedIndex", "setLayout", "setStyle", "setSize", "valueDidChangeCallback"};
    public static final String EZpvd = MLNOKSegmentedControl.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKSegmentedControl(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.copydefault = new Integer[]{1, 2};
        this.djBIcL = new Integer[]{-1, -2};
        this.KWHzl = new Integer[]{-4, -5, -3};
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55249xgQ AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C55249xgQ(contextAubY, null, 0, 6, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setItems(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        final int selectedTabPosition = ((C55249xgQ) this.dHguZz).getSelectedTabPosition();
        ((C55249xgQ) this.dHguZz).removeAllTabs();
        C7594aml.djBIcL(luaValueArr, 0, new Function1() { // from class: o.apI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSegmentedControl.KWHzl(selectedTabPosition, this, (LuaTable) obj);
            }
        });
        return null;
    }

    public static final Unit KWHzl(int i, MLNOKSegmentedControl mLNOKSegmentedControl, LuaTable luaTable) {
        Intrinsics.checkNotNullParameter(luaTable, "");
        int iZLjUOn = luaTable.zLjUOn();
        if (i < 0 || i > iZLjUOn - 1) {
            i = 0;
        }
        int iZLjUOn2 = luaTable.zLjUOn();
        int i2 = 0;
        while (i2 < iZLjUOn2) {
            C55249xgQ c55249xgQ = (C55249xgQ) mLNOKSegmentedControl.dHguZz;
            int i3 = i2 + 1;
            c55249xgQ.addTab(c55249xgQ.newTab().setText(luaTable.get(i3).toJavaString()), i2 == i);
            i2 = i3;
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] selectedIndex(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        return LuaValue.rNumber(((C55249xgQ) this.dHguZz).getSelectedTabPosition());
    }

    public static final class Application implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ LuaFunction EZpvd;
        public final /* synthetic */ MLNOKSegmentedControl KWHzl;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Application(LuaFunction luaFunction, MLNOKSegmentedControl mLNOKSegmentedControl) {
            this.EZpvd = luaFunction;
            this.KWHzl = mLNOKSegmentedControl;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                LuaFunction luaFunction = this.EZpvd;
                MLNOKSegmentedControl mLNOKSegmentedControl = this.KWHzl;
                if (luaFunction != null) {
                    luaFunction.invoke(LuaValue.varargsOf(mLNOKSegmentedControl, LuaNumber.valueOf(tab.getPosition())));
                }
            }
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] valueDidChangeCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "valueDidChangeCallback", new UDView.TaskDescription() { // from class: o.apH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSegmentedControl.OLrzqt(this.AEQbTJ, luaFunction);
            }
        });
        return null;
    }

    public static final void OLrzqt(MLNOKSegmentedControl mLNOKSegmentedControl, LuaFunction luaFunction) {
        ((C55249xgQ) mLNOKSegmentedControl.dHguZz).addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Application(luaFunction, mLNOKSegmentedControl));
    }

    @Override // o.InterfaceC7719apD
    public void EZpvd(ViewPager viewPager) {
        ((C55249xgQ) this.dHguZz).setupWithViewPager(viewPager);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.tab.MLNOKSegmentedControl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] OLrzqt() {
            return MLNOKSegmentedControl.OLrzqt;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSelectedIndex(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        int i = luaValue.toInt();
        C55249xgQ c55249xgQ = (C55249xgQ) this.dHguZz;
        c55249xgQ.selectTab(c55249xgQ.getTabAt(i));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setLayout(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(this.copydefault, luaValue.toInt());
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        C55249xgQ c55249xgQ = (C55249xgQ) this.dHguZz;
        if (iIntValue == 1) {
            c55249xgQ.setTabMode(1);
            c55249xgQ.setTabGravity(0);
            return null;
        }
        c55249xgQ.setTabMode(2);
        c55249xgQ.setTabGravity(1);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(this.djBIcL, luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((C55249xgQ) this.dHguZz).setOKDSPill(num.intValue());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(this.KWHzl, luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((C55249xgQ) this.dHguZz).setOKDSSize(num.intValue());
        return null;
    }
}
