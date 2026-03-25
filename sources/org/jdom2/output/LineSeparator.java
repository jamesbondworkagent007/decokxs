package org.jdom2.output;

import o.C59866zpC;

/* JADX INFO: loaded from: classes24.dex */
public enum LineSeparator {
    CRNL("\r\n"),
    NL("\n"),
    CR("\r"),
    DOS("\r\n"),
    UNIX("\n"),
    SYSTEM(C59866zpC.EZpvd("line.separator", "\r\n")),
    NONE(null),
    DEFAULT(getDefaultLineSeparator());

    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String value() {
        return this.value;
    }

    private static String getDefaultLineSeparator() {
        String strEZpvd = C59866zpC.EZpvd("org.jdom2.output.LineSeparator", "DEFAULT");
        if ("DEFAULT".equals(strEZpvd)) {
            return "\r\n";
        }
        if ("SYSTEM".equals(strEZpvd)) {
            return System.getProperty("line.separator");
        }
        if ("CRNL".equals(strEZpvd)) {
            return "\r\n";
        }
        if ("NL".equals(strEZpvd)) {
            return "\n";
        }
        if ("CR".equals(strEZpvd)) {
            return "\r";
        }
        if ("DOS".equals(strEZpvd)) {
            return "\r\n";
        }
        if ("UNIX".equals(strEZpvd)) {
            return "\n";
        }
        if ("NONE".equals(strEZpvd)) {
            return null;
        }
        return strEZpvd;
    }

    LineSeparator(String str) {
        this.value = str;
    }
}
