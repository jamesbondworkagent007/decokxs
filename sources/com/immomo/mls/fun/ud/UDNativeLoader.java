package com.immomo.mls.fun.ud;

import android.content.Context;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import o.C7322ahe;
import o.C7840arS;
import o.C7869arv;
import o.InterfaceC60044zuT;
import org.json.JSONObject;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDNativeLoader extends LuaUserdata {
    public static final String LUA_CLASS_NAME = "NativeLoader";
    public static final String[] methods = {TtmlNode.START, "setAsyncCallback", OtpEventTracker.OTP_EVENT_VALUE_CANCEL};
    public LuaFunction asynCallback;
    public Globals globals;
    public StateListAnimator resultCallBack;

    /* JADX INFO: loaded from: classes14.dex */
    public interface Activity {
        void KWHzl(int i, String str);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface Application {
        void copydefault(Object obj);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface StateListAnimator {
        void OLrzqt();

        void copydefault(Application application, Activity activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(StateListAnimator stateListAnimator) {
        this.resultCallBack = stateListAnimator;
    }

    @InterfaceC60044zuT
    public UDNativeLoader(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public UDNativeLoader(@NonNull Globals globals, Object obj) {
        super(globals, (Object) null);
        this.globals = globals;
    }

    public Context AEQbTJ(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] start(LuaValue[] luaValueArr) {
        StateListAnimator stateListAnimator = this.resultCallBack;
        if (stateListAnimator == null) {
            return null;
        }
        stateListAnimator.copydefault(new Application() { // from class: com.immomo.mls.fun.ud.UDNativeLoader.5
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.Application
            public void copydefault(Object obj) {
                if (UDNativeLoader.this.asynCallback != null) {
                    if (obj == null) {
                        UDNativeLoader.this.asynCallback.OLrzqt();
                        return;
                    }
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.isEmpty()) {
                            UDNativeLoader.this.asynCallback.OLrzqt();
                            return;
                        } else {
                            UDNativeLoader.this.asynCallback.invoke(LuaValue.varargsOf(LuaValue.rString(str)), 1);
                            return;
                        }
                    }
                    if (obj instanceof LuaValue) {
                        UDNativeLoader.this.asynCallback.invoke(LuaValue.varargsOf((LuaValue) obj), 1);
                        return;
                    }
                    if (obj instanceof JsonObject) {
                        try {
                            Map<String, Object> mapKWHzl = C7869arv.KWHzl(new JSONObject(KotlinUtils.copydefault.OLrzqt((JsonObject) obj)));
                            if (mapKWHzl.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR) != null) {
                                try {
                                    Map map = (Map) mapKWHzl.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                                    if (map != null && !map.isEmpty()) {
                                        HashMap map2 = new HashMap();
                                        map2.put("code", MultiTransferSignData.DEFAULT_INTERVAL);
                                        map2.put("msg", map.get("message"));
                                        UDNativeLoader.this.asynCallback.invoke(LuaValue.varargsOf(LuaValue.Nil(), new UDMap(UDNativeLoader.this.globals, map2)), 2);
                                    }
                                } catch (Exception unused) {
                                    UDNativeLoader.this.asynCallback.invoke(LuaValue.varargsOf(new UDMap(UDNativeLoader.this.globals, mapKWHzl)), 1);
                                }
                            } else {
                                UDNativeLoader.this.asynCallback.invoke(LuaValue.varargsOf(new UDMap(UDNativeLoader.this.globals, mapKWHzl)), 1);
                            }
                            return;
                        } catch (Exception unused2) {
                            UDNativeLoader.this.asynCallback.OLrzqt();
                            return;
                        }
                    }
                    C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ud.UDNativeLoader.5.5
                        @Override // java.lang.Runnable
                        public void run() {
                            UDNativeLoader uDNativeLoader = UDNativeLoader.this;
                            Toast.makeText(uDNativeLoader.AEQbTJ(uDNativeLoader.globals), "Not supported in current version", 0).show();
                        }
                    });
                }
            }
        }, new Activity() { // from class: com.immomo.mls.fun.ud.UDNativeLoader.4
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.Activity
            public void KWHzl(int i, String str) {
                if (UDNativeLoader.this.asynCallback != null) {
                    HashMap map = new HashMap();
                    map.put("code", String.valueOf(i));
                    map.put("msg", str);
                    UDNativeLoader.this.asynCallback.invoke(LuaValue.varargsOf(LuaValue.Nil(), new UDMap(UDNativeLoader.this.globals, map)), 2);
                }
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] cancel(LuaValue[] luaValueArr) {
        StateListAnimator stateListAnimator = this.resultCallBack;
        if (stateListAnimator == null) {
            return null;
        }
        stateListAnimator.OLrzqt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setAsyncCallback(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        LuaFunction luaFunction = this.asynCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (!luaValueArr[0].isFunction()) {
            return null;
        }
        this.asynCallback = luaValueArr[0].toLuaFunction();
        return null;
    }
}
