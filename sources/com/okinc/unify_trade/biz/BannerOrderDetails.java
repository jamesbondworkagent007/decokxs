package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BannerOrderDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BannerOrderDetails> CREATOR = new Creator();
    private final String backtestedArp;
    private final String balType;
    private final String deltaRatio;
    private final ArrayList<InstrumentPercentBean> instrumentPercent;
    private final String interval;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BannerOrderDetails> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerOrderDetails createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(InstrumentPercentBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new BannerOrderDetails(string, string2, string3, string4, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerOrderDetails[] newArray(int i) {
            return new BannerOrderDetails[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BannerOrderDetails() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.BannerOrderDetails */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerOrderDetails copy$default(BannerOrderDetails bannerOrderDetails, String str, String str2, String str3, String str4, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerOrderDetails.backtestedArp;
        }
        if ((i & 2) != 0) {
            str2 = bannerOrderDetails.balType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bannerOrderDetails.interval;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = bannerOrderDetails.deltaRatio;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            arrayList = bannerOrderDetails.instrumentPercent;
        }
        return bannerOrderDetails.copy(str, str5, str6, str7, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.backtestedArp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.balType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.deltaRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<InstrumentPercentBean> component5() {
        return this.instrumentPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerOrderDetails copy(String str, String str2, String str3, String str4, ArrayList<InstrumentPercentBean> arrayList) {
        return new BannerOrderDetails(str, str2, str3, str4, arrayList);
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
        if (!(obj instanceof BannerOrderDetails)) {
            return false;
        }
        BannerOrderDetails bannerOrderDetails = (BannerOrderDetails) obj;
        return Intrinsics.EZpvd((Object) this.backtestedArp, (Object) bannerOrderDetails.backtestedArp) && Intrinsics.EZpvd((Object) this.balType, (Object) bannerOrderDetails.balType) && Intrinsics.EZpvd((Object) this.interval, (Object) bannerOrderDetails.interval) && Intrinsics.EZpvd((Object) this.deltaRatio, (Object) bannerOrderDetails.deltaRatio) && Intrinsics.EZpvd(this.instrumentPercent, bannerOrderDetails.instrumentPercent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBacktestedArp() {
        return this.backtestedArp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalType() {
        return this.balType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaRatio() {
        return this.deltaRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<InstrumentPercentBean> getInstrumentPercent() {
        return this.instrumentPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterval() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.backtestedArp;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.balType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.interval;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.deltaRatio;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        ArrayList<InstrumentPercentBean> arrayList = this.instrumentPercent;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerOrderDetails(backtestedArp=" + this.backtestedArp + ", balType=" + this.balType + ", interval=" + this.interval + ", deltaRatio=" + this.deltaRatio + ", instrumentPercent=" + this.instrumentPercent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.backtestedArp);
        parcel.writeString(this.balType);
        parcel.writeString(this.interval);
        parcel.writeString(this.deltaRatio);
        ArrayList<InstrumentPercentBean> arrayList = this.instrumentPercent;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<InstrumentPercentBean> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public BannerOrderDetails(String str, String str2, String str3, String str4, ArrayList<InstrumentPercentBean> arrayList) {
        this.backtestedArp = str;
        this.balType = str2;
        this.interval = str3;
        this.deltaRatio = str4;
        this.instrumentPercent = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r9v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.InstrumentPercentBean>):void (m)] (LINE:1355) call: com.okinc.unify_trade.biz.BannerOrderDetails.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ BannerOrderDetails(String str, String str2, String str3, String str4, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : arrayList);
    }
}
