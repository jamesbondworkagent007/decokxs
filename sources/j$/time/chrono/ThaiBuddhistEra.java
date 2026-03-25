package j$.time.chrono;

import j$.time.DateTimeException;
import o.InterfaceC56352yCe;

/* JADX INFO: loaded from: classes24.dex */
public enum ThaiBuddhistEra implements InterfaceC56352yCe {
    BEFORE_BE,
    BE;

    @Override // o.InterfaceC56352yCe
    public int getValue() {
        return ordinal();
    }

    public static ThaiBuddhistEra of(int i) {
        if (i == 0) {
            return BEFORE_BE;
        }
        if (i == 1) {
            return BE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }
}
