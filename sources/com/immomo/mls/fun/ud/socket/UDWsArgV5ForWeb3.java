package com.immomo.mls.fun.ud.socket;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class UDWsArgV5ForWeb3 extends LuaUserdata<WsArgV5ForWeb3> {
    public String AEQbTJ;
    public String AhwBna;
    public String EZpvd;
    public String copydefault;
    public String valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final String[] KWHzl = {AppsFlyerProperties.CHANNEL, "instId", "chainId", "tokenAddress", "extraParams", "uniqueKey", "initWithResponseArg"};

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ud.socket.UDWsArgV5ForWeb3.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @InterfaceC60044zuT
    public UDWsArgV5ForWeb3(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.EZpvd = "";
        copydefault(luaValueArr);
    }

    @InterfaceC60044zuT
    public final LuaValue[] initWithResponseArg(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        String javaString3;
        String javaString4;
        String str = "";
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = luaValueArr[0];
        Intrinsics.copydefault(luaValue, "");
        LuaTable luaTable = (LuaTable) luaValue;
        LuaValue luaValue2 = luaTable.get(AppsFlyerProperties.CHANNEL);
        if (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null) {
            javaString = "";
        }
        this.EZpvd = javaString;
        LuaValue luaValue3 = luaTable.get("chainId");
        if (luaValue3 == null || (javaString2 = luaValue3.toJavaString()) == null) {
            javaString2 = "";
        }
        this.copydefault = javaString2;
        LuaValue luaValue4 = luaTable.get("tokenAddress");
        if (luaValue4 == null || (javaString3 = luaValue4.toJavaString()) == null) {
            javaString3 = "";
        }
        this.valueOf = javaString3;
        LuaValue luaValue5 = luaTable.get("extraParams");
        if (luaValue5 != null && (javaString4 = luaValue5.toJavaString()) != null) {
            str = javaString4;
        }
        this.AEQbTJ = str;
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] uniqueKey(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        T t = this.javaUserdata;
        if (t != 0) {
            return LuaValue.rString(((WsArgV5ForWeb3) t).getUniqueKey());
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, com.okinc.websocket.v5config.web3.WsArgV5ForWeb3] */
    private final void copydefault(LuaValue[] luaValueArr) {
        JsonObject asJsonObject;
        LuaValue luaValue;
        LuaValue luaValue2;
        LuaValue luaValue3;
        LuaValue luaValue4;
        LuaValue luaValue5;
        if (luaValueArr != null && (luaValue5 = (LuaValue) yDV.gEmmrt(luaValueArr, 0)) != null && luaValue5.isString()) {
            String javaString = luaValue5.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
            this.EZpvd = javaString;
        }
        if (luaValueArr != null && (luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null && luaValue4.isString()) {
            String javaString2 = luaValue4.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString2, "");
            this.AhwBna = javaString2;
        }
        if (luaValueArr != null && (luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) != null && luaValue3.isString()) {
            String javaString3 = luaValue3.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString3, "");
            this.copydefault = javaString3;
        }
        if (luaValueArr != null && (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 3)) != null && luaValue2.isString()) {
            String javaString4 = luaValue2.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString4, "");
            this.valueOf = javaString4;
        }
        if (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 4)) == null || !luaValue.isString()) {
            asJsonObject = null;
        } else {
            String javaString5 = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString5, "");
            this.AEQbTJ = javaString5;
            JsonElement string = JsonParser.parseString(javaString5);
            Intrinsics.checkNotNullExpressionValue(string, "");
            asJsonObject = string.getAsJsonObject();
        }
        this.javaUserdata = new WsArgV5ForWeb3(this.EZpvd, this.AhwBna, this.copydefault, this.valueOf, asJsonObject);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] channel(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        WsArgV5ForWeb3 wsArgV5ForWeb3 = (WsArgV5ForWeb3) this.javaUserdata;
        if (wsArgV5ForWeb3 != null) {
            wsArgV5ForWeb3.setChannel(javaString);
        }
        this.EZpvd = javaString;
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] chainId(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.copydefault = javaString;
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] tokenAddress(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.valueOf = javaString;
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] extraParams(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.AEQbTJ = javaString;
        WsArgV5ForWeb3 wsArgV5ForWeb3 = (WsArgV5ForWeb3) this.javaUserdata;
        if (wsArgV5ForWeb3 == null) {
            return null;
        }
        wsArgV5ForWeb3.setExtraParams(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] instId(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.AhwBna = javaString;
        return null;
    }
}
