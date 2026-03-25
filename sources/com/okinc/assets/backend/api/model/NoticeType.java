package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class NoticeType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NoticeType[] $VALUES;
    public static final Parcelable.Creator<NoticeType> CREATOR;
    public static final TaskDescription Companion;
    public static final NoticeType KYC = new NoticeType("KYC", 0);
    public static final NoticeType P2P = new NoticeType(CustomMessageData.SERVICE_NAME_P2P, 1);
    public static final NoticeType TravelRule = new NoticeType("TravelRule", 2);
    public static final NoticeType Layer2 = new NoticeType("Layer2", 3);
    public static final NoticeType EntityUnsupportedNetworkWithdraw = new NoticeType("EntityUnsupportedNetworkWithdraw", 4);
    public static final NoticeType EntityUnsupportedNetworkTransfer = new NoticeType("EntityUnsupportedNetworkTransfer", 5);
    public static final NoticeType CryptoReward = new NoticeType("CryptoReward", 6);
    public static final NoticeType CedefiLockedAssets = new NoticeType("CedefiLockedAssets", 7);
    public static final NoticeType CedefiGrayAssets = new NoticeType("CedefiGrayAssets", 8);
    public static final NoticeType CedefiDirtyWallet = new NoticeType("CedefiDirtyWallet", 9);
    public static final NoticeType Other = new NoticeType("Other", 10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NoticeType[] $values() {
        return new NoticeType[]{KYC, P2P, TravelRule, Layer2, EntityUnsupportedNetworkWithdraw, EntityUnsupportedNetworkTransfer, CryptoReward, CedefiLockedAssets, CedefiGrayAssets, CedefiDirtyWallet, Other};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NoticeType> getEntries() {
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

    private NoticeType(String str, int i) {
    }

    static {
        NoticeType[] noticeTypeArr$values = $values();
        $VALUES = noticeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(noticeTypeArr$values);
        Companion = new TaskDescription(null);
        CREATOR = new Parcelable.Creator<NoticeType>() { // from class: com.okinc.assets.backend.api.model.NoticeType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoticeType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return NoticeType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoticeType[] newArray(int i) {
                return new NoticeType[i];
            }
        };
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.NoticeType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final NoticeType OLrzqt(Integer num) {
            return (num != null && num.intValue() == 2) ? NoticeType.KYC : (num != null && num.intValue() == 3) ? NoticeType.P2P : (num != null && num.intValue() == 4) ? NoticeType.TravelRule : (num != null && num.intValue() == 5) ? NoticeType.Layer2 : (num != null && num.intValue() == 6) ? NoticeType.EntityUnsupportedNetworkWithdraw : (num != null && num.intValue() == 7) ? NoticeType.EntityUnsupportedNetworkTransfer : (num != null && num.intValue() == 9) ? NoticeType.CryptoReward : (num != null && num.intValue() == 11) ? NoticeType.CedefiLockedAssets : (num != null && num.intValue() == 12) ? NoticeType.CedefiGrayAssets : (num != null && num.intValue() == 13) ? NoticeType.CedefiDirtyWallet : NoticeType.Other;
        }
    }

    public static NoticeType valueOf(String str) {
        return (NoticeType) Enum.valueOf(NoticeType.class, str);
    }

    public static NoticeType[] values() {
        return (NoticeType[]) $VALUES.clone();
    }
}
