package o;

import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import com.okinc.oklive.app.data.repository.remote.LiveStreamStatusModelResponse;
import com.okinc.oklive.app.data.repository.remote.RecordedStreamsResponse;
import com.okinc.oklive.app.data.repository.remote.RecordingInfoResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sTP {
    java.lang.Object AEQbTJ(long j, int i, int i2, @NotNull Continuation<? super RecordedStreamsResponse> continuation);

    java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super LivestreamInfoResponse> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super sTA> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super sTB> continuation);

    java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, @NotNull Continuation<? super RecordingInfoResponse> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super LiveStreamStatusModelResponse> continuation);
}
