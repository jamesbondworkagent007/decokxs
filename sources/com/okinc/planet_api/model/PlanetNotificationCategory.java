package com.okinc.planet_api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.immomo.mls.fun.lt.SISystem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class PlanetNotificationCategory implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetNotificationCategory[] $VALUES;
    public static final Parcelable.Creator<PlanetNotificationCategory> CREATOR;
    public static final TaskDescription Companion;
    private final int category;
    private final String eventName;
    public static final PlanetNotificationCategory All = new PlanetNotificationCategory("All", 0, 0, "all");
    public static final PlanetNotificationCategory Likes = new PlanetNotificationCategory("Likes", 1, 1, "likes");
    public static final PlanetNotificationCategory Followers = new PlanetNotificationCategory("Followers", 2, 2, "followers");
    public static final PlanetNotificationCategory Comments = new PlanetNotificationCategory("Comments", 3, 3, "comments");
    public static final PlanetNotificationCategory System = new PlanetNotificationCategory(SISystem.KEY, 4, 4, "system");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetNotificationCategory[] $values() {
        return new PlanetNotificationCategory[]{All, Likes, Followers, Comments, System};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetNotificationCategory> getEntries() {
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

    private PlanetNotificationCategory(String str, int i, int i2, String str2) {
        this.category = i2;
        this.eventName = str2;
    }

    static {
        PlanetNotificationCategory[] planetNotificationCategoryArr$values = $values();
        $VALUES = planetNotificationCategoryArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetNotificationCategoryArr$values);
        Companion = new TaskDescription(null);
        CREATOR = new Parcelable.Creator<PlanetNotificationCategory>() { // from class: com.okinc.planet_api.model.PlanetNotificationCategory.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetNotificationCategory createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return PlanetNotificationCategory.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetNotificationCategory[] newArray(int i) {
                return new PlanetNotificationCategory[i];
            }
        };
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.model.PlanetNotificationCategory.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final PlanetNotificationCategory copydefault(int i) {
            for (PlanetNotificationCategory planetNotificationCategory : PlanetNotificationCategory.values()) {
                if (planetNotificationCategory.getCategory() == i) {
                    return planetNotificationCategory;
                }
            }
            return null;
        }
    }

    public static PlanetNotificationCategory valueOf(String str) {
        return (PlanetNotificationCategory) Enum.valueOf(PlanetNotificationCategory.class, str);
    }

    public static PlanetNotificationCategory[] values() {
        return (PlanetNotificationCategory[]) $VALUES.clone();
    }
}
