package com.amplifyframework.ui.liveness.common;

/* JADX INFO: loaded from: classes21.dex */
public final class LivenessEvent {
    public static final int $stable = 0;
    public static final String AWS_LIVENESS_ERROR_LOG = "AWS_LIVENESS_ERROR_LOG";
    public static final String AWS_LIVENESS_UI_LOG = "AWS_LIVENESS_UI_LOG";
    public static final LivenessEvent INSTANCE = new LivenessEvent();

    private LivenessEvent() {
    }
}
