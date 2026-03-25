package o;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;

/* JADX INFO: renamed from: o.yCx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56371yCx {
    static final yCG gEmmrt = new yCG() { // from class: o.yCC
        @Override // o.yCG
        public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
            return AbstractC56371yCx.copydefault(interfaceC56365yCr);
        }
    };
    static final yCG copydefault = new yCG() { // from class: o.yCA
        @Override // o.yCG
        public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
            return AbstractC56371yCx.KWHzl(interfaceC56365yCr);
        }
    };
    static final yCG AEQbTJ = new yCG() { // from class: o.yCD
        @Override // o.yCG
        public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
            return AbstractC56371yCx.AEQbTJ(interfaceC56365yCr);
        }
    };
    static final yCG KWHzl = new yCG() { // from class: o.yCE
        @Override // o.yCG
        public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
            return AbstractC56371yCx.OLrzqt(interfaceC56365yCr);
        }
    };
    static final yCG djBIcL = new yCG() { // from class: o.yCB
        @Override // o.yCG
        public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
            return AbstractC56371yCx.EZpvd(interfaceC56365yCr);
        }
    };
    static final yCG OLrzqt = new yCG() { // from class: o.yCJ
        @Override // o.yCG
        public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
            return AbstractC56371yCx.AYXKKw(interfaceC56365yCr);
        }
    };
    static final yCG EZpvd = new yCG() { // from class: o.yCI
        @Override // o.yCG
        public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
            return AbstractC56371yCx.gEmmrt(interfaceC56365yCr);
        }
    };

    public static yCG djBIcL() {
        return gEmmrt;
    }

    public static yCG gEmmrt() {
        return djBIcL;
    }

    public static yCG AEQbTJ() {
        return AEQbTJ;
    }

    public static yCG copydefault() {
        return KWHzl;
    }

    public static yCG KWHzl() {
        return EZpvd;
    }

    public static yCG OLrzqt() {
        return OLrzqt;
    }

    static /* synthetic */ LocalTime gEmmrt(InterfaceC56365yCr interfaceC56365yCr) {
        ChronoField chronoField = ChronoField.NANO_OF_DAY;
        if (interfaceC56365yCr.isSupported(chronoField)) {
            return LocalTime.ofNanoOfDay(interfaceC56365yCr.getLong(chronoField));
        }
        return null;
    }

    static /* synthetic */ LocalDate AYXKKw(InterfaceC56365yCr interfaceC56365yCr) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (interfaceC56365yCr.isSupported(chronoField)) {
            return LocalDate.ofEpochDay(interfaceC56365yCr.getLong(chronoField));
        }
        return null;
    }

    static /* synthetic */ ZoneId EZpvd(InterfaceC56365yCr interfaceC56365yCr) {
        ZoneId zoneId = (ZoneId) interfaceC56365yCr.query(gEmmrt);
        return zoneId != null ? zoneId : (ZoneId) interfaceC56365yCr.query(KWHzl);
    }

    static /* synthetic */ ZoneOffset OLrzqt(InterfaceC56365yCr interfaceC56365yCr) {
        ChronoField chronoField = ChronoField.OFFSET_SECONDS;
        if (interfaceC56365yCr.isSupported(chronoField)) {
            return ZoneOffset.ofTotalSeconds(interfaceC56365yCr.get(chronoField));
        }
        return null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CHECK_CAST (o.yCF) (wrap:java.lang.Object:0x0002: INVOKE (r1v0 o.yCr), (wrap:o.yCG:0x0000: SGET  A[WRAPPED] (LINE:65350) o.yCx.AEQbTJ o.yCG) INTERFACE call: o.yCr.query(o.yCG):java.lang.Object A[MD:(o.yCG):java.lang.Object (m), WRAPPED] (LINE:65350)) */
    static /* synthetic */ yCF AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
        return (yCF) interfaceC56365yCr.query(AEQbTJ);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CHECK_CAST (o.yCd) (wrap:java.lang.Object:0x0002: INVOKE (r1v0 o.yCr), (wrap:o.yCG:0x0000: SGET  A[WRAPPED] (LINE:65351) o.yCx.copydefault o.yCG) INTERFACE call: o.yCr.query(o.yCG):java.lang.Object A[MD:(o.yCG):java.lang.Object (m), WRAPPED] (LINE:65351)) */
    static /* synthetic */ InterfaceC56351yCd KWHzl(InterfaceC56365yCr interfaceC56365yCr) {
        return (InterfaceC56351yCd) interfaceC56365yCr.query(copydefault);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CHECK_CAST (j$.time.ZoneId) (wrap:java.lang.Object:0x0002: INVOKE (r1v0 o.yCr), (wrap:o.yCG:0x0000: SGET  A[WRAPPED] (LINE:65352) o.yCx.gEmmrt o.yCG) INTERFACE call: o.yCr.query(o.yCG):java.lang.Object A[MD:(o.yCG):java.lang.Object (m), WRAPPED] (LINE:65352)) */
    static /* synthetic */ ZoneId copydefault(InterfaceC56365yCr interfaceC56365yCr) {
        return (ZoneId) interfaceC56365yCr.query(gEmmrt);
    }

    public static yCG EZpvd() {
        return copydefault;
    }
}
