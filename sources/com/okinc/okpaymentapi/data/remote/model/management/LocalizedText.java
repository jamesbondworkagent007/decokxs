package com.okinc.okpaymentapi.data.remote.model.management;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class LocalizedText implements Parcelable {
    public static final int $stable = 0;
    private final String content;
    private final String holdToEarnText;
    private final String previewBody;
    private final String previewTitle;
    private final boolean showLearnMore;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LocalizedText> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LocalizedText> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizedText createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LocalizedText(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizedText[] newArray(int i) {
            return new LocalizedText[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LocalizedText() {
        this(false, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LocalizedText copy$default(LocalizedText localizedText, boolean z, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = localizedText.showLearnMore;
        }
        if ((i & 2) != 0) {
            str = localizedText.title;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = localizedText.content;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = localizedText.previewTitle;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = localizedText.previewBody;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = localizedText.holdToEarnText;
        }
        return localizedText.copy(z, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.showLearnMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.previewTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.previewBody;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.holdToEarnText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizedText copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new LocalizedText(z, str, str2, str3, str4, str5);
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
        if (!(obj instanceof LocalizedText)) {
            return false;
        }
        LocalizedText localizedText = (LocalizedText) obj;
        return this.showLearnMore == localizedText.showLearnMore && Intrinsics.EZpvd((Object) this.title, (Object) localizedText.title) && Intrinsics.EZpvd((Object) this.content, (Object) localizedText.content) && Intrinsics.EZpvd((Object) this.previewTitle, (Object) localizedText.previewTitle) && Intrinsics.EZpvd((Object) this.previewBody, (Object) localizedText.previewBody) && Intrinsics.EZpvd((Object) this.holdToEarnText, (Object) localizedText.holdToEarnText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldToEarnText() {
        return this.holdToEarnText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreviewBody() {
        return this.previewBody;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreviewTitle() {
        return this.previewTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowLearnMore() {
        return this.showLearnMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Boolean.hashCode(this.showLearnMore) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + this.previewTitle.hashCode()) * 31) + this.previewBody.hashCode()) * 31) + this.holdToEarnText.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LocalizedText(showLearnMore=" + this.showLearnMore + ", title=" + this.title + ", content=" + this.content + ", previewTitle=" + this.previewTitle + ", previewBody=" + this.previewBody + ", holdToEarnText=" + this.holdToEarnText + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.showLearnMore ? 1 : 0);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.previewTitle);
        parcel.writeString(this.previewBody);
        parcel.writeString(this.holdToEarnText);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.LocalizedText.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LocalizedText> serializer() {
            return LocalizedText$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LocalizedText(int i, boolean z, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        this.showLearnMore = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.content = "";
        } else {
            this.content = str2;
        }
        if ((i & 8) == 0) {
            this.previewTitle = "";
        } else {
            this.previewTitle = str3;
        }
        if ((i & 16) == 0) {
            this.previewBody = "";
        } else {
            this.previewBody = str4;
        }
        if ((i & 32) == 0) {
            this.holdToEarnText = "";
        } else {
            this.holdToEarnText = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(LocalizedText localizedText, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !localizedText.showLearnMore) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, localizedText.showLearnMore);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) localizedText.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, localizedText.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) localizedText.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, localizedText.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) localizedText.previewTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, localizedText.previewTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) localizedText.previewBody, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, localizedText.previewBody);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) localizedText.holdToEarnText, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, localizedText.holdToEarnText);
    }

    public LocalizedText(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.showLearnMore = z;
        this.title = str;
        this.content = str2;
        this.previewTitle = str3;
        this.previewBody = str4;
        this.holdToEarnText = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r5v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:496) call: com.okinc.okpaymentapi.data.remote.model.management.LocalizedText.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LocalizedText(boolean z, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "");
    }
}
