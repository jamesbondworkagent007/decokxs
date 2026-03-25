package com.okinc.business.defi.dapp.view;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54989xbV;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC60044zuT
public final class DiscoverOKFilterChip extends UDView<C54989xbV> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final String[] OLrzqt = {"setStyle", "setSize", "setTitle", "setMenuIconGone", "setMenuIcon", "setCaretIcon", "setCaretIconGone", "selected"};
    public static final String copydefault = DiscoverOKFilterChip.class.getSimpleName();
    public final Integer[] EZpvd;

    @InterfaceC60044zuT
    public DiscoverOKFilterChip(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.EZpvd = new Integer[]{-6, -5, -4, -20};
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C54989xbV AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C54989xbV(contextAubY, null, 0, 6, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setMenuIcon(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C54989xbV) this.dHguZz).AEQbTJ().setVisibility(0);
        C7594aml.safeLoadImage$default(luaValueArr, ((C54989xbV) this.dHguZz).AEQbTJ(), 0, (Function1) null, 6, (Object) null);
        ((C54989xbV) this.dHguZz).OLrzqt().getVisibility();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCaretIcon(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C54989xbV) this.dHguZz).OLrzqt().setVisibility(0);
        C7594aml.safeLoadImage$default(luaValueArr, ((C54989xbV) this.dHguZz).AEQbTJ(), 0, (Function1) null, 6, (Object) null);
        return null;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.view.DiscoverOKFilterChip.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] OLrzqt() {
            return DiscoverOKFilterChip.OLrzqt;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        ((C54989xbV) this.dHguZz).setStyle(luaValue.toInt());
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
        ((C54989xbV) this.dHguZz).EZpvd().setVisibility(0);
        ((C54989xbV) this.dHguZz).EZpvd().setText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(this.EZpvd, luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((C54989xbV) this.dHguZz).setOKDSSize(num.intValue());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setMenuIconGone(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((C54989xbV) this.dHguZz).AEQbTJ().setVisibility(luaValue.toBoolean() ? 8 : 0);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCaretIconGone(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((C54989xbV) this.dHguZz).OLrzqt().setVisibility(luaValue.toBoolean() ? 8 : 0);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] selected(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return LuaValue.rBoolean(((C54989xbV) this.dHguZz).isSelected());
        }
        ((C54989xbV) this.dHguZz).setSelected(luaValue.toBoolean());
        return null;
    }
}
