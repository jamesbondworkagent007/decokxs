package com.amplifyframework.auth.plugins.core;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AuthHubEventEmitter {
    private final AtomicReference<String> lastPublishedHubEventName = new AtomicReference<>();

    public final void sendHubEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) this.lastPublishedHubEventName.getAndSet(str), (Object) str)) {
            return;
        }
        Amplify.Hub.publish(HubChannel.AUTH, HubEvent.create(str));
    }
}
