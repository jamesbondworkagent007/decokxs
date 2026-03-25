package com.okinc.homepage.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class NoticesUIConfig implements Parcelable {
    private int cellSubtitleColor;
    private int cellSubtitleFont;
    private int cellTitleColor;
    private int cellTitleFont;
    private int titleColor;
    private int titleFont;
    private float titleTopMargin;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NoticesUIConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NoticesUIConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NoticesUIConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NoticesUIConfig(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NoticesUIConfig[] newArray(int i) {
            return new NoticesUIConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NoticesUIConfig() {
        this(0, 0, 0.0f, 0, 0, 0, 0, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NoticesUIConfig copy$default(NoticesUIConfig noticesUIConfig, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = noticesUIConfig.titleFont;
        }
        if ((i7 & 2) != 0) {
            i2 = noticesUIConfig.titleColor;
        }
        int i8 = i2;
        if ((i7 & 4) != 0) {
            f = noticesUIConfig.titleTopMargin;
        }
        float f2 = f;
        if ((i7 & 8) != 0) {
            i3 = noticesUIConfig.cellTitleFont;
        }
        int i9 = i3;
        if ((i7 & 16) != 0) {
            i4 = noticesUIConfig.cellTitleColor;
        }
        int i10 = i4;
        if ((i7 & 32) != 0) {
            i5 = noticesUIConfig.cellSubtitleFont;
        }
        int i11 = i5;
        if ((i7 & 64) != 0) {
            i6 = noticesUIConfig.cellSubtitleColor;
        }
        return noticesUIConfig.copy(i, i8, f2, i9, i10, i11, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.titleFont;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.titleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component3() {
        return this.titleTopMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.cellTitleFont;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.cellTitleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.cellSubtitleFont;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.cellSubtitleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NoticesUIConfig copy(int i, int i2, float f, int i3, int i4, int i5, int i6) {
        return new NoticesUIConfig(i, i2, f, i3, i4, i5, i6);
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
        if (!(obj instanceof NoticesUIConfig)) {
            return false;
        }
        NoticesUIConfig noticesUIConfig = (NoticesUIConfig) obj;
        return this.titleFont == noticesUIConfig.titleFont && this.titleColor == noticesUIConfig.titleColor && Float.compare(this.titleTopMargin, noticesUIConfig.titleTopMargin) == 0 && this.cellTitleFont == noticesUIConfig.cellTitleFont && this.cellTitleColor == noticesUIConfig.cellTitleColor && this.cellSubtitleFont == noticesUIConfig.cellSubtitleFont && this.cellSubtitleColor == noticesUIConfig.cellSubtitleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCellSubtitleColor() {
        return this.cellSubtitleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCellSubtitleFont() {
        return this.cellSubtitleFont;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCellTitleColor() {
        return this.cellTitleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCellTitleFont() {
        return this.cellTitleFont;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleColor() {
        return this.titleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleFont() {
        return this.titleFont;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getTitleTopMargin() {
        return this.titleTopMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Integer.hashCode(this.titleFont) * 31) + Integer.hashCode(this.titleColor)) * 31) + Float.hashCode(this.titleTopMargin)) * 31) + Integer.hashCode(this.cellTitleFont)) * 31) + Integer.hashCode(this.cellTitleColor)) * 31) + Integer.hashCode(this.cellSubtitleFont)) * 31) + Integer.hashCode(this.cellSubtitleColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCellSubtitleColor(int i) {
        this.cellSubtitleColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCellSubtitleFont(int i) {
        this.cellSubtitleFont = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCellTitleColor(int i) {
        this.cellTitleColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCellTitleFont(int i) {
        this.cellTitleFont = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleColor(int i) {
        this.titleColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleFont(int i) {
        this.titleFont = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleTopMargin(float f) {
        this.titleTopMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NoticesUIConfig(titleFont=" + this.titleFont + ", titleColor=" + this.titleColor + ", titleTopMargin=" + this.titleTopMargin + ", cellTitleFont=" + this.cellTitleFont + ", cellTitleColor=" + this.cellTitleColor + ", cellSubtitleFont=" + this.cellSubtitleFont + ", cellSubtitleColor=" + this.cellSubtitleColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.titleFont);
        parcel.writeInt(this.titleColor);
        parcel.writeFloat(this.titleTopMargin);
        parcel.writeInt(this.cellTitleFont);
        parcel.writeInt(this.cellTitleColor);
        parcel.writeInt(this.cellSubtitleFont);
        parcel.writeInt(this.cellSubtitleColor);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.homepage.bean.NoticesUIConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NoticesUIConfig> serializer() {
            return NoticesUIConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NoticesUIConfig(int i, int i2, int i3, float f, int i4, int i5, int i6, int i7, SerializationConstructorMarker serializationConstructorMarker) {
        this.titleFont = (i & 1) == 0 ? C52761wXj.LoaderManager.DGOPHZ : i2;
        if ((i & 2) == 0) {
            this.titleColor = C52761wXj.Activity.fdOvFl;
        } else {
            this.titleColor = i3;
        }
        if ((i & 4) == 0) {
            this.titleTopMargin = 16.0f;
        } else {
            this.titleTopMargin = f;
        }
        if ((i & 8) == 0) {
            this.cellTitleFont = C52761wXj.LoaderManager.gHZMYf;
        } else {
            this.cellTitleFont = i4;
        }
        if ((i & 16) == 0) {
            this.cellTitleColor = C52761wXj.Activity.fdOvFl;
        } else {
            this.cellTitleColor = i5;
        }
        if ((i & 32) == 0) {
            this.cellSubtitleFont = C52761wXj.LoaderManager.QOLQEE;
        } else {
            this.cellSubtitleFont = i6;
        }
        if ((i & 64) == 0) {
            this.cellSubtitleColor = C52761wXj.Activity.QwvEab;
        } else {
            this.cellSubtitleColor = i7;
        }
    }

    public static final /* synthetic */ void write$Self$OKHome_home_page_api(NoticesUIConfig noticesUIConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || noticesUIConfig.titleFont != C52761wXj.LoaderManager.DGOPHZ) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, noticesUIConfig.titleFont);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || noticesUIConfig.titleColor != C52761wXj.Activity.fdOvFl) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, noticesUIConfig.titleColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || Float.compare(noticesUIConfig.titleTopMargin, 16.0f) != 0) {
            compositeEncoder.encodeFloatElement(serialDescriptor, 2, noticesUIConfig.titleTopMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || noticesUIConfig.cellTitleFont != C52761wXj.LoaderManager.gHZMYf) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, noticesUIConfig.cellTitleFont);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || noticesUIConfig.cellTitleColor != C52761wXj.Activity.fdOvFl) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, noticesUIConfig.cellTitleColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || noticesUIConfig.cellSubtitleFont != C52761wXj.LoaderManager.QOLQEE) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, noticesUIConfig.cellSubtitleFont);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && noticesUIConfig.cellSubtitleColor == C52761wXj.Activity.QwvEab) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, noticesUIConfig.cellSubtitleColor);
    }

    public NoticesUIConfig(int i, int i2, float f, int i3, int i4, int i5, int i6) {
        this.titleFont = i;
        this.titleColor = i2;
        this.titleTopMargin = f;
        this.cellTitleFont = i3;
        this.cellTitleColor = i4;
        this.cellSubtitleFont = i5;
        this.cellSubtitleColor = i6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.LoaderManager.DGOPHZ int) : (r6v0 int))
  (wrap:int:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] o.wXj.Activity.fdOvFl int) : (r7v0 int))
  (wrap:float:0x0013: TERNARY null = ((wrap:int:0x000d: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (16.0f float) : (r8v0 float))
  (wrap:int:0x001a: TERNARY null = ((wrap:int:0x0014: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0018: SGET  A[WRAPPED] o.wXj.LoaderManager.gHZMYf int) : (r9v0 int))
  (wrap:int:0x0021: TERNARY null = ((wrap:int:0x001b: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x001f: SGET  A[WRAPPED] o.wXj.Activity.fdOvFl int) : (r10v0 int))
  (wrap:int:0x0028: TERNARY null = ((wrap:int:0x0022: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0026: SGET  A[WRAPPED] o.wXj.LoaderManager.QOLQEE int) : (r11v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0029: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x002d: SGET  A[WRAPPED] o.wXj.Activity.QwvEab int) : (r12v0 int))
 A[MD:(int, int, float, int, int, int, int):void (m)] (LINE:16) call: com.okinc.homepage.bean.NoticesUIConfig.<init>(int, int, float, int, int, int, int):void type: THIS */
    public /* synthetic */ NoticesUIConfig(int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? C52761wXj.LoaderManager.DGOPHZ : i, (i7 & 2) != 0 ? C52761wXj.Activity.fdOvFl : i2, (i7 & 4) != 0 ? 16.0f : f, (i7 & 8) != 0 ? C52761wXj.LoaderManager.gHZMYf : i3, (i7 & 16) != 0 ? C52761wXj.Activity.fdOvFl : i4, (i7 & 32) != 0 ? C52761wXj.LoaderManager.QOLQEE : i5, (i7 & 64) != 0 ? C52761wXj.Activity.QwvEab : i6);
    }
}
