package com.okinc.okmarket.ui.market.data;

import com.okinc.market.watch.data.UserGroup;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40516qYt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class UserGroupVo implements InterfaceC40516qYt {
    public static final int $stable = UserGroup.$stable;
    private final UserGroup userGroup;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UserGroupVo copy$default(UserGroupVo userGroupVo, UserGroup userGroup, int i, Object obj) {
        if ((i & 1) != 0) {
            userGroup = userGroupVo.userGroup;
        }
        return userGroupVo.copy(userGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserGroup component1() {
        return this.userGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserGroupVo copy(@NotNull UserGroup userGroup) {
        Intrinsics.checkNotNullParameter(userGroup, "");
        return new UserGroupVo(userGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserGroupVo) && Intrinsics.EZpvd(this.userGroup, ((UserGroupVo) obj).userGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserGroup getUserGroup() {
        return this.userGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.userGroup.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserGroupVo(userGroup=" + this.userGroup + ")";
    }

    public UserGroupVo(@NotNull UserGroup userGroup) {
        Intrinsics.checkNotNullParameter(userGroup, "");
        this.userGroup = userGroup;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof UserGroupVo) && Intrinsics.EZpvd((Object) ((UserGroupVo) interfaceC40516qYt).userGroup.getGroupName(), (Object) this.userGroup.getGroupName());
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return Intrinsics.EZpvd(interfaceC40516qYt, this);
    }
}
