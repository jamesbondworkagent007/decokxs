package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class ChainArrivalType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChainArrivalType[] $VALUES;
    public static final Parcelable.Creator<ChainArrivalType> CREATOR;
    public static final StateListAnimator Companion;
    public static final ChainArrivalType Confirmation = new ChainArrivalType("Confirmation", 0);
    public static final ChainArrivalType L2Bundle1 = new ChainArrivalType("L2Bundle1", 1);
    public static final ChainArrivalType L2Bundle2 = new ChainArrivalType("L2Bundle2", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChainArrivalType[] $values() {
        return new ChainArrivalType[]{Confirmation, L2Bundle1, L2Bundle2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChainArrivalType> getEntries() {
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

    private ChainArrivalType(String str, int i) {
    }

    static {
        ChainArrivalType[] chainArrivalTypeArr$values = $values();
        $VALUES = chainArrivalTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chainArrivalTypeArr$values);
        Companion = new StateListAnimator(null);
        CREATOR = new Parcelable.Creator<ChainArrivalType>() { // from class: com.okinc.assets.backend.api.model.ChainArrivalType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChainArrivalType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ChainArrivalType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChainArrivalType[] newArray(int i) {
                return new ChainArrivalType[i];
            }
        };
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.ChainArrivalType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static ChainArrivalType valueOf(String str) {
        return (ChainArrivalType) Enum.valueOf(ChainArrivalType.class, str);
    }

    public static ChainArrivalType[] values() {
        return (ChainArrivalType[]) $VALUES.clone();
    }
}
