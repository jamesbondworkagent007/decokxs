package o;

import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.ibm.icu.text.Normalizer;
import com.ibm.icu.text.UnicodeSet;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import o.AbstractC7210afY;

/* JADX INFO: renamed from: o.afR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7203afR extends AbstractC7210afY {
    public static final UnicodeSet AEQbTJ;
    public static final UnicodeSet KWHzl;
    public static final UnicodeSet OLrzqt;
    public static final UnicodeSet copydefault;
    public AbstractC7211afZ EZpvd;

    public static boolean KWHzl(int i) {
        return (i >= 12449 && i <= 12542 && i != 12539) || (i >= 65382 && i <= 65439);
    }

    static {
        UnicodeSet unicodeSet = new UnicodeSet();
        copydefault = unicodeSet;
        UnicodeSet unicodeSet2 = new UnicodeSet();
        KWHzl = unicodeSet2;
        UnicodeSet unicodeSet3 = new UnicodeSet();
        AEQbTJ = unicodeSet3;
        UnicodeSet unicodeSet4 = new UnicodeSet();
        OLrzqt = unicodeSet4;
        unicodeSet.OLrzqt("[\\uac00-\\ud7a3]");
        unicodeSet2.OLrzqt("[:Han:]");
        unicodeSet3.OLrzqt("[[:Katakana:]\\uff9e\\uff9f]");
        unicodeSet4.OLrzqt("[:Hiragana:]");
        unicodeSet.AYXKKw();
        unicodeSet2.AYXKKw();
        unicodeSet3.AYXKKw();
        unicodeSet4.AYXKKw();
    }

    public C7203afR(boolean z) throws java.io.IOException {
        this.EZpvd = null;
        this.EZpvd = C7209afX.EZpvd("Hira");
        if (z) {
            AEQbTJ(copydefault);
            return;
        }
        UnicodeSet unicodeSet = new UnicodeSet();
        unicodeSet.OLrzqt(KWHzl);
        unicodeSet.OLrzqt(AEQbTJ);
        unicodeSet.OLrzqt(OLrzqt);
        unicodeSet.KWHzl(65392);
        unicodeSet.KWHzl(12540);
        AEQbTJ(unicodeSet);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C7203afR) {
            return this.gEmmrt.equals(((C7203afR) obj).gEmmrt);
        }
        return false;
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public static int copydefault(int i) {
        int[] iArr = {8192, 984, 408, PsExtractor.VIDEO_STREAM_MASK, 204, 252, 300, 372, LivenessCoordinator.TARGET_WIDTH};
        if (i > 8) {
            return 8192;
        }
        return iArr[i];
    }

    @Override // o.AbstractC7210afY
    public int EZpvd(CharacterIterator characterIterator, int i, int i2, AbstractC7210afY.Activity activity) {
        StringCharacterIterator stringCharacterIterator;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i9;
        int[] iArr4;
        int iCopydefault;
        if (i >= i2) {
            return 0;
        }
        characterIterator.setIndex(i);
        int[] iArr5 = new int[(i2 - i) + 1];
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        characterIterator.setIndex(i);
        while (characterIterator.getIndex() < i2) {
            stringBuffer.append(characterIterator.current());
            characterIterator.next();
        }
        java.lang.String string = stringBuffer.toString();
        Normalizer.TaskDescription taskDescription = Normalizer.AhwBna;
        if (Normalizer.OLrzqt(string, taskDescription) == Normalizer.DbNXlk || Normalizer.KWHzl(string, taskDescription, 0)) {
            stringCharacterIterator = new StringCharacterIterator(string);
            iArr5[0] = 0;
            i3 = 0;
            int iCharCount = 0;
            while (iCharCount < string.length()) {
                iCharCount += java.lang.Character.charCount(string.codePointAt(iCharCount));
                i3++;
                iArr5[i3] = iCharCount;
            }
        } else {
            java.lang.String strKWHzl = Normalizer.KWHzl(string, taskDescription);
            stringCharacterIterator = new StringCharacterIterator(strKWHzl);
            iArr5 = new int[strKWHzl.length() + 1];
            Normalizer normalizer = new Normalizer(string, taskDescription, 0);
            iArr5[0] = 0;
            int iAEQbTJ = 0;
            i3 = 0;
            while (iAEQbTJ < normalizer.EZpvd()) {
                normalizer.KWHzl();
                i3++;
                iAEQbTJ = normalizer.AEQbTJ();
                iArr5[i3] = iAEQbTJ;
            }
        }
        StringCharacterIterator stringCharacterIterator2 = stringCharacterIterator;
        int i10 = i3 + 1;
        int[] iArr6 = new int[i10];
        iArr6[0] = 0;
        int i11 = 1;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i11 > i3) {
                break;
            }
            iArr6[i11] = Integer.MAX_VALUE;
            i11++;
        }
        int[] iArr7 = new int[i10];
        for (int i12 = 0; i12 <= i3; i12++) {
            iArr7[i12] = -1;
        }
        int[] iArr8 = new int[i3];
        int[] iArr9 = new int[i3];
        stringCharacterIterator2.setIndex(0);
        int i13 = 0;
        boolean z = false;
        while (i13 < i3) {
            int index = stringCharacterIterator2.getIndex();
            if (iArr6[i13] == i4) {
                i7 = index;
                i8 = i13;
                iArr = iArr9;
                iArr2 = iArr8;
                iArr3 = iArr7;
                i9 = i4;
                iArr4 = iArr6;
            } else {
                int i14 = i13 + 20 < i3 ? 20 : i3 - i13;
                int[] iArr10 = new int[1];
                i7 = index;
                i8 = i13;
                iArr = iArr9;
                int i15 = i14;
                iArr2 = iArr8;
                iArr3 = iArr7;
                i9 = Integer.MAX_VALUE;
                int i16 = i14;
                iArr4 = iArr6;
                this.EZpvd.KWHzl(stringCharacterIterator2, i15, iArr, iArr10, i16, iArr2);
                int i17 = iArr10[0];
                stringCharacterIterator2.setIndex(i7);
                if ((i17 == 0 || iArr[0] != 1) && C7017abR.AEQbTJ(stringCharacterIterator2) != Integer.MAX_VALUE && !copydefault.AEQbTJ(C7017abR.AEQbTJ(stringCharacterIterator2))) {
                    iArr2[i17] = 255;
                    iArr[i17] = 1;
                    i17++;
                }
                for (int i18 = 0; i18 < i17; i18++) {
                    int i19 = iArr4[i8] + iArr2[i18];
                    int i20 = iArr[i18] + i8;
                    if (i19 < iArr4[i20]) {
                        iArr4[i20] = i19;
                        iArr3[iArr[i18] + i8] = i8;
                    }
                }
                boolean zKWHzl = KWHzl(C7017abR.AEQbTJ(stringCharacterIterator2));
                if (!z && zKWHzl) {
                    int i21 = i8 + 1;
                    C7017abR.OLrzqt(stringCharacterIterator2);
                    while (i21 < i3 && i21 - i8 < 20 && KWHzl(C7017abR.AEQbTJ(stringCharacterIterator2))) {
                        C7017abR.OLrzqt(stringCharacterIterator2);
                        i21++;
                    }
                    int i22 = i21 - i8;
                    if (i22 < 20 && (iCopydefault = iArr4[i8] + copydefault(i22)) < iArr4[i21]) {
                        iArr4[i21] = iCopydefault;
                        iArr3[i21] = i8;
                    }
                }
                z = zKWHzl;
            }
            i13 = i8 + 1;
            stringCharacterIterator2.setIndex(i7);
            C7017abR.OLrzqt(stringCharacterIterator2);
            i4 = i9;
            iArr6 = iArr4;
            iArr9 = iArr;
            iArr8 = iArr2;
            iArr7 = iArr3;
        }
        int[] iArr11 = iArr7;
        int[] iArr12 = new int[i10];
        if (iArr6[i3] == i4) {
            iArr12[0] = i3;
            i5 = 1;
        } else {
            i5 = 0;
            while (i3 > 0) {
                iArr12[i5] = i3;
                i5++;
                i3 = iArr11[i3];
            }
            C7006abE.copydefault(iArr11[iArr12[i5 + (-1)]] == 0);
        }
        if (activity.AYXKKw() == 0 || activity.EZpvd() < i) {
            i6 = 0;
            iArr12[i5] = 0;
            i5++;
        } else {
            i6 = 0;
        }
        int i23 = i6;
        for (int i24 = i5 - 1; i24 >= 0; i24--) {
            int i25 = iArr5[iArr12[i24]] + i;
            if (!activity.EZpvd(i25) && i25 != i) {
                activity.AEQbTJ(iArr5[iArr12[i24]] + i);
                i23++;
            }
        }
        if (!activity.AEQbTJ() && activity.EZpvd() == i2) {
            activity.OLrzqt();
            i23--;
        }
        if (!activity.AEQbTJ()) {
            characterIterator.setIndex(activity.EZpvd());
        }
        return i23;
    }
}
