package o;

import android.os.Build;
import android.view.View;
import androidx.work.WorkRequest;
import com.appsflyer.AppsFlyerProperties;
import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.base.bugreport.GuardDetectionException;
import com.okinc.base.thread.TPM;
import com.okinc.base.utils.OkUtils;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.bean.EventParam;
import com.okinc.core.util.SPUtils;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.C32549mfg;
import o.C32883mlw;
import o.C44103sDl;
import o.InterfaceC32484meU;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.sDl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44103sDl {
    public static final AtomicBoolean AEQbTJ;
    public static final ActionBar Companion;
    private static int EZpvd;
    private static long KWHzl;
    public static boolean OLrzqt;
    public static final DetectionInfoBean copydefault;
    private static int djBIcL;
    private static final byte[] $$c = {110, 90, 92, 104};
    private static final int $$d = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {62, 106, 120, -80, -4, 7, -1, Ascii.GS, 7, 7, Ascii.CR, -12, 17, 0, Ascii.VT, -30, 0, 17, 5};
    private static final int $$b = 3;
    private static int valueOf = 0;
    private static int AhwBna = 1;
    private static int gEmmrt = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(int i, short s, int i2) {
        int i3;
        byte[] bArr = $$c;
        int i4 = 117 - i2;
        int i5 = i * 4;
        int i6 = 4 - (s * 3);
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i4;
            int i9 = 0;
            int i10 = i6;
            int i11 = i6 + i8;
            int i12 = i10 + 1;
            i3 = i9;
            i4 = i11;
            i6 = i12;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new java.lang.String(bArr2, 0);
            }
            i8 = bArr[i6];
            int i13 = i4;
            i10 = i6;
            i6 = i13;
            int i112 = i6 + i8;
            int i122 = i10 + 1;
            i3 = i9;
            i4 = i112;
            i6 = i122;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public static final /* synthetic */ void AEQbTJ(boolean z) {
        int i = 2 % 2;
        int i2 = AhwBna + 99;
        int i3 = i2 % 128;
        valueOf = i3;
        int i4 = i2 % 2;
        java.lang.Object obj = null;
        OLrzqt = z;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 3;
        AhwBna = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object EZpvd(java.lang.Object[] objArr) {
        int i = 2 % 2;
        int i2 = AhwBna + 33;
        int i3 = i2 % 128;
        valueOf = i3;
        int i4 = i2 % 2;
        DetectionInfoBean detectionInfoBean = copydefault;
        int i5 = i3 + 123;
        AhwBna = i5 % 128;
        if (i5 % 2 != 0) {
            return detectionInfoBean;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object OLrzqt(int i, int i2, java.lang.Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~((~i) | i8);
        int i10 = i | i8;
        int i11 = i2 + i3 + i4 + ((-189913888) * i6) + ((-1809372279) * i5);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i2) - 1671495680) + (10634006 * i3) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i4) + (952107008 * i6) + (1092222976 * i5) + ((-70844416) * i12);
        int i14 = (i2 * 986545540) + 223666697 + (i3 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i4 * 986544659) + (i6 * 1843362976) + (i5 * (-1872984789)) + (i12 * (-2050686976));
        return i13 + ((i14 * i14) * 1179713536) != 1 ? EZpvd(objArr) : copydefault(objArr);
    }

    public static final /* synthetic */ AtomicBoolean OLrzqt() {
        int i = 2 % 2;
        int i2 = valueOf + 69;
        AhwBna = i2 % 128;
        if (i2 % 2 != 0) {
            return AEQbTJ;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (s * 5) + 6;
        int i6 = 99 - (i2 * 20);
        int i7 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i5;
            int i9 = i7;
            int i10 = 0;
            int i11 = i8 + (-i7) + 8;
            i3 = i10;
            int i12 = i9;
            i6 = i11;
            i7 = i12;
            int i13 = i7 + 1;
            bArr2[i3] = (byte) i6;
            i4 = i3 + 1;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i14 = i6;
            i9 = i13;
            i7 = bArr[i13];
            i10 = i4;
            i8 = i14;
            int i112 = i8 + (-i7) + 8;
            i3 = i10;
            int i122 = i9;
            i6 = i112;
            i7 = i122;
            int i132 = i7 + 1;
            bArr2[i3] = (byte) i6;
            i4 = i3 + 1;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            int i1322 = i7 + 1;
            bArr2[i3] = (byte) i6;
            i4 = i3 + 1;
            if (i4 == i5) {
            }
        }
    }

    private static /* synthetic */ java.lang.Object copydefault(java.lang.Object[] objArr) {
        int i = 2 % 2;
        int i2 = AhwBna + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return java.lang.Boolean.valueOf(OLrzqt);
        }
        throw null;
    }

    /* JADX INFO: renamed from: o.sDl$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sDl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.String AEQbTJ(@NotNull java.lang.String str) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            java.lang.String strEZpvd;
            java.lang.String strAEQbTJ;
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC32484meU.Activity activity = InterfaceC32484meU.Companion;
            InterfaceC44099sDh interfaceC44099sDhAhwBna = activity.KWHzl().AhwBna();
            if (interfaceC44099sDhAhwBna == null || (strEZpvd = interfaceC44099sDhAhwBna.EZpvd()) == null) {
                strEZpvd = "";
            }
            InterfaceC44099sDh interfaceC44099sDhAhwBna2 = activity.KWHzl().AhwBna();
            if (interfaceC44099sDhAhwBna2 == null || (strAEQbTJ = interfaceC44099sDhAhwBna2.AEQbTJ()) == null) {
                strAEQbTJ = "";
            }
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            java.nio.charset.Charset charset = Charsets.UTF_8;
            byte[] bytes = strEZpvd.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bytes, BouncyCastleKeyManagementRepository.AES);
            byte[] bytes2 = strAEQbTJ.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "");
            cipher.init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bytes2));
            byte[] bArrDoFinal = cipher.doFinal(java.util.Base64.getDecoder().decode(str));
            Intrinsics.copydefault(bArrDoFinal);
            return new java.lang.String(bArrDoFinal, charset);
        }

        public final java.util.Map<java.lang.String, java.lang.String> OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.util.HashMap map = new java.util.HashMap();
            if (Build.VERSION.SDK_INT >= 26) {
                android.content.res.AssetManager assets = context.getAssets();
                Intrinsics.checkNotNullExpressionValue(assets, "");
                try {
                    java.io.InputStream inputStreamOpen = assets.open("normalWalletCore.cache");
                    Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStreamOpen));
                    java.lang.String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
                    bufferedReader.close();
                    JSONObject jSONObject = new JSONObject(AEQbTJ(strAEQbTJ));
                    java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(itKeys, "");
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        map.put(next, jSONObject.getString(next));
                    }
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
            return map;
        }

        public final DetectionInfoBean copydefault() {
            return (DetectionInfoBean) C44103sDl.OLrzqt(C32883mlw.Activity.KWHzl(), -1683766950, new java.lang.Object[0], 1683766950, C32883mlw.Activity.KWHzl(), C32883mlw.Activity.KWHzl(), C32883mlw.Activity.KWHzl());
        }

        public final void OLrzqt() throws java.lang.Throwable {
            pUU.KWHzl("DetectionDialogManager", "--------------------------------DetectionReport start--------------------------------");
            int flag = copydefault().getFlag();
            SPUtils.put("SP_KEY_DETECTION_ENVIRONMENT_DATA", java.lang.Integer.valueOf(flag), "detectionEnvironment");
            java.lang.String str = C33482mxL.KWHzl;
            Intrinsics.checkNotNullExpressionValue(str, "");
            boolean zAEQbTJ = AEQbTJ(str, copydefault());
            C44093sDb c44093sDb = C44093sDb.EZpvd;
            boolean zEZpvd = c44093sDb.EZpvd();
            InterfaceC32484meU interfaceC32484meUKWHzl = InterfaceC32484meU.Companion.KWHzl();
            pUU.KWHzl("DetectionDialogManager", "flag=>" + flag + " " + java.lang.Integer.toBinaryString(flag) + " needCrash=>" + zAEQbTJ + " \nFLAVOR_market:" + C33482mxL.KWHzl + "  \nVERSION_CODE:" + interfaceC32484meUKWHzl.DbNXlk() + " \nVERSION_NAME:" + interfaceC32484meUKWHzl.fIwbmz() + "  \nMODEL:" + android.os.Build.MODEL + "  \nenableShowRiskDialog::" + zEZpvd + "  \ncurrentThreadName:" + java.lang.Thread.currentThread().getName() + "  \nCurrentProcessName:" + C38352pVp.EZpvd(OkUtils.AEQbTJ()) + "  \ndetectionInfo:" + copydefault().toJsonString());
            KWHzl(zAEQbTJ);
            OLrzqt(zAEQbTJ);
            if (zAEQbTJ) {
                TPM.AEQbTJ.copydefault(new RunnableC44109sDr(), WorkRequest.MIN_BACKOFF_MILLIS);
            } else if (copydefault().isDeviceRooted) {
                pUU.KWHzl("DetectionDialogManager", "DetectionDialogManager dexguard callback rootDetection");
                c44093sDb.KWHzl();
            } else if (zEZpvd) {
                KWHzl(copydefault());
            }
            pUU.KWHzl("DetectionDialogManager", "--------------------------------DetectionReport end--------------------------------");
        }

        public final boolean AEQbTJ(java.lang.String str, DetectionInfoBean detectionInfoBean) {
            InterfaceC44099sDh interfaceC44099sDhAhwBna = InterfaceC32484meU.Companion.KWHzl().AhwBna();
            java.lang.String strKWHzl = interfaceC44099sDhAhwBna != null ? interfaceC44099sDhAhwBna.KWHzl() : null;
            if (strKWHzl != null && strKWHzl.length() != 0) {
                java.lang.String str2 = android.os.Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strKWHzl, (java.lang.CharSequence) str2, false, 2, (java.lang.Object) null)) {
                    return false;
                }
            }
            if (C59449zhJ.gEmmrt(C33482mxL.KWHzl, "gp", true)) {
                if (detectionInfoBean.isFileTampered || detectionInfoBean.isCertificateTampered) {
                    return true;
                }
            } else if (detectionInfoBean.isFileTampered || detectionInfoBean.isAppTampered || detectionInfoBean.isCertificateTampered) {
                return true;
            }
            return false;
        }

        public final void KWHzl(boolean z) {
            pUU.KWHzl("DetectionDialogManager", "ReportManager reportGrafanaEvent");
            java.util.Map<java.lang.String, java.lang.String> map = copydefault().toMap();
            EventData eventData = new EventData();
            eventData.setAct(EventAction.APP_ENV_RASP.getType());
            java.util.HashMap map2 = new java.util.HashMap();
            map2.putAll(map);
            if (C44093sDb.EZpvd.EZpvd()) {
                map2.put("enableShowRiskDialog", "1");
            } else {
                map2.put("enableShowRiskDialog", "0");
            }
            if (z) {
                map2.put("type", "2");
            } else {
                map2.put("type", "1");
            }
            eventData.setAttrs(map2);
            ReportManager.AEQbTJ.EZpvd(eventData);
        }

        public final void AEQbTJ(android.app.Activity activity, java.lang.String str) {
            if (activity != null) {
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
                viewOnClickListenerC54939xaY.setCancelable(true);
                viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C32549mfg.StateListAnimator.djSkpj));
                viewOnClickListenerC54939xaY.EZpvd(str);
                viewOnClickListenerC54939xaY.EZpvd(C32549mfg.StateListAnimator.AYXKKw, new View.OnClickListener() { // from class: o.sDk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) throws java.lang.Throwable {
                        C44103sDl.ActionBar.copydefault(viewOnClickListenerC54939xaY, view);
                    }
                });
                viewOnClickListenerC54939xaY.show();
                pUU.copydefault("DetectionDialogManager", "showDialog show");
            }
        }

        public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) throws java.lang.Throwable {
            C44103sDl.Companion.OLrzqt(false);
            viewOnClickListenerC54939xaY.dismiss();
        }

        public final java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ(boolean z) throws java.lang.Throwable {
            java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
            map.putAll(copydefault().toMap());
            android.app.Application applicationAEQbTJ = OkUtils.AEQbTJ();
            if (applicationAEQbTJ != null) {
                java.lang.String strCopydefault = C6797aWE.KWHzl.copydefault(applicationAEQbTJ);
                map.put("VersionName", C34703nhO.valueOf(applicationAEQbTJ));
                map.put("VersionCode", java.lang.String.valueOf(C34703nhO.copydefault(applicationAEQbTJ)));
                map.put("FLAVOR", C33482mxL.KWHzl);
                map.put("deviceFinger", C6799aWG.EZpvd(strCopydefault));
                map.put("MODEL", android.os.Build.MODEL);
                map.put("UUID", xVW.copydefault());
            }
            map.put("market", C33482mxL.KWHzl);
            map.put(AppsFlyerProperties.CHANNEL, xVY.OLrzqt());
            map.put("showWaringDialog", java.lang.String.valueOf(C44103sDl.OLrzqt().get()));
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            map.put("currentActivity", activityAEQbTJ != null ? activityAEQbTJ.getClass().getName() : "");
            map.put("isCrash", java.lang.String.valueOf(z));
            return map;
        }

        public final void OLrzqt(boolean z) throws java.lang.Throwable {
            pUU.KWHzl("DetectionDialogManager", "DetectionReport submitInfo start");
            if (z) {
                if (!((java.lang.Boolean) C44103sDl.OLrzqt(C32883mlw.Activity.KWHzl(), 1731344073, new java.lang.Object[0], -1731344072, C32883mlw.Activity.KWHzl(), C32883mlw.Activity.KWHzl(), C32883mlw.Activity.KWHzl())).booleanValue()) {
                    pUU.KWHzl("DetectionDialogManager", "DetectionReport submitInfo upload info");
                    java.util.HashMap<java.lang.String, java.lang.String> mapAEQbTJ = AEQbTJ(z);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Set<Map.Entry<java.lang.String, java.lang.String>> setEntrySet = mapAEQbTJ.entrySet();
                    Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
                    java.util.Iterator<T> it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        java.lang.Object key = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key, "");
                        java.lang.Object value = entry.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "");
                        arrayList.add(new EventParam((java.lang.String) key, (java.lang.String) value, false));
                    }
                    mapAEQbTJ.put("enableShowRiskDialog", C44093sDb.EZpvd.EZpvd() ? "1" : "0");
                    C6777aVl.Companion.OLrzqt(new GuardDetectionException(" Detected environment risk shut down the app"), mapAEQbTJ, java.lang.Boolean.TRUE);
                    C44103sDl.AEQbTJ(true);
                }
            }
            pUU.KWHzl("DetectionDialogManager", "DetectionReport submitInfo end");
        }

        public final void KWHzl(final DetectionInfoBean detectionInfoBean) {
            android.view.View decorView;
            final android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ != null) {
                pUU.KWHzl("DetectionDialogManager", "DetectionReport Activity=> " + activityAEQbTJ.getClass().getName());
                if (activityAEQbTJ.isDestroyed() || activityAEQbTJ.isFinishing()) {
                    return;
                }
                android.view.Window window = activityAEQbTJ.getWindow();
                pUU.KWHzl("DetectionDialogManager", "DetectionReport " + (window != null ? window.getDecorView() : null));
                android.view.Window window2 = activityAEQbTJ.getWindow();
                if (window2 == null || (decorView = window2.getDecorView()) == null) {
                    return;
                }
                pUU.KWHzl("DetectionDialogManager", "DetectionReport showWaringDialog start " + C44103sDl.OLrzqt().get());
                if (!C44103sDl.OLrzqt().get()) {
                    C44103sDl.OLrzqt().getAndSet(true);
                    decorView.post(new java.lang.Runnable() { // from class: o.sDm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C44103sDl.ActionBar.AEQbTJ(detectionInfoBean, activityAEQbTJ);
                        }
                    });
                }
                pUU.KWHzl("DetectionDialogManager", "DetectionReport showWaringDialog end");
            }
        }

        public static final void AEQbTJ(DetectionInfoBean detectionInfoBean, android.app.Activity activity) {
            java.lang.String strAYXKKw;
            pUU.KWHzl("DetectionDialogManager", "DetectionReport showWaringDialog show");
            if (detectionInfoBean.isDeviceRooted) {
                strAYXKKw = C33070mpX.AYXKKw(C32549mfg.StateListAnimator.dNCPSb);
            } else if (detectionInfoBean.isDebuggerAttached) {
                strAYXKKw = C33070mpX.AYXKKw(C32549mfg.StateListAnimator.RJOkX);
            } else if (detectionInfoBean.isRunningInEmulator) {
                strAYXKKw = C33070mpX.AYXKKw(C32549mfg.StateListAnimator.QVAiDq);
            } else if (detectionInfoBean.isRunningInVirtualEnvironment) {
                strAYXKKw = C33070mpX.AYXKKw(C32549mfg.StateListAnimator.RcXXUw);
            } else if (detectionInfoBean.isApplicationHooked) {
                strAYXKKw = C33070mpX.AYXKKw(C32549mfg.StateListAnimator.QfsBiF);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C32549mfg.StateListAnimator.QUSxYX);
            }
            C44103sDl.Companion.AEQbTJ(activity, strAYXKKw);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [65=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char[] cArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
        int i2 = 2 % 2;
        Zo zo = new Zo();
        char[] cArrOLrzqt = Zo.OLrzqt(KWHzl ^ (-5747691001614856746L), cArr, i);
        zo.KWHzl = 4;
        int i3 = $10 + 5;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (zo.KWHzl < cArrOLrzqt.length) {
            int i5 = $11 + 49;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            zo.OLrzqt = zo.KWHzl - 4;
            int i7 = zo.KWHzl;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(cArrOLrzqt[zo.KWHzl] ^ cArrOLrzqt[zo.KWHzl % 4]), java.lang.Long.valueOf(zo.OLrzqt), java.lang.Long.valueOf(KWHzl)};
                java.lang.Object objEZpvd = YY.EZpvd(1769962791);
                if (objEZpvd == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objEZpvd = YY.EZpvd(368, 5, (char) 0, 1834987611, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE});
                }
                cArrOLrzqt[i7] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                try {
                    java.lang.Object[] objArr3 = {zo, zo};
                    java.lang.Object objEZpvd2 = YY.EZpvd(-1024411099);
                    if (objEZpvd2 == null) {
                        objEZpvd2 = YY.EZpvd(81, 4, (char) 0, -959416487, false, com.ibm.icu.text.DateFormat.YEAR, new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new java.lang.String(cArrOLrzqt, 4, cArrOLrzqt.length - 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [129=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void b(int i, char[] cArr, int i2, int i3, boolean z, java.lang.Object[] objArr) throws java.lang.Throwable {
        int i4 = 2 % 2;
        Zl zl = new Zl();
        char[] cArr2 = new char[i3];
        zl.OLrzqt = 0;
        while (zl.OLrzqt < i3) {
            zl.KWHzl = cArr[zl.OLrzqt];
            cArr2[zl.OLrzqt] = (char) (i + zl.KWHzl);
            int i5 = zl.OLrzqt;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i5]), java.lang.Integer.valueOf(EZpvd)};
                java.lang.Object objEZpvd = YY.EZpvd(1433686791);
                if (objEZpvd == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objEZpvd = YY.EZpvd(625, 5, (char) 0, 1364500091, false, $$e(b, b2, (byte) (b2 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {zl, zl};
                java.lang.Object objEZpvd2 = YY.EZpvd(654343494);
                if (objEZpvd2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objEZpvd2 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b3, b4, (byte) (b4 + 2)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            int i6 = $10 + 9;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            zl.AEQbTJ = i2;
            char[] cArr3 = new char[i3];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i3);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i3 - zl.AEQbTJ, zl.AEQbTJ);
            java.lang.System.arraycopy(cArr3, zl.AEQbTJ, cArr2, 0, i3 - zl.AEQbTJ);
            int i8 = $11 + 17;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i3];
            zl.OLrzqt = 0;
            while (zl.OLrzqt < i3) {
                cArr4[zl.OLrzqt] = cArr2[(i3 - zl.OLrzqt) - 1];
                java.lang.Object[] objArr4 = {zl, zl};
                java.lang.Object objEZpvd3 = YY.EZpvd(654343494);
                if (objEZpvd3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objEZpvd3 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b5, b6, (byte) (b6 + 2)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    static {
        djBIcL = 0;
        AEQbTJ();
        Companion = new ActionBar(null);
        AEQbTJ = new AtomicBoolean(false);
        copydefault = new DetectionInfoBean();
        int i = gEmmrt + 95;
        djBIcL = i % 128;
        int i2 = i % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void OLrzqt(long j, long j2) throws java.lang.Throwable {
        int i = 2 % 2;
        int i2 = valueOf + 49;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        ActionBar actionBar = Companion;
        try {
            java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(273, new char[]{65498, 65511, 21, 1, 18, 4, 65522, 5, 16, 15, 18, 20, 65472, 3, '\b', 5, 3, 11, 65508, 5, 2, 21, 7, 65507, 1, '\f', '\f', 2, 1, 3, 11}, 1, 31, false, objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            int i4 = AhwBna + 51;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 0, objArr2);
            java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr2[0], java.lang.String.class);
            method.setAccessible(true);
            method.invoke(objNewInstance, str);
            java.lang.Object[] objArr3 = {java.lang.Long.valueOf(j3)};
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 0, objArr4);
            java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.Long.TYPE);
            method2.setAccessible(true);
            method2.invoke(objNewInstance, objArr3);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(277, new char[]{'\n', 11, 5, 16, 65535, 1, 16, 1, 65504, 14, 1, 3, 65533, '\n', 65533, 65513, 3, 11, '\b', 65533, 5, 65504}, 9, 22, true, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(new char[]{33464, 33484, 16413, 28344, 25451, 18625, 16044, 50411, 14818, 43398, 31673, 3872}, 0, objArr6);
            java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr6[0], null);
            method3.setAccessible(true);
            java.lang.Object objInvoke = method3.invoke(objNewInstance, null);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(new char[]{21319, 21290, 46892, 39317, 31421, 34855, 10062}, 0, objArr7);
            java.lang.Object[] objArr8 = {objInvoke, (java.lang.String) objArr7[0]};
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            b(279, new char[]{2, 65535, 65533, 5, 65512, '\t', 14, 65512, 15, 6, 6, 65514, 65531, '\f', 65531, 7, 65535, 14, 65535, '\f', 65533}, 20, 21, false, objArr9);
            java.lang.reflect.Method method4 = Intrinsics.class.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.String.class);
            method4.setAccessible(true);
            method4.invoke(null, objArr8);
            if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b(272, new char[]{65473, 15, 16, 21, 65473, '\n', 15, '\n', 21, '\n', 2, '\r', '\n', 27, 6, 65520, '\f', 65517, 16, '\b', 65473, '\n', 20}, 15, 23, false, objArr10);
                java.lang.Object[] objArr11 = {((java.lang.String) objArr10[0]).toString()};
                java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                declaredConstructor2.setAccessible(true);
                throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr11));
            }
            java.lang.Object obj = pUU.class.getField("copydefault").get(null);
            int i6 = valueOf + 39;
            AhwBna = i6 % 128;
            if (i6 % 2 == 0) {
                java.lang.Class[] clsArr = new java.lang.Class[0];
                clsArr[1] = java.lang.Object.class;
                java.lang.reflect.Method method5 = Intrinsics.class.getMethod("copydefault", clsArr);
                method5.setAccessible(false);
                method5.invoke(null, obj);
            } else {
                java.lang.reflect.Method method6 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                method6.setAccessible(true);
                method6.invoke(null, obj);
            }
            java.lang.Object[] objArr12 = {str2, objInvoke};
            java.lang.reflect.Method method7 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
            method7.setAccessible(true);
            method7.invoke(obj, objArr12);
            byte[] bArr = $$a;
            byte b = bArr[6];
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            c((byte) (-b), b, bArr[13], objArr13);
            java.lang.reflect.Method method8 = ActionBar.class.getMethod((java.lang.String) objArr13[0], null);
            method8.setAccessible(true);
            java.lang.Object objInvoke2 = method8.invoke(actionBar, null);
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            a(new char[]{2975, 3062, 46784, 39033, 8950, 1275, 32550, 35008, 45269, 24391, 14893, 17178, 32170, 5032, 61779, 1569, 14995, 55011, 44441, 47429, 59226, 44494}, 0, objArr14);
            DetectionInfoBean.class.getField((java.lang.String) objArr14[0]).setBoolean(objInvoke2, true);
            int i7 = AhwBna + 61;
            valueOf = i7 % 128;
            if (i7 % 2 != 0) {
                byte b2 = bArr[6];
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                c((byte) (-b2), b2, bArr[13], objArr15);
                java.lang.reflect.Method method9 = ActionBar.class.getMethod((java.lang.String) objArr15[0], null);
                method9.setAccessible(true);
                java.lang.Object objInvoke3 = method9.invoke(actionBar, null);
                java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                b(25047, new char[]{'\t', 65508, 2, 16, 65533, 0, 65535, '\n', 1}, 25, 57, false, objArr16);
                DetectionInfoBean.class.getField((java.lang.String) objArr16[0]).set(objInvoke3, lValueOf);
            } else {
                byte b3 = bArr[6];
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                c((byte) (-b3), b3, bArr[13], objArr17);
                java.lang.reflect.Method method10 = ActionBar.class.getMethod((java.lang.String) objArr17[0], null);
                method10.setAccessible(true);
                java.lang.Object objInvoke4 = method10.invoke(actionBar, null);
                java.lang.Long lValueOf2 = java.lang.Long.valueOf(j3);
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                b(278, new char[]{'\t', 65508, 2, 16, 65533, 0, 65535, '\n', 1}, 7, 9, true, objArr18);
                DetectionInfoBean.class.getField((java.lang.String) objArr18[0]).set(objInvoke4, lValueOf2);
            }
            byte b4 = bArr[13];
            byte b5 = (byte) (-bArr[6]);
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            c(b4, (byte) (b4 | 9), b5, objArr19);
            java.lang.reflect.Method method11 = ActionBar.class.getMethod((java.lang.String) objArr19[0], null);
            method11.setAccessible(true);
            method11.invoke(actionBar, null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void EZpvd(long j, long j2) throws java.lang.Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        ActionBar actionBar = Companion;
        try {
            java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new char[]{34164, 34099, 4576, 16223, 22373, 43389, 2704, 9553, 15928, 63552, 20412, 61067, 62283, 46216, 34037, 44019, 46191, 29130, 55308, 5320, 27071, 2767, 7484, 53750, 8912, 50963, 21069, 40244, 59382, 32793, 38784, 18015, 39680, 23904, 11432, 872, 23647, 6608}, 0, objArr);
            java.lang.Object[] objArr2 = {(java.lang.String) objArr[0]};
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 0, objArr3);
            java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr3[0], java.lang.String.class);
            method.setAccessible(true);
            method.invoke(objNewInstance, objArr2);
            java.lang.Object[] objArr4 = {java.lang.Long.valueOf(j3)};
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 0, objArr5);
            java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr5[0], java.lang.Long.TYPE);
            method2.setAccessible(true);
            method2.invoke(objNewInstance, objArr4);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b(277, new char[]{'\n', 11, 5, 16, 65535, 1, 16, 1, 65504, 14, 1, 3, 65533, '\n', 65533, 65513, 3, 11, '\b', 65533, 5, 65504}, 9, 22, true, objArr6);
            java.lang.String str = (java.lang.String) objArr6[0];
            int i2 = AhwBna + 37;
            valueOf = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 4;
            }
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(new char[]{33464, 33484, 16413, 28344, 25451, 18625, 16044, 50411, 14818, 43398, 31673, 3872}, 0, objArr7);
            java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr7[0], null);
            method3.setAccessible(true);
            java.lang.Object objInvoke = method3.invoke(objNewInstance, null);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            a(new char[]{21319, 21290, 46892, 39317, 31421, 34855, 10062}, 0, objArr8);
            java.lang.String str2 = (java.lang.String) objArr8[0];
            int i4 = AhwBna + 125;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            b(279, new char[]{2, 65535, 65533, 5, 65512, '\t', 14, 65512, 15, 6, 6, 65514, 65531, '\f', 65531, 7, 65535, 14, 65535, '\f', 65533}, 20, 21, false, objArr9);
            java.lang.reflect.Method method4 = Intrinsics.class.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.String.class);
            method4.setAccessible(true);
            method4.invoke(null, objInvoke, str2);
            if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b(272, new char[]{65473, 15, 16, 21, 65473, '\n', 15, '\n', 21, '\n', 2, '\r', '\n', 27, 6, 65520, '\f', 65517, 16, '\b', 65473, '\n', 20}, 15, 23, false, objArr10);
                java.lang.Object[] objArr11 = {((java.lang.String) objArr10[0]).toString()};
                java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                declaredConstructor2.setAccessible(true);
                throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr11));
            }
            java.lang.Object obj = pUU.class.getField("copydefault").get(null);
            int i6 = valueOf + 107;
            AhwBna = i6 % 128;
            int i7 = i6 % 2;
            java.lang.reflect.Method method5 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
            method5.setAccessible(true);
            method5.invoke(null, obj);
            int i8 = AhwBna + 35;
            valueOf = i8 % 128;
            int i9 = i8 % 2;
            java.lang.Object[] objArr12 = {str, objInvoke};
            java.lang.reflect.Method method6 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
            method6.setAccessible(true);
            method6.invoke(obj, objArr12);
            int i10 = AhwBna + 19;
            valueOf = i10 % 128;
            int i11 = i10 % 2;
            byte[] bArr = $$a;
            byte b = bArr[6];
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            c((byte) (-b), b, bArr[13], objArr13);
            java.lang.reflect.Method method7 = ActionBar.class.getMethod((java.lang.String) objArr13[0], null);
            method7.setAccessible(true);
            java.lang.Object objInvoke2 = method7.invoke(actionBar, null);
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            b(281, new char[]{6, 65501, 5, '\r', 4, 65529, '\f', 7, '\n', 1, 11, 65514, '\r', 6, 6, 1, 6, 65535, 65505}, 9, 19, false, objArr14);
            DetectionInfoBean.class.getField((java.lang.String) objArr14[0]).setBoolean(objInvoke2, true);
            byte b2 = bArr[6];
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            c((byte) (-b2), b2, bArr[13], objArr15);
            java.lang.reflect.Method method8 = ActionBar.class.getMethod((java.lang.String) objArr15[0], null);
            method8.setAccessible(true);
            java.lang.Object objInvoke3 = method8.invoke(actionBar, null);
            java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            b(278, new char[]{'\t', 65508, 2, 16, 65533, 0, 65535, '\n', 1}, 7, 9, true, objArr16);
            DetectionInfoBean.class.getField((java.lang.String) objArr16[0]).set(objInvoke3, lValueOf);
            byte b3 = bArr[13];
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            c(b3, (byte) (b3 | 9), (byte) (-bArr[6]), objArr17);
            java.lang.reflect.Method method9 = ActionBar.class.getMethod((java.lang.String) objArr17[0], null);
            method9.setAccessible(true);
            method9.invoke(actionBar, null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void AEQbTJ(long j, long j2) throws java.lang.Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        ActionBar actionBar = Companion;
        try {
            java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new char[]{44326, 44385, 1484, 11123, 2759, 35062, 22322, 1242, 5738, 60524, 4638, 52992, 56089, 41124, 55639, 35448, 39997, 26086, 34222, 13635, 16877, 7918, 16540, 61543, 2693, 54045, 4090, 48316, 53178, 37908, 51746, 26587, 45909, 18708}, 0, objArr);
            java.lang.Object[] objArr2 = {(java.lang.String) objArr[0]};
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 0, objArr3);
            java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr3[0], java.lang.String.class);
            method.setAccessible(true);
            method.invoke(objNewInstance, objArr2);
            int i2 = AhwBna + 81;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            java.lang.Object[] objArr4 = {java.lang.Long.valueOf(j3)};
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 0, objArr5);
            java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr5[0], java.lang.Long.TYPE);
            method2.setAccessible(true);
            method2.invoke(objNewInstance, objArr4);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b(277, new char[]{'\n', 11, 5, 16, 65535, 1, 16, 1, 65504, 14, 1, 3, 65533, '\n', 65533, 65513, 3, 11, '\b', 65533, 5, 65504}, 9, 22, true, objArr6);
            java.lang.String str = (java.lang.String) objArr6[0];
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(new char[]{33464, 33484, 16413, 28344, 25451, 18625, 16044, 50411, 14818, 43398, 31673, 3872}, 0, objArr7);
            java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr7[0], null);
            method3.setAccessible(true);
            java.lang.Object objInvoke = method3.invoke(objNewInstance, null);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            a(new char[]{21319, 21290, 46892, 39317, 31421, 34855, 10062}, 0, objArr8);
            java.lang.Object[] objArr9 = {objInvoke, (java.lang.String) objArr8[0]};
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            b(279, new char[]{2, 65535, 65533, 5, 65512, '\t', 14, 65512, 15, 6, 6, 65514, 65531, '\f', 65531, 7, 65535, 14, 65535, '\f', 65533}, 20, 21, false, objArr10);
            java.lang.reflect.Method method4 = Intrinsics.class.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.String.class);
            method4.setAccessible(true);
            method4.invoke(null, objArr9);
            if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(272, new char[]{65473, 15, 16, 21, 65473, '\n', 15, '\n', 21, '\n', 2, '\r', '\n', 27, 6, 65520, '\f', 65517, 16, '\b', 65473, '\n', 20}, 15, 23, false, objArr11);
                java.lang.Object[] objArr12 = {((java.lang.String) objArr11[0]).toString()};
                java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                declaredConstructor2.setAccessible(true);
                throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr12));
            }
            java.lang.Object obj = pUU.class.getField("copydefault").get(null);
            java.lang.reflect.Method method5 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
            method5.setAccessible(true);
            method5.invoke(null, obj);
            int i4 = valueOf + 19;
            AhwBna = i4 % 128;
            int i5 = i4 % 2;
            java.lang.Object[] objArr13 = {str, objInvoke};
            java.lang.reflect.Method method6 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
            method6.setAccessible(true);
            method6.invoke(obj, objArr13);
            byte[] bArr = $$a;
            byte b = bArr[6];
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            c((byte) (-b), b, bArr[13], objArr14);
            java.lang.reflect.Method method7 = ActionBar.class.getMethod((java.lang.String) objArr14[0], null);
            method7.setAccessible(true);
            java.lang.Object objInvoke2 = method7.invoke(actionBar, null);
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            b(280, new char[]{4, 65534, 65533, 2, '\f', 65498, '\t', '\t', 5, 2, 65532, 65530, '\r', 2, '\b', 7, 65505, '\b', '\b'}, 3, 19, false, objArr15);
            DetectionInfoBean.class.getField((java.lang.String) objArr15[0]).setBoolean(objInvoke2, true);
            byte b2 = bArr[6];
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            c((byte) (-b2), b2, bArr[13], objArr16);
            java.lang.reflect.Method method8 = ActionBar.class.getMethod((java.lang.String) objArr16[0], null);
            method8.setAccessible(true);
            java.lang.Object objInvoke3 = method8.invoke(actionBar, null);
            java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            b(278, new char[]{'\t', 65508, 2, 16, 65533, 0, 65535, '\n', 1}, 7, 9, true, objArr17);
            DetectionInfoBean.class.getField((java.lang.String) objArr17[0]).set(objInvoke3, lValueOf);
            int i6 = AhwBna + 41;
            valueOf = i6 % 128;
            int i7 = i6 % 2;
            byte b3 = bArr[13];
            byte b4 = (byte) (-bArr[6]);
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            c(b3, (byte) (b3 | 9), b4, objArr18);
            java.lang.reflect.Method method9 = ActionBar.class.getMethod((java.lang.String) objArr18[0], null);
            method9.setAccessible(true);
            method9.invoke(actionBar, null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void djBIcL(long j, long j2) throws java.lang.Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        ActionBar actionBar = Companion;
        try {
            java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(276, new char[]{65508, 18, 65534, 15, 1, 65519, 2, '\r', '\f', 15, 17, 65469, 0, 5, 2, 0, '\b', 65514, 2, '\n', '\f', 15, 22, 65520, 0, 65534, 11, 11, 6, 11, 4, 65521, 65534, '\n', '\r', 2, 15, 65504, 65534, '\t', '\t', 65535, 65534, 0, '\b', 65495}, 46, 46, false, objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            int i2 = valueOf + 83;
            AhwBna = i2 % 128;
            int i3 = i2 % 2;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 0, objArr2);
            java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr2[0], java.lang.String.class);
            method.setAccessible(true);
            method.invoke(objNewInstance, str);
            int i4 = valueOf + 69;
            int i5 = i4 % 128;
            AhwBna = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 89;
            valueOf = i7 % 128;
            int i8 = i7 % 2;
            java.lang.Object[] objArr3 = {java.lang.Long.valueOf(j3)};
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 0, objArr4);
            java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.Long.TYPE);
            method2.setAccessible(true);
            method2.invoke(objNewInstance, objArr3);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(277, new char[]{'\n', 11, 5, 16, 65535, 1, 16, 1, 65504, 14, 1, 3, 65533, '\n', 65533, 65513, 3, 11, '\b', 65533, 5, 65504}, 9, 22, true, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(new char[]{33464, 33484, 16413, 28344, 25451, 18625, 16044, 50411, 14818, 43398, 31673, 3872}, 0, objArr6);
            java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr6[0], null);
            method3.setAccessible(true);
            java.lang.Object objInvoke = method3.invoke(objNewInstance, null);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(new char[]{21319, 21290, 46892, 39317, 31421, 34855, 10062}, 0, objArr7);
            java.lang.String str3 = (java.lang.String) objArr7[0];
            int i9 = valueOf + 13;
            AhwBna = i9 % 128;
            int i10 = i9 % 2;
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            b(279, new char[]{2, 65535, 65533, 5, 65512, '\t', 14, 65512, 15, 6, 6, 65514, 65531, '\f', 65531, 7, 65535, 14, 65535, '\f', 65533}, 20, 21, false, objArr8);
            java.lang.reflect.Method method4 = Intrinsics.class.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.String.class);
            method4.setAccessible(true);
            method4.invoke(null, objInvoke, str3);
            if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b(272, new char[]{65473, 15, 16, 21, 65473, '\n', 15, '\n', 21, '\n', 2, '\r', '\n', 27, 6, 65520, '\f', 65517, 16, '\b', 65473, '\n', 20}, 15, 23, false, objArr9);
                java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).toString()};
                java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                declaredConstructor2.setAccessible(true);
                throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr10));
            }
            int i11 = valueOf + 67;
            AhwBna = i11 % 128;
            if (i11 % 2 == 0) {
                pUU.class.getField("copydefault").get(null);
                throw null;
            }
            java.lang.Object obj = pUU.class.getField("copydefault").get(null);
            java.lang.reflect.Method method5 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
            method5.setAccessible(true);
            method5.invoke(null, obj);
            int i12 = AhwBna + 19;
            valueOf = i12 % 128;
            if (i12 % 2 != 0) {
                java.lang.Object[] objArr11 = new java.lang.Object[3];
                objArr11[1] = objInvoke;
                objArr11[0] = str2;
                java.lang.Class[] clsArr = new java.lang.Class[4];
                clsArr[1] = java.lang.String.class;
                clsArr[0] = java.lang.String.class;
                java.lang.reflect.Method method6 = pUP.class.getMethod("copydefault", clsArr);
                method6.setAccessible(true);
                method6.invoke(obj, objArr11);
            } else {
                java.lang.Object[] objArr12 = {str2, objInvoke};
                java.lang.reflect.Method method7 = pUP.class.getMethod("copydefault", java.lang.String.class, java.lang.String.class);
                method7.setAccessible(true);
                method7.invoke(obj, objArr12);
            }
            byte[] bArr = $$a;
            byte b = bArr[6];
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            c((byte) (-b), b, bArr[13], objArr13);
            java.lang.reflect.Method method8 = ActionBar.class.getMethod((java.lang.String) objArr13[0], null);
            method8.setAccessible(true);
            java.lang.Object objInvoke2 = method8.invoke(actionBar, null);
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            b(281, new char[]{6, 1, 6, 65535, 1, 11, 65509, 65533, 5, 7, '\n', 17, 65515, 65531, 65529, 6}, 4, 16, false, objArr14);
            DetectionInfoBean.class.getField((java.lang.String) objArr14[0]).setBoolean(objInvoke2, true);
            byte b2 = bArr[6];
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            c((byte) (-b2), b2, bArr[13], objArr15);
            java.lang.reflect.Method method9 = ActionBar.class.getMethod((java.lang.String) objArr15[0], null);
            method9.setAccessible(true);
            java.lang.Object objInvoke3 = method9.invoke(actionBar, null);
            java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            b(278, new char[]{'\t', 65508, 2, 16, 65533, 0, 65535, '\n', 1}, 7, 9, true, objArr16);
            DetectionInfoBean.class.getField((java.lang.String) objArr16[0]).set(objInvoke3, lValueOf);
            int i13 = valueOf + 43;
            AhwBna = i13 % 128;
            if (i13 % 2 == 0) {
                byte b3 = bArr[13];
                byte b4 = (byte) (-bArr[6]);
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                c(b3, (byte) (b3 | 9), b4, objArr17);
                java.lang.reflect.Method method10 = ActionBar.class.getMethod((java.lang.String) objArr17[0], null);
                method10.setAccessible(true);
                method10.invoke(actionBar, null);
                return;
            }
            byte b5 = bArr[13];
            byte b6 = (byte) (-bArr[6]);
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            c(b5, (byte) (b5 | 9), b6, objArr18);
            java.lang.reflect.Method method11 = ActionBar.class.getMethod((java.lang.String) objArr18[0], null);
            method11.setAccessible(true);
            method11.invoke(actionBar, null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void KWHzl(long j, long j2) throws java.lang.Throwable {
        java.lang.Object objInvoke;
        java.lang.String str;
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        ActionBar actionBar = Companion;
        int i2 = AhwBna + 53;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        try {
            java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new char[]{12483, 12420, 57484, 52787, 63634, 20357, 42343, 50089, 35727, 2348, 57419, 2163, 18172, 17892, 11010, 19723, 472, 32934, 30715, 62000, 56328, 64436, 45769, 14100, 38783, 13917, 64943, 31695, 21087, 29012, 14455, 41128, 11952, 44116}, 0, objArr);
            java.lang.String str2 = (java.lang.String) objArr[0];
            int i4 = AhwBna + 15;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 0, objArr2);
            java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr2[0], java.lang.String.class);
            method.setAccessible(true);
            method.invoke(objNewInstance, str2);
            int i6 = AhwBna + 11;
            valueOf = i6 % 128;
            int i7 = i6 % 2;
            java.lang.Object[] objArr3 = {java.lang.Long.valueOf(j3)};
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 0, objArr4);
            java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.Long.TYPE);
            method2.setAccessible(true);
            method2.invoke(objNewInstance, objArr3);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(277, new char[]{'\n', 11, 5, 16, 65535, 1, 16, 1, 65504, 14, 1, 3, 65533, '\n', 65533, 65513, 3, 11, '\b', 65533, 5, 65504}, 9, 22, true, objArr5);
            java.lang.String str3 = (java.lang.String) objArr5[0];
            int i8 = valueOf + 19;
            AhwBna = i8 % 128;
            if (i8 % 2 == 0) {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(new char[]{33464, 33484, 16413, 28344, 25451, 18625, 16044, 50411, 14818, 43398, 31673, 3872}, 0, objArr6);
                java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr6[0], null);
                method3.setAccessible(true);
                objInvoke = method3.invoke(objNewInstance, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a(new char[]{21319, 21290, 46892, 39317, 31421, 34855, 10062}, 1, objArr7);
                str = (java.lang.String) objArr7[0];
            } else {
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                a(new char[]{33464, 33484, 16413, 28344, 25451, 18625, 16044, 50411, 14818, 43398, 31673, 3872}, 0, objArr8);
                java.lang.reflect.Method method4 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr8[0], null);
                method4.setAccessible(true);
                objInvoke = method4.invoke(objNewInstance, null);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(new char[]{21319, 21290, 46892, 39317, 31421, 34855, 10062}, 0, objArr9);
                str = (java.lang.String) objArr9[0];
            }
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            b(279, new char[]{2, 65535, 65533, 5, 65512, '\t', 14, 65512, 15, 6, 6, 65514, 65531, '\f', 65531, 7, 65535, 14, 65535, '\f', 65533}, 20, 21, false, objArr10);
            java.lang.reflect.Method method5 = Intrinsics.class.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.String.class);
            method5.setAccessible(true);
            method5.invoke(null, objInvoke, str);
            if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(272, new char[]{65473, 15, 16, 21, 65473, '\n', 15, '\n', 21, '\n', 2, '\r', '\n', 27, 6, 65520, '\f', 65517, 16, '\b', 65473, '\n', 20}, 15, 23, false, objArr11);
                java.lang.String string = ((java.lang.String) objArr11[0]).toString();
                int i9 = AhwBna + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                valueOf = i9 % 128;
                int i10 = i9 % 2;
                java.lang.Object[] objArr12 = {string};
                java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                declaredConstructor2.setAccessible(true);
                throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr12));
            }
            int i11 = valueOf + 91;
            AhwBna = i11 % 128;
            int i12 = i11 % 2;
            java.lang.Object obj = pUU.class.getField("copydefault").get(null);
            java.lang.reflect.Method method6 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
            method6.setAccessible(true);
            method6.invoke(null, obj);
            java.lang.Object[] objArr13 = {str3, objInvoke};
            java.lang.reflect.Method method7 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
            method7.setAccessible(true);
            method7.invoke(obj, objArr13);
            int i13 = valueOf + 5;
            AhwBna = i13 % 128;
            int i14 = i13 % 2;
            byte[] bArr = $$a;
            byte b = bArr[6];
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            c((byte) (-b), b, bArr[13], objArr14);
            java.lang.reflect.Method method8 = ActionBar.class.getMethod((java.lang.String) objArr14[0], null);
            method8.setAccessible(true);
            java.lang.Object objInvoke2 = method8.invoke(actionBar, null);
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            b(279, new char[]{16, 65535, 65502, '\r', 3, 65534, 65535, 14, '\t', '\t', 65516, 65535, 65533, 3}, 5, 14, true, objArr15);
            DetectionInfoBean.class.getField((java.lang.String) objArr15[0]).setBoolean(objInvoke2, true);
            int i15 = valueOf + 21;
            AhwBna = i15 % 128;
            int i16 = i15 % 2;
            byte b2 = bArr[6];
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            c((byte) (-b2), b2, bArr[13], objArr16);
            java.lang.reflect.Method method9 = ActionBar.class.getMethod((java.lang.String) objArr16[0], null);
            method9.setAccessible(true);
            java.lang.Object objInvoke3 = method9.invoke(actionBar, null);
            java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            b(278, new char[]{'\t', 65508, 2, 16, 65533, 0, 65535, '\n', 1}, 7, 9, true, objArr17);
            DetectionInfoBean.class.getField((java.lang.String) objArr17[0]).set(objInvoke3, lValueOf);
            byte b3 = bArr[13];
            byte b4 = (byte) (-bArr[6]);
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            c(b3, (byte) (b3 | 9), b4, objArr18);
            java.lang.reflect.Method method10 = ActionBar.class.getMethod((java.lang.String) objArr18[0], null);
            method10.setAccessible(true);
            method10.invoke(actionBar, null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void copydefault(long j, long j2) throws java.lang.Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        ActionBar actionBar = Companion;
        int i2 = AhwBna + 107;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        try {
            java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(277, new char[]{65534, '\b', '\b', 65533, 65503, 16, '\n', 1, '\t', '\n', 11, 14, 5, 18, '\n', 65505, '\b', 65533, 17, 16, 14, 5, 65522, 7, 65535, 1, 4, 65535, 65468, 16, 14, 11, '\f', 1, 65518, 0, 14, 65533, 17, 65507, 65494, 7, 65535, 65533}, 40, 44, true, objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            int i4 = valueOf + 81;
            AhwBna = i4 % 128;
            if (i4 % 2 == 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                objArr2[1] = str;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 1, objArr3);
                java.lang.String str2 = (java.lang.String) objArr3[0];
                java.lang.Class[] clsArr = new java.lang.Class[0];
                clsArr[1] = java.lang.String.class;
                java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod(str2, clsArr);
                method.setAccessible(true);
                method.invoke(objNewInstance, objArr2);
            } else {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 0, objArr4);
                java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.String.class);
                method2.setAccessible(true);
                method2.invoke(objNewInstance, str);
            }
            java.lang.Object[] objArr5 = {java.lang.Long.valueOf(j3)};
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(new char[]{63245, 63340, 32184, 21250, 14455, 30278, 26003, 64125, 19531, 37934}, 0, objArr6);
            java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr6[0], java.lang.Long.TYPE);
            method3.setAccessible(true);
            method3.invoke(objNewInstance, objArr5);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            b(277, new char[]{'\n', 11, 5, 16, 65535, 1, 16, 1, 65504, 14, 1, 3, 65533, '\n', 65533, 65513, 3, 11, '\b', 65533, 5, 65504}, 9, 22, true, objArr7);
            java.lang.String str3 = (java.lang.String) objArr7[0];
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            a(new char[]{33464, 33484, 16413, 28344, 25451, 18625, 16044, 50411, 14818, 43398, 31673, 3872}, 0, objArr8);
            java.lang.reflect.Method method4 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr8[0], null);
            method4.setAccessible(true);
            java.lang.Object objInvoke = method4.invoke(objNewInstance, null);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            a(new char[]{21319, 21290, 46892, 39317, 31421, 34855, 10062}, 0, objArr9);
            java.lang.String str4 = (java.lang.String) objArr9[0];
            int i5 = valueOf + 83;
            AhwBna = i5 % 128;
            int i6 = i5 % 2;
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            b(279, new char[]{2, 65535, 65533, 5, 65512, '\t', 14, 65512, 15, 6, 6, 65514, 65531, '\f', 65531, 7, 65535, 14, 65535, '\f', 65533}, 20, 21, false, objArr10);
            java.lang.reflect.Method method5 = Intrinsics.class.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.String.class);
            method5.setAccessible(true);
            method5.invoke(null, objInvoke, str4);
            if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(272, new char[]{65473, 15, 16, 21, 65473, '\n', 15, '\n', 21, '\n', 2, '\r', '\n', 27, 6, 65520, '\f', 65517, 16, '\b', 65473, '\n', 20}, 15, 23, false, objArr11);
                java.lang.Object[] objArr12 = {((java.lang.String) objArr11[0]).toString()};
                java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                declaredConstructor2.setAccessible(true);
                throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr12));
            }
            java.lang.Object obj = pUU.class.getField("copydefault").get(null);
            java.lang.reflect.Method method6 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
            method6.setAccessible(true);
            method6.invoke(null, obj);
            java.lang.Object[] objArr13 = {str3, objInvoke};
            java.lang.reflect.Method method7 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
            method7.setAccessible(true);
            method7.invoke(obj, objArr13);
            byte[] bArr = $$a;
            byte b = bArr[6];
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            c((byte) (-b), b, bArr[13], objArr14);
            java.lang.reflect.Method method8 = ActionBar.class.getMethod((java.lang.String) objArr14[0], null);
            method8.setAccessible(true);
            java.lang.Object objInvoke2 = method8.invoke(actionBar, null);
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            b(282, new char[]{5, 5, 0, 5, 65534, 65504, 5, 65517, 0, '\t', 11, '\f', 65528, 3, 65500, 5, '\r', 0, '\t', 6, 5, 4, 65532, 5, 11, 0, '\n', 65513, '\f'}, 25, 29, false, objArr15);
            DetectionInfoBean.class.getField((java.lang.String) objArr15[0]).setBoolean(objInvoke2, true);
            int i7 = AhwBna + 49;
            valueOf = i7 % 128;
            int i8 = i7 % 2;
            byte b2 = bArr[6];
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            c((byte) (-b2), b2, bArr[13], objArr16);
            java.lang.reflect.Method method9 = ActionBar.class.getMethod((java.lang.String) objArr16[0], null);
            method9.setAccessible(true);
            java.lang.Object objInvoke3 = method9.invoke(actionBar, null);
            java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            b(278, new char[]{'\t', 65508, 2, 16, 65533, 0, 65535, '\n', 1}, 7, 9, true, objArr17);
            DetectionInfoBean.class.getField((java.lang.String) objArr17[0]).set(objInvoke3, lValueOf);
            int i9 = valueOf;
            int i10 = i9 + 121;
            AhwBna = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 19;
            AhwBna = i12 % 128;
            if (i12 % 2 == 0) {
                byte b3 = bArr[13];
                byte b4 = (byte) (-bArr[6]);
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                c(b3, (byte) (b3 | 9), b4, objArr18);
                java.lang.reflect.Method method10 = ActionBar.class.getMethod((java.lang.String) objArr18[0], null);
                method10.setAccessible(true);
                method10.invoke(actionBar, null);
                return;
            }
            byte b5 = bArr[13];
            byte b6 = (byte) (-bArr[6]);
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            c(b5, (byte) (b5 | 9), b6, objArr19);
            java.lang.reflect.Method method11 = ActionBar.class.getMethod((java.lang.String) objArr19[0], null);
            method11.setAccessible(true);
            method11.invoke(actionBar, null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void AEQbTJ() {
        KWHzl = 7285373751877935900L;
        EZpvd = 1694165162;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CHECK_CAST (com.okinc.base.bugreport.DetectionInfoBean) (wrap:java.lang.Object:0x0019: INVOKE 
  (wrap:int:0x0003: INVOKE  STATIC call: o.mlw.Activity.KWHzl():int A[MD:():int (m), WRAPPED])
  (-1683766950 int)
  (wrap:java.lang.Object[]:0x0001: NEW_ARRAY (0 int) A[WRAPPED] (LINE:65354) type: java.lang.Object[])
  (1683766950 int)
  (wrap:int:0x0007: INVOKE  STATIC call: o.mlw.Activity.KWHzl():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000f: INVOKE  STATIC call: o.mlw.Activity.KWHzl():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000b: INVOKE  STATIC call: o.mlw.Activity.KWHzl():int A[MD:():int (m), WRAPPED])
 STATIC call: o.sDl.OLrzqt(int, int, java.lang.Object[], int, int, int, int):java.lang.Object A[MD:(int, int, java.lang.Object[], int, int, int, int):java.lang.Object (m), WRAPPED] (LINE:65354)) */
    public static final /* synthetic */ DetectionInfoBean EZpvd() {
        return (DetectionInfoBean) OLrzqt(C32883mlw.Activity.KWHzl(), -1683766950, new java.lang.Object[0], 1683766950, C32883mlw.Activity.KWHzl(), C32883mlw.Activity.KWHzl(), C32883mlw.Activity.KWHzl());
    }
}
