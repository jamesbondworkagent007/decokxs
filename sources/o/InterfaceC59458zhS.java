package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59458zhS extends TimeMark, java.lang.Comparable<InterfaceC59458zhS> {
    long KWHzl(@NotNull InterfaceC59458zhS interfaceC59458zhS);

    /* JADX INFO: renamed from: o.zhS$TaskDescription */
    public static final class TaskDescription {
        public static int copydefault(@NotNull InterfaceC59458zhS interfaceC59458zhS, @NotNull InterfaceC59458zhS interfaceC59458zhS2) {
            Intrinsics.checkNotNullParameter(interfaceC59458zhS2, "");
            return C59462zhW.KWHzl(interfaceC59458zhS.KWHzl(interfaceC59458zhS2), C59462zhW.OLrzqt.KWHzl());
        }
    }
}
