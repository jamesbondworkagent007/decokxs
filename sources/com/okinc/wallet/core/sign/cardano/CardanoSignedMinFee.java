package com.okinc.wallet.core.sign.cardano;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C54907xZt;
import o.C56391yDq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class CardanoSignedMinFee implements Parcelable {
    private String change;
    private String fee;
    private Boolean valid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardanoSignedMinFee> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CardanoSignedMinFee> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardanoSignedMinFee createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CardanoSignedMinFee(boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardanoSignedMinFee[] newArray(int i) {
            return new CardanoSignedMinFee[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CardanoSignedMinFee() {
        this((Boolean) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CardanoSignedMinFee copy$default(CardanoSignedMinFee cardanoSignedMinFee, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = cardanoSignedMinFee.valid;
        }
        if ((i & 2) != 0) {
            str = cardanoSignedMinFee.fee;
        }
        if ((i & 4) != 0) {
            str2 = cardanoSignedMinFee.change;
        }
        return cardanoSignedMinFee.copy(bool, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.valid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardanoSignedMinFee copy(Boolean bool, String str, String str2) {
        return new CardanoSignedMinFee(bool, str, str2);
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
        if (!(obj instanceof CardanoSignedMinFee)) {
            return false;
        }
        CardanoSignedMinFee cardanoSignedMinFee = (CardanoSignedMinFee) obj;
        return Intrinsics.EZpvd(this.valid, cardanoSignedMinFee.valid) && Intrinsics.EZpvd((Object) this.fee, (Object) cardanoSignedMinFee.fee) && Intrinsics.EZpvd((Object) this.change, (Object) cardanoSignedMinFee.change);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getValid() {
        return this.valid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.valid;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.fee;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.change;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChange(String str) {
        this.change = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(String str) {
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValid(Boolean bool) {
        this.valid = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardanoSignedMinFee(valid=" + this.valid + ", fee=" + this.fee + ", change=" + this.change + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.valid;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.fee);
        parcel.writeString(this.change);
    }

    public /* synthetic */ CardanoSignedMinFee(int i, Boolean bool, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.valid = null;
        } else {
            this.valid = bool;
        }
        if ((i & 2) == 0) {
            this.fee = null;
        } else {
            this.fee = str;
        }
        if ((i & 4) == 0) {
            this.change = null;
        } else {
            this.change = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(CardanoSignedMinFee cardanoSignedMinFee, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cardanoSignedMinFee.valid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, cardanoSignedMinFee.valid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cardanoSignedMinFee.fee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, cardanoSignedMinFee.fee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && cardanoSignedMinFee.change == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cardanoSignedMinFee.change);
    }

    public CardanoSignedMinFee(Boolean bool, String str, String str2) {
        this.valid = bool;
        this.fee = str;
        this.change = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:56) call: com.okinc.wallet.core.sign.cardano.CardanoSignedMinFee.<init>(java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CardanoSignedMinFee(Boolean bool, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.cardano.CardanoSignedMinFee.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CardanoSignedMinFee> serializer() {
            return CardanoSignedMinFee$$serializer.INSTANCE;
        }

        public final CardanoSignedMinFee OLrzqt(@NotNull String str) {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((CardanoSignedMinFee) C54907xZt.OLrzqt(CardanoSignedMinFee.Companion.serializer(), str));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            CardanoSignedMinFee cardanoSignedMinFee = new CardanoSignedMinFee((Boolean) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = cardanoSignedMinFee;
            }
            return (CardanoSignedMinFee) objM7377constructorimpl;
        }
    }
}
