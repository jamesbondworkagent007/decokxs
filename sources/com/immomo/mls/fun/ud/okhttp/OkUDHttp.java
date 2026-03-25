package com.immomo.mls.fun.ud.okhttp;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.KotlinUtils;
import com.immomo.mls.fun.ud.UDMap;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.encrypt.EncryptStrategy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C43047rhs;
import o.C43466rpn;
import o.C58216yxB;
import o.C7441ajr;
import o.C7594aml;
import o.C7840arS;
import o.C7869arv;
import o.C7910asj;
import o.InterfaceC7433ajj;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass(gcByLua = false)
public class OkUDHttp {
    public static final String LUA_CLASS_NAME = "Http";
    public Globals globals;
    public int mCachePolicy;
    public int mSeconds;
    public int mTimeout;
    public JsonObject responseData;
    public boolean tokenShouldAsCacheKey;
    public C58216yxB disposables = new C58216yxB();
    public boolean mIgnoreAuth = false;
    public boolean mCryptoUseBody = false;
    public String mVerifyToken = null;
    public SubdomainStrategy mSubdomainStrategy = null;
    public final Map<String, String> mExtHeaders = new HashMap();
    public C7441ajr requestModule = new C7441ajr();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public LuaValue[] configCache(int i, int i2, boolean z, boolean z2) {
        this.mCachePolicy = i;
        this.mSeconds = i2;
        this.tokenShouldAsCacheKey = z;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void configIgnoreAuthorization() {
        this.mIgnoreAuth = true;
    }

    public final int copydefault(boolean z) {
        return z ? 1 : 0;
    }

    @LuaBridge
    public void download(String str, Map map, InterfaceC7835arN interfaceC7835arN, InterfaceC7835arN interfaceC7835arN2) {
    }

    @LuaBridge
    public LuaValue[] loadFromCache(String str, Map map) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public LuaValue[] setCryptoUseBody(boolean z) {
        this.mCryptoUseBody = z;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public LuaValue[] setTimeout(int i) {
        this.mTimeout = i;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public LuaValue[] setVerifyToken(String str) {
        if (str == null) {
            str = "";
        }
        this.mVerifyToken = str;
        return null;
    }

    @LuaBridge
    public void shouldUseTime(boolean z) {
    }

    @LuaBridge
    public void upload(String str, Map map, List list, List list2, InterfaceC7835arN interfaceC7835arN) {
    }

    public OkUDHttp(Globals globals, LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ajr */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @LuaBridge
    public void post(final String str, Map<String, Object> map, final InterfaceC7835arN interfaceC7835arN) {
        if (map == null) {
            map = new HashMap<>();
        }
        this.disposables.AEQbTJ(this.requestModule.OLrzqt(str, KWHzl(this.mCachePolicy), this.mSeconds, copydefault(this.tokenShouldAsCacheKey), KotlinUtils.copydefault.EZpvd(this.mIgnoreAuth), map, (this.mCryptoUseBody ? EncryptStrategy.TIME : EncryptStrategy.NONE).name(), copydefault(), new InterfaceC7433ajj<JsonObject>() { // from class: com.immomo.mls.fun.ud.okhttp.OkUDHttp.1
            /* JADX DEBUG: Method merged with bridge method: OLrzqt(ZLjava/lang/Object;Ljava/lang/Exception;)V */
            @Override // o.InterfaceC7433ajj
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public void OLrzqt(boolean z, JsonObject jsonObject, Exception exc) {
                OkUDHttp.this.responseData = jsonObject;
                if (jsonObject == null && (exc instanceof UDSystemException)) {
                    OkUDHttp okUDHttp = OkUDHttp.this;
                    okUDHttp.KWHzl(okUDHttp.globals, ((UDSystemException) exc).getMsg(), interfaceC7835arN);
                } else if (jsonObject == null && (exc instanceof UDApiException)) {
                    OkUDHttp okUDHttp2 = OkUDHttp.this;
                    okUDHttp2.KWHzl(okUDHttp2.globals, ((UDApiException) exc).getMsg(), interfaceC7835arN);
                } else if (jsonObject != null) {
                    OkUDHttp okUDHttp3 = OkUDHttp.this;
                    okUDHttp3.KWHzl(z, okUDHttp3.globals, jsonObject, interfaceC7835arN, str);
                }
            }
        }));
    }

    @LuaBridge
    public void get(final String str, Map<String, String> map, final InterfaceC7835arN interfaceC7835arN) {
        if (map == null) {
            map = new HashMap<>();
        }
        this.disposables.AEQbTJ(this.requestModule.EZpvd(str, KWHzl(this.mCachePolicy), this.mSeconds, copydefault(this.tokenShouldAsCacheKey), KotlinUtils.copydefault.EZpvd(this.mIgnoreAuth), map, copydefault(), new InterfaceC7433ajj<JsonObject>() { // from class: com.immomo.mls.fun.ud.okhttp.OkUDHttp.2
            /* JADX DEBUG: Method merged with bridge method: OLrzqt(ZLjava/lang/Object;Ljava/lang/Exception;)V */
            @Override // o.InterfaceC7433ajj
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public void OLrzqt(boolean z, JsonObject jsonObject, Exception exc) {
                OkUDHttp.this.responseData = jsonObject;
                if (jsonObject == null && (exc instanceof UDSystemException)) {
                    OkUDHttp okUDHttp = OkUDHttp.this;
                    okUDHttp.KWHzl(okUDHttp.globals, ((UDSystemException) exc).getMsg(), interfaceC7835arN);
                } else if (jsonObject == null && (exc instanceof UDApiException)) {
                    OkUDHttp okUDHttp2 = OkUDHttp.this;
                    okUDHttp2.KWHzl(okUDHttp2.globals, ((UDApiException) exc).getMsg(), interfaceC7835arN);
                } else {
                    OkUDHttp okUDHttp3 = OkUDHttp.this;
                    okUDHttp3.KWHzl(z, okUDHttp3.globals, jsonObject, interfaceC7835arN, str);
                }
            }
        }));
    }

    public void AEQbTJ() {
        cancel();
        Globals globals = this.globals;
        if (globals != null && !globals.isDestroyed()) {
            this.globals.destroy();
        }
        this.globals = null;
    }

    @LuaBridge
    public LuaValue[] setSubdomainStrategy(String str) {
        if (str == null || str.isEmpty()) {
            this.mSubdomainStrategy = null;
        } else if ("Global".equals(str)) {
            this.mSubdomainStrategy = SubdomainStrategy.Global.INSTANCE;
        } else {
            this.mSubdomainStrategy = new SubdomainStrategy.Subdomain(str);
        }
        return null;
    }

    @LuaBridge
    public LuaValue[] setExtHeader(Map<String, String> map) {
        this.mExtHeaders.clear();
        if (map == null || map.isEmpty()) {
            return null;
        }
        this.mExtHeaders.putAll(map);
        return null;
    }

    @LuaBridge
    public LuaValue[] cancel() {
        this.disposables.dispose();
        return null;
    }

    @LuaBridge
    public LuaValue[] rawResponse() {
        return LuaValue.varargsOf(C7910asj.EZpvd(this.globals, AEQbTJ(this.responseData)));
    }

    @LuaBridge
    public LuaValue[] isFromCache() {
        JsonObject jsonObject = this.responseData;
        return LuaValue.rBoolean(jsonObject != null ? C43466rpn.OLrzqt.EZpvd(jsonObject) : false);
    }

    public final String KWHzl(int i) {
        if (i == 0) {
            return CacheStrategy.NO_CACHE.name();
        }
        if (i == 1) {
            return CacheStrategy.FIRST_CACHE.name();
        }
        if (i == 2) {
            return CacheStrategy.FIRST_CACHE.name();
        }
        if (i == 3) {
            return CacheStrategy.FIRST_CACHE.name();
        }
        if (i == 4) {
            return CacheStrategy.FIRST_NETWORK.name();
        }
        return CacheStrategy.NO_CACHE.name();
    }

    public final void KWHzl(final boolean z, final Globals globals, final JsonObject jsonObject, final InterfaceC7835arN interfaceC7835arN, String str) {
        if (interfaceC7835arN == null || globals == null || globals.isDestroyed()) {
            return;
        }
        C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ud.okhttp.OkUDHttp.5
            @Override // java.lang.Runnable
            public void run() {
                if (globals.isDestroyed()) {
                    return;
                }
                JsonObject jsonObject2 = jsonObject;
                if (jsonObject2 == null) {
                    interfaceC7835arN.EZpvd(LuaValue.rFalse(), new UDMap(globals, new HashMap()));
                    return;
                }
                if (z) {
                    try {
                        JsonElement jsonElement = jsonObject2.get("data");
                        if (jsonElement instanceof JsonObject) {
                            interfaceC7835arN.EZpvd(LuaValue.True(), C7869arv.copydefault(globals, (JsonObject) jsonElement));
                        } else if (jsonElement instanceof JsonArray) {
                            interfaceC7835arN.EZpvd(LuaValue.True(), C7869arv.EZpvd(globals, (JsonArray) jsonElement));
                        } else if (jsonElement != null) {
                            interfaceC7835arN.EZpvd(LuaValue.True(), jsonElement);
                        } else {
                            interfaceC7835arN.EZpvd(LuaValue.True(), C7869arv.copydefault(globals, jsonObject));
                        }
                        return;
                    } catch (Exception unused) {
                        interfaceC7835arN.EZpvd(LuaValue.False(), new UDMap(globals, new HashMap()));
                        return;
                    }
                }
                interfaceC7835arN.EZpvd(LuaValue.False(), LuaValue.Nil(), new UDMap(globals, OkUDHttp.this.AEQbTJ(jsonObject)));
            }
        });
    }

    public final String EZpvd(JsonObject jsonObject, String str) {
        try {
            return jsonObject.get(str).getAsString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final Map<String, Object> AEQbTJ(JsonObject jsonObject) {
        String string;
        if (jsonObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("code", jsonObject.get("code") + "");
        map.put("msg", EZpvd(jsonObject, "msg"));
        JsonElement jsonElement = jsonObject.get("data");
        if (jsonElement == null) {
            string = jsonObject.toString();
        } else {
            string = jsonElement.toString();
        }
        map.put("data", string);
        map.put("detailMsg", EZpvd(jsonObject, "detailMsg"));
        map.put(EopTrackEvent.KEY_ERROR_MESSAGE, EZpvd(jsonObject, EopTrackEvent.KEY_ERROR_MESSAGE));
        return map;
    }

    public final void KWHzl(final Globals globals, final String str, final InterfaceC7835arN interfaceC7835arN) {
        if (interfaceC7835arN == null || globals == null || globals.isDestroyed()) {
            return;
        }
        C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ud.okhttp.OkUDHttp.3
            @Override // java.lang.Runnable
            public void run() {
                HashMap map = new HashMap();
                map.put("code", MultiTransferSignData.DEFAULT_INTERVAL);
                map.put("msg", str);
                interfaceC7835arN.EZpvd(LuaValue.False(), LuaValue.Nil(), new UDMap(globals, map));
            }
        });
    }

    public final Map<String, String> copydefault() {
        HashMap map = new HashMap(this.mExtHeaders);
        int i = this.mTimeout;
        if (i > 0) {
            String strValueOf = String.valueOf(i);
            map.put("ConnectTimeout", strValueOf);
            map.put("ReadTimeout", strValueOf);
            map.put("WriteTimeout", strValueOf);
        }
        Globals globals = this.globals;
        if (globals != null && !globals.isDestroyed()) {
            String strCopydefault = C7594aml.copydefault(this.globals);
            if (!TextUtils.isEmpty(strCopydefault) && !"universal".equals(strCopydefault)) {
                String strOLrzqt = C43047rhs.AEQbTJ.valueOf(strCopydefault).OLrzqt();
                if (TextUtils.isEmpty(strOLrzqt)) {
                    strOLrzqt = "";
                }
                map.put("miniapp-id", strCopydefault);
                map.put("miniapp-ver", strOLrzqt);
            }
        }
        String str = this.mVerifyToken;
        if (str != null) {
            map.put("OK-VERIFY-TOKEN", str);
        }
        SubdomainStrategy subdomainStrategy = this.mSubdomainStrategy;
        if (subdomainStrategy != null) {
            map.put("Subdomain-Strategy", subdomainStrategy.toString());
        }
        return map;
    }

    @LuaBridge
    public void getOffsite(String str, Map<String, String> map, Map<String, String> map2, final InterfaceC7835arN interfaceC7835arN) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        KWHzl(map2);
        this.disposables.AEQbTJ(this.requestModule.KWHzl(str, map, map2, new InterfaceC7433ajj() { // from class: o.ajm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC7433ajj
            public final void OLrzqt(boolean z, java.lang.Object obj, java.lang.Exception exc) {
                this.AEQbTJ.AEQbTJ(interfaceC7835arN, z, (JsonElement) obj, exc);
            }
        }));
    }

    @LuaBridge
    public void postOffsite(String str, Map<String, String> map, Map<String, String> map2, final InterfaceC7835arN interfaceC7835arN) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        KWHzl(map2);
        this.disposables.AEQbTJ(this.requestModule.OLrzqt(str, map, map2, new InterfaceC7433ajj() { // from class: o.ajn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC7433ajj
            public final void OLrzqt(boolean z, java.lang.Object obj, java.lang.Exception exc) {
                this.OLrzqt.EZpvd(interfaceC7835arN, z, (JsonElement) obj, exc);
            }
        }));
    }

    public final void KWHzl(Map<String, String> map) {
        int i = this.mTimeout;
        if (i > 0) {
            String strValueOf = String.valueOf(i);
            map.put("ConnectTimeout", strValueOf);
            map.put("ReadTimeout", strValueOf);
            map.put("WriteTimeout", strValueOf);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/arN;ZLcom/google/gson/JsonElement;Ljava/lang/Exception;)V */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/arN;ZLcom/google/gson/JsonElement;Ljava/lang/Exception;)V */
    public final void EZpvd(final boolean z, @Nullable final JsonElement jsonElement, @Nullable final Exception exc, final InterfaceC7835arN interfaceC7835arN) {
        Globals globals;
        if (interfaceC7835arN == null || (globals = this.globals) == null || globals.isDestroyed()) {
            return;
        }
        C7840arS.copydefault(new Runnable() { // from class: o.ajl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.OLrzqt.copydefault(z, jsonElement, interfaceC7835arN, exc);
            }
        });
    }

