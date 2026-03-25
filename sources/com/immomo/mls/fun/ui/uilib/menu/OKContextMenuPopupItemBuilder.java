package com.immomo.mls.fun.ui.uilib.menu;

import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.immomo.mls.fun.ui.uilib.menu.OKContextMenuPopupItemBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7594aml;
import o.InterfaceC60044zuT;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.JavaUserdata;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class OKContextMenuPopupItemBuilder extends JavaUserdata<Object> {
    public MLNOKContextMenuPopup AEQbTJ;
    public int EZpvd;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final String[] KWHzl = {"setImage", "setTextColor", "handler"};

    @InterfaceC60044zuT
    public OKContextMenuPopupItemBuilder(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.EZpvd = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKContextMenuPopupItemBuilder(@NotNull Globals globals, @NotNull MLNOKContextMenuPopup mLNOKContextMenuPopup, int i) {
        super(globals, (Object) null);
        Intrinsics.checkNotNullParameter(globals, "");
        Intrinsics.checkNotNullParameter(mLNOKContextMenuPopup, "");
        this.AEQbTJ = mLNOKContextMenuPopup;
        this.EZpvd = i;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setImage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.copydefault(luaValueArr, 0, (Function1<? super JDImageInfo, Unit>) new Function1() { // from class: o.anY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKContextMenuPopupItemBuilder.EZpvd(this.OLrzqt, (JDImageInfo) obj);
            }
        });
        return new LuaValue[]{this};
    }

    public static final Unit EZpvd(OKContextMenuPopupItemBuilder oKContextMenuPopupItemBuilder, JDImageInfo jDImageInfo) {
        Intrinsics.checkNotNullParameter(jDImageInfo, "");
        MLNOKContextMenuPopup mLNOKContextMenuPopup = oKContextMenuPopupItemBuilder.AEQbTJ;
        if (mLNOKContextMenuPopup != null) {
            mLNOKContextMenuPopup.KWHzl(oKContextMenuPopupItemBuilder.EZpvd, jDImageInfo);
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTextColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.EZpvd(luaValueArr, 0, (Function1<? super Integer, Unit>) new Function1() { // from class: o.aob
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKContextMenuPopupItemBuilder.KWHzl(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        return new LuaValue[]{this};
    }

    public static final Unit KWHzl(OKContextMenuPopupItemBuilder oKContextMenuPopupItemBuilder, int i) {
        MLNOKContextMenuPopup mLNOKContextMenuPopup = oKContextMenuPopupItemBuilder.AEQbTJ;
        if (mLNOKContextMenuPopup != null) {
            mLNOKContextMenuPopup.EZpvd(oKContextMenuPopupItemBuilder.EZpvd, i);
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] handler(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AEQbTJ(luaValueArr, 0, (Function1<? super LuaFunction, Unit>) new Function1() { // from class: o.aoa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKContextMenuPopupItemBuilder.EZpvd(this.OLrzqt, (LuaFunction) obj);
            }
        });
        return new LuaValue[]{this};
    }

    public static final Unit EZpvd(OKContextMenuPopupItemBuilder oKContextMenuPopupItemBuilder, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        MLNOKContextMenuPopup mLNOKContextMenuPopup = oKContextMenuPopupItemBuilder.AEQbTJ;
        if (mLNOKContextMenuPopup != null) {
            mLNOKContextMenuPopup.AEQbTJ(oKContextMenuPopupItemBuilder.EZpvd, luaFunction);
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.menu.OKContextMenuPopupItemBuilder.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] KWHzl() {
            return OKContextMenuPopupItemBuilder.KWHzl;
        }
    }
}
