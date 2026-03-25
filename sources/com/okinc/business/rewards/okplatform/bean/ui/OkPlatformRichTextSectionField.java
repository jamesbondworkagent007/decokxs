package com.okinc.business.rewards.okplatform.bean.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OkPlatformRichTextSectionField implements Parcelable {
    private final OkPlatformRichTextData content;
    private final String sectionName;
    private final String tableCellAlignment;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OkPlatformRichTextSectionField> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OkPlatformRichTextSectionField> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformRichTextSectionField createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OkPlatformRichTextSectionField(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OkPlatformRichTextData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformRichTextSectionField[] newArray(int i) {
            return new OkPlatformRichTextSectionField[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OkPlatformRichTextSectionField() {
        this((String) null, (String) null, (OkPlatformRichTextData) null, 7, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformRichTextData getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectionName() {
        return this.sectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTableCellAlignment() {
        return this.tableCellAlignment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sectionName);
        parcel.writeString(this.tableCellAlignment);
        OkPlatformRichTextData okPlatformRichTextData = this.content;
        if (okPlatformRichTextData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            okPlatformRichTextData.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextSectionField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkPlatformRichTextSectionField> serializer() {
            return OkPlatformRichTextSectionField$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OkPlatformRichTextSectionField(int i, String str, String str2, OkPlatformRichTextData okPlatformRichTextData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sectionName = "";
        } else {
            this.sectionName = str;
        }
        if ((i & 2) == 0) {
            this.tableCellAlignment = "";
        } else {
            this.tableCellAlignment = str2;
        }
        if ((i & 4) == 0) {
            this.content = null;
        } else {
            this.content = okPlatformRichTextData;
        }
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(OkPlatformRichTextSectionField okPlatformRichTextSectionField, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) okPlatformRichTextSectionField.sectionName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, okPlatformRichTextSectionField.sectionName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) okPlatformRichTextSectionField.tableCellAlignment, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, okPlatformRichTextSectionField.tableCellAlignment);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && okPlatformRichTextSectionField.content == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, OkPlatformRichTextData$$serializer.INSTANCE, okPlatformRichTextSectionField.content);
    }

    public OkPlatformRichTextSectionField(String str, String str2, OkPlatformRichTextData okPlatformRichTextData) {
        this.sectionName = str;
        this.tableCellAlignment = str2;
        this.content = okPlatformRichTextData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextData:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextData) : (r4v0 com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextData))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextData):void (m)] (LINE:18) call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextSectionField.<init>(java.lang.String, java.lang.String, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextData):void type: THIS */
    public /* synthetic */ OkPlatformRichTextSectionField(String str, String str2, OkPlatformRichTextData okPlatformRichTextData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : okPlatformRichTextData);
    }
}
