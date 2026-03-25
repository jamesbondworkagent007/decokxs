package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivatePaySource implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ActivatePaySource[] $VALUES;
    public static final Parcelable.Creator<ActivatePaySource> CREATOR;
    public static final ActivatePaySource CLAIM = new ActivatePaySource("CLAIM", 0);
    public static final ActivatePaySource IM_CLAIM = new ActivatePaySource("IM_CLAIM", 1);
    public static final ActivatePaySource CARD_AUTH = new ActivatePaySource("CARD_AUTH", 2);
    public static final ActivatePaySource OTHER = new ActivatePaySource("OTHER", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ActivatePaySource[] $values() {
        return new ActivatePaySource[]{CLAIM, IM_CLAIM, CARD_AUTH, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ActivatePaySource> getEntries() {
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

    private ActivatePaySource(String str, int i) {
    }

    static {
        ActivatePaySource[] activatePaySourceArr$values = $values();
        $VALUES = activatePaySourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(activatePaySourceArr$values);
        CREATOR = new Parcelable.Creator<ActivatePaySource>() { // from class: com.okinc.business.web3pay.api.model.ActivatePaySource.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ActivatePaySource createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ActivatePaySource.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ActivatePaySource[] newArray(int i) {
                return new ActivatePaySource[i];
            }
        };
    }

    public static ActivatePaySource valueOf(String str) {
        return (ActivatePaySource) Enum.valueOf(ActivatePaySource.class, str);
    }

    public static ActivatePaySource[] values() {
        return (ActivatePaySource[]) $VALUES.clone();
    }
}
