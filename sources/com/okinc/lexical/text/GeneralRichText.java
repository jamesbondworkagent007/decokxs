package com.okinc.lexical.text;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class GeneralRichText extends BaseRichTextBlock implements Parcelable {

    @SerializedName("detail")
    private int detail;

    @SerializedName("format")
    private int format;

    @SerializedName(OtcExtraKeys.MODE)
    private String mode;

    @SerializedName(TtmlNode.TAG_STYLE)
    private String style;

    @SerializedName("text")
    private String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GeneralRichText> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GeneralRichText> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GeneralRichText createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GeneralRichText(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GeneralRichText[] newArray(int i) {
            return new GeneralRichText[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GeneralRichText() {
        this(0, null, null, null, 0, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component2() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GeneralRichText copy$default(GeneralRichText generalRichText, int i, String str, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = generalRichText.detail;
        }
        if ((i3 & 2) != 0) {
            str = generalRichText.mode;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = generalRichText.style;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = generalRichText.text;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            i2 = generalRichText.format;
        }
        return generalRichText.copy(i, str4, str5, str6, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.detail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.format;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GeneralRichText copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new GeneralRichText(i, str, str2, str3, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralRichText)) {
            return false;
        }
        GeneralRichText generalRichText = (GeneralRichText) obj;
        return this.detail == generalRichText.detail && Intrinsics.EZpvd((Object) this.mode, (Object) generalRichText.mode) && Intrinsics.EZpvd((Object) this.style, (Object) generalRichText.style) && Intrinsics.EZpvd((Object) this.text, (Object) generalRichText.text) && this.format == generalRichText.format;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDetail() {
        return this.detail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFormat() {
        return this.format;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStyle() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.detail) * 31) + this.mode.hashCode()) * 31) + this.style.hashCode()) * 31) + this.text.hashCode()) * 31) + Integer.hashCode(this.format);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetail(int i) {
        this.detail = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormat(int i) {
        this.format = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStyle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.style = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.detail);
        parcel.writeString(this.mode);
        parcel.writeString(this.style);
        parcel.writeString(this.text);
        parcel.writeInt(this.format);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.lexical.text.GeneralRichText.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GeneralRichText> serializer() {
            return GeneralRichText$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ GeneralRichText(int i, int i2, String str, int i3, String str2, int i4, String str3, String str4, String str5, int i5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, (String) Integer.valueOf(i2), ((Number) str).intValue(), (String) Integer.valueOf(i3), ((Number) str2).intValue(), serializationConstructorMarker);
        if ((i & 16) == 0) {
            this.detail = 0;
        } else {
            this.detail = i4;
        }
        if ((i & 32) == 0) {
            this.mode = "";
        } else {
            this.mode = str3;
        }
        if ((i & 64) == 0) {
            this.style = "";
        } else {
            this.style = str4;
        }
        if ((i & 128) == 0) {
            this.text = "";
        } else {
            this.text = str5;
        }
        if ((i & 256) == 0) {
            this.format = 0;
        } else {
            this.format = i5;
        }
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_biz_rewards(GeneralRichText generalRichText, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseRichTextBlock.write$Self(generalRichText, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || generalRichText.detail != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, generalRichText.detail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) generalRichText.mode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, generalRichText.mode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) generalRichText.style, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, generalRichText.style);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) generalRichText.text, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, generalRichText.text);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && generalRichText.format == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 8, generalRichText.format);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:17) call: com.okinc.lexical.text.GeneralRichText.<init>(int, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ GeneralRichText(int i, String str, String str2, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) == 0 ? str3 : "", (i3 & 16) != 0 ? 0 : i2);
    }

    public GeneralRichText(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.detail = i;
        this.mode = str;
        this.style = str2;
        this.text = str3;
        this.format = i2;
    }

    @Override // com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock
    public String toString() {
        return "GeneralRichText(detail=" + this.detail + ", format=" + this.format + ", mode=" + this.mode + ", style=" + this.style + ", text=" + this.text + ") " + super.toString();
    }
}
