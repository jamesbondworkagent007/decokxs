package com.okinc.business.defi.wallet.mine.walletbind.datasource;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class Intention implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Intention[] $VALUES;
    public static final Parcelable.Creator<Intention> CREATOR;
    public static final StateListAnimator Companion;
    private final String value;
    public static final Intention EXCHANGE_MANAGEMENT = new Intention("EXCHANGE_MANAGEMENT", 0, "exchange_management");
    public static final Intention EXCHANGE_WITHDRAW = new Intention("EXCHANGE_WITHDRAW", 1, "exchange_withdraw");
    public static final Intention WALLET_MANAGEMENT = new Intention("WALLET_MANAGEMENT", 2, "wallet_management");
    public static final Intention WALLET_WITHDRAW = new Intention("WALLET_WITHDRAW", 3, "wallet_withdraw");
    public static final Intention WALLET_GENERAL = new Intention("WALLET_GENERAL", 4, "wallet_general");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Intention[] $values() {
        return new Intention[]{EXCHANGE_MANAGEMENT, EXCHANGE_WITHDRAW, WALLET_MANAGEMENT, WALLET_WITHDRAW, WALLET_GENERAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Intention> getEntries() {
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

    private Intention(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        Intention[] intentionArr$values = $values();
        $VALUES = intentionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(intentionArr$values);
        Companion = new StateListAnimator(null);
        CREATOR = new Parcelable.Creator<Intention>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Intention createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return Intention.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Intention[] newArray(int i) {
                return new Intention[i];
            }
        };
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final Intention copydefault(String str) {
            Intention next;
            Iterator<Intention> it = Intention.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getValue(), (Object) str)) {
                    break;
                }
            }
            return next;
        }
    }

    public static Intention valueOf(String str) {
        return (Intention) Enum.valueOf(Intention.class, str);
    }

    public static Intention[] values() {
        return (Intention[]) $VALUES.clone();
    }
}
