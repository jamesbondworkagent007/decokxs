package com.okinc.share.bean.image;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.okinc.share.api.params.BaseShareParams;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageShareParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C48948ufM;
import o.C59449zhJ;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageShareParams extends BaseShareParams {
    private ImageFooterConfig imageFooterConfig;
    private String keyOfPendingShareBitmap;
    private String pendingShareImagePath;
    private ImageSource previewImageSource;
    private final ShareType shareType;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImageShareParams> CREATOR = new Parcelable.Creator<ImageShareParams>() { // from class: com.okinc.share.bean.image.ImageShareParams$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageShareParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ImageShareParams(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageShareParams[] newArray(int i) {
            return new ImageShareParams[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.image.ImageShareParams.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ImageShareParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageFooterConfig getImageFooterConfig() {
        return this.imageFooterConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPendingShareBitmapKey() {
        return this.keyOfPendingShareBitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPendingShareImagePath() {
        return this.pendingShareImagePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageSource getPreviewImageSource() {
        return this.previewImageSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public ShareType getShareType() {
        return this.shareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageFooterConfig(ImageFooterConfig imageFooterConfig) {
        this.imageFooterConfig = imageFooterConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingShareBitmapKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.keyOfPendingShareBitmap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingShareImagePath(String str) {
        this.pendingShareImagePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreviewImageSource(ImageSource imageSource) {
        this.previewImageSource = imageSource;
    }

    public final boolean hasPendingShareImagePath() {
        return C33129mqd.OLrzqt((CharSequence) this.pendingShareImagePath);
    }

    public final String requirePendingShareImagePath() {
        String str = this.pendingShareImagePath;
        Intrinsics.copydefault((Object) str);
        return str;
    }

    public final boolean hasPendingShareBitmap() {
        return C33129mqd.OLrzqt((CharSequence) this.keyOfPendingShareBitmap);
    }

    public final Bitmap getPendingShareBitmap() {
        if (!C33129mqd.OLrzqt((CharSequence) this.keyOfPendingShareBitmap)) {
            return null;
        }
        C48948ufM c48948ufM = C48948ufM.copydefault;
        String str = this.keyOfPendingShareBitmap;
        Intrinsics.copydefault((Object) str);
        return c48948ufM.KWHzl(str);
    }

    public final boolean isValidForShare() {
        return C33129mqd.OLrzqt((CharSequence) this.pendingShareImagePath);
    }

    private ImageShareParams() {
        this.shareType = ShareType.SHARE_IMAGE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageShareParams(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.shareType = ShareType.SHARE_IMAGE;
        this.previewImageSource = (ImageSource) parcel.readParcelable(ImageSource.class.getClassLoader());
        this.pendingShareImagePath = parcel.readString();
        this.keyOfPendingShareBitmap = parcel.readString();
        this.imageFooterConfig = (ImageFooterConfig) parcel.readParcelable(ImageFooterConfig.class.getClassLoader());
    }

    @Override // com.okinc.share.api.params.BaseShareParams, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.previewImageSource, i);
        parcel.writeString(this.pendingShareImagePath);
        parcel.writeString(this.keyOfPendingShareBitmap);
        parcel.writeParcelable(this.imageFooterConfig, i);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.image.ImageShareParams.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.share.bean.image.ImageShareParams$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImageShareParams create$default(ActionBar actionBar, ImageSource imageSource, String str, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                imageSource = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                function1 = new Function1() { // from class: o.ufJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ImageShareParams.ActionBar.valueOf((ImageShareParams) obj2);
                    }
                };
            }
            return actionBar.KWHzl(imageSource, str, function1);
        }

        public static final Unit valueOf(ImageShareParams imageShareParams) {
            Intrinsics.checkNotNullParameter(imageShareParams, "");
            return Unit.INSTANCE;
        }

        public final ImageShareParams KWHzl(ImageSource imageSource, String str, @NotNull Function1<? super ImageShareParams, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            KWHzl(str);
            ImageShareParams imageShareParams = new ImageShareParams((DefaultConstructorMarker) null);
            imageShareParams.setPreviewImageSource(imageSource);
            imageShareParams.setPendingShareImagePath(str);
            function1.invoke(imageShareParams);
            return imageShareParams;
        }

        public static final Unit AhwBna(ImageShareParams imageShareParams) {
            Intrinsics.checkNotNullParameter(imageShareParams, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.share.bean.image.ImageShareParams$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImageShareParams create$default(ActionBar actionBar, String str, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: o.ufL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ImageShareParams.ActionBar.AhwBna((ImageShareParams) obj2);
                    }
                };
            }
            return actionBar.KWHzl(str, function1);
        }

        public final ImageShareParams KWHzl(@NotNull String str, @NotNull Function1<? super ImageShareParams, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            KWHzl(str);
            ImageShareParams imageShareParams = new ImageShareParams((DefaultConstructorMarker) null);
            imageShareParams.setPreviewImageSource(ImageSource.Companion.EZpvd(str));
            imageShareParams.setPendingShareImagePath(str);
            function1.invoke(imageShareParams);
            return imageShareParams;
        }

        public static final Unit AYXKKw(ImageShareParams imageShareParams) {
            Intrinsics.checkNotNullParameter(imageShareParams, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.share.bean.image.ImageShareParams$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImageShareParams create$default(ActionBar actionBar, Activity activity, Bitmap bitmap, ImageSource imageSource, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                imageSource = null;
            }
            if ((i & 8) != 0) {
                function1 = new Function1() { // from class: o.ufK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ImageShareParams.ActionBar.AYXKKw((ImageShareParams) obj2);
                    }
                };
            }
            return actionBar.OLrzqt(activity, bitmap, imageSource, function1);
        }

        public final ImageShareParams OLrzqt(@NotNull Activity activity, @NotNull Bitmap bitmap, ImageSource imageSource, @NotNull Function1<? super ImageShareParams, Unit> function1) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bitmap, "");
            Intrinsics.checkNotNullParameter(function1, "");
            ImageShareParams imageShareParams = new ImageShareParams((DefaultConstructorMarker) null);
            if (imageSource != null) {
                imageShareParams.setPreviewImageSource(imageSource);
            } else {
                imageShareParams.setPreviewImageSource(ImageSource.Companion.EZpvd(activity, bitmap));
            }
            imageShareParams.keyOfPendingShareBitmap = C48948ufM.copydefault.AEQbTJ(activity, bitmap);
            function1.invoke(imageShareParams);
            return imageShareParams;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.share.bean.image.ImageShareParams$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImageShareParams create$default(ActionBar actionBar, Fragment fragment, Bitmap bitmap, ImageSource imageSource, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                imageSource = null;
            }
            if ((i & 8) != 0) {
                function1 = new Function1() { // from class: o.ufI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ImageShareParams.ActionBar.djBIcL((ImageShareParams) obj2);
                    }
                };
            }
            return actionBar.AEQbTJ(fragment, bitmap, imageSource, function1);
        }

        public static final Unit djBIcL(ImageShareParams imageShareParams) {
            Intrinsics.checkNotNullParameter(imageShareParams, "");
            return Unit.INSTANCE;
        }

        public final ImageShareParams AEQbTJ(@NotNull Fragment fragment, @NotNull Bitmap bitmap, ImageSource imageSource, @NotNull Function1<? super ImageShareParams, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(bitmap, "");
            Intrinsics.checkNotNullParameter(function1, "");
            ImageShareParams imageShareParams = new ImageShareParams((DefaultConstructorMarker) null);
            if (imageSource != null) {
                imageShareParams.setPreviewImageSource(imageSource);
            } else {
                imageShareParams.setPreviewImageSource(ImageSource.Companion.KWHzl(fragment, bitmap));
            }
            imageShareParams.keyOfPendingShareBitmap = C48948ufM.copydefault.KWHzl(fragment, bitmap);
            function1.invoke(imageShareParams);
            return imageShareParams;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.share.bean.image.ImageShareParams$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImageShareParams create$default(ActionBar actionBar, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = new Function1() { // from class: o.ufH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ImageShareParams.ActionBar.gEmmrt((ImageShareParams) obj2);
                    }
                };
            }
            return actionBar.OLrzqt((Function1<? super ImageShareParams, Unit>) function1);
        }

        public static final Unit gEmmrt(ImageShareParams imageShareParams) {
            Intrinsics.checkNotNullParameter(imageShareParams, "");
            return Unit.INSTANCE;
        }

        public final ImageShareParams OLrzqt(@NotNull Function1<? super ImageShareParams, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            ImageShareParams imageShareParams = new ImageShareParams((DefaultConstructorMarker) null);
            function1.invoke(imageShareParams);
            return imageShareParams;
        }

        public final void KWHzl(String str) {
            if (str == null || C59449zhJ.startsWith$default(str, "/", false, 2, null)) {
                return;
            }
            pUU.copydefault("OKShare", "only accept exist local file ,invalid pendingShareImagePath:" + str);
        }
    }
}
