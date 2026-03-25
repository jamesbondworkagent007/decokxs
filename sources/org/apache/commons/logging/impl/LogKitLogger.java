package org.apache.commons.logging.impl;

import java.io.Serializable;
import o.InterfaceC59499ziG;
import org.apache.log.Hierarchy;
import org.apache.log.Logger;

/* JADX INFO: loaded from: classes24.dex */
public class LogKitLogger implements InterfaceC59499ziG, Serializable {
    private static final long serialVersionUID = 3768538055836059519L;
    protected volatile transient Logger logger;
    protected String name;

    public LogKitLogger(String str) {
        this.logger = null;
        this.name = str;
        this.logger = getLogger();
    }

    public Logger getLogger() {
        Logger loggerFor = this.logger;
        if (loggerFor == null) {
            synchronized (this) {
                loggerFor = this.logger;
                if (loggerFor == null) {
                    loggerFor = Hierarchy.getDefaultHierarchy().getLoggerFor(this.name);
                    this.logger = loggerFor;
                }
            }
        }
        return loggerFor;
    }

    public void trace(Object obj) {
        debug(obj);
    }

    public void trace(Object obj, Throwable th) {
        debug(obj, th);
    }

    @Override // o.InterfaceC59499ziG
    public void debug(Object obj) {
        if (obj != null) {
            getLogger().debug(String.valueOf(obj));
        }
    }

    @Override // o.InterfaceC59499ziG
    public void debug(Object obj, Throwable th) {
        if (obj != null) {
            getLogger().debug(String.valueOf(obj), th);
        }
    }

    @Override // o.InterfaceC59499ziG
    public void info(Object obj) {
        if (obj != null) {
            getLogger().info(String.valueOf(obj));
        }
    }

    public void info(Object obj, Throwable th) {
        if (obj != null) {
            getLogger().info(String.valueOf(obj), th);
        }
    }

    @Override // o.InterfaceC59499ziG
    public void warn(Object obj) {
        if (obj != null) {
            getLogger().warn(String.valueOf(obj));
        }
    }

    @Override // o.InterfaceC59499ziG
    public void warn(Object obj, Throwable th) {
        if (obj != null) {
            getLogger().warn(String.valueOf(obj), th);
        }
    }

    @Override // o.InterfaceC59499ziG
    public void error(Object obj) {
        if (obj != null) {
            getLogger().error(String.valueOf(obj));
        }
    }

    public void error(Object obj, Throwable th) {
        if (obj != null) {
            getLogger().error(String.valueOf(obj), th);
        }
    }

    public void fatal(Object obj) {
        if (obj != null) {
            getLogger().fatalError(String.valueOf(obj));
        }
    }

    public void fatal(Object obj, Throwable th) {
        if (obj != null) {
            getLogger().fatalError(String.valueOf(obj), th);
        }
    }

    @Override // o.InterfaceC59499ziG
    public boolean isDebugEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // o.InterfaceC59499ziG
    public boolean isErrorEnabled() {
        return getLogger().isErrorEnabled();
    }

    public boolean isFatalEnabled() {
        return getLogger().isFatalErrorEnabled();
    }

    @Override // o.InterfaceC59499ziG
    public boolean isInfoEnabled() {
        return getLogger().isInfoEnabled();
    }

    public boolean isTraceEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // o.InterfaceC59499ziG
    public boolean isWarnEnabled() {
        return getLogger().isWarnEnabled();
    }
}
