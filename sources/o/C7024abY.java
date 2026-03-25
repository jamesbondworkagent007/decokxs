package o;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.ibm.icu.util.ICUUncheckedIOException;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: o.abY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7024abY {
    public static final java.util.List<Activity> copydefault;

    /* JADX INFO: renamed from: o.abY$ActionBar */
    public interface ActionBar {
        boolean AEQbTJ(byte[] bArr);
    }

    /* JADX INFO: renamed from: o.abY$Application */
    public static final class Application {
        public static final Activity KWHzl = new Activity();

        private Application() {
        }

        /* JADX INFO: renamed from: o.abY$Application$Activity */
        public static final class Activity implements ActionBar {
            private Activity() {
            }

            @Override // o.C7024abY.ActionBar
            public boolean AEQbTJ(byte[] bArr) {
                return bArr[0] == 1;
            }
        }

        public static boolean OLrzqt(java.nio.ByteBuffer byteBuffer) {
            int i;
            try {
                C7024abY.OLrzqt(byteBuffer, 1131245124, KWHzl);
                i = byteBuffer.getInt(byteBuffer.position());
            } catch (java.io.IOException unused) {
            }
            return i > 0 && (byteBuffer.position() + 4) + (i * 24) <= byteBuffer.capacity() && OLrzqt(byteBuffer, EZpvd(byteBuffer, 0)) && OLrzqt(byteBuffer, EZpvd(byteBuffer, i - 1));
        }

        public static boolean OLrzqt(java.nio.ByteBuffer byteBuffer, int i) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (byteBuffer.get(i + i2) != "icudt68b".charAt(i2)) {
                    return false;
                }
            }
            byte b = byteBuffer.get(i + 7);
            return (b == 98 || b == 108) && byteBuffer.get(i + 8) == 47;
        }

        public static java.nio.ByteBuffer copydefault(java.nio.ByteBuffer byteBuffer, java.lang.CharSequence charSequence) {
            int iKWHzl = KWHzl(byteBuffer, charSequence);
            if (iKWHzl < 0) {
                return null;
            }
            java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.position(copydefault(byteBuffer, iKWHzl));
            byteBufferDuplicate.limit(copydefault(byteBuffer, iKWHzl + 1));
            return C7024abY.AEQbTJ(byteBufferDuplicate);
        }

        public static void EZpvd(java.nio.ByteBuffer byteBuffer, java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
            int iKWHzl = KWHzl(byteBuffer, str);
            if (iKWHzl < 0) {
                iKWHzl = ~iKWHzl;
            }
            int i = byteBuffer.getInt(byteBuffer.position());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (iKWHzl < i && copydefault(byteBuffer, iKWHzl, str, str2, sb, set)) {
                iKWHzl++;
            }
        }

        public static int KWHzl(java.nio.ByteBuffer byteBuffer, java.lang.CharSequence charSequence) {
            int i = byteBuffer.getInt(byteBuffer.position());
            int i2 = 0;
            while (i2 < i) {
                int i3 = (i2 + i) >>> 1;
                int iOLrzqt = C7024abY.OLrzqt(charSequence, byteBuffer, EZpvd(byteBuffer, i3) + 9);
                if (iOLrzqt < 0) {
                    i = i3;
                } else {
                    if (iOLrzqt <= 0) {
                        return i3;
                    }
                    i2 = i3 + 1;
                }
            }
            return ~i2;
        }

        public static int EZpvd(java.nio.ByteBuffer byteBuffer, int i) {
            int iPosition = byteBuffer.position();
            return iPosition + byteBuffer.getInt(iPosition + 4 + (i * 8));
        }

        public static int copydefault(java.nio.ByteBuffer byteBuffer, int i) {
            int iPosition = byteBuffer.position();
            if (i == byteBuffer.getInt(iPosition)) {
                return byteBuffer.capacity();
            }
            return iPosition + byteBuffer.getInt(iPosition + 8 + (i * 8));
        }

        public static boolean copydefault(java.nio.ByteBuffer byteBuffer, int i, java.lang.String str, java.lang.String str2, java.lang.StringBuilder sb, java.util.Set<java.lang.String> set) {
            int iEZpvd = EZpvd(byteBuffer, i) + 9;
            if (str.length() != 0) {
                int i2 = 0;
                while (i2 < str.length()) {
                    if (byteBuffer.get(iEZpvd) != str.charAt(i2)) {
                        return false;
                    }
                    i2++;
                    iEZpvd++;
                }
                if (byteBuffer.get(iEZpvd) != 47) {
                    return false;
                }
                iEZpvd++;
            }
            sb.setLength(0);
            while (true) {
                byte b = byteBuffer.get(iEZpvd);
                if (b == 0) {
                    int length = sb.length() - str2.length();
                    if (sb.lastIndexOf(str2, length) >= 0) {
                        set.add(sb.substring(0, length));
                    }
                    return true;
                }
                char c = (char) b;
                if (c == '/') {
                    return true;
                }
                sb.append(c);
                iEZpvd++;
            }
        }
    }

    /* JADX INFO: renamed from: o.abY$Activity */
    public static abstract class Activity {
        public final java.lang.String AEQbTJ;

        public abstract java.nio.ByteBuffer OLrzqt(java.lang.String str);

        public abstract void copydefault(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return this.AEQbTJ;
        }

        public Activity(java.lang.String str) {
            this.AEQbTJ = str;
        }
    }

    /* JADX INFO: renamed from: o.abY$StateListAnimator */
    public static final class StateListAnimator extends Activity {
        public final java.io.File copydefault;

        public StateListAnimator(java.lang.String str, java.io.File file) {
            super(str);
            this.copydefault = file;
        }

        @Override // o.C7024abY.Activity
        public java.lang.String toString() {
            return this.copydefault.toString();
        }

        @Override // o.C7024abY.Activity
        public java.nio.ByteBuffer OLrzqt(java.lang.String str) {
            if (str.equals(this.AEQbTJ)) {
                return C7024abY.OLrzqt(this.copydefault);
            }
            return null;
        }

        @Override // o.C7024abY.Activity
        public void copydefault(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
            if (this.AEQbTJ.length() > str.length() + str2.length() && this.AEQbTJ.startsWith(str) && this.AEQbTJ.endsWith(str2) && this.AEQbTJ.charAt(str.length()) == '/' && this.AEQbTJ.indexOf(47, str.length() + 1) < 0) {
                set.add(this.AEQbTJ.substring(str.length() + 1, this.AEQbTJ.length() - str2.length()));
            }
        }
    }

    /* JADX INFO: renamed from: o.abY$TaskDescription */
    public static final class TaskDescription extends Activity {
        public final java.nio.ByteBuffer copydefault;

        public TaskDescription(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
            super(str);
            this.copydefault = byteBuffer;
        }

        @Override // o.C7024abY.Activity
        public java.nio.ByteBuffer OLrzqt(java.lang.String str) {
            return Application.copydefault(this.copydefault, str);
        }

        @Override // o.C7024abY.Activity
        public void copydefault(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
            Application.EZpvd(this.copydefault, str, str2, set);
        }
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        copydefault = arrayList;
        java.lang.String strAEQbTJ = C7053aca.AEQbTJ(C7024abY.class.getName() + ".dataPath");
        if (strAEQbTJ != null) {
            KWHzl(strAEQbTJ, arrayList);
        }
    }

    public static void KWHzl(java.lang.String str, java.util.List<Activity> list) {
        int i = 0;
        while (i < str.length()) {
            int iIndexOf = str.indexOf(java.io.File.pathSeparatorChar, i);
            java.lang.String strTrim = str.substring(i, iIndexOf >= 0 ? iIndexOf : str.length()).trim();
            if (strTrim.endsWith(java.io.File.separator)) {
                strTrim = strTrim.substring(0, strTrim.length() - 1);
            }
            if (strTrim.length() != 0) {
                OLrzqt(new java.io.File(strTrim), new java.lang.StringBuilder(), copydefault);
            }
            if (iIndexOf < 0) {
                return;
            } else {
                i = iIndexOf + 1;
            }
        }
    }

    public static void OLrzqt(java.io.File file, java.lang.StringBuilder sb, java.util.List<Activity> list) {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        int length = sb.length();
        if (length > 0) {
            sb.append(JsonPointer.SEPARATOR);
            length++;
        }
        for (java.io.File file2 : fileArrListFiles) {
            java.lang.String name = file2.getName();
            if (!name.endsWith(".txt")) {
                sb.append(name);
                if (file2.isDirectory()) {
                    OLrzqt(file2, sb, list);
                } else if (name.endsWith(".dat")) {
                    java.nio.ByteBuffer byteBufferOLrzqt = OLrzqt(file2);
                    if (byteBufferOLrzqt != null && Application.OLrzqt(byteBufferOLrzqt)) {
                        list.add(new TaskDescription(sb.toString(), byteBufferOLrzqt));
                    }
                } else {
                    list.add(new StateListAnimator(sb.toString(), file2));
                }
                sb.setLength(length);
            }
        }
    }

    public static int OLrzqt(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer, int i) {
        int i2 = 0;
        while (true) {
            byte b = byteBuffer.get(i);
            if (b == 0) {
                return i2 == charSequence.length() ? 0 : 1;
            }
            if (i2 == charSequence.length()) {
                return -1;
            }
            int iCharAt = charSequence.charAt(i2) - b;
            if (iCharAt != 0) {
                return iCharAt;
            }
            i2++;
            i++;
        }
    }

    public static int AEQbTJ(java.lang.CharSequence charSequence, byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            byte b = bArr[i];
            if (b == 0) {
                return i2 == charSequence.length() ? 0 : 1;
            }
            if (i2 == charSequence.length()) {
                return -1;
            }
            int iCharAt = charSequence.charAt(i2) - b;
            if (iCharAt != 0) {
                return iCharAt;
            }
            i2++;
            i++;
        }
    }

    public static java.nio.ByteBuffer OLrzqt(java.lang.String str) {
        return EZpvd(null, null, str, false);
    }

    public static java.nio.ByteBuffer OLrzqt(java.lang.ClassLoader classLoader, java.lang.String str, java.lang.String str2) {
        return EZpvd(classLoader, str, str2, false);
    }

    public static java.nio.ByteBuffer copydefault(java.lang.String str) {
        return EZpvd(null, null, str, true);
    }

    public static java.nio.ByteBuffer EZpvd(java.lang.ClassLoader classLoader, java.lang.String str, java.lang.String str2, boolean z) {
        java.nio.ByteBuffer byteBufferKWHzl = KWHzl(str2);
        if (byteBufferKWHzl != null) {
            return byteBufferKWHzl;
        }
        if (classLoader == null) {
            classLoader = C7016abQ.EZpvd(C7055acc.class);
        }
        if (str == null) {
            str = "com/ibm/icu/impl/data/icudt68b/" + str2;
        }
        try {
            java.io.InputStream inputStreamAEQbTJ = C7055acc.AEQbTJ(classLoader, str, z);
            if (inputStreamAEQbTJ == null) {
                return null;
            }
            return AEQbTJ(inputStreamAEQbTJ);
        } catch (java.io.IOException e) {
            throw new ICUUncheckedIOException(e);
        }
    }

    public static java.nio.ByteBuffer KWHzl(java.lang.String str) {
        java.util.Iterator<Activity> it = copydefault.iterator();
        while (it.hasNext()) {
            java.nio.ByteBuffer byteBufferOLrzqt = it.next().OLrzqt(str);
            if (byteBufferOLrzqt != null) {
                return byteBufferOLrzqt;
            }
        }
        return null;
    }

    public static java.nio.ByteBuffer OLrzqt(java.io.File file) {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            java.nio.channels.FileChannel channel = fileInputStream.getChannel();
            try {
                return channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            } finally {
                fileInputStream.close();
            }
        } catch (java.io.FileNotFoundException e) {
            java.lang.System.err.println(e);
            return null;
        } catch (java.io.IOException e2) {
            java.lang.System.err.println(e2);
            return null;
        }
    }

    public static void OLrzqt(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
        java.util.Iterator<Activity> it = copydefault.iterator();
        while (it.hasNext()) {
            it.next().copydefault(str, str2, set);
        }
    }

    public static C7258agT EZpvd(java.nio.ByteBuffer byteBuffer, int i, ActionBar actionBar) throws java.io.IOException {
        return OLrzqt(OLrzqt(byteBuffer, i, actionBar));
    }

    public static int OLrzqt(java.nio.ByteBuffer byteBuffer, int i, ActionBar actionBar) throws java.io.IOException {
        byte b = byteBuffer.get(2);
        byte b2 = byteBuffer.get(3);
        if (b != -38 || b2 != 39) {
            throw new java.io.IOException("ICU data file error: Not an ICU data file");
        }
        byte b3 = byteBuffer.get(8);
        byte b4 = byteBuffer.get(9);
        byte b5 = byteBuffer.get(10);
        if (b3 < 0 || 1 < b3 || b4 != 0 || b5 != 2) {
            throw new java.io.IOException("ICU data file error: Header authentication failed, please check if you have a valid ICU data file");
        }
        byteBuffer.order(b3 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        char c = byteBuffer.getChar(0);
        char c2 = byteBuffer.getChar(4);
        if (c2 < 20 || c < c2 + 4) {
            throw new java.io.IOException("Internal Error: Header size error");
        }
        byte[] bArr = {byteBuffer.get(16), byteBuffer.get(17), byteBuffer.get(18), byteBuffer.get(19)};
        if (byteBuffer.get(12) != ((byte) (i >> 24)) || byteBuffer.get(13) != ((byte) (i >> 16)) || byteBuffer.get(14) != ((byte) (i >> 8)) || byteBuffer.get(15) != ((byte) i) || (actionBar != null && !actionBar.AEQbTJ(bArr))) {
            throw new java.io.IOException("ICU data file error: Header authentication failed, please check if you have a valid ICU data file" + java.lang.String.format("; data format %02x%02x%02x%02x, format version %d.%d.%d.%d", java.lang.Byte.valueOf(byteBuffer.get(12)), java.lang.Byte.valueOf(byteBuffer.get(13)), java.lang.Byte.valueOf(byteBuffer.get(14)), java.lang.Byte.valueOf(byteBuffer.get(15)), java.lang.Integer.valueOf(bArr[0] & UnsignedBytes.MAX_VALUE), java.lang.Integer.valueOf(bArr[1] & UnsignedBytes.MAX_VALUE), java.lang.Integer.valueOf(bArr[2] & UnsignedBytes.MAX_VALUE), java.lang.Integer.valueOf(bArr[3] & UnsignedBytes.MAX_VALUE)));
        }
        byteBuffer.position(c);
        return (byteBuffer.get(23) & UnsignedBytes.MAX_VALUE) | (byteBuffer.get(20) << Ascii.CAN) | ((byteBuffer.get(21) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(22) & UnsignedBytes.MAX_VALUE) << 8);
    }

    public static void EZpvd(java.nio.ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    public static byte[] copydefault(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (i2 > 0) {
            EZpvd(byteBuffer, i2);
        }
        return bArr;
    }

    public static java.lang.String AEQbTJ(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        java.lang.String string = byteBuffer.asCharBuffer().subSequence(0, i).toString();
        EZpvd(byteBuffer, (i * 2) + i2);
        return string;
    }

    public static char[] OLrzqt(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        char[] cArr = new char[i];
        byteBuffer.asCharBuffer().get(cArr);
        EZpvd(byteBuffer, (i * 2) + i2);
        return cArr;
    }

    public static int[] EZpvd(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        int[] iArr = new int[i];
        byteBuffer.asIntBuffer().get(iArr);
        EZpvd(byteBuffer, (i * 4) + i2);
        return iArr;
    }

    public static long[] KWHzl(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        long[] jArr = new long[i];
        byteBuffer.asLongBuffer().get(jArr);
        EZpvd(byteBuffer, (i * 8) + i2);
        return jArr;
    }

    public static java.nio.ByteBuffer AEQbTJ(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer.slice().order(byteBuffer.order());
    }

    public static java.nio.ByteBuffer AEQbTJ(java.io.InputStream inputStream) throws java.io.IOException {
        try {
            int iAvailable = inputStream.available();
            byte[] bArrCopyOf = iAvailable > 32 ? new byte[iAvailable] : new byte[128];
            int i = 0;
            while (true) {
                if (i < bArrCopyOf.length) {
                    int i2 = inputStream.read(bArrCopyOf, i, bArrCopyOf.length - i);
                    if (i2 < 0) {
                        break;
                    }
                    i += i2;
                } else {
                    int i3 = inputStream.read();
                    if (i3 < 0) {
                        break;
                    }
                    int length = bArrCopyOf.length;
                    int i4 = length * 2;
                    if (i4 < 128) {
                        i4 = 128;
                    } else if (i4 < 16384) {
                        i4 = length * 4;
                    }
                    bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, i4);
                    bArrCopyOf[i] = (byte) i3;
                    i++;
                }
            }
            return java.nio.ByteBuffer.wrap(bArrCopyOf, 0, i);
        } finally {
            inputStream.close();
        }
    }

    public static C7258agT OLrzqt(int i) {
        return C7258agT.AEQbTJ(i >>> 24, (i >> 16) & 255, (i >> 8) & 255, i & 255);
    }
}
