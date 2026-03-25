package o;

import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareType;
import com.okinc.share.platforms.SharePlatform;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49121uia {

    /* JADX INFO: renamed from: o.uia$Activity */
    public interface Activity {
        void EZpvd(@NotNull SharePlatform sharePlatform, @NotNull java.lang.Throwable th);

        void KWHzl(@NotNull SharePlatform sharePlatform);
    }

    android.graphics.drawable.Drawable AEQbTJ(@NotNull android.content.Context context);

    java.util.Set<ShareType> AEQbTJ();

    SharePlatform EZpvd();

    boolean EZpvd(@NotNull ShareConfig shareConfig);

    java.lang.String KWHzl();

    void KWHzl(java.lang.String str);

    java.lang.CharSequence OLrzqt(@NotNull android.content.Context context);

    void OLrzqt(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams, Activity activity2);

    void OLrzqt(java.util.List<java.lang.String> list);
}
