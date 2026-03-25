package com.okinc.okrisk;

import android.app.Application;
import android.content.Context;
import android.util.Base64;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okrisk.OKRiskPayloadManager;
import com.okinc.okrisk.collection.OKRiskDataFetcher;
import com.okinc.okrisk.service.CommonBody;
import com.okinc.okrisk.service.DeviceProfileRemoteConfig;
import com.okinc.okrisk.service.DidResponse;
import com.okinc.okrisk.service.GccResponseData;
import com.okinc.okrisk.signals.p0.SyncSignal;
import com.okinc.okuser.data.User;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43419rot;
import o.C32979mnm;
import o.C33482mxL;
import o.C43401rob;
import o.C43422row;
import o.C46966thD;
import o.C46983thU;
import o.C46988thZ;
import o.C46997thi;
import o.C47005thq;
import o.C47021tiF;
import o.C47136tkO;
import o.C47212tll;
import o.C48787ucK;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.C58113yvE;
import o.C6774aVi;
import o.InterfaceC46969thG;
import o.InterfaceC46999thk;
import o.InterfaceC47019tiD;
import o.InterfaceC47027tiL;
import o.InterfaceC47028tiM;
import o.InterfaceC47230tmC;
import o.pUU;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskPayloadManager {
    public static boolean AYXKKw;
    public static int AkhnZx;
    public static volatile boolean DbNXlk;
    public static final int KWHzl;
    public static boolean djBIcL;
    public static Integer ejfBZ;
    public static volatile boolean fIwbmz;
    public static final AtomicBoolean fJNWhG;
    public static final AtomicBoolean fetchVPNInfo;
    public static volatile Boolean gEmmrt;
    public static InterfaceC47019tiD isConnected;
    public static String valueOf;
    public static InterfaceC46999thk values;
    public static final OKRiskPayloadManager copydefault = new OKRiskPayloadManager();
    public static final boolean EZpvd = true;
    public static final boolean OLrzqt = true;
    public static final AtomicReference<C46983thU> AuCTel = new AtomicReference<>(new C46983thU(0, null, 0 == true ? 1 : 0, 7, null));
    public static final AtomicReference<C46997thi> AhwBna = new AtomicReference<>(new C46997thi(0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    public static final Object AEQbTJ = new Object();

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Action.values().length];
            try {
                iArr[Action.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Action.INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Action.EVENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[OKRiskLibrarySource.values().length];
            try {
                iArr2[OKRiskLibrarySource.APP_LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OKRiskLibrarySource.APP_INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final String AYXKKw() {
        return "RSD invoke failed or ignored (code != 0)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final String AkhnZx() {
        return "executeGccInvokeWithDecryption - Failed to decrypt and save config";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final String values() {
        return "executeGccInvokeWithDecryption - Config decrypted and available for sensor collection";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return valueOf;
    }

    public final native boolean checkShallPullJNI();

    public final native String collectFilterAndProcessJNI(@NotNull Context context, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, int i2, byte[] bArr, int i3);

    public final native boolean decryptConfigJNI(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC47019tiD ejfBZ() {
        return isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AtomicReference<C46983thU> fARcdN() {
        return AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AtomicReference<C46997thi> fIwbmz() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC46999thk fJNWhG() {
        return values;
    }

    public final native String gccByteNative(@NotNull Context context, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, int i2, byte[] bArr);

    public final native String getConfigValueJNI(@NotNull Context context, @NotNull String str, @NotNull String str2);

    public final native String getConfigValueRsdJNI(@NotNull Context context, @NotNull String str, @NotNull String str2);

    public final native void markTargetAppInfoApiSuccessNative();

    public final native String processBiometricDataJNI(@NotNull Context context, @NotNull String str, String str2, String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, int i2, byte[] bArr);

    public final native String produceSecJNI(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, byte[] bArr, int i2);

    public final native String uploadDataMessageMetricsNative(@NotNull Context context, String str, String str2, String str3, @NotNull String str4, String str5, int i, byte[] bArr, int i2, int i3, byte[] bArr2, byte[] bArr3, int i4);

    public final native String uploadDataMessageNative(@NotNull Context context, String str, String str2, String str3, @NotNull String str4, String str5, int i, byte[] bArr, int i2, int i3, byte[] bArr2);

    private OKRiskPayloadManager() {
    }

    public final void copydefault(@NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        pUU.KWHzl("OKRiskPayloadManager", function0.invoke());
        if (EZpvd) {
            function0.invoke();
        }
    }

    public final void EZpvd(Function0<String> function0) {
        pUU.valueOf("OKRiskPayloadManager", function0.invoke());
        if (EZpvd) {
            function0.invoke();
        }
    }

    public static /* synthetic */ void debugLogE$default(OKRiskPayloadManager oKRiskPayloadManager, Function0 function0, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        oKRiskPayloadManager.copydefault(function0, th);
    }

    public final void copydefault(Function0<String> function0, Throwable th) {
        pUU.AEQbTJ("OKRiskPayloadManager", function0.invoke(), th);
        if (EZpvd) {
            function0.invoke();
        }
    }

    public final void KWHzl(@NotNull InterfaceC46969thG interfaceC46969thG) {
        Intrinsics.checkNotNullParameter(interfaceC46969thG, "");
        values = interfaceC46969thG.OLrzqt();
    }

    static {
        Object obj = C47212tll.Companion.OLrzqt().get("sv");
        Intrinsics.copydefault(obj, "");
        valueOf = (String) obj;
        isConnected = new C47021tiF();
        DeviceProfileRemoteConfig deviceProfileRemoteConfig = (DeviceProfileRemoteConfig) C48787ucK.AEQbTJ.EZpvd("fingerprintConfig", DeviceProfileRemoteConfig.class);
        Integer numValueOf = deviceProfileRemoteConfig != null ? Integer.valueOf(deviceProfileRemoteConfig.getRetryCount()) : null;
        ejfBZ = numValueOf;
        AkhnZx = C56548yJl.valueOf(numValueOf != null ? numValueOf.intValue() : 5, 30);
        fJNWhG = new AtomicBoolean(false);
        fetchVPNInfo = new AtomicBoolean(false);
        KWHzl = 8;
    }

    public final boolean AuCTelauCTel() {
        return fJNWhG.get();
    }

    public final void DbNXlk() {
        fJNWhG.set(false);
    }

    public final boolean fetchVPNInfo() {
        return fJNWhG.compareAndSet(true, false);
    }

    public final boolean getNewProxyInstance() {
        return fetchVPNInfo.get();
    }

    public final boolean getFieldNames() {
        try {
            return isConnected.KWHzl();
        } catch (Exception e) {
            pUU.valueOf("OKRiskPayloadManager", "Failed to check dynamic config status: " + e.getMessage());
            return false;
        }
    }

    public final boolean AubY() {
        try {
            return isConnected.AhwBna();
        } catch (Exception e) {
            pUU.valueOf("OKRiskPayloadManager", "Failed to check sampling status: " + e.getMessage());
            return false;
        }
    }

    public final boolean uzCIH() {
        try {
            return isConnected.OLrzqt();
        } catch (Exception e) {
            pUU.valueOf("OKRiskPayloadManager", "Failed to check app report status: " + e.getMessage());
            return false;
        }
    }

    public final boolean zLjUOn() {
        boolean zGEmmrt;
        Boolean bool = gEmmrt;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            zGEmmrt = isConnected.gEmmrt();
        } catch (Exception e) {
            pUU.valueOf("OKRiskPayloadManager", "Failed to check icon collection status: " + e.getMessage());
            zGEmmrt = false;
        }
        gEmmrt = Boolean.valueOf(zGEmmrt);
        return zGEmmrt;
    }

    public final boolean iwGUEr() {
        try {
            return isConnected.EZpvd();
        } catch (Exception e) {
            pUU.valueOf("OKRiskPayloadManager", "Failed to check file upload status: " + e.getMessage());
            return false;
        }
    }

    public final boolean wlaJM() {
        try {
            return isConnected.AYXKKw();
        } catch (Exception e) {
            pUU.valueOf("OKRiskPayloadManager", "Failed to check secToken status: " + e.getMessage());
            return false;
        }
    }

    public final boolean hDKMBd() {
        try {
            return isConnected.djBIcL();
        } catch (Exception e) {
            pUU.valueOf("OKRiskPayloadManager", "Failed to check file upload status: " + e.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull Action action, @NotNull String str, String str2, String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        OKRiskPayloadManager$dispatchBiometric$1 oKRiskPayloadManager$dispatchBiometric$1;
        String strKWHzl;
        OKRiskPayloadManager oKRiskPayloadManager;
        if (continuation instanceof OKRiskPayloadManager$dispatchBiometric$1) {
            oKRiskPayloadManager$dispatchBiometric$1 = (OKRiskPayloadManager$dispatchBiometric$1) continuation;
            int i2 = oKRiskPayloadManager$dispatchBiometric$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oKRiskPayloadManager$dispatchBiometric$1.label = i2 - Integer.MIN_VALUE;
            } else {
                oKRiskPayloadManager$dispatchBiometric$1 = new OKRiskPayloadManager$dispatchBiometric$1(this, continuation);
            }
        }
        OKRiskPayloadManager$dispatchBiometric$1 oKRiskPayloadManager$dispatchBiometric$12 = oKRiskPayloadManager$dispatchBiometric$1;
        Object objRsdInvoke$default = oKRiskPayloadManager$dispatchBiometric$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = oKRiskPayloadManager$dispatchBiometric$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objRsdInvoke$default);
            isConnected();
            Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            C46983thU c46983thU = AuCTel.get();
            int iEZpvd = c46983thU.EZpvd();
            String strKWHzl2 = c46983thU.KWHzl();
            byte[] bArrAEQbTJ = c46983thU.AEQbTJ();
            String strValueOf = String.valueOf(System.currentTimeMillis());
            InterfaceC46999thk interfaceC46999thk = values;
            if (interfaceC46999thk == null || (strKWHzl = interfaceC46999thk.KWHzl(applicationOLrzqt, str, str2, str3, str5, strValueOf, i, str4, valueOf, iEZpvd, bArrAEQbTJ)) == null) {
                strKWHzl = "";
            }
            String strAhwBna = C47136tkO.AEQbTJ.AhwBna(applicationOLrzqt);
            String str7 = valueOf;
            oKRiskPayloadManager$dispatchBiometric$12.L$0 = this;
            oKRiskPayloadManager$dispatchBiometric$12.label = 1;
            objRsdInvoke$default = rsdInvoke$default(this, strValueOf, strAhwBna, strKWHzl, iEZpvd, str7, strKWHzl2, str6, 0, oKRiskPayloadManager$dispatchBiometric$12, 128, null);
            if (objRsdInvoke$default == objCopydefault) {
                return objCopydefault;
            }
            oKRiskPayloadManager = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oKRiskPayloadManager = (OKRiskPayloadManager) oKRiskPayloadManager$dispatchBiometric$12.L$0;
            C56391yDq.AEQbTJ(objRsdInvoke$default);
        }
        final String str8 = (String) objRsdInvoke$default;
        if (str8 != null) {
            oKRiskPayloadManager.copydefault(new Function0() { // from class: o.thE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OKRiskPayloadManager.AEQbTJ(str8);
                }
            });
        } else {
            oKRiskPayloadManager.copydefault(new Function0() { // from class: o.thF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OKRiskPayloadManager.AYXKKw();
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final String AEQbTJ(String str) {
        return "RSD invoke successful, et: " + str;
    }

    public final void isConnected() {
        Triple triple;
        Pair pair;
        synchronized (AEQbTJ) {
            AtomicReference<C46983thU> atomicReference = AuCTel;
            C46983thU c46983thU = atomicReference.get();
            AtomicReference<C46997thi> atomicReference2 = AhwBna;
            C46997thi c46997thi = atomicReference2.get();
            if (!(c46983thU.AEQbTJ().length == 0)) {
                if (!(c46997thi.OLrzqt().length == 0)) {
                    return;
                }
            }
            pUU.KWHzl("OKRiskPayloadManager", "Loading risk parameters on first use");
            try {
                boolean fieldNames = copydefault.getFieldNames();
                AYXKKw = fieldNames;
                pUU.KWHzl("OKRiskPayloadManager", "ensureParametersLoaded - Dynamic config enabled: " + fieldNames);
                C47212tll.StateListAnimator stateListAnimator = C47212tll.Companion;
                C47212tll c47212tllCopydefault = stateListAnimator.copydefault(C32979mnm.EZpvd.OLrzqt());
                djBIcL = c47212tllCopydefault.copydefault();
                if (AYXKKw && !fIwbmz) {
                    triple = new Triple(Integer.valueOf(c47212tllCopydefault.copydefault("pv", djBIcL)), c47212tllCopydefault.AEQbTJ("rid", djBIcL), c47212tllCopydefault.KWHzl("ts", djBIcL));
                } else {
                    Object obj = stateListAnimator.OLrzqt().get("pv");
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    if (num == null) {
                        throw new IllegalStateException("Missing pv in paramsMap");
                    }
                    int iIntValue = num.intValue();
                    Object obj2 = stateListAnimator.OLrzqt().get("rid");
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        throw new IllegalStateException("Missing rid in paramsMap");
                    }
                    Object obj3 = stateListAnimator.OLrzqt().get("ts");
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    if (str2 != null) {
                        triple = new Triple(Integer.valueOf(iIntValue), str, str2);
                    } else {
                        throw new IllegalStateException("Missing ts in paramsMap");
                    }
                }
                int iIntValue2 = ((Number) triple.component1()).intValue();
                String str3 = (String) triple.component2();
                String str4 = (String) triple.component3();
                if (AYXKKw && !fIwbmz) {
                    pair = new Pair(Integer.valueOf(c47212tllCopydefault.copydefault("cv", djBIcL)), c47212tllCopydefault.AEQbTJ("cg", djBIcL));
                } else {
                    Object obj4 = stateListAnimator.OLrzqt().get("cv");
                    Integer num2 = obj4 instanceof Integer ? (Integer) obj4 : null;
                    if (num2 == null) {
                        throw new IllegalStateException("Missing cv in paramsMap");
                    }
                    int iIntValue3 = num2.intValue();
                    Object obj5 = stateListAnimator.OLrzqt().get("cg");
                    String str5 = obj5 instanceof String ? (String) obj5 : null;
                    if (str5 != null) {
                        pair = new Pair(Integer.valueOf(iIntValue3), str5);
                    } else {
                        throw new IllegalStateException("Missing cg in paramsMap");
                    }
                }
                int iIntValue4 = ((Number) pair.component1()).intValue();
                String str6 = (String) pair.component2();
                if (iIntValue2 <= 0) {
                    throw new IllegalStateException("Invalid protocol version: pv=" + iIntValue2);
                }
                if (StringsKt__StringsKt.fARcdN((CharSequence) str3)) {
                    throw new IllegalStateException("Invalid request ID: rid is empty");
                }
                if (StringsKt__StringsKt.fARcdN((CharSequence) str4)) {
                    throw new IllegalStateException("Invalid ts data: tsBase64 is empty");
                }
                if (iIntValue4 <= 0) {
                    throw new IllegalStateException("Invalid config version: cv=" + iIntValue4);
                }
                if (StringsKt__StringsKt.fARcdN((CharSequence) str6)) {
                    throw new IllegalStateException("Invalid config data: cg is empty");
                }
                try {
                    byte[] bArrDecode = Base64.decode(str4, 0);
                    try {
                        byte[] bArrDecode2 = Base64.decode(str6, 0);
                        Intrinsics.copydefault(bArrDecode);
                        atomicReference.set(new C46983thU(iIntValue2, str3, bArrDecode));
                        Intrinsics.copydefault(bArrDecode2);
                        atomicReference2.set(new C46997thi(iIntValue4, bArrDecode2));
                        pUU.KWHzl("OKRiskPayloadManager", "Risk parameters loaded successfully: pv=" + iIntValue2 + ", cv=" + iIntValue4 + ", rid=" + str3);
                        Unit unit = Unit.INSTANCE;
                    } catch (IllegalArgumentException e) {
                        throw new IllegalStateException("Invalid cg Base64 data: " + e.getMessage(), e);
                    }
                } catch (IllegalArgumentException e2) {
                    throw new IllegalStateException("Invalid ts Base64 data: " + e2.getMessage(), e2);
                }
            } catch (Exception e3) {
                pUU.AEQbTJ("OKRiskPayloadManager", "Failed to load risk parameters: " + e3.getMessage(), e3);
                OKRiskPayloadManager oKRiskPayloadManager = copydefault;
                String message = e3.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                oKRiskPayloadManager.AEQbTJ("ensureParametersLoaded", message);
                throw e3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull Payload payload, @NotNull Action action, boolean z, @NotNull String str, @NotNull Continuation<? super DidResponse> continuation) throws Throwable {
        OKRiskPayloadManager$dispatchPayload$1 oKRiskPayloadManager$dispatchPayload$1;
        InterfaceC46999thk interfaceC46999thk;
        InterfaceC46999thk interfaceC46999thk2;
        byte[] bArrKWHzl;
        int i;
        InterfaceC46999thk interfaceC46999thk3;
        DidResponse didResponse;
        if (continuation instanceof OKRiskPayloadManager$dispatchPayload$1) {
            oKRiskPayloadManager$dispatchPayload$1 = (OKRiskPayloadManager$dispatchPayload$1) continuation;
            int i2 = oKRiskPayloadManager$dispatchPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oKRiskPayloadManager$dispatchPayload$1.label = i2 - Integer.MIN_VALUE;
            } else {
                oKRiskPayloadManager$dispatchPayload$1 = new OKRiskPayloadManager$dispatchPayload$1(this, continuation);
            }
        }
        OKRiskPayloadManager$dispatchPayload$1 oKRiskPayloadManager$dispatchPayload$12 = oKRiskPayloadManager$dispatchPayload$1;
        Object objCopydefault = oKRiskPayloadManager$dispatchPayload$12.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = oKRiskPayloadManager$dispatchPayload$12.label;
        if (i3 != 0) {
            if (i3 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                return objCopydefault;
            }
            if (i3 == 2) {
                C56391yDq.AEQbTJ(objCopydefault);
                return objCopydefault;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = oKRiskPayloadManager$dispatchPayload$12.I$0;
            C56391yDq.AEQbTJ(objCopydefault);
            didResponse = (DidResponse) objCopydefault;
            if (didResponse.getStatus() == FingerprintIdStatus.SUCCESS && i != 0) {
                fJNWhG.set(true);
            }
            return didResponse;
        }
        C56391yDq.AEQbTJ(objCopydefault);
        isConnected();
        C46983thU c46983thU = AuCTel.get();
        C46997thi c46997thi = AhwBna.get();
        int iEZpvd = c46983thU.EZpvd();
        String strKWHzl = c46983thU.KWHzl();
        byte[] bArrAEQbTJ = c46983thU.AEQbTJ();
        int iEZpvd2 = c46997thi.EZpvd();
        byte[] bArrOLrzqt = c46997thi.OLrzqt();
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        User userOLrzqt = ((InterfaceC47230tmC) C58113yvE.copydefault(c32979mnm.OLrzqt(), InterfaceC47230tmC.class)).fmB().OLrzqt();
        String uid = userOLrzqt != null ? userOLrzqt.getUid() : null;
        String str2 = uid == null ? "" : uid;
        String str3 = C33482mxL.KWHzl;
        int iEZpvd3 = C6774aVi.AEQbTJ.EZpvd();
        String strValueOf = String.valueOf(payload.getDeviceInfo());
        String transactionId = payload.getTransactionId();
        String strValueOf2 = String.valueOf(System.currentTimeMillis());
        pUU.EZpvd("RiskPayload", String.valueOf(action));
        int i4 = Activity.EZpvd[action.ordinal()];
        if (i4 == 1) {
            try {
                interfaceC46999thk = values;
            } catch (Exception e) {
                String message = e.getMessage();
                AEQbTJ("uploadDataMessage (Action.START)", message != null ? message : "Unknown error");
            }
            if (interfaceC46999thk != null) {
                Application applicationOLrzqt = c32979mnm.OLrzqt();
                Intrinsics.copydefault((Object) str3);
                String strAEQbTJ = interfaceC46999thk.AEQbTJ(applicationOLrzqt, str2, str, str3, strValueOf2, strValueOf, iEZpvd3, bArrOLrzqt, 0, iEZpvd, bArrAEQbTJ);
                String str4 = strAEQbTJ == null ? "" : strAEQbTJ;
                String str5 = valueOf;
                oKRiskPayloadManager$dispatchPayload$12.label = 1;
                objCopydefault = copydefault(strValueOf2, transactionId, str4, 0, z, iEZpvd2, iEZpvd, strKWHzl, str, str5, oKRiskPayloadManager$dispatchPayload$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            return objCopydefault;
        }
        if (i4 == 2) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new OKRiskPayloadManager$dispatchPayload$2(str2, str, str3, strValueOf2, strValueOf, iEZpvd3, transactionId, null), 3, null);
            try {
                interfaceC46999thk2 = values;
            } catch (Exception e2) {
                String message2 = e2.getMessage();
                AEQbTJ("uploadDataMessage (Action.INSTALL - dataMessage)", message2 != null ? message2 : "Unknown error");
            }
            if (interfaceC46999thk2 != null) {
                Application applicationOLrzqt2 = c32979mnm.OLrzqt();
                Intrinsics.copydefault((Object) str3);
                String strAEQbTJ2 = interfaceC46999thk2.AEQbTJ(applicationOLrzqt2, str2, str, str3, strValueOf2, strValueOf, iEZpvd3, bArrOLrzqt, 0, iEZpvd, bArrAEQbTJ);
                String str6 = strAEQbTJ2 == null ? "" : strAEQbTJ2;
                String str7 = valueOf;
                oKRiskPayloadManager$dispatchPayload$12.label = 2;
                objCopydefault = copydefault(strValueOf2, transactionId, str6, 0, z, iEZpvd2, iEZpvd, strKWHzl, str, str7, oKRiskPayloadManager$dispatchPayload$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            return objCopydefault;
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        OKRiskDataFetcher oKRiskDataFetcherAEQbTJ = OKRiskDataFetcher.AEQbTJ();
        C46988thZ c46988thZEZpvd = oKRiskDataFetcherAEQbTJ != null ? oKRiskDataFetcherAEQbTJ.EZpvd() : null;
        int iAEQbTJ = c46988thZEZpvd != null ? c46988thZEZpvd.AEQbTJ() : 0;
        int i5 = (iAEQbTJ < 10 || AuCTelauCTel()) ? 0 : 1;
        if (i5 == 0 || c46988thZEZpvd == null || (bArrKWHzl = c46988thZEZpvd.KWHzl()) == null) {
            bArrKWHzl = new byte[0];
        }
        byte[] bArr = bArrKWHzl;
        int i6 = i5 != 0 ? iAEQbTJ : 0;
        try {
            interfaceC46999thk3 = values;
        } catch (Exception e3) {
            String message3 = e3.getMessage();
            AEQbTJ("uploadDataMessageMetrics (Action.EVENT)", message3 != null ? message3 : "Unknown error");
        }
        if (interfaceC46999thk3 != null) {
            Application applicationOLrzqt3 = c32979mnm.OLrzqt();
            Intrinsics.copydefault((Object) str3);
            String strOLrzqt = interfaceC46999thk3.OLrzqt(applicationOLrzqt3, str2, str, str3, strValueOf2, strValueOf, iEZpvd3, bArrOLrzqt, 1, iEZpvd, bArrAEQbTJ, bArr, i6);
            String str8 = strOLrzqt == null ? "" : strOLrzqt;
            String str9 = valueOf;
            oKRiskPayloadManager$dispatchPayload$12.I$0 = i5;
            oKRiskPayloadManager$dispatchPayload$12.label = 3;
            objCopydefault = copydefault(strValueOf2, transactionId, str8, 0, z, iEZpvd2, iEZpvd, strKWHzl, str, str9, oKRiskPayloadManager$dispatchPayload$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            i = i5;
        }
        didResponse = (DidResponse) objCopydefault;
        if (didResponse.getStatus() == FingerprintIdStatus.SUCCESS) {
            fJNWhG.set(true);
        }
        return didResponse;
    }

    public static /* synthetic */ Object dispatchPayload$default(OKRiskPayloadManager oKRiskPayloadManager, Payload payload, Action action, boolean z, String str, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            action = Action.EVENT;
        }
        return oKRiskPayloadManager.copydefault(payload, action, z, str, continuation);
    }

    public final void KWHzl(@NotNull ConcurrentMap<String, String> concurrentMap, boolean z, InterfaceC47027tiL interfaceC47027tiL, String str, CoroutineScope coroutineScope, @NotNull OKRiskLibrarySource oKRiskLibrarySource) {
        Intrinsics.checkNotNullParameter(concurrentMap, "");
        Intrinsics.checkNotNullParameter(oKRiskLibrarySource, "");
        pUU.KWHzl("OKRiskPayloadManager", "func sendConsolidatedReport is called");
        C47212tll.StateListAnimator stateListAnimator = C47212tll.Companion;
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        boolean zCopydefault = stateListAnimator.copydefault(c32979mnm.OLrzqt()).copydefault();
        String strGEmmrt = C47136tkO.AEQbTJ.gEmmrt(c32979mnm.OLrzqt());
        pUU.KWHzl("OKRiskPayloadManager", "sendConsolidatedReport DEBUG - isAppUpdated: " + zCopydefault + ", did: " + strGEmmrt);
        if (values == null) {
            KWHzl(C46966thD.EZpvd);
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope == null ? CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()) : coroutineScope, Dispatchers.getIO(), null, new OKRiskPayloadManager$sendConsolidatedReport$1(concurrentMap, interfaceC47027tiL, oKRiskLibrarySource, AEQbTJ(concurrentMap), z, strGEmmrt, null), 2, null);
    }

    public final Action EZpvd(@NotNull OKRiskLibrarySource oKRiskLibrarySource) {
        Intrinsics.checkNotNullParameter(oKRiskLibrarySource, "");
        int i = Activity.KWHzl[oKRiskLibrarySource.ordinal()];
        if (i == 1) {
            return Action.START;
        }
        if (i == 2) {
            return Action.INSTALL;
        }
        return Action.EVENT;
    }

    public final Object copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z, int i2, int i3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull Continuation<? super DidResponse> continuation) {
        pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Request body consistency: pv=" + i3 + ", rid=" + str4 + ", cv=" + i2);
        return BuildersKt.withContext(Dispatchers.getIO(), new OKRiskPayloadManager$didInvoke$2(str2, str3, str, i2, i3, str4, str5, str6, i, z, null), continuation);
    }

    public final Object OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new OKRiskPayloadManager$dimInvoke$2(i, str, str2, str3, str4, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public static /* synthetic */ Object gccInvoke$default(OKRiskPayloadManager oKRiskPayloadManager, String str, String str2, String str3, int i, String str4, String str5, int i2, Continuation continuation, int i3, Object obj) {
        return oKRiskPayloadManager.AEQbTJ(str, str2, str3, i, str4, str5, (i3 & 64) != 0 ? 0 : i2, continuation);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tiM.Application.postGcc$default(o.tiM, com.okinc.okrisk.service.CommonBody, com.okinc.network.okg.cor.SubdomainStrategy, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138 A[Catch: all -> 0x0181, TRY_LEAVE, TryCatch #0 {all -> 0x0181, blocks: (B:45:0x011c, B:47:0x0124, B:49:0x012a, B:50:0x0138), top: B:103:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0242 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, int i2, @NotNull Continuation<? super String> continuation) throws Throwable {
        OKRiskPayloadManager$gccInvoke$1 oKRiskPayloadManager$gccInvoke$1;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Object obj;
        boolean z;
        String str11;
        int i3;
        OKRiskPayloadManager oKRiskPayloadManager;
        InterfaceC47028tiM interfaceC47028tiMEZpvd;
        CommonBody commonBody;
        String str12;
        String str13;
        AbstractC43419rot actionBar;
        int i4;
        String str14;
        String str15;
        String str16;
        String str17;
        int i5;
        ResponseData responseData;
        Object obj2;
        final int i6 = i;
        final String str18 = str4;
        if (continuation instanceof OKRiskPayloadManager$gccInvoke$1) {
            oKRiskPayloadManager$gccInvoke$1 = (OKRiskPayloadManager$gccInvoke$1) continuation;
            int i7 = oKRiskPayloadManager$gccInvoke$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                oKRiskPayloadManager$gccInvoke$1.label = i7 - Integer.MIN_VALUE;
            } else {
                oKRiskPayloadManager$gccInvoke$1 = new OKRiskPayloadManager$gccInvoke$1(this, continuation);
            }
        }
        OKRiskPayloadManager$gccInvoke$1 oKRiskPayloadManager$gccInvoke$12 = oKRiskPayloadManager$gccInvoke$1;
        Object objPostGcc$default = oKRiskPayloadManager$gccInvoke$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i8 = oKRiskPayloadManager$gccInvoke$12.label;
        if (i8 == 0) {
            C56391yDq.AEQbTJ(objPostGcc$default);
            copydefault(new Function0() { // from class: o.thK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OKRiskPayloadManager.AEQbTJ(i6, str18);
                }
            });
            try {
                interfaceC47028tiMEZpvd = InterfaceC47028tiM.Companion.EZpvd();
                int i9 = 1;
                String str19 = null;
                int i10 = 128;
                DefaultConstructorMarker defaultConstructorMarker = null;
                str12 = AbstractC43419rot.TAG;
                str13 = "Error: ";
                try {
                    commonBody = new CommonBody(str2, str3, str, i9, str5, i, str4, str19, i10, defaultConstructorMarker);
                    oKRiskPayloadManager$gccInvoke$12.L$0 = this;
                    str6 = str;
                } catch (Throwable th) {
                    th = th;
                    str6 = str;
                }
            } catch (Throwable th2) {
                th = th2;
                str6 = str;
                str7 = str3;
                str8 = str5;
                str9 = AbstractC43419rot.TAG;
                str10 = "Error: ";
                obj = objCopydefault;
                z = true;
                str11 = str2;
                i3 = i2;
            }
            try {
                oKRiskPayloadManager$gccInvoke$12.L$1 = str6;
                str11 = str2;
            } catch (Throwable th3) {
                th = th3;
                str11 = str2;
                str7 = str3;
                str8 = str5;
                i3 = i2;
                str9 = str12;
                str10 = str13;
                obj = objCopydefault;
                z = true;
                oKRiskPayloadManager = this;
                pUU.copydefault(str9, str10 + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                String str20 = str6;
                i4 = i3;
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
            try {
                oKRiskPayloadManager$gccInvoke$12.L$2 = str11;
                str7 = str3;
                try {
                    oKRiskPayloadManager$gccInvoke$12.L$3 = str7;
                    oKRiskPayloadManager$gccInvoke$12.L$4 = str18;
                    str8 = str5;
                } catch (Throwable th4) {
                    th = th4;
                    str8 = str5;
                    i3 = i2;
                    str9 = str12;
                    str10 = str13;
                    obj = objCopydefault;
                    z = true;
                    oKRiskPayloadManager = this;
                    pUU.copydefault(str9, str10 + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    String str202 = str6;
                    i4 = i3;
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                try {
                    oKRiskPayloadManager$gccInvoke$12.L$5 = str8;
                    oKRiskPayloadManager$gccInvoke$12.I$0 = i6;
                    i3 = i2;
                } catch (Throwable th5) {
                    th = th5;
                    i3 = i2;
                    str9 = str12;
                    str10 = str13;
                    obj = objCopydefault;
                    z = true;
                    oKRiskPayloadManager = this;
                    pUU.copydefault(str9, str10 + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    String str2022 = str6;
                    i4 = i3;
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                str7 = str3;
                str8 = str5;
                i3 = i2;
                str9 = str12;
                str10 = str13;
                obj = objCopydefault;
                z = true;
                oKRiskPayloadManager = this;
                pUU.copydefault(str9, str10 + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                String str20222 = str6;
                i4 = i3;
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
            try {
                oKRiskPayloadManager$gccInvoke$12.I$1 = i3;
                try {
                    oKRiskPayloadManager$gccInvoke$12.label = 1;
                    z = true;
                } catch (Throwable th7) {
                    th = th7;
                    z = true;
                }
                try {
                    objPostGcc$default = InterfaceC47028tiM.Application.postGcc$default(interfaceC47028tiMEZpvd, commonBody, null, oKRiskPayloadManager$gccInvoke$12, 2, null);
                    obj = objCopydefault;
                } catch (Throwable th8) {
                    th = th8;
                    str9 = str12;
                    str10 = str13;
                    obj = objCopydefault;
                    oKRiskPayloadManager = this;
                    pUU.copydefault(str9, str10 + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    String str202222 = str6;
                    i4 = i3;
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                str9 = str12;
                str10 = str13;
                obj = objCopydefault;
                z = true;
                oKRiskPayloadManager = this;
                pUU.copydefault(str9, str10 + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                String str2022222 = str6;
                i4 = i3;
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
            if (objPostGcc$default == obj) {
                return obj;
            }
            oKRiskPayloadManager = this;
            responseData = (ResponseData) objPostGcc$default;
            if (responseData.getCode() != 0) {
                StringBuilder sb = new StringBuilder();
                str10 = str13;
                sb.append(str10);
                sb.append(responseData);
                str9 = str12;
                pUU.copydefault(str9, sb.toString());
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                String str20222222 = str6;
                i4 = i3;
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
        } else if (i8 == 1) {
            int i11 = oKRiskPayloadManager$gccInvoke$12.I$1;
            int i12 = oKRiskPayloadManager$gccInvoke$12.I$0;
            String str21 = (String) oKRiskPayloadManager$gccInvoke$12.L$5;
            String str22 = (String) oKRiskPayloadManager$gccInvoke$12.L$4;
            String str23 = (String) oKRiskPayloadManager$gccInvoke$12.L$3;
            String str24 = (String) oKRiskPayloadManager$gccInvoke$12.L$2;
            String str25 = (String) oKRiskPayloadManager$gccInvoke$12.L$1;
            OKRiskPayloadManager oKRiskPayloadManager2 = (OKRiskPayloadManager) oKRiskPayloadManager$gccInvoke$12.L$0;
            try {
                C56391yDq.AEQbTJ(objPostGcc$default);
                str8 = str21;
                str12 = AbstractC43419rot.TAG;
                str13 = "Error: ";
                str7 = str23;
                str11 = str24;
                z = true;
                i6 = i12;
                str18 = str22;
                oKRiskPayloadManager = oKRiskPayloadManager2;
                obj = objCopydefault;
                i3 = i11;
                str6 = str25;
                try {
                    responseData = (ResponseData) objPostGcc$default;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        str10 = str13;
                        try {
                            sb2.append(str10);
                            sb2.append(responseData);
                            str9 = str12;
                        } catch (Throwable th10) {
                            th = th10;
                            str9 = str12;
                        }
                        try {
                            pUU.copydefault(str9, sb2.toString());
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        } catch (Throwable th11) {
                            th = th11;
                            pUU.copydefault(str9, str10 + th);
                            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        }
                    }
                } catch (Throwable th12) {
                    th = th12;
                    str9 = str12;
                    str10 = str13;
                }
            } catch (Throwable th13) {
                th = th13;
                str8 = str21;
                str7 = str23;
                z = true;
                i6 = i12;
                oKRiskPayloadManager = oKRiskPayloadManager2;
                obj = objCopydefault;
                i3 = i11;
                str6 = str25;
                str9 = AbstractC43419rot.TAG;
                str18 = str22;
                str10 = "Error: ";
                str11 = str24;
                pUU.copydefault(str9, str10 + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                String str202222222 = str6;
                i4 = i3;
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
            String str2022222222 = str6;
            i4 = i3;
            if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                String et = ((GccResponseData) ((AbstractC43419rot.StateListAnimator) actionBar).AEQbTJ()).getEt();
                fetchVPNInfo.set(z);
                return et;
            }
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            if (i4 >= AkhnZx) {
                return null;
            }
            long jPow = (long) (Math.pow(2.0d, i4) * 1000);
            oKRiskPayloadManager$gccInvoke$12.L$0 = oKRiskPayloadManager;
            oKRiskPayloadManager$gccInvoke$12.L$1 = str2022222222;
            oKRiskPayloadManager$gccInvoke$12.L$2 = str11;
            oKRiskPayloadManager$gccInvoke$12.L$3 = str7;
            oKRiskPayloadManager$gccInvoke$12.L$4 = str18;
            oKRiskPayloadManager$gccInvoke$12.L$5 = str8;
            oKRiskPayloadManager$gccInvoke$12.I$0 = i6;
            oKRiskPayloadManager$gccInvoke$12.I$1 = i4;
            oKRiskPayloadManager$gccInvoke$12.label = 2;
            if (DelayKt.delay(jPow, oKRiskPayloadManager$gccInvoke$12) == obj) {
                return obj;
            }
            str14 = str2022222222;
            str15 = str11;
            str16 = str7;
            str17 = str8;
            i5 = i6;
            oKRiskPayloadManager$gccInvoke$12.L$0 = null;
            oKRiskPayloadManager$gccInvoke$12.L$1 = null;
            oKRiskPayloadManager$gccInvoke$12.L$2 = null;
            oKRiskPayloadManager$gccInvoke$12.L$3 = null;
            oKRiskPayloadManager$gccInvoke$12.L$4 = null;
            oKRiskPayloadManager$gccInvoke$12.L$5 = null;
            oKRiskPayloadManager$gccInvoke$12.label = 3;
            obj2 = obj;
            objPostGcc$default = oKRiskPayloadManager.AEQbTJ(str14, str15, str16, i5, str18, str17, i4 + 1, oKRiskPayloadManager$gccInvoke$12);
            if (objPostGcc$default != obj2) {
            }
        } else if (i8 == 2) {
            i4 = oKRiskPayloadManager$gccInvoke$12.I$1;
            int i13 = oKRiskPayloadManager$gccInvoke$12.I$0;
            String str26 = (String) oKRiskPayloadManager$gccInvoke$12.L$5;
            String str27 = (String) oKRiskPayloadManager$gccInvoke$12.L$4;
            String str28 = (String) oKRiskPayloadManager$gccInvoke$12.L$3;
            String str29 = (String) oKRiskPayloadManager$gccInvoke$12.L$2;
            String str30 = (String) oKRiskPayloadManager$gccInvoke$12.L$1;
            OKRiskPayloadManager oKRiskPayloadManager3 = (OKRiskPayloadManager) oKRiskPayloadManager$gccInvoke$12.L$0;
            C56391yDq.AEQbTJ(objPostGcc$default);
            str18 = str27;
            str16 = str28;
            str15 = str29;
            obj = objCopydefault;
            i5 = i13;
            str17 = str26;
            str14 = str30;
            oKRiskPayloadManager = oKRiskPayloadManager3;
            oKRiskPayloadManager$gccInvoke$12.L$0 = null;
            oKRiskPayloadManager$gccInvoke$12.L$1 = null;
            oKRiskPayloadManager$gccInvoke$12.L$2 = null;
            oKRiskPayloadManager$gccInvoke$12.L$3 = null;
            oKRiskPayloadManager$gccInvoke$12.L$4 = null;
            oKRiskPayloadManager$gccInvoke$12.L$5 = null;
            oKRiskPayloadManager$gccInvoke$12.label = 3;
            obj2 = obj;
            objPostGcc$default = oKRiskPayloadManager.AEQbTJ(str14, str15, str16, i5, str18, str17, i4 + 1, oKRiskPayloadManager$gccInvoke$12);
            if (objPostGcc$default != obj2) {
                return obj2;
            }
        } else {
            if (i8 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objPostGcc$default);
        }
        return objPostGcc$default;
    }

    public static final String AEQbTJ(int i, String str) {
        return "gccInvoke DEBUG - Using pv: " + i + ", rid: " + str;
    }

    public static /* synthetic */ Object rsdInvoke$default(OKRiskPayloadManager oKRiskPayloadManager, String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, Continuation continuation, int i3, Object obj) {
        return oKRiskPayloadManager.AEQbTJ(str, str2, str3, i, str4, str5, str6, (i3 & 128) != 0 ? 0 : i2, continuation);
    }

    public final Object AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2, @NotNull Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new OKRiskPayloadManager$rsdInvoke$2(str6, i2, str, str2, str3, i, str4, str5, null), continuation);
    }

    public final Payload AEQbTJ(@NotNull ConcurrentMap<String, String> concurrentMap) {
        Intrinsics.checkNotNullParameter(concurrentMap, "");
        String strValueOf = String.valueOf(new JSONObject(concurrentMap));
        String str = C47005thq.KWHzl.AEQbTJ().copydefault().get(SyncSignal.SignalKey.TRANSACTION_ID.getKey());
        return new Payload(strValueOf, str != null ? str : "");
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            EventData eventData = new EventData();
            eventData.setAct("okrisklibrary_operation_exception");
            eventData.setMsg(str);
            eventData.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", str2)));
            pUU.copydefault("OKRiskPayloadManager", "monitorCallError[" + Thread.currentThread().getName() + "]: " + eventData);
            ReportManager.AEQbTJ.EZpvd(eventData);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7 A[Catch: Exception -> 0x003b, TryCatch #1 {Exception -> 0x003b, blocks: (B:12:0x0036, B:46:0x00e3, B:48:0x00e7, B:50:0x00eb, B:52:0x00f3, B:53:0x00fc), top: B:60:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        OKRiskPayloadManager$executeGccInvokeWithDecryption$1 oKRiskPayloadManager$executeGccInvokeWithDecryption$1;
        OKRiskPayloadManager oKRiskPayloadManager;
        String strAEQbTJ;
        InterfaceC46999thk interfaceC46999thk;
        Object objGccInvoke$default;
        Application application;
        String str;
        InterfaceC46999thk interfaceC46999thk2;
        String str2;
        if (continuation instanceof OKRiskPayloadManager$executeGccInvokeWithDecryption$1) {
            oKRiskPayloadManager$executeGccInvokeWithDecryption$1 = (OKRiskPayloadManager$executeGccInvokeWithDecryption$1) continuation;
            int i = oKRiskPayloadManager$executeGccInvokeWithDecryption$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKRiskPayloadManager$executeGccInvokeWithDecryption$1.label = i - Integer.MIN_VALUE;
            } else {
                oKRiskPayloadManager$executeGccInvokeWithDecryption$1 = new OKRiskPayloadManager$executeGccInvokeWithDecryption$1(this, continuation);
            }
        }
        OKRiskPayloadManager$executeGccInvokeWithDecryption$1 oKRiskPayloadManager$executeGccInvokeWithDecryption$12 = oKRiskPayloadManager$executeGccInvokeWithDecryption$1;
        Object obj = oKRiskPayloadManager$executeGccInvokeWithDecryption$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKRiskPayloadManager$executeGccInvokeWithDecryption$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                String strValueOf = String.valueOf(System.currentTimeMillis());
                String strAhwBna = C47136tkO.AEQbTJ.AhwBna(applicationOLrzqt);
                C46983thU c46983thU = AuCTel.get();
                int iEZpvd = c46983thU.EZpvd();
                String strKWHzl = c46983thU.KWHzl();
                byte[] bArrAEQbTJ = c46983thU.AEQbTJ();
                try {
                    interfaceC46999thk2 = values;
                } catch (Exception e) {
                    copydefault(new Function0() { // from class: o.thH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OKRiskPayloadManager.KWHzl(e);
                        }
                    });
                } catch (UnsatisfiedLinkError e2) {
                    copydefault(new Function0() { // from class: o.thC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OKRiskPayloadManager.AEQbTJ(e2);
                        }
                    });
                }
                if (interfaceC46999thk2 == null || (strAEQbTJ = interfaceC46999thk2.AEQbTJ(applicationOLrzqt, "version")) == null) {
                    strAEQbTJ = "1.0";
                    String str3 = strAEQbTJ;
                    String strGEmmrt = C47136tkO.AEQbTJ.gEmmrt(applicationOLrzqt);
                    interfaceC46999thk = values;
                    if (interfaceC46999thk != null || (strKWHzl = interfaceC46999thk.KWHzl(applicationOLrzqt, strGEmmrt, strValueOf, 1, str3, valueOf, iEZpvd, bArrAEQbTJ)) == null) {
                        String strKWHzl2 = "";
                    }
                    String str4 = strKWHzl2;
                    String str5 = valueOf;
                    oKRiskPayloadManager$executeGccInvokeWithDecryption$12.L$0 = this;
                    oKRiskPayloadManager$executeGccInvokeWithDecryption$12.L$1 = applicationOLrzqt;
                    oKRiskPayloadManager$executeGccInvokeWithDecryption$12.L$2 = strGEmmrt;
                    oKRiskPayloadManager$executeGccInvokeWithDecryption$12.label = 1;
                    objGccInvoke$default = gccInvoke$default(this, strValueOf, strAhwBna, str4, iEZpvd, strKWHzl, str5, 0, oKRiskPayloadManager$executeGccInvokeWithDecryption$12, 64, null);
                    if (objGccInvoke$default != objCopydefault) {
                        return objCopydefault;
                    }
                    oKRiskPayloadManager = this;
                    application = applicationOLrzqt;
                    str = strGEmmrt;
                    obj = objGccInvoke$default;
                    str2 = (String) obj;
                    if (str2 != null) {
                    }
                } else {
                    if (strAEQbTJ.length() <= 0) {
                        strAEQbTJ = null;
                    }
                    if (strAEQbTJ == null) {
                    }
                    String str32 = strAEQbTJ;
                    String strGEmmrt2 = C47136tkO.AEQbTJ.gEmmrt(applicationOLrzqt);
                    interfaceC46999thk = values;
                    if (interfaceC46999thk != null) {
                        String strKWHzl22 = "";
                        String str42 = strKWHzl22;
                        String str52 = valueOf;
                        oKRiskPayloadManager$executeGccInvokeWithDecryption$12.L$0 = this;
                        oKRiskPayloadManager$executeGccInvokeWithDecryption$12.L$1 = applicationOLrzqt;
                        oKRiskPayloadManager$executeGccInvokeWithDecryption$12.L$2 = strGEmmrt2;
                        oKRiskPayloadManager$executeGccInvokeWithDecryption$12.label = 1;
                        objGccInvoke$default = gccInvoke$default(this, strValueOf, strAhwBna, str42, iEZpvd, strKWHzl, str52, 0, oKRiskPayloadManager$executeGccInvokeWithDecryption$12, 64, null);
                        if (objGccInvoke$default != objCopydefault) {
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                oKRiskPayloadManager = this;
                oKRiskPayloadManager.copydefault(new Function0() { // from class: o.thI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return OKRiskPayloadManager.EZpvd(e);
                    }
                });
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) oKRiskPayloadManager$executeGccInvokeWithDecryption$12.L$2;
            application = (Application) oKRiskPayloadManager$executeGccInvokeWithDecryption$12.L$1;
            oKRiskPayloadManager = (OKRiskPayloadManager) oKRiskPayloadManager$executeGccInvokeWithDecryption$12.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                str2 = (String) obj;
                if (str2 != null) {
                    InterfaceC46999thk interfaceC46999thk3 = values;
                    if (interfaceC46999thk3 != null && interfaceC46999thk3.copydefault(application, str, str2, "gcc")) {
                        oKRiskPayloadManager.copydefault(new Function0() { // from class: o.thL
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return OKRiskPayloadManager.values();
                            }
                        });
                    } else {
                        oKRiskPayloadManager.copydefault(new Function0() { // from class: o.thJ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return OKRiskPayloadManager.AkhnZx();
                            }
                        });
                    }
                }
            } catch (Exception e4) {
                e = e4;
                oKRiskPayloadManager.copydefault(new Function0() { // from class: o.thI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return OKRiskPayloadManager.EZpvd(e);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final String AEQbTJ(UnsatisfiedLinkError unsatisfiedLinkError) {
        return "executeGccInvokeWithDecryption - Native library not available, using fallback version: " + unsatisfiedLinkError.getMessage();
    }

    public static final String KWHzl(Exception exc) {
        return "executeGccInvokeWithDecryption - Failed to read version from config, using fallback: " + exc.getMessage();
    }

    public static final String EZpvd(Exception exc) {
        return "executeGccInvokeWithDecryption - Failed to execute GCC invoke: " + exc.getMessage();
    }
}
