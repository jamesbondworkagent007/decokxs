package com.okinc.business.market.data.constant;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TokenGroupActionType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenGroupActionType[] $VALUES;
    public static final Parcelable.Creator<TokenGroupActionType> CREATOR;
    public static final TokenGroupActionType NEW = new TokenGroupActionType("NEW", 0);
    public static final TokenGroupActionType EDIT = new TokenGroupActionType("EDIT", 1);
    public static final TokenGroupActionType DELETE = new TokenGroupActionType("DELETE", 2);
    public static final TokenGroupActionType NONE = new TokenGroupActionType("NONE", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenGroupActionType[] $values() {
        return new TokenGroupActionType[]{NEW, EDIT, DELETE, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenGroupActionType> getEntries() {
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

    private TokenGroupActionType(String str, int i) {
    }

    static {
        TokenGroupActionType[] tokenGroupActionTypeArr$values = $values();
        $VALUES = tokenGroupActionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenGroupActionTypeArr$values);
        CREATOR = new Parcelable.Creator<TokenGroupActionType>() { // from class: com.okinc.business.market.data.constant.TokenGroupActionType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TokenGroupActionType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TokenGroupActionType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TokenGroupActionType[] newArray(int i) {
                return new TokenGroupActionType[i];
            }
        };
    }

    public static TokenGroupActionType valueOf(String str) {
        return (TokenGroupActionType) Enum.valueOf(TokenGroupActionType.class, str);
    }

    public static TokenGroupActionType[] values() {
        return (TokenGroupActionType[]) $VALUES.clone();
    }
}
