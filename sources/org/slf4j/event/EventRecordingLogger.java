package org.slf4j.event;

import java.util.Queue;
import o.C60107zvo;
import o.C60115zvw;
import org.slf4j.Marker;
import org.slf4j.helpers.LegacyAbstractLogger;

/* JADX INFO: loaded from: classes13.dex */
public class EventRecordingLogger extends LegacyAbstractLogger {
    static final boolean RECORD_ALL_EVENTS = true;
    private static final long serialVersionUID = -176083308134819629L;
    Queue<C60107zvo> eventQueue;
    C60115zvw logger;
    String name;

    @Override // org.slf4j.helpers.AbstractLogger
    public String getFullyQualifiedCallerName() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.slf4j.helpers.AbstractLogger, o.InterfaceC60100zvh
    public String getName() {
        return this.name;
    }

    @Override // o.InterfaceC60100zvh
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // o.InterfaceC60100zvh
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // o.InterfaceC60100zvh
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // o.InterfaceC60100zvh
    public boolean isTraceEnabled() {
        return true;
    }

    @Override // o.InterfaceC60100zvh
    public boolean isWarnEnabled() {
        return true;
    }

    public EventRecordingLogger(C60115zvw c60115zvw, Queue<C60107zvo> queue) {
        this.logger = c60115zvw;
        this.name = c60115zvw.getName();
        this.eventQueue = queue;
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public void handleNormalizedLoggingCall(Level level, Marker marker, String str, Object[] objArr, Throwable th) {
        C60107zvo c60107zvo = new C60107zvo();
        c60107zvo.AEQbTJ(System.currentTimeMillis());
        c60107zvo.AEQbTJ(level);
        c60107zvo.copydefault(this.logger);
        c60107zvo.EZpvd(this.name);
        if (marker != null) {
            c60107zvo.AEQbTJ(marker);
        }
        c60107zvo.KWHzl(str);
        c60107zvo.OLrzqt(Thread.currentThread().getName());
        c60107zvo.OLrzqt(objArr);
        c60107zvo.AEQbTJ(th);
        this.eventQueue.add(c60107zvo);
    }
}
