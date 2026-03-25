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
public final class FrozenAssetAddressType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FrozenAssetAddressType[] $VALUES;
    public static final Parcelable.Creator<FrozenAssetAddressType> CREATOR;
    public static final Activity Companion;
    public static final FrozenAssetAddressType OnChain = new FrozenAssetAddressType("OnChain", 0);
    public static final FrozenAssetAddressType Internal = new FrozenAssetAddressType("Internal", 1);
    public static final FrozenAssetAddressType NULL = new FrozenAssetAddressType("NULL", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FrozenAssetAddressType[] $values() {
        return new FrozenAssetAddressType[]{OnChain, Internal, NULL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FrozenAssetAddressType> getEntries() {
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

    private FrozenAssetAddressType(String str, int i) {
    }

    static {
        FrozenAssetAddressType[] frozenAssetAddressTypeArr$values = $values();
        $VALUES = frozenAssetAddressTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(frozenAssetAddressTypeArr$values);
        Companion = new Activity(null);
        CREATOR = new Parcelable.Creator<FrozenAssetAddressType>() { // from class: com.okinc.assets.backend.api.model.FrozenAssetAddressType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FrozenAssetAddressType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return FrozenAssetAddressType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FrozenAssetAddressType[] newArray(int i) {
                return new FrozenAssetAddressType[i];
            }
        };
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.FrozenAssetAddressType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final FrozenAssetAddressType KWHzl(Integer num) {
            return (num != null && num.intValue() == 0) ? FrozenAssetAddressType.OnChain : (num != null && num.intValue() == 1) ? FrozenAssetAddressType.Internal : FrozenAssetAddressType.NULL;
        }
    }

    public static FrozenAssetAddressType valueOf(String str) {
        return (FrozenAssetAddressType) Enum.valueOf(FrozenAssetAddressType.class, str);
    }

    public static FrozenAssetAddressType[] values() {
        return (FrozenAssetAddressType[]) $VALUES.clone();
    }
}
