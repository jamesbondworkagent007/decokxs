package com.okinc.tradeuilib.dex;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.dex.DexTPSLLabelType;
import com.okinc.tradeuilib.dex.OKTDexTPSLStrategy;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public abstract class OKTDexTPSLStrategy implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.usj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKTDexTPSLStrategy.EZpvd();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.dex.OKTDexTPSLStrategy.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OKTDexTPSLStrategy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static final /* synthetic */ void OLrzqt(OKTDexTPSLStrategy oKTDexTPSLStrategy, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.dex.OKTDexTPSLStrategy.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) OKTDexTPSLStrategy.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKTDexTPSLStrategy> serializer() {
            return copydefault();
        }
    }

    private OKTDexTPSLStrategy() {
    }

    public /* synthetic */ OKTDexTPSLStrategy(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    public static final /* synthetic */ KSerializer EZpvd() {
        return new SealedClassSerializer("com.okinc.tradeuilib.dex.OKTDexTPSLStrategy", C56524yIo.AEQbTJ(OKTDexTPSLStrategy.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(StopLoss.class), C56524yIo.AEQbTJ(TakeProfit.class)}, new KSerializer[]{OKTDexTPSLStrategy$StopLoss$$serializer.INSTANCE, OKTDexTPSLStrategy$TakeProfit$$serializer.INSTANCE}, new Annotation[0]);
    }

    @Serializable
    @SerialName("takeProfit")
    public static final class TakeProfit extends OKTDexTPSLStrategy {
        public static final int $stable = 0;
        public final String priceIncreaseRatio;
        public final String sellBuyPercentage;
        public final DexTPSLLabelType sellBuyType;
        public final DexTPSLLabelType tpSlType;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<TakeProfit> CREATOR = new Creator();
        public static final KSerializer<Object>[] $childSerializers = {null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.dex.DexTPSLLabelType", DexTPSLLabelType.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.dex.DexTPSLLabelType", DexTPSLLabelType.values())};

        public static final class Creator implements Parcelable.Creator<TakeProfit> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TakeProfit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TakeProfit(parcel.readString(), parcel.readString(), (DexTPSLLabelType) parcel.readParcelable(TakeProfit.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TakeProfit[] newArray(int i) {
                return new TakeProfit[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TakeProfit copy$default(TakeProfit takeProfit, String str, String str2, DexTPSLLabelType dexTPSLLabelType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = takeProfit.priceIncreaseRatio;
            }
            if ((i & 2) != 0) {
                str2 = takeProfit.sellBuyPercentage;
            }
            if ((i & 4) != 0) {
                dexTPSLLabelType = takeProfit.sellBuyType;
            }
            return takeProfit.EZpvd(str, str2, dexTPSLLabelType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String AEQbTJ() {
            return this.sellBuyPercentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DexTPSLLabelType AYXKKw() {
            return this.sellBuyType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DexTPSLLabelType AhwBna() {
            return this.tpSlType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TakeProfit EZpvd(@NotNull String str, @NotNull String str2, @NotNull DexTPSLLabelType dexTPSLLabelType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(dexTPSLLabelType, "");
            return new TakeProfit(str, str2, dexTPSLLabelType);
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
            if (!(obj instanceof TakeProfit)) {
                return false;
            }
            TakeProfit takeProfit = (TakeProfit) obj;
            return Intrinsics.EZpvd((Object) this.priceIncreaseRatio, (Object) takeProfit.priceIncreaseRatio) && Intrinsics.EZpvd((Object) this.sellBuyPercentage, (Object) takeProfit.sellBuyPercentage) && this.sellBuyType == takeProfit.sellBuyType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.priceIncreaseRatio.hashCode() * 31) + this.sellBuyPercentage.hashCode()) * 31) + this.sellBuyType.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TakeProfit(priceIncreaseRatio=" + this.priceIncreaseRatio + ", sellBuyPercentage=" + this.sellBuyPercentage + ", sellBuyType=" + this.sellBuyType + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.priceIncreaseRatio);
            parcel.writeString(this.sellBuyPercentage);
            parcel.writeParcelable(this.sellBuyType, i);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.dex.OKTDexTPSLStrategy.TakeProfit.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TakeProfit> serializer() {
                return OKTDexTPSLStrategy$TakeProfit$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TakeProfit(int i, String str, String str2, DexTPSLLabelType dexTPSLLabelType, DexTPSLLabelType dexTPSLLabelType2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, OKTDexTPSLStrategy$TakeProfit$$serializer.INSTANCE.getDescriptor());
            }
            this.priceIncreaseRatio = str;
            this.sellBuyPercentage = str2;
            this.sellBuyType = dexTPSLLabelType;
            if ((i & 8) == 0) {
                this.tpSlType = DexTPSLLabelType.TP;
            } else {
                this.tpSlType = dexTPSLLabelType2;
            }
        }

        public static final /* synthetic */ void EZpvd(TakeProfit takeProfit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKTDexTPSLStrategy.OLrzqt(takeProfit, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 0, takeProfit.priceIncreaseRatio);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, takeProfit.AEQbTJ());
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], takeProfit.AYXKKw());
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && takeProfit.AhwBna() == DexTPSLLabelType.TP) {
                return;
            }
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], takeProfit.AhwBna());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TakeProfit(@NotNull String str, @NotNull String str2, @NotNull DexTPSLLabelType dexTPSLLabelType) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(dexTPSLLabelType, "");
            this.priceIncreaseRatio = str;
            this.sellBuyPercentage = str2;
            this.sellBuyType = dexTPSLLabelType;
            this.tpSlType = DexTPSLLabelType.TP;
        }
    }

    @Serializable
    @SerialName("stopLoss")
    public static final class StopLoss extends OKTDexTPSLStrategy {
        public static final int $stable = 0;
        public final String priceDecreaseRatio;
        public final String sellBuyPercentage;
        public final DexTPSLLabelType sellBuyType;
        public final DexTPSLLabelType tpSlType;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<StopLoss> CREATOR = new Creator();
        public static final KSerializer<Object>[] $childSerializers = {null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.dex.DexTPSLLabelType", DexTPSLLabelType.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.dex.DexTPSLLabelType", DexTPSLLabelType.values())};

        public static final class Creator implements Parcelable.Creator<StopLoss> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StopLoss createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new StopLoss(parcel.readString(), parcel.readString(), (DexTPSLLabelType) parcel.readParcelable(StopLoss.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StopLoss[] newArray(int i) {
                return new StopLoss[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StopLoss copy$default(StopLoss stopLoss, String str, String str2, DexTPSLLabelType dexTPSLLabelType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stopLoss.priceDecreaseRatio;
            }
            if ((i & 2) != 0) {
                str2 = stopLoss.sellBuyPercentage;
            }
            if ((i & 4) != 0) {
                dexTPSLLabelType = stopLoss.sellBuyType;
            }
            return stopLoss.AEQbTJ(str, str2, dexTPSLLabelType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StopLoss AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull DexTPSLLabelType dexTPSLLabelType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(dexTPSLLabelType, "");
            return new StopLoss(str, str2, dexTPSLLabelType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String AEQbTJ() {
            return this.sellBuyPercentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DexTPSLLabelType AYXKKw() {
            return this.sellBuyType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DexTPSLLabelType AhwBna() {
            return this.tpSlType;
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
            if (!(obj instanceof StopLoss)) {
                return false;
            }
            StopLoss stopLoss = (StopLoss) obj;
            return Intrinsics.EZpvd((Object) this.priceDecreaseRatio, (Object) stopLoss.priceDecreaseRatio) && Intrinsics.EZpvd((Object) this.sellBuyPercentage, (Object) stopLoss.sellBuyPercentage) && this.sellBuyType == stopLoss.sellBuyType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.priceDecreaseRatio.hashCode() * 31) + this.sellBuyPercentage.hashCode()) * 31) + this.sellBuyType.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StopLoss(priceDecreaseRatio=" + this.priceDecreaseRatio + ", sellBuyPercentage=" + this.sellBuyPercentage + ", sellBuyType=" + this.sellBuyType + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.priceDecreaseRatio);
            parcel.writeString(this.sellBuyPercentage);
            parcel.writeParcelable(this.sellBuyType, i);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.dex.OKTDexTPSLStrategy.StopLoss.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<StopLoss> serializer() {
                return OKTDexTPSLStrategy$StopLoss$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StopLoss(int i, String str, String str2, DexTPSLLabelType dexTPSLLabelType, DexTPSLLabelType dexTPSLLabelType2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, OKTDexTPSLStrategy$StopLoss$$serializer.INSTANCE.getDescriptor());
            }
            this.priceDecreaseRatio = str;
            this.sellBuyPercentage = str2;
            this.sellBuyType = dexTPSLLabelType;
            if ((i & 8) == 0) {
                this.tpSlType = DexTPSLLabelType.SL;
            } else {
                this.tpSlType = dexTPSLLabelType2;
            }
        }

        public static final /* synthetic */ void KWHzl(StopLoss stopLoss, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKTDexTPSLStrategy.OLrzqt(stopLoss, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 0, stopLoss.priceDecreaseRatio);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, stopLoss.AEQbTJ());
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], stopLoss.AYXKKw());
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && stopLoss.AhwBna() == DexTPSLLabelType.SL) {
                return;
            }
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], stopLoss.AhwBna());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopLoss(@NotNull String str, @NotNull String str2, @NotNull DexTPSLLabelType dexTPSLLabelType) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(dexTPSLLabelType, "");
            this.priceDecreaseRatio = str;
            this.sellBuyPercentage = str2;
            this.sellBuyType = dexTPSLLabelType;
            this.tpSlType = DexTPSLLabelType.SL;
        }
    }
}
