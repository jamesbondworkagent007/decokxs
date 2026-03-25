package com.immomo.mls.fun.ui.uilib.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.tab.MLNOKTabs;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55254xgV;
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
public final class MLNOKTabs extends UDView<C55254xgV> implements InterfaceC7719apD {
    public final Integer[] AEQbTJ;
    public C55254xgV AhwBna;
    public final Integer[] copydefault;
    public final Integer[] djBIcL;
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final String[] OLrzqt = {"setItems", "setSelectedIndex", "selectedIndex", "setEnableIndicator", "enableIndicator", "addRightFunctionView", "setDistribution", "setStyle", "setTabSize", "setEnableUnderline", "enableUnderline", "setItemImageAtIndex", "valueDidChangeCallback"};
    public static final String KWHzl = MLNOKTabs.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKTabs(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AEQbTJ = new Integer[]{0, 1};
        this.djBIcL = new Integer[]{6, 5};
        this.copydefault = new Integer[]{44, 36, 36, 24, 48};
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C55254xgV AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        View viewInflate = LayoutInflater.from(AubY()).inflate(C7343ahz.Activity.AkhnZx, (ViewGroup) null, false);
        Intrinsics.copydefault(viewInflate, "");
        C55254xgV c55254xgV = (C55254xgV) viewInflate;
        this.AhwBna = c55254xgV;
        if (c55254xgV != null) {
            return c55254xgV;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setItems(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55254xgV c55254xgV = this.AhwBna;
        if (c55254xgV == null) {
            Intrinsics.gEmmrt("");
            c55254xgV = null;
        }
        final int selectedTabPosition = c55254xgV.copydefault().getSelectedTabPosition();
        C55254xgV c55254xgV2 = this.AhwBna;
        if (c55254xgV2 == null) {
            Intrinsics.gEmmrt("");
            c55254xgV2 = null;
        }
        c55254xgV2.copydefault().removeAllTabs();
        C7594aml.djBIcL(luaValueArr, 0, new Function1() { // from class: o.apO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKTabs.OLrzqt(selectedTabPosition, this, (LuaTable) obj);
            }
        });
        return null;
    }

    public static final Unit OLrzqt(int i, MLNOKTabs mLNOKTabs, LuaTable luaTable) {
        Intrinsics.checkNotNullParameter(luaTable, "");
        int iZLjUOn = luaTable.zLjUOn();
        if (i < 0 || i > iZLjUOn - 1) {
            i = 0;
        }
        int iZLjUOn2 = luaTable.zLjUOn();
        int i2 = 0;
        while (i2 < iZLjUOn2) {
            C55254xgV c55254xgV = mLNOKTabs.AhwBna;
            C55254xgV c55254xgV2 = null;
            if (c55254xgV == null) {
                Intrinsics.gEmmrt("");
                c55254xgV = null;
            }
            TabLayout tabLayoutCopydefault = c55254xgV.copydefault();
            C55254xgV c55254xgV3 = mLNOKTabs.AhwBna;
            if (c55254xgV3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c55254xgV2 = c55254xgV3;
            }
            int i3 = i2 + 1;
            tabLayoutCopydefault.addTab(c55254xgV2.gEmmrt().setText(luaTable.get(i3).toJavaString()), i2 == i);
            i2 = i3;
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] selectedIndex(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55254xgV c55254xgV = this.AhwBna;
        if (c55254xgV == null) {
            Intrinsics.gEmmrt("");
            c55254xgV = null;
        }
        return LuaValue.rNumber(c55254xgV.copydefault().getSelectedTabPosition());
    }

    @InterfaceC60044zuT
    public final LuaValue[] enableIndicator(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55254xgV c55254xgV = this.AhwBna;
        if (c55254xgV == null) {
            Intrinsics.gEmmrt("");
            c55254xgV = null;
        }
        return LuaValue.rBoolean(c55254xgV.AhwBna());
    }

    @InterfaceC60044zuT
    public final LuaValue[] addRightFunctionView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AhwBna(luaValueArr, 0, new Function1() { // from class: o.apP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKTabs.KWHzl(this.copydefault, (android.view.View) obj);
            }
        });
        return null;
    }

    public static final Unit KWHzl(MLNOKTabs mLNOKTabs, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C55254xgV c55254xgV = mLNOKTabs.AhwBna;
        if (c55254xgV == null) {
            Intrinsics.gEmmrt("");
            c55254xgV = null;
        }
        c55254xgV.OLrzqt(view);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] enableUnderline(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55254xgV c55254xgV = this.AhwBna;
        if (c55254xgV == null) {
            Intrinsics.gEmmrt("");
            c55254xgV = null;
        }
        return LuaValue.rBoolean(c55254xgV.AYXKKw());
    }

