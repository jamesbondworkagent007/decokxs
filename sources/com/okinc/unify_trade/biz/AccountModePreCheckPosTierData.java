package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class AccountModePreCheckPosTierData implements Parcelable {
    public static final int $stable = 0;
    private final String instFamily;
    private final String instType;
    private final String lever;
    private final String maxSz;
    private final String pos;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AccountModePreCheckPosTierData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AccountModePreCheckPosTierData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountModePreCheckPosTierData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AccountModePreCheckPosTierData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountModePreCheckPosTierData[] newArray(int i) {
            return new AccountModePreCheckPosTierData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountModePreCheckPosTierData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountModePreCheckPosTierData copy$default(AccountModePreCheckPosTierData accountModePreCheckPosTierData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountModePreCheckPosTierData.instFamily;
        }
        if ((i & 2) != 0) {
            str2 = accountModePreCheckPosTierData.instType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = accountModePreCheckPosTierData.pos;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = accountModePreCheckPosTierData.lever;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = accountModePreCheckPosTierData.maxSz;
        }
        return accountModePreCheckPosTierData.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountModePreCheckPosTierData copy(String str, String str2, String str3, String str4, String str5) {
        return new AccountModePreCheckPosTierData(str, str2, str3, str4, str5);
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
        if (!(obj instanceof AccountModePreCheckPosTierData)) {
            return false;
        }
        AccountModePreCheckPosTierData accountModePreCheckPosTierData = (AccountModePreCheckPosTierData) obj;
        return Intrinsics.EZpvd((Object) this.instFamily, (Object) accountModePreCheckPosTierData.instFamily) && Intrinsics.EZpvd((Object) this.instType, (Object) accountModePreCheckPosTierData.instType) && Intrinsics.EZpvd((Object) this.pos, (Object) accountModePreCheckPosTierData.pos) && Intrinsics.EZpvd((Object) this.lever, (Object) accountModePreCheckPosTierData.lever) && Intrinsics.EZpvd((Object) this.maxSz, (Object) accountModePreCheckPosTierData.maxSz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSz() {
        return this.maxSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPos() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instFamily;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.instType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pos;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lever;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.maxSz;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountModePreCheckPosTierData(instFamily=" + this.instFamily + ", instType=" + this.instType + ", pos=" + this.pos + ", lever=" + this.lever + ", maxSz=" + this.maxSz + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instFamily);
        parcel.writeString(this.instType);
        parcel.writeString(this.pos);
        parcel.writeString(this.lever);
        parcel.writeString(this.maxSz);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AccountModePreCheckPosTierData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountModePreCheckPosTierData> serializer() {
            return AccountModePreCheckPosTierData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountModePreCheckPosTierData(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str;
        }
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.pos = "";
        } else {
            this.pos = str3;
        }
        if ((i & 8) == 0) {
            this.lever = "";
        } else {
            this.lever = str4;
        }
        if ((i & 16) == 0) {
            this.maxSz = "";
        } else {
            this.maxSz = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountModePreCheckPosTierData accountModePreCheckPosTierData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountModePreCheckPosTierData.instFamily, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, accountModePreCheckPosTierData.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountModePreCheckPosTierData.instType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, accountModePreCheckPosTierData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountModePreCheckPosTierData.pos, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, accountModePreCheckPosTierData.pos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountModePreCheckPosTierData.lever, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, accountModePreCheckPosTierData.lever);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) accountModePreCheckPosTierData.maxSz, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, accountModePreCheckPosTierData.maxSz);
    }

    public AccountModePreCheckPosTierData(String str, String str2, String str3, String str4, String str5) {
        this.instFamily = str;
        this.instType = str2;
        this.pos = str3;
        this.lever = str4;
        this.maxSz = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4795) call: com.okinc.unify_trade.biz.AccountModePreCheckPosTierData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountModePreCheckPosTierData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
