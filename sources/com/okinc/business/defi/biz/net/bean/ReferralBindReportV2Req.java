package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ReferralBindReportV2Req implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String accountId;
    private String code;
    private final boolean restore;
    private Map<String, String> signAddress;
    private String signMsg;
    private String signature;
    private final int source;
    private final long timestamp;
    private String walletType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReferralBindReportV2Req> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ReferralBindReportV2Req> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralBindReportV2Req createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new ReferralBindReportV2Req(string, string2, string3, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralBindReportV2Req[] newArray(int i) {
            return new ReferralBindReportV2Req[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component4() {
        return this.signAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.restore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReferralBindReportV2Req copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map, @NotNull String str4, @NotNull String str5, long j, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ReferralBindReportV2Req(str, str2, str3, map, str4, str5, j, i, z);
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
        if (!(obj instanceof ReferralBindReportV2Req)) {
            return false;
        }
        ReferralBindReportV2Req referralBindReportV2Req = (ReferralBindReportV2Req) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) referralBindReportV2Req.code) && Intrinsics.EZpvd((Object) this.signMsg, (Object) referralBindReportV2Req.signMsg) && Intrinsics.EZpvd((Object) this.signature, (Object) referralBindReportV2Req.signature) && Intrinsics.EZpvd(this.signAddress, referralBindReportV2Req.signAddress) && Intrinsics.EZpvd((Object) this.accountId, (Object) referralBindReportV2Req.accountId) && Intrinsics.EZpvd((Object) this.walletType, (Object) referralBindReportV2Req.walletType) && this.timestamp == referralBindReportV2Req.timestamp && this.source == referralBindReportV2Req.source && this.restore == referralBindReportV2Req.restore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRestore() {
        return this.restore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getSignAddress() {
        return this.signAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignMsg() {
        return this.signMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.code.hashCode() * 31) + this.signMsg.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.signAddress.hashCode()) * 31) + this.accountId.hashCode()) * 31) + this.walletType.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.source)) * 31) + Boolean.hashCode(this.restore);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignAddress(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.signAddress = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReferralBindReportV2Req(code=" + this.code + ", signMsg=" + this.signMsg + ", signature=" + this.signature + ", signAddress=" + this.signAddress + ", accountId=" + this.accountId + ", walletType=" + this.walletType + ", timestamp=" + this.timestamp + ", source=" + this.source + ", restore=" + this.restore + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.code);
        parcel.writeString(this.signMsg);
        parcel.writeString(this.signature);
        Map<String, String> map = this.signAddress;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.accountId);
        parcel.writeString(this.walletType);
        parcel.writeLong(this.timestamp);
        parcel.writeInt(this.source);
        parcel.writeInt(this.restore ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ReferralBindReportV2Req.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReferralBindReportV2Req> serializer() {
            return ReferralBindReportV2Req$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, null, null, null};
    }

    public /* synthetic */ ReferralBindReportV2Req(int i, String str, String str2, String str3, Map map, String str4, String str5, long j, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, ReferralBindReportV2Req$$serializer.INSTANCE.getDescriptor());
        }
        this.code = str;
        this.signMsg = str2;
        this.signature = str3;
        this.signAddress = map;
        this.accountId = str4;
        this.walletType = str5;
        this.timestamp = j;
        this.source = i2;
        this.restore = z;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ReferralBindReportV2Req referralBindReportV2Req, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, referralBindReportV2Req.code);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, referralBindReportV2Req.signMsg);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, referralBindReportV2Req.signature);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], referralBindReportV2Req.signAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, referralBindReportV2Req.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, referralBindReportV2Req.walletType);
        compositeEncoder.encodeLongElement(serialDescriptor, 6, referralBindReportV2Req.timestamp);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, referralBindReportV2Req.source);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 8, referralBindReportV2Req.restore);
    }

    public ReferralBindReportV2Req(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map, @NotNull String str4, @NotNull String str5, long j, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.code = str;
        this.signMsg = str2;
        this.signature = str3;
        this.signAddress = map;
        this.accountId = str4;
        this.walletType = str5;
        this.timestamp = j;
        this.source = i;
        this.restore = z;
    }
}
