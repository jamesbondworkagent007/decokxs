package com.okinc.business.invest_biz.ui.widget.risk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestRiskRatingModel implements Parcelable {
    public static final int $stable = 0;
    private final String creditScoreMin;
    private final String description;
    private final Boolean displaySafeTag;
    private final String messageTip;
    private final String monthsMin;
    private final int ratingTypeId;
    private final String tvl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestRiskRatingModel> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<InvestRiskRatingModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestRiskRatingModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InvestRiskRatingModel(string, string2, string3, i, string4, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestRiskRatingModel[] newArray(int i) {
            return new InvestRiskRatingModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestRiskRatingModel copy$default(InvestRiskRatingModel investRiskRatingModel, String str, String str2, String str3, int i, String str4, Boolean bool, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = investRiskRatingModel.tvl;
        }
        if ((i2 & 2) != 0) {
            str2 = investRiskRatingModel.monthsMin;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = investRiskRatingModel.creditScoreMin;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            i = investRiskRatingModel.ratingTypeId;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = investRiskRatingModel.description;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            bool = investRiskRatingModel.displaySafeTag;
        }
        Boolean bool2 = bool;
        if ((i2 & 64) != 0) {
            str5 = investRiskRatingModel.messageTip;
        }
        return investRiskRatingModel.copy(str, str6, str7, i3, str8, bool2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.monthsMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.creditScoreMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.ratingTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.displaySafeTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.messageTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestRiskRatingModel copy(String str, String str2, String str3, int i, String str4, Boolean bool, String str5) {
        return new InvestRiskRatingModel(str, str2, str3, i, str4, bool, str5);
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
        if (!(obj instanceof InvestRiskRatingModel)) {
            return false;
        }
        InvestRiskRatingModel investRiskRatingModel = (InvestRiskRatingModel) obj;
        return Intrinsics.EZpvd((Object) this.tvl, (Object) investRiskRatingModel.tvl) && Intrinsics.EZpvd((Object) this.monthsMin, (Object) investRiskRatingModel.monthsMin) && Intrinsics.EZpvd((Object) this.creditScoreMin, (Object) investRiskRatingModel.creditScoreMin) && this.ratingTypeId == investRiskRatingModel.ratingTypeId && Intrinsics.EZpvd((Object) this.description, (Object) investRiskRatingModel.description) && Intrinsics.EZpvd(this.displaySafeTag, investRiskRatingModel.displaySafeTag) && Intrinsics.EZpvd((Object) this.messageTip, (Object) investRiskRatingModel.messageTip);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreditScoreMin() {
        return this.creditScoreMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDisplaySafeTag() {
        return this.displaySafeTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageTip() {
        return this.messageTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMonthsMin() {
        return this.monthsMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRatingTypeId() {
        return this.ratingTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvl() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tvl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.monthsMin;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.creditScoreMin;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = Integer.hashCode(this.ratingTypeId);
        String str4 = this.description;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.displaySafeTag;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str5 = this.messageTip;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestRiskRatingModel(tvl=" + this.tvl + ", monthsMin=" + this.monthsMin + ", creditScoreMin=" + this.creditScoreMin + ", ratingTypeId=" + this.ratingTypeId + ", description=" + this.description + ", displaySafeTag=" + this.displaySafeTag + ", messageTip=" + this.messageTip + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tvl);
        parcel.writeString(this.monthsMin);
        parcel.writeString(this.creditScoreMin);
        parcel.writeInt(this.ratingTypeId);
        parcel.writeString(this.description);
        Boolean bool = this.displaySafeTag;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.messageTip);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.widget.risk.InvestRiskRatingModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestRiskRatingModel> serializer() {
            return InvestRiskRatingModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestRiskRatingModel(int i, String str, String str2, String str3, int i2, String str4, Boolean bool, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, InvestRiskRatingModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.tvl = "";
        } else {
            this.tvl = str;
        }
        if ((i & 2) == 0) {
            this.monthsMin = "";
        } else {
            this.monthsMin = str2;
        }
        if ((i & 4) == 0) {
            this.creditScoreMin = "";
        } else {
            this.creditScoreMin = str3;
        }
        this.ratingTypeId = i2;
        if ((i & 16) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
        if ((i & 32) == 0) {
            this.displaySafeTag = Boolean.FALSE;
        } else {
            this.displaySafeTag = bool;
        }
        if ((i & 64) == 0) {
            this.messageTip = "";
        } else {
            this.messageTip = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestRiskRatingModel investRiskRatingModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investRiskRatingModel.tvl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investRiskRatingModel.tvl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investRiskRatingModel.monthsMin, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investRiskRatingModel.monthsMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investRiskRatingModel.creditScoreMin, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investRiskRatingModel.creditScoreMin);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, investRiskRatingModel.ratingTypeId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investRiskRatingModel.description, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investRiskRatingModel.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(investRiskRatingModel.displaySafeTag, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, investRiskRatingModel.displaySafeTag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) investRiskRatingModel.messageTip, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investRiskRatingModel.messageTip);
    }

    public InvestRiskRatingModel(String str, String str2, String str3, int i, String str4, Boolean bool, String str5) {
        this.tvl = str;
        this.monthsMin = str2;
        this.creditScoreMin = str3;
        this.ratingTypeId = i;
        this.description = str4;
        this.displaySafeTag = bool;
        this.messageTip = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (r14v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.invest_biz.ui.widget.risk.InvestRiskRatingModel.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ InvestRiskRatingModel(String str, String str2, String str3, int i, String str4, Boolean bool, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? Boolean.FALSE : bool, (i2 & 64) != 0 ? "" : str5);
    }
}
