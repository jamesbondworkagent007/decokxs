package com.immomo.mls.fun.ud.socket;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.immomo.mls.fun.ud.socket.OKWsListenerBridge;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.connection.OKWsDoh;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AbstractC33132mqg;
import o.AbstractC57556yke;
import o.C57554ykc;
import o.C7403ajF;
import o.C7840arS;
import o.InterfaceC60041zuQ;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OKWsListenerBridge extends LuaUserdata<AbstractC57556yke> {
    public static final String LUA_CLASS_NAME = "OKWSListener";
    public static final String[] methods = {TtmlNode.START, "stop", "createPublicListener", "createPrivateListener"};

    @InterfaceC60044zuT
    public OKWsListenerBridge(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] start(LuaValue[] luaValueArr) {
        T t = this.javaUserdata;
        if (t == 0) {
            return null;
        }
        ((AbstractC57556yke) t).AhwBna();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] stop(LuaValue[] luaValueArr) {
        T t = this.javaUserdata;
        if (t == 0) {
            return null;
        }
        ((AbstractC57556yke) t).djBIcL();
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, o.yke] */
    @InterfaceC60044zuT
    public LuaValue[] createPublicListener(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        this.javaUserdata = OLrzqt(luaValueArr, true);
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, o.yke] */
    @InterfaceC60044zuT
    public LuaValue[] createPrivateListener(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        this.javaUserdata = OLrzqt(luaValueArr, false);
        return null;
    }

    public final AbstractC57556yke OLrzqt(LuaValue[] luaValueArr, boolean z) {
        String javaString;
        ArrayList arrayList = new ArrayList();
        final LuaFunction luaFunction = null;
        if (luaValueArr[0].isString()) {
            javaString = luaValueArr[0].toJavaString();
            if (luaValueArr.length < 2) {
                return null;
            }
            if (luaValueArr[1].isTable() && luaValueArr[2].isFunction()) {
                arrayList.addAll(copydefault(luaValueArr[1].toLuaTable()));
                luaFunction = luaValueArr[2].toLuaFunction();
            }
        } else {
            if (!luaValueArr[0].isUserdata() || !luaValueArr[1].isFunction()) {
                return null;
            }
            UDWsArgV5 uDWsArgV5 = (UDWsArgV5) luaValueArr[0];
            String strAEQbTJ = uDWsArgV5.AEQbTJ();
            luaFunction = luaValueArr[1].toLuaFunction();
            arrayList.add(AEQbTJ(uDWsArgV5));
            javaString = strAEQbTJ;
        }
        return C57554ykc.KWHzl(javaString, C7403ajF.copydefault("", !z, false, true, false, OKWsDoh.V5), arrayList, new Function2() { // from class: o.ajG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return OKWsListenerBridge.KWHzl(luaFunction, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
    }

    public static /* synthetic */ Unit KWHzl(final LuaFunction luaFunction, AbstractC33132mqg abstractC33132mqg, final OKIncomingData oKIncomingData) {
        C7840arS.copydefault(new Runnable() { // from class: o.ajE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                OKWsListenerBridge.copydefault(luaFunction, oKIncomingData);
            }
        });
        return null;
    }

    public static /* synthetic */ void copydefault(LuaFunction luaFunction, OKIncomingData oKIncomingData) {
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rString(oKIncomingData.getOriginMsg()));
        }
    }

    public final List<WsArgV5> copydefault(LuaTable luaTable) {
        ArrayList arrayList = new ArrayList();
        InterfaceC60041zuQ<LuaTable.Application> it = luaTable.iterator();
        if (it == null) {
            return arrayList;
        }
        while (it.hasNext()) {
            arrayList.add(AEQbTJ((UDWsArgV5) it.next().KWHzl));
        }
        it.AEQbTJ();
        luaTable.destroy();
        return arrayList;
    }

    public final WsArgV5 AEQbTJ(UDWsArgV5 uDWsArgV5) {
        JsonObject jsonObject = new JsonObject();
        if (uDWsArgV5.KWHzl() != null) {
            jsonObject = JsonParser.parseString(uDWsArgV5.KWHzl()).getAsJsonObject();
        }
        return new WsArgV5(uDWsArgV5.AEQbTJ(), uDWsArgV5.valueOf(), uDWsArgV5.AYXKKw(), uDWsArgV5.djBIcL(), uDWsArgV5.EZpvd(), uDWsArgV5.copydefault(), uDWsArgV5.OLrzqt(), jsonObject);
    }
}
