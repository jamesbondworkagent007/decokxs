package com.okinc.dapp.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class VibeFeedsParamsBean implements Parcelable {
    public static final int $stable = 0;
    private final String chainId;
    private final int dimensionType;
    private final long duration;
    private final long eventTime;
    private final String firstMentionContentId;
    private final int timeUnit;
    private final String tokenContractAddress;
    private final String tokenTicker;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VibeFeedsParamsBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VibeFeedsParamsBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VibeFeedsParamsBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VibeFeedsParamsBean(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VibeFeedsParamsBean[] newArray(int i) {
            return new VibeFeedsParamsBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.dimensionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.firstMentionContentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibeFeedsParamsBean copy(long j, String str, String str2, String str3, int i, long j2, int i2, String str4) {
        return new VibeFeedsParamsBean(j, str, str2, str3, i, j2, i2, str4);
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
        if (!(obj instanceof VibeFeedsParamsBean)) {
            return false;
        }
        VibeFeedsParamsBean vibeFeedsParamsBean = (VibeFeedsParamsBean) obj;
        return this.eventTime == vibeFeedsParamsBean.eventTime && Intrinsics.EZpvd((Object) this.chainId, (Object) vibeFeedsParamsBean.chainId) && Intrinsics.EZpvd((Object) this.tokenTicker, (Object) vibeFeedsParamsBean.tokenTicker) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) vibeFeedsParamsBean.tokenContractAddress) && this.dimensionType == vibeFeedsParamsBean.dimensionType && this.duration == vibeFeedsParamsBean.duration && this.timeUnit == vibeFeedsParamsBean.timeUnit && Intrinsics.EZpvd((Object) this.firstMentionContentId, (Object) vibeFeedsParamsBean.firstMentionContentId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDimensionType() {
        return this.dimensionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEventTime() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFirstMentionContentId() {
        return this.firstMentionContentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTimeUnit() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenTicker() {
        return this.tokenTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.eventTime);
        String str = this.chainId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.tokenTicker;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenContractAddress;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        int iHashCode5 = Integer.hashCode(this.dimensionType);
        int iHashCode6 = Long.hashCode(this.duration);
        int iHashCode7 = Integer.hashCode(this.timeUnit);
        String str4 = this.firstMentionContentId;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VibeFeedsParamsBean(eventTime=" + this.eventTime + ", chainId=" + this.chainId + ", tokenTicker=" + this.tokenTicker + ", tokenContractAddress=" + this.tokenContractAddress + ", dimensionType=" + this.dimensionType + ", duration=" + this.duration + ", timeUnit=" + this.timeUnit + ", firstMentionContentId=" + this.firstMentionContentId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.eventTime);
        parcel.writeString(this.chainId);
        parcel.writeString(this.tokenTicker);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeInt(this.dimensionType);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.timeUnit);
        parcel.writeString(this.firstMentionContentId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dapp.bean.VibeFeedsParamsBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VibeFeedsParamsBean> serializer() {
            return VibeFeedsParamsBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VibeFeedsParamsBean(int i, long j, String str, String str2, String str3, int i2, long j2, int i3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (113 != (i & WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST)) {
            PluginExceptionsKt.throwMissingFieldException(i, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, VibeFeedsParamsBean$$serializer.INSTANCE.getDescriptor());
        }
        this.eventTime = j;
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 4) == 0) {
            this.tokenTicker = "";
        } else {
            this.tokenTicker = str2;
        }
        if ((i & 8) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str3;
        }
        this.dimensionType = i2;
        this.duration = j2;
        this.timeUnit = i3;
        if ((i & 128) == 0) {
            this.firstMentionContentId = "";
        } else {
            this.firstMentionContentId = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_api(VibeFeedsParamsBean vibeFeedsParamsBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, vibeFeedsParamsBean.eventTime);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) vibeFeedsParamsBean.chainId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, vibeFeedsParamsBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) vibeFeedsParamsBean.tokenTicker, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, vibeFeedsParamsBean.tokenTicker);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) vibeFeedsParamsBean.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, vibeFeedsParamsBean.tokenContractAddress);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, vibeFeedsParamsBean.dimensionType);
        compositeEncoder.encodeLongElement(serialDescriptor, 5, vibeFeedsParamsBean.duration);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, vibeFeedsParamsBean.timeUnit);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) vibeFeedsParamsBean.firstMentionContentId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, vibeFeedsParamsBean.firstMentionContentId);
    }

    public VibeFeedsParamsBean(long j, String str, String str2, String str3, int i, long j2, int i2, String str4) {
        this.eventTime = j;
        this.chainId = str;
        this.tokenTicker = str2;
        this.tokenContractAddress = str3;
        this.dimensionType = i;
        this.duration = j2;
        this.timeUnit = i2;
        this.firstMentionContentId = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r15v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (r20v0 int)
  (r21v0 long)
  (r23v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, int, long, int, java.lang.String):void (m)] (LINE:80) call: com.okinc.dapp.bean.VibeFeedsParamsBean.<init>(long, java.lang.String, java.lang.String, java.lang.String, int, long, int, java.lang.String):void type: THIS */
    public /* synthetic */ VibeFeedsParamsBean(long j, String str, String str2, String str3, int i, long j2, int i2, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, i, j2, i2, (i3 & 128) != 0 ? "" : str4);
    }
}
