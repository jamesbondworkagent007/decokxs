package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class GridProfitRateResp implements Parcelable {
    private String maxGirdNum;
    private String perMaxProfitAmt;
    private String perMaxProfitRate;
    private String perMinProfitAmt;
    private String perMinProfitRate;
    private String profitCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GridProfitRateResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GridProfitRateResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridProfitRateResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GridProfitRateResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridProfitRateResp[] newArray(int i) {
            return new GridProfitRateResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridProfitRateResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridProfitRateResp copy$default(GridProfitRateResp gridProfitRateResp, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridProfitRateResp.perMaxProfitRate;
        }
        if ((i & 2) != 0) {
            str2 = gridProfitRateResp.perMinProfitRate;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = gridProfitRateResp.maxGirdNum;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = gridProfitRateResp.perMaxProfitAmt;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = gridProfitRateResp.perMinProfitAmt;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = gridProfitRateResp.profitCcy;
        }
        return gridProfitRateResp.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxGirdNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.perMaxProfitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.perMinProfitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.profitCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitRateResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new GridProfitRateResp(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof GridProfitRateResp)) {
            return false;
        }
        GridProfitRateResp gridProfitRateResp = (GridProfitRateResp) obj;
        return Intrinsics.EZpvd((Object) this.perMaxProfitRate, (Object) gridProfitRateResp.perMaxProfitRate) && Intrinsics.EZpvd((Object) this.perMinProfitRate, (Object) gridProfitRateResp.perMinProfitRate) && Intrinsics.EZpvd((Object) this.maxGirdNum, (Object) gridProfitRateResp.maxGirdNum) && Intrinsics.EZpvd((Object) this.perMaxProfitAmt, (Object) gridProfitRateResp.perMaxProfitAmt) && Intrinsics.EZpvd((Object) this.perMinProfitAmt, (Object) gridProfitRateResp.perMinProfitAmt) && Intrinsics.EZpvd((Object) this.profitCcy, (Object) gridProfitRateResp.profitCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxGirdNum() {
        return this.maxGirdNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMaxProfitAmt() {
        return this.perMaxProfitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMaxProfitRate() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMinProfitAmt() {
        return this.perMinProfitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMinProfitRate() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitCcy() {
        return this.profitCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.perMaxProfitRate.hashCode() * 31) + this.perMinProfitRate.hashCode()) * 31) + this.maxGirdNum.hashCode()) * 31) + this.perMaxProfitAmt.hashCode()) * 31) + this.perMinProfitAmt.hashCode()) * 31) + this.profitCcy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxGirdNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxGirdNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMaxProfitAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.perMaxProfitAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMaxProfitRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.perMaxProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMinProfitAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.perMinProfitAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMinProfitRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.perMinProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profitCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridProfitRateResp(perMaxProfitRate=" + this.perMaxProfitRate + ", perMinProfitRate=" + this.perMinProfitRate + ", maxGirdNum=" + this.maxGirdNum + ", perMaxProfitAmt=" + this.perMaxProfitAmt + ", perMinProfitAmt=" + this.perMinProfitAmt + ", profitCcy=" + this.profitCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.perMaxProfitRate);
        parcel.writeString(this.perMinProfitRate);
        parcel.writeString(this.maxGirdNum);
        parcel.writeString(this.perMaxProfitAmt);
        parcel.writeString(this.perMinProfitAmt);
        parcel.writeString(this.profitCcy);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.GridProfitRateResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridProfitRateResp> serializer() {
            return GridProfitRateResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridProfitRateResp(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.perMaxProfitRate = "";
        } else {
            this.perMaxProfitRate = str;
        }
        if ((i & 2) == 0) {
            this.perMinProfitRate = "";
        } else {
            this.perMinProfitRate = str2;
        }
        if ((i & 4) == 0) {
            this.maxGirdNum = "";
        } else {
            this.maxGirdNum = str3;
        }
        if ((i & 8) == 0) {
            this.perMaxProfitAmt = "";
        } else {
            this.perMaxProfitAmt = str4;
        }
        if ((i & 16) == 0) {
            this.perMinProfitAmt = "";
        } else {
            this.perMinProfitAmt = str5;
        }
        if ((i & 32) == 0) {
            this.profitCcy = "";
        } else {
            this.profitCcy = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(GridProfitRateResp gridProfitRateResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) gridProfitRateResp.perMaxProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, gridProfitRateResp.perMaxProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) gridProfitRateResp.perMinProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, gridProfitRateResp.perMinProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) gridProfitRateResp.maxGirdNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, gridProfitRateResp.maxGirdNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) gridProfitRateResp.perMaxProfitAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, gridProfitRateResp.perMaxProfitAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) gridProfitRateResp.perMinProfitAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, gridProfitRateResp.perMinProfitAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) gridProfitRateResp.profitCcy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, gridProfitRateResp.profitCcy);
    }

    public GridProfitRateResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.perMaxProfitRate = str;
        this.perMinProfitRate = str2;
        this.maxGirdNum = str3;
        this.perMaxProfitAmt = str4;
        this.perMinProfitAmt = str5;
        this.profitCcy = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1996) call: com.okinc.unify_trade.biz.GridProfitRateResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GridProfitRateResp(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
