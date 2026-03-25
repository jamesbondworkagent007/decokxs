package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.acQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7043acQ {

    /* JADX INFO: renamed from: o.acQ$ActionBar */
    public static abstract class ActionBar {
        public abstract void copydefault(Application application, TaskDescription taskDescription, boolean z);
    }

    /* JADX INFO: renamed from: o.acQ$Activity */
    public interface Activity {
        int KWHzl();

        boolean copydefault(int i, TaskDescription taskDescription);
    }

    /* JADX INFO: renamed from: o.acQ$StateListAnimator */
    public interface StateListAnimator {
        boolean AEQbTJ(int i, Application application, TaskDescription taskDescription);

        int KWHzl();

        boolean copydefault(java.lang.CharSequence charSequence, TaskDescription taskDescription);
    }

    /* JADX INFO: renamed from: o.acQ$Application */
    public static final class Application implements java.lang.CharSequence, java.lang.Cloneable, java.lang.Comparable<Application> {
        public int AEQbTJ;
        public java.lang.String KWHzl;
        public byte[] OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application KWHzl() {
            this.OLrzqt = null;
            this.AEQbTJ = 0;
            this.copydefault = 0;
            this.KWHzl = "";
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.CharSequence
        public int length() {
            return this.AEQbTJ;
        }

        public Application() {
            this.KWHzl = "";
        }

        public Application(byte[] bArr, int i, int i2) {
            this.OLrzqt = bArr;
            this.copydefault = i;
            this.AEQbTJ = i2;
        }

        public Application AEQbTJ(byte[] bArr, int i) {
            this.OLrzqt = bArr;
            this.copydefault = i;
            int i2 = 0;
            while (true) {
                this.AEQbTJ = i2;
                if (bArr[i + i2] == 0) {
                    this.KWHzl = null;
                    return this;
                }
                i2++;
            }
        }

        public Application AEQbTJ(java.lang.String str) {
            if (str.isEmpty()) {
                KWHzl();
            } else {
                this.OLrzqt = new byte[str.length()];
                this.copydefault = 0;
                this.AEQbTJ = str.length();
                for (int i = 0; i < this.AEQbTJ; i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt > 127) {
                        throw new java.lang.IllegalArgumentException('\"' + str + "\" is not an ASCII string");
                    }
                    this.OLrzqt[i] = (byte) cCharAt;
                }
                this.KWHzl = str;
            }
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Application clone() {
            try {
                return (Application) super.clone();
            } catch (java.lang.CloneNotSupportedException unused) {
                return null;
            }
        }

        @Override // java.lang.CharSequence
        public char charAt(int i) {
            return (char) this.OLrzqt[this.copydefault + i];
        }

        /* JADX DEBUG: Method merged with bridge method: subSequence(II)Ljava/lang/CharSequence; */
        @Override // java.lang.CharSequence
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Application subSequence(int i, int i2) {
            return new Application(this.OLrzqt, this.copydefault + i, i2 - i);
        }

        @Override // java.lang.CharSequence
        public java.lang.String toString() {
            if (this.KWHzl == null) {
                this.KWHzl = copydefault(0, this.AEQbTJ);
            }
            return this.KWHzl;
        }

        public final java.lang.String copydefault(int i, int i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(i2 - i);
            while (i < i2) {
                sb.append((char) this.OLrzqt[this.copydefault + i]);
                i++;
            }
            return sb.toString();
        }

        public java.lang.String OLrzqt(int i, int i2) {
            return copydefault(i, i2);
        }

        public final boolean copydefault(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.OLrzqt[this.copydefault + i3] != bArr[i + i3]) {
                    return false;
                }
            }
            return true;
        }

        public final boolean copydefault(int i, java.lang.CharSequence charSequence, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.OLrzqt[this.copydefault + i + i3] != charSequence.charAt(i3)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            int i = this.AEQbTJ;
            return i == application.AEQbTJ && copydefault(application.OLrzqt, application.copydefault, i);
        }

        public boolean copydefault(java.lang.CharSequence charSequence) {
            if (charSequence == null) {
                return false;
            }
            if (this != charSequence) {
                int length = charSequence.length();
                int i = this.AEQbTJ;
                if (length != i || !copydefault(0, charSequence, i)) {
                    return false;
                }
            }
            return true;
        }

        public boolean OLrzqt(java.lang.CharSequence charSequence) {
            int length = charSequence.length();
            return length <= this.AEQbTJ && copydefault(0, charSequence, length);
        }

        public boolean KWHzl(java.lang.CharSequence charSequence) {
            int length = charSequence.length();
            int i = this.AEQbTJ;
            return length <= i && copydefault(i - length, charSequence, length);
        }

        public int hashCode() {
            if (this.AEQbTJ == 0) {
                return 0;
            }
            int i = this.OLrzqt[this.copydefault];
            for (int i2 = 1; i2 < this.AEQbTJ; i2++) {
                i = (i * 37) + this.OLrzqt[this.copydefault];
            }
            return i;
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public int compareTo(Application application) {
            return EZpvd(application);
        }

        public int EZpvd(java.lang.CharSequence charSequence) {
            int length = charSequence.length();
            int i = this.AEQbTJ;
            if (i > length) {
                i = length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                int iCharAt = charAt(i2) - charSequence.charAt(i2);
                if (iCharAt != 0) {
                    return iCharAt;
                }
            }
            return this.AEQbTJ - length;
        }
    }

    /* JADX INFO: renamed from: o.acQ$TaskDescription */
    public static abstract class TaskDescription {
        public abstract java.lang.String AEQbTJ();

        public abstract java.lang.String[] AYXKKw();

        public abstract int AhwBna();

        public abstract java.nio.ByteBuffer EZpvd();

        public abstract int KWHzl();

        public abstract Activity OLrzqt();

        public abstract int[] copydefault();

        public abstract java.lang.String djBIcL();

        public abstract java.lang.String[] gEmmrt();

        public abstract StateListAnimator valueOf();

        public java.lang.String toString() {
            int iAhwBna = AhwBna();
            if (iAhwBna == 0) {
                return djBIcL();
            }
            if (iAhwBna == 1) {
                return "(binary blob)";
            }
            if (iAhwBna == 2) {
                return "(table)";
            }
            if (iAhwBna == 7) {
                return java.lang.Integer.toString(KWHzl());
            }
            if (iAhwBna == 8) {
                return "(array)";
            }
            if (iAhwBna != 14) {
                return "???";
            }
            int[] iArrCopydefault = copydefault();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(iArrCopydefault.length);
            sb.append("]{");
            if (iArrCopydefault.length != 0) {
                sb.append(iArrCopydefault[0]);
                for (int i = 1; i < iArrCopydefault.length; i++) {
                    sb.append(", ");
                    sb.append(iArrCopydefault[i]);
                }
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }
    }
}
