package com.okinc.lifecycle.api.business.recommend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class TokenRecommendComponent implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenRecommendComponent[] $VALUES;
    public static final Parcelable.Creator<TokenRecommendComponent> CREATOR;
    private final String componentName;
    private final int id;
    public static final TokenRecommendComponent POST_SPOT_TRADE = new TokenRecommendComponent("POST_SPOT_TRADE", 0, 1, "Post-Advanced Trade Spot Trade");
    public static final TokenRecommendComponent POST_CONVERT_TRADE = new TokenRecommendComponent("POST_CONVERT_TRADE", 1, 2, "Post-Convert Trade");
    public static final TokenRecommendComponent POST_BUY = new TokenRecommendComponent("POST_BUY", 2, 3, "Post-Buy");
    public static final TokenRecommendComponent POST_SELL = new TokenRecommendComponent("POST_SELL", 3, 4, "Post-Sell");
    public static final TokenRecommendComponent POST_FUND_CREDIT_CARD = new TokenRecommendComponent("POST_FUND_CREDIT_CARD", 4, 5, "Post-Fund Credit Card");
    public static final TokenRecommendComponent POST_FUND_P2P = new TokenRecommendComponent("POST_FUND_P2P", 5, 6, "Post-Fund P2P");
    public static final TokenRecommendComponent POST_FUND_ACH_DEPOSIT = new TokenRecommendComponent("POST_FUND_ACH_DEPOSIT", 6, 7, "Post-Fund ACH Deposit");
    public static final TokenRecommendComponent HOME = new TokenRecommendComponent("HOME", 7, 8, "Home");
    public static final TokenRecommendComponent PORTFOLIO = new TokenRecommendComponent("PORTFOLIO", 8, 9, "Portfolio");
    public static final TokenRecommendComponent POST_CONVERT_CONFIRMATION_EMAIL = new TokenRecommendComponent("POST_CONVERT_CONFIRMATION_EMAIL", 9, 10, "Post-Convert Confirmation Email");
    public static final TokenRecommendComponent POST_SPOT_CONFIRMATION_EMAIL = new TokenRecommendComponent("POST_SPOT_CONFIRMATION_EMAIL", 10, 11, "Post-Spot Confirmation Email");
    public static final TokenRecommendComponent TOKEN_DETAILS = new TokenRecommendComponent("TOKEN_DETAILS", 11, 12, "Token Detail");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenRecommendComponent[] $values() {
        return new TokenRecommendComponent[]{POST_SPOT_TRADE, POST_CONVERT_TRADE, POST_BUY, POST_SELL, POST_FUND_CREDIT_CARD, POST_FUND_P2P, POST_FUND_ACH_DEPOSIT, HOME, PORTFOLIO, POST_CONVERT_CONFIRMATION_EMAIL, POST_SPOT_CONFIRMATION_EMAIL, TOKEN_DETAILS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenRecommendComponent> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getComponentName() {
        return this.componentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private TokenRecommendComponent(String str, int i, int i2, String str2) {
        this.id = i2;
        this.componentName = str2;
    }

    static {
        TokenRecommendComponent[] tokenRecommendComponentArr$values = $values();
        $VALUES = tokenRecommendComponentArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenRecommendComponentArr$values);
        CREATOR = new Parcelable.Creator<TokenRecommendComponent>() { // from class: com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendComponent.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TokenRecommendComponent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TokenRecommendComponent.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TokenRecommendComponent[] newArray(int i) {
                return new TokenRecommendComponent[i];
            }
        };
    }

    public static TokenRecommendComponent valueOf(String str) {
        return (TokenRecommendComponent) Enum.valueOf(TokenRecommendComponent.class, str);
    }

    public static TokenRecommendComponent[] values() {
        return (TokenRecommendComponent[]) $VALUES.clone();
    }
}
