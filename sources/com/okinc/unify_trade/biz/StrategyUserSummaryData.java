package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyUserSummaryData implements Parcelable {
    public static final int $stable = 0;
    private final String ccy;
    private final String stgyCount;
    private final String tdyPnlRatio;
    private final String tdyTotalProfit;
    private final String totalAsset;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<StrategyUserSummaryData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StrategyUserSummaryData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyUserSummaryData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StrategyUserSummaryData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyUserSummaryData[] newArray(int i) {
            return new StrategyUserSummaryData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyUserSummaryData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrategyUserSummaryData copy$default(StrategyUserSummaryData strategyUserSummaryData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategyUserSummaryData.tdyPnlRatio;
        }
        if ((i & 2) != 0) {
            str2 = strategyUserSummaryData.tdyTotalProfit;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = strategyUserSummaryData.totalAsset;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = strategyUserSummaryData.stgyCount;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = strategyUserSummaryData.ccy;
        }
        return strategyUserSummaryData.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tdyPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tdyTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.stgyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyUserSummaryData copy(String str, String str2, String str3, String str4, String str5) {
        return new StrategyUserSummaryData(str, str2, str3, str4, str5);
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
        if (!(obj instanceof StrategyUserSummaryData)) {
            return false;
        }
        StrategyUserSummaryData strategyUserSummaryData = (StrategyUserSummaryData) obj;
        return Intrinsics.EZpvd((Object) this.tdyPnlRatio, (Object) strategyUserSummaryData.tdyPnlRatio) && Intrinsics.EZpvd((Object) this.tdyTotalProfit, (Object) strategyUserSummaryData.tdyTotalProfit) && Intrinsics.EZpvd((Object) this.totalAsset, (Object) strategyUserSummaryData.totalAsset) && Intrinsics.EZpvd((Object) this.stgyCount, (Object) strategyUserSummaryData.stgyCount) && Intrinsics.EZpvd((Object) this.ccy, (Object) strategyUserSummaryData.ccy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyCount() {
        return this.stgyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdyPnlRatio() {
        return this.tdyPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdyTotalProfit() {
        return this.tdyTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAsset() {
        return this.totalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tdyPnlRatio;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tdyTotalProfit;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.totalAsset;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.stgyCount;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.ccy;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyUserSummaryData(tdyPnlRatio=" + this.tdyPnlRatio + ", tdyTotalProfit=" + this.tdyTotalProfit + ", totalAsset=" + this.totalAsset + ", stgyCount=" + this.stgyCount + ", ccy=" + this.ccy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tdyPnlRatio);
        parcel.writeString(this.tdyTotalProfit);
        parcel.writeString(this.totalAsset);
        parcel.writeString(this.stgyCount);
        parcel.writeString(this.ccy);
    }

    public /* synthetic */ StrategyUserSummaryData(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tdyPnlRatio = null;
        } else {
            this.tdyPnlRatio = str;
        }
        if ((i & 2) == 0) {
            this.tdyTotalProfit = null;
        } else {
            this.tdyTotalProfit = str2;
        }
        if ((i & 4) == 0) {
            this.totalAsset = null;
        } else {
            this.totalAsset = str3;
        }
        if ((i & 8) == 0) {
            this.stgyCount = null;
        } else {
            this.stgyCount = str4;
        }
        if ((i & 16) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyUserSummaryData strategyUserSummaryData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || strategyUserSummaryData.tdyPnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, strategyUserSummaryData.tdyPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || strategyUserSummaryData.tdyTotalProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, strategyUserSummaryData.tdyTotalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || strategyUserSummaryData.totalAsset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, strategyUserSummaryData.totalAsset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || strategyUserSummaryData.stgyCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, strategyUserSummaryData.stgyCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && strategyUserSummaryData.ccy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, strategyUserSummaryData.ccy);
    }

    public StrategyUserSummaryData(String str, String str2, String str3, String str4, String str5) {
        this.tdyPnlRatio = str;
        this.tdyTotalProfit = str2;
        this.totalAsset = str3;
        this.stgyCount = str4;
        this.ccy = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2897) call: com.okinc.unify_trade.biz.StrategyUserSummaryData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyUserSummaryData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static final class Companion {

        public static final class TaskDescription extends TypeToken<List<? extends StrategyUserSummaryData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyUserSummaryData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StrategyUserSummaryData> serializer() {
            return StrategyUserSummaryData$$serializer.INSTANCE;
        }

        public final List<StrategyUserSummaryData> copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List<StrategyUserSummaryData> list = (List) new Gson().fromJson(str, new TaskDescription().getType());
                if (list == null) {
                    return list;
                }
                list.isEmpty();
                return list;
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "StrategyUserSummeryData-jsonConvert" + e.getMessage());
                return null;
            }
        }
    }
}
