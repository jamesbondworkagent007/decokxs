package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.BytesTrie;
import com.ibm.icu.util.LocaleMatcher;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.MissingResourceException;
import java.util.TreeMap;
import o.C7043acQ;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: o.adP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7095adP {
    public static final C7095adP EZpvd = new C7095adP(StateListAnimator.KWHzl());
    public final int AEQbTJ;
    public final java.lang.String[] AYXKKw;
    public final BytesTrie AhwBna;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final int djBIcL;
    public final byte[] gEmmrt;
    public final java.util.Set<C7093adN> valueOf;

    public static final int AEQbTJ(int i) {
        return i >> 10;
    }

    public static final int EZpvd(int i) {
        return i << 3;
    }

    public static final int KWHzl(int i) {
        return i & 1023;
    }

    public static final int copydefault(int i) {
        return (i & 1023) >> 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.adP$StateListAnimator */
    public static final class StateListAnimator {
        public java.util.Set<C7093adN> AEQbTJ;
        public byte[] EZpvd;
        public int[] KWHzl;
        public byte[] OLrzqt;
        public java.lang.String[] copydefault;

        public int hashCode() {
            return 1;
        }

        public StateListAnimator(byte[] bArr, byte[] bArr2, java.lang.String[] strArr, java.util.Set<C7093adN> set, int[] iArr) {
            this.OLrzqt = bArr;
            this.EZpvd = bArr2;
            this.copydefault = strArr;
            this.AEQbTJ = set;
            this.KWHzl = iArr;
        }

        public static C7043acQ.TaskDescription AEQbTJ(C7043acQ.StateListAnimator stateListAnimator, java.lang.String str, C7043acQ.TaskDescription taskDescription) {
            if (stateListAnimator.copydefault(str, taskDescription)) {
                return taskDescription;
            }
            throw new MissingResourceException("langInfo.res missing data", "", "match/" + str);
        }

        public static StateListAnimator KWHzl() throws MissingResourceException {
            java.util.Set setEmptySet;
            C7043acQ.TaskDescription taskDescriptionAYXKKw = ICUResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", "langInfo", ICUResourceBundle.AEQbTJ, ICUResourceBundle.OpenType.DIRECT).AYXKKw("match");
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescriptionAYXKKw.valueOf();
            java.nio.ByteBuffer byteBufferEZpvd = AEQbTJ(stateListAnimatorValueOf, "trie", taskDescriptionAYXKKw).EZpvd();
            byte[] bArr = new byte[byteBufferEZpvd.remaining()];
            byteBufferEZpvd.get(bArr);
            java.nio.ByteBuffer byteBufferEZpvd2 = AEQbTJ(stateListAnimatorValueOf, "regionToPartitions", taskDescriptionAYXKKw).EZpvd();
            int iRemaining = byteBufferEZpvd2.remaining();
            byte[] bArr2 = new byte[iRemaining];
            byteBufferEZpvd2.get(bArr2);
            if (iRemaining < 1677) {
                throw new MissingResourceException("langInfo.res binary data too short", "", "match/regionToPartitions");
            }
            java.lang.String[] strArrGEmmrt = AEQbTJ(stateListAnimatorValueOf, "partitions", taskDescriptionAYXKKw).gEmmrt();
            if (stateListAnimatorValueOf.copydefault("paradigms", taskDescriptionAYXKKw)) {
                java.lang.String[] strArrGEmmrt2 = taskDescriptionAYXKKw.gEmmrt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(strArrGEmmrt2.length / 3);
                for (int i = 0; i < strArrGEmmrt2.length; i += 3) {
                    linkedHashSet.add(new C7093adN(strArrGEmmrt2[i], strArrGEmmrt2[i + 1], strArrGEmmrt2[i + 2], 0));
                }
                setEmptySet = linkedHashSet;
            } else {
                setEmptySet = Collections.emptySet();
            }
            int[] iArrCopydefault = AEQbTJ(stateListAnimatorValueOf, "distances", taskDescriptionAYXKKw).copydefault();
            if (iArrCopydefault.length < 4) {
                throw new MissingResourceException("langInfo.res intvector too short", "", "match/distances");
            }
            return new StateListAnimator(bArr, bArr2, strArrGEmmrt, setEmptySet, iArrCopydefault);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !StateListAnimator.class.equals(obj.getClass())) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return java.util.Arrays.equals(this.OLrzqt, stateListAnimator.OLrzqt) && java.util.Arrays.equals(this.EZpvd, stateListAnimator.EZpvd) && java.util.Arrays.equals(this.copydefault, stateListAnimator.copydefault) && this.AEQbTJ.equals(stateListAnimator.AEQbTJ) && java.util.Arrays.equals(this.KWHzl, stateListAnimator.KWHzl);
        }
    }

    public C7095adP(StateListAnimator stateListAnimator) {
        this.AhwBna = new BytesTrie(stateListAnimator.OLrzqt, 0);
        this.gEmmrt = stateListAnimator.EZpvd;
        this.AYXKKw = stateListAnimator.copydefault;
        this.valueOf = stateListAnimator.AEQbTJ;
        int[] iArr = stateListAnimator.KWHzl;
        this.KWHzl = iArr[0];
        this.copydefault = iArr[1];
        this.OLrzqt = iArr[2];
        this.djBIcL = iArr[3];
        this.AEQbTJ = copydefault(AEQbTJ(new C7093adN("en", "Latn", "US", 7), new C7093adN[]{new C7093adN("en", "Latn", "GB", 7)}, 1, EZpvd(50), LocaleMatcher.FavorSubtag.LANGUAGE, LocaleMatcher.Direction.WITH_ONE_WAY));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0119, code lost:
    
        if (AEQbTJ(r13, r23, r11, r27) == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int AEQbTJ(C7093adN c7093adN, C7093adN[] c7093adNArr, int i, int i2, LocaleMatcher.FavorSubtag favorSubtag, LocaleMatcher.Direction direction) {
        int iEZpvd;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        long j;
        BytesTrie bytesTrie;
        int i8;
        C7093adN c7093adN2;
        int i9;
        int iOLrzqt;
        int i10;
        int i11 = i;
        BytesTrie bytesTrie2 = new BytesTrie(this.AhwBna);
        int iEZpvd2 = EZpvd(bytesTrie2, c7093adN.EZpvd, false);
        boolean z2 = true;
        long jKWHzl = (iEZpvd2 < 0 || i11 <= 1) ? 0L : bytesTrie2.KWHzl();
        int i12 = i2;
        int i13 = 0;
        int iEZpvd3 = -1;
        int i14 = -1;
        while (i13 < i11) {
            C7093adN c7093adN3 = c7093adNArr[i13];
            if (iEZpvd2 >= 0) {
                if (i13 != 0) {
                    bytesTrie2.EZpvd(jKWHzl);
                }
                iEZpvd = EZpvd(bytesTrie2, c7093adN3.EZpvd, z2);
            } else {
                iEZpvd = iEZpvd2;
            }
            if (iEZpvd >= 0) {
                i4 = iEZpvd & MLKEMEngine.KyberPolyBytes;
                i3 = iEZpvd & (-385);
                z = false;
            } else {
                i3 = c7093adN.EZpvd.equals(c7093adN3.EZpvd) ? 0 : this.KWHzl;
                i4 = 0;
                z = true;
            }
            int i15 = (i12 + 7) >> 3;
            if (favorSubtag == LocaleMatcher.FavorSubtag.SCRIPT) {
                i3 >>= 2;
            }
            if (i3 > i15) {
                i5 = i13;
                i6 = iEZpvd3;
            } else {
                if (z || i4 != 0) {
                    i5 = i13;
                    i6 = iEZpvd3;
                    i7 = c7093adN.OLrzqt.equals(c7093adN3.OLrzqt) ? 0 : this.copydefault;
                } else {
                    i6 = iEZpvd3;
                    i5 = i13;
                    int iCopydefault = copydefault(bytesTrie2, bytesTrie2.KWHzl(), c7093adN.OLrzqt, c7093adN3.OLrzqt);
                    i4 = iCopydefault & 256;
                    i7 = iCopydefault & (-257);
                }
                int i16 = i3 + i7;
                if (i16 <= i15) {
                    if (c7093adN.AEQbTJ.equals(c7093adN3.AEQbTJ)) {
                        j = jKWHzl;
                        bytesTrie = bytesTrie2;
                        i8 = iEZpvd2;
                        c7093adN2 = c7093adN3;
                        i9 = i12;
                    } else {
                        if (z || (i4 & 256) != 0) {
                            j = jKWHzl;
                            bytesTrie = bytesTrie2;
                            i8 = iEZpvd2;
                            c7093adN2 = c7093adN3;
                            i9 = i12;
                            iOLrzqt = this.OLrzqt;
                        } else {
                            int i17 = i15 - i16;
                            if (this.djBIcL <= i17) {
                                long jKWHzl2 = bytesTrie2.KWHzl();
                                java.lang.String strAEQbTJ = AEQbTJ(c7093adN);
                                java.lang.String strAEQbTJ2 = AEQbTJ(c7093adN3);
                                i8 = iEZpvd2;
                                c7093adN2 = c7093adN3;
                                BytesTrie bytesTrie3 = bytesTrie2;
                                bytesTrie = bytesTrie2;
                                i9 = i12;
                                j = jKWHzl;
                                iOLrzqt = OLrzqt(bytesTrie3, jKWHzl2, strAEQbTJ, strAEQbTJ2, i17);
                            }
                        }
                        i16 += iOLrzqt;
                    }
                    int iEZpvd4 = EZpvd(i16);
                    if (iEZpvd4 == 0) {
                        iEZpvd4 |= c7093adN.copydefault ^ c7093adN2.copydefault;
                        if (iEZpvd4 < i9 && (direction != LocaleMatcher.Direction.ONLY_TWO_WAY || AEQbTJ(c7093adN2, c7093adN, i9, favorSubtag))) {
                            if (iEZpvd4 == 0) {
                                return i5 << 10;
                            }
                            i12 = iEZpvd4;
                            i14 = i5;
                            iEZpvd3 = -1;
                        }
                        i10 = i6;
                        i12 = i9;
                        iEZpvd3 = i10;
                    } else {
                        if (iEZpvd4 < i9) {
                            if (direction == LocaleMatcher.Direction.ONLY_TWO_WAY) {
                            }
                            i12 = iEZpvd4;
                            i14 = i5;
                            iEZpvd3 = -1;
                        } else if (iEZpvd4 == i9 && i14 >= 0 && (direction != LocaleMatcher.Direction.ONLY_TWO_WAY || AEQbTJ(c7093adN2, c7093adN, i9, favorSubtag))) {
                            iEZpvd3 = C7101adV.AEQbTJ.EZpvd(c7093adN2, c7093adNArr[i14], i6);
                            i12 = i9;
                            if ((iEZpvd3 & 1) != 0) {
                                i14 = i5;
                            }
                        }
                        i10 = i6;
                        i12 = i9;
                        iEZpvd3 = i10;
                    }
                }
                i13 = i5 + 1;
                i11 = i;
                iEZpvd2 = i8;
                bytesTrie2 = bytesTrie;
                jKWHzl = j;
                z2 = true;
            }
            i10 = i6;
            j = jKWHzl;
            bytesTrie = bytesTrie2;
            i8 = iEZpvd2;
            i9 = i12;
            i12 = i9;
            iEZpvd3 = i10;
            i13 = i5 + 1;
            i11 = i;
            iEZpvd2 = i8;
            bytesTrie2 = bytesTrie;
            jKWHzl = j;
            z2 = true;
        }
        return i14 >= 0 ? (i14 << 10) | i12 : EZpvd(100) | (-1024);
    }

    public final boolean AEQbTJ(C7093adN c7093adN, C7093adN c7093adN2, int i, LocaleMatcher.FavorSubtag favorSubtag) {
        return AEQbTJ(c7093adN, new C7093adN[]{c7093adN2}, 1, i, favorSubtag, null) >= 0;
    }

    public static final int copydefault(BytesTrie bytesTrie, long j, java.lang.String str, java.lang.String str2) {
        int iEZpvd = EZpvd(bytesTrie, str, false);
        if (iEZpvd >= 0) {
            iEZpvd = EZpvd(bytesTrie, str2, true);
        }
        if (iEZpvd >= 0) {
            return iEZpvd;
        }
        BytesTrie.Result resultAEQbTJ = bytesTrie.EZpvd(j).AEQbTJ(42);
        int iEZpvd2 = str.equals(str2) ? 0 : bytesTrie.EZpvd();
        return resultAEQbTJ == BytesTrie.Result.FINAL_VALUE ? iEZpvd2 | 256 : iEZpvd2;
    }

    public static final int OLrzqt(BytesTrie bytesTrie, long j, java.lang.String str, java.lang.String str2, int i) {
        int iAEQbTJ;
        int length = str.length();
        int length2 = str2.length();
        if (length == 1 && length2 == 1) {
            if (bytesTrie.AEQbTJ(str.charAt(0) | 128).hasNext() && bytesTrie.AEQbTJ(str2.charAt(0) | 128).hasValue()) {
                return bytesTrie.EZpvd();
            }
            return AEQbTJ(bytesTrie, j);
        }
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (bytesTrie.AEQbTJ(str.charAt(i2) | 128).hasNext()) {
                long jKWHzl = length2 > 1 ? bytesTrie.KWHzl() : 0L;
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (bytesTrie.AEQbTJ(str2.charAt(i5) | 128).hasValue()) {
                        iAEQbTJ = bytesTrie.EZpvd();
                    } else if (z) {
                        iAEQbTJ = 0;
                    } else {
                        iAEQbTJ = AEQbTJ(bytesTrie, j);
                        z = true;
                    }
                    if (iAEQbTJ <= i) {
                        if (i3 < iAEQbTJ) {
                            i3 = iAEQbTJ;
                        }
                        if (i6 >= length2) {
                            break;
                        }
                        bytesTrie.EZpvd(jKWHzl);
                        i5 = i6;
                    } else {
                        return iAEQbTJ;
                    }
                }
            } else if (!z) {
                int iAEQbTJ2 = AEQbTJ(bytesTrie, j);
                if (iAEQbTJ2 > i) {
                    return iAEQbTJ2;
                }
                if (i3 < iAEQbTJ2) {
                    i3 = iAEQbTJ2;
                }
                z = true;
            }
            if (i4 >= length) {
                return i3;
            }
            bytesTrie.EZpvd(j);
            i2 = i4;
        }
    }

    public static final int AEQbTJ(BytesTrie bytesTrie, long j) {
        bytesTrie.EZpvd(j).AEQbTJ(42);
        return bytesTrie.EZpvd();
    }

    public static final int EZpvd(BytesTrie bytesTrie, java.lang.String str, boolean z) {
        if (str.isEmpty()) {
            return -1;
        }
        int length = str.length();
        int i = 0;
        while (true) {
            char cCharAt = str.charAt(i);
            if (i < length - 1) {
                if (!bytesTrie.AEQbTJ(cCharAt).hasNext()) {
                    return -1;
                }
                i++;
            } else {
                BytesTrie.Result resultAEQbTJ = bytesTrie.AEQbTJ(cCharAt | 128);
                if (z) {
                    if (resultAEQbTJ.hasValue()) {
                        int iEZpvd = bytesTrie.EZpvd();
                        return resultAEQbTJ == BytesTrie.Result.FINAL_VALUE ? iEZpvd | 256 : iEZpvd;
                    }
                } else if (resultAEQbTJ.hasNext()) {
                    return 0;
                }
                return -1;
            }
        }
    }

    public java.lang.String toString() {
        return AEQbTJ().toString();
    }

    public final java.lang.String AEQbTJ(C7093adN c7093adN) {
        return this.AYXKKw[this.gEmmrt[c7093adN.KWHzl]];
    }

    public boolean KWHzl(C7093adN c7093adN) {
        java.util.Iterator<C7093adN> it = this.valueOf.iterator();
        while (it.hasNext()) {
            if (c7093adN.KWHzl(it.next())) {
                return true;
            }
        }
        return false;
    }

    public java.util.Map<java.lang.String, java.lang.Integer> AEQbTJ() {
        TreeMap treeMap = new TreeMap();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        BytesTrie.ActionBar it = this.AhwBna.iterator();
        while (it.hasNext()) {
            BytesTrie.Application next = it.next();
            sb.setLength(0);
            int iEZpvd = next.EZpvd();
            for (int i = 0; i < iEZpvd; i++) {
                byte bOLrzqt = next.OLrzqt(i);
                if (bOLrzqt == 42) {
                    sb.append("*-*-");
                } else if (bOLrzqt >= 0) {
                    sb.append((char) bOLrzqt);
                } else {
                    sb.append((char) (bOLrzqt & 127));
                    sb.append('-');
                }
            }
            sb.setLength(sb.length() - 1);
            treeMap.put(sb.toString(), java.lang.Integer.valueOf(next.OLrzqt));
        }
        return treeMap;
    }
}
