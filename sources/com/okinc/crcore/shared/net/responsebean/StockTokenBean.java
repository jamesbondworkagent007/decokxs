package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.StockTokenResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class StockTokenBean implements Parcelable {
    public static final int $stable = 0;
    private final String changePerDay24h;
    private final String changePerDayUtc0;
    private final String changePerDayUtc8;
    private final String displayId;
    private final String icon;
    private final String instId;
    private final String instType;
    private final String lastPrice;
    private final String turnOver;
    private final String volume;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final Parcelable.Creator<StockTokenBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StockTokenBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StockTokenBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StockTokenBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StockTokenBean[] newArray(int i) {
            return new StockTokenBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StockTokenBean() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.turnOver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StockTokenBean copy(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new StockTokenBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof StockTokenBean)) {
            return false;
        }
        StockTokenBean stockTokenBean = (StockTokenBean) obj;
        return Intrinsics.EZpvd((Object) this.turnOver, (Object) stockTokenBean.turnOver) && Intrinsics.EZpvd((Object) this.volume, (Object) stockTokenBean.volume) && Intrinsics.EZpvd((Object) this.displayId, (Object) stockTokenBean.displayId) && Intrinsics.EZpvd((Object) this.changePerDay24h, (Object) stockTokenBean.changePerDay24h) && Intrinsics.EZpvd((Object) this.changePerDayUtc0, (Object) stockTokenBean.changePerDayUtc0) && Intrinsics.EZpvd((Object) this.changePerDayUtc8, (Object) stockTokenBean.changePerDayUtc8) && Intrinsics.EZpvd((Object) this.instId, (Object) stockTokenBean.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) stockTokenBean.instType) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) stockTokenBean.lastPrice) && Intrinsics.EZpvd((Object) this.icon, (Object) stockTokenBean.icon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDay24h() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDayUtc0() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDayUtc8() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnOver() {
        return this.turnOver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.turnOver.hashCode();
        int iHashCode2 = this.volume.hashCode();
        String str = this.displayId;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.changePerDay24h.hashCode()) * 31) + this.changePerDayUtc0.hashCode()) * 31) + this.changePerDayUtc8.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + this.icon.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StockTokenBean(turnOver=" + this.turnOver + ", volume=" + this.volume + ", displayId=" + this.displayId + ", changePerDay24h=" + this.changePerDay24h + ", changePerDayUtc0=" + this.changePerDayUtc0 + ", changePerDayUtc8=" + this.changePerDayUtc8 + ", instId=" + this.instId + ", instType=" + this.instType + ", lastPrice=" + this.lastPrice + ", icon=" + this.icon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.turnOver);
        parcel.writeString(this.volume);
        parcel.writeString(this.displayId);
        parcel.writeString(this.changePerDay24h);
        parcel.writeString(this.changePerDayUtc0);
        parcel.writeString(this.changePerDayUtc8);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.lastPrice);
        parcel.writeString(this.icon);
    }

    public StockTokenBean(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.turnOver = str;
        this.volume = str2;
        this.displayId = str3;
        this.changePerDay24h = str4;
        this.changePerDayUtc0 = str5;
        this.changePerDayUtc8 = str6;
        this.instId = str7;
        this.instType = str8;
        this.lastPrice = str9;
        this.icon = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.crcore.shared.net.responsebean.StockTokenBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StockTokenBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.StockTokenBean.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final StockTokenBean OLrzqt(@NotNull StockTokenResponseBean stockTokenResponseBean) {
            Intrinsics.checkNotNullParameter(stockTokenResponseBean, "");
            return new StockTokenBean(stockTokenResponseBean.getTurnOver(), stockTokenResponseBean.getVolume(), stockTokenResponseBean.getDisplayId(), stockTokenResponseBean.getChangePerDay24h(), stockTokenResponseBean.getChangePerDayUtc0(), stockTokenResponseBean.getChangePerDayUtc8(), stockTokenResponseBean.getInstId(), stockTokenResponseBean.getInstType(), stockTokenResponseBean.getLastPrice(), stockTokenResponseBean.getIcon());
        }
    }
}
