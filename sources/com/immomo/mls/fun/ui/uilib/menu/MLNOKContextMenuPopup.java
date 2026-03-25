package com.immomo.mls.fun.ui.uilib.menu;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.immomo.mls.fun.ui.uilib.menu.MLNOKContextMenuPopup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.C7594aml;
import o.C7626anQ;
import o.C7633anX;
import o.C7865arr;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.yDV;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKContextMenuPopup extends UDView<FrameLayout> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final String[] OLrzqt = {"addItem", "setBackgroundColor", "setCornerRadius", "setItemHeight", "onItemClick", "onDismiss", "showAtAnchor", "dismiss"};
    public Integer AEQbTJ;
    public final List<C7626anQ> AYXKKw;
    public int AhwBna;
    public float EZpvd;
    public C7633anX copydefault;
    public LuaFunction djBIcL;
    public final Map<Integer, LuaFunction> gEmmrt;
    public LuaFunction valueOf;

    @InterfaceC60044zuT
    public MLNOKContextMenuPopup(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AYXKKw = new ArrayList();
        this.gEmmrt = new LinkedHashMap();
        this.EZpvd = 8.0f;
        this.AhwBna = 48;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public FrameLayout AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        return new FrameLayout(AubY());
    }

    @InterfaceC60044zuT
    public final LuaValue[] addItem(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        String strSafeGetJavaString$default = C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null);
        if (strSafeGetJavaString$default.length() == 0) {
            return new LuaValue[]{copydefault(-1)};
        }
        C7626anQ c7626anQ = new C7626anQ(null, strSafeGetJavaString$default, null, null, 13, null);
        int size = this.AYXKKw.size();
        this.AYXKKw.add(c7626anQ);
        return new LuaValue[]{copydefault(size)};
    }

    public final OKContextMenuPopupItemBuilder copydefault(int i) {
        Globals globals = this.globals;
        Intrinsics.checkNotNullExpressionValue(globals, "");
        return new OKContextMenuPopupItemBuilder(globals, this, i);
    }

    public final void EZpvd(int i, int i2) {
        if (i < 0 || i >= this.AYXKKw.size()) {
            return;
        }
        List<C7626anQ> list = this.AYXKKw;
        list.set(i, C7626anQ.copy$default(list.get(i), null, null, Integer.valueOf(i2), null, 11, null));
    }

    public final void KWHzl(int i, @NotNull JDImageInfo jDImageInfo) {
        Intrinsics.checkNotNullParameter(jDImageInfo, "");
        if (i < 0 || i >= this.AYXKKw.size()) {
            return;
        }
        List<C7626anQ> list = this.AYXKKw;
        list.set(i, C7626anQ.copy$default(list.get(i), jDImageInfo, null, null, null, 14, null));
    }

    public final void AEQbTJ(int i, @NotNull LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        if (i < 0 || i >= this.AYXKKw.size()) {
            return;
        }
        LuaFunction luaFunction2 = this.gEmmrt.get(Integer.valueOf(i));
        if (luaFunction2 != null) {
            luaFunction2.destroy();
        }
        this.gEmmrt.put(Integer.valueOf(i), luaFunction);
    }

    public static final Unit copydefault(MLNOKContextMenuPopup mLNOKContextMenuPopup, int i) {
        mLNOKContextMenuPopup.AEQbTJ = Integer.valueOf(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setBackgroundColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.EZpvd(luaValueArr, 0, (Function1<? super Integer, Unit>) new Function1() { // from class: o.anS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKContextMenuPopup.copydefault(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        });
        return new LuaValue[]{this};
    }

    @InterfaceC60044zuT
    public final LuaValue[] onItemClick(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaFunction luaFunction = this.djBIcL;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        C7594aml.AEQbTJ(luaValueArr, 0, (Function1<? super LuaFunction, Unit>) new Function1() { // from class: o.anP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKContextMenuPopup.EZpvd(this.OLrzqt, (LuaFunction) obj);
            }
        });
        return new LuaValue[]{this};
    }

    public static final Unit EZpvd(MLNOKContextMenuPopup mLNOKContextMenuPopup, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNOKContextMenuPopup.djBIcL = luaFunction;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] onDismiss(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaFunction luaFunction = this.valueOf;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        C7594aml.AEQbTJ(luaValueArr, 0, (Function1<? super LuaFunction, Unit>) new Function1() { // from class: o.anT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKContextMenuPopup.OLrzqt(this.AEQbTJ, (LuaFunction) obj);
            }
        });
        return new LuaValue[]{this};
    }

    public static final Unit OLrzqt(MLNOKContextMenuPopup mLNOKContextMenuPopup, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNOKContextMenuPopup.valueOf = luaFunction;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] showAtAnchor(@NotNull LuaValue[] luaValueArr) {
        View view;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || (view = (View) C8017aul.AEQbTJ(luaValue, View.class)) == null) {
            return null;
        }
        copydefault(view, C7865arr.copydefault(C7594aml.EZpvd(luaValueArr, 1, 0.0f)), C7865arr.copydefault(C7594aml.EZpvd(luaValueArr, 2, 0.0f)), C7594aml.KWHzl(luaValueArr, 3, 1));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] dismiss(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7633anX c7633anX = this.copydefault;
        if (c7633anX != null) {
            c7633anX.OLrzqt();
        }
        this.copydefault = null;
        return null;
    }

    public static final Unit KWHzl(LuaFunction luaFunction) {
        luaFunction.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MLNOKContextMenuPopup mLNOKContextMenuPopup, int i) {
        LuaFunction luaFunction = mLNOKContextMenuPopup.djBIcL;
        if (luaFunction != null) {
            luaFunction.invoke(new LuaNumber[]{LuaNumber.copydefault(i)});
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MLNOKContextMenuPopup mLNOKContextMenuPopup) {
        LuaFunction luaFunction = mLNOKContextMenuPopup.valueOf;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
        mLNOKContextMenuPopup.copydefault = null;
        return Unit.INSTANCE;
    }

    @Override // org.luaj.vm2.LuaUserdata
    public void __onLuaGc() {
        super.__onLuaGc();
        C7633anX c7633anX = this.copydefault;
        if (c7633anX != null) {
            c7633anX.OLrzqt();
        }
        this.copydefault = null;
        LuaFunction luaFunction = this.djBIcL;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = this.valueOf;
        if (luaFunction2 != null) {
            luaFunction2.destroy();
        }
        this.djBIcL = null;
        this.valueOf = null;
        Iterator<T> it = this.gEmmrt.values().iterator();
        while (it.hasNext()) {
            ((LuaFunction) it.next()).destroy();
        }
        this.gEmmrt.clear();
        this.AYXKKw.clear();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.menu.MLNOKContextMenuPopup.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] KWHzl() {
            return MLNOKContextMenuPopup.OLrzqt;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCornerRadius(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isNumber()) {
            this.EZpvd = luaValue.toFloat();
        }
        return new LuaValue[]{this};
    }

    @InterfaceC60044zuT
    public final LuaValue[] setItemHeight(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            this.AhwBna = luaValue.toInt();
        }
        return new LuaValue[]{this};
    }

    public final void copydefault(View view, int i, int i2, int i3) {
        List<C7626anQ> list = this.AYXKKw;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        int i4 = 0;
        for (Object obj : list) {
            if (i4 < 0) {
                yDY.AYXKKw();
            }
            C7626anQ c7626anQCopy$default = (C7626anQ) obj;
            final LuaFunction luaFunction = this.gEmmrt.get(Integer.valueOf(i4));
            if (luaFunction != null) {
                c7626anQCopy$default = C7626anQ.copy$default(c7626anQCopy$default, null, null, null, new Function0() { // from class: o.anO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MLNOKContextMenuPopup.KWHzl(luaFunction);
                    }
                }, 7, null);
            }
            arrayList.add(c7626anQCopy$default);
            i4++;
        }
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        C7633anX c7633anX = new C7633anX(contextAubY);
        c7633anX.copydefault(arrayList);
        Integer num = this.AEQbTJ;
        if (num != null) {
            c7633anX.KWHzl(num.intValue());
        }
        c7633anX.copydefault(this.EZpvd);
        c7633anX.copydefault(this.AhwBna);
        c7633anX.KWHzl(new Function1() { // from class: o.anM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return MLNOKContextMenuPopup.EZpvd(this.EZpvd, ((java.lang.Integer) obj2).intValue());
            }
        });
        c7633anX.OLrzqt(new Function0() { // from class: o.anR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKContextMenuPopup.EZpvd(this.EZpvd);
            }
        });
        this.copydefault = c7633anX;
        c7633anX.KWHzl(view, i, i2, i3);
    }
}
