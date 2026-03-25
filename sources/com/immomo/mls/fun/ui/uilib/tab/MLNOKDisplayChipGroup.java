package com.immomo.mls.fun.ui.uilib.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.tab.MLNOKDisplayChipGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55243xgK;
import o.C55244xgL;
import o.C7343ahz;
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
public final class MLNOKDisplayChipGroup extends UDView<C55244xgL> implements InterfaceC7719apD {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public static final String[] copydefault = {"setItems", "setSelectedIndex", "selectedIndex", "setStyle", "setTabSize", "setItemImageAtIndex", "valueDidChangeCallback", "addRightFunctionView"};
    public C55244xgL AEQbTJ;
    public final Integer[] EZpvd;
    public final Integer[] KWHzl;

    @InterfaceC60044zuT
    public MLNOKDisplayChipGroup(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.KWHzl = new Integer[]{-6, -5, -20};
        this.EZpvd = new Integer[]{0, 1, 2};
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C55244xgL AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        View viewInflate = LayoutInflater.from(AubY()).inflate(C7343ahz.Activity.fetchVPNInfo, (ViewGroup) null, false);
        Intrinsics.copydefault(viewInflate, "");
        C55244xgL c55244xgL = (C55244xgL) viewInflate;
        this.AEQbTJ = c55244xgL;
        if (c55244xgL != null) {
            return c55244xgL;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setItems(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55244xgL c55244xgL = this.AEQbTJ;
        if (c55244xgL == null) {
            Intrinsics.gEmmrt("");
            c55244xgL = null;
        }
        final int selectedTabPosition = c55244xgL.AYXKKw().getSelectedTabPosition();
        C55244xgL c55244xgL2 = this.AEQbTJ;
        if (c55244xgL2 == null) {
            Intrinsics.gEmmrt("");
            c55244xgL2 = null;
        }
        c55244xgL2.AYXKKw().removeAllTabs();
        C7594aml.djBIcL(luaValueArr, 0, new Function1() { // from class: o.apC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKDisplayChipGroup.OLrzqt(selectedTabPosition, this, (LuaTable) obj);
            }
        });
        return null;
    }

    public static final Unit OLrzqt(int i, MLNOKDisplayChipGroup mLNOKDisplayChipGroup, LuaTable luaTable) {
        Intrinsics.checkNotNullParameter(luaTable, "");
        int iZLjUOn = luaTable.zLjUOn();
        if (i < 0 || i > iZLjUOn - 1) {
            i = 0;
        }
        int iZLjUOn2 = luaTable.zLjUOn();
        int i2 = 0;
        while (i2 < iZLjUOn2) {
            C55244xgL c55244xgL = mLNOKDisplayChipGroup.AEQbTJ;
            C55244xgL c55244xgL2 = null;
            if (c55244xgL == null) {
                Intrinsics.gEmmrt("");
                c55244xgL = null;
            }
            TabLayout tabLayoutAYXKKw = c55244xgL.AYXKKw();
            C55244xgL c55244xgL3 = mLNOKDisplayChipGroup.AEQbTJ;
            if (c55244xgL3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c55244xgL2 = c55244xgL3;
            }
            int i3 = i2 + 1;
            tabLayoutAYXKKw.addTab(c55244xgL2.values().setText(luaTable.get(i3).toJavaString()), i2 == i);
            i2 = i3;
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] selectedIndex(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55244xgL c55244xgL = this.AEQbTJ;
        if (c55244xgL == null) {
            Intrinsics.gEmmrt("");
            c55244xgL = null;
        }
        return LuaValue.rNumber(c55244xgL.AYXKKw().getSelectedTabPosition());
    }

    @InterfaceC60044zuT
    public final LuaValue[] setItemImageAtIndex(@NotNull final LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context context = ((C55244xgL) this.dHguZz).getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C7594aml.OLrzqt(luaValueArr, context, 0, (Function1<? super Drawable, Unit>) new Function1() { // from class: o.apK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKDisplayChipGroup.AEQbTJ(this.copydefault, luaValueArr, (android.graphics.drawable.Drawable) obj);
            }
        });
        return null;
    }

    public static final Unit AEQbTJ(MLNOKDisplayChipGroup mLNOKDisplayChipGroup, LuaValue[] luaValueArr, Drawable drawable) {
        if (drawable != null) {
            C55244xgL c55244xgL = mLNOKDisplayChipGroup.AEQbTJ;
            if (c55244xgL == null) {
                Intrinsics.gEmmrt("");
                c55244xgL = null;
            }
            TabLayout.Tab tabAt = c55244xgL.AYXKKw().getTabAt(C7594aml.safeGetInt$default(luaValueArr, 1, 0, 2, null));
            if (tabAt != null) {
                C55243xgK.AEQbTJ(tabAt, drawable);
            }
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ LuaFunction EZpvd;
        public final /* synthetic */ MLNOKDisplayChipGroup OLrzqt;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar(LuaFunction luaFunction, MLNOKDisplayChipGroup mLNOKDisplayChipGroup) {
            this.EZpvd = luaFunction;
            this.OLrzqt = mLNOKDisplayChipGroup;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                LuaFunction luaFunction = this.EZpvd;
                MLNOKDisplayChipGroup mLNOKDisplayChipGroup = this.OLrzqt;
                if (luaFunction != null) {
                    luaFunction.invoke(LuaValue.varargsOf(mLNOKDisplayChipGroup, LuaNumber.valueOf(tab.getPosition())));
                }
            }
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] valueDidChangeCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "valueDidChangeCallback", new UDView.TaskDescription() { // from class: o.apJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKDisplayChipGroup.EZpvd(this.AEQbTJ, luaFunction);
            }
        });
        return null;
    }

    public static final void EZpvd(MLNOKDisplayChipGroup mLNOKDisplayChipGroup, LuaFunction luaFunction) {
        ((C55244xgL) mLNOKDisplayChipGroup.dHguZz).copydefault(new ActionBar(luaFunction, mLNOKDisplayChipGroup));
    }

    @InterfaceC60044zuT
    public final LuaValue[] addRightFunctionView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AhwBna(luaValueArr, 0, new Function1() { // from class: o.apG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKDisplayChipGroup.OLrzqt(this.EZpvd, (android.view.View) obj);
            }
        });
        return null;
    }

    public static final Unit OLrzqt(MLNOKDisplayChipGroup mLNOKDisplayChipGroup, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C55244xgL c55244xgL = mLNOKDisplayChipGroup.AEQbTJ;
        if (c55244xgL == null) {
            Intrinsics.gEmmrt("");
            c55244xgL = null;
        }
        c55244xgL.copydefault(view);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC7719apD
    public void EZpvd(ViewPager viewPager) {
        C55244xgL c55244xgL = this.AEQbTJ;
        if (c55244xgL == null) {
            Intrinsics.gEmmrt("");
            c55244xgL = null;
        }
        c55244xgL.AYXKKw().setupWithViewPager(viewPager);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.tab.MLNOKDisplayChipGroup.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String[] OLrzqt() {
            return MLNOKDisplayChipGroup.copydefault;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSelectedIndex(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            int i = luaValue.toInt();
            C55244xgL c55244xgL = this.AEQbTJ;
            if (c55244xgL == null) {
                Intrinsics.gEmmrt("");
                c55244xgL = null;
            }
            TabLayout tabLayoutAYXKKw = c55244xgL.AYXKKw();
            tabLayoutAYXKKw.selectTab(tabLayoutAYXKKw.getTabAt(i));
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            Integer num = (Integer) yDV.gEmmrt(this.EZpvd, luaValue.toInt());
            if (num != null) {
                int iIntValue = num.intValue();
                C55244xgL c55244xgL = this.AEQbTJ;
                if (c55244xgL == null) {
                    Intrinsics.gEmmrt("");
                    c55244xgL = null;
                }
                c55244xgL.setStyle(iIntValue);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTabSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            Integer num = (Integer) yDV.gEmmrt(this.KWHzl, luaValue.toInt());
            if (num != null) {
                int iIntValue = num.intValue();
                C55244xgL c55244xgL = this.AEQbTJ;
                if (c55244xgL == null) {
                    Intrinsics.gEmmrt("");
                    c55244xgL = null;
                }
                c55244xgL.setOKDSSize(iIntValue);
            }
        }
        return null;
    }
}
