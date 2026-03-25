package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class TransferOptionModel extends PayMethodOptionModel {
    public static final Parcelable.Creator<TransferOptionModel> CREATOR = new Creator();
    public final List<TransferTokenModel> EZpvd;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<TransferOptionModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferOptionModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(TransferTokenModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new TransferOptionModel(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferOptionModel[] newArray(int i) {
            return new TransferOptionModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransferOptionModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.api.model.TransferOptionModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferOptionModel copy$default(TransferOptionModel transferOptionModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transferOptionModel.EZpvd;
        }
        return transferOptionModel.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferOptionModel copydefault(List<TransferTokenModel> list) {
        return new TransferOptionModel(list);
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
        return (obj instanceof TransferOptionModel) && Intrinsics.EZpvd(this.EZpvd, ((TransferOptionModel) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<TransferTokenModel> list = this.EZpvd;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferOptionModel(tokenModelList=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<TransferTokenModel> list = this.EZpvd;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<TransferTokenModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.web3pay.api.model.TransferOptionModel$TransferTokenModel>):void (m)] (LINE:54) call: com.okinc.business.web3pay.api.model.TransferOptionModel.<init>(java.util.List):void type: THIS */
    public /* synthetic */ TransferOptionModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public TransferOptionModel(List<TransferTokenModel> list) {
        super(null);
        this.EZpvd = list;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class TransferTokenModel implements Parcelable {
        public static final Parcelable.Creator<TransferTokenModel> CREATOR = new Creator();
        public final String AEQbTJ;
        public final boolean KWHzl;

        public static final class Creator implements Parcelable.Creator<TransferTokenModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransferTokenModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TransferTokenModel(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransferTokenModel[] newArray(int i) {
                return new TransferTokenModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TransferTokenModel copy$default(TransferTokenModel transferTokenModel, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transferTokenModel.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = transferTokenModel.KWHzl;
            }
            return transferTokenModel.OLrzqt(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransferTokenModel OLrzqt(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TransferTokenModel(str, z);
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
            if (!(obj instanceof TransferTokenModel)) {
                return false;
            }
            TransferTokenModel transferTokenModel = (TransferTokenModel) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) transferTokenModel.AEQbTJ) && this.KWHzl == transferTokenModel.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TransferTokenModel(tokenTypeNo=" + this.AEQbTJ + ", pay=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            parcel.writeInt(this.KWHzl ? 1 : 0);
        }

        public TransferTokenModel(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.KWHzl = z;
        }
    }
}
