package com.okinc.im.bean.tag;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class TagSize implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TagSize[] $VALUES;
    public static final CREATOR CREATOR;
    public static final TagSize DP_14 = new TagSize("DP_14", 0, 14);
    public static final TagSize DP_18 = new TagSize("DP_18", 1, 18);
    public static final TagSize DP_26 = new TagSize("DP_26", 2, 26);
    private final int size;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TagSize[] $values() {
        return new TagSize[]{DP_14, DP_18, DP_26};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TagSize> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSize() {
        return this.size;
    }

    private TagSize(String str, int i, int i2) {
        this.size = i2;
    }

    static {
        TagSize[] tagSizeArr$values = $values();
        $VALUES = tagSizeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tagSizeArr$values);
        CREATOR = new CREATOR(null);
    }

    private TagSize(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.size);
    }

    public static final class CREATOR implements Parcelable.Creator<TagSize> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.bean.tag.TagSize.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final TagSize valueOf(int i) {
            if (i == 14) {
                return TagSize.DP_14;
            }
            if (i == 18) {
                return TagSize.DP_18;
            }
            if (i != 26) {
                return null;
            }
            return TagSize.DP_26;
        }

        public final boolean isValid(int i) {
            TagSize tagSize;
            TagSize[] tagSizeArrValues = TagSize.values();
            int length = tagSizeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    tagSize = null;
                    break;
                }
                tagSize = tagSizeArrValues[i2];
                if (tagSize.getSize() == i) {
                    break;
                }
                i2++;
            }
            return tagSize != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TagSize createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            TagSize tagSizeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(tagSizeValueOf);
            return tagSizeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TagSize[] newArray(int i) {
            return new TagSize[i];
        }
    }

    public static TagSize valueOf(String str) {
        return (TagSize) Enum.valueOf(TagSize.class, str);
    }

    public static TagSize[] values() {
        return (TagSize[]) $VALUES.clone();
    }
}
