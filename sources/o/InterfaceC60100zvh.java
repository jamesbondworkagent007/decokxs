package o;

import org.slf4j.Marker;
import org.slf4j.event.Level;

/* JADX INFO: renamed from: o.zvh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC60100zvh {
    void debug(java.lang.String str);

    void debug(java.lang.String str, java.lang.Object obj);

    void debug(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void debug(java.lang.String str, java.lang.Throwable th);

    void debug(java.lang.String str, java.lang.Object... objArr);

    void error(java.lang.String str);

    void error(java.lang.String str, java.lang.Object obj);

    void error(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void error(java.lang.String str, java.lang.Throwable th);

    void error(java.lang.String str, java.lang.Object... objArr);

    java.lang.String getName();

    void info(java.lang.String str);

    void info(java.lang.String str, java.lang.Object obj);

    void info(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void info(java.lang.String str, java.lang.Throwable th);

    void info(java.lang.String str, java.lang.Object... objArr);

    boolean isDebugEnabled();

    boolean isDebugEnabled(Marker marker);

    boolean isErrorEnabled();

    boolean isErrorEnabled(Marker marker);

    boolean isInfoEnabled();

    boolean isInfoEnabled(Marker marker);

    boolean isTraceEnabled();

    boolean isTraceEnabled(Marker marker);

    boolean isWarnEnabled();

    boolean isWarnEnabled(Marker marker);

    void trace(java.lang.String str);

    void trace(java.lang.String str, java.lang.Object obj);

    void trace(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void trace(java.lang.String str, java.lang.Throwable th);

    void trace(java.lang.String str, java.lang.Object... objArr);

    void warn(java.lang.String str);

    void warn(java.lang.String str, java.lang.Object obj);

    void warn(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void warn(java.lang.String str, java.lang.Throwable th);

    void warn(java.lang.String str, java.lang.Object... objArr);

    default InterfaceC60078zvA EZpvd(Level level) {
        return new C60080zvC(this, level);
    }

    default InterfaceC60078zvA OLrzqt(Level level) {
        if (AEQbTJ(level)) {
            return EZpvd(level);
        }
        return C60079zvB.OLrzqt();
    }

    default boolean AEQbTJ(Level level) {
        int i = level.toInt();
        if (i == 0) {
            return isTraceEnabled();
        }
        if (i == 10) {
            return isDebugEnabled();
        }
        if (i == 20) {
            return isInfoEnabled();
        }
        if (i == 30) {
            return isWarnEnabled();
        }
        if (i == 40) {
            return isErrorEnabled();
        }
        throw new java.lang.IllegalArgumentException("Level [" + level + "] not recognized.");
    }
}
