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
public final class WithdrawNetworkSupportType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WithdrawNetworkSupportType[] $VALUES;
    public static final Parcelable.Creator<WithdrawNetworkSupportType> CREATOR;
    public static final TaskDescription Companion;
    public static final WithdrawNetworkSupportType Normal = new WithdrawNetworkSupportType("Normal", 0);
    public static final WithdrawNetworkSupportType EntityUnsupportedNetwork = new WithdrawNetworkSupportType("EntityUnsupportedNetwork", 1);
    public static final WithdrawNetworkSupportType Other = new WithdrawNetworkSupportType("Other", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WithdrawNetworkSupportType[] $values() {
        return new WithdrawNetworkSupportType[]{Normal, EntityUnsupportedNetwork, Other};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WithdrawNetworkSupportType> getEntries() {
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

    private WithdrawNetworkSupportType(String str, int i) {
    }

    static {
        WithdrawNetworkSupportType[] withdrawNetworkSupportTypeArr$values = $values();
        $VALUES = withdrawNetworkSupportTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(withdrawNetworkSupportTypeArr$values);
        Companion = new TaskDescription(null);
        CREATOR = new Parcelable.Creator<WithdrawNetworkSupportType>() { // from class: com.okinc.assets.backend.api.model.WithdrawNetworkSupportType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawNetworkSupportType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return WithdrawNetworkSupportType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawNetworkSupportType[] newArray(int i) {
                return new WithdrawNetworkSupportType[i];
            }
        };
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.WithdrawNetworkSupportType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final WithdrawNetworkSupportType copydefault(Integer num) {
            return (num != null && num.intValue() == 0) ? WithdrawNetworkSupportType.Normal : (num != null && num.intValue() == 1) ? WithdrawNetworkSupportType.EntityUnsupportedNetwork : WithdrawNetworkSupportType.Other;
        }
    }

    public static WithdrawNetworkSupportType valueOf(String str) {
        return (WithdrawNetworkSupportType) Enum.valueOf(WithdrawNetworkSupportType.class, str);
    }

    public static WithdrawNetworkSupportType[] values() {
        return (WithdrawNetworkSupportType[]) $VALUES.clone();
    }
}
