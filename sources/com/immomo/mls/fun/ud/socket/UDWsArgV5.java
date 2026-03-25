package com.immomo.mls.fun.ud.socket;

import com.appsflyer.AppsFlyerProperties;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.websocket.v5config.WsArgV5;
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
public final class UDWsArgV5 extends LuaUserdata<WsArgV5> {
    public static final String LUA_CLASS_NAME = "OKWSSubscribeArgV5";
    public String algoId;
    public String ccy;
    public String channel;
    public String extraParams;
    public String grouping;
    public String instFamily;
    public String instId;
    public String instType;
    public int referenceCount;
    public String sid;
    public long startTime;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    public static final String[] methods = {AppsFlyerProperties.CHANNEL, "instType", "instFamily", "instId", "ccy", "sid", "algoId", "grouping", "referenceCount", "startTime", "extraParams", "uniqueKey", "initWithResponseArg"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.extraParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.grouping;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.instId;
    }

    @InterfaceC60044zuT
    public UDWsArgV5(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.channel = "";
        EZpvd(luaValueArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.okinc.websocket.v5config.WsArgV5] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, com.okinc.websocket.v5config.WsArgV5] */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, com.okinc.websocket.v5config.WsArgV5] */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, com.okinc.websocket.v5config.WsArgV5] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, com.okinc.websocket.v5config.WsArgV5] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.okinc.websocket.v5config.WsArgV5] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.okinc.websocket.v5config.WsArgV5] */
    private final void EZpvd(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 2) {
            return;
        }
        this.channel = luaValueArr[0].toJavaString();
        this.instId = luaValueArr[1].toJavaString();
        switch (luaValueArr.length) {
            case 2:
                this.javaUserdata = new WsArgV5(this.channel, this.instId, null, null, null, null, null, null, 252, null);
                break;
            case 3:
                this.instFamily = luaValueArr[2].toJavaString();
                this.javaUserdata = new WsArgV5(this.channel, this.instId, this.instFamily, null, null, null, null, null, 248, null);
                break;
            case 4:
                this.instFamily = luaValueArr[2].toJavaString();
                this.instType = luaValueArr[3].toJavaString();
                this.javaUserdata = new WsArgV5(this.channel, this.instId, this.instFamily, this.instType, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
                break;
            case 5:
                this.instFamily = luaValueArr[2].toJavaString();
                this.instType = luaValueArr[3].toJavaString();
                this.ccy = luaValueArr[4].toJavaString();
                this.javaUserdata = new WsArgV5(this.channel, this.instId, this.instFamily, this.instType, this.ccy, null, null, null, 224, null);
                break;
            case 6:
                this.instFamily = luaValueArr[2].toJavaString();
                this.instType = luaValueArr[3].toJavaString();
                this.ccy = luaValueArr[4].toJavaString();
                this.algoId = luaValueArr[5].toJavaString();
                this.javaUserdata = new WsArgV5(this.channel, this.instId, this.instFamily, this.instType, this.ccy, this.algoId, null, null, 192, null);
                break;
            case 7:
                this.instFamily = luaValueArr[2].toJavaString();
                this.instType = luaValueArr[3].toJavaString();
                this.ccy = luaValueArr[4].toJavaString();
                this.algoId = luaValueArr[5].toJavaString();
                this.grouping = luaValueArr[6].toJavaString();
                this.javaUserdata = new WsArgV5(this.channel, this.instId, this.instFamily, this.instType, this.ccy, this.algoId, this.grouping, null, 128, null);
                break;
            case 8:
                this.instFamily = luaValueArr[2].toJavaString();
                this.instType = luaValueArr[3].toJavaString();
                this.ccy = luaValueArr[4].toJavaString();
                this.algoId = luaValueArr[5].toJavaString();
                this.grouping = luaValueArr[6].toJavaString();
                String javaString = luaValueArr[7].toJavaString();
                this.extraParams = javaString;
                JsonElement string = JsonParser.parseString(javaString);
                Intrinsics.checkNotNullExpressionValue(string, "");
                JsonObject asJsonObject = string.getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                this.javaUserdata = new WsArgV5(this.channel, this.instId, this.instFamily, this.instType, this.ccy, this.algoId, this.grouping, asJsonObject);
                break;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] initWithResponseArg(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        String javaString3;
        String javaString4;
        String javaString5;
        String javaString6;
        String javaString7;
        String javaString8;
        String str = "";
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = luaValueArr[0];
        Intrinsics.copydefault(luaValue, "");
        LuaTable luaTable = (LuaTable) luaValue;
        LuaValue luaValue2 = luaTable.get(AppsFlyerProperties.CHANNEL);
        if (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null) {
            javaString = "";
        }
        this.channel = javaString;
        LuaValue luaValue3 = luaTable.get("instId");
        if (luaValue3 == null || (javaString2 = luaValue3.toJavaString()) == null) {
            javaString2 = "";
        }
        this.instId = javaString2;
        LuaValue luaValue4 = luaTable.get("instFamily");
        if (luaValue4 == null || (javaString3 = luaValue4.toJavaString()) == null) {
            javaString3 = "";
        }
        this.instFamily = javaString3;
        LuaValue luaValue5 = luaTable.get("instType");
        if (luaValue5 == null || (javaString4 = luaValue5.toJavaString()) == null) {
            javaString4 = "";
        }
        this.instType = javaString4;
        LuaValue luaValue6 = luaTable.get("ccy");
        if (luaValue6 == null || (javaString5 = luaValue6.toJavaString()) == null) {
            javaString5 = "";
        }
        this.ccy = javaString5;
        LuaValue luaValue7 = luaTable.get("algoId");
        if (luaValue7 == null || (javaString6 = luaValue7.toJavaString()) == null) {
            javaString6 = "";
        }
        this.algoId = javaString6;
        LuaValue luaValue8 = luaTable.get("grouping");
        if (luaValue8 == null || (javaString7 = luaValue8.toJavaString()) == null) {
            javaString7 = "";
        }
        this.grouping = javaString7;
        LuaValue luaValue9 = luaTable.get("extraParams");
        if (luaValue9 != null && (javaString8 = luaValue9.toJavaString()) != null) {
            str = javaString8;
        }
        this.extraParams = str;
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] uniqueKey(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        T t = this.javaUserdata;
        if (t != 0) {
            return LuaValue.rString(((WsArgV5) t).getUniqueKey());
        }
        return null;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ud.socket.UDWsArgV5.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
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
        WsArgV5 wsArgV5 = (WsArgV5) this.javaUserdata;
        if (wsArgV5 != null) {
            wsArgV5.setChannel(javaString);
        }
        this.channel = javaString;
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] instType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.instType = javaString;
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] instFamily(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.instFamily = javaString;
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
        this.instId = javaString;
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] ccy(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.ccy = javaString;
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] sid(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.sid = javaString;
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] algoId(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.algoId = javaString;
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] grouping(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.grouping = javaString;
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] referenceCount(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        this.referenceCount = luaValue.toInt();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] startTime(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isNumber()) {
            return null;
        }
        this.startTime = luaValue.toLong();
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
        this.extraParams = javaString;
        WsArgV5 wsArgV5 = (WsArgV5) this.javaUserdata;
        if (wsArgV5 == null) {
            return null;
        }
        wsArgV5.setExtraParams(javaString);
        return null;
    }
}
