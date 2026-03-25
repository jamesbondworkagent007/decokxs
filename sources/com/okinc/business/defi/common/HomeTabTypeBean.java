package com.okinc.business.defi.common;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class HomeTabTypeBean {
    public static final int $stable = 0;
    private final long id;
    private final int title;
    private final HomeTabType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HomeTabTypeBean copy$default(HomeTabTypeBean homeTabTypeBean, long j, HomeTabType homeTabType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = homeTabTypeBean.id;
        }
        if ((i2 & 2) != 0) {
            homeTabType = homeTabTypeBean.type;
        }
        if ((i2 & 4) != 0) {
            i = homeTabTypeBean.title;
        }
        return homeTabTypeBean.copy(j, homeTabType, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTabType component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTabTypeBean copy(long j, @NotNull HomeTabType homeTabType, int i) {
        Intrinsics.checkNotNullParameter(homeTabType, "");
        return new HomeTabTypeBean(j, homeTabType, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTabTypeBean)) {
            return false;
        }
        HomeTabTypeBean homeTabTypeBean = (HomeTabTypeBean) obj;
        return this.id == homeTabTypeBean.id && this.type == homeTabTypeBean.type && this.title == homeTabTypeBean.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTabType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.title);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeTabTypeBean(id=" + this.id + ", type=" + this.type + ", title=" + this.title + ")";
    }

    public HomeTabTypeBean(long j, @NotNull HomeTabType homeTabType, int i) {
        Intrinsics.checkNotNullParameter(homeTabType, "");
        this.id = j;
        this.type = homeTabType;
        this.title = i;
    }
}
