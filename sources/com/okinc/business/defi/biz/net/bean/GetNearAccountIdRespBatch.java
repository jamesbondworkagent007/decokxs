package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class GetNearAccountIdRespBatch implements Parcelable {
    private String account;
    private String accountId;
    private String pubKey;
    private ResponseSingeResult<GetNearAccountIdResp> responseResult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GetNearAccountIdRespBatch> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, ResponseSingeResult.Companion.serializer(GetNearAccountIdResp$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<GetNearAccountIdRespBatch> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetNearAccountIdRespBatch createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GetNearAccountIdRespBatch(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ResponseSingeResult.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetNearAccountIdRespBatch[] newArray(int i) {
            return new GetNearAccountIdRespBatch[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.GetNearAccountIdRespBatch */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetNearAccountIdRespBatch copy$default(GetNearAccountIdRespBatch getNearAccountIdRespBatch, String str, String str2, String str3, ResponseSingeResult responseSingeResult, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getNearAccountIdRespBatch.account;
        }
        if ((i & 2) != 0) {
            str2 = getNearAccountIdRespBatch.accountId;
        }
        if ((i & 4) != 0) {
            str3 = getNearAccountIdRespBatch.pubKey;
        }
        if ((i & 8) != 0) {
            responseSingeResult = getNearAccountIdRespBatch.responseResult;
        }
        return getNearAccountIdRespBatch.copy(str, str2, str3, responseSingeResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseSingeResult<GetNearAccountIdResp> component4() {
        return this.responseResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetNearAccountIdRespBatch copy(String str, String str2, String str3, ResponseSingeResult<GetNearAccountIdResp> responseSingeResult) {
        return new GetNearAccountIdRespBatch(str, str2, str3, responseSingeResult);
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
        if (!(obj instanceof GetNearAccountIdRespBatch)) {
            return false;
        }
        GetNearAccountIdRespBatch getNearAccountIdRespBatch = (GetNearAccountIdRespBatch) obj;
        return Intrinsics.EZpvd((Object) this.account, (Object) getNearAccountIdRespBatch.account) && Intrinsics.EZpvd((Object) this.accountId, (Object) getNearAccountIdRespBatch.accountId) && Intrinsics.EZpvd((Object) this.pubKey, (Object) getNearAccountIdRespBatch.pubKey) && Intrinsics.EZpvd(this.responseResult, getNearAccountIdRespBatch.responseResult);
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
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseSingeResult<GetNearAccountIdResp> getResponseResult() {
        return this.responseResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.account;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.accountId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pubKey;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        ResponseSingeResult<GetNearAccountIdResp> responseSingeResult = this.responseResult;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (responseSingeResult != null ? responseSingeResult.hashCode() : 0);
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
    public final void setPubKey(String str) {
        this.pubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResponseResult(ResponseSingeResult<GetNearAccountIdResp> responseSingeResult) {
        this.responseResult = responseSingeResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetNearAccountIdRespBatch(account=" + this.account + ", accountId=" + this.accountId + ", pubKey=" + this.pubKey + ", responseResult=" + this.responseResult + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.account);
        parcel.writeString(this.accountId);
        parcel.writeString(this.pubKey);
        ResponseSingeResult<GetNearAccountIdResp> responseSingeResult = this.responseResult;
        if (responseSingeResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            responseSingeResult.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.GetNearAccountIdRespBatch.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetNearAccountIdRespBatch> serializer() {
            return GetNearAccountIdRespBatch$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetNearAccountIdRespBatch(int i, String str, String str2, String str3, ResponseSingeResult responseSingeResult, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, GetNearAccountIdRespBatch$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.account = "";
        } else {
            this.account = str;
        }
        if ((i & 2) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str2;
        }
        if ((i & 4) == 0) {
            this.pubKey = "";
        } else {
            this.pubKey = str3;
        }
        this.responseResult = responseSingeResult;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(GetNearAccountIdRespBatch getNearAccountIdRespBatch, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) getNearAccountIdRespBatch.account, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, getNearAccountIdRespBatch.account);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) getNearAccountIdRespBatch.accountId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, getNearAccountIdRespBatch.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) getNearAccountIdRespBatch.pubKey, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, getNearAccountIdRespBatch.pubKey);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], getNearAccountIdRespBatch.responseResult);
    }

    public GetNearAccountIdRespBatch(String str, String str2, String str3, ResponseSingeResult<GetNearAccountIdResp> responseSingeResult) {
        this.account = str;
        this.accountId = str2;
        this.pubKey = str3;
        this.responseResult = responseSingeResult;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (r5v0 com.okinc.business.defi.biz.net.bean.ResponseSingeResult)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.ResponseSingeResult<com.okinc.business.defi.biz.net.bean.GetNearAccountIdResp>):void (m)] (LINE:308) call: com.okinc.business.defi.biz.net.bean.GetNearAccountIdRespBatch.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.ResponseSingeResult):void type: THIS */
    public /* synthetic */ GetNearAccountIdRespBatch(String str, String str2, String str3, ResponseSingeResult responseSingeResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, responseSingeResult);
    }
}
