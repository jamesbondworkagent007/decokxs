package com.okinc.business.trade.features.home.ui.autosell.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public abstract class AdvancedAutoSellStrategy implements Parcelable {
    public static final int $stable = 0;
    public static final int TYPE_STOP_LOSS = 2;
    public static final int TYPE_TAKE_PROFIT = 1;
    public static final Companion Companion = new Companion(null);
    public static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.lcP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AdvancedAutoSellStrategy.KWHzl();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AdvancedAutoSellStrategy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static final /* synthetic */ void AEQbTJ(AdvancedAutoSellStrategy advancedAutoSellStrategy, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public abstract String AEQbTJ();

    public abstract boolean AYXKKw();

    public abstract String copydefault();

    public abstract int djBIcL();

    public abstract String gEmmrt();

    public abstract String valueOf();

    private AdvancedAutoSellStrategy() {
    }

    public /* synthetic */ AdvancedAutoSellStrategy(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) AdvancedAutoSellStrategy.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AdvancedAutoSellStrategy> serializer() {
            return AEQbTJ();
        }
    }

    public static final /* synthetic */ KSerializer KWHzl() {
        return new SealedClassSerializer("com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy", C56524yIo.AEQbTJ(AdvancedAutoSellStrategy.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(StopLoss.class), C56524yIo.AEQbTJ(TakeProfit.class)}, new KSerializer[]{AdvancedAutoSellStrategy$StopLoss$$serializer.INSTANCE, AdvancedAutoSellStrategy$TakeProfit$$serializer.INSTANCE}, new Annotation[0]);
    }

    @Serializable
    @SerialName("takeProfit")
    public static final class TakeProfit extends AdvancedAutoSellStrategy {
        public static final int $stable = 0;
        public final boolean isRemoteConfig;
        public final String priceIncreaseRatio;
        public final String remoteConfigDesc;
        public final int remoteConfigId;
        public final String remoteConfigTitle;
        public final String sellPortion;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<TakeProfit> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<TakeProfit> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TakeProfit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TakeProfit(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt());
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
        public static /* synthetic */ TakeProfit copy$default(TakeProfit takeProfit, String str, String str2, boolean z, String str3, String str4, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = takeProfit.priceIncreaseRatio;
            }
            if ((i2 & 2) != 0) {
                str2 = takeProfit.sellPortion;
            }
            String str5 = str2;
            if ((i2 & 4) != 0) {
                z = takeProfit.isRemoteConfig;
            }
            boolean z2 = z;
            if ((i2 & 8) != 0) {
                str3 = takeProfit.remoteConfigTitle;
            }
            String str6 = str3;
            if ((i2 & 16) != 0) {
                str4 = takeProfit.remoteConfigDesc;
            }
            String str7 = str4;
            if ((i2 & 32) != 0) {
                i = takeProfit.remoteConfigId;
            }
            return takeProfit.EZpvd(str, str5, z2, str6, str7, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy
        public String AEQbTJ() {
            return this.remoteConfigDesc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy
        public boolean AYXKKw() {
            return this.isRemoteConfig;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.priceIncreaseRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TakeProfit EZpvd(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new TakeProfit(str, str2, z, str3, str4, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy
        public String copydefault() {
            return this.priceIncreaseRatio;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy
        public int djBIcL() {
            return this.remoteConfigId;
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
            return Intrinsics.EZpvd((Object) this.priceIncreaseRatio, (Object) takeProfit.priceIncreaseRatio) && Intrinsics.EZpvd((Object) this.sellPortion, (Object) takeProfit.sellPortion) && this.isRemoteConfig == takeProfit.isRemoteConfig && Intrinsics.EZpvd((Object) this.remoteConfigTitle, (Object) takeProfit.remoteConfigTitle) && Intrinsics.EZpvd((Object) this.remoteConfigDesc, (Object) takeProfit.remoteConfigDesc) && this.remoteConfigId == takeProfit.remoteConfigId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy
        public String gEmmrt() {
            return this.sellPortion;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.priceIncreaseRatio.hashCode() * 31) + this.sellPortion.hashCode()) * 31) + Boolean.hashCode(this.isRemoteConfig)) * 31) + this.remoteConfigTitle.hashCode()) * 31) + this.remoteConfigDesc.hashCode()) * 31) + Integer.hashCode(this.remoteConfigId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TakeProfit(priceIncreaseRatio=" + this.priceIncreaseRatio + ", sellPortion=" + this.sellPortion + ", isRemoteConfig=" + this.isRemoteConfig + ", remoteConfigTitle=" + this.remoteConfigTitle + ", remoteConfigDesc=" + this.remoteConfigDesc + ", remoteConfigId=" + this.remoteConfigId + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy
        public String valueOf() {
            return this.remoteConfigTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.priceIncreaseRatio);
            parcel.writeString(this.sellPortion);
            parcel.writeInt(this.isRemoteConfig ? 1 : 0);
            parcel.writeString(this.remoteConfigTitle);
            parcel.writeString(this.remoteConfigDesc);
            parcel.writeInt(this.remoteConfigId);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy.TakeProfit.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TakeProfit> serializer() {
                return AdvancedAutoSellStrategy$TakeProfit$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TakeProfit(int i, String str, String str2, boolean z, String str3, String str4, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, AdvancedAutoSellStrategy$TakeProfit$$serializer.INSTANCE.getDescriptor());
            }
            this.priceIncreaseRatio = str;
            this.sellPortion = str2;
            if ((i & 4) == 0) {
                this.isRemoteConfig = false;
            } else {
                this.isRemoteConfig = z;
            }
            if ((i & 8) == 0) {
                this.remoteConfigTitle = "";
            } else {
                this.remoteConfigTitle = str3;
            }
            if ((i & 16) == 0) {
                this.remoteConfigDesc = "";
            } else {
                this.remoteConfigDesc = str4;
            }
            if ((i & 32) == 0) {
                this.remoteConfigId = -1;
            } else {
                this.remoteConfigId = i2;
            }
        }

        public static final /* synthetic */ void KWHzl(TakeProfit takeProfit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            AdvancedAutoSellStrategy.AEQbTJ(takeProfit, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 0, takeProfit.priceIncreaseRatio);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, takeProfit.gEmmrt());
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || takeProfit.AYXKKw()) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 2, takeProfit.AYXKKw());
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) takeProfit.valueOf(), (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, takeProfit.valueOf());
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) takeProfit.AEQbTJ(), (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 4, takeProfit.AEQbTJ());
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && takeProfit.djBIcL() == -1) {
                return;
            }
            compositeEncoder.encodeIntElement(serialDescriptor, 5, takeProfit.djBIcL());
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r13v0 int))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int):void (m)] (LINE:33) call: com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy.TakeProfit.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int):void type: THIS */
        public /* synthetic */ TakeProfit(String str, String str2, boolean z, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? -1 : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TakeProfit(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.priceIncreaseRatio = str;
            this.sellPortion = str2;
            this.isRemoteConfig = z;
            this.remoteConfigTitle = str3;
            this.remoteConfigDesc = str4;
            this.remoteConfigId = i;
        }
    }

    @Serializable
    @SerialName("stopLoss")
    public static final class StopLoss extends AdvancedAutoSellStrategy {
        public static final int $stable = 0;
        public final boolean isRemoteConfig;
        public final String priceDecreaseRatio;
        public final String remoteConfigDesc;
        public final int remoteConfigId;
        public final String remoteConfigTitle;
        public final String sellPortion;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<StopLoss> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<StopLoss> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StopLoss createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new StopLoss(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt());
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
        public static /* synthetic */ StopLoss copy$default(StopLoss stopLoss, String str, String str2, boolean z, String str3, String str4, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = stopLoss.priceDecreaseRatio;
            }
            if ((i2 & 2) != 0) {
                str2 = stopLoss.sellPortion;
            }
            String str5 = str2;
            if ((i2 & 4) != 0) {
                z = stopLoss.isRemoteConfig;
            }
            boolean z2 = z;
            if ((i2 & 8) != 0) {
                str3 = stopLoss.remoteConfigTitle;
            }
            String str6 = str3;
            if ((i2 & 16) != 0) {
                str4 = stopLoss.remoteConfigDesc;
            }
            String str7 = str4;
            if ((i2 & 32) != 0) {
                i = stopLoss.remoteConfigId;
            }
            return stopLoss.EZpvd(str, str5, z2, str6, str7, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy
        public String AEQbTJ() {
            return this.remoteConfigDesc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy
        public boolean AYXKKw() {
            return this.isRemoteConfig;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.priceDecreaseRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StopLoss EZpvd(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new StopLoss(str, str2, z, str3, str4, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy
        public String copydefault() {
            return this.priceDecreaseRatio;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy
        public int djBIcL() {
            return this.remoteConfigId;
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
            return Intrinsics.EZpvd((Object) this.priceDecreaseRatio, (Object) stopLoss.priceDecreaseRatio) && Intrinsics.EZpvd((Object) this.sellPortion, (Object) stopLoss.sellPortion) && this.isRemoteConfig == stopLoss.isRemoteConfig && Intrinsics.EZpvd((Object) this.remoteConfigTitle, (Object) stopLoss.remoteConfigTitle) && Intrinsics.EZpvd((Object) this.remoteConfigDesc, (Object) stopLoss.remoteConfigDesc) && this.remoteConfigId == stopLoss.remoteConfigId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy
        public String gEmmrt() {
            return this.sellPortion;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.priceDecreaseRatio.hashCode() * 31) + this.sellPortion.hashCode()) * 31) + Boolean.hashCode(this.isRemoteConfig)) * 31) + this.remoteConfigTitle.hashCode()) * 31) + this.remoteConfigDesc.hashCode()) * 31) + Integer.hashCode(this.remoteConfigId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StopLoss(priceDecreaseRatio=" + this.priceDecreaseRatio + ", sellPortion=" + this.sellPortion + ", isRemoteConfig=" + this.isRemoteConfig + ", remoteConfigTitle=" + this.remoteConfigTitle + ", remoteConfigDesc=" + this.remoteConfigDesc + ", remoteConfigId=" + this.remoteConfigId + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy
        public String valueOf() {
            return this.remoteConfigTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.priceDecreaseRatio);
            parcel.writeString(this.sellPortion);
            parcel.writeInt(this.isRemoteConfig ? 1 : 0);
            parcel.writeString(this.remoteConfigTitle);
            parcel.writeString(this.remoteConfigDesc);
            parcel.writeInt(this.remoteConfigId);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy.StopLoss.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<StopLoss> serializer() {
                return AdvancedAutoSellStrategy$StopLoss$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StopLoss(int i, String str, String str2, boolean z, String str3, String str4, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, AdvancedAutoSellStrategy$StopLoss$$serializer.INSTANCE.getDescriptor());
            }
            this.priceDecreaseRatio = str;
            this.sellPortion = str2;
            if ((i & 4) == 0) {
                this.isRemoteConfig = false;
            } else {
                this.isRemoteConfig = z;
            }
            if ((i & 8) == 0) {
                this.remoteConfigTitle = "";
            } else {
                this.remoteConfigTitle = str3;
            }
            if ((i & 16) == 0) {
                this.remoteConfigDesc = "";
            } else {
                this.remoteConfigDesc = str4;
            }
            if ((i & 32) == 0) {
                this.remoteConfigId = -1;
            } else {
                this.remoteConfigId = i2;
            }
        }

        public static final /* synthetic */ void OLrzqt(StopLoss stopLoss, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            AdvancedAutoSellStrategy.AEQbTJ(stopLoss, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 0, stopLoss.priceDecreaseRatio);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, stopLoss.gEmmrt());
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || stopLoss.AYXKKw()) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 2, stopLoss.AYXKKw());
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) stopLoss.valueOf(), (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, stopLoss.valueOf());
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) stopLoss.AEQbTJ(), (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 4, stopLoss.AEQbTJ());
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && stopLoss.djBIcL() == -1) {
                return;
            }
            compositeEncoder.encodeIntElement(serialDescriptor, 5, stopLoss.djBIcL());
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r13v0 int))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int):void (m)] (LINE:47) call: com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy.StopLoss.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int):void type: THIS */
        public /* synthetic */ StopLoss(String str, String str2, boolean z, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? -1 : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopLoss(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.priceDecreaseRatio = str;
            this.sellPortion = str2;
            this.isRemoteConfig = z;
            this.remoteConfigTitle = str3;
            this.remoteConfigDesc = str4;
            this.remoteConfigId = i;
        }
    }
}
