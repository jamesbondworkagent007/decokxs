package com.okinc.business.dex.tee.domain.model;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class VerifySignInfo implements Parcelable {
    public static final int $stable = 0;
    private final String accountId;
    private final String address;
    private final long chainId;
    private final String signMsg;
    private final String signature;
    private final String teeId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VerifySignInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VerifySignInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifySignInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VerifySignInfo(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifySignInfo[] newArray(int i) {
            return new VerifySignInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifySignInfo copy$default(VerifySignInfo verifySignInfo, String str, String str2, long j, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifySignInfo.accountId;
        }
        if ((i & 2) != 0) {
            str2 = verifySignInfo.address;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            j = verifySignInfo.chainId;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = verifySignInfo.teeId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = verifySignInfo.signMsg;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = verifySignInfo.signature;
        }
        return verifySignInfo.copy(str, str6, j2, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.signMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifySignInfo copy(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new VerifySignInfo(str, str2, j, str3, str4, str5);
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
        if (!(obj instanceof VerifySignInfo)) {
            return false;
        }
        VerifySignInfo verifySignInfo = (VerifySignInfo) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) verifySignInfo.accountId) && Intrinsics.EZpvd((Object) this.address, (Object) verifySignInfo.address) && this.chainId == verifySignInfo.chainId && Intrinsics.EZpvd((Object) this.teeId, (Object) verifySignInfo.teeId) && Intrinsics.EZpvd((Object) this.signMsg, (Object) verifySignInfo.signMsg) && Intrinsics.EZpvd((Object) this.signature, (Object) verifySignInfo.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
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
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.accountId.hashCode() * 31) + this.address.hashCode()) * 31) + Long.hashCode(this.chainId)) * 31) + this.teeId.hashCode()) * 31) + this.signMsg.hashCode()) * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifySignInfo(accountId=" + this.accountId + ", address=" + this.address + ", chainId=" + this.chainId + ", teeId=" + this.teeId + ", signMsg=" + this.signMsg + ", signature=" + this.signature + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.address);
        parcel.writeLong(this.chainId);
        parcel.writeString(this.teeId);
        parcel.writeString(this.signMsg);
        parcel.writeString(this.signature);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.VerifySignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VerifySignInfo> serializer() {
            return VerifySignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VerifySignInfo(int i, String str, String str2, long j, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, VerifySignInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.address = "";
        } else {
            this.address = str2;
        }
        this.chainId = j;
        if ((i & 8) == 0) {
            this.teeId = "";
        } else {
            this.teeId = str3;
        }
        if ((i & 16) == 0) {
            this.signMsg = "";
        } else {
            this.signMsg = str4;
        }
        if ((i & 32) == 0) {
            this.signature = "";
        } else {
            this.signature = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(VerifySignInfo verifySignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) verifySignInfo.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, verifySignInfo.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) verifySignInfo.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, verifySignInfo.address);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 2, verifySignInfo.chainId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) verifySignInfo.teeId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, verifySignInfo.teeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) verifySignInfo.signMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, verifySignInfo.signMsg);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) verifySignInfo.signature, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, verifySignInfo.signature);
    }

    public VerifySignInfo(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.accountId = str;
        this.address = str2;
        this.chainId = j;
        this.teeId = str3;
        this.signMsg = str4;
        this.signature = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (r13v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:63) call: com.okinc.business.dex.tee.domain.model.VerifySignInfo.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ VerifySignInfo(String str, String str2, long j, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, j, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }
}
