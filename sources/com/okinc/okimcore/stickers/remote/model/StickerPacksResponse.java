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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class StickerPacksResponse implements Parcelable {
    public final List<SavedSticker> savedStickers;
    public final StickerPacks stickerPacks;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StickerPacksResponse> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StickerPacksResponse$SavedSticker$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<StickerPacksResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StickerPacksResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SavedSticker.CREATOR.createFromParcel(parcel));
            }
            return new StickerPacksResponse(arrayList, StickerPacks.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StickerPacksResponse[] newArray(int i) {
            return new StickerPacksResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.stickers.remote.model.StickerPacksResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerPacksResponse copy$default(StickerPacksResponse stickerPacksResponse, List list, StickerPacks stickerPacks, int i, Object obj) {
        if ((i & 1) != 0) {
            list = stickerPacksResponse.savedStickers;
        }
        if ((i & 2) != 0) {
            stickerPacks = stickerPacksResponse.stickerPacks;
        }
        return stickerPacksResponse.KWHzl(list, stickerPacks);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StickerPacks EZpvd() {
        return this.stickerPacks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StickerPacksResponse KWHzl(@NotNull List<SavedSticker> list, @NotNull StickerPacks stickerPacks) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(stickerPacks, "");
        return new StickerPacksResponse(list, stickerPacks);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SavedSticker> KWHzl() {
        return this.savedStickers;
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
        if (!(obj instanceof StickerPacksResponse)) {
            return false;
        }
        StickerPacksResponse stickerPacksResponse = (StickerPacksResponse) obj;
        return Intrinsics.EZpvd(this.savedStickers, stickerPacksResponse.savedStickers) && Intrinsics.EZpvd(this.stickerPacks, stickerPacksResponse.stickerPacks);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.savedStickers.hashCode() * 31) + this.stickerPacks.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StickerPacksResponse(savedStickers=" + this.savedStickers + ", stickerPacks=" + this.stickerPacks + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<SavedSticker> list = this.savedStickers;
        parcel.writeInt(list.size());
        Iterator<SavedSticker> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.stickerPacks.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.stickers.remote.model.StickerPacksResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StickerPacksResponse> serializer() {
            return StickerPacksResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StickerPacksResponse(int i, List list, StickerPacks stickerPacks, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, StickerPacksResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.savedStickers = list;
        this.stickerPacks = stickerPacks;
    }

    public static final /* synthetic */ void AEQbTJ(StickerPacksResponse stickerPacksResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], stickerPacksResponse.savedStickers);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, StickerPacksResponse$StickerPacks$$serializer.INSTANCE, stickerPacksResponse.stickerPacks);
    }

    public StickerPacksResponse(@NotNull List<SavedSticker> list, @NotNull StickerPacks stickerPacks) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(stickerPacks, "");
        this.savedStickers = list;
        this.stickerPacks = stickerPacks;
    }

    @Serializable
    public static final class StickerPacks implements Parcelable {
        public final List<StickerPack> basePacks;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<StickerPacks> CREATOR = new Creator();
        public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StickerPacksResponse$StickerPack$$serializer.INSTANCE)};

        public static final class Creator implements Parcelable.Creator<StickerPacks> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StickerPacks createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(StickerPack.CREATOR.createFromParcel(parcel));
                }
                return new StickerPacks(arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StickerPacks[] newArray(int i) {
                return new StickerPacks[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.stickers.remote.model.StickerPacksResponse$StickerPacks */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StickerPacks copy$default(StickerPacks stickerPacks, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = stickerPacks.basePacks;
            }
            return stickerPacks.copydefault(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StickerPacks copydefault(@NotNull List<StickerPack> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StickerPacks(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<StickerPack> copydefault() {
            return this.basePacks;
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
            return (obj instanceof StickerPacks) && Intrinsics.EZpvd(this.basePacks, ((StickerPacks) obj).basePacks);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.basePacks.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StickerPacks(basePacks=" + this.basePacks + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            List<StickerPack> list = this.basePacks;
            parcel.writeInt(list.size());
            Iterator<StickerPack> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.stickers.remote.model.StickerPacksResponse.StickerPacks.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<StickerPacks> serializer() {
                return StickerPacksResponse$StickerPacks$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ StickerPacks(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, StickerPacksResponse$StickerPacks$$serializer.INSTANCE.getDescriptor());
            }
            this.basePacks = list;
        }

        public StickerPacks(@NotNull List<StickerPack> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.basePacks = list;
        }
    }

    @Serializable
    public static final class BaseSticker implements Parcelable {
        public static final int $stable = 0;
        public final String path;
        public final long position;
        public final String stickerId;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<BaseSticker> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<BaseSticker> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseSticker createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new BaseSticker(parcel.readString(), parcel.readString(), parcel.readLong());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseSticker[] newArray(int i) {
                return new BaseSticker[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BaseSticker copy$default(BaseSticker baseSticker, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = baseSticker.stickerId;
            }
            if ((i & 2) != 0) {
                str2 = baseSticker.path;
            }
            if ((i & 4) != 0) {
                j = baseSticker.position;
            }
            return baseSticker.AEQbTJ(str, str2, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BaseSticker AEQbTJ(@NotNull String str, @NotNull String str2, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new BaseSticker(str, str2, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.position;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.path;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.stickerId;
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
            if (!(obj instanceof BaseSticker)) {
                return false;
            }
            BaseSticker baseSticker = (BaseSticker) obj;
            return Intrinsics.EZpvd((Object) this.stickerId, (Object) baseSticker.stickerId) && Intrinsics.EZpvd((Object) this.path, (Object) baseSticker.path) && this.position == baseSticker.position;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.stickerId.hashCode() * 31) + this.path.hashCode()) * 31) + Long.hashCode(this.position);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BaseSticker(stickerId=" + this.stickerId + ", path=" + this.path + ", position=" + this.position + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.stickerId);
            parcel.writeString(this.path);
            parcel.writeLong(this.position);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.stickers.remote.model.StickerPacksResponse.BaseSticker.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<BaseSticker> serializer() {
                return StickerPacksResponse$BaseSticker$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ BaseSticker(int i, String str, String str2, long j, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, StickerPacksResponse$BaseSticker$$serializer.INSTANCE.getDescriptor());
            }
            this.stickerId = str;
            this.path = str2;
            this.position = j;
        }

        public static final /* synthetic */ void OLrzqt(BaseSticker baseSticker, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, baseSticker.stickerId);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, baseSticker.path);
            compositeEncoder.encodeLongElement(serialDescriptor, 2, baseSticker.position);
        }

        public BaseSticker(@NotNull String str, @NotNull String str2, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.stickerId = str;
            this.path = str2;
            this.position = j;
        }
    }

    @Serializable
    public static final class StickerPack implements Parcelable {
        public final String iconPath;
        public final String iconPathDark;
        public final long position;
        public final String stickerPackId;
        public final List<BaseSticker> stickers;
        public final String title;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<StickerPack> CREATOR = new Creator();
        public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StickerPacksResponse$BaseSticker$$serializer.INSTANCE), null, null};

        public static final class Creator implements Parcelable.Creator<StickerPack> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StickerPack createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                long j = parcel.readLong();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(BaseSticker.CREATOR.createFromParcel(parcel));
                }
                return new StickerPack(string, string2, j, arrayList, parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StickerPack[] newArray(int i) {
                return new StickerPack[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okimcore.stickers.remote.model.StickerPacksResponse$StickerPack */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StickerPack copy$default(StickerPack stickerPack, String str, String str2, long j, List list, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stickerPack.stickerPackId;
            }
            if ((i & 2) != 0) {
                str2 = stickerPack.title;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                j = stickerPack.position;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                list = stickerPack.stickers;
            }
            List list2 = list;
            if ((i & 16) != 0) {
                str3 = stickerPack.iconPath;
            }
            String str6 = str3;
            if ((i & 32) != 0) {
                str4 = stickerPack.iconPathDark;
            }
            return stickerPack.KWHzl(str, str5, j2, list2, str6, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<BaseSticker> AYXKKw() {
            return this.stickers;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.position;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StickerPack KWHzl(@NotNull String str, @NotNull String str2, long j, @NotNull List<BaseSticker> list, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new StickerPack(str, str2, j, list, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.iconPathDark;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.iconPath;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.stickerPackId;
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
            if (!(obj instanceof StickerPack)) {
                return false;
            }
            StickerPack stickerPack = (StickerPack) obj;
            return Intrinsics.EZpvd((Object) this.stickerPackId, (Object) stickerPack.stickerPackId) && Intrinsics.EZpvd((Object) this.title, (Object) stickerPack.title) && this.position == stickerPack.position && Intrinsics.EZpvd(this.stickers, stickerPack.stickers) && Intrinsics.EZpvd((Object) this.iconPath, (Object) stickerPack.iconPath) && Intrinsics.EZpvd((Object) this.iconPathDark, (Object) stickerPack.iconPathDark);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.stickerPackId.hashCode();
            int iHashCode2 = this.title.hashCode();
            int iHashCode3 = Long.hashCode(this.position);
            int iHashCode4 = this.stickers.hashCode();
            String str = this.iconPath;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            String str2 = this.iconPathDark;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StickerPack(stickerPackId=" + this.stickerPackId + ", title=" + this.title + ", position=" + this.position + ", stickers=" + this.stickers + ", iconPath=" + this.iconPath + ", iconPathDark=" + this.iconPathDark + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.stickerPackId);
            parcel.writeString(this.title);
            parcel.writeLong(this.position);
            List<BaseSticker> list = this.stickers;
            parcel.writeInt(list.size());
            Iterator<BaseSticker> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            parcel.writeString(this.iconPath);
            parcel.writeString(this.iconPathDark);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.stickers.remote.model.StickerPacksResponse.StickerPack.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<StickerPack> serializer() {
                return StickerPacksResponse$StickerPack$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ StickerPack(int i, String str, String str2, long j, List list, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, StickerPacksResponse$StickerPack$$serializer.INSTANCE.getDescriptor());
            }
            this.stickerPackId = str;
            this.title = str2;
            this.position = j;
            this.stickers = list;
            if ((i & 16) == 0) {
                this.iconPath = null;
            } else {
                this.iconPath = str3;
            }
            if ((i & 32) == 0) {
                this.iconPathDark = null;
            } else {
                this.iconPathDark = str4;
            }
        }

        public static final /* synthetic */ void KWHzl(StickerPack stickerPack, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 0, stickerPack.stickerPackId);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, stickerPack.title);
            compositeEncoder.encodeLongElement(serialDescriptor, 2, stickerPack.position);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], stickerPack.stickers);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || stickerPack.iconPath != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, stickerPack.iconPath);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && stickerPack.iconPathDark == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, stickerPack.iconPathDark);
        }

        public StickerPack(@NotNull String str, @NotNull String str2, long j, @NotNull List<BaseSticker> list, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.stickerPackId = str;
            this.title = str2;
            this.position = j;
            this.stickers = list;
            this.iconPath = str3;
            this.iconPathDark = str4;
        }
    }

    @Serializable
    public static final class SavedSticker implements Parcelable {
        public static final int $stable = 0;
        public final String path;
        public final long saveTime;
        public final String stickerId;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<SavedSticker> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SavedSticker> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedSticker createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SavedSticker(parcel.readString(), parcel.readString(), parcel.readLong());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedSticker[] newArray(int i) {
                return new SavedSticker[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SavedSticker copy$default(SavedSticker savedSticker, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = savedSticker.stickerId;
            }
            if ((i & 2) != 0) {
                str2 = savedSticker.path;
            }
            if ((i & 4) != 0) {
                j = savedSticker.saveTime;
            }
            return savedSticker.EZpvd(str, str2, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SavedSticker EZpvd(@NotNull String str, @NotNull String str2, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new SavedSticker(str, str2, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.path;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.stickerId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.saveTime;
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
            if (!(obj instanceof SavedSticker)) {
                return false;
            }
            SavedSticker savedSticker = (SavedSticker) obj;
            return Intrinsics.EZpvd((Object) this.stickerId, (Object) savedSticker.stickerId) && Intrinsics.EZpvd((Object) this.path, (Object) savedSticker.path) && this.saveTime == savedSticker.saveTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.stickerId.hashCode() * 31) + this.path.hashCode()) * 31) + Long.hashCode(this.saveTime);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SavedSticker(stickerId=" + this.stickerId + ", path=" + this.path + ", saveTime=" + this.saveTime + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.stickerId);
            parcel.writeString(this.path);
            parcel.writeLong(this.saveTime);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.stickers.remote.model.StickerPacksResponse.SavedSticker.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SavedSticker> serializer() {
                return StickerPacksResponse$SavedSticker$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SavedSticker(int i, String str, String str2, long j, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, StickerPacksResponse$SavedSticker$$serializer.INSTANCE.getDescriptor());
            }
            this.stickerId = str;
            this.path = str2;
            this.saveTime = j;
        }

        public static final /* synthetic */ void AEQbTJ(SavedSticker savedSticker, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, savedSticker.stickerId);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, savedSticker.path);
            compositeEncoder.encodeLongElement(serialDescriptor, 2, savedSticker.saveTime);
        }

        public SavedSticker(@NotNull String str, @NotNull String str2, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.stickerId = str;
            this.path = str2;
            this.saveTime = j;
        }
    }
}
