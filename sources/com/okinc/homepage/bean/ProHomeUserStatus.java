package com.okinc.homepage.bean;

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
/* JADX INFO: loaded from: classes23.dex */
public final class ProHomeUserStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProHomeUserStatus[] $VALUES;
    public static final CREATOR CREATOR;
    private final int status;
    public static final ProHomeUserStatus UNKNOWN = new ProHomeUserStatus("UNKNOWN", 0, -1);
    public static final ProHomeUserStatus LOGOUT = new ProHomeUserStatus("LOGOUT", 1, 0);
    public static final ProHomeUserStatus NOT_DEPOSIT = new ProHomeUserStatus("NOT_DEPOSIT", 2, 1);
    public static final ProHomeUserStatus NOT_TRADE = new ProHomeUserStatus("NOT_TRADE", 3, 2);
    public static final ProHomeUserStatus HAD_TRADE = new ProHomeUserStatus("HAD_TRADE", 4, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProHomeUserStatus[] $values() {
        return new ProHomeUserStatus[]{UNKNOWN, LOGOUT, NOT_DEPOSIT, NOT_TRADE, HAD_TRADE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProHomeUserStatus> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    private ProHomeUserStatus(String str, int i, int i2) {
        this.status = i2;
    }

    static {
        ProHomeUserStatus[] proHomeUserStatusArr$values = $values();
        $VALUES = proHomeUserStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(proHomeUserStatusArr$values);
        CREATOR = new CREATOR(null);
    }

    private ProHomeUserStatus(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.status);
    }

    public static final class CREATOR implements Parcelable.Creator<ProHomeUserStatus> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.homepage.bean.ProHomeUserStatus.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final ProHomeUserStatus valueOf(int i) {
            if (i == 0) {
                return ProHomeUserStatus.LOGOUT;
            }
            if (i == 1) {
                return ProHomeUserStatus.NOT_DEPOSIT;
            }
            if (i == 2) {
                return ProHomeUserStatus.NOT_TRADE;
            }
            if (i == 3) {
                return ProHomeUserStatus.HAD_TRADE;
            }
            return ProHomeUserStatus.UNKNOWN;
        }

        public final boolean isValid(int i) {
            ProHomeUserStatus next;
            Iterator<ProHomeUserStatus> it = ProHomeUserStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getStatus() == i) {
                    break;
                }
            }
            return next != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProHomeUserStatus createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ProHomeUserStatus proHomeUserStatusValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(proHomeUserStatusValueOf);
            return proHomeUserStatusValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProHomeUserStatus[] newArray(int i) {
            return new ProHomeUserStatus[i];
        }
    }

    public static ProHomeUserStatus valueOf(String str) {
        return (ProHomeUserStatus) Enum.valueOf(ProHomeUserStatus.class, str);
    }

    public static ProHomeUserStatus[] values() {
        return (ProHomeUserStatus[]) $VALUES.clone();
    }
}
