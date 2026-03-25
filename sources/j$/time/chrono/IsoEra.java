package j$.time.chrono;

import j$.time.DateTimeException;
import o.InterfaceC56352yCe;

/* JADX INFO: loaded from: classes13.dex */
public enum IsoEra implements InterfaceC56352yCe {
    BCE,
    CE;

    @Override // o.InterfaceC56352yCe
    public int getValue() {
        return ordinal();
    }

    public static IsoEra of(int i) {
        if (i == 0) {
            return BCE;
        }
        if (i == 1) {
            return CE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }
}
