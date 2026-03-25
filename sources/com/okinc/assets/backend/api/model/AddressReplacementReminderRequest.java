package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class AddressReplacementReminderRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AddressReplacementReminderRequest> CREATOR = new Creator();
    private final Integer subCurrencyId;
    private final Boolean xAddrEnabled;

    public static final class Creator implements Parcelable.Creator<AddressReplacementReminderRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressReplacementReminderRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AddressReplacementReminderRequest(numValueOf, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressReplacementReminderRequest[] newArray(int i) {
            return new AddressReplacementReminderRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressReplacementReminderRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressReplacementReminderRequest copy$default(AddressReplacementReminderRequest addressReplacementReminderRequest, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = addressReplacementReminderRequest.subCurrencyId;
        }
        if ((i & 2) != 0) {
            bool = addressReplacementReminderRequest.xAddrEnabled;
        }
        return addressReplacementReminderRequest.copy(num, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.xAddrEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressReplacementReminderRequest copy(Integer num, Boolean bool) {
        return new AddressReplacementReminderRequest(num, bool);
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
        if (!(obj instanceof AddressReplacementReminderRequest)) {
            return false;
        }
        AddressReplacementReminderRequest addressReplacementReminderRequest = (AddressReplacementReminderRequest) obj;
        return Intrinsics.EZpvd(this.subCurrencyId, addressReplacementReminderRequest.subCurrencyId) && Intrinsics.EZpvd(this.xAddrEnabled, addressReplacementReminderRequest.xAddrEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getXAddrEnabled() {
        return this.xAddrEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.subCurrencyId;
        int iHashCode = num == null ? 0 : num.hashCode();
        Boolean bool = this.xAddrEnabled;
        return (iHashCode * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressReplacementReminderRequest(subCurrencyId=" + this.subCurrencyId + ", xAddrEnabled=" + this.xAddrEnabled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.subCurrencyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.xAddrEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public AddressReplacementReminderRequest(Integer num, Boolean bool) {
        this.subCurrencyId = num;
        this.xAddrEnabled = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r1v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0009: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r2v0 java.lang.Boolean))
 A[MD:(java.lang.Integer, java.lang.Boolean):void (m)] (LINE:12) call: com.okinc.assets.backend.api.model.AddressReplacementReminderRequest.<init>(java.lang.Integer, java.lang.Boolean):void type: THIS */
    public /* synthetic */ AddressReplacementReminderRequest(Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? Boolean.TRUE : bool);
    }
}
