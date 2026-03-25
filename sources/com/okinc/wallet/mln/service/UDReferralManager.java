package com.okinc.wallet.mln.service;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean;
import com.okinc.business.defi.biz.net.bean.DeviceRefCodeCacheBean;
import com.okinc.business.defi.biz.net.bean.InviteeInfoItemResponse;
import com.okinc.business.defi.biz.net.bean.PreferRefCodeCacheBean;
import com.okinc.business.defi.biz.net.bean.UnBindBackendReferralCodeCacheBean;
import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.wallet.mln.service.UDReferralManager;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;
import o.C12827cuN;
import o.C33490mxT;
import o.C43248rlh;
import o.C7869arv;
import o.pUU;
import o.xWP;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@LuaClass
public class UDReferralManager {
    public Globals copydefault;

    public UDReferralManager(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.copydefault = globals;
    }

    @LuaBridge
    public LuaValue[] isWalletSupportBindReferral(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            pUU.copydefault("DexReferral", "isWalletSupportBindReferral: Invalid parameters");
            return LuaValue.rFalse();
        }
        String javaString = luaValueArr[0].toJavaString();
        if (javaString == null || javaString.isEmpty()) {
            pUU.copydefault("DexReferral", "isWalletSupportBindReferral: accountId is null or empty");
            return LuaValue.rFalse();
        }
        try {
            return LuaValue.rBoolean(((xWP) C43248rlh.KWHzl.AEQbTJ(xWP.class)).KWHzl(javaString));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "isWalletSupportBindReferral failed", e);
            return LuaValue.rFalse();
        }
    }

    @LuaBridge
    public LuaValue[] isWalletSupportCreateReferral(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            pUU.copydefault("DexReferral", "isWalletSupportCreateReferral: Invalid parameters");
            return LuaValue.rFalse();
        }
        String javaString = luaValueArr[0].toJavaString();
        if (javaString == null || javaString.isEmpty()) {
            pUU.copydefault("DexReferral", "isWalletSupportCreateReferral: accountId is null or empty");
            return LuaValue.rFalse();
        }
        try {
            return LuaValue.rBoolean(ReferralManager.copydefault().isConnected(javaString));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "isWalletSupportCreateReferral failed", e);
            return LuaValue.rFalse();
        }
    }

    @LuaBridge
    public LuaValue supportCreateReferralChainList(LuaValue[] luaValueArr) {
        try {
            return C7869arv.KWHzl(this.copydefault, new JSONArray((Collection) ReferralManager.copydefault().uzCIH()));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "supportCreateReferralChainList failed", e);
            return C7869arv.KWHzl(this.copydefault, new JSONArray((Collection) new ArrayList()));
        }
    }

    @LuaBridge
    public LuaValue supportCreateReferralWalletTypeList(LuaValue[] luaValueArr) {
        try {
            return C7869arv.KWHzl(this.copydefault, new JSONArray((Collection) ReferralManager.copydefault().getFieldNames()));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "supportCreateReferralWalletTypeList failed", e);
            return C7869arv.KWHzl(this.copydefault, new JSONArray((Collection) new ArrayList()));
        }
    }

    @LuaBridge
    public LuaValue[] isCreateReferralNeedsBackup(LuaValue[] luaValueArr) {
        try {
            return LuaValue.rBoolean(ReferralManager.copydefault().ejfBZ());
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "isCreateReferralNeedsBackup failed", e);
            return LuaValue.rFalse();
        }
    }

    @LuaBridge
    public LuaValue supportBindReferralChainList(LuaValue[] luaValueArr) {
        try {
            return C7869arv.KWHzl(this.copydefault, new JSONArray((Collection) ReferralManager.copydefault().getNewProxyInstance()));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "supportBindReferralChainList failed", e);
            return C7869arv.KWHzl(this.copydefault, new JSONArray((Collection) new ArrayList()));
        }
    }

    @LuaBridge
    public LuaValue supportBindReferralWalletTypeList(LuaValue[] luaValueArr) {
        try {
            return C7869arv.KWHzl(this.copydefault, new JSONArray((Collection) ReferralManager.copydefault().hDKMBd()));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "supportBindReferralWalletTypeList failed", e);
            return C7869arv.KWHzl(this.copydefault, new JSONArray((Collection) new ArrayList()));
        }
    }

    @LuaBridge
    public LuaValue[] isBindReferralNeedsBackup(LuaValue[] luaValueArr) {
        try {
            return LuaValue.rBoolean(ReferralManager.copydefault().fARcdN());
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "isBindReferralNeedsBackup failed", e);
            return LuaValue.rFalse();
        }
    }

    @LuaBridge
    public LuaValue[] getReferralInfo(LuaValue[] luaValueArr) {
        String javaString;
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length >= 1) {
                    String javaString2 = luaValueArr[0].toJavaString();
                    if (javaString2 != null && !javaString2.isEmpty()) {
                        if (luaValueArr.length == 1) {
                            javaString = ReferralManager.copydefault().djBIcL(javaString2);
                        } else {
                            javaString = luaValueArr[1].toJavaString();
                        }
                        if (javaString == null) {
                            pUU.copydefault("DexReferral", "getReferralInfo: chainId is null");
                            return LuaValue.rNil();
                        }
                        ReferralInfoBean referralInfoBeanGEmmrt = ReferralManager.copydefault().gEmmrt(javaString2);
                        if (referralInfoBeanGEmmrt != null) {
                            try {
                                return LuaValue.varargsOf(C7869arv.KWHzl(this.copydefault, new JSONObject(referralInfoBeanGEmmrt.toJson())));
                            } catch (Exception e) {
                                pUU.AEQbTJ("DexReferral", "UDRerferralManager, Fail getReferralInfo", e);
                                return LuaValue.rNil();
                            }
                        }
                        return LuaValue.rNil();
                    }
                    pUU.copydefault("DexReferral", "getReferralInfo: accountId is null or empty");
                    return LuaValue.rNil();
                }
            } catch (Exception e2) {
                pUU.AEQbTJ("DexReferral", "getReferralInfo failed", e2);
                return LuaValue.rNil();
            }
        }
        pUU.copydefault("DexReferral", "getReferralInfo: Invalid parameters");
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] getReferralDeviceCodeInfo(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length >= 1) {
                    String javaString = luaValueArr[0].toJavaString();
                    if (javaString != null && !javaString.isEmpty()) {
                        DeviceRefCodeCacheBean deviceRefCodeCacheBeanCopydefault = ReferralManager.copydefault().copydefault(C12827cuN.AYXKKw().OLrzqt(javaString));
                        if (deviceRefCodeCacheBeanCopydefault != null) {
                            try {
                                String json = deviceRefCodeCacheBeanCopydefault.toJson();
                                JSONObject jSONObject = new JSONObject(json);
                                pUU.KWHzl("DexReferral", "getReferralDeviceCodeInfo: jsonString" + json);
                                return LuaValue.varargsOf(C7869arv.KWHzl(this.copydefault, jSONObject));
                            } catch (Exception e) {
                                pUU.AEQbTJ("DexReferral", "getReferralDeviceCodeInfo, Fail getReferralDeviceCodeInfo", e);
                                return LuaValue.rNil();
                            }
                        }
                        return LuaValue.rNil();
                    }
                    pUU.copydefault("DexReferral", "getReferralDeviceCodeInfo: accountId is null or empty");
                    return LuaValue.rNil();
                }
            } catch (Exception e2) {
                pUU.AEQbTJ("DexReferral", "getReferralDeviceCodeInfo failed", e2);
                return LuaValue.rNil();
            }
        }
        pUU.copydefault("DexReferral", "getReferralDeviceCodeInfo: Invalid parameters");
        return LuaValue.rNil();
    }

    @LuaBridge
    public void updateReferralDeviceCodeInfo(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length >= 1) {
                    String javaString = luaValueArr[0].toJavaString();
                    if (javaString != null && !javaString.isEmpty()) {
                        pUU.KWHzl("DexReferral", "updateReferralDeviceCodeInfo: deviceCodeInfoString:" + javaString);
                        ReferralManager.copydefault().fJNWhG(javaString);
                        return;
                    }
                    pUU.copydefault("DexReferral", "updateReferralDeviceCodeInfo: deviceCodeInfoString is null or empty");
                    return;
                }
            } catch (Exception e) {
                pUU.AEQbTJ("DexReferral", "getReferralDeviceCodeInfo failed", e);
                return;
            }
        }
        pUU.copydefault("DexReferral", "updateReferralDeviceCodeInfo: Invalid parameters");
    }

    @LuaBridge
    public void removeReferralDeviceCodeInfo(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 2) {
            pUU.copydefault("DexReferral", "removeReferralDeviceCodeInfo: Invalid parameters");
            return;
        }
        String javaString = luaValueArr[0].toJavaString();
        LuaFunction luaFunction = luaValueArr[1].toLuaFunction();
        if (javaString == null || javaString.isEmpty()) {
            pUU.copydefault("DexReferral", "removeReferralDeviceCodeInfo: deviceCode is null or empty");
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
                return;
            }
            return;
        }
        try {
            pUU.KWHzl("DexReferral", "removeReferralDeviceCodeInfo: deviceCode:" + javaString);
            ReferralManager.copydefault().AYXKKw(javaString, new AnonymousClass4(luaFunction));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "removeReferralDeviceCodeInfo: Parameter parsing failed", e);
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDReferralManager$4, reason: invalid class name */
    public class AnonymousClass4 implements Continuation<Boolean> {
        public final /* synthetic */ LuaFunction AEQbTJ;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass4(LuaFunction luaFunction) {
            this.AEQbTJ = luaFunction;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return Dispatchers.getIO();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object obj) {
            if (obj instanceof Boolean) {
                final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Handler handler = new Handler(Looper.getMainLooper());
                final LuaFunction luaFunction = this.AEQbTJ;
                handler.post(new Runnable() { // from class: o.ydy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        UDReferralManager.AnonymousClass4.EZpvd(luaFunction, zBooleanValue);
                    }
                });
                return;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            final LuaFunction luaFunction2 = this.AEQbTJ;
            handler2.post(new Runnable() { // from class: o.ydz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    UDReferralManager.AnonymousClass4.AEQbTJ(luaFunction2);
                }
            });
        }

        public static /* synthetic */ void EZpvd(LuaFunction luaFunction, boolean z) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(z)));
            }
        }

        public static /* synthetic */ void AEQbTJ(LuaFunction luaFunction) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0002 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.luaj.vm2.LuaValue[]] */
    @LuaBridge
    public LuaValue[] getPreferReferralCode(LuaValue[] luaValueArr) {
        String strRString = "DexReferral";
        try {
            PreferRefCodeCacheBean preferRefCodeCacheBeanIsConnected = ReferralManager.copydefault().isConnected();
            if (preferRefCodeCacheBeanIsConnected != null) {
                try {
                    strRString = LuaValue.rString(preferRefCodeCacheBeanIsConnected.getCode());
                    return strRString;
                } catch (Exception e) {
                    pUU.AEQbTJ("DexReferral", "getPreferReferralCode, Fail getPreferReferralInfo", e);
                    return LuaValue.rNil();
                }
            }
            return LuaValue.rNil();
        } catch (Exception e2) {
            pUU.AEQbTJ(strRString, "getPreferReferralCode failed", e2);
            return LuaValue.rNil();
        }
    }

    @LuaBridge
    public LuaValue[] getUnbindReferralCode(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length >= 1) {
                    String javaString = luaValueArr[0].toJavaString();
                    if (javaString != null && !javaString.isEmpty()) {
                        UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBeanValueOf = ReferralManager.copydefault().valueOf(javaString);
                        if (unBindBackendReferralCodeCacheBeanValueOf != null) {
                            try {
                                return LuaValue.rString(unBindBackendReferralCodeCacheBeanValueOf.getCode());
                            } catch (Exception e) {
                                pUU.AEQbTJ("DexReferral", "getUnbindReferralCode, Fail getPreferReferralInfo", e);
                                return LuaValue.rNil();
                            }
                        }
                        return LuaValue.rNil();
                    }
                    pUU.copydefault("DexReferral", "getUnbindReferralCode: accountId is null or empty");
                    return LuaValue.rNil();
                }
            } catch (Exception e2) {
                pUU.AEQbTJ("DexReferral", "getUnbindReferralCode failed", e2);
                return LuaValue.rNil();
            }
        }
        pUU.copydefault("DexReferral", "getUnbindReferralCode: Invalid parameters");
        return LuaValue.rNil();
    }

    @LuaBridge
    public void saveReferralInfo(LuaValue[] luaValueArr) throws Throwable {
        if (luaValueArr == null || luaValueArr.length < 6) {
            pUU.copydefault("DexReferral", "saveReferralInfo: Invalid parameters");
            return;
        }
        String javaString = luaValueArr[0].toJavaString();
        String javaString2 = luaValueArr[1].toJavaString();
        String javaString3 = luaValueArr[2].toJavaString();
        int i = luaValueArr[3].toInt();
        boolean z = luaValueArr[4].toBoolean();
        LuaFunction luaFunction = luaValueArr[5].toLuaFunction();
        if (javaString == null || javaString.isEmpty()) {
            pUU.copydefault("DexReferral", "saveReferralInfo: accountId is null or empty");
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
                return;
            }
            return;
        }
        if (javaString2 == null || javaString2.isEmpty()) {
            pUU.copydefault("DexReferral", "saveReferralInfo: code is null or empty");
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
                return;
            }
            return;
        }
        try {
            ReferralManager.copydefault().KWHzl(javaString, javaString2, javaString3, i, z, new AnonymousClass2(luaFunction));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "saveReferralInfo: Parameter parsing failed", e);
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDReferralManager$2, reason: invalid class name */
    public class AnonymousClass2 implements Continuation<Boolean> {
        public final /* synthetic */ LuaFunction copydefault;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass2(LuaFunction luaFunction) {
            this.copydefault = luaFunction;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return Dispatchers.getIO();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object obj) {
            if (obj instanceof Boolean) {
                final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Handler handler = new Handler(Looper.getMainLooper());
                final LuaFunction luaFunction = this.copydefault;
                handler.post(new Runnable() { // from class: o.ydw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        UDReferralManager.AnonymousClass2.AEQbTJ(luaFunction, zBooleanValue);
                    }
                });
                return;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            final LuaFunction luaFunction2 = this.copydefault;
            handler2.post(new Runnable() { // from class: o.ydA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    UDReferralManager.AnonymousClass2.EZpvd(luaFunction2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void AEQbTJ(LuaFunction luaFunction, boolean z) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(z)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void EZpvd(LuaFunction luaFunction) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
            }
        }
    }

    @LuaBridge
    public void unFreezeReferralInfo(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 2) {
            pUU.copydefault("DexReferral", "deleteReferralInfo: Invalid parameters");
            return;
        }
        String javaString = luaValueArr[0].toJavaString();
        LuaFunction luaFunction = luaValueArr[1].toLuaFunction();
        if (javaString == null || javaString.isEmpty()) {
            pUU.copydefault("DexReferral", "unFreezeReferralInfo: accountId is null or empty");
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
                return;
            }
            return;
        }
        try {
            ((xWP) C43248rlh.KWHzl.AEQbTJ(xWP.class)).KWHzl(javaString, new AnonymousClass5(luaFunction));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "unFreezeReferralInfo: Parameter parsing failed", e);
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDReferralManager$5, reason: invalid class name */
    public class AnonymousClass5 implements Continuation<Boolean> {
        public final /* synthetic */ LuaFunction OLrzqt;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass5(LuaFunction luaFunction) {
            this.OLrzqt = luaFunction;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return Dispatchers.getIO();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object obj) {
            if (obj instanceof Boolean) {
                final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Handler handler = new Handler(Looper.getMainLooper());
                final LuaFunction luaFunction = this.OLrzqt;
                handler.post(new Runnable() { // from class: o.ydB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        UDReferralManager.AnonymousClass5.OLrzqt(luaFunction, zBooleanValue);
                    }
                });
                return;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            final LuaFunction luaFunction2 = this.OLrzqt;
            handler2.post(new Runnable() { // from class: o.ydC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    UDReferralManager.AnonymousClass5.OLrzqt(luaFunction2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void OLrzqt(LuaFunction luaFunction, boolean z) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(z)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void OLrzqt(LuaFunction luaFunction) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
            }
        }
    }

    @LuaBridge
    public void deleteReferralInfo(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 2) {
            pUU.copydefault("DexReferral", "deleteReferralInfo: Invalid parameters");
            return;
        }
        String javaString = luaValueArr[0].toJavaString();
        LuaFunction luaFunction = luaValueArr[1].toLuaFunction();
        if (javaString == null || javaString.isEmpty()) {
            pUU.copydefault("DexReferral", "deleteReferralInfo: accountId is null or empty");
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
                return;
            }
            return;
        }
        try {
            ((xWP) C43248rlh.KWHzl.AEQbTJ(xWP.class)).copydefault(javaString, new AnonymousClass1(luaFunction));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "deleteReferralInfo: Parameter parsing failed", e);
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDReferralManager$1, reason: invalid class name */
    public class AnonymousClass1 implements Continuation<Boolean> {
        public final /* synthetic */ LuaFunction AEQbTJ;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass1(LuaFunction luaFunction) {
            this.AEQbTJ = luaFunction;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return Dispatchers.getIO();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object obj) {
            if (obj instanceof Boolean) {
                final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Handler handler = new Handler(Looper.getMainLooper());
                final LuaFunction luaFunction = this.AEQbTJ;
                handler.post(new Runnable() { // from class: o.ydD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        UDReferralManager.AnonymousClass1.EZpvd(luaFunction, zBooleanValue);
                    }
                });
                return;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            final LuaFunction luaFunction2 = this.AEQbTJ;
            handler2.post(new Runnable() { // from class: o.ydE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    UDReferralManager.AnonymousClass1.EZpvd(luaFunction2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void EZpvd(LuaFunction luaFunction, boolean z) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(z)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void EZpvd(LuaFunction luaFunction) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
            }
        }
    }

    @LuaBridge
    public void disablePreferReferralCode(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            pUU.copydefault("DexReferral", "disablePreferReferralCode: Invalid parameters");
            return;
        }
        String javaString = luaValueArr[0].toJavaString();
        LuaFunction luaFunction = luaValueArr.length > 1 ? luaValueArr[1].toLuaFunction() : null;
        if (javaString == null || javaString.isEmpty()) {
            pUU.copydefault("DexReferral", "disablePreferReferralCode: code is null or empty");
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
                return;
            }
            return;
        }
        try {
            ((xWP) C43248rlh.KWHzl.AEQbTJ(xWP.class)).OLrzqt(javaString, new AnonymousClass3(luaFunction));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "disablePreferReferralCode: Parameter parsing failed", e);
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDReferralManager$3, reason: invalid class name */
    public class AnonymousClass3 implements Continuation<Boolean> {
        public final /* synthetic */ LuaFunction EZpvd;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass3(LuaFunction luaFunction) {
            this.EZpvd = luaFunction;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return Dispatchers.getIO();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object obj) {
            if (obj instanceof Boolean) {
                final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Handler handler = new Handler(Looper.getMainLooper());
                final LuaFunction luaFunction = this.EZpvd;
                handler.post(new Runnable() { // from class: o.ydG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        UDReferralManager.AnonymousClass3.OLrzqt(luaFunction, zBooleanValue);
                    }
                });
                return;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            final LuaFunction luaFunction2 = this.EZpvd;
            handler2.post(new Runnable() { // from class: o.ydJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    UDReferralManager.AnonymousClass3.copydefault(luaFunction2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void OLrzqt(LuaFunction luaFunction, boolean z) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(z)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void copydefault(LuaFunction luaFunction) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(false)));
            }
        }
    }

    @LuaBridge
    public void checkSelfBind(LuaValue[] luaValueArr) throws Throwable {
        if (luaValueArr == null || luaValueArr.length < 1) {
            pUU.copydefault("DexReferral", "checkSelfBind: Invalid parameters");
            return;
        }
        String javaString = luaValueArr[0].toJavaString();
        LuaFunction luaFunction = luaValueArr[1].toLuaFunction();
        if (javaString == null || javaString.isEmpty()) {
            pUU.copydefault("DexReferral", "checkSelfBind: refCode is null or empty");
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(-1)));
                return;
            }
            return;
        }
        try {
            ReferralManager.copydefault().AEQbTJ(javaString, new AnonymousClass9(luaFunction));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkSelfBind: Parameter parsing failed", e);
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(-1)));
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDReferralManager$9, reason: invalid class name */
    public class AnonymousClass9 implements Continuation<Integer> {
        public final /* synthetic */ LuaFunction copydefault;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass9(LuaFunction luaFunction) {
            this.copydefault = luaFunction;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return Dispatchers.getIO();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object obj) {
            if (obj instanceof Integer) {
                final int iIntValue = ((Integer) obj).intValue();
                Handler handler = new Handler(Looper.getMainLooper());
                final LuaFunction luaFunction = this.copydefault;
                handler.post(new Runnable() { // from class: o.ydF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        UDReferralManager.AnonymousClass9.OLrzqt(luaFunction, iIntValue);
                    }
                });
                return;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            final LuaFunction luaFunction2 = this.copydefault;
            handler2.post(new Runnable() { // from class: o.ydH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    UDReferralManager.AnonymousClass9.EZpvd(luaFunction2);
                }
            });
        }

        public static /* synthetic */ void OLrzqt(LuaFunction luaFunction, int i) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void EZpvd(LuaFunction luaFunction) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(-1)));
            }
        }
    }

    @LuaBridge
    public void checkSelfBindWithAccountId(LuaValue[] luaValueArr) throws Throwable {
        if (luaValueArr == null || luaValueArr.length < 1) {
            pUU.copydefault("DexReferral", "checkSelfBindWithAccountId: Invalid parameters");
            return;
        }
        String javaString = luaValueArr[0].toJavaString();
        String javaString2 = luaValueArr[1].toJavaString();
        LuaFunction luaFunction = luaValueArr[2].toLuaFunction();
        if (javaString == null || javaString.isEmpty()) {
            pUU.copydefault("DexReferral", "checkSelfBindWithAccountId: refCode is null or empty");
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(-1)));
                return;
            }
            return;
        }
        if (javaString2 == null || javaString2.isEmpty()) {
            pUU.copydefault("DexReferral", "checkSelfBindWithAccountId: accountId is null or empty");
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(-1)));
                return;
            }
            return;
        }
        try {
            ReferralManager.copydefault().OLrzqt(javaString, javaString2, new AnonymousClass8(luaFunction));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkSelfBindWithAccountId: Parameter parsing failed", e);
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(-1)));
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDReferralManager$8, reason: invalid class name */
    public class AnonymousClass8 implements Continuation<Integer> {
        public final /* synthetic */ LuaFunction AEQbTJ;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass8(LuaFunction luaFunction) {
            this.AEQbTJ = luaFunction;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return Dispatchers.getIO();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object obj) {
            if (obj instanceof Integer) {
                final int iIntValue = ((Integer) obj).intValue();
                Handler handler = new Handler(Looper.getMainLooper());
                final LuaFunction luaFunction = this.AEQbTJ;
                handler.post(new Runnable() { // from class: o.ydI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        UDReferralManager.AnonymousClass8.copydefault(luaFunction, iIntValue);
                    }
                });
                return;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            final LuaFunction luaFunction2 = this.AEQbTJ;
            handler2.post(new Runnable() { // from class: o.ydM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    UDReferralManager.AnonymousClass8.OLrzqt(luaFunction2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void copydefault(LuaFunction luaFunction, int i) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void OLrzqt(LuaFunction luaFunction) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(-1)));
            }
        }
    }

    @LuaBridge
    public void updateUnbindCodeInfo(LuaValue[] luaValueArr) throws Throwable {
        if (luaValueArr == null || luaValueArr.length < 2) {
            pUU.copydefault("DexReferral", "updateUnbindCodeInfo: Invalid parameters");
            return;
        }
        try {
            String javaString = luaValueArr[0].toJavaString();
            String javaString2 = luaValueArr[1].toJavaString();
            ReferralManager.copydefault().OLrzqt(C12827cuN.AYXKKw().OLrzqt(javaString), (InviteeInfoItemResponse) C33490mxT.EZpvd(javaString2, InviteeInfoItemResponse.class), new Continuation<Unit>() { // from class: com.okinc.wallet.mln.service.UDReferralManager.7
                @Override // kotlin.coroutines.Continuation
                public CoroutineContext getContext() {
                    return Dispatchers.getIO();
                }

                @Override // kotlin.coroutines.Continuation
                public void resumeWith(@NotNull Object obj) {
                    pUU.KWHzl("DexReferral", "updateUnbindCodeInfo completed successfully， result=" + obj);
                }
            });
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "updateUnbindCodeInfo: Parameter parsing failed", e);
        }
    }

    @LuaBridge
    public LuaValue[] getReferralCodeMessage(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length >= 2) {
                    return LuaValue.rString(ReferralManager.copydefault().OLrzqt(luaValueArr[0].toJavaString(), luaValueArr[1].toJavaString()));
                }
            } catch (Exception e) {
                pUU.AEQbTJ("DexReferral", "getPreferReferralInfo failed", e);
                return LuaValue.rNil();
            }
        }
        pUU.copydefault("DexReferral", "getReferralCodeMessage: Invalid parameters");
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] verifySignature(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 5) {
            pUU.copydefault("DexReferral", "verifySignature: Invalid parameters");
            return LuaValue.rNil();
        }
        try {
            String javaString = luaValueArr[0].toJavaString();
            String javaString2 = luaValueArr[1].toJavaString();
            String javaString3 = luaValueArr[2].toJavaString();
            String javaString4 = luaValueArr[3].toJavaString();
            return LuaValue.rBoolean(ReferralManager.copydefault().AEQbTJ(javaString, javaString2, javaString3, luaValueArr[4].toJavaString(), javaString4));
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "mln verifySignature failed", e);
            return LuaValue.rNil();
        }
    }

    @LuaBridge
    public void triggerRetryReportReferralInfo(LuaValue[] luaValueArr) {
        try {
            ((xWP) C43248rlh.KWHzl.AEQbTJ(xWP.class)).EZpvd();
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "mln triggerRetryReportReferralInfo failed", e);
        }
    }

    @LuaBridge
    public void updateReferralShareCodeCache(LuaValue[] luaValueArr) {
        ((xWP) C43248rlh.KWHzl.AEQbTJ(xWP.class)).AEQbTJ();
    }

    @LuaBridge
    public void showDexRefAppliedRemindVC(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 6) {
            pUU.copydefault("DexReferral", "showDexRefAppliedRemindVC: Invalid parameters");
            return;
        }
        try {
            ReferralManager.copydefault().copydefault(null, luaValueArr[0].toJavaString(), luaValueArr[1].toJavaString(), luaValueArr[2].toJavaString(), luaValueArr[3].toJavaString(), luaValueArr[4].toJavaString(), luaValueArr[5].toJavaString());
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "mln showDexRefAppliedRemindVC failed", e);
        }
    }

    @LuaBridge
    public void showDexRefAppliedRemindSecondVC(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 6) {
            pUU.copydefault("DexReferral", "showDexRefAppliedRemindSecondVC: Invalid parameters");
            return;
        }
        try {
            ReferralManager.copydefault().KWHzl((Context) null, luaValueArr[0].toJavaString(), luaValueArr[1].toJavaString(), luaValueArr[2].toJavaString(), luaValueArr[3].toJavaString(), luaValueArr[4].toJavaString(), luaValueArr[5].toJavaString());
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "mln showDexRefAppliedRemindSecondVC failed", e);
        }
    }
}
