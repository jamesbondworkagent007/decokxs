package o;

import com.ibm.icu.text.UnicodeSet;
import java.text.CharacterIterator;
import o.AbstractC7210afY;

/* JADX INFO: renamed from: o.agH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7246agH implements InterfaceC7274agj {
    public volatile UnicodeSet KWHzl = new UnicodeSet();

    @Override // o.InterfaceC7274agj
    public boolean AEQbTJ(int i) {
        return this.KWHzl.AEQbTJ(i);
    }

    @Override // o.InterfaceC7274agj
    public int KWHzl(CharacterIterator characterIterator, int i, int i2, AbstractC7210afY.Activity activity) {
        UnicodeSet unicodeSet = this.KWHzl;
        int iAEQbTJ = C7017abR.AEQbTJ(characterIterator);
        while (characterIterator.getIndex() < i2 && unicodeSet.AEQbTJ(iAEQbTJ)) {
            C7017abR.OLrzqt(characterIterator);
            iAEQbTJ = C7017abR.AEQbTJ(characterIterator);
        }
        return 0;
    }

    public void OLrzqt(int i) {
        UnicodeSet unicodeSet = this.KWHzl;
        if (unicodeSet.AEQbTJ(i)) {
            return;
        }
        int iCopydefault = C7223afl.copydefault(i, 4106);
        UnicodeSet unicodeSet2 = new UnicodeSet();
        unicodeSet2.OLrzqt(4106, iCopydefault);
        unicodeSet2.OLrzqt(unicodeSet);
        this.KWHzl = unicodeSet2;
    }
}
