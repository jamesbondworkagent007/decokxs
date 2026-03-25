package o;

import j$.time.DateTimeException;
import j$.time.temporal.ChronoField;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.util.Objects;

/* JADX INFO: renamed from: o.yCr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56365yCr {
    long getLong(InterfaceC56372yCy interfaceC56372yCy);

    boolean isSupported(InterfaceC56372yCy interfaceC56372yCy);

    default ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            Objects.requireNonNull(interfaceC56372yCy, "field");
            return interfaceC56372yCy.rangeRefinedBy(this);
        }
        if (isSupported(interfaceC56372yCy)) {
            return interfaceC56372yCy.range();
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
    }

    default java.lang.Object query(yCG ycg) {
        if (ycg == AbstractC56371yCx.djBIcL() || ycg == AbstractC56371yCx.EZpvd() || ycg == AbstractC56371yCx.AEQbTJ()) {
            return null;
        }
        return ycg.AEQbTJ(this);
    }

    default int get(InterfaceC56372yCy interfaceC56372yCy) {
        ValueRange valueRangeRange = range(interfaceC56372yCy);
        if (!valueRangeRange.isIntValue()) {
            throw new UnsupportedTemporalTypeException("Invalid field " + interfaceC56372yCy + " for get() method, use getLong() instead");
        }
        long j = getLong(interfaceC56372yCy);
        if (valueRangeRange.isValidValue(j)) {
            return (int) j;
        }
        throw new DateTimeException("Invalid value for " + interfaceC56372yCy + " (valid values " + valueRangeRange + "): " + j);
    }
}
