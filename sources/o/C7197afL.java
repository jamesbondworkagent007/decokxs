package o;

import com.ibm.icu.util.BytesTrie;
import java.text.CharacterIterator;

/* JADX INFO: renamed from: o.afL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7197afL extends AbstractC7211afZ {
    public final byte[] KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt(int i) {
        if (i == 8205) {
            return 255;
        }
        if (i == 8204) {
            return 254;
        }
        int i2 = i - (this.copydefault & 2097151);
        if (i2 < 0 || 253 < i2) {
            return -1;
        }
        return i2;
    }

    public C7197afL(byte[] bArr, int i) {
        this.KWHzl = bArr;
        C7006abE.copydefault((2130706432 & i) == 16777216);
        this.copydefault = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[PHI: r5
  0x003c: PHI (r5v3 int) = (r5v1 int), (r5v4 int) binds: [B:16:0x0039, B:13:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC7211afZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int KWHzl(CharacterIterator characterIterator, int i, int[] iArr, int[] iArr2, int i2, int[] iArr3) {
        int iValueOf;
        AbstractC7239agA abstractC7239agACopydefault = AbstractC7239agA.copydefault(characterIterator);
        BytesTrie bytesTrie = new BytesTrie(this.KWHzl, 0);
        int iValueOf2 = abstractC7239agACopydefault.valueOf();
        if (iValueOf2 == -1) {
            return 0;
        }
        BytesTrie.Result resultOLrzqt = bytesTrie.OLrzqt(OLrzqt(iValueOf2));
        int i3 = 1;
        int i4 = 0;
        while (true) {
            if (resultOLrzqt.hasValue()) {
                if (i4 < i2) {
                    if (iArr3 != null) {
                        iArr3[i4] = bytesTrie.EZpvd();
                    }
                    iArr[i4] = i3;
                    i4++;
                }
                if (resultOLrzqt != BytesTrie.Result.FINAL_VALUE) {
                    if (i3 >= i || (iValueOf = abstractC7239agACopydefault.valueOf()) == -1) {
                        break;
                    }
                    i3++;
                    resultOLrzqt = bytesTrie.AEQbTJ(OLrzqt(iValueOf));
                } else {
                    break;
                }
            } else if (resultOLrzqt == BytesTrie.Result.NO_MATCH) {
                break;
            }
        }
        iArr2[0] = i4;
        return i3;
    }
}
