package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class OnchainSendOptionModel extends PayMethodOptionModel {
    public static final Parcelable.Creator<OnchainSendOptionModel> CREATOR = new Creator();
    public final OnChainTokenModel AEQbTJ;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<OnchainSendOptionModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnchainSendOptionModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OnchainSendOptionModel(parcel.readInt() == 0 ? null : OnChainTokenModel.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnchainSendOptionModel[] newArray(int i) {
            return new OnchainSendOptionModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OnchainSendOptionModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        OnChainTokenModel onChainTokenModel = this.AEQbTJ;
        if (onChainTokenModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onChainTokenModel.writeToParcel(parcel, i);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.web3pay.api.model.OnchainSendOptionModel$OnChainTokenModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.api.model.OnchainSendOptionModel$OnChainTokenModel) : (r1v0 com.okinc.business.web3pay.api.model.OnchainSendOptionModel$OnChainTokenModel))
 A[MD:(com.okinc.business.web3pay.api.model.OnchainSendOptionModel$OnChainTokenModel):void (m)] (LINE:33) call: com.okinc.business.web3pay.api.model.OnchainSendOptionModel.<init>(com.okinc.business.web3pay.api.model.OnchainSendOptionModel$OnChainTokenModel):void type: THIS */
    public /* synthetic */ OnchainSendOptionModel(OnChainTokenModel onChainTokenModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : onChainTokenModel);
    }

    public OnchainSendOptionModel(OnChainTokenModel onChainTokenModel) {
        super(null);
        this.AEQbTJ = onChainTokenModel;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class OnChainTokenModel implements Parcelable {
        public static final Parcelable.Creator<OnChainTokenModel> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public final String valueOf;

        public static final class Creator implements Parcelable.Creator<OnChainTokenModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OnChainTokenModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new OnChainTokenModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OnChainTokenModel[] newArray(int i) {
                return new OnChainTokenModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OnChainTokenModel copy$default(OnChainTokenModel onChainTokenModel, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onChainTokenModel.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = onChainTokenModel.valueOf;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = onChainTokenModel.OLrzqt;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = onChainTokenModel.KWHzl;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = onChainTokenModel.EZpvd;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = onChainTokenModel.AEQbTJ;
            }
            return onChainTokenModel.AEQbTJ(str, str7, str8, str9, str10, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnChainTokenModel AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new OnChainTokenModel(str, str2, str3, str4, str5, str6);
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
            if (!(obj instanceof OnChainTokenModel)) {
                return false;
            }
            OnChainTokenModel onChainTokenModel = (OnChainTokenModel) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) onChainTokenModel.copydefault) && Intrinsics.EZpvd((Object) this.valueOf, (Object) onChainTokenModel.valueOf) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) onChainTokenModel.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) onChainTokenModel.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) onChainTokenModel.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) onChainTokenModel.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.copydefault.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OnChainTokenModel(tokenCoinTypeNo=" + this.copydefault + ", tokenSymbol=" + this.valueOf + ", tokenLogo=" + this.OLrzqt + ", chainIndex=" + this.KWHzl + ", chainName=" + this.EZpvd + ", chainLogo=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeString(this.valueOf);
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.AEQbTJ);
        }

        public OnChainTokenModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.copydefault = str;
            this.valueOf = str2;
            this.OLrzqt = str3;
            this.KWHzl = str4;
            this.EZpvd = str5;
            this.AEQbTJ = str6;
        }
    }
}
