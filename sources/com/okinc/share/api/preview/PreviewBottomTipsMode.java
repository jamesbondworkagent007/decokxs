package com.okinc.share.api.preview;

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
public final class PreviewBottomTipsMode implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PreviewBottomTipsMode[] $VALUES;
    public static final CREATOR CREATOR;
    public static final PreviewBottomTipsMode DEFAULT = new PreviewBottomTipsMode("DEFAULT", 0, 0);
    public static final PreviewBottomTipsMode FORCE_INVITER = new PreviewBottomTipsMode("FORCE_INVITER", 1, 1);
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PreviewBottomTipsMode[] $values() {
        return new PreviewBottomTipsMode[]{DEFAULT, FORCE_INVITER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PreviewBottomTipsMode> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private PreviewBottomTipsMode(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        PreviewBottomTipsMode[] previewBottomTipsModeArr$values = $values();
        $VALUES = previewBottomTipsModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(previewBottomTipsModeArr$values);
        CREATOR = new CREATOR(null);
    }

    private PreviewBottomTipsMode(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<PreviewBottomTipsMode> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.api.preview.PreviewBottomTipsMode.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final PreviewBottomTipsMode valueOf(int i) {
            PreviewBottomTipsMode previewBottomTipsMode = PreviewBottomTipsMode.DEFAULT;
            if (i == previewBottomTipsMode.getType()) {
                return previewBottomTipsMode;
            }
            PreviewBottomTipsMode previewBottomTipsMode2 = PreviewBottomTipsMode.FORCE_INVITER;
            if (i == previewBottomTipsMode2.getType()) {
                return previewBottomTipsMode2;
            }
            return null;
        }

        public final boolean isValid(int i) {
            PreviewBottomTipsMode previewBottomTipsMode;
            PreviewBottomTipsMode[] previewBottomTipsModeArrValues = PreviewBottomTipsMode.values();
            int length = previewBottomTipsModeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    previewBottomTipsMode = null;
                    break;
                }
                previewBottomTipsMode = previewBottomTipsModeArrValues[i2];
                if (previewBottomTipsMode.getType() == i) {
                    break;
                }
                i2++;
            }
            return previewBottomTipsMode != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PreviewBottomTipsMode createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            PreviewBottomTipsMode previewBottomTipsModeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(previewBottomTipsModeValueOf);
            return previewBottomTipsModeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PreviewBottomTipsMode[] newArray(int i) {
            return new PreviewBottomTipsMode[i];
        }
    }

    public static PreviewBottomTipsMode valueOf(String str) {
        return (PreviewBottomTipsMode) Enum.valueOf(PreviewBottomTipsMode.class, str);
    }

    public static PreviewBottomTipsMode[] values() {
        return (PreviewBottomTipsMode[]) $VALUES.clone();
    }
}
