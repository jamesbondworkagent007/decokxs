package com.bytedance.applog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface IOaidObserver {

    public static final class Oaid {
        public final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Oaid(@Nullable String str) {
            this.id = str;
        }
    }

    void onOaidLoaded(@NonNull Oaid oaid);
}
