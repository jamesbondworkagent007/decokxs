package com.okinc.unify_trade.bot.data;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class LabelData implements Parcelable {
    public static final int $stable = 0;
    private final float bottomMargin;
    private final String title;
    private final int titleColor;
    private final int titleSize;
    private final int titleStyle;
    private final float topMargin;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LabelData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LabelData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LabelData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LabelData(parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LabelData[] newArray(int i) {
            return new LabelData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LabelData() {
        this((String) null, 0.0f, 0.0f, 0, 0, 0, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LabelData copy$default(LabelData labelData, String str, float f, float f2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = labelData.title;
        }
        if ((i4 & 2) != 0) {
            f = labelData.topMargin;
        }
        float f3 = f;
        if ((i4 & 4) != 0) {
            f2 = labelData.bottomMargin;
        }
        float f4 = f2;
        if ((i4 & 8) != 0) {
            i = labelData.titleStyle;
        }
        int i5 = i;
        if ((i4 & 16) != 0) {
            i2 = labelData.titleColor;
        }
        int i6 = i2;
        if ((i4 & 32) != 0) {
            i3 = labelData.titleSize;
        }
        return labelData.copy(str, f3, f4, i5, i6, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.topMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component3() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.titleStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.titleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.titleSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LabelData copy(@NotNull String str, float f, float f2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LabelData(str, f, f2, i, i2, i3);
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
        if (!(obj instanceof LabelData)) {
            return false;
        }
        LabelData labelData = (LabelData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) labelData.title) && Float.compare(this.topMargin, labelData.topMargin) == 0 && Float.compare(this.bottomMargin, labelData.bottomMargin) == 0 && this.titleStyle == labelData.titleStyle && this.titleColor == labelData.titleColor && this.titleSize == labelData.titleSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleColor() {
        return this.titleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleSize() {
        return this.titleSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleStyle() {
        return this.titleStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getTopMargin() {
        return this.topMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + Float.hashCode(this.topMargin)) * 31) + Float.hashCode(this.bottomMargin)) * 31) + Integer.hashCode(this.titleStyle)) * 31) + Integer.hashCode(this.titleColor)) * 31) + Integer.hashCode(this.titleSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LabelData(title=" + this.title + ", topMargin=" + this.topMargin + ", bottomMargin=" + this.bottomMargin + ", titleStyle=" + this.titleStyle + ", titleColor=" + this.titleColor + ", titleSize=" + this.titleSize + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeFloat(this.topMargin);
        parcel.writeFloat(this.bottomMargin);
        parcel.writeInt(this.titleStyle);
        parcel.writeInt(this.titleColor);
        parcel.writeInt(this.titleSize);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.LabelData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LabelData> serializer() {
            return LabelData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LabelData(int i, String str, float f, float f2, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.topMargin = 16.0f;
        } else {
            this.topMargin = f;
        }
        if ((i & 4) == 0) {
            this.bottomMargin = 10.0f;
        } else {
            this.bottomMargin = f2;
        }
        if ((i & 8) == 0) {
            this.titleStyle = 0;
        } else {
            this.titleStyle = i2;
        }
        if ((i & 16) == 0) {
            this.titleColor = 0;
        } else {
            this.titleColor = i3;
        }
        if ((i & 32) == 0) {
            this.titleSize = 0;
        } else {
            this.titleSize = i4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(LabelData labelData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) labelData.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, labelData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || Float.compare(labelData.topMargin, 16.0f) != 0) {
            compositeEncoder.encodeFloatElement(serialDescriptor, 1, labelData.topMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || Float.compare(labelData.bottomMargin, 10.0f) != 0) {
            compositeEncoder.encodeFloatElement(serialDescriptor, 2, labelData.bottomMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || labelData.titleStyle != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, labelData.titleStyle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || labelData.titleColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, labelData.titleColor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && labelData.titleSize == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 5, labelData.titleSize);
    }

    public LabelData(@NotNull String str, float f, float f2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.topMargin = f;
        this.bottomMargin = f2;
        this.titleStyle = i;
        this.titleColor = i2;
        this.titleSize = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:float:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (16.0f float) : (r6v0 float))
  (wrap:float:0x0013: TERNARY null = ((wrap:int:0x000d: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (10.0f float) : (r7v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
 A[MD:(java.lang.String, float, float, int, int, int):void (m)] (LINE:1410) call: com.okinc.unify_trade.bot.data.LabelData.<init>(java.lang.String, float, float, int, int, int):void type: THIS */
    public /* synthetic */ LabelData(String str, float f, float f2, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 16.0f : f, (i4 & 4) != 0 ? 10.0f : f2, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3);
    }
}
