package com.okinc.business.defi.wallet.eip7702.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class EIP7702ChainStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EIP7702ChainStatus[] $VALUES;
    public static final Parcelable.Creator<EIP7702ChainStatus> CREATOR;
    public static final Activity Companion;
    private final int status;
    public static final EIP7702ChainStatus Unknown = new EIP7702ChainStatus("Unknown", 0, 0);
    public static final EIP7702ChainStatus NeedUpgrade = new EIP7702ChainStatus("NeedUpgrade", 1, 1);
    public static final EIP7702ChainStatus Upgrading = new EIP7702ChainStatus("Upgrading", 2, 2);
    public static final EIP7702ChainStatus UpgradedOKX = new EIP7702ChainStatus("UpgradedOKX", 3, 3);
    public static final EIP7702ChainStatus UpgradedNonOKX = new EIP7702ChainStatus("UpgradedNonOKX", 4, 4);
    public static final EIP7702ChainStatus Revoking = new EIP7702ChainStatus("Revoking", 5, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EIP7702ChainStatus[] $values() {
        return new EIP7702ChainStatus[]{Unknown, NeedUpgrade, Upgrading, UpgradedOKX, UpgradedNonOKX, Revoking};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EIP7702ChainStatus> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private EIP7702ChainStatus(String str, int i, int i2) {
        this.status = i2;
    }

    static {
        EIP7702ChainStatus[] eIP7702ChainStatusArr$values = $values();
        $VALUES = eIP7702ChainStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eIP7702ChainStatusArr$values);
        Companion = new Activity(null);
        CREATOR = new Parcelable.Creator<EIP7702ChainStatus>() { // from class: com.okinc.business.defi.wallet.eip7702.data.model.EIP7702ChainStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EIP7702ChainStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return EIP7702ChainStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EIP7702ChainStatus[] newArray(int i) {
                return new EIP7702ChainStatus[i];
            }
        };
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.eip7702.data.model.EIP7702ChainStatus.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final EIP7702ChainStatus copydefault(Integer num) {
            return (num != null && num.intValue() == 1) ? EIP7702ChainStatus.NeedUpgrade : (num != null && num.intValue() == 2) ? EIP7702ChainStatus.Upgrading : (num != null && num.intValue() == 3) ? EIP7702ChainStatus.UpgradedOKX : (num != null && num.intValue() == 4) ? EIP7702ChainStatus.UpgradedNonOKX : (num != null && num.intValue() == 5) ? EIP7702ChainStatus.Revoking : EIP7702ChainStatus.Unknown;
        }
    }

    public static EIP7702ChainStatus valueOf(String str) {
        return (EIP7702ChainStatus) Enum.valueOf(EIP7702ChainStatus.class, str);
    }

    public static EIP7702ChainStatus[] values() {
        return (EIP7702ChainStatus[]) $VALUES.clone();
    }
}
