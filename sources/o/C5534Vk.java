package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.Vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5534Vk {
    public boolean AEQbTJ;
    public int AYXKKw;
    public final C5534Vk AhwBna;
    public int AkhnZx;
    public final AtomicReference<TaskDescription> DbNXlk;
    public boolean EZpvd;
    public Activity[] KWHzl;
    public int OLrzqt;
    public final int copydefault;
    public BitSet djBIcL;
    public final int gEmmrt;
    public java.lang.String[] isConnected;
    public int valueOf;

    public static int AEQbTJ(int i) {
        return i - (i >> 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return !this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this.OLrzqt;
    }

    public C5534Vk(int i) {
        this.AhwBna = null;
        this.gEmmrt = i;
        this.EZpvd = true;
        this.copydefault = -1;
        this.AEQbTJ = false;
        this.AYXKKw = 0;
        this.DbNXlk = new AtomicReference<>(TaskDescription.OLrzqt(64));
    }

    public C5534Vk(C5534Vk c5534Vk, int i, int i2, TaskDescription taskDescription) {
        this.AhwBna = c5534Vk;
        this.gEmmrt = i2;
        this.DbNXlk = null;
        this.copydefault = i;
        this.EZpvd = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        java.lang.String[] strArr = taskDescription.copydefault;
        this.isConnected = strArr;
        this.KWHzl = taskDescription.AEQbTJ;
        this.valueOf = taskDescription.KWHzl;
        this.AYXKKw = taskDescription.OLrzqt;
        int length = strArr.length;
        this.AkhnZx = AEQbTJ(length);
        this.OLrzqt = length - 1;
        this.AEQbTJ = true;
    }

    public static C5534Vk copydefault() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        return EZpvd((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    public static C5534Vk EZpvd(int i) {
        return new C5534Vk(i);
    }

    public C5534Vk KWHzl(int i) {
        return new C5534Vk(this, i, this.gEmmrt, this.DbNXlk.get());
    }

    public void djBIcL() {
        C5534Vk c5534Vk;
        if (EZpvd() && (c5534Vk = this.AhwBna) != null && this.EZpvd) {
            c5534Vk.AEQbTJ(new TaskDescription(this));
            this.AEQbTJ = true;
        }
    }

    public final void AEQbTJ(TaskDescription taskDescription) {
        int i = taskDescription.KWHzl;
        TaskDescription taskDescription2 = this.DbNXlk.get();
        if (i == taskDescription2.KWHzl) {
            return;
        }
        if (i > 12000) {
            taskDescription = TaskDescription.OLrzqt(64);
        }
        PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.DbNXlk, taskDescription2, taskDescription);
    }

    public java.lang.String AEQbTJ(char[] cArr, int i, int i2, int i3) {
        if (i2 < 1) {
            return "";
        }
        if (!this.EZpvd) {
            return new java.lang.String(cArr, i, i2);
        }
        int iOLrzqt = OLrzqt(i3);
        java.lang.String str = this.isConnected[iOLrzqt];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str;
                    }
                }
            }
            Activity activity = this.KWHzl[iOLrzqt >> 1];
            if (activity != null) {
                java.lang.String strEZpvd = activity.EZpvd(cArr, i, i2);
                if (strEZpvd != null) {
                    return strEZpvd;
                }
                java.lang.String strOLrzqt = OLrzqt(cArr, i, i2, activity.AEQbTJ);
                if (strOLrzqt != null) {
                    return strOLrzqt;
                }
            }
        }
        return EZpvd(cArr, i, i2, i3, iOLrzqt);
    }

    public final java.lang.String OLrzqt(char[] cArr, int i, int i2, Activity activity) {
        while (activity != null) {
            java.lang.String strEZpvd = activity.EZpvd(cArr, i, i2);
            if (strEZpvd != null) {
                return strEZpvd;
            }
            activity = activity.AEQbTJ;
        }
        return null;
    }

    public final java.lang.String EZpvd(char[] cArr, int i, int i2, int i3, int i4) {
        if (this.AEQbTJ) {
            KWHzl();
            this.AEQbTJ = false;
        } else if (this.valueOf >= this.AkhnZx) {
            OLrzqt();
            i4 = OLrzqt(KWHzl(cArr, i, i2));
        }
        java.lang.String str = new java.lang.String(cArr, i, i2);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this.copydefault)) {
            str = InternCache.instance.intern(str);
        }
        this.valueOf++;
        java.lang.String[] strArr = this.isConnected;
        if (strArr[i4] == null) {
            strArr[i4] = str;
        } else {
            int i5 = i4 >> 1;
            Activity activity = new Activity(str, this.KWHzl[i5]);
            int i6 = activity.KWHzl;
            if (i6 > 150) {
                EZpvd(i5, activity, i4);
            } else {
                this.KWHzl[i5] = activity;
                this.AYXKKw = java.lang.Math.max(i6, this.AYXKKw);
            }
        }
        return str;
    }

    public final void EZpvd(int i, Activity activity, int i2) {
        BitSet bitSet = this.djBIcL;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.djBIcL = bitSet2;
            bitSet2.set(i);
        } else if (bitSet.get(i)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this.copydefault)) {
                copydefault(150);
            }
            this.EZpvd = false;
        } else {
            this.djBIcL.set(i);
        }
        this.isConnected[i2] = activity.OLrzqt;
        this.KWHzl[i] = null;
        this.valueOf -= activity.KWHzl;
        this.AYXKKw = -1;
    }

    public int KWHzl(char[] cArr, int i, int i2) {
        int i3 = this.gEmmrt;
        for (int i4 = i; i4 < i2 + i; i4++) {
            i3 = (i3 * 33) + cArr[i4];
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public int copydefault(java.lang.String str) {
        int length = str.length();
        int iCharAt = this.gEmmrt;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt * 33) + str.charAt(i);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    public final void KWHzl() {
        java.lang.String[] strArr = this.isConnected;
        this.isConnected = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
        Activity[] activityArr = this.KWHzl;
        this.KWHzl = (Activity[]) java.util.Arrays.copyOf(activityArr, activityArr.length);
    }

    public final void OLrzqt() {
        java.lang.String[] strArr = this.isConnected;
        int length = strArr.length;
        int i = length + length;
        if (i > 65536) {
            this.valueOf = 0;
            this.EZpvd = false;
            this.isConnected = new java.lang.String[64];
            this.KWHzl = new Activity[32];
            this.OLrzqt = 63;
            this.AEQbTJ = false;
            return;
        }
        Activity[] activityArr = this.KWHzl;
        this.isConnected = new java.lang.String[i];
        this.KWHzl = new Activity[i >> 1];
        this.OLrzqt = i - 1;
        this.AkhnZx = AEQbTJ(i);
        int iMax = 0;
        int i2 = 0;
        for (java.lang.String str : strArr) {
            if (str != null) {
                i2++;
                int iOLrzqt = OLrzqt(copydefault(str));
                java.lang.String[] strArr2 = this.isConnected;
                if (strArr2[iOLrzqt] == null) {
                    strArr2[iOLrzqt] = str;
                } else {
                    int i3 = iOLrzqt >> 1;
                    Activity activity = new Activity(str, this.KWHzl[i3]);
                    this.KWHzl[i3] = activity;
                    iMax = java.lang.Math.max(iMax, activity.KWHzl);
                }
            }
        }
        for (int i4 = 0; i4 < (length >> 1); i4++) {
            for (Activity activity2 = activityArr[i4]; activity2 != null; activity2 = activity2.AEQbTJ) {
                i2++;
                java.lang.String str2 = activity2.OLrzqt;
                int iOLrzqt2 = OLrzqt(copydefault(str2));
                java.lang.String[] strArr3 = this.isConnected;
                if (strArr3[iOLrzqt2] == null) {
                    strArr3[iOLrzqt2] = str2;
                } else {
                    int i5 = iOLrzqt2 >> 1;
                    Activity activity3 = new Activity(str2, this.KWHzl[i5]);
                    this.KWHzl[i5] = activity3;
                    iMax = java.lang.Math.max(iMax, activity3.KWHzl);
                }
            }
        }
        this.AYXKKw = iMax;
        this.djBIcL = null;
        int i6 = this.valueOf;
        if (i2 != i6) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i2)));
        }
    }

    public void copydefault(int i) {
        throw new java.lang.IllegalStateException("Longest collision chain in symbol table (of size " + this.valueOf + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    /* JADX INFO: renamed from: o.Vk$Activity */
    public static final class Activity {
        public final Activity AEQbTJ;
        public final int KWHzl;
        public final java.lang.String OLrzqt;

        public Activity(java.lang.String str, Activity activity) {
            this.OLrzqt = str;
            this.AEQbTJ = activity;
            this.KWHzl = activity != null ? 1 + activity.KWHzl : 1;
        }

        public java.lang.String EZpvd(char[] cArr, int i, int i2) {
            if (this.OLrzqt.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.OLrzqt.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.OLrzqt;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: o.Vk$TaskDescription */
    public static final class TaskDescription {
        public final Activity[] AEQbTJ;
        public final int KWHzl;
        public final int OLrzqt;
        public final java.lang.String[] copydefault;

        public TaskDescription(int i, int i2, java.lang.String[] strArr, Activity[] activityArr) {
            this.KWHzl = i;
            this.OLrzqt = i2;
            this.copydefault = strArr;
            this.AEQbTJ = activityArr;
        }

        public TaskDescription(C5534Vk c5534Vk) {
            this.KWHzl = c5534Vk.valueOf;
            this.OLrzqt = c5534Vk.AYXKKw;
            this.copydefault = c5534Vk.isConnected;
            this.AEQbTJ = c5534Vk.KWHzl;
        }

        public static TaskDescription OLrzqt(int i) {
            return new TaskDescription(0, 0, new java.lang.String[i], new Activity[i >> 1]);
        }
    }
}
