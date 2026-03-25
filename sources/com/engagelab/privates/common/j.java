package com.engagelab.privates.common;

import com.engagelab.privates.analysis.api.Config;

/* JADX INFO: loaded from: classes21.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Config f336a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(Config config) {
        f336a = config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static Config a() {
        if (f336a == null) {
            f336a = new Config();
        }
        return f336a;
    }
}
