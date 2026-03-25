package com.okinc.assets.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class TwoFactorMethod implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TwoFactorMethod[] $VALUES;
    public static final Parcelable.Creator<TwoFactorMethod> CREATOR;
    public static final TwoFactorMethod Authenticator = new TwoFactorMethod("Authenticator", 0);
    public static final TwoFactorMethod Email = new TwoFactorMethod("Email", 1);
    public static final TwoFactorMethod Phone = new TwoFactorMethod("Phone", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TwoFactorMethod[] $values() {
        return new TwoFactorMethod[]{Authenticator, Email, Phone};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TwoFactorMethod> getEntries() {
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

    private TwoFactorMethod(String str, int i) {
    }

    static {
        TwoFactorMethod[] twoFactorMethodArr$values = $values();
        $VALUES = twoFactorMethodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(twoFactorMethodArr$values);
        CREATOR = new Parcelable.Creator<TwoFactorMethod>() { // from class: com.okinc.assets.api.model.TwoFactorMethod.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TwoFactorMethod createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TwoFactorMethod.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TwoFactorMethod[] newArray(int i) {
                return new TwoFactorMethod[i];
            }
        };
    }

    public static TwoFactorMethod valueOf(String str) {
        return (TwoFactorMethod) Enum.valueOf(TwoFactorMethod.class, str);
    }

    public static TwoFactorMethod[] values() {
        return (TwoFactorMethod[]) $VALUES.clone();
    }
}
