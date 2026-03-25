package com.immomo.mls.fun.ui.uilib.tab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.tab.MLNOKButtonChipGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55241xgI;
import o.C7343ahz;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.InterfaceC7719apD;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKButtonChipGroup extends UDView<C55241xgI> implements InterfaceC7719apD {
    public C55241xgI AYXKKw;
    public final Integer[] AhwBna;
    public final Integer[] KWHzl;
    public final Integer[] copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public static final String[] EZpvd = {"setItems", "setSelectedIndex", "selectedIndex", "setDistribution", "setStyle", "setSize", "valueDidChangeCallback"};
    public static final String AEQbTJ = MLNOKButtonChipGroup.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKButtonChipGroup(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.KWHzl = new Integer[]{0, 1};
        this.AhwBna = new Integer[]{3, 4};
        this.copydefault = new Integer[]{-4, -5, -6};
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55241xgI AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        View viewInflate = LayoutInflater.from(AubY()).inflate(C7343ahz.Activity.AhwBna, (ViewGroup) null, false);
        Intrinsics.copydefault(viewInflate, "");
        C55241xgI c55241xgI = (C55241xgI) viewInflate;
        this.AYXKKw = c55241xgI;
        if (c55241xgI != null) {
            return c55241xgI;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setItems(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55241xgI c55241xgI = this.AYXKKw;
        if (c55241xgI == null) {
            Intrinsics.gEmmrt("");
            c55241xgI = null;
        }
        final int selectedTabPosition = c55241xgI.getSelectedTabPosition();
        C55241xgI c55241xgI2 = this.AYXKKw;
        if (c55241xgI2 == null) {
            Intrinsics.gEmmrt("");
            c55241xgI2 = null;
        }
        c55241xgI2.removeAllTabs();
        C7594aml.djBIcL(luaValueArr, 0, new Function1() { // from class: o.apE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKButtonChipGroup.AEQbTJ(selectedTabPosition, this, (LuaTable) obj);
            }
        });
        return null;
    }

    public static final Unit AEQbTJ(int i, MLNOKButtonChipGroup mLNOKButtonChipGroup, LuaTable luaTable) {
        Intrinsics.checkNotNullParameter(luaTable, "");
        int iZLjUOn = luaTable.zLjUOn();
        if (i < 0 || i > iZLjUOn - 1) {
            i = 0;
        }
        int iZLjUOn2 = luaTable.zLjUOn();
        int i2 = 0;
        while (i2 < iZLjUOn2) {
            C55241xgI c55241xgI = mLNOKButtonChipGroup.AYXKKw;
            C55241xgI c55241xgI2 = null;
            if (c55241xgI == null) {
                Intrinsics.gEmmrt("");
                c55241xgI = null;
            }
            C55241xgI c55241xgI3 = mLNOKButtonChipGroup.AYXKKw;
            if (c55241xgI3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c55241xgI2 = c55241xgI3;
            }
            int i3 = i2 + 1;
            c55241xgI.addTab(c55241xgI2.newTab().setText(luaTable.get(i3).toJavaString()), i2 == i);
            i2 = i3;
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] selectedIndex(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55241xgI c55241xgI = this.AYXKKw;
        if (c55241xgI == null) {
            Intrinsics.gEmmrt("");
            c55241xgI = null;
        }
        return LuaValue.rNumber(c55241xgI.getSelectedTabPosition());
    }

    @Override // o.InterfaceC7719apD
    public void EZpvd(ViewPager viewPager) {
        C55241xgI c55241xgI = this.AYXKKw;
        if (c55241xgI == null) {
            Intrinsics.gEmmrt("");
            c55241xgI = null;
        }
        c55241xgI.setupWithViewPager(viewPager);
    }

    public static final class Application implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ MLNOKButtonChipGroup OLrzqt;
        public final /* synthetic */ LuaFunction copydefault;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Application(LuaFunction luaFunction, MLNOKButtonChipGroup mLNOKButtonChipGroup) {
            this.copydefault = luaFunction;
            this.OLrzqt = mLNOKButtonChipGroup;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                LuaFunction luaFunction = this.copydefault;
                MLNOKButtonChipGroup mLNOKButtonChipGroup = this.OLrzqt;
                if (luaFunction != null) {
                    luaFunction.invoke(LuaValue.varargsOf(mLNOKButtonChipGroup));
                }
            }
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] valueDidChangeCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "valueDidChangeCallback", new UDView.TaskDescription() { // from class: o.apB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKButtonChipGroup.OLrzqt(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    public static final void OLrzqt(MLNOKButtonChipGroup mLNOKButtonChipGroup, LuaFunction luaFunction) {
        ((C55241xgI) mLNOKButtonChipGroup.dHguZz).addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Application(luaFunction, mLNOKButtonChipGroup));
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.tab.MLNOKButtonChipGroup.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String[] KWHzl() {
            return MLNOKButtonChipGroup.EZpvd;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSelectedIndex(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            int i = luaValue.toInt();
            C55241xgI c55241xgI = this.AYXKKw;
            if (c55241xgI == null) {
                Intrinsics.gEmmrt("");
                c55241xgI = null;
            }
            C55241xgI c55241xgI2 = this.AYXKKw;
            if (c55241xgI2 == null) {
                Intrinsics.gEmmrt("");
                c55241xgI2 = null;
            }
            c55241xgI.selectTab(c55241xgI2.getTabAt(i));
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setDistribution(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            Integer num = (Integer) yDV.gEmmrt(this.KWHzl, luaValue.toInt());
            if (num != null) {
                int iIntValue = num.intValue();
                C55241xgI c55241xgI = this.AYXKKw;
                if (c55241xgI == null) {
                    Intrinsics.gEmmrt("");
                    c55241xgI = null;
                }
                c55241xgI.setTabMode(iIntValue);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            Integer num = (Integer) yDV.gEmmrt(this.AhwBna, luaValue.toInt());
            if (num != null) {
                int iIntValue = num.intValue();
                C55241xgI c55241xgI = this.AYXKKw;
                if (c55241xgI == null) {
                    Intrinsics.gEmmrt("");
                    c55241xgI = null;
                }
                c55241xgI.setOKButtonChipStyle(iIntValue);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            Integer num = (Integer) yDV.gEmmrt(this.copydefault, luaValue.toInt());
            if (num != null) {
                int iIntValue = num.intValue();
                C55241xgI c55241xgI = this.AYXKKw;
                if (c55241xgI == null) {
                    Intrinsics.gEmmrt("");
                    c55241xgI = null;
                }
                c55241xgI.setOKDSSize(iIntValue);
            }
        }
        return null;
    }
}
