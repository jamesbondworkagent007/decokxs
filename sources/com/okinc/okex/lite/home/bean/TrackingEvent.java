package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TrackingEvent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("event")
    private final String event;

    @SerializedName("type")
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TrackingEvent copy$default(TrackingEvent trackingEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackingEvent.type;
        }
        if ((i & 2) != 0) {
            str2 = trackingEvent.event;
        }
        return trackingEvent.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackingEvent AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TrackingEvent(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingEvent)) {
            return false;
        }
        TrackingEvent trackingEvent = (TrackingEvent) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) trackingEvent.type) && Intrinsics.EZpvd((Object) this.event, (Object) trackingEvent.event);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.type.hashCode() * 31) + this.event.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackingEvent(type=" + this.type + ", event=" + this.event + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.TrackingEvent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackingEvent> serializer() {
            return TrackingEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackingEvent(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TrackingEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.event = str2;
    }

    public static final /* synthetic */ void OLrzqt(TrackingEvent trackingEvent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, trackingEvent.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, trackingEvent.event);
    }

    public TrackingEvent(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.event = str2;
    }
}
