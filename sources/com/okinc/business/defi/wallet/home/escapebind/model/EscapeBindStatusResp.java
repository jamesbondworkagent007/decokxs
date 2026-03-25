package com.okinc.business.defi.wallet.home.escapebind.model;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class EscapeBindStatusResp implements Parcelable {
    public static final int $stable = 0;
    private final String accountId;
    private final Boolean isBind;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EscapeBindStatusResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EscapeBindStatusResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeBindStatusResp createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EscapeBindStatusResp(string, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeBindStatusResp[] newArray(int i) {
            return new EscapeBindStatusResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EscapeBindStatusResp() {
        this((String) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapeBindStatusResp copy$default(EscapeBindStatusResp escapeBindStatusResp, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = escapeBindStatusResp.accountId;
        }
        if ((i & 2) != 0) {
            bool = escapeBindStatusResp.isBind;
        }
        return escapeBindStatusResp.copy(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isBind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeBindStatusResp copy(String str, Boolean bool) {
        return new EscapeBindStatusResp(str, bool);
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
        if (!(obj instanceof EscapeBindStatusResp)) {
            return false;
        }
        EscapeBindStatusResp escapeBindStatusResp = (EscapeBindStatusResp) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) escapeBindStatusResp.accountId) && Intrinsics.EZpvd(this.isBind, escapeBindStatusResp.isBind);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accountId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.isBind;
        return (iHashCode * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBind() {
        return this.isBind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeBindStatusResp(accountId=" + this.accountId + ", isBind=" + this.isBind + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        Boolean bool = this.isBind;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindStatusResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapeBindStatusResp> serializer() {
            return EscapeBindStatusResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapeBindStatusResp(int i, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountId = null;
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.isBind = null;
        } else {
            this.isBind = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EscapeBindStatusResp escapeBindStatusResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || escapeBindStatusResp.accountId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, escapeBindStatusResp.accountId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && escapeBindStatusResp.isBind == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, escapeBindStatusResp.isBind);
    }

    public EscapeBindStatusResp(String str, Boolean bool) {
        this.accountId = str;
        this.isBind = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Boolean):void (m)] (LINE:11) call: com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindStatusResp.<init>(java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ EscapeBindStatusResp(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }
}
