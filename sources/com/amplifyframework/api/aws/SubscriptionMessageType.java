package com.amplifyframework.api.aws;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes21.dex */
enum SubscriptionMessageType {
    CONNECTION_INIT("connection_init"),
    CONNECTION_ACK("connection_ack"),
    CONNECTION_ERROR("connection_error"),
    CONNECTION_KEEP_ALIVE("ka"),
    CONNECTION_TERMINATE("connection_terminate"),
    SUBSCRIPTION_START(TtmlNode.START),
    SUBSCRIPTION_ACK("start_ack"),
    SUBSCRIPTION_DATA("data"),
    SUBSCRIPTION_ERROR(Constants.IPC_BUNDLE_KEY_SEND_ERROR),
    SUBSCRIPTION_COMPLETE("complete"),
    SUBSCRIPTION_STOP("stop");

    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    SubscriptionMessageType(String str) {
        this.value = str;
    }

    public static SubscriptionMessageType from(String str) {
        for (SubscriptionMessageType subscriptionMessageType : values()) {
            if (subscriptionMessageType.value.equals(str)) {
                return subscriptionMessageType;
            }
        }
        throw new IllegalArgumentException("No such subscription message type: " + str);
    }
}
