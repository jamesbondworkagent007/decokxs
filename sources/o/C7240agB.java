package o;

import com.ibm.icu.text.UnicodeSet;
import java.text.CharacterIterator;
import o.AbstractC7210afY;

/* JADX INFO: renamed from: o.agB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7240agB extends AbstractC7210afY {
    public static UnicodeSet KWHzl;
    public AbstractC7211afZ AhwBna;
    public static UnicodeSet OLrzqt = new UnicodeSet();
    public static UnicodeSet EZpvd = new UnicodeSet();
    public static UnicodeSet AEQbTJ = new UnicodeSet();
    public static UnicodeSet copydefault = new UnicodeSet();

    static {
        OLrzqt.OLrzqt("[[:Thai:]&[:LineBreak=SA:]]");
        OLrzqt.KWHzl();
        EZpvd.OLrzqt("[[:Thai:]&[:LineBreak=SA:]&[:M:]]");
        EZpvd.KWHzl(32);
        UnicodeSet unicodeSet = new UnicodeSet(OLrzqt);
        KWHzl = unicodeSet;
        unicodeSet.fetchVPNInfo(3633);
        KWHzl.gEmmrt(3648, 3652);
        AEQbTJ.EZpvd(3585, 3630);
        AEQbTJ.EZpvd(3648, 3652);
        copydefault.KWHzl(3631);
        copydefault.KWHzl(3654);
        EZpvd.KWHzl();
        KWHzl.KWHzl();
        AEQbTJ.KWHzl();
        copydefault.KWHzl();
        OLrzqt.AYXKKw();
        EZpvd.AYXKKw();
        KWHzl.AYXKKw();
        AEQbTJ.AYXKKw();
        copydefault.AYXKKw();
    }

    public C7240agB() throws java.io.IOException {
        AEQbTJ(OLrzqt);
        this.AhwBna = C7209afX.EZpvd("Thai");
    }

    public boolean equals(java.lang.Object obj) {
        return obj instanceof C7240agB;
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    @Override // o.AbstractC7210afY, o.InterfaceC7274agj
    public boolean AEQbTJ(int i) {
        return C7223afl.copydefault(i, 4106) == 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x007f A[EDGE_INSN: B:104:0x007f->B:29:0x007f BREAK  A[LOOP:4: B:17:0x0043->B:105:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[LOOP:4: B:17:0x0043->B:105:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0108 A[ADDED_TO_REGION, EDGE_INSN: B:99:0x0108->B:60:0x0108 BREAK  A[LOOP:3: B:55:0x00ec->B:59:0x00fe], REMOVE, SYNTHETIC] */
    @Override // o.AbstractC7210afY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int EZpvd(CharacterIterator characterIterator, int i, int i2, AbstractC7210afY.Activity activity) {
        int iEZpvd;
        int index;
        int i3;
        if (i2 - i < 4) {
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
            int iOLrzqt = applicationArr[i6].OLrzqt(characterIterator, this.AhwBna, i2);
            if (iOLrzqt == 1) {
                iEZpvd = applicationArr[i6].EZpvd(characterIterator);
            } else if (iOLrzqt > 1) {
                if (characterIterator.getIndex() < i2) {
                    while (true) {
                        int i7 = (i5 + 1) % 3;
                        if (applicationArr[i7].OLrzqt(characterIterator, this.AhwBna, i2) > 0) {
                            applicationArr[i6].KWHzl();
                            if (characterIterator.getIndex() < i2) {
                                while (applicationArr[(i5 + 2) % 3].OLrzqt(characterIterator, this.AhwBna, i2) <= 0) {
                                    if (!applicationArr[i7].AEQbTJ(characterIterator)) {
                                        if (applicationArr[i6].AEQbTJ(characterIterator)) {
                                            break;
                                        }
                                    }
                                }
                                applicationArr[i6].KWHzl();
                                break;
                            }
                            break;
                        }
                        if (applicationArr[i6].AEQbTJ(characterIterator)) {
                        }
                        if (characterIterator.getIndex() < i2 && iEZpvd < 3) {
                            i3 = i5 % 3;
                            if (applicationArr[i3].OLrzqt(characterIterator, this.AhwBna, i2) > 0 && (iEZpvd == 0 || applicationArr[i3].OLrzqt() < 3)) {
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
                                    if (KWHzl.AEQbTJ(cCurrent) && AEQbTJ.AEQbTJ(cCurrent2)) {
                                        int iOLrzqt2 = applicationArr[(i5 + 1) % 3].OLrzqt(characterIterator, this.AhwBna, i2);
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
                            if (index < i2 || !EZpvd.AEQbTJ(characterIterator.current())) {
                                break;
                            }
                            characterIterator.next();
                            iEZpvd += characterIterator.getIndex() - index;
                        }
                        if (characterIterator.getIndex() < i2 && iEZpvd > 0) {
                            if (applicationArr[i5 % 3].OLrzqt(characterIterator, this.AhwBna, i2) > 0) {
                                UnicodeSet unicodeSet = copydefault;
                                char cCurrent3 = characterIterator.current();
                                if (unicodeSet.AEQbTJ(cCurrent3)) {
                                    if (cCurrent3 == 3631) {
                                        if (!copydefault.AEQbTJ(characterIterator.previous())) {
                                            characterIterator.next();
                                            characterIterator.next();
                                            iEZpvd++;
                                            cCurrent3 = characterIterator.current();
                                        } else {
                                            characterIterator.next();
                                        }
                                    }
                                    if (cCurrent3 == 3654) {
                                        if (characterIterator.previous() != 3654) {
                                            characterIterator.next();
                                            characterIterator.next();
                                            iEZpvd++;
                                        } else {
                                            characterIterator.next();
                                        }
                                    }
                                } else {
                                    characterIterator.setIndex(index2 + iEZpvd);
                                }
                            }
                        }
                        if (iEZpvd > 0) {
                            activity.AEQbTJ(java.lang.Integer.valueOf(index2 + iEZpvd).intValue());
                        }
                    }
                }
                iEZpvd = applicationArr[i6].EZpvd(characterIterator);
            } else {
                iEZpvd = 0;
                if (characterIterator.getIndex() < i2) {
                    i3 = i5 % 3;
                    if (applicationArr[i3].OLrzqt(characterIterator, this.AhwBna, i2) > 0) {
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
                if (characterIterator.getIndex() < i2) {
                    if (applicationArr[i5 % 3].OLrzqt(characterIterator, this.AhwBna, i2) > 0) {
                    }
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
            if (characterIterator.getIndex() < i2) {
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
