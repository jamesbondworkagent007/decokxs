package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class PayOptionModel extends PayMethodOptionModel {
    public static final Parcelable.Creator<PayOptionModel> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final PayTokenModel KWHzl;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<PayOptionModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayOptionModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PayOptionModel(parcel.readInt() == 0 ? null : PayTokenModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayOptionModel[] newArray(int i) {
            return new PayOptionModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PayOptionModel() {
        this(null, false, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PayOptionModel copy$default(PayOptionModel payOptionModel, PayTokenModel payTokenModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            payTokenModel = payOptionModel.KWHzl;
        }
        if ((i & 2) != 0) {
            z = payOptionModel.EZpvd;
        }
        if ((i & 4) != 0) {
            z2 = payOptionModel.AEQbTJ;
        }
        return payOptionModel.copydefault(payTokenModel, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayOptionModel copydefault(PayTokenModel payTokenModel, boolean z, boolean z2) {
        return new PayOptionModel(payTokenModel, z, z2);
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
        if (!(obj instanceof PayOptionModel)) {
            return false;
        }
        PayOptionModel payOptionModel = (PayOptionModel) obj;
        return Intrinsics.EZpvd(this.KWHzl, payOptionModel.KWHzl) && this.EZpvd == payOptionModel.EZpvd && this.AEQbTJ == payOptionModel.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PayTokenModel payTokenModel = this.KWHzl;
        return ((((payTokenModel == null ? 0 : payTokenModel.hashCode()) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PayOptionModel(payTokenModel=" + this.KWHzl + ", backToHome=" + this.EZpvd + ", isDisabled=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        PayTokenModel payTokenModel = this.KWHzl;
        if (payTokenModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            payTokenModel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.business.web3pay.api.model.PayOptionModel$PayTokenModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.api.model.PayOptionModel$PayTokenModel) : (r2v0 com.okinc.business.web3pay.api.model.PayOptionModel$PayTokenModel))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(com.okinc.business.web3pay.api.model.PayOptionModel$PayTokenModel, boolean, boolean):void (m)] (LINE:16) call: com.okinc.business.web3pay.api.model.PayOptionModel.<init>(com.okinc.business.web3pay.api.model.PayOptionModel$PayTokenModel, boolean, boolean):void type: THIS */
    public /* synthetic */ PayOptionModel(PayTokenModel payTokenModel, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : payTokenModel, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public PayOptionModel(PayTokenModel payTokenModel, boolean z, boolean z2) {
        super(null);
        this.KWHzl = payTokenModel;
        this.EZpvd = z;
        this.AEQbTJ = z2;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class PayTokenModel implements Parcelable {
        public static final Parcelable.Creator<PayTokenModel> CREATOR = new Creator();
        public final String EZpvd;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<PayTokenModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PayTokenModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PayTokenModel(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PayTokenModel[] newArray(int i) {
                return new PayTokenModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PayTokenModel copy$default(PayTokenModel payTokenModel, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payTokenModel.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = payTokenModel.EZpvd;
            }
            return payTokenModel.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PayTokenModel KWHzl(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new PayTokenModel(str, str2);
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
            if (!(obj instanceof PayTokenModel)) {
                return false;
            }
            PayTokenModel payTokenModel = (PayTokenModel) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) payTokenModel.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) payTokenModel.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PayTokenModel(chainIndex=" + this.copydefault + ", tokenTypeNo=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeString(this.EZpvd);
        }

        public PayTokenModel(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.EZpvd = str2;
        }
    }
}
