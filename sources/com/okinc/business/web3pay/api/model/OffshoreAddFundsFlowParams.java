package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OffshoreAddFundsFlowParams implements Parcelable {
    public static final int $stable = 0;
    public final String chainIndex;
    public final String convertFromTokenCoinTypeNo;
    public final String convertSubTitle;
    public final String exchangeReceiveSubtitle;
    public final String onChainReceiveSubtitle;
    public final Web3PayProjectId projectId;
    public final Boolean showConvert;
    public final String tokenCoinTypeNo;
    public final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OffshoreAddFundsFlowParams> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.api.model.Web3PayProjectId", Web3PayProjectId.values()), null, null, null};

    public static final class Creator implements Parcelable.Creator<OffshoreAddFundsFlowParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OffshoreAddFundsFlowParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OffshoreAddFundsFlowParams(string, string2, boolValueOf, parcel.readString(), parcel.readString(), Web3PayProjectId.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OffshoreAddFundsFlowParams[] newArray(int i) {
            return new OffshoreAddFundsFlowParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OffshoreAddFundsFlowParams KWHzl(String str, String str2, Boolean bool, String str3, String str4, @NotNull Web3PayProjectId web3PayProjectId, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(web3PayProjectId, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new OffshoreAddFundsFlowParams(str, str2, bool, str3, str4, web3PayProjectId, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffshoreAddFundsFlowParams)) {
            return false;
        }
        OffshoreAddFundsFlowParams offshoreAddFundsFlowParams = (OffshoreAddFundsFlowParams) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) offshoreAddFundsFlowParams.chainIndex) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) offshoreAddFundsFlowParams.tokenSymbol) && Intrinsics.EZpvd(this.showConvert, offshoreAddFundsFlowParams.showConvert) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) offshoreAddFundsFlowParams.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.convertFromTokenCoinTypeNo, (Object) offshoreAddFundsFlowParams.convertFromTokenCoinTypeNo) && this.projectId == offshoreAddFundsFlowParams.projectId && Intrinsics.EZpvd((Object) this.convertSubTitle, (Object) offshoreAddFundsFlowParams.convertSubTitle) && Intrinsics.EZpvd((Object) this.exchangeReceiveSubtitle, (Object) offshoreAddFundsFlowParams.exchangeReceiveSubtitle) && Intrinsics.EZpvd((Object) this.onChainReceiveSubtitle, (Object) offshoreAddFundsFlowParams.onChainReceiveSubtitle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainIndex;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenSymbol;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.showConvert;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str3 = this.tokenCoinTypeNo;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.convertFromTokenCoinTypeNo;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.projectId.hashCode()) * 31) + this.convertSubTitle.hashCode()) * 31) + this.exchangeReceiveSubtitle.hashCode()) * 31) + this.onChainReceiveSubtitle.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OffshoreAddFundsFlowParams(chainIndex=" + this.chainIndex + ", tokenSymbol=" + this.tokenSymbol + ", showConvert=" + this.showConvert + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", convertFromTokenCoinTypeNo=" + this.convertFromTokenCoinTypeNo + ", projectId=" + this.projectId + ", convertSubTitle=" + this.convertSubTitle + ", exchangeReceiveSubtitle=" + this.exchangeReceiveSubtitle + ", onChainReceiveSubtitle=" + this.onChainReceiveSubtitle + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.tokenSymbol);
        Boolean bool = this.showConvert;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.tokenCoinTypeNo);
        parcel.writeString(this.convertFromTokenCoinTypeNo);
        parcel.writeString(this.projectId.name());
        parcel.writeString(this.convertSubTitle);
        parcel.writeString(this.exchangeReceiveSubtitle);
        parcel.writeString(this.onChainReceiveSubtitle);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.OffshoreAddFundsFlowParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OffshoreAddFundsFlowParams> serializer() {
            return OffshoreAddFundsFlowParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OffshoreAddFundsFlowParams(int i, String str, String str2, Boolean bool, String str3, String str4, Web3PayProjectId web3PayProjectId, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, OffshoreAddFundsFlowParams$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.tokenSymbol = str2;
        this.showConvert = bool;
        this.tokenCoinTypeNo = str3;
        this.convertFromTokenCoinTypeNo = str4;
        this.projectId = web3PayProjectId;
        this.convertSubTitle = str5;
        if ((i & 128) == 0) {
            this.exchangeReceiveSubtitle = "";
        } else {
            this.exchangeReceiveSubtitle = str6;
        }
        if ((i & 256) == 0) {
            this.onChainReceiveSubtitle = "";
        } else {
            this.onChainReceiveSubtitle = str7;
        }
    }

    public static final /* synthetic */ void EZpvd(OffshoreAddFundsFlowParams offshoreAddFundsFlowParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, offshoreAddFundsFlowParams.chainIndex);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, offshoreAddFundsFlowParams.tokenSymbol);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, offshoreAddFundsFlowParams.showConvert);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, offshoreAddFundsFlowParams.tokenCoinTypeNo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, offshoreAddFundsFlowParams.convertFromTokenCoinTypeNo);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], offshoreAddFundsFlowParams.projectId);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, offshoreAddFundsFlowParams.convertSubTitle);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) offshoreAddFundsFlowParams.exchangeReceiveSubtitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, offshoreAddFundsFlowParams.exchangeReceiveSubtitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) offshoreAddFundsFlowParams.onChainReceiveSubtitle, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, offshoreAddFundsFlowParams.onChainReceiveSubtitle);
    }

    public OffshoreAddFundsFlowParams(String str, String str2, Boolean bool, String str3, String str4, @NotNull Web3PayProjectId web3PayProjectId, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(web3PayProjectId, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.chainIndex = str;
        this.tokenSymbol = str2;
        this.showConvert = bool;
        this.tokenCoinTypeNo = str3;
        this.convertFromTokenCoinTypeNo = str4;
        this.projectId = web3PayProjectId;
        this.convertSubTitle = str5;
        this.exchangeReceiveSubtitle = str6;
        this.onChainReceiveSubtitle = str7;
    }
}
