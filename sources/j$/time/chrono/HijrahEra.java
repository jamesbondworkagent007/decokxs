package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import o.InterfaceC56352yCe;
import o.InterfaceC56372yCy;

/* JADX INFO: loaded from: classes24.dex */
public enum HijrahEra implements InterfaceC56352yCe {
    AH;

    @Override // o.InterfaceC56352yCe
    public int getValue() {
        return 1;
    }

    @Override // o.InterfaceC56352yCe, o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy == ChronoField.ERA ? ValueRange.of(1L, 1L) : super.range(interfaceC56372yCy);
    }
}
