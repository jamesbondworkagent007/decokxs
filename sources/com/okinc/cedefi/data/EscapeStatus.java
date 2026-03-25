package com.okinc.cedefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class EscapeStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EscapeStatus[] $VALUES;
    public static final Parcelable.Creator<EscapeStatus> CREATOR;
    public static final StateListAnimator Companion;
    private final String status;
    public static final EscapeStatus NORMAL = new EscapeStatus("NORMAL", 0, "0");
    public static final EscapeStatus WALLET_ESCAPING = new EscapeStatus("WALLET_ESCAPING", 1, "2");
    public static final EscapeStatus WALLET_ESCAPED = new EscapeStatus("WALLET_ESCAPED", 2, "3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EscapeStatus[] $values() {
        return new EscapeStatus[]{NORMAL, WALLET_ESCAPING, WALLET_ESCAPED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EscapeStatus> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private EscapeStatus(String str, int i, String str2) {
        this.status = str2;
    }

    static {
        EscapeStatus[] escapeStatusArr$values = $values();
        $VALUES = escapeStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(escapeStatusArr$values);
        Companion = new StateListAnimator(null);
        CREATOR = new Parcelable.Creator<EscapeStatus>() { // from class: com.okinc.cedefi.data.EscapeStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EscapeStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return EscapeStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EscapeStatus[] newArray(int i) {
                return new EscapeStatus[i];
            }
        };
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cedefi.data.EscapeStatus.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static EscapeStatus valueOf(String str) {
        return (EscapeStatus) Enum.valueOf(EscapeStatus.class, str);
    }

    public static EscapeStatus[] values() {
        return (EscapeStatus[]) $VALUES.clone();
    }
}
