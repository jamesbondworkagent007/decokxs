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
public final class DepositHistoryNoticeActionType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DepositHistoryNoticeActionType[] $VALUES;
    public static final Parcelable.Creator<DepositHistoryNoticeActionType> CREATOR;
    public static final ActionBar Companion;
    public static final DepositHistoryNoticeActionType Withdraw = new DepositHistoryNoticeActionType("Withdraw", 0);
    public static final DepositHistoryNoticeActionType TransferToMaster = new DepositHistoryNoticeActionType("TransferToMaster", 1);
    public static final DepositHistoryNoticeActionType Other = new DepositHistoryNoticeActionType("Other", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DepositHistoryNoticeActionType[] $values() {
        return new DepositHistoryNoticeActionType[]{Withdraw, TransferToMaster, Other};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DepositHistoryNoticeActionType> getEntries() {
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

    private DepositHistoryNoticeActionType(String str, int i) {
    }

    static {
        DepositHistoryNoticeActionType[] depositHistoryNoticeActionTypeArr$values = $values();
        $VALUES = depositHistoryNoticeActionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(depositHistoryNoticeActionTypeArr$values);
        Companion = new ActionBar(null);
        CREATOR = new Parcelable.Creator<DepositHistoryNoticeActionType>() { // from class: com.okinc.assets.backend.api.model.DepositHistoryNoticeActionType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositHistoryNoticeActionType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return DepositHistoryNoticeActionType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositHistoryNoticeActionType[] newArray(int i) {
                return new DepositHistoryNoticeActionType[i];
            }
        };
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.DepositHistoryNoticeActionType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final DepositHistoryNoticeActionType KWHzl(Integer num) {
            return (num != null && num.intValue() == 1) ? DepositHistoryNoticeActionType.Withdraw : (num != null && num.intValue() == 2) ? DepositHistoryNoticeActionType.TransferToMaster : DepositHistoryNoticeActionType.Other;
        }
    }

    public static DepositHistoryNoticeActionType valueOf(String str) {
        return (DepositHistoryNoticeActionType) Enum.valueOf(DepositHistoryNoticeActionType.class, str);
    }

    public static DepositHistoryNoticeActionType[] values() {
        return (DepositHistoryNoticeActionType[]) $VALUES.clone();
    }
}
