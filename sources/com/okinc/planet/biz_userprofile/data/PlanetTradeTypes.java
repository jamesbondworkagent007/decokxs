package com.okinc.planet.biz_userprofile.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.C59449zhJ;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class PlanetTradeTypes implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetTradeTypes[] $VALUES;
    public static final Parcelable.Creator<PlanetTradeTypes> CREATOR;
    public static final TaskDescription Companion;
    public static final String Key = "PlanetTradeTypesKey";
    public static final PlanetTradeTypes Spot = new PlanetTradeTypes("Spot", 0);
    public static final PlanetTradeTypes Swap = new PlanetTradeTypes("Swap", 1);

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PlanetTradeTypes.values().length];
            try {
                iArr[PlanetTradeTypes.Spot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlanetTradeTypes.Swap.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetTradeTypes[] $values() {
        return new PlanetTradeTypes[]{Spot, Swap};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetTradeTypes> getEntries() {
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

    private PlanetTradeTypes(String str, int i) {
    }

    static {
        PlanetTradeTypes[] planetTradeTypesArr$values = $values();
        $VALUES = planetTradeTypesArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetTradeTypesArr$values);
        Companion = new TaskDescription(null);
        CREATOR = new Parcelable.Creator<PlanetTradeTypes>() { // from class: com.okinc.planet.biz_userprofile.data.PlanetTradeTypes.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetTradeTypes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return PlanetTradeTypes.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetTradeTypes[] newArray(int i) {
                return new PlanetTradeTypes[i];
            }
        };
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetTradeTypes.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final PlanetTradeTypes OLrzqt(String str) {
            if (C59449zhJ.gEmmrt(str, "SPOT", true)) {
                return PlanetTradeTypes.Spot;
            }
            return PlanetTradeTypes.Swap;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = Activity.KWHzl[ordinal()];
        if (i == 1) {
            return "SPOT";
        }
        if (i == 2) {
            return "SWAP";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static PlanetTradeTypes valueOf(String str) {
        return (PlanetTradeTypes) Enum.valueOf(PlanetTradeTypes.class, str);
    }

    public static PlanetTradeTypes[] values() {
        return (PlanetTradeTypes[]) $VALUES.clone();
    }
}
