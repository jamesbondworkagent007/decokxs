package com.okinc.lib.dionysus.crash.bean;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class ManagedCrashLog extends AbstractLog {
    public static final String TYPE = "managedError";
    private String appLaunchTimestamp;
    private String architecture;
    private Long errorThreadId;
    private String errorThreadName;
    private Exception exception;
    private Boolean fatal;
    private UUID id;
    private Integer parentProcessId;
    private String parentProcessName;
    private Integer processId;
    private String processName;
    private List<Thread> threads;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAppLaunchTimestamp() {
        return this.appLaunchTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getArchitecture() {
        return this.architecture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Long getErrorThreadId() {
        return this.errorThreadId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getErrorThreadName() {
        return this.errorThreadName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Exception getException() {
        return this.exception;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Boolean getFatal() {
        return this.fatal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UUID getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getParentProcessId() {
        return this.parentProcessId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getParentProcessName() {
        return this.parentProcessName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getProcessId() {
        return this.processId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getProcessName() {
        return this.processName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<Thread> getThreads() {
        return this.threads;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getType() {
        return TYPE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAppLaunchTimestamp(String str) {
        this.appLaunchTimestamp = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setArchitecture(String str) {
        this.architecture = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setErrorThreadId(Long l) {
        this.errorThreadId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setErrorThreadName(String str) {
        this.errorThreadName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setException(Exception exception) {
        this.exception = exception;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFatal(Boolean bool) {
        this.fatal = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setId(UUID uuid) {
        this.id = uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setParentProcessId(Integer num) {
        this.parentProcessId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setParentProcessName(String str) {
        this.parentProcessName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProcessId(Integer num) {
        this.processId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProcessName(String str) {
        this.processName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setThreads(List<Thread> list) {
        this.threads = list;
    }

    public String toString() {
        return "ManagedCrashLog{exception=" + this.exception + ", threads=" + this.threads + ", id=" + this.id + ", processId=" + this.processId + ", processName='" + this.processName + "', parentProcessId=" + this.parentProcessId + ", parentProcessName='" + this.parentProcessName + "', errorThreadId=" + this.errorThreadId + ", errorThreadName='" + this.errorThreadName + "', fatal=" + this.fatal + ", appLaunchTimestamp='" + this.appLaunchTimestamp + "', architecture='" + this.architecture + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ManagedCrashLog managedCrashLog = (ManagedCrashLog) obj;
        return Objects.equals(this.exception, managedCrashLog.exception) && Objects.equals(this.threads, managedCrashLog.threads) && Objects.equals(this.processId, managedCrashLog.processId) && Objects.equals(this.processName, managedCrashLog.processName) && Objects.equals(this.parentProcessId, managedCrashLog.parentProcessId) && Objects.equals(this.parentProcessName, managedCrashLog.parentProcessName) && Objects.equals(this.errorThreadId, managedCrashLog.errorThreadId) && Objects.equals(this.errorThreadName, managedCrashLog.errorThreadName) && Objects.equals(this.fatal, managedCrashLog.fatal) && Objects.equals(this.appLaunchTimestamp, managedCrashLog.appLaunchTimestamp) && Objects.equals(this.architecture, managedCrashLog.architecture);
    }

    public int hashCode() {
        return Objects.hash(this.exception, this.threads, this.id, this.processId, this.processName, this.parentProcessId, this.parentProcessName, this.errorThreadId, this.errorThreadName, this.fatal, this.appLaunchTimestamp, this.architecture);
    }
}
