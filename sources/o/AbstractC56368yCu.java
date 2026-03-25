package o;

import j$.time.DayOfWeek;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;

/* JADX INFO: renamed from: o.yCu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC56368yCu {
    public static InterfaceC56366yCs EZpvd(DayOfWeek dayOfWeek) {
        final int value = dayOfWeek.getValue();
        return new InterfaceC56366yCs() { // from class: o.yCw
            @Override // o.InterfaceC56366yCs
            public final InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
                return AbstractC56368yCu.EZpvd(value, interfaceC56367yCt);
            }
        };
    }

    public static InterfaceC56366yCs OLrzqt() {
        return new InterfaceC56366yCs() { // from class: o.yCz
            @Override // o.InterfaceC56366yCs
            public final InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
                return AbstractC56368yCu.OLrzqt(interfaceC56367yCt);
            }
        };
    }

    static /* synthetic */ InterfaceC56367yCt EZpvd(int i, InterfaceC56367yCt interfaceC56367yCt) {
        int i2 = interfaceC56367yCt.get(ChronoField.DAY_OF_WEEK);
        if (i2 == i) {
            return interfaceC56367yCt;
        }
        return interfaceC56367yCt.plus(i2 - i >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
    }

    static /* synthetic */ InterfaceC56367yCt OLrzqt(InterfaceC56367yCt interfaceC56367yCt) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return interfaceC56367yCt.with(chronoField, interfaceC56367yCt.range(chronoField).getMaximum());
    }
}
