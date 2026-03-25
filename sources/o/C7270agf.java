package o;

import com.ibm.icu.text.UnicodeSet;
import java.text.CharacterIterator;
import o.AbstractC7210afY;

/* JADX INFO: renamed from: o.agf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7270agf extends AbstractC7210afY {
    public static UnicodeSet EZpvd;
    public AbstractC7211afZ copydefault;
    public static UnicodeSet AEQbTJ = new UnicodeSet();
    public static UnicodeSet KWHzl = new UnicodeSet();
    public static UnicodeSet OLrzqt = new UnicodeSet();

    static {
        AEQbTJ.OLrzqt("[[:Laoo:]&[:LineBreak=SA:]]");
        AEQbTJ.KWHzl();
        KWHzl.OLrzqt("[[:Laoo:]&[:LineBreak=SA:]&[:M:]]");
        KWHzl.KWHzl(32);
        UnicodeSet unicodeSet = new UnicodeSet(AEQbTJ);
        EZpvd = unicodeSet;
        unicodeSet.gEmmrt(3776, 3780);
        OLrzqt.EZpvd(3713, 3758);
        OLrzqt.EZpvd(3804, 3805);
        OLrzqt.EZpvd(3776, 3780);
        KWHzl.KWHzl();
        EZpvd.KWHzl();
        OLrzqt.KWHzl();
        AEQbTJ.AYXKKw();
        KWHzl.AYXKKw();
        EZpvd.AYXKKw();
        OLrzqt.AYXKKw();
    }

    public C7270agf() throws java.io.IOException {
        AEQbTJ(AEQbTJ);
        this.copydefault = C7209afX.EZpvd("Laoo");
    }

    public boolean equals(java.lang.Object obj) {
        return obj instanceof C7270agf;
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    @Override // o.AbstractC7210afY, o.InterfaceC7274agj
    public boolean AEQbTJ(int i) {
        return C7223afl.copydefault(i, 4106) == 24;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010c A[ADDED_TO_REGION, EDGE_INSN: B:81:0x010c->B:62:0x010c BREAK  A[LOOP:3: B:57:0x00f0->B:61:0x0102], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0083 A[EDGE_INSN: B:85:0x0083->B:31:0x0083 BREAK  A[LOOP:4: B:18:0x0044->B:87:?], SYNTHETIC] */
    @Override // o.AbstractC7210afY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int EZpvd(CharacterIterator characterIterator, int i, int i2, AbstractC7210afY.Activity activity) {
        int iEZpvd;
        int index;
        int i3;
        if (i2 - i < 2) {
            return 0;
        }
        AbstractC7210afY.Application[] applicationArr = new AbstractC7210afY.Application[3];
        for (int i4 = 0; i4 < 3; i4++) {
            applicationArr[i4] = new AbstractC7210afY.Application();
        }
        characterIterator.setIndex(i);
        int i5 = 0;
        while (true) {
            int index2 = characterIterator.getIndex();
            if (index2 >= i2) {
                break;
            }
            int i6 = i5 % 3;
            int iOLrzqt = applicationArr[i6].OLrzqt(characterIterator, this.copydefault, i2);
            if (iOLrzqt == 1) {
                iEZpvd = applicationArr[i6].EZpvd(characterIterator);
            } else if (iOLrzqt > 1) {
                if (characterIterator.getIndex() < i2) {
                    boolean z = false;
                    do {
                        int i7 = (i5 + 1) % 3;
                        if (applicationArr[i7].OLrzqt(characterIterator, this.copydefault, i2) > 0) {
                            applicationArr[i6].KWHzl();
                            if (characterIterator.getIndex() >= i2) {
                                break;
                            }
                            while (true) {
                                if (applicationArr[(i5 + 2) % 3].OLrzqt(characterIterator, this.copydefault, i2) > 0) {
                                    applicationArr[i6].KWHzl();
                                    z = true;
                                    break;
                                }
                                if (!applicationArr[i7].AEQbTJ(characterIterator)) {
                                    break;
                                }
                            }
                            if (applicationArr[i6].AEQbTJ(characterIterator)) {
                                break;
                            }
                        } else if (applicationArr[i6].AEQbTJ(characterIterator)) {
                        }
                        if (characterIterator.getIndex() < i2 && iEZpvd < 3) {
                            i3 = i5 % 3;
                            if (applicationArr[i3].OLrzqt(characterIterator, this.copydefault, i2) > 0 && (iEZpvd == 0 || applicationArr[i3].OLrzqt() < 3)) {
                                int i8 = index2 + iEZpvd;
                                int i9 = i2 - i8;
                                char cCurrent = characterIterator.current();
                                int i10 = 0;
                                while (true) {
                                    characterIterator.next();
                                    char cCurrent2 = characterIterator.current();
                                    i10++;
                                    i9--;
                                    if (i9 <= 0) {
                                        break;
                                    }
                                    if (EZpvd.AEQbTJ(cCurrent) && OLrzqt.AEQbTJ(cCurrent2)) {
                                        int iOLrzqt2 = applicationArr[(i5 + 1) % 3].OLrzqt(characterIterator, this.copydefault, i2);
                                        characterIterator.setIndex(i8 + i10);
                                        if (iOLrzqt2 > 0) {
                                            break;
                                        }
                                    }
                                    cCurrent = cCurrent2;
                                }
                                if (iEZpvd <= 0) {
                                    i5++;
                                }
                                iEZpvd += i10;
                            } else {
                                characterIterator.setIndex(index2 + iEZpvd);
                            }
                        }
                        while (true) {
                            index = characterIterator.getIndex();
                            if (index < i2 || !KWHzl.AEQbTJ(characterIterator.current())) {
                                break;
                            }
                            characterIterator.next();
                            iEZpvd += characterIterator.getIndex() - index;
                        }
                        if (iEZpvd > 0) {
                            activity.AEQbTJ(java.lang.Integer.valueOf(index2 + iEZpvd).intValue());
                        }
                    } while (!z);
                }
                iEZpvd = applicationArr[i6].EZpvd(characterIterator);
            } else {
                iEZpvd = 0;
                if (characterIterator.getIndex() < i2) {
                    i3 = i5 % 3;
                    if (applicationArr[i3].OLrzqt(characterIterator, this.copydefault, i2) > 0) {
                        characterIterator.setIndex(index2 + iEZpvd);
                    }
                }
                while (true) {
                    index = characterIterator.getIndex();
                    if (index < i2) {
                        break;
                    }
                    break;
                    break;
                    characterIterator.next();
                    iEZpvd += characterIterator.getIndex() - index;
                }
                if (iEZpvd > 0) {
                }
            }
            i5++;
            if (characterIterator.getIndex() < i2) {
            }
            while (true) {
                index = characterIterator.getIndex();
                if (index < i2) {
                }
                characterIterator.next();
                iEZpvd += characterIterator.getIndex() - index;
            }
            if (iEZpvd > 0) {
            }
        }
        if (activity.EZpvd() < i2) {
            return i5;
        }
        activity.OLrzqt();
        return i5 - 1;
    }
}
