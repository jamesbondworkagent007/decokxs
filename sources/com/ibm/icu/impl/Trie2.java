package com.ibm.icu.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.C7024abY;
import o.C7032acF;
import o.C7033acG;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Trie2 implements Iterable<TaskDescription> {
    public static ActionBar EZpvd = new ActionBar() { // from class: com.ibm.icu.impl.Trie2.3
        @Override // com.ibm.icu.impl.Trie2.ActionBar
        public int OLrzqt(int i) {
            return i;
        }
    };
    public int[] AEQbTJ;
    public int AYXKKw;
    public Activity AhwBna;
    public int DbNXlk;
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;
    public int djBIcL;
    public char[] fetchVPNInfo;
    public int gEmmrt;
    public int isConnected;
    public int valueOf;
    public int values;

    public interface ActionBar {
        int OLrzqt(int i);
    }

    public static class Activity {
        public int AEQbTJ;
        public int AYXKKw;
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public int copydefault;
        public int djBIcL;
    }

    public enum ValueWidth {
        BITS_16,
        BITS_32
    }

    public static int copydefault() {
        return -2128831035;
    }

    public static int copydefault(int i, int i2) {
        return (i * 16777619) ^ i2;
    }

    public abstract int EZpvd(char c);

    public abstract int OLrzqt(int i);

    public static Trie2 OLrzqt(ByteBuffer byteBuffer) throws IOException {
        ValueWidth valueWidth;
        Trie2 c7033acG;
        ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            Activity activity = new Activity();
            int i = byteBuffer.getInt();
            activity.AYXKKw = i;
            if (i == 845771348) {
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                if (byteOrderOrder == byteOrder) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                byteBuffer.order(byteOrder);
                activity.AYXKKw = 1416784178;
            } else if (i != 1416784178) {
                throw new IllegalArgumentException("Buffer does not contain a serialized UTrie2");
            }
            activity.KWHzl = byteBuffer.getChar();
            activity.OLrzqt = byteBuffer.getChar();
            activity.EZpvd = byteBuffer.getChar();
            activity.copydefault = byteBuffer.getChar();
            activity.AEQbTJ = byteBuffer.getChar();
            activity.djBIcL = byteBuffer.getChar();
            int i2 = activity.KWHzl & 15;
            if (i2 > 1) {
                throw new IllegalArgumentException("UTrie2 serialized format error.");
            }
            if (i2 == 0) {
                valueWidth = ValueWidth.BITS_16;
                c7033acG = new C7032acF();
            } else {
                valueWidth = ValueWidth.BITS_32;
                c7033acG = new C7033acG();
            }
            c7033acG.AhwBna = activity;
            int i3 = activity.OLrzqt;
            c7033acG.isConnected = i3;
            int i4 = activity.EZpvd << 2;
            c7033acG.KWHzl = i4;
            c7033acG.values = activity.copydefault;
            c7033acG.OLrzqt = activity.AEQbTJ;
            c7033acG.valueOf = activity.djBIcL << 11;
            int i5 = i4 - 4;
            c7033acG.gEmmrt = i5;
            ValueWidth valueWidth2 = ValueWidth.BITS_16;
            if (valueWidth == valueWidth2) {
                c7033acG.gEmmrt = i5 + i3;
            }
            if (valueWidth == valueWidth2) {
                i3 += i4;
            }
            c7033acG.fetchVPNInfo = C7024abY.OLrzqt(byteBuffer, i3, 0);
            if (valueWidth == valueWidth2) {
                c7033acG.copydefault = c7033acG.isConnected;
            } else {
                c7033acG.AEQbTJ = C7024abY.EZpvd(byteBuffer, c7033acG.KWHzl, 0);
            }
            int i6 = AnonymousClass2.AEQbTJ[valueWidth.ordinal()];
            if (i6 == 1) {
                c7033acG.AEQbTJ = null;
                char[] cArr = c7033acG.fetchVPNInfo;
                c7033acG.DbNXlk = cArr[c7033acG.OLrzqt];
                c7033acG.djBIcL = cArr[c7033acG.copydefault + 128];
            } else if (i6 == 2) {
                c7033acG.copydefault = 0;
                int[] iArr = c7033acG.AEQbTJ;
                c7033acG.DbNXlk = iArr[c7033acG.OLrzqt];
                c7033acG.djBIcL = iArr[128];
            } else {
                throw new IllegalArgumentException("UTrie2 serialized format error.");
            }
            return c7033acG;
        } finally {
            byteBuffer.order(byteOrderOrder);
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.impl.Trie2$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[ValueWidth.values().length];
            AEQbTJ = iArr;
            try {
                iArr[ValueWidth.BITS_16.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[ValueWidth.BITS_32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Trie2)) {
            return false;
        }
        Trie2 trie2 = (Trie2) obj;
        Iterator<TaskDescription> it = trie2.iterator();
        for (TaskDescription taskDescription : this) {
            if (!it.hasNext() || !taskDescription.equals(it.next())) {
                return false;
            }
        }
        return !it.hasNext() && this.djBIcL == trie2.djBIcL && this.DbNXlk == trie2.DbNXlk;
    }

    public int hashCode() {
        if (this.AYXKKw == 0) {
            int iCopydefault = copydefault();
            Iterator<TaskDescription> it = iterator();
            while (it.hasNext()) {
                iCopydefault = OLrzqt(iCopydefault, it.next().hashCode());
            }
            if (iCopydefault == 0) {
                iCopydefault = 1;
            }
            this.AYXKKw = iCopydefault;
        }
        return this.AYXKKw;
    }

    public static class TaskDescription {
        public int AEQbTJ;
        public boolean EZpvd;
        public int KWHzl;
        public int OLrzqt;

        public boolean equals(Object obj) {
            if (obj != null && obj.getClass().equals(getClass())) {
                TaskDescription taskDescription = (TaskDescription) obj;
                if (this.KWHzl == taskDescription.KWHzl && this.OLrzqt == taskDescription.OLrzqt && this.AEQbTJ == taskDescription.AEQbTJ && this.EZpvd == taskDescription.EZpvd) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Trie2.copydefault(Trie2.OLrzqt(Trie2.valueOf(Trie2.valueOf(Trie2.copydefault(), this.KWHzl), this.OLrzqt), this.AEQbTJ), this.EZpvd ? 1 : 0);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<TaskDescription> iterator() {
        return OLrzqt(EZpvd);
    }

    public Iterator<TaskDescription> OLrzqt(ActionBar actionBar) {
        return new Application(actionBar);
    }

    public class Application implements Iterator<TaskDescription> {
        public ActionBar OLrzqt;
        public TaskDescription djBIcL = new TaskDescription();
        public boolean KWHzl = true;
        public int EZpvd = 0;
        public int AEQbTJ = 1114112;
        public boolean copydefault = true;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return (this.KWHzl && (this.copydefault || this.EZpvd < this.AEQbTJ)) || this.EZpvd < 56320;
        }

        public Application(ActionBar actionBar) {
            this.OLrzqt = actionBar;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public TaskDescription next() {
            int iOLrzqt;
            int iKWHzl;
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.EZpvd >= this.AEQbTJ) {
                this.KWHzl = false;
                this.EZpvd = 55296;
            }
            if (this.KWHzl) {
                int iOLrzqt2 = Trie2.this.OLrzqt(this.EZpvd);
                iOLrzqt = this.OLrzqt.OLrzqt(iOLrzqt2);
                iKWHzl = Trie2.this.EZpvd(this.EZpvd, this.AEQbTJ, iOLrzqt2);
                while (iKWHzl < this.AEQbTJ - 1) {
                    int i = iKWHzl + 1;
                    int iOLrzqt3 = Trie2.this.OLrzqt(i);
                    if (this.OLrzqt.OLrzqt(iOLrzqt3) != iOLrzqt) {
                        break;
                    }
                    iKWHzl = Trie2.this.EZpvd(i, this.AEQbTJ, iOLrzqt3);
                }
            } else {
                iOLrzqt = this.OLrzqt.OLrzqt(Trie2.this.EZpvd((char) this.EZpvd));
                iKWHzl = KWHzl((char) this.EZpvd);
                while (iKWHzl < 56319) {
                    char c = (char) (iKWHzl + 1);
                    if (this.OLrzqt.OLrzqt(Trie2.this.EZpvd(c)) != iOLrzqt) {
                        break;
                    }
                    iKWHzl = KWHzl(c);
                }
            }
            TaskDescription taskDescription = this.djBIcL;
            taskDescription.KWHzl = this.EZpvd;
            taskDescription.OLrzqt = iKWHzl;
            taskDescription.AEQbTJ = iOLrzqt;
            taskDescription.EZpvd = !this.KWHzl;
            this.EZpvd = iKWHzl + 1;
            return taskDescription;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public final int KWHzl(char c) {
            if (c >= 56319) {
                return 56319;
            }
            int iEZpvd = Trie2.this.EZpvd(c);
            int i = c;
            while (true) {
                int i2 = i + 1;
                if (i2 > 56319 || Trie2.this.EZpvd((char) i2) != iEZpvd) {
                    break;
                }
                i = i2;
            }
            return i;
        }
    }

    public int EZpvd(int i, int i2, int i3) {
        int iMin = Math.min(this.valueOf, i2);
        do {
            i++;
            if (i >= iMin) {
                break;
            }
        } while (OLrzqt(i) == i3);
        if (i < this.valueOf) {
            i2 = i;
        }
        return i2 - 1;
    }

    public static int valueOf(int i, int i2) {
        return copydefault(copydefault(copydefault(i, i2 & 255), (i2 >> 8) & 255), i2 >> 16);
    }

    public static int OLrzqt(int i, int i2) {
        return copydefault(copydefault(copydefault(copydefault(i, i2 & 255), (i2 >> 8) & 255), (i2 >> 16) & 255), (i2 >> 24) & 255);
    }
}
