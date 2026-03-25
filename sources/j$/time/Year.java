package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import java.io.Serializable;
import o.C56350yCc;
import o.InterfaceC56366yCs;
import o.InterfaceC56367yCt;

/* JADX INFO: loaded from: classes17.dex */
public abstract class Year implements InterfaceC56367yCt, InterfaceC56366yCs, Comparable, Serializable {
    private static final C56350yCc PARSER = new DateTimeFormatterBuilder().OLrzqt(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).AhwBna();

    public static boolean isLeap(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}
