package com.beloo.widget.chipslayoutmanager.util.log;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class Log {
    private static LogSwitcher logSwitcher = new LogSwitcher();
    private static LogWrapper log = new SilentLog();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void with(LogSwitcher logSwitcher2) {
        logSwitcher = logSwitcher2;
    }

    public static int d(String str, String str2) {
        return log.d(str, str2);
    }

    public static int v(String str, String str2) {
        return log.v(str, str2);
    }

    public static int w(String str, String str2) {
        return log.w(str, str2);
    }

    public static int i(String str, String str2) {
        return log.i(str, str2);
    }

    public static int e(String str, String str2) {
        return log.e(str, str2);
    }

    public static int d(String str, String str2, int i) {
        if (logSwitcher.isEnabled(i)) {
            return d(str, str2);
        }
        return 0;
    }

    public static int v(String str, String str2, int i) {
        if (logSwitcher.isEnabled(i)) {
            return v(str, str2);
        }
        return 0;
    }

    public static int w(String str, String str2, int i) {
        if (logSwitcher.isEnabled(i)) {
            return w(str, str2);
        }
        return 0;
    }

    public static int i(String str, String str2, int i) {
        if (logSwitcher.isEnabled(i)) {
            return i(str, str2);
        }
        return 0;
    }

    public static class LogSwitcher {
        private Set<Integer> enabledLogs = new HashSet();

        public boolean isEnabled(int i) {
            return this.enabledLogs.contains(Integer.valueOf(i));
        }

        public LogSwitcher with(int i) {
            this.enabledLogs.add(Integer.valueOf(i));
            return this;
        }

        public LogSwitcher without(int i) {
            this.enabledLogs.remove(Integer.valueOf(i));
            return this;
        }
    }
}
