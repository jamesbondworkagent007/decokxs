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
public final class EIP7702WalletStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EIP7702WalletStatus[] $VALUES;
    public static final Parcelable.Creator<EIP7702WalletStatus> CREATOR;
    public static final Application Companion;
    private final int status;
    public static final EIP7702WalletStatus Unknown = new EIP7702WalletStatus("Unknown", 0, 0);
    public static final EIP7702WalletStatus NeedUpgrade = new EIP7702WalletStatus("NeedUpgrade", 1, 1);
    public static final EIP7702WalletStatus UpgradedOKX = new EIP7702WalletStatus("UpgradedOKX", 2, 2);
    public static final EIP7702WalletStatus UpgradedNonOKX = new EIP7702WalletStatus("UpgradedNonOKX", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EIP7702WalletStatus[] $values() {
        return new EIP7702WalletStatus[]{Unknown, NeedUpgrade, UpgradedOKX, UpgradedNonOKX};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EIP7702WalletStatus> getEntries() {
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

    private EIP7702WalletStatus(String str, int i, int i2) {
        this.status = i2;
    }

    static {
        EIP7702WalletStatus[] eIP7702WalletStatusArr$values = $values();
        $VALUES = eIP7702WalletStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eIP7702WalletStatusArr$values);
        Companion = new Application(null);
        CREATOR = new Parcelable.Creator<EIP7702WalletStatus>() { // from class: com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EIP7702WalletStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return EIP7702WalletStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EIP7702WalletStatus[] newArray(int i) {
                return new EIP7702WalletStatus[i];
            }
        };
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final EIP7702WalletStatus KWHzl(Integer num) {
            return (num != null && num.intValue() == 1) ? EIP7702WalletStatus.NeedUpgrade : (num != null && num.intValue() == 2) ? EIP7702WalletStatus.UpgradedOKX : (num != null && num.intValue() == 3) ? EIP7702WalletStatus.UpgradedNonOKX : EIP7702WalletStatus.Unknown;
        }
    }

    public static EIP7702WalletStatus valueOf(String str) {
        return (EIP7702WalletStatus) Enum.valueOf(EIP7702WalletStatus.class, str);
    }

    public static EIP7702WalletStatus[] values() {
        return (EIP7702WalletStatus[]) $VALUES.clone();
    }
}
