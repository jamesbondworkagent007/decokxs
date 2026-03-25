package com.okinc.core.util.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class MyCodeLanding implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MyCodeLanding[] $VALUES;
    public static final Parcelable.Creator<MyCodeLanding> CREATOR;
    public static final MyCodeLanding PAY_FIRST = new MyCodeLanding("PAY_FIRST", 0);
    public static final MyCodeLanding IM_FIRST = new MyCodeLanding("IM_FIRST", 1);
    public static final MyCodeLanding PAY_ONLY = new MyCodeLanding("PAY_ONLY", 2);
    public static final MyCodeLanding IM_ONLY = new MyCodeLanding("IM_ONLY", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MyCodeLanding[] $values() {
        return new MyCodeLanding[]{PAY_FIRST, IM_FIRST, PAY_ONLY, IM_ONLY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MyCodeLanding> getEntries() {
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

    private MyCodeLanding(String str, int i) {
    }

    static {
        MyCodeLanding[] myCodeLandingArr$values = $values();
        $VALUES = myCodeLandingArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(myCodeLandingArr$values);
        CREATOR = new Parcelable.Creator<MyCodeLanding>() { // from class: com.okinc.core.util.model.MyCodeLanding.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MyCodeLanding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return MyCodeLanding.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MyCodeLanding[] newArray(int i) {
                return new MyCodeLanding[i];
            }
        };
    }

    public static MyCodeLanding valueOf(String str) {
        return (MyCodeLanding) Enum.valueOf(MyCodeLanding.class, str);
    }

    public static MyCodeLanding[] values() {
        return (MyCodeLanding[]) $VALUES.clone();
    }
}
