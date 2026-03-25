package com.immomo.mls.fun.ui.uilib.filter;

import android.content.Context;
import android.view.View;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.filter.MLNOKMenuChip;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55052xcf;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKMenuChip extends UDView<C55052xcf> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final String[] EZpvd = {"setSize", "setTitle", "setMenuIcon", "setIcon", "enabled", "selected"};
    public static final Integer[] AEQbTJ = {-4, -6};
    public static final String KWHzl = MLNOKMenuChip.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKMenuChip(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55052xcf AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C55052xcf(contextAubY, null, 2, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setMenuIcon(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C55052xcf) this.dHguZz).AEQbTJ().setVisibility(0);
        C7594aml.safeLoadImage$default(luaValueArr, ((C55052xcf) this.dHguZz).AEQbTJ(), 0, (Function1) null, 6, (Object) null);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setIcon(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeLoadImage$default(luaValueArr, ((C55052xcf) this.dHguZz).EZpvd(), 0, (Function1) null, 6, (Object) null);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] onClick(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "onClick", new UDView.TaskDescription() { // from class: o.anl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKMenuChip.AEQbTJ(this.KWHzl, luaFunction);
            }
        });
        return null;
    }

    public static final void AEQbTJ(final MLNOKMenuChip mLNOKMenuChip, final LuaFunction luaFunction) {
        ((C55052xcf) mLNOKMenuChip.dHguZz).setOnClickListener(new View.OnClickListener() { // from class: o.ano
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKMenuChip.copydefault(luaFunction, mLNOKMenuChip, view);
            }
        });
    }

    public static final void copydefault(LuaFunction luaFunction, MLNOKMenuChip mLNOKMenuChip, View view) {
        if (luaFunction != null) {
            luaFunction.AEQbTJ(mLNOKMenuChip);
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.filter.MLNOKMenuChip.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] KWHzl() {
            return MLNOKMenuChip.EZpvd;
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
        ((C55052xcf) this.dHguZz).setOKDSSize(num.intValue());
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
        ((C55052xcf) this.dHguZz).setTitle(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] selected(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return LuaValue.rBoolean(((C55052xcf) this.dHguZz).isSelected());
        }
        ((C55052xcf) this.dHguZz).setSelected(luaValue.toBoolean());
        return null;
    }
}
