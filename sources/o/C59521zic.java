package o;

import kotlin.time.DurationUnit;
import kotlin.time.TimeMark;
import o.InterfaceC59524zif;

/* JADX INFO: renamed from: o.zic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59521zic implements InterfaceC59523zie {
    public static final C59521zic OLrzqt = new C59521zic();
    public static final long KWHzl = java.lang.System.nanoTime();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TimeSource(System.nanoTime())";
    }

    private C59521zic() {
    }

    @Override // o.InterfaceC59524zif
    public /* synthetic */ TimeMark KWHzl() {
        return InterfaceC59524zif.StateListAnimator.Application.copydefault(OLrzqt());
    }

    private final long copydefault() {
        return java.lang.System.nanoTime() - KWHzl;
    }

    public long OLrzqt() {
        return InterfaceC59524zif.StateListAnimator.Application.OLrzqt(copydefault());
    }

    public final long copydefault(long j) {
        return C59522zid.KWHzl(copydefault(), j, DurationUnit.NANOSECONDS);
    }

    public final long EZpvd(long j, long j2) {
        return C59522zid.EZpvd(j, j2, DurationUnit.NANOSECONDS);
    }

    public final long KWHzl(long j, long j2) {
        return InterfaceC59524zif.StateListAnimator.Application.OLrzqt(C59522zid.KWHzl(j, DurationUnit.NANOSECONDS, j2));
    }
}
