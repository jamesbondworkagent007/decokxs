package com.okinc.homepage.bean;

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
public final class HomePopupType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HomePopupType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final HomePopupType KYC_REWARD_CLAIMED = new HomePopupType("KYC_REWARD_CLAIMED", 0, 1);
    public static final HomePopupType CRYPTO_GIFT_PENDING_ACTIVATE = new HomePopupType("CRYPTO_GIFT_PENDING_ACTIVATE", 1, 2);
    public static final HomePopupType MYSTERY_BOX_INVITER_REWARD = new HomePopupType("MYSTERY_BOX_INVITER_REWARD", 2, 3);
    public static final HomePopupType NUB_TASK_PENDING = new HomePopupType("NUB_TASK_PENDING", 3, 4);
    public static final HomePopupType SUPPORT_POPUP = new HomePopupType("SUPPORT_POPUP", 4, 5);
    public static final HomePopupType VIP_LANDING_PAGE = new HomePopupType("VIP_LANDING_PAGE", 5, 8);
    public static final HomePopupType VIP_ACTIVATE_POPUP = new HomePopupType("VIP_ACTIVATE_POPUP", 6, 9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HomePopupType[] $values() {
        return new HomePopupType[]{KYC_REWARD_CLAIMED, CRYPTO_GIFT_PENDING_ACTIVATE, MYSTERY_BOX_INVITER_REWARD, NUB_TASK_PENDING, SUPPORT_POPUP, VIP_LANDING_PAGE, VIP_ACTIVATE_POPUP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HomePopupType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private HomePopupType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        HomePopupType[] homePopupTypeArr$values = $values();
        $VALUES = homePopupTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(homePopupTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private HomePopupType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<HomePopupType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.homepage.bean.HomePopupType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final HomePopupType valueOf(int i) {
            HomePopupType homePopupType = HomePopupType.KYC_REWARD_CLAIMED;
            if (i == homePopupType.getType()) {
                return homePopupType;
            }
            HomePopupType homePopupType2 = HomePopupType.CRYPTO_GIFT_PENDING_ACTIVATE;
            if (i == homePopupType2.getType()) {
                return homePopupType2;
            }
            HomePopupType homePopupType3 = HomePopupType.MYSTERY_BOX_INVITER_REWARD;
            if (i == homePopupType3.getType()) {
                return homePopupType3;
            }
            HomePopupType homePopupType4 = HomePopupType.SUPPORT_POPUP;
            if (i == homePopupType4.getType()) {
                return homePopupType4;
            }
            HomePopupType homePopupType5 = HomePopupType.VIP_LANDING_PAGE;
            if (i == homePopupType5.getType()) {
                return homePopupType5;
            }
            HomePopupType homePopupType6 = HomePopupType.NUB_TASK_PENDING;
            if (i == homePopupType6.getType()) {
                return homePopupType6;
            }
            return null;
        }

        public final boolean isValid(int i) {
            HomePopupType homePopupType;
            HomePopupType[] homePopupTypeArrValues = HomePopupType.values();
            int length = homePopupTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    homePopupType = null;
                    break;
                }
                homePopupType = homePopupTypeArrValues[i2];
                if (homePopupType.getType() == i) {
                    break;
                }
                i2++;
            }
            return homePopupType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HomePopupType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            HomePopupType homePopupTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(homePopupTypeValueOf);
            return homePopupTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HomePopupType[] newArray(int i) {
            return new HomePopupType[i];
        }
    }

    public static HomePopupType valueOf(String str) {
        return (HomePopupType) Enum.valueOf(HomePopupType.class, str);
    }

    public static HomePopupType[] values() {
        return (HomePopupType[]) $VALUES.clone();
    }
}
