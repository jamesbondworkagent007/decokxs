package org.apache.commons.logging.impl;

import java.io.Serializable;
import o.InterfaceC59499ziG;

/* JADX INFO: loaded from: classes24.dex */
public class NoOpLog implements InterfaceC59499ziG, Serializable {
    private static final long serialVersionUID = 561423906191706148L;

    @Override // o.InterfaceC59499ziG
    public void debug(Object obj) {
    }

    @Override // o.InterfaceC59499ziG
    public void debug(Object obj, Throwable th) {
    }

    @Override // o.InterfaceC59499ziG
    public void error(Object obj) {
    }

    public void error(Object obj, Throwable th) {
    }

    public void fatal(Object obj) {
    }

    public void fatal(Object obj, Throwable th) {
    }

    @Override // o.InterfaceC59499ziG
    public void info(Object obj) {
    }

    public void info(Object obj, Throwable th) {
    }

    @Override // o.InterfaceC59499ziG
    public final boolean isDebugEnabled() {
        return false;
    }

    @Override // o.InterfaceC59499ziG
    public final boolean isErrorEnabled() {
        return false;
    }

    public final boolean isFatalEnabled() {
        return false;
    }

    @Override // o.InterfaceC59499ziG
    public final boolean isInfoEnabled() {
        return false;
    }

    public final boolean isTraceEnabled() {
        return false;
    }

    @Override // o.InterfaceC59499ziG
    public final boolean isWarnEnabled() {
        return false;
    }

    public void trace(Object obj) {
    }

    public void trace(Object obj, Throwable th) {
    }

    @Override // o.InterfaceC59499ziG
    public void warn(Object obj) {
    }

    @Override // o.InterfaceC59499ziG
    public void warn(Object obj, Throwable th) {
    }

    public NoOpLog() {
    }

    public NoOpLog(String str) {
    }
}
