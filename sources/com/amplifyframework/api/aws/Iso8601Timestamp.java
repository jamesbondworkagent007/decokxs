package com.amplifyframework.api.aws;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
final class Iso8601Timestamp {
    private Iso8601Timestamp() {
    }

    public static String now() {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'", Locale.US).format(new Date());
    }
}
