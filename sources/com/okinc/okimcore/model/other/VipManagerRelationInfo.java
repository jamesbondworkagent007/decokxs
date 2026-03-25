package com.okinc.okimcore.model.other;

import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class VipManagerRelationInfo {
    public static final int $stable = 8;
    private final RelationInfo relationInfo;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VipManagerRelationInfo copy$default(VipManagerRelationInfo vipManagerRelationInfo, String str, RelationInfo relationInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vipManagerRelationInfo.title;
        }
        if ((i & 2) != 0) {
            relationInfo = vipManagerRelationInfo.relationInfo;
        }
        return vipManagerRelationInfo.copy(str, relationInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationInfo component2() {
        return this.relationInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipManagerRelationInfo copy(@NotNull String str, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        return new VipManagerRelationInfo(str, relationInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipManagerRelationInfo)) {
            return false;
        }
        VipManagerRelationInfo vipManagerRelationInfo = (VipManagerRelationInfo) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) vipManagerRelationInfo.title) && Intrinsics.EZpvd(this.relationInfo, vipManagerRelationInfo.relationInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationInfo getRelationInfo() {
        return this.relationInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.title.hashCode() * 31) + this.relationInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VipManagerRelationInfo(title=" + this.title + ", relationInfo=" + this.relationInfo + ")";
    }

    public VipManagerRelationInfo(@NotNull String str, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        this.title = str;
        this.relationInfo = relationInfo;
    }
}
