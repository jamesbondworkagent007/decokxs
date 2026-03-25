package com.okinc.planet.mlnservice.socket;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.planet.mlnservice.socket.MLNPlanetWsListener;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33132mqg;
import o.AbstractC57556yke;
import o.C43251rlk;
import o.C57554ykc;
import o.C57567ykp;
import o.C7840arS;
import o.InterfaceC57559ykh;
import o.InterfaceC60041zuQ;
import o.InterfaceC60044zuT;
import o.InterfaceC9859bdY;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC60044zuT
public final class MLNPlanetWsListener extends LuaUserdata<AbstractC57556yke> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final String[] copydefault = {TtmlNode.START, "stop", "createWeb3PublicListener", "createWeb3PrivateListener"};

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.mlnservice.socket.MLNPlanetWsListener.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] KWHzl() {
            return MLNPlanetWsListener.copydefault;
        }
    }

    @InterfaceC60044zuT
    public MLNPlanetWsListener(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] start(LuaValue[] luaValueArr) {
        T t = this.javaUserdata;
        if (t == 0) {
            return null;
        }
        Intrinsics.copydefault(t);
        ((AbstractC57556yke) t).AhwBna();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] stop(LuaValue[] luaValueArr) {
        T t = this.javaUserdata;
        if (t == 0) {
            return null;
        }
        Intrinsics.copydefault(t);
        ((AbstractC57556yke) t).djBIcL();
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, o.yke] */
    @InterfaceC60044zuT
    public final LuaValue[] createWeb3PublicListener(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        this.javaUserdata = KWHzl(luaValueArr, true);
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, o.yke] */
    @InterfaceC60044zuT
    public final LuaValue[] createWeb3PrivateListener(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        this.javaUserdata = KWHzl(luaValueArr, false);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AbstractC57556yke KWHzl(LuaValue[] luaValueArr, boolean z) {
        final LuaFunction luaFunction;
        String javaString;
        C57567ykp c57567ykpValues;
        ArrayList<? extends InterfaceC57559ykh> arrayList = new ArrayList<>();
        LuaValue luaValue = luaValueArr[0];
        Intrinsics.copydefault(luaValue);
        String strEZpvd = "";
        if (luaValue.isString()) {
            LuaValue luaValue2 = luaValueArr[0];
            Intrinsics.copydefault(luaValue2);
            javaString = luaValue2.toJavaString();
            if (luaValueArr.length < 2) {
                return null;
            }
            LuaValue luaValue3 = luaValueArr[1];
            Intrinsics.copydefault(luaValue3);
            if (luaValue3.isTable()) {
                LuaValue luaValue4 = luaValueArr[2];
                Intrinsics.copydefault(luaValue4);
                if (luaValue4.isFunction()) {
                    LuaValue luaValue5 = luaValueArr[1];
                    Intrinsics.copydefault(luaValue5);
                    LuaTable luaTable = luaValue5.toLuaTable();
                    Intrinsics.checkNotNullExpressionValue(luaTable, "");
                    arrayList.addAll(EZpvd(luaTable));
                    LuaValue luaValue6 = luaValueArr[2];
                    Intrinsics.copydefault(luaValue6);
                    luaFunction = luaValue6.toLuaFunction();
                } else {
                    luaFunction = null;
                }
            }
        } else {
            LuaValue luaValue7 = luaValueArr[0];
            Intrinsics.copydefault(luaValue7);
            if (luaValue7.isUserdata()) {
                LuaValue luaValue8 = luaValueArr[1];
                Intrinsics.copydefault(luaValue8);
                if (luaValue8.isFunction()) {
                    UDPlanetWsArgV5 uDPlanetWsArgV5 = (UDPlanetWsArgV5) luaValueArr[0];
                    if (uDPlanetWsArgV5 != null) {
                        strEZpvd = uDPlanetWsArgV5.EZpvd();
                        arrayList.add(OLrzqt(uDPlanetWsArgV5));
                    }
                    LuaValue luaValue9 = luaValueArr[1];
                    Intrinsics.copydefault(luaValue9);
                    luaFunction = luaValue9.toLuaFunction();
                    javaString = strEZpvd;
                }
            }
            return null;
        }
        if (z) {
            c57567ykpValues = InterfaceC9859bdY.Application.walletPublicConnection$default((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class), false, 1, null);
        } else {
            c57567ykpValues = ((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).values();
        }
        return C57554ykc.Companion.AEQbTJ(javaString, c57567ykpValues, arrayList, new Function2() { // from class: o.tTc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return MLNPlanetWsListener.OLrzqt(luaFunction, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
    }

    public static final Unit OLrzqt(final LuaFunction luaFunction, AbstractC33132mqg abstractC33132mqg, final OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        C7840arS.copydefault(new Runnable() { // from class: o.tTd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                MLNPlanetWsListener.KWHzl(luaFunction, oKIncomingData);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void KWHzl(LuaFunction luaFunction, OKIncomingData oKIncomingData) {
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rString(oKIncomingData.getOriginMsg()));
        }
    }

    private final List<WsArgV5ForWeb3> EZpvd(LuaTable luaTable) {
        ArrayList arrayList = new ArrayList();
        InterfaceC60041zuQ<LuaTable.Application> it = luaTable.iterator();
        if (it == null) {
            return arrayList;
        }
        while (it.hasNext()) {
            LuaTable.Application next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            LuaValue luaValue = next.KWHzl;
            Intrinsics.copydefault(luaValue, "");
            arrayList.add(OLrzqt((UDPlanetWsArgV5) luaValue));
        }
        it.AEQbTJ();
        luaTable.destroy();
        return arrayList;
    }

    public final WsArgV5ForWeb3 OLrzqt(UDPlanetWsArgV5 uDPlanetWsArgV5) {
        JsonObject jsonObject = new JsonObject();
        if (uDPlanetWsArgV5.copydefault() != null) {
            jsonObject = JsonParser.parseString(uDPlanetWsArgV5.copydefault()).getAsJsonObject();
        }
        return new WsArgV5ForWeb3(uDPlanetWsArgV5.EZpvd(), uDPlanetWsArgV5.OLrzqt(), uDPlanetWsArgV5.KWHzl(), uDPlanetWsArgV5.AEQbTJ(), jsonObject);
    }
}
