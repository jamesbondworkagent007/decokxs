package com.okinc.okimcore.stickers.remote.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class StickerConfigResponse implements Parcelable {
    public final long maxSavedStickers;
    public final List<SupportedFormat> supportedFormats;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StickerConfigResponse> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StickerConfigResponse$SupportedFormat$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<StickerConfigResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StickerConfigResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SupportedFormat.CREATOR.createFromParcel(parcel));
            }
            return new StickerConfigResponse(j, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StickerConfigResponse[] newArray(int i) {
            return new StickerConfigResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.stickers.remote.model.StickerConfigResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerConfigResponse copy$default(StickerConfigResponse stickerConfigResponse, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = stickerConfigResponse.maxSavedStickers;
        }
        if ((i & 2) != 0) {
            list = stickerConfigResponse.supportedFormats;
        }
        return stickerConfigResponse.EZpvd(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StickerConfigResponse EZpvd(long j, @NotNull List<SupportedFormat> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new StickerConfigResponse(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedFormat> EZpvd() {
        return this.supportedFormats;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.maxSavedStickers;
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
        if (!(obj instanceof StickerConfigResponse)) {
            return false;
        }
        StickerConfigResponse stickerConfigResponse = (StickerConfigResponse) obj;
        return this.maxSavedStickers == stickerConfigResponse.maxSavedStickers && Intrinsics.EZpvd(this.supportedFormats, stickerConfigResponse.supportedFormats);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.maxSavedStickers) * 31) + this.supportedFormats.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StickerConfigResponse(maxSavedStickers=" + this.maxSavedStickers + ", supportedFormats=" + this.supportedFormats + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.maxSavedStickers);
        List<SupportedFormat> list = this.supportedFormats;
        parcel.writeInt(list.size());
        Iterator<SupportedFormat> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.stickers.remote.model.StickerConfigResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StickerConfigResponse> serializer() {
            return StickerConfigResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StickerConfigResponse(int i, long j, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, StickerConfigResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.maxSavedStickers = j;
        this.supportedFormats = list;
    }

    public static final /* synthetic */ void copydefault(StickerConfigResponse stickerConfigResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, stickerConfigResponse.maxSavedStickers);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], stickerConfigResponse.supportedFormats);
    }

    public StickerConfigResponse(long j, @NotNull List<SupportedFormat> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.maxSavedStickers = j;
        this.supportedFormats = list;
    }

    @Serializable
    public static final class SupportedFormat implements Parcelable {
        public static final int $stable = 0;
        public final String fileType;
        public final int maxHeight;
        public final int maxSize;
        public final int maxWidth;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<SupportedFormat> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SupportedFormat> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SupportedFormat createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SupportedFormat(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SupportedFormat[] newArray(int i) {
                return new SupportedFormat[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SupportedFormat copy$default(SupportedFormat supportedFormat, String str, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = supportedFormat.fileType;
            }
            if ((i4 & 2) != 0) {
                i = supportedFormat.maxHeight;
            }
            if ((i4 & 4) != 0) {
                i2 = supportedFormat.maxWidth;
            }
            if ((i4 & 8) != 0) {
                i3 = supportedFormat.maxSize;
            }
            return supportedFormat.copydefault(str, i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.maxSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.maxHeight;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.maxWidth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SupportedFormat copydefault(@NotNull String str, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SupportedFormat(str, i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.fileType;
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
            if (!(obj instanceof SupportedFormat)) {
                return false;
            }
            SupportedFormat supportedFormat = (SupportedFormat) obj;
            return Intrinsics.EZpvd((Object) this.fileType, (Object) supportedFormat.fileType) && this.maxHeight == supportedFormat.maxHeight && this.maxWidth == supportedFormat.maxWidth && this.maxSize == supportedFormat.maxSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.fileType.hashCode() * 31) + Integer.hashCode(this.maxHeight)) * 31) + Integer.hashCode(this.maxWidth)) * 31) + Integer.hashCode(this.maxSize);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SupportedFormat(fileType=" + this.fileType + ", maxHeight=" + this.maxHeight + ", maxWidth=" + this.maxWidth + ", maxSize=" + this.maxSize + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.fileType);
            parcel.writeInt(this.maxHeight);
            parcel.writeInt(this.maxWidth);
            parcel.writeInt(this.maxSize);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.stickers.remote.model.StickerConfigResponse.SupportedFormat.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SupportedFormat> serializer() {
                return StickerConfigResponse$SupportedFormat$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SupportedFormat(int i, String str, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, StickerConfigResponse$SupportedFormat$$serializer.INSTANCE.getDescriptor());
            }
            this.fileType = str;
            this.maxHeight = i2;
            this.maxWidth = i3;
            this.maxSize = i4;
        }

        public static final /* synthetic */ void OLrzqt(SupportedFormat supportedFormat, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, supportedFormat.fileType);
            compositeEncoder.encodeIntElement(serialDescriptor, 1, supportedFormat.maxHeight);
            compositeEncoder.encodeIntElement(serialDescriptor, 2, supportedFormat.maxWidth);
            compositeEncoder.encodeIntElement(serialDescriptor, 3, supportedFormat.maxSize);
        }

        public SupportedFormat(@NotNull String str, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.fileType = str;
            this.maxHeight = i;
            this.maxWidth = i2;
            this.maxSize = i3;
        }
    }
}
