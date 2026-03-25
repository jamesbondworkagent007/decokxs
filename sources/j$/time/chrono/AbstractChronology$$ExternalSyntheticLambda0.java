package j$.time.chrono;

import java.io.Serializable;
import java.util.Comparator;
import o.yBW;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class AbstractChronology$$ExternalSyntheticLambda0 implements Comparator, Serializable {
    /* JADX DEBUG: Class process forced to load method for inline: o.yBX.lambda$static$7f2d2d5b$1(o.yBW, o.yBW):int */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((yBW) obj).toEpochDay(), ((yBW) obj2).toEpochDay());
    }
}
