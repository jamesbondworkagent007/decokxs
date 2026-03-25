package com.okinc.business.defi.biz.wallethardware.onekey;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.wallet.core.sign.evm.BaseAccountTransaction;
import com.okinc.wallet.core.sign.evm.SigData;
import com.okinc.wallet.core.sign.evm.SigData$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class EvmTransactionData implements Parcelable {
    private final long factionChainId;
    private final String sigChainId;
    private final SigData signData;
    private final BaseAccountTransaction transaction;
    private final int txType;
    private final String unsignedTx;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = SigData.$stable | BaseAccountTransaction.$stable;
    public static final Parcelable.Creator<EvmTransactionData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, BaseAccountTransaction.Companion.serializer(), null};

    public static final class Creator implements Parcelable.Creator<EvmTransactionData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmTransactionData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EvmTransactionData(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), (BaseAccountTransaction) parcel.readParcelable(EvmTransactionData.class.getClassLoader()), (SigData) parcel.readParcelable(EvmTransactionData.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmTransactionData[] newArray(int i) {
            return new EvmTransactionData[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFactionChainId() {
        return this.factionChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSigChainId() {
        return this.sigChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SigData getSignData() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseAccountTransaction getTransaction() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.txType);
        parcel.writeLong(this.factionChainId);
        parcel.writeString(this.sigChainId);
        parcel.writeString(this.unsignedTx);
        parcel.writeParcelable(this.transaction, i);
        parcel.writeParcelable(this.signData, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.wallethardware.onekey.EvmTransactionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EvmTransactionData> serializer() {
            return EvmTransactionData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EvmTransactionData(int i, int i2, long j, String str, String str2, BaseAccountTransaction baseAccountTransaction, SigData sigData, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, EvmTransactionData$$serializer.INSTANCE.getDescriptor());
        }
        this.txType = i2;
        this.factionChainId = j;
        this.sigChainId = str;
        this.unsignedTx = str2;
        this.transaction = baseAccountTransaction;
        this.signData = sigData;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EvmTransactionData evmTransactionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, evmTransactionData.txType);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, evmTransactionData.factionChainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, evmTransactionData.sigChainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, evmTransactionData.unsignedTx);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], evmTransactionData.transaction);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, SigData$$serializer.INSTANCE, evmTransactionData.signData);
    }

    public EvmTransactionData(int i, long j, @NotNull String str, @NotNull String str2, BaseAccountTransaction baseAccountTransaction, SigData sigData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.txType = i;
        this.factionChainId = j;
        this.sigChainId = str;
        this.unsignedTx = str2;
        this.transaction = baseAccountTransaction;
        this.signData = sigData;
    }
}
