package com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy;
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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public abstract class CopyTradingAutoSellStrategy implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.gUP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return CopyTradingAutoSellStrategy.EZpvd();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CopyTradingAutoSellStrategy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static final /* synthetic */ void OLrzqt(CopyTradingAutoSellStrategy copyTradingAutoSellStrategy, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public abstract String KWHzl();

    public abstract String OLrzqt();

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) CopyTradingAutoSellStrategy.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<CopyTradingAutoSellStrategy> serializer() {
            return OLrzqt();
        }
    }

    private CopyTradingAutoSellStrategy() {
    }

    public /* synthetic */ CopyTradingAutoSellStrategy(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    public static final /* synthetic */ KSerializer EZpvd() {
        return new SealedClassSerializer("com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy", C56524yIo.AEQbTJ(CopyTradingAutoSellStrategy.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(StopLoss.class), C56524yIo.AEQbTJ(TakeProfit.class)}, new KSerializer[]{CopyTradingAutoSellStrategy$StopLoss$$serializer.INSTANCE, CopyTradingAutoSellStrategy$TakeProfit$$serializer.INSTANCE}, new Annotation[0]);
    }

    @Serializable
    @SerialName("takeProfit")
    public static final class TakeProfit extends CopyTradingAutoSellStrategy {
        public static final int $stable = 0;
        public final String priceIncreaseRatio;
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
                return new TakeProfit(parcel.readString(), parcel.readString());
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
        public static /* synthetic */ TakeProfit copy$default(TakeProfit takeProfit, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = takeProfit.priceIncreaseRatio;
            }
            if ((i & 2) != 0) {
                str2 = takeProfit.sellPortion;
            }
            return takeProfit.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.priceIncreaseRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TakeProfit KWHzl(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TakeProfit(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy
        public String KWHzl() {
            return this.sellPortion;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy
        public String OLrzqt() {
            return this.priceIncreaseRatio;
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
            return Intrinsics.EZpvd((Object) this.priceIncreaseRatio, (Object) takeProfit.priceIncreaseRatio) && Intrinsics.EZpvd((Object) this.sellPortion, (Object) takeProfit.sellPortion);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.priceIncreaseRatio.hashCode() * 31) + this.sellPortion.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TakeProfit(priceIncreaseRatio=" + this.priceIncreaseRatio + ", sellPortion=" + this.sellPortion + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.priceIncreaseRatio);
            parcel.writeString(this.sellPortion);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy.TakeProfit.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TakeProfit> serializer() {
                return CopyTradingAutoSellStrategy$TakeProfit$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TakeProfit(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, CopyTradingAutoSellStrategy$TakeProfit$$serializer.INSTANCE.getDescriptor());
            }
            this.priceIncreaseRatio = str;
            this.sellPortion = str2;
        }

        public static final /* synthetic */ void OLrzqt(TakeProfit takeProfit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            CopyTradingAutoSellStrategy.OLrzqt(takeProfit, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 0, takeProfit.priceIncreaseRatio);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, takeProfit.KWHzl());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TakeProfit(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.priceIncreaseRatio = str;
            this.sellPortion = str2;
        }
    }

    @Serializable
    @SerialName("stopLoss")
    public static final class StopLoss extends CopyTradingAutoSellStrategy {
        public static final int $stable = 0;
        public final String priceDecreaseRatio;
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
                return new StopLoss(parcel.readString(), parcel.readString());
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
        public static /* synthetic */ StopLoss copy$default(StopLoss stopLoss, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stopLoss.priceDecreaseRatio;
            }
            if ((i & 2) != 0) {
                str2 = stopLoss.sellPortion;
            }
            return stopLoss.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StopLoss EZpvd(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StopLoss(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy
        public String KWHzl() {
            return this.sellPortion;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy
        public String OLrzqt() {
            return this.priceDecreaseRatio;
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
            return Intrinsics.EZpvd((Object) this.priceDecreaseRatio, (Object) stopLoss.priceDecreaseRatio) && Intrinsics.EZpvd((Object) this.sellPortion, (Object) stopLoss.sellPortion);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.priceDecreaseRatio.hashCode() * 31) + this.sellPortion.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StopLoss(priceDecreaseRatio=" + this.priceDecreaseRatio + ", sellPortion=" + this.sellPortion + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.priceDecreaseRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.priceDecreaseRatio);
            parcel.writeString(this.sellPortion);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy.StopLoss.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<StopLoss> serializer() {
                return CopyTradingAutoSellStrategy$StopLoss$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StopLoss(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, CopyTradingAutoSellStrategy$StopLoss$$serializer.INSTANCE.getDescriptor());
            }
            this.priceDecreaseRatio = str;
            this.sellPortion = str2;
        }

        public static final /* synthetic */ void KWHzl(StopLoss stopLoss, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            CopyTradingAutoSellStrategy.OLrzqt(stopLoss, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 0, stopLoss.priceDecreaseRatio);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, stopLoss.KWHzl());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopLoss(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.priceDecreaseRatio = str;
            this.sellPortion = str2;
        }
    }
}
