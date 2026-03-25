package com.okinc.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.api.platform.ISharePlatformsConfig;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.ShareConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43251rlk;
import o.InterfaceC48893ueK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ShareConfig implements Parcelable {
    public ISharePreviewConfig previewConfig;
    public IShareParams shareParams;
    private ISharePlatformsConfig sharePlatformConfig;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShareConfig> CREATOR = new Parcelable.Creator<ShareConfig>() { // from class: com.okinc.share.bean.ShareConfig$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShareConfig(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareConfig[] newArray(int i) {
            return new ShareConfig[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.ShareConfig.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ShareConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ISharePlatformsConfig getSharePlatformConfig() {
        return this.sharePlatformConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreviewConfig(@NotNull ISharePreviewConfig iSharePreviewConfig) {
        Intrinsics.checkNotNullParameter(iSharePreviewConfig, "");
        this.previewConfig = iSharePreviewConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareParams(@NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        this.shareParams = iShareParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSharePlatformConfig(ISharePlatformsConfig iSharePlatformsConfig) {
        this.sharePlatformConfig = iSharePlatformsConfig;
    }

    public final IShareParams getShareParams() {
        IShareParams iShareParams = this.shareParams;
        if (iShareParams != null) {
            return iShareParams;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final ISharePreviewConfig getPreviewConfig() {
        ISharePreviewConfig iSharePreviewConfig = this.previewConfig;
        if (iSharePreviewConfig != null) {
            return iSharePreviewConfig;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private ShareConfig() {
    }

    public ShareConfig(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Parcelable parcelable = parcel.readParcelable(IShareParams.class.getClassLoader());
        Intrinsics.copydefault(parcelable);
        setShareParams((IShareParams) parcelable);
        Parcelable parcelable2 = parcel.readParcelable(ISharePreviewConfig.class.getClassLoader());
        Intrinsics.copydefault(parcelable2);
        setPreviewConfig((ISharePreviewConfig) parcelable2);
        this.sharePlatformConfig = (ISharePlatformsConfig) parcel.readParcelable(ISharePlatformsConfig.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(getShareParams(), i);
        parcel.writeParcelable(getPreviewConfig(), i);
        parcel.writeParcelable(this.sharePlatformConfig, i);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.ShareConfig.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static final Unit AEQbTJ(ShareConfig shareConfig) {
            Intrinsics.checkNotNullParameter(shareConfig, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.share.bean.ShareConfig$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShareConfig create$default(ActionBar actionBar, IShareParams iShareParams, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: o.ufz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ShareConfig.ActionBar.AEQbTJ((ShareConfig) obj2);
                    }
                };
            }
            return actionBar.copydefault(iShareParams, function1);
        }

        public final ShareConfig copydefault(@NotNull IShareParams iShareParams, @NotNull Function1<? super ShareConfig, Unit> function1) {
            Intrinsics.checkNotNullParameter(iShareParams, "");
            Intrinsics.checkNotNullParameter(function1, "");
            ShareConfig shareConfig = new ShareConfig((DefaultConstructorMarker) null);
            shareConfig.setShareParams(iShareParams);
            function1.invoke(shareConfig);
            if (shareConfig.previewConfig == null) {
                shareConfig.setPreviewConfig(((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).KWHzl(iShareParams));
            }
            return shareConfig;
        }
    }
}
