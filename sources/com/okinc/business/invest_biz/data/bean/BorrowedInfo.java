package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class BorrowedInfo implements Parcelable {
    public static final int $stable = 0;
    private final String coinAmount;
    private final String coinAmountAfterInput;
    private final String tokenLogo;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BorrowedInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BorrowedInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BorrowedInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BorrowedInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BorrowedInfo[] newArray(int i) {
            return new BorrowedInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BorrowedInfo copy$default(BorrowedInfo borrowedInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = borrowedInfo.coinAmount;
        }
        if ((i & 2) != 0) {
            str2 = borrowedInfo.coinAmountAfterInput;
        }
        if ((i & 4) != 0) {
            str3 = borrowedInfo.tokenSymbol;
        }
        if ((i & 8) != 0) {
            str4 = borrowedInfo.tokenLogo;
        }
        return borrowedInfo.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinAmountAfterInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BorrowedInfo copy(@NotNull String str, String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BorrowedInfo(str, str2, str3, str4);
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
        if (!(obj instanceof BorrowedInfo)) {
            return false;
        }
        BorrowedInfo borrowedInfo = (BorrowedInfo) obj;
        return Intrinsics.EZpvd((Object) this.coinAmount, (Object) borrowedInfo.coinAmount) && Intrinsics.EZpvd((Object) this.coinAmountAfterInput, (Object) borrowedInfo.coinAmountAfterInput) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) borrowedInfo.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) borrowedInfo.tokenLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmountAfterInput() {
        return this.coinAmountAfterInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.coinAmount.hashCode();
        String str = this.coinAmountAfterInput;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.tokenSymbol.hashCode();
        String str2 = this.tokenLogo;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BorrowedInfo(coinAmount=" + this.coinAmount + ", coinAmountAfterInput=" + this.coinAmountAfterInput + ", tokenSymbol=" + this.tokenSymbol + ", tokenLogo=" + this.tokenLogo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.coinAmountAfterInput);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenLogo);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.BorrowedInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BorrowedInfo> serializer() {
            return BorrowedInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BorrowedInfo(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, BorrowedInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.coinAmount = str;
        if ((i & 2) == 0) {
            this.coinAmountAfterInput = null;
        } else {
            this.coinAmountAfterInput = str2;
        }
        this.tokenSymbol = str3;
        if ((i & 8) == 0) {
            this.tokenLogo = null;
        } else {
            this.tokenLogo = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(BorrowedInfo borrowedInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, borrowedInfo.coinAmount);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || borrowedInfo.coinAmountAfterInput != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, borrowedInfo.coinAmountAfterInput);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, borrowedInfo.tokenSymbol);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && borrowedInfo.tokenLogo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, borrowedInfo.tokenLogo);
    }

    public BorrowedInfo(@NotNull String str, String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.coinAmount = str;
        this.coinAmountAfterInput = str2;
        this.tokenSymbol = str3;
        this.tokenLogo = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (r4v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:424) call: com.okinc.business.invest_biz.data.bean.BorrowedInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BorrowedInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4);
    }
}
