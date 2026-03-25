package com.okinc.kline.data;

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

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class PriceWarningItemBean implements Parcelable {
    private int active;
    private int bizType;
    private long createTime;
    private boolean dragChange;
    private String instrumentName;
    private String promptThreshold;
    private int promptType;
    private int repeatType;
    private String ruleId;
    private boolean selected;
    private int sourceType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PriceWarningItemBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PriceWarningItemBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceWarningItemBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PriceWarningItemBean(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceWarningItemBean[] newArray(int i) {
            return new PriceWarningItemBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriceWarningItemBean() {
        this((String) null, 0, (String) null, 0, 0, (String) null, 0L, false, 0, false, 0, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.dragChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceWarningItemBean copy(@NotNull String str, int i, @NotNull String str2, int i2, int i3, @NotNull String str3, long j, boolean z, int i4, boolean z2, int i5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PriceWarningItemBean(str, i, str2, i2, i3, str3, j, z, i4, z2, i5);
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
        if (!(obj instanceof PriceWarningItemBean)) {
            return false;
        }
        PriceWarningItemBean priceWarningItemBean = (PriceWarningItemBean) obj;
        return Intrinsics.EZpvd((Object) this.ruleId, (Object) priceWarningItemBean.ruleId) && this.bizType == priceWarningItemBean.bizType && Intrinsics.EZpvd((Object) this.instrumentName, (Object) priceWarningItemBean.instrumentName) && this.promptType == priceWarningItemBean.promptType && this.repeatType == priceWarningItemBean.repeatType && Intrinsics.EZpvd((Object) this.promptThreshold, (Object) priceWarningItemBean.promptThreshold) && this.createTime == priceWarningItemBean.createTime && this.selected == priceWarningItemBean.selected && this.active == priceWarningItemBean.active && this.dragChange == priceWarningItemBean.dragChange && this.sourceType == priceWarningItemBean.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getActive() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDragChange() {
        return this.dragChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPromptThreshold() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPromptType() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatType() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleId() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.ruleId.hashCode() * 31) + Integer.hashCode(this.bizType)) * 31) + this.instrumentName.hashCode()) * 31) + Integer.hashCode(this.promptType)) * 31) + Integer.hashCode(this.repeatType)) * 31) + this.promptThreshold.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Boolean.hashCode(this.selected)) * 31) + Integer.hashCode(this.active)) * 31) + Boolean.hashCode(this.dragChange)) * 31) + Integer.hashCode(this.sourceType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActive(int i) {
        this.active = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(int i) {
        this.bizType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDragChange(boolean z) {
        this.dragChange = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstrumentName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instrumentName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPromptThreshold(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.promptThreshold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPromptType(int i) {
        this.promptType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepeatType(int i) {
        this.repeatType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRuleId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ruleId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.selected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceType(int i) {
        this.sourceType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceWarningItemBean(ruleId=" + this.ruleId + ", bizType=" + this.bizType + ", instrumentName=" + this.instrumentName + ", promptType=" + this.promptType + ", repeatType=" + this.repeatType + ", promptThreshold=" + this.promptThreshold + ", createTime=" + this.createTime + ", selected=" + this.selected + ", active=" + this.active + ", dragChange=" + this.dragChange + ", sourceType=" + this.sourceType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ruleId);
        parcel.writeInt(this.bizType);
        parcel.writeString(this.instrumentName);
        parcel.writeInt(this.promptType);
        parcel.writeInt(this.repeatType);
        parcel.writeString(this.promptThreshold);
        parcel.writeLong(this.createTime);
        parcel.writeInt(this.selected ? 1 : 0);
        parcel.writeInt(this.active);
        parcel.writeInt(this.dragChange ? 1 : 0);
        parcel.writeInt(this.sourceType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.data.PriceWarningItemBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceWarningItemBean> serializer() {
            return PriceWarningItemBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceWarningItemBean(int i, String str, int i2, String str2, int i3, int i4, String str3, long j, boolean z, int i5, boolean z2, int i6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ruleId = "";
        } else {
            this.ruleId = str;
        }
        if ((i & 2) == 0) {
            this.bizType = 0;
        } else {
            this.bizType = i2;
        }
        if ((i & 4) == 0) {
            this.instrumentName = "";
        } else {
            this.instrumentName = str2;
        }
        if ((i & 8) == 0) {
            this.promptType = 0;
        } else {
            this.promptType = i3;
        }
        if ((i & 16) == 0) {
            this.repeatType = 0;
        } else {
            this.repeatType = i4;
        }
        if ((i & 32) == 0) {
            this.promptThreshold = "";
        } else {
            this.promptThreshold = str3;
        }
        if ((i & 64) == 0) {
            this.createTime = 0L;
        } else {
            this.createTime = j;
        }
        if ((i & 128) == 0) {
            this.selected = false;
        } else {
            this.selected = z;
        }
        if ((i & 256) == 0) {
            this.active = 1;
        } else {
            this.active = i5;
        }
        if ((i & 512) == 0) {
            this.dragChange = false;
        } else {
            this.dragChange = z2;
        }
        if ((i & 1024) == 0) {
            this.sourceType = 1;
        } else {
            this.sourceType = i6;
        }
    }

    public static final /* synthetic */ void write$Self$OKCandleStickChart_chart_impl(PriceWarningItemBean priceWarningItemBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) priceWarningItemBean.ruleId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, priceWarningItemBean.ruleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || priceWarningItemBean.bizType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, priceWarningItemBean.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) priceWarningItemBean.instrumentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, priceWarningItemBean.instrumentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || priceWarningItemBean.promptType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, priceWarningItemBean.promptType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || priceWarningItemBean.repeatType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, priceWarningItemBean.repeatType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) priceWarningItemBean.promptThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, priceWarningItemBean.promptThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || priceWarningItemBean.createTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, priceWarningItemBean.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || priceWarningItemBean.selected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, priceWarningItemBean.selected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || priceWarningItemBean.active != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, priceWarningItemBean.active);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || priceWarningItemBean.dragChange) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, priceWarningItemBean.dragChange);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && priceWarningItemBean.sourceType == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 10, priceWarningItemBean.sourceType);
    }

    public PriceWarningItemBean(@NotNull String str, int i, @NotNull String str2, int i2, int i3, @NotNull String str3, long j, boolean z, int i4, boolean z2, int i5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ruleId = str;
        this.bizType = i;
        this.instrumentName = str2;
        this.promptType = i2;
        this.repeatType = i3;
        this.promptThreshold = str3;
        this.createTime = j;
        this.selected = z;
        this.active = i4;
        this.dragChange = z2;
        this.sourceType = i5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0072: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r27v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0033: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r21v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0044: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r24v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r27v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r25v0 boolean) : false)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0054: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r26v0 int) : (1 int))
 A[MD:(java.lang.String, int, java.lang.String, int, int, java.lang.String, long, boolean, int, boolean, int):void (m)] (LINE:38) call: com.okinc.kline.data.PriceWarningItemBean.<init>(java.lang.String, int, java.lang.String, int, int, java.lang.String, long, boolean, int, boolean, int):void type: THIS */
    public /* synthetic */ PriceWarningItemBean(String str, int i, String str2, int i2, int i3, String str3, long j, boolean z, int i4, boolean z2, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? 0 : i3, (i6 & 32) == 0 ? str3 : "", (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? false : z, (i6 & 256) != 0 ? 1 : i4, (i6 & 512) == 0 ? z2 : false, (i6 & 1024) == 0 ? i5 : 1);
    }
}
