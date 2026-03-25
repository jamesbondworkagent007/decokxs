package com.okinc.business.market.market.fragment;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o.C12989cxQ;
import o.InterfaceC56387yDm;
import o.YY;
import o.Zh;
import o.Zj;
import okio.Utf8;
import org.luaj.vm2.LuaValue;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$14 extends Lambda implements Function0<CreationExtras> {
    private static short[] copydefault;
    final /* synthetic */ Function0 $extrasProducer;
    final /* synthetic */ InterfaceC56387yDm $owner$delegate;
    private static final byte[] $$c = {104, 8, 37, -73};
    private static final int $$d = 246;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {10, -109, 37, Ascii.GS, -36, 35, Ascii.EM, -25, Ascii.FF};
    private static final int $$b = 28;
    private static int AYXKKw = 0;
    private static int fetchVPNInfo = 1;
    private static int KWHzl = 1572864908;
    private static int AEQbTJ = 1640963109;
    private static int EZpvd = -1054510343;
    private static byte[] OLrzqt = {-8, Ascii.SUB, -31, Ascii.CAN, -7, Ascii.SUB, -14, 49, -76, -10, 6, Ascii.SO, -2, 6, -28, -2, 1, 8, 9, -13, -10, 3, 6, -8, -10, 10, Ascii.SUB, 9, -16, -6, Ascii.FF, 6, -1, 52, -54, 3, -6, 10, -15, Ascii.CR, 78, -79, Ascii.SUB, -27, Ascii.SUB, -2, -10, 9, 73, -76, -10, -14, 1, 10, -15, Ascii.VT, -7, Ascii.CAN, -10, 10, 61, -76, -10, -14, Ascii.SO, -14, -11, Ascii.SUB, 6, -28, Ascii.SI, 6, -7, Ascii.SUB, -11, -10, -6, 79, -52, -7, Ascii.CAN, -10, 10, 60, -78, 0, -16, Ascii.SO, -58, -1, 6, -2, Ascii.FF, 5, 9, Ascii.SUB, -26, 10, 78, -79, 10, 1, -3, 10, 6, -2, 2, -13, 8, -5, Ascii.SUB, -11, -14, Ascii.VT, -10, 7, -10, -4, -10, 9, -13, Ascii.SUB, -28, Ascii.SUB, -11, -14, Ascii.VT, -10, 7, -10, -4, -10, 9, Ascii.CR, -14, Ascii.CR, 9, 3, -8, 4, -1, -3, 3, Ascii.FF, -2, Ascii.CR, 2, -11, Ascii.CR, -3, 3, -1, 8, 6, -4, -1, 0, -7, 19, -32, 9, Ascii.SUB, -26, 10, 9, -1, Ascii.CAN, -6, 0, 9, 9, -28, -11, -59, -1, Ascii.CAN, -6, 0, 9, 9, -28, -11, -38, -6, -12, Ascii.CR, -10, 6, 9, 9, -28, -11, 2, -13, Ascii.SO, 1, -16, -3, Ascii.SO, -7, 2, -14, Ascii.FF, -10, 6, -2, -1, Ascii.CR, Ascii.US, -16, -3, Ascii.SO, -7, 2, -14, 9, -6, 8, 2, -13, 2, 61, -68, 8, Ascii.FF, Ascii.SO, -10, Ascii.FF, -7, 79, -73, 6, 60, -73, -15, Ascii.CR, 79, -11, 10, Ascii.CAN, -26, 10, 79, -62, -15, Ascii.FF, -7, 79, -57, -1, -10, 9, 74, Ascii.SUB, 10, 62, Ascii.SO, Ascii.FF, 56, -55, 3, -6, 10, -15, Ascii.CR, 79, Ascii.SO, Ascii.FF, -28, 79, -55, 3, -6, 10, -15, Ascii.CR, 79, Ascii.SO, Ascii.FF, -28, 79, -28, 4, 61, 10, Ascii.SI, Ascii.FF, 49, -63, -13, 8, -1, Ascii.CAN, Utf8.REPLACEMENT_BYTE, -76, -10, Ascii.VT, 5, 9, Ascii.VT, 9, 9, -32, Ascii.SO, Ascii.VT, -10, 79, -80, -15, Ascii.CR, 78, -79, 10, 1, -3, 10, 6, -2, -56, 0, -11, -1, 8, 54, -59, -26, Ascii.CAN, -10, 62, -54, Ascii.SO, Ascii.FF, 56, -56, 0, -11, -1, 8, 54, -59, -26, Ascii.CAN, -10, 62, -54, Ascii.SO, Ascii.FF, -28, 79, -63, -12, Ascii.SO, -27, Ascii.FF, 8, 3, -16, 60, -54, Ascii.SO, Ascii.FF, 56, -55, 3, -6, 10, -15, Ascii.CR, 79, -80, Ascii.SO, Ascii.VT, -10, 78, -62, -12, Ascii.VT, -4, 74, -61, -27, 67, -74, -12, -11, 77, -55, 3, -6, 10, -15, Ascii.CR, 79, -59, 47, 7, -10, -34, -57, -1, -10, 9, 74, -12, Ascii.CR, -14, Ascii.CR, 9, 53, -13, 1, 9, -27, -12, SignedBytes.MAX_POWER_OF_TWO, -78, Ascii.SUB, 10, 62, 8, -9, -8, 1, Ascii.US, 45, -52, -14, 6, -2, 53, -58, -32, Ascii.RS, -4, -14, 8, 9, Ascii.SUB, -26, 10, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT};
    private static char valueOf = 64917;
    private static char djBIcL = 7860;
    private static char AhwBna = 54214;
    private static char gEmmrt = 64020;

    /* JADX DEBUG: Duplicate block (B:10:0x0023) to fix multi-entry loop: BACK_EDGE: B:9:0x001f -> B:10:0x0023 */
    private static String $$e(short s, byte b, int i) {
        int i2 = i + 4;
        int i3 = s * 2;
        byte[] bArr = $$c;
        int i4 = 119 - b;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i2++;
            i4 += bArr[i2];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$14(Function0 function0, InterfaceC56387yDm interfaceC56387yDm) {
        super(0);
        this.$extrasProducer = function0;
        this.$owner$delegate = interfaceC56387yDm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:10:0x002b) to fix multi-entry loop: BACK_EDGE: B:9:0x0026 -> B:10:0x002b */
    private static void b(int i, byte b, int i2, Object[] objArr) {
        int i3 = 68 - (b * 3);
        byte[] bArr = $$a;
        int i4 = 7 - (i2 * 3);
        byte[] bArr2 = new byte[4 - i];
        int i5 = 3 - i;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i4 + (-i5) + 16;
            i4++;
            i3 = i7;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4;
            i4 = i8 + 1;
            i3 = i3 + (-bArr[i4]) + 16;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [111=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        Zh zh = new Zh();
        char[] cArr2 = new char[cArr.length];
        zh.EZpvd = 0;
        char[] cArr3 = new char[2];
        while (zh.EZpvd < cArr.length) {
            cArr3[0] = cArr[zh.EZpvd];
            cArr3[1] = cArr[zh.EZpvd + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $10 + 61;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i3) ^ ((c2 << 4) + ((char) (((long) AhwBna) ^ 6538634990023091910L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(gEmmrt)};
                    Object objEZpvd = YY.EZpvd(-2045992360);
                    if (objEZpvd == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objEZpvd = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$e(b, b2, (byte) (-b2)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) valueOf) ^ 6538634990023091910L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(djBIcL)};
                    Object objEZpvd2 = YY.EZpvd(-2045992360);
                    if (objEZpvd2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objEZpvd2 = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$e(b3, b4, (byte) (-b4)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objEZpvd2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4++;
                    int i7 = $11 + 11;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[zh.EZpvd] = cArr3[0];
            cArr2[zh.EZpvd + 1] = cArr3[1];
            Object[] objArr4 = {zh, zh};
            Object objEZpvd3 = YY.EZpvd(-549847163);
            if (objEZpvd3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, -619105543, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objEZpvd3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public /* synthetic */ CreationExtras invoke() {
        int i = 2 % 2;
        int i2 = fetchVPNInfo + 47;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        CreationExtras creationExtrasInvoke = invoke();
        int i4 = fetchVPNInfo + 43;
        AYXKKw = i4 % 128;
        if (i4 % 2 == 0) {
            return creationExtrasInvoke;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CreationExtras invoke() {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        int i = 2 % 2;
        Function0 function0 = this.$extrasProducer;
        CreationExtras defaultViewModelCreationExtras = null;
        if (function0 != null) {
            int i2 = fetchVPNInfo + 87;
            AYXKKw = i2 % 128;
            if (i2 % 2 != 0) {
                defaultViewModelCreationExtras.hashCode();
                throw null;
            }
            CreationExtras creationExtras = (CreationExtras) function0.invoke();
            if (creationExtras != null) {
                return creationExtras;
            }
        }
        ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(this.$owner$delegate);
        if (viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory) {
            int i3 = AYXKKw + 87;
            fetchVPNInfo = i3 % 128;
            if (i3 % 2 == 0) {
                defaultViewModelCreationExtras.hashCode();
                throw null;
            }
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        if (hasDefaultViewModelProviderFactory != null) {
            defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras();
            int i4 = fetchVPNInfo + 85;
            AYXKKw = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            }
        }
        return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [235=6] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        Zj zj = new Zj();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(AEQbTJ)};
            Object objEZpvd = YY.EZpvd(-1048485176);
            if (objEZpvd == null) {
                objEZpvd = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objEZpvd).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr2 = OLrzqt;
                if (bArr2 != null) {
                    int i6 = $11 + 77;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    for (int i7 = 0; i7 < length; i7++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                        Object objEZpvd2 = YY.EZpvd(1815080187);
                        if (objEZpvd2 == null) {
                            objEZpvd2 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new Class[]{Integer.TYPE});
                        }
                        bArr[i7] = ((Byte) ((Method) objEZpvd2).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = OLrzqt;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(KWHzl)};
                    Object objEZpvd3 = YY.EZpvd(-1048485176);
                    if (objEZpvd3 == null) {
                        objEZpvd3 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objEZpvd3).invoke(null, objArr4)).intValue()]) ^ (-2166281683126510581L))) + ((int) (((long) AEQbTJ) ^ (-2166281683126510581L))));
                } else {
                    iIntValue = (short) (((short) (((long) copydefault[i + ((int) (((long) KWHzl) ^ (-2166281683126510581L)))]) ^ (-2166281683126510581L))) + ((int) (((long) AEQbTJ) ^ (-2166281683126510581L))));
                }
            }
            if (iIntValue > 0) {
                int i8 = ((i + iIntValue) - 2) + ((int) (((long) KWHzl) ^ (-2166281683126510581L)));
                if (z) {
                    int i9 = $10 + 91;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                zj.OLrzqt = i8 + i4;
                try {
                    Object[] objArr5 = {zj, Integer.valueOf(i2), Integer.valueOf(EZpvd), sb};
                    Object objEZpvd4 = YY.EZpvd(-2015189563);
                    if (objEZpvd4 == null) {
                        objEZpvd4 = YY.EZpvd(180, 4, (char) 19181, -2084411207, false, $$e((byte) 0, $$c[1], (byte) (-1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objEZpvd4).invoke(null, objArr5)).append(zj.EZpvd);
                    zj.AEQbTJ = zj.EZpvd;
                    byte[] bArr4 = OLrzqt;
                    if (bArr4 != null) {
                        int i11 = $10 + 67;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i13 = 0; i13 < length2; i13++) {
                            bArr5[i13] = (byte) (((long) bArr4[i13]) ^ (-2166281683126510581L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = !(bArr4 == null);
                    zj.KWHzl = 1;
                    while (zj.KWHzl < iIntValue) {
                        int i14 = $11 + 75;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        if (z2) {
                            byte[] bArr6 = OLrzqt;
                            zj.OLrzqt = zj.OLrzqt - 1;
                            zj.EZpvd = (char) (zj.AEQbTJ + (((byte) (((byte) (((long) bArr6[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                        } else {
                            short[] sArr = copydefault;
                            zj.OLrzqt = zj.OLrzqt - 1;
                            zj.EZpvd = (char) (zj.AEQbTJ + (((short) (((short) (((long) sArr[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                        }
                        sb.append(zj.EZpvd);
                        zj.AEQbTJ = zj.EZpvd;
                        zj.KWHzl++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x153c, code lost:
    
        if (r8 > 1) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x1ed5, code lost:
    
        r10 = o.C12989cxQ.KWHzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x1ed9, code lost:
    
        r11 = (-576) - (~(r8 * (-575)));
        r12 = ~r8;
        r13 = ~((-2) | r12);
        r12 = ~((r12 ^ r10) | (r12 & r10));
        r12 = ((r13 ^ r12) | (r12 & r13)) * 576;
        r13 = (r11 ^ r12) + ((r11 & r12) << 1);
        r12 = ~(((-2) ^ r8) | ((-2) & r8));
        r8 = ~r8;
        r10 = ~r10;
        r10 = (r8 ^ r10) | (r10 & r8);
        r10 = -(-(((~((r10 ^ 1) | (r10 & 1))) | r12) * 576));
        r12 = (r13 & r10) + (r10 | r13);
        r8 = -(-((~((r8 & (-2)) | ((-2) ^ r8))) * 576));
        r10 = (r12 ^ r8) + ((r8 & r12) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x1f25, code lost:
    
        r7.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0e2f A[PHI: r27
  0x0e2f: PHI (r27v17 int) = (r27v16 int), (r27v18 int) binds: [B:134:0x0e2d, B:124:0x0d62] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0fb2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x1656  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x1659  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x1757  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x1829  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x1986 A[Catch: Exception -> 0x1a79, TRY_LEAVE, TryCatch #13 {Exception -> 0x1a79, blocks: (B:219:0x1836, B:226:0x1882, B:232:0x194a, B:236:0x197d, B:238:0x1984, B:239:0x1985, B:240:0x1986, B:247:0x19db, B:250:0x19f4, B:256:0x1a4b, B:258:0x1a51, B:260:0x1a5c, B:262:0x1a63, B:263:0x1a64, B:265:0x1a66, B:267:0x1a6d, B:268:0x1a6e, B:270:0x1a70, B:272:0x1a77, B:273:0x1a78, B:241:0x199a, B:243:0x19a7, B:244:0x19d0, B:220:0x1842, B:222:0x184f, B:223:0x1878, B:251:0x1a0a, B:253:0x1a17, B:254:0x1a40, B:227:0x1899, B:229:0x18a6, B:230:0x18d5), top: B:598:0x1836, inners: #3, #8, #18, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x1a7d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x1ae1  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x1ae9 A[EDGE_INSN: B:632:0x1ae9->B:279:0x1ae9 BREAK  A[LOOP:7: B:287:0x1b5f->B:291:0x1b6b]] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x1de8  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x1e95  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x1f52  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x1f55  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x2074  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x2089  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x20eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0397 A[PHI: r22
  0x0397: PHI (r22v10 long) = (r22v8 long), (r22v11 long) binds: [B:52:0x0493, B:41:0x0394] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x2a79  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x2a86  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x1f37 A[EXC_TOP_SPLITTER, PHI: r7
  0x1f37: PHI (r7v171 java.io.BufferedInputStream) = (r7v170 java.io.BufferedInputStream), (r7v673 java.io.BufferedInputStream) binds: [B:335:0x1f49, B:313:0x1ec1] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0675 A[PHI: r6 r22
  0x0675: PHI (r6v165 int) = (r6v127 int), (r6v142 int), (r6v166 int) binds: [B:72:0x0673, B:62:0x0582, B:43:0x0397] A[DONT_GENERATE, DONT_INLINE]
  0x0675: PHI (r22v9 long) = (r22v8 long), (r22v8 long), (r22v10 long) binds: [B:72:0x0673, B:62:0x0582, B:43:0x0397] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] AEQbTJ$1908f70b(int i, int i2, Object obj, int i3, boolean z) throws Throwable {
        int i4;
        long j;
        int i5;
        boolean z2;
        long j2;
        char c;
        int i6;
        Object[] objArr;
        int i7;
        int i8;
        int i9;
        int i10;
        Throwable th;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        Matcher matcher;
        File[] fileArr;
        Throwable th2;
        BufferedInputStream bufferedInputStream3;
        BufferedInputStream bufferedInputStream4;
        int i11;
        int i12;
        Object[] objArr2;
        char c2;
        char c3;
        char c4;
        int i13;
        boolean z3;
        char c5;
        int i14;
        String str;
        char c6;
        long j3;
        int i15;
        int i16;
        Object[] objArr3;
        int i17;
        int i18;
        int i19;
        boolean z4;
        Object obj2;
        Object obj3;
        int i20 = 2 % 2;
        try {
            Object objEZpvd = YY.EZpvd(764142643);
            if (objEZpvd == null) {
                byte b = (byte) 0;
                byte b2 = (byte) (b + 1);
                Object[] objArr4 = new Object[1];
                b(b, b2, b2, objArr4);
                objEZpvd = YY.EZpvd(121, 4, (char) 0, 699083087, false, (String) objArr4[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objEZpvd).invoke(null, null)).longValue();
            long j4 = 51723898;
            long j5 = -755;
            long j6 = -1;
            long j7 = ((j4 ^ j6) | (jLongValue ^ j6)) ^ j6;
            long j8 = (j5 * j4) + (j5 * jLongValue) + (((long) 1512) * j7);
            long j9 = jLongValue | j4;
            long j10 = i;
            long j11 = j8 + (((long) (-756)) * (j7 | ((j9 | j10) ^ j6)));
            long j12 = j10 ^ j6;
            long j13 = ((long) (-336029572)) + j11 + (((long) 756) * (j9 | j12));
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i21 = ~startUptimeMillis;
            int i22 = ((int) (j13 >> 32)) & (509003146 + ((741972081 | (~(i21 | 695254329))) * (-328)) + ((741972081 | startUptimeMillis) * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256) + (((~(startUptimeMillis | (-695254330))) | 674273329 | (~(i21 | 762953081))) * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256));
            int i23 = (int) j13;
            int i24 = (int) Runtime.getRuntime().totalMemory();
            int i25 = ~(1335709591 | i24);
            int i26 = ~i24;
            int i27 = i23 & ((-2038855459) + (((~(i26 | (-134217989))) | i25) * 920) + (((-1335709592) | (~(235734806 | i26))) * 920) + (((~(i24 | (-134217989))) | (~(1335709591 | i26)) | (~((-1099974786) | i24))) * 920));
            if (((i22 & i27) | (i22 ^ i27)) != 0) {
                Object[] objArr5 = {new int[]{i ^ 271}, new int[]{i}, new int[1], null};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i28 = (-613022724) + (((~((~iUptimeMillis) | (-932248521))) | 881170884) * (-235)) + (((~((-932248521) | iUptimeMillis)) | 881170884) * (-470)) + (((~(iUptimeMillis | (-51405321))) | 327684) * 235) + 16;
                int i29 = (i3 ^ i28) + ((i3 & i28) << 1);
                int i30 = i29 << 13;
                int i31 = (i29 | i30) & (~(i29 & i30));
                int i32 = i31 >>> 17;
                int i33 = (i31 | i32) & (~(i31 & i32));
                int i34 = i33 << 5;
                ((int[]) objArr5[2])[0] = (i33 | i34) & (~(i33 & i34));
                return objArr5;
            }
            Object[] objArr6 = new Object[1];
            a(-1007624071, (byte) 0, (short) 0, 1595249024, -35, objArr6);
            Object[] objArr7 = {(String) objArr6[0]};
            Object objEZpvd2 = YY.EZpvd(1845277648);
            if (objEZpvd2 == null) {
                byte b3 = (byte) 1;
                byte b4 = (byte) (b3 - 1);
                Object[] objArr8 = new Object[1];
                b(b3, b4, b4, objArr8);
                objEZpvd2 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (String) objArr8[0], new Class[]{String.class});
            }
            String str2 = (String) ((Method) objEZpvd2).invoke(null, objArr7);
            if (str2 != null) {
                Object[] objArr9 = new Object[1];
                a(-1007624061, (byte) 0, (short) 0, 1595249024, -40, objArr9);
                String str3 = (String) objArr9[0];
                Object[] objArr10 = new Object[1];
                a(-1007624056, (byte) 0, (short) 0, 1595249013, -38, objArr10);
                String[] strArr = {str3, (String) objArr10[0]};
                int i35 = 0;
                while (true) {
                    if (i35 >= 2) {
                        z4 = false;
                        break;
                    }
                    if (str2.contains(strArr[i35])) {
                        z4 = true;
                        break;
                    }
                    i35++;
                }
                if (z4) {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{25730, 7553, 13492, 33987, 25730, 7553, 35601, 61751, 17886, 38159, 29302, 59720, 35181, 4693, 23792, 61181, 47906, 19475, 49764, 35105, 31277, 42491, 55718, 52581}, 23, objArr11);
                    Object[] objArr12 = {(String) objArr11[0]};
                    Object objEZpvd3 = YY.EZpvd(1845277648);
                    if (objEZpvd3 == null) {
                        byte b5 = (byte) 1;
                        byte b6 = (byte) (b5 - 1);
                        Object[] objArr13 = new Object[1];
                        b(b5, b6, b6, objArr13);
                        objEZpvd3 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (String) objArr13[0], new Class[]{String.class});
                    }
                    Object objInvoke = ((Method) objEZpvd3).invoke(null, objArr12);
                    Object[] objArr14 = new Object[1];
                    a(-1007624049, (byte) 0, (short) 0, 1595249024, -16, objArr14);
                    Object[] objArr15 = {(String) objArr14[0]};
                    Object objEZpvd4 = YY.EZpvd(1845277648);
                    if (objEZpvd4 == null) {
                        byte b7 = (byte) 1;
                        byte b8 = (byte) (b7 - 1);
                        Object[] objArr16 = new Object[1];
                        b(b7, b8, b8, objArr16);
                        objEZpvd4 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (String) objArr16[0], new Class[]{String.class});
                    }
                    Object objInvoke2 = ((Method) objEZpvd4).invoke(null, objArr15);
                    if (objInvoke != null) {
                        Object[] objArr17 = {objInvoke, 42};
                        Object objEZpvd5 = YY.EZpvd(1485637403);
                        if (objEZpvd5 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 + 1);
                            Object[] objArr18 = new Object[1];
                            b(b9, b10, b10, objArr18);
                            objEZpvd5 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (String) objArr18[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue2 = ((Long) ((Method) objEZpvd5).invoke(null, objArr17)).longValue();
                        long j14 = 194557794;
                        j = j10;
                        long j15 = -574;
                        long j16 = j14 ^ j6;
                        long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
                        long j17 = jMaxMemory ^ j6;
                        long j18 = ((jLongValue2 ^ j6) | jMaxMemory) ^ j6;
                        long j19 = (j15 * j14) + (j15 * jLongValue2) + (((long) 1150) * (((j16 | j17) ^ j6) | j18)) + (((long) (-575)) * (j18 | ((j17 | jLongValue2) ^ j6))) + (((long) 575) * (((j16 | jMaxMemory) ^ j6) | ((j17 | j14) ^ j6))) + ((long) 1133395736);
                        int i36 = (~((-1048668962) | i)) | 369125889;
                        int i37 = ~((~i) | 1068100521);
                        int i38 = ((int) (j19 >> 32)) & ((-1167264896) + ((i36 | i37) * (-470)) + (((~((-679543073) | i)) | i37) * 470));
                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                        int i39 = ((int) j19) & ((((~((-273220866) | iMaxMemory)) | 1090519112) * 449) + 407037700 + (((~((~iMaxMemory) | (-273220866))) | 1090519112) * 449));
                        if (((i39 & i38) | (i38 ^ i39)) == 477111747) {
                            i4 = i;
                            if (Build.VERSION.SDK_INT > 33) {
                                Object[] objArr19 = new Object[1];
                                c(new char[]{39940, 9924, 2479, 8579, 62388, 32360, 22134, 16231, 48358, 51504, 26693, 45971, 51388, 10922, 20201, 51740, 32989, 47493, 46467, 61712, 28149, 8032, 61329, 21193, 41897, 18465, 26398, 35506}, 28, objArr19);
                                Object[] objArr20 = {(String) objArr19[0]};
                                Object objEZpvd6 = YY.EZpvd(1229107605);
                                if (objEZpvd6 == null) {
                                    byte b11 = (byte) 0;
                                    byte b12 = (byte) (b11 + 1);
                                    Object[] objArr21 = new Object[1];
                                    b(b11, b12, b12, objArr21);
                                    objEZpvd6 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1298300137, false, (String) objArr21[0], new Class[]{String.class});
                                }
                                long jLongValue3 = ((Long) ((Method) objEZpvd6).invoke(null, objArr20)).longValue();
                                long j20 = 526837203;
                                long j21 = 370;
                                long j22 = (j21 * j20) + (j21 * jLongValue3);
                                long j23 = -369;
                                long j24 = j20 | jLongValue3;
                                long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
                                long j25 = jFreeMemory ^ j6;
                                long j26 = j22 + ((j24 | j25) * j23);
                                long j27 = (j20 ^ j6) | j25;
                                long j28 = j26 + (j23 * (jLongValue3 | (j27 ^ j6))) + (((long) 369) * ((((jLongValue3 ^ j6) | j20) ^ j6) | ((jFreeMemory | j20) ^ j6) | ((j27 | jLongValue3) ^ j6))) + ((long) 1500997083);
                                int iMyPid = Process.myPid();
                                int i40 = 629542 + (((-1099639028) | iMyPid) * (-50));
                                int i41 = ~(1774954995 | iMyPid);
                                int i42 = ~iMyPid;
                                int i43 = ((int) (j28 >> 32)) & (i40 + ((i41 | (~((-16853139) | i42))) * 50) + (((~(i42 | (-1099639028))) | (~(1758101857 | i42)) | 16853138) * 50));
                                int i44 = ~i4;
                                int i45 = ((int) j28) & (802172634 + (((-1443534289) | i44) * (-369)) + (((~(1988802512 | i44)) | 551576102) * (-369)) + (((~(i44 | 1995110390)) | (~((-1988802513) | i4)) | 545268224) * 369));
                                if (((i43 & i45) | (i43 ^ i45)) == 1) {
                                    int i46 = fetchVPNInfo;
                                    int i47 = (i46 ^ 1) + ((i46 & 1) << 1);
                                    AYXKKw = i47 % 128;
                                    int i48 = i47 % 2;
                                    i5 = 1;
                                    z2 = true;
                                }
                            } else {
                                Object[] objArr22 = new Object[1];
                                a(-1007624020, (byte) 0, (short) 0, 1595249024, -33, objArr22);
                                Object[] objArr23 = {(String) objArr22[0]};
                                Object objEZpvd7 = YY.EZpvd(1845277648);
                                if (objEZpvd7 == null) {
                                    byte b13 = (byte) 1;
                                    byte b14 = (byte) (b13 - 1);
                                    Object[] objArr24 = new Object[1];
                                    b(b13, b14, b14, objArr24);
                                    objEZpvd7 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (String) objArr24[0], new Class[]{String.class});
                                }
                                Object objInvoke3 = ((Method) objEZpvd7).invoke(null, objArr23);
                                Object[] objArr25 = new Object[1];
                                c(new char[]{29998, 52544}, 1, objArr25);
                                if (objInvoke3.equals((String) objArr25[0])) {
                                    i5 = 1;
                                    z2 = true;
                                }
                            }
                        }
                    } else {
                        j = j10;
                    }
                    if (objInvoke2 != null) {
                        int i49 = AYXKKw + 29;
                        fetchVPNInfo = i49 % 128;
                        int i50 = i49 % 2;
                        Object[] objArr26 = {objInvoke2, 42};
                        Object objEZpvd8 = YY.EZpvd(1485637403);
                        if (objEZpvd8 == null) {
                            byte b15 = (byte) 0;
                            byte b16 = (byte) (b15 + 1);
                            Object[] objArr27 = new Object[1];
                            b(b15, b16, b16, objArr27);
                            objEZpvd8 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (String) objArr27[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue4 = ((Long) ((Method) objEZpvd8).invoke(null, objArr26)).longValue();
                        long j29 = 1056660404;
                        int iMyPid2 = Process.myPid();
                        long j30 = j29 ^ j6;
                        long j31 = (((long) (-183)) * j29) + (((long) CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384) * jLongValue4) + (((long) (-368)) * (jLongValue4 | j30));
                        long j32 = CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256;
                        long j33 = jLongValue4 ^ j6;
                        obj2 = objInvoke;
                        obj3 = objInvoke2;
                        long j34 = ((long) iMyPid2) ^ j6;
                        long j35 = j31 + ((j29 | j33 | j34) * j32) + (j32 * (((jLongValue4 | j29) ^ j6) | ((j30 | j33) ^ j6) | ((j34 | j29) ^ j6))) + ((long) 271293126);
                        int i51 = ~new Random().nextInt(1496978250);
                        int i52 = ((int) (j35 >> 32)) & ((-886388022) + (((~(i51 | (-1230229483))) | 1090636394) * (-160)) + (((~(i51 | 1627511402)) | (-1230229483)) * CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256));
                        int iNextInt = new Random().nextInt();
                        int i53 = ((int) j35) & ((((~((-25514514) | iNextInt)) | 673185860) * 449) + 1061145596 + (((~((~iNextInt) | (-25514514))) | 673185860) * 449));
                        if (((i52 & i53) | (i52 ^ i53)) != 477111747) {
                        }
                        if (Build.VERSION.SDK_INT > 33) {
                        }
                    } else {
                        obj2 = objInvoke;
                        obj3 = objInvoke2;
                    }
                    if (obj2 != null) {
                        Object[] objArr28 = {obj2, 42};
                        Object objEZpvd9 = YY.EZpvd(1485637403);
                        if (objEZpvd9 == null) {
                            byte b17 = (byte) 0;
                            byte b18 = (byte) (b17 + 1);
                            Object[] objArr29 = new Object[1];
                            b(b17, b18, b18, objArr29);
                            objEZpvd9 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (String) objArr29[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue5 = ((Long) ((Method) objEZpvd9).invoke(null, objArr28)).longValue();
                        long j36 = 287751553;
                        long j37 = (((long) 659) * j36) + (((long) (-657)) * jLongValue5);
                        long j38 = ((j36 ^ j6) | jLongValue5) ^ j6;
                        long j39 = ((jLongValue5 ^ j6) | j36) ^ j6;
                        long jNextInt = (((long) new Random().nextInt()) | j36) ^ j6;
                        long j40 = 658;
                        long j41 = j37 + (((long) (-658)) * (j38 | j39 | jNextInt)) + (j40 * j39) + (j40 * (j39 | jNextInt)) + ((long) 1040201977);
                        int iMyPid3 = Process.myPid();
                        int i54 = ((int) (j41 >> 32)) & (635053320 + ((1526054895 | iMyPid3) * (-627)) + (((~((-1481640911) | iMyPid3)) | (-44414500)) * (-627)) + (((~(iMyPid3 | (-44414500))) | (~((~iMyPid3) | 1481640910))) * 627));
                        i4 = i;
                        int i55 = 660758901 + (((~((-582152811) | i4)) | (-855073600)) * 672);
                        int i56 = ~i4;
                        int i57 = ((int) j41) & (i55 + (((~((-855073600) | i4)) | (~(582152810 | i56))) * (-672)) + (((~(i56 | 855073599)) | 36928) * 672));
                        if (((i54 & i57) | (i54 ^ i57)) == -1032769152) {
                            if (Build.VERSION.SDK_INT > 33) {
                            }
                        }
                    } else {
                        i4 = i;
                    }
                    if (obj3 != null) {
                        Object[] objArr30 = {obj3, 42};
                        Object objEZpvd10 = YY.EZpvd(1485637403);
                        if (objEZpvd10 == null) {
                            byte b19 = (byte) 0;
                            byte b20 = (byte) (b19 + 1);
                            Object[] objArr31 = new Object[1];
                            b(b19, b20, b20, objArr31);
                            objEZpvd10 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (String) objArr31[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue6 = ((Long) ((Method) objEZpvd10).invoke(null, objArr30)).longValue();
                        long j42 = -732235822;
                        long j43 = (((long) LuaValue.ERR_WRITE_FILE_ERROR) * j42) + (((long) 302) * jLongValue6);
                        long j44 = LuaValue.ERR_CLOSE_FILE_ERROR;
                        long j45 = j43 + ((((j42 | jLongValue6) | j) ^ j6) * j44);
                        long j46 = jLongValue6 ^ j6;
                        long j47 = j45 + (j44 * (((j46 | j) ^ j6) | ((j12 | j42) ^ j6))) + (((long) 301) * (j46 | (((j42 ^ j6) | j) ^ j6))) + ((long) 2060189352);
                        int iNextInt2 = new Random().nextInt(712112212);
                        int i58 = ~iNextInt2;
                        int i59 = ((int) (j47 >> 32)) & ((-1241698578) + (((~(1454421375 | i58)) | (-1403319510)) * (-602)) + (((~(iNextInt2 | 1454421375)) | (-1471477248) | (~((-1386263638) | i58))) * LuaValue.ERR_CLOSE_FILE_ERROR) + ((~(i58 | (-1403319510))) * 301));
                        int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                        int i60 = ~iMaxMemory2;
                        int i61 = (~((-2052473099) | i60)) | 1342177280;
                        int i62 = ~(iMaxMemory2 | (-94971970));
                        int i63 = ((int) j47) & ((-1238069940) + ((i61 | i62) * (-713)) + (i62 * 1426) + ((~((-805267788) | i60)) * 713));
                        if (((i59 & i63) | (i59 ^ i63)) == 542074309) {
                        }
                    }
                } else {
                    i4 = i;
                    j = j10;
                }
                i5 = 1;
                z2 = false;
            }
            if (!(!z2)) {
                Object[] objArr32 = {new int[]{(i4 & (-261)) | ((~i4) & 260)}, new int[]{i4}, new int[1], null};
                int iMyUid = Process.myUid();
                int i64 = (-2013253080) + ((~((~iMyUid) | (-20971529))) * 433) + (((~((-1522234229) | iMyUid)) | (-291185177)) * (-433)) + (((~(iMyUid | (-291185177))) | (-1543205757)) * 433);
                int iKWHzl = C12989cxQ.KWHzl();
                int i65 = 14095 - (~(i64 * 881));
                int i66 = ~i64;
                int i67 = ~((-17) | i66);
                int i68 = ~(((-17) ^ iKWHzl) | ((-17) & iKWHzl));
                int i69 = (i68 & i67) | (i67 ^ i68);
                int i70 = ~((i66 & iKWHzl) | (i66 ^ iKWHzl));
                int i71 = i65 + (((i70 & i69) | (i69 ^ i70)) * (-880));
                int i72 = ~iKWHzl;
                int i73 = ~((i72 & (-17)) | ((-17) ^ i72));
                int i74 = (i64 & i73) | (i64 ^ i73);
                int i75 = ~((iKWHzl & 16) | (iKWHzl ^ 16));
                int i76 = i71 + (((i74 & i75) | (i74 ^ i75)) * (-880)) + (i75 * 880);
                int iKWHzl2 = C12989cxQ.KWHzl();
                int i77 = i76 * 85;
                int i78 = -(-(i3 * 85));
                int i79 = (i77 & i78) + (i77 | i78);
                int i80 = ~i76;
                int i81 = ~i3;
                int i82 = ~(i80 | i81);
                int i83 = ~i76;
                int i84 = ~iKWHzl2;
                int i85 = i82 | (~((i83 & i84) | (i83 ^ i84)));
                int i86 = ~iKWHzl2;
                int i87 = ~((i81 & i86) | (i81 ^ i86));
                int i88 = (i85 & i87) | (i85 ^ i87);
                int i89 = i76 | i3;
                int i90 = (i79 - (~(-(-((i88 | (~((i89 & iKWHzl2) | (i89 ^ iKWHzl2)))) * (-84)))))) - 1;
                int i91 = ~i3;
                int i92 = ~((iKWHzl2 & i91) | (i91 ^ iKWHzl2));
                int i93 = (i92 & i76) | (i76 ^ i92);
                int i94 = ~((i84 ^ i3) | (i84 & i3));
                int i95 = ((i93 & i94) | (i93 ^ i94)) * (-84);
                int i96 = ((i90 | i95) << 1) - (i95 ^ i90);
                int i97 = ~((i84 ^ i3) | (i84 & i3));
                int i98 = ~((i3 & i76) | (i76 ^ i3));
                int i99 = (i96 - (~(((i97 & i98) | (i97 ^ i98)) * 84))) - 1;
                int i100 = i99 << 13;
                int i101 = (i100 | i99) & (~(i99 & i100));
                int i102 = i101 >>> 17;
                int i103 = ((~i101) & i102) | ((~i102) & i101);
                ((int[]) objArr32[2])[0] = i103 ^ (i103 << 5);
                return objArr32;
            }
            Object[] objArr33 = new Object[i5];
            c(new char[]{41608, 7592, 11170, 62733, 60131, 31084, 14196, 17917}, 8, objArr33);
            String str4 = (String) objArr33[0];
            Object[] objArr34 = new Object[i5];
            a(-1007624008, (byte) 0, (short) 0, 1595249007, -40, objArr34);
            String str5 = (String) objArr34[0];
            Object[] objArr35 = new Object[1];
            c(new char[]{18049, 59291, 40253, 60942, 48231, 1379, 49712, 64123}, 7, objArr35);
            String str6 = (String) objArr35[0];
            Object[] objArr36 = new Object[1];
            a(-1007624003, (byte) 0, (short) 0, 1595249013, -37, objArr36);
            String str7 = (String) objArr36[0];
            Object[] objArr37 = new Object[1];
            c(new char[]{51665, 41926, 6952, 28871, 59738, 987}, 6, objArr37);
            String str8 = (String) objArr37[0];
            Object[] objArr38 = new Object[1];
            a(-1007623995, (byte) 0, (short) 0, 1595249015, -33, objArr38);
            String str9 = (String) objArr38[0];
            Object[] objArr39 = new Object[1];
            c(new char[]{21940, 48939, 39220, 54623, 4994, 6988}, 5, objArr39);
            String str10 = (String) objArr39[0];
            Object[] objArr40 = new Object[1];
            a(-1007623983, (byte) 0, (short) 0, 1595249015, -40, objArr40);
            String str11 = (String) objArr40[0];
            Object[] objArr41 = new Object[1];
            a(-1007623978, (byte) 0, (short) 0, 1595249015, -44, objArr41);
            String str12 = (String) objArr41[0];
            Object[] objArr42 = new Object[1];
            a(-1007623977, (byte) 0, (short) 0, 1595249018, -30, objArr42);
            String str13 = (String) objArr42[0];
            Object[] objArr43 = new Object[1];
            c(new char[]{13163, 16784, 18564, 45390, 60825, 35693, 57242, 26570, 26398, 35506}, 10, objArr43);
            String str14 = (String) objArr43[0];
            Object[] objArr44 = new Object[1];
            c(new char[]{62902, 53948, 25527, 9840, 46706, 33001, 13278, 6601}, 8, objArr44);
            String str15 = (String) objArr44[0];
            Object[] objArr45 = new Object[1];
            a(-1007623962, (byte) 0, (short) 0, 1595249022, -34, objArr45);
            String str16 = (String) objArr45[0];
            Object[] objArr46 = new Object[1];
            a(-1007623951, (byte) 0, (short) 0, 1595249022, -32, objArr46);
            String str17 = (String) objArr46[0];
            Object[] objArr47 = new Object[1];
            a(-1007623938, (byte) 0, (short) 0, 1595249024, -39, objArr47);
            String str18 = (String) objArr47[0];
            Object[] objArr48 = new Object[1];
            a(-1007623932, (byte) 0, (short) 0, 1595249025, -39, objArr48);
            String str19 = (String) objArr48[0];
            Object[] objArr49 = new Object[1];
            c(new char[]{27895, 7740, 59738, 987, 64757, 51487, 29002, 55525}, 7, objArr49);
            String str20 = (String) objArr49[0];
            Object[] objArr50 = new Object[1];
            c(new char[]{45106, 8125}, 2, objArr50);
            String str21 = (String) objArr50[0];
            Object[] objArr51 = new Object[1];
            a(-1007623926, (byte) 0, (short) 0, 1595249025, -26, objArr51);
            String str22 = (String) objArr51[0];
            Object[] objArr52 = new Object[1];
            c(new char[]{31406, 32101, 46706, 33001, 49827, 51182}, 6, objArr52);
            String str23 = (String) objArr52[0];
            Object[] objArr53 = new Object[1];
            a(-1007623907, (byte) 0, (short) 0, 1595249025, -44, objArr53);
            String str24 = (String) objArr53[0];
            Object[] objArr54 = new Object[1];
            c(new char[]{5761, 62174, 22134, 16231, 51509, 11711, 8739, 15327, 34347, 24562, 31406, 32101, 52641, 47196, 40253, 60942}, 16, objArr54);
            String str25 = (String) objArr54[0];
            Object[] objArr55 = new Object[1];
            a(-1007623906, (byte) 0, (short) 0, 1595249026, -37, objArr55);
            String str26 = (String) objArr55[0];
            Object[] objArr56 = new Object[1];
            a(-1007623898, (byte) 0, (short) 0, 1595249026, -36, objArr56);
            String str27 = (String) objArr56[0];
            Object[] objArr57 = new Object[1];
            a(-1007623889, (byte) 0, (short) 0, 1595249026, -35, objArr57);
            String str28 = (String) objArr57[0];
            Object[] objArr58 = new Object[1];
            a(-1007623879, (byte) 0, (short) 0, 1595249027, -35, objArr58);
            String str29 = (String) objArr58[0];
            Object[] objArr59 = new Object[1];
            c(new char[]{18708, 32174, 11014, 30980, 49615, 336, 30180, 62732, 55599, 42395, 31319, 50382, 55235, 32892, 58304, 62304}, 15, objArr59);
            String str30 = (String) objArr59[0];
            Object[] objArr60 = new Object[1];
            a(-1007623869, (byte) 0, (short) 0, 1595249027, -32, objArr60);
            String[] strArr2 = {str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, (String) objArr60[0]};
            Object[] objArr61 = new Object[1];
            a(-1007624071, (byte) 0, (short) 0, 1595249024, -35, objArr61);
            Object[] objArr62 = {(String) objArr61[0]};
            Object objEZpvd11 = YY.EZpvd(1845277648);
            if (objEZpvd11 == null) {
                byte b21 = (byte) 1;
                byte b22 = (byte) (b21 - 1);
                Object[] objArr63 = new Object[1];
                b(b21, b22, b22, objArr63);
                objEZpvd11 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (String) objArr63[0], new Class[]{String.class});
            }
            Object objInvoke4 = ((Method) objEZpvd11).invoke(null, objArr62);
            if (objInvoke4 != null) {
                Object[] objArr64 = new Object[1];
                a(-1007624061, (byte) 0, (short) 0, 1595249024, -40, objArr64);
                String str31 = (String) objArr64[0];
                Object[] objArr65 = new Object[1];
                a(-1007624056, (byte) 0, (short) 0, 1595249013, -38, objArr65);
                Object[] objArr66 = {objInvoke4, new String[]{str31, (String) objArr65[0]}};
                Object objEZpvd12 = YY.EZpvd(-1100697334);
                if (objEZpvd12 == null) {
                    byte b23 = (byte) 0;
                    byte b24 = (byte) (b23 + 1);
                    Object[] objArr67 = new Object[1];
                    b(b23, b24, b24, objArr67);
                    objEZpvd12 = YY.EZpvd(449, 5, (char) 22140, -1169916810, false, (String) objArr67[0], new Class[]{String.class, String[].class});
                }
                long jLongValue7 = ((Long) ((Method) objEZpvd12).invoke(null, objArr66)).longValue();
                long j48 = 612804153;
                long j49 = j48 ^ j6;
                long j50 = (j12 | j48) ^ j6;
                long j51 = (((long) 375) * j48) + (((long) (-747)) * jLongValue7) + (((long) (-374)) * (((j49 | jLongValue7) ^ j6) | j50));
                long j52 = jLongValue7 ^ j6;
                long j53 = j51 + (((long) 748) * ((j48 | j52) ^ j6)) + (((long) 374) * (((j49 | j52) ^ j6) | j50)) + ((long) 401202877);
                int i104 = ~i4;
                int i105 = ((int) (j53 >> 32)) & (1002935386 + (((~((-1652401191) | i104)) | (~(215174779 | i4))) * 217) + (((~((-1652401191) | i4)) | 1647091716) * 217) + (((~(215174779 | i104)) | 1652401190) * 217));
                int i106 = ((int) j53) & ((((~((-968344638) | i104)) | 153223205 | (~(1889396248 | i104))) * (-397)) + 1572401237 + ((1227498021 | i4) * 397));
                if (((i106 & i105) | (i105 ^ i106)) != 0) {
                    Object[] objArr68 = new Object[1];
                    c(new char[]{25730, 7553, 13492, 33987, 25730, 7553, 35601, 61751, 17886, 38159, 29302, 59720, 35181, 4693, 23792, 61181, 47906, 19475, 49764, 35105, 31277, 42491, 55718, 52581}, 23, objArr68);
                    Object[] objArr69 = {(String) objArr68[0]};
                    Object objEZpvd13 = YY.EZpvd(1845277648);
                    if (objEZpvd13 == null) {
                        byte b25 = (byte) 1;
                        byte b26 = (byte) (b25 - 1);
                        Object[] objArr70 = new Object[1];
                        b(b25, b26, b26, objArr70);
                        objEZpvd13 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (String) objArr70[0], new Class[]{String.class});
                    }
                    Object objInvoke5 = ((Method) objEZpvd13).invoke(null, objArr69);
                    Object[] objArr71 = new Object[1];
                    a(-1007624049, (byte) 0, (short) 0, 1595249024, -16, objArr71);
                    Object[] objArr72 = {(String) objArr71[0]};
                    Object objEZpvd14 = YY.EZpvd(1845277648);
                    if (objEZpvd14 == null) {
                        byte b27 = (byte) 1;
                        byte b28 = (byte) (b27 - 1);
                        Object[] objArr73 = new Object[1];
                        b(b27, b28, b28, objArr73);
                        objEZpvd14 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (String) objArr73[0], new Class[]{String.class});
                    }
                    Object objInvoke6 = ((Method) objEZpvd14).invoke(null, objArr72);
                    if (objInvoke5 != null) {
                        Object[] objArr74 = {objInvoke5, 42};
                        Object objEZpvd15 = YY.EZpvd(1485637403);
                        if (objEZpvd15 == null) {
                            byte b29 = (byte) 0;
                            byte b30 = (byte) (b29 + 1);
                            Object[] objArr75 = new Object[1];
                            b(b29, b30, b30, objArr75);
                            objEZpvd15 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (String) objArr75[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue8 = ((Long) ((Method) objEZpvd15).invoke(null, objArr74)).longValue();
                        long j54 = 302976079;
                        i18 = i104;
                        long j55 = (((long) 51) * j54) + (((long) (-49)) * jLongValue8) + (((long) (-50)) * (j54 | j));
                        long j56 = 50;
                        long j57 = jLongValue8 ^ j6;
                        long j58 = j57 | j12;
                        int i107 = (int) ((((j55 + ((((((j54 ^ j6) | j57) | j) ^ j6) | ((j58 | j54) ^ j6)) * j56)) + (j56 * (((j58 ^ j6) | ((j57 | j54) ^ j6)) | ((j12 | j54) ^ j6)))) + ((long) 1024977451)) >> 32);
                        int i108 = ~((int) Process.getStartUptimeMillis());
                        if (((i107 & ((((~((-1141915985) | i108)) | (~(1423788926 | r7))) * 988) + 363487550 + (((~(r7 | (-1155353469))) | 13437484 | (~(i108 | 1423788926))) * 988))) | (((int) r9) & (1944426649 + (((~(1972249764 | i4)) | (-885491122)) * (-668)) + ((1972249764 | (~((-885491122) | i4))) * 1336) + (((-4292882) | i4) * 668)))) == 477111747) {
                            int i109 = 0;
                            int i110 = 0;
                            while (i109 < 28) {
                                String str32 = strArr2[i109];
                                Object[] objArr76 = new Object[1];
                                c(new char[]{41905, 25767, 14196, 17917, 64757, 51487, 56923, 9876, 13395, 18882, 23979, 45655}, 12, objArr76);
                                Object[] objArr77 = {((String) objArr76[0]).concat(String.valueOf(str32))};
                                Object objEZpvd16 = YY.EZpvd(1229107605);
                                if (objEZpvd16 == null) {
                                    byte b31 = (byte) 0;
                                    byte b32 = (byte) (b31 + 1);
                                    Object[] objArr78 = new Object[1];
                                    b(b31, b32, b32, objArr78);
                                    objEZpvd16 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1298300137, false, (String) objArr78[0], new Class[]{String.class});
                                }
                                long jLongValue9 = ((Long) ((Method) objEZpvd16).invoke(null, objArr77)).longValue();
                                long j59 = 1071250181;
                                long j60 = 881;
                                long j61 = (j60 * j59) + (j60 * jLongValue9);
                                long j62 = -880;
                                long j63 = j59 ^ j6;
                                long j64 = jLongValue9 ^ j6;
                                long j65 = (j59 | j) ^ j6;
                                long j66 = j61 + ((((j63 | j64) ^ j6) | ((j63 | j) ^ j6) | ((j64 | j) ^ j6)) * j62) + (j62 * (jLongValue9 | ((j63 | j12) ^ j6) | j65)) + (((long) 880) * j65) + ((long) 956584105);
                                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                int i111 = ((int) (j66 >> 32)) & ((-818884594) + (((~iUptimeMillis2) | (-1575853888)) * 1324) + (((~(iUptimeMillis2 | (-1567432472))) | (~((-1290308414) | iUptimeMillis2))) * (-1324)) + 1332552860);
                                int i112 = ((int) j66) & ((-1067270959) + (((~(i18 | (-439113793))) | (-998112618)) * 220) + (((~(i18 | (-992770114))) | (-444456297)) * (-440)) + (((-439113793) | i4) * 220));
                                if (((i112 & i111) | (i111 ^ i112)) == 0) {
                                    int i113 = ~((i18 ^ (-740763117)) | (i18 & (-740763117)));
                                    int i114 = (i113 & 2565388) | (i113 ^ 2565388);
                                    int i115 = ~((-270047748) | i4);
                                    int i116 = (-473816585) + (((i114 & i115) | (i114 ^ i115)) * 717);
                                    int i117 = ~(((-270047748) & i18) | ((-270047748) ^ i18));
                                    int i118 = (i117 & 2565388) | (i117 ^ 2565388);
                                    int i119 = ~(((-740763117) & i4) | ((-740763117) ^ i4));
                                    int i120 = -(-(((i119 & i118) | (i118 ^ i119)) * 717));
                                    int i121 = (i116 & i120) + (i120 | i116);
                                    int iKWHzl3 = C12989cxQ.KWHzl();
                                    int i122 = (-1564312670) - (~(((iKWHzl3 ^ 5558339) | (iKWHzl3 & 5558339)) * 988));
                                    int i123 = -(-(((~((~iKWHzl3) | (-2139762317))) | 897592968) * (-1976)));
                                    int i124 = ((i122 | i123) << 1) - (i123 ^ i122);
                                    int i125 = ~(1247727687 | iKWHzl3);
                                    int i126 = ~iKWHzl3;
                                    int i127 = ((~((i126 & (-1247727688)) | (i126 ^ (-1247727688)))) | (5558339 & i125) | (5558339 ^ i125)) * 988;
                                    i19 = i121 > (i124 & i127) + (i127 | i124) ? 1 : 0;
                                }
                                int iKWHzl4 = C12989cxQ.KWHzl();
                                int i128 = i19 * (-574);
                                int i129 = i110 * (-574);
                                int i130 = ((i128 | i129) << 1) - (i128 ^ i129);
                                int i131 = ~i19;
                                int i132 = ~iKWHzl4;
                                int i133 = ~(i131 | i132);
                                int i134 = ~i110;
                                int i135 = ~((i134 ^ iKWHzl4) | (i134 & iKWHzl4));
                                int i136 = i130 + (((i133 ^ i135) | (i133 & i135)) * 1150);
                                int i137 = ~i110;
                                int i138 = ~((i137 & iKWHzl4) | (i137 ^ iKWHzl4));
                                int i139 = ~((i110 & i132) | (i132 ^ i110));
                                int i140 = -(-(((i139 & i138) | (i138 ^ i139)) * (-575)));
                                int i141 = (i136 ^ i140) + ((i140 & i136) << 1);
                                int i142 = ~((i131 ^ iKWHzl4) | (i131 & iKWHzl4));
                                int i143 = ~iKWHzl4;
                                int i144 = ~((i19 & i143) | (i143 ^ i19));
                                i109 = ((i109 & 1) << 1) + (i109 ^ 1);
                                i110 = (i141 - (~(-(-(((i142 & i144) | (i142 ^ i144)) * 575))))) - 1;
                            }
                            if (i110 >= 25.2d) {
                                Object[] objArr79 = {new int[]{i4 ^ 261}, new int[]{i4}, new int[1], null};
                                int iMyPid4 = Process.myPid();
                                int i145 = ~((-1661224009) | iMyPid4);
                                int i146 = 1877041068 + ((1118208 | i145) * (-476)) + (i145 * 952) + ((~((~iMyPid4) | (-1661224009))) * 476);
                                int i147 = (((i146 | 16) << 1) - (16 ^ i146)) + i3;
                                int i148 = i147 << 13;
                                int i149 = (i147 | i148) & (~(i147 & i148));
                                int i150 = i149 >>> 17;
                                int i151 = (i149 | i150) & (~(i149 & i150));
                                int i152 = i151 << 5;
                                ((int[]) objArr79[2])[0] = (i151 | i152) & (~(i151 & i152));
                                return objArr79;
                            }
                        }
                    } else {
                        i18 = i104;
                    }
                    if (objInvoke6 != null) {
                        Object[] objArr80 = {objInvoke6, 42};
                        Object objEZpvd17 = YY.EZpvd(1485637403);
                        if (objEZpvd17 == null) {
                            byte b33 = (byte) 0;
                            byte b34 = (byte) (b33 + 1);
                            Object[] objArr81 = new Object[1];
                            b(b33, b34, b34, objArr81);
                            objEZpvd17 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (String) objArr81[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue10 = ((Long) ((Method) objEZpvd17).invoke(null, objArr80)).longValue();
                        long j67 = -738086667;
                        long j68 = -494;
                        long j69 = (j68 * j67) + (j68 * jLongValue10) + (((long) (-495)) * ((j67 | jLongValue10) ^ j6));
                        long j70 = 495;
                        long elapsedCpuTime = (((long) ((int) Process.getElapsedCpuTime())) ^ j6) | j67;
                        int i153 = ((int) ((((j69 + (j70 * elapsedCpuTime)) + (j70 * ((((jLongValue10 ^ j6) | (j67 ^ j6)) ^ j6) | (elapsedCpuTime ^ j6)))) + ((long) 2066040197)) >> 32)) & (((((~((-1728700964) | i4)) | (-1985375836)) * 398) - 1244587248) + (((~((-1728700964) | i18)) | (-1985375836)) * 398));
                        int i154 = ~((~((int) SystemClock.uptimeMillis())) | 918373432);
                        if ((i153 | (((int) r12) & ((((69533728 | i154) * (-374)) - 839885307) + ((i154 | 848839704) * 374)))) == 477111747) {
                        }
                    }
                }
            }
            Object[] objArr82 = new Object[1];
            a(-1007623856, (byte) 0, (short) 0, 1595248957, -23, objArr82);
            Object[] objArr83 = {(String) objArr82[0]};
            Object objEZpvd18 = YY.EZpvd(-1763027797);
            if (objEZpvd18 == null) {
                byte b35 = (byte) 0;
                byte b36 = (byte) (b35 + 1);
                Object[] objArr84 = new Object[1];
                b(b35, b36, b36, objArr84);
                objEZpvd18 = YY.EZpvd(403, 5, (char) 0, -1832216105, false, (String) objArr84[0], new Class[]{String.class});
            }
            long jLongValue11 = ((Long) ((Method) objEZpvd18).invoke(null, objArr83)).longValue();
            long j71 = -880998239;
            long j72 = (((long) (-947)) * j71) + (((long) 949) * jLongValue11);
            long j73 = -948;
            long j74 = j71 ^ j6;
            long j75 = jLongValue11 ^ j6;
            long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
            long j76 = j72 + ((j74 | ((j75 | jElapsedRealtime) ^ j6)) * j73) + (j73 * (((j74 | j75) | (jElapsedRealtime ^ j6)) ^ j6)) + (((long) 948) * (j75 | j71)) + ((long) 1238496522);
            int i155 = ~i4;
            int i156 = ((int) (j76 >> 32)) & (890658277 + (((~(1247480573 | i155)) | (~((-1610260312) | i4))) * 333) + (((~(1247480573 | i4)) | (~(i155 | (-1610260312)))) * 333));
            int i157 = ((int) j76) & (((((536914433 | r8) | (~((-2026045364) | i4))) * (-338)) - 348774489) + (((~(2026045363 | i155)) | (~((-1489130931) | i4))) * 338));
            Object[] objArr85 = new Object[1];
            a(-1007623834, (byte) 0, (short) 0, 1595248957, -29, objArr85);
            Object[] objArr86 = {(String) objArr85[0]};
            Object objEZpvd19 = YY.EZpvd(-1763027797);
            if (objEZpvd19 == null) {
                byte b37 = (byte) 0;
                byte b38 = (byte) (b37 + 1);
                Object[] objArr87 = new Object[1];
                b(b37, b38, b38, objArr87);
                objEZpvd19 = YY.EZpvd(403, 5, (char) 0, -1832216105, false, (String) objArr87[0], new Class[]{String.class});
            }
            long jLongValue12 = ((Long) ((Method) objEZpvd19).invoke(null, objArr86)).longValue();
            long j77 = -938837374;
            long j78 = 371;
            long j79 = (j78 * j77) + (j78 * jLongValue12);
            long j80 = -370;
            long j81 = jLongValue12 ^ j6;
            long j82 = j77 ^ j6;
            long j83 = (jLongValue12 | j77) ^ j6;
            long j84 = j79 + ((((j81 | j12) ^ j6) | ((j82 | j) ^ j6)) * j80) + (j80 * (((j82 | j12) ^ j6) | ((j81 | j) ^ j6) | j83)) + (((long) 370) * j83) + ((long) 1296335657);
            int i158 = ((int) (j84 >> 32)) & ((((~(316955119 | i4)) * TypedValues.CycleType.TYPE_EASING) - 903166242) + (((~(316955119 | i155)) | 46422443) * TypedValues.CycleType.TYPE_EASING));
            int i159 = ~((-1738786478) | i155);
            int i160 = ((int) j84) & ((-409432419) + ((27344897 | i159) * (-712)) + (((~((-27344898) | i155)) | (~((-1711441581) | i4))) * (-712)) + ((i159 | (-301560068)) * 712));
            if (j > 0 && j > 0 && j - 3 < j) {
                Object[] objArr88 = {new int[]{(~(i4 & 247)) & (i4 | 247)}, new int[]{i4}, new int[1], null};
                int iMyUid2 = Process.myUid();
                int i161 = 855557050 + (((~(iMyUid2 | 811732664)) | (-1006014205)) * 305) + (((~((~iMyUid2) | 811732664)) | (-1001686741)) * 305);
                int iKWHzl5 = C12989cxQ.KWHzl();
                int i162 = ~i161;
                int i163 = (((-3344) + (i161 * (-209))) - (~(-(-((~((-17) | i162)) * 210))))) - 1;
                int i164 = ~iKWHzl5;
                int i165 = ~((i162 & i164) | (i162 ^ i164));
                int i166 = ~(((-17) ^ iKWHzl5) | ((-17) & iKWHzl5));
                int i167 = (i163 - (~(((i165 & i166) | (i165 ^ i166)) * 210))) - 1;
                int i168 = (-17) | i164;
                int i169 = ((~(iKWHzl5 | (~i161) | 16)) | (~((i168 & i161) | (i168 ^ i161)))) * 210;
                int i170 = (i167 ^ i169) + ((i169 & i167) << 1);
                int iKWHzl6 = C12989cxQ.KWHzl();
                int i171 = i170 * 69;
                int i172 = i3 * (-67);
                int i173 = (i171 ^ i172) + ((i171 & i172) << 1);
                int i174 = ~i170;
                int i175 = ~i3;
                int i176 = i174 | i175;
                int i177 = ~iKWHzl6;
                int i178 = ~((i176 & i177) | (i176 ^ i177));
                int i179 = ~((i170 ^ i3) | (i170 & i3));
                int i180 = (i178 & i179) | (i178 ^ i179);
                int i181 = ~((i3 ^ iKWHzl6) | (i3 & iKWHzl6));
                int i182 = ~i170;
                int i183 = i173 + (((i180 & i181) | (i180 ^ i181)) * (-68)) + ((~(i3 | (i182 & i177) | (i182 ^ i177))) * (-68));
                int i184 = ~iKWHzl6;
                int i185 = ~((i184 & i175) | (i175 ^ i184));
                int i186 = ((i185 & i174) | (i174 ^ i185)) * 68;
                int i187 = (i183 & i186) + (i186 | i183);
                int i188 = i187 << 13;
                int i189 = (i188 & (~i187)) | ((~i188) & i187);
                int i190 = i189 ^ (i189 >>> 17);
                int i191 = i190 << 5;
                ((int[]) objArr88[2])[0] = ((~i190) & i191) | ((~i191) & i190);
                return objArr88;
            }
            Object[] objArr89 = new Object[1];
            a(-1007623856, (byte) 0, (short) 0, 1595248957, -23, objArr89);
            Object[] objArr90 = {(String) objArr89[0]};
            Object objEZpvd20 = YY.EZpvd(-1763027797);
            if (objEZpvd20 == null) {
                byte b39 = (byte) 0;
                byte b40 = (byte) (b39 + 1);
                Object[] objArr91 = new Object[1];
                b(b39, b40, b40, objArr91);
                objEZpvd20 = YY.EZpvd(403, 5, (char) 0, -1832216105, false, (String) objArr91[0], new Class[]{String.class});
            }
            long jLongValue13 = ((Long) ((Method) objEZpvd20).invoke(null, objArr90)).longValue();
            long j85 = -740089041;
            long j86 = -115;
            long j87 = (j86 * j85) + (j86 * jLongValue13) + (((long) (-116)) * (((j12 | j85) | jLongValue13) ^ j6));
            long j88 = AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
            long j89 = jLongValue13 ^ j6;
            long j90 = j87 + ((j85 | j) * j88) + (j88 * (((j89 | j) ^ j6) | (((j85 ^ j6) | j89) ^ j6))) + ((long) 1097587324);
            int iNextInt3 = new Random().nextInt(1442923678);
            int i192 = ~((-1644955149) | iNextInt3);
            int i193 = ~iNextInt3;
            int i194 = ((int) (j90 >> 32)) & (1599194092 + ((i192 | (~(2129657709 | i193))) * 497) + (((~(iNextInt3 | 2129657709)) | (~((-1921928973) | i193)) | 276973824) * 497));
            int i195 = ((int) j90) & ((-1185470711) + (((~(278332249 | i155)) | (-1158894161)) * (-602)) + (((~(278332249 | i4)) | (-1435980634) | (~((-1245777) | i155))) * LuaValue.ERR_CLOSE_FILE_ERROR) + ((~(i155 | (-1158894161))) * 301));
            Object[] objArr92 = new Object[1];
            a(-1007623818, (byte) 0, (short) 0, 1595248957, -42, objArr92);
            Object[] objArr93 = {(String) objArr92[0]};
            Object objEZpvd21 = YY.EZpvd(-1763027797);
            if (objEZpvd21 == null) {
                byte b41 = (byte) 0;
                byte b42 = (byte) (b41 + 1);
                Object[] objArr94 = new Object[1];
                b(b41, b42, b42, objArr94);
                objEZpvd21 = YY.EZpvd(403, 5, (char) 0, -1832216105, false, (String) objArr94[0], new Class[]{String.class});
            }
            long jLongValue14 = ((Long) ((Method) objEZpvd21).invoke(null, objArr93)).longValue();
            long j91 = -1732283385;
            long j92 = j91 ^ j6;
            long j93 = (((long) 55) * j91) + (((long) (-107)) * jLongValue14) + (((long) (-108)) * (((j92 | jLongValue14) ^ j6) | ((j12 | jLongValue14) ^ j6)));
            long j94 = 54;
            long j95 = ((jLongValue14 ^ j6) | j91) ^ j6;
            int i196 = ((int) ((((j93 + (((((j92 | j) ^ j6) | j95) | ((j12 | j91) ^ j6)) * j94)) + (j94 * (j | j95))) + ((long) 2089781668)) >> 32)) & ((-1428576278) + ((~(373949569 | i4)) * 216) + (((-689983785) | i155) * (-216)) + (((~(373949569 | i155)) | 1063276841) * 216));
            int i197 = ~((int) Runtime.getRuntime().maxMemory());
            int i198 = fetchVPNInfo;
            int i199 = (i198 & 1) + (i198 | 1);
            AYXKKw = i199 % 128;
            if (i199 % 2 == 0) {
                j2 = i;
                if (j > 0) {
                }
                c = 0;
                i6 = 8;
                char[] cArr = new char[i6];
                // fill-array-data instruction
                cArr[0] = 41905;
                cArr[1] = 25767;
                cArr[2] = 14196;
                cArr[3] = 17917;
                cArr[4] = 64757;
                cArr[5] = 51487;
                cArr[6] = 20823;
                cArr[7] = 1011;
                Object[] objArr95 = new Object[1];
                c(cArr, 7, objArr95);
                String str33 = (String) objArr95[c];
                Object[] objArr96 = new Object[1];
                a(-1007623815, (byte) 0, (short) 0, 1595248957, -35, objArr96);
                String str34 = (String) objArr96[0];
                Object[] objArr97 = new Object[1];
                a(-1007623805, (byte) 0, (short) 0, 1595248957, -34, objArr97);
                String str35 = (String) objArr97[0];
                Object[] objArr98 = new Object[1];
                c(new char[]{41905, 25767, 14196, 17917, 64757, 51487, 56923, 9876, 24296, 18706, 39975, 28578}, 12, objArr98);
                String str36 = (String) objArr98[0];
                Object[] objArr99 = new Object[1];
                c(new char[]{853, 19393, 35254, 45575, 6331, 9960, 40329, 48542, 13395, 18882, 3035, 51127}, 11, objArr99);
                String str37 = (String) objArr99[0];
                Object[] objArr100 = new Object[1];
                a(-1007623794, (byte) 0, (short) 0, 1595248957, -41, objArr100);
                String str38 = (String) objArr100[0];
                Object[] objArr101 = new Object[1];
                a(-1007623790, (byte) 0, (short) 0, 1595248957, -42, objArr101);
                String[] strArr3 = {str33, str34, str35, str36, str37, str38, (String) objArr101[0]};
                if ((i2 & 2048) == 0) {
                }
                return objArr;
            }
            j2 = i;
            if (j > 1) {
            }
            i6 = 8;
            c = 0;
            char[] cArr2 = new char[i6];
            // fill-array-data instruction
            cArr2[0] = 41905;
            cArr2[1] = 25767;
            cArr2[2] = 14196;
            cArr2[3] = 17917;
            cArr2[4] = 64757;
            cArr2[5] = 51487;
            cArr2[6] = 20823;
            cArr2[7] = 1011;
            Object[] objArr952 = new Object[1];
            c(cArr2, 7, objArr952);
            String str332 = (String) objArr952[c];
            Object[] objArr962 = new Object[1];
            a(-1007623815, (byte) 0, (short) 0, 1595248957, -35, objArr962);
            String str342 = (String) objArr962[0];
            Object[] objArr972 = new Object[1];
            a(-1007623805, (byte) 0, (short) 0, 1595248957, -34, objArr972);
            String str352 = (String) objArr972[0];
            Object[] objArr982 = new Object[1];
            c(new char[]{41905, 25767, 14196, 17917, 64757, 51487, 56923, 9876, 24296, 18706, 39975, 28578}, 12, objArr982);
            String str362 = (String) objArr982[0];
            Object[] objArr992 = new Object[1];
            c(new char[]{853, 19393, 35254, 45575, 6331, 9960, 40329, 48542, 13395, 18882, 3035, 51127}, 11, objArr992);
            String str372 = (String) objArr992[0];
            Object[] objArr1002 = new Object[1];
            a(-1007623794, (byte) 0, (short) 0, 1595248957, -41, objArr1002);
            String str382 = (String) objArr1002[0];
            Object[] objArr1012 = new Object[1];
            a(-1007623790, (byte) 0, (short) 0, 1595248957, -42, objArr1012);
            String[] strArr32 = {str332, str342, str352, str362, str372, str382, (String) objArr1012[0]};
            if ((i2 & 2048) == 0) {
                i7 = 0;
                if (i7 == 0) {
                    objArr = new Object[]{new int[]{i4 ^ i7}, new int[]{i4}, new int[]{((~i) & i) | ((~i) & i)}, null};
                    int i200 = (((-1801516124) + (((-807405073) | i155) * (-490))) + (((~((-962989849) | i4)) | 155584776) * 490)) - 98655218;
                    int i201 = 10544 + (i200 * (-657));
                    int i202 = ~(((-17) & i200) | ((-17) ^ i200));
                    int i203 = ~i200;
                    int i204 = ~((i203 & 16) | (i203 ^ 16));
                    int i205 = (i202 & i204) | (i202 ^ i204);
                    int i206 = ~((i4 ^ 16) | (i4 & 16));
                    int i207 = -(-(((i205 & i206) | (i205 ^ i206)) * (-658)));
                    int i208 = (i201 & i207) + (i207 | i201);
                    int i209 = ~i200;
                    int i210 = ~((i209 & 16) | (i209 ^ 16));
                    int i211 = -(-(i210 * 658));
                    int i212 = (i208 & i211) + (i211 | i208);
                    int i213 = ((i210 & i206) | (i210 ^ i206)) * 658;
                    int i214 = (i212 & i213) + (i213 | i212);
                    int i215 = ((i214 * (-963)) - 964) + (i3 * 965);
                    int i216 = ~i214;
                    int i217 = fetchVPNInfo + 33;
                    AYXKKw = i217 % 128;
                    int i218 = i217 % 2;
                    int i219 = ~i3;
                    int i220 = ~((i4 & i219) | (i219 ^ i4));
                    int i221 = -(-((-964) * ((i220 & i216) | (i216 ^ i220))));
                    int i222 = ~((i155 & i219) | (i219 ^ i155));
                    int i223 = ~((i219 & i214) | (i219 ^ i214));
                    int i224 = (i215 ^ i221) + ((i215 & i221) << 1) + (((i222 & i223) | (i222 ^ i223)) * (-964));
                    int i225 = i224 << 13;
                    int i226 = (i225 | i224) & (~(i224 & i225));
                    int i227 = i226 >>> 17;
                    int i228 = (i226 | i227) & (~(i226 & i227));
                    int i229 = i228 << 5;
                } else {
                    try {
                        objArr3 = new Object[1];
                        a(-1007623787, (byte) 0, (short) 0, 1595249024, -33, objArr3);
                    } catch (Exception unused) {
                    }
                    try {
                        Object[] objArr102 = {(String) objArr3[0]};
                        Object objEZpvd22 = YY.EZpvd(1845277648);
                        if (objEZpvd22 == null) {
                            byte b43 = (byte) 1;
                            byte b44 = (byte) (b43 - 1);
                            Object[] objArr103 = new Object[1];
                            b(b43, b44, b44, objArr103);
                            objEZpvd22 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (String) objArr103[0], new Class[]{String.class});
                        }
                        Object objInvoke7 = ((Method) objEZpvd22).invoke(null, objArr102);
                        if (objInvoke7 != null) {
                            Object[] objArr104 = new Object[1];
                            c(new char[]{11103, 51998, 35181, 4693, 1586, 45439, 35254, 45575, 38329, 24279, 49712, 64123}, 11, objArr104);
                            try {
                                Object[] objArr105 = {objInvoke7, new String[]{(String) objArr104[0]}};
                                Object objEZpvd23 = YY.EZpvd(-1100697334);
                                if (objEZpvd23 == null) {
                                    byte b45 = (byte) 0;
                                    byte b46 = (byte) (b45 + 1);
                                    Object[] objArr106 = new Object[1];
                                    b(b45, b46, b46, objArr106);
                                    objEZpvd23 = YY.EZpvd(449, 5, (char) 22140, -1169916810, false, (String) objArr106[0], new Class[]{String.class, String[].class});
                                }
                                long jLongValue15 = ((Long) ((Method) objEZpvd23).invoke(null, objArr105)).longValue();
                                long j96 = -506015980;
                                long j97 = (((long) 477) * j96) + (((long) (-475)) * jLongValue15);
                                long j98 = ((j96 ^ j6) | jLongValue15) ^ j6;
                                long j99 = jLongValue15 ^ j6;
                                long j100 = ((j99 | j96) | j) ^ j6;
                                long j101 = j97 + (((long) (-476)) * (j98 | j100)) + (((long) 952) * j100) + (((long) 476) * (((j99 | j12) | j96) ^ j6)) + ((long) 1520023010);
                                int i230 = ~(2034047263 | i4);
                                int i231 = ((int) (j101 >> 32)) & (1192211989 + (((-2076171136) | i230) * (-814)) + ((i230 | (~(596820852 | i155)) | 554696980) * 407) + (((~((-2034047264) | i4)) | 554696980 | (~((-596820853) | i4))) * 407));
                                int i232 = (int) j101;
                                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                int i233 = i232 & ((-635053948) + (((-1073750018) | iElapsedRealtime) * (-627)) + (((~((-1059948979) | iElapsedRealtime)) | 1797791907) * (-627)) + (((~(iElapsedRealtime | 1797791907)) | (~((~iElapsedRealtime) | 1059948978))) * 627));
                                if (((i231 & i233) | (i231 ^ i233)) != 0) {
                                    Object[] objArr107 = new Object[1];
                                    c(new char[]{39975, 28578, 41233, 39502, 21890, 17785, 15074, 11826, 21890, 17785, 56725, 32273, 32670, 18381, 50185, 51201, 64472, 39436}, 18, objArr107);
                                    try {
                                        Object[] objArr108 = {(String) objArr107[0]};
                                        Object objEZpvd24 = YY.EZpvd(1845277648);
                                        if (objEZpvd24 == null) {
                                            byte b47 = (byte) 1;
                                            byte b48 = (byte) (b47 - 1);
                                            Object[] objArr109 = new Object[1];
                                            b(b47, b48, b48, objArr109);
                                            objEZpvd24 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (String) objArr109[0], new Class[]{String.class});
                                        }
                                        Object objInvoke8 = ((Method) objEZpvd24).invoke(null, objArr108);
                                        if (objInvoke8 != null) {
                                            Object[] objArr110 = new Object[1];
                                            c(new char[]{21451, 63856, 37957, 24977, 39975, 28578, 11950, 36663}, 7, objArr110);
                                            if (objInvoke8.equals((String) objArr110[0])) {
                                                Object[] objArr111 = new Object[1];
                                                a(-1007623775, (byte) 0, (short) 0, 1595249022, -23, objArr111);
                                                try {
                                                    Object[] objArr112 = {(String) objArr111[0]};
                                                    Object objEZpvd25 = YY.EZpvd(1845277648);
                                                    if (objEZpvd25 == null) {
                                                        byte b49 = (byte) 1;
                                                        byte b50 = (byte) (b49 - 1);
                                                        Object[] objArr113 = new Object[1];
                                                        b(b49, b50, b50, objArr113);
                                                        objEZpvd25 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (String) objArr113[0], new Class[]{String.class});
                                                    }
                                                    String str39 = (String) ((Method) objEZpvd25).invoke(null, objArr112);
                                                    if (str39 != null && (i17 = Integer.parseInt(str39)) != 0) {
                                                        i8 = ((i17 & CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256) << 1) + (i17 ^ CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
                                                    }
                                                    if (i8 == 0) {
                                                        Object[] objArr114 = {new int[]{i4 ^ i8}, new int[]{i4}, new int[1], null};
                                                        int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                                        int i234 = ((((~((-1492429707) | r4)) | (~(startUptimeMillis2 | 320989698))) * 959) - 611083053) + (((~(startUptimeMillis2 | (-1492429707))) | (~((~startUptimeMillis2) | 320989698))) * 959);
                                                        int i235 = (i234 ^ 16) + ((16 & i234) << 1);
                                                        int i236 = (i3 & i235) + (i235 | i3);
                                                        int i237 = (i236 << 13) ^ i236;
                                                        int i238 = i237 >>> 17;
                                                        int i239 = ((~i237) & i238) | ((~i238) & i237);
                                                        ((int[]) objArr114[2])[0] = i239 ^ (i239 << 5);
                                                        return objArr114;
                                                    }
                                                    if ((i2 & 64) != 0) {
                                                        i10 = 0;
                                                        if (i10 == 0) {
                                                            objArr = new Object[]{new int[]{(~(i4 & i10)) & (i4 | i10)}, new int[]{i4}, new int[1], null};
                                                            int i240 = 855557050 + (((~(i4 | 1032873192)) | (-1066824941)) * 305) + (((~(i155 | 1032873192)) | (-780546213)) * 305);
                                                            int iKWHzl7 = C12989cxQ.KWHzl();
                                                            int i241 = i240 * 46;
                                                            int i242 = (736 & i241) + (i241 | 736);
                                                            int i243 = ~i240;
                                                            int i244 = ~iKWHzl7;
                                                            int i245 = ~(i243 | i244);
                                                            int i246 = ((i245 & 16) | (i245 ^ 16)) * (-90);
                                                            int i247 = (i242 ^ i246) + ((i242 & i246) << 1);
                                                            int i248 = ~((i243 ^ iKWHzl7) | (i243 & iKWHzl7));
                                                            int i249 = ~((i240 & 16) | (i240 ^ 16));
                                                            int i250 = (i247 - (~(((i249 & i248) | (i248 ^ i249)) * (-45)))) - 1;
                                                            int i251 = ~((iKWHzl7 & (-17)) | ((-17) ^ iKWHzl7));
                                                            int i252 = (i251 & i243) | (i243 ^ i251);
                                                            int i253 = ~((i244 ^ 16) | (i244 & 16));
                                                            int i254 = ((i252 & i253) | (i252 ^ i253)) * 45;
                                                            int i255 = (i250 ^ i254) + ((i254 & i250) << 1);
                                                            int i256 = ((i3 | i255) << 1) - (i3 ^ i255);
                                                            int i257 = i256 << 13;
                                                            int i258 = (i256 | i257) & (~(i256 & i257));
                                                            int i259 = i258 ^ (i258 >>> 17);
                                                            ((int[]) objArr[2])[0] = i259 ^ (i259 << 5);
                                                        } else {
                                                            long[] jArr = {472001035};
                                                            Object[] objArr115 = new Object[1];
                                                            c(new char[]{61909, 37524, 25730, 7553, 43434, 19003, 58810, 12503, 9363, 48314, 63548, 953, 1813, 43051, 58391, 38869, 52963, 60711}, 17, objArr115);
                                                            try {
                                                                bufferedInputStream2 = new BufferedInputStream(new FileInputStream((String) objArr115[0]));
                                                                j3 = 0;
                                                            } catch (IOException unused2) {
                                                                bufferedInputStream2 = null;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                bufferedInputStream = null;
                                                            }
                                                            loop2: while (true) {
                                                                try {
                                                                    i15 = bufferedInputStream2.read();
                                                                } catch (IOException unused3) {
                                                                    if (bufferedInputStream2 != null) {
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    bufferedInputStream = bufferedInputStream2;
                                                                    if (bufferedInputStream == null) {
                                                                        throw th;
                                                                    }
                                                                    try {
                                                                        bufferedInputStream.close();
                                                                        throw th;
                                                                    } catch (Exception unused4) {
                                                                        throw th;
                                                                    }
                                                                }
                                                                if (i15 != -1) {
                                                                    j3 = ((j3 << 5) ^ ((long) i15)) & LockFreeTaskQueueCore.HEAD_MASK;
                                                                    int i260 = 0;
                                                                    while (i260 < 1) {
                                                                        if (j3 == jArr[i260]) {
                                                                            break loop2;
                                                                        }
                                                                        i260 = ((i260 | 1) << 1) - (i260 ^ 1);
                                                                    }
                                                                } else {
                                                                    try {
                                                                        bufferedInputStream2.close();
                                                                        break;
                                                                    } catch (Exception unused5) {
                                                                    }
                                                                }
                                                            }
                                                            if (Build.VERSION.SDK_INT < 24) {
                                                                i11 = 0;
                                                                if (i11 != 0) {
                                                                    C12989cxQ.KWHzl();
                                                                    objArr = new Object[]{new int[]{(~(i4 & i11)) & (i11 | i4)}, new int[]{i4}, new int[]{i ^ (i << 5)}, null};
                                                                    int i261 = (-288999828) + ((~(287350521 | i155)) * (-560)) + ((~((-1255497731) | i4)) * (-560)) + (((~(i155 | 1526068883)) | 16779368) * 560);
                                                                    int i262 = (i261 ^ 16) + ((16 & i261) << 1) + i3;
                                                                    int i263 = i262 << 13;
                                                                    int i264 = (i262 | i263) & (~(i262 & i263));
                                                                    int i265 = i264 ^ (i264 >>> 17);
                                                                } else {
                                                                    long[] jArr2 = {472001035};
                                                                    Object[] objArr116 = new Object[1];
                                                                    c(new char[]{41905, 25767, 14196, 17917, 64905, 13361, 40569, 60468, 58810, 12503, 59738, 987, 37276, 48780, 47870, 34777, 33684, 44512, 59738, 987, 11103, 51998}, 22, objArr116);
                                                                    Object[] objArr117 = {(String) objArr116[0], 5, Long.valueOf(LockFreeTaskQueueCore.HEAD_MASK), jArr2};
                                                                    Object objEZpvd26 = YY.EZpvd(-976659337);
                                                                    if (objEZpvd26 == null) {
                                                                        byte b51 = (byte) 0;
                                                                        byte b52 = (byte) (b51 + 1);
                                                                        Object[] objArr118 = new Object[1];
                                                                        b(b51, b52, b52, objArr118);
                                                                        objEZpvd26 = YY.EZpvd(192, 4, (char) 32350, -1041657589, false, (String) objArr118[0], new Class[]{String.class, Integer.TYPE, Long.TYPE, long[].class});
                                                                    }
                                                                    long jLongValue16 = ((Long) ((Method) objEZpvd26).invoke(null, objArr117)).longValue();
                                                                    long j102 = 21654942;
                                                                    long j103 = 764;
                                                                    long j104 = (j12 | j102) ^ j6;
                                                                    long j105 = ((j102 ^ j6) | jLongValue16) ^ j6;
                                                                    long j106 = (((long) 765) * j102) + (((long) (-1527)) * jLongValue16) + ((jLongValue16 | j104) * j103) + (((long) (-1528)) * (j105 | ((j12 | jLongValue16) ^ j6))) + (j103 * (j105 | (((jLongValue16 ^ j6) | j102) ^ j6) | j104)) + ((long) (-665950845));
                                                                    int i266 = ((int) (j106 >> 32)) & ((-1225414100) + (((~(115106475 | i155)) | (~((-39338666) | i4))) * (-831)) + ((~(1591671551 | i4)) * (-1662)) + (((~((-1552332887) | i155)) | (~(1552332886 | i4)) | (~((-115106476) | i4))) * 831));
                                                                    int iNextInt4 = new Random().nextInt(865163064);
                                                                    int i267 = ~(1524375477 | iNextInt4);
                                                                    int i268 = ~iNextInt4;
                                                                    int i269 = ((int) j106) & (2033465549 + ((i267 | (~(87149067 | i268))) * (-1808)) + (((~((-86097931) | iNextInt4)) | (~(i268 | (-1523324341)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iNextInt4 | (-87149068))) | (-1610473408) | (~((-1524375478) | i268))) * TypedValues.Custom.TYPE_BOOLEAN));
                                                                    if (((i266 & i269) | (i266 ^ i269)) != 0) {
                                                                        int i270 = (~(i4 & 242)) & (i4 | 242);
                                                                        int i271 = AYXKKw;
                                                                        int i272 = ((i271 | WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) << 1) - (i271 ^ WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY);
                                                                        fetchVPNInfo = i272 % 128;
                                                                        int i273 = i272 % 2;
                                                                        Object[] objArr119 = {new int[]{i270}, new int[]{i4}, new int[1], null};
                                                                        int iMyTid = Process.myTid();
                                                                        int i274 = ~iMyTid;
                                                                        int i275 = (i3 - (~(-(-(((((-651484512) + ((iMyTid | 293995010) * 988)) + (((~(499524515 | i274)) | 1108365384) * (-1976))) + ((((~(iMyTid | (-1313894890))) | 293995010) | (~(1313894889 | i274))) * 988)) + 16))))) - 1;
                                                                        int i276 = i275 << 13;
                                                                        int i277 = ((~i275) & i276) | ((~i276) & i275);
                                                                        int i278 = i277 ^ (i277 >>> 17);
                                                                        ((int[]) objArr119[2])[0] = i278 ^ (i278 << 5);
                                                                        return objArr119;
                                                                    }
                                                                    Object objEZpvd27 = YY.EZpvd(1600115010);
                                                                    if (objEZpvd27 == null) {
                                                                        byte b53 = (byte) 0;
                                                                        byte b54 = (byte) (b53 + 1);
                                                                        Object[] objArr120 = new Object[1];
                                                                        b(b53, b54, b54, objArr120);
                                                                        objEZpvd27 = YY.EZpvd(TypedValues.PositionType.TYPE_PERCENT_X, 5, (char) 0, 1535056958, false, (String) objArr120[0], new Class[0]);
                                                                    }
                                                                    long jLongValue17 = ((Long) ((Method) objEZpvd27).invoke(null, null)).longValue();
                                                                    long j107 = 595101991;
                                                                    long j108 = j107 ^ j6;
                                                                    long j109 = (((long) (-563)) * j107) + (((long) 565) * jLongValue17) + (((long) (-564)) * (j108 | (((jLongValue17 ^ j6) | j12) ^ j6) | ((jLongValue17 | j) ^ j6))) + (((long) 1128) * (((j108 | jLongValue17) | j) ^ j6)) + (((long) 564) * (((jLongValue17 | j107) ^ j6) | ((j108 | j12) ^ j6))) + ((long) 995918635);
                                                                    int i279 = ((int) (j109 >> 32)) & (1701759034 + ((~(i155 | (-811619329))) * 52) + (((~(i155 | (-811947589))) | (~(2045793296 | i155)) | 328260) * (-52)) + (((~(811947588 | i155)) | 1234173968) * 52));
                                                                    int i280 = ((int) j109) & ((-1473110595) + (((~((-72420106) | i4)) | (~(i155 | (-1509646516)))) * (-1808)) + (((~((-67111689) | i4)) | (~(i155 | (-1504338099)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(1509646515 | i4)) | 5308417 | (~(i155 | 72420105))) * TypedValues.Custom.TYPE_BOOLEAN));
                                                                    if (((i279 & i280) | (i279 ^ i280)) != 0) {
                                                                        Object[] objArr121 = {new int[]{i4 ^ 264}, new int[]{i4}, new int[1], null};
                                                                        int iMyTid2 = Process.myTid();
                                                                        int i281 = (~((-1443492418) | iMyTid2)) | 369664577;
                                                                        int i282 = ~iMyTid2;
                                                                        int i283 = 1160016826 + ((i281 | (~(1443754827 | i282))) * 886) + (((~(i282 | 1443492417)) | 369926987) * (-1772)) + ((~(i282 | 369926987)) * 886);
                                                                        int i284 = -(-((i283 & 16) + (i283 | 16)));
                                                                        int i285 = (i3 ^ i284) + ((i284 & i3) << 1);
                                                                        int i286 = i285 << 13;
                                                                        int i287 = (i286 & (~i285)) | ((~i286) & i285);
                                                                        int i288 = i287 ^ (i287 >>> 17);
                                                                        ((int[]) objArr121[2])[0] = i288 ^ (i288 << 5);
                                                                        objArr2 = objArr121;
                                                                        c3 = 1;
                                                                        c2 = 0;
                                                                    } else {
                                                                        Object objEZpvd28 = YY.EZpvd(-83222370);
                                                                        if (objEZpvd28 == null) {
                                                                            byte b55 = (byte) 0;
                                                                            byte b56 = (byte) (b55 + 1);
                                                                            Object[] objArr122 = new Object[1];
                                                                            b(b55, b56, b56, objArr122);
                                                                            objEZpvd28 = YY.EZpvd(348, 5, (char) 58632, -13963806, false, (String) objArr122[0], new Class[0]);
                                                                        }
                                                                        long jLongValue18 = ((Long) ((Method) objEZpvd28).invoke(null, null)).longValue();
                                                                        long j110 = -391326046;
                                                                        long j111 = 503;
                                                                        long j112 = (j111 * j110) + (j111 * jLongValue18);
                                                                        long j113 = -502;
                                                                        long j114 = j110 | jLongValue18;
                                                                        long j115 = j110 ^ j6;
                                                                        long j116 = (j115 | (jLongValue18 ^ j6)) ^ j6;
                                                                        long startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                                                                        long j117 = j115 | (startUptimeMillis3 ^ j6);
                                                                        long j118 = (j114 | startUptimeMillis3) ^ j6;
                                                                        long j119 = j112 + (j113 * j114) + (j113 * (j116 | (j117 ^ j6) | j118)) + (((long) 502) * (((jLongValue18 | j117) ^ j6) | j118)) + ((long) (-1202966617));
                                                                        int i289 = ((int) (j119 >> 32)) & ((((-36128878) + ((2142699007 | i4) * (-381))) + (((~(i155 | 2091971033)) | 1538682359) * 381)) - 324535808);
                                                                        int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                                                                        int i290 = ((int) j119) & (((1887499872 + (((~((-1083572515) | iUptimeMillis3)) | (~(1774168371 | iUptimeMillis3))) * 69)) + (((~(iUptimeMillis3 | 1622638883)) | ((~((-1235102003) | iUptimeMillis3)) | 151529488)) * (-69))) - 1459126203);
                                                                        int i291 = ((int) ((long) ((i289 & i290) | (i289 ^ i290)))) != 0 ? i4 ^ 281 : i4;
                                                                        if (i291 != i4) {
                                                                            objArr2 = new Object[]{new int[]{i291}, new int[]{i4}, new int[1], null};
                                                                            int i292 = (~((-987176798) | i155)) | 806819341;
                                                                            int i293 = (((i292 | r2) * (-252)) - 1026536872) + (((~(1006600063 | i4)) | (~(i155 | (-180357457)))) * 252);
                                                                            int iKWHzl8 = C12989cxQ.KWHzl();
                                                                            int i294 = i293 * (-167);
                                                                            int i295 = ((-2672) ^ i294) + ((i294 & (-2672)) << 1);
                                                                            int i296 = ~i293;
                                                                            int i297 = ((-17) ^ i296) | ((-17) & i296);
                                                                            int i298 = ~i297;
                                                                            int i299 = ~iKWHzl8;
                                                                            int i300 = ~((i296 & i299) | (i296 ^ i299));
                                                                            int i301 = i295 + (((i300 & i298) | (i298 ^ i300)) * CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
                                                                            int i302 = (~(i297 | iKWHzl8)) * CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256;
                                                                            int i303 = (i301 ^ i302) + ((i302 & i301) << 1);
                                                                            int i304 = (~(((-17) ^ i293) | ((-17) & i293))) | (~(((-17) ^ i299) | ((-17) & i299)));
                                                                            int i305 = ~i293;
                                                                            int i306 = (i305 & 16) | (i305 ^ 16);
                                                                            int i307 = -(-(((~((i306 & iKWHzl8) | (i306 ^ iKWHzl8))) | i304) * CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256));
                                                                            int i308 = i3 + (((i303 | i307) << 1) - (i307 ^ i303));
                                                                            int i309 = i308 << 13;
                                                                            int i310 = ((~i308) & i309) | ((~i309) & i308);
                                                                            int i311 = i310 >>> 17;
                                                                            int i312 = ((~i310) & i311) | ((~i311) & i310);
                                                                            int i313 = i312 << 5;
                                                                            int i314 = ((~i312) & i313) | ((~i313) & i312);
                                                                            c4 = 0;
                                                                            ((int[]) objArr2[2])[0] = i314;
                                                                        } else {
                                                                            if ((i2 & 16384) == 0) {
                                                                                Object objEZpvd29 = YY.EZpvd(-1381607426);
                                                                                if (objEZpvd29 == null) {
                                                                                    byte b57 = (byte) 1;
                                                                                    byte b58 = (byte) (b57 - 1);
                                                                                    Object[] objArr123 = new Object[1];
                                                                                    b(b57, b58, b58, objArr123);
                                                                                    objEZpvd29 = YY.EZpvd(363, 5, (char) 0, -1450796414, false, (String) objArr123[0], new Class[0]);
                                                                                }
                                                                                long jLongValue19 = ((Long) ((Method) objEZpvd29).invoke(null, null)).longValue();
                                                                                long j120 = 1207822258;
                                                                                long j121 = -518;
                                                                                long j122 = (j121 * j120) + (j121 * jLongValue19);
                                                                                long j123 = 519;
                                                                                long jMyTid = Process.myTid();
                                                                                long j124 = (j120 ^ j6) | (jMyTid ^ j6);
                                                                                int i315 = (int) (((((j122 + ((jLongValue19 | (j124 ^ j6)) * j123)) + (((long) (-519)) * (((j124 | jLongValue19) ^ j6) | (((j120 | jLongValue19) | jMyTid) ^ j6)))) + (j123 * (((jMyTid | jLongValue19) ^ j6) | j120))) + ((long) 807348890)) >> 32);
                                                                                int i316 = 1265585326 + (((~(1569464560 | i155)) | 4294916) * (-245));
                                                                                int i317 = ~(1569464560 | i4);
                                                                                if (((i315 & (i316 + (i317 * (-245)) + ((i317 | (-1288276325)) * 245))) | (((int) r13) & ((-427762205) + (((~((-268454935) | i4)) | (~(i155 | (-1705681345)))) * (-318)) + (((~((-1841213890) | i4)) | 135532545) * (-318)) + (((~(1841213889 | i4)) | (-403987480)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)))) != 0) {
                                                                                    Object[] objArr124 = {new int[]{(~(i4 & 268)) & (i4 | 268)}, new int[]{i4}, new int[]{i ^ (i << 5)}, null};
                                                                                    int i318 = (i3 - (~(-(-((((287431456 + (((~((-877992629) | i155)) | 935426776) * (-602))) + ((((~((-877992629) | i4)) | 876681872) | (~(i155 | 936737532))) * LuaValue.ERR_CLOSE_FILE_ERROR)) + ((~(i155 | 935426776)) * 301)) + 16))))) - 1;
                                                                                    int i319 = i318 << 13;
                                                                                    int i320 = (i318 | i319) & (~(i318 & i319));
                                                                                    int i321 = i320 ^ (i320 >>> 17);
                                                                                    c2 = 0;
                                                                                    c3 = 1;
                                                                                    objArr2 = objArr124;
                                                                                }
                                                                            }
                                                                            Object objEZpvd30 = YY.EZpvd(40894713);
                                                                            if (objEZpvd30 == null) {
                                                                                byte b59 = (byte) 0;
                                                                                byte b60 = (byte) (b59 + 1);
                                                                                Object[] objArr125 = new Object[1];
                                                                                b(b59, b60, b60, objArr125);
                                                                                objEZpvd30 = YY.EZpvd(363, 5, (char) 0, 105958789, false, (String) objArr125[0], new Class[0]);
                                                                            }
                                                                            long jLongValue20 = ((Long) ((Method) objEZpvd30).invoke(null, null)).longValue();
                                                                            int i322 = fetchVPNInfo;
                                                                            int i323 = (i322 & 3) + (i322 | 3);
                                                                            AYXKKw = i323 % 128;
                                                                            int i324 = i323 % 2;
                                                                            long j125 = -1196298957;
                                                                            long elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                                            long j126 = j125 ^ j6;
                                                                            long j127 = 381;
                                                                            long j128 = (((long) (-380)) * j125) + (((long) 382) * jLongValue20) + (((long) (-381)) * (jLongValue20 | elapsedCpuTime2 | j126)) + ((((j125 | jLongValue20) ^ j6) | ((j126 | (jLongValue20 ^ j6)) ^ j6) | (((elapsedCpuTime2 ^ j6) | jLongValue20) ^ j6)) * j127) + (j127 * ((j126 | jLongValue20) ^ j6)) + ((long) (-251483620));
                                                                            int i325 = ((int) (j128 >> 32)) & ((((~(i155 | (-18891089))) | (~((-1415064707) | i4))) * 988) + 1463032198 + (((~(1423785090 | i4)) | (-1442676179) | (~(i155 | (-1415064707)))) * 988));
                                                                            int i326 = (int) j128;
                                                                            int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
                                                                            int i327 = ~iMaxMemory3;
                                                                            int i328 = (-1630326819) + (((~(1121402299 | i327)) | 623394816) * (-1188));
                                                                            int i329 = (~(iMaxMemory3 | (-1121402300))) | 623394816;
                                                                            int i330 = ~(1736338586 | i327);
                                                                            int i331 = i326 & (i328 + ((i329 | i330) * 594) + (((~((-1121402300) | i327)) | 8458529 | i330) * 594));
                                                                            if (((i325 & i331) | (i325 ^ i331)) != 0) {
                                                                                int i332 = AYXKKw + 59;
                                                                                fetchVPNInfo = i332 % 128;
                                                                                int i333 = i332 % 2;
                                                                                objArr2 = new Object[]{new int[]{(~(i4 & 266)) & (i4 | 266)}, new int[]{i4}, new int[1], null};
                                                                                int i334 = ~((int) Process.getStartElapsedRealtime());
                                                                                int i335 = 299789668 + (((-566583377) | i334) * 494) + (((~(i334 | 1177590959)) | (-1674929267)) * 494) + 16;
                                                                                int iKWHzl9 = C12989cxQ.KWHzl();
                                                                                int i336 = ((i335 * 659) - (~(i3 * (-657)))) - 1;
                                                                                int i337 = ~((~i335) | i3);
                                                                                int i338 = ~((~i3) | i335);
                                                                                int i339 = (i337 & i338) | (i337 ^ i338);
                                                                                int i340 = ~((i335 ^ iKWHzl9) | (i335 & iKWHzl9));
                                                                                int i341 = ((i339 & i340) | (i339 ^ i340)) * (-658);
                                                                                int i342 = ((i336 | i341) << 1) - (i336 ^ i341);
                                                                                int i343 = ~i3;
                                                                                int i344 = (i342 - (~(-(-((~(i343 | i335)) * 658))))) - 1;
                                                                                int i345 = ~((i343 & i335) | (i343 ^ i335));
                                                                                int i346 = ~(iKWHzl9 | i335);
                                                                                int i347 = i344 + (((i346 & i345) | (i345 ^ i346)) * 658);
                                                                                int i348 = (i347 << 13) ^ i347;
                                                                                int i349 = i348 >>> 17;
                                                                                int i350 = (i348 | i349) & (~(i348 & i349));
                                                                                int i351 = i350 << 5;
                                                                                int i352 = ((~i350) & i351) | ((~i351) & i350);
                                                                                c4 = 0;
                                                                                ((int[]) objArr2[2])[0] = i352;
                                                                            } else {
                                                                                i12 = i2;
                                                                                if ((524288 & i12) != 0) {
                                                                                    int i353 = fetchVPNInfo;
                                                                                    int i354 = (i353 & 21) + (i353 | 21);
                                                                                    AYXKKw = i354 % 128;
                                                                                    int i355 = i354 % 2;
                                                                                    objArr2 = new Object[]{new int[]{i4}, new int[]{i4}, new int[1], null};
                                                                                    int i356 = 2097593996 + ((i155 | 319301696) * (-192)) + (((~((-751261479) | i155)) | 742856230) * (-384)) + (((~((-742856231) | i4)) | (~(i155 | (-8405249))) | (~(1070563174 | i4))) * 192);
                                                                                    int iKWHzl10 = C12989cxQ.KWHzl();
                                                                                    int i357 = ((i356 * (-858)) - (~(iKWHzl10 * (-859)))) - 1;
                                                                                    int i358 = ~(~iKWHzl10);
                                                                                    int i359 = ~i356;
                                                                                    int i360 = -(-(i358 * 859));
                                                                                    int i361 = (i357 & i360) + (i357 | i360);
                                                                                    int i362 = ~iKWHzl10;
                                                                                    int i363 = ((~((i362 & i359) | (i359 ^ i362))) | (~i359)) * 859;
                                                                                    int i364 = -(-(((i361 | i363) << 1) - (i363 ^ i361)));
                                                                                    int i365 = ((i3 | i364) << 1) - (i364 ^ i3);
                                                                                    int i366 = (i365 << 13) ^ i365;
                                                                                    int i367 = i366 >>> 17;
                                                                                    int i368 = (i366 | i367) & (~(i366 & i367));
                                                                                    int i369 = i368 << 5;
                                                                                    int i370 = (i368 | i369) & (~(i368 & i369));
                                                                                    c2 = 0;
                                                                                    ((int[]) objArr2[2])[0] = i370;
                                                                                    c3 = 1;
                                                                                    if (((int[]) objArr2[c3])[c2] != ((int[]) objArr2[c2])[c2]) {
                                                                                        int i371 = fetchVPNInfo + 35;
                                                                                        AYXKKw = i371 % 128;
                                                                                        int i372 = i371 % 2;
                                                                                        return objArr2;
                                                                                    }
                                                                                    Object[] objArr126 = {2};
                                                                                    Object objEZpvd31 = YY.EZpvd(140339483);
                                                                                    if (objEZpvd31 == null) {
                                                                                        byte b61 = (byte) 0;
                                                                                        byte b62 = (byte) (b61 + 1);
                                                                                        Object[] objArr127 = new Object[1];
                                                                                        b(b61, b62, b62, objArr127);
                                                                                        objEZpvd31 = YY.EZpvd(393, 5, (char) 5431, 209560679, false, (String) objArr127[0], new Class[]{Integer.TYPE});
                                                                                    }
                                                                                    long jLongValue21 = ((Long) ((Method) objEZpvd31).invoke(null, objArr126)).longValue();
                                                                                    long j129 = 1381336263;
                                                                                    long j130 = (((long) 477) * j129) + (((long) (-475)) * jLongValue21);
                                                                                    long j131 = ((j129 ^ j6) | jLongValue21) ^ j6;
                                                                                    long j132 = jLongValue21 ^ j6;
                                                                                    long j133 = ((j132 | j129) | j) ^ j6;
                                                                                    long j134 = j130 + (((long) (-476)) * (j131 | j133)) + (((long) 952) * j133) + (((long) 476) * (((j132 | j12) | j129) ^ j6)) + ((long) 508595360);
                                                                                    int i373 = ~((int) Process.getElapsedCpuTime());
                                                                                    int i374 = ((int) (j134 >> 32)) & ((-1444508647) + ((~((-8913057) | i373)) * (-783)) + (((~(i373 | (-720290038))) | 2137450847) * 783));
                                                                                    int i375 = (~((-1573012103) | i155)) | 289406976 | (~(i155 | 1284728783));
                                                                                    int i376 = ((int) j134) & (1146207255 + (((~((-1123658) | i4)) | i375) * 590) + (i375 * (-1180)) + (((~((-1284728784) | i155)) | (~(i155 | 1573012102))) * 590));
                                                                                    if (((i374 & i376) | (i374 ^ i376)) == 2) {
                                                                                        Object[] objArr128 = {new int[]{i4 ^ SubsamplingScaleImageView.ORIENTATION_270}, new int[]{i4}, new int[]{i ^ (i << 5)}, null};
                                                                                        int i377 = 2097593996 + ((i155 | 197394944) * (-192)) + (((~((-1614385607) | i155)) | 1638854) * (-384)) + (((~((-1638855) | i4)) | (~(i155 | (-1612746753))) | (~(1811780550 | i4))) * 192);
                                                                                        int i378 = i377 * (-494);
                                                                                        int i379 = ((-7904) & i378) + (i378 | (-7904));
                                                                                        int i380 = -(-((~(i377 | 16)) * (-495)));
                                                                                        int i381 = (i379 & i380) + (i380 | i379);
                                                                                        int i382 = -(-(((i155 ^ 16) | (i155 & 16)) * 495));
                                                                                        int i383 = (i381 & i382) + (i382 | i381);
                                                                                        int i384 = ~((~i377) | (-17));
                                                                                        int i385 = ~i4;
                                                                                        int i386 = ~((i385 & 16) | (i385 ^ 16));
                                                                                        int i387 = -(-(((i384 & i386) | (i384 ^ i386)) * 495));
                                                                                        int i388 = ((i383 | i387) << 1) - (i387 ^ i383);
                                                                                        int i389 = i388 * 273;
                                                                                        int i390 = i3 * (-271);
                                                                                        int i391 = ((i389 | i390) << 1) - (i389 ^ i390);
                                                                                        int i392 = ~i388;
                                                                                        int i393 = ~i3;
                                                                                        int i394 = (i392 & i393) | (i392 ^ i393);
                                                                                        int i395 = ~((i394 & i155) | (i394 ^ i155));
                                                                                        int i396 = (i388 ^ i3) | (i388 & i3);
                                                                                        int i397 = ~((i396 & i4) | (i396 ^ i4));
                                                                                        int i398 = ((i395 & i397) | (i395 ^ i397)) * (-272);
                                                                                        int i399 = (i391 & i398) + (i398 | i391);
                                                                                        int i400 = ~i388;
                                                                                        int i401 = ~((i400 ^ i3) | (i400 & i3));
                                                                                        int i402 = ~((i400 & i4) | (i400 ^ i4));
                                                                                        int i403 = (i399 - (~(-(-(((i402 & i401) | (i401 ^ i402)) * (-272)))))) - 1;
                                                                                        int i404 = ~((i388 ^ i4) | (i388 & i4));
                                                                                        int i405 = -(-(((i404 & i3) | (i3 ^ i404)) * 272));
                                                                                        int i406 = (i403 ^ i405) + ((i405 & i403) << 1);
                                                                                        int i407 = i406 << 13;
                                                                                        int i408 = (i407 | i406) & (~(i406 & i407));
                                                                                        int i409 = i408 >>> 17;
                                                                                        int i410 = ((~i408) & i409) | ((~i409) & i408);
                                                                                        return objArr128;
                                                                                    }
                                                                                    if ((i12 & 4096) != 0) {
                                                                                        Object objEZpvd32 = YY.EZpvd(-1453681456);
                                                                                        if (objEZpvd32 == null) {
                                                                                            byte b63 = (byte) 0;
                                                                                            byte b64 = (byte) (b63 + 1);
                                                                                            Object[] objArr129 = new Object[1];
                                                                                            b(b63, b64, b64, objArr129);
                                                                                            objEZpvd32 = YY.EZpvd(454, 5, (char) 39479, -1384490580, false, (String) objArr129[0], new Class[0]);
                                                                                        }
                                                                                        long jLongValue22 = ((Long) ((Method) objEZpvd32).invoke(null, null)).longValue();
                                                                                        long j135 = 651130725;
                                                                                        long startUptimeMillis4 = (int) Process.getStartUptimeMillis();
                                                                                        long j136 = (((long) 51) * j135) + (((long) (-49)) * jLongValue22) + (((long) (-50)) * (j135 | startUptimeMillis4));
                                                                                        long j137 = 50;
                                                                                        long j138 = jLongValue22 ^ j6;
                                                                                        long j139 = (((j135 ^ j6) | j138) | startUptimeMillis4) ^ j6;
                                                                                        long j140 = startUptimeMillis4 ^ j6;
                                                                                        long j141 = j138 | j140;
                                                                                        int i411 = (int) ((((j136 + ((j139 | ((j141 | j135) ^ j6)) * j137)) + (j137 * (((j140 | j135) ^ j6) | ((j141 ^ j6) | ((j138 | j135) ^ j6))))) + ((long) 1361626956)) >> 32);
                                                                                        int i412 = ~Process.myUid();
                                                                                        if (((i411 & (705052210 + (((~(1031418846 | i412)) | 405807564) * 220) + (((~(i412 | 427438558)) | 1009787852) * (-440)) + ((r2 | 1031418846) * 220))) | (((int) r11) & ((((~(i155 | (-67109394))) * 130) - 1617855181) + (((~((-67109394) | i4)) | 1090617408) * 130)))) != 0) {
                                                                                            Object[] objArr130 = {new int[]{i4 ^ 265}, new int[]{i4}, new int[]{(i | i) & (~(i & i))}, null};
                                                                                            int i413 = (-903322932) + ((i4 | 492995222) * (-50)) + (((~((-203424407) | i4)) | (~(i155 | (-1116999777)))) * 50) + (((~(i155 | 492995222)) | (~((-1320424183) | i155)) | 1116999776) * 50);
                                                                                            int i414 = (i413 ^ 16) + ((16 & i413) << 1);
                                                                                            int i415 = (i414 * 302) + (i3 * TypedValues.MotionType.TYPE_EASING);
                                                                                            int i416 = ~i414;
                                                                                            int i417 = ~(i416 | i155);
                                                                                            int i418 = -(-(((i417 & i3) | (i3 ^ i417)) * (-602)));
                                                                                            int i419 = ((i415 | i418) << 1) - (i415 ^ i418);
                                                                                            int i420 = ~i3;
                                                                                            int i421 = ~((i420 & i416) | (i416 ^ i420));
                                                                                            int i422 = ~(i416 | i4);
                                                                                            int i423 = (i155 & i414) | (i155 ^ i414);
                                                                                            int i424 = ((~((i423 & i3) | (i423 ^ i3))) | (i421 & i422) | (i421 ^ i422)) * LuaValue.ERR_CLOSE_FILE_ERROR;
                                                                                            int i425 = ((i419 | i424) << 1) - (i424 ^ i419);
                                                                                            int i426 = (~(i155 | i3)) * 301;
                                                                                            int i427 = ((i425 | i426) << 1) - (i426 ^ i425);
                                                                                            int i428 = (i427 << 13) ^ i427;
                                                                                            int i429 = i428 >>> 17;
                                                                                            int i430 = (i428 | i429) & (~(i428 & i429));
                                                                                            int i431 = i430 << 5;
                                                                                            return objArr130;
                                                                                        }
                                                                                    }
                                                                                    Object objEZpvd33 = YY.EZpvd(-1389037328);
                                                                                    if (objEZpvd33 == null) {
                                                                                        byte b65 = (byte) 0;
                                                                                        byte b66 = (byte) (b65 + 1);
                                                                                        Object[] objArr131 = new Object[1];
                                                                                        b(b65, b66, b66, objArr131);
                                                                                        objEZpvd33 = YY.EZpvd(625, 5, (char) 0, -1458293364, false, (String) objArr131[0], new Class[0]);
                                                                                    }
                                                                                    long jLongValue23 = ((Long) ((Method) objEZpvd33).invoke(null, null)).longValue();
                                                                                    long j142 = 250199823;
                                                                                    long jNextInt2 = new Random().nextInt();
                                                                                    long j143 = (((long) 51) * j142) + (((long) (-49)) * jLongValue23) + (((long) (-50)) * (j142 | jNextInt2));
                                                                                    long j144 = 50;
                                                                                    long j145 = jLongValue23 ^ j6;
                                                                                    long j146 = (((j142 ^ j6) | j145) | jNextInt2) ^ j6;
                                                                                    long j147 = jNextInt2 ^ j6;
                                                                                    long j148 = j145 | j147;
                                                                                    long j149 = j143 + ((j146 | ((j148 | j142) ^ j6)) * j144) + (j144 * ((j148 ^ j6) | ((j145 | j142) ^ j6) | ((j142 | j147) ^ j6))) + ((long) (-1169820798));
                                                                                    int i432 = ((int) (j149 >> 32)) & (635053320 + (((-4231171) | i4) * (-627)) + (((~(46832739 | i4)) | 1484059150) * (-627)) + (((~(i155 | (-46832740))) | (~(1484059150 | i4))) * 627));
                                                                                    int i433 = ((int) j149) & ((-278908539) + (((~((-1073742601) | i155)) | (~(1783998285 | i4))) * (-272)) + (((~((-1241515853) | i4)) | 167773252) * (-272)) + (((~(1241515852 | i4)) | 1616225033) * 272));
                                                                                    if (((i432 & i433) | (i432 ^ i433)) != 0) {
                                                                                        Object[] objArr132 = {new int[]{(~(i4 & 272)) & (i4 | 272)}, new int[]{i4}, new int[1], null};
                                                                                        int i434 = ~Process.myUid();
                                                                                        int i435 = 1746583908 + (((-717750353) | i434) * 494) + (((~(i434 | 1093095343)) | (-1808271987)) * 494);
                                                                                        int i436 = (((i435 | 16) << 1) - (16 ^ i435)) + i3;
                                                                                        int i437 = i436 << 13;
                                                                                        int i438 = ((~i436) & i437) | ((~i437) & i436);
                                                                                        int i439 = i438 >>> 17;
                                                                                        int i440 = ((~i438) & i439) | ((~i439) & i438);
                                                                                        int i441 = i440 << 5;
                                                                                        ((int[]) objArr132[2])[0] = (i440 | i441) & (~(i440 & i441));
                                                                                        return objArr132;
                                                                                    }
                                                                                    if ((i2 & 65536) != 0) {
                                                                                        Object objEZpvd34 = YY.EZpvd(-319355609);
                                                                                        if (objEZpvd34 == null) {
                                                                                            byte b67 = (byte) 1;
                                                                                            byte b68 = (byte) (b67 - 1);
                                                                                            Object[] objArr133 = new Object[1];
                                                                                            b(b67, b68, b68, objArr133);
                                                                                            objEZpvd34 = YY.EZpvd(625, 5, (char) 0, -388511653, false, (String) objArr133[0], new Class[0]);
                                                                                        }
                                                                                        long jLongValue24 = ((Long) ((Method) objEZpvd34).invoke(null, null)).longValue();
                                                                                        long j150 = -197266885;
                                                                                        long j151 = (((long) (-183)) * j150) + (((long) CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384) * jLongValue24);
                                                                                        long j152 = CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256;
                                                                                        long j153 = j150 ^ j6;
                                                                                        long j154 = j151 + ((((j153 | jLongValue24) ^ j6) | ((j12 | jLongValue24) ^ j6)) * j152) + (((long) (-184)) * (j | (((jLongValue24 ^ j6) | j150) ^ j6))) + (j152 * ((j153 | j12) ^ j6)) + ((long) 561274413);
                                                                                        int i442 = ((int) (j154 >> 32)) & ((-704144246) + (((~(i155 | 1267224186)) | (-1269452667)) * (-160)) + ((1267224186 | (~((-170002225) | i155))) * CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256));
                                                                                        int i443 = (int) j154;
                                                                                        int iMyPid5 = Process.myPid();
                                                                                        int i444 = 281357391 + ((930660205 | iMyPid5) * (-50));
                                                                                        int i445 = ~((-844671593) | iMyPid5);
                                                                                        int i446 = ~iMyPid5;
                                                                                        int i447 = i443 & (i444 + ((i445 | (~((-1082409089) | i446))) * 50) + (((~(i446 | 930660205)) | (~((-1927080681) | i446)) | 1082409088) * 50));
                                                                                        if (((i442 & i447) | (i442 ^ i447)) != 0) {
                                                                                            Object[] objArr134 = {new int[]{(i4 & (-275)) | (i155 & 274)}, new int[]{i4}, new int[]{(i | i) & (~(i & i))}, null};
                                                                                            int i448 = ~((-176777907) | i4);
                                                                                            int i449 = (-704020564) + ((167788576 | i448) * (-280)) + ((i448 | (~((-1636641499) | i4))) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA) + (((~((-8989331) | i4)) | (~((-167788577) | i155)) | (~((-1627652169) | i155))) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
                                                                                            int i450 = -(-((i449 & 16) + (16 | i449)));
                                                                                            int i451 = (i3 ^ i450) + ((i450 & i3) << 1);
                                                                                            int i452 = i451 << 13;
                                                                                            int i453 = (i452 | i451) & (~(i451 & i452));
                                                                                            int i454 = i453 >>> 17;
                                                                                            int i455 = ((~i453) & i454) | ((~i454) & i453);
                                                                                            int i456 = i455 << 5;
                                                                                            return objArr134;
                                                                                        }
                                                                                    }
                                                                                    long[] jArr3 = {624887784092251L};
                                                                                    Object[] objArr135 = new Object[1];
                                                                                    c(new char[]{61909, 37524, 25730, 7553, 43434, 19003, 58810, 12503, 9363, 48314, 63548, 953, 1813, 43051, 58391, 38869, 52963, 60711}, 17, objArr135);
                                                                                    Object[] objArr136 = {(String) objArr135[0], 3, 2251799813685247L, jArr3};
                                                                                    Object objEZpvd35 = YY.EZpvd(-976659337);
                                                                                    if (objEZpvd35 == null) {
                                                                                        byte b69 = (byte) 0;
                                                                                        byte b70 = (byte) (b69 + 1);
                                                                                        Object[] objArr137 = new Object[1];
                                                                                        b(b69, b70, b70, objArr137);
                                                                                        objEZpvd35 = YY.EZpvd(192, 4, (char) 32350, -1041657589, false, (String) objArr137[0], new Class[]{String.class, Integer.TYPE, Long.TYPE, long[].class});
                                                                                    }
                                                                                    long jLongValue25 = ((Long) ((Method) objEZpvd35).invoke(null, objArr136)).longValue();
                                                                                    long j155 = -475112902;
                                                                                    long j156 = j155 ^ j6;
                                                                                    long j157 = jLongValue25 ^ j6;
                                                                                    long jMyPid = j156 | (((long) Process.myPid()) ^ j6);
                                                                                    long j158 = (((long) 483) * j155) + (((long) 242) * jLongValue25) + (((long) (-241)) * (((j156 | j157) ^ j6) | (jMyPid ^ j6))) + (((long) (-482)) * (j155 | jLongValue25)) + (((long) 241) * (((jLongValue25 | jMyPid) ^ j6) | ((j157 | j155) ^ j6))) + ((long) (-169183001));
                                                                                    int i457 = ((int) (j158 >> 32)) & ((-1529852622) + (((-1090846721) | i4) * (-676)) + (((~(i155 | 173194206)) | 1090846720) * 676) + (((~((-1264032205) | i155)) | 173185484 | (~(1264040926 | i4))) * 676));
                                                                                    int i458 = ((int) j158) & ((((~((-1520338268) | i4)) | 268992769) * (-283)) + 1673283184 + ((~((-1251345499) | i4)) * 283));
                                                                                    if (((i457 & i458) | (i457 ^ i458)) != 0) {
                                                                                        Object[] objArr138 = {new int[]{(i4 & (-276)) | (i155 & 275)}, new int[]{i4}, new int[1], null};
                                                                                        int i459 = (-85121428) + (((~((-8398993) | i4)) | (~((-1108493385) | i155))) * 920) + (((~((-696527029) | i155)) | 8398992) * 920) + (((~((-8398993) | i155)) | (~((-688128037) | i4)) | (~((-1108493385) | i4))) * 920);
                                                                                        int iKWHzl11 = C12989cxQ.KWHzl();
                                                                                        int i460 = 4048 + (i459 * 253);
                                                                                        int i461 = ~i459;
                                                                                        int i462 = ~((-17) | i461);
                                                                                        int i463 = ~iKWHzl11;
                                                                                        int i464 = ~((i461 ^ i463) | (i461 & i463));
                                                                                        int i465 = (i462 & i464) | (i462 ^ i464);
                                                                                        int i466 = i459 | 16;
                                                                                        int i467 = ~((i466 & iKWHzl11) | (i466 ^ iKWHzl11));
                                                                                        int i468 = ((i465 & i467) | (i465 ^ i467)) * (-252);
                                                                                        int i469 = (i459 & 16) | (i459 ^ 16);
                                                                                        int i470 = (i460 ^ i468) + ((i460 & i468) << 1) + (i469 * (-252));
                                                                                        int i471 = (i461 & i463) | (i461 ^ i463);
                                                                                        int i472 = ((~(iKWHzl11 | i469)) | (~((i471 & 16) | (i471 ^ 16)))) * 252;
                                                                                        int i473 = ((i470 | i472) << 1) - (i472 ^ i470);
                                                                                        int i474 = (((i473 * 217) - (~(-(-(i3 * (-215)))))) - 1) + ((~((i473 ^ i4) | (i473 & i4))) * 216);
                                                                                        int i475 = ~i3;
                                                                                        int i476 = ((i475 & i473) | (i473 ^ i475) | i155) * (-216);
                                                                                        int i477 = ((i474 | i476) << 1) - (i474 ^ i476);
                                                                                        int i478 = ~i4;
                                                                                        int i479 = ~((i478 & i473) | (i478 ^ i473));
                                                                                        int i480 = -(-(((i479 & i3) | (i3 ^ i479)) * 216));
                                                                                        int i481 = (i477 ^ i480) + ((i480 & i477) << 1);
                                                                                        int i482 = (i481 << 13) ^ i481;
                                                                                        int i483 = i482 >>> 17;
                                                                                        int i484 = (i482 | i483) & (~(i482 & i483));
                                                                                        int i485 = i484 << 5;
                                                                                        ((int[]) objArr138[2])[0] = ((~i484) & i485) | ((~i485) & i484);
                                                                                        return objArr138;
                                                                                    }
                                                                                    Object[] objArr139 = new Object[1];
                                                                                    a(-1007623662, (byte) 0, (short) 0, 1595248957, -35, objArr139);
                                                                                    Object[] objArr140 = {(String) objArr139[0]};
                                                                                    Object objEZpvd36 = YY.EZpvd(1229107605);
                                                                                    if (objEZpvd36 == null) {
                                                                                        byte b71 = (byte) 0;
                                                                                        byte b72 = (byte) (b71 + 1);
                                                                                        Object[] objArr141 = new Object[1];
                                                                                        b(b71, b72, b72, objArr141);
                                                                                        objEZpvd36 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1298300137, false, (String) objArr141[0], new Class[]{String.class});
                                                                                    }
                                                                                    long jLongValue26 = ((Long) ((Method) objEZpvd36).invoke(null, objArr140)).longValue();
                                                                                    long j159 = 1471394004;
                                                                                    long j160 = j159 ^ j6;
                                                                                    long jElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                                                                    long j161 = (((long) 236) * j159) + (((long) 471) * jLongValue26) + (((long) (-235)) * (jLongValue26 | ((j160 | (jElapsedRealtime2 ^ j6)) ^ j6))) + (((long) (-470)) * (jLongValue26 | ((j160 | jElapsedRealtime2) ^ j6))) + (((long) 235) * ((((j160 | jLongValue26) | jElapsedRealtime2) ^ j6) | (((jLongValue26 ^ j6) | j159) ^ j6))) + ((long) 556440282);
                                                                                    int i486 = ((int) (j161 >> 32)) & ((-2139639470) + (((~(591046512 | i4)) | (-2080309116) | (~(2028272923 | i4))) * (-754)) + (((~(2080309115 | i4)) | (~(i155 | (-52036193)))) * (-754)) + ((591046512 | i155) * 754));
                                                                                    int iNextInt5 = new Random().nextInt();
                                                                                    int i487 = ~iNextInt5;
                                                                                    int i488 = ((int) j161) & ((-262343491) + (((~((-493669560) | i487)) | 88097797) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256) + ((iNextInt5 | 537985088) * (-184)) + ((~(943556850 | i487)) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256));
                                                                                    if (((i486 & i488) | (i486 ^ i488)) != 0) {
                                                                                        i13 = 1;
                                                                                        z3 = false;
                                                                                    } else {
                                                                                        i13 = 1;
                                                                                        z3 = true;
                                                                                    }
                                                                                    if (!z3) {
                                                                                        Object[] objArr142 = new Object[4];
                                                                                        int[] iArr = new int[i13];
                                                                                        objArr142[0] = iArr;
                                                                                        int[] iArr2 = new int[i13];
                                                                                        objArr142[i13] = iArr2;
                                                                                        int[] iArr3 = new int[i13];
                                                                                        objArr142[2] = iArr3;
                                                                                        iArr2[0] = i4;
                                                                                        iArr[0] = i4 ^ 276;
                                                                                        objArr142[3] = null;
                                                                                        int i489 = 939036632 + ((~(i155 | (-46747747))) * (-783)) + (((~(i155 | 958833817)) | (-854585588)) * 783);
                                                                                        int i490 = (i489 ^ 16) + ((i489 & 16) << 1) + i3;
                                                                                        int i491 = i490 << 13;
                                                                                        int i492 = ((~i490) & i491) | ((~i491) & i490);
                                                                                        int i493 = i492 >>> 17;
                                                                                        int i494 = (i492 | i493) & (~(i492 & i493));
                                                                                        int i495 = i494 << 5;
                                                                                        int i496 = fetchVPNInfo + 99;
                                                                                        AYXKKw = i496 % 128;
                                                                                        int i497 = i496 % 2;
                                                                                        iArr3[0] = (i494 | i495) & (~(i494 & i495));
                                                                                        return objArr142;
                                                                                    }
                                                                                    if (Build.VERSION.SDK_INT >= 21 && (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
                                                                                        Object objEZpvd37 = YY.EZpvd(-579690702);
                                                                                        if (objEZpvd37 == null) {
                                                                                            byte b73 = (byte) 0;
                                                                                            byte b74 = (byte) (b73 + 1);
                                                                                            Object[] objArr143 = new Object[1];
                                                                                            b(b73, b74, b74, objArr143);
                                                                                            objEZpvd37 = YY.EZpvd(630, 5, (char) 0, -648916402, false, (String) objArr143[0], new Class[0]);
                                                                                        }
                                                                                        long jLongValue27 = ((Long) ((Method) objEZpvd37).invoke(null, null)).longValue();
                                                                                        long j162 = -748708895;
                                                                                        long j163 = 530;
                                                                                        long j164 = ((long) 1058) + (j163 * j162) + (j163 * jLongValue27);
                                                                                        long j165 = 529;
                                                                                        long j166 = (int) Runtime.getRuntime().totalMemory();
                                                                                        long j167 = j164 + (((((j166 ^ j6) | j162) ^ j6) | ((j162 | jLongValue27) ^ j6)) * j165) + (j165 * ((jLongValue27 ^ j6) | ((j162 | j166) ^ j6))) + ((long) (-218058689));
                                                                                        int iNextInt6 = new Random().nextInt(526663852);
                                                                                        int i498 = ((int) (j167 >> 32)) & ((((-1771464918) + (((~((-1565216036) | iNextInt6)) | 1481312259) * 576)) + (((~((~iNextInt6) | (-83903777))) | (-1609301884)) * 576)) - 1462630720);
                                                                                        int i499 = ((int) j167) & (648417764 + ((~(i155 | (-11011074))) * 433) + (((~((-1733811147) | i4)) | (-1123929740)) * (-433)) + (((~((-1123929740) | i4)) | (-1744822220)) * 433));
                                                                                        if (((i498 & i499) | (i498 ^ i499)) != 0) {
                                                                                            int i500 = fetchVPNInfo + 31;
                                                                                            AYXKKw = i500 % 128;
                                                                                            if (i500 % 2 != 0) {
                                                                                                Object[] objArr144 = new Object[4];
                                                                                                objArr144[0] = new int[0];
                                                                                                objArr144[0] = new int[0];
                                                                                                objArr144[4] = new int[0];
                                                                                                objArr = objArr144;
                                                                                                c6 = 1;
                                                                                            } else {
                                                                                                objArr = new Object[4];
                                                                                                c6 = 1;
                                                                                                objArr[0] = new int[1];
                                                                                                objArr[1] = new int[1];
                                                                                                objArr[2] = new int[1];
                                                                                            }
                                                                                            ((int[]) objArr[c6])[0] = i4;
                                                                                            ((int[]) objArr[0])[0] = (i4 & (-274)) | (i155 & 273);
                                                                                            objArr[3] = null;
                                                                                            int iNextInt7 = new Random().nextInt();
                                                                                            int i501 = 261228178 + (((~((-1066607318) | iNextInt7)) | 746812087) * (-366)) + (((~(iNextInt7 | (-319815745))) | 20514) * 366);
                                                                                            int i502 = (i501 ^ 16) + ((16 & i501) << 1);
                                                                                            int iKWHzl12 = C12989cxQ.KWHzl();
                                                                                            int i503 = fetchVPNInfo + 115;
                                                                                            int i504 = i503 % 128;
                                                                                            AYXKKw = i504;
                                                                                            int i505 = i503 % 2;
                                                                                            int i506 = ((i502 * 221) - (~(i3 * (-219)))) - 1;
                                                                                            int i507 = ~((~i502) | (~i3));
                                                                                            int i508 = ~iKWHzl12;
                                                                                            int i509 = (i508 & i502) | (i508 ^ i502);
                                                                                            int i510 = ~((i509 & i3) | (i509 ^ i3));
                                                                                            int i511 = ((i507 & i510) | (i507 ^ i510)) * 220;
                                                                                            int i512 = (i506 ^ i511) + ((i506 & i511) << 1);
                                                                                            int i513 = ~((~iKWHzl12) | i3);
                                                                                            int i514 = (i504 & 43) + (i504 | 43);
                                                                                            fetchVPNInfo = i514 % 128;
                                                                                            int i515 = i514 % 2;
                                                                                            int i516 = i512 + ((-440) * ((i513 & i502) | (i502 ^ i513)));
                                                                                            int i517 = (i502 & i3) | (i502 ^ i3);
                                                                                            int i518 = -(-(((i517 & iKWHzl12) | (i517 ^ iKWHzl12)) * 220));
                                                                                            int i519 = (i516 & i518) + (i518 | i516);
                                                                                            int i520 = (i519 << 13) ^ i519;
                                                                                            int i521 = i520 >>> 17;
                                                                                            int i522 = ((~i520) & i521) | ((~i521) & i520);
                                                                                            int i523 = i522 << 5;
                                                                                            ((int[]) objArr[2])[0] = (i522 | i523) & (~(i522 & i523));
                                                                                        }
                                                                                    }
                                                                                    if ((i2 & 2097152) == 0) {
                                                                                        Object objEZpvd38 = YY.EZpvd(-331456536);
                                                                                        if (objEZpvd38 == null) {
                                                                                            byte b75 = (byte) 0;
                                                                                            byte b76 = (byte) (b75 + 1);
                                                                                            Object[] objArr145 = new Object[1];
                                                                                            b(b75, b76, b76, objArr145);
                                                                                            objEZpvd38 = YY.EZpvd(208, 5, (char) 0, -400649580, false, (String) objArr145[0], new Class[0]);
                                                                                        }
                                                                                        long jLongValue28 = ((Long) ((Method) objEZpvd38).invoke(null, null)).longValue();
                                                                                        int i524 = fetchVPNInfo;
                                                                                        int i525 = (i524 & 11) + (i524 | 11);
                                                                                        AYXKKw = i525 % 128;
                                                                                        int i526 = i525 % 2;
                                                                                        long j168 = 666919563;
                                                                                        long j169 = (((long) (-464)) * j168) + (((long) (-929)) * jLongValue28);
                                                                                        long j170 = j168 ^ j6;
                                                                                        long j171 = jLongValue28 | j;
                                                                                        long j172 = j169 + (((long) (-465)) * (j170 | (j171 ^ j6))) + (((long) 930) * (jLongValue28 | ((j170 | j) ^ j6))) + (((long) 465) * (j171 | j170)) + ((long) 442999130);
                                                                                        int startUptimeMillis5 = (int) Process.getStartUptimeMillis();
                                                                                        int i527 = (~((-541683925) | startUptimeMillis5)) | 541090004;
                                                                                        int i528 = ~startUptimeMillis5;
                                                                                        int i529 = ((int) (j172 >> 32)) & (304992570 + ((i527 | (~(896136406 | i528))) * 886) + (((~(i528 | 541683924)) | 895542486) * (-1772)) + ((~(i528 | 895542486)) * 886));
                                                                                        int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                                                                        int i530 = ((int) j172) & (818885255 + (((~elapsedCpuTime3) | 69390422) * 1324) + (((~(elapsedCpuTime3 | 102944991)) | (~((-1540171402) | elapsedCpuTime3))) * (-1324)) + 360250118);
                                                                                        if (((i529 & i530) | (i529 ^ i530)) != 0) {
                                                                                            Object[] objArr146 = {new int[]{i4 ^ 279}, new int[]{i4}, new int[1], null};
                                                                                            int iMyUid3 = Process.myUid();
                                                                                            int i531 = (-1046017056) + (((~((-94648901) | iMyUid3)) | 69212736) * 345) + (((~((-94648901) | (~iMyUid3))) | 1649557768) * 345) + ((~(iMyUid3 | (-69212737))) * 345);
                                                                                            int i532 = ((i531 | 16) << 1) - (16 ^ i531);
                                                                                            int i533 = ((i3 | i532) << 1) - (i532 ^ i3);
                                                                                            int i534 = i533 << 13;
                                                                                            int i535 = (i534 & (~i533)) | ((~i534) & i533);
                                                                                            int i536 = i535 >>> 17;
                                                                                            int i537 = ((~i535) & i536) | ((~i536) & i535);
                                                                                            int i538 = i537 << 5;
                                                                                            ((int[]) objArr146[2])[0] = ((~i537) & i538) | ((~i538) & i537);
                                                                                            return objArr146;
                                                                                        }
                                                                                    }
                                                                                    Object[] objArr147 = {Integer.valueOf(i), obj, Integer.valueOf(i3), Integer.valueOf(i2)};
                                                                                    Object objEZpvd39 = YY.EZpvd(1399480618);
                                                                                    if (objEZpvd39 == null) {
                                                                                        objEZpvd39 = YY.EZpvd(383, 5, (char) 35536, 1464511574, false, null, new Class[]{Integer.TYPE, (Class) YY.AEQbTJ(388, 5, (char) 0), Integer.TYPE, Integer.TYPE});
                                                                                    }
                                                                                    Object objNewInstance = ((Constructor) objEZpvd39).newInstance(objArr147);
                                                                                    try {
                                                                                        if (z) {
                                                                                            int i539 = fetchVPNInfo + 115;
                                                                                            AYXKKw = i539 % 128;
                                                                                            if (i539 % 2 != 0) {
                                                                                                Object[] objArr148 = new Object[1];
                                                                                                a(-1007623652, (byte) 1, (short) 0, 1595249016, 77, objArr148);
                                                                                                str = (String) objArr148[0];
                                                                                            } else {
                                                                                                Object[] objArr149 = new Object[1];
                                                                                                a(-1007623652, (byte) 0, (short) 0, 1595249016, -30, objArr149);
                                                                                                str = (String) objArr149[0];
                                                                                            }
                                                                                            Class<?> cls = Class.forName(str);
                                                                                            Object[] objArr150 = new Object[1];
                                                                                            a(-1007623637, (byte) 0, (short) 0, 1595249024, -43, objArr150);
                                                                                            cls.getMethod((String) objArr150[0], null).invoke(objNewInstance, null);
                                                                                            i14 = 4;
                                                                                            c5 = 0;
                                                                                        } else {
                                                                                            Object[] objArr151 = new Object[1];
                                                                                            a(-1007623652, (byte) 0, (short) 0, 1595249016, -30, objArr151);
                                                                                            Class<?> cls2 = Class.forName((String) objArr151[0]);
                                                                                            Object[] objArr152 = new Object[1];
                                                                                            a(-1007623635, (byte) 0, (short) 0, 1595249025, -41, objArr152);
                                                                                            c5 = 0;
                                                                                            cls2.getMethod((String) objArr152[0], null).invoke(objNewInstance, null);
                                                                                            i14 = 4;
                                                                                        }
                                                                                        Object[] objArr153 = new Object[i14];
                                                                                        int[] iArr4 = new int[1];
                                                                                        objArr153[c5] = iArr4;
                                                                                        int[] iArr5 = new int[1];
                                                                                        objArr153[1] = iArr5;
                                                                                        objArr153[2] = new int[1];
                                                                                        iArr5[c5] = i4;
                                                                                        iArr4[c5] = i4;
                                                                                        objArr153[3] = null;
                                                                                        int iMaxMemory4 = (int) Runtime.getRuntime().maxMemory();
                                                                                        int i540 = ~iMaxMemory4;
                                                                                        int i541 = 1261681860 + (((~((-1096600330) | i540)) | (-716819076) | (~(1096600329 | iMaxMemory4))) * (-564)) + ((~(iMaxMemory4 | (-715194499))) * 1128) + (((~((-716819076) | i540)) | (-1811794828)) * 564);
                                                                                        int iKWHzl13 = C12989cxQ.KWHzl();
                                                                                        int i542 = fetchVPNInfo;
                                                                                        int i543 = ((i542 | 71) << 1) - (i542 ^ 71);
                                                                                        AYXKKw = i543 % 128;
                                                                                        int i544 = i543 % 2 != 0 ? (((-1965) / 0) * (i541 * 984)) >> (983 % (~i541)) : ((i541 * 984) - (~(-(-((~i541) * 983))))) - 1;
                                                                                        int i545 = ~i541;
                                                                                        int i546 = ~iKWHzl13;
                                                                                        int i547 = ~((i546 & i545) | (i545 ^ i546));
                                                                                        int i548 = (-983) * (i547 | ((-1) ^ i547));
                                                                                        int i549 = (((i544 | i548) << 1) - (i544 ^ i548)) + ((~(((-1) ^ i541) | i541)) * 983) + i3;
                                                                                        int i550 = i549 ^ (i549 << 13);
                                                                                        int i551 = i550 >>> 17;
                                                                                        int i552 = ((~i550) & i551) | ((~i551) & i550);
                                                                                        int i553 = i552 << 5;
                                                                                        ((int[]) objArr153[2])[0] = ((~i552) & i553) | ((~i553) & i552);
                                                                                        return objArr153;
                                                                                    } catch (Throwable th5) {
                                                                                        Throwable cause = th5.getCause();
                                                                                        if (cause != null) {
                                                                                            throw cause;
                                                                                        }
                                                                                        throw th5;
                                                                                    }
                                                                                }
                                                                                Object objEZpvd40 = YY.EZpvd(602007173);
                                                                                if (objEZpvd40 == null) {
                                                                                    byte b77 = (byte) 0;
                                                                                    byte b78 = (byte) (b77 + 1);
                                                                                    Object[] objArr154 = new Object[1];
                                                                                    b(b77, b78, b78, objArr154);
                                                                                    objEZpvd40 = YY.EZpvd(235, 5, (char) 49179, 666971129, false, (String) objArr154[0], new Class[0]);
                                                                                }
                                                                                long jLongValue29 = ((Long) ((Method) objEZpvd40).invoke(null, null)).longValue();
                                                                                long j173 = 883600374;
                                                                                long j174 = 988;
                                                                                long j175 = jLongValue29 ^ j6;
                                                                                long jElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                                                                long j176 = jElapsedRealtime3 ^ j6;
                                                                                long j177 = (((long) 989) * j173) + (((long) (-987)) * jLongValue29) + (((((j175 | j176) | j173) ^ j6) | (((j173 | jLongValue29) | jElapsedRealtime3) ^ j6)) * j174) + (((long) (-988)) * (j173 | j175)) + (j174 * (((j175 | jElapsedRealtime3) ^ j6) | (((j173 ^ j6) | j175) ^ j6) | ((jLongValue29 | (j176 | j173)) ^ j6))) + ((long) 153961023);
                                                                                int iMyTid3 = Process.myTid();
                                                                                int i554 = ~iMyTid3;
                                                                                int i555 = ((int) (j177 >> 32)) & ((-826262582) + ((~((-610038726) | i554)) * (-560)) + ((~(iMyTid3 | (-537149761))) * (-560)) + (((~(2047265136 | i554)) | (-2120154102)) * 560));
                                                                                int iMyPid6 = Process.myPid();
                                                                                int i556 = ((int) j177) & ((-1439990121) + (((~((-2099118667) | iMyPid6)) | 621936640) * (-140)) + ((~((-1477182027) | iMyPid6)) * 70) + (((~(iMyPid6 | 661892256)) | (-1517137643)) * 70));
                                                                                if (i != 0) {
                                                                                    if (i == 3) {
                                                                                        int i557 = fetchVPNInfo;
                                                                                        int i558 = ((i557 | 85) << 1) - (i557 ^ 85);
                                                                                        AYXKKw = i558 % 128;
                                                                                        int i559 = i558 % 2;
                                                                                        i12 = i2;
                                                                                        if ((268435456 & i12) == 0) {
                                                                                        }
                                                                                        c3 = 1;
                                                                                        if (((int[]) objArr2[c3])[c2] != ((int[]) objArr2[c2])[c2]) {
                                                                                        }
                                                                                    } else {
                                                                                        i12 = i2;
                                                                                    }
                                                                                    objArr2 = new Object[]{new int[]{i4 ^ 280}, new int[]{i4}, new int[1], null};
                                                                                    int i560 = ~((~((int) Process.getElapsedCpuTime())) | 1681773905);
                                                                                    int i561 = ((1613043008 | i560) * (-970)) + 852580770 + ((i560 | 68730897) * 970);
                                                                                    int i562 = fetchVPNInfo;
                                                                                    int i563 = ((i562 | 103) << 1) - (i562 ^ 103);
                                                                                    AYXKKw = i563 % 128;
                                                                                    int i564 = i563 % 2;
                                                                                    int i565 = i3 + i561 + 16;
                                                                                    int i566 = i565 << 13;
                                                                                    int i567 = ((~i565) & i566) | ((~i566) & i565);
                                                                                    int i568 = i567 ^ (i567 >>> 17);
                                                                                    int i569 = i568 << 5;
                                                                                    int i570 = (i568 | i569) & (~(i568 & i569));
                                                                                    c2 = 0;
                                                                                    ((int[]) objArr2[2])[0] = i570;
                                                                                    c3 = 1;
                                                                                    if (((int[]) objArr2[c3])[c2] != ((int[]) objArr2[c2])[c2]) {
                                                                                    }
                                                                                } else {
                                                                                    i12 = i2;
                                                                                }
                                                                                int i3532 = fetchVPNInfo;
                                                                                int i3542 = (i3532 & 21) + (i3532 | 21);
                                                                                AYXKKw = i3542 % 128;
                                                                                int i3552 = i3542 % 2;
                                                                                objArr2 = new Object[]{new int[]{i4}, new int[]{i4}, new int[1], null};
                                                                                int i3562 = 2097593996 + ((i155 | 319301696) * (-192)) + (((~((-751261479) | i155)) | 742856230) * (-384)) + (((~((-742856231) | i4)) | (~(i155 | (-8405249))) | (~(1070563174 | i4))) * 192);
                                                                                int iKWHzl102 = C12989cxQ.KWHzl();
                                                                                int i3572 = ((i3562 * (-858)) - (~(iKWHzl102 * (-859)))) - 1;
                                                                                int i3582 = ~(~iKWHzl102);
                                                                                int i3592 = ~i3562;
                                                                                int i3602 = -(-(i3582 * 859));
                                                                                int i3612 = (i3572 & i3602) + (i3572 | i3602);
                                                                                int i3622 = ~iKWHzl102;
                                                                                int i3632 = ((~((i3622 & i3592) | (i3592 ^ i3622))) | (~i3592)) * 859;
                                                                                int i3642 = -(-(((i3612 | i3632) << 1) - (i3632 ^ i3612)));
                                                                                int i3652 = ((i3 | i3642) << 1) - (i3642 ^ i3);
                                                                                int i3662 = (i3652 << 13) ^ i3652;
                                                                                int i3672 = i3662 >>> 17;
                                                                                int i3682 = (i3662 | i3672) & (~(i3662 & i3672));
                                                                                int i3692 = i3682 << 5;
                                                                                int i3702 = (i3682 | i3692) & (~(i3682 & i3692));
                                                                                c2 = 0;
                                                                                ((int[]) objArr2[2])[0] = i3702;
                                                                                c3 = 1;
                                                                                if (((int[]) objArr2[c3])[c2] != ((int[]) objArr2[c2])[c2]) {
                                                                                }
                                                                            }
                                                                        }
                                                                        c2 = c4;
                                                                        c3 = 1;
                                                                    }
                                                                    i12 = i2;
                                                                    if (((int[]) objArr2[c3])[c2] != ((int[]) objArr2[c2])[c2]) {
                                                                    }
                                                                }
                                                            } else {
                                                                Object[] objArr155 = new Object[1];
                                                                a(-1007623678, (byte) 0, (short) 0, 1595249001, -40, objArr155);
                                                                Matcher matcher2 = Pattern.compile((String) objArr155[0]).matcher("");
                                                                Object[] objArr156 = new Object[1];
                                                                a(-1007623673, (byte) 0, (short) 0, 1595248957, -40, objArr156);
                                                                File[] fileArrListFiles = new File((String) objArr156[0]).listFiles();
                                                                if (fileArrListFiles != null) {
                                                                    int i571 = 0;
                                                                    int i572 = 0;
                                                                    while (i571 < fileArrListFiles.length && i572 < 3) {
                                                                        File file = fileArrListFiles[i571];
                                                                        if (file != null) {
                                                                            int i573 = fetchVPNInfo;
                                                                            int i574 = (i573 & 73) + (i573 | 73);
                                                                            AYXKKw = i574 % 128;
                                                                            int i575 = i574 % 2;
                                                                            if (file.isDirectory()) {
                                                                                Matcher matcherReset = matcher2.reset(fileArrListFiles[i571].getName());
                                                                                int i576 = AYXKKw + 79;
                                                                                fetchVPNInfo = i576 % 128;
                                                                                int i577 = i576 % 2;
                                                                                if (matcherReset.matches()) {
                                                                                    int i578 = ((i572 | 14) << 1) - (i572 ^ 14);
                                                                                    i572 = (i578 ^ (-13)) + ((i578 & (-13)) << 1);
                                                                                    StringBuilder sb = new StringBuilder();
                                                                                    sb.append(fileArrListFiles[i571].getAbsolutePath());
                                                                                    Object[] objArr157 = new Object[1];
                                                                                    a(-1007623668, (byte) 0, (short) 0, 1595248957, -39, objArr157);
                                                                                    sb.append((String) objArr157[0]);
                                                                                    try {
                                                                                        bufferedInputStream4 = new BufferedInputStream(new FileInputStream(sb.toString()));
                                                                                        long j178 = 0;
                                                                                        while (true) {
                                                                                            try {
                                                                                                try {
                                                                                                    int i579 = bufferedInputStream4.read();
                                                                                                    if (i579 == -1) {
                                                                                                        matcher = matcher2;
                                                                                                        fileArr = fileArrListFiles;
                                                                                                        break;
                                                                                                    }
                                                                                                    matcher = matcher2;
                                                                                                    fileArr = fileArrListFiles;
                                                                                                    j178 = ((j178 << 5) ^ ((long) i579)) & LockFreeTaskQueueCore.HEAD_MASK;
                                                                                                    int i580 = 0;
                                                                                                    while (i580 < 1) {
                                                                                                        try {
                                                                                                            if (j178 == jArr[i580]) {
                                                                                                                int i581 = (i580 & 1) + (i580 | 1);
                                                                                                                try {
                                                                                                                    bufferedInputStream4.close();
                                                                                                                } catch (Exception unused6) {
                                                                                                                }
                                                                                                                if (i581 != 0) {
                                                                                                                    i11 = 241;
                                                                                                                    break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                int i582 = (i580 ^ (-90)) + ((i580 & (-90)) << 1);
                                                                                                                i580 = ((i582 | 91) << 1) - (i582 ^ 91);
                                                                                                            }
                                                                                                        } catch (IOException unused7) {
                                                                                                            if (bufferedInputStream4 != null) {
                                                                                                                try {
                                                                                                                    bufferedInputStream4.close();
                                                                                                                } catch (Exception unused8) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    matcher2 = matcher;
                                                                                                    fileArrListFiles = fileArr;
                                                                                                } catch (Throwable th6) {
                                                                                                    th2 = th6;
                                                                                                    bufferedInputStream3 = bufferedInputStream4;
                                                                                                    if (bufferedInputStream3 == null) {
                                                                                                        throw th2;
                                                                                                    }
                                                                                                    try {
                                                                                                        bufferedInputStream3.close();
                                                                                                        throw th2;
                                                                                                    } catch (Exception unused9) {
                                                                                                        throw th2;
                                                                                                    }
                                                                                                }
                                                                                            } catch (IOException unused10) {
                                                                                                matcher = matcher2;
                                                                                                fileArr = fileArrListFiles;
                                                                                            }
                                                                                        }
                                                                                    } catch (IOException unused11) {
                                                                                        matcher = matcher2;
                                                                                        fileArr = fileArrListFiles;
                                                                                        bufferedInputStream4 = null;
                                                                                    } catch (Throwable th7) {
                                                                                        th2 = th7;
                                                                                        bufferedInputStream3 = null;
                                                                                    }
                                                                                } else {
                                                                                    matcher = matcher2;
                                                                                    fileArr = fileArrListFiles;
                                                                                }
                                                                            }
                                                                        }
                                                                        int i583 = (i571 & 82) + (i571 | 82);
                                                                        i571 = (i583 & (-81)) + (i583 | (-81));
                                                                        matcher2 = matcher;
                                                                        fileArrListFiles = fileArr;
                                                                    }
                                                                    i11 = 0;
                                                                    if (i11 != 0) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        Object[] objArr158 = new Object[1];
                                                        a(-1007623787, (byte) 0, (short) 0, 1595249024, -33, objArr158);
                                                        Object[] objArr159 = {(String) objArr158[0]};
                                                        Object objEZpvd41 = YY.EZpvd(1845277648);
                                                        if (objEZpvd41 == null) {
                                                            byte b79 = (byte) 1;
                                                            byte b80 = (byte) (b79 - 1);
                                                            Object[] objArr160 = new Object[1];
                                                            b(b79, b80, b80, objArr160);
                                                            objEZpvd41 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (String) objArr160[0], new Class[]{String.class});
                                                        }
                                                        String str40 = (String) ((Method) objEZpvd41).invoke(null, objArr159);
                                                        if (str40 != null) {
                                                            int i584 = 1;
                                                            Object[] objArr161 = new Object[1];
                                                            c(new char[]{11103, 51998, 35181, 4693, 1586, 45439, 35254, 45575, 38329, 24279, 49712, 64123}, 11, objArr161);
                                                            String[] strArr4 = {(String) objArr161[0]};
                                                            int i585 = 0;
                                                            while (true) {
                                                                if (i585 >= i584) {
                                                                    String[] strArr5 = new String[12];
                                                                    Object[] objArr162 = new Object[i584];
                                                                    a(-1007623753, (byte) 0, (short) 0, 1595248957, -34, objArr162);
                                                                    strArr5[0] = (String) objArr162[0];
                                                                    Object[] objArr163 = new Object[1];
                                                                    a(-1007623742, (byte) 0, (short) 0, 1595248957, -30, objArr163);
                                                                    strArr5[1] = (String) objArr163[0];
                                                                    Object[] objArr164 = new Object[1];
                                                                    c(new char[]{7044, 10025, 52641, 47196, 52824, 4964, 13163, 16784, 15607, 52877, 58729, 26757, 24296, 18706, 39975, 28578, 33606, 22204}, 17, objArr164);
                                                                    strArr5[2] = (String) objArr164[0];
                                                                    Object[] objArr165 = new Object[1];
                                                                    a(-1007623727, (byte) 0, (short) 0, 1595248957, -40, objArr165);
                                                                    strArr5[3] = (String) objArr165[0];
                                                                    Object[] objArr166 = new Object[1];
                                                                    c(new char[]{41905, 25767, 14196, 17917, 64757, 51487, 56923, 9876, 13395, 18882, 23979, 45655}, 12, objArr166);
                                                                    strArr5[4] = (String) objArr166[0];
                                                                    Object[] objArr167 = new Object[1];
                                                                    c(new char[]{41905, 25767, 14196, 17917, 64757, 51487, 56923, 9876, 13395, 18882, 23979, 45655, 31823, 25674, 37689, 36240, 33606, 22204}, 17, objArr167);
                                                                    strArr5[5] = (String) objArr167[0];
                                                                    Object[] objArr168 = new Object[1];
                                                                    a(-1007623722, (byte) 0, (short) 0, 1595248957, -25, objArr168);
                                                                    strArr5[6] = (String) objArr168[0];
                                                                    Object[] objArr169 = new Object[1];
                                                                    c(new char[]{41905, 25767, 14196, 17917, 64757, 51487, 56923, 9876, 55813, 52427, 58243, 1095, 13395, 18882, 23979, 45655}, 16, objArr169);
                                                                    strArr5[7] = (String) objArr169[0];
                                                                    Object[] objArr170 = new Object[1];
                                                                    a(-1007623702, (byte) 0, (short) 0, 1595248957, -21, objArr170);
                                                                    strArr5[8] = (String) objArr170[0];
                                                                    Object[] objArr171 = new Object[1];
                                                                    c(new char[]{41905, 25767, 14196, 17917, 64757, 51487, 56923, 9876, 24296, 18706, 39975, 28578, 33606, 22204}, 13, objArr171);
                                                                    strArr5[9] = (String) objArr171[0];
                                                                    Object[] objArr172 = new Object[1];
                                                                    c(new char[]{47775, 51839, 50184, 61091, 53413, 16753, 39975, 28578, 33606, 22204}, 9, objArr172);
                                                                    String str41 = (String) objArr172[0];
                                                                    int i586 = fetchVPNInfo;
                                                                    int i587 = ((i586 | 69) << 1) - (i586 ^ 69);
                                                                    AYXKKw = i587 % 128;
                                                                    if (i587 % 2 != 0) {
                                                                        strArr5[10] = str41;
                                                                        Object[] objArr173 = new Object[1];
                                                                        c(new char[]{41905, 25767, 25524, 1484, 13395, 18882, 23979, 45655}, 64, objArr173);
                                                                        strArr5[61] = (String) objArr173[0];
                                                                        i9 = 0;
                                                                    } else {
                                                                        strArr5[10] = str41;
                                                                        Object[] objArr174 = new Object[1];
                                                                        c(new char[]{41905, 25767, 25524, 1484, 13395, 18882, 23979, 45655}, 8, objArr174);
                                                                        strArr5[11] = (String) objArr174[0];
                                                                        i9 = 0;
                                                                    }
                                                                    while (i9 < 12) {
                                                                        StringBuilder sb2 = new StringBuilder();
                                                                        sb2.append(strArr5[i9]);
                                                                        Object[] objArr175 = new Object[1];
                                                                        a(-1007623907, (byte) 0, (short) 0, 1595249025, -44, objArr175);
                                                                        sb2.append((String) objArr175[0]);
                                                                        Object[] objArr176 = {sb2.toString()};
                                                                        Object objEZpvd42 = YY.EZpvd(1704729038);
                                                                        if (objEZpvd42 == null) {
                                                                            byte b81 = (byte) 1;
                                                                            byte b82 = (byte) (b81 - 1);
                                                                            Object[] objArr177 = new Object[1];
                                                                            b(b81, b82, b82, objArr177);
                                                                            objEZpvd42 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (String) objArr177[0], new Class[]{String.class});
                                                                        }
                                                                        long jLongValue30 = ((Long) ((Method) objEZpvd42).invoke(null, objArr176)).longValue();
                                                                        long j179 = 1396650977;
                                                                        long j180 = 46;
                                                                        long j181 = jLongValue30 ^ j6;
                                                                        int i588 = ((int) (((((((j180 * j179) + (j180 * jLongValue30)) + (((long) (-90)) * (j179 | ((j181 | j12) ^ j6)))) + (((long) (-45)) * (((j181 | j) ^ j6) | ((jLongValue30 | j179) ^ j6)))) + (((long) 45) * (((j12 | j179) ^ j6) | (j181 | (((j179 ^ j6) | j) ^ j6))))) + ((long) (-1562247704))) >> 32)) & (32611826 + (((~((-549833795) | i155)) | (-887392617) | (~(549833794 | i4))) * (-564)) + ((~((-337641769) | i4)) * 1128) + (((~((-887392617) | i155)) | (-887475563)) * 564));
                                                                        int i589 = ~((int) Process.getStartUptimeMillis());
                                                                        if (((((int) r10) & ((-1871736089) + (((~(760863461 | i589)) | (~(676362948 | r11))) * 1900) + (((~(i589 | (-676362949))) | (~((-760863462) | r11))) * (-950)) + (((~(i589 | (-760863462))) | (~(r11 | (-676362949)))) * 950))) | i588) != 0) {
                                                                            i10 = i9 + WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                                                                            break;
                                                                        }
                                                                        i9++;
                                                                    }
                                                                } else {
                                                                    if (str40.contains(strArr4[i585])) {
                                                                        break;
                                                                    }
                                                                    int i590 = (i585 & (-27)) + (i585 | (-27));
                                                                    i585 = ((i590 | 28) << 1) - (i590 ^ 28);
                                                                    i584 = 1;
                                                                }
                                                            }
                                                            if (i10 == 0) {
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th8) {
                                                    Throwable cause2 = th8.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th8;
                                                }
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        Throwable cause3 = th9.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th9;
                                    }
                                }
                                i8 = 0;
                                if (i8 == 0) {
                                }
                            } catch (Throwable th10) {
                                Throwable cause4 = th10.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th10;
                            }
                        }
                    } catch (Throwable th11) {
                        Throwable cause5 = th11.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th11;
                    }
                }
            } else {
                for (int i591 = 0; i591 < 7; i591 = ((i591 | 1) << 1) - (i591 ^ 1)) {
                    Object[] objArr178 = {strArr32[i591]};
                    Object objEZpvd43 = YY.EZpvd(1042988763);
                    if (objEZpvd43 == null) {
                        byte b83 = (byte) 0;
                        byte b84 = (byte) (b83 + 1);
                        Object[] objArr179 = new Object[1];
                        b(b83, b84, b84, objArr179);
                        objEZpvd43 = YY.EZpvd(464, 5, (char) 18355, 973763495, false, (String) objArr179[0], new Class[]{String.class});
                    }
                    long jLongValue31 = ((Long) ((Method) objEZpvd43).invoke(null, objArr178)).longValue();
                    long j182 = -1065649903;
                    long j183 = j182 ^ j6;
                    long j184 = (((long) 303) * j182) + (((long) LuaValue.ERR_CLOSE_FILE_ERROR) * jLongValue31) + (((long) (-302)) * ((((j183 | j12) | jLongValue31) ^ j6) | (((j182 | jLongValue31) | j) ^ j6))) + (((long) (-604)) * (((j183 | jLongValue31) | j) ^ j6)) + (((long) 302) * (((jLongValue31 | j) ^ j6) | (((jLongValue31 ^ j6) | j182) ^ j6))) + ((long) (-54534241));
                    int i592 = ((int) (j184 >> 32)) & ((-457511774) + ((~(1437184890 | i155)) * 52) + (((~(1149809466 | i155)) | (~((-287416945) | i155)) | 287375424) * (-52)) + (((~((-1149809467) | i155)) | 1149767946) * 52));
                    int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                    int i593 = ~((-5910659) | elapsedCpuTime4);
                    int i594 = ~elapsedCpuTime4;
                    int i595 = ((int) j184) & ((-1457641550) + ((i593 | (~((-562120769) | i594))) * 497) + (((~(elapsedCpuTime4 | (-562120769))) | (~(2005257836 | i594)) | (-2011168495)) * 497));
                    if (((i592 & i595) | (i592 ^ i595)) != 0) {
                        i7 = i591 + 90;
                        break;
                    }
                }
                i7 = 0;
                if (i7 == 0) {
                }
            }
            return objArr;
            int i596 = i198 + 55;
            int i597 = i596 % 128;
            AYXKKw = i597;
            if (i596 % 2 == 0) {
                if (j2 > 0) {
                }
                c = 0;
                i6 = 8;
                char[] cArr22 = new char[i6];
                // fill-array-data instruction
                cArr22[0] = 41905;
                cArr22[1] = 25767;
                cArr22[2] = 14196;
                cArr22[3] = 17917;
                cArr22[4] = 64757;
                cArr22[5] = 51487;
                cArr22[6] = 20823;
                cArr22[7] = 1011;
                Object[] objArr9522 = new Object[1];
                c(cArr22, 7, objArr9522);
                String str3322 = (String) objArr9522[c];
                Object[] objArr9622 = new Object[1];
                a(-1007623815, (byte) 0, (short) 0, 1595248957, -35, objArr9622);
                String str3422 = (String) objArr9622[0];
                Object[] objArr9722 = new Object[1];
                a(-1007623805, (byte) 0, (short) 0, 1595248957, -34, objArr9722);
                String str3522 = (String) objArr9722[0];
                Object[] objArr9822 = new Object[1];
                c(new char[]{41905, 25767, 14196, 17917, 64757, 51487, 56923, 9876, 24296, 18706, 39975, 28578}, 12, objArr9822);
                String str3622 = (String) objArr9822[0];
                Object[] objArr9922 = new Object[1];
                c(new char[]{853, 19393, 35254, 45575, 6331, 9960, 40329, 48542, 13395, 18882, 3035, 51127}, 11, objArr9922);
                String str3722 = (String) objArr9922[0];
                Object[] objArr10022 = new Object[1];
                a(-1007623794, (byte) 0, (short) 0, 1595248957, -41, objArr10022);
                String str3822 = (String) objArr10022[0];
                Object[] objArr10122 = new Object[1];
                a(-1007623790, (byte) 0, (short) 0, 1595248957, -42, objArr10122);
                String[] strArr322 = {str3322, str3422, str3522, str3622, str3722, str3822, (String) objArr10122[0]};
                if ((i2 & 2048) == 0) {
                }
                return objArr;
            }
            if (j2 + 100 < j) {
                int i598 = i597 - (-17);
                fetchVPNInfo = i598 % 128;
                int i599 = i598 % 2;
                objArr = new Object[]{new int[]{(~(i4 & 248)) & (i4 | 248)}, new int[]{i4}, new int[]{((~i) & i) | ((~i) & i)}, null};
                int i600 = (((50872840 | r2) * (-374)) - 1934601744) + (((~(i155 | 261057434)) | 210184594) * 374);
                int i601 = (i600 & 16) + (i600 | 16);
                int i602 = (i3 & i601) + (i601 | i3);
                int i603 = i602 << 13;
                int i604 = (i603 & (~i602)) | ((~i603) & i602);
                int i605 = i604 >>> 17;
                int i606 = (i604 | i605) & (~(i604 & i605));
                int i607 = i606 << 5;
                return objArr;
            }
            c = 0;
            i6 = 8;
            char[] cArr222 = new char[i6];
            // fill-array-data instruction
            cArr222[0] = 41905;
            cArr222[1] = 25767;
            cArr222[2] = 14196;
            cArr222[3] = 17917;
            cArr222[4] = 64757;
            cArr222[5] = 51487;
            cArr222[6] = 20823;
            cArr222[7] = 1011;
            Object[] objArr95222 = new Object[1];
            c(cArr222, 7, objArr95222);
            String str33222 = (String) objArr95222[c];
            Object[] objArr96222 = new Object[1];
            a(-1007623815, (byte) 0, (short) 0, 1595248957, -35, objArr96222);
            String str34222 = (String) objArr96222[0];
            Object[] objArr97222 = new Object[1];
            a(-1007623805, (byte) 0, (short) 0, 1595248957, -34, objArr97222);
            String str35222 = (String) objArr97222[0];
            Object[] objArr98222 = new Object[1];
            c(new char[]{41905, 25767, 14196, 17917, 64757, 51487, 56923, 9876, 24296, 18706, 39975, 28578}, 12, objArr98222);
            String str36222 = (String) objArr98222[0];
            Object[] objArr99222 = new Object[1];
            c(new char[]{853, 19393, 35254, 45575, 6331, 9960, 40329, 48542, 13395, 18882, 3035, 51127}, 11, objArr99222);
            String str37222 = (String) objArr99222[0];
            Object[] objArr100222 = new Object[1];
            a(-1007623794, (byte) 0, (short) 0, 1595248957, -41, objArr100222);
            String str38222 = (String) objArr100222[0];
            Object[] objArr101222 = new Object[1];
            a(-1007623790, (byte) 0, (short) 0, 1595248957, -42, objArr101222);
            String[] strArr3222 = {str33222, str34222, str35222, str36222, str37222, str38222, (String) objArr101222[0]};
            if ((i2 & 2048) == 0) {
            }
            return objArr;
            if (i16 == 0) {
                if (Build.VERSION.SDK_INT < 24) {
                }
                return objArr;
            }
            i11 = PsExtractor.VIDEO_STREAM_MASK;
            if (i11 != 0) {
            }
            return objArr;
        } catch (Throwable th12) {
            Throwable cause6 = th12.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th12;
        }
    }
}