    public final /* synthetic */ void copydefault(boolean z, JsonElement jsonElement, InterfaceC7835arN interfaceC7835arN, Exception exc) {
        String code = MultiTransferSignData.DEFAULT_INTERVAL;
        if (!z) {
            if (exc instanceof UDOffsiteException) {
                code = ((UDOffsiteException) exc).getCode();
            }
            AEQbTJ(code, exc != null ? exc.getMessage() : "", interfaceC7835arN);
        } else {
            if (jsonElement == null) {
                interfaceC7835arN.EZpvd(LuaValue.True(), LuaValue.rString(""));
                return;
            }
            if (jsonElement instanceof JsonArray) {
                interfaceC7835arN.EZpvd(LuaValue.True(), C7869arv.EZpvd(this.globals, (JsonArray) jsonElement));
                return;
            }
            if (jsonElement instanceof JsonObject) {
                interfaceC7835arN.EZpvd(LuaValue.True(), C7869arv.copydefault(this.globals, (JsonObject) jsonElement));
                return;
            }
            try {
                interfaceC7835arN.EZpvd(LuaValue.True(), LuaString.copydefault(jsonElement.getAsString()));
            } catch (Exception e) {
                AEQbTJ(MultiTransferSignData.DEFAULT_INTERVAL, e.getMessage(), interfaceC7835arN);
            }
        }
    }

    public final void AEQbTJ(String str, String str2, InterfaceC7835arN interfaceC7835arN) {
        HashMap map = new HashMap();
        map.put("code", str);
        map.put("msg", str2);
        interfaceC7835arN.EZpvd(LuaValue.False(), LuaValue.Nil(), new UDMap(this.globals, map));
    }
}
