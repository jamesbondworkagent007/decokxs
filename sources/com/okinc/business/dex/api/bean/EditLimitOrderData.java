package com.okinc.business.dex.api.bean;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class EditLimitOrderData implements Parcelable {
    public static final int $stable = 0;
    private final EditCommonInfo commonInfo;
    private final EditTokenInfo fromTokenInfo;
    private final EditTokenInfo toTokenInfo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EditLimitOrderData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EditLimitOrderData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditLimitOrderData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Parcelable.Creator<EditTokenInfo> creator = EditTokenInfo.CREATOR;
            return new EditLimitOrderData(creator.createFromParcel(parcel), creator.createFromParcel(parcel), EditCommonInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditLimitOrderData[] newArray(int i) {
            return new EditLimitOrderData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EditLimitOrderData copy$default(EditLimitOrderData editLimitOrderData, EditTokenInfo editTokenInfo, EditTokenInfo editTokenInfo2, EditCommonInfo editCommonInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            editTokenInfo = editLimitOrderData.fromTokenInfo;
        }
        if ((i & 2) != 0) {
            editTokenInfo2 = editLimitOrderData.toTokenInfo;
        }
        if ((i & 4) != 0) {
            editCommonInfo = editLimitOrderData.commonInfo;
        }
        return editLimitOrderData.copy(editTokenInfo, editTokenInfo2, editCommonInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditTokenInfo component1() {
        return this.fromTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditTokenInfo component2() {
        return this.toTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditCommonInfo component3() {
        return this.commonInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditLimitOrderData copy(@NotNull EditTokenInfo editTokenInfo, @NotNull EditTokenInfo editTokenInfo2, @NotNull EditCommonInfo editCommonInfo) {
        Intrinsics.checkNotNullParameter(editTokenInfo, "");
        Intrinsics.checkNotNullParameter(editTokenInfo2, "");
        Intrinsics.checkNotNullParameter(editCommonInfo, "");
        return new EditLimitOrderData(editTokenInfo, editTokenInfo2, editCommonInfo);
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
        if (!(obj instanceof EditLimitOrderData)) {
            return false;
        }
        EditLimitOrderData editLimitOrderData = (EditLimitOrderData) obj;
        return Intrinsics.EZpvd(this.fromTokenInfo, editLimitOrderData.fromTokenInfo) && Intrinsics.EZpvd(this.toTokenInfo, editLimitOrderData.toTokenInfo) && Intrinsics.EZpvd(this.commonInfo, editLimitOrderData.commonInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditCommonInfo getCommonInfo() {
        return this.commonInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditTokenInfo getFromTokenInfo() {
        return this.fromTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditTokenInfo getToTokenInfo() {
        return this.toTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.fromTokenInfo.hashCode() * 31) + this.toTokenInfo.hashCode()) * 31) + this.commonInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditLimitOrderData(fromTokenInfo=" + this.fromTokenInfo + ", toTokenInfo=" + this.toTokenInfo + ", commonInfo=" + this.commonInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.fromTokenInfo.writeToParcel(parcel, i);
        this.toTokenInfo.writeToParcel(parcel, i);
        this.commonInfo.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.EditLimitOrderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditLimitOrderData> serializer() {
            return EditLimitOrderData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditLimitOrderData(int i, EditTokenInfo editTokenInfo, EditTokenInfo editTokenInfo2, EditCommonInfo editCommonInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EditLimitOrderData$$serializer.INSTANCE.getDescriptor());
        }
        this.fromTokenInfo = editTokenInfo;
        this.toTokenInfo = editTokenInfo2;
        this.commonInfo = editCommonInfo;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(EditLimitOrderData editLimitOrderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        EditTokenInfo$$serializer editTokenInfo$$serializer = EditTokenInfo$$serializer.INSTANCE;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, editTokenInfo$$serializer, editLimitOrderData.fromTokenInfo);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, editTokenInfo$$serializer, editLimitOrderData.toTokenInfo);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, EditCommonInfo$$serializer.INSTANCE, editLimitOrderData.commonInfo);
    }

    public EditLimitOrderData(@NotNull EditTokenInfo editTokenInfo, @NotNull EditTokenInfo editTokenInfo2, @NotNull EditCommonInfo editCommonInfo) {
        Intrinsics.checkNotNullParameter(editTokenInfo, "");
        Intrinsics.checkNotNullParameter(editTokenInfo2, "");
        Intrinsics.checkNotNullParameter(editCommonInfo, "");
        this.fromTokenInfo = editTokenInfo;
        this.toTokenInfo = editTokenInfo2;
        this.commonInfo = editCommonInfo;
    }
}
