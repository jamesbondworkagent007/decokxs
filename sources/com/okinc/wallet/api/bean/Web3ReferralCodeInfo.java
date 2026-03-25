package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class Web3ReferralCodeInfo implements Parcelable {
    public static final int $stable = 0;
    private final Web3BusinessLine businessLine;
    private final String context;
    private final String referralCode;
    private final Web3ReferralCodeSource source;
    private final long timestamp;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Web3ReferralCodeInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, Web3ReferralCodeSource.Companion.serializer(), Web3BusinessLine.Companion.serializer()};

    public static final class Creator implements Parcelable.Creator<Web3ReferralCodeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3ReferralCodeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Web3ReferralCodeInfo(parcel.readString(), parcel.readLong(), parcel.readString(), Web3ReferralCodeSource.CREATOR.createFromParcel(parcel), Web3BusinessLine.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3ReferralCodeInfo[] newArray(int i) {
            return new Web3ReferralCodeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Web3ReferralCodeInfo copy$default(Web3ReferralCodeInfo web3ReferralCodeInfo, String str, long j, String str2, Web3ReferralCodeSource web3ReferralCodeSource, Web3BusinessLine web3BusinessLine, int i, Object obj) {
        if ((i & 1) != 0) {
            str = web3ReferralCodeInfo.referralCode;
        }
        if ((i & 2) != 0) {
            j = web3ReferralCodeInfo.timestamp;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = web3ReferralCodeInfo.context;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            web3ReferralCodeSource = web3ReferralCodeInfo.source;
        }
        Web3ReferralCodeSource web3ReferralCodeSource2 = web3ReferralCodeSource;
        if ((i & 16) != 0) {
            web3BusinessLine = web3ReferralCodeInfo.businessLine;
        }
        return web3ReferralCodeInfo.copy(str, j2, str3, web3ReferralCodeSource2, web3BusinessLine);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3ReferralCodeSource component4() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3BusinessLine component5() {
        return this.businessLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3ReferralCodeInfo copy(@NotNull String str, long j, @NotNull String str2, @NotNull Web3ReferralCodeSource web3ReferralCodeSource, @NotNull Web3BusinessLine web3BusinessLine) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(web3ReferralCodeSource, "");
        Intrinsics.checkNotNullParameter(web3BusinessLine, "");
        return new Web3ReferralCodeInfo(str, j, str2, web3ReferralCodeSource, web3BusinessLine);
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
        if (!(obj instanceof Web3ReferralCodeInfo)) {
            return false;
        }
        Web3ReferralCodeInfo web3ReferralCodeInfo = (Web3ReferralCodeInfo) obj;
        return Intrinsics.EZpvd((Object) this.referralCode, (Object) web3ReferralCodeInfo.referralCode) && this.timestamp == web3ReferralCodeInfo.timestamp && Intrinsics.EZpvd((Object) this.context, (Object) web3ReferralCodeInfo.context) && this.source == web3ReferralCodeInfo.source && this.businessLine == web3ReferralCodeInfo.businessLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3BusinessLine getBusinessLine() {
        return this.businessLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContext() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3ReferralCodeSource getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.referralCode.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.context.hashCode()) * 31) + this.source.hashCode()) * 31) + this.businessLine.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Web3ReferralCodeInfo(referralCode=" + this.referralCode + ", timestamp=" + this.timestamp + ", context=" + this.context + ", source=" + this.source + ", businessLine=" + this.businessLine + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.referralCode);
        parcel.writeLong(this.timestamp);
        parcel.writeString(this.context);
        this.source.writeToParcel(parcel, i);
        this.businessLine.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.Web3ReferralCodeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Web3ReferralCodeInfo> serializer() {
            return Web3ReferralCodeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Web3ReferralCodeInfo(int i, String str, long j, String str2, Web3ReferralCodeSource web3ReferralCodeSource, Web3BusinessLine web3BusinessLine, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, Web3ReferralCodeInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.referralCode = str;
        this.timestamp = j;
        this.context = str2;
        this.source = web3ReferralCodeSource;
        this.businessLine = web3BusinessLine;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(Web3ReferralCodeInfo web3ReferralCodeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, web3ReferralCodeInfo.referralCode);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, web3ReferralCodeInfo.timestamp);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, web3ReferralCodeInfo.context);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], web3ReferralCodeInfo.source);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], web3ReferralCodeInfo.businessLine);
    }

    public Web3ReferralCodeInfo(@NotNull String str, long j, @NotNull String str2, @NotNull Web3ReferralCodeSource web3ReferralCodeSource, @NotNull Web3BusinessLine web3BusinessLine) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(web3ReferralCodeSource, "");
        Intrinsics.checkNotNullParameter(web3BusinessLine, "");
        this.referralCode = str;
        this.timestamp = j;
        this.context = str2;
        this.source = web3ReferralCodeSource;
        this.businessLine = web3BusinessLine;
    }
}
