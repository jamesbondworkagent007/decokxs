package com.reown.sign.storage.data.dao.linkmode;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class LinkModeDao {
    public final String app_link;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LinkModeDao copy$default(LinkModeDao linkModeDao, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkModeDao.app_link;
        }
        return linkModeDao.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.app_link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkModeDao copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LinkModeDao(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinkModeDao) && Intrinsics.EZpvd((Object) this.app_link, (Object) ((LinkModeDao) obj).app_link);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApp_link() {
        return this.app_link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.app_link.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LinkModeDao(app_link=" + this.app_link + ")";
    }

    public LinkModeDao(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.app_link = str;
    }
}
