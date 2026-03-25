package com.immomo.mls.fun.ud;

import android.content.Context;
import com.immomo.mls.fun.ui.custom.JColor;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43454rpb;
import o.C7322ahe;
import o.C7594aml;
import o.C8017aul;
import o.InterfaceC60037zuM;
import o.InterfaceC60044zuT;
import o.wYG;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class UDImageInfo extends LuaUserdata<JDImageInfo> {
    public static final int $stable = 0;
    public static final String LUA_CLASS_NAME = "Image";
    public static final ActionBar Companion = new ActionBar(null);
    public static final String[] methods = {"customImagePath", "okIcon", "size", "autoMirrored", "absolutePath", "cdn", "avatar"};

    @InterfaceC60044zuT
    public UDImageInfo(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        OLrzqt(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.immomo.mls.fun.ui.custom.data.JDImageInfo */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UDImageInfo(Globals globals, @NotNull JDImageInfo jDImageInfo) {
        super(globals, jDImageInfo);
        Intrinsics.checkNotNullParameter(jDImageInfo, "");
        this.javaUserdata = jDImageInfo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, com.immomo.mls.fun.ui.custom.data.JDImageInfo] */
    private final void OLrzqt(LuaValue[] luaValueArr) {
        JColor jColor;
        if (luaValueArr == null || luaValueArr.length < 5) {
            return;
        }
        String javaString = luaValueArr[0].toJavaString();
        boolean z = luaValueArr[1].toBoolean();
        boolean z2 = luaValueArr[2].toBoolean();
        boolean z3 = luaValueArr[3].toBoolean();
        if (luaValueArr[4].isNil()) {
            jColor = null;
        } else {
            LuaValue luaValue = luaValueArr[4];
            Intrinsics.copydefault(luaValue, "");
            UDColor uDColor = (UDColor) luaValue;
            JColor jColorAEQbTJ = uDColor.AEQbTJ();
            uDColor.destroy();
            jColor = jColorAEQbTJ;
        }
        this.javaUserdata = new JDImageInfo(javaString, z, z3, z2, jColor);
        if (luaValueArr.length == 6 && !luaValueArr[5].isNil()) {
            ((JDImageInfo) this.javaUserdata).setImagePath(luaValueArr[5].toJavaString());
        }
        InterfaceC60037zuM interfaceC60037zuMAuCTel = getGlobals().AuCTel();
        if (interfaceC60037zuMAuCTel instanceof C7322ahe) {
            ((JDImageInfo) this.javaUserdata).setMiniAppResourceLoader(((C7322ahe) interfaceC60037zuMAuCTel).copydefault.isConnected());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final JDImageInfo EZpvd() {
        JDImageInfo jDImageInfo = (JDImageInfo) this.javaUserdata;
        InterfaceC60037zuM interfaceC60037zuMAuCTel = getGlobals().AuCTel();
        if (interfaceC60037zuMAuCTel instanceof C7322ahe) {
            jDImageInfo.setMiniAppResourceLoader(((C7322ahe) interfaceC60037zuMAuCTel).copydefault.isConnected());
        }
        Intrinsics.copydefault(jDImageInfo);
        return jDImageInfo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] cdn(LuaValue[] luaValueArr) {
        String strCopydefault;
        if (luaValueArr != null && luaValueArr.length == 2) {
            LuaValue luaValue = luaValueArr[0];
            String javaString = luaValue != null ? luaValue.toJavaString() : null;
            LuaValue luaValue2 = luaValueArr[1];
            Boolean boolValueOf = luaValue2 != null ? Boolean.valueOf(luaValue2.toBoolean()) : null;
            if (javaString != null) {
                Context contextAEQbTJ = C7594aml.AEQbTJ(this.globals);
                Intrinsics.copydefault(contextAEQbTJ);
                Intrinsics.copydefault(boolValueOf);
                strCopydefault = C43454rpb.copydefault(javaString, contextAEQbTJ, boolValueOf.booleanValue());
            } else {
                strCopydefault = null;
            }
            ((JDImageInfo) this.javaUserdata).setName(strCopydefault);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] avatar(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        ((JDImageInfo) this.javaUserdata).isAvatar = true;
        if (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0)) == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((JDImageInfo) this.javaUserdata).initialPlaceHolderName = javaString;
        return null;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ud.UDImageInfo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] customImagePath(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((JDImageInfo) this.javaUserdata).setImagePath(javaString);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] autoMirrored(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((JDImageInfo) this.javaUserdata).setAutoMirrored(Boolean.valueOf(luaValue.toBoolean()));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] okIcon(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        Integer numEZpvd = wYG.EZpvd(javaString);
        ((JDImageInfo) this.javaUserdata).setOkIcon(numEZpvd != null ? numEZpvd.intValue() : 0);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] size(@NotNull LuaValue[] luaValueArr) {
        Object objAEQbTJ;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || (objAEQbTJ = C8017aul.AEQbTJ(luaValue, (Class<Object>) UDSize.class)) == null) {
            return null;
        }
        ((JDImageInfo) this.javaUserdata).setSize(((UDSize) objAEQbTJ).AEQbTJ());
        luaValue.destroy();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] absolutePath(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((JDImageInfo) this.javaUserdata).setAbsolutePath(javaString);
        return null;
    }
}
