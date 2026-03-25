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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class BotLeadProfitChartModel implements Parcelable {
    private String cTime;
    private String pnlRatio;
    private String totalPnl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotLeadProfitChartModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BotLeadProfitChartModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadProfitChartModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotLeadProfitChartModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadProfitChartModel[] newArray(int i) {
            return new BotLeadProfitChartModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadProfitChartModel() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotLeadProfitChartModel copy$default(BotLeadProfitChartModel botLeadProfitChartModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botLeadProfitChartModel.cTime;
        }
        if ((i & 2) != 0) {
            str2 = botLeadProfitChartModel.totalPnl;
        }
        if ((i & 4) != 0) {
            str3 = botLeadProfitChartModel.pnlRatio;
        }
        return botLeadProfitChartModel.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadProfitChartModel copy(String str, String str2, String str3) {
        return new BotLeadProfitChartModel(str, str2, str3);
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
        if (!(obj instanceof BotLeadProfitChartModel)) {
            return false;
        }
        BotLeadProfitChartModel botLeadProfitChartModel = (BotLeadProfitChartModel) obj;
        return Intrinsics.EZpvd((Object) this.cTime, (Object) botLeadProfitChartModel.cTime) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) botLeadProfitChartModel.totalPnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) botLeadProfitChartModel.pnlRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.cTime;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.totalPnl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pnlRatio;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(String str) {
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(String str) {
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(String str) {
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadProfitChartModel(cTime=" + this.cTime + ", totalPnl=" + this.totalPnl + ", pnlRatio=" + this.pnlRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.cTime);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.pnlRatio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotLeadProfitChartModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotLeadProfitChartModel> serializer() {
            return BotLeadProfitChartModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotLeadProfitChartModel(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str;
        }
        if ((i & 2) == 0) {
            this.totalPnl = null;
        } else {
            this.totalPnl = str2;
        }
        if ((i & 4) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotLeadProfitChartModel botLeadProfitChartModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botLeadProfitChartModel.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botLeadProfitChartModel.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botLeadProfitChartModel.totalPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botLeadProfitChartModel.totalPnl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && botLeadProfitChartModel.pnlRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, botLeadProfitChartModel.pnlRatio);
    }

    public BotLeadProfitChartModel(String str, String str2, String str3) {
        this.cTime = str;
        this.totalPnl = str2;
        this.pnlRatio = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3665) call: com.okinc.unify_trade.biz.BotLeadProfitChartModel.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotLeadProfitChartModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
