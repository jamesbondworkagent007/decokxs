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
public final class TokenRecommendContentStyle implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenRecommendContentStyle[] $VALUES;
    public static final Parcelable.Creator<TokenRecommendContentStyle> CREATOR;
    public static final TokenRecommendContentStyle FIX_SHOW_3 = new TokenRecommendContentStyle("FIX_SHOW_3", 0);
    public static final TokenRecommendContentStyle HORIZONTAL_SCROLL = new TokenRecommendContentStyle("HORIZONTAL_SCROLL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenRecommendContentStyle[] $values() {
        return new TokenRecommendContentStyle[]{FIX_SHOW_3, HORIZONTAL_SCROLL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenRecommendContentStyle> getEntries() {
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

    private TokenRecommendContentStyle(String str, int i) {
    }

    static {
        TokenRecommendContentStyle[] tokenRecommendContentStyleArr$values = $values();
        $VALUES = tokenRecommendContentStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenRecommendContentStyleArr$values);
        CREATOR = new Parcelable.Creator<TokenRecommendContentStyle>() { // from class: com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendContentStyle.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TokenRecommendContentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TokenRecommendContentStyle.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TokenRecommendContentStyle[] newArray(int i) {
                return new TokenRecommendContentStyle[i];
            }
        };
    }

    public static TokenRecommendContentStyle valueOf(String str) {
        return (TokenRecommendContentStyle) Enum.valueOf(TokenRecommendContentStyle.class, str);
    }

    public static TokenRecommendContentStyle[] values() {
        return (TokenRecommendContentStyle[]) $VALUES.clone();
    }
}
