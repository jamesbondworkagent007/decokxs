package o;

import java.text.CharacterIterator;
import okio.Utf8;

/* JADX INFO: renamed from: o.abR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7017abR {
    private C7017abR() {
    }

    public static int OLrzqt(CharacterIterator characterIterator) {
        char next;
        char cCurrent = characterIterator.current();
        if (cCurrent >= 55296 && cCurrent <= 56319 && ((next = characterIterator.next()) < 56320 || next > 57343)) {
            characterIterator.previous();
        }
        int next2 = characterIterator.next();
        if (next2 >= 55296) {
            next2 = copydefault(characterIterator, next2);
        }
        if (next2 >= 65536 && next2 != Integer.MAX_VALUE) {
            characterIterator.previous();
        }
        return next2;
    }

    public static int copydefault(CharacterIterator characterIterator, int i) {
        if (i == 65535 && characterIterator.getIndex() >= characterIterator.getEndIndex()) {
            return Integer.MAX_VALUE;
        }
        if (i > 56319) {
            return i;
        }
        char next = characterIterator.next();
        if (C7242agD.OLrzqt(next)) {
            return 65536 + ((i - 55296) << 10) + (next - Utf8.LOG_SURROGATE_HEADER);
        }
        characterIterator.previous();
        return i;
    }

    public static int KWHzl(CharacterIterator characterIterator) {
        if (characterIterator.getIndex() <= characterIterator.getBeginIndex()) {
            return Integer.MAX_VALUE;
        }
        char cPrevious = characterIterator.previous();
        if (!C7242agD.OLrzqt(cPrevious) || characterIterator.getIndex() <= characterIterator.getBeginIndex()) {
            return cPrevious;
        }
        char cPrevious2 = characterIterator.previous();
        if (C7242agD.AEQbTJ(cPrevious2)) {
            return 65536 + ((cPrevious2 - 55296) << 10) + (cPrevious - Utf8.LOG_SURROGATE_HEADER);
        }
        characterIterator.next();
        return cPrevious;
    }

    public static int AEQbTJ(CharacterIterator characterIterator) {
        char cCurrent = characterIterator.current();
        if (cCurrent < 55296) {
            return cCurrent;
        }
        if (C7242agD.AEQbTJ(cCurrent)) {
            char next = characterIterator.next();
            characterIterator.previous();
            return C7242agD.OLrzqt((char) next) ? 65536 + ((cCurrent - 55296) << 10) + (next - Utf8.LOG_SURROGATE_HEADER) : cCurrent;
        }
        if (cCurrent != 65535 || characterIterator.getIndex() < characterIterator.getEndIndex()) {
            return cCurrent;
        }
        return Integer.MAX_VALUE;
    }
}
