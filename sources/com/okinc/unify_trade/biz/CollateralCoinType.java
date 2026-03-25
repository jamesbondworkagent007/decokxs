package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class CollateralCoinType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CollateralCoinType[] $VALUES;
    public static final Parcelable.Creator<CollateralCoinType> CREATOR;
    public static final Application Companion;
    private final String value;
    public static final CollateralCoinType COLLATERAL_COIN_ALL = new CollateralCoinType("COLLATERAL_COIN_ALL", 0, "1");
    public static final CollateralCoinType COLLATERAL_COIN_STABLE_COIN_ONLY = new CollateralCoinType("COLLATERAL_COIN_STABLE_COIN_ONLY", 1, "2");
    public static final CollateralCoinType COLLATERAL_COIN_CUSTOM = new CollateralCoinType("COLLATERAL_COIN_CUSTOM", 2, "3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CollateralCoinType[] $values() {
        return new CollateralCoinType[]{COLLATERAL_COIN_ALL, COLLATERAL_COIN_STABLE_COIN_ONLY, COLLATERAL_COIN_CUSTOM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CollateralCoinType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private CollateralCoinType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        CollateralCoinType[] collateralCoinTypeArr$values = $values();
        $VALUES = collateralCoinTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(collateralCoinTypeArr$values);
        Companion = new Application(null);
        CREATOR = new Parcelable.Creator<CollateralCoinType>() { // from class: com.okinc.unify_trade.biz.CollateralCoinType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CollateralCoinType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return CollateralCoinType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CollateralCoinType[] newArray(int i) {
                return new CollateralCoinType[i];
            }
        };
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CollateralCoinType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static CollateralCoinType valueOf(String str) {
        return (CollateralCoinType) Enum.valueOf(CollateralCoinType.class, str);
    }

    public static CollateralCoinType[] values() {
        return (CollateralCoinType[]) $VALUES.clone();
    }
}
