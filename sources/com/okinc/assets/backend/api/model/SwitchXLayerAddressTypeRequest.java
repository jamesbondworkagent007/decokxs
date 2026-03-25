package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class SwitchXLayerAddressTypeRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SwitchXLayerAddressTypeRequest> CREATOR = new Creator();
    private final Integer addrType;
    private final Integer currencyId;
    private final Integer subCurrencyId;

    public static final class Creator implements Parcelable.Creator<SwitchXLayerAddressTypeRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwitchXLayerAddressTypeRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SwitchXLayerAddressTypeRequest(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwitchXLayerAddressTypeRequest[] newArray(int i) {
            return new SwitchXLayerAddressTypeRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SwitchXLayerAddressTypeRequest copy$default(SwitchXLayerAddressTypeRequest switchXLayerAddressTypeRequest, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = switchXLayerAddressTypeRequest.addrType;
        }
        if ((i & 2) != 0) {
            num2 = switchXLayerAddressTypeRequest.currencyId;
        }
        if ((i & 4) != 0) {
            num3 = switchXLayerAddressTypeRequest.subCurrencyId;
        }
        return switchXLayerAddressTypeRequest.copy(num, num2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.addrType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwitchXLayerAddressTypeRequest copy(Integer num, Integer num2, Integer num3) {
        return new SwitchXLayerAddressTypeRequest(num, num2, num3);
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
        if (!(obj instanceof SwitchXLayerAddressTypeRequest)) {
            return false;
        }
        SwitchXLayerAddressTypeRequest switchXLayerAddressTypeRequest = (SwitchXLayerAddressTypeRequest) obj;
        return Intrinsics.EZpvd(this.addrType, switchXLayerAddressTypeRequest.addrType) && Intrinsics.EZpvd(this.currencyId, switchXLayerAddressTypeRequest.currencyId) && Intrinsics.EZpvd(this.subCurrencyId, switchXLayerAddressTypeRequest.subCurrencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddrType() {
        return this.addrType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.addrType;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.currencyId;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.subCurrencyId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwitchXLayerAddressTypeRequest(addrType=" + this.addrType + ", currencyId=" + this.currencyId + ", subCurrencyId=" + this.subCurrencyId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.addrType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.currencyId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.subCurrencyId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public SwitchXLayerAddressTypeRequest(Integer num, Integer num2, Integer num3) {
        this.addrType = num;
        this.currencyId = num2;
        this.subCurrencyId = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 java.lang.Integer))
  (r2v0 java.lang.Integer)
  (r3v0 java.lang.Integer)
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:11) call: com.okinc.assets.backend.api.model.SwitchXLayerAddressTypeRequest.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ SwitchXLayerAddressTypeRequest(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, num2, num3);
    }
}
