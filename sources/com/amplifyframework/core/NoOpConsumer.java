package com.amplifyframework.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes21.dex */
public final class NoOpConsumer<T> implements Consumer<T> {
    @Override // com.amplifyframework.core.Consumer
    public void accept(@NonNull T t) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NoOpConsumer {}";
    }

    private NoOpConsumer() {
    }

    public static <T> NoOpConsumer<T> create() {
        return new NoOpConsumer<>();
    }

    public int hashCode() {
        return NoOpConsumer.class.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof NoOpConsumer;
    }
}
