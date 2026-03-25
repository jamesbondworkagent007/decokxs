package com.okinc.wallet.core.sign.starknet;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StarknetCall {
    private final List<String> calldata;
    private final String contractAddress;
    private final String entrypoint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.sign.starknet.StarknetCall */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StarknetCall copy$default(StarknetCall starknetCall, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = starknetCall.contractAddress;
        }
        if ((i & 2) != 0) {
            str2 = starknetCall.entrypoint;
        }
        if ((i & 4) != 0) {
            list = starknetCall.calldata;
        }
        return starknetCall.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.entrypoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.calldata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StarknetCall copy(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new StarknetCall(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarknetCall)) {
            return false;
        }
        StarknetCall starknetCall = (StarknetCall) obj;
        return Intrinsics.EZpvd((Object) this.contractAddress, (Object) starknetCall.contractAddress) && Intrinsics.EZpvd((Object) this.entrypoint, (Object) starknetCall.entrypoint) && Intrinsics.EZpvd(this.calldata, starknetCall.calldata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCalldata() {
        return this.calldata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntrypoint() {
        return this.entrypoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.contractAddress.hashCode() * 31) + this.entrypoint.hashCode()) * 31) + this.calldata.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StarknetCall(contractAddress=" + this.contractAddress + ", entrypoint=" + this.entrypoint + ", calldata=" + this.calldata + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.starknet.StarknetCall.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StarknetCall> serializer() {
            return StarknetCall$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StarknetCall(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, StarknetCall$$serializer.INSTANCE.getDescriptor());
        }
        this.contractAddress = str;
        this.entrypoint = str2;
        this.calldata = list;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(StarknetCall starknetCall, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, starknetCall.contractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, starknetCall.entrypoint);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], starknetCall.calldata);
    }

    public StarknetCall(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.contractAddress = str;
        this.entrypoint = str2;
        this.calldata = list;
    }
}
