package com.amplifyframework.core;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes21.dex */
public final class NoOpAction implements Action {
    @Override // com.amplifyframework.core.Action
    public void call() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NoOpAction {}";
    }

    private NoOpAction() {
    }

    public static NoOpAction create() {
        return new NoOpAction();
    }

    public int hashCode() {
        return NoOpAction.class.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof NoOpAction;
    }
}
