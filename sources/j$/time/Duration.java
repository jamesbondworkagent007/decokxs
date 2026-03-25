package j$.time;

import com.google.android.exoplayer2.C;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;
import o.InterfaceC56367yCt;
import o.InterfaceC56369yCv;

/* JADX INFO: loaded from: classes13.dex */
public final class Duration implements InterfaceC56369yCv, Comparable<Duration>, Serializable {
    private final int nanos;
    private final long seconds;
    public static final Duration ZERO = new Duration(0, 0);
    private static final BigInteger BI_NANOS_PER_SECOND = BigInteger.valueOf(C.NANOS_PER_SECOND);
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);

    public String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.seconds;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.nanos == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.nanos <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.nanos > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - ((long) this.nanos));
            } else {
                sb.append(((long) this.nanos) + C.NANOS_PER_SECOND);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public long toNanos() {
        return Math.addExact(Math.multiplyExact(this.seconds, C.NANOS_PER_SECOND), this.nanos);
    }

    public long toMillis() {
        return Math.addExact(Math.multiplyExact(this.seconds, 1000L), this.nanos / 1000000);
    }

    @Override // o.InterfaceC56369yCv
    public InterfaceC56367yCt subtractFrom(InterfaceC56367yCt interfaceC56367yCt) {
        long j = this.seconds;
        if (j != 0) {
            interfaceC56367yCt = interfaceC56367yCt.minus(j, ChronoUnit.SECONDS);
        }
        int i = this.nanos;
        return i != 0 ? interfaceC56367yCt.minus(i, ChronoUnit.NANOS) : interfaceC56367yCt;
    }

    public Duration negated() {
        return multipliedBy(-1L);
    }

    public Duration multipliedBy(long j) {
        if (j == 0) {
            return ZERO;
        }
        return j == 1 ? this : create(toSeconds().multiply(BigDecimal.valueOf(j)));
    }

    public boolean isZero() {
        return (this.seconds | ((long) this.nanos)) == 0;
    }

    public boolean isNegative() {
        return this.seconds < 0;
    }

    public int hashCode() {
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    public long getSeconds() {
        return this.seconds;
    }

    public int getNano() {
        return this.nanos;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.seconds == duration.seconds && this.nanos == duration.nanos;
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.seconds, duration.seconds);
        return iCompare != 0 ? iCompare : this.nanos - duration.nanos;
    }

    @Override // o.InterfaceC56369yCv
    public InterfaceC56367yCt addTo(InterfaceC56367yCt interfaceC56367yCt) {
        long j = this.seconds;
        if (j != 0) {
            interfaceC56367yCt = interfaceC56367yCt.plus(j, ChronoUnit.SECONDS);
        }
        int i = this.nanos;
        return i != 0 ? interfaceC56367yCt.plus(i, ChronoUnit.NANOS) : interfaceC56367yCt;
    }

    private BigDecimal toSeconds() {
        return BigDecimal.valueOf(this.seconds).add(BigDecimal.valueOf(this.nanos, 9));
    }

    public static Duration ofSeconds(long j, long j2) {
        return create(Math.addExact(j, Math.floorDiv(j2, C.NANOS_PER_SECOND)), (int) Math.floorMod(j2, C.NANOS_PER_SECOND));
    }

    public static Duration ofSeconds(long j) {
        return create(j, 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / C.NANOS_PER_SECOND;
        int i = (int) (j % C.NANOS_PER_SECOND);
        if (i < 0) {
            i = (int) (((long) i) + C.NANOS_PER_SECOND);
            j2--;
        }
        return create(j2, i);
    }

    public static Duration ofMinutes(long j) {
        return create(Math.multiplyExact(j, 60L), 0);
    }

    private static Duration create(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(BI_NANOS_PER_SECOND);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
    }

    private static Duration create(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    public static Duration between(InterfaceC56367yCt interfaceC56367yCt, InterfaceC56367yCt interfaceC56367yCt2) {
        try {
            return ofNanos(interfaceC56367yCt.until(interfaceC56367yCt2, ChronoUnit.NANOS));
        } catch (DateTimeException | ArithmeticException unused) {
            long jUntil = interfaceC56367yCt.until(interfaceC56367yCt2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                long j2 = interfaceC56367yCt2.getLong(chronoField) - interfaceC56367yCt.getLong(chronoField);
                if (jUntil > 0 && j2 < 0) {
                    jUntil++;
                } else if (jUntil < 0 && j2 > 0) {
                    jUntil--;
                }
                j = j2;
            } catch (DateTimeException unused2) {
            }
            return ofSeconds(jUntil, j);
        }
    }

    private Duration(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }
}
