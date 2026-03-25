package o;

import com.okinc.share.api.params.IShareParams;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.platforms.SharePlatform;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ufh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC48969ufh<T extends IShareParams, P extends ISharePreviewConfig> {
    android.graphics.Rect getImageBounds();

    android.view.ViewGroup getPreviewContainer();

    InterfaceC48892ueJ getShareDialog();

    boolean isMultiShare();

    void onEditClick();

    T onRequestPendingShareParams(@NotNull SharePlatform sharePlatform);

    int requirePageIndex();

    T requireShareParams();
}
