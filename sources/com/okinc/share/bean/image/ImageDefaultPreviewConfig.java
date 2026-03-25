package com.okinc.share.bean.image;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.share.api.preview.BasePreviewConfig;
import com.okinc.share.bean.ImagePreviewType;
import com.okinc.share.bean.SharePreviewMode;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageDefaultPreviewConfig extends BasePreviewConfig {
    private Rect imagePreviewPadding;
    public ImagePreviewType imagePreviewType;
    private boolean isShowing;
    private final SharePreviewMode sharePreviewMode;
    private final ShareType shareType;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImageDefaultPreviewConfig> CREATOR = new Parcelable.Creator<ImageDefaultPreviewConfig>() { // from class: com.okinc.share.bean.image.ImageDefaultPreviewConfig$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageDefaultPreviewConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ImageDefaultPreviewConfig(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageDefaultPreviewConfig[] newArray(int i) {
            return new ImageDefaultPreviewConfig[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.image.ImageDefaultPreviewConfig.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ImageDefaultPreviewConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rect getImagePreviewPadding() {
        return this.imagePreviewPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public SharePreviewMode getSharePreviewMode() {
        return this.sharePreviewMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public ShareType getShareType() {
        return this.shareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowing() {
        return this.isShowing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImagePreviewPadding(Rect rect) {
        this.imagePreviewPadding = rect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImagePreviewType(@NotNull ImagePreviewType imagePreviewType) {
        Intrinsics.checkNotNullParameter(imagePreviewType, "");
        this.imagePreviewType = imagePreviewType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowing(boolean z) {
        this.isShowing = z;
    }

    public final ImagePreviewType getImagePreviewType() {
        ImagePreviewType imagePreviewType = this.imagePreviewType;
        if (imagePreviewType != null) {
            return imagePreviewType;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private ImageDefaultPreviewConfig() {
        this.isShowing = true;
        this.shareType = ShareType.SHARE_IMAGE;
        this.sharePreviewMode = SharePreviewMode.DEFAULT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDefaultPreviewConfig(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.isShowing = true;
        this.shareType = ShareType.SHARE_IMAGE;
        this.sharePreviewMode = SharePreviewMode.DEFAULT;
        ImagePreviewType imagePreviewType = (ImagePreviewType) parcel.readParcelable(ImagePreviewType.class.getClassLoader());
        setImagePreviewType(imagePreviewType == null ? ImagePreviewType.CENTER_INSIDE : imagePreviewType);
        this.isShowing = parcel.readByte() != 0;
        this.imagePreviewPadding = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    @Override // com.okinc.share.api.preview.BasePreviewConfig, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(getImagePreviewType(), i);
        parcel.writeByte(this.isShowing ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.imagePreviewPadding, i);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.image.ImageDefaultPreviewConfig.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static final Unit KWHzl(ImageDefaultPreviewConfig imageDefaultPreviewConfig) {
            Intrinsics.checkNotNullParameter(imageDefaultPreviewConfig, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.share.bean.image.ImageDefaultPreviewConfig$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImageDefaultPreviewConfig create$default(TaskDescription taskDescription, ImagePreviewType imagePreviewType, boolean z, String str, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                imagePreviewType = ImagePreviewType.CENTER_INSIDE;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                function1 = new Function1() { // from class: o.ufD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ImageDefaultPreviewConfig.TaskDescription.KWHzl((ImageDefaultPreviewConfig) obj2);
                    }
                };
            }
            return taskDescription.AEQbTJ(imagePreviewType, z, str, function1);
        }

        public final ImageDefaultPreviewConfig AEQbTJ(@NotNull ImagePreviewType imagePreviewType, boolean z, String str, @NotNull Function1<? super ImageDefaultPreviewConfig, Unit> function1) {
            Intrinsics.checkNotNullParameter(imagePreviewType, "");
            Intrinsics.checkNotNullParameter(function1, "");
            ImageDefaultPreviewConfig imageDefaultPreviewConfig = new ImageDefaultPreviewConfig((DefaultConstructorMarker) null);
            imageDefaultPreviewConfig.setImagePreviewType(imagePreviewType);
            imageDefaultPreviewConfig.setShowing(z);
            imageDefaultPreviewConfig.setPreviewTitle(str);
            function1.invoke(imageDefaultPreviewConfig);
            return imageDefaultPreviewConfig;
        }
    }
}
