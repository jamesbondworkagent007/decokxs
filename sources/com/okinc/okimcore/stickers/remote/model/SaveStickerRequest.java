package com.okinc.okimcore.stickers.remote.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SaveStickerRequest implements Parcelable {
    public final Set<String> stickerIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SaveStickerRequest> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {new LinkedHashSetSerializer(StringSerializer.INSTANCE)};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SaveStickerRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SaveStickerRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(parcel.readString());
            }
            return new SaveStickerRequest(linkedHashSet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SaveStickerRequest[] newArray(int i) {
            return new SaveStickerRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.stickers.remote.model.SaveStickerRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SaveStickerRequest copy$default(SaveStickerRequest saveStickerRequest, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = saveStickerRequest.stickerIds;
        }
        return saveStickerRequest.EZpvd(set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SaveStickerRequest EZpvd(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        return new SaveStickerRequest(set);
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
        return (obj instanceof SaveStickerRequest) && Intrinsics.EZpvd(this.stickerIds, ((SaveStickerRequest) obj).stickerIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.stickerIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SaveStickerRequest(stickerIds=" + this.stickerIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Set<String> set = this.stickerIds;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.stickers.remote.model.SaveStickerRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SaveStickerRequest> serializer() {
            return SaveStickerRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SaveStickerRequest(int i, Set set, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SaveStickerRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.stickerIds = set;
    }

    public SaveStickerRequest(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.stickerIds = set;
    }
}
