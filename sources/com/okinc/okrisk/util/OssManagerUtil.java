package com.okinc.okrisk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Base64;
import com.alibaba.sdk.android.oss.ClientConfiguration;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.OSS;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.alibaba.sdk.android.oss.model.ObjectMetadata;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.alibaba.sdk.android.oss.model.PutObjectResult;
import com.amplifyframework.core.model.ModelIdentifier;
import com.appsflyer.AdRevenueScheme;
import com.okinc.okrisk.util.OssManagerUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32979mnm;
import o.C43248rlh;
import o.C56444yFp;
import o.C59449zhJ;
import o.InterfaceC46984thV;
import o.InterfaceC56445yFq;
import o.pUU;
import o.yFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class OssManagerUtil {
    public static volatile OssManagerUtil AEQbTJ;
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final Context AYXKKw;
    public final ConcurrentHashMap<String, AtomicBoolean> KWHzl;
    public final Activity OLrzqt;
    public final String copydefault;
    public final OSS gEmmrt;

    public final /* synthetic */ class Fragment {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NetworkUploadPolicy.values().length];
            try {
                iArr[NetworkUploadPolicy.WIFI_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkUploadPolicy.WIFI_OR_MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public interface StateListAnimator {
        void EZpvd(boolean z, UploadError uploadError);
    }

    public interface TaskDescription {
        void AEQbTJ(@NotNull UploadError uploadError);

        void EZpvd();

        void OLrzqt(int i, long j, long j2);

        void OLrzqt(@NotNull Dialog.ActionBar actionBar);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 com.alibaba.sdk.android.oss.OSS)
  (r3v0 java.lang.String)
  (r4v0 com.okinc.okrisk.util.OssManagerUtil$Activity)
 A[MD:(android.content.Context, com.alibaba.sdk.android.oss.OSS, java.lang.String, com.okinc.okrisk.util.OssManagerUtil$Activity):void (m)] call: com.okinc.okrisk.util.OssManagerUtil.<init>(android.content.Context, com.alibaba.sdk.android.oss.OSS, java.lang.String, com.okinc.okrisk.util.OssManagerUtil$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OssManagerUtil(Context context, OSS oss, String str, Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, oss, str, activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity copydefault() {
        return this.OLrzqt;
    }

    public OssManagerUtil(Context context, OSS oss, String str, Activity activity) {
        this.AYXKKw = context;
        this.gEmmrt = oss;
        this.copydefault = str;
        this.OLrzqt = activity;
        this.KWHzl = new ConcurrentHashMap<>();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.util.OssManagerUtil.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final OssManagerUtil OLrzqt(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(activity, "");
            OssManagerUtil ossManagerUtil = OssManagerUtil.AEQbTJ;
            if (ossManagerUtil == null) {
                synchronized (this) {
                    ossManagerUtil = OssManagerUtil.AEQbTJ;
                    if (ossManagerUtil == null) {
                        Application application = OssManagerUtil.Companion;
                        OSSStsTokenCredentialProvider oSSStsTokenCredentialProvider = new OSSStsTokenCredentialProvider(str3, str4, str5);
                        ClientConfiguration clientConfiguration = new ClientConfiguration();
                        clientConfiguration.setConnectionTimeout(activity.KWHzl());
                        clientConfiguration.setSocketTimeout(activity.AYXKKw());
                        clientConfiguration.setMaxErrorRetry(activity.copydefault());
                        OSSLog.enableLog();
                        OssManagerUtil ossManagerUtil2 = new OssManagerUtil(context, new OSSClient(context, str, oSSStsTokenCredentialProvider, clientConfiguration), str2, activity, null);
                        OssManagerUtil.AEQbTJ = ossManagerUtil2;
                        ossManagerUtil = ossManagerUtil2;
                    }
                }
            }
            return ossManagerUtil;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NetworkUploadPolicy {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ NetworkUploadPolicy[] $VALUES;
        public static final NetworkUploadPolicy WIFI_ONLY = new NetworkUploadPolicy("WIFI_ONLY", 0);
        public static final NetworkUploadPolicy WIFI_OR_MOBILE = new NetworkUploadPolicy("WIFI_OR_MOBILE", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ NetworkUploadPolicy[] $values() {
            return new NetworkUploadPolicy[]{WIFI_ONLY, WIFI_OR_MOBILE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<NetworkUploadPolicy> getEntries() {
            return $ENTRIES;
        }

        private NetworkUploadPolicy(String str, int i) {
        }

        static {
            NetworkUploadPolicy[] networkUploadPolicyArr$values = $values();
            $VALUES = networkUploadPolicyArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(networkUploadPolicyArr$values);
        }

        public static NetworkUploadPolicy valueOf(String str) {
            return (NetworkUploadPolicy) Enum.valueOf(NetworkUploadPolicy.class, str);
        }

        public static NetworkUploadPolicy[] values() {
            return (NetworkUploadPolicy[]) $VALUES.clone();
        }
    }

    public static final class Activity {
        public final int AEQbTJ;
        public final int AYXKKw;
        public final long AhwBna;
        public final boolean EZpvd;
        public final int KWHzl;
        public final String OLrzqt;
        public final int copydefault;
        public final NetworkUploadPolicy djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(0, false, 0, 0L, null, 0, 0, null, 255, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(int i, boolean z, int i2, long j, @NotNull String str, int i3, int i4, @NotNull NetworkUploadPolicy networkUploadPolicy) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(networkUploadPolicy, "");
            return new Activity(i, z, i2, j, str, i3, i4, networkUploadPolicy);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.copydefault == activity.copydefault && this.EZpvd == activity.EZpvd && this.AEQbTJ == activity.AEQbTJ && this.AhwBna == activity.AhwBna && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) activity.OLrzqt) && this.KWHzl == activity.KWHzl && this.AYXKKw == activity.AYXKKw && this.djBIcL == activity.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkUploadPolicy gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((Integer.hashCode(this.copydefault) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + Long.hashCode(this.AhwBna)) * 31) + this.OLrzqt.hashCode()) * 31) + Integer.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.AYXKKw)) * 31) + this.djBIcL.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UploadConfig(maxFileSizeMB=" + this.copydefault + ", enableMD5Verification=" + this.EZpvd + ", maxRetries=" + this.AEQbTJ + ", retryDelayMs=" + this.AhwBna + ", logTag=" + this.OLrzqt + ", connectionTimeoutMs=" + this.KWHzl + ", socketTimeoutMs=" + this.AYXKKw + ", networkUploadPolicy=" + this.djBIcL + ")";
        }

        public Activity(int i, boolean z, int i2, long j, @NotNull String str, int i3, int i4, @NotNull NetworkUploadPolicy networkUploadPolicy) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(networkUploadPolicy, "");
            this.copydefault = i;
            this.EZpvd = z;
            this.AEQbTJ = i2;
            this.AhwBna = j;
            this.OLrzqt = str;
            this.KWHzl = i3;
            this.AYXKKw = i4;
            this.djBIcL = networkUploadPolicy;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0051: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (500 int) : (r10v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r12v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0018: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1000 long) : (r13v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("OSS_UPLOAD") : (r15v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0028: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (15000 int) : (r16v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0031: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (180000 int) : (r17v0 int))
  (wrap:com.okinc.okrisk.util.OssManagerUtil$NetworkUploadPolicy:?: TERNARY null = ((wrap:int:0x003b: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: SGET  A[WRAPPED] (LINE:127) com.okinc.okrisk.util.OssManagerUtil.NetworkUploadPolicy.WIFI_ONLY com.okinc.okrisk.util.OssManagerUtil$NetworkUploadPolicy) : (r18v0 com.okinc.okrisk.util.OssManagerUtil$NetworkUploadPolicy))
 A[MD:(int, boolean, int, long, java.lang.String, int, int, com.okinc.okrisk.util.OssManagerUtil$NetworkUploadPolicy):void (m)] (LINE:119) call: com.okinc.okrisk.util.OssManagerUtil.Activity.<init>(int, boolean, int, long, java.lang.String, int, int, com.okinc.okrisk.util.OssManagerUtil$NetworkUploadPolicy):void type: THIS */
        public /* synthetic */ Activity(int i, boolean z, int i2, long j, String str, int i3, int i4, NetworkUploadPolicy networkUploadPolicy, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 500 : i, (i5 & 2) != 0 ? true : z, (i5 & 4) != 0 ? 3 : i2, (i5 & 8) != 0 ? 1000L : j, (i5 & 16) != 0 ? "OSS_UPLOAD" : str, (i5 & 32) != 0 ? 15000 : i3, (i5 & 64) != 0 ? 180000 : i4, (i5 & 128) != 0 ? NetworkUploadPolicy.WIFI_ONLY : networkUploadPolicy);
        }
    }

    public static abstract class Dialog {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.util.OssManagerUtil.Dialog.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Dialog(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class ActionBar extends Dialog {
            public static final ActionBar EZpvd = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        private Dialog() {
        }
    }

    public static abstract class UploadError extends Exception {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.Throwable) A[MD:(java.lang.String, java.lang.Throwable):void (m)] call: com.okinc.okrisk.util.OssManagerUtil.UploadError.<init>(java.lang.String, java.lang.Throwable):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ UploadError(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th);
        }

        public static final class FileNotFound extends UploadError {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FileNotFound(@NotNull String str) {
                super("File not found: " + str, null, 2, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(str, "");
            }
        }

        private UploadError(String str, Throwable th) {
            super(str, th);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.Throwable, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:141) call: com.okinc.okrisk.util.OssManagerUtil.UploadError.<init>(java.lang.String, java.lang.Throwable, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
        public /* synthetic */ UploadError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th, null);
        }

        public static final class FileTooLarge extends UploadError {
            public static final int $stable = 0;

            public FileTooLarge(long j, long j2) {
                super("File too large: " + j + "MB > " + j2 + "MB", null, 2, 0 == true ? 1 : 0);
            }
        }

        public static final class InvalidObjectKey extends UploadError {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidObjectKey(@NotNull String str) {
                super("Invalid object key: " + str, null, 2, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(str, "");
            }
        }

        public static final class MD5CalculationFailed extends UploadError {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MD5CalculationFailed(@NotNull Throwable th) {
                super("MD5 calculation failed", th, null);
                Intrinsics.checkNotNullParameter(th, "");
            }
        }

        public static final class NetworkError extends UploadError {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(@NotNull Throwable th) {
                super("Network error during upload", th, null);
                Intrinsics.checkNotNullParameter(th, "");
            }
        }

        public static final class ServiceError extends UploadError {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ServiceError(String str, String str2, @NotNull Throwable th) {
                super("OSS service error: " + str + " (RequestId: " + str2 + ")", th, null);
                Intrinsics.checkNotNullParameter(th, "");
            }
        }

        public static final class UploadCancelled extends UploadError {
            public static final int $stable = 0;

            public UploadCancelled() {
                super("Upload was cancelled", null, 2, 0 == true ? 1 : 0);
            }
        }

        public static final class CountryNotSupported extends UploadError {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CountryNotSupported(@NotNull String str) {
                super("Upload not supported in country: " + str, null, 2, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(str, "");
            }
        }

        public static final class WiFiNotConnected extends UploadError {
            public static final int $stable = 0;

            public WiFiNotConnected() {
                super("WiFi connection required for upload", null, 2, 0 == true ? 1 : 0);
            }
        }

        public static final class WiFiSignalWeak extends UploadError {
            public static final int $stable = 0;

            public WiFiSignalWeak(int i) {
                super("WiFi signal too weak for upload: " + i + " dBm", null, 2, 0 == true ? 1 : 0);
            }
        }

        public static final class NetworkNotAvailable extends UploadError {
            public static final int $stable = 0;

            public NetworkNotAvailable() {
                super("No network connection available for upload", null, 2, 0 == true ? 1 : 0);
            }
        }

        public static final class UnknownError extends UploadError {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnknownError(@NotNull Throwable th) {
                super("Unknown error occurred", th, null);
                Intrinsics.checkNotNullParameter(th, "");
            }
        }
    }

    public final String OLrzqt(@NotNull String str, @NotNull String str2, @NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        String strAEQbTJ = AEQbTJ(str);
        pUU.KWHzl(this.OLrzqt.AEQbTJ(), "OssManagerUtil Upload started | ID: " + strAEQbTJ + " | ObjectKey: " + str + " | FilePath: " + str2);
        this.KWHzl.put(strAEQbTJ, new AtomicBoolean(false));
        try {
            KWHzl(str, str2);
            File file = new File(str2);
            taskDescription.EZpvd();
            KWHzl(copydefault(str, str2, file, strAEQbTJ, taskDescription), strAEQbTJ, taskDescription);
        } catch (Exception e) {
            this.KWHzl.remove(strAEQbTJ);
            UploadError uploadErrorOLrzqt = OLrzqt(e);
            pUU.AEQbTJ(this.OLrzqt.AEQbTJ(), "OssManagerUtil Upload failed | ID: " + strAEQbTJ + " | Error: " + uploadErrorOLrzqt.getMessage(), e);
            taskDescription.AEQbTJ(uploadErrorOLrzqt);
        }
        return strAEQbTJ;
    }

    public static /* synthetic */ String uploadBackground$default(OssManagerUtil ossManagerUtil, String str, String str2, StateListAnimator stateListAnimator, int i, Object obj) {
        if ((i & 4) != 0) {
            stateListAnimator = null;
        }
        return ossManagerUtil.AEQbTJ(str, str2, stateListAnimator);
    }

    public final String AEQbTJ(@NotNull String str, @NotNull String str2, StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return OLrzqt(str, str2, new ActionBar(stateListAnimator));
    }

    public final String AEQbTJ(Context context) {
        InterfaceC46984thV interfaceC46984thV = (InterfaceC46984thV) C43248rlh.KWHzl.OLrzqt(InterfaceC46984thV.class);
        if (interfaceC46984thV == null) {
            return null;
        }
        Intrinsics.copydefault(context);
        return interfaceC46984thV.AEQbTJ(context);
    }

    public final void KWHzl(String str, String str2) throws UploadError.WiFiSignalWeak, UploadError.NetworkNotAvailable, UploadError.FileNotFound, UploadError.WiFiNotConnected, UploadError.FileTooLarge {
        String strAEQbTJ = AEQbTJ(C32979mnm.EZpvd.OLrzqt());
        pUU.KWHzl(this.OLrzqt.AEQbTJ(), "OssManagerUtil Upload for user country: " + strAEQbTJ);
        int i = Fragment.AEQbTJ[this.OLrzqt.gEmmrt().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!AEQbTJ()) {
                pUU.KWHzl(this.OLrzqt.AEQbTJ(), "OssManagerUtil No network connection available");
                throw new UploadError.NetworkNotAvailable();
            }
        } else if (!EZpvd()) {
            Pair<Boolean, Integer> pairOLrzqt = OLrzqt();
            if (!pairOLrzqt.getFirst().booleanValue()) {
                pUU.KWHzl(this.OLrzqt.AEQbTJ(), "OssManagerUtil WiFi not connected");
                throw new UploadError.WiFiNotConnected();
            }
            pUU.KWHzl(this.OLrzqt.AEQbTJ(), "OssManagerUtil WiFi signal too weak: " + pairOLrzqt.getSecond() + " dBm");
            throw new UploadError.WiFiSignalWeak(pairOLrzqt.getSecond().intValue());
        }
        if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            throw new IllegalArgumentException("Object key cannot be blank");
        }
        if (str.length() > 1024) {
            throw new IllegalArgumentException("Object key too long: " + str.length() + " > 1024");
        }
        if (KWHzl(str)) {
            throw new IllegalArgumentException("Object key contains invalid characters");
        }
        File file = new File(str2);
        if (!file.exists()) {
            throw new UploadError.FileNotFound(str2);
        }
        if (!file.canRead()) {
            throw new IllegalArgumentException("File is not readable: " + str2);
        }
        long length = file.length() / ((long) 1048576);
        if (length > this.OLrzqt.EZpvd()) {
            throw new UploadError.FileTooLarge(length, this.OLrzqt.EZpvd());
        }
    }

    public final PutObjectRequest copydefault(String str, String str2, File file, final String str3, final TaskDescription taskDescription) throws Exception {
        PutObjectRequest putObjectRequest = new PutObjectRequest(this.copydefault, str, str2);
        putObjectRequest.setProgressCallback(new OSSProgressCallback() { // from class: o.tlo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.alibaba.sdk.android.oss.callback.OSSProgressCallback
            public final void onProgress(java.lang.Object obj, long j, long j2) {
                OssManagerUtil.copydefault(this.copydefault, str3, taskDescription, (PutObjectRequest) obj, j, j2);
            }
        });
        if (this.OLrzqt.OLrzqt()) {
            try {
                ObjectMetadata objectMetadata = new ObjectMetadata();
                objectMetadata.setContentMD5(AEQbTJ(file, str3));
                putObjectRequest.setMetadata(objectMetadata);
                pUU.EZpvd(this.OLrzqt.AEQbTJ(), "OssManagerUtil MD5 calculated | ID: " + str3 + " | MD5: " + objectMetadata.getContentMD5());
            } catch (Exception e) {
                if (e instanceof UploadError.UploadCancelled) {
                    throw e;
                }
                throw new UploadError.MD5CalculationFailed(e);
            }
        }
        return putObjectRequest;
    }

    public static final void copydefault(OssManagerUtil ossManagerUtil, String str, TaskDescription taskDescription, PutObjectRequest putObjectRequest, long j, long j2) {
        if (ossManagerUtil.EZpvd(str)) {
            return;
        }
        taskDescription.OLrzqt(j2 > 0 ? (int) ((((long) 100) * j) / j2) : 0, j, j2);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final String AEQbTJ(File file, String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bArr = new byte[8192];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i != -1) {
                    if (EZpvd(str)) {
                        throw new UploadError.UploadCancelled();
                    }
                    messageDigest.update(bArr, 0, i);
                } else {
                    Unit unit = Unit.INSTANCE;
                    yFA.copydefault(fileInputStream, null);
                    String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 2);
                    Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                    return strEncodeToString;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    yFA.copydefault(fileInputStream, th);
                    throw th2;
                }
            }
        }
    }

    public static final class FragmentManager implements OSSCompletedCallback<PutObjectRequest, PutObjectResult> {
        public final /* synthetic */ TaskDescription AEQbTJ;
        public final /* synthetic */ String KWHzl;

        public FragmentManager(String str, TaskDescription taskDescription) {
            this.KWHzl = str;
            this.AEQbTJ = taskDescription;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Lcom/alibaba/sdk/android/oss/model/OSSRequest;Lcom/alibaba/sdk/android/oss/model/OSSResult;)V */
        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onSuccess(PutObjectRequest putObjectRequest, PutObjectResult putObjectResult) {
            Intrinsics.checkNotNullParameter(putObjectRequest, "");
            Intrinsics.checkNotNullParameter(putObjectResult, "");
            boolean zEZpvd = OssManagerUtil.this.EZpvd(this.KWHzl);
            OssManagerUtil.this.KWHzl.remove(this.KWHzl);
            if (!zEZpvd) {
                pUU.KWHzl(OssManagerUtil.this.OLrzqt.AEQbTJ(), "OssManagerUtil Upload completed successfully | ID: " + this.KWHzl + " | ServerCallback: " + putObjectResult.getServerCallbackReturnBody());
                this.AEQbTJ.OLrzqt(Dialog.ActionBar.EZpvd);
                return;
            }
            pUU.KWHzl(OssManagerUtil.this.OLrzqt.AEQbTJ(), "OssManagerUtil Upload success callback ignored because upload was cancelled | ID: " + this.KWHzl);
        }

        /* JADX DEBUG: Method merged with bridge method: onFailure(Lcom/alibaba/sdk/android/oss/model/OSSRequest;Lcom/alibaba/sdk/android/oss/ClientException;Lcom/alibaba/sdk/android/oss/ServiceException;)V */
        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onFailure(PutObjectRequest putObjectRequest, ClientException clientException, ServiceException serviceException) {
            UploadError unknownError;
            Intrinsics.checkNotNullParameter(putObjectRequest, "");
            boolean zEZpvd = OssManagerUtil.this.EZpvd(this.KWHzl);
            OssManagerUtil.this.KWHzl.remove(this.KWHzl);
            if (zEZpvd) {
                pUU.KWHzl(OssManagerUtil.this.OLrzqt.AEQbTJ(), "OssManagerUtil Upload cancelled | ID: " + this.KWHzl);
                this.AEQbTJ.AEQbTJ(new UploadError.UploadCancelled());
                return;
            }
            if (serviceException != null) {
                pUU.copydefault(OssManagerUtil.this.OLrzqt.AEQbTJ(), "OssManagerUtil Service error | ID: " + this.KWHzl + " | HttpStatus: " + serviceException.getStatusCode() + " | Code: " + serviceException.getErrorCode() + " | RequestId: " + serviceException.getRequestId() + " | HostId: " + serviceException.getHostId() + " | RawMessage: " + serviceException.getRawMessage());
                unknownError = new UploadError.ServiceError(serviceException.getErrorCode(), serviceException.getRequestId(), serviceException);
            } else if (clientException != null) {
                pUU.copydefault(OssManagerUtil.this.OLrzqt.AEQbTJ(), "OssManagerUtil Client error | ID: " + this.KWHzl + " | Message: " + clientException.getMessage());
                unknownError = new UploadError.NetworkError(clientException);
            } else {
                pUU.copydefault(OssManagerUtil.this.OLrzqt.AEQbTJ(), "OssManagerUtil Unknown error | ID: " + this.KWHzl);
                unknownError = new UploadError.UnknownError(new RuntimeException("Unknown upload error"));
            }
            this.AEQbTJ.AEQbTJ(unknownError);
        }
    }

    public final void KWHzl(PutObjectRequest putObjectRequest, String str, TaskDescription taskDescription) {
        this.gEmmrt.asyncPutObject(putObjectRequest, new FragmentManager(str, taskDescription));
    }

    public final String AEQbTJ(String str) {
        return str + "_" + System.currentTimeMillis() + "_" + Thread.currentThread().getId();
    }

    public final boolean EZpvd(String str) {
        AtomicBoolean atomicBoolean = this.KWHzl.get(str);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }

    public final boolean KWHzl(String str) {
        return StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "//", false, 2, (Object) null) || C59449zhJ.startsWith$default(str, "/", false, 2, null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "\\", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "?", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, false, 2, (Object) null);
    }

    public final UploadError OLrzqt(Exception exc) {
        UploadError unknownError;
        if (exc instanceof UploadError) {
            return (UploadError) exc;
        }
        if ((exc instanceof IOException) || (exc instanceof SecurityException)) {
            unknownError = new UploadError.NetworkError(exc);
        } else if (exc instanceof IllegalArgumentException) {
            String message = exc.getMessage();
            if (message == null || !StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "Object key", false, 2, (Object) null)) {
                String message2 = exc.getMessage();
                if (message2 == null || !StringsKt__StringsKt.contains$default((CharSequence) message2, (CharSequence) AdRevenueScheme.COUNTRY, false, 2, (Object) null)) {
                    String message3 = exc.getMessage();
                    if (message3 != null && StringsKt__StringsKt.contains$default((CharSequence) message3, (CharSequence) "WiFi", false, 2, (Object) null)) {
                        return new UploadError.WiFiNotConnected();
                    }
                    unknownError = new UploadError.UnknownError(exc);
                } else {
                    String message4 = exc.getMessage();
                    if (message4 == null) {
                        message4 = "Country not supported";
                    }
                    unknownError = new UploadError.CountryNotSupported(message4);
                }
            } else {
                String message5 = exc.getMessage();
                if (message5 == null) {
                    message5 = "Invalid object key";
                }
                unknownError = new UploadError.InvalidObjectKey(message5);
            }
        } else {
            unknownError = new UploadError.UnknownError(exc);
        }
        return unknownError;
    }

    public final boolean AEQbTJ() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = this.AYXKKw.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            boolean z = true;
            if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0)) {
                z = false;
            }
            pUU.EZpvd(this.OLrzqt.AEQbTJ(), "OssManagerUtil Network connected (wifi or mobile): " + z);
            return z;
        } catch (Exception e) {
            pUU.AEQbTJ(this.OLrzqt.AEQbTJ(), "OssManagerUtil Error checking network connectivity", e);
            return false;
        }
    }

    public final boolean EZpvd() {
        Pair<Boolean, Integer> pairOLrzqt = OLrzqt();
        return pairOLrzqt.component1().booleanValue() && pairOLrzqt.component2().intValue() >= -70;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<Boolean, Integer> OLrzqt() {
        boolean z;
        try {
            Object systemService = this.AYXKKw.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            Object systemService2 = this.AYXKKw.getApplicationContext().getSystemService("wifi");
            WifiManager wifiManager = systemService2 instanceof WifiManager ? (WifiManager) systemService2 : null;
            if (connectivityManager != null && wifiManager != null) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    z = true;
                    if (!networkCapabilities.hasTransport(1)) {
                        z = false;
                    }
                }
                if (!z) {
                    return new Pair<>(Boolean.FALSE, -100);
                }
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                int rssi = connectionInfo != null ? connectionInfo.getRssi() : -100;
                pUU.EZpvd(this.OLrzqt.AEQbTJ(), "OssManagerUtil WiFi Status - Connected: " + z + ", Signal: " + rssi + " dBm");
                return new Pair<>(Boolean.valueOf(z), Integer.valueOf(rssi));
            }
            pUU.valueOf(this.OLrzqt.AEQbTJ(), "OssManagerUtil Cannot access connectivity or WiFi manager");
            return new Pair<>(Boolean.FALSE, -100);
        } catch (Exception e) {
            pUU.AEQbTJ(this.OLrzqt.AEQbTJ(), "OssManagerUtil Error checking WiFi status", e);
            return new Pair<>(Boolean.FALSE, -100);
        }
    }

    public static final class ActionBar implements TaskDescription {
        public final StateListAnimator AEQbTJ;

        public ActionBar(StateListAnimator stateListAnimator) {
            this.AEQbTJ = stateListAnimator;
        }

        @Override // com.okinc.okrisk.util.OssManagerUtil.TaskDescription
        public void EZpvd() {
            pUU.EZpvd("BACKGROUND_UPLOAD", "Background upload started");
        }

        @Override // com.okinc.okrisk.util.OssManagerUtil.TaskDescription
        public void OLrzqt(int i, long j, long j2) {
            if (i != 25 && i != 50 && i != 75) {
                if (i != 100) {
                    return;
                }
                pUU.EZpvd("BACKGROUND_UPLOAD", "Upload transfer completed, processing...");
            } else {
                pUU.EZpvd("BACKGROUND_UPLOAD", "Progress: " + i + "%");
            }
        }

        @Override // com.okinc.okrisk.util.OssManagerUtil.TaskDescription
        public void OLrzqt(@NotNull Dialog.ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            pUU.KWHzl("BACKGROUND_UPLOAD", "Background upload completed successfully");
            StateListAnimator stateListAnimator = this.AEQbTJ;
            if (stateListAnimator != null) {
                stateListAnimator.EZpvd(true, null);
            }
        }

        @Override // com.okinc.okrisk.util.OssManagerUtil.TaskDescription
        public void AEQbTJ(@NotNull UploadError uploadError) {
            Intrinsics.checkNotNullParameter(uploadError, "");
            pUU.valueOf("BACKGROUND_UPLOAD", "Background upload failed: " + uploadError.getMessage());
            StateListAnimator stateListAnimator = this.AEQbTJ;
            if (stateListAnimator != null) {
                stateListAnimator.EZpvd(false, uploadError);
            }
        }
    }
}
