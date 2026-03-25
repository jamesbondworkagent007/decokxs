package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TrackingProperties {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("account_state")
    private final String accountState;

    @SerializedName("button")
    private final String button;

    @SerializedName("reward_available")
    private final String rewardAvailable;

    @SerializedName("reward_type")
    private final String rewardType;

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.TrackingProperties.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackingProperties> serializer() {
            return TrackingProperties$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackingProperties(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, TrackingProperties$$serializer.INSTANCE.getDescriptor());
        }
        this.accountState = str;
        this.rewardAvailable = str2;
        this.rewardType = str3;
        this.button = str4;
    }

    public static final /* synthetic */ void EZpvd(TrackingProperties trackingProperties, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, trackingProperties.accountState);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, trackingProperties.rewardAvailable);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, trackingProperties.rewardType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, trackingProperties.button);
    }
}
