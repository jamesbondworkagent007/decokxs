package com.okinc.assets.backend.api.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56524yIo;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public interface PortfolioMarginVerification extends Parcelable {
    public static final Companion Companion = Companion.AEQbTJ;

    String getIcon();

    String getMgnRatio();

    String getMgnRatioAft();

    String getMmr();

    String getMmrAft();

    String getMmrVar();

    public static final class Companion {
        public static final /* synthetic */ Companion AEQbTJ = new Companion();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        public final KSerializer<PortfolioMarginVerification> serializer() {
            return new SealedClassSerializer("com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification", C56524yIo.AEQbTJ(PortfolioMarginVerification.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(MarginLevelConfirmation.class), C56524yIo.AEQbTJ(TransferConfirmation.class)}, new KSerializer[]{PortfolioMarginVerification$MarginLevelConfirmation$$serializer.INSTANCE, PortfolioMarginVerification$TransferConfirmation$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @Serializable
    public static final class MarginLevelConfirmation implements PortfolioMarginVerification, Parcelable {
        public static final int $stable = 0;
        private final String icon;
        private final Boolean isTransferConfirmation;
        private final String mgnRatio;
        private final String mgnRatioAft;
        private final String mmr;
        private final String mmrAft;
        private final String mmrVar;
        private final String spotInUseAmt;
        private final String spotInUseAmtAft;
        private final String spotInUseAmtVar;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<MarginLevelConfirmation> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<MarginLevelConfirmation> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginLevelConfirmation createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new MarginLevelConfirmation(boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginLevelConfirmation[] newArray(int i) {
                return new MarginLevelConfirmation[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component1() {
            return this.isTransferConfirmation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.spotInUseAmt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.spotInUseAmtAft;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.spotInUseAmtVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.mgnRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.mmr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.mmrAft;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.mgnRatioAft;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.mmrVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MarginLevelConfirmation copy(Boolean bool, String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            return new MarginLevelConfirmation(bool, str, str2, str3, str4, str5, str6, str7, str8, str9);
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
            if (!(obj instanceof MarginLevelConfirmation)) {
                return false;
            }
            MarginLevelConfirmation marginLevelConfirmation = (MarginLevelConfirmation) obj;
            return Intrinsics.EZpvd(this.isTransferConfirmation, marginLevelConfirmation.isTransferConfirmation) && Intrinsics.EZpvd((Object) this.spotInUseAmt, (Object) marginLevelConfirmation.spotInUseAmt) && Intrinsics.EZpvd((Object) this.spotInUseAmtAft, (Object) marginLevelConfirmation.spotInUseAmtAft) && Intrinsics.EZpvd((Object) this.spotInUseAmtVar, (Object) marginLevelConfirmation.spotInUseAmtVar) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) marginLevelConfirmation.mgnRatio) && Intrinsics.EZpvd((Object) this.mmr, (Object) marginLevelConfirmation.mmr) && Intrinsics.EZpvd((Object) this.mmrAft, (Object) marginLevelConfirmation.mmrAft) && Intrinsics.EZpvd((Object) this.mgnRatioAft, (Object) marginLevelConfirmation.mgnRatioAft) && Intrinsics.EZpvd((Object) this.mmrVar, (Object) marginLevelConfirmation.mmrVar) && Intrinsics.EZpvd((Object) this.icon, (Object) marginLevelConfirmation.icon);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification
        public String getIcon() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification
        public String getMgnRatio() {
            return this.mgnRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification
        public String getMgnRatioAft() {
            return this.mgnRatioAft;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification
        public String getMmr() {
            return this.mmr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification
        public String getMmrAft() {
            return this.mmrAft;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification
        public String getMmrVar() {
            return this.mmrVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSpotInUseAmt() {
            return this.spotInUseAmt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSpotInUseAmtAft() {
            return this.spotInUseAmtAft;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSpotInUseAmtVar() {
            return this.spotInUseAmtVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Boolean bool = this.isTransferConfirmation;
            int iHashCode = bool == null ? 0 : bool.hashCode();
            String str = this.spotInUseAmt;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.spotInUseAmtAft;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.spotInUseAmtVar;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.mgnRatio.hashCode()) * 31) + this.mmr.hashCode()) * 31) + this.mmrAft.hashCode()) * 31) + this.mgnRatioAft.hashCode()) * 31) + this.mmrVar.hashCode()) * 31) + this.icon.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean isTransferConfirmation() {
            return this.isTransferConfirmation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MarginLevelConfirmation(isTransferConfirmation=" + this.isTransferConfirmation + ", spotInUseAmt=" + this.spotInUseAmt + ", spotInUseAmtAft=" + this.spotInUseAmtAft + ", spotInUseAmtVar=" + this.spotInUseAmtVar + ", mgnRatio=" + this.mgnRatio + ", mmr=" + this.mmr + ", mmrAft=" + this.mmrAft + ", mgnRatioAft=" + this.mgnRatioAft + ", mmrVar=" + this.mmrVar + ", icon=" + this.icon + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v4, types: [int] */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            ?? BooleanValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean bool = this.isTransferConfirmation;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                parcel.writeInt(1);
                BooleanValue = bool.booleanValue();
            }
            parcel.writeInt(BooleanValue);
            parcel.writeString(this.spotInUseAmt);
            parcel.writeString(this.spotInUseAmtAft);
            parcel.writeString(this.spotInUseAmtVar);
            parcel.writeString(this.mgnRatio);
            parcel.writeString(this.mmr);
            parcel.writeString(this.mmrAft);
            parcel.writeString(this.mgnRatioAft);
            parcel.writeString(this.mmrVar);
            parcel.writeString(this.icon);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification.MarginLevelConfirmation.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<MarginLevelConfirmation> serializer() {
                return PortfolioMarginVerification$MarginLevelConfirmation$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ MarginLevelConfirmation(int i, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            if (1008 != (i & 1008)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1008, PortfolioMarginVerification$MarginLevelConfirmation$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.isTransferConfirmation = null;
            } else {
                this.isTransferConfirmation = bool;
            }
            if ((i & 2) == 0) {
                this.spotInUseAmt = null;
            } else {
                this.spotInUseAmt = str;
            }
            if ((i & 4) == 0) {
                this.spotInUseAmtAft = null;
            } else {
                this.spotInUseAmtAft = str2;
            }
            if ((i & 8) == 0) {
                this.spotInUseAmtVar = null;
            } else {
                this.spotInUseAmtVar = str3;
            }
            this.mgnRatio = str4;
            this.mmr = str5;
            this.mmrAft = str6;
            this.mgnRatioAft = str7;
            this.mmrVar = str8;
            this.icon = str9;
        }

        public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(MarginLevelConfirmation marginLevelConfirmation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || marginLevelConfirmation.isTransferConfirmation != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, marginLevelConfirmation.isTransferConfirmation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || marginLevelConfirmation.spotInUseAmt != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, marginLevelConfirmation.spotInUseAmt);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || marginLevelConfirmation.spotInUseAmtAft != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, marginLevelConfirmation.spotInUseAmtAft);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || marginLevelConfirmation.spotInUseAmtVar != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, marginLevelConfirmation.spotInUseAmtVar);
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 4, marginLevelConfirmation.getMgnRatio());
            compositeEncoder.encodeStringElement(serialDescriptor, 5, marginLevelConfirmation.getMmr());
            compositeEncoder.encodeStringElement(serialDescriptor, 6, marginLevelConfirmation.getMmrAft());
            compositeEncoder.encodeStringElement(serialDescriptor, 7, marginLevelConfirmation.getMgnRatioAft());
            compositeEncoder.encodeStringElement(serialDescriptor, 8, marginLevelConfirmation.getMmrVar());
            compositeEncoder.encodeStringElement(serialDescriptor, 9, marginLevelConfirmation.getIcon());
        }

        public MarginLevelConfirmation(Boolean bool, String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            this.isTransferConfirmation = bool;
            this.spotInUseAmt = str;
            this.spotInUseAmtAft = str2;
            this.spotInUseAmtVar = str3;
            this.mgnRatio = str4;
            this.mmr = str5;
            this.mmrAft = str6;
            this.mgnRatioAft = str7;
            this.mmrVar = str8;
            this.icon = str9;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification.MarginLevelConfirmation.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ MarginLevelConfirmation(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, str4, str5, str6, str7, str8, str9);
        }
    }

    @Serializable
    public static final class TransferConfirmation implements PortfolioMarginVerification, Parcelable {
        public static final int $stable = 0;
        private final String icon;
        private final String mgnRatio;
        private final String mgnRatioAft;
        private final String mmr;
        private final String mmrAft;
        private final String mmrVar;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<TransferConfirmation> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<TransferConfirmation> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransferConfirmation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TransferConfirmation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransferConfirmation[] newArray(int i) {
                return new TransferConfirmation[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TransferConfirmation copy$default(TransferConfirmation transferConfirmation, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transferConfirmation.mgnRatio;
            }
            if ((i & 2) != 0) {
                str2 = transferConfirmation.mmr;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = transferConfirmation.mmrAft;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = transferConfirmation.mgnRatioAft;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = transferConfirmation.mmrVar;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = transferConfirmation.icon;
            }
            return transferConfirmation.copy(str, str7, str8, str9, str10, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.mgnRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.mmr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.mmrAft;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.mgnRatioAft;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.mmrVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransferConfirmation copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new TransferConfirmation(str, str2, str3, str4, str5, str6);
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
            if (!(obj instanceof TransferConfirmation)) {
                return false;
            }
            TransferConfirmation transferConfirmation = (TransferConfirmation) obj;
            return Intrinsics.EZpvd((Object) this.mgnRatio, (Object) transferConfirmation.mgnRatio) && Intrinsics.EZpvd((Object) this.mmr, (Object) transferConfirmation.mmr) && Intrinsics.EZpvd((Object) this.mmrAft, (Object) transferConfirmation.mmrAft) && Intrinsics.EZpvd((Object) this.mgnRatioAft, (Object) transferConfirmation.mgnRatioAft) && Intrinsics.EZpvd((Object) this.mmrVar, (Object) transferConfirmation.mmrVar) && Intrinsics.EZpvd((Object) this.icon, (Object) transferConfirmation.icon);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification
        public String getIcon() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification
        public String getMgnRatio() {
            return this.mgnRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification
        public String getMgnRatioAft() {
            return this.mgnRatioAft;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification
        public String getMmr() {
            return this.mmr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification
        public String getMmrAft() {
            return this.mmrAft;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification
        public String getMmrVar() {
            return this.mmrVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.mgnRatio.hashCode() * 31) + this.mmr.hashCode()) * 31) + this.mmrAft.hashCode()) * 31) + this.mgnRatioAft.hashCode()) * 31) + this.mmrVar.hashCode()) * 31) + this.icon.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TransferConfirmation(mgnRatio=" + this.mgnRatio + ", mmr=" + this.mmr + ", mmrAft=" + this.mmrAft + ", mgnRatioAft=" + this.mgnRatioAft + ", mmrVar=" + this.mmrVar + ", icon=" + this.icon + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.mgnRatio);
            parcel.writeString(this.mmr);
            parcel.writeString(this.mmrAft);
            parcel.writeString(this.mgnRatioAft);
            parcel.writeString(this.mmrVar);
            parcel.writeString(this.icon);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification.TransferConfirmation.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TransferConfirmation> serializer() {
                return PortfolioMarginVerification$TransferConfirmation$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ TransferConfirmation(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if (63 != (i & 63)) {
                PluginExceptionsKt.throwMissingFieldException(i, 63, PortfolioMarginVerification$TransferConfirmation$$serializer.INSTANCE.getDescriptor());
            }
            this.mgnRatio = str;
            this.mmr = str2;
            this.mmrAft = str3;
            this.mgnRatioAft = str4;
            this.mmrVar = str5;
            this.icon = str6;
        }

        public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(TransferConfirmation transferConfirmation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, transferConfirmation.getMgnRatio());
            compositeEncoder.encodeStringElement(serialDescriptor, 1, transferConfirmation.getMmr());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, transferConfirmation.getMmrAft());
            compositeEncoder.encodeStringElement(serialDescriptor, 3, transferConfirmation.getMgnRatioAft());
            compositeEncoder.encodeStringElement(serialDescriptor, 4, transferConfirmation.getMmrVar());
            compositeEncoder.encodeStringElement(serialDescriptor, 5, transferConfirmation.getIcon());
        }

        public TransferConfirmation(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.mgnRatio = str;
            this.mmr = str2;
            this.mmrAft = str3;
            this.mgnRatioAft = str4;
            this.mmrVar = str5;
            this.icon = str6;
        }
    }
}
