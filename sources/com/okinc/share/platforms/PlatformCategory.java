package com.okinc.share.platforms;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class PlatformCategory implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlatformCategory[] $VALUES;
    public static final Parcelable.Creator<PlatformCategory> CREATOR;
    private final int category;
    public static final PlatformCategory SOCIAL = new PlatformCategory("SOCIAL", 0, 1);
    public static final PlatformCategory INTERNAL = new PlatformCategory("INTERNAL", 1, 2);
    public static final PlatformCategory FUNCTION = new PlatformCategory("FUNCTION", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlatformCategory[] $values() {
        return new PlatformCategory[]{SOCIAL, INTERNAL, FUNCTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlatformCategory> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private PlatformCategory(String str, int i, int i2) {
        this.category = i2;
    }

    static {
        PlatformCategory[] platformCategoryArr$values = $values();
        $VALUES = platformCategoryArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(platformCategoryArr$values);
        CREATOR = new Parcelable.Creator<PlatformCategory>() { // from class: com.okinc.share.platforms.PlatformCategory.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlatformCategory createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return PlatformCategory.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlatformCategory[] newArray(int i) {
                return new PlatformCategory[i];
            }
        };
    }

    public static PlatformCategory valueOf(String str) {
        return (PlatformCategory) Enum.valueOf(PlatformCategory.class, str);
    }

    public static PlatformCategory[] values() {
        return (PlatformCategory[]) $VALUES.clone();
    }
}
