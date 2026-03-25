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
public final class BotRecommendationResult implements Parcelable {
    private String pnlRatio;
    private DcaAiData stgyParam;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotRecommendationResult> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<BotRecommendationResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotRecommendationResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotRecommendationResult(parcel.readString(), parcel.readInt() == 0 ? null : DcaAiData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotRecommendationResult[] newArray(int i) {
            return new BotRecommendationResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotRecommendationResult() {
        this((String) null, (DcaAiData) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotRecommendationResult copy$default(BotRecommendationResult botRecommendationResult, String str, DcaAiData dcaAiData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botRecommendationResult.pnlRatio;
        }
        if ((i & 2) != 0) {
            dcaAiData = botRecommendationResult.stgyParam;
        }
        return botRecommendationResult.copy(str, dcaAiData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaAiData component2() {
        return this.stgyParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRecommendationResult copy(String str, DcaAiData dcaAiData) {
        return new BotRecommendationResult(str, dcaAiData);
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
        if (!(obj instanceof BotRecommendationResult)) {
            return false;
        }
        BotRecommendationResult botRecommendationResult = (BotRecommendationResult) obj;
        return Intrinsics.EZpvd((Object) this.pnlRatio, (Object) botRecommendationResult.pnlRatio) && Intrinsics.EZpvd(this.stgyParam, botRecommendationResult.stgyParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaAiData getStgyParam() {
        return this.stgyParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.pnlRatio;
        int iHashCode = str == null ? 0 : str.hashCode();
        DcaAiData dcaAiData = this.stgyParam;
        return (iHashCode * 31) + (dcaAiData != null ? dcaAiData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(String str) {
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyParam(DcaAiData dcaAiData) {
        this.stgyParam = dcaAiData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotRecommendationResult(pnlRatio=" + this.pnlRatio + ", stgyParam=" + this.stgyParam + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pnlRatio);
        DcaAiData dcaAiData = this.stgyParam;
        if (dcaAiData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dcaAiData.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotRecommendationResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotRecommendationResult> serializer() {
            return BotRecommendationResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotRecommendationResult(int i, String str, DcaAiData dcaAiData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str;
        }
        if ((i & 2) == 0) {
            this.stgyParam = null;
        } else {
            this.stgyParam = dcaAiData;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotRecommendationResult botRecommendationResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botRecommendationResult.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botRecommendationResult.pnlRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && botRecommendationResult.stgyParam == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DcaAiData$$serializer.INSTANCE, botRecommendationResult.stgyParam);
    }

    public BotRecommendationResult(String str, DcaAiData dcaAiData) {
        this.pnlRatio = str;
        this.stgyParam = dcaAiData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.DcaAiData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.DcaAiData) : (r3v0 com.okinc.unify_trade.biz.DcaAiData))
 A[MD:(java.lang.String, com.okinc.unify_trade.biz.DcaAiData):void (m)] (LINE:2766) call: com.okinc.unify_trade.biz.BotRecommendationResult.<init>(java.lang.String, com.okinc.unify_trade.biz.DcaAiData):void type: THIS */
    public /* synthetic */ BotRecommendationResult(String str, DcaAiData dcaAiData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : dcaAiData);
    }
}
