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
public final class DepositTransactionStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DepositTransactionStatus[] $VALUES;
    public static final Parcelable.Creator<DepositTransactionStatus> CREATOR;
    public static final Application Companion;
    public static final DepositTransactionStatus WaitConfirmation = new DepositTransactionStatus("WaitConfirmation", 0);
    public static final DepositTransactionStatus Confirmation = new DepositTransactionStatus("Confirmation", 1);
    public static final DepositTransactionStatus Success = new DepositTransactionStatus("Success", 2);
    public static final DepositTransactionStatus OnHoldStatus = new DepositTransactionStatus("OnHoldStatus", 3);
    public static final DepositTransactionStatus Unsuccessful = new DepositTransactionStatus("Unsuccessful", 4);
    public static final DepositTransactionStatus OTHER = new DepositTransactionStatus("OTHER", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DepositTransactionStatus[] $values() {
        return new DepositTransactionStatus[]{WaitConfirmation, Confirmation, Success, OnHoldStatus, Unsuccessful, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DepositTransactionStatus> getEntries() {
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

    private DepositTransactionStatus(String str, int i) {
    }

    static {
        DepositTransactionStatus[] depositTransactionStatusArr$values = $values();
        $VALUES = depositTransactionStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(depositTransactionStatusArr$values);
        Companion = new Application(null);
        CREATOR = new Parcelable.Creator<DepositTransactionStatus>() { // from class: com.okinc.assets.backend.api.model.DepositTransactionStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositTransactionStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return DepositTransactionStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositTransactionStatus[] newArray(int i) {
                return new DepositTransactionStatus[i];
            }
        };
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.DepositTransactionStatus.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final DepositTransactionStatus AEQbTJ(Integer num) {
            return (num != null && num.intValue() == 0) ? DepositTransactionStatus.WaitConfirmation : (num != null && num.intValue() == 1) ? DepositTransactionStatus.Confirmation : (num != null && num.intValue() == 2) ? DepositTransactionStatus.Success : (num != null && num.intValue() == 17) ? DepositTransactionStatus.OnHoldStatus : (num != null && num.intValue() == 11) ? DepositTransactionStatus.Unsuccessful : DepositTransactionStatus.OTHER;
        }
    }

    public static DepositTransactionStatus valueOf(String str) {
        return (DepositTransactionStatus) Enum.valueOf(DepositTransactionStatus.class, str);
    }

    public static DepositTransactionStatus[] values() {
        return (DepositTransactionStatus[]) $VALUES.clone();
    }
}
