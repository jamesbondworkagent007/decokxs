package com.reown.sign.engine;

import com.reown.sign.engine.model.EngineDO;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes12.dex */
public final class SessionRequestQueueKt {
    public static final ConcurrentLinkedQueue<EngineDO.SessionRequestEvent> sessionRequestEventsQueue = new ConcurrentLinkedQueue<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ConcurrentLinkedQueue<EngineDO.SessionRequestEvent> getSessionRequestEventsQueue() {
        return sessionRequestEventsQueue;
    }
}
