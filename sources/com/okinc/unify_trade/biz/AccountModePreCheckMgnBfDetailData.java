package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class AccountModePreCheckMgnBfDetailData implements Parcelable {
    public static final int $stable = 0;
    private final String acctAdjEq;
    private final String availEq;
    private final String ccy;
    private final String mgnRatio;
    private final Boolean redCol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AccountModePreCheckMgnBfDetailData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AccountModePreCheckMgnBfDetailData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountModePreCheckMgnBfDetailData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountModePreCheckMgnBfDetailData(string, string2, string3, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountModePreCheckMgnBfDetailData[] newArray(int i) {
            return new AccountModePreCheckMgnBfDetailData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountModePreCheckMgnBfDetailData() {
        this((String) null, (String) null, (String) null, (Boolean) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountModePreCheckMgnBfDetailData copy$default(AccountModePreCheckMgnBfDetailData accountModePreCheckMgnBfDetailData, String str, String str2, String str3, Boolean bool, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountModePreCheckMgnBfDetailData.ccy;
        }
        if ((i & 2) != 0) {
            str2 = accountModePreCheckMgnBfDetailData.availEq;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = accountModePreCheckMgnBfDetailData.mgnRatio;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            bool = accountModePreCheckMgnBfDetailData.redCol;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            str4 = accountModePreCheckMgnBfDetailData.acctAdjEq;
        }
        return accountModePreCheckMgnBfDetailData.copy(str, str5, str6, bool2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.redCol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.acctAdjEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountModePreCheckMgnBfDetailData copy(String str, String str2, String str3, Boolean bool, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str4, "");
        return new AccountModePreCheckMgnBfDetailData(str, str2, str3, bool, str4);
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
        if (!(obj instanceof AccountModePreCheckMgnBfDetailData)) {
            return false;
        }
        AccountModePreCheckMgnBfDetailData accountModePreCheckMgnBfDetailData = (AccountModePreCheckMgnBfDetailData) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) accountModePreCheckMgnBfDetailData.ccy) && Intrinsics.EZpvd((Object) this.availEq, (Object) accountModePreCheckMgnBfDetailData.availEq) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) accountModePreCheckMgnBfDetailData.mgnRatio) && Intrinsics.EZpvd(this.redCol, accountModePreCheckMgnBfDetailData.redCol) && Intrinsics.EZpvd((Object) this.acctAdjEq, (Object) accountModePreCheckMgnBfDetailData.acctAdjEq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctAdjEq() {
        return this.acctAdjEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailEq() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRedCol() {
        return this.redCol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.ccy;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.availEq;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.mgnRatio;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.redCol;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.acctAdjEq.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountModePreCheckMgnBfDetailData(ccy=" + this.ccy + ", availEq=" + this.availEq + ", mgnRatio=" + this.mgnRatio + ", redCol=" + this.redCol + ", acctAdjEq=" + this.acctAdjEq + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ccy);
        parcel.writeString(this.availEq);
        parcel.writeString(this.mgnRatio);
        Boolean bool = this.redCol;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.acctAdjEq);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AccountModePreCheckMgnBfDetailData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountModePreCheckMgnBfDetailData> serializer() {
            return AccountModePreCheckMgnBfDetailData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountModePreCheckMgnBfDetailData(int i, String str, String str2, String str3, Boolean bool, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.availEq = "";
        } else {
            this.availEq = str2;
        }
        if ((i & 4) == 0) {
            this.mgnRatio = "";
        } else {
            this.mgnRatio = str3;
        }
        if ((i & 8) == 0) {
            this.redCol = Boolean.FALSE;
        } else {
            this.redCol = bool;
        }
        if ((i & 16) == 0) {
            this.acctAdjEq = "";
        } else {
            this.acctAdjEq = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountModePreCheckMgnBfDetailData accountModePreCheckMgnBfDetailData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountModePreCheckMgnBfDetailData.ccy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, accountModePreCheckMgnBfDetailData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountModePreCheckMgnBfDetailData.availEq, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, accountModePreCheckMgnBfDetailData.availEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountModePreCheckMgnBfDetailData.mgnRatio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, accountModePreCheckMgnBfDetailData.mgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(accountModePreCheckMgnBfDetailData.redCol, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, accountModePreCheckMgnBfDetailData.redCol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) accountModePreCheckMgnBfDetailData.acctAdjEq, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, accountModePreCheckMgnBfDetailData.acctAdjEq);
    }

    public AccountModePreCheckMgnBfDetailData(String str, String str2, String str3, Boolean bool, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str4, "");
        this.ccy = str;
        this.availEq = str2;
        this.mgnRatio = str3;
        this.redCol = bool;
        this.acctAdjEq = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.Boolean:0x001d: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x001b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:4816) call: com.okinc.unify_trade.biz.AccountModePreCheckMgnBfDetailData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ AccountModePreCheckMgnBfDetailData(String str, String str2, String str3, Boolean bool, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? "" : str4);
    }
}
