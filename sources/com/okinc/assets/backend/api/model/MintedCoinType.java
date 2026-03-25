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
/* JADX INFO: loaded from: classes14.dex */
public final class MintedCoinType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MintedCoinType[] $VALUES;
    public static final Parcelable.Creator<MintedCoinType> CREATOR;
    public static final Application Companion;
    public static final MintedCoinType None = new MintedCoinType("None", 0, -1);
    public static final MintedCoinType XBTC = new MintedCoinType("XBTC", 1, 100);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MintedCoinType[] $values() {
        return new MintedCoinType[]{None, XBTC};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MintedCoinType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private MintedCoinType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        MintedCoinType[] mintedCoinTypeArr$values = $values();
        $VALUES = mintedCoinTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mintedCoinTypeArr$values);
        Companion = new Application(null);
        CREATOR = new Parcelable.Creator<MintedCoinType>() { // from class: com.okinc.assets.backend.api.model.MintedCoinType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MintedCoinType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return MintedCoinType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MintedCoinType[] newArray(int i) {
                return new MintedCoinType[i];
            }
        };
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.MintedCoinType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final MintedCoinType copydefault(Integer num) {
            MintedCoinType mintedCoinType;
            MintedCoinType[] mintedCoinTypeArrValues = MintedCoinType.values();
            int length = mintedCoinTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    mintedCoinType = null;
                    break;
                }
                mintedCoinType = mintedCoinTypeArrValues[i];
                int value = mintedCoinType.getValue();
                if (num != null && value == num.intValue()) {
                    break;
                }
                i++;
            }
            return mintedCoinType == null ? MintedCoinType.None : mintedCoinType;
        }
    }

    public static MintedCoinType valueOf(String str) {
        return (MintedCoinType) Enum.valueOf(MintedCoinType.class, str);
    }

    public static MintedCoinType[] values() {
        return (MintedCoinType[]) $VALUES.clone();
    }
}
