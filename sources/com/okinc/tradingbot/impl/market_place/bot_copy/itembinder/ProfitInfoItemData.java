package com.okinc.tradingbot.impl.market_place.bot_copy.itembinder;

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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class ProfitInfoItemData implements Parcelable {
    public static final int $stable = 0;
    public final String pnlRatio;
    public final int textColor;
    public final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ProfitInfoItemData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ProfitInfoItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfitInfoItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProfitInfoItemData(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfitInfoItemData[] newArray(int i) {
            return new ProfitInfoItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProfitInfoItemData() {
        this((String) null, (String) null, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ProfitInfoItemData copy$default(ProfitInfoItemData profitInfoItemData, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = profitInfoItemData.type;
        }
        if ((i2 & 2) != 0) {
            str2 = profitInfoItemData.pnlRatio;
        }
        if ((i2 & 4) != 0) {
            i = profitInfoItemData.textColor;
        }
        return profitInfoItemData.KWHzl(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitInfoItemData KWHzl(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ProfitInfoItemData(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.type;
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
        if (!(obj instanceof ProfitInfoItemData)) {
            return false;
        }
        ProfitInfoItemData profitInfoItemData = (ProfitInfoItemData) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) profitInfoItemData.type) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) profitInfoItemData.pnlRatio) && this.textColor == profitInfoItemData.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.pnlRatio.hashCode()) * 31) + Integer.hashCode(this.textColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProfitInfoItemData(type=" + this.type + ", pnlRatio=" + this.pnlRatio + ", textColor=" + this.textColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.pnlRatio);
        parcel.writeInt(this.textColor);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.ProfitInfoItemData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProfitInfoItemData> serializer() {
            return ProfitInfoItemData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProfitInfoItemData(int i, String str, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str2;
        }
        if ((i & 4) == 0) {
            this.textColor = 0;
        } else {
            this.textColor = i2;
        }
    }

    public static final /* synthetic */ void EZpvd(ProfitInfoItemData profitInfoItemData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) profitInfoItemData.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, profitInfoItemData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) profitInfoItemData.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, profitInfoItemData.pnlRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && profitInfoItemData.textColor == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, profitInfoItemData.textColor);
    }

    public ProfitInfoItemData(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.pnlRatio = str2;
        this.textColor = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.String, java.lang.String, int):void (m)] (LINE:46) call: com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.ProfitInfoItemData.<init>(java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ ProfitInfoItemData(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
