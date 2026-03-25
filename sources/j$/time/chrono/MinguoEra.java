package j$.time.chrono;

import j$.time.DateTimeException;
import o.InterfaceC56352yCe;

/* JADX INFO: loaded from: classes24.dex */
public enum MinguoEra implements InterfaceC56352yCe {
    BEFORE_ROC,
    ROC;

    @Override // o.InterfaceC56352yCe
    public int getValue() {
        return ordinal();
    }

    public static MinguoEra of(int i) {
        if (i == 0) {
            return BEFORE_ROC;
        }
        if (i == 1) {
            return ROC;
        }
        throw new DateTimeException("Invalid era: " + i);
    }
}
