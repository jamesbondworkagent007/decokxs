package o;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;

/* JADX INFO: renamed from: o.yGi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56464yGi {
    public static final C56464yGi copydefault = new C56464yGi();
    public static final LinkOption[] OLrzqt = {LinkOption.NOFOLLOW_LINKS};
    public static final LinkOption[] EZpvd = new LinkOption[0];
    public static final java.util.Set<FileVisitOption> AEQbTJ = yEE.copydefault();
    public static final java.util.Set<FileVisitOption> KWHzl = yED.AEQbTJ(FileVisitOption.FOLLOW_LINKS);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<FileVisitOption> AEQbTJ(boolean z) {
        return z ? KWHzl : AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkOption[] es_(boolean z) {
        return z ? EZpvd : OLrzqt;
    }

    private C56464yGi() {
    }
}
