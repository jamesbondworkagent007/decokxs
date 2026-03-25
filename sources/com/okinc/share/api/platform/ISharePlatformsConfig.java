package com.okinc.share.api.platform;

import android.os.Parcelable;
import com.okinc.share.platforms.SharePlatform;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface ISharePlatformsConfig extends Parcelable {
    List<SharePlatform> getReplacedSharePlatforms();

    void setReplacedSharePlatforms(@NotNull List<? extends SharePlatform> list);
}
