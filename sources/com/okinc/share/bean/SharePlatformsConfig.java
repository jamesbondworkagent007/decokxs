package com.okinc.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.share.api.platform.ISharePlatformsConfig;
import com.okinc.share.bean.SharePlatformsConfig;
import com.okinc.share.platforms.SharePlatform;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SharePlatformsConfig implements ISharePlatformsConfig {
    private List<? extends SharePlatform> replacedSharePlatforms;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SharePlatformsConfig> CREATOR = new Parcelable.Creator<SharePlatformsConfig>() { // from class: com.okinc.share.bean.SharePlatformsConfig$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SharePlatformsConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SharePlatformsConfig(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SharePlatformsConfig[] newArray(int i) {
            return new SharePlatformsConfig[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.share.platforms.SharePlatform>, java.util.List<com.okinc.share.platforms.SharePlatform> */
    @Override // com.okinc.share.api.platform.ISharePlatformsConfig
    public List<SharePlatform> getReplacedSharePlatforms() {
        return this.replacedSharePlatforms;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.platform.ISharePlatformsConfig
    public void setReplacedSharePlatforms(@NotNull List<? extends SharePlatform> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.replacedSharePlatforms = list;
    }

    public SharePlatformsConfig() {
        this.replacedSharePlatforms = new ArrayList(0);
    }

    public SharePlatformsConfig(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.replacedSharePlatforms = new ArrayList(0);
        parcel.readTypedList(getReplacedSharePlatforms(), SharePlatform.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeTypedList(getReplacedSharePlatforms());
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.SharePlatformsConfig.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static final Unit KWHzl(SharePlatformsConfig sharePlatformsConfig) {
            Intrinsics.checkNotNullParameter(sharePlatformsConfig, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.share.bean.SharePlatformsConfig$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SharePlatformsConfig create$default(ActionBar actionBar, List list, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: o.ufA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return SharePlatformsConfig.ActionBar.KWHzl((SharePlatformsConfig) obj2);
                    }
                };
            }
            return actionBar.OLrzqt(list, function1);
        }

        public final SharePlatformsConfig OLrzqt(@NotNull List<? extends SharePlatform> list, @NotNull Function1<? super SharePlatformsConfig, Unit> function1) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            SharePlatformsConfig sharePlatformsConfig = new SharePlatformsConfig();
            sharePlatformsConfig.setReplacedSharePlatforms(list);
            function1.invoke(sharePlatformsConfig);
            return sharePlatformsConfig;
        }
    }
}
