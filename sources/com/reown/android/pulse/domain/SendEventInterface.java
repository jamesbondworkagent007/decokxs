package com.reown.android.pulse.domain;

import com.reown.android.internal.utils.Time;
import com.reown.android.pulse.model.SDKType;
import com.reown.android.pulse.model.properties.Props;
import com.reown.util.UtilFunctionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface SendEventInterface {
    void send(@NotNull Props props, @NotNull SDKType sDKType, Long l, Long l2);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void send$default(SendEventInterface sendEventInterface, Props props, SDKType sDKType, Long l, Long l2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
            }
            if ((i & 2) != 0) {
                sDKType = SDKType.APPKIT;
            }
            if ((i & 4) != 0) {
                l = Long.valueOf(Time.getCurrentTimeInSeconds());
            }
            if ((i & 8) != 0) {
                l2 = Long.valueOf(UtilFunctionsKt.generateId());
            }
            sendEventInterface.send(props, sDKType, l, l2);
        }
    }
}
