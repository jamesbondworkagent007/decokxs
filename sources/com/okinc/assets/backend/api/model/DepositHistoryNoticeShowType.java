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
public final class DepositHistoryNoticeShowType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DepositHistoryNoticeShowType[] $VALUES;
    public static final Parcelable.Creator<DepositHistoryNoticeShowType> CREATOR;
    public static final ActionBar Companion;
    public static final DepositHistoryNoticeShowType Reminder = new DepositHistoryNoticeShowType("Reminder", 0);
    public static final DepositHistoryNoticeShowType EntityUnsupportedNetwork = new DepositHistoryNoticeShowType("EntityUnsupportedNetwork", 1);
    public static final DepositHistoryNoticeShowType Other = new DepositHistoryNoticeShowType("Other", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DepositHistoryNoticeShowType[] $values() {
        return new DepositHistoryNoticeShowType[]{Reminder, EntityUnsupportedNetwork, Other};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DepositHistoryNoticeShowType> getEntries() {
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

    private DepositHistoryNoticeShowType(String str, int i) {
    }

    static {
        DepositHistoryNoticeShowType[] depositHistoryNoticeShowTypeArr$values = $values();
        $VALUES = depositHistoryNoticeShowTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(depositHistoryNoticeShowTypeArr$values);
        Companion = new ActionBar(null);
        CREATOR = new Parcelable.Creator<DepositHistoryNoticeShowType>() { // from class: com.okinc.assets.backend.api.model.DepositHistoryNoticeShowType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositHistoryNoticeShowType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return DepositHistoryNoticeShowType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositHistoryNoticeShowType[] newArray(int i) {
                return new DepositHistoryNoticeShowType[i];
            }
        };
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.DepositHistoryNoticeShowType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final DepositHistoryNoticeShowType OLrzqt(Integer num) {
            if ((num != null && num.intValue() == 0) || num == null) {
                return DepositHistoryNoticeShowType.Reminder;
            }
            return num.intValue() == 1 ? DepositHistoryNoticeShowType.EntityUnsupportedNetwork : DepositHistoryNoticeShowType.Other;
        }
    }

    public static DepositHistoryNoticeShowType valueOf(String str) {
        return (DepositHistoryNoticeShowType) Enum.valueOf(DepositHistoryNoticeShowType.class, str);
    }

    public static DepositHistoryNoticeShowType[] values() {
        return (DepositHistoryNoticeShowType[]) $VALUES.clone();
    }
}
