package o;

import java.util.regex.Matcher;
import kotlin.text.MatchResult;

/* JADX INFO: renamed from: o.zhw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59488zhw {
    public static final MatchResult AEQbTJ(Matcher matcher, int i, java.lang.CharSequence charSequence) {
        if (matcher.find(i)) {
            return new C59489zhx(matcher, charSequence);
        }
        return null;
    }

    public static final MatchResult KWHzl(Matcher matcher, java.lang.CharSequence charSequence) {
        if (matcher.matches()) {
            return new C59489zhx(matcher, charSequence);
        }
        return null;
    }

    public static final kotlin.ranges.IntRange AEQbTJ(java.util.regex.MatchResult matchResult) {
        return C56548yJl.AhwBna(matchResult.start(), matchResult.end());
    }

    public static final kotlin.ranges.IntRange AEQbTJ(java.util.regex.MatchResult matchResult, int i) {
        return C56548yJl.AhwBna(matchResult.start(i), matchResult.end(i));
    }

    public static final int AEQbTJ(java.lang.Iterable<? extends InterfaceC59476zhk> iterable) {
        java.util.Iterator<? extends InterfaceC59476zhk> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }
}
