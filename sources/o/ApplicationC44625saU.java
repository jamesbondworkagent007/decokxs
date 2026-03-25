package o;

import com.google.common.base.Ascii;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceComponentCallbacks2C43266rlz;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.saU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ApplicationC44625saU extends AbstractApplicationC44680sbW implements InterfaceComponentCallbacks2C43266rlz {
    public static final int AkhnZx;
    private static int AuCTel;
    public static final StateListAnimator Companion;
    private static int ejfBZ;
    private static int getFieldNames;
    private static short[] getNewProxyInstance;
    private static int hDKMBd;
    private static byte[] uzCIH;
    public final InterfaceC32485meV fARcdN = new C44719scI(this, "gp");
    private static final byte[] $$c = {Utf8.REPLACEMENT_BYTE, 19, -108, 103};
    private static final int $$d = 43;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {4, 94, 35, 33, 4, -7, 1, -29, -7, -7, -13, Ascii.FF, -17, 0, -11, Ascii.RS, 0, -17, -5};
    private static final int $$b = 150;
    private static int wlaJM = 0;
    private static int zLjUOn = 1;
    private static int iwGUEr = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(int i, int i2, short s) {
        int i3;
        int i4;
        byte[] bArr = $$c;
        int i5 = i2 * 2;
        int i6 = (s * 4) + 4;
        int i7 = (i * 3) + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        byte[] bArr2 = new byte[1 - i5];
        int i8 = 0 - i5;
        if (bArr == null) {
            int i9 = i6;
            int i10 = 0;
            i6 += -i7;
            i4 = i9 + 1;
            i3 = i10;
            bArr2[i3] = (byte) i6;
            if (i3 == i8) {
                return new java.lang.String(bArr2, 0);
            }
            int i11 = i3 + 1;
            i9 = i4;
            i7 = bArr[i4];
            i10 = i11;
            i6 += -i7;
            i4 = i9 + 1;
            i3 = i10;
            bArr2[i3] = (byte) i6;
            if (i3 == i8) {
            }
        } else {
            i3 = 0;
            i6 = i7;
            i4 = i6;
            bArr2[i3] = (byte) i6;
            if (i3 == i8) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:10:0x0029) to fix multi-entry loop: BACK_EDGE: B:9:0x0027 -> B:10:0x0029 */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i = b * 5;
        int i2 = (s * 10) + 4;
        byte[] bArr = $$a;
        int i3 = 99 - (b2 * 20);
        byte[] bArr2 = new byte[11 - i];
        int i4 = 10 - i;
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 = i3 + i4 + 8;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i2++;
                i3 = i3 + bArr[i2] + 8;
            }
        }
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void create() {
        int i = 2 % 2;
        int i2 = wlaJM + 9;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.AEQbTJ(this);
        int i4 = wlaJM + 53;
        zLjUOn = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void doOnCreate() {
        int i = 2 % 2;
        int i2 = zLjUOn + 41;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.copydefault(this);
        int i4 = wlaJM + 103;
        zLjUOn = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        int i = 2 % 2;
        int i2 = zLjUOn + 11;
        wlaJM = i2 % 128;
        if (i2 % 2 != 0) {
            InterfaceComponentCallbacks2C43266rlz.StateListAnimator.OLrzqt(this);
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOLrzqt = InterfaceComponentCallbacks2C43266rlz.StateListAnimator.OLrzqt(this);
        int i3 = wlaJM + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        zLjUOn = i3 % 128;
        int i4 = i3 % 2;
        return iOLrzqt;
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public java.util.List<java.lang.String> getSites() {
        int i = 2 % 2;
        int i2 = zLjUOn + 105;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        java.util.List<java.lang.String> listEZpvd = InterfaceComponentCallbacks2C43266rlz.StateListAnimator.EZpvd(this);
        int i4 = zLjUOn + 41;
        wlaJM = i4 % 128;
        int i5 = i4 % 2;
        return listEZpvd;
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void init(@NotNull android.content.Context context) {
        int i = 2 % 2;
        int i2 = wlaJM + 91;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.KWHzl(this, context);
        int i4 = wlaJM + 81;
        zLjUOn = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public boolean isCreated() {
        int i = 2 % 2;
        int i2 = zLjUOn + 9;
        wlaJM = i2 % 128;
        if (i2 % 2 != 0) {
            InterfaceComponentCallbacks2C43266rlz.StateListAnimator.djBIcL(this);
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zDjBIcL = InterfaceComponentCallbacks2C43266rlz.StateListAnimator.djBIcL(this);
        int i3 = wlaJM + 11;
        zLjUOn = i3 % 128;
        int i4 = i3 % 2;
        return zDjBIcL;
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        int i = 2 % 2;
        int i2 = zLjUOn + 13;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        boolean zAhwBna = InterfaceComponentCallbacks2C43266rlz.StateListAnimator.AhwBna(this);
        int i4 = zLjUOn + 37;
        wlaJM = i4 % 128;
        if (i4 % 2 == 0) {
            return zAhwBna;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void markLaunchComplete() {
        int i = 2 % 2;
        int i2 = zLjUOn + 7;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.valueOf(this);
        int i4 = wlaJM + 41;
        zLjUOn = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        int i = 2 % 2;
        int i2 = wlaJM + 5;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.gEmmrt(this);
        if (i3 == 0) {
            throw null;
        }
        int i4 = wlaJM + 63;
        zLjUOn = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        int i = 2 % 2;
        int i2 = wlaJM + 105;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.OLrzqt(this, context, interfaceC43237rlW);
        int i4 = zLjUOn + 87;
        wlaJM = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void registerSiteExtension(@NotNull android.content.Context context, @NotNull InterfaceC43309rmp interfaceC43309rmp) {
        int i = 2 % 2;
        int i2 = zLjUOn + 21;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.OLrzqt(this, context, interfaceC43309rmp);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // o.InterfaceC43261rlu
    public void setCallback(Function2<? super java.lang.String, ? super java.lang.Long, Unit> function2) {
        int i = 2 % 2;
        int i2 = wlaJM + 109;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.OLrzqt(this, function2);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
    }

    @Override // com.okinc.common.application.BaseApplication
    public InterfaceC32484meU QVAiDq() {
        int i = 2 % 2;
        C44676sbS c44676sbS = new C44676sbS();
        int i2 = zLjUOn + 93;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        return c44676sbS;
    }

    /* JADX INFO: renamed from: o.saU$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.saU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [135=5] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // o.AbstractApplicationC44680sbW, com.okinc.common.application.BaseApplication, android.app.Application
    public void onCreate() throws java.lang.Throwable {
        int i = 2 % 2;
        int i2 = zLjUOn + 103;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(588264190, (byte) -92, (short) 0, -2008125519, -29, objArr);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(588264206, (byte) -79, (short) 0, -2008125526, -29, objArr2);
        java.lang.Thread thread = (java.lang.Thread) cls.getMethod((java.lang.String) objArr2[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(588264190, (byte) -92, (short) 0, -2008125519, -29, objArr3);
        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(588264219, (byte) -35, (short) 0, -2008125522, -29, objArr4);
        java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) cls2.getMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(thread, new java.lang.Object[0]);
        try {
            java.lang.Object objEZpvd = YY.EZpvd(-1979289335);
            if (objEZpvd == null) {
                byte b = $$a[13];
                byte b2 = b;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b(b, b2, b2, objArr5);
                objEZpvd = YY.EZpvd(469, 4, (char) 64485, -1910064011, false, (java.lang.String) objArr5[0], new java.lang.Class[0]);
            }
            java.lang.String[] strArr = (java.lang.String[]) ((java.lang.reflect.Method) objEZpvd).invoke(null, null);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(588264232, (byte) -29, (short) 0, -2008125519, -29, objArr6);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr6[0]);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(588264259, (byte) -28, (short) 0, -2008125522, -29, objArr7);
            java.lang.reflect.Method method = cls3.getMethod((java.lang.String) objArr7[0], new java.lang.Class[0]);
            java.lang.Object objEZpvd2 = YY.EZpvd(587020051);
            if (objEZpvd2 == null) {
                byte b3 = $$a[6];
                byte b4 = b3;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(b3, b4, b4, objArr8);
                objEZpvd2 = YY.EZpvd(117, 4, (char) 13956, 652081775, false, (java.lang.String) objArr8[0], null);
            }
            ((java.lang.reflect.Field) objEZpvd2).setInt(null, 0);
            int length = stackTraceElementArr.length;
            int i4 = wlaJM + 1;
            zLjUOn = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                int i7 = wlaJM + 57;
                zLjUOn = i7 % 128;
                java.lang.StackTraceElement stackTraceElement = i7 % 2 == 0 ? stackTraceElementArr[i6] : stackTraceElementArr[i6];
                for (java.lang.String str : strArr) {
                    int i8 = zLjUOn + 65;
                    wlaJM = i8 % 128;
                    int i9 = i8 % 2;
                    if (str.equals((java.lang.String) method.invoke(stackTraceElement, new java.lang.Object[0]))) {
                        int i10 = zLjUOn + 107;
                        wlaJM = i10 % 128;
                        if (i10 % 2 != 0) {
                            java.lang.Object objEZpvd3 = YY.EZpvd(587020051);
                            if (objEZpvd3 == null) {
                                byte b5 = $$a[6];
                                byte b6 = b5;
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b(b5, b6, b6, objArr9);
                                objEZpvd3 = YY.EZpvd(117, 4, (char) 13956, 652081775, false, (java.lang.String) objArr9[0], null);
                            }
                            ((java.lang.reflect.Field) objEZpvd3).setInt(null, 1);
                        } else {
                            java.lang.Object objEZpvd4 = YY.EZpvd(587020051);
                            if (objEZpvd4 == null) {
                                byte b7 = $$a[6];
                                byte b8 = b7;
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                b(b7, b8, b8, objArr10);
                                objEZpvd4 = YY.EZpvd(117, 4, (char) 13956, 652081775, false, (java.lang.String) objArr10[0], null);
                            }
                            ((java.lang.reflect.Field) objEZpvd4).setInt(null, 1);
                        }
                    }
                }
                i6++;
                int i11 = wlaJM + 101;
                zLjUOn = i11 % 128;
                int i12 = i11 % 2;
            }
            init(this);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        getFieldNames = 0;
        RKDWNf();
        Companion = new StateListAnimator(null);
        AkhnZx = 8;
        int i = iwGUEr + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        getFieldNames = i % 128;
        int i2 = i % 2;
    }

    @Override // com.okinc.common.application.BaseApplication
    public InterfaceC32485meV QfsBiF() {
        int i = 2 % 2;
        int i2 = zLjUOn + 17;
        wlaJM = i2 % 128;
        if (i2 % 2 == 0) {
            return this.fARcdN;
        }
        throw null;
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public boolean needRunOnProcess(@NotNull android.content.Context context, java.lang.String str) {
        int i = 2 % 2;
        int i2 = zLjUOn + 27;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i4 = wlaJM + 69;
        zLjUOn = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void registerCustomHandler(@NotNull android.content.Context context, @NotNull InterfaceC43220rlF interfaceC43220rlF) {
        int i = 2 % 2;
        int i2 = wlaJM + 7;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43220rlF, "");
        int i4 = zLjUOn + 69;
        wlaJM = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        int i = 2 % 2;
        int i2 = wlaJM + 27;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        int i = 2 % 2;
        int i2 = wlaJM + 31;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        if (i3 == 0) {
            throw null;
        }
        int i4 = wlaJM + 123;
        zLjUOn = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // o.AbstractApplicationC44680sbW, com.okinc.common.application.BaseApplication, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) throws java.lang.Throwable {
        java.lang.StackTraceElement stackTraceElement;
        int length;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.attachBaseContext(context);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(588264190, (byte) -92, (short) 0, -2008125519, -29, objArr);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(588264206, (byte) -79, (short) 0, -2008125526, -29, objArr2);
        java.lang.Thread thread = (java.lang.Thread) cls.getMethod((java.lang.String) objArr2[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(588264190, (byte) -92, (short) 0, -2008125519, -29, objArr3);
        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(588264219, (byte) -35, (short) 0, -2008125522, -29, objArr4);
        java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) cls2.getMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(thread, new java.lang.Object[0]);
        try {
            java.lang.Object objEZpvd = YY.EZpvd(-1979289335);
            if (objEZpvd == null) {
                byte b = $$a[13];
                byte b2 = b;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b(b, b2, b2, objArr5);
                objEZpvd = YY.EZpvd(469, 4, (char) 64485, -1910064011, false, (java.lang.String) objArr5[0], new java.lang.Class[0]);
            }
            java.lang.String[] strArr = (java.lang.String[]) ((java.lang.reflect.Method) objEZpvd).invoke(null, null);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(588264232, (byte) -29, (short) 0, -2008125519, -29, objArr6);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr6[0]);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(588264259, (byte) -28, (short) 0, -2008125522, -29, objArr7);
            java.lang.reflect.Method method = cls3.getMethod((java.lang.String) objArr7[0], new java.lang.Class[0]);
            java.lang.Object objEZpvd2 = YY.EZpvd(587020051);
            if (objEZpvd2 == null) {
                byte b3 = $$a[6];
                byte b4 = b3;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(b3, b4, b4, objArr8);
                objEZpvd2 = YY.EZpvd(117, 4, (char) 13956, 652081775, false, (java.lang.String) objArr8[0], null);
            }
            ((java.lang.reflect.Field) objEZpvd2).setInt(null, 0);
            int length2 = stackTraceElementArr.length;
            int i3 = wlaJM + 103;
            zLjUOn = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 < length2; i5++) {
                int i6 = wlaJM + 35;
                zLjUOn = i6 % 128;
                if (i6 % 2 == 0) {
                    stackTraceElement = stackTraceElementArr[i5];
                    length = strArr.length;
                    i = 1;
                } else {
                    stackTraceElement = stackTraceElementArr[i5];
                    length = strArr.length;
                    i = 0;
                }
                while (i < length) {
                    int i7 = zLjUOn + 87;
                    wlaJM = i7 % 128;
                    int i8 = i7 % 2;
                    if (strArr[i].equals((java.lang.String) method.invoke(stackTraceElement, new java.lang.Object[0]))) {
                        java.lang.Object objEZpvd3 = YY.EZpvd(587020051);
                        if (objEZpvd3 == null) {
                            byte b5 = $$a[6];
                            byte b6 = b5;
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b(b5, b6, b6, objArr9);
                            objEZpvd3 = YY.EZpvd(117, 4, (char) 13956, 652081775, false, (java.lang.String) objArr9[0], null);
                        }
                        ((java.lang.reflect.Field) objEZpvd3).setInt(null, 1);
                        return;
                    }
                    i++;
                }
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [235=6] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(int i, byte b, short s, int i2, int i3, java.lang.Object[] objArr) throws java.lang.Throwable {
        boolean z;
        int i4 = 2 % 2;
        Zj zj = new Zj();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(AuCTel)};
            java.lang.Object objEZpvd = YY.EZpvd(-1048485176);
            if (objEZpvd == null) {
                objEZpvd = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = uzCIH;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        int i7 = $11 + 37;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i6])};
                        java.lang.Object objEZpvd2 = YY.EZpvd(1815080187);
                        if (objEZpvd2 == null) {
                            objEZpvd2 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        bArr2[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = uzCIH;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(ejfBZ)};
                    java.lang.Object objEZpvd3 = YY.EZpvd(-1048485176);
                    if (objEZpvd3 == null) {
                        objEZpvd3 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue()]) ^ (-2166281683126510581L))) + ((int) (((long) AuCTel) ^ (-2166281683126510581L))));
                    int i9 = $11 + 63;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    iIntValue = (short) (((short) (((long) getNewProxyInstance[i + ((int) (((long) ejfBZ) ^ (-2166281683126510581L)))]) ^ (-2166281683126510581L))) + ((int) (((long) AuCTel) ^ (-2166281683126510581L))));
                }
            }
            if (iIntValue > 0) {
                zj.OLrzqt = ((i + iIntValue) - 2) + ((int) (((long) ejfBZ) ^ (-2166281683126510581L))) + i5;
                try {
                    java.lang.Object[] objArr5 = {zj, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(hDKMBd), sb};
                    java.lang.Object objEZpvd4 = YY.EZpvd(-2015189563);
                    if (objEZpvd4 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objEZpvd4 = YY.EZpvd(180, 4, (char) 19181, -2084411207, false, $$e(b2, b3, b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                    }
                    ((java.lang.StringBuilder) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).append(zj.EZpvd);
                    zj.AEQbTJ = zj.EZpvd;
                    byte[] bArr4 = uzCIH;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i11 = 0; i11 < length2; i11++) {
                            bArr5[i11] = (byte) (((long) bArr4[i11]) ^ (-2166281683126510581L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i12 = $11 + 23;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    zj.KWHzl = 1;
                    while (zj.KWHzl < iIntValue) {
                        int i14 = $11 + 9;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        if (z) {
                            byte[] bArr6 = uzCIH;
                            zj.OLrzqt = zj.OLrzqt - 1;
                            zj.EZpvd = (char) (zj.AEQbTJ + (((byte) (((byte) (((long) bArr6[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                        } else {
                            short[] sArr = getNewProxyInstance;
                            zj.OLrzqt = zj.OLrzqt - 1;
                            zj.EZpvd = (char) (zj.AEQbTJ + (((short) (((short) (((long) sArr[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                        }
                        sb.append(zj.EZpvd);
                        zj.AEQbTJ = zj.EZpvd;
                        zj.KWHzl++;
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            java.lang.String string = sb.toString();
            int i16 = $11 + 89;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            objArr[0] = string;
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void RKDWNf() {
        ejfBZ = -1121922807;
        AuCTel = 1640963095;
        hDKMBd = 377392306;
        uzCIH = new byte[]{-1, -84, 83, 92, -91, -69, -119, 104, 86, -94, 90, -111, 98, 68, -70, 88, -6, -71, 70, 73, -80, -82, 90, -68, -77, 73, -70, 71, -88, -6, -44, -44, 57, -56, Utf8.REPLACEMENT_BYTE, -34, -44, 59, -9, 9, -39, 40, -12, -18, -31, 16, -32, 17, -49, 8, -22, -22, 7, -10, 1, -32, -22, 5, -55, -51, 47, 17, -27, Ascii.GS, -42, 37, 3, -3, Ascii.US, -5, Ascii.ETB, -29, -4, 52, -17, -3, Ascii.SUB, -58, 32, -32, 17};
    }
}
