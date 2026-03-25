package com.okinc.share.bean.image;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.share.api.preview.BasePreviewConfig;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.SharePreviewMode;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48902ueT;
import o.C43251rlk;
import o.InterfaceC48893ueK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageCustomPreviewConfig extends BasePreviewConfig {
    public Class<? extends AbstractC48902ueT<? extends ISharePreviewConfig>> customFragmentClass;
    private final SharePreviewMode sharePreviewMode;
    private final ShareType shareType;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImageCustomPreviewConfig> CREATOR = new Parcelable.Creator<ImageCustomPreviewConfig>() { // from class: com.okinc.share.bean.image.ImageCustomPreviewConfig$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageCustomPreviewConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ImageCustomPreviewConfig(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageCustomPreviewConfig[] newArray(int i) {
            return new ImageCustomPreviewConfig[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.image.ImageCustomPreviewConfig.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ImageCustomPreviewConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
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
    public final void setCustomFragmentClass(@NotNull Class<? extends AbstractC48902ueT<? extends ISharePreviewConfig>> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        this.customFragmentClass = cls;
    }

    public final Class<? extends AbstractC48902ueT<? extends ISharePreviewConfig>> getCustomFragmentClass() {
        Class<? extends AbstractC48902ueT<? extends ISharePreviewConfig>> cls = this.customFragmentClass;
        if (cls != null) {
            return cls;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private ImageCustomPreviewConfig() {
        this.sharePreviewMode = SharePreviewMode.CUSTOM;
        this.shareType = ShareType.SHARE_IMAGE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.okinc.share.bean.image.ImageCustomPreviewConfig */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageCustomPreviewConfig(@NotNull Parcel parcel) throws ClassNotFoundException {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.sharePreviewMode = SharePreviewMode.CUSTOM;
        this.shareType = ShareType.SHARE_IMAGE;
        String string = parcel.readString();
        Class<?> cls = Class.forName(string == null ? "" : string);
        Intrinsics.copydefault(cls, "");
        setCustomFragmentClass(cls);
    }

    @Override // com.okinc.share.api.preview.BasePreviewConfig, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(getCustomFragmentClass().getName());
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.image.ImageCustomPreviewConfig.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.share.bean.image.ImageCustomPreviewConfig$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImageCustomPreviewConfig create$default(Activity activity, Class cls, String str, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                str = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).AubY();
            }
            if ((i & 4) != 0) {
                function1 = new Function1() { // from class: o.ufC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ImageCustomPreviewConfig.Activity.KWHzl((ImageCustomPreviewConfig) obj2);
                    }
                };
            }
            return activity.AEQbTJ(cls, str, function1);
        }

        public static final Unit KWHzl(ImageCustomPreviewConfig imageCustomPreviewConfig) {
            Intrinsics.checkNotNullParameter(imageCustomPreviewConfig, "");
            return Unit.INSTANCE;
        }

        public final ImageCustomPreviewConfig AEQbTJ(@NotNull Class<? extends AbstractC48902ueT<? extends ISharePreviewConfig>> cls, String str, @NotNull Function1<? super ImageCustomPreviewConfig, Unit> function1) {
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(function1, "");
            ImageCustomPreviewConfig imageCustomPreviewConfig = new ImageCustomPreviewConfig((DefaultConstructorMarker) null);
            imageCustomPreviewConfig.setCustomFragmentClass(cls);
            imageCustomPreviewConfig.setPreviewTitle(str);
            function1.invoke(imageCustomPreviewConfig);
            return imageCustomPreviewConfig;
        }
    }
}
