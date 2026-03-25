package j$.time;

import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import o.AbstractC56371yCx;
import o.InterfaceC56351yCd;
import o.InterfaceC56365yCr;
import o.InterfaceC56366yCs;
import o.InterfaceC56367yCt;
import o.InterfaceC56372yCy;
import o.yCG;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes13.dex */
public enum Month implements InterfaceC56365yCr, InterfaceC56366yCs {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final Month[] ENUMS = values();

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy == ChronoField.MONTH_OF_YEAR ? interfaceC56372yCy.range() : super.range(interfaceC56372yCy);
    }

    @Override // o.InterfaceC56365yCr
    public Object query(yCG ycg) {
        return ycg == AbstractC56371yCx.EZpvd() ? IsoChronology.INSTANCE : ycg == AbstractC56371yCx.AEQbTJ() ? ChronoUnit.MONTHS : super.query(ycg);
    }

    public Month plus(long j) {
        return ENUMS[(ordinal() + (((int) (j % 12)) + 12)) % 12];
    }

    public int length(boolean z) {
        int i = AnonymousClass5.copydefault[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    @Override // o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? interfaceC56372yCy == ChronoField.MONTH_OF_YEAR : interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        if (interfaceC56372yCy == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.getFrom(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
    }

    @Override // o.InterfaceC56365yCr
    public int get(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy == ChronoField.MONTH_OF_YEAR ? getValue() : super.get(interfaceC56372yCy);
    }

    public int firstDayOfYear(boolean z) {
        switch (AnonymousClass5.copydefault[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    @Override // o.InterfaceC56366yCs
    public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
        if (InterfaceC56351yCd.KWHzl(interfaceC56367yCt).equals(IsoChronology.INSTANCE)) {
            return interfaceC56367yCt.with(ChronoField.MONTH_OF_YEAR, getValue());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public static Month of(int i) {
        if (i >= 1 && i <= 12) {
            return ENUMS[i - 1];
        }
        throw new DateTimeException("Invalid value for MonthOfYear: " + i);
    }

    /* JADX INFO: renamed from: j$.time.Month$5, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[Month.values().length];
            copydefault = iArr;
            try {
                iArr[Month.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[Month.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[Month.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                copydefault[Month.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                copydefault[Month.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                copydefault[Month.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                copydefault[Month.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                copydefault[Month.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                copydefault[Month.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                copydefault[Month.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                copydefault[Month.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                copydefault[Month.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }
}
