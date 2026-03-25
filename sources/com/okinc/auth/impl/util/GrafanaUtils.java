package com.okinc.auth.impl.util;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes23.dex */
public final class GrafanaUtils {
    public static final GrafanaUtils KWHzl = new GrafanaUtils();

    private GrafanaUtils() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Page {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Page[] $VALUES;
        private final String value;
        public static final Page UNKNOWN = new Page("UNKNOWN", 0, "unknown");
        public static final Page RESEND_OTP = new Page("RESEND_OTP", 1, "resend_otp");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Page[] $values() {
            return new Page[]{UNKNOWN, RESEND_OTP};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Page> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private Page(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            Page[] pageArr$values = $values();
            $VALUES = pageArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pageArr$values);
        }

        public static Page valueOf(String str) {
            return (Page) Enum.valueOf(Page.class, str);
        }

        public static Page[] values() {
            return (Page[]) $VALUES.clone();
        }
    }
}
