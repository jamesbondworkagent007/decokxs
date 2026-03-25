package o;

import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.common.base.Ascii;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.yua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58082yua {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yua.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC58082yua(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC58082yua() {
    }

    /* JADX INFO: renamed from: o.yua$TaskDescription */
    public static final class TaskDescription extends AbstractC58082yua {
        public final java.lang.String copydefault;
        private static final byte[] $$c = {50, 0, -102, 44};
        private static final int $$d = 127;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {88, 37, -69, 48, -13, -23, Ascii.EM, -12, 36, -35, -25, -19, Ascii.SYN, -8, -25, -13};
        private static final int $$b = 190;
        private static int OLrzqt = 0;
        private static int djBIcL = 1;
        private static long KWHzl = -3126969822219145187L;
        private static char[] EZpvd = {11793, 11783, 11792, 11837, 11801, 11802, 11805, 11892, 11796, 11824, 11797, 11856, 11787, 11788, 11784, 11794, 11870, 11789, 11790, 11821, 11834, 11782, 11795, 11809, 11844, 11799, 11798, 11857, 11804, 11807, 11822, 11786, 11818, 11803, 11832, 11806};
        private static char AEQbTJ = 7138;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$e(short s, int i, int i2) {
            int i3;
            byte[] bArr = $$c;
            int i4 = 4 - (s * 2);
            int i5 = i + 65;
            int i6 = i2 * 2;
            byte[] bArr2 = new byte[1 - i6];
            int i7 = 0 - i6;
            if (bArr == null) {
                int i8 = i7;
                int i9 = 0;
                i5 += i8;
                i4++;
                i3 = i9;
                bArr2[i3] = (byte) i5;
                i9 = i3 + 1;
                if (i3 == i7) {
                    return new java.lang.String(bArr2, 0);
                }
                i8 = bArr[i4];
                i5 += i8;
                i4++;
                i3 = i9;
                bArr2[i3] = (byte) i5;
                i9 = i3 + 1;
                if (i3 == i7) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i5;
                i9 = i3 + 1;
                if (i3 == i7) {
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(byte b, int i, int i2, java.lang.Object[] objArr) {
            int i3;
            int i4 = b + 65;
            int i5 = i2 + 4;
            byte[] bArr = $$a;
            int i6 = i + 3;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i7 = i6;
                i4 = i5;
                i3 = 0;
                i5++;
                i4 = i4 + i7 + 16;
                bArr2[i3] = (byte) i4;
                i3++;
                if (i3 == i6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i7 = bArr[i5];
                i5++;
                i4 = i4 + i7 + 16;
                bArr2[i3] = (byte) i4;
                i3++;
                if (i3 == i6) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i4;
                i3++;
                if (i3 == i6) {
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            int i2 = 2 % 2;
            int i3 = OLrzqt;
            int i4 = i3 + 73;
            djBIcL = i4 % 128;
            int i5 = i & 1;
            if (i4 % 2 != 0 ? i5 != 0 : i5 != 0) {
                int i6 = i3 + 61;
                djBIcL = i6 % 128;
                if (i6 % 2 == 0) {
                    java.lang.String str2 = taskDescription.copydefault;
                    java.lang.Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str = taskDescription.copydefault;
            }
            return taskDescription.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.lang.String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            TaskDescription taskDescription = new TaskDescription(str);
            int i2 = OLrzqt + 69;
            djBIcL = i2 % 128;
            int i3 = i2 % 2;
            return taskDescription;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            int i = 2 % 2;
            int i2 = OLrzqt + 123;
            int i3 = i2 % 128;
            djBIcL = i3;
            int i4 = i2 % 2;
            java.lang.String str = this.copydefault;
            int i5 = i3 + 93;
            OLrzqt = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 8 / 0;
            }
            return str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.AbstractC58082yua.TaskDescription) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 63;
            o.AbstractC58082yua.TaskDescription.djBIcL = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r5.copydefault, (java.lang.Object) ((o.AbstractC58082yua.TaskDescription) r6).copydefault) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            r6 = o.AbstractC58082yua.TaskDescription.OLrzqt + 49;
            o.AbstractC58082yua.TaskDescription.djBIcL = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if ((r6 % 2) != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(java.lang.Object obj) {
            int i = 2 % 2;
            int i2 = djBIcL + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            int i3 = i2 % 128;
            OLrzqt = i3;
            if (i2 % 2 != 0) {
                int i4 = 92 / 0;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int i = 2 % 2;
            int i2 = OLrzqt + 33;
            djBIcL = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.copydefault.hashCode();
            int i4 = OLrzqt + 23;
            djBIcL = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 10 / 0;
            }
            return iHashCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            int i = 2 % 2;
            java.lang.String str = "Text(value=" + this.copydefault + ')';
            int i2 = djBIcL + 85;
            OLrzqt = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [77=4] */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        private static void a(char[] cArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
            int i2 = 2 % 2;
            Zi zi = new Zi();
            zi.OLrzqt = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            zi.AEQbTJ = 0;
            int i3 = $11 + 81;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (zi.AEQbTJ < cArr.length) {
                int i5 = zi.AEQbTJ;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[zi.AEQbTJ]), zi, zi};
                    java.lang.Object objEZpvd = YY.EZpvd(-295504478);
                    if (objEZpvd == null) {
                        byte b = $$c[1];
                        byte b2 = b;
                        objEZpvd = YY.EZpvd(217, 4, (char) 0, -364758818, false, $$e(b2, (byte) (b2 | 35), b), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                    }
                    jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).longValue() ^ (KWHzl ^ 5439468278228498061L);
                    java.lang.Object[] objArr3 = {zi, zi};
                    java.lang.Object objEZpvd2 = YY.EZpvd(1444313200);
                    if (objEZpvd2 == null) {
                        byte b3 = $$c[1];
                        byte b4 = b3;
                        objEZpvd2 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e(b4, (byte) (b4 | 33), b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
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
            char[] cArr2 = new char[length];
            zi.AEQbTJ = 0;
            while (zi.AEQbTJ < cArr.length) {
                int i6 = $10 + 35;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr2[zi.AEQbTJ] = (char) jArr[zi.AEQbTJ];
                    java.lang.Object[] objArr4 = {zi, zi};
                    java.lang.Object objEZpvd3 = YY.EZpvd(1444313200);
                    if (objEZpvd3 == null) {
                        byte b5 = $$c[1];
                        byte b6 = b5;
                        objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e(b6, (byte) (b6 | 33), b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                    throw null;
                }
                cArr2[zi.AEQbTJ] = (char) jArr[zi.AEQbTJ];
                try {
                    java.lang.Object[] objArr5 = {zi, zi};
                    java.lang.Object objEZpvd4 = YY.EZpvd(1444313200);
                    if (objEZpvd4 == null) {
                        byte b7 = $$c[1];
                        byte b8 = b7;
                        objEZpvd4 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e(b8, (byte) (b8 | 33), b7), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new java.lang.String(cArr2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [273=6] */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        private static void b(char[] cArr, byte b, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
            int i2;
            java.lang.Object obj;
            int i3 = 2 % 2;
            Zg zg = new Zg();
            char[] cArr2 = EZpvd;
            int i4 = 555755035;
            java.lang.Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i5])};
                        java.lang.Object objEZpvd = YY.EZpvd(i4);
                        if (objEZpvd == null) {
                            byte b2 = $$c[1];
                            byte b3 = b2;
                            objEZpvd = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b3, (byte) (b3 | 55), b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                        i5++;
                        i4 = 555755035;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AEQbTJ)};
            java.lang.Object objEZpvd2 = YY.EZpvd(555755035);
            if (objEZpvd2 == null) {
                byte b4 = $$c[1];
                byte b5 = b4;
                objEZpvd2 = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b5, (byte) (b5 | 55), b4), new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            char cCharValue = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i6 = $10 + 33;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                zg.KWHzl = 0;
                int i8 = $11 + 49;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                while (zg.KWHzl < i2) {
                    int i10 = $11 + 109;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    zg.AEQbTJ = cArr[zg.KWHzl];
                    zg.OLrzqt = cArr[zg.KWHzl + 1];
                    if (zg.AEQbTJ == zg.OLrzqt) {
                        cArr4[zg.KWHzl] = (char) (zg.AEQbTJ - b);
                        cArr4[zg.KWHzl + 1] = (char) (zg.OLrzqt - b);
                        obj = obj2;
                    } else {
                        java.lang.Object[] objArr4 = {zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg};
                        java.lang.Object objEZpvd3 = YY.EZpvd(-526958001);
                        if (objEZpvd3 == null) {
                            byte b6 = $$c[1];
                            byte b7 = b6;
                            objEZpvd3 = YY.EZpvd(491, 5, (char) 30951, -457732301, false, $$e(b7, (byte) (b7 + 3), b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                        }
                        if (((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue() == zg.djBIcL) {
                            int i12 = $11 + 71;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            java.lang.Object[] objArr5 = {zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, java.lang.Integer.valueOf(cCharValue), zg};
                            java.lang.Object objEZpvd4 = YY.EZpvd(1348337226);
                            if (objEZpvd4 == null) {
                                byte b8 = $$c[1];
                                byte b9 = b8;
                                objEZpvd4 = YY.EZpvd(221, 5, (char) 3937, 1417491254, false, $$e(b8, b9, b9), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                            }
                            obj = null;
                            int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).intValue();
                            int i14 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                            cArr4[zg.KWHzl] = cArr2[iIntValue];
                            cArr4[zg.KWHzl + 1] = cArr2[i14];
                        } else {
                            obj = null;
                            if (zg.copydefault == zg.EZpvd) {
                                zg.AYXKKw = ((zg.AYXKKw + cCharValue) - 1) % cCharValue;
                                zg.djBIcL = ((zg.djBIcL + cCharValue) - 1) % cCharValue;
                                int i15 = (zg.copydefault * cCharValue) + zg.AYXKKw;
                                int i16 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                cArr4[zg.KWHzl] = cArr2[i15];
                                cArr4[zg.KWHzl + 1] = cArr2[i16];
                            } else {
                                int i17 = (zg.copydefault * cCharValue) + zg.djBIcL;
                                int i18 = (zg.EZpvd * cCharValue) + zg.AYXKKw;
                                cArr4[zg.KWHzl] = cArr2[i17];
                                cArr4[zg.KWHzl + 1] = cArr2[i18];
                            }
                        }
                    }
                    zg.KWHzl += 2;
                    obj2 = obj;
                }
            }
            for (int i19 = 0; i19 < i; i19++) {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
            }
            objArr[0] = new java.lang.String(cArr4);
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:383:0x12b8 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:386:0x11c9 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:388:0x1239 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:446:0x0d44 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:454:0x12c3 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:464:0x094c */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:250:0x1260 A[Catch: Exception -> 0x1298, all -> 0x12b4, IOException -> 0x12b8, TryCatch #5 {IOException -> 0x12b8, blocks: (B:265:0x1298, B:266:0x12b3, B:233:0x1235, B:234:0x1238, B:237:0x123f, B:239:0x1249, B:240:0x124a, B:248:0x1256, B:250:0x1260, B:251:0x1261, B:253:0x1263, B:255:0x1273, B:256:0x1274, B:258:0x1276, B:260:0x1286, B:261:0x1287), top: B:396:0x0d9b }] */
        /* JADX WARN: Removed duplicated region for block: B:251:0x1261 A[Catch: Exception -> 0x1298, all -> 0x12b4, IOException -> 0x12b8, TryCatch #5 {IOException -> 0x12b8, blocks: (B:265:0x1298, B:266:0x12b3, B:233:0x1235, B:234:0x1238, B:237:0x123f, B:239:0x1249, B:240:0x124a, B:248:0x1256, B:250:0x1260, B:251:0x1261, B:253:0x1263, B:255:0x1273, B:256:0x1274, B:258:0x1276, B:260:0x1286, B:261:0x1287), top: B:396:0x0d9b }] */
        /* JADX WARN: Removed duplicated region for block: B:317:0x181b A[PHI: r1 r3 r4 r9 r10
  0x181b: PHI (r1v274 int) = (r1v35 int), (r1v35 int), (r1v299 int) binds: [B:292:0x1515, B:294:0x154f, B:447:0x181b] A[DONT_GENERATE, DONT_INLINE]
  0x181b: PHI (r3v186 int) = (r3v45 int), (r3v45 int), (r3v225 int) binds: [B:292:0x1515, B:294:0x154f, B:447:0x181b] A[DONT_GENERATE, DONT_INLINE]
  0x181b: PHI (r4v220 int) = (r4v12 int), (r4v12 int), (r4v245 int) binds: [B:292:0x1515, B:294:0x154f, B:447:0x181b] A[DONT_GENERATE, DONT_INLINE]
  0x181b: PHI (r9v58 int) = (r9v11 int), (r9v11 int), (r9v59 int) binds: [B:292:0x1515, B:294:0x154f, B:447:0x181b] A[DONT_GENERATE, DONT_INLINE]
  0x181b: PHI (r10v68 int) = (r10v23 int), (r10v23 int), (r10v69 int) binds: [B:292:0x1515, B:294:0x154f, B:447:0x181b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0b66  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0d73  */
        /* JADX WARN: Type inference failed for: r11v50 */
        /* JADX WARN: Type inference failed for: r11v51 */
        /* JADX WARN: Type inference failed for: r11v52 */
        /* JADX WARN: Type inference failed for: r11v53 */
        /* JADX WARN: Type inference failed for: r11v54 */
        /* JADX WARN: Type inference failed for: r11v57 */
        /* JADX WARN: Type inference failed for: r11v58 */
        /* JADX WARN: Type inference failed for: r11v59 */
        /* JADX WARN: Type inference failed for: r11v60 */
        /* JADX WARN: Type inference failed for: r11v61 */
        /* JADX WARN: Type inference failed for: r11v67 */
        /* JADX WARN: Type inference failed for: r11v68 */
        /* JADX WARN: Type inference failed for: r11v69 */
        /* JADX WARN: Type inference failed for: r11v70 */
        /* JADX WARN: Type inference failed for: r11v74 */
        /* JADX WARN: Type inference failed for: r11v75 */
        /* JADX WARN: Type inference failed for: r11v77 */
        /* JADX WARN: Type inference failed for: r11v78 */
        /* JADX WARN: Type inference failed for: r11v79 */
        /* JADX WARN: Type inference failed for: r11v80 */
        /* JADX WARN: Type inference failed for: r11v83 */
        /* JADX WARN: Type inference failed for: r11v85 */
        /* JADX WARN: Type inference failed for: r11v86 */
        /* JADX WARN: Type inference failed for: r11v87 */
        /* JADX WARN: Type inference failed for: r11v88 */
        /* JADX WARN: Type inference failed for: r11v90 */
        /* JADX WARN: Type inference failed for: r11v95, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v96 */
        /* JADX WARN: Type inference failed for: r1v413 */
        /* JADX WARN: Type inference failed for: r1v415 */
        /* JADX WARN: Type inference failed for: r1v835 */
        /* JADX WARN: Type inference failed for: r28v16 */
        /* JADX WARN: Type inference failed for: r28v17 */
        /* JADX WARN: Type inference failed for: r28v18 */
        /* JADX WARN: Type inference failed for: r28v19 */
        /* JADX WARN: Type inference failed for: r28v20 */
        /* JADX WARN: Type inference failed for: r28v21 */
        /* JADX WARN: Type inference failed for: r28v22 */
        /* JADX WARN: Type inference failed for: r28v23 */
        /* JADX WARN: Type inference failed for: r28v24 */
        /* JADX WARN: Type inference failed for: r28v25 */
        /* JADX WARN: Type inference failed for: r28v26 */
        /* JADX WARN: Type inference failed for: r28v35 */
        /* JADX WARN: Type inference failed for: r28v36 */
        /* JADX WARN: Type inference failed for: r2v324 */
        /* JADX WARN: Type inference failed for: r2v327 */
        /* JADX WARN: Type inference failed for: r2v561 */
        /* JADX WARN: Type inference failed for: r30v13 */
        /* JADX WARN: Type inference failed for: r30v14 */
        /* JADX WARN: Type inference failed for: r30v15 */
        /* JADX WARN: Type inference failed for: r30v16 */
        /* JADX WARN: Type inference failed for: r30v17 */
        /* JADX WARN: Type inference failed for: r30v18 */
        /* JADX WARN: Type inference failed for: r30v23 */
        /* JADX WARN: Type inference failed for: r30v37 */
        /* JADX WARN: Type inference failed for: r30v38 */
        /* JADX WARN: Type inference failed for: r31v10 */
        /* JADX WARN: Type inference failed for: r31v11 */
        /* JADX WARN: Type inference failed for: r31v12 */
        /* JADX WARN: Type inference failed for: r31v13 */
        /* JADX WARN: Type inference failed for: r31v14 */
        /* JADX WARN: Type inference failed for: r31v15 */
        /* JADX WARN: Type inference failed for: r31v16 */
        /* JADX WARN: Type inference failed for: r31v17 */
        /* JADX WARN: Type inference failed for: r31v18 */
        /* JADX WARN: Type inference failed for: r31v19 */
        /* JADX WARN: Type inference failed for: r31v20 */
        /* JADX WARN: Type inference failed for: r31v32 */
        /* JADX WARN: Type inference failed for: r31v33 */
        /* JADX WARN: Type inference failed for: r5v168, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r5v169, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v104 */
        /* JADX WARN: Type inference failed for: r7v105 */
        /* JADX WARN: Type inference failed for: r7v106 */
        /* JADX WARN: Type inference failed for: r7v107 */
        /* JADX WARN: Type inference failed for: r7v108 */
        /* JADX WARN: Type inference failed for: r7v109 */
        /* JADX WARN: Type inference failed for: r7v110 */
        /* JADX WARN: Type inference failed for: r7v111 */
        /* JADX WARN: Type inference failed for: r7v112 */
        /* JADX WARN: Type inference failed for: r7v113 */
        /* JADX WARN: Type inference failed for: r7v114 */
        /* JADX WARN: Type inference failed for: r7v115 */
        /* JADX WARN: Type inference failed for: r7v116 */
        /* JADX WARN: Type inference failed for: r7v117 */
        /* JADX WARN: Type inference failed for: r7v119 */
        /* JADX WARN: Type inference failed for: r7v120 */
        /* JADX WARN: Type inference failed for: r7v142 */
        /* JADX WARN: Type inference failed for: r7v144 */
        /* JADX WARN: Type inference failed for: r7v145 */
        /* JADX WARN: Type inference failed for: r7v179 */
        /* JADX WARN: Type inference failed for: r7v309 */
        /* JADX WARN: Type inference failed for: r7v310 */
        /* JADX WARN: Type inference failed for: r7v311 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6, types: [int] */
        /* JADX WARN: Type inference failed for: r9v75, types: [java.lang.String] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] AEQbTJ(android.content.Context context, int i, int i2, int i3) throws java.lang.Throwable {
            ?? r7;
            int i4;
            int i5;
            char c;
            java.lang.Object[] objArr;
            int i6;
            ?? r72;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            java.lang.Object[] objArr2;
            char c2;
            char c3;
            int i12;
            char c4;
            char c5;
            java.lang.Object obj;
            java.util.Iterator it;
            java.lang.String str;
            int i13;
            int i14;
            java.lang.String str2;
            java.lang.Object[] objArr3;
            int i15;
            int length;
            int length2;
            int i16;
            ?? r11;
            java.lang.String str3;
            java.lang.Process processExec;
            java.lang.Object objNewInstance;
            java.lang.Throwable cause;
            java.lang.Class<?> cls;
            java.lang.InterruptedException interruptedException;
            java.lang.Throwable th;
            java.lang.Object obj2;
            java.lang.Object[] objArr4;
            java.lang.Class<?> cls2;
            ?? r31;
            ?? r312;
            java.lang.Object[] objArr5;
            char c6;
            char c7;
            char c8;
            int i17 = i3;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(new char[]{18161, 28851, 10862, 58373, 40907, 18808, 826, 15013, 62619, 44618, 23036, 5035, 52585, 34583, 48850, 26685, 8752, 56800, 38868, 16742, 30948, 12977, 60514, 42514, 20939, 2932, 50486, 64742, 46739, 24647, 7135, 54701, 36694, 47378}, 13901, objArr6);
            java.lang.String str4 = (java.lang.String) objArr6[0];
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            b(new char[]{11, '#', '#', 25, 19, 26, 13819}, (byte) 19, 7, objArr7);
            java.lang.String str5 = (java.lang.String) objArr7[0];
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            b(new char[]{11, 26, 17, 26, '\t', 17, 26, 5, 5, '\n', 2, ' ', 15, 31, '#', 11}, Ascii.SI, 16, objArr8);
            java.lang.String str6 = (java.lang.String) objArr8[0];
            java.lang.String str7 = null;
            str7 = null;
            try {
                if (context == null) {
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(new char[]{18111, 23294, 32503, 4846, 14023, 51913, 61161, 33532, 42641, 47791, 24236, 29340}, 7177, objArr9);
                    java.lang.Object[] objArr10 = {(java.lang.String) objArr9[0]};
                    java.lang.Object objEZpvd = YY.EZpvd(-924280847);
                    if (objEZpvd == null) {
                        byte b = (byte) 0;
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        c((byte) ($$a[3] + 1), b, b, objArr11);
                        objEZpvd = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, -859284851, false, (java.lang.String) objArr11[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    long jLongValue = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr10)).longValue();
                    long j = 795033410;
                    long j2 = (((long) CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA) * j) + (((long) (-139)) * jLongValue);
                    long j3 = -1;
                    long j4 = j ^ j3;
                    long j5 = i;
                    long j6 = (j4 | j5) ^ j3;
                    long j7 = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
                    long j8 = jLongValue ^ j3;
                    long j9 = j5 ^ j3;
                    long j10 = j2 + (((long) (-280)) * (((j4 | jLongValue) ^ j3) | j6)) + ((j6 | ((j8 | j5) ^ j3)) * j7) + (j7 * ((((j4 | j8) | j5) ^ j3) | (((j4 | j9) | jLongValue) ^ j3) | (((j8 | j9) | j) ^ j3))) + ((long) (-1106201504));
                    int i18 = ~i;
                    int i19 = (-1773431966) + (((~(1394341050 | i18)) | 8650816) * (-1188));
                    int i20 = 8650816 | (~((-1394341051) | i));
                    int i21 = ~(42885360 | i18);
                    int i22 = ((int) (j10 >> 32)) & (i19 + ((i20 | i21) * 594) + (((~((-1394341051) | i18)) | 1360106506 | i21) * 594));
                    int i23 = ((int) j10) & (1153123995 + ((1605098102 | i18) * 1444) + (((~((-2059089938) | i)) | 1521162256 | (~(621863527 | i))) * (-1444)) + 760339554);
                    if (((i22 & i23) | (i22 ^ i23)) != 0) {
                        objArr5 = new java.lang.Object[]{new int[]{i}, new int[]{(~(i & 50)) & (i | 50)}, null, new int[]{i}, null};
                        int i24 = i17 + (-341810520) + ((535760784 | i18) * (-757)) + ((~((-536870919) | i)) * 1514) + (((~((-656934919) | i18)) | 120064000 | (~(1072631702 | i))) * 757) + 16;
                        int i25 = i24 << 13;
                        int i26 = (i24 | i25) & (~(i24 & i25));
                        int i27 = i26 >>> 17;
                        int i28 = (i26 | i27) & (~(i26 & i27));
                        int i29 = i28 << 5;
                        int i30 = ((~i28) & i29) | ((~i29) & i28);
                        c6 = 0;
                    } else {
                        objArr5 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[]{i}, null};
                        int i31 = (((((~((-190553041) | i18)) | 4227088) | (~(1002142662 | i18))) * (-397)) - 563990968) + ((820043798 | i) * 397);
                        int i32 = (i17 & i31) + (i31 | i17);
                        int i33 = i32 << 13;
                        int i34 = (i33 | i32) & (~(i32 & i33));
                        int i35 = i34 >>> 17;
                        int i36 = ((~i34) & i35) | ((~i35) & i34);
                        int i37 = i36 ^ (i36 << 5);
                        c6 = 0;
                    }
                    if (((int[]) objArr5[1])[c6] != i) {
                        return objArr5;
                    }
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    b(new char[]{29, 15, 5, '\r', ' ', '\"', 21, 28, '\f', 20, 24, 2, 3, ' ', 29, 23, 23, 24, '\t', 30}, (byte) 8, 20, objArr12);
                    java.lang.Object[] objArr13 = {(java.lang.String) objArr12[c6]};
                    java.lang.Object objEZpvd2 = YY.EZpvd(-924280847);
                    if (objEZpvd2 == null) {
                        byte b2 = (byte) 0;
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        c((byte) ($$a[3] + 1), b2, b2, objArr14);
                        objEZpvd2 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, -859284851, false, (java.lang.String) objArr14[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    long jLongValue2 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr13)).longValue();
                    long j11 = -73310657;
                    long j12 = -112;
                    long j13 = jLongValue2 ^ j3;
                    long startUptimeMillis = (int) android.os.Process.getStartUptimeMillis();
                    long j14 = j13 | (startUptimeMillis ^ j3);
                    long j15 = j11 ^ j3;
                    long j16 = (j12 * j11) + (j12 * jLongValue2) + (((long) 226) * (j11 | (j14 ^ j3))) + (((long) (-113)) * (((j15 | jLongValue2) ^ j3) | ((j15 | startUptimeMillis) ^ j3) | ((j14 | j11) ^ j3))) + (((long) WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) * ((j13 | startUptimeMillis) ^ j3)) + ((long) (-237857437));
                    int i38 = ((int) (j16 >> 32)) & ((-1244543050) + (((~(809793597 | i18)) | (~(2047947287 | i))) * 210) + (((~((-4474921) | i18)) | (~((-1242628611) | i))) * 210));
                    int iUptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                    int i39 = ((int) j16) & ((((~((-25535493) | iUptimeMillis)) | 1410335137) * 501) + 746094188 + ((~((~iUptimeMillis) | (-25535493))) * 501));
                    if (((i38 & i39) | (i38 ^ i39)) != 0) {
                        objArr2 = new java.lang.Object[]{new int[]{((~i) & i) | ((~i) & i)}, new int[]{i ^ 60}, null, new int[]{i}, null};
                        int i40 = 1564533332 + (((~((-694667994) | i)) | 498027709) * (-366)) + (((~((-541098561) | i)) | 344458276) * 366);
                        int i41 = 4543 - (~(-(-(i40 * (-282)))));
                        int i42 = ~(((-17) & i40) | ((-17) ^ i40));
                        int i43 = ~(((-17) & i) | ((-17) ^ i));
                        int i44 = ((i42 & i43) | (i42 ^ i43)) * (-283);
                        int i45 = ((i41 | i44) << 1) - (i41 ^ i44);
                        int i46 = ~i40;
                        int i47 = (~((i46 & 16) | (i46 ^ 16))) * 283;
                        int i48 = (i45 & i47) + (i47 | i45);
                        int i49 = ~i40;
                        int i50 = (~((i49 & (-17)) | ((-17) ^ i49) | i)) * 283;
                        int i51 = i17 + (((i48 | i50) << 1) - (i50 ^ i48));
                        int i52 = i51 ^ (i51 << 13);
                        int i53 = i52 ^ (i52 >>> 17);
                        int i54 = i53 << 5;
                        c7 = 0;
                    } else {
                        objArr2 = new java.lang.Object[]{new int[1], new int[]{i}, null, new int[]{i}, null};
                        int i55 = ~android.os.Process.myTid();
                        int i56 = (-563287802) + (((-75522817) | i55) * 494) + (((~(i55 | 827694158)) | (-613738247)) * 494);
                        int i57 = i56 * (-49);
                        int i58 = i * (-50);
                        int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                        int i60 = ~i56;
                        int i61 = ((-1) ^ i60) | i60;
                        int i62 = ~((i61 & i) | (i61 ^ i));
                        int i63 = ~i56;
                        int i64 = ~i;
                        int i65 = ~((i64 & i63) | (i63 ^ i64));
                        int i66 = -(-(((i62 & i65) | (i62 ^ i65)) * 50));
                        int i67 = (i59 & i66) + (i66 | i59);
                        int i68 = ~((i60 & i18) | (i60 ^ i18));
                        int i69 = ~i63;
                        int i70 = (i68 & i69) | (i68 ^ i69);
                        int i71 = ~i18;
                        int i72 = -(-(((i70 & i71) | (i70 ^ i71)) * 50));
                        int i73 = ((i67 | i72) << 1) - (i72 ^ i67);
                        int i74 = ((i17 | i73) << 1) - (i73 ^ i17);
                        int i75 = i74 ^ (i74 << 13);
                        int i76 = i75 >>> 17;
                        int i77 = (i75 | i76) & (~(i75 & i76));
                        int i78 = i77 << 5;
                        int i79 = ((~i77) & i78) | ((~i78) & i77);
                        c7 = 0;
                        ((int[]) objArr2[0])[0] = i79;
                    }
                    if (((int[]) objArr2[1])[c7] == i) {
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a(new char[]{18111, 23709, 29219, 2527, 12117, 49842, 55426, 65070, 38316, 43840, 20133, 25712, 31251, 4520, 14080, 51920, 57442, 34310, 40330, 45941, 22213, 27747, 1010, 6541, 16167, 53944, 59486, 36780, 42394, 47891, 24237, 29816, 3028, 8568, 50966, 55978}, 6761, objArr15);
                        java.lang.Object[] objArr16 = {(java.lang.String) objArr15[c7]};
                        java.lang.Object objEZpvd3 = YY.EZpvd(1704729038);
                        if (objEZpvd3 == null) {
                            byte b3 = (byte) 3;
                            byte b4 = (byte) (b3 - 3);
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            c(b3, b4, (byte) (b4 + 2), objArr17);
                            objEZpvd3 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr17[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long jLongValue3 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr16)).longValue();
                        long j17 = 1023166632;
                        long j18 = jLongValue3 ^ j3;
                        long j19 = (j9 | jLongValue3) ^ j3;
                        long j20 = (((long) (-515)) * j17) + (((long) 517) * jLongValue3) + (((long) (-516)) * (((j18 | j5) ^ j3) | ((j9 | j17) ^ j3) | j19));
                        long j21 = 516;
                        long j22 = j17 ^ j3;
                        long j23 = j20 + (((((j22 | j18) | j5) ^ j3) | (((j22 | j9) | jLongValue3) ^ j3)) * j21) + (j21 * (((jLongValue3 | j22) ^ j3) | j19)) + ((long) (-1188763359));
                        int startElapsedRealtime = (int) android.os.Process.getStartElapsedRealtime();
                        int i80 = ((int) (j23 >> 32)) & ((-1945230294) + (((~((-96507394) | (~startElapsedRealtime))) | (~(1340719017 | startElapsedRealtime))) * (-272)) + (((~((-1170314762) | startElapsedRealtime)) | 1073807368) * (-272)) + (((~(startElapsedRealtime | 1170314761)) | 266911649) * 272));
                        int iElapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                        int i81 = ((int) j23) & (((818885255 + (((~iElapsedRealtime) | 822454870) * 1324)) + (((~(iElapsedRealtime | 2030545918)) | (~(827194967 | iElapsedRealtime))) * (-1324))) - 264666362);
                        if (((i80 & i81) | (i80 ^ i81)) != 0) {
                            objArr2 = new java.lang.Object[]{new int[]{i ^ (i << 5)}, new int[]{i ^ 80}, null, new int[]{i}, null};
                            int i82 = ((902258878 + (((~(653628918 | i18)) | 539066784) * (-828))) + ((653628918 | i18) * (-828))) - 38865636;
                            int i83 = 12128 + (i82 * (-756));
                            int i84 = (i18 | 16) * (-757);
                            int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                            int i86 = ~i82;
                            int i87 = (i86 & 16) | (i86 ^ 16);
                            int i88 = (~((i87 & i) | (i87 ^ i))) * 1514;
                            int i89 = (i85 & i88) + (i88 | i85);
                            int i90 = ~i82;
                            int i91 = ~(((-17) & i90) | ((-17) ^ i90));
                            int i92 = ~((i90 & i18) | (i90 ^ i18));
                            int i93 = (i92 & i91) | (i91 ^ i92);
                            int i94 = (i82 & 16) | (i82 ^ 16);
                            int i95 = ~((i94 & i) | (i94 ^ i));
                            int i96 = -(-(((i93 & i95) | (i93 ^ i95)) * 757));
                            int i97 = (i17 - (~(((i89 | i96) << 1) - (i96 ^ i89)))) - 1;
                            int i98 = i97 ^ (i97 << 13);
                            int i99 = i98 >>> 17;
                            int i100 = (i98 | i99) & (~(i98 & i99));
                            c8 = 0;
                        } else {
                            objArr2 = new java.lang.Object[]{new int[1], new int[]{i}, null, new int[]{i}, null};
                            int iNextInt = new java.util.Random().nextInt(456184375);
                            int i101 = ~iNextInt;
                            int i102 = ~(963650639 | i101);
                            int i103 = -(-(2139535702 + ((75944704 | i102) * (-712)) + (((~(iNextInt | 1039595343)) | (~(i101 | (-75944705)))) * (-712)) + (((-229045064) | i102) * 712)));
                            int i104 = ((i17 | i103) << 1) - (i103 ^ i17);
                            int i105 = i104 << 13;
                            int i106 = (i105 & (~i104)) | ((~i105) & i104);
                            int i107 = i106 ^ (i106 >>> 17);
                            int i108 = i107 << 5;
                            int i109 = ((~i107) & i108) | ((~i108) & i107);
                            c8 = 0;
                            ((int[]) objArr2[0])[0] = i109;
                        }
                        if (((int[]) objArr2[1])[c8] == i) {
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            b(new char[]{29, 3, 25, '#', 24, 28, 11, '#', '#', 25, 24, '\t', 4, 18, 6, 7, '\f', 3, 3, ' ', 17, '#', 3, 0, '\f', 1, 29, 1, 17, 11, 17, 24, 17, '\t', '\f', 23, 24, 11, 3, '!', 16, 20}, Ascii.SYN, 42, objArr18);
                            java.lang.Object[] objArr19 = {(java.lang.String) objArr18[c8]};
                            java.lang.Object objEZpvd4 = YY.EZpvd(1704729038);
                            if (objEZpvd4 == null) {
                                byte b5 = (byte) 3;
                                byte b6 = (byte) (b5 - 3);
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                c(b5, b6, (byte) (b6 + 2), objArr20);
                                objEZpvd4 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr20[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            long jLongValue4 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr19)).longValue();
                            long j24 = 177020192;
                            long j25 = 672;
                            long jFreeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                            long j26 = jFreeMemory ^ j3;
                            long j27 = (((long) 673) * j24) + (((long) (-1343)) * jLongValue4) + ((jLongValue4 | ((j24 | jFreeMemory) ^ j3)) * j25) + (((long) (-672)) * ((((j24 ^ j3) | j26) ^ j3) | ((jFreeMemory | jLongValue4) ^ j3)));
                            long j28 = jLongValue4 ^ j3;
                            long j29 = j27 + (j25 * (((j28 | j24) ^ j3) | ((j28 | j26) ^ j3))) + ((long) (-342616919));
                            int iElapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                            int i110 = ((int) (j29 >> 32)) & (1520786966 + (((~((~iElapsedRealtime2) | 1593282488)) | 17313797) * 529) + (((~(iElapsedRealtime2 | 1593282488)) | 156056077) * 529));
                            int i111 = ~((int) android.os.Process.getElapsedCpuTime());
                            int i112 = ((int) j29) & (394021085 + ((2142960571 | i111) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256) + (((~(i111 | 437279505)) | 1974135722) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256));
                            if (((i110 & i112) | (i110 ^ i112)) == 0) {
                                java.lang.Object[] objArr21 = {new int[]{(i | i) & (~(i & i))}, new int[]{i}, null, new int[]{i}, null};
                                int i113 = -(-(172751000 + (((~((-177061833) | i18)) | (~((-1015633871) | i18))) * (-867)) + (((~((-177061833) | i)) | 143202248 | (~((-1015633871) | i))) * (-1734)) + (((~((-143202249) | i18)) | (~((-33859585) | i)) | (~((-872431623) | i))) * 867)));
                                int i114 = (i3 ^ i113) + ((i113 & i3) << 1);
                                int i115 = i114 << 13;
                                int i116 = (i115 & (~i114)) | ((~i115) & i114);
                                int i117 = i116 >>> 17;
                                int i118 = (i116 | i117) & (~(i116 & i117));
                                int i119 = i118 << 5;
                                return objArr21;
                            }
                            java.lang.Object[] objArr22 = {new int[1], new int[]{i ^ 90}, null, new int[]{i}, null};
                            int i120 = 1915674488 + (((~((-321330073) | i)) | (~(i18 | (-565287)))) * 497) + (((~((-870800345) | i18)) | 549470272 | (~((-565287) | i))) * 497);
                            int iEZpvd = cNL.EZpvd();
                            int i121 = 5103 - (~(-(-(i120 * (-317)))));
                            int i122 = ~i120;
                            int i123 = -(-(((~(((-17) & iEZpvd) | ((-17) ^ iEZpvd))) | i122) * (-318)));
                            int i124 = (i121 & i123) + (i121 | i123);
                            int i125 = ~((i122 ^ iEZpvd) | (i122 & iEZpvd));
                            int i126 = ~iEZpvd;
                            int i127 = ~((i126 & 16) | (i126 ^ 16) | i120);
                            int i128 = ((i125 & i127) | (i125 ^ i127)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                            int i129 = ((i124 | i128) << 1) - (i128 ^ i124);
                            int i130 = ~i120;
                            int i131 = ~iEZpvd;
                            int i132 = (i130 & i131) | (i130 ^ i131);
                            int i133 = ~((i132 & 16) | (i132 ^ 16));
                            int i134 = (i120 & 16) | (i120 ^ 16);
                            int i135 = ~((iEZpvd & i134) | (i134 ^ iEZpvd));
                            int i136 = (i129 - (~(-(-(((i135 & i133) | (i133 ^ i135)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))) - 1;
                            int iEZpvd2 = cNL.EZpvd();
                            int i137 = i136 * (-559);
                            int i138 = i3 * 561;
                            int i139 = (i137 & i138) + (i137 | i138);
                            int i140 = ~iEZpvd2;
                            int i141 = (i139 - (~(-(-((~((i140 & i136) | (i140 ^ i136))) * (-560)))))) - 1;
                            int i142 = ~i3;
                            int i143 = (i142 & i136) | (i142 ^ i136);
                            int i144 = -(-((~((i143 & iEZpvd2) | (i143 ^ iEZpvd2))) * (-560)));
                            int i145 = (i141 ^ i144) + ((i144 & i141) << 1);
                            int i146 = ~((~i136) | i3);
                            int i147 = ~iEZpvd2;
                            int i148 = ~((i147 & i3) | (i147 ^ i3));
                            int i149 = -(-(((i148 & i146) | (i146 ^ i148)) * 560));
                            int i150 = ((i145 | i149) << 1) - (i149 ^ i145);
                            int i151 = i150 << 13;
                            int i152 = (i151 & (~i150)) | ((~i151) & i150);
                            int i153 = i152 >>> 17;
                            int i154 = (i152 | i153) & (~(i152 & i153));
                            int i155 = i154 << 5;
                            ((int[]) objArr22[0])[0] = (i154 | i155) & (~(i154 & i155));
                            return objArr22;
                        }
                    }
                } else {
                    int i156 = i;
                    try {
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        a(new char[]{18161, 49283, 18958, 54677, 24331, 59016, 24602, 60373, 29979, 64666, 1564, 33211, 2857, 37543, 7218, 42989, 8451, 43186, 12852, 48547, 50993, 20137, 51290}, 34429, objArr23);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        b(new char[]{3, '\"', ' ', 31, 24, 11, 11, 28, 3, '\"', 11, 27, 21, '\"'}, (byte) 119, 14, objArr24);
                        java.lang.String str8 = (java.lang.String) cls3.getMethod((java.lang.String) objArr24[0], null).invoke(context, null);
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        a(new char[]{18161, 49283, 18958, 54677, 24331, 59016, 24602, 60373, 29979, 64666, 1564, 33211, 2857, 37543, 7218, 42989, 8451, 43186, 12852, 48547, 50993, 20137, 51290}, 34429, objArr25);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        a(new char[]{18167, 53370, 27642, 34172, 7388, 46635, 49574, 23312, 62091, 3574, 42866, 16092, 18507, 58301, 32011, 38047, 11782, 47488}, 38543, objArr26);
                        java.lang.Object objInvoke = cls4.getMethod((java.lang.String) objArr26[0], null).invoke(context, null);
                        int iIndexOf = ((java.lang.String) java.lang.Class.forName(str4).getField(str5).get(objInvoke)).indexOf(str8);
                        if (iIndexOf > 0) {
                            java.lang.String str9 = (java.lang.String) java.lang.Class.forName(str4).getField(str5).get(objInvoke);
                            int length3 = str9.length() - 16;
                            if (length3 < 0) {
                                int i157 = i17;
                                int i158 = iIndexOf;
                                java.lang.String str10 = str4;
                                i4 = i156;
                                java.lang.String str11 = str6;
                                java.lang.Object obj3 = objInvoke;
                                java.lang.String str12 = (java.lang.String) java.lang.Class.forName(str10).getField(str5).get(obj3);
                                length = str12.length() - 6;
                                if (length >= 0) {
                                    int i159 = 0;
                                    java.lang.String str13 = str12;
                                    int i160 = length;
                                    str5 = str5;
                                    obj3 = obj3;
                                    str7 = str7;
                                    i14 = i14;
                                    str2 = str2;
                                    while (i159 <= i160) {
                                        java.lang.Object[] objArr27 = {str13.substring(i159, (i159 ^ 6) + ((i159 & 6) << 1)), 931995};
                                        java.lang.Object objEZpvd5 = YY.EZpvd(1485637403);
                                        if (objEZpvd5 == null) {
                                            byte b7 = (byte) 0;
                                            byte b8 = (byte) (b7 + 1);
                                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                                            c(b7, b8, (byte) (b8 + 3), objArr28);
                                            objEZpvd5 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr28[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                        }
                                        long jLongValue5 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr27)).longValue();
                                        long j30 = 908967670;
                                        java.lang.String str14 = str13;
                                        int i161 = i160;
                                        java.lang.String str15 = str5;
                                        java.lang.Object obj4 = obj3;
                                        long j31 = -1;
                                        long j32 = jLongValue5 ^ j31;
                                        int i162 = i159;
                                        long j33 = i4;
                                        long j34 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                        long j35 = j33 ^ j31;
                                        long j36 = (((long) 319) * j30) + (((long) (-317)) * jLongValue5) + (((long) (-318)) * (j32 | (((j30 ^ j31) | j33) ^ j31))) + ((((j32 | j33) ^ j31) | (((j35 | j30) | jLongValue5) ^ j31)) * j34) + (j34 * ((((j32 | j35) | j30) ^ j31) | ((j33 | (jLongValue5 | j30)) ^ j31))) + ((long) 418985860);
                                        int i163 = (-484646000) + (((~(784173042 | i4)) | (-2143135731)) * 345);
                                        int i164 = ~i4;
                                        int i165 = ((int) (j36 >> 32)) & (i163 + (((~(784173042 | i164)) | 69567888) * 345) + ((~(2143135730 | i4)) * 345));
                                        int i166 = ((int) j36) & (1168988347 + ((i164 | (-201503847)) * (-490)) + (((~(1672301080 | i4)) | (-1873804927)) * 490) + 777528202);
                                        if (((i165 & i166) | (i165 ^ i166)) == -2096167706) {
                                            int i167 = (~(i4 & 20)) & (i4 | 20);
                                            java.lang.String str16 = (java.lang.String) java.lang.Class.forName(str10).getField(str15).get(obj4);
                                            ((int[]) objArr[3])[0] = i4;
                                            ((int[]) objArr[1])[0] = i167;
                                            java.lang.Object[] objArr29 = {new int[1], new int[1], null, new int[1], str16};
                                            int iMyUid = android.os.Process.myUid();
                                            int i168 = 2029538928 + (((~((-1001103394) | iMyUid)) | 187375649) * 345) + (((~((-1001103394) | (~iMyUid))) | 4216660) * 345) + ((~(iMyUid | (-187375650))) * 345);
                                            int i169 = (i168 & 16) + (i168 | 16);
                                            int i170 = i169 * (-115);
                                            int i171 = -(-((i157 == true ? 1 : 0) * (-115)));
                                            int i172 = (i170 & i171) + (i170 | i171);
                                            int i173 = ~i4;
                                            int i174 = (i173 & i169) | (i173 ^ i169);
                                            int i175 = -(-((~((i174 & (i157 == true ? 1 : 0)) | (i174 ^ (i157 == true ? 1 : 0)))) * (-116)));
                                            int i176 = (i172 ^ i175) + ((i175 & i172) << 1);
                                            int i177 = -(-(((i169 ^ i4) | (i169 & i4)) * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID));
                                            int i178 = ((i176 | i177) << 1) - (i177 ^ i176);
                                            int i179 = ~i169;
                                            int i180 = ~(i157 == true ? 1 : 0);
                                            int i181 = ~((i179 & i180) | (i179 ^ i180));
                                            int i182 = ~((i180 & i4) | (i180 ^ i4));
                                            int i183 = (i178 - (~(((i181 & i182) | (i181 ^ i182)) * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID))) - 1;
                                            int i184 = i183 << 13;
                                            int i185 = (i184 | i183) & (~(i183 & i184));
                                            int i186 = i185 >>> 17;
                                            int i187 = (i185 | i186) & (~(i185 & i186));
                                            int i188 = i187 << 5;
                                            ((int[]) objArr29[0])[0] = ((~i187) & i188) | ((~i188) & i187);
                                            r72 = i157 == true ? 1 : 0;
                                            i6 = 1;
                                            objArr = objArr29;
                                            c = 0;
                                            break;
                                        }
                                        str5 = str15;
                                        obj3 = obj4;
                                        i159 = i162 + 1;
                                        str13 = str14;
                                        i160 = i161;
                                        str7 = str14;
                                        i14 = i161;
                                        str2 = str15;
                                    }
                                }
                                java.lang.String strSubstring = ((java.lang.String) java.lang.Class.forName(str10).getField(str5).get(obj3)).substring(0, i158);
                                i5 = 1;
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                b(new char[]{13841}, (byte) 92, 1, objArr30);
                                java.lang.String[] strArrSplit = strSubstring.split((java.lang.String) objArr30[0]);
                                length2 = strArrSplit.length;
                                i16 = 0;
                                ?? r1 = i157;
                                ?? r2 = strArrSplit;
                                ?? r73 = str5;
                                java.lang.Object obj5 = obj3;
                                java.lang.Object obj6 = str7;
                                ?? r28 = i14;
                                ?? r30 = str2;
                                loop3: while (i16 < length2) {
                                    ?? r9 = r2[i16];
                                    java.lang.Object[] objArr31 = new java.lang.Object[i5];
                                    a(new char[]{18123, 48367, 45679}, 64081, objArr31);
                                    if (r9.split((java.lang.String) objArr31[0]).length > i5) {
                                        synchronized (((java.lang.Class) YY.AEQbTJ(368, 5, 0))) {
                                            r11 = 16;
                                            try {
                                                try {
                                                    java.lang.Object[] objArr32 = new java.lang.Object[i5];
                                                    b(new char[]{19, 23, 17, 16, 29, '\r', '\"', '\r', 23, 24, 7, 11, 28, 5, '#', 15}, (byte) 4, 16, objArr32);
                                                    str3 = (java.lang.String) objArr32[0];
                                                    try {
                                                        try {
                                                            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                                                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                            a(new char[]{18147, 5837}, 20533, objArr33);
                                                            processExec = runtime.exec((java.lang.String) objArr33[0], (java.lang.String[]) null, (java.io.File) null);
                                                            try {
                                                                java.lang.Object[] objArr34 = {processExec.getInputStream()};
                                                                java.lang.Object objEZpvd6 = YY.EZpvd(-237227398);
                                                                if (objEZpvd6 == null) {
                                                                    objEZpvd6 = YY.EZpvd(353, 5, (char) 49035, -167969018, false, null, new java.lang.Class[]{java.io.InputStream.class});
                                                                }
                                                                objNewInstance = ((java.lang.reflect.Constructor) objEZpvd6).newInstance(objArr34);
                                                            } catch (java.lang.Throwable th2) {
                                                                java.lang.Throwable cause2 = th2.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th2;
                                                            }
                                                        } catch (java.lang.Exception unused) {
                                                        }
                                                    } catch (java.lang.Exception unused2) {
                                                    }
                                                } catch (java.io.IOException unused3) {
                                                    r28 = r2;
                                                    i158 = length2;
                                                    r30 = i16;
                                                }
                                            } catch (java.io.IOException unused4) {
                                            }
                                            try {
                                                java.lang.Object[] objArr35 = {processExec.getErrorStream()};
                                                java.lang.Object objEZpvd7 = YY.EZpvd(-237227398);
                                                if (objEZpvd7 == null) {
                                                    objEZpvd7 = YY.EZpvd(353, 5, (char) 49035, -167969018, false, null, new java.lang.Class[]{java.io.InputStream.class});
                                                }
                                                java.lang.Object objNewInstance2 = ((java.lang.reflect.Constructor) objEZpvd7).newInstance(objArr35);
                                                java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(processExec.getOutputStream());
                                                try {
                                                    cls = java.lang.Class.forName(str11);
                                                    r28 = r2;
                                                    i158 = length2;
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                }
                                                try {
                                                    r30 = i16;
                                                } catch (java.lang.Throwable th4) {
                                                    th = th4;
                                                    java.lang.Throwable th5 = th;
                                                    cause = th5.getCause();
                                                    if (cause == null) {
                                                    }
                                                }
                                                try {
                                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                    a(new char[]{18147, 27541, 7187, 52913, 62240}, 11633, objArr36);
                                                    cls.getMethod((java.lang.String) objArr36[0], null).invoke(objNewInstance, null);
                                                    try {
                                                        java.lang.Class<?> cls5 = java.lang.Class.forName(str11);
                                                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                        a(new char[]{18147, 27541, 7187, 52913, 62240}, 11633, objArr37);
                                                        cls5.getMethod((java.lang.String) objArr37[0], null).invoke(objNewInstance2, null);
                                                        try {
                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                            sb.append(str3);
                                                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                            a(new char[]{18074}, 53629, objArr38);
                                                            sb.append((java.lang.String) objArr38[0]);
                                                            java.lang.String string = sb.toString();
                                                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                            a(new char[]{18117, 53253, 27476, 33534, 7596}, 38593, objArr39);
                                                            dataOutputStream.write(string.getBytes((java.lang.String) objArr39[0]));
                                                            dataOutputStream.flush();
                                                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                            b(new char[]{3, 27, 31, 1, 13790}, (byte) 78, 5, objArr40);
                                                            java.lang.String str17 = (java.lang.String) objArr40[0];
                                                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                            a(new char[]{18117, 53253, 27476, 33534, 7596}, 38593, objArr41);
                                                            dataOutputStream.write(str17.getBytes((java.lang.String) objArr41[0]));
                                                            dataOutputStream.flush();
                                                            try {
                                                                long jNanoTime = java.lang.System.nanoTime();
                                                                ?? r112 = r73;
                                                                obj2 = obj5;
                                                                try {
                                                                    long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                    while (true) {
                                                                        try {
                                                                            processExec.exitValue();
                                                                            r312 = r112;
                                                                            break;
                                                                        } catch (java.lang.IllegalThreadStateException unused5) {
                                                                            if (nanos > 0) {
                                                                                try {
                                                                                    try {
                                                                                        objArr4 = new java.lang.Object[]{java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                        cls2 = java.lang.Class.forName(str11);
                                                                                        r31 = r112;
                                                                                    } catch (java.lang.Throwable th6) {
                                                                                        th = th6;
                                                                                    }
                                                                                    try {
                                                                                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                                                        b(new char[]{'\f', 16, 13823, 13823, 13802}, (byte) 0, 5, objArr42);
                                                                                        cls2.getMethod((java.lang.String) objArr42[0], java.lang.Long.TYPE).invoke(null, objArr4);
                                                                                    } catch (java.lang.Throwable th7) {
                                                                                        th = th7;
                                                                                        java.lang.Throwable th8 = th;
                                                                                        java.lang.Throwable cause3 = th8.getCause();
                                                                                        if (cause3 != null) {
                                                                                            throw cause3;
                                                                                        }
                                                                                        throw th8;
                                                                                    }
                                                                                } catch (java.lang.InterruptedException e) {
                                                                                    interruptedException = e;
                                                                                    try {
                                                                                        throw interruptedException;
                                                                                    } catch (java.lang.Throwable th9) {
                                                                                        th = th9;
                                                                                        th = th;
                                                                                        try {
                                                                                            processExec.destroy();
                                                                                            throw th;
                                                                                        } catch (java.lang.Exception unused6) {
                                                                                            throw th;
                                                                                        }
                                                                                    }
                                                                                } catch (java.lang.Throwable th10) {
                                                                                    th = th10;
                                                                                    processExec.destroy();
                                                                                    throw th;
                                                                                }
                                                                            } else {
                                                                                r31 = r112;
                                                                            }
                                                                            try {
                                                                                long nanos2 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - jNanoTime);
                                                                                r312 = r31;
                                                                                if (nanos2 > 0) {
                                                                                    nanos = nanos2;
                                                                                    r112 = r31;
                                                                                }
                                                                            } catch (java.lang.InterruptedException e2) {
                                                                                e = e2;
                                                                                interruptedException = e;
                                                                                throw interruptedException;
                                                                            } catch (java.lang.Throwable th11) {
                                                                                th = th11;
                                                                                th = th;
                                                                                processExec.destroy();
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            dataOutputStream.close();
                                                                        } catch (java.lang.InterruptedException e3) {
                                                                            interruptedException = e3;
                                                                            throw interruptedException;
                                                                        } catch (java.lang.Throwable th12) {
                                                                            th = th12;
                                                                            processExec.destroy();
                                                                            throw th;
                                                                        }
                                                                    } catch (java.io.IOException unused7) {
                                                                    }
                                                                } catch (java.lang.InterruptedException e4) {
                                                                    e = e4;
                                                                } catch (java.lang.Throwable th13) {
                                                                    th = th13;
                                                                }
                                                            } catch (java.lang.InterruptedException e5) {
                                                                e = e5;
                                                            } catch (java.lang.Throwable th14) {
                                                                th = th14;
                                                            }
                                                        } catch (java.io.IOException unused8) {
                                                            r11 = r73;
                                                            obj6 = obj5;
                                                            r73 = r1;
                                                            int i189 = (r30 == true ? 1 : 0) + 81;
                                                            i5 = 1;
                                                            i16 = (i189 ^ (-80)) + ((i189 & (-80)) << 1);
                                                            r1 = r73;
                                                            r73 = r11;
                                                            obj5 = obj6;
                                                            r2 = r28;
                                                            length2 = i158;
                                                            obj6 = obj6;
                                                            r28 = r28;
                                                            r30 = r30;
                                                        } catch (java.lang.Exception unused9) {
                                                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                            b(new char[]{'#', 28, 27, '\r', '#', 3, '\r', '\"', 4, '\f', 7, '\f', '#', 27, ' ', '\"', 17, 28, '\f', 22, '\f', 1, '\t', 30, 13913, 13913, 13860}, (byte) 112, 27, objArr43);
                                                            throw new java.io.IOException((java.lang.String) objArr43[0]);
                                                        }
                                                        try {
                                                            try {
                                                                java.lang.Class<?> cls6 = java.lang.Class.forName(str11);
                                                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                                b(new char[]{6, 2, 26, 1}, (byte) 37, 4, objArr44);
                                                                cls6.getMethod((java.lang.String) objArr44[0], java.lang.Long.TYPE).invoke(objNewInstance, 100L);
                                                                try {
                                                                    java.lang.Class<?> cls7 = java.lang.Class.forName(str11);
                                                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                                    b(new char[]{6, 2, 26, 1}, (byte) 37, 4, objArr45);
                                                                    cls7.getMethod((java.lang.String) objArr45[0], java.lang.Long.TYPE).invoke(objNewInstance2, 10L);
                                                                    try {
                                                                        try {
                                                                            processExec.destroy();
                                                                        } catch (java.lang.Exception unused10) {
                                                                        }
                                                                        try {
                                                                            try {
                                                                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                                                java.lang.Object objEZpvd8 = YY.EZpvd(907718786);
                                                                                if (objEZpvd8 == null) {
                                                                                    try {
                                                                                        byte b9 = (byte) ($$b & 15);
                                                                                        byte b10 = (byte) (b9 >>> 2);
                                                                                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                                                                                        c(b9, b10, (byte) (b10 + 4), objArr46);
                                                                                        objEZpvd8 = YY.EZpvd(353, 5, (char) 49035, 842694142, false, (java.lang.String) objArr46[0], null);
                                                                                    } catch (java.lang.Exception unused11) {
                                                                                        java.lang.Object[] objArr432 = new java.lang.Object[1];
                                                                                        b(new char[]{'#', 28, 27, '\r', '#', 3, '\r', '\"', 4, '\f', 7, '\f', '#', 27, ' ', '\"', 17, 28, '\f', 22, '\f', 1, '\t', 30, 13913, 13913, 13860}, (byte) 112, 27, objArr432);
                                                                                        throw new java.io.IOException((java.lang.String) objArr432[0]);
                                                                                    }
                                                                                }
                                                                                sb2.append(((java.lang.reflect.Field) objEZpvd8).get(objNewInstance).toString());
                                                                                java.lang.Object objEZpvd9 = YY.EZpvd(907718786);
                                                                                if (objEZpvd9 == null) {
                                                                                    byte b11 = (byte) ($$b & 15);
                                                                                    byte b12 = (byte) (b11 >>> 2);
                                                                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                                                                    c(b11, b12, (byte) (b12 + 4), objArr47);
                                                                                    objEZpvd9 = YY.EZpvd(353, 5, (char) 49035, 842694142, false, (java.lang.String) objArr47[0], null);
                                                                                }
                                                                                sb2.append(((java.lang.reflect.Field) objEZpvd9).get(objNewInstance2).toString());
                                                                                java.lang.String string2 = sb2.toString();
                                                                                try {
                                                                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                                                                    a(new char[]{18074}, 53629, objArr48);
                                                                                    java.lang.String[] strArrSplit2 = string2.split((java.lang.String) objArr48[0]);
                                                                                    int length4 = strArrSplit2.length;
                                                                                    int i190 = 0;
                                                                                    r312 = r312;
                                                                                    obj2 = obj2;
                                                                                    while (i190 < length4) {
                                                                                        java.lang.String str18 = strArrSplit2[i190];
                                                                                        java.lang.Object[] objArr49 = new java.lang.Object[1];
                                                                                        b(new char[]{23, 24, 7, 11, 28, 5, 30, 27, '\f', 6, 23, '\n', 5, 1, 1, 5, 21, 3, 13802}, (byte) 54, 19, objArr49);
                                                                                        if (!str18.startsWith((java.lang.String) objArr49[0])) {
                                                                                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                                                                                            b(new char[]{23, 24, 7, 11, 28, 5, 30, 27, '\f', 6, 23, '\n', 26, 5, 1, 17, 1, 24, 11, 17}, (byte) 44, 20, objArr50);
                                                                                            if (str18.startsWith((java.lang.String) objArr50[0])) {
                                                                                                continue;
                                                                                            } else {
                                                                                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                                                                                b(new char[]{23, 24, 7, 11, 28, 5, 30, 27}, (byte) 120, 8, objArr51);
                                                                                                if (str18.startsWith((java.lang.String) objArr51[0])) {
                                                                                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                                                                                    b(new char[]{13799}, (byte) 71, 1, objArr52);
                                                                                                    ?? Split = str18.split((java.lang.String) objArr52[0]);
                                                                                                    if (Split.length <= 1 || !Split[1].equalsIgnoreCase(r9)) {
                                                                                                    }
                                                                                                } else {
                                                                                                    continue;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        i190 = ((i190 & 48) + (i190 | 48)) - 47;
                                                                                        r312 = r312;
                                                                                        obj2 = obj2;
                                                                                    }
                                                                                } catch (java.io.IOException unused12) {
                                                                                    r11 = r312;
                                                                                    obj6 = obj2;
                                                                                    r73 = i3;
                                                                                    int i1892 = (r30 == true ? 1 : 0) + 81;
                                                                                    i5 = 1;
                                                                                    i16 = (i1892 ^ (-80)) + ((i1892 & (-80)) << 1);
                                                                                    r1 = r73;
                                                                                    r73 = r11;
                                                                                    obj5 = obj6;
                                                                                    r2 = r28;
                                                                                    length2 = i158;
                                                                                    obj6 = obj6;
                                                                                    r28 = r28;
                                                                                    r30 = r30;
                                                                                }
                                                                            } catch (java.lang.Exception unused13) {
                                                                            }
                                                                        } catch (java.io.IOException unused14) {
                                                                        }
                                                                        r11 = r312;
                                                                        obj6 = obj2;
                                                                        r73 = i3;
                                                                    } catch (java.io.IOException unused15) {
                                                                        r73 = i3;
                                                                        r11 = r312;
                                                                        obj6 = obj2;
                                                                        int i18922 = (r30 == true ? 1 : 0) + 81;
                                                                        i5 = 1;
                                                                        i16 = (i18922 ^ (-80)) + ((i18922 & (-80)) << 1);
                                                                        r1 = r73;
                                                                        r73 = r11;
                                                                        obj5 = obj6;
                                                                        r2 = r28;
                                                                        length2 = i158;
                                                                        obj6 = obj6;
                                                                        r28 = r28;
                                                                        r30 = r30;
                                                                    }
                                                                } catch (java.lang.Throwable th15) {
                                                                    java.lang.Throwable cause4 = th15.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th15;
                                                                }
                                                            } catch (java.lang.Throwable th16) {
                                                                java.lang.Throwable cause5 = th16.getCause();
                                                                if (cause5 != null) {
                                                                    throw cause5;
                                                                }
                                                                throw th16;
                                                            }
                                                        } catch (java.lang.InterruptedException e6) {
                                                            interruptedException = e6;
                                                            throw interruptedException;
                                                        } catch (java.lang.Throwable th17) {
                                                            th = th17;
                                                            processExec.destroy();
                                                            throw th;
                                                        }
                                                    } catch (java.lang.Throwable th18) {
                                                        java.lang.Throwable cause6 = th18.getCause();
                                                        if (cause6 != null) {
                                                            throw cause6;
                                                        }
                                                        throw th18;
                                                    }
                                                } catch (java.lang.Throwable th19) {
                                                    th = th19;
                                                    java.lang.Throwable th52 = th;
                                                    cause = th52.getCause();
                                                    if (cause == null) {
                                                        throw cause;
                                                    }
                                                    throw th52;
                                                }
                                            } catch (java.lang.Throwable th20) {
                                                java.lang.Throwable cause7 = th20.getCause();
                                                if (cause7 != null) {
                                                    throw cause7;
                                                }
                                                throw th20;
                                            }
                                        }
                                        java.lang.String str19 = (java.lang.String) java.lang.Class.forName(str10).getField(r312).get(obj2);
                                        ((int[]) objArr3[3])[0] = i4;
                                        ((int[]) objArr3[1])[0] = i4 ^ 20;
                                        objArr3 = new java.lang.Object[]{new int[1], new int[1], null, new int[1], str19};
                                        int iElapsedRealtime3 = (int) android.os.SystemClock.elapsedRealtime();
                                        int i191 = (-1298204042) + (((~(798210019 | iElapsedRealtime3)) | 268453904) * (-140)) + ((~(1066663923 | iElapsedRealtime3)) * 70) + (((~(iElapsedRealtime3 | 394485683)) | 940632144) * 70);
                                        int i192 = -(-(((i191 | 16) << 1) - (i191 ^ 16)));
                                        int i193 = ((i3 | i192) << 1) - (i192 ^ i3);
                                        int i194 = i193 << 13;
                                        int i195 = (i194 & (~i193)) | ((~i194) & i193);
                                        int i196 = i195 >>> 17;
                                        int i197 = ((~i195) & i196) | ((~i196) & i195);
                                        int i198 = i197 << 5;
                                        int i199 = (i197 | i198) & (~(i197 & i198));
                                        c = 0;
                                        ((int[]) objArr3[0])[0] = i199;
                                        i15 = i3;
                                        i6 = 1;
                                        objArr = objArr3;
                                        r72 = i15;
                                        break loop3;
                                    }
                                    r28 = r2;
                                    i158 = length2;
                                    r30 = i16;
                                    r11 = r73;
                                    obj6 = obj5;
                                    r73 = r1;
                                    int i189222 = (r30 == true ? 1 : 0) + 81;
                                    i5 = 1;
                                    i16 = (i189222 ^ (-80)) + ((i189222 & (-80)) << 1);
                                    r1 = r73;
                                    r73 = r11;
                                    obj5 = obj6;
                                    r2 = r28;
                                    length2 = i158;
                                    obj6 = obj6;
                                    r28 = r28;
                                    r30 = r30;
                                }
                                r7 = r1;
                            } else {
                                int i200 = 0;
                                str5 = str5;
                                while (i200 <= length3) {
                                    java.lang.Object[] objArr53 = {str9.substring(i200, i200 + 16), 931995};
                                    java.lang.Object objEZpvd10 = YY.EZpvd(1485637403);
                                    if (objEZpvd10 == null) {
                                        byte b13 = (byte) 0;
                                        byte b14 = (byte) (b13 + 1);
                                        str = str9;
                                        i13 = length3;
                                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                                        c(b13, b14, (byte) (b14 + 3), objArr54);
                                        objEZpvd10 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr54[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                    } else {
                                        str = str9;
                                        i13 = length3;
                                    }
                                    long jLongValue6 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd10).invoke(null, objArr53)).longValue();
                                    long j37 = -94719445;
                                    i14 = i200;
                                    long j38 = 672;
                                    int i201 = iIndexOf;
                                    long j39 = i156;
                                    java.lang.Object obj7 = objInvoke;
                                    java.lang.String str20 = str4;
                                    java.lang.String str21 = str6;
                                    long j40 = -1;
                                    str2 = str5;
                                    long j41 = j39 ^ j40;
                                    long j42 = (((long) 673) * j37) + (((long) (-1343)) * jLongValue6) + ((jLongValue6 | ((j37 | j39) ^ j40)) * j38) + (((long) (-672)) * ((((j37 ^ j40) | j41) ^ j40) | ((j39 | jLongValue6) ^ j40)));
                                    long j43 = jLongValue6 ^ j40;
                                    long j44 = j42 + (j38 * (((j43 | j37) ^ j40) | ((j43 | j41) ^ j40))) + ((long) 1422672975);
                                    i4 = i;
                                    int i202 = ~i4;
                                    int i203 = ((int) (j44 >> 32)) & ((-1788177110) + ((346571778 | i202) * (-192)) + (((~(1056896675 | i202)) | (-2147415988)) * (-384)) + (((~(i202 | (-1090519313))) | (~(2147415987 | i4)) | (~((-710324898) | i4))) * 192));
                                    int iMyUid2 = android.os.Process.myUid();
                                    int i204 = 1457608403 + (((-2470090) | iMyUid2) * (-50));
                                    int i205 = ~(1436923113 | iMyUid2);
                                    int i206 = ~iMyUid2;
                                    int i207 = ((int) j44) & (i204 + ((i205 | (~((-2166794) | i206))) * 50) + (((~(i206 | (-2470090))) | (~(1434756320 | i206)) | 2166793) * 50));
                                    if (((i207 & i203) | (i203 ^ i207)) == -725904754) {
                                        java.lang.String str22 = (java.lang.String) java.lang.Class.forName(str20).getField(str2).get(obj7);
                                        ((int[]) objArr3[3])[0] = i4;
                                        ((int[]) objArr3[1])[0] = i4 ^ 20;
                                        objArr3 = new java.lang.Object[]{new int[1], new int[1], null, new int[1], str22};
                                        int i208 = (((76547072 | r1) * (-374)) - 473089872) + (((~((~i4) | 214967465)) | 138420393) * 374);
                                        int iEZpvd3 = cNL.EZpvd();
                                        int i209 = (-2928) + (i208 * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384);
                                        int i210 = -(-(((i208 ^ (-17)) | (i208 & (-17))) * (-368)));
                                        int i211 = ((i209 | i210) << 1) - (i210 ^ i209);
                                        int i212 = ~i208;
                                        int i213 = (i212 & 16) | (i212 ^ 16);
                                        int i214 = ~iEZpvd3;
                                        int i215 = -(-(((i213 & i214) | (i213 ^ i214)) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256));
                                        int i216 = ((i211 | i215) << 1) - (i215 ^ i211);
                                        int i217 = ~i208;
                                        int i218 = ~((i217 & (-17)) | ((-17) ^ i217));
                                        int i219 = ~((i214 & 16) | (i214 ^ 16));
                                        int i220 = ((i219 & i218) | (i218 ^ i219) | (~(i208 | 16))) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256;
                                        int i221 = (i216 & i220) + (i220 | i216);
                                        int i222 = (i3 & i221) + (i221 | i3);
                                        int i223 = (i222 << 13) ^ i222;
                                        int i224 = i223 ^ (i223 >>> 17);
                                        int i225 = i224 << 5;
                                        ((int[]) objArr3[0])[0] = ((~i224) & i225) | ((~i225) & i224);
                                        i15 = i3;
                                        c = 0;
                                        break;
                                    }
                                    str5 = str2;
                                    i200 = (i14 == true ? 1 : 0) + 1;
                                    i17 = i3;
                                    objInvoke = obj7;
                                    str6 = str21;
                                    str4 = str20;
                                    str9 = str;
                                    length3 = i13;
                                    str7 = null;
                                    i156 = i4;
                                    iIndexOf = i201;
                                }
                                int i1572 = i17;
                                int i1582 = iIndexOf;
                                java.lang.String str102 = str4;
                                i4 = i156;
                                java.lang.String str112 = str6;
                                java.lang.Object obj32 = objInvoke;
                                java.lang.String str122 = (java.lang.String) java.lang.Class.forName(str102).getField(str5).get(obj32);
                                length = str122.length() - 6;
                                if (length >= 0) {
                                }
                                java.lang.String strSubstring2 = ((java.lang.String) java.lang.Class.forName(str102).getField(str5).get(obj32)).substring(0, i1582);
                                i5 = 1;
                                java.lang.Object[] objArr302 = new java.lang.Object[1];
                                b(new char[]{13841}, (byte) 92, 1, objArr302);
                                java.lang.String[] strArrSplit3 = strSubstring2.split((java.lang.String) objArr302[0]);
                                length2 = strArrSplit3.length;
                                i16 = 0;
                                ?? r12 = i1572;
                                ?? r22 = strArrSplit3;
                                ?? r732 = str5;
                                java.lang.Object obj52 = obj32;
                                java.lang.Object obj62 = str7;
                                ?? r282 = i14;
                                ?? r302 = str2;
                                loop3: while (i16 < length2) {
                                }
                                r7 = r12;
                            }
                        } else {
                            r7 = i17;
                            i4 = i156;
                            i5 = 1;
                        }
                        java.lang.Object[] objArr55 = new java.lang.Object[5];
                        objArr55[0] = new int[i5];
                        int[] iArr = new int[i5];
                        objArr55[i5] = iArr;
                        int[] iArr2 = new int[i5];
                        objArr55[3] = iArr2;
                        iArr2[0] = i4;
                        iArr[0] = i4;
                        objArr55[2] = null;
                        objArr55[4] = null;
                        int i226 = (((-1700941106) + (((~((-816818927) | i4)) | (-375876777)) * (-948))) + ((~((-271001769) | (~i4))) * (-948))) - 2038591212;
                        int i227 = (i226 << 1) - i226;
                        int iEZpvd4 = cNL.EZpvd();
                        int i228 = (i227 * (-244)) + ((r7 == true ? 1 : 0) * 246);
                        int i229 = ~((~(r7 == true ? 1 : 0)) | (~iEZpvd4));
                        int i230 = ~(r7 == true ? 1 : 0);
                        int i231 = ~(i230 | i227);
                        int i232 = -(-(((i229 & i231) | (i229 ^ i231)) * (-245)));
                        int i233 = (i228 & i232) + (i228 | i232);
                        int i234 = (~(i230 | iEZpvd4)) * (-245);
                        int i235 = ~((iEZpvd4 & i230) | (i230 ^ iEZpvd4));
                        int i236 = ((((i233 | i234) << 1) - (i234 ^ i233)) - (~(((i227 & i235) | (i227 ^ i235)) * 245))) - 1;
                        int i237 = i236 << 13;
                        int i238 = (i237 & (~i236)) | ((~i237) & i236);
                        int i239 = i238 >>> 17;
                        int i240 = (i238 | i239) & (~(i238 & i239));
                        c = 0;
                        ((int[]) objArr55[0])[0] = i240 ^ (i240 << 5);
                        objArr = objArr55;
                        i6 = 1;
                        r72 = r7;
                        if (((int[]) objArr[i6])[c] != i4) {
                            return objArr;
                        }
                        java.lang.Object[] objArr56 = new java.lang.Object[5];
                        objArr56[c] = new int[i6];
                        int[] iArr3 = new int[i6];
                        objArr56[i6] = iArr3;
                        int[] iArr4 = new int[i6];
                        objArr56[3] = iArr4;
                        iArr4[c] = i4;
                        iArr3[c] = i4;
                        objArr56[2] = null;
                        objArr56[4] = null;
                        int i241 = ~i4;
                        int i242 = (((((~((-918306458) | i241)) | 648291840) | (~(274389245 | i241))) * (-397)) - 544031614) + ((652666468 | i4) * 397);
                        int i243 = -(-(i242 * (-958)));
                        int i244 = ~i242;
                        int i245 = ~(i244 | i241);
                        int i246 = ~(((-1) ^ i4) | i4);
                        int i247 = (i245 & i246) | (i245 ^ i246);
                        int i248 = ~i4;
                        int i249 = ~i248;
                        int i250 = (i247 | i249) * 959;
                        int i251 = ((i243 | i250) << 1) - (i243 ^ i250);
                        int i252 = -(-((~i242) * (-959)));
                        int i253 = (i251 & i252) + (i252 | i251);
                        int i254 = ~(((-1) ^ i248) | i248);
                        int i255 = ~((i244 & i4) | (i244 ^ i4));
                        int i256 = (i254 & i255) | (i254 ^ i255);
                        int i257 = ~i4;
                        int i258 = -(-(((i256 & i257) | (i256 ^ i257)) * 959));
                        int i259 = (i253 & i258) + (i258 | i253);
                        int iEZpvd5 = cNL.EZpvd();
                        int i260 = i259 * 567;
                        int i261 = -(-(r72 * (-565)));
                        int i262 = (i260 & i261) + (i260 | i261);
                        int i263 = ~i259;
                        int i264 = ~((i263 & r72) | (i263 ^ r72));
                        int i265 = ~i259;
                        int i266 = ~((i265 ^ iEZpvd5) | (i265 & iEZpvd5));
                        int i267 = ((i264 & i266) | (i264 ^ i266)) * (-566);
                        int i268 = ((i262 | i267) << 1) - (i267 ^ i262);
                        int i269 = ~r72;
                        int i270 = i268 + ((~((i259 & i269) | (i269 ^ i259))) * 566);
                        int i271 = (i265 ^ i269) | (i265 & i269);
                        int i272 = (~((iEZpvd5 & i271) | (i271 ^ iEZpvd5))) * 566;
                        int i273 = ((i270 | i272) << 1) - (i272 ^ i270);
                        int i274 = i273 << 13;
                        int i275 = (i274 & (~i273)) | ((~i274) & i273);
                        int i276 = i275 ^ (i275 >>> 17);
                        int i277 = i276 << 5;
                        ((int[]) objArr56[0])[0] = ((~i276) & i277) | ((~i277) & i276);
                        if (((int[]) objArr56[1])[0] != i4) {
                            return objArr56;
                        }
                        if ((i2 & 1) == 0) {
                            if (Build.VERSION.SDK_INT < 21) {
                                java.lang.Object[] objArr57 = {new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4}, null};
                                int i278 = (~((-573906561) | i241)) | 539039744;
                                int i279 = (r72 - (~((((i278 | r6) * (-252)) - 408242282) + (((~(653655958 | i4)) | (~((-34866817) | i241))) * 252)))) - 1;
                                int i280 = i279 ^ (i279 << 13);
                                int i281 = i280 >>> 17;
                                int i282 = (i280 | i281) & (~(i280 & i281));
                                i7 = i241;
                                i8 = i269;
                                i9 = i4;
                                c5 = 0;
                                objArr2 = objArr57;
                                i10 = i248;
                            } else {
                                java.lang.Object[] objArr58 = new java.lang.Object[1];
                                b(new char[]{3, '#', '\r', 26, '\t', 30, 18, 19, 3, '\f', 24, 7, 13904}, (byte) 109, 13, objArr58);
                                try {
                                    java.lang.Object[] objArr59 = {(java.lang.String) objArr58[0]};
                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                    a(new char[]{18161, 49283, 18958, 54677, 24331, 59016, 24602, 60373, 29979, 64666, 1564, 33211, 2857, 37543, 7218, 42989, 8451, 43186, 12852, 48547, 50993, 20137, 51290}, 34429, objArr60);
                                    java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr60[0]);
                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                    b(new char[]{3, '\"', 1, 25, 5, '\r', ' ', '\"', 23, 20, 31, 15, '\r', 26, '\t', 30}, (byte) 62, 16, objArr61);
                                    java.lang.Object objInvoke2 = cls8.getMethod((java.lang.String) objArr61[0], java.lang.String.class).invoke(context, objArr59);
                                    if (objInvoke2 != null) {
                                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                                        a(new char[]{18161, 12077, 38226, 31643, 57779, 22502, 15366, 41595, 2153, 65163, 25822, 51887, 45845, 6467, 36727, 30116, 56270, 16829, 13826, 40028, 666, 59574, 24273, 50944, 44296, 4964, 63890, 28600, 54759, 47630, 8295, 38524, 31902, 58050, 18673, 12588, 42830}, 27091, objArr62);
                                        java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr62[0]);
                                        java.lang.Object[] objArr63 = new java.lang.Object[1];
                                        a(new char[]{18167, 62424, 11454, 22870, 37447, 52997, 31223, 45789, 61341, 6212, 21814, 36370, 14565, 30135, 44693}, 46381, objArr63);
                                        java.util.List list = (java.util.List) cls9.getMethod((java.lang.String) objArr63[0], null).invoke(objInvoke2, null);
                                        if (list != null) {
                                            java.util.Iterator it2 = list.iterator();
                                            loop1: while (it2.hasNext()) {
                                                java.lang.Object next = it2.next();
                                                java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                b(new char[]{26, 5, 1, 17, 1, 24, 11, 17, '\f', 6, 1, ' ', ' ', 3, '#', 7, 4, 1, 23, 19, 1, 3, ' ', 3, '!', 7, 28, 23, 13834}, Ascii.VT, 29, objArr64);
                                                java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr64[0]);
                                                java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                b(new char[]{3, '\"', ' ', 31, 24, 11, 11, 28, 3, '\"', 11, 27, 21, '\"'}, (byte) 119, 14, objArr65);
                                                java.lang.String str23 = (java.lang.String) cls10.getMethod((java.lang.String) objArr65[0], null).invoke(next, null);
                                                java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                a(new char[]{18161, 12077, 38226, 31643, 57779, 22502, 15366, 41595, 2153, 65163, 25822, 51887, 45845, 6467, 36727, 30116, 56270, 16829, 13826, 40028, 666, 59574, 24273, 50944, 44296, 4964, 63890, 28600, 54759, 47630, 8295, 38524, 31902, 58050, 18673, 12588, 42830}, 27091, objArr66);
                                                java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr66[0]);
                                                java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                a(new char[]{18169, 47328, 47814, 48363, 48883, 45305, 45803, 46313, 46829, 43204, 43769, 44255, 44753, 41157, 41723, 42189, 42704}, 65027, objArr67);
                                                if (((java.lang.Boolean) cls11.getMethod((java.lang.String) objArr67[0], java.lang.String.class).invoke(objInvoke2, str23)).booleanValue()) {
                                                    int length5 = str23.length();
                                                    int i283 = (length5 ^ (-20)) + ((length5 & (-20)) << 1);
                                                    if (i283 < 0) {
                                                        continue;
                                                    } else {
                                                        int i284 = 0;
                                                        while (i284 <= i283) {
                                                            java.lang.Object[] objArr68 = {str23.substring(i284, i284 + 20), 931995};
                                                            java.lang.Object objEZpvd11 = YY.EZpvd(1485637403);
                                                            if (objEZpvd11 == null) {
                                                                byte b15 = (byte) 0;
                                                                byte b16 = (byte) (b15 + 1);
                                                                obj = objInvoke2;
                                                                it = it2;
                                                                java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                                c(b15, b16, (byte) (b16 + 3), objArr69);
                                                                objEZpvd11 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr69[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                            } else {
                                                                obj = objInvoke2;
                                                                it = it2;
                                                            }
                                                            long jLongValue7 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd11).invoke(null, objArr68)).longValue();
                                                            long j45 = -752298480;
                                                            java.lang.String str24 = str23;
                                                            int i285 = i249;
                                                            int i286 = i283;
                                                            long j46 = 764;
                                                            int i287 = i284;
                                                            i10 = i248;
                                                            i8 = i269;
                                                            long j47 = -1;
                                                            long j48 = ((long) i4) ^ j47;
                                                            long j49 = (j48 | j45) ^ j47;
                                                            i7 = i241;
                                                            long j50 = ((j45 ^ j47) | jLongValue7) ^ j47;
                                                            long j51 = (((long) 765) * j45) + (((long) (-1527)) * jLongValue7) + ((jLongValue7 | j49) * j46) + (((long) (-1528)) * (j50 | ((j48 | jLongValue7) ^ j47))) + (j46 * (j50 | (((jLongValue7 ^ j47) | j45) ^ j47) | j49)) + ((long) 2080252010);
                                                            int i288 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                            int i289 = ~i288;
                                                            int i290 = (~(2130477477 | i289)) | (-2147330480);
                                                            int i291 = ~(i288 | (-710410406));
                                                            int i292 = ((int) (j51 >> 32)) & (1514116746 + ((i290 | i291) * (-502)) + ((i291 | (~(i289 | (-16853003)))) * 502));
                                                            int i293 = (int) j51;
                                                            int i294 = (~((-1325379458) | i7)) | 78251265;
                                                            i9 = i;
                                                            int i295 = ~((-285233237) | i9);
                                                            int i296 = i293 & (1308483626 + ((i294 | i295) * (-713)) + (i295 * 1426) + ((~((-1532361429) | i7)) * 713));
                                                            if (((i292 & i296) | (i292 ^ i296)) == 1245577864) {
                                                                objArr2 = new java.lang.Object[]{new int[1], new int[]{(~(i9 & 70)) & (i9 | 70)}, null, new int[]{i9}, null};
                                                                int i297 = (-619063946) + (((~(i7 | 619707470)) | (-653262671)) * (-160)) + ((619707470 | (~((-572988233) | i7))) * CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256);
                                                                int iEZpvd6 = cNL.EZpvd();
                                                                int i298 = -(-(i297 * 246));
                                                                int i299 = ((-3904) ^ i298) + ((i298 & (-3904)) << 1);
                                                                int i300 = ~i297;
                                                                int i301 = ~iEZpvd6;
                                                                int i302 = ~((i301 & i300) | (i300 ^ i301));
                                                                int i303 = ~(i300 | 16);
                                                                int i304 = ((i302 & i303) | (i302 ^ i303)) * (-245);
                                                                int i305 = (i299 ^ i304) + ((i304 & i299) << 1) + ((~((i300 ^ iEZpvd6) | (i300 & iEZpvd6))) * (-245));
                                                                int i306 = ~((iEZpvd6 & i300) | (i300 ^ iEZpvd6));
                                                                int i307 = -(-(((i306 & 16) | (i306 ^ 16)) * 245));
                                                                int i308 = (i305 ^ i307) + ((i307 & i305) << 1);
                                                                int i309 = (i308 * (-112)) + (r72 * (-112));
                                                                int i310 = ~(i8 | i7);
                                                                int i311 = ((i310 & i308) | (i308 ^ i310)) * 226;
                                                                int i312 = (i309 & i311) + (i309 | i311);
                                                                int i313 = ~i308;
                                                                int i314 = ~((i313 ^ r72) | (i313 & r72));
                                                                int i315 = ~((i313 & i9) | (i313 ^ i9));
                                                                int i316 = (i315 & i314) | (i314 ^ i315);
                                                                int i317 = ~(i308 | i8 | i7);
                                                                int i318 = -(-(((i316 & i317) | (i316 ^ i317)) * (-113)));
                                                                int i319 = (i312 & i318) + (i318 | i312);
                                                                int i320 = ~r72;
                                                                int i321 = -(-((~((i320 & i9) | (i320 ^ i9))) * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST));
                                                                int i322 = ((i319 | i321) << 1) - (i321 ^ i319);
                                                                int i323 = i322 << 13;
                                                                int i324 = (i323 | i322) & (~(i322 & i323));
                                                                int i325 = i324 ^ (i324 >>> 17);
                                                                int i326 = i325 << 5;
                                                                int i327 = ((~i325) & i326) | ((~i326) & i325);
                                                                c5 = 0;
                                                                ((int[]) objArr2[0])[0] = i327;
                                                                break loop1;
                                                            }
                                                            int i328 = (i287 & (-126)) + (i287 | (-126));
                                                            i284 = (i328 & 127) + (i328 | 127);
                                                            objInvoke2 = obj;
                                                            i4 = i9;
                                                            str23 = str24;
                                                            i249 = i285;
                                                            i283 = i286;
                                                            i248 = i10;
                                                            i269 = i8;
                                                            i241 = i7;
                                                            it2 = it;
                                                        }
                                                    }
                                                }
                                                objInvoke2 = objInvoke2;
                                                i4 = i4;
                                                i249 = i249;
                                                i248 = i248;
                                                i269 = i269;
                                                i241 = i241;
                                                it2 = it2;
                                            }
                                            i7 = i241;
                                            i8 = i269;
                                            i9 = i4;
                                            i10 = i248;
                                            int i329 = i249;
                                            objArr2 = new java.lang.Object[]{new int[1], new int[]{i9}, null, new int[]{i9}, null};
                                            int startUptimeMillis2 = (int) android.os.Process.getStartUptimeMillis();
                                            int i330 = (~((-126072446) | startUptimeMillis2)) | 126033945;
                                            int i331 = ~((~startUptimeMillis2) | 1066661757);
                                            int i332 = 299107708 + ((i330 | i331) * (-470)) + (((~(startUptimeMillis2 | (-38501))) | i331) * 470);
                                            int i333 = (((i332 * (-279)) - (~(-(-(((i332 ^ i9) | (i332 & i9)) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA))))) - 1) + (((~(((-1) ^ i332) | i332)) | (~((i10 ^ i332) | (i10 & i332)))) * (-280));
                                            int i334 = ~(~i332);
                                            int i335 = (i334 & i329) | (i334 ^ i329);
                                            int i336 = ~(((-1) ^ i332) | i332 | i9);
                                            int i337 = i333 + (((i335 & i336) | (i335 ^ i336)) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
                                            int i338 = ((r72 | i337) << 1) - (i337 ^ r72);
                                            int i339 = i338 << 13;
                                            int i340 = (i339 | i338) & (~(i338 & i339));
                                            int i341 = i340 >>> 17;
                                            int i342 = ((~i340) & i341) | ((~i341) & i340);
                                            int i343 = i342 << 5;
                                            int i344 = ((~i342) & i343) | ((~i343) & i342);
                                            c5 = 0;
                                            ((int[]) objArr2[0])[0] = i344;
                                        } else {
                                            i7 = i241;
                                            i8 = i269;
                                            i9 = i4;
                                            i10 = i248;
                                            int i3292 = i249;
                                            objArr2 = new java.lang.Object[]{new int[1], new int[]{i9}, null, new int[]{i9}, null};
                                            int startUptimeMillis22 = (int) android.os.Process.getStartUptimeMillis();
                                            int i3302 = (~((-126072446) | startUptimeMillis22)) | 126033945;
                                            int i3312 = ~((~startUptimeMillis22) | 1066661757);
                                            int i3322 = 299107708 + ((i3302 | i3312) * (-470)) + (((~(startUptimeMillis22 | (-38501))) | i3312) * 470);
                                            int i3332 = (((i3322 * (-279)) - (~(-(-(((i3322 ^ i9) | (i3322 & i9)) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA))))) - 1) + (((~(((-1) ^ i3322) | i3322)) | (~((i10 ^ i3322) | (i10 & i3322)))) * (-280));
                                            int i3342 = ~(~i3322);
                                            int i3352 = (i3342 & i3292) | (i3342 ^ i3292);
                                            int i3362 = ~(((-1) ^ i3322) | i3322 | i9);
                                            int i3372 = i3332 + (((i3352 & i3362) | (i3352 ^ i3362)) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
                                            int i3382 = ((r72 | i3372) << 1) - (i3372 ^ r72);
                                            int i3392 = i3382 << 13;
                                            int i3402 = (i3392 | i3382) & (~(i3382 & i3392));
                                            int i3412 = i3402 >>> 17;
                                            int i3422 = ((~i3402) & i3412) | ((~i3412) & i3402);
                                            int i3432 = i3422 << 5;
                                            int i3442 = ((~i3422) & i3432) | ((~i3432) & i3422);
                                            c5 = 0;
                                            ((int[]) objArr2[0])[0] = i3442;
                                        }
                                    }
                                } catch (java.lang.Throwable th21) {
                                    java.lang.Throwable cause8 = th21.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th21;
                                }
                            }
                            if (((int[]) objArr2[1])[c5] == i9) {
                            }
                        } else {
                            i7 = i241;
                            i8 = i269;
                            i9 = i4;
                            i10 = i248;
                        }
                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                        a(new char[]{18111, 23294, 32503, 4846, 14023, 51913, 61161, 33532, 42641, 47791, 24236, 29340}, 7177, objArr70);
                        java.lang.Object[] objArr71 = {(java.lang.String) objArr70[0]};
                        java.lang.Object objEZpvd12 = YY.EZpvd(-924280847);
                        if (objEZpvd12 == null) {
                            byte b17 = (byte) 0;
                            java.lang.Object[] objArr72 = new java.lang.Object[1];
                            c((byte) ($$a[3] + 1), b17, b17, objArr72);
                            objEZpvd12 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, -859284851, false, (java.lang.String) objArr72[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long jLongValue8 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd12).invoke(null, objArr71)).longValue();
                        long j52 = 1693821929;
                        long j53 = -112;
                        long j54 = -1;
                        long j55 = jLongValue8 ^ j54;
                        long j56 = i9;
                        long j57 = j56 ^ j54;
                        long j58 = j55 | j57;
                        long j59 = j52 ^ j54;
                        long j60 = (j53 * j52) + (j53 * jLongValue8) + (((long) 226) * (j52 | (j58 ^ j54))) + (((long) (-113)) * (((j59 | jLongValue8) ^ j54) | ((j59 | j56) ^ j54) | ((j58 | j52) ^ j54))) + (((long) WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) * ((j55 | j56) ^ j54)) + ((long) (-2004990023));
                        int iNextInt2 = new java.util.Random().nextInt(1481688010);
                        int i345 = ~iNextInt2;
                        int i346 = ((int) (j60 >> 32)) & ((-281900390) + (((~(870317991 | i345)) | 566908419) * 220) + (((~(i345 | 868939651)) | 568286759) * (-440)) + ((iNextInt2 | 870317991) * 220));
                        int i347 = ~((int) android.os.Process.getElapsedCpuTime());
                        if ((i346 | (((int) j60) & (1788176917 + ((1107623937 | i347) * (-192)) + (((~((-876126187) | i347)) | 873990762) * (-384)) + (((~(r3 | 1983750123)) | (~(i347 | (-2135425))) | (~((-873990763) | r3))) * 192)))) != 0) {
                            objArr2 = new java.lang.Object[]{new int[1], new int[]{(i9 & (-51)) | (i7 & 50)}, null, new int[]{i9}, null};
                            int i348 = (-212588479) + (((~(i9 | 186563247)) | (-1006132456)) * (-465)) + ((186563247 | (~((-1006132456) | i9))) * 930) + (((-820003905) | i9) * 465);
                            int iEZpvd7 = cNL.EZpvd();
                            int i349 = i348 * (-755);
                            int i350 = ((-12080) & i349) + (i349 | (-12080));
                            int i351 = ~i348;
                            int i352 = -(-((~((i351 & (-17)) | ((-17) ^ i351))) * 1512));
                            int i353 = (i350 ^ i352) + ((i352 & i350) << 1);
                            int i354 = ~i348;
                            int i355 = ~((i354 & (-17)) | ((-17) ^ i354));
                            int i356 = ~((i348 ^ 16) | (i348 & 16) | iEZpvd7);
                            int i357 = (i353 - (~(((i355 & i356) | (i355 ^ i356)) * (-756)))) - 1;
                            int i358 = -(-(((~iEZpvd7) | i348 | 16) * 756));
                            int i359 = -(-(((i357 | i358) << 1) - (i358 ^ i357)));
                            i11 = i3;
                            int i360 = (i11 & i359) + (i359 | i11);
                            int i361 = i360 << 13;
                            int i362 = (i361 & (~i360)) | ((~i361) & i360);
                            int i363 = i362 >>> 17;
                            int i364 = ((~i362) & i363) | ((~i363) & i362);
                            int i365 = i364 << 5;
                            int i366 = ((~i364) & i365) | ((~i365) & i364);
                            c2 = 0;
                            ((int[]) objArr2[0])[0] = i366;
                        } else {
                            i11 = i3;
                            objArr2 = new java.lang.Object[]{new int[1], new int[]{i9}, null, new int[]{i9}, null};
                            int iMyPid = android.os.Process.myPid();
                            int i367 = ~iMyPid;
                            int i368 = -(-(1000732342 + (((~(1053751183 | i367)) | 138944519) * 220) + (((~(i367 | 206332559)) | 986363143) * (-440)) + ((iMyPid | 1053751183) * 220)));
                            int i369 = (i11 & i368) + (i368 | i11);
                            int i370 = i369 << 13;
                            int i371 = (i370 | i369) & (~(i369 & i370));
                            int i372 = i371 >>> 17;
                            int i373 = ((~i371) & i372) | ((~i372) & i371);
                            int i374 = i373 << 5;
                            int i375 = (i373 | i374) & (~(i373 & i374));
                            c2 = 0;
                            ((int[]) objArr2[0])[0] = i375;
                        }
                        if (((int[]) objArr2[1])[c2] == i9) {
                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                            b(new char[]{29, 15, 5, '\r', ' ', '\"', 21, 28, '\f', 20, 24, 2, 3, ' ', 29, 23, 23, 24, '\t', 30}, (byte) 8, 20, objArr73);
                            java.lang.Object[] objArr74 = {(java.lang.String) objArr73[c2]};
                            java.lang.Object objEZpvd13 = YY.EZpvd(-924280847);
                            if (objEZpvd13 == null) {
                                byte b18 = (byte) 0;
                                java.lang.Object[] objArr75 = new java.lang.Object[1];
                                c((byte) ($$a[3] + 1), b18, b18, objArr75);
                                objEZpvd13 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, -859284851, false, (java.lang.String) objArr75[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            long jLongValue9 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd13).invoke(null, objArr74)).longValue();
                            long j61 = 735348114;
                            long j62 = 371;
                            long j63 = (j62 * j61) + (j62 * jLongValue9);
                            long j64 = -370;
                            long j65 = jLongValue9 ^ j54;
                            long j66 = j61 ^ j54;
                            long j67 = (jLongValue9 | j61) ^ j54;
                            long j68 = j63 + ((((j65 | j57) ^ j54) | ((j66 | j56) ^ j54)) * j64) + (j64 * (((j66 | j57) ^ j54) | ((j65 | j56) ^ j54) | j67)) + (((long) 370) * j67) + ((long) (-1046516208));
                            int i376 = ~android.os.Process.myUid();
                            int i377 = ((int) (j68 >> 32)) & (((1754752898 + (((~((-1114112090) | i376)) | (-1743628796)) * (-828))) + ((i376 | (-1114112090)) * (-828))) - 933158948);
                            int i378 = ((int) j68) & (2085983287 + (((~(1539283833 | i9)) | 1318457052) * 191) + (((~(i7 | 1539283833)) | 67110020) * 191));
                            if (((i377 & i378) | (i377 ^ i378)) != 0) {
                                objArr2 = new java.lang.Object[]{new int[1], new int[]{(i9 & (-61)) | (i7 & 60)}, null, new int[]{i9}, null};
                                int i379 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                int i380 = ~i379;
                                int i381 = 274823966 + ((i379 | 272480) * 988) + (((~(596393976 | i380)) | 180230) * (-1976)) + (((~(i379 | (-596301727))) | 272480 | (~(596301726 | i380))) * 988);
                                int i382 = (-9424) + (i381 * 591);
                                int i383 = ~i381;
                                int i384 = ~((i383 & i7) | (i383 ^ i7));
                                int i385 = ~i381;
                                int i386 = ~((i385 ^ 16) | (i385 & 16));
                                int i387 = ((-17) ^ i381) | ((-17) & i381);
                                int i388 = ((i384 & i386) | (i384 ^ i386) | (~((i10 ^ 16) | (i10 & 16))) | (~((i387 & i9) | (i387 ^ i9)))) * 590;
                                int i389 = (i382 & i388) + (i388 | i382);
                                int i390 = ~((i385 ^ i7) | (i385 & i7));
                                int i391 = (i390 & i386) | (i390 ^ i386);
                                int i392 = ~((i7 ^ 16) | (i7 & 16));
                                int i393 = ((i391 & i392) | (i391 ^ i392)) * (-1180);
                                int i394 = (i389 & i393) + (i393 | i389);
                                int i395 = ~(((-17) ^ i7) | ((-17) & i7));
                                int i396 = ~(i10 | i381);
                                int i397 = i394 + (((i395 & i396) | (i395 ^ i396)) * 590);
                                int iEZpvd8 = cNL.EZpvd();
                                int i398 = (i397 * (-433)) + (i11 * (-216));
                                int i399 = ~i397;
                                int i400 = ~iEZpvd8;
                                int i401 = ~((i400 & i399) | (i399 ^ i400));
                                int i402 = ~((i8 ^ iEZpvd8) | (i8 & iEZpvd8));
                                int i403 = -(-(((i401 & i402) | (i401 ^ i402)) * 217));
                                int i404 = (i398 & i403) + (i398 | i403);
                                int i405 = ~i397;
                                int i406 = ((~((i405 & i8) | (i405 ^ i8))) | (~((i399 & iEZpvd8) | (i399 ^ iEZpvd8)))) * 217;
                                int i407 = (i404 & i406) + (i406 | i404);
                                int i408 = ~i11;
                                int i409 = ~iEZpvd8;
                                int i410 = ~((i409 & i408) | (i408 ^ i409));
                                int i411 = (i407 - (~(-(-(((i410 & i397) | (i397 ^ i410)) * 217))))) - 1;
                                int i412 = (i411 << 13) ^ i411;
                                int i413 = i412 ^ (i412 >>> 17);
                                int i414 = i413 << 5;
                                int i415 = ((~i413) & i414) | ((~i414) & i413);
                                c3 = 0;
                                ((int[]) objArr2[0])[0] = i415;
                            } else {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i9}, null, new int[]{i9}, null};
                                int i416 = (-12007866) + ((~(i9 | 235645244)) * 216) + (((-822101571) | i7) * (-216)) + (((~(i7 | 235645244)) | 957050458) * 216);
                                int i417 = (i416 * (-433)) + (i11 * (-216));
                                int i418 = ~i416;
                                int i419 = ((~((i418 ^ i7) | (i418 & i7))) | (~((i8 ^ i9) | (i8 & i9)))) * 217;
                                int i420 = (i417 & i419) + (i417 | i419);
                                int i421 = ~i416;
                                int i422 = ~i11;
                                int i423 = ~((i421 & i422) | (i421 ^ i422));
                                int i424 = ~(i418 | i9);
                                int i425 = ((i423 & i424) | (i423 ^ i424)) * 217;
                                int i426 = (i420 ^ i425) + ((i425 & i420) << 1);
                                int i427 = ~(i422 | i7);
                                int i428 = -(-(((i427 & i416) | (i416 ^ i427)) * 217));
                                int i429 = (i426 & i428) + (i428 | i426);
                                int i430 = i429 << 13;
                                int i431 = (i430 | i429) & (~(i429 & i430));
                                int i432 = i431 >>> 17;
                                int i433 = ((~i431) & i432) | ((~i432) & i431);
                                int i434 = i433 << 5;
                                int i435 = (i433 | i434) & (~(i433 & i434));
                                c3 = 0;
                            }
                            if (((int[]) objArr2[1])[c3] == i9) {
                                java.lang.Object[] objArr76 = new java.lang.Object[1];
                                a(new char[]{18111, 23709, 29219, 2527, 12117, 49842, 55426, 65070, 38316, 43840, 20133, 25712, 31251, 4520, 14080, 51920, 57442, 34310, 40330, 45941, 22213, 27747, 1010, 6541, 16167, 53944, 59486, 36780, 42394, 47891, 24237, 29816, 3028, 8568, 50966, 55978}, 6761, objArr76);
                                java.lang.Object[] objArr77 = {(java.lang.String) objArr76[c3]};
                                java.lang.Object objEZpvd14 = YY.EZpvd(1704729038);
                                if (objEZpvd14 == null) {
                                    byte b19 = (byte) 3;
                                    byte b20 = (byte) (b19 - 3);
                                    java.lang.Object[] objArr78 = new java.lang.Object[1];
                                    c(b19, b20, (byte) (b20 + 2), objArr78);
                                    objEZpvd14 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr78[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                long jLongValue10 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd14).invoke(null, objArr77)).longValue();
                                long j69 = 1688233574;
                                long j70 = 471;
                                long j71 = (j70 * j69) + (j70 * jLongValue10);
                                long j72 = -470;
                                long j73 = jLongValue10 ^ j54;
                                long jMyUid = android.os.Process.myUid();
                                long j74 = (((jMyUid ^ j54) | j69) | jLongValue10) ^ j54;
                                long j75 = j71 + ((j69 | jLongValue10) * j72) + (j72 * ((((j69 ^ j54) | j73) ^ j54) | ((j73 | jMyUid) ^ j54) | j74)) + (((long) 470) * (j74 | ((jMyUid | (j73 | j69)) ^ j54))) + ((long) (-1853830301));
                                int i436 = ((int) (j75 >> 32)) & (((((~(151295874 | r2)) | (-1605304240)) * (-566)) - 926873974) + ((~(android.os.Process.myUid() | (-1454008366))) * 566));
                                int i437 = ((int) j75) & (1830840449 + ((~(i7 | (-541352657))) * 52) + (((~(i7 | (-543548113))) | (~(893678297 | i7)) | 2195456) * (-52)) + (((~(543548112 | i7)) | 352325641) * 52));
                                if (((i436 & i437) | (i436 ^ i437)) != 0) {
                                    objArr2 = new java.lang.Object[]{new int[1], new int[]{(i9 & (-81)) | (i7 & 80)}, null, new int[]{i9}, null};
                                    int i438 = ~(((int) java.lang.Runtime.getRuntime().freeMemory()) | 997318204);
                                    int i439 = ((819259238 | i438) * (-658)) + 1991532574 + ((i438 | 8659266) * 658) + 16;
                                    i12 = i3;
                                    int i440 = i439 + i12;
                                    int i441 = i440 << 13;
                                    int i442 = ((~i440) & i441) | ((~i441) & i440);
                                    int i443 = i442 ^ (i442 >>> 17);
                                    c4 = 0;
                                    ((int[]) objArr2[0])[0] = i443 ^ (i443 << 5);
                                } else {
                                    i12 = i3;
                                    java.lang.Object[] objArr79 = {new int[1], new int[]{i9}, null, new int[]{i9}, null};
                                    int i444 = ((((~((-171278546) | r2)) | 34865168) * (-283)) - 1825363642) + ((~(new java.util.Random().nextInt() | (-136413378))) * 283);
                                    int i445 = i444 * LuaValue.ERR_CLOSE_FILE_ERROR;
                                    int i446 = (i445 << 1) - i445;
                                    int i447 = ~(((-1) ^ i10) | i10 | i444);
                                    int i448 = ~((i444 ^ i9) | (i444 & i9));
                                    int i449 = -(-(((i447 & i448) | (i447 ^ i448)) * (-302)));
                                    int i450 = (i446 ^ i449) + ((i449 & i446) << 1);
                                    int i451 = ((-1) ^ i444) | i444;
                                    int i452 = (~((i451 & i9) | (i451 ^ i9))) * (-604);
                                    int i453 = (i450 ^ i452) + ((i452 & i450) << 1);
                                    int i454 = ~(~i444);
                                    int i455 = ~((i444 & i9) | (i444 ^ i9));
                                    int i456 = (i453 - (~(-(-(((i454 & i455) | (i454 ^ i455)) * 302))))) - 1;
                                    int iEZpvd9 = cNL.EZpvd();
                                    int i457 = (i456 * 989) + (i12 * (-987));
                                    int i458 = ~iEZpvd9;
                                    int i459 = ~((i8 & i458) | (i8 ^ i458) | i456);
                                    int i460 = (i456 ^ i12) | (i456 & i12);
                                    int i461 = ~((i460 & iEZpvd9) | (i460 ^ iEZpvd9));
                                    int i462 = ((i459 & i461) | (i459 ^ i461)) * 988;
                                    int i463 = (i457 & i462) + (i457 | i462);
                                    int i464 = -(-((i456 | i8) * (-988)));
                                    int i465 = (i463 & i464) + (i464 | i463);
                                    int i466 = ~i456;
                                    int i467 = ~((i466 & i8) | (i466 ^ i8));
                                    int i468 = ~((i8 ^ iEZpvd9) | (i8 & iEZpvd9));
                                    int i469 = ~iEZpvd9;
                                    int i470 = (i469 & i456) | (i469 ^ i456);
                                    int i471 = (i465 - (~(-(-(((~((i470 & i12) | (i470 ^ i12))) | ((i467 & i468) | (i467 ^ i468))) * 988))))) - 1;
                                    int i472 = i471 << 13;
                                    int i473 = (i472 & (~i471)) | ((~i472) & i471);
                                    int i474 = i473 >>> 17;
                                    int i475 = ((~i473) & i474) | ((~i474) & i473);
                                    int i476 = i475 << 5;
                                    int i477 = ((~i475) & i476) | ((~i476) & i475);
                                    c4 = 0;
                                    ((int[]) objArr79[0])[0] = i477;
                                    objArr2 = objArr79;
                                }
                                if (((int[]) objArr2[1])[c4] == i9) {
                                    java.lang.Object[] objArr80 = new java.lang.Object[1];
                                    b(new char[]{29, 3, 25, '#', 24, 28, 11, '#', '#', 25, 24, '\t', 4, 18, 6, 7, '\f', 3, 3, ' ', 17, '#', 3, 0, '\f', 1, 29, 1, 17, 11, 17, 24, 17, '\t', '\f', 23, 24, 11, 3, '!', 16, 20}, Ascii.SYN, 42, objArr80);
                                    java.lang.Object[] objArr81 = {(java.lang.String) objArr80[c4]};
                                    java.lang.Object objEZpvd15 = YY.EZpvd(1704729038);
                                    if (objEZpvd15 == null) {
                                        byte b21 = (byte) 3;
                                        byte b22 = (byte) (b21 - 3);
                                        java.lang.Object[] objArr82 = new java.lang.Object[1];
                                        c(b21, b22, (byte) (b22 + 2), objArr82);
                                        objEZpvd15 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr82[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    long jLongValue11 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd15).invoke(null, objArr81)).longValue();
                                    long j76 = 479561118;
                                    long j77 = 46;
                                    long j78 = jLongValue11 ^ j54;
                                    long jNextInt = new java.util.Random().nextInt(1909843045);
                                    long j79 = jNextInt ^ j54;
                                    long j80 = (j77 * j76) + (j77 * jLongValue11) + (((long) (-90)) * (j76 | ((j78 | j79) ^ j54))) + (((long) (-45)) * (((j78 | jNextInt) ^ j54) | ((jLongValue11 | j76) ^ j54))) + (((long) 45) * (((jNextInt | (j76 ^ j54)) ^ j54) | j78 | ((j79 | j76) ^ j54))) + ((long) (-645157845));
                                    int i478 = ((int) (j80 >> 32)) & (63620462 + (((~((-1290466373) | i)) | (-146760039)) * (-318)) + (((~((-146760039) | i)) | (~(i7 | 1291842918))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i7 | (-1376547))) | (~(1291842918 | i))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                    int startElapsedRealtime2 = (int) android.os.Process.getStartElapsedRealtime();
                                    int i479 = ((int) j80) & ((((~((-1367626345) | startElapsedRealtime2)) | 156566917) * 262) + 754583465 + (((~((~startElapsedRealtime2) | (-1367626345))) | 156566917) * 262));
                                    if (((i478 & i479) | (i478 ^ i479)) != 0) {
                                        java.lang.Object[] objArr83 = {new int[]{(i | i) & (~(i & i))}, new int[]{i ^ 90}, null, new int[]{i}, null};
                                        int i480 = -(-(((219040356 + (((~((-740832999) | i7)) | (-451862705)) * (-933))) + (((~((-451862705) | i7)) | 315015184) * 933)) - 1558843939));
                                        int i481 = (i12 & i480) + (i12 | i480);
                                        int i482 = (i481 << 13) ^ i481;
                                        int i483 = i482 >>> 17;
                                        int i484 = ((~i482) & i483) | ((~i483) & i482);
                                        int i485 = i484 << 5;
                                        return objArr83;
                                    }
                                    java.lang.Object[] objArr84 = {new int[]{i ^ (i << 5)}, new int[]{i}, null, new int[]{i}, null};
                                    int i486 = (-1000000120) + ((i | (-839419911)) * (-381)) + (((~(i7 | 210192376)) | (-906528871)) * 381) + 1991405806;
                                    int i487 = (i12 - (~(-(-((i486 << 1) - i486))))) - 1;
                                    int i488 = i487 << 13;
                                    int i489 = ((~i487) & i488) | ((~i488) & i487);
                                    int i490 = i489 >>> 17;
                                    int i491 = ((~i489) & i490) | ((~i490) & i489);
                                    return objArr84;
                                }
                            }
                        }
                    } catch (java.lang.Throwable th22) {
                        java.lang.Throwable cause9 = th22.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th22;
                    }
                }
                return objArr2;
            } catch (java.lang.Throwable th23) {
                java.lang.Throwable cause10 = th23.getCause();
                if (cause10 != null) {
                    throw cause10;
                }
                throw th23;
            }
        }
    }

    /* JADX INFO: renamed from: o.yua$ActionBar */
    public static final class ActionBar extends AbstractC58082yua {
        public final byte[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] KWHzl() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull byte[] bArr) {
            super(null);
            Intrinsics.checkNotNullParameter(bArr, "");
            this.copydefault = bArr;
        }
    }
}
