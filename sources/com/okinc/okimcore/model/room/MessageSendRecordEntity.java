package com.okinc.okimcore.model.room;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageSendRecordEntity {
    public static final int $stable = 8;
    private final String clientMessageId;
    private boolean isMediaMessage;
    private int sendStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MessageSendRecordEntity copy$default(MessageSendRecordEntity messageSendRecordEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageSendRecordEntity.clientMessageId;
        }
        return messageSendRecordEntity.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.clientMessageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MessageSendRecordEntity copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MessageSendRecordEntity(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessageSendRecordEntity) && Intrinsics.EZpvd((Object) this.clientMessageId, (Object) ((MessageSendRecordEntity) obj).clientMessageId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientMessageId() {
        return this.clientMessageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSendStatus() {
        return this.sendStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.clientMessageId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMediaMessage() {
        return this.isMediaMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMediaMessage(boolean z) {
        this.isMediaMessage = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSendStatus(int i) {
        this.sendStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MessageSendRecordEntity(clientMessageId=" + this.clientMessageId + ")";
    }

    public MessageSendRecordEntity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.clientMessageId = str;
        this.sendStatus = OKMessage.SentStatus.SENDING.getValue();
    }
}
