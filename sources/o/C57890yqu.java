package o;

import com.google.common.base.Ascii;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.yqu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57890yqu {
    public JSONArray AEQbTJ;
    public JSONArray EZpvd;
    private static final byte[] $$c = {70, 75, -118, 8};
    private static final int $$d = CipherSuite.TLS_PSK_WITH_NULL_SHA256;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {113, 48, -67, 32, -19, Ascii.SYN, -8, -25, -13, 36, -35, -25};
    private static final int $$b = 23;
    private static int KWHzl = 0;
    private static int OLrzqt = 1;
    private static int[] copydefault = {-1617040811, -1342286868, -1265819713, 598354056, -386972188, 1549624286, 1057650495, -684292761, 1905340546, -56610548, -620077826, -491717051, 1857056303, -1896824803, 614621354, -842775593, -2028006167, 1884942265};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(short s, int i, short s2) {
        int i2;
        int i3;
        int i4 = 3 - (s2 * 4);
        byte[] bArr = $$c;
        int i5 = i * 4;
        int i6 = 110 - s;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            i3 = i4;
            i2 = 0;
            i4 += -i8;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i7) {
                return new java.lang.String(bArr2, 0);
            }
            i2++;
            i8 = bArr[i3];
            i4 += -i8;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i4 = i6;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i7) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57890yqu() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (b * 2) + 4;
        int i5 = i + 4;
        byte[] bArr = $$a;
        int i6 = 79 - (b2 * 14);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i6 = i4;
            i6 = i6 + i7 + 16;
            i2 = i3;
            i5++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i6 = i6 + i7 + 16;
            i2 = i3;
            i5++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i5++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONArray AEQbTJ() {
        int i = 2 % 2;
        int i2 = KWHzl;
        int i3 = i2 + 73;
        OLrzqt = i3 % 128;
        int i4 = i3 % 2;
        JSONArray jSONArray = this.AEQbTJ;
        int i5 = i2 + 115;
        OLrzqt = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(JSONArray jSONArray) {
        int i = 2 % 2;
        int i2 = OLrzqt + 63;
        int i3 = i2 % 128;
        KWHzl = i3;
        int i4 = i2 % 2;
        this.EZpvd = jSONArray;
        int i5 = i3 + 45;
        OLrzqt = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(JSONArray jSONArray) {
        int i = 2 % 2;
        int i2 = KWHzl + 19;
        OLrzqt = i2 % 128;
        int i3 = i2 % 2;
        this.AEQbTJ = jSONArray;
        if (i3 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONArray OLrzqt() {
        int i = 2 % 2;
        int i2 = KWHzl;
        int i3 = i2 + 39;
        OLrzqt = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        JSONArray jSONArray = this.EZpvd;
        int i4 = i2 + 65;
        OLrzqt = i4 % 128;
        int i5 = i4 % 2;
        return jSONArray;
    }

    public C57890yqu(JSONArray jSONArray, JSONArray jSONArray2) {
        this.EZpvd = jSONArray;
        this.AEQbTJ = jSONArray2;
    }

    public /* synthetic */ C57890yqu(JSONArray jSONArray, JSONArray jSONArray2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            jSONArray = new JSONArray();
            int i2 = KWHzl + 35;
            OLrzqt = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 3;
            } else {
                int i4 = 2 % 2;
            }
        }
        this(jSONArray, (i & 2) != 0 ? new JSONArray() : jSONArray2);
    }

    public final JSONObject EZpvd() throws JSONException {
        int i = 2 % 2;
        JSONObject jSONObjectPut = new JSONObject().put("notification_ids", this.EZpvd).put("in_app_message_ids", this.AEQbTJ);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "");
        int i2 = OLrzqt + 73;
        KWHzl = i2 % 128;
        int i3 = i2 % 2;
        return jSONObjectPut;
    }

    public java.lang.String toString() {
        int i = 2 % 2;
        java.lang.String str = "OSOutcomeSourceBody{notificationIds=" + this.EZpvd + ", inAppMessagesIds=" + this.AEQbTJ + AbstractJsonLexerKt.END_OBJ;
        int i2 = OLrzqt + 83;
        KWHzl = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [148=5] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void b(int[] iArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        Zm zm = new Zm();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = copydefault;
        int i3 = 698602880;
        if (iArr3 != null) {
            int i4 = $10 + 33;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr3[i6])};
                    java.lang.Object objEZpvd = YY.EZpvd(i3);
                    if (objEZpvd == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objEZpvd = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = 698602880;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = copydefault;
        if (iArr6 != null) {
            int i7 = $11 + 91;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            for (int i8 = 0; i8 < length; i8++) {
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr6[i8])};
                java.lang.Object objEZpvd2 = YY.EZpvd(698602880);
                if (objEZpvd2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objEZpvd2 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                iArr2[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).intValue();
            }
            iArr6 = iArr2;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length3);
        zm.OLrzqt = 0;
        while (zm.OLrzqt < iArr.length) {
            int i9 = $11 + 57;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[zm.OLrzqt] >> 16);
            cArr[1] = (char) iArr[zm.OLrzqt];
            cArr[2] = (char) (iArr[zm.OLrzqt + 1] >> 16);
            cArr[3] = (char) iArr[zm.OLrzqt + 1];
            zm.copydefault = (cArr[0] << 16) + cArr[1];
            zm.KWHzl = (cArr[2] << 16) + cArr[3];
            Zm.EZpvd(iArr5);
            for (int i11 = 0; i11 < 16; i11++) {
                zm.copydefault ^= iArr5[i11];
                java.lang.Object[] objArr4 = {zm, java.lang.Integer.valueOf(Zm.AEQbTJ(zm.copydefault)), zm, zm};
                java.lang.Object objEZpvd3 = YY.EZpvd(984677556);
                if (objEZpvd3 == null) {
                    byte b5 = (byte) 3;
                    byte b6 = (byte) (b5 - 3);
                    objEZpvd3 = YY.EZpvd(180, 4, (char) 19181, 1049637320, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                }
                int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue();
                zm.copydefault = zm.KWHzl;
                zm.KWHzl = iIntValue;
            }
            int i12 = zm.copydefault;
            zm.copydefault = zm.KWHzl;
            zm.KWHzl = i12;
            zm.KWHzl ^= iArr5[16];
            zm.copydefault ^= iArr5[17];
            int i13 = zm.copydefault;
            int i14 = zm.KWHzl;
            cArr[0] = (char) (zm.copydefault >>> 16);
            cArr[1] = (char) zm.copydefault;
            cArr[2] = (char) (zm.KWHzl >>> 16);
            cArr[3] = (char) zm.KWHzl;
            Zm.EZpvd(iArr5);
            cArr2[zm.OLrzqt * 2] = cArr[0];
            cArr2[(zm.OLrzqt * 2) + 1] = cArr[1];
            cArr2[(zm.OLrzqt * 2) + 2] = cArr[2];
            cArr2[(zm.OLrzqt * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {zm, zm};
            java.lang.Object objEZpvd4 = YY.EZpvd(-1770687495);
            if (objEZpvd4 == null) {
                byte b7 = (byte) 1;
                byte b8 = (byte) (b7 - 1);
                objEZpvd4 = YY.EZpvd(600, 5, (char) 29201, -1839874427, false, $$e(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] copydefault(int r28, int r29) {
        /*
            r0 = r28
            r1 = r29
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.C57890yqu.OLrzqt
            r4 = r3 ^ 87
            r3 = r3 & 87
            r5 = 1
            int r3 = r3 << r5
            int r4 = r4 + r3
            int r3 = r4 % 128
            o.C57890yqu.KWHzl = r3
            int r4 = r4 % r2
            r4 = r3 & 73
            r3 = r3 | 73
            int r4 = r4 + r3
            int r3 = r4 % 128
            o.C57890yqu.OLrzqt = r3
            int r4 = r4 % r2
            r3 = 98
            int[] r3 = new int[r3]
            r3 = {x05d0: FILL_ARRAY_DATA , data: [-1834048556, -815834687, 1742706823, -1699709306, 421332122, -1883887225, 1856103328, 54668571, 863715084, 759357219, -1898873382, 681080701, 266332610, 764552843, -1665824097, 2011131730, 649812685, -1863770041, -284296471, -1869202085, -960789441, -30564408, -1135096007, -1974645819, -258122529, -1301601857, -1084205059, 299040560, 1694874619, 235452628, -888014528, -2022506543, 1593749856, 1465402483, -869872819, -664908481, -781930334, 1500779937, 627463639, -834327268, -1389992489, 344816139, 1485652394, 895201362, 66335076, 2126239951, -1445222112, -1207174816, -1698969296, -126234546, 606814267, -856409971, 1580892672, 807769108, -1497450239, -1456000346, 1762482581, -150650234, 1140496285, -916009760, 1062219767, 1603293128, 1882662149, -701530971, -134688564, 1036249671, 1416831937, 1423517539, -1291380639, -469250631, -437871410, -170802881, -1396824373, 1164526425, 1747503417, -697768073, -696600778, -2108553867, 1572413146, 1246891590, 1258095435, 579384538, -1406915859, 1265033299, 1469997637, 1210287644, 1881919003, 668299601, -447890282, -898453679, 2052630149, -674408784, -1264859816, 1049198698, -1467087659, 689684006, -505535130, 435936822} // fill-array
            java.lang.String[][] r4 = new java.lang.String[r5][]
            int r6 = ~r0
            r7 = -975416825(0xffffffffc5dc5207, float:-7050.2534)
            r8 = r6 ^ r7
            r7 = r7 & r6
            r7 = r7 | r8
            r8 = -1689968013(0xffffffff9b452273, float:-1.6306589E-22)
            r9 = r7 ^ r8
            r8 = r8 & r7
            r8 = r8 | r9
            int r8 = ~r8
            int r8 = r8 * 52
            r9 = -1167340950(0xffffffffba6bca6a, float:-8.9947006E-4)
            r10 = r9 ^ r8
            r8 = r8 & r9
            int r8 = r8 << r5
            int r10 = r10 + r8
            int r8 = ~r0
            r9 = 1689968012(0x64badd8c, float:2.7576468E22)
            r9 = r9 | r8
            int r9 = ~r9
            r11 = 436281456(0x1a012070, float:2.6702778E-23)
            r9 = r9 | r11
            int r7 = ~r7
            r11 = r9 ^ r7
            r7 = r7 & r9
            r7 = r7 | r11
            int r7 = r7 * (-52)
            int r10 = r10 + r7
            r7 = 975416824(0x3a23adf8, float:6.24388E-4)
            r9 = r7 ^ r6
            r7 = r7 & r6
            r7 = r7 | r9
            int r7 = ~r7
            r9 = 1150832644(0x44985004, float:1218.5005)
            r11 = r7 ^ r9
            r7 = r7 & r9
            r7 = r7 | r11
            int r7 = r7 * 52
            int r7 = -r7
            int r7 = -r7
            r9 = r10 & r7
            r7 = r7 | r10
            int r9 = r9 + r7
            r7 = 1614853391(0x6040b50f, float:5.5544086E19)
            r10 = r6 ^ r7
            r7 = r7 & r6
            r7 = r7 | r10
            int r7 = ~r7
            r10 = -1820261840(0xffffffff93810230, float:-3.2566335E-27)
            r11 = r10 ^ r7
            r7 = r7 & r10
            r7 = r7 | r11
            int r7 = r7 * (-1188)
            r11 = -1996398589(0xffffffff89016003, float:-1.5572955E-33)
            r12 = r11 | r7
            int r12 = r12 << r5
            r7 = r7 ^ r11
            int r12 = r12 - r7
            r7 = -1614853392(0xffffffff9fbf4af0, float:-8.101562E-20)
            r11 = r7 ^ r0
            r13 = r7 & r0
            r11 = r11 | r13
            int r11 = ~r11
            r13 = r10 ^ r11
            r10 = r10 & r11
            r10 = r10 | r13
            r11 = -1820256464(0xffffffff93811730, float:-3.2587043E-27)
            r13 = r6 ^ r11
            r11 = r11 & r6
            r11 = r11 | r13
            int r11 = ~r11
            r13 = r10 ^ r11
            r10 = r10 & r11
            r10 = r10 | r13
            int r10 = r10 * 594
            int r10 = -r10
            int r10 = -r10
            int r10 = ~r10
            int r12 = r12 - r10
            int r12 = r12 - r5
            r7 = r7 | r8
            int r7 = ~r7
            r10 = 1614848015(0x6040a00f, float:5.552044E19)
            r13 = r7 ^ r10
            r7 = r7 & r10
            r7 = r7 | r13
            r10 = r7 ^ r11
            r7 = r7 & r11
            r7 = r7 | r10
            int r7 = r7 * 594
            r10 = r12 & r7
            r7 = r7 | r12
            int r10 = r10 + r7
            r7 = 0
            if (r9 > r10) goto Lc3
            long r9 = java.lang.System.currentTimeMillis()
            int r9 = (int) r9
            r10 = 30
            int r10 = r10 / r7
            goto Lc8
        Lc3:
            long r9 = java.lang.System.currentTimeMillis()
            int r9 = (int) r9
        Lc8:
            r10 = -343337309(0xffffffffeb8916a3, float:-3.3145947E26)
            r10 = r10 & r9
            int r9 = ~r9
            r11 = 343337308(0x1476e95c, float:1.2465848E-26)
            r9 = r9 & r11
            r9 = r9 | r10
            int r10 = ~r9
            r10 = r10 & r0
            r11 = r9 & r8
            r10 = r10 | r11
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L5c7
            r12[r2] = r4     // Catch: java.lang.Throwable -> L5c7
            r12[r5] = r3     // Catch: java.lang.Throwable -> L5c7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L5c7
            r12[r7] = r3     // Catch: java.lang.Throwable -> L5c7
            r3 = -1268106113(0xffffffffb46a3c7f, float:-2.1814957E-7)
            java.lang.Object r3 = o.YY.EZpvd(r3)     // Catch: java.lang.Throwable -> L5c7
            if (r3 != 0) goto L122
            r13 = 469(0x1d5, float:6.57E-43)
            r16 = -1337265917(0xffffffffb04af103, float:-7.382967E-10)
            r17 = 0
            int r3 = o.C57890yqu.$$b     // Catch: java.lang.Throwable -> L5c7
            r3 = r3 & 12
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L5c7
            int r10 = r3 + (-4)
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L5c7
            int r15 = r10 + 1
            byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L5c7
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L5c7
            a(r3, r10, r15, r14)     // Catch: java.lang.Throwable -> L5c7
            r3 = r14[r7]     // Catch: java.lang.Throwable -> L5c7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5c7
            java.lang.Class[] r10 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> L5c7
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L5c7
            r10[r7] = r14     // Catch: java.lang.Throwable -> L5c7
            java.lang.Class<int[]> r14 = int[].class
            r10[r5] = r14     // Catch: java.lang.Throwable -> L5c7
            java.lang.Class<java.lang.String[][]> r14 = java.lang.String[][].class
            r10[r2] = r14     // Catch: java.lang.Throwable -> L5c7
            r14 = 4
            r15 = 64485(0xfbe5, float:9.0363E-41)
            r18 = r3
            r19 = r10
            java.lang.Object r3 = o.YY.EZpvd(r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L5c7
        L122:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L5c7
            r10 = 0
            java.lang.Object r3 = r3.invoke(r10, r12)     // Catch: java.lang.Throwable -> L5c7
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L5c7
            long r12 = r3.longValue()     // Catch: java.lang.Throwable -> L5c7
            int r3 = o.C57890yqu.OLrzqt
            r14 = r3 ^ 89
            r3 = r3 & 89
            int r3 = r3 << r5
            int r14 = r14 + r3
            int r3 = r14 % 128
            o.C57890yqu.KWHzl = r3
            int r14 = r14 % r2
            r3 = -1159684596(0xffffffffbae09e0c, float:-0.0017136945)
            long r14 = (long) r3
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            long r10 = r3.maxMemory()
            int r3 = (int) r10
            r10 = 221(0xdd, float:3.1E-43)
            long r10 = (long) r10
            long r10 = r10 * r14
            r5 = -219(0xffffffffffffff25, float:NaN)
            r19 = r8
            long r7 = (long) r5
            long r7 = r7 * r12
            long r10 = r10 + r7
            r5 = 220(0xdc, float:3.08E-43)
            long r7 = (long) r5
            r5 = -1
            r20 = r3
            long r2 = (long) r5
            long r21 = r14 ^ r2
            long r23 = r12 ^ r2
            long r21 = r21 | r23
            long r21 = r21 ^ r2
            r5 = r20
            r20 = r6
            long r5 = (long) r5
            long r24 = r5 ^ r2
            long r26 = r24 | r14
            long r26 = r26 | r12
            long r26 = r26 ^ r2
            long r21 = r21 | r26
            long r21 = r21 * r7
            long r10 = r10 + r21
            r1 = -440(0xfffffffffffffe48, float:NaN)
            long r0 = (long) r1
            long r21 = r24 | r12
            long r2 = r21 ^ r2
            long r2 = r2 | r14
            long r0 = r0 * r2
            long r10 = r10 + r0
            long r0 = r14 | r12
            long r0 = r0 | r5
            long r7 = r7 * r0
            long r10 = r10 + r7
            r0 = 1531588116(0x5b4a2e14, float:5.6908609E16)
            long r0 = (long) r0
            long r10 = r10 + r0
            r0 = 32
            long r0 = r10 >> r0
            int r0 = (int) r0
            r1 = -557077778(0xffffffffdecbaaee, float:-7.337902E18)
            r2 = r28
            r1 = r1 | r2
            int r1 = ~r1
            r3 = 16798976(0x1005500, float:2.3570872E-38)
            r1 = r1 | r3
            int r1 = r1 * (-283)
            r3 = 1896369322(0x71084caa, float:6.749223E29)
            int r1 = r1 + r3
            r3 = -540278802(0xffffffffdfcbffee, float:-2.9399459E19)
            r3 = r3 | r2
            int r3 = ~r3
            int r3 = r3 * 283
            int r1 = r1 + r3
            r0 = r0 & r1
            int r1 = o.C57890yqu.OLrzqt
            int r3 = r1 + 29
            int r5 = r3 % 128
            o.C57890yqu.KWHzl = r5
            r5 = 2
            int r3 = r3 % r5
            int r3 = (int) r10
            r5 = -391663108(0xffffffffe8a7b1fc, float:-6.3353475E24)
            r5 = r5 | r2
            int r5 = ~r5
            r6 = 307776514(0x12584c02, float:6.825127E-28)
            r5 = r5 | r6
            int r6 = r5 * 992
            r7 = -1537497691(0xffffffffa45ba5a5, float:-4.762836E-17)
            int r7 = r7 + r6
            r6 = -1745002925(0xffffffff97fd5e53, float:-1.6373553E-24)
            r6 = r19 | r6
            int r6 = ~r6
            r5 = r5 | r6
            int r5 = r5 * (-496)
            int r7 = r7 + r5
            r5 = -1828889518(0xffffffff92fd5c52, float:-1.5989303E-27)
            r5 = r5 | r2
            int r5 = r5 * 496
            int r7 = r7 + r5
            r3 = r3 & r7
            r5 = r0 ^ r3
            r0 = r0 & r3
            r0 = r0 | r5
            long r5 = (long) r0
            int r0 = (int) r5
            r3 = r1 & 9
            r1 = r1 | 9
            int r3 = r3 + r1
            int r1 = r3 % 128
            o.C57890yqu.KWHzl = r1
            r5 = 2
            int r3 = r3 % r5
            r0 = r0 ^ r9
            r3 = 4
            r5 = 5
            if (r0 == r2) goto L35d
            r6 = 0
            r4 = r4[r6]
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r7 = 1
            int[] r8 = new int[r7]
            r3[r6] = r8
            int[] r6 = new int[r7]
            r3[r7] = r6
            int[] r9 = new int[r7]
            r7 = 2
            r3[r7] = r9
            int r10 = r1 + 9
            int r11 = r10 % 128
            o.C57890yqu.OLrzqt = r11
            int r10 = r10 % r7
            if (r10 != 0) goto L213
            r5 = r3[r5]
            int[] r5 = (int[]) r5
            r7 = 1
            r5[r7] = r2
            r5 = 23
            r7 = r5
            r5 = 0
            goto L21a
        L213:
            int[] r9 = (int[]) r9
            r5 = 0
            r9[r5] = r2
            r7 = 16
        L21a:
            int[] r8 = (int[]) r8
            r8[r5] = r0
            r0 = -219244462(0xfffffffff2ee9852, float:-9.451722E30)
            r0 = r0 | r2
            int r0 = ~r0
            r5 = 82208(0x14120, float:1.15198E-40)
            r0 = r0 | r5
            int r5 = r0 * 992
            r8 = -2058374243(0xffffffff854fb39d, float:-9.766083E-36)
            int r8 = r8 + r5
            r5 = 2147221421(0x7ffbffad, float:NaN)
            r5 = r19 | r5
            int r5 = ~r5
            r0 = r0 | r5
            int r0 = r0 * (-496)
            int r8 = r8 + r0
            r0 = 1928059168(0x72ebd920, float:9.3429076E30)
            r0 = r0 | r2
            int r0 = r0 * 496
            int r8 = r8 + r0
            r0 = r1 & 111(0x6f, float:1.56E-43)
            r1 = r1 | 111(0x6f, float:1.56E-43)
            int r0 = r0 + r1
            int r1 = r0 % 128
            o.C57890yqu.OLrzqt = r1
            r5 = 2
            int r0 = r0 % r5
            int r0 = r7 * 471
            int r5 = r8 * 471
            int r5 = ~r5
            int r0 = r0 - r5
            r5 = 1
            int r0 = r0 - r5
            r9 = r7 ^ r8
            r10 = r7 & r8
            r9 = r9 | r10
            int r9 = r9 * (-470)
            int r9 = -r9
            int r9 = -r9
            r10 = r0 ^ r9
            r0 = r0 & r9
            int r0 = r0 << r5
            int r10 = r10 + r0
            int r0 = ~r7
            int r9 = ~r8
            r11 = r0 ^ r9
            r0 = r0 & r9
            r0 = r0 | r11
            int r0 = ~r0
            r11 = r1 | 105(0x69, float:1.47E-43)
            int r11 = r11 << r5
            r1 = r1 ^ 105(0x69, float:1.47E-43)
            int r11 = r11 - r1
            int r1 = r11 % 128
            o.C57890yqu.KWHzl = r1
            r5 = 2
            int r11 = r11 % r5
            if (r11 == 0) goto L2a0
            int r5 = ~r8
            r11 = r5 ^ r2
            r5 = r5 & r2
            r5 = r5 | r11
            int r5 = ~r5
            r11 = r0 ^ r5
            r0 = r0 & r5
            r0 = r0 | r11
            r5 = r20 ^ r7
            r11 = r20 & r7
            r5 = r5 | r11
            r11 = r5 ^ r8
            r5 = r5 & r8
            r5 = r5 | r11
            int r5 = ~r5
            r11 = r0 ^ r5
            r0 = r0 & r5
            r0 = r0 | r11
            int r0 = -r0
            int r0 = -r0
            r5 = r0 | (-470(0xfffffffffffffe2a, float:NaN))
            r11 = 1
            int r5 = r5 << r11
            r0 = r0 ^ (-470(0xfffffffffffffe2a, float:NaN))
            int r5 = r5 - r0
            int r0 = r10 >> r5
            r5 = r9 ^ r7
            r9 = r9 & r7
            r5 = r5 | r9
            r9 = r5 ^ r2
            r5 = r5 & r2
            r5 = r5 | r9
            goto L2ba
        L2a0:
            r5 = r9 ^ r2
            r9 = r9 & r2
            r5 = r5 | r9
            int r5 = ~r5
            r0 = r0 | r5
            r5 = r19 ^ r7
            r9 = r19 & r7
            r5 = r5 | r9
            r5 = r5 | r8
            int r5 = ~r5
            r0 = r0 | r5
            int r0 = r0 * (-470)
            r5 = r10 & r0
            r0 = r0 | r10
            int r0 = r0 + r5
            int r5 = ~r8
            r9 = r5 ^ r7
            r5 = r5 & r7
            r5 = r5 | r9
            r5 = r5 | r2
        L2ba:
            int r5 = ~r5
            r9 = r19 ^ r7
            r7 = r19 & r7
            r7 = r7 | r9
            r9 = r7 ^ r8
            r7 = r7 & r8
            r7 = r7 | r9
            int r7 = ~r7
            r8 = r5 ^ r7
            r5 = r5 & r7
            r5 = r5 | r8
            r7 = 470(0x1d6, float:6.59E-43)
            int r7 = r7 * r5
            int r5 = -r7
            int r5 = -r5
            r7 = r0 ^ r5
            r0 = r0 & r5
            r5 = 1
            int r0 = r0 << r5
            int r7 = r7 + r0
            int r0 = r7 * (-55)
            r8 = r29
            int r9 = r8 * (-55)
            r10 = r0 | r9
            int r10 = r10 << r5
            r0 = r0 ^ r9
            int r10 = r10 - r0
            r0 = r1 ^ 55
            r1 = r1 & 55
            int r1 = r1 << r5
            int r0 = r0 + r1
            int r1 = r0 % 128
            o.C57890yqu.OLrzqt = r1
            r1 = 2
            int r0 = r0 % r1
            r1 = 56
            if (r0 != 0) goto L31a
            r0 = r7 | r2
            int r0 = ~r0
            r0 = r0 | r8
            int r0 = r0 * r1
            int r10 = r10 * r0
            r0 = r7 ^ r8
            r2 = r7 & r8
            r0 = r0 | r2
            int r0 = ~r0
            int r0 = -r0
            int r0 = -r0
            int r0 = ~r0
            int r0 = (-57) - r0
            int r0 = r10 >> r0
            r2 = r19 ^ r8
            r5 = r19 & r8
            r2 = r2 | r5
            int r2 = ~r2
            r5 = r7 ^ r2
            r2 = r2 & r7
            r2 = r2 | r5
            int r1 = r1 << r2
            int r1 = -r1
            int r1 = ~r1
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 - r1
            int r1 = r0 >>> 31
            int r2 = ~r1
            r2 = r2 & r0
            int r0 = ~r0
            r0 = r0 & r1
            r0 = r0 | r2
            goto L349
        L31a:
            r0 = r7 ^ r2
            r2 = r2 & r7
            r0 = r0 | r2
            int r0 = ~r0
            r0 = r0 | r8
            int r0 = r0 * r1
            r2 = r10 & r0
            r0 = r0 | r10
            int r2 = r2 + r0
            r0 = r7 ^ r8
            r5 = r7 & r8
            r0 = r0 | r5
            int r0 = ~r0
            int r0 = r0 * (-56)
            int r0 = -r0
            int r0 = -r0
            r5 = r2 & r0
            r0 = r0 | r2
            int r5 = r5 + r0
            r0 = r19 ^ r8
            r2 = r19 & r8
            r0 = r0 | r2
            int r0 = ~r0
            r2 = r7 ^ r0
            r0 = r0 & r7
            r0 = r0 | r2
            int r0 = r0 * r1
            int r0 = -r0
            int r0 = -r0
            r1 = r5 ^ r0
            r0 = r0 & r5
            r2 = 1
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 << 13
            r0 = r0 ^ r1
        L349:
            int r1 = r0 >>> 17
            int r2 = ~r1
            r2 = r2 & r0
            int r0 = ~r0
            r0 = r0 & r1
            r0 = r0 | r2
            int r1 = r0 << 5
            r0 = r0 ^ r1
            int[] r6 = (int[]) r6
            r1 = 0
            r6[r1] = r0
            r0 = 3
            r3[r0] = r4
            goto L5c6
        L35d:
            r8 = r29
            r0 = 14
            int[] r0 = new int[r0]     // Catch: java.lang.Exception -> L42b
            r0 = {x0698: FILL_ARRAY_DATA , data: [446735532, 2022502068, -2073566363, -690556328, 324920486, 1072145000, 1984015851, 715322460, 933554616, -983905763, -1573081692, 391982491, 1706414271, 323559187} // fill-array     // Catch: java.lang.Exception -> L42b
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L42b
            r1 = 26
            b(r0, r1, r4)     // Catch: java.lang.Exception -> L42b
            r0 = 0
            r1 = r4[r0]     // Catch: java.lang.Exception -> L42b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L42b
            int r0 = o.C57890yqu.OLrzqt
            r4 = r0 & 15
            r0 = r0 | 15
            int r4 = r4 + r0
            int r0 = r4 % 128
            o.C57890yqu.KWHzl = r0
            r0 = 2
            int r4 = r4 % r0
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L42b
            r1 = 10
            int[] r1 = new int[r1]     // Catch: java.lang.Exception -> L42b
            r1 = {x06b8: FILL_ARRAY_DATA , data: [-544916578, 1213586543, -73016512, 1947778828, -709972086, -880520044, -192237286, -303595319, -1834884785, -552407987} // fill-array     // Catch: java.lang.Exception -> L42b
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L42b
            r4 = 18
            b(r1, r4, r6)     // Catch: java.lang.Exception -> L42b
            r1 = 0
            r4 = r6[r1]     // Catch: java.lang.Exception -> L42b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L42b
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L42b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r6)     // Catch: java.lang.Exception -> L42b
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L42b
            r6 = 0
            java.lang.Object r0 = r0.invoke(r6, r4)     // Catch: java.lang.Exception -> L42b
            if (r0 != 0) goto L42b
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L42b
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L42b
            r6 = 1
            int[] r7 = new int[r6]     // Catch: java.lang.Exception -> L42b
            r4[r1] = r7     // Catch: java.lang.Exception -> L42b
            int[] r1 = new int[r6]     // Catch: java.lang.Exception -> L42b
            r4[r6] = r1     // Catch: java.lang.Exception -> L42b
            int[] r9 = new int[r6]     // Catch: java.lang.Exception -> L42b
            r6 = 2
            r4[r6] = r9     // Catch: java.lang.Exception -> L42b
            int r10 = o.C57890yqu.OLrzqt
            r11 = r10 & 17
            r12 = r10 | 17
            int r11 = r11 + r12
            int r12 = r11 % 128
            o.C57890yqu.KWHzl = r12
            int r11 = r11 % r6
            int[] r9 = (int[]) r9     // Catch: java.lang.Exception -> L42b
            r11 = 0
            r9[r11] = r2     // Catch: java.lang.Exception -> L42b
            int r9 = r10 + 113
            int r12 = r9 % 128
            o.C57890yqu.KWHzl = r12
            int r9 = r9 % r6
            int[] r7 = (int[]) r7     // Catch: java.lang.Exception -> L42b
            r7[r11] = r2     // Catch: java.lang.Exception -> L42b
            r6 = 910968024(0x364c44d8, float:3.0438441E-6)
            r7 = r2 | r6
            int r7 = ~r7
            int r7 = r7 * 216
            r9 = 587382869(0x2302c055, float:7.088042E-18)
            int r9 = r9 + r7
            r7 = -1236319014(0xffffffffb64f44da, float:-3.088548E-6)
            r7 = r7 | r19
            int r7 = r7 * (-216)
            int r9 = r9 + r7
            r6 = r19 | r6
            int r6 = ~r6
            r7 = 1236335605(0x49b0fbf5, float:1449854.6)
            r6 = r6 | r7
            int r6 = r6 * 216
            int r9 = r9 + r6
            r6 = r8 & r9
            r7 = r8 | r9
            int r6 = r6 + r7
            int r7 = r6 << 13
            r9 = r6 & r7
            int r9 = ~r9
            r6 = r6 | r7
            r6 = r6 & r9
            int r7 = r6 >>> 17
            r9 = r6 & r7
            int r9 = ~r9
            r6 = r6 | r7
            r6 = r6 & r9
            int r7 = r6 << 5
            r9 = r6 & r7
            int r9 = ~r9
            r6 = r6 | r7
            r6 = r6 & r9
            int r10 = r10 + 55
            int r7 = r10 % 128
            o.C57890yqu.KWHzl = r7
            r9 = 2
            int r10 = r10 % r9
            int[] r1 = (int[]) r1     // Catch: java.lang.Exception -> L42b
            r9 = 0
            r1[r9] = r6     // Catch: java.lang.Exception -> L42b
            r1 = 3
            r4[r1] = r0     // Catch: java.lang.Exception -> L42b
            r0 = r7 & 99
            r1 = r7 | 99
            int r0 = r0 + r1
            int r1 = r0 % 128
            o.C57890yqu.OLrzqt = r1
            r1 = 2
            int r0 = r0 % r1
            r3 = r4
            goto L5c6
        L42b:
            r0 = 587020051(0x22fd3713, float:6.86341E-18)
            java.lang.Object r0 = o.YY.EZpvd(r0)
            if (r0 != 0) goto L455
            r9 = 117(0x75, float:1.64E-43)
            r10 = 4
            r11 = 13956(0x3684, float:1.9557E-41)
            r12 = 652081775(0x26ddfa6f, float:1.5402836E-15)
            r13 = 0
            r0 = -1
            byte r1 = (byte) r0
            int r0 = -r1
            byte r0 = (byte) r0
            int r4 = r0 + (-1)
            byte r4 = (byte) r4
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            a(r1, r0, r4, r7)
            r0 = 0
            r1 = r7[r0]
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14
            r15 = 0
            java.lang.Object r0 = o.YY.EZpvd(r9, r10, r11, r12, r13, r14, r15)
        L455:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            r1 = 0
            int r0 = r0.getInt(r1)
            if (r0 == 0) goto L46f
            r0 = r2 & 9
            int r0 = ~r0
            r1 = r2 | 9
            r0 = r0 & r1
            int r1 = o.C57890yqu.OLrzqt
            int r1 = r1 + 21
            int r4 = r1 % 128
            o.C57890yqu.KWHzl = r4
            r4 = 2
            int r1 = r1 % r4
            goto L47a
        L46f:
            r4 = 2
            int r0 = o.C57890yqu.OLrzqt
            int r0 = r0 + 57
            int r1 = r0 % 128
            o.C57890yqu.KWHzl = r1
            int r0 = r0 % r4
            r0 = r2
        L47a:
            r1 = 587020051(0x22fd3713, float:6.86341E-18)
            java.lang.Object r1 = o.YY.EZpvd(r1)
            if (r1 != 0) goto L4a4
            r9 = 117(0x75, float:1.64E-43)
            r10 = 4
            r11 = 13956(0x3684, float:1.9557E-41)
            r12 = 652081775(0x26ddfa6f, float:1.5402836E-15)
            r13 = 0
            r1 = -1
            byte r1 = (byte) r1
            int r4 = -r1
            byte r4 = (byte) r4
            int r6 = r4 + (-1)
            byte r6 = (byte) r6
            r7 = 1
            java.lang.Object[] r14 = new java.lang.Object[r7]
            a(r1, r4, r6, r14)
            r1 = 0
            r4 = r14[r1]
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            r15 = 0
            java.lang.Object r1 = o.YY.EZpvd(r9, r10, r11, r12, r13, r14, r15)
        L4a4:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r4 = 0
            int r1 = r1.getInt(r4)
            if (r1 == 0) goto L4b2
            r1 = 16
            r6 = r1
            r1 = 0
            goto L4b4
        L4b2:
            r1 = 0
            r6 = 0
        L4b4:
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r1 = o.C57890yqu.KWHzl
            r7 = r1 ^ 53
            r9 = r1 & 53
            r10 = 1
            int r9 = r9 << r10
            int r7 = r7 + r9
            int r9 = r7 % 128
            o.C57890yqu.OLrzqt = r9
            r9 = 2
            int r7 = r7 % r9
            if (r7 != 0) goto L4d8
            int[] r7 = new int[r10]
            r9 = 0
            r3[r9] = r7
            int[] r7 = new int[r10]
            r3[r9] = r7
            int[] r7 = new int[r10]
            r3[r5] = r7
            r7 = 2
            goto L4e6
        L4d8:
            r9 = 0
            int[] r5 = new int[r10]
            r3[r9] = r5
            int[] r5 = new int[r10]
            r3[r10] = r5
            int[] r5 = new int[r10]
            r7 = 2
            r3[r7] = r5
        L4e6:
            r5 = r3[r7]
            int[] r5 = (int[]) r5
            r5[r9] = r2
            r5 = r3[r9]
            int[] r5 = (int[]) r5
            r5[r9] = r0
            r0 = -577982024(0xffffffffdd8cb1b8, float:-1.26726082E18)
            r5 = r0 | r19
            int r5 = ~r5
            r7 = 1569321606(0x5d89f286, float:1.24251933E18)
            r5 = r5 | r7
            int r5 = r5 * (-235)
            r9 = -619094530(0xffffffffdb195dfe, float:-4.3169017E16)
            int r9 = r9 + r5
            r0 = r0 | r2
            int r0 = ~r0
            r0 = r0 | r7
            int r0 = r0 * (-470)
            int r9 = r9 + r0
            r0 = -577899586(0xffffffffdd8df3be, float:-1.27859101E18)
            r0 = r0 | r2
            int r0 = ~r0
            r5 = 1569239168(0x5d88b080, float:1.23118914E18)
            r0 = r0 | r5
            int r0 = r0 * 235
            int r9 = r9 + r0
            r0 = r9 ^ r6
            r5 = r9 & r6
            r6 = 1
            int r5 = r5 << r6
            int r0 = r0 + r5
            int r5 = r0 * (-244)
            int r7 = r8 * 246
            r9 = r5 | r7
            int r9 = r9 << r6
            r5 = r5 ^ r7
            int r9 = r9 - r5
            int r5 = ~r8
            int r6 = r1 + 89
            int r7 = r6 % 128
            o.C57890yqu.OLrzqt = r7
            r7 = 2
            int r6 = r6 % r7
            r7 = -245(0xffffffffffffff0b, float:NaN)
            if (r6 != 0) goto L54d
            r6 = r5 ^ r19
            r10 = r5 & r19
            r6 = r6 | r10
            int r6 = ~r6
            r10 = r5 ^ r0
            r5 = r5 & r0
            r5 = r5 | r10
            int r5 = ~r5
            r10 = r6 ^ r5
            r5 = r5 & r6
            r5 = r5 | r10
            int r5 = r7 % r5
            int r9 = r9 - r5
            int r5 = ~r8
            r6 = r5 ^ r2
            r5 = r5 & r2
            r5 = r5 | r6
            int r5 = ~r5
            int r5 = r7 << r5
            int r9 = r9 * r5
            goto L565
        L54d:
            r6 = r5 ^ r19
            r10 = r5 & r19
            r6 = r6 | r10
            int r6 = ~r6
            r5 = r5 | r0
            int r5 = ~r5
            r10 = r6 ^ r5
            r5 = r5 & r6
            r5 = r5 | r10
            int r5 = r5 * r7
            int r5 = ~r5
            int r9 = r9 - r5
            r5 = 1
            int r9 = r9 - r5
            int r6 = ~r8
            r6 = r6 | r2
            int r6 = ~r6
            int r6 = r6 * r7
            int r6 = ~r6
            int r9 = r9 - r6
            int r9 = r9 - r5
        L565:
            int r1 = r1 + 69
            int r5 = r1 % 128
            o.C57890yqu.OLrzqt = r5
            r6 = 2
            int r1 = r1 % r6
            r6 = 245(0xf5, float:3.43E-43)
            if (r1 != 0) goto L58c
            int r1 = ~r8
            r7 = r1 ^ r2
            r1 = r1 & r2
            r1 = r1 | r7
            int r1 = ~r1
            r2 = r0 ^ r1
            r0 = r0 & r1
            r0 = r0 | r2
            int r6 = r6 % r0
            int r9 = r9 % r6
            int r0 = r9 / 95
            int r1 = ~r0
            r1 = r1 & r9
            int r2 = ~r9
            r0 = r0 & r2
            r0 = r0 | r1
            int r1 = r0 + 24
            int r2 = ~r1
            r2 = r2 & r0
            int r0 = ~r0
            r0 = r0 & r1
            r0 = r0 | r2
            goto L5ac
        L58c:
            int r1 = ~r8
            r7 = r1 ^ r2
            r1 = r1 & r2
            r1 = r1 | r7
            int r1 = ~r1
            r2 = r0 ^ r1
            r0 = r0 & r1
            r0 = r0 | r2
            int r6 = r6 * r0
            r0 = r9 | r6
            r1 = 1
            int r0 = r0 << r1
            r1 = r9 ^ r6
            int r0 = r0 - r1
            int r1 = r0 << 13
            int r2 = ~r1
            r2 = r2 & r0
            int r0 = ~r0
            r0 = r0 & r1
            r0 = r0 | r2
            int r1 = r0 >>> 17
            r2 = r0 & r1
            int r2 = ~r2
            r0 = r0 | r1
            r0 = r0 & r2
        L5ac:
            int r1 = r0 << 5
            int r2 = ~r1
            r2 = r2 & r0
            int r0 = ~r0
            r0 = r0 & r1
            r0 = r0 | r2
            r1 = 1
            r1 = r3[r1]
            int[] r1 = (int[]) r1
            r2 = 0
            r1[r2] = r0
            r0 = 3
            r3[r0] = r4
            int r5 = r5 + 63
            int r0 = r5 % 128
            o.C57890yqu.KWHzl = r0
            r0 = 2
            int r5 = r5 % r0
        L5c6:
            return r3
        L5c7:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L5cf
            throw r1
        L5cf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C57890yqu.copydefault(int, int):java.lang.Object[]");
    }
}
