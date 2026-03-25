package o;

import java.lang.reflect.InvocationTargetException;
import java.util.Queue;
import org.slf4j.Marker;
import org.slf4j.event.EventRecordingLogger;
import org.slf4j.event.Level;
import org.slf4j.helpers.NOPLogger;

/* JADX INFO: renamed from: o.zvw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60115zvw implements InterfaceC60100zvh {
    public final Queue<C60107zvo> AEQbTJ;
    public java.lang.reflect.Method AYXKKw;
    public final boolean EZpvd;
    public volatile InterfaceC60100zvh KWHzl;
    public EventRecordingLogger OLrzqt;
    public java.lang.Boolean copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.KWHzl == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(InterfaceC60100zvh interfaceC60100zvh) {
        this.KWHzl = interfaceC60100zvh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60100zvh
    public java.lang.String getName() {
        return this.valueOf;
    }

    public C60115zvw(java.lang.String str, Queue<C60107zvo> queue, boolean z) {
        this.valueOf = str;
        this.AEQbTJ = queue;
        this.EZpvd = z;
    }

    @Override // o.InterfaceC60100zvh
    public InterfaceC60078zvA EZpvd(Level level) {
        return AEQbTJ().EZpvd(level);
    }

    @Override // o.InterfaceC60100zvh
    public InterfaceC60078zvA OLrzqt(Level level) {
        return AEQbTJ().OLrzqt(level);
    }

    @Override // o.InterfaceC60100zvh
    public boolean AEQbTJ(Level level) {
        return AEQbTJ().AEQbTJ(level);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isTraceEnabled() {
        return AEQbTJ().isTraceEnabled();
    }

    @Override // o.InterfaceC60100zvh
    public void trace(java.lang.String str) {
        AEQbTJ().trace(str);
    }

    @Override // o.InterfaceC60100zvh
    public void trace(java.lang.String str, java.lang.Object obj) {
        AEQbTJ().trace(str, obj);
    }

    @Override // o.InterfaceC60100zvh
    public void trace(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        AEQbTJ().trace(str, obj, obj2);
    }

    @Override // o.InterfaceC60100zvh
    public void trace(java.lang.String str, java.lang.Object... objArr) {
        AEQbTJ().trace(str, objArr);
    }

    @Override // o.InterfaceC60100zvh
    public void trace(java.lang.String str, java.lang.Throwable th) {
        AEQbTJ().trace(str, th);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isTraceEnabled(Marker marker) {
        return AEQbTJ().isTraceEnabled(marker);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isDebugEnabled() {
        return AEQbTJ().isDebugEnabled();
    }

    @Override // o.InterfaceC60100zvh
    public void debug(java.lang.String str) {
        AEQbTJ().debug(str);
    }

    @Override // o.InterfaceC60100zvh
    public void debug(java.lang.String str, java.lang.Object obj) {
        AEQbTJ().debug(str, obj);
    }

    @Override // o.InterfaceC60100zvh
    public void debug(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        AEQbTJ().debug(str, obj, obj2);
    }

    @Override // o.InterfaceC60100zvh
    public void debug(java.lang.String str, java.lang.Object... objArr) {
        AEQbTJ().debug(str, objArr);
    }

    @Override // o.InterfaceC60100zvh
    public void debug(java.lang.String str, java.lang.Throwable th) {
        AEQbTJ().debug(str, th);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isDebugEnabled(Marker marker) {
        return AEQbTJ().isDebugEnabled(marker);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isInfoEnabled() {
        return AEQbTJ().isInfoEnabled();
    }

    @Override // o.InterfaceC60100zvh
    public void info(java.lang.String str) {
        AEQbTJ().info(str);
    }

    @Override // o.InterfaceC60100zvh
    public void info(java.lang.String str, java.lang.Object obj) {
        AEQbTJ().info(str, obj);
    }

    @Override // o.InterfaceC60100zvh
    public void info(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        AEQbTJ().info(str, obj, obj2);
    }

    @Override // o.InterfaceC60100zvh
    public void info(java.lang.String str, java.lang.Object... objArr) {
        AEQbTJ().info(str, objArr);
    }

    @Override // o.InterfaceC60100zvh
    public void info(java.lang.String str, java.lang.Throwable th) {
        AEQbTJ().info(str, th);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isInfoEnabled(Marker marker) {
        return AEQbTJ().isInfoEnabled(marker);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isWarnEnabled() {
        return AEQbTJ().isWarnEnabled();
    }

    @Override // o.InterfaceC60100zvh
    public void warn(java.lang.String str) {
        AEQbTJ().warn(str);
    }

    @Override // o.InterfaceC60100zvh
    public void warn(java.lang.String str, java.lang.Object obj) {
        AEQbTJ().warn(str, obj);
    }

    @Override // o.InterfaceC60100zvh
    public void warn(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        AEQbTJ().warn(str, obj, obj2);
    }

    @Override // o.InterfaceC60100zvh
    public void warn(java.lang.String str, java.lang.Object... objArr) {
        AEQbTJ().warn(str, objArr);
    }

    @Override // o.InterfaceC60100zvh
    public void warn(java.lang.String str, java.lang.Throwable th) {
        AEQbTJ().warn(str, th);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isWarnEnabled(Marker marker) {
        return AEQbTJ().isWarnEnabled(marker);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isErrorEnabled() {
        return AEQbTJ().isErrorEnabled();
    }

    @Override // o.InterfaceC60100zvh
    public void error(java.lang.String str) {
        AEQbTJ().error(str);
    }

    @Override // o.InterfaceC60100zvh
    public void error(java.lang.String str, java.lang.Object obj) {
        AEQbTJ().error(str, obj);
    }

    @Override // o.InterfaceC60100zvh
    public void error(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        AEQbTJ().error(str, obj, obj2);
    }

    @Override // o.InterfaceC60100zvh
    public void error(java.lang.String str, java.lang.Object... objArr) {
        AEQbTJ().error(str, objArr);
    }

    @Override // o.InterfaceC60100zvh
    public void error(java.lang.String str, java.lang.Throwable th) {
        AEQbTJ().error(str, th);
    }

    @Override // o.InterfaceC60100zvh
    public boolean isErrorEnabled(Marker marker) {
        return AEQbTJ().isErrorEnabled(marker);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.valueOf.equals(((C60115zvw) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public InterfaceC60100zvh AEQbTJ() {
        if (this.KWHzl != null) {
            return this.KWHzl;
        }
        if (this.EZpvd) {
            return NOPLogger.NOP_LOGGER;
        }
        return KWHzl();
    }

    public final InterfaceC60100zvh KWHzl() {
        if (this.OLrzqt == null) {
            this.OLrzqt = new EventRecordingLogger(this, this.AEQbTJ);
        }
        return this.OLrzqt;
    }

    public boolean EZpvd() {
        java.lang.Boolean bool = this.copydefault;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.AYXKKw = this.KWHzl.getClass().getMethod("log", InterfaceC60105zvm.class);
            this.copydefault = java.lang.Boolean.TRUE;
        } catch (java.lang.NoSuchMethodException unused) {
            this.copydefault = java.lang.Boolean.FALSE;
        }
        return this.copydefault.booleanValue();
    }

    public void OLrzqt(InterfaceC60105zvm interfaceC60105zvm) {
        if (EZpvd()) {
            try {
                this.AYXKKw.invoke(this.KWHzl, interfaceC60105zvm);
            } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public boolean copydefault() {
        return this.KWHzl instanceof NOPLogger;
    }
}
