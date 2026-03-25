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
public final class AccountModePreCheckPosData implements Parcelable {
    public static final int $stable = 0;
    private final String lever;
    private final String maxLever;
    private final String posId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AccountModePreCheckPosData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AccountModePreCheckPosData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountModePreCheckPosData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AccountModePreCheckPosData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountModePreCheckPosData[] newArray(int i) {
            return new AccountModePreCheckPosData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountModePreCheckPosData() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountModePreCheckPosData copy$default(AccountModePreCheckPosData accountModePreCheckPosData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountModePreCheckPosData.posId;
        }
        if ((i & 2) != 0) {
            str2 = accountModePreCheckPosData.lever;
        }
        if ((i & 4) != 0) {
            str3 = accountModePreCheckPosData.maxLever;
        }
        return accountModePreCheckPosData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.posId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountModePreCheckPosData copy(String str, String str2, String str3) {
        return new AccountModePreCheckPosData(str, str2, str3);
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
        if (!(obj instanceof AccountModePreCheckPosData)) {
            return false;
        }
        AccountModePreCheckPosData accountModePreCheckPosData = (AccountModePreCheckPosData) obj;
        return Intrinsics.EZpvd((Object) this.posId, (Object) accountModePreCheckPosData.posId) && Intrinsics.EZpvd((Object) this.lever, (Object) accountModePreCheckPosData.lever) && Intrinsics.EZpvd((Object) this.maxLever, (Object) accountModePreCheckPosData.maxLever);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLever() {
        return this.maxLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosId() {
        return this.posId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.posId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.lever;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxLever;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountModePreCheckPosData(posId=" + this.posId + ", lever=" + this.lever + ", maxLever=" + this.maxLever + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.posId);
        parcel.writeString(this.lever);
        parcel.writeString(this.maxLever);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AccountModePreCheckPosData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountModePreCheckPosData> serializer() {
            return AccountModePreCheckPosData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountModePreCheckPosData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.posId = null;
        } else {
            this.posId = str;
        }
        if ((i & 2) == 0) {
            this.lever = null;
        } else {
            this.lever = str2;
        }
        if ((i & 4) == 0) {
            this.maxLever = null;
        } else {
            this.maxLever = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountModePreCheckPosData accountModePreCheckPosData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || accountModePreCheckPosData.posId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, accountModePreCheckPosData.posId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || accountModePreCheckPosData.lever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, accountModePreCheckPosData.lever);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && accountModePreCheckPosData.maxLever == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, accountModePreCheckPosData.maxLever);
    }

    public AccountModePreCheckPosData(String str, String str2, String str3) {
        this.posId = str;
        this.lever = str2;
        this.maxLever = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4720) call: com.okinc.unify_trade.biz.AccountModePreCheckPosData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountModePreCheckPosData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
