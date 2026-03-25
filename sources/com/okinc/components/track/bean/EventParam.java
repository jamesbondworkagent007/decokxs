package com.okinc.components.track.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class EventParam {
    public final boolean enumerable;
    public final String key;
    public String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EventParam copy$default(EventParam eventParam, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventParam.key;
        }
        if ((i & 2) != 0) {
            str2 = eventParam.value;
        }
        if ((i & 4) != 0) {
            z = eventParam.enumerable;
        }
        return eventParam.AEQbTJ(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EventParam AEQbTJ(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EventParam(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.enumerable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventParam)) {
            return false;
        }
        EventParam eventParam = (EventParam) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) eventParam.key) && Intrinsics.EZpvd((Object) this.value, (Object) eventParam.value) && this.enumerable == eventParam.enumerable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.enumerable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EventParam(key=" + this.key + ", value=" + this.value + ", enumerable=" + this.enumerable + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.track.bean.EventParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EventParam> serializer() {
            return EventParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EventParam(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EventParam$$serializer.INSTANCE.getDescriptor());
        }
        this.key = str;
        this.value = str2;
        this.enumerable = z;
    }

    public static final /* synthetic */ void copydefault(EventParam eventParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eventParam.key);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, eventParam.value);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, eventParam.enumerable);
    }

    public EventParam(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.value = str2;
        this.enumerable = z;
    }
}