    @Override // o.InterfaceC7719apD
    public void EZpvd(ViewPager viewPager) {
        C55254xgV c55254xgV = this.AhwBna;
        if (c55254xgV == null) {
            Intrinsics.gEmmrt("");
            c55254xgV = null;
        }
        c55254xgV.copydefault().setupWithViewPager(viewPager);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setItemImageAtIndex(@NotNull final LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context context = ((C55254xgV) this.dHguZz).getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C7594aml.OLrzqt(luaValueArr, context, 0, (Function1<? super Drawable, Unit>) new Function1() { // from class: o.apM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKTabs.AEQbTJ(this.copydefault, luaValueArr, (android.graphics.drawable.Drawable) obj);
            }
        });
        return null;
    }

    public static final Unit AEQbTJ(MLNOKTabs mLNOKTabs, LuaValue[] luaValueArr, Drawable drawable) {
        C55254xgV c55254xgV = mLNOKTabs.AhwBna;
        if (c55254xgV == null) {
            Intrinsics.gEmmrt("");
            c55254xgV = null;
        }
        TabLayout.Tab tabAt = c55254xgV.copydefault().getTabAt(C7594aml.safeGetInt$default(luaValueArr, 1, 0, 2, null));
        if (tabAt != null) {
            tabAt.setIcon(drawable);
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ LuaFunction AEQbTJ;
        public final /* synthetic */ MLNOKTabs EZpvd;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator(LuaFunction luaFunction, MLNOKTabs mLNOKTabs) {
            this.AEQbTJ = luaFunction;
            this.EZpvd = mLNOKTabs;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                LuaFunction luaFunction = this.AEQbTJ;
                MLNOKTabs mLNOKTabs = this.EZpvd;
                if (luaFunction != null) {
                    luaFunction.invoke(LuaValue.varargsOf(mLNOKTabs, LuaNumber.valueOf(tab.getPosition())));
                }
            }
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] valueDidChangeCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "valueDidChangeCallback", new UDView.TaskDescription() { // from class: o.apN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKTabs.AEQbTJ(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    public static final void AEQbTJ(MLNOKTabs mLNOKTabs, LuaFunction luaFunction) {
        ((C55254xgV) mLNOKTabs.dHguZz).AEQbTJ(new StateListAnimator(luaFunction, mLNOKTabs));
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.tab.MLNOKTabs.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] EZpvd() {
            return MLNOKTabs.OLrzqt;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSelectedIndex(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            int i = luaValue.toInt();
            C55254xgV c55254xgV = this.AhwBna;
            if (c55254xgV == null) {
                Intrinsics.gEmmrt("");
                c55254xgV = null;
            }
            TabLayout tabLayoutCopydefault = c55254xgV.copydefault();
            C55254xgV c55254xgV2 = this.AhwBna;
            if (c55254xgV2 == null) {
                Intrinsics.gEmmrt("");
                c55254xgV2 = null;
            }
            tabLayoutCopydefault.selectTab(c55254xgV2.copydefault().getTabAt(i));
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setEnableIndicator(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isBoolean()) {
            boolean z = luaValue.toBoolean();
            C55254xgV c55254xgV = this.AhwBna;
            if (c55254xgV == null) {
                Intrinsics.gEmmrt("");
                c55254xgV = null;
            }
            c55254xgV.setOKDSIndicator(z);
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setDistribution(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            Integer num = (Integer) yDV.gEmmrt(this.AEQbTJ, luaValue.toInt());
            if (num != null) {
                int iIntValue = num.intValue();
                C55254xgV c55254xgV = this.AhwBna;
                if (c55254xgV == null) {
                    Intrinsics.gEmmrt("");
                    c55254xgV = null;
                }
                c55254xgV.copydefault().setTabMode(iIntValue);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            Integer num = (Integer) yDV.gEmmrt(this.djBIcL, luaValue.toInt());
            if (num != null) {
                int iIntValue = num.intValue();
                C55254xgV c55254xgV = this.AhwBna;
                if (c55254xgV == null) {
                    Intrinsics.gEmmrt("");
                    c55254xgV = null;
                }
                c55254xgV.setStyle(iIntValue);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTabSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            Integer num = (Integer) yDV.gEmmrt(this.copydefault, luaValue.toInt());
            if (num != null) {
                int iIntValue = num.intValue();
                C55254xgV c55254xgV = this.AhwBna;
                if (c55254xgV == null) {
                    Intrinsics.gEmmrt("");
                    c55254xgV = null;
                }
                c55254xgV.setOKDSSize(iIntValue);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setEnableUnderline(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isBoolean()) {
            boolean z = luaValue.toBoolean();
            C55254xgV c55254xgV = this.AhwBna;
            if (c55254xgV == null) {
                Intrinsics.gEmmrt("");
                c55254xgV = null;
            }
            c55254xgV.setUnderline(z);
        }
        return null;
    }
}
