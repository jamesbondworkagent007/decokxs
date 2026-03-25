package com.okinc.okimcore.stickers.remote.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.stickers.remote.model.StickerPacksResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SaveStickerResponse implements Parcelable {
    public final List<StickerPacksResponse.SavedSticker> successSavedStickers;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SaveStickerResponse> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StickerPacksResponse$SavedSticker$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SaveStickerResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SaveStickerResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(StickerPacksResponse.SavedSticker.CREATOR.createFromParcel(parcel));
            }
            return new SaveStickerResponse(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SaveStickerResponse[] newArray(int i) {
            return new SaveStickerResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.stickers.remote.model.SaveStickerResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SaveStickerResponse copy$default(SaveStickerResponse saveStickerResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = saveStickerResponse.successSavedStickers;
        }
        return saveStickerResponse.AEQbTJ(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SaveStickerResponse AEQbTJ(@NotNull List<StickerPacksResponse.SavedSticker> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SaveStickerResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StickerPacksResponse.SavedSticker> KWHzl() {
        return this.successSavedStickers;
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
        return (obj instanceof SaveStickerResponse) && Intrinsics.EZpvd(this.successSavedStickers, ((SaveStickerResponse) obj).successSavedStickers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.successSavedStickers.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SaveStickerResponse(successSavedStickers=" + this.successSavedStickers + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<StickerPacksResponse.SavedSticker> list = this.successSavedStickers;
        parcel.writeInt(list.size());
        Iterator<StickerPacksResponse.SavedSticker> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.stickers.remote.model.SaveStickerResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SaveStickerResponse> serializer() {
            return SaveStickerResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SaveStickerResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SaveStickerResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.successSavedStickers = list;
    }

    public SaveStickerResponse(@NotNull List<StickerPacksResponse.SavedSticker> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.successSavedStickers = list;
    }
}
