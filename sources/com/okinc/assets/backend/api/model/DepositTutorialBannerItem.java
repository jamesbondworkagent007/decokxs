package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class DepositTutorialBannerItem implements Parcelable {
    public static final Parcelable.Creator<DepositTutorialBannerItem> CREATOR = new Creator();
    public String EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public Integer copydefault;

    public static final class Creator implements Parcelable.Creator<DepositTutorialBannerItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositTutorialBannerItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DepositTutorialBannerItem(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositTutorialBannerItem[] newArray(int i) {
            return new DepositTutorialBannerItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DepositTutorialBannerItem() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DepositTutorialBannerItem copy$default(DepositTutorialBannerItem depositTutorialBannerItem, String str, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositTutorialBannerItem.KWHzl;
        }
        if ((i & 2) != 0) {
            num = depositTutorialBannerItem.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = depositTutorialBannerItem.OLrzqt;
        }
        if ((i & 8) != 0) {
            str3 = depositTutorialBannerItem.EZpvd;
        }
        return depositTutorialBannerItem.EZpvd(str, num, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositTutorialBannerItem EZpvd(@NotNull String str, Integer num, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DepositTutorialBannerItem(str, num, str2, str3);
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
        if (!(obj instanceof DepositTutorialBannerItem)) {
            return false;
        }
        DepositTutorialBannerItem depositTutorialBannerItem = (DepositTutorialBannerItem) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) depositTutorialBannerItem.KWHzl) && Intrinsics.EZpvd(this.copydefault, depositTutorialBannerItem.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) depositTutorialBannerItem.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) depositTutorialBannerItem.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        Integer num = this.copydefault;
        return (((((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositTutorialBannerItem(eventTrackingId=" + this.KWHzl + ", icon=" + this.copydefault + ", title=" + this.OLrzqt + ", faqUrl=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        Integer num = this.copydefault;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
    }

    public DepositTutorialBannerItem(@NotNull String str, Integer num, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = str;
        this.copydefault = num;
        this.OLrzqt = str2;
        this.EZpvd = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.assets.backend.api.model.DepositTutorialBannerItem.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DepositTutorialBannerItem(String str, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
