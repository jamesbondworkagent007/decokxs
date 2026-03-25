package com.okinc.share.bean.image;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.okinc.share.api.preview.BasePreviewConfig;
import com.okinc.share.bean.SharePreviewMode;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageCustomLuaPreviewConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43251rlk;
import o.C48949ufN;
import o.C48950ufO;
import o.InterfaceC48893ueK;
import o.InterfaceC48901ueS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageCustomLuaPreviewConfig extends BasePreviewConfig {
    private String customMenuItemsKey;
    private String customViewKey;
    private final SharePreviewMode sharePreviewMode;
    private final ShareType shareType;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImageCustomLuaPreviewConfig> CREATOR = new Parcelable.Creator<ImageCustomLuaPreviewConfig>() { // from class: com.okinc.share.bean.image.ImageCustomLuaPreviewConfig$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageCustomLuaPreviewConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ImageCustomLuaPreviewConfig(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageCustomLuaPreviewConfig[] newArray(int i) {
            return new ImageCustomLuaPreviewConfig[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.image.ImageCustomLuaPreviewConfig.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ImageCustomLuaPreviewConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomMenuItemsKey() {
        return this.customMenuItemsKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomViewKey() {
        return this.customViewKey;
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

    private ImageCustomLuaPreviewConfig() {
        this.sharePreviewMode = SharePreviewMode.CUSTOM_LUA;
        this.shareType = ShareType.SHARE_IMAGE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCustomLuaPreviewConfig(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.sharePreviewMode = SharePreviewMode.CUSTOM_LUA;
        this.shareType = ShareType.SHARE_IMAGE;
        this.customMenuItemsKey = parcel.readString();
        this.customViewKey = parcel.readString();
    }

    @Override // com.okinc.share.api.preview.BasePreviewConfig, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.customMenuItemsKey);
        parcel.writeString(this.customViewKey);
    }

    public final void setMenuItems(@NotNull Activity activity, List<? extends InterfaceC48901ueS> list) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.customMenuItemsKey = list != null ? C48950ufO.OLrzqt.EZpvd(activity, list) : null;
    }

    public final void setMenuItems(@NotNull Fragment fragment, List<? extends InterfaceC48901ueS> list) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.customMenuItemsKey = list != null ? C48950ufO.OLrzqt.KWHzl(fragment, list) : null;
    }

    public final List<InterfaceC48901ueS> getMenuItems() {
        String str = this.customMenuItemsKey;
        if (str != null) {
            return C48950ufO.OLrzqt.KWHzl(str);
        }
        return null;
    }

    public final void setPreviewLuaView(@NotNull Activity activity, View view) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.customViewKey = view != null ? C48949ufN.KWHzl.EZpvd(activity, view) : null;
    }

    public final void setPreviewLuaView(@NotNull Fragment fragment, View view) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.customViewKey = view != null ? C48949ufN.KWHzl.OLrzqt(fragment, view) : null;
    }

    public final View getPreviewLuaView() {
        String str = this.customViewKey;
        if (str != null) {
            return C48949ufN.KWHzl.EZpvd(str);
        }
        return null;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.image.ImageCustomLuaPreviewConfig.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.share.bean.image.ImageCustomLuaPreviewConfig$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImageCustomLuaPreviewConfig create$default(TaskDescription taskDescription, Fragment fragment, List list, View view, String str, Function1 function1, int i, Object obj) {
            List list2 = (i & 2) != 0 ? null : list;
            View view2 = (i & 4) != 0 ? null : view;
            if ((i & 8) != 0) {
                str = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).AubY();
            }
            String str2 = str;
            if ((i & 16) != 0) {
                function1 = new Function1() { // from class: o.ufE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ImageCustomLuaPreviewConfig.TaskDescription.OLrzqt((ImageCustomLuaPreviewConfig) obj2);
                    }
                };
            }
            return taskDescription.KWHzl(fragment, list2, view2, str2, function1);
        }

        public static final Unit OLrzqt(ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfig) {
            Intrinsics.checkNotNullParameter(imageCustomLuaPreviewConfig, "");
            return Unit.INSTANCE;
        }

        public final ImageCustomLuaPreviewConfig KWHzl(@NotNull Fragment fragment, List<? extends InterfaceC48901ueS> list, View view, String str, @NotNull Function1<? super ImageCustomLuaPreviewConfig, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(function1, "");
            ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfig = new ImageCustomLuaPreviewConfig((DefaultConstructorMarker) null);
            imageCustomLuaPreviewConfig.setMenuItems(fragment, list);
            imageCustomLuaPreviewConfig.setPreviewLuaView(fragment, view);
            imageCustomLuaPreviewConfig.setPreviewTitle(str);
            function1.invoke(imageCustomLuaPreviewConfig);
            return imageCustomLuaPreviewConfig;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.share.bean.image.ImageCustomLuaPreviewConfig$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImageCustomLuaPreviewConfig create$default(TaskDescription taskDescription, Activity activity, List list, View view, String str, Function1 function1, int i, Object obj) {
            List list2 = (i & 2) != 0 ? null : list;
            View view2 = (i & 4) != 0 ? null : view;
            if ((i & 8) != 0) {
                str = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).AubY();
            }
            String str2 = str;
            if ((i & 16) != 0) {
                function1 = new Function1() { // from class: o.ufG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ImageCustomLuaPreviewConfig.TaskDescription.KWHzl((ImageCustomLuaPreviewConfig) obj2);
                    }
                };
            }
            return taskDescription.EZpvd(activity, list2, view2, str2, function1);
        }

        public static final Unit KWHzl(ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfig) {
            Intrinsics.checkNotNullParameter(imageCustomLuaPreviewConfig, "");
            return Unit.INSTANCE;
        }

        public final ImageCustomLuaPreviewConfig EZpvd(@NotNull Activity activity, List<? extends InterfaceC48901ueS> list, View view, String str, @NotNull Function1<? super ImageCustomLuaPreviewConfig, Unit> function1) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(function1, "");
            ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfig = new ImageCustomLuaPreviewConfig((DefaultConstructorMarker) null);
            imageCustomLuaPreviewConfig.setMenuItems(activity, list);
            imageCustomLuaPreviewConfig.setPreviewLuaView(activity, view);
            imageCustomLuaPreviewConfig.setPreviewTitle(str);
            function1.invoke(imageCustomLuaPreviewConfig);
            return imageCustomLuaPreviewConfig;
        }

        public static /* synthetic */ ImageCustomLuaPreviewConfig createFromKeys$default(TaskDescription taskDescription, String str, String str2, String str3, Function1 function1, int i, Object obj) {
            if ((i & 8) != 0) {
                function1 = new Function1() { // from class: o.ufF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ImageCustomLuaPreviewConfig.TaskDescription.gEmmrt((ImageCustomLuaPreviewConfig) obj2);
                    }
                };
            }
            return taskDescription.OLrzqt(str, str2, str3, function1);
        }

        public static final Unit gEmmrt(ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfig) {
            Intrinsics.checkNotNullParameter(imageCustomLuaPreviewConfig, "");
            return Unit.INSTANCE;
        }

        public final /* synthetic */ ImageCustomLuaPreviewConfig OLrzqt(String str, String str2, String str3, Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfig = new ImageCustomLuaPreviewConfig((DefaultConstructorMarker) null);
            imageCustomLuaPreviewConfig.setPreviewTitle(str);
            imageCustomLuaPreviewConfig.customMenuItemsKey = str2;
            imageCustomLuaPreviewConfig.customViewKey = str3;
            function1.invoke(imageCustomLuaPreviewConfig);
            return imageCustomLuaPreviewConfig;
        }
    }
}
