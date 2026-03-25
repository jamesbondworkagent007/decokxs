package com.okinc.liveness.lca.manager;

import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public interface CameraManagerListener {
    void onColorChallengeStart();

    void onColorChallengeStop();

    void onError(@NotNull String str, Throwable th);

    void onVideoMuxerComplete(long j, @NotNull File file);

    void onVideoSegmentReady(@NotNull byte[] bArr, long j);
}
