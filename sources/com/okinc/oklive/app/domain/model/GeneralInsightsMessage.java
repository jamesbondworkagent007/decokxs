package com.okinc.oklive.app.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GeneralInsightsMessage {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int currentViews;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GeneralInsightsMessage copy$default(GeneralInsightsMessage generalInsightsMessage, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = generalInsightsMessage.currentViews;
        }
        return generalInsightsMessage.copy(i);
    }

    @SerialName("currentViews")
    public static /* synthetic */ void getCurrentViews$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currentViews;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GeneralInsightsMessage copy(int i) {
        return new GeneralInsightsMessage(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GeneralInsightsMessage) && this.currentViews == ((GeneralInsightsMessage) obj).currentViews;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentViews() {
        return this.currentViews;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.currentViews);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GeneralInsightsMessage(currentViews=" + this.currentViews + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.domain.model.GeneralInsightsMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GeneralInsightsMessage> serializer() {
            return GeneralInsightsMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GeneralInsightsMessage(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, GeneralInsightsMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.currentViews = i2;
    }

    public GeneralInsightsMessage(int i) {
        this.currentViews = i;
    }
}
