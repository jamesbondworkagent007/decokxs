package j$.time.temporal;

import com.fasterxml.jackson.core.JsonPointer;
import j$.time.DateTimeException;
import java.io.Serializable;
import o.InterfaceC56372yCy;

/* JADX INFO: loaded from: classes13.dex */
public final class ValueRange implements Serializable {
    private final long maxLargest;
    private final long maxSmallest;
    private final long minLargest;
    private final long minSmallest;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.minSmallest);
        if (this.minSmallest != this.minLargest) {
            sb.append(JsonPointer.SEPARATOR);
            sb.append(this.minLargest);
        }
        sb.append(" - ");
        sb.append(this.maxSmallest);
        if (this.maxSmallest != this.maxLargest) {
            sb.append(JsonPointer.SEPARATOR);
            sb.append(this.maxLargest);
        }
        return sb.toString();
    }

    public boolean isValidValue(long j) {
        return j >= getMinimum() && j <= getMaximum();
    }

    public boolean isValidIntValue(long j) {
        return isIntValue() && isValidValue(j);
    }

    public boolean isIntValue() {
        return getMinimum() >= -2147483648L && getMaximum() <= 2147483647L;
    }

    public boolean isFixed() {
        return this.minSmallest == this.minLargest && this.maxSmallest == this.maxLargest;
    }

    public int hashCode() {
        long j = this.minSmallest;
        long j2 = this.minLargest;
        long j3 = this.maxSmallest;
        long j4 = this.maxLargest;
        long j5 = j + (j2 << 16) + (j2 >> 48) + (j3 << 32) + (j3 >> 32) + (j4 << 48) + (j4 >> 16);
        return (int) (j5 ^ (j5 >>> 32));
    }

    public long getSmallestMaximum() {
        return this.maxSmallest;
    }

    public long getMinimum() {
        return this.minSmallest;
    }

    public long getMaximum() {
        return this.maxLargest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueRange)) {
            return false;
        }
        ValueRange valueRange = (ValueRange) obj;
        return this.minSmallest == valueRange.minSmallest && this.minLargest == valueRange.minLargest && this.maxSmallest == valueRange.maxSmallest && this.maxLargest == valueRange.maxLargest;
    }

    public long checkValidValue(long j, InterfaceC56372yCy interfaceC56372yCy) {
        if (isValidValue(j)) {
            return j;
        }
        throw new DateTimeException(genInvalidFieldMessage(interfaceC56372yCy, j));
    }

    public int checkValidIntValue(long j, InterfaceC56372yCy interfaceC56372yCy) {
        if (isValidIntValue(j)) {
            return (int) j;
        }
        throw new DateTimeException(genInvalidFieldMessage(interfaceC56372yCy, j));
    }

    public static ValueRange of(long j, long j2, long j3, long j4) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j3 > j4) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 <= j4) {
            return new ValueRange(j, j2, j3, j4);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static ValueRange of(long j, long j2, long j3) {
        return of(j, j, j2, j3);
    }

    public static ValueRange of(long j, long j2) {
        if (j <= j2) {
            return new ValueRange(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    private String genInvalidFieldMessage(InterfaceC56372yCy interfaceC56372yCy, long j) {
        if (interfaceC56372yCy != null) {
            return "Invalid value for " + interfaceC56372yCy + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    private ValueRange(long j, long j2, long j3, long j4) {
        this.minSmallest = j;
        this.minLargest = j2;
        this.maxSmallest = j3;
        this.maxLargest = j4;
    }
}
