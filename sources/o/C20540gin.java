package o;

import android.os.Build;
import android.view.View;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.flyco.tablayout.BuildConfig;
import com.google.common.base.Ascii;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.transaction.sign.evm.OKWX402SignTransfer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8564bFB;
import o.C13754dXa;
import o.C20540gin;
import o.C57406yhn;
import o.C57516yjr;
import org.luaj.vm2.LuaValue;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.gin, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20540gin<T extends AbstractC8564bFB<?, ?>> extends AbstractC20481ghh<T> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int zLjUOn = 8;
    public C57516yjr AuCTelauCTel;

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC8564bFB copydefault(C20540gin c20540gin) {
        return (AbstractC8564bFB) c20540gin.ejfBZ();
    }

    /* JADX INFO: renamed from: o.gin$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gin.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: o.ghh$Activity */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: o.ghh$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C20540gin newInstance$default(ActionBar actionBar, java.util.List list, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = null;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            if (list != null) {
                AbstractC20481ghh.Companion.KWHzl(list);
            }
            if (function1 != null) {
                AbstractC20481ghh.Companion.OLrzqt(function1);
            }
            return new C20540gin();
        }
    }

    @Override // o.AbstractC20169gbn
    public C57516yjr djBIcL() {
        C57516yjr c57516yjrDjBIcL = super.djBIcL();
        this.AuCTelauCTel = c57516yjrDjBIcL;
        QbewEr();
        return c57516yjrDjBIcL;
    }

    /* JADX INFO: renamed from: o.gin$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription implements View.OnAttachStateChangeListener {
        public final LifecycleEventObserver AEQbTJ;
        public final /* synthetic */ C20540gin<T> EZpvd;
        public InterfaceC58217yxC KWHzl;

        /* JADX INFO: renamed from: o.gin$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public final /* synthetic */ class C0853TaskDescription {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                AEQbTJ = iArr;
            }
        }

        public TaskDescription(final C20540gin<T> c20540gin) {
            this.EZpvd = c20540gin;
            this.AEQbTJ = new LifecycleEventObserver() { // from class: com.okinc.business.defi.wallet.transaction.ui.ui3.OKWSignTransactionModularizationFragment$initNetworkFeeView$1$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    C20540gin.TaskDescription.EZpvd(this.OLrzqt, c20540gin, lifecycleOwner, event);
                }
            };
        }

        public static final void EZpvd(TaskDescription taskDescription, C20540gin c20540gin, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            Intrinsics.checkNotNullParameter(event, "");
            int i = C0853TaskDescription.AEQbTJ[event.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    AbstractC8564bFB.startLoopRefresh$default(C20540gin.copydefault(c20540gin), 0L, 1, null);
                    return;
                } else {
                    if (i != 3) {
                        return;
                    }
                    C20540gin.copydefault(c20540gin).QkdxfA();
                    return;
                }
            }
            AbstractC58185ywX abstractC58185ywXIsConnected = C20540gin.copydefault(c20540gin).QKudOq().isConnected();
            LifecycleOwner viewLifecycleOwner = c20540gin.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXIsConnected, viewLifecycleOwner, Lifecycle.Event.ON_STOP);
            final Activity activity = new Activity(c20540gin);
            taskDescription.KWHzl = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.gip
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20540gin.TaskDescription.EZpvd(activity, obj);
                }
            });
        }

        /* JADX INFO: renamed from: o.gin$TaskDescription$Activity */
        public static final class Activity implements Function1 {
            private static short[] gEmmrt;
            public final /* synthetic */ C20540gin<T> KWHzl;
            private static final byte[] $$c = {92, -11, -109, 65};
            private static final int $$d = 86;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {100, -61, 88, 56, 3, Ascii.RS, -35, Ascii.GS, Ascii.DC2, -23, 7, Ascii.CAN, Ascii.FF, 3, Ascii.SO, 6, 36, Ascii.SO, Ascii.SO, Ascii.DC4, -5, Ascii.CAN, 7, -26, Ascii.VT, -37, 34, Ascii.CAN};
            private static final int $$b = BuildConfig.VERSION_CODE;
            private static int AhwBna = 0;
            private static int AYXKKw = 1;
            private static int copydefault = -1767924261;
            private static int EZpvd = 1640963150;
            private static int AEQbTJ = 552343279;
            private static byte[] OLrzqt = {-39, -9, Ascii.CAN, -6, Ascii.CR, -12, 39, Ascii.RS, -79, Ascii.CR, 2, -6, Ascii.CR, -12, 7, 62, -63, -16, -15, -10, 5, -3, 6, -58, 2, -13, 46, -48, -12, Ascii.CR, -2, Ascii.CAN, -11, -15, -10, -9, Ascii.VT, 36, -58, 4, -11, -42, 2, -13, 46, -48, -12, Ascii.CR, -2, Ascii.CAN, -11, -15, -10, -9, Ascii.VT, 36, Ascii.CAN, -54, -10, 73, -79, Ascii.CR, 2, -6, Ascii.CR, -12, 7, 62, -63, -16, -15, -10, 5, -3, 6, -53, 7, Ascii.CR, -2, Ascii.CR, -36, -6, 79, -62, -14, 1, 10, -15, Ascii.VT, -7, Ascii.CAN, -10, 10, 60, -62, -14, -12, Ascii.VT, 54, -80, 0, -16, Ascii.SO, 49, -57, -28, 4, 61, -61, -14, 1, 10, -15, Ascii.VT, -7, Ascii.CAN, -10, 10, 61, -76, -10, -73};

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(short s, short s2, byte b) {
                int i;
                int i2 = (s2 * 4) + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                int i3 = 4 - (s * 2);
                byte[] bArr = $$c;
                int i4 = b * 4;
                byte[] bArr2 = new byte[i4 + 1];
                if (bArr == 0) {
                    int i5 = i4;
                    int i6 = 0;
                    i3++;
                    i2 += -i5;
                    i = i6;
                    bArr2[i] = (byte) i2;
                    i6 = i + 1;
                    if (i == i4) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i5 = bArr[i3];
                    i3++;
                    i2 += -i5;
                    i = i6;
                    bArr2[i] = (byte) i2;
                    i6 = i + 1;
                    if (i == i4) {
                    }
                } else {
                    i = 0;
                    bArr2[i] = (byte) i2;
                    i6 = i + 1;
                    if (i == i4) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(C20540gin<T> c20540gin) {
                this.KWHzl = c20540gin;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(short s, byte b, short s2, java.lang.Object[] objArr) {
                int i;
                int i2 = s2 + 65;
                byte[] bArr = $$a;
                int i3 = 25 - s;
                byte[] bArr2 = new byte[11 - b];
                int i4 = 10 - b;
                if (bArr == 0) {
                    int i5 = i4;
                    i = 0;
                    i2 = i2 + (-i5) + 15;
                    i3++;
                    bArr2[i] = (byte) i2;
                    if (i == i4) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i5 = bArr[i3];
                    i++;
                    i2 = i2 + (-i5) + 15;
                    i3++;
                    bArr2[i] = (byte) i2;
                    if (i == i4) {
                    }
                } else {
                    i = 0;
                    bArr2[i] = (byte) i2;
                    if (i == i4) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                int i = 2 % 2;
                int i2 = AYXKKw + 59;
                AhwBna = i2 % 128;
                int i3 = i2 % 2;
                copydefault((C8486bDd) obj);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    throw null;
                }
                int i4 = AhwBna + 57;
                AYXKKw = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void copydefault(C8486bDd c8486bDd) {
                int i = 2 % 2;
                int i2 = AhwBna + 77;
                AYXKKw = i2 % 128;
                if (i2 % 2 != 0) {
                    C20540gin<T> c20540gin = this.KWHzl;
                    AbstractC8426bCW abstractC8426bCWQKudOq = C20540gin.copydefault((C20540gin) c20540gin).QKudOq();
                    Intrinsics.copydefault(c8486bDd);
                    c20540gin.copydefault((AbstractC8426bCW<?>) abstractC8426bCWQKudOq, c8486bDd);
                    return;
                }
                C20540gin<T> c20540gin2 = this.KWHzl;
                AbstractC8426bCW abstractC8426bCWQKudOq2 = C20540gin.copydefault((C20540gin) c20540gin2).QKudOq();
                Intrinsics.copydefault(c8486bDd);
                c20540gin2.copydefault((AbstractC8426bCW<?>) abstractC8426bCWQKudOq2, c8486bDd);
                int i3 = 63 / 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [235=4, 223=6] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /* JADX WARN: Removed duplicated region for block: B:58:0x01d4  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(int i, byte b, short s, int i2, int i3, java.lang.Object[] objArr) throws java.lang.Throwable {
                boolean z;
                int i4;
                int i5;
                int i6 = 2 % 2;
                Zj zj = new Zj();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(EZpvd)};
                    java.lang.Object objEZpvd = YY.EZpvd(-1048485176);
                    if (objEZpvd == null) {
                        objEZpvd = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
                    if (iIntValue == -1) {
                        int i7 = $11 + 17;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i9 = $11 + 83;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        byte[] bArr = OLrzqt;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            for (int i11 = 0; i11 < length; i11++) {
                                int i12 = $11 + 19;
                                $10 = i12 % 128;
                                int i13 = i12 % 2;
                                try {
                                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i11])};
                                    java.lang.Object objEZpvd2 = YY.EZpvd(1815080187);
                                    if (objEZpvd2 == null) {
                                        objEZpvd2 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new java.lang.Class[]{java.lang.Integer.TYPE});
                                    }
                                    bArr2[i11] = ((java.lang.Byte) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).byteValue();
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = OLrzqt;
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(copydefault)};
                            java.lang.Object objEZpvd3 = YY.EZpvd(-1048485176);
                            if (objEZpvd3 == null) {
                                objEZpvd3 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue()]) ^ (-2166281683126510581L))) + ((int) (((long) EZpvd) ^ (-2166281683126510581L))));
                        } else {
                            iIntValue = (short) (((short) (((long) gEmmrt[i + ((int) (((long) copydefault) ^ (-2166281683126510581L)))]) ^ (-2166281683126510581L))) + ((int) (((long) EZpvd) ^ (-2166281683126510581L))));
                        }
                    }
                    if (iIntValue > 0) {
                        int i14 = ((i + iIntValue) - 2) + ((int) (((long) copydefault) ^ (-2166281683126510581L)));
                        if (z) {
                            int i15 = $11 + 61;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        zj.OLrzqt = i14 + i4;
                        java.lang.Object[] objArr5 = {zj, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(AEQbTJ), sb};
                        java.lang.Object objEZpvd4 = YY.EZpvd(-2015189563);
                        if (objEZpvd4 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objEZpvd4 = YY.EZpvd(180, 4, (char) 19181, -2084411207, false, $$e(b2, b3, b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).append(zj.EZpvd);
                        zj.AEQbTJ = zj.EZpvd;
                        byte[] bArr4 = OLrzqt;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i17 = 0; i17 < length2; i17++) {
                                int i18 = $11 + 1;
                                $10 = i18 % 128;
                                int i19 = i18 % 2;
                                bArr5[i17] = (byte) (((long) bArr4[i17]) ^ (-2166281683126510581L));
                            }
                            bArr4 = bArr5;
                        }
                        if (bArr4 != null) {
                            int i20 = $10 + 121;
                            $11 = i20 % 128;
                            boolean z2 = i20 % 2 != 0;
                            zj.KWHzl = 1;
                            while (zj.KWHzl < iIntValue) {
                                if (z2) {
                                    int i21 = $11 + 31;
                                    $10 = i21 % 128;
                                    if (i21 % 2 != 0) {
                                        byte[] bArr6 = OLrzqt;
                                        zj.OLrzqt = zj.OLrzqt;
                                        i5 = zj.AEQbTJ * (((byte) (((byte) (((long) bArr6[r8]) * (-2166281683126510581L))) >> s)) ^ b);
                                    } else {
                                        byte[] bArr7 = OLrzqt;
                                        zj.OLrzqt = zj.OLrzqt - 1;
                                        i5 = zj.AEQbTJ + (((byte) (((byte) (((long) bArr7[r8]) ^ (-2166281683126510581L))) + s)) ^ b);
                                    }
                                    zj.EZpvd = (char) i5;
                                } else {
                                    short[] sArr = gEmmrt;
                                    zj.OLrzqt = zj.OLrzqt - 1;
                                    zj.EZpvd = (char) (zj.AEQbTJ + (((short) (((short) (((long) sArr[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                                }
                                sb.append(zj.EZpvd);
                                zj.AEQbTJ = zj.EZpvd;
                                zj.KWHzl++;
                            }
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r5v47, resolved type: boolean */
            /* JADX DEBUG: Multi-variable search result rejected for r5v48, resolved type: boolean */
            /* JADX DEBUG: Multi-variable search result rejected for r5v56, resolved type: boolean */
            /* JADX DEBUG: Multi-variable search result rejected for r5v86, resolved type: boolean */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:104:0x0720  */
            /* JADX WARN: Removed duplicated region for block: B:105:0x07c7  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x046a  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0587 A[Catch: all -> 0x0698, TryCatch #3 {all -> 0x0698, blocks: (B:69:0x057a, B:71:0x0587, B:72:0x05af), top: B:134:0x057a, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0645  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0671 A[Catch: Exception -> 0x071a, TryCatch #1 {Exception -> 0x071a, blocks: (B:61:0x0550, B:68:0x0570, B:74:0x05bf, B:78:0x0646, B:81:0x0671, B:85:0x0699, B:87:0x069f, B:88:0x06a0, B:89:0x06a1, B:95:0x06ff, B:97:0x0712, B:99:0x0718, B:100:0x0719, B:64:0x0557, B:90:0x06b7, B:92:0x06c4, B:93:0x06ed, B:69:0x057a, B:71:0x0587, B:72:0x05af), top: B:131:0x054e, inners: #0, #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:92:0x06c4 A[Catch: all -> 0x0711, TryCatch #0 {all -> 0x0711, blocks: (B:90:0x06b7, B:92:0x06c4, B:93:0x06ed), top: B:129:0x06b7, outer: #1 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] copydefault(android.content.Context context, int i, int i2, int i3) throws java.lang.Throwable {
                java.lang.String str;
                java.lang.Object[] objArr;
                java.lang.Object[] objArr2;
                char c;
                int i4;
                char c2;
                char c3;
                int i5;
                int i6;
                int i7;
                boolean zEquals;
                java.lang.Object objEZpvd;
                java.lang.Object objEZpvd2;
                int i8;
                int i9 = 2 % 2;
                int i10 = AhwBna;
                int i11 = ((i10 | 37) << 1) - (i10 ^ 37);
                AYXKKw = i11 % 128;
                int i12 = i11 % 2;
                int i13 = (i10 & 29) + (i10 | 29);
                int i14 = i13 % 128;
                AYXKKw = i14;
                if (i13 % 2 == 0) {
                    throw null;
                }
                if (context == null) {
                    int i15 = (i14 ^ 35) + ((i14 & 35) << 1);
                    AhwBna = i15 % 128;
                    int i16 = i15 % 2;
                    java.lang.Object[] objArr3 = {new int[]{i}, null, new int[]{(i | i) & (~(i & i))}, new int[]{i}};
                    int i17 = ~i;
                    int i18 = ((((~(363001491 | i17)) | (~(i | 474240045))) * 959) - 133010857) + (((~(363001491 | i)) | (~(474240045 | i17))) * 959);
                    int i19 = ~i18;
                    int i20 = ~i3;
                    int i21 = ~(i19 | i20);
                    int i22 = ~((~i3) | i17);
                    int i23 = (((i18 * (-167)) + (i3 * (-167))) - (~(-(-(((i21 ^ i22) | (i21 & i22)) * CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256))))) - 1;
                    int i24 = -(-((~((i19 ^ i20) | (i19 & i20) | i)) * CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256));
                    int i25 = (i23 & i24) + (i23 | i24);
                    int i26 = ~i18;
                    int i27 = ~((i17 & i26) | (i26 ^ i17));
                    int i28 = ~((i3 & i19) | (i19 ^ i3));
                    int i29 = (i28 & i27) | (i27 ^ i28);
                    int i30 = (i20 ^ i18) | (i20 & i18);
                    int i31 = ~((i & i30) | (i30 ^ i));
                    int i32 = i25 + (((i31 & i29) | (i29 ^ i31)) * CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
                    int i33 = i32 << 13;
                    int i34 = (i33 & (~i32)) | ((~i33) & i32);
                    int i35 = i34 ^ (i34 >>> 17);
                    int i36 = i35 << 5;
                    int i37 = (i14 ^ 47) + ((i14 & 47) << 1);
                    AhwBna = i37 % 128;
                    if (i37 % 2 == 0) {
                        return objArr3;
                    }
                    int i38 = 3 % 3;
                    return objArr3;
                }
                int i39 = i14 + 69;
                AhwBna = i39 % 128;
                try {
                    if (i39 % 2 != 0) {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b(145718832, (byte) 1, (short) 0, -1092815491, 10, objArr4);
                        str = (java.lang.String) objArr4[0];
                    } else {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(145718832, (byte) 0, (short) 0, -1092815491, -70, objArr5);
                        str = (java.lang.String) objArr5[0];
                    }
                    java.lang.Class<?> cls = java.lang.Class.forName(str);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(145718855, (byte) 0, (short) 0, -1092815485, -70, objArr6);
                    java.lang.Object objInvoke = cls.getMethod((java.lang.String) objArr6[0], null).invoke(context, null);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(145718873, (byte) 0, (short) 0, -1092815491, -70, objArr7);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(145718907, (byte) 0, (short) 0, -1092815486, -70, objArr8);
                    java.lang.reflect.Field field = cls2.getField((java.lang.String) objArr8[0]);
                    int i40 = AhwBna + 51;
                    AYXKKw = i40 % 128;
                    int i41 = i40 % 2;
                    int i42 = field.getInt(objInvoke);
                    if (i41 != 0 ? (i42 & 2) == 0 : (i42 & 3) == 0) {
                        objArr = new java.lang.Object[]{new int[]{i}, null, new int[1], new int[]{i}};
                        int i43 = ((((-128118763) | r4) * (-970)) - 177515753) + (((~((~i) | (-16838569))) | 111280194) * 970);
                        int i44 = (i43 << 1) - i43;
                        int i45 = AYXKKw;
                        int i46 = (i45 & 13) + (i45 | 13);
                        AhwBna = i46 % 128;
                        int i47 = i46 % 2;
                        int iOLrzqt = cTQ.OLrzqt();
                        int i48 = i44 * (-129);
                        int i49 = -(-(i3 * com.ibm.icu.text.DateFormat.RELATIVE_SHORT));
                        int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
                        int i51 = ~i3;
                        int i52 = (~iOLrzqt) | i51;
                        int i53 = ((i50 + ((~((i52 & i44) | (i52 ^ i44))) * 130)) - (~((~((i51 & i44) | (i51 ^ i44))) * (-260)))) - 1;
                        int i54 = ~i44;
                        int i55 = ~((i54 & i3) | (i54 ^ i3));
                        int i56 = ~i3;
                        int i57 = (i44 & i56) | (i56 ^ i44);
                        int i58 = i53 + (((~((i57 & iOLrzqt) | (i57 ^ iOLrzqt))) | i55) * 130);
                        int i59 = i58 << 13;
                        int i60 = (i59 | i58) & (~(i58 & i59));
                        int i61 = i60 >>> 17;
                        int i62 = ((~i60) & i61) | ((~i61) & i60);
                        int i63 = i62 << 5;
                        ((int[]) objArr[2])[0] = ((~i62) & i63) | ((~i63) & i62);
                    } else {
                        int i64 = AhwBna;
                        int i65 = ((i64 | 39) << 1) - (i64 ^ 39);
                        AYXKKw = i65 % 128;
                        int i66 = i65 % 2;
                        cTQ.OLrzqt();
                        int i67 = ~i;
                        java.lang.Object[] objArr9 = {new int[]{i ^ 1}, null, new int[1], new int[]{i}};
                        int i68 = AYXKKw + 85;
                        AhwBna = i68 % 128;
                        int i69 = i68 % 2;
                        int iElapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                        int i70 = (~(738763796 | iElapsedRealtime)) | 312607146;
                        int i71 = ~((~iElapsedRealtime) | (-201368593));
                        int i72 = 1007709109 + ((i70 | i71) * (-470)) + (((~(iElapsedRealtime | 1051370942)) | i71) * 470);
                        int iOLrzqt2 = cTQ.OLrzqt();
                        int i73 = AYXKKw;
                        int i74 = (i73 & 73) + (i73 | 73);
                        AhwBna = i74 % 128;
                        int i75 = i74 % 2;
                        int i76 = i72 * 306;
                        int i77 = (5506 & i76) + (i76 | 5506);
                        int i78 = ~((16 ^ i72) | (16 & i72));
                        int i79 = ~((16 ^ iOLrzqt2) | (16 & iOLrzqt2));
                        int i80 = -(-(((i78 ^ i79) | (i78 & i79)) * 305));
                        int i81 = (i77 ^ i80) + ((i80 & i77) << 1);
                        int i82 = ~i72;
                        int i83 = ~((~iOLrzqt2) | 16);
                        int i84 = ((i83 & i82) | (i82 ^ i83)) * 305;
                        int i85 = (i81 & i84) + (i84 | i81);
                        int i86 = (i85 * (-519)) + (i3 * 521);
                        int i87 = ~i85;
                        int i88 = ~i3;
                        int i89 = (i88 & i87) | (i87 ^ i88);
                        int i90 = ~((i89 & i67) | (i89 ^ i67));
                        int i91 = ~((i3 ^ i) | (i3 & i));
                        int i92 = ((i90 ^ i91) | (i90 & i91)) * 520;
                        int i93 = (i86 ^ i92) + ((i86 & i92) << 1);
                        int i94 = ~i3;
                        int i95 = ~((i94 ^ i67) | (i94 & i67));
                        int i96 = ~((i85 ^ i) | (i85 & i));
                        int i97 = ((i95 ^ i96) | (i96 & i95)) * (-1040);
                        int i98 = ~((i67 & i87) | (i87 ^ i67));
                        int i99 = ~((i94 & i85) | (i94 ^ i85));
                        int i100 = (i98 & i99) | (i98 ^ i99);
                        int i101 = ~(i85 | i);
                        int i102 = (i93 ^ i97) + ((i97 & i93) << 1) + (((i100 & i101) | (i100 ^ i101)) * 520);
                        int i103 = i102 << 13;
                        int i104 = (i103 | i102) & (~(i102 & i103));
                        int i105 = i104 >>> 17;
                        int i106 = ((~i104) & i105) | ((~i105) & i104);
                        ((int[]) objArr9[2])[0] = i106 ^ (i106 << 5);
                        objArr = objArr9;
                    }
                    if (((int[]) objArr[0])[0] != i) {
                        int i107 = ~i;
                        int i108 = ((~((i107 ^ (-1185814505)) | (i107 & (-1185814505)))) | 67895488) * (-712);
                        int i109 = (((-1456146084) | i108) << 1) - (i108 ^ (-1456146084));
                        int i110 = ~i;
                        int i111 = (i110 & (-622608598)) | ((-622608598) ^ i110);
                        int i112 = i109 + (((~((i & (-1117919017)) | ((-1117919017) ^ i))) | (~((i111 & (-1185814505)) | (i111 ^ (-1185814505))))) * (-712));
                        int i113 = ~(i107 | (-1185814505));
                        int i114 = -(-(((i113 & (-622608598)) | ((-622608598) ^ i113)) * 712));
                        int i115 = (i112 & i114) + (i114 | i112);
                        int iOLrzqt3 = cTQ.OLrzqt();
                        int i116 = ~iOLrzqt3;
                        int i117 = ~((-1379209839) | i116);
                        int i118 = ((i117 & (-1945504448)) | ((-1945504448) ^ i117)) * (-602);
                        int i119 = ((-703566972) ^ i118) + ((i118 & (-703566972)) << 1);
                        int i120 = ~((iOLrzqt3 & (-1379209839)) | ((-1379209839) ^ iOLrzqt3));
                        int i121 = (i120 & 69696) | (69696 ^ i120);
                        int i122 = (1379209838 & i116) | (i116 ^ 1379209838);
                        int i123 = ~((i122 & (-1945504448)) | (i122 ^ (-1945504448)));
                        int i124 = -(-(((i121 & i123) | (i121 ^ i123)) * LuaValue.ERR_CLOSE_FILE_ERROR));
                        int i125 = ((i119 | i124) << 1) - (i124 ^ i119);
                        int i126 = (~((i116 ^ (-1945504448)) | (i116 & (-1945504448)))) * 301;
                        if (i115 > ((i125 | i126) << 1) - (i126 ^ i125)) {
                            return objArr;
                        }
                        int i127 = 43 / 0;
                        return objArr;
                    }
                    try {
                        java.lang.Object objEZpvd3 = YY.EZpvd(-1136502747);
                        if (objEZpvd3 == null) {
                            byte[] bArr = $$a;
                            byte b = (byte) (bArr[19] + 1);
                            byte b2 = bArr[15];
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            a(b, b2, (byte) (b2 + 4), objArr10);
                            objEZpvd3 = YY.EZpvd(408, 5, (char) 16203, -1201498791, false, (java.lang.String) objArr10[0], new java.lang.Class[0]);
                        }
                        java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) objEZpvd3).invoke(null, null);
                        java.lang.Object objEZpvd4 = YY.EZpvd(1940380538);
                        if (objEZpvd4 == null) {
                            byte[] bArr2 = $$a;
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            a((byte) (bArr2[8] - 1), (byte) (-bArr2[20]), bArr2[14], objArr11);
                            objEZpvd4 = YY.EZpvd(408, 5, (char) 16203, 2005341702, false, (java.lang.String) objArr11[0], null);
                        }
                        if (!set.contains(((java.lang.reflect.Field) objEZpvd4).get(null))) {
                            int i128 = AhwBna + 99;
                            AYXKKw = i128 % 128;
                            int i129 = i128 % 2;
                            java.lang.Object objEZpvd5 = YY.EZpvd(-2030026904);
                            if (objEZpvd5 == null) {
                                byte[] bArr3 = $$a;
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                a(bArr3[12], (byte) 0, bArr3[26], objArr12);
                                objEZpvd5 = YY.EZpvd(408, 5, (char) 16203, -2094992876, false, (java.lang.String) objArr12[0], null);
                            }
                            if (set.contains(((java.lang.reflect.Field) objEZpvd5).get(null))) {
                            }
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i130 = AhwBna + 61;
                            int i131 = i130 % 128;
                            AYXKKw = i131;
                            if (i130 % 2 == 0) {
                                java.lang.Object[] objArr13 = new java.lang.Object[5];
                                objArr13[0] = new int[0];
                                c = 5;
                                objArr2 = objArr13;
                            } else {
                                objArr2 = new java.lang.Object[4];
                                objArr2[0] = new int[1];
                                c = 2;
                            }
                            objArr2[c] = new int[1];
                            objArr2[3] = new int[]{i};
                            int i132 = ((i131 | 63) << 1) - (i131 ^ 63);
                            AhwBna = i132 % 128;
                            int i133 = i132 % 2;
                            int i134 = (i131 ^ 23) + ((i131 & 23) << 1);
                            AhwBna = i134 % 128;
                            int i135 = i134 % 2;
                            ((int[]) objArr2[0])[0] = i;
                            objArr2[1] = null;
                            int iFreeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                            int i136 = ~iFreeMemory;
                            int i137 = i3 - (~((((-1786995606) + (((~((-621254087) | i136)) | (-510015533)) * 519)) + (((~(i136 | (-67506181))) | (~((-442509353) | iFreeMemory))) * (-519))) + (((~(iFreeMemory | (-510015533))) | 621254086) * 519)));
                            int i138 = i137 - 1;
                            int i139 = AhwBna;
                            int i140 = (i139 ^ 7) + ((i139 & 7) << 1);
                            int i141 = i140 % 128;
                            AYXKKw = i141;
                            if (i140 % 2 == 0) {
                                int i142 = i137 - 14;
                                int i143 = (i142 & (~i138)) | ((~i142) & i138);
                                int i144 = (i143 | i143) & (~(i143 & i143));
                                int i145 = ((i144 | 5) << 1) - (i144 ^ 5);
                                i4 = ((~i144) & i145) | ((~i145) & i144);
                                c2 = 3;
                            } else {
                                int i146 = i138 << 13;
                                int i147 = (i146 | i138) & (~(i138 & i146));
                                int i148 = i147 >>> 17;
                                int i149 = ((~i147) & i148) | ((~i148) & i147);
                                int i150 = i149 << 5;
                                i4 = (i149 | i150) & (~(i149 & i150));
                                c2 = 2;
                            }
                            int i151 = i141 + 7;
                            AhwBna = i151 % 128;
                            int i152 = i151 % 2;
                            ((int[]) objArr2[c2])[0] = i4;
                            return objArr2;
                        }
                        if ((i2 & 32) == 0) {
                            int i153 = AYXKKw;
                            int i154 = (i153 & 47) + (i153 | 47);
                            AhwBna = i154 % 128;
                            try {
                            } catch (java.lang.Exception unused) {
                                i7 = 1;
                                zEquals = 0;
                            }
                            if (i154 % 2 != 0) {
                                try {
                                    if (Build.VERSION.SDK_INT > 100) {
                                        int i155 = AYXKKw + 51;
                                        AhwBna = i155 % 128;
                                        int i156 = i155 % 2;
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        b(145718912, (byte) 0, (short) 0, -1092815541, -70, objArr14);
                                        try {
                                            java.lang.Object[] objArr15 = {(java.lang.String) objArr14[0]};
                                            objEZpvd2 = YY.EZpvd(1229107605);
                                            if (objEZpvd2 == null) {
                                                byte b3 = (byte) 0;
                                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                                a(b3, $$a[10], b3, objArr16);
                                                objEZpvd2 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1298300137, false, (java.lang.String) objArr16[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            long jLongValue = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr15)).longValue();
                                            long j = 1027864121;
                                            long j2 = -1;
                                            long j3 = jLongValue ^ j2;
                                            long startUptimeMillis = (int) android.os.Process.getStartUptimeMillis();
                                            long j4 = startUptimeMillis ^ j2;
                                            long j5 = (((long) 50) * j) + (((long) (-97)) * jLongValue) + (((long) 98) * (((j3 | j4) ^ j2) | ((j3 | j) ^ j2))) + (((long) (-49)) * (j3 | (((j ^ j2) | j4) ^ j2) | ((j | startUptimeMillis) ^ j2))) + (((long) 49) * (((j3 | startUptimeMillis) ^ j2) | (j2 ^ (jLongValue | j)))) + ((long) 999970165);
                                            int i157 = ~i;
                                            int i158 = ((int) (j5 >> 32)) & (919004714 + (((~((-541108678) | i157)) | (-896117734) | (~(627681733 | i))) * (-68)) + ((~((-268436001) | i157)) * (-68)) + (((~((-627681734) | i157)) | (-809544678)) * 68));
                                            i8 = AYXKKw + 37;
                                            AhwBna = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                int i159 = (int) j5;
                                                int startElapsedRealtime = (int) android.os.Process.getStartElapsedRealtime();
                                                int i160 = i159 & ((((-262684951) + (((~(85981128 | startElapsedRealtime)) | 1351245281) * (-948))) + ((~((~startElapsedRealtime) | 1436549097)) * (-948))) - 438181352);
                                                if (((i158 & i160) | (i158 ^ i160)) == 0) {
                                                    i7 = 1;
                                                    zEquals = 1;
                                                }
                                                i7 = 1;
                                                zEquals = 0;
                                            } else {
                                                int i161 = ((int) j5) & (((~((-539230529) | i)) * 521) + 258367720 + (((~(i157 | (-539230529))) | 92279813) * 521));
                                                if (((i158 & i161) | (i158 ^ i161)) == 1) {
                                                    i7 = 1;
                                                    zEquals = 1;
                                                } else {
                                                    i7 = 1;
                                                    zEquals = 0;
                                                }
                                            }
                                            if ((!zEquals) != i7) {
                                                int i162 = (~(i & 10)) & (i | 10);
                                                java.lang.Object[] objArr17 = new java.lang.Object[4];
                                                int[] iArr = new int[i7];
                                                objArr17[0] = iArr;
                                                int[] iArr2 = new int[i7];
                                                objArr17[2] = iArr2;
                                                int[] iArr3 = new int[i7];
                                                objArr17[3] = iArr3;
                                                iArr3[0] = i;
                                                iArr[0] = i162;
                                                objArr17[i7] = null;
                                                int i163 = ~i;
                                                int i164 = (-1279999491) + (((~(212145748 | i163)) | (-323384303) | (~((-212145749) | i))) * (-564)) + ((~((-266821) | i)) * 1128) + (((~((-323384303) | i163)) | 211878928) * 564);
                                                int i165 = (i164 ^ 16) + ((16 & i164) << 1);
                                                int i166 = i165 * 1773;
                                                int i167 = i3 * (-885);
                                                int i168 = (i166 & i167) + (i166 | i167);
                                                int i169 = ~i165;
                                                int i170 = ~i3;
                                                int i171 = ~((i169 & i170) | (i169 ^ i170));
                                                int i172 = ~((i & i170) | (i170 ^ i));
                                                int i173 = (i172 & i171) | (i171 ^ i172);
                                                int i174 = ~((i163 ^ i165) | (i163 & i165) | i3);
                                                int i175 = ((i173 & i174) | (i173 ^ i174)) * 886;
                                                int i176 = (i168 & i175) + (i175 | i168);
                                                int i177 = ((~((i163 ^ i3) | (i3 & i163))) | i165) * (-1772);
                                                int i178 = (((i176 | i177) << 1) - (i177 ^ i176)) + ((~(i163 | i165)) * 886);
                                                int i179 = i178 << 13;
                                                int i180 = (i179 & (~i178)) | ((~i179) & i178);
                                                int i181 = i180 >>> 17;
                                                int i182 = (i180 | i181) & (~(i180 & i181));
                                                iArr2[0] = i182 ^ (i182 << 5);
                                                return objArr17;
                                            }
                                            c3 = 0;
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                    java.lang.Object[] objArr18 = {(java.lang.String) objArr[0]};
                                    objEZpvd = YY.EZpvd(1845277648);
                                    if (objEZpvd == null) {
                                        byte b4 = $$a[4];
                                        byte b5 = (byte) (b4 - 1);
                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                        a(b5, (byte) (b5 << 2), b4, objArr19);
                                        objEZpvd = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr19[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    java.lang.Object objInvoke2 = ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr18);
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    b(145718953, (byte) 0, (short) 0, -1092815539, -70, objArr20);
                                    zEquals = objInvoke2.equals((java.lang.String) objArr20[0]);
                                    i7 = 1;
                                    if ((!zEquals) != i7) {
                                    }
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                b(145718940, (byte) 0, (short) 0, -1092815474, -70, objArr21);
                            } else {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i1552 = AYXKKw + 51;
                                    AhwBna = i1552 % 128;
                                    int i1562 = i1552 % 2;
                                    java.lang.Object[] objArr142 = new java.lang.Object[1];
                                    b(145718912, (byte) 0, (short) 0, -1092815541, -70, objArr142);
                                    java.lang.Object[] objArr152 = {(java.lang.String) objArr142[0]};
                                    objEZpvd2 = YY.EZpvd(1229107605);
                                    if (objEZpvd2 == null) {
                                    }
                                    long jLongValue2 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr152)).longValue();
                                    long j6 = 1027864121;
                                    long j22 = -1;
                                    long j32 = jLongValue2 ^ j22;
                                    long startUptimeMillis2 = (int) android.os.Process.getStartUptimeMillis();
                                    long j42 = startUptimeMillis2 ^ j22;
                                    long j52 = (((long) 50) * j6) + (((long) (-97)) * jLongValue2) + (((long) 98) * (((j32 | j42) ^ j22) | ((j32 | j6) ^ j22))) + (((long) (-49)) * (j32 | (((j6 ^ j22) | j42) ^ j22) | ((j6 | startUptimeMillis2) ^ j22))) + (((long) 49) * (((j32 | startUptimeMillis2) ^ j22) | (j22 ^ (jLongValue2 | j6)))) + ((long) 999970165);
                                    int i1572 = ~i;
                                    int i1582 = ((int) (j52 >> 32)) & (919004714 + (((~((-541108678) | i1572)) | (-896117734) | (~(627681733 | i))) * (-68)) + ((~((-268436001) | i1572)) * (-68)) + (((~((-627681734) | i1572)) | (-809544678)) * 68));
                                    i8 = AYXKKw + 37;
                                    AhwBna = i8 % 128;
                                    if (i8 % 2 == 0) {
                                    }
                                } else {
                                    java.lang.Object[] objArr212 = new java.lang.Object[1];
                                    b(145718940, (byte) 0, (short) 0, -1092815474, -70, objArr212);
                                    java.lang.Object[] objArr182 = {(java.lang.String) objArr212[0]};
                                    objEZpvd = YY.EZpvd(1845277648);
                                    if (objEZpvd == null) {
                                    }
                                    java.lang.Object objInvoke22 = ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr182);
                                    java.lang.Object[] objArr202 = new java.lang.Object[1];
                                    b(145718953, (byte) 0, (short) 0, -1092815539, -70, objArr202);
                                    zEquals = objInvoke22.equals((java.lang.String) objArr202[0]);
                                    i7 = 1;
                                }
                                if ((!zEquals) != i7) {
                                }
                            }
                        } else {
                            c3 = 0;
                        }
                        java.lang.Object[] objArr22 = new java.lang.Object[4];
                        objArr22[c3] = new int[]{i};
                        objArr22[2] = new int[1];
                        objArr22[3] = new int[]{i};
                        int i183 = AYXKKw;
                        int i184 = (i183 ^ 49) + ((i183 & 49) << 1);
                        AhwBna = i184 % 128;
                        int i185 = i184 % 2;
                        objArr22[1] = null;
                        int iNextInt = new java.util.Random().nextInt(118432395);
                        int i186 = (-320740540) + (((~(iNextInt | 360994134)) | 174236328) * 305) + (((~((~iNextInt) | 360994134)) | 249755580) * 305);
                        int i187 = AhwBna;
                        int i188 = (i187 ^ 121) + ((i187 & 121) << 1);
                        AYXKKw = i188 % 128;
                        int i189 = i188 % 2;
                        int i190 = (-1) - (~(-(-(i186 * (-751)))));
                        int i191 = ~i186;
                        int i192 = ~(((-1) ^ i191) | i191);
                        int i193 = i187 + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                        int i194 = i193 % 128;
                        AYXKKw = i194;
                        if (i193 % 2 == 0) {
                            int i195 = ~(((-1) ^ i) | i);
                            int i196 = -((i195 & i192) | (i192 ^ i195));
                            int i197 = i190 * (((i196 | 1504) << 1) - (i196 ^ 1504));
                            i6 = -1;
                            i5 = i197 >> ((-1504) / (~(i | (((-1) ^ i186) | i186))));
                        } else {
                            int i198 = ~(((-1) ^ i) | i);
                            int i199 = -(-(((i198 & i192) | (i192 ^ i198)) * 1504));
                            int i200 = (i190 ^ i199) + ((i199 & i190) << 1);
                            int i201 = ((-1) ^ i186) | i186;
                            i5 = (i200 - (~(-(-((~((i & i201) | (i201 ^ i))) * (-1504)))))) - 1;
                            i6 = -1;
                        }
                        int i202 = ~((i6 ^ i186) | i186);
                        int i203 = ~(~i186);
                        int i204 = -(-((i5 - (~(-(-(752 * ((i202 & i203) | (i202 ^ i203))))))) - 1));
                        int i205 = ((i3 | i204) << 1) - (i204 ^ i3);
                        int i206 = (i205 << 13) ^ i205;
                        int i207 = (i194 & 33) + (i194 | 33);
                        AhwBna = i207 % 128;
                        if (i207 % 2 != 0) {
                            int i208 = i206 ^ (i206 - 52);
                            int i209 = (i208 ^ (-2)) + ((i208 & (-2)) << 1);
                            ((int[]) objArr22[4])[1] = ((~i208) & i209) | ((~i209) & i208);
                            return objArr22;
                        }
                        int i210 = i206 >>> 17;
                        int i211 = ((~i206) & i210) | ((~i210) & i206);
                        int i212 = i211 << 5;
                        ((int[]) objArr22[2])[0] = ((~i211) & i212) | ((~i212) & i211);
                        return objArr22;
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }
        }

        public static final void EZpvd(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd.getViewLifecycleOwner().getLifecycle().addObserver(this.AEQbTJ);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd.getViewLifecycleOwner().getLifecycle().removeObserver(this.AEQbTJ);
            InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            if (this.EZpvd.getViewLifecycleOwner().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                C20540gin.copydefault((C20540gin) this.EZpvd).QkdxfA();
            }
        }
    }

    public final void QbewEr() {
        C57516yjr c57516yjr = this.AuCTelauCTel;
        if (c57516yjr != null) {
            c57516yjr.addOnAttachStateChangeListener(new TaskDescription(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.bCW] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.bCW] */
    public final void copydefault(AbstractC8426bCW<?> abstractC8426bCW, C8486bDd c8486bDd) {
        java.lang.String str;
        AbstractC9832bcy abstractC9832bcyValues = values();
        if (ejfBZ().dHguZz().fARcdN()) {
            if ((abstractC9832bcyValues instanceof C9868bdh) && Intrinsics.EZpvd(((C9868bdh) abstractC9832bcyValues).KWHzl(), java.lang.Boolean.TRUE)) {
                DTwDnp();
            } else {
                EZpvd(abstractC8426bCW, c8486bDd);
            }
        } else if (abstractC9832bcyValues instanceof C9868bdh) {
            DTwDnp();
        } else {
            EZpvd(ejfBZ().QKudOq(), c8486bDd);
            if (c8486bDd.getFeeChangeType() == 3) {
                KWHzl(RJOkX());
            }
        }
        if (ejfBZ() instanceof C12266cjh) {
            T tEjfBZ = ejfBZ();
            Intrinsics.copydefault(tEjfBZ, "");
            C12266cjh c12266cjh = (C12266cjh) tEjfBZ;
            java.lang.String strULRxlR = c12266cjh.ULRxlR();
            if (QfsBiF()) {
                str = "--";
            } else {
                str = AbstractC8426bCW.formatToFeeCoinAmount$default(c12266cjh.QKudOq(), strULRxlR, false, false, false, 14, null) + " " + AbstractC8426bCW.formatToFeeCurrencyAmount$default(c12266cjh.QKudOq(), strULRxlR, false, false, false, 14, null);
            }
            C57518yjt c57518yjt = (C57518yjt) isConnected().AEQbTJ("total_cost");
            if (c57518yjt != null) {
                c57518yjt.setInfoValue(str);
            }
        }
    }

    public final java.util.List<android.view.View> RJOkX() {
        android.widget.TextView[] textViewArr = new android.widget.TextView[2];
        C57516yjr c57516yjr = this.AuCTelauCTel;
        textViewArr[0] = c57516yjr != null ? c57516yjr.EZpvd() : null;
        C57518yjt c57518yjt = (C57518yjt) isConnected().AEQbTJ("total_cost");
        textViewArr[1] = c57518yjt != null ? c57518yjt.AEQbTJ() : null;
        return yDY.valueOf(textViewArr);
    }

    @Override // o.AbstractC20481ghh
    public void DTwDnp() {
        C57516yjr c57516yjr = this.AuCTelauCTel;
        if (c57516yjr != null) {
            c57516yjr.setData(new C57516yjr.StateListAnimator(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getDrawerArrowDrawable), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onCreateActionMode), null, false, false, null, null, null));
        }
    }

    private final java.lang.String KWHzl(C8486bDd c8486bDd) {
        return c8486bDd instanceof C9215bRQ ? ((C9215bRQ) c8486bDd).copydefault() : c8486bDd.getFeeAmount();
    }

    private final boolean QfsBiF() {
        AbstractC9832bcy abstractC9832bcyValues = values();
        return (abstractC9832bcyValues instanceof C9784bcC) || (abstractC9832bcyValues instanceof C9808bca) || (abstractC9832bcyValues instanceof C9754bbZ) || (abstractC9832bcyValues instanceof C9811bcd);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void EZpvd(AbstractC8426bCW<?> abstractC8426bCW, C8486bDd c8486bDd) {
        java.lang.String str;
        kotlin.Pair pairOLrzqt;
        java.lang.String str2;
        java.lang.String strAYXKKw;
        final T tEjfBZ = ejfBZ();
        boolean z = true;
        Function0 function0 = null;
        if ((c8486bDd instanceof C11989ceV) && QfsBiF()) {
            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onCreateActionMode), "");
        } else {
            C9165bQT c9165bQT = c8486bDd instanceof C9165bQT ? (C9165bQT) c8486bDd : null;
            if (c9165bQT == null || !c9165bQT.AEQbTJ()) {
                C9413bVC c9413bVC = tEjfBZ instanceof C9413bVC ? (C9413bVC) tEjfBZ : null;
                if (c9413bVC == null || !c9413bVC.gasjUx()) {
                    C8972bMm c8972bMm = tEjfBZ instanceof C8972bMm ? (C8972bMm) tEjfBZ : null;
                    if (c8972bMm != null && c8972bMm.aKErDB()) {
                        pairOLrzqt = C56390yDp.OLrzqt("", C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplListMenuDecorView));
                    } else if (tEjfBZ instanceof OKWX402SignTransfer) {
                        pairOLrzqt = C56390yDp.OLrzqt("", C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplActionMenuPresenterCallback));
                    } else if ((tEjfBZ instanceof AbstractC8727bIF) && ((AbstractC8744bIW) ((AbstractC8727bIF) tEjfBZ).QKudOq()).fJNWhG()) {
                        pairOLrzqt = C56390yDp.OLrzqt("", C33070mpX.AYXKKw(C13754dXa.FragmentManager.generateConfigDelta_densityDpi));
                    } else {
                        java.lang.String strKWHzl = KWHzl(c8486bDd);
                        pTF ptf = pTF.KWHzl;
                        java.lang.String toFeeCoinAmount$default = AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8426bCW, strKWHzl, false, false, true, 6, null);
                        java.lang.String toFeeCurrencyAmount$default = AbstractC8426bCW.formatToFeeCurrencyAmount$default(abstractC8426bCW, strKWHzl, false, false, false, 14, null);
                        if (toFeeCurrencyAmount$default.length() > 0) {
                            str = " " + toFeeCurrencyAmount$default;
                        } else {
                            str = "";
                        }
                        pairOLrzqt = C56390yDp.OLrzqt(ptf.EZpvd(toFeeCoinAmount$default + ((java.lang.Object) str)), "");
                    }
                }
            }
        }
        java.lang.String str3 = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str4 = (java.lang.String) pairOLrzqt.component2();
        C57516yjr c57516yjr = this.AuCTelauCTel;
        if (c57516yjr != null) {
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getDrawerArrowDrawable);
            boolean z2 = tEjfBZ instanceof C9615bYt;
            C9615bYt c9615bYt = z2 ? (C9615bYt) tEjfBZ : null;
            java.lang.Integer numValueOf = c9615bYt != null ? java.lang.Integer.valueOf(c9615bYt.isConnected()) : null;
            if (numValueOf != null && numValueOf.intValue() == 1) {
                strAYXKKw = C33070mpX.AYXKKw(C57406yhn.ActionBar.AYXKKw);
            } else {
                if (numValueOf == null || numValueOf.intValue() != 2) {
                    str2 = null;
                    if ((abstractC8426bCW.copydefault().isVariable() || (values() instanceof C9868bdh)) && (!z2 || ((C9615bYt) tEjfBZ).dUDNAs().sSMYrx())) {
                    }
                    boolean z3 = z;
                    if ((!abstractC8426bCW.copydefault().isVariable() || z2) && str4.length() == 0) {
                    }
                    c57516yjr.setData(new C57516yjr.StateListAnimator(strAYXKKw2, str3, str2, false, z3, str4, null, function0));
                }
                strAYXKKw = C33070mpX.AYXKKw(C57406yhn.ActionBar.AhwBna);
            }
            str2 = strAYXKKw;
            z = abstractC8426bCW.copydefault().isVariable() ? false : false;
            boolean z32 = z;
            function0 = !abstractC8426bCW.copydefault().isVariable() ? new Function0() { // from class: o.gim
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20540gin.AEQbTJ(tEjfBZ, this);
                }
            } : new Function0() { // from class: o.gim
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20540gin.AEQbTJ(tEjfBZ, this);
                }
            };
            c57516yjr.setData(new C57516yjr.StateListAnimator(strAYXKKw2, str3, str2, false, z32, str4, null, function0));
        }
    }

    public static final Unit AEQbTJ(AbstractC8564bFB abstractC8564bFB, C20540gin c20540gin) {
        if (!(abstractC8564bFB instanceof AbstractC8564bFB)) {
            abstractC8564bFB = null;
        }
        AbstractC8564bFB abstractC8564bFB2 = abstractC8564bFB;
        if (abstractC8564bFB2 != null) {
            C8396bBt c8396bBt = C8396bBt.AEQbTJ;
            androidx.fragment.app.FragmentManager childFragmentManager = c20540gin.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C8396bBt.openTransactionFeePage$default(c8396bBt, childFragmentManager, abstractC8564bFB2, null, 4, null);
        }
        c20540gin.wlaJM();
        return Unit.INSTANCE;
    }
}
