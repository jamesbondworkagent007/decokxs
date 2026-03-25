package com.okinc.share.api.edit;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class ShareDialogStyle implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ShareDialogStyle[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final ShareDialogStyle CLASSIC = new ShareDialogStyle("CLASSIC", 0, 1);
    public static final ShareDialogStyle BOTTOM_SHEET = new ShareDialogStyle("BOTTOM_SHEET", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ShareDialogStyle[] $values() {
        return new ShareDialogStyle[]{CLASSIC, BOTTOM_SHEET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ShareDialogStyle> getEntries() {
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

    private ShareDialogStyle(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        ShareDialogStyle[] shareDialogStyleArr$values = $values();
        $VALUES = shareDialogStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(shareDialogStyleArr$values);
        CREATOR = new CREATOR(null);
    }

    private ShareDialogStyle(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<ShareDialogStyle> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.api.edit.ShareDialogStyle.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final ShareDialogStyle valueOf(int i) {
            if (i == 1) {
                return ShareDialogStyle.CLASSIC;
            }
            if (i != 2) {
                return null;
            }
            return ShareDialogStyle.BOTTOM_SHEET;
        }

        public final boolean isValid(int i) {
            ShareDialogStyle shareDialogStyle;
            ShareDialogStyle[] shareDialogStyleArrValues = ShareDialogStyle.values();
            int length = shareDialogStyleArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    shareDialogStyle = null;
                    break;
                }
                shareDialogStyle = shareDialogStyleArrValues[i2];
                if (shareDialogStyle.getType() == i) {
                    break;
                }
                i2++;
            }
            return shareDialogStyle != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareDialogStyle createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ShareDialogStyle shareDialogStyleValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(shareDialogStyleValueOf);
            return shareDialogStyleValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareDialogStyle[] newArray(int i) {
            return new ShareDialogStyle[i];
        }
    }

    public static ShareDialogStyle valueOf(String str) {
        return (ShareDialogStyle) Enum.valueOf(ShareDialogStyle.class, str);
    }

    public static ShareDialogStyle[] values() {
        return (ShareDialogStyle[]) $VALUES.clone();
    }
}
