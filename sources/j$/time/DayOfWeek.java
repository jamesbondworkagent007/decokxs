package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.TextStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.util.Locale;
import o.AbstractC56371yCx;
import o.InterfaceC56365yCr;
import o.InterfaceC56366yCs;
import o.InterfaceC56367yCt;
import o.InterfaceC56372yCy;
import o.yCG;

/* JADX INFO: loaded from: classes13.dex */
public enum DayOfWeek implements InterfaceC56365yCr, InterfaceC56366yCs {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    private static final DayOfWeek[] ENUMS = values();

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy == ChronoField.DAY_OF_WEEK ? interfaceC56372yCy.range() : super.range(interfaceC56372yCy);
    }

    @Override // o.InterfaceC56365yCr
    public Object query(yCG ycg) {
        return ycg == AbstractC56371yCx.AEQbTJ() ? ChronoUnit.DAYS : super.query(ycg);
    }

    public DayOfWeek plus(long j) {
        return ENUMS[(ordinal() + (((int) (j % 7)) + 7)) % 7];
    }

    @Override // o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? interfaceC56372yCy == ChronoField.DAY_OF_WEEK : interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        if (interfaceC56372yCy == ChronoField.DAY_OF_WEEK) {
            return getValue();
        }
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.getFrom(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new DateTimeFormatterBuilder().OLrzqt(ChronoField.DAY_OF_WEEK, textStyle).copydefault(locale).OLrzqt(this);
    }

    @Override // o.InterfaceC56365yCr
    public int get(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy == ChronoField.DAY_OF_WEEK ? getValue() : super.get(interfaceC56372yCy);
    }

    @Override // o.InterfaceC56366yCs
    public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
        return interfaceC56367yCt.with(ChronoField.DAY_OF_WEEK, getValue());
    }

    public static DayOfWeek of(int i) {
        if (i >= 1 && i <= 7) {
            return ENUMS[i - 1];
        }
        throw new DateTimeException("Invalid value for DayOfWeek: " + i);
    }
}
