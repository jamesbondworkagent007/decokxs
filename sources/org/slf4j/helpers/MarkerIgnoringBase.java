package org.slf4j.helpers;

import o.InterfaceC60100zvh;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes25.dex */
public abstract class MarkerIgnoringBase extends NamedLoggerBase implements InterfaceC60100zvh {
    private static final long serialVersionUID = 9044267456635152283L;

    @Override // org.slf4j.helpers.NamedLoggerBase, o.InterfaceC60100zvh
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // o.InterfaceC60100zvh
    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled();
    }

    public void trace(Marker marker, String str) {
        trace(str);
    }

    public void trace(Marker marker, String str, Object obj) {
        trace(str, obj);
    }

    public void trace(Marker marker, String str, Object obj, Object obj2) {
        trace(str, obj, obj2);
    }

    public void trace(Marker marker, String str, Object... objArr) {
        trace(str, objArr);
    }

    public void trace(Marker marker, String str, Throwable th) {
        trace(str, th);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled();
    }

    public void debug(Marker marker, String str) {
        debug(str);
    }

    public void debug(Marker marker, String str, Object obj) {
        debug(str, obj);
    }

    public void debug(Marker marker, String str, Object obj, Object obj2) {
        debug(str, obj, obj2);
    }

    public void debug(Marker marker, String str, Object... objArr) {
        debug(str, objArr);
    }

    public void debug(Marker marker, String str, Throwable th) {
        debug(str, th);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isInfoEnabled(Marker marker) {
        return isInfoEnabled();
    }

    public void info(Marker marker, String str) {
        info(str);
    }

    public void info(Marker marker, String str, Object obj) {
        info(str, obj);
    }

    public void info(Marker marker, String str, Object obj, Object obj2) {
        info(str, obj, obj2);
    }

    public void info(Marker marker, String str, Object... objArr) {
        info(str, objArr);
    }

    public void info(Marker marker, String str, Throwable th) {
        info(str, th);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isWarnEnabled(Marker marker) {
        return isWarnEnabled();
    }

    public void warn(Marker marker, String str) {
        warn(str);
    }

    public void warn(Marker marker, String str, Object obj) {
        warn(str, obj);
    }

    public void warn(Marker marker, String str, Object obj, Object obj2) {
        warn(str, obj, obj2);
    }

    public void warn(Marker marker, String str, Object... objArr) {
        warn(str, objArr);
    }

    public void warn(Marker marker, String str, Throwable th) {
        warn(str, th);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isErrorEnabled(Marker marker) {
        return isErrorEnabled();
    }

    public void error(Marker marker, String str) {
        error(str);
    }

    public void error(Marker marker, String str, Object obj) {
        error(str, obj);
    }

    public void error(Marker marker, String str, Object obj, Object obj2) {
        error(str, obj, obj2);
    }

    public void error(Marker marker, String str, Object... objArr) {
        error(str, objArr);
    }

    public void error(Marker marker, String str, Throwable th) {
        error(str, th);
    }

    public String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }
}
