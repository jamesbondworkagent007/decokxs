package com.okinc.assets.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TransferDetail implements Parcelable {
    public static final Parcelable.Creator<TransferDetail> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final boolean AhwBna;
    public final Target EZpvd;
    public final String KWHzl;
    public final Integer OLrzqt;
    public final String copydefault;
    public final Target gEmmrt;

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<TransferDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TransferDetail(parcel.readInt() == 0 ? null : Target.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Target.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferDetail[] newArray(int i) {
            return new TransferDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransferDetail() {
        this(null, null, null, null, false, false, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransferDetail copy$default(TransferDetail transferDetail, Target target, Target target2, Integer num, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            target = transferDetail.EZpvd;
        }
        if ((i & 2) != 0) {
            target2 = transferDetail.gEmmrt;
        }
        Target target3 = target2;
        if ((i & 4) != 0) {
            num = transferDetail.OLrzqt;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str = transferDetail.KWHzl;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            z = transferDetail.AEQbTJ;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = transferDetail.AhwBna;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            str2 = transferDetail.copydefault;
        }
        return transferDetail.AEQbTJ(target, target3, num2, str3, z3, z4, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferDetail AEQbTJ(Target target, Target target2, Integer num, String str, boolean z, boolean z2, String str2) {
        return new TransferDetail(target, target2, num, str, z, z2, str2);
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
        if (!(obj instanceof TransferDetail)) {
            return false;
        }
        TransferDetail transferDetail = (TransferDetail) obj;
        return Intrinsics.EZpvd(this.EZpvd, transferDetail.EZpvd) && Intrinsics.EZpvd(this.gEmmrt, transferDetail.gEmmrt) && Intrinsics.EZpvd(this.OLrzqt, transferDetail.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) transferDetail.KWHzl) && this.AEQbTJ == transferDetail.AEQbTJ && this.AhwBna == transferDetail.AhwBna && Intrinsics.EZpvd((Object) this.copydefault, (Object) transferDetail.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Target target = this.EZpvd;
        int iHashCode = target == null ? 0 : target.hashCode();
        Target target2 = this.gEmmrt;
        int iHashCode2 = target2 == null ? 0 : target2.hashCode();
        Integer num = this.OLrzqt;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str = this.KWHzl;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = Boolean.hashCode(this.AEQbTJ);
        int iHashCode6 = Boolean.hashCode(this.AhwBna);
        String str2 = this.copydefault;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferDetail(from=" + this.EZpvd + ", to=" + this.gEmmrt + ", currency=" + this.OLrzqt + ", amount=" + this.KWHzl + ", allowSubAccount=" + this.AEQbTJ + ", shouldNavigateBackOnSuccess=" + this.AhwBna + ", currencyCode=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Target target = this.EZpvd;
        if (target == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            target.writeToParcel(parcel, i);
        }
        Target target2 = this.gEmmrt;
        if (target2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            target2.writeToParcel(parcel, i);
        }
        Integer num = this.OLrzqt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeString(this.copydefault);
    }

    public TransferDetail(Target target, Target target2, Integer num, String str, boolean z, boolean z2, String str2) {
        this.EZpvd = target;
        this.gEmmrt = target2;
        this.OLrzqt = num;
        this.KWHzl = str;
        this.AEQbTJ = z;
        this.AhwBna = z2;
        this.copydefault = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:com.okinc.assets.api.model.TransferDetail$Target:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.api.model.TransferDetail$Target) : (r7v0 com.okinc.assets.api.model.TransferDetail$Target))
  (wrap:com.okinc.assets.api.model.TransferDetail$Target:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.api.model.TransferDetail$Target) : (r8v0 com.okinc.assets.api.model.TransferDetail$Target))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:boolean:0x0022: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
  (wrap:boolean:0x0028: TERNARY null = ((wrap:int:0x0023: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(com.okinc.assets.api.model.TransferDetail$Target, com.okinc.assets.api.model.TransferDetail$Target, java.lang.Integer, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:7) call: com.okinc.assets.api.model.TransferDetail.<init>(com.okinc.assets.api.model.TransferDetail$Target, com.okinc.assets.api.model.TransferDetail$Target, java.lang.Integer, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ TransferDetail(Target target, Target target2, Integer num, String str, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : target, (i & 2) != 0 ? null : target2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str2);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Target implements Parcelable {
        public static final Parcelable.Creator<Target> CREATOR = new Creator();
        public final Integer copydefault;

        public static final class Creator implements Parcelable.Creator<Target> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Target createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Target(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Target[] newArray(int i) {
                return new Target[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Target() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Target copy$default(Target target, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = target.copydefault;
            }
            return target.EZpvd(num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Target EZpvd(Integer num) {
            return new Target(num);
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
            return (obj instanceof Target) && Intrinsics.EZpvd(this.copydefault, ((Target) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.copydefault;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Target(target=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer num = this.copydefault;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
        }

        public Target(Integer num) {
            this.copydefault = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r1v0 java.lang.Integer))
 A[MD:(java.lang.Integer):void (m)] (LINE:17) call: com.okinc.assets.api.model.TransferDetail.Target.<init>(java.lang.Integer):void type: THIS */
        public /* synthetic */ Target(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }
    }
}
