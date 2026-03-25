package com.okinc.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class QuickMarginType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ QuickMarginType[] $VALUES;
    public static final Parcelable.Creator<QuickMarginType> CREATOR;
    public static final QuickMarginType MANUAL = new QuickMarginType("MANUAL", 0);
    public static final QuickMarginType AUTO_BORROW = new QuickMarginType("AUTO_BORROW", 1);
    public static final QuickMarginType AUTO_REPAY = new QuickMarginType("AUTO_REPAY", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ QuickMarginType[] $values() {
        return new QuickMarginType[]{MANUAL, AUTO_BORROW, AUTO_REPAY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<QuickMarginType> getEntries() {
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

    private QuickMarginType(String str, int i) {
    }

    static {
        QuickMarginType[] quickMarginTypeArr$values = $values();
        $VALUES = quickMarginTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(quickMarginTypeArr$values);
        CREATOR = new Parcelable.Creator<QuickMarginType>() { // from class: com.okinc.biz.QuickMarginType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuickMarginType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return QuickMarginType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuickMarginType[] newArray(int i) {
                return new QuickMarginType[i];
            }
        };
    }

    public final String convertToApiType() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static QuickMarginType valueOf(String str) {
        return (QuickMarginType) Enum.valueOf(QuickMarginType.class, str);
    }

    public static QuickMarginType[] values() {
        return (QuickMarginType[]) $VALUES.clone();
    }
}
