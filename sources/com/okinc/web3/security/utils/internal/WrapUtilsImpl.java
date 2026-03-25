package com.okinc.web3.security.utils.internal;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.gms.wallet.WalletConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.web3.security.bridge.Web3SecurityBridge;
import com.okinc.web3.security.utils.internal.HardwareImpl;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.PublicKey;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.C35202nqq;
import o.C48787ucK;
import o.C56390yDp;
import o.C56423yEv;
import o.C59449zhJ;
import o.YY;
import o.Zn;
import o.pUU;
import o.yDV;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes12.dex */
public final class WrapUtilsImpl {
    public static final int $stable;
    public static final String ANDROID_KEYSTORE;
    private static int AhwBna;
    public static final WrapUtilsImpl INSTANCE;
    private static long KWHzl;
    private static final String TAG;
    private static char[] copydefault;
    private static volatile WrapUtilsBase currentImpl;
    private static final Object implLock;
    private static Boolean startupForceToSoftware;
    private static Boolean startupTestHardwareForTelemetry;
    private static final byte[] $$a = {48, -53, -22, 107};
    private static final int $$b = 17;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int EZpvd = 0;
    private static int OLrzqt = 0;
    private static int AEQbTJ = 1;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SupportLevel.values().length];
            try {
                iArr[SupportLevel.SOFTWARE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SupportLevel.TEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SupportLevel.STRONGBOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4 = 114 - i;
        int i5 = 4 - (i2 * 4);
        int i6 = s * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i5++;
            i4 += i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            int i9 = i3 + 1;
            i7 = i4;
            i4 = bArr[i5];
            i8 = i9;
            i5++;
            i4 += i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CharSequence $r8$lambda$oC9GzV9oOVqY_BR8pYlY9NO9zeQ(StackTraceElement stackTraceElement) throws Throwable {
        int i = 2 % 2;
        int i2 = OLrzqt + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        AEQbTJ = i2 % 128;
        if (i2 % 2 != 0) {
            return getSecureStackTrace$lambda$9(stackTraceElement);
        }
        getSecureStackTrace$lambda$9(stackTraceElement);
        throw null;
    }

    private WrapUtilsImpl() {
    }

    static {
        AhwBna = 1;
        copydefault();
        Object[] objArr = new Object[1];
        a((char) 0, 0, 13, objArr);
        TAG = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) 23064, 13, 15, objArr2);
        ANDROID_KEYSTORE = ((String) objArr2[0]).intern();
        INSTANCE = new WrapUtilsImpl();
        implLock = new Object();
        $stable = 8;
        int i = EZpvd + 57;
        AhwBna = i % 128;
        int i2 = i % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final WrapUtilsBase createImplementation(Context context) throws Throwable {
        Object obj;
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a((char) 0, 0, 13, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) 60947, 28, 9, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        SupportLevel supportLevelDetermineSupportLevel = determineSupportLevel(context);
        int i2 = WhenMappings.$EnumSwitchMapping$0[supportLevelDetermineSupportLevel.ordinal()];
        if (i2 == 1) {
            Object[] objArr3 = new Object[1];
            a((char) 29501, 1130, 64, objArr3);
            pUU.KWHzl(strIntern, ((String) objArr3[0]).intern());
            return new SoftwareImpl();
        }
        int i3 = OLrzqt + 63;
        AEQbTJ = i3 % 128;
        if (i3 % 2 != 0 ? i2 != 2 : i2 != 3) {
            if (i2 != 3) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr4 = new Object[1];
                a((char) 18532, 37, 26, objArr4);
                sb.append(((String) objArr4[0]).intern());
                sb.append(supportLevelDetermineSupportLevel);
                Object[] objArr5 = new Object[1];
                a((char) 0, 63, 26, objArr5);
                sb.append(((String) objArr5[0]).intern());
                pUU.valueOf(strIntern, sb.toString());
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                a((char) 18532, 37, 26, objArr6);
                sb2.append(((String) objArr6[0]).intern());
                sb2.append(supportLevelDetermineSupportLevel);
                Object[] objArr7 = new Object[1];
                a((char) 55835, 89, 24, objArr7);
                monitorCallError(((String) objArr7[0]).intern(), sb2.toString());
                return createSoftwareFallback();
            }
        }
        try {
            if (supportLevelDetermineSupportLevel == SupportLevel.TEE) {
                Object[] objArr8 = new Object[1];
                a((char) 0, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, 3, objArr8);
                obj = objArr8[0];
            } else {
                Object[] objArr9 = new Object[1];
                a((char) 60947, 28, 9, objArr9);
                obj = objArr9[0];
            }
            String strIntern3 = ((String) obj).intern();
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr10 = new Object[1];
            a((char) 0, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, 34, objArr10);
            sb3.append(((String) objArr10[0]).intern());
            sb3.append(strIntern3);
            Object[] objArr11 = new Object[1];
            a((char) 0, 150, 16, objArr11);
            sb3.append(((String) objArr11[0]).intern());
            sb3.append(supportLevelDetermineSupportLevel);
            Object[] objArr12 = new Object[1];
            a((char) 0, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, 1, objArr12);
            sb3.append(((String) objArr12[0]).intern());
            pUU.KWHzl(strIntern, sb3.toString());
            HardwareImpl hardwareImpl = new HardwareImpl(supportLevelDetermineSupportLevel);
            hardwareImpl.init();
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr13 = new Object[1];
            a((char) 0, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, 48, objArr13);
            sb4.append(((String) objArr13[0]).intern());
            sb4.append(strIntern3);
            Object[] objArr14 = new Object[1];
            a((char) 0, 215, 8, objArr14);
            sb4.append(((String) objArr14[0]).intern());
            pUU.KWHzl(strIntern, sb4.toString());
            return hardwareImpl;
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message != null) {
                int i4 = OLrzqt + 53;
                AEQbTJ = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr15 = new Object[1];
                a((char) 0, 592, 34, objArr15);
                if (StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) ((String) objArr15[0]).intern(), false, 2, (Object) null)) {
                    int i6 = OLrzqt + 21;
                    AEQbTJ = i6 % 128;
                    int i7 = i6 % 2;
                    if (supportLevelDetermineSupportLevel == SupportLevel.TEE) {
                        int i8 = AEQbTJ + 29;
                        OLrzqt = i8 % 128;
                        if (i8 % 2 != 0) {
                            Object[] objArr16 = new Object[1];
                            a((char) 0, 3, 5, objArr16);
                            strIntern2 = ((String) objArr16[0]).intern();
                        } else {
                            Object[] objArr17 = new Object[1];
                            a((char) 0, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, 3, objArr17);
                            strIntern2 = ((String) objArr17[0]).intern();
                        }
                    }
                    String message2 = e.getMessage();
                    StringBuilder sb5 = new StringBuilder();
                    Object[] objArr18 = new Object[1];
                    a((char) 0, 626, 40, objArr18);
                    sb5.append(((String) objArr18[0]).intern());
                    sb5.append(strIntern2);
                    Object[] objArr19 = new Object[1];
                    a((char) 9991, 666, 31, objArr19);
                    sb5.append(((String) objArr19[0]).intern());
                    sb5.append(message2);
                    pUU.valueOf(strIntern, sb5.toString());
                    try {
                        StringBuilder sb6 = new StringBuilder();
                        Object[] objArr20 = new Object[1];
                        a((char) 0, 697, 58, objArr20);
                        sb6.append(((String) objArr20[0]).intern());
                        sb6.append(supportLevelDetermineSupportLevel);
                        Object[] objArr21 = new Object[1];
                        a((char) 0, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, 1, objArr21);
                        sb6.append(((String) objArr21[0]).intern());
                        pUU.KWHzl(strIntern, sb6.toString());
                        HybridImpl hybridImpl = new HybridImpl(supportLevelDetermineSupportLevel);
                        hybridImpl.init();
                        Object[] objArr22 = new Object[1];
                        a((char) 0, 755, 61, objArr22);
                        pUU.KWHzl(strIntern, ((String) objArr22[0]).intern());
                        Object[] objArr23 = new Object[1];
                        a((char) 0, 816, 20, objArr23);
                        String strIntern4 = ((String) objArr23[0]).intern();
                        Object[] objArr24 = new Object[1];
                        a((char) 0, 836, 57, objArr24);
                        monitorCallError(strIntern4, ((String) objArr24[0]).intern());
                        return hybridImpl;
                    } catch (Exception e2) {
                        String message3 = e2.getMessage();
                        StringBuilder sb7 = new StringBuilder();
                        Object[] objArr25 = new Object[1];
                        a((char) 62290, 893, 61, objArr25);
                        sb7.append(((String) objArr25[0]).intern());
                        sb7.append(message3);
                        pUU.valueOf(strIntern, sb7.toString());
                        String message4 = e2.getMessage();
                        StringBuilder sb8 = new StringBuilder();
                        Object[] objArr26 = new Object[1];
                        a((char) 25655, 954, 33, objArr26);
                        sb8.append(((String) objArr26[0]).intern());
                        sb8.append(message4);
                        Object[] objArr27 = new Object[1];
                        a((char) 0, 987, 15, objArr27);
                        monitorCallError(((String) objArr27[0]).intern(), sb8.toString());
                        return createSoftwareFallback();
                    }
                }
            }
            String message5 = e.getMessage();
            StringBuilder sb9 = new StringBuilder();
            Object[] objArr28 = new Object[1];
            a((char) 0, 1002, 77, objArr28);
            sb9.append(((String) objArr28[0]).intern());
            sb9.append(message5);
            pUU.valueOf(strIntern, sb9.toString());
            String message6 = e.getMessage();
            StringBuilder sb10 = new StringBuilder();
            Object[] objArr29 = new Object[1];
            a((char) 0, 1079, 27, objArr29);
            sb10.append(((String) objArr29[0]).intern());
            sb10.append(message6);
            Object[] objArr30 = new Object[1];
            a((char) 26955, 1106, 24, objArr30);
            monitorCallError(((String) objArr30[0]).intern(), sb10.toString());
            return createSoftwareFallback();
        } catch (SecurityException e3) {
            String message7 = e3.getMessage();
            StringBuilder sb11 = new StringBuilder();
            Object[] objArr31 = new Object[1];
            a((char) 0, 458, 81, objArr31);
            sb11.append(((String) objArr31[0]).intern());
            sb11.append(message7);
            pUU.valueOf(strIntern, sb11.toString());
            String message8 = e3.getMessage();
            StringBuilder sb12 = new StringBuilder();
            Object[] objArr32 = new Object[1];
            a((char) 0, 539, 28, objArr32);
            sb12.append(((String) objArr32[0]).intern());
            sb12.append(message8);
            Object[] objArr33 = new Object[1];
            a((char) 0, 567, 25, objArr33);
            monitorCallError(((String) objArr33[0]).intern(), sb12.toString());
            return createSoftwareFallback();
        } catch (Exception e4) {
            String message9 = e4.getMessage();
            StringBuilder sb13 = new StringBuilder();
            Object[] objArr34 = new Object[1];
            a((char) 14142, 223, 84, objArr34);
            sb13.append(((String) objArr34[0]).intern());
            sb13.append(message9);
            pUU.valueOf(strIntern, sb13.toString());
            String message10 = e4.getMessage();
            StringBuilder sb14 = new StringBuilder();
            Object[] objArr35 = new Object[1];
            a((char) 32854, 307, 30, objArr35);
            sb14.append(((String) objArr35[0]).intern());
            sb14.append(message10);
            Object[] objArr36 = new Object[1];
            a((char) 0, 337, 27, objArr36);
            monitorCallError(((String) objArr36[0]).intern(), sb14.toString());
            return createSoftwareFallback();
        } catch (OutOfMemoryError e5) {
            Object[] objArr37 = new Object[1];
            a((char) 5261, 364, 51, objArr37);
            pUU.AEQbTJ(strIntern, ((String) objArr37[0]).intern(), e5);
            String message11 = e5.getMessage();
            StringBuilder sb15 = new StringBuilder();
            Object[] objArr38 = new Object[1];
            a((char) 5177, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, 23, objArr38);
            sb15.append(((String) objArr38[0]).intern());
            sb15.append(message11);
            Object[] objArr39 = new Object[1];
            a((char) 0, 438, 20, objArr39);
            monitorCallError(((String) objArr39[0]).intern(), sb15.toString());
            throw e5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [99=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        Zn zn = new Zn();
        long[] jArr = new long[i2];
        zn.EZpvd = 0;
        while (zn.EZpvd < i2) {
            int i5 = $10 + 19;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            int i7 = zn.EZpvd;
            try {
                Object[] objArr2 = {Integer.valueOf(copydefault[i + i7])};
                Object objEZpvd = YY.EZpvd(927695670);
                if (objEZpvd == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 2);
                    objEZpvd = YY.EZpvd(217, 4, (char) 0, 862670410, false, $$c(b, b2, (byte) (b2 - 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objEZpvd).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(KWHzl), Integer.valueOf(c)};
                Object objEZpvd2 = YY.EZpvd(-297691357);
                if (objEZpvd2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objEZpvd2 = YY.EZpvd(TypedValues.CycleType.TYPE_WAVE_PERIOD, 5, (char) 0, -362718625, false, $$c(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objEZpvd2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {zn, zn};
                Object objEZpvd3 = YY.EZpvd(1191971121);
                if (objEZpvd3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objEZpvd3 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd3).invoke(null, objArr4);
                i3 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        zn.EZpvd = 0;
        while (zn.EZpvd < i2) {
            int i8 = $11 + 37;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[zn.EZpvd] = (char) jArr[zn.EZpvd];
            try {
                Object[] objArr5 = {zn, zn};
                Object objEZpvd4 = YY.EZpvd(1191971121);
                if (objEZpvd4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objEZpvd4 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$c(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd4).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    private final SoftwareImpl createSoftwareFallback() throws Throwable {
        int i = 2 % 2;
        SoftwareImpl softwareImpl = new SoftwareImpl();
        try {
            softwareImpl.init();
            Object[] objArr = new Object[1];
            a((char) 0, 0, 13, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((char) 0, 1194, 42, objArr2);
            pUU.KWHzl(strIntern, ((String) objArr2[0]).intern());
            int i2 = OLrzqt + 125;
            AEQbTJ = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 14 / 0;
            }
            return softwareImpl;
        } catch (Exception e) {
            Object[] objArr3 = new Object[1];
            a((char) 0, 0, 13, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a((char) 0, 1236, 39, objArr4);
            pUU.AEQbTJ(strIntern2, ((String) objArr4[0]).intern(), e);
            WrapUtilsImpl wrapUtilsImpl = INSTANCE;
            Object[] objArr5 = new Object[1];
            a((char) 4370, 1275, 23, objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a((char) 0, 1298, 33, objArr6);
            wrapUtilsImpl.monitorCallError(strIntern3, ((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            a((char) 0, 1298, 33, objArr7);
            throw new IllegalStateException(((String) objArr7[0]).intern(), e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SupportLevel determineSupportLevel(Context context) throws Throwable {
        boolean zCopydefault;
        boolean zCopydefault2;
        int i = 2 % 2;
        Boolean bool = startupForceToSoftware;
        if (bool != null) {
            zCopydefault = bool.booleanValue();
        } else {
            C48787ucK c48787ucK = C48787ucK.AEQbTJ;
            Object[] objArr = new Object[1];
            a((char) 21977, 1331, 46, objArr);
            zCopydefault = c48787ucK.copydefault(((String) objArr[0]).intern(), true);
            startupForceToSoftware = Boolean.valueOf(zCopydefault);
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a((char) 0, 1377, 53, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(zCopydefault);
            Object[] objArr3 = new Object[1];
            a((char) 0, 0, 13, objArr3);
            pUU.KWHzl(((String) objArr3[0]).intern(), sb.toString());
        }
        Boolean bool2 = startupTestHardwareForTelemetry;
        if (bool2 != null) {
            int i2 = OLrzqt + 51;
            AEQbTJ = i2 % 128;
            int i3 = i2 % 2;
            zCopydefault2 = bool2.booleanValue();
        } else {
            C48787ucK c48787ucK2 = C48787ucK.AEQbTJ;
            Object[] objArr4 = new Object[1];
            a((char) 0, 1430, 43, objArr4);
            zCopydefault2 = c48787ucK2.copydefault(((String) objArr4[0]).intern(), false);
            startupTestHardwareForTelemetry = Boolean.valueOf(zCopydefault2);
        }
        if (!zCopydefault) {
            HardwareImpl.Companion companion = HardwareImpl.Companion;
            if (companion.detectStrongBoxSupport(context)) {
                return SupportLevel.STRONGBOX;
            }
            if (!companion.detectTEESupport()) {
                return SupportLevel.SOFTWARE_ONLY;
            }
            int i4 = OLrzqt + 21;
            AEQbTJ = i4 % 128;
            if (i4 % 2 != 0) {
                return SupportLevel.TEE;
            }
            int i5 = 94 / 0;
            return SupportLevel.TEE;
        }
        if (zCopydefault2) {
            Object[] objArr5 = new Object[1];
            a((char) 0, 0, 13, objArr5);
            String strIntern = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a((char) 10160, 1473, 86, objArr6);
            pUU.KWHzl(strIntern, ((String) objArr6[0]).intern());
            HardwareImpl.Companion.runHardwareCompatibilityTestsForTelemetry(context);
            int i6 = OLrzqt + 57;
            AEQbTJ = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Object[] objArr7 = new Object[1];
            a((char) 0, 0, 13, objArr7);
            String strIntern2 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            a((char) 0, 1559, 63, objArr8);
            pUU.KWHzl(strIntern2, ((String) objArr8[0]).intern());
        }
        return SupportLevel.SOFTWARE_ONLY;
    }

    private final WrapUtilsBase getImplementation(Context context) {
        WrapUtilsBase wrapUtilsBase = currentImpl;
        if (wrapUtilsBase != null) {
            return wrapUtilsBase;
        }
        synchronized (implLock) {
            WrapUtilsBase wrapUtilsBase2 = currentImpl;
            if (wrapUtilsBase2 != null) {
                return wrapUtilsBase2;
            }
            WrapUtilsBase wrapUtilsBaseCreateImplementation = INSTANCE.createImplementation(context);
            currentImpl = wrapUtilsBaseCreateImplementation;
            return wrapUtilsBaseCreateImplementation;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void init$OKWeb3Security_web3_security_lib(@NotNull Context context) throws Throwable {
        String strIntern;
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        getImplementation(context).init();
        C48787ucK c48787ucK = C48787ucK.AEQbTJ;
        Object[] objArr = new Object[1];
        a((char) 21977, 1331, 46, objArr);
        boolean zCopydefault = c48787ucK.copydefault(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a((char) 0, 1430, 43, objArr2);
        boolean zCopydefault2 = c48787ucK.copydefault(((String) objArr2[0]).intern(), false);
        if (zCopydefault && !(!zCopydefault2)) {
            int i2 = AEQbTJ + 43;
            OLrzqt = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr3 = new Object[1];
                a((char) 0, 0, 119, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                a((char) 32330, 1345, 6, objArr4);
                obj = objArr4[0];
            } else {
                Object[] objArr5 = new Object[1];
                a((char) 0, 0, 13, objArr5);
                strIntern = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                a((char) 32330, 1680, 91, objArr6);
                obj = objArr6[0];
            }
            pUU.KWHzl(strIntern, ((String) obj).intern());
        }
        int i3 = OLrzqt + 105;
        AEQbTJ = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] wrap$OKWeb3Security_web3_security_lib(@NotNull Context context, @NotNull byte[] bArr) {
        int i = 2 % 2;
        int i2 = AEQbTJ + 93;
        OLrzqt = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrWrap = getImplementation(context).wrap(bArr);
        int i4 = OLrzqt + 65;
        AEQbTJ = i4 % 128;
        int i5 = i4 % 2;
        return bArrWrap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] unwrap$OKWeb3Security_web3_security_lib(@NotNull Context context, @NotNull byte[] bArr) {
        int i = 2 % 2;
        int i2 = OLrzqt + 37;
        AEQbTJ = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrUnwrap = getImplementation(context).unwrap(bArr);
        int i4 = AEQbTJ + 103;
        OLrzqt = i4 % 128;
        int i5 = i4 % 2;
        return bArrUnwrap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if ((r6 instanceof com.okinc.web3.security.utils.internal.HardwareImpl) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r1 = com.okinc.web3.security.utils.internal.WrapUtilsImpl.AEQbTJ + 45;
        com.okinc.web3.security.utils.internal.WrapUtilsImpl.OLrzqt = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if ((r6 instanceof com.okinc.web3.security.utils.internal.HybridImpl) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        return ((com.okinc.web3.security.utils.internal.HybridImpl) r6).decodePublicKeyHex(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r6 = o.C56524yIo.AEQbTJ(r6.getClass()).valueOf();
        r7 = new java.lang.StringBuilder();
        r0 = new java.lang.Object[1];
        a(41929, 1625, 29, r0);
        r7.append(((java.lang.String) r0[0]).intern());
        r7.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        throw new java.lang.IllegalStateException(r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return ((com.okinc.web3.security.utils.internal.HardwareImpl) r6).decodePublicKeyHex(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if ((r6 instanceof com.okinc.web3.security.utils.internal.SoftwareImpl) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if ((r6 instanceof com.okinc.web3.security.utils.internal.SoftwareImpl) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r6 = ((com.okinc.web3.security.utils.internal.SoftwareImpl) r6).decodePublicKeyHex(r7);
        r7 = com.okinc.web3.security.utils.internal.WrapUtilsImpl.AEQbTJ + 67;
        com.okinc.web3.security.utils.internal.WrapUtilsImpl.OLrzqt = r7 % 128;
        r7 = r7 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PublicKey decodePublicKeyHex(@NotNull Context context, @NotNull String str) throws Throwable {
        WrapUtilsBase implementation;
        int i = 2 % 2;
        int i2 = AEQbTJ + 31;
        OLrzqt = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            implementation = getImplementation(context);
            int i3 = 54 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            implementation = getImplementation(context);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v18, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isAuthorizedCaller(@NotNull List<String> list) throws Throwable {
        String str;
        Object obj;
        StackTraceElement[] stackTraceElementArr;
        int i;
        List<String> list2 = list;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = OLrzqt + 45;
        AEQbTJ = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 1;
        Object[] objArr = new Object[1];
        a((char) 0, 1771, 1, objArr);
        String strIntern = ((String) objArr[0]).intern();
        String str2 = "";
        Intrinsics.checkNotNullParameter(list2, "");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.copydefault(stackTrace);
        int length = stackTrace.length;
        int i7 = 0;
        while (i7 < length) {
            StackTraceElement stackTraceElement = stackTrace[i7];
            if ((list2 instanceof Collection) && list.isEmpty()) {
                int i8 = OLrzqt + 47;
                AEQbTJ = i8 % 128;
                int i9 = i8 % i2;
            } else {
                for (String str3 : list) {
                    int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str3, '.', 0, false, 6, (Object) null);
                    if (iLastIndexOf$default != -1) {
                        String strSubstring = str3.substring(0, iLastIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, str2);
                        String strSubstring2 = str3.substring(iLastIndexOf$default + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, str2);
                        String methodName = stackTraceElement.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName, str2);
                        char[] cArr = new char[i6];
                        cArr[0] = '$';
                        String str4 = (String) CollectionsKt___CollectionsKt.AuCTelauCTel(StringsKt__StringsKt.split$default((CharSequence) methodName, cArr, false, 0, 6, (Object) null));
                        String methodName2 = stackTraceElement.getMethodName();
                        String className = stackTraceElement.getClassName();
                        if (!Intrinsics.EZpvd((Object) className, (Object) strSubstring) || !Intrinsics.EZpvd((Object) str4, (Object) strSubstring2)) {
                            Intrinsics.copydefault((Object) className);
                            if (C59449zhJ.startsWith$default(className, strSubstring, false, i2, null)) {
                                str = str2;
                                obj = null;
                                if (StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) (strIntern + strSubstring2 + strIntern), false, i2, (Object) null)) {
                                }
                            } else {
                                str = str2;
                                obj = null;
                            }
                            if (C59449zhJ.startsWith$default(className, strSubstring, false, i2, obj)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(strIntern);
                                sb.append(strSubstring2);
                                Object[] objArr2 = new Object[1];
                                stackTraceElementArr = stackTrace;
                                a((char) 0, 1772, 7, objArr2);
                                sb.append(((String) objArr2[0]).intern());
                                if (StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) sb.toString(), false, 2, (Object) null)) {
                                    int i10 = OLrzqt + 29;
                                    AEQbTJ = i10 % 128;
                                    int i11 = i10 % 2;
                                }
                            } else {
                                stackTraceElementArr = stackTrace;
                            }
                            if (Intrinsics.EZpvd((Object) className, (Object) strSubstring)) {
                                Intrinsics.copydefault((Object) methodName2);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(strSubstring2);
                                Object[] objArr3 = new Object[1];
                                a((char) 0, 1779, 16, objArr3);
                                sb2.append(((String) objArr3[0]).intern());
                                if (C59449zhJ.startsWith$default(methodName2, sb2.toString(), false, 2, null)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    Object[] objArr4 = new Object[1];
                                    a((char) 0, 1795, 37, objArr4);
                                    sb3.append(((String) objArr4[0]).intern());
                                    sb3.append(className);
                                    Object[] objArr5 = new Object[1];
                                    a((char) 0, 1832, 1, objArr5);
                                    sb3.append(((String) objArr5[0]).intern());
                                    sb3.append(methodName2);
                                    Object[] objArr6 = new Object[1];
                                    a((char) 0, 1833, 9, objArr6);
                                    sb3.append(((String) objArr6[0]).intern());
                                    sb3.append(str3);
                                    Object[] objArr7 = new Object[1];
                                    a((char) 0, 0, 13, objArr7);
                                    pUU.EZpvd(((String) objArr7[0]).intern(), sb3.toString());
                                } else if (C59449zhJ.startsWith$default(className, strSubstring, false, 2, null)) {
                                    Object[] objArr8 = new Object[1];
                                    a((char) 0, 1842, 8, objArr8);
                                    if (new Regex(((String) objArr8[0]).intern()).matches(className)) {
                                        int i12 = AEQbTJ + 5;
                                        OLrzqt = i12 % 128;
                                        int i13 = i12 % 2;
                                        if (!Intrinsics.EZpvd((Object) str4, (Object) strSubstring2)) {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(strSubstring);
                                            Object[] objArr9 = new Object[1];
                                            a((char) 13888, 1850, 10, objArr9);
                                            sb4.append(((String) objArr9[0]).intern());
                                            if (!Intrinsics.EZpvd((Object) className, (Object) sb4.toString()) || !Intrinsics.EZpvd((Object) str4, (Object) strSubstring2)) {
                                                if (C59449zhJ.startsWith$default(className, strSubstring, false, 2, null)) {
                                                    if (StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) (strIntern + strSubstring2 + strIntern), false, 2, (Object) null)) {
                                                        i = 1;
                                                        Object[] objArr10 = new Object[1];
                                                        a((char) 0, 1860, 6, objArr10);
                                                        if (C59449zhJ.startsWith$default(className, ((String) objArr10[0]).intern(), false, 2, null)) {
                                                        }
                                                    } else {
                                                        i = 1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return i;
                        }
                        i = 1;
                        return i;
                    }
                    str = str2;
                    stackTraceElementArr = stackTrace;
                    i = i6;
                    i6 = i;
                    str2 = str;
                    stackTrace = stackTraceElementArr;
                    i2 = 2;
                }
            }
            int i14 = OLrzqt + 103;
            AEQbTJ = i14 % 128;
            i2 = 2;
            int i15 = i14 % 2;
            i7++;
            list2 = list;
            i6 = i6;
            str2 = str2;
            stackTrace = stackTrace;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void monitorCallError(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            EventData eventData = new EventData();
            Object[] objArr = new Object[1];
            a((char) 24666, MTCommonConstants.RemoteWhat.TO_BACKGROUND, 23, objArr);
            eventData.setAct(((String) objArr[0]).intern());
            eventData.setMsg(str);
            Object[] objArr2 = new Object[1];
            a((char) 29884, 2017, 6, objArr2);
            eventData.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt(((String) objArr2[0]).intern(), str2)));
            String name = Thread.currentThread().getName();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            a((char) 42635, 2023, 17, objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(name);
            Object[] objArr4 = new Object[1];
            a((char) 24130, 2040, 3, objArr4);
            sb.append(((String) objArr4[0]).intern());
            sb.append(eventData);
            Object[] objArr5 = new Object[1];
            a((char) 0, 0, 13, objArr5);
            pUU.copydefault(((String) objArr5[0]).intern(), sb.toString());
            ReportManager.AEQbTJ.EZpvd(eventData);
            int i2 = OLrzqt + 65;
            AEQbTJ = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception unused) {
        }
    }

    private static final CharSequence getSecureStackTrace$lambda$9(StackTraceElement stackTraceElement) throws Throwable {
        int i = 2 % 2;
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder();
        sb.append(className);
        Object[] objArr = new Object[1];
        a((char) 0, 1622, 1, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(methodName);
        Object[] objArr2 = new Object[1];
        a((char) 0, 1623, 1, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(fileName);
        Object[] objArr3 = new Object[1];
        a((char) 0, 1624, 1, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(lineNumber);
        Object[] objArr4 = new Object[1];
        a((char) 0, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, 1, objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i2 = OLrzqt + 93;
        AEQbTJ = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final String getSecureStackTrace() throws Throwable {
        int i = 2 % 2;
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            Function1 function1 = new Function1() { // from class: com.okinc.web3.security.utils.internal.WrapUtilsImpl$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WrapUtilsImpl.$r8$lambda$oC9GzV9oOVqY_BR8pYlY9NO9zeQ((StackTraceElement) obj);
                }
            };
            Object[] objArr = new Object[1];
            a((char) 53915, 1654, 1, objArr);
            String strJoinToString$default = yDV.joinToString$default(stackTrace, ((String) objArr[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, function1, 30, (Object) null);
            int i2 = OLrzqt + 47;
            AEQbTJ = i2 % 128;
            int i3 = i2 % 2;
            return strJoinToString$default;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a((char) 0, 1655, 25, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(message);
            return sb.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAuthorizedUnwrapCaller() throws Throwable {
        List<String> listGEmmrt;
        int i = 2 % 2;
        int i2 = OLrzqt + 61;
        AEQbTJ = i2 % 128;
        if (i2 % 2 == 0) {
            String[] strArr = new String[2];
            Object[] objArr = new Object[1];
            a((char) 62662, 31969, 45, objArr);
            strArr[1] = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((char) 0, 28574, 83, objArr2);
            strArr[1] = ((String) objArr2[0]).intern();
            listGEmmrt = yDY.gEmmrt(strArr);
        } else {
            Object[] objArr3 = new Object[1];
            a((char) 62662, 1866, 48, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a((char) 0, 1914, 54, objArr4);
            listGEmmrt = yDY.gEmmrt(strIntern, ((String) objArr4[0]).intern());
        }
        return isAuthorizedCaller(listGEmmrt);
    }

    public final boolean isCallerCheckHitGray() throws Throwable {
        C35202nqq c35202nqq;
        Object obj;
        int i = 2 % 2;
        int i2 = OLrzqt + 109;
        AEQbTJ = i2 % 128;
        if (i2 % 2 == 0) {
            c35202nqq = C35202nqq.OLrzqt;
            Object[] objArr = new Object[1];
            a((char) 0, 11916, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, objArr);
            obj = objArr[0];
        } else {
            c35202nqq = C35202nqq.OLrzqt;
            Object[] objArr2 = new Object[1];
            a((char) 0, 1968, 26, objArr2);
            obj = objArr2[0];
        }
        boolean zAEQbTJ = c35202nqq.AEQbTJ(((String) obj).intern());
        int i3 = OLrzqt + 31;
        AEQbTJ = i3 % 128;
        if (i3 % 2 != 0) {
            return zAEQbTJ;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void monitorSecurityAttack(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            EventData eventData = new EventData();
            Object[] objArr = new Object[1];
            a((char) 15171, 2043, 30, objArr);
            eventData.setAct(((String) objArr[0]).intern());
            eventData.setMsg(str);
            Object[] objArr2 = new Object[1];
            a((char) 29884, 2017, 6, objArr2);
            eventData.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt(((String) objArr2[0]).intern(), Web3SecurityBridge.INSTANCE.zipString$OKWeb3Security_web3_security_lib(str2))));
            String name = Thread.currentThread().getName();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            a((char) 57354, 2073, 22, objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(name);
            Object[] objArr4 = new Object[1];
            a((char) 24130, 2040, 3, objArr4);
            sb.append(((String) objArr4[0]).intern());
            sb.append(eventData);
            Object[] objArr5 = new Object[1];
            a((char) 0, 0, 13, objArr5);
            pUU.copydefault(((String) objArr5[0]).intern(), sb.toString());
            ReportManager.AEQbTJ.EZpvd(eventData);
        } catch (Exception unused) {
        }
        int i2 = OLrzqt + 89;
        AEQbTJ = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        char[] cArr = new char[2095];
        ByteBuffer.wrap("\fÑ°wuá9\u007fþß¢}gý+\u007fèí¬TQõ\u0015WÚÎVßês/üce¤ýøx=èq@²ãö|\u000bÓOK\u0080ÕÄK\u0019ÑâÆ^b\u009bá×s\u0010÷L}\u0089ÅÅo\u0006õD·ø\u000f=\u0081q\u0013¶\u009eê\b/\u0093c\u0003 \u009fä\u001d\u0019Ü]0\u0092³Ö5\u000b¸O \u008c À%\u0005ô¹7þ»2+wÅ«Kè\u0090,\t\fª°%uæ9nþæ¢egý+}èù¬=Qú\u0015FÚÁ\u009eJC\u008c\u0007_ÄÙ\u0088\u0015MÃñP¶ÜzM?³ã\" ¼d(Öèjp¯þãl$áxw½ìñ|2àvb\u008bÜÏO\u0000ÌDJ\u0099ÇÝ_\u001eßRZ\u0097ô+HlÄ Tåº94\fÒ°@uÅ\fÇ°quô9jþç¢ygà+zèð¬zQ¸\u0015WÚ×\u009eSCÉ\u0007\u000bÄþ\u0088TMÂñ[¶ÍzX?¶ã& \u0087d )¸í;\u0092òV&\u001bµß/\u009c\u008e@E\f¦°vuõ9\u007fþú¢fgæ+gè¾¬5Qô\u0015BÚÔ\u009eDCÀ\u0007\u000b\f¯\fÖ°può9jþª¢Agõ+aèú¬jQù\u0015UÚÇ\u009ehCÁ\u0007[ÄÚ\u0088\u0015MÙñQ¶ÓzM?\u00adã\" ¢d$)²í2\u0092¶Vq\u001b¯ß.\u009c\u0085@\u0006\u0005\u0085É\u001c\u008e\u00992\u000f÷\u0081»\u001fx\u0092<\u0004áØ¦ðjk/õÓd\u0090«\f¦°vuõ9\u007fþú¢fgæ+g;ð\u0087ZBÌ\u000eUÉÃ\u0095VPØ\u001cHß\u0080\u009bJfË\"iíð©ztÿ0póæ¿\u007fzïÆu\u0081íMh\b\u0094Ô]\u0097\u0096S\u0012\u001e\u009fÚ\u0005¥\u0089a\u000b,Âè\u0012«±w/2¶þq¹¡\u00059À¯\u008c5O°\u000b&Ö¥\u0091Í]Y\u0018Ûä\u0012§ÐcP.ÈêKµÑqP<Îøu»ó\u0007<Â³\u008epIè\u0015`Ðã\u009ck_ë\u001b\u001fæÛ¢\u001cm\u0090)\u0017ô\u009c°Js\u0099?\u000fúÃF\u0015\u0001¶Í:\u0088«T%\u0017´Ó:\u009e®Zt%á\u008c\u009802õ¤¹=~«\">ç°« hè,-Ñ¯\u0095\u0018Z\u0098\u001e\u0012Ã\u009e\u0087]DÈ\b\u0016Í\u0088q\f6\u0094ú\u001f¿÷cv ìä~©úm(\u0012¾Ö'\fî°duò9kþý¢hgæ+vèÁ¬hQö\u0015BÚÚ\u009eQCÉ\u0007HÄÂ\u0088PMÔñ`¶ÜzX?\u00adã/ »d?)\u00ad\u0018C¤éa\u007f-æêp¶åsk?ûü3¸ùEx\u0001ÚÎC\u008aÉWL\u0013ÃÐU\u009cÌY\\åÆ¢^nÛ+'÷î´%p¡=,ù¶\u0086:B¸\u000fqË²\u0088\u001eT\u008d\u0011MÝ\u0096\u009a\b&Äã\u0016¯\u008bl\u0007(Ðõ\u001a²l~¯;aÇä\u0084k@ô\rjÉä\u0018÷¤]aË-RêÄ¶Qsß?Oü\u0087¸BEÀ\u0001wÎ÷\u008a}Wñ\u00132Ð§\u009cCYÆåK¢ªn:+Ý\fî°duò9kþý¢hgæ+vèÁ¬rQ÷\u0015JÚý\u009eGCÍ\u0007BÄÚ\u0088@MÂñZ\fÎ°duò9kþý¢hgæ+vè¾¬tQõ\u0015WÚÎ\u009eDCÁ\u0007NÄØ\u0088AMÑñK¶ÓzV?ªãc ¨d,)¡í;\u0092·V5\u001büß?\u009c\u0093@\u0000\u0005ÀÉ\u001b\u008e\u00852I÷\u0087»\u0016x\u009d<\bá\u008a¦îjv/øÓ,\u0090ûTy\u0019ùÝy\u0082üFc\u000bµÏ\u0004\u008cÅ0OõÁ¹D~Þ\"\\çÖ«\u001chÙ,'Ñ¦\u0095+Zï\u001e>Ã¦\u0087tD \b1Í»q,6\u0090ú\u0003¿\u0093c\t ÑäV\fÎ°duò9kþý¢hgæ+vè¾¬{Qù\u0015NÚÎ\u009eDCÈ\u0007\u000bÄ\u009e\u0088FMÕñ\\¶ÏzK?\u00adã7 ·dd)òíw\fî°duò9kþý¢hgæ+vèÁ¬nQý\u0015DÚ×\u009eSCÅ\u0007_ÄÏ\u0088jMÖñ^¶ÓzU?±ã1 «\fÀ°dué9cþï¢mg´+gèñ¬=Qû\u0015UÚÇ\u009e@CØ\u0007NÄ\u0096\u0088]MÑñM¶ÞzN?¥ã1 «dm)£í2\u0092«Vq\u001b¬ß:\u009c\u008f@\u0017\fÎ°duò9kþý¢hgæ+vè¾¬XQÛ\u0015dÚ\u0082\u009eJCÉ\u0007RÄÆ\u0088TMÙñM¶\u009az^?¡ã- «d?)©í#\u0092»V>\u001b²ß{\u009c\u0080@\u0004\u0005\u0089É\u0003\u008e\u008f2\r÷Ô»[+¨\u0097.R§\u001eiÙù\u0085z@ö\fyÏé\u008bnvö2NýÂ¹\u0006dÃ UãÓ¯@jÞÖ\\\u0091\u009d]_\u0018³Ä4\u0087»C%\u000e®Ê3µ½ql<û\fÇ°quô9jþç¢ygà+zèð¬zQ¸\u0015oÚÛ\u009eCCÞ\u0007BÄÒ\u0088|MÝñO¶Öz\u0003?äã\u000b ¯d?)¬í \u0092³V#\u001b¹ß{\u009c§@ \u0005³ÉO\u008eÁ2I÷§»\u001cx\u0098<\tá\u008f¦æjp/äÓ,\u0090ÎTU\u0019ÖÝ0\u0082·Fv\u000büÏR\u008cÆ0Bõ\u008d\fÎ°|uâ9}þã¢mg´+zèó¬mQô\u0015BÚÏ\u009eDCÂ\u0007_Ä×\u0088AMÙñP¶Ôz\u0019?·ã6 \u00add.)\u00adí$\u0092¡V7\u001b©ß7\u009cÜ@E\u0005¨É\u000e\u008e\u00982\r÷\u0083»\u0012x\u008c<\u0018áØ¦ÆjG/ÒÓ,\u0090 T6\u0019ÆÝ\u007f\u0082ùFn\u000bîÏE\u008cÑ0Kõ\u008d¹m~ô\"q\fã°fuã9Pþì¢hgø+\u007fèü¬|Qû\u0015LÚý\u009eRCÙ\u0007HÄÕ\u0088PMÃñL\fÎ°duò9kþý¢hgæ+vè¾¬XQÛ\u0015dÚ\u0082\u009eGCÍ\u0007BÄÚ\u0088PMÔñ\u0013¶\u009azL?·ã*  d*)èí$\u0092½V7\u001b¨ß,\u009c\u0087@\u0017\u0005\u0085ÉO\u008e¯2*÷·»Sx\u0089<\u0014á\u008c¦ïj\"/éÓm\u0090ùTr\u0019âÝq\u0082íF\u007f\u000b¹Ïe\u008cæ0}ÿ\u009cC.\u0086°Ê/\r±Q?\u0094æØ(\u001b¡_?¢¦æ\u0010)\u009dm\u0016°\u0090ô\r7\u0085{\u0013¾\u008b\u0002\u0002E\u0086\u0089KÌð\u0010pSõ\u0097sÚÿ\u001eaa¬¥#èè,hoØ³[öÛ:S}ßÁ\u001b\u0004ÄH@\u008bÏÏD\u0012\u008aU¡\u0099?Üó .c¬§6ê¢.bq¾µ'ø\u00ad<\u0002\u007f\u0086Ã\u001d\u0006\u008dJ\u001f\u008dßÑ@hóÔ]\u0011Ã]P\u009a\u009dÆV\u0003ÂOV\u008cÍÈ]5Îqb¾ðú6'úcr åì\")ï\u0095qÒï\u001e|[\u009a\u0087\u0010ÄÙ\u0000\u001cM\u009e\u0089\tö\u00892\u0003\u007f\u008f»Vøñ\fî°|uâ9}þã¢mgË+uèÿ¬qQô\u0015EÚÃ\u009eBCÇ\fÎ°duò9kþý¢hgæ+vè¾¬tQõ\u0015WÚÎ\u009eDCÁ\u0007NÄØ\u0088AMÑñK¶ÓzV?ªãc ¨d,)¡í;\u0092·V5\u001büß,\u009c\u008f@\u0011\u0005\u0088ÉO\u008e\u00842\u0006÷\u009a»^x»<>á»¦§jk/òÓ\u007f\u0090þTs\u0019¹Ý0\u0082ùF{\u000bõÏH\u008cÊ0@õÊ¹\b~Õ\"SçÒ«Wh\u009b,2Ñª\u0095`Z¼\u001e%Ã¯\u0087 D¤\b?Í¯q=6ÝúB\fÎ°duò9kþý¢hgæ+vè¾¬{Qù\u0015NÚÎ\u009eDCÈ\u0007\u000bÄ\u009e\u0088[MßñQ¶\u0097z|?\u0087ã\u0000 çdw)èe¥Ù/\u001c¹P \u0097¶Ë#\u000e\u00adB=\u0081\u008aÅ88¼|\u0002³¶÷\u000f*\u0084n\u0003\u00ad¢á\u0018$\u009a\u0098\u001dß\u009d\u0013\u0007Vý\u008am\u007fîÃK\u0006ÔJ\\\u008dÐÑ\u0014\u0014úXA\u009bÅßT\"Òf{©ííy0Øt{·ûûd>\u00ad\u0082/Å§\tjL\u0096\u0090^Ó\u009b\u0017\u0011Z\u0087\u009e\u000eá\u0098%\rh\u0093¬\u0003ïû3+v¨º\"ý§A;\u0084»È:\u000bãO/\u0092·Õ\u009a\u0019Y\\Ó CãÕ'NjÌ®\rñÑ5HxÂ¼mÿéCr\u0086âÊp\rªQb\u0094ãØe\u001bã\fÕ°juæ9{þý¢hgæ+vè¾¬{Qù\u0015KÚÎ\u009eCCÍ\u0007HÄÝ\u0088\u0015MÙñQ¶ÓzM?\u00adã\" ¢d$)²í2\u0092¶Vq\u001b¯ß.\u009c\u0085@\u0006\u0005\u0085É\u001c\u008e\u00992\u000f÷\u0081»\u001fx\u0092<\u0004\fÕ°juæ9{þý¢hgæ+vè¾¬{Qù\u0015KÚÎ\u009eCCÍ\u0007HÄÝ\u0088\u0015MÙñQ¶ÓzM?\u00adã\" ¢d$)²í6\u0092¦V8\u001b³ß5\u009cÆ@\u0003\u0005\u0081É\u0006\u008e\u00862\f÷\u0090\u001d÷¡xdÿ(mïô³~vò:dùÓ½l@ø\u0004LËÀ\u008fGRÑ\u0016fÕÂ\u0099F\\ËàA§ÝkY.³\fÇ°iuì9/þé¢{gí+cèê¬rQ¸\u0015NÚÏ\u009eQCÀ\u0007NÄÛ\u0088PMÞñK¶ÛzM?\u00adã,  d>)èí1\u0092³V8\u001b°ß>\u009c\u0082Y(å¹ ;lå«\u0000÷µ2.~¿½5ù\u00ad\u00045@\u0087\u008f8Ë\u0097\u0016\u001bR\u0094\u0091\u0006Ý\u008b\u0018G¤\u008dã\u0006/\u0099jZ¶ÿõy1Ò|~¸üÇh\u0003íNa\u008aÖÉP\u0015éPJ\u009cÓÛ`gß¢KîÞ-PiÅ´Só;?\u008dzj\fÅ°wuù9\u007fþþ¢fg´+pèñ¬sQþ\u0015NÚÅ\u009e\u0001CÏ\u0007JÄÕ\u0088]MÕñ[¶\u009azX?°ãc ¯d=)¸íw\u0092¡V%\u001b½ß)\u009c\u0092@\u0010\u0005\u0090ÉU\u008eÊ2\u000f÷\u009b»\u0001x\u009d<\u0018á¬¦èjQ/îÓj\u0090ÿTa\u0019ôÝb\u0082úF'\fñ°`uâ9<þÙ¢lg÷+fèì¬tQì\u0015^Úá\u009eNCÂ\u0007MÄß\u0088RM\u009eñK¶ßzJ?°ã\u000b ¯d?)¬í \u0092³V#\u001b¹ß\u001d\u009c\u0089@\u0017\u0005´É\n\u008e\u00862\f÷\u0099»\u0016x\u008a<\u000fá\u0081+d\u0097ÀR^\u001eÑÙS\u0085×@C\f\u0083ÏF\u008bÌvZ2óýe¹ðdn þã&¯æjoÖâ\u0091z]è\u0018\u0000Ä\u009a\u0087\u001cC\u0094\u000e\u0014Ê\u008eµ\u0016q\u0098<Lø\u009f»3g¦\"$î¬©z\u0015¿Ð+\u009c±_n\u001b¹Æ-\u0081[M×\b\\ôÙ·OsÔ>\\ú\u0080¥XaÂ,@èø«v\u0017¾Òh\u009eëYn\u0005ìÀf\u008c¬Ox\u000b\u0099ö\u0013²\u0084}\b9\u009bä\u000b \u0081cC/\u0087ê\u0000V\u0098\u0011;Ý·\u0098<D¹\u00075Ã²\u008e$J´5&ñ¥¼'\fÀ°juò9lþï¢mg´+gèñ¬=Që\u0015HÚÄ\u009eUCÛ\u0007JÄÄ\u0088PM\u0090ñR¶Õz]?¡ãc ¸d$)©íw\u0092 V4\u001b±ß4\u009c\u0092@\u0000\u0005ÀÉ\f\u008e\u00852\u0007÷\u0092»\u001ax\u0099<]áÕ¦§jl/îÓ,\u0090ãTw\u0019çÝt\u0082èF{\u000bëÏA\u008c\u00830ZõÈ¹[~Ã\"[çß«[\f¥\f®\f¼¯\u001a\u0013¢Ö\"\u009a¨],\u0001·Ä3\u0088úK>\u000f¹ò!¶\u0082y\u000e=\u0085à\u0000¤\u008cg\u000b+\u009dî\rR\u009f\u0015\u001cÙ\u009e\u009c-@þ\u0003~Çô\u008adN¤1;Þ\u0017\fÕ°quá9lþá¢)gà+aèÿ¬~Qý\u0015\u0007Ú×\u009eOCÍ\u0007]Ä×\u0088\\MÜñ^¶ØzU?¡ãy îr\u008dÎ#\u000b¦Ge\u0080£Ü1\u0019§U)\u0096 Ò8/òk\u0002¤\u0098à\u000e=\u0094y\u0000º\u0088ö\u00163\u0095\u008f\u001bÈ\u0083\u0004SAû\u009dzÞá\u001a'Wñ\u0093rìþ(oeá¡pâÞ>J{\u008a·LðÍLS\u0089ÒÅ\\\u0006ÙBR\u009fÜØ¹\u0014)Q¿\u00ad/î®*2gó£zü½81u¡±\nò\u009eN\u0005\u008b\u0095Ç\u0007\u0000Ý\\\f\u0099\u009eÕ\u001a\u0016\u0094Ra¯êë~$÷`y½£ùl:ìvz³ù\u000f{HÃ\u0084OÁ\u008b\u001dO^Ï\u009a\u001c×Ý\u0013[lÖ¨[åÔ&¼b&¿±û)4¦\f¢\f¢°iuá9bþè¢mgõ\fÙ°auå9cþï¢ngõ+gèû¬9Qô\u0015FÚÏ\u009eCCÈ\u0007J\fÇ°puô9gþå¢{gý+ièû¬yQ¸\u0015WÚÐ\u009eNCÜ\u0007NÄÄ\u0088AMÉñ\u001f¶Þz\\?¨ã& ©d,)¼í2\u0092òV=\u001b½ß6\u009c\u0084@\u0001\u0005\u0081ÉU\u008eÊ\f¨\f¦°huá9{þé¢agñ+`è¾\f¨°/uÜ9+þÖ¢mg¿+7:â\u0086\u0006C¯\u000f\"Èº\u0094(Qº\u001d:Þ±\u009a3\fï°kuö9`þá¢lø#D¬\u0081+Íç\n#V¤\u0093;ß»\u001c;Xõ¥)á\u0084.\u0006jÔ·Dó\u009e0\u0015|\u0090¹\u0003\u0005\u008bB\u0015\u008e\u008bË{\u0017«T}\u0090ÿÝg\u0019ýfg¢¹ïM+ïhA´Óñg=ÙzEÆ\u0081\u0003VOÔ\u008cLÈÚ\u0015kR/\u009e³Û5'«d=\få°juí9!þå¢bgý+}èý¬3Qï\u0015BÚÀ\u009e\u0012C\u0082\u0007XÄÓ\u0088VMÅñM¶ÓzM?½ãm »d9)¡í;\u0092¡V\u007f\u001b\u008bß)\u009c\u0087@\u0015\u0005¡É\u001f\u008e\u00832G÷\u0081»\u001dx\u0089<\u000fá\u0099¦÷jC/ïÓh\u0090ÈTy\u0019øÝ`\u0082þFh\u000bü\fñ°`uâ9<þÕ¢zgñ+pèë¬oQñ\u0015SÚÛ\u009e~CÏ\u0007JÄÚ\u0088YMÕñM¶åzZ?¬ã& \u00add&l«Ð:\u0015¸Yf\u009e\u008fÂ$\u0007¯K%\u0088¨Ì\"1¶u\"º\u009aþ\t#\u009fg\u0015¤\u008bè\n-µ\u0091\u0006Ö\u0081\u001a\u000f_òx[ÄÍ\u0001HMÁ\u008aiÖ\u0084ª`\u0016áÓe\u009fíXu\u0004íÁm\u008dÛNt\nú÷\u007f³é|[8ØåH¡ÒbfR\u0099î}+â7²\u008b#N¡\u0002\u007fÅ\u0096\u00999\\²\u00103Ó¨\u0097,j².\u0010á\u0098¥=x\u008e<\u001cÿ\u0081³\u0017v\u0090Ê\u0017\u008d¦A\u001e\u0004âØt\u009bè_m\u0012ÿÖ}©þm|ìáP`\u0095äÙl\u001eôBl\u0087ìËJ\bñLt±çõ_:Á~_£ßç`$ÈhK\u00adÛ\u0011VVÛ\u009ah".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2095);
        copydefault = cArr;
        KWHzl = -8060763528590086139L;
    }
}
