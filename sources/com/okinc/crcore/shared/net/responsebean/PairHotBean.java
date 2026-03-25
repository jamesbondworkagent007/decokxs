package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.PairHotResponseBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class PairHotBean implements Parcelable {
    public static final int $stable = 0;
    private final String changePerDay24h;
    private final String changePerDayUtc0;
    private final String changePerDayUtc8;
    private final String displayId;
    private final String hotIndex;
    private final String instId;
    private final String instType;
    private final String lastPrice;
    private final String quoteVolume24h;
    private final int tickSize;
    private final String volume24h;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final Parcelable.Creator<PairHotBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PairHotBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PairHotBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PairHotBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PairHotBean[] newArray(int i) {
            return new PairHotBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PairHotBean() {
        this(null, null, null, null, 0, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.quoteVolume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.tickSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.volume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.hotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PairHotBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new PairHotBean(str, str2, str3, str4, i, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof PairHotBean)) {
            return false;
        }
        PairHotBean pairHotBean = (PairHotBean) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) pairHotBean.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) pairHotBean.displayId) && Intrinsics.EZpvd((Object) this.instType, (Object) pairHotBean.instType) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) pairHotBean.lastPrice) && this.tickSize == pairHotBean.tickSize && Intrinsics.EZpvd((Object) this.volume24h, (Object) pairHotBean.volume24h) && Intrinsics.EZpvd((Object) this.hotIndex, (Object) pairHotBean.hotIndex) && Intrinsics.EZpvd((Object) this.changePerDay24h, (Object) pairHotBean.changePerDay24h) && Intrinsics.EZpvd((Object) this.changePerDayUtc0, (Object) pairHotBean.changePerDayUtc0) && Intrinsics.EZpvd((Object) this.changePerDayUtc8, (Object) pairHotBean.changePerDayUtc8) && Intrinsics.EZpvd((Object) this.quoteVolume24h, (Object) pairHotBean.quoteVolume24h);
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
    public final String getHotIndex() {
        return this.hotIndex;
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
    public final String getQuoteVolume24h() {
        return this.quoteVolume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTickSize() {
        return this.tickSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume24h() {
        return this.volume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.instId.hashCode() * 31) + this.displayId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + Integer.hashCode(this.tickSize)) * 31) + this.volume24h.hashCode()) * 31) + this.hotIndex.hashCode()) * 31) + this.changePerDay24h.hashCode()) * 31) + this.changePerDayUtc0.hashCode()) * 31) + this.changePerDayUtc8.hashCode()) * 31) + this.quoteVolume24h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PairHotBean(instId=" + this.instId + ", displayId=" + this.displayId + ", instType=" + this.instType + ", lastPrice=" + this.lastPrice + ", tickSize=" + this.tickSize + ", volume24h=" + this.volume24h + ", hotIndex=" + this.hotIndex + ", changePerDay24h=" + this.changePerDay24h + ", changePerDayUtc0=" + this.changePerDayUtc0 + ", changePerDayUtc8=" + this.changePerDayUtc8 + ", quoteVolume24h=" + this.quoteVolume24h + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.displayId);
        parcel.writeString(this.instType);
        parcel.writeString(this.lastPrice);
        parcel.writeInt(this.tickSize);
        parcel.writeString(this.volume24h);
        parcel.writeString(this.hotIndex);
        parcel.writeString(this.changePerDay24h);
        parcel.writeString(this.changePerDayUtc0);
        parcel.writeString(this.changePerDayUtc8);
        parcel.writeString(this.quoteVolume24h);
    }

    public PairHotBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.instId = str;
        this.displayId = str2;
        this.instType = str3;
        this.lastPrice = str4;
        this.tickSize = i;
        this.volume24h = str5;
        this.hotIndex = str6;
        this.changePerDay24h = str7;
        this.changePerDayUtc0 = str8;
        this.changePerDayUtc8 = str9;
        this.quoteVolume24h = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r17v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.PairHotBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PairHotBean(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) == 0 ? str10 : "");
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.PairHotBean.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final List<PairHotBean> copydefault(@NotNull List<PairHotResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (PairHotResponseBean pairHotResponseBean : list) {
                arrayList.add(new PairHotBean(pairHotResponseBean.getInstId(), pairHotResponseBean.getDisplayId(), pairHotResponseBean.getInstType(), pairHotResponseBean.getLastPrice(), pairHotResponseBean.getTickSize(), pairHotResponseBean.getVolume24h(), pairHotResponseBean.getHotIndex(), pairHotResponseBean.getChangePerDay24h(), pairHotResponseBean.getChangePerDayUtc0(), pairHotResponseBean.getChangePerDayUtc8(), pairHotResponseBean.getQuoteVolume24h()));
            }
            return arrayList;
        }
    }
}
