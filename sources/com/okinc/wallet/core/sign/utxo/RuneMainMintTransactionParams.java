package com.okinc.wallet.core.sign.utxo;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class RuneMainMintTransactionParams {
    public static final String TYPE_MINT = "runeMainMint";

    @SerializedName(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)
    private final String address;

    @SerializedName("data")
    private final String data;

    @SerializedName("feePerB")
    private final String feePerB;

    @SerializedName("inputs")
    private final List<RunesTxIn> inputs;

    @SerializedName("minOutput")
    private final String minOutput;

    @SerializedName("mintNum")
    private final int mintNum;

    @SerializedName("network")
    private final String network;

    @SerializedName("receiver")
    private final String receiver;

    @SerializedName("type")
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(RunesTxIn$$serializer.INSTANCE), null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RuneMainMintTransactionParams KWHzl(@NotNull String str, @NotNull List<RunesTxIn> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull String str7, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new RuneMainMintTransactionParams(str, list, str2, str3, str4, str5, str6, str7, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuneMainMintTransactionParams)) {
            return false;
        }
        RuneMainMintTransactionParams runeMainMintTransactionParams = (RuneMainMintTransactionParams) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) runeMainMintTransactionParams.type) && Intrinsics.EZpvd(this.inputs, runeMainMintTransactionParams.inputs) && Intrinsics.EZpvd((Object) this.address, (Object) runeMainMintTransactionParams.address) && Intrinsics.EZpvd((Object) this.receiver, (Object) runeMainMintTransactionParams.receiver) && Intrinsics.EZpvd((Object) this.feePerB, (Object) runeMainMintTransactionParams.feePerB) && Intrinsics.EZpvd((Object) this.minOutput, (Object) runeMainMintTransactionParams.minOutput) && Intrinsics.EZpvd((Object) this.network, (Object) runeMainMintTransactionParams.network) && Intrinsics.EZpvd((Object) this.data, (Object) runeMainMintTransactionParams.data) && this.mintNum == runeMainMintTransactionParams.mintNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.inputs.hashCode();
        int iHashCode3 = this.address.hashCode();
        int iHashCode4 = this.receiver.hashCode();
        int iHashCode5 = this.feePerB.hashCode();
        int iHashCode6 = this.minOutput.hashCode();
        String str = this.network;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.data.hashCode()) * 31) + Integer.hashCode(this.mintNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RuneMainMintTransactionParams(type=" + this.type + ", inputs=" + this.inputs + ", address=" + this.address + ", receiver=" + this.receiver + ", feePerB=" + this.feePerB + ", minOutput=" + this.minOutput + ", network=" + this.network + ", data=" + this.data + ", mintNum=" + this.mintNum + ")";
    }

    public /* synthetic */ RuneMainMintTransactionParams(int i, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (508 != (i & TypedValues.PositionType.TYPE_CURVE_FIT)) {
            PluginExceptionsKt.throwMissingFieldException(i, TypedValues.PositionType.TYPE_CURVE_FIT, RuneMainMintTransactionParams$$serializer.INSTANCE.getDescriptor());
        }
        this.type = (i & 1) == 0 ? TYPE_MINT : str;
        if ((i & 2) == 0) {
            this.inputs = yDY.AhwBna();
        } else {
            this.inputs = list;
        }
        this.address = str2;
        this.receiver = str3;
        this.feePerB = str4;
        this.minOutput = str5;
        this.network = str6;
        this.data = str7;
        this.mintNum = i2;
    }

    public static final /* synthetic */ void KWHzl(RuneMainMintTransactionParams runeMainMintTransactionParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) runeMainMintTransactionParams.type, (Object) TYPE_MINT)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, runeMainMintTransactionParams.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(runeMainMintTransactionParams.inputs, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], runeMainMintTransactionParams.inputs);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, runeMainMintTransactionParams.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, runeMainMintTransactionParams.receiver);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, runeMainMintTransactionParams.feePerB);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, runeMainMintTransactionParams.minOutput);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, runeMainMintTransactionParams.network);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, runeMainMintTransactionParams.data);
        compositeEncoder.encodeIntElement(serialDescriptor, 8, runeMainMintTransactionParams.mintNum);
    }

    public RuneMainMintTransactionParams(@NotNull String str, @NotNull List<RunesTxIn> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull String str7, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.type = str;
        this.inputs = list;
        this.address = str2;
        this.receiver = str3;
        this.feePerB = str4;
        this.minOutput = str5;
        this.network = str6;
        this.data = str7;
        this.mintNum = i;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.RuneMainMintTransactionParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RuneMainMintTransactionParams> serializer() {
            return RuneMainMintTransactionParams$$serializer.INSTANCE;
        }
    }
}
