package com.okinc.nft.push;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.UDArray;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.nft.push.NFTPushManager;
import com.okinc.websocket.v5config.WsArgV5;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.AbstractC33132mqg;
import o.AbstractC57556yke;
import o.C43251rlk;
import o.C54819xWm;
import o.C57554ykc;
import o.C7869arv;
import o.InterfaceC57559ykh;
import o.InterfaceC7835arN;
import o.InterfaceC9859bdY;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class NFTPushManager {
    public static final String LUA_CLASS_NAME = "OKNFTPushManager";
    public static final ConcurrentHashMap<String, ArrayList<String>> sChannelUUIDCache = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC7835arN> sLuaCallbackCache = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC7835arN> sLuaStateCallbackCache = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, AbstractC57556yke> sPushListenerCache = new ConcurrentHashMap<>();
    public Globals globals;

    public NFTPushManager(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public void addListenerWithParams(String str, int i, String str2, Map map, InterfaceC7835arN interfaceC7835arN, InterfaceC7835arN interfaceC7835arN2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strAEQbTJ = AEQbTJ(str);
        if (TextUtils.isEmpty(strAEQbTJ)) {
            return;
        }
        ConcurrentHashMap<String, ArrayList<String>> concurrentHashMap = sChannelUUIDCache;
        ArrayList<String> arrayList = concurrentHashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            concurrentHashMap.put(str, arrayList);
        }
        arrayList.add(strAEQbTJ);
        sLuaCallbackCache.put(strAEQbTJ, interfaceC7835arN);
        sLuaStateCallbackCache.put(strAEQbTJ, interfaceC7835arN2);
        JsonObject asJsonObject = (map == null || map.isEmpty()) ? null : new Gson().toJsonTree(map).getAsJsonObject();
        ArrayList<? extends InterfaceC57559ykh> arrayList2 = new ArrayList<>();
        arrayList2.add(new WsArgV5ForWeb3(str, null, i + "", str2, asJsonObject));
        AbstractC57556yke abstractC57556ykeCopydefault = C57554ykc.Companion.copydefault(str, ((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).values(), arrayList2, new AnonymousClass4(strAEQbTJ), new AnonymousClass5(strAEQbTJ));
        abstractC57556ykeCopydefault.AhwBna();
        sPushListenerCache.put(strAEQbTJ, abstractC57556ykeCopydefault);
    }

    /* JADX INFO: renamed from: com.okinc.nft.push.NFTPushManager$4, reason: invalid class name */
    public class AnonymousClass4 implements Function1<OKWsConnectionState, Unit> {
        public final /* synthetic */ String AEQbTJ;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass4(String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Unit invoke(final OKWsConnectionState oKWsConnectionState) {
            Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ == null) {
                return null;
            }
            final String str = this.AEQbTJ;
            activityAEQbTJ.runOnUiThread(new Runnable() { // from class: o.rqB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    NFTPushManager.AnonymousClass4.KWHzl(str, oKWsConnectionState);
                }
            });
            return null;
        }

        public static /* synthetic */ void KWHzl(String str, OKWsConnectionState oKWsConnectionState) {
            InterfaceC7835arN interfaceC7835arN = (InterfaceC7835arN) NFTPushManager.sLuaStateCallbackCache.get(str);
            if (interfaceC7835arN == null || oKWsConnectionState == null) {
                return;
            }
            try {
                interfaceC7835arN.EZpvd(LuaNumber.valueOf(oKWsConnectionState.getState()));
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.nft.push.NFTPushManager$5, reason: invalid class name */
    public class AnonymousClass5 implements Function2<AbstractC33132mqg, OKIncomingData, Unit> {
        public final /* synthetic */ String AEQbTJ;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass5(String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Unit invoke(AbstractC33132mqg abstractC33132mqg, final OKIncomingData oKIncomingData) {
            Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ == null) {
                return null;
            }
            final String str = this.AEQbTJ;
            activityAEQbTJ.runOnUiThread(new Runnable() { // from class: o.rqG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.KWHzl.AEQbTJ(str, oKIncomingData);
                }
            });
            return null;
        }

        public final /* synthetic */ void AEQbTJ(String str, OKIncomingData oKIncomingData) {
            InterfaceC7835arN interfaceC7835arN = (InterfaceC7835arN) NFTPushManager.sLuaCallbackCache.get(str);
            if (interfaceC7835arN == null) {
                return;
            }
            try {
                interfaceC7835arN.EZpvd(new UDArray(NFTPushManager.this.globals, C7869arv.KWHzl(new JSONArray((String) oKIncomingData.getPayload()))));
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    @LuaBridge
    public void addCommonListenerWithParams(String str, Map map, InterfaceC7835arN interfaceC7835arN, InterfaceC7835arN interfaceC7835arN2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strAEQbTJ = AEQbTJ(str);
        if (TextUtils.isEmpty(strAEQbTJ)) {
            return;
        }
        ConcurrentHashMap<String, ArrayList<String>> concurrentHashMap = sChannelUUIDCache;
        ArrayList<String> arrayList = concurrentHashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            concurrentHashMap.put(str, arrayList);
        }
        arrayList.add(strAEQbTJ);
        sLuaCallbackCache.put(strAEQbTJ, interfaceC7835arN);
        sLuaStateCallbackCache.put(strAEQbTJ, interfaceC7835arN2);
        JsonObject asJsonObject = (map == null || map.isEmpty()) ? null : new Gson().toJsonTree(map).getAsJsonObject();
        ArrayList<? extends InterfaceC57559ykh> arrayList2 = new ArrayList<>();
        arrayList2.add(new WsArgV5(str, null, null, null, null, null, null, asJsonObject));
        AbstractC57556yke abstractC57556ykeCopydefault = C57554ykc.Companion.copydefault(str, ((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).values(), arrayList2, new AnonymousClass1(strAEQbTJ), new AnonymousClass3(strAEQbTJ));
        abstractC57556ykeCopydefault.AhwBna();
        sPushListenerCache.put(strAEQbTJ, abstractC57556ykeCopydefault);
    }

    /* JADX INFO: renamed from: com.okinc.nft.push.NFTPushManager$1, reason: invalid class name */
    public class AnonymousClass1 implements Function1<OKWsConnectionState, Unit> {
        public final /* synthetic */ String copydefault;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass1(String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Unit invoke(final OKWsConnectionState oKWsConnectionState) {
            Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ == null) {
                return null;
            }
            final String str = this.copydefault;
            activityAEQbTJ.runOnUiThread(new Runnable() { // from class: o.rqC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    NFTPushManager.AnonymousClass1.OLrzqt(str, oKWsConnectionState);
                }
            });
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void OLrzqt(String str, OKWsConnectionState oKWsConnectionState) {
            InterfaceC7835arN interfaceC7835arN = (InterfaceC7835arN) NFTPushManager.sLuaStateCallbackCache.get(str);
            if (interfaceC7835arN == null || oKWsConnectionState == null) {
                return;
            }
            try {
                interfaceC7835arN.EZpvd(LuaNumber.valueOf(oKWsConnectionState.getState()));
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.nft.push.NFTPushManager$3, reason: invalid class name */
    public class AnonymousClass3 implements Function2<AbstractC33132mqg, OKIncomingData, Unit> {
        public final /* synthetic */ String OLrzqt;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass3(String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Unit invoke(AbstractC33132mqg abstractC33132mqg, final OKIncomingData oKIncomingData) {
            Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ == null) {
                return null;
            }
            final String str = this.OLrzqt;
            activityAEQbTJ.runOnUiThread(new Runnable() { // from class: o.rqE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.copydefault.EZpvd(str, oKIncomingData);
                }
            });
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void EZpvd(String str, OKIncomingData oKIncomingData) {
            InterfaceC7835arN interfaceC7835arN = (InterfaceC7835arN) NFTPushManager.sLuaCallbackCache.get(str);
            if (interfaceC7835arN == null) {
                return;
            }
            try {
                String str2 = (String) oKIncomingData.getPayload();
                List arrayList = new ArrayList();
                try {
                    arrayList.add(C7869arv.KWHzl(new JSONObject(str2)));
                } catch (JSONException unused) {
                    arrayList = C7869arv.KWHzl(new JSONArray(str2));
                }
                interfaceC7835arN.EZpvd(new UDArray(NFTPushManager.this.globals, arrayList));
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public final String AEQbTJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str + SystemClock.currentThreadTimeMillis();
    }

    @LuaBridge
    public LuaValue[] removeListenerWithChannelId(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length >= 1) {
            String javaString = luaValueArr[0].toJavaString();
            if (TextUtils.isEmpty(javaString)) {
                return LuaValue.rBoolean(false);
            }
            ArrayList<String> arrayList = sChannelUUIDCache.get(javaString);
            if (arrayList == null) {
                return LuaValue.rBoolean(false);
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                copydefault(it.next());
            }
            return LuaValue.rBoolean(true);
        }
        return LuaValue.rBoolean(false);
    }

    @LuaBridge
    public LuaValue[] removeListenerWithId(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length >= 1) {
            String javaString = luaValueArr[0].toJavaString();
            if (TextUtils.isEmpty(javaString)) {
                return LuaValue.rBoolean(false);
            }
            copydefault(javaString);
            return LuaValue.rBoolean(true);
        }
        return LuaValue.rBoolean(false);
    }

    public final void copydefault(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        InterfaceC7835arN interfaceC7835arNRemove = sLuaCallbackCache.remove(str);
        if (interfaceC7835arNRemove != null) {
            interfaceC7835arNRemove.OLrzqt();
        }
        InterfaceC7835arN interfaceC7835arNRemove2 = sLuaStateCallbackCache.remove(str);
        if (interfaceC7835arNRemove2 != null) {
            interfaceC7835arNRemove2.OLrzqt();
        }
        AbstractC57556yke abstractC57556ykeRemove = sPushListenerCache.remove(str);
        if (abstractC57556ykeRemove != null) {
            abstractC57556ykeRemove.djBIcL();
        }
    }
}
