package com.okinc.business.rewards.okplatform.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public class BaseRichTextBlock implements Parcelable {

    @SerializedName(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)
    private String direction;

    @SerializedName("indent")
    private int indent;

    @SerializedName("type")
    private String type;

    @SerializedName("version")
    private int version;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndent() {
        return this.indent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(String str) {
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndent(int i) {
        this.indent = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVersion(int i) {
        this.version = i;
    }

    public /* synthetic */ BaseRichTextBlock(int i, String str, int i2, String str2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.direction = null;
        } else {
            this.direction = str;
        }
        if ((i & 2) == 0) {
            this.indent = 0;
        } else {
            this.indent = i2;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 8) == 0) {
            this.version = 0;
        } else {
            this.version = i3;
        }
    }

    public static final /* synthetic */ void write$Self(BaseRichTextBlock baseRichTextBlock, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || baseRichTextBlock.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, baseRichTextBlock.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || baseRichTextBlock.indent != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, baseRichTextBlock.indent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || baseRichTextBlock.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, baseRichTextBlock.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && baseRichTextBlock.version == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, baseRichTextBlock.version);
    }

    public BaseRichTextBlock(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.direction = parcel.readString();
        this.indent = parcel.readInt();
        this.type = parcel.readString();
        this.version = parcel.readInt();
    }

    public BaseRichTextBlock() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.direction);
        parcel.writeInt(this.indent);
        parcel.writeString(this.type);
        parcel.writeInt(this.version);
    }

    public String toString() {
        return "BaseRichTextBlock(direction=" + this.direction + ", indent=" + this.indent + ", type=" + this.type + ", version=" + this.version + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<BaseRichTextBlock> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<BaseRichTextBlock> serializer() {
            return BaseRichTextBlock$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BaseRichTextBlock createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BaseRichTextBlock(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BaseRichTextBlock[] newArray(int i) {
            return new BaseRichTextBlock[i];
        }
    }
}
