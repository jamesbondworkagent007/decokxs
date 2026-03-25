package com.okinc.okimcore.feature.notification.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C59449zhJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class PayloadData {
    public static final int $stable = 0;
    public static final Activity Companion = new Activity(null);
    private static final String INCOMING_CALL_CHANNEL_ID = "012431e7-05ea-4a94-9f7a-28efafcbd7e5";
    private final String channelId;
    private final String sound;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PayloadData copy$default(PayloadData payloadData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payloadData.sound;
        }
        if ((i & 2) != 0) {
            str2 = payloadData.channelId;
        }
        return payloadData.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayloadData copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PayloadData(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayloadData)) {
            return false;
        }
        PayloadData payloadData = (PayloadData) obj;
        return Intrinsics.EZpvd((Object) this.sound, (Object) payloadData.sound) && Intrinsics.EZpvd((Object) this.channelId, (Object) payloadData.channelId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSound() {
        return this.sound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.sound.hashCode() * 31) + this.channelId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PayloadData(sound=" + this.sound + ", channelId=" + this.channelId + ")";
    }

    public PayloadData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sound = str;
        this.channelId = str2;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.feature.notification.model.PayloadData.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final boolean isIncomingCall() {
        return this.sound.length() > 0 && C59449zhJ.endsWith$default(this.channelId, INCOMING_CALL_CHANNEL_ID, false, 2, null);
    }
}
