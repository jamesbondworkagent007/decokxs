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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BotLeadProfitSummaryModel implements Parcelable {
    private String accumulatedProfitSharing;
    private String estimatedProfitSharing;
    private String profitSharingCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotLeadProfitSummaryModel> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BotLeadProfitSummaryModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadProfitSummaryModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotLeadProfitSummaryModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadProfitSummaryModel[] newArray(int i) {
            return new BotLeadProfitSummaryModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadProfitSummaryModel() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotLeadProfitSummaryModel copy$default(BotLeadProfitSummaryModel botLeadProfitSummaryModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botLeadProfitSummaryModel.estimatedProfitSharing;
        }
        if ((i & 2) != 0) {
            str2 = botLeadProfitSummaryModel.accumulatedProfitSharing;
        }
        if ((i & 4) != 0) {
            str3 = botLeadProfitSummaryModel.profitSharingCcy;
        }
        return botLeadProfitSummaryModel.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.estimatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accumulatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadProfitSummaryModel copy(String str, String str2, String str3) {
        return new BotLeadProfitSummaryModel(str, str2, str3);
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
        if (!(obj instanceof BotLeadProfitSummaryModel)) {
            return false;
        }
        BotLeadProfitSummaryModel botLeadProfitSummaryModel = (BotLeadProfitSummaryModel) obj;
        return Intrinsics.EZpvd((Object) this.estimatedProfitSharing, (Object) botLeadProfitSummaryModel.estimatedProfitSharing) && Intrinsics.EZpvd((Object) this.accumulatedProfitSharing, (Object) botLeadProfitSummaryModel.accumulatedProfitSharing) && Intrinsics.EZpvd((Object) this.profitSharingCcy, (Object) botLeadProfitSummaryModel.profitSharingCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccumulatedProfitSharing() {
        return this.accumulatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedProfitSharing() {
        return this.estimatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingCcy() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.estimatedProfitSharing;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.accumulatedProfitSharing;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.profitSharingCcy;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccumulatedProfitSharing(String str) {
        this.accumulatedProfitSharing = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedProfitSharing(String str) {
        this.estimatedProfitSharing = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingCcy(String str) {
        this.profitSharingCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadProfitSummaryModel(estimatedProfitSharing=" + this.estimatedProfitSharing + ", accumulatedProfitSharing=" + this.accumulatedProfitSharing + ", profitSharingCcy=" + this.profitSharingCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.estimatedProfitSharing);
        parcel.writeString(this.accumulatedProfitSharing);
        parcel.writeString(this.profitSharingCcy);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotLeadProfitSummaryModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotLeadProfitSummaryModel> serializer() {
            return BotLeadProfitSummaryModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotLeadProfitSummaryModel(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estimatedProfitSharing = null;
        } else {
            this.estimatedProfitSharing = str;
        }
        if ((i & 2) == 0) {
            this.accumulatedProfitSharing = null;
        } else {
            this.accumulatedProfitSharing = str2;
        }
        if ((i & 4) == 0) {
            this.profitSharingCcy = null;
        } else {
            this.profitSharingCcy = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotLeadProfitSummaryModel botLeadProfitSummaryModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botLeadProfitSummaryModel.estimatedProfitSharing != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botLeadProfitSummaryModel.estimatedProfitSharing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botLeadProfitSummaryModel.accumulatedProfitSharing != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botLeadProfitSummaryModel.accumulatedProfitSharing);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && botLeadProfitSummaryModel.profitSharingCcy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, botLeadProfitSummaryModel.profitSharingCcy);
    }

    public BotLeadProfitSummaryModel(String str, String str2, String str3) {
        this.estimatedProfitSharing = str;
        this.accumulatedProfitSharing = str2;
        this.profitSharingCcy = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3749) call: com.okinc.unify_trade.biz.BotLeadProfitSummaryModel.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotLeadProfitSummaryModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
