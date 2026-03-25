package j$.time;

import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Clock {
    public abstract ZoneId getZone();

    public abstract Instant instant();

    static final class SystemClock extends Clock implements Serializable {
        private final ZoneId zone;

        public String toString() {
            return "SystemClock[" + this.zone + "]";
        }

        @Override // j$.time.Clock
        public long millis() {
            return System.currentTimeMillis();
        }

        @Override // j$.time.Clock
        public Instant instant() {
            return Instant.ofEpochMilli(millis());
        }

        @Override // j$.time.Clock
        public int hashCode() {
            return this.zone.hashCode() + 1;
        }

        @Override // j$.time.Clock
        public ZoneId getZone() {
            return this.zone;
        }

        @Override // j$.time.Clock
        public boolean equals(Object obj) {
            if (obj instanceof SystemClock) {
                return this.zone.equals(((SystemClock) obj).zone);
            }
            return false;
        }

        SystemClock(ZoneId zoneId) {
            this.zone = zoneId;
        }
    }

    public long millis() {
        return instant().toEpochMilli();
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static Clock systemUTC() {
        return new SystemClock(ZoneOffset.UTC);
    }

    public static Clock systemDefaultZone() {
        return new SystemClock(ZoneId.systemDefault());
    }

    protected Clock() {
    }
}
