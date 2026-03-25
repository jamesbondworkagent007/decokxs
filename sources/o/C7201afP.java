package o;

import com.ibm.icu.util.BytesTrie;
import java.text.CharacterIterator;

/* JADX INFO: renamed from: o.afP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7201afP extends AbstractC7211afZ {
    public java.lang.CharSequence copydefault;

    public C7201afP(java.lang.CharSequence charSequence) {
        this.copydefault = charSequence;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[PHI: r5
  0x0038: PHI (r5v3 int) = (r5v1 int), (r5v4 int) binds: [B:16:0x0035, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC7211afZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int KWHzl(CharacterIterator characterIterator, int i, int[] iArr, int[] iArr2, int i2, int[] iArr3) {
        int iValueOf;
        AbstractC7239agA abstractC7239agACopydefault = AbstractC7239agA.copydefault(characterIterator);
        C7244agF c7244agF = new C7244agF(this.copydefault, 0);
        int iValueOf2 = abstractC7239agACopydefault.valueOf();
        if (iValueOf2 == -1) {
            return 0;
        }
        BytesTrie.Result resultKWHzl = c7244agF.KWHzl(iValueOf2);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            if (resultKWHzl.hasValue()) {
                if (i4 < i2) {
                    if (iArr3 != null) {
                        iArr3[i4] = c7244agF.EZpvd();
                    }
                    iArr[i4] = i3;
                    i4++;
                }
                if (resultKWHzl != BytesTrie.Result.FINAL_VALUE) {
                    if (i3 >= i || (iValueOf = abstractC7239agACopydefault.valueOf()) == -1) {
                        break;
                    }
                    i3++;
                    resultKWHzl = c7244agF.AEQbTJ(iValueOf);
                } else {
                    break;
                }
            } else if (resultKWHzl == BytesTrie.Result.NO_MATCH) {
                break;
            }
        }
        iArr2[0] = i4;
        return i3;
    }
}
