package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.okex.center.viewmodel.SupportTroubleshootViewModel;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C44103sDl;
import o.C47315tni;
import o.C52761wXj;
import o.YY;
import o.Zh;
import o.Zj;
import o.pUP;
import o.pUU;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.AlertDescription;

/* JADX INFO: renamed from: o.siN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45042siN extends AbstractC45029siA {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm djBIcL;
    public C43316rmw fetchVPNInfo;
    public C47486tqu gEmmrt;
    public java.util.List<C45069sio> AhwBna = new java.util.ArrayList();
    public Function2<? super java.lang.Integer, ? super C45069sio, Unit> AYXKKw = new Function2() { // from class: o.siM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return C45042siN.KWHzl(this.copydefault, ((java.lang.Integer) obj).intValue(), (C45069sio) obj2);
        }
    };
    public int isConnected = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52786wYh, o.AbstractC52792wYn
    public void copydefault(@NotNull C55276xgr c55276xgr, @NotNull Function1<? super C55276xgr, java.lang.Integer> function1) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        Intrinsics.checkNotNullParameter(function1, "");
    }

    public C45042siN() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SupportTroubleshootViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.fragment.NetworkBottomSheetFragment$special$$inlined$activityViewModels$default$1
            private static short[] AYXKKw;
            private static final byte[] $$c = {101, -78, -82, -26};
            private static final int $$d = 215;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {36, -15, -45, 66, -4, 7, -1, Ascii.GS, 7, 7, Ascii.CR, -12, 17, 0, Ascii.VT, -30, 0, 17, 5};
            private static final int $$b = 32;
            private static int valueOf = 0;
            private static int values = 1;
            private static char copydefault = 12539;
            private static char EZpvd = 54455;
            private static char KWHzl = 43904;
            private static char OLrzqt = 27410;
            private static int AEQbTJ = 570542173;
            private static int gEmmrt = 1640963077;
            private static int djBIcL = 913279579;
            private static byte[] AhwBna = {-29, 79, -3, -28, 43, -18, -31, 52, -70, 5, -79, Ascii.ESC, -54, 6, -69, 17, 17, -82, 2, -77, -29, -24, Ascii.CR, -31, -89, Ascii.SUB, -76, -75, Ascii.CR, 6, -4, 40, -26, Ascii.NAK, 16, -26, Ascii.SYN, -32, -92, 89, -32, -20, -69, 88, -25, -92, 84, Ascii.NAK, -50, Ascii.FF, 9, -30, -54, -46, -72, -66, -5, Ascii.ESC, -98, 8, -63, -76, -24, -54, -29, -76, 2, -106, -7, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT};

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$e(byte b, short s, short s2) {
                int i;
                int i2;
                int i3 = s2 + AlertDescription.certificate_unobtainable;
                int i4 = 3 - (s * 3);
                int i5 = (b * 2) + 1;
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[i5];
                if (bArr == 0) {
                    int i6 = i3;
                    i2 = 0;
                    int i7 = i4;
                    int i8 = i4 + i6;
                    i = i2;
                    int i9 = i7;
                    i3 = i8;
                    i4 = i9;
                    int i10 = i4 + 1;
                    i2 = i + 1;
                    bArr2[i] = (byte) i3;
                    if (i2 == i5) {
                        return new String(bArr2, 0);
                    }
                    i6 = bArr[i10];
                    int i11 = i3;
                    i7 = i10;
                    i4 = i11;
                    int i82 = i4 + i6;
                    i = i2;
                    int i92 = i7;
                    i3 = i82;
                    i4 = i92;
                    int i102 = i4 + 1;
                    i2 = i + 1;
                    bArr2[i] = (byte) i3;
                    if (i2 == i5) {
                    }
                } else {
                    i = 0;
                    int i1022 = i4 + 1;
                    i2 = i + 1;
                    bArr2[i] = (byte) i3;
                    if (i2 == i5) {
                    }
                }
            }

            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Duplicate block (B:10:0x002f) to fix multi-entry loop: BACK_EDGE: B:9:0x0028 -> B:10:0x002f */
            private static void c(short s, short s2, int i, Object[] objArr) {
                byte[] bArr = $$a;
                int i2 = 99 - (i * 20);
                int i3 = 13 - (s2 * 10);
                int i4 = s * 5;
                byte[] bArr2 = new byte[11 - i4];
                int i5 = 10 - i4;
                int i6 = -1;
                if (bArr == null) {
                    i2 = i3 + (-i2) + 8;
                    i3 = i3;
                }
                while (true) {
                    i6++;
                    bArr2[i6] = (byte) i2;
                    if (i6 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i7 = i3 + 1;
                    i2 = i2 + (-bArr[i7]) + 8;
                    i3 = i7;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [111=4] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                Zh zh = new Zh();
                char[] cArr2 = new char[cArr.length];
                zh.EZpvd = 0;
                char[] cArr3 = new char[2];
                while (zh.EZpvd < cArr.length) {
                    int i3 = $11 + 57;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    cArr3[0] = cArr[zh.EZpvd];
                    cArr3[1] = cArr[zh.EZpvd + 1];
                    int i5 = $11 + 101;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 58224;
                    for (int i8 = 0; i8 < 16; i8++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        try {
                            Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i7) ^ ((c2 << 4) + ((char) (((long) KWHzl) ^ 6538634990023091910L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(OLrzqt)};
                            Object objEZpvd = YY.EZpvd(-2045992360);
                            if (objEZpvd == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objEZpvd = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$e(b, b2, (byte) (b2 | 7)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 6538634990023091910L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(EZpvd)};
                            Object objEZpvd2 = YY.EZpvd(-2045992360);
                            if (objEZpvd2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objEZpvd2 = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$e(b3, b4, (byte) (b4 | 7)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objEZpvd2).invoke(null, objArr3)).charValue();
                            i7 -= 40503;
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
                        objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, -619105543, false, $$e(b5, b6, (byte) (b6 | 8)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objEZpvd3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = values + 69;
                valueOf = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = values + 61;
                valueOf = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore;
                int i = 2 % 2;
                int i2 = valueOf + 101;
                values = i2 % 128;
                if (i2 % 2 == 0) {
                    viewModelStore = this.requireActivity().getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                    int i3 = 79 / 0;
                } else {
                    viewModelStore = this.requireActivity().getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                }
                int i4 = valueOf + 55;
                values = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [235=5, 175=8] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void b(int i, int i2, byte b, short s, int i3, Object[] objArr) throws Throwable {
                boolean z;
                int i4;
                boolean z2;
                int i5;
                int i6 = 2 % 2;
                Zj zj = new Zj();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(gEmmrt)};
                    Object objEZpvd = YY.EZpvd(-1048485176);
                    if (objEZpvd == null) {
                        objEZpvd = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objEZpvd).invoke(null, objArr2)).intValue();
                    if (iIntValue == -1) {
                        int i7 = $10 + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i9 = $10 + 51;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        byte[] bArr = AhwBna;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i11 = 0;
                            while (i11 < length) {
                                int i12 = $10 + 25;
                                $11 = i12 % 128;
                                if (i12 % 2 == 0) {
                                    Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                                    Object objEZpvd2 = YY.EZpvd(1815080187);
                                    if (objEZpvd2 == null) {
                                        objEZpvd2 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i11] = ((Byte) ((Method) objEZpvd2).invoke(null, objArr3)).byteValue();
                                    i11 >>= 1;
                                } else {
                                    Object[] objArr4 = {Integer.valueOf(bArr[i11])};
                                    Object objEZpvd3 = YY.EZpvd(1815080187);
                                    if (objEZpvd3 == null) {
                                        objEZpvd3 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i11] = ((Byte) ((Method) objEZpvd3).invoke(null, objArr4)).byteValue();
                                    i11++;
                                }
                            }
                            int i13 = $11 + 37;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            int i15 = $11 + 61;
                            $10 = i15 % 128;
                            if (i15 % 2 != 0) {
                                byte[] bArr3 = AhwBna;
                                Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(AEQbTJ)};
                                Object objEZpvd4 = YY.EZpvd(-1048485176);
                                if (objEZpvd4 == null) {
                                    objEZpvd4 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                i5 = ((byte) (((long) bArr3[((Integer) ((Method) objEZpvd4).invoke(null, objArr5)).intValue()]) * (-2166281683126510581L))) >> ((int) (((long) gEmmrt) - 2166281683126510581L));
                            } else {
                                byte[] bArr4 = AhwBna;
                                Object[] objArr6 = {Integer.valueOf(i2), Integer.valueOf(AEQbTJ)};
                                Object objEZpvd5 = YY.EZpvd(-1048485176);
                                if (objEZpvd5 == null) {
                                    objEZpvd5 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                i5 = ((byte) (((long) bArr4[((Integer) ((Method) objEZpvd5).invoke(null, objArr6)).intValue()]) ^ (-2166281683126510581L))) + ((int) (((long) gEmmrt) ^ (-2166281683126510581L)));
                            }
                            iIntValue = (byte) i5;
                        } else {
                            iIntValue = (short) (((short) (((long) AYXKKw[i2 + ((int) (((long) AEQbTJ) ^ (-2166281683126510581L)))]) ^ (-2166281683126510581L))) + ((int) (((long) gEmmrt) ^ (-2166281683126510581L))));
                        }
                    }
                    if (iIntValue > 0) {
                        int i16 = ((i2 + iIntValue) - 2) + ((int) (((long) AEQbTJ) ^ (-2166281683126510581L)));
                        if (z) {
                            int i17 = $11 + 117;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        zj.OLrzqt = i16 + i4;
                        Object[] objArr7 = {zj, Integer.valueOf(i3), Integer.valueOf(djBIcL), sb};
                        Object objEZpvd6 = YY.EZpvd(-2015189563);
                        if (objEZpvd6 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objEZpvd6 = YY.EZpvd(180, 4, (char) 19181, -2084411207, false, $$e(b2, b3, b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objEZpvd6).invoke(null, objArr7)).append(zj.EZpvd);
                        zj.AEQbTJ = zj.EZpvd;
                        byte[] bArr5 = AhwBna;
                        if (bArr5 != null) {
                            int i19 = $11 + 87;
                            $10 = i19 % 128;
                            int i20 = i19 % 2;
                            int length2 = bArr5.length;
                            byte[] bArr6 = new byte[length2];
                            int i21 = 0;
                            while (i21 < length2) {
                                int i22 = $10 + 117;
                                $11 = i22 % 128;
                                if (i22 % 2 == 0) {
                                    bArr6[i21] = (byte) (((long) bArr5[i21]) & (-2166281683126510581L));
                                } else {
                                    bArr6[i21] = (byte) (((long) bArr5[i21]) ^ (-2166281683126510581L));
                                    i21++;
                                }
                            }
                            bArr5 = bArr6;
                        }
                        if (bArr5 != null) {
                            int i23 = $11 + 21;
                            $10 = i23 % 128;
                            int i24 = i23 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zj.KWHzl = 1;
                        while (zj.KWHzl < iIntValue) {
                            if (z2) {
                                byte[] bArr7 = AhwBna;
                                zj.OLrzqt = zj.OLrzqt - 1;
                                zj.EZpvd = (char) (zj.AEQbTJ + (((byte) (((byte) (((long) bArr7[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                            } else {
                                short[] sArr = AYXKKw;
                                zj.OLrzqt = zj.OLrzqt - 1;
                                zj.EZpvd = (char) (zj.AEQbTJ + (((short) (((short) (((long) sArr[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                            }
                            sb.append(zj.EZpvd);
                            zj.AEQbTJ = zj.EZpvd;
                            zj.KWHzl++;
                        }
                    }
                    String string = sb.toString();
                    int i25 = $10 + 87;
                    $11 = i25 % 128;
                    int i26 = i25 % 2;
                    objArr[0] = string;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            public static void AEQbTJ(long j, long j2) throws Throwable {
                long j3;
                Object obj;
                Object obj2;
                int i = 2 % 2;
                int i2 = valueOf + 17;
                values = i2 % 128;
                if (i2 % 2 == 0) {
                    j3 = j ^ (j2 >>> 99);
                    Object[] objArr = new Object[1];
                    a(new char[]{45873, 39688, 63685, 36592, 38927, 36054, 24876, 24259, 30305, 27547}, 48, objArr);
                    obj = C44103sDl.class.getField((String) objArr[0]).get(null);
                } else {
                    j3 = j ^ (j2 << 32);
                    Object[] objArr2 = new Object[1];
                    a(new char[]{45873, 39688, 63685, 36592, 38927, 36054, 24876, 24259, 30305, 27547}, 9, objArr2);
                    obj = C44103sDl.class.getField((String) objArr2[0]).get(null);
                }
                try {
                    Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Object[] objArr3 = new Object[1];
                    a(new char[]{52483, 10703, 20079, 28759, 51652, 23839, 55780, 56001, 29154, 45272, 62914, 38035, 6011, 49128, 65225, 28608, 34969, 14836, 21902, 42692, 58014, 30123, 39330, 13999, 32352, 51947, 38298, 14458, 26597, 6976, 65340, 64361, 51650, 36484}, 34, objArr3);
                    String str = (String) objArr3[0];
                    int i3 = values + 109;
                    valueOf = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 3 / 4;
                    }
                    Object[] objArr4 = new Object[1];
                    a(new char[]{59626, 33111, 1561, 11777, 60795, 44091}, 6, objArr4);
                    Method method = StringBuilder.class.getMethod((String) objArr4[0], String.class);
                    method.setAccessible(true);
                    method.invoke(objNewInstance, str);
                    int i5 = valueOf + 49;
                    values = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr5 = {Long.valueOf(j3)};
                    Object[] objArr6 = new Object[1];
                    a(new char[]{59626, 33111, 1561, 11777, 60795, 44091}, 6, objArr6);
                    Method method2 = StringBuilder.class.getMethod((String) objArr6[0], Long.TYPE);
                    method2.setAccessible(true);
                    method2.invoke(objNewInstance, objArr5);
                    Object[] objArr7 = new Object[1];
                    a(new char[]{45028, 58051, 13979, 14681, 42288, 2978, 24876, 24259, 28052, 59273, 58291, 59214, 10500, 54751, 9601, 46339, 38927, 36054, 52025, 2597, 59850, 49566}, 22, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(-6, -1137628246, (byte) 41, (short) -24, -1470141916, objArr8);
                    Method method3 = StringBuilder.class.getMethod((String) objArr8[0], null);
                    method3.setAccessible(true);
                    Object objInvoke = method3.invoke(objNewInstance, null);
                    Object[] objArr9 = new Object[1];
                    b(-11, -1137628239, (byte) -67, (short) 10, -1470141923, objArr9);
                    Object[] objArr10 = {objInvoke, (String) objArr9[0]};
                    Object[] objArr11 = new Object[1];
                    b(7, -1137628237, (byte) -92, (short) -101, -1470141933, objArr11);
                    Method method4 = Intrinsics.class.getMethod((String) objArr11[0], Object.class, String.class);
                    method4.setAccessible(true);
                    method4.invoke(null, objArr10);
                    if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                        Object[] objArr12 = new Object[1];
                        b(9, -1137628217, (byte) 98, (short) 124, -1470141953, objArr12);
                        String str3 = (String) objArr12[0];
                        Object[] objArr13 = new Object[1];
                        b(-6, -1137628246, (byte) 41, (short) -24, -1470141916, objArr13);
                        Method method5 = Object.class.getMethod((String) objArr13[0], null);
                        method5.setAccessible(true);
                        Object[] objArr14 = {method5.invoke(str3, null)};
                        Constructor declaredConstructor2 = IllegalStateException.class.getDeclaredConstructor(String.class);
                        declaredConstructor2.setAccessible(true);
                        throw ((Throwable) declaredConstructor2.newInstance(objArr14));
                    }
                    int i7 = valueOf;
                    int i8 = i7 + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                    values = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i7 + 93;
                    values = i10 % 128;
                    if (i10 % 2 == 0) {
                        obj2 = pUU.class.getField("copydefault").get(null);
                        int i11 = 25 / 0;
                    } else {
                        obj2 = pUU.class.getField("copydefault").get(null);
                    }
                    int i12 = valueOf + 47;
                    values = i12 % 128;
                    int i13 = i12 % 2;
                    Method method6 = Intrinsics.class.getMethod("copydefault", Object.class);
                    method6.setAccessible(true);
                    method6.invoke(null, obj2);
                    int i14 = values + 87;
                    valueOf = i14 % 128;
                    int i15 = i14 % 2;
                    Method method7 = pUP.class.getMethod("OLrzqt", String.class, String.class);
                    method7.setAccessible(true);
                    method7.invoke(obj2, str2, objInvoke);
                    byte[] bArr = $$a;
                    byte b = bArr[13];
                    Object[] objArr15 = new Object[1];
                    c(b, (byte) (-bArr[6]), b, objArr15);
                    Method method8 = C44103sDl.ActionBar.class.getMethod((String) objArr15[0], null);
                    method8.setAccessible(true);
                    Object objInvoke2 = method8.invoke(obj, null);
                    Object[] objArr16 = new Object[1];
                    b(5, -1137628195, Ascii.NAK, (short) 45, -1470141927, objArr16);
                    DetectionInfoBean.class.getField((String) objArr16[0]).setBoolean(objInvoke2, true);
                    int i16 = valueOf + 121;
                    values = i16 % 128;
                    if (i16 % 2 == 0) {
                        byte b2 = bArr[13];
                        Object[] objArr17 = new Object[1];
                        c(b2, (byte) (-bArr[6]), b2, objArr17);
                        Method method9 = C44103sDl.ActionBar.class.getMethod((String) objArr17[0], null);
                        method9.setAccessible(false);
                        Object objInvoke3 = method9.invoke(obj, null);
                        Long lValueOf = Long.valueOf(j3);
                        Object[] objArr18 = new Object[1];
                        a(new char[]{50637, 51432, 21677, 56360, 23654, 13236, 12928, 9315, 19267, 485}, 68, objArr18);
                        DetectionInfoBean.class.getField((String) objArr18[0]).set(objInvoke3, lValueOf);
                    } else {
                        byte b3 = bArr[13];
                        Object[] objArr19 = new Object[1];
                        c(b3, (byte) (-bArr[6]), b3, objArr19);
                        Method method10 = C44103sDl.ActionBar.class.getMethod((String) objArr19[0], null);
                        method10.setAccessible(true);
                        Object objInvoke4 = method10.invoke(obj, null);
                        Long lValueOf2 = Long.valueOf(j3);
                        Object[] objArr20 = new Object[1];
                        a(new char[]{50637, 51432, 21677, 56360, 23654, 13236, 12928, 9315, 19267, 485}, 9, objArr20);
                        DetectionInfoBean.class.getField((String) objArr20[0]).set(objInvoke4, lValueOf2);
                    }
                    byte b4 = bArr[6];
                    Object[] objArr21 = new Object[1];
                    c((byte) (-b4), bArr[13], (byte) (-b4), objArr21);
                    Method method11 = C44103sDl.ActionBar.class.getMethod((String) objArr21[0], null);
                    method11.setAccessible(true);
                    method11.invoke(obj, null);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.fragment.NetworkBottomSheetFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.fragment.NetworkBottomSheetFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.siA.OLrzqt()V */
    public final SupportTroubleshootViewModel OLrzqt() {
        return (SupportTroubleshootViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: renamed from: o.siN$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.siN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C45042siN EZpvd() {
            return new C45042siN();
        }
    }

    private final void copydefault(java.util.List<C45069sio> list) {
        this.AhwBna = list;
        C43316rmw c43316rmw = this.fetchVPNInfo;
        if (c43316rmw != null) {
            c43316rmw.AhwBna(list);
        }
    }

    public static final Unit KWHzl(C45042siN c45042siN, int i, C45069sio c45069sio) {
        if (c45069sio != null) {
            c45042siN.OLrzqt().EZpvd(c45069sio.copydefault());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(int i) {
        C45069sio c45069sio;
        this.isConnected = i;
        Function2<? super java.lang.Integer, ? super C45069sio, Unit> function2 = this.AYXKKw;
        if (function2 != null && (c45069sio = (C45069sio) CollectionsKt___CollectionsKt.AkhnZx(this.AhwBna, i)) != null) {
            function2.invoke(java.lang.Integer.valueOf(i), c45069sio);
        }
        C43316rmw c43316rmw = this.fetchVPNInfo;
        if (c43316rmw != null) {
            c43316rmw.notifyDataSetChanged();
        }
        dismiss();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(8);
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.valueOf().setForegroundGravity(8388611);
        wxq.AYXKKw().setGravity(8388611);
        wxq.setTitle(C33070mpX.AYXKKw(C47315tni.PendingIntent.QSBOWP));
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    @Override // o.AbstractC52786wYh, o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        EZpvd(constraintLayout);
        AEQbTJ(constraintLayout);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault(OLrzqt().gEmmrt());
        view.post(new java.lang.Runnable() { // from class: o.siJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45042siN.EZpvd(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(C45042siN c45042siN) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45042siN, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd(ConstraintLayout constraintLayout) {
        this.gEmmrt = C47486tqu.EZpvd(getCustomLayoutInflater(), constraintLayout);
        C43316rmw c43316rmw = new C43316rmw();
        java.util.List<C45072sir> value = OLrzqt().copydefault().getValue();
        if (value != null) {
            c43316rmw.setItems(value);
        }
        c43316rmw.register(C45069sio.class, new TaskDescription());
        this.fetchVPNInfo = c43316rmw;
        C47486tqu c47486tqu = this.gEmmrt;
        if (c47486tqu == null) {
            Intrinsics.gEmmrt("");
            c47486tqu = null;
        }
        RecyclerView recyclerView = c47486tqu.OLrzqt;
        recyclerView.setAdapter(this.fetchVPNInfo);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.copydefault(16.0f, context), 0));
        recyclerView.setItemViewCacheSize(0);
    }

    /* JADX INFO: renamed from: o.siN$TaskDescription */
    public static final class TaskDescription extends AbstractC59533zio<C45069sio, Activity> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C54943xac c54943xacCopydefault = C54943xac.copydefault(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c54943xacCopydefault, "");
            return new Activity(C45042siN.this, c54943xacCopydefault);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(Activity activity, C45069sio c45069sio) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(c45069sio, "");
            activity.KWHzl(c45069sio);
        }
    }

    public final void AEQbTJ(ConstraintLayout constraintLayout) {
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.wXX, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.siQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(android.content.DialogInterface dialogInterface) {
                C45042siN.AEQbTJ(dialogInterface);
            }
        });
        return dialogOnCreateDialog;
    }

    public static final void AEQbTJ(android.content.DialogInterface dialogInterface) {
        Intrinsics.copydefault(dialogInterface, "");
        ((BottomSheetDialog) dialogInterface).getBehavior().setDraggable(false);
    }

    /* JADX INFO: renamed from: o.siN$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ C45042siN EZpvd;
        public final C54943xac KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C45042siN c45042siN, C54943xac c54943xac) {
            super(c54943xac.getRoot());
            Intrinsics.checkNotNullParameter(c54943xac, "");
            this.EZpvd = c45042siN;
            this.KWHzl = c54943xac;
        }

        public final void KWHzl(@NotNull C45069sio c45069sio) {
            Intrinsics.checkNotNullParameter(c45069sio, "");
            C55166xen c55166xen = this.KWHzl.AEQbTJ;
            C45042siN c45042siN = this.EZpvd;
            c55166xen.setSelected(c45069sio.KWHzl());
            c55166xen.setOnClickListener(new ViewOnClickListenerC0946Activity(c55166xen, 1000L, c45042siN, this));
            c55166xen.setTitleText(c45069sio.OLrzqt().EZpvd());
            c55166xen.setDescriptionText(c45069sio.OLrzqt().OLrzqt());
            c55166xen.setTitleAttachingView(c45069sio.OLrzqt().copydefault());
        }

        /* JADX INFO: renamed from: o.siN$Activity$Activity, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0946Activity implements View.OnClickListener {
            public final /* synthetic */ Activity AEQbTJ;
            public final /* synthetic */ C45042siN EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0946Activity(android.view.View view, long j, C45042siN c45042siN, Activity activity) {
                this.copydefault = view;
                this.KWHzl = j;
                this.EZpvd = c45042siN;
                this.AEQbTJ = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    C45363soQ.onSessionIdEvent$default("SupportCenter_DepositStatusChecker_Network_Click", false, null, 3, null);
                    this.EZpvd.EZpvd(this.AEQbTJ.getBindingAdapterPosition());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.siN$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C45042siN KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C45042siN c45042siN) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c45042siN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.dismiss();
            }
        }
    }
}
