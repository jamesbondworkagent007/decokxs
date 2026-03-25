package com.okinc.planet.mlnservice.socket;

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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC60044zuT
public final class UDPlanetWsArgV5 extends LuaUserdata<WsArgV5ForWeb3> {
    public String AEQbTJ;
    public String AYXKKw;
    public String AhwBna;
    public String OLrzqt;
    public String copydefault;
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final String[] EZpvd = {AppsFlyerProperties.CHANNEL, "instId", "chainIndex", "tokenContractAddress", "extraParams", "uniqueKey", "initWithResponseArg"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.mlnservice.socket.UDPlanetWsArgV5.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @InterfaceC60044zuT
    public UDPlanetWsArgV5(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AEQbTJ = "";
        copydefault(luaValueArr);
    }

    @InterfaceC60044zuT
    public final LuaValue[] initWithResponseArg(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        String javaString3;
        String javaString4;
        String javaString5;
        String str = "";
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = luaValueArr[0];
        Intrinsics.copydefault(luaValue, "");
        LuaTable luaTable = (LuaTable) luaValue;
        LuaValue luaValue2 = luaTable.get(AppsFlyerProperties.CHANNEL);
        if (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null) {
            javaString = "";
        }
        this.AEQbTJ = javaString;
        LuaValue luaValue3 = luaTable.get("instId");
        if (luaValue3 == null || (javaString2 = luaValue3.toJavaString()) == null) {
            javaString2 = "";
        }
        this.AYXKKw = javaString2;
        LuaValue luaValue4 = luaTable.get("chainIndex");
        if (luaValue4 == null || (javaString3 = luaValue4.toJavaString()) == null) {
            javaString3 = "";
        }
        this.OLrzqt = javaString3;
        LuaValue luaValue5 = luaTable.get("tokenContractAddress");
        if (luaValue5 == null || (javaString4 = luaValue5.toJavaString()) == null) {
            javaString4 = "";
        }
        this.AhwBna = javaString4;
        LuaValue luaValue6 = luaTable.get("extraParams");
        if (luaValue6 != null && (javaString5 = luaValue6.toJavaString()) != null) {
            str = javaString5;
        }
        this.copydefault = str;
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
            this.AEQbTJ = javaString;
        }
        if (luaValueArr != null && (luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null && luaValue4.isString()) {
            String javaString2 = luaValue4.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString2, "");
            this.AYXKKw = javaString2;
        }
        if (luaValueArr != null && (luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) != null && luaValue3.isString()) {
            String javaString3 = luaValue3.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString3, "");
            this.OLrzqt = javaString3;
        }
        if (luaValueArr != null && (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 3)) != null && luaValue2.isString()) {
            String javaString4 = luaValue2.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString4, "");
            this.AhwBna = javaString4;
        }
        if (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 4)) == null || !luaValue.isString()) {
            asJsonObject = null;
        } else {
            String javaString5 = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString5, "");
            this.copydefault = javaString5;
            JsonElement string = JsonParser.parseString(javaString5);
            Intrinsics.checkNotNullExpressionValue(string, "");
            asJsonObject = string.getAsJsonObject();
        }
        this.javaUserdata = new WsArgV5ForWeb3(this.AEQbTJ, this.AYXKKw, this.OLrzqt, this.AhwBna, asJsonObject);
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
        this.AEQbTJ = javaString;
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
        this.AYXKKw = javaString;
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] chainIndex(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.OLrzqt = javaString;
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] tokenContractAddress(@NotNull LuaValue[] luaValueArr) {
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
        this.copydefault = javaString;
        WsArgV5ForWeb3 wsArgV5ForWeb3 = (WsArgV5ForWeb3) this.javaUserdata;
        if (wsArgV5ForWeb3 == null) {
            return null;
        }
        wsArgV5ForWeb3.setExtraParams(javaString);
        return null;
    }
}
