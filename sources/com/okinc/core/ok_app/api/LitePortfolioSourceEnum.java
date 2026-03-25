package com.okinc.core.ok_app.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class LitePortfolioSourceEnum implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LitePortfolioSourceEnum[] $VALUES;
    public static final CREATOR CREATOR;
    private final String value;
    public static final LitePortfolioSourceEnum BOTTOM_NAVIGATION = new LitePortfolioSourceEnum("BOTTOM_NAVIGATION", 0, "bottom_navigation");
    public static final LitePortfolioSourceEnum DASHBOARD_PORTFOLIO_CARD = new LitePortfolioSourceEnum("DASHBOARD_PORTFOLIO_CARD", 1, "dashboard_portfolio_card");
    public static final LitePortfolioSourceEnum BUY_SUCCESS = new LitePortfolioSourceEnum("BUY_SUCCESS", 2, "buy_success");
    public static final LitePortfolioSourceEnum SELL_P2P_ORDER_DETAILS_PAGE = new LitePortfolioSourceEnum("SELL_P2P_ORDER_DETAILS_PAGE", 3, "sell_p2p_order_details_page");
    public static final LitePortfolioSourceEnum SELL_P2P_MESSAGE_CARD = new LitePortfolioSourceEnum("SELL_P2P_MESSAGE_CARD", 4, "sell_p2p_message_card");
    public static final LitePortfolioSourceEnum P2P_LOCKED_AMOUNT = new LitePortfolioSourceEnum("P2P_LOCKED_AMOUNT", 5, "p2p_locked_amount");
    public static final LitePortfolioSourceEnum EARN_DEPOSIT_SUCCESS = new LitePortfolioSourceEnum("EARN_DEPOSIT_SUCCESS", 6, "earn_deposit_success");
    public static final LitePortfolioSourceEnum CONVERT_SUCCESS = new LitePortfolioSourceEnum("CONVERT_SUCCESS", 7, "convert_success");
    public static final LitePortfolioSourceEnum BUY_DELAY_NOTIFICATION = new LitePortfolioSourceEnum("BUY_DELAY_NOTIFICATION", 8, "buy_delay_notification");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LitePortfolioSourceEnum[] $values() {
        return new LitePortfolioSourceEnum[]{BOTTOM_NAVIGATION, DASHBOARD_PORTFOLIO_CARD, BUY_SUCCESS, SELL_P2P_ORDER_DETAILS_PAGE, SELL_P2P_MESSAGE_CARD, P2P_LOCKED_AMOUNT, EARN_DEPOSIT_SUCCESS, CONVERT_SUCCESS, BUY_DELAY_NOTIFICATION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LitePortfolioSourceEnum> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private LitePortfolioSourceEnum(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        LitePortfolioSourceEnum[] litePortfolioSourceEnumArr$values = $values();
        $VALUES = litePortfolioSourceEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(litePortfolioSourceEnumArr$values);
        CREATOR = new CREATOR(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(ordinal());
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class CREATOR implements Parcelable.Creator<LitePortfolioSourceEnum> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.core.ok_app.api.LitePortfolioSourceEnum.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LitePortfolioSourceEnum createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            switch (parcel.readInt()) {
            }
            return LitePortfolioSourceEnum.BOTTOM_NAVIGATION;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LitePortfolioSourceEnum[] newArray(int i) {
            return new LitePortfolioSourceEnum[i];
        }
    }

    public static LitePortfolioSourceEnum valueOf(String str) {
        return (LitePortfolioSourceEnum) Enum.valueOf(LitePortfolioSourceEnum.class, str);
    }

    public static LitePortfolioSourceEnum[] values() {
        return (LitePortfolioSourceEnum[]) $VALUES.clone();
    }
}
