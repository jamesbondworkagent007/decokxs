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
public final class ScanViewType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ScanViewType[] $VALUES;
    public static final Parcelable.Creator<ScanViewType> CREATOR;
    public static final ScanViewType CAMERA = new ScanViewType("CAMERA", 0);
    public static final ScanViewType QR_CODE = new ScanViewType("QR_CODE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ScanViewType[] $values() {
        return new ScanViewType[]{CAMERA, QR_CODE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ScanViewType> getEntries() {
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

    private ScanViewType(String str, int i) {
    }

    static {
        ScanViewType[] scanViewTypeArr$values = $values();
        $VALUES = scanViewTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(scanViewTypeArr$values);
        CREATOR = new Parcelable.Creator<ScanViewType>() { // from class: com.okinc.core.util.model.ScanViewType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScanViewType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ScanViewType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScanViewType[] newArray(int i) {
                return new ScanViewType[i];
            }
        };
    }

    public static ScanViewType valueOf(String str) {
        return (ScanViewType) Enum.valueOf(ScanViewType.class, str);
    }

    public static ScanViewType[] values() {
        return (ScanViewType[]) $VALUES.clone();
    }
}
