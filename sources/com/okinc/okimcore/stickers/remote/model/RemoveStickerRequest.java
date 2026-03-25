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
public final class RemoveStickerRequest implements Parcelable {
    public final Set<String> stickerIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RemoveStickerRequest> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {new LinkedHashSetSerializer(StringSerializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<RemoveStickerRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoveStickerRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(parcel.readString());
            }
            return new RemoveStickerRequest(linkedHashSet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoveStickerRequest[] newArray(int i) {
            return new RemoveStickerRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.stickers.remote.model.RemoveStickerRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoveStickerRequest copy$default(RemoveStickerRequest removeStickerRequest, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = removeStickerRequest.stickerIds;
        }
        return removeStickerRequest.OLrzqt(set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemoveStickerRequest OLrzqt(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        return new RemoveStickerRequest(set);
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
        return (obj instanceof RemoveStickerRequest) && Intrinsics.EZpvd(this.stickerIds, ((RemoveStickerRequest) obj).stickerIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.stickerIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RemoveStickerRequest(stickerIds=" + this.stickerIds + ")";
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

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.stickers.remote.model.RemoveStickerRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RemoveStickerRequest> serializer() {
            return RemoveStickerRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RemoveStickerRequest(int i, Set set, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, RemoveStickerRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.stickerIds = set;
    }

    public RemoveStickerRequest(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.stickerIds = set;
    }
}
