package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class OfflineAssetDetailResp implements Parcelable {
    public static final int STATUS_CAN_CLAIM = 1;
    private String expiredAt;
    private String offlineAmount;
    private Integer status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OfflineAssetDetailResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OfflineAssetDetailResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OfflineAssetDetailResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OfflineAssetDetailResp(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OfflineAssetDetailResp[] newArray(int i) {
            return new OfflineAssetDetailResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OfflineAssetDetailResp() {
        this((Integer) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OfflineAssetDetailResp copy$default(OfflineAssetDetailResp offlineAssetDetailResp, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = offlineAssetDetailResp.status;
        }
        if ((i & 2) != 0) {
            str = offlineAssetDetailResp.offlineAmount;
        }
        if ((i & 4) != 0) {
            str2 = offlineAssetDetailResp.expiredAt;
        }
        return offlineAssetDetailResp.copy(num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.offlineAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.expiredAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfflineAssetDetailResp copy(Integer num, String str, String str2) {
        return new OfflineAssetDetailResp(num, str, str2);
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
        if (!(obj instanceof OfflineAssetDetailResp)) {
            return false;
        }
        OfflineAssetDetailResp offlineAssetDetailResp = (OfflineAssetDetailResp) obj;
        return Intrinsics.EZpvd(this.status, offlineAssetDetailResp.status) && Intrinsics.EZpvd((Object) this.offlineAmount, (Object) offlineAssetDetailResp.offlineAmount) && Intrinsics.EZpvd((Object) this.expiredAt, (Object) offlineAssetDetailResp.expiredAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiredAt() {
        return this.expiredAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOfflineAmount() {
        return this.offlineAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.status;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.offlineAmount;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.expiredAt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiredAt(String str) {
        this.expiredAt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOfflineAmount(String str) {
        this.offlineAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(Integer num) {
        this.status = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OfflineAssetDetailResp(status=" + this.status + ", offlineAmount=" + this.offlineAmount + ", expiredAt=" + this.expiredAt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.status;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.offlineAmount);
        parcel.writeString(this.expiredAt);
    }

    public /* synthetic */ OfflineAssetDetailResp(int i, Integer num, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = num;
        }
        if ((i & 2) == 0) {
            this.offlineAmount = null;
        } else {
            this.offlineAmount = str;
        }
        if ((i & 4) == 0) {
            this.expiredAt = null;
        } else {
            this.expiredAt = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(OfflineAssetDetailResp offlineAssetDetailResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || offlineAssetDetailResp.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, offlineAssetDetailResp.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || offlineAssetDetailResp.offlineAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, offlineAssetDetailResp.offlineAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && offlineAssetDetailResp.expiredAt == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, offlineAssetDetailResp.expiredAt);
    }

    public OfflineAssetDetailResp(Integer num, String str, String str2) {
        this.status = num;
        this.offlineAmount = str;
        this.expiredAt = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:1659) call: com.okinc.business.defi.biz.net.bean.OfflineAssetDetailResp.<init>(java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OfflineAssetDetailResp(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.OfflineAssetDetailResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OfflineAssetDetailResp> serializer() {
            return OfflineAssetDetailResp$$serializer.INSTANCE;
        }
    }
}
