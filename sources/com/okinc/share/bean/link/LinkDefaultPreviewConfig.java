package com.okinc.share.bean.link;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.okinc.share.api.preview.BasePreviewConfig;
import com.okinc.share.bean.SharePreviewMode;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.bean.link.LinkDefaultPreviewConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class LinkDefaultPreviewConfig extends BasePreviewConfig {
    private ImageSource previewImage;
    private CharSequence previewStyleBody;
    private final SharePreviewMode sharePreviewMode;
    private final ShareType shareType;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LinkDefaultPreviewConfig> CREATOR = new Parcelable.Creator<LinkDefaultPreviewConfig>() { // from class: com.okinc.share.bean.link.LinkDefaultPreviewConfig$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LinkDefaultPreviewConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LinkDefaultPreviewConfig(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LinkDefaultPreviewConfig[] newArray(int i) {
            return new LinkDefaultPreviewConfig[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.link.LinkDefaultPreviewConfig.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LinkDefaultPreviewConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.okinc.share.api.preview.BasePreviewConfig, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageSource getPreviewImage() {
        return this.previewImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getPreviewStyleBody() {
        return this.previewStyleBody;
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
    public final void setPreviewImage(ImageSource imageSource) {
        this.previewImage = imageSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreviewStyleBody(CharSequence charSequence) {
        this.previewStyleBody = charSequence;
    }

    private LinkDefaultPreviewConfig() {
        this.shareType = ShareType.SHARE_WEBPAGE;
        this.sharePreviewMode = SharePreviewMode.DEFAULT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkDefaultPreviewConfig(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.shareType = ShareType.SHARE_WEBPAGE;
        this.sharePreviewMode = SharePreviewMode.DEFAULT;
        this.previewStyleBody = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.previewImage = (ImageSource) parcel.readParcelable(ImageSource.class.getClassLoader());
    }

    @Override // com.okinc.share.api.preview.BasePreviewConfig, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.previewStyleBody, parcel, i);
        parcel.writeParcelable(this.previewImage, i);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.link.LinkDefaultPreviewConfig.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static final Unit AEQbTJ(LinkDefaultPreviewConfig linkDefaultPreviewConfig) {
            Intrinsics.checkNotNullParameter(linkDefaultPreviewConfig, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.share.bean.link.LinkDefaultPreviewConfig$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LinkDefaultPreviewConfig create$default(Activity activity, String str, String str2, ImageSource imageSource, CharSequence charSequence, ImageSource imageSource2, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                imageSource = null;
            }
            if ((i & 8) != 0) {
                charSequence = null;
            }
            if ((i & 16) != 0) {
                imageSource2 = null;
            }
            if ((i & 32) != 0) {
                function1 = new Function1() { // from class: o.ufP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return LinkDefaultPreviewConfig.Activity.AEQbTJ((LinkDefaultPreviewConfig) obj2);
                    }
                };
            }
            return activity.AEQbTJ(str, str2, imageSource, charSequence, imageSource2, function1);
        }

        public final LinkDefaultPreviewConfig AEQbTJ(String str, String str2, ImageSource imageSource, CharSequence charSequence, ImageSource imageSource2, @NotNull Function1<? super LinkDefaultPreviewConfig, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            LinkDefaultPreviewConfig linkDefaultPreviewConfig = new LinkDefaultPreviewConfig((DefaultConstructorMarker) null);
            linkDefaultPreviewConfig.setPreviewTitle(str);
            linkDefaultPreviewConfig.setPreviewContent(str2);
            linkDefaultPreviewConfig.setPreviewIcon(imageSource);
            linkDefaultPreviewConfig.setPreviewStyleBody(charSequence);
            linkDefaultPreviewConfig.setPreviewImage(imageSource2);
            function1.invoke(linkDefaultPreviewConfig);
            return linkDefaultPreviewConfig;
        }
    }
}
