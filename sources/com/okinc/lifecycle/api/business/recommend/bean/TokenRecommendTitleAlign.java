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
public final class TokenRecommendTitleAlign implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenRecommendTitleAlign[] $VALUES;
    public static final Parcelable.Creator<TokenRecommendTitleAlign> CREATOR;
    public static final TokenRecommendTitleAlign ALIGN_LEFT = new TokenRecommendTitleAlign("ALIGN_LEFT", 0);
    public static final TokenRecommendTitleAlign ALIGN_CENTER = new TokenRecommendTitleAlign("ALIGN_CENTER", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenRecommendTitleAlign[] $values() {
        return new TokenRecommendTitleAlign[]{ALIGN_LEFT, ALIGN_CENTER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenRecommendTitleAlign> getEntries() {
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

    private TokenRecommendTitleAlign(String str, int i) {
    }

    static {
        TokenRecommendTitleAlign[] tokenRecommendTitleAlignArr$values = $values();
        $VALUES = tokenRecommendTitleAlignArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenRecommendTitleAlignArr$values);
        CREATOR = new Parcelable.Creator<TokenRecommendTitleAlign>() { // from class: com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTitleAlign.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TokenRecommendTitleAlign createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TokenRecommendTitleAlign.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TokenRecommendTitleAlign[] newArray(int i) {
                return new TokenRecommendTitleAlign[i];
            }
        };
    }

    public static TokenRecommendTitleAlign valueOf(String str) {
        return (TokenRecommendTitleAlign) Enum.valueOf(TokenRecommendTitleAlign.class, str);
    }

    public static TokenRecommendTitleAlign[] values() {
        return (TokenRecommendTitleAlign[]) $VALUES.clone();
    }
}
