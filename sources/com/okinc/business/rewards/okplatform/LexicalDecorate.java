package com.okinc.business.rewards.okplatform;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class LexicalDecorate implements Parcelable {
    private int textColor;
    private float textSizeH1;
    private float textSizeH2;
    private float textSizeH3;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LexicalDecorate> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<LexicalDecorate> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LexicalDecorate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LexicalDecorate(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LexicalDecorate[] newArray(int i) {
            return new LexicalDecorate[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LexicalDecorate copy$default(LexicalDecorate lexicalDecorate, float f, float f2, float f3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = lexicalDecorate.textSizeH1;
        }
        if ((i2 & 2) != 0) {
            f2 = lexicalDecorate.textSizeH2;
        }
        if ((i2 & 4) != 0) {
            f3 = lexicalDecorate.textSizeH3;
        }
        if ((i2 & 8) != 0) {
            i = lexicalDecorate.textColor;
        }
        return lexicalDecorate.copy(f, f2, f3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component1() {
        return this.textSizeH1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.textSizeH2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component3() {
        return this.textSizeH3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LexicalDecorate copy(float f, float f2, float f3, int i) {
        return new LexicalDecorate(f, f2, f3, i);
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
        if (!(obj instanceof LexicalDecorate)) {
            return false;
        }
        LexicalDecorate lexicalDecorate = (LexicalDecorate) obj;
        return Float.compare(this.textSizeH1, lexicalDecorate.textSizeH1) == 0 && Float.compare(this.textSizeH2, lexicalDecorate.textSizeH2) == 0 && Float.compare(this.textSizeH3, lexicalDecorate.textSizeH3) == 0 && this.textColor == lexicalDecorate.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getTextSizeH1() {
        return this.textSizeH1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getTextSizeH2() {
        return this.textSizeH2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getTextSizeH3() {
        return this.textSizeH3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Float.hashCode(this.textSizeH1) * 31) + Float.hashCode(this.textSizeH2)) * 31) + Float.hashCode(this.textSizeH3)) * 31) + Integer.hashCode(this.textColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextColor(int i) {
        this.textColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextSizeH1(float f) {
        this.textSizeH1 = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextSizeH2(float f) {
        this.textSizeH2 = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextSizeH3(float f) {
        this.textSizeH3 = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LexicalDecorate(textSizeH1=" + this.textSizeH1 + ", textSizeH2=" + this.textSizeH2 + ", textSizeH3=" + this.textSizeH3 + ", textColor=" + this.textColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeFloat(this.textSizeH1);
        parcel.writeFloat(this.textSizeH2);
        parcel.writeFloat(this.textSizeH3);
        parcel.writeInt(this.textColor);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.LexicalDecorate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LexicalDecorate> serializer() {
            return LexicalDecorate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LexicalDecorate(int i, float f, float f2, float f3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, LexicalDecorate$$serializer.INSTANCE.getDescriptor());
        }
        this.textSizeH1 = f;
        this.textSizeH2 = f2;
        this.textSizeH3 = f3;
        this.textColor = i2;
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(LexicalDecorate lexicalDecorate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeFloatElement(serialDescriptor, 0, lexicalDecorate.textSizeH1);
        compositeEncoder.encodeFloatElement(serialDescriptor, 1, lexicalDecorate.textSizeH2);
        compositeEncoder.encodeFloatElement(serialDescriptor, 2, lexicalDecorate.textSizeH3);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, lexicalDecorate.textColor);
    }

    public LexicalDecorate(float f, float f2, float f3, int i) {
        this.textSizeH1 = f;
        this.textSizeH2 = f2;
        this.textSizeH3 = f3;
        this.textColor = i;
    }
}
