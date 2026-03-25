package com.amplitude.core;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C5242Ke;
import o.C5244Kg;
import o.C5255Kr;
import o.InterfaceC5274Lk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface Storage {
    Object EZpvd(@NotNull Constants constants, @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    Object EZpvd(@NotNull Object obj, @NotNull Continuation<? super String> continuation);

    Object EZpvd(@NotNull C5242Ke c5242Ke, @NotNull Continuation<? super Unit> continuation);

    Object KWHzl(@NotNull Continuation<? super Unit> continuation);

    List<Object> OLrzqt();

    String copydefault(@NotNull Constants constants);

    InterfaceC5274Lk copydefault(@NotNull C5255Kr c5255Kr, @NotNull C5244Kg c5244Kg, @NotNull CoroutineScope coroutineScope, @NotNull CoroutineDispatcher coroutineDispatcher);

    public enum Constants {
        LAST_EVENT_ID("last_event_id"),
        PREVIOUS_SESSION_ID("previous_session_id"),
        LAST_EVENT_TIME("last_event_time"),
        OPT_OUT("opt_out"),
        Events("events"),
        APP_VERSION("app_version"),
        APP_BUILD("app_build");

        private final String rawVal;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRawVal() {
            return this.rawVal;
        }

        Constants(String str) {
            this.rawVal = str;
        }
    }
}
