package o;

import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.NoWhenBranchMatchedException;
import org.slf4j.event.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class GC {

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.Error.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.Warning.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.Info.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.Debug.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.Trace.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
        }
    }

    public static final Level KWHzl(LogLevel logLevel) {
        int i = ActionBar.KWHzl[logLevel.ordinal()];
        if (i == 1) {
            return Level.ERROR;
        }
        if (i == 2) {
            return Level.WARN;
        }
        if (i == 3) {
            return Level.INFO;
        }
        if (i == 4) {
            return Level.DEBUG;
        }
        if (i == 5) {
            return Level.TRACE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
