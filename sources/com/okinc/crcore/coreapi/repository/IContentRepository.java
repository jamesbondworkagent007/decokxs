package com.okinc.crcore.coreapi.repository;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes23.dex */
public interface IContentRepository {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TimelineType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TimelineType[] $VALUES;
        private final int value;
        public static final TimelineType ALL = new TimelineType("ALL", 0, 0);
        public static final TimelineType INSIGHT = new TimelineType("INSIGHT", 1, 1);
        public static final TimelineType NEWS = new TimelineType("NEWS", 2, 2);
        public static final TimelineType AUTHOR = new TimelineType("AUTHOR", 3, 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TimelineType[] $values() {
            return new TimelineType[]{ALL, INSIGHT, NEWS, AUTHOR};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TimelineType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private TimelineType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            TimelineType[] timelineTypeArr$values = $values();
            $VALUES = timelineTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(timelineTypeArr$values);
        }

        public static TimelineType valueOf(String str) {
            return (TimelineType) Enum.valueOf(TimelineType.class, str);
        }

        public static TimelineType[] values() {
            return (TimelineType[]) $VALUES.clone();
        }
    }
}
