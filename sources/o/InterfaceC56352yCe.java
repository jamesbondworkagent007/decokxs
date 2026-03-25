package o;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;

/* JADX INFO: renamed from: o.yCe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56352yCe extends InterfaceC56365yCr, InterfaceC56366yCs {
    int getValue();

    @Override // o.InterfaceC56365yCr
    default ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        return super.range(interfaceC56372yCy);
    }

    @Override // o.InterfaceC56365yCr
    default java.lang.Object query(yCG ycg) {
        return ycg == AbstractC56371yCx.AEQbTJ() ? ChronoUnit.ERAS : super.query(ycg);
    }

    @Override // o.InterfaceC56365yCr
    default boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? interfaceC56372yCy == ChronoField.ERA : interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this);
    }

    @Override // o.InterfaceC56365yCr
    default long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        if (interfaceC56372yCy == ChronoField.ERA) {
            return getValue();
        }
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.getFrom(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
    }

    @Override // o.InterfaceC56365yCr
    default int get(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy == ChronoField.ERA ? getValue() : super.get(interfaceC56372yCy);
    }

    @Override // o.InterfaceC56366yCs
    default InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
        return interfaceC56367yCt.with(ChronoField.ERA, getValue());
    }
}
