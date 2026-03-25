package com.okinc.business.dex.trade.core.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class AccountInfo implements Parcelable {
    public static final int $stable = 0;
    public static final int ACCOUNT_BIZ_LINE_EOA = 2;
    public static final int ACCOUNT_BIZ_LINE_TEE_SA = 1;
    private final Integer accountBizLine;
    private final String accountId;
    private final String teeId;
    private final Boolean teeSilentSignEnabled;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AccountInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AccountInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountInfo(string, numValueOf, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountInfo[] newArray(int i) {
            return new AccountInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountInfo copy$default(AccountInfo accountInfo, String str, Integer num, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountInfo.teeId;
        }
        if ((i & 2) != 0) {
            num = accountInfo.accountBizLine;
        }
        if ((i & 4) != 0) {
            bool = accountInfo.teeSilentSignEnabled;
        }
        if ((i & 8) != 0) {
            str2 = accountInfo.accountId;
        }
        return accountInfo.copy(str, num, bool, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.accountBizLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.teeSilentSignEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo copy(String str, Integer num, Boolean bool, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new AccountInfo(str, num, bool, str2);
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
        if (!(obj instanceof AccountInfo)) {
            return false;
        }
        AccountInfo accountInfo = (AccountInfo) obj;
        return Intrinsics.EZpvd((Object) this.teeId, (Object) accountInfo.teeId) && Intrinsics.EZpvd(this.accountBizLine, accountInfo.accountBizLine) && Intrinsics.EZpvd(this.teeSilentSignEnabled, accountInfo.teeSilentSignEnabled) && Intrinsics.EZpvd((Object) this.accountId, (Object) accountInfo.accountId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAccountBizLine() {
        return this.accountBizLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getTeeSilentSignEnabled() {
        return this.teeSilentSignEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.teeId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.accountBizLine;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Boolean bool = this.teeSilentSignEnabled;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.accountId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountInfo(teeId=" + this.teeId + ", accountBizLine=" + this.accountBizLine + ", teeSilentSignEnabled=" + this.teeSilentSignEnabled + ", accountId=" + this.accountId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.teeId);
        Integer num = this.accountBizLine;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.teeSilentSignEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.accountId);
    }

    public /* synthetic */ AccountInfo(int i, String str, Integer num, Boolean bool, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, AccountInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.teeId = null;
        } else {
            this.teeId = str;
        }
        if ((i & 2) == 0) {
            this.accountBizLine = null;
        } else {
            this.accountBizLine = num;
        }
        if ((i & 4) == 0) {
            this.teeSilentSignEnabled = null;
        } else {
            this.teeSilentSignEnabled = bool;
        }
        this.accountId = str2;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(AccountInfo accountInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || accountInfo.teeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, accountInfo.teeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || accountInfo.accountBizLine != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, accountInfo.accountBizLine);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || accountInfo.teeSilentSignEnabled != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, accountInfo.teeSilentSignEnabled);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, accountInfo.accountId);
    }

    public AccountInfo(String str, Integer num, Boolean bool, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.teeId = str;
        this.accountBizLine = num;
        this.teeSilentSignEnabled = bool;
        this.accountId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (r5v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String):void (m)] (LINE:104) call: com.okinc.business.dex.trade.core.domain.model.common.AccountInfo.<init>(java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ AccountInfo(String str, Integer num, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, str2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.common.AccountInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountInfo> serializer() {
            return AccountInfo$$serializer.INSTANCE;
        }
    }
}
