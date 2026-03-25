package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class WebSocketEventWrapper {
    public final int chainId;
    public final int eventType;
    public final JsonElement rawData;
    public final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WebSocketEventWrapper copy$default(WebSocketEventWrapper webSocketEventWrapper, int i, int i2, String str, JsonElement jsonElement, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = webSocketEventWrapper.eventType;
        }
        if ((i3 & 2) != 0) {
            i2 = webSocketEventWrapper.chainId;
        }
        if ((i3 & 4) != 0) {
            str = webSocketEventWrapper.userWalletAddress;
        }
        if ((i3 & 8) != 0) {
            jsonElement = webSocketEventWrapper.rawData;
        }
        return webSocketEventWrapper.KWHzl(i, i2, str, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebSocketEventWrapper KWHzl(int i, int i2, @NotNull String str, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new WebSocketEventWrapper(i, i2, str, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketEventWrapper)) {
            return false;
        }
        WebSocketEventWrapper webSocketEventWrapper = (WebSocketEventWrapper) obj;
        return this.eventType == webSocketEventWrapper.eventType && this.chainId == webSocketEventWrapper.chainId && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) webSocketEventWrapper.userWalletAddress) && Intrinsics.EZpvd(this.rawData, webSocketEventWrapper.rawData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.eventType) * 31) + Integer.hashCode(this.chainId)) * 31) + this.userWalletAddress.hashCode()) * 31) + this.rawData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WebSocketEventWrapper(eventType=" + this.eventType + ", chainId=" + this.chainId + ", userWalletAddress=" + this.userWalletAddress + ", rawData=" + this.rawData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.WebSocketEventWrapper.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WebSocketEventWrapper> serializer() {
            return WebSocketEventWrapper$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WebSocketEventWrapper(int i, int i2, int i3, String str, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, WebSocketEventWrapper$$serializer.INSTANCE.getDescriptor());
        }
        this.eventType = i2;
        this.chainId = i3;
        this.userWalletAddress = str;
        this.rawData = jsonElement;
    }

    public static final /* synthetic */ void AEQbTJ(WebSocketEventWrapper webSocketEventWrapper, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, webSocketEventWrapper.eventType);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, webSocketEventWrapper.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, webSocketEventWrapper.userWalletAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, JsonElementSerializer.INSTANCE, webSocketEventWrapper.rawData);
    }

    public WebSocketEventWrapper(int i, int i2, @NotNull String str, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.eventType = i;
        this.chainId = i2;
        this.userWalletAddress = str;
        this.rawData = jsonElement;
    }
}
