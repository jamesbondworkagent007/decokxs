package com.okinc.planet_api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class PlanetActivityCategory implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetActivityCategory[] $VALUES;
    public static final Parcelable.Creator<PlanetActivityCategory> CREATOR;
    public static final TaskDescription Companion;
    public static final PlanetActivityCategory Likes = new PlanetActivityCategory("Likes", 0, 0, "likes");
    public static final PlanetActivityCategory Replies = new PlanetActivityCategory("Replies", 1, 1, "replies");
    private final int category;
    private final String eventName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetActivityCategory[] $values() {
        return new PlanetActivityCategory[]{Likes, Replies};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetActivityCategory> getEntries() {
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
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private PlanetActivityCategory(String str, int i, int i2, String str2) {
        this.category = i2;
        this.eventName = str2;
    }

    static {
        PlanetActivityCategory[] planetActivityCategoryArr$values = $values();
        $VALUES = planetActivityCategoryArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetActivityCategoryArr$values);
        Companion = new TaskDescription(null);
        CREATOR = new Parcelable.Creator<PlanetActivityCategory>() { // from class: com.okinc.planet_api.model.PlanetActivityCategory.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetActivityCategory createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return PlanetActivityCategory.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetActivityCategory[] newArray(int i) {
                return new PlanetActivityCategory[i];
            }
        };
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.model.PlanetActivityCategory.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static PlanetActivityCategory valueOf(String str) {
        return (PlanetActivityCategory) Enum.valueOf(PlanetActivityCategory.class, str);
    }

    public static PlanetActivityCategory[] values() {
        return (PlanetActivityCategory[]) $VALUES.clone();
    }
}
