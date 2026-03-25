package o;

import java.nio.file.LinkOption;
import kotlin.io.path.PathTreeWalk$bfsIterator$1;
import kotlin.io.path.PathTreeWalk$dfsIterator$1;
import kotlin.io.path.PathWalkOption;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: o.yGu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56476yGu implements Sequence<java.nio.file.Path> {
    public final PathWalkOption[] EZpvd;
    public final java.nio.file.Path copydefault;

    public final boolean OLrzqt() {
        return yDV.valueOf(this.EZpvd, PathWalkOption.FOLLOW_LINKS);
    }

    public final LinkOption[] eF_() {
        return C56464yGi.copydefault.es_(OLrzqt());
    }

    public final boolean EZpvd() {
        return yDV.valueOf(this.EZpvd, PathWalkOption.INCLUDE_DIRECTORIES);
    }

    public final boolean valueOf() {
        return yDV.valueOf(this.EZpvd, PathWalkOption.BREADTH_FIRST);
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<java.nio.file.Path> iterator() {
        return valueOf() ? AEQbTJ() : copydefault();
    }

    public final java.util.Iterator<java.nio.file.Path> copydefault() {
        return C59404zgR.copydefault(new PathTreeWalk$dfsIterator$1(this, null));
    }

    public final java.util.Iterator<java.nio.file.Path> AEQbTJ() {
        return C59404zgR.copydefault(new PathTreeWalk$bfsIterator$1(this, null));
    }
}
