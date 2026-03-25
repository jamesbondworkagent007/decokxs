package com.okinc.share.view;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class FootViewTheme implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FootViewTheme[] $VALUES;
    public static final CREATOR CREATOR;
    private final int theme;
    public static final FootViewTheme FOLLOW_APP = new FootViewTheme("FOLLOW_APP", 0, 0);
    public static final FootViewTheme FIXED_LIGHT = new FootViewTheme("FIXED_LIGHT", 1, 1);
    public static final FootViewTheme FIXED_DARK = new FootViewTheme("FIXED_DARK", 2, 2);
    public static final FootViewTheme FIXED_VIP = new FootViewTheme("FIXED_VIP", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FootViewTheme[] $values() {
        return new FootViewTheme[]{FOLLOW_APP, FIXED_LIGHT, FIXED_DARK, FIXED_VIP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FootViewTheme> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTheme() {
        return this.theme;
    }

    private FootViewTheme(String str, int i, int i2) {
        this.theme = i2;
    }

    static {
        FootViewTheme[] footViewThemeArr$values = $values();
        $VALUES = footViewThemeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(footViewThemeArr$values);
        CREATOR = new CREATOR(null);
    }

    private FootViewTheme(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.theme);
    }

    public static final class CREATOR implements Parcelable.Creator<FootViewTheme> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.view.FootViewTheme.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final FootViewTheme valueOf(int i) {
            FootViewTheme footViewTheme = FootViewTheme.FOLLOW_APP;
            if (i == footViewTheme.getTheme()) {
                return footViewTheme;
            }
            FootViewTheme footViewTheme2 = FootViewTheme.FIXED_LIGHT;
            if (i == footViewTheme2.getTheme()) {
                return footViewTheme2;
            }
            FootViewTheme footViewTheme3 = FootViewTheme.FIXED_DARK;
            if (i == footViewTheme3.getTheme()) {
                return footViewTheme3;
            }
            FootViewTheme footViewTheme4 = FootViewTheme.FIXED_VIP;
            if (i == footViewTheme4.getTheme()) {
                return footViewTheme4;
            }
            return null;
        }

        public final boolean isValid(int i) {
            FootViewTheme footViewTheme;
            FootViewTheme[] footViewThemeArrValues = FootViewTheme.values();
            int length = footViewThemeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    footViewTheme = null;
                    break;
                }
                footViewTheme = footViewThemeArrValues[i2];
                if (footViewTheme.getTheme() == i) {
                    break;
                }
                i2++;
            }
            return footViewTheme != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FootViewTheme createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            FootViewTheme footViewThemeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(footViewThemeValueOf);
            return footViewThemeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FootViewTheme[] newArray(int i) {
            return new FootViewTheme[i];
        }
    }

    public static FootViewTheme valueOf(String str) {
        return (FootViewTheme) Enum.valueOf(FootViewTheme.class, str);
    }

    public static FootViewTheme[] values() {
        return (FootViewTheme[]) $VALUES.clone();
    }
}
