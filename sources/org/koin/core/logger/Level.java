package org.koin.core.logger;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class Level {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Level[] $VALUES;
    public static final Level DEBUG = new Level("DEBUG", 0);
    public static final Level INFO = new Level("INFO", 1);
    public static final Level WARNING = new Level("WARNING", 2);
    public static final Level ERROR = new Level(EventType.ERROR, 3);
    public static final Level NONE = new Level("NONE", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Level[] $values() {
        return new Level[]{DEBUG, INFO, WARNING, ERROR, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Level> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Level valueOf(String str) {
        return (Level) Enum.valueOf(Level.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Level[] values() {
        return (Level[]) $VALUES.clone();
    }

    private Level(String str, int i) {
    }

    static {
        Level[] levelArr$values = $values();
        $VALUES = levelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(levelArr$values);
    }
}
