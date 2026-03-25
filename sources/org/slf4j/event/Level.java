package org.slf4j.event;

import com.reown.android.pulse.model.EventType;

/* JADX INFO: loaded from: classes13.dex */
public enum Level {
    ERROR(40, EventType.ERROR),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");

    private final int levelInt;
    private final String levelStr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int toInt() {
        return this.levelInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.levelStr;
    }

    Level(int i, String str) {
        this.levelInt = i;
        this.levelStr = str;
    }

    public static Level intToLevel(int i) {
        if (i == 0) {
            return TRACE;
        }
        if (i == 10) {
            return DEBUG;
        }
        if (i == 20) {
            return INFO;
        }
        if (i == 30) {
            return WARN;
        }
        if (i == 40) {
            return ERROR;
        }
        throw new IllegalArgumentException("Level integer [" + i + "] not recognized.");
    }
}
