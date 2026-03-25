package org.slf4j.helpers;

import org.slf4j.Marker;

/* JADX INFO: loaded from: classes13.dex */
public abstract class LegacyAbstractLogger extends AbstractLogger {
    private static final long serialVersionUID = -7041884104854048950L;

    @Override // o.InterfaceC60100zvh
    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled();
    }

    @Override // o.InterfaceC60100zvh
    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled();
    }

    @Override // o.InterfaceC60100zvh
    public boolean isInfoEnabled(Marker marker) {
        return isInfoEnabled();
    }

    @Override // o.InterfaceC60100zvh
    public boolean isWarnEnabled(Marker marker) {
        return isWarnEnabled();
    }

    @Override // o.InterfaceC60100zvh
    public boolean isErrorEnabled(Marker marker) {
        return isErrorEnabled();
    }
}
