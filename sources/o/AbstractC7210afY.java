package o;

import com.ibm.icu.text.UnicodeSet;
import java.text.CharacterIterator;

/* JADX INFO: renamed from: o.afY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7210afY implements InterfaceC7274agj {
    public UnicodeSet gEmmrt = new UnicodeSet();

    public abstract int EZpvd(CharacterIterator characterIterator, int i, int i2, Activity activity);

    /* JADX INFO: renamed from: o.afY$Application */
    public static class Application {
        public int KWHzl;
        public int copydefault;
        public int valueOf;
        public int[] OLrzqt = new int[20];
        public int[] EZpvd = new int[1];
        public int AEQbTJ = -1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void KWHzl() {
            this.KWHzl = this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int OLrzqt() {
            return this.valueOf;
        }

        public int OLrzqt(CharacterIterator characterIterator, AbstractC7211afZ abstractC7211afZ, int i) {
            int index = characterIterator.getIndex();
            if (index != this.AEQbTJ) {
                this.AEQbTJ = index;
                int[] iArr = this.OLrzqt;
                this.valueOf = abstractC7211afZ.EZpvd(characterIterator, i - index, iArr, this.EZpvd, iArr.length);
                if (this.EZpvd[0] <= 0) {
                    characterIterator.setIndex(index);
                }
            }
            int i2 = this.EZpvd[0];
            if (i2 > 0) {
                characterIterator.setIndex(index + this.OLrzqt[i2 - 1]);
            }
            int i3 = this.EZpvd[0];
            int i4 = i3 - 1;
            this.copydefault = i4;
            this.KWHzl = i4;
            return i3;
        }

        public int EZpvd(CharacterIterator characterIterator) {
            characterIterator.setIndex(this.AEQbTJ + this.OLrzqt[this.KWHzl]);
            return this.OLrzqt[this.KWHzl];
        }

        public boolean AEQbTJ(CharacterIterator characterIterator) {
            int i = this.copydefault;
            if (i <= 0) {
                return false;
            }
            int i2 = this.AEQbTJ;
            int[] iArr = this.OLrzqt;
            int i3 = i - 1;
            this.copydefault = i3;
            characterIterator.setIndex(i2 + iArr[i3]);
            return true;
        }
    }

    /* JADX INFO: renamed from: o.afY$Activity */
    public static class Activity implements java.lang.Cloneable {
        public int[] KWHzl = new int[50];
        public int AEQbTJ = 4;
        public int OLrzqt = 4;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int AYXKKw() {
            return this.OLrzqt - this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void KWHzl() {
            this.OLrzqt = 4;
            this.AEQbTJ = 4;
        }

        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            Activity activity = (Activity) super.clone();
            activity.KWHzl = (int[]) this.KWHzl.clone();
            return activity;
        }

        public boolean AEQbTJ() {
            return AYXKKw() == 0;
        }

        public final void copydefault() {
            int[] iArr = this.KWHzl;
            int[] iArr2 = new int[iArr.length * 2];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.KWHzl = iArr2;
        }

        public void OLrzqt(int i) {
            int[] iArr = this.KWHzl;
            int i2 = this.AEQbTJ - 1;
            this.AEQbTJ = i2;
            iArr[i2] = i;
        }

        public void AEQbTJ(int i) {
            if (this.OLrzqt >= this.KWHzl.length) {
                copydefault();
            }
            int[] iArr = this.KWHzl;
            int i2 = this.OLrzqt;
            this.OLrzqt = i2 + 1;
            iArr[i2] = i;
        }

        public int OLrzqt() {
            int[] iArr = this.KWHzl;
            int i = this.OLrzqt - 1;
            this.OLrzqt = i;
            return iArr[i];
        }

        public int EZpvd() {
            return this.KWHzl[this.OLrzqt - 1];
        }

        public boolean EZpvd(int i) {
            for (int i2 = this.AEQbTJ; i2 < this.OLrzqt; i2++) {
                if (this.KWHzl[i2] == i) {
                    return true;
                }
            }
            return false;
        }

        public int KWHzl(int i) {
            return this.KWHzl[this.AEQbTJ + i];
        }
    }

    @Override // o.InterfaceC7274agj
    public boolean AEQbTJ(int i) {
        return this.gEmmrt.AEQbTJ(i);
    }

    @Override // o.InterfaceC7274agj
    public int KWHzl(CharacterIterator characterIterator, int i, int i2, Activity activity) {
        int index;
        int index2 = characterIterator.getIndex();
        int iAEQbTJ = C7017abR.AEQbTJ(characterIterator);
        while (true) {
            index = characterIterator.getIndex();
            if (index >= i2 || !this.gEmmrt.AEQbTJ(iAEQbTJ)) {
                break;
            }
            C7017abR.OLrzqt(characterIterator);
            iAEQbTJ = C7017abR.AEQbTJ(characterIterator);
        }
        int iEZpvd = EZpvd(characterIterator, index2, index, activity);
        characterIterator.setIndex(index);
        return iEZpvd;
    }

    public void AEQbTJ(UnicodeSet unicodeSet) {
        UnicodeSet unicodeSet2 = new UnicodeSet(unicodeSet);
        this.gEmmrt = unicodeSet2;
        unicodeSet2.KWHzl();
    }
}
