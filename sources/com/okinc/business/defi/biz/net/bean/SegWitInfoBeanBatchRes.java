package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.wallet.api.bean.AddressType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SegWitInfoBeanBatchRes implements Parcelable {
    private String account;
    private String accountId;
    private Integer addressType;
    private String pubKey;
    private ResponseResult<SegWitInfoBeanRes> responseResult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SegWitInfoBeanBatchRes> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, ResponseResult.Companion.serializer(SegWitInfoBeanRes$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<SegWitInfoBeanBatchRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SegWitInfoBeanBatchRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SegWitInfoBeanBatchRes(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ResponseResult.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SegWitInfoBeanBatchRes[] newArray(int i) {
            return new SegWitInfoBeanBatchRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.net.bean.SegWitInfoBeanBatchRes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SegWitInfoBeanBatchRes copy$default(SegWitInfoBeanBatchRes segWitInfoBeanBatchRes, String str, String str2, String str3, Integer num, ResponseResult responseResult, int i, Object obj) {
        if ((i & 1) != 0) {
            str = segWitInfoBeanBatchRes.accountId;
        }
        if ((i & 2) != 0) {
            str2 = segWitInfoBeanBatchRes.account;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = segWitInfoBeanBatchRes.pubKey;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            num = segWitInfoBeanBatchRes.addressType;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            responseResult = segWitInfoBeanBatchRes.responseResult;
        }
        return segWitInfoBeanBatchRes.copy(str, str4, str5, num2, responseResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseResult<SegWitInfoBeanRes> component5() {
        return this.responseResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SegWitInfoBeanBatchRes copy(String str, String str2, String str3, Integer num, ResponseResult<SegWitInfoBeanRes> responseResult) {
        return new SegWitInfoBeanBatchRes(str, str2, str3, num, responseResult);
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
        if (!(obj instanceof SegWitInfoBeanBatchRes)) {
            return false;
        }
        SegWitInfoBeanBatchRes segWitInfoBeanBatchRes = (SegWitInfoBeanBatchRes) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) segWitInfoBeanBatchRes.accountId) && Intrinsics.EZpvd((Object) this.account, (Object) segWitInfoBeanBatchRes.account) && Intrinsics.EZpvd((Object) this.pubKey, (Object) segWitInfoBeanBatchRes.pubKey) && Intrinsics.EZpvd(this.addressType, segWitInfoBeanBatchRes.addressType) && Intrinsics.EZpvd(this.responseResult, segWitInfoBeanBatchRes.responseResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseResult<SegWitInfoBeanRes> getResponseResult() {
        return this.responseResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accountId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.account;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pubKey;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.addressType;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        ResponseResult<SegWitInfoBeanRes> responseResult = this.responseResult;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (responseResult != null ? responseResult.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccount(String str) {
        this.account = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(String str) {
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(Integer num) {
        this.addressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPubKey(String str) {
        this.pubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResponseResult(ResponseResult<SegWitInfoBeanRes> responseResult) {
        this.responseResult = responseResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SegWitInfoBeanBatchRes(accountId=" + this.accountId + ", account=" + this.account + ", pubKey=" + this.pubKey + ", addressType=" + this.addressType + ", responseResult=" + this.responseResult + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.account);
        parcel.writeString(this.pubKey);
        Integer num = this.addressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        ResponseResult<SegWitInfoBeanRes> responseResult = this.responseResult;
        if (responseResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            responseResult.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SegWitInfoBeanBatchRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SegWitInfoBeanBatchRes> serializer() {
            return SegWitInfoBeanBatchRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SegWitInfoBeanBatchRes(int i, String str, String str2, String str3, Integer num, ResponseResult responseResult, SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16, SegWitInfoBeanBatchRes$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.account = "";
        } else {
            this.account = str2;
        }
        if ((i & 4) == 0) {
            this.pubKey = "";
        } else {
            this.pubKey = str3;
        }
        if ((i & 8) == 0) {
            this.addressType = Integer.valueOf(AddressType.Legacy.getValue());
        } else {
            this.addressType = num;
        }
        this.responseResult = responseResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SegWitInfoBeanBatchRes segWitInfoBeanBatchRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) segWitInfoBeanBatchRes.accountId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, segWitInfoBeanBatchRes.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) segWitInfoBeanBatchRes.account, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, segWitInfoBeanBatchRes.account);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) segWitInfoBeanBatchRes.pubKey, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, segWitInfoBeanBatchRes.pubKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, segWitInfoBeanBatchRes.addressType);
        } else {
            Integer num = segWitInfoBeanBatchRes.addressType;
            int value = AddressType.Legacy.getValue();
            if (num == null || num.intValue() != value) {
            }
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], segWitInfoBeanBatchRes.responseResult);
    }

    public SegWitInfoBeanBatchRes(String str, String str2, String str3, Integer num, ResponseResult<SegWitInfoBeanRes> responseResult) {
        this.accountId = str;
        this.account = str2;
        this.pubKey = str3;
        this.addressType = num;
        this.responseResult = responseResult;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Integer:0x0021: INVOKE 
  (wrap:int:0x001d: INVOKE 
  (wrap:com.okinc.wallet.api.bean.AddressType:0x001b: SGET  A[WRAPPED] (LINE:693) com.okinc.wallet.api.bean.AddressType.Legacy com.okinc.wallet.api.bean.AddressType)
 VIRTUAL call: com.okinc.wallet.api.bean.AddressType.getValue():int A[MD:():int (m), WRAPPED] (LINE:693))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:693)) : (r11v0 java.lang.Integer))
  (r12v0 com.okinc.business.defi.biz.net.bean.ResponseResult)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.defi.biz.net.bean.ResponseResult<com.okinc.business.defi.biz.net.bean.SegWitInfoBeanRes>):void (m)] (LINE:689) call: com.okinc.business.defi.biz.net.bean.SegWitInfoBeanBatchRes.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.defi.biz.net.bean.ResponseResult):void type: THIS */
    public /* synthetic */ SegWitInfoBeanBatchRes(String str, String str2, String str3, Integer num, ResponseResult responseResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? Integer.valueOf(AddressType.Legacy.getValue()) : num, responseResult);
    }
}
