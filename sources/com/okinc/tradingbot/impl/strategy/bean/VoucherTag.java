package com.okinc.tradingbot.impl.strategy.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class VoucherTag implements Parcelable, Tag {
    public static final Parcelable.Creator<VoucherTag> CREATOR = new Creator();
    public final int AEQbTJ;
    public final int OLrzqt;
    public final String copydefault;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<VoucherTag> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherTag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VoucherTag(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherTag[] newArray(int i) {
            return new VoucherTag[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VoucherTag copy$default(VoucherTag voucherTag, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = voucherTag.copydefault;
        }
        if ((i3 & 2) != 0) {
            i = voucherTag.AEQbTJ;
        }
        if ((i3 & 4) != 0) {
            i2 = voucherTag.OLrzqt;
        }
        return voucherTag.OLrzqt(str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VoucherTag OLrzqt(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new VoucherTag(str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof VoucherTag)) {
            return false;
        }
        VoucherTag voucherTag = (VoucherTag) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) voucherTag.copydefault) && this.AEQbTJ == voucherTag.AEQbTJ && this.OLrzqt == voucherTag.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VoucherTag(tagTitle=" + this.copydefault + ", textColor=" + this.AEQbTJ + ", bgColor=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.AEQbTJ);
        parcel.writeInt(this.OLrzqt);
    }

    public VoucherTag(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.AEQbTJ = i;
        this.OLrzqt = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0006: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.Activity.ixgjPv int) STATIC call: o.mpX.copydefault(int):int A[MD:(int):int (m), WRAPPED] (LINE:64)) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0010: INVOKE (wrap:int:0x000e: SGET  A[WRAPPED] o.wXj.Activity.fkESqH int) STATIC call: o.mpX.copydefault(int):int A[MD:(int):int (m), WRAPPED] (LINE:65)) : (r3v0 int))
 A[MD:(java.lang.String, int, int):void (m)] (LINE:62) call: com.okinc.tradingbot.impl.strategy.bean.VoucherTag.<init>(java.lang.String, int, int):void type: THIS */
    public /* synthetic */ VoucherTag(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? C33070mpX.copydefault(C52761wXj.Activity.ixgjPv) : i, (i3 & 4) != 0 ? C33070mpX.copydefault(C52761wXj.Activity.fkESqH) : i2);
    }
}
