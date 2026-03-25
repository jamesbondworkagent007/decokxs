package com.okinc.business.market.features.tag.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TagBelongType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TagBelongType[] $VALUES;
    public static final Parcelable.Creator<TagBelongType> CREATOR;
    public static final TagBelongType RWA = new TagBelongType("RWA", 0);
    public static final TagBelongType NONE = new TagBelongType("NONE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TagBelongType[] $values() {
        return new TagBelongType[]{RWA, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TagBelongType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private TagBelongType(String str, int i) {
    }

    static {
        TagBelongType[] tagBelongTypeArr$values = $values();
        $VALUES = tagBelongTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tagBelongTypeArr$values);
        CREATOR = new Parcelable.Creator<TagBelongType>() { // from class: com.okinc.business.market.features.tag.domain.TagBelongType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TagBelongType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TagBelongType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TagBelongType[] newArray(int i) {
                return new TagBelongType[i];
            }
        };
    }

    public static TagBelongType valueOf(String str) {
        return (TagBelongType) Enum.valueOf(TagBelongType.class, str);
    }

    public static TagBelongType[] values() {
        return (TagBelongType[]) $VALUES.clone();
    }
}
