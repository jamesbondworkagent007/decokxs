package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class ClaimApiErrorType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ClaimApiErrorType[] $VALUES;
    public static final Parcelable.Creator<ClaimApiErrorType> CREATOR;
    public static final ClaimApiErrorType TRANSACTION_EXPIRED = new ClaimApiErrorType("TRANSACTION_EXPIRED", 0);
    public static final ClaimApiErrorType TRANSACTION_HAS_DECLINED = new ClaimApiErrorType("TRANSACTION_HAS_DECLINED", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ClaimApiErrorType[] $values() {
        return new ClaimApiErrorType[]{TRANSACTION_EXPIRED, TRANSACTION_HAS_DECLINED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ClaimApiErrorType> getEntries() {
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

    private ClaimApiErrorType(String str, int i) {
    }

    static {
        ClaimApiErrorType[] claimApiErrorTypeArr$values = $values();
        $VALUES = claimApiErrorTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(claimApiErrorTypeArr$values);
        CREATOR = new Parcelable.Creator<ClaimApiErrorType>() { // from class: com.okinc.business.web3pay.api.model.ClaimApiErrorType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClaimApiErrorType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ClaimApiErrorType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClaimApiErrorType[] newArray(int i) {
                return new ClaimApiErrorType[i];
            }
        };
    }

    public static ClaimApiErrorType valueOf(String str) {
        return (ClaimApiErrorType) Enum.valueOf(ClaimApiErrorType.class, str);
    }

    public static ClaimApiErrorType[] values() {
        return (ClaimApiErrorType[]) $VALUES.clone();
    }
}
