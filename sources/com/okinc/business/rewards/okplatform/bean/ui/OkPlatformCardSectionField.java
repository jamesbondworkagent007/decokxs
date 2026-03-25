package com.okinc.business.rewards.okplatform.bean.ui;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OkPlatformCardSectionField implements Parcelable {
    private final String image;
    private final String sectionName;
    private final OkPlatformRichTextData subTitle;
    private final OkPlatformUIStructureTextData title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OkPlatformCardSectionField> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OkPlatformCardSectionField> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformCardSectionField createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OkPlatformCardSectionField(parcel.readString(), parcel.readString(), (OkPlatformUIStructureTextData) parcel.readParcelable(OkPlatformCardSectionField.class.getClassLoader()), OkPlatformRichTextData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformCardSectionField[] newArray(int i) {
            return new OkPlatformCardSectionField[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectionName() {
        return this.sectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformRichTextData getSubTitle() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformUIStructureTextData getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sectionName);
        parcel.writeString(this.image);
        parcel.writeParcelable(this.title, i);
        this.subTitle.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformCardSectionField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkPlatformCardSectionField> serializer() {
            return OkPlatformCardSectionField$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OkPlatformCardSectionField(int i, String str, String str2, OkPlatformUIStructureTextData okPlatformUIStructureTextData, OkPlatformRichTextData okPlatformRichTextData, SerializationConstructorMarker serializationConstructorMarker) {
        if (12 != (i & 12)) {
            PluginExceptionsKt.throwMissingFieldException(i, 12, OkPlatformCardSectionField$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.sectionName = "";
        } else {
            this.sectionName = str;
        }
        if ((i & 2) == 0) {
            this.image = "";
        } else {
            this.image = str2;
        }
        this.title = okPlatformUIStructureTextData;
        this.subTitle = okPlatformRichTextData;
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(OkPlatformCardSectionField okPlatformCardSectionField, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) okPlatformCardSectionField.sectionName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, okPlatformCardSectionField.sectionName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) okPlatformCardSectionField.image, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, okPlatformCardSectionField.image);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, OkPlatformUIStructureTextData$$serializer.INSTANCE, okPlatformCardSectionField.title);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, OkPlatformRichTextData$$serializer.INSTANCE, okPlatformCardSectionField.subTitle);
    }

    public OkPlatformCardSectionField(String str, String str2, @NotNull OkPlatformUIStructureTextData okPlatformUIStructureTextData, @NotNull OkPlatformRichTextData okPlatformRichTextData) {
        Intrinsics.checkNotNullParameter(okPlatformUIStructureTextData, "");
        Intrinsics.checkNotNullParameter(okPlatformRichTextData, "");
        this.sectionName = str;
        this.image = str2;
        this.title = okPlatformUIStructureTextData;
        this.subTitle = okPlatformRichTextData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (r4v0 com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData)
  (r5v0 com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextData)
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextData):void (m)] (LINE:18) call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformCardSectionField.<init>(java.lang.String, java.lang.String, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextData):void type: THIS */
    public /* synthetic */ OkPlatformCardSectionField(String str, String str2, OkPlatformUIStructureTextData okPlatformUIStructureTextData, OkPlatformRichTextData okPlatformRichTextData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, okPlatformUIStructureTextData, okPlatformRichTextData);
    }
}
