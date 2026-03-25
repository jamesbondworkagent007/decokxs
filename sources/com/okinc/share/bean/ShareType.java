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
public final class ShareType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ShareType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final ShareType SHARE_TEXT = new ShareType("SHARE_TEXT", 0, 1);
    public static final ShareType SHARE_IMAGE = new ShareType("SHARE_IMAGE", 1, 2);
    public static final ShareType SHARE_WEBPAGE = new ShareType("SHARE_WEBPAGE", 2, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ShareType[] $values() {
        return new ShareType[]{SHARE_TEXT, SHARE_IMAGE, SHARE_WEBPAGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ShareType> getEntries() {
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

    private ShareType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        ShareType[] shareTypeArr$values = $values();
        $VALUES = shareTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(shareTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private ShareType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<ShareType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.ShareType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final ShareType valueOf(int i) {
            if (i == 1) {
                return ShareType.SHARE_TEXT;
            }
            if (i == 2) {
                return ShareType.SHARE_IMAGE;
            }
            if (i != 4) {
                return null;
            }
            return ShareType.SHARE_WEBPAGE;
        }

        public final boolean isValid(int i) {
            ShareType shareType;
            ShareType[] shareTypeArrValues = ShareType.values();
            int length = shareTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    shareType = null;
                    break;
                }
                shareType = shareTypeArrValues[i2];
                if (shareType.getType() == i) {
                    break;
                }
                i2++;
            }
            return shareType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ShareType shareTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(shareTypeValueOf);
            return shareTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareType[] newArray(int i) {
            return new ShareType[i];
        }
    }

    public static ShareType valueOf(String str) {
        return (ShareType) Enum.valueOf(ShareType.class, str);
    }

    public static ShareType[] values() {
        return (ShareType[]) $VALUES.clone();
    }
}
