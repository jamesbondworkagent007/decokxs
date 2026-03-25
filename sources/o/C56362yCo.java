package o;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.util.Objects;

/* JADX INFO: renamed from: o.yCo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56362yCo {
    private C56350yCc AEQbTJ;
    private int KWHzl;
    private InterfaceC56365yCr copydefault;

    public java.lang.String toString() {
        return this.copydefault.toString();
    }

    public void copydefault() {
        this.KWHzl++;
    }

    public java.lang.Object KWHzl(yCG ycg) {
        java.lang.Object objQuery = this.copydefault.query(ycg);
        if (objQuery != null || this.KWHzl != 0) {
            return objQuery;
        }
        throw new DateTimeException("Unable to extract value: " + this.copydefault.getClass());
    }

    public java.lang.Long OLrzqt(InterfaceC56372yCy interfaceC56372yCy) {
        try {
            return java.lang.Long.valueOf(this.copydefault.getLong(interfaceC56372yCy));
        } catch (DateTimeException e) {
            if (this.KWHzl > 0) {
                return null;
            }
            throw e;
        }
    }

    public InterfaceC56365yCr KWHzl() {
        return this.copydefault;
    }

    public java.util.Locale OLrzqt() {
        return this.AEQbTJ.EZpvd();
    }

    public C56359yCl EZpvd() {
        return this.AEQbTJ.OLrzqt();
    }

    public void AEQbTJ() {
        this.KWHzl--;
    }

    private static InterfaceC56365yCr AEQbTJ(final InterfaceC56365yCr interfaceC56365yCr, C56350yCc c56350yCc) {
        InterfaceC56351yCd interfaceC56351yCdKWHzl = c56350yCc.KWHzl();
        ZoneId zoneIdAEQbTJ = c56350yCc.AEQbTJ();
        if (interfaceC56351yCdKWHzl == null && zoneIdAEQbTJ == null) {
            return interfaceC56365yCr;
        }
        InterfaceC56351yCd interfaceC56351yCd = (InterfaceC56351yCd) interfaceC56365yCr.query(AbstractC56371yCx.EZpvd());
        final ZoneId zoneId = (ZoneId) interfaceC56365yCr.query(AbstractC56371yCx.djBIcL());
        final yBW ybwDate = null;
        if (Objects.equals(interfaceC56351yCdKWHzl, interfaceC56351yCd)) {
            interfaceC56351yCdKWHzl = null;
        }
        if (Objects.equals(zoneIdAEQbTJ, zoneId)) {
            zoneIdAEQbTJ = null;
        }
        if (interfaceC56351yCdKWHzl == null && zoneIdAEQbTJ == null) {
            return interfaceC56365yCr;
        }
        final InterfaceC56351yCd interfaceC56351yCd2 = interfaceC56351yCdKWHzl != null ? interfaceC56351yCdKWHzl : interfaceC56351yCd;
        if (zoneIdAEQbTJ != null) {
            if (interfaceC56365yCr.isSupported(ChronoField.INSTANT_SECONDS)) {
                if (interfaceC56351yCd2 == null) {
                    interfaceC56351yCd2 = IsoChronology.INSTANCE;
                }
                return interfaceC56351yCd2.zonedDateTime(Instant.from(interfaceC56365yCr), zoneIdAEQbTJ);
            }
            if (zoneIdAEQbTJ.normalized() instanceof ZoneOffset) {
                ChronoField chronoField = ChronoField.OFFSET_SECONDS;
                if (interfaceC56365yCr.isSupported(chronoField) && interfaceC56365yCr.get(chronoField) != zoneIdAEQbTJ.getRules().getOffset(Instant.EPOCH).getTotalSeconds()) {
                    throw new DateTimeException("Unable to apply override zone '" + zoneIdAEQbTJ + "' because the temporal object being formatted has a different offset but does not represent an instant: " + interfaceC56365yCr);
                }
            }
        }
        if (zoneIdAEQbTJ != null) {
            zoneId = zoneIdAEQbTJ;
        }
        if (interfaceC56351yCdKWHzl != null) {
            if (interfaceC56365yCr.isSupported(ChronoField.EPOCH_DAY)) {
                ybwDate = interfaceC56351yCd2.date(interfaceC56365yCr);
            } else if (interfaceC56351yCdKWHzl != IsoChronology.INSTANCE || interfaceC56351yCd != null) {
                for (ChronoField chronoField2 : ChronoField.values()) {
                    if (chronoField2.isDateBased() && interfaceC56365yCr.isSupported(chronoField2)) {
                        throw new DateTimeException("Unable to apply override chronology '" + interfaceC56351yCdKWHzl + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + interfaceC56365yCr);
                    }
                }
            }
        }
        return new InterfaceC56365yCr() { // from class: o.yCo.1
            @Override // o.InterfaceC56365yCr
            public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
                return ((ybwDate == null || !interfaceC56372yCy.isDateBased()) ? interfaceC56365yCr : ybwDate).range(interfaceC56372yCy);
            }

            @Override // o.InterfaceC56365yCr
            public java.lang.Object query(yCG ycg) {
                return ycg == AbstractC56371yCx.EZpvd() ? interfaceC56351yCd2 : ycg == AbstractC56371yCx.djBIcL() ? zoneId : ycg == AbstractC56371yCx.AEQbTJ() ? interfaceC56365yCr.query(ycg) : ycg.AEQbTJ(this);
            }

            @Override // o.InterfaceC56365yCr
            public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
                return (ybwDate == null || !interfaceC56372yCy.isDateBased()) ? interfaceC56365yCr.isSupported(interfaceC56372yCy) : ybwDate.isSupported(interfaceC56372yCy);
            }

            @Override // o.InterfaceC56365yCr
            public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
                return ((ybwDate == null || !interfaceC56372yCy.isDateBased()) ? interfaceC56365yCr : ybwDate).getLong(interfaceC56372yCy);
            }
        };
    }

    C56362yCo(InterfaceC56365yCr interfaceC56365yCr, C56350yCc c56350yCc) {
        this.copydefault = AEQbTJ(interfaceC56365yCr, c56350yCc);
        this.AEQbTJ = c56350yCc;
    }
}
