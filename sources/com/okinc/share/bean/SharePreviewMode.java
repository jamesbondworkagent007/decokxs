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
public final class SharePreviewMode implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SharePreviewMode[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final SharePreviewMode DEFAULT = new SharePreviewMode("DEFAULT", 0, 0);
    public static final SharePreviewMode CUSTOM = new SharePreviewMode("CUSTOM", 1, 1);
    public static final SharePreviewMode CUSTOM_LUA = new SharePreviewMode("CUSTOM_LUA", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SharePreviewMode[] $values() {
        return new SharePreviewMode[]{DEFAULT, CUSTOM, CUSTOM_LUA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SharePreviewMode> getEntries() {
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

    private SharePreviewMode(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        SharePreviewMode[] sharePreviewModeArr$values = $values();
        $VALUES = sharePreviewModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sharePreviewModeArr$values);
        CREATOR = new CREATOR(null);
    }

    private SharePreviewMode(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<SharePreviewMode> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.SharePreviewMode.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final SharePreviewMode valueOf(int i) {
            SharePreviewMode sharePreviewMode = SharePreviewMode.DEFAULT;
            if (i == sharePreviewMode.getType()) {
                return sharePreviewMode;
            }
            SharePreviewMode sharePreviewMode2 = SharePreviewMode.CUSTOM;
            if (i == sharePreviewMode2.getType()) {
                return sharePreviewMode2;
            }
            SharePreviewMode sharePreviewMode3 = SharePreviewMode.CUSTOM_LUA;
            if (i == sharePreviewMode3.getType()) {
                return sharePreviewMode3;
            }
            return null;
        }

        public final boolean isValid(int i) {
            SharePreviewMode sharePreviewMode;
            SharePreviewMode[] sharePreviewModeArrValues = SharePreviewMode.values();
            int length = sharePreviewModeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    sharePreviewMode = null;
                    break;
                }
                sharePreviewMode = sharePreviewModeArrValues[i2];
                if (sharePreviewMode.getType() == i) {
                    break;
                }
                i2++;
            }
            return sharePreviewMode != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SharePreviewMode createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            SharePreviewMode sharePreviewModeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(sharePreviewModeValueOf);
            return sharePreviewModeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SharePreviewMode[] newArray(int i) {
            return new SharePreviewMode[i];
        }
    }

    public static SharePreviewMode valueOf(String str) {
        return (SharePreviewMode) Enum.valueOf(SharePreviewMode.class, str);
    }

    public static SharePreviewMode[] values() {
        return (SharePreviewMode[]) $VALUES.clone();
    }
}
