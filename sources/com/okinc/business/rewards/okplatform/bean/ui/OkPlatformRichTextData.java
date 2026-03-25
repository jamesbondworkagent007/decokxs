package com.okinc.business.rewards.okplatform.bean.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OkPlatformRichTextData implements Parcelable {
    private final OkPlatformUIStructureTextData contentJSON;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OkPlatformRichTextData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OkPlatformRichTextData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformRichTextData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OkPlatformRichTextData((OkPlatformUIStructureTextData) parcel.readParcelable(OkPlatformRichTextData.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformRichTextData[] newArray(int i) {
            return new OkPlatformRichTextData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OkPlatformRichTextData copy$default(OkPlatformRichTextData okPlatformRichTextData, OkPlatformUIStructureTextData okPlatformUIStructureTextData, int i, Object obj) {
        if ((i & 1) != 0) {
            okPlatformUIStructureTextData = okPlatformRichTextData.contentJSON;
        }
        return okPlatformRichTextData.copy(okPlatformUIStructureTextData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformUIStructureTextData component1() {
        return this.contentJSON;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformRichTextData copy(@NotNull OkPlatformUIStructureTextData okPlatformUIStructureTextData) {
        Intrinsics.checkNotNullParameter(okPlatformUIStructureTextData, "");
        return new OkPlatformRichTextData(okPlatformUIStructureTextData);
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
        return (obj instanceof OkPlatformRichTextData) && Intrinsics.EZpvd(this.contentJSON, ((OkPlatformRichTextData) obj).contentJSON);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformUIStructureTextData getContentJSON() {
        return this.contentJSON;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.contentJSON.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OkPlatformRichTextData(contentJSON=" + this.contentJSON + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.contentJSON, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkPlatformRichTextData> serializer() {
            return OkPlatformRichTextData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OkPlatformRichTextData(int i, OkPlatformUIStructureTextData okPlatformUIStructureTextData, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, OkPlatformRichTextData$$serializer.INSTANCE.getDescriptor());
        }
        this.contentJSON = okPlatformUIStructureTextData;
    }

    public OkPlatformRichTextData(@NotNull OkPlatformUIStructureTextData okPlatformUIStructureTextData) {
        Intrinsics.checkNotNullParameter(okPlatformUIStructureTextData, "");
        this.contentJSON = okPlatformUIStructureTextData;
    }
}
