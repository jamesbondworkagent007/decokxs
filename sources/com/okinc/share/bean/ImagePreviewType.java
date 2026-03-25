package com.okinc.share.bean;

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
public final class ImagePreviewType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ImagePreviewType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final ImagePreviewType CENTER_INSIDE = new ImagePreviewType("CENTER_INSIDE", 0, 1);
    public static final ImagePreviewType CENTER_CROP = new ImagePreviewType("CENTER_CROP", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ImagePreviewType[] $values() {
        return new ImagePreviewType[]{CENTER_INSIDE, CENTER_CROP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ImagePreviewType> getEntries() {
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

    private ImagePreviewType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        ImagePreviewType[] imagePreviewTypeArr$values = $values();
        $VALUES = imagePreviewTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(imagePreviewTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private ImagePreviewType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<ImagePreviewType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.ImagePreviewType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final ImagePreviewType valueOf(int i) {
            if (i == 1) {
                return ImagePreviewType.CENTER_INSIDE;
            }
            if (i != 2) {
                return null;
            }
            return ImagePreviewType.CENTER_CROP;
        }

        public final boolean isValid(int i) {
            ImagePreviewType imagePreviewType;
            ImagePreviewType[] imagePreviewTypeArrValues = ImagePreviewType.values();
            int length = imagePreviewTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    imagePreviewType = null;
                    break;
                }
                imagePreviewType = imagePreviewTypeArrValues[i2];
                if (imagePreviewType.getType() == i) {
                    break;
                }
                i2++;
            }
            return imagePreviewType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImagePreviewType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ImagePreviewType imagePreviewTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(imagePreviewTypeValueOf);
            return imagePreviewTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImagePreviewType[] newArray(int i) {
            return new ImagePreviewType[i];
        }
    }

    public static ImagePreviewType valueOf(String str) {
        return (ImagePreviewType) Enum.valueOf(ImagePreviewType.class, str);
    }

    public static ImagePreviewType[] values() {
        return (ImagePreviewType[]) $VALUES.clone();
    }
}
