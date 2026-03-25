package com.okinc.business.market.features.jwt.domain.model;

import com.okinc.business.market.data.model.StarkNetSignData;
import com.okinc.business.market.data.model.StarkNetSignData$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class StarkNetHex {
    private final String accountAddress;
    private final StarkNetSignData typedData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StarkNetHex copy$default(StarkNetHex starkNetHex, String str, StarkNetSignData starkNetSignData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = starkNetHex.accountAddress;
        }
        if ((i & 2) != 0) {
            starkNetSignData = starkNetHex.typedData;
        }
        return starkNetHex.copy(str, starkNetSignData);
    }

    @SerialName("accountAddress")
    public static /* synthetic */ void getAccountAddress$annotations() {
    }

    @SerialName("typedData")
    public static /* synthetic */ void getTypedData$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StarkNetSignData component2() {
        return this.typedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StarkNetHex copy(@NotNull String str, @NotNull StarkNetSignData starkNetSignData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(starkNetSignData, "");
        return new StarkNetHex(str, starkNetSignData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarkNetHex)) {
            return false;
        }
        StarkNetHex starkNetHex = (StarkNetHex) obj;
        return Intrinsics.EZpvd((Object) this.accountAddress, (Object) starkNetHex.accountAddress) && Intrinsics.EZpvd(this.typedData, starkNetHex.typedData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountAddress() {
        return this.accountAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StarkNetSignData getTypedData() {
        return this.typedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.accountAddress.hashCode() * 31) + this.typedData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StarkNetHex(accountAddress=" + this.accountAddress + ", typedData=" + this.typedData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.jwt.domain.model.StarkNetHex.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StarkNetHex> serializer() {
            return StarkNetHex$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StarkNetHex(int i, String str, StarkNetSignData starkNetSignData, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, StarkNetHex$$serializer.INSTANCE.getDescriptor());
        }
        this.accountAddress = str;
        this.typedData = starkNetSignData;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(StarkNetHex starkNetHex, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, starkNetHex.accountAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, StarkNetSignData$$serializer.INSTANCE, starkNetHex.typedData);
    }

    public StarkNetHex(@NotNull String str, @NotNull StarkNetSignData starkNetSignData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(starkNetSignData, "");
        this.accountAddress = str;
        this.typedData = starkNetSignData;
    }
}
