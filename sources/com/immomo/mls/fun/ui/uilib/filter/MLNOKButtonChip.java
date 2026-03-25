package com.immomo.mls.fun.ui.uilib.filter;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54984xbQ;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKButtonChip extends UDView<C54984xbQ> {
    public int gEmmrt;
    public boolean valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public static final String[] EZpvd = {"setSize", "setTitle", "enabled", "selected", "setStyle"};
    public static final Integer[] AEQbTJ = {-4, -5, -3};
    public static final Integer[] OLrzqt = {0, 1, 2, 3, 4};
    public static final String copydefault = MLNOKButtonChip.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKButtonChip(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.gEmmrt = OLrzqt[0].intValue();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C54984xbQ AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C54984xbQ(contextAubY, null, 0, 6, null);
    }

    public final void AhwBna() {
        ((C54984xbQ) this.dHguZz).setStyle(this.gEmmrt);
        C54984xbQ c54984xbQ = (C54984xbQ) this.dHguZz;
        c54984xbQ.setEnabledStyle(c54984xbQ.isEnabled(), this.gEmmrt);
        if (((C54984xbQ) this.dHguZz).isEnabled()) {
            ((C54984xbQ) this.dHguZz).setSelectedStyle(this.valueOf, this.gEmmrt);
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.filter.MLNOKButtonChip.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] OLrzqt() {
            return MLNOKButtonChip.EZpvd;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(AEQbTJ, luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((C54984xbQ) this.dHguZz).setOKDSSize(num.intValue());
        AhwBna();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C54984xbQ) this.dHguZz).setTitle(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] selected(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        this.valueOf = luaValue.toBoolean();
        AhwBna();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] enabled(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((C54984xbQ) this.dHguZz).setEnabled(luaValue.toBoolean());
        AhwBna();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        this.gEmmrt = OLrzqt[luaValue.toInt()].intValue();
        AhwBna();
        return null;
    }
}
