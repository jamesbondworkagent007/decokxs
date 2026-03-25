package com.okinc.okimcore.model.exception;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ChannelErrorCode extends Throwable {
    public static final int $stable = 0;
    private final int code;
    private final String message;
    private final ChannelErrorStatus status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChannelErrorCode copy$default(ChannelErrorCode channelErrorCode, ChannelErrorStatus channelErrorStatus, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            channelErrorStatus = channelErrorCode.status;
        }
        if ((i2 & 2) != 0) {
            i = channelErrorCode.code;
        }
        if ((i2 & 4) != 0) {
            str = channelErrorCode.message;
        }
        return channelErrorCode.copy(channelErrorStatus, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelErrorStatus component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelErrorCode copy(@NotNull ChannelErrorStatus channelErrorStatus, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(channelErrorStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new ChannelErrorCode(channelErrorStatus, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelErrorCode)) {
            return false;
        }
        ChannelErrorCode channelErrorCode = (ChannelErrorCode) obj;
        return this.status == channelErrorCode.status && this.code == channelErrorCode.code && Intrinsics.EZpvd((Object) this.message, (Object) channelErrorCode.message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelErrorStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.status.hashCode() * 31) + Integer.hashCode(this.code)) * 31) + this.message.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String toString() {
        return "ChannelErrorCode(status=" + this.status + ", code=" + this.code + ", message=" + this.message + ")";
    }

    public ChannelErrorCode(@NotNull ChannelErrorStatus channelErrorStatus, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(channelErrorStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.status = channelErrorStatus;
        this.code = i;
        this.message = str;
    }
}
