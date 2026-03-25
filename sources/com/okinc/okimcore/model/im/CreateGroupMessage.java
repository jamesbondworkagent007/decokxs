package com.okinc.okimcore.model.im;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class CreateGroupMessage extends GroupSystemMessage {
    public static final int $stable = 8;
    private String groupName = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupName = str;
    }
}
