package me.drakeet.multitype;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public class BinderNotFoundException extends RuntimeException {
    public BinderNotFoundException(@NonNull Class<?> cls) {
        super("Have you registered {className}.class to the binder in the adapter/pool?".replace("{className}", cls.getSimpleName()));
    }
}
