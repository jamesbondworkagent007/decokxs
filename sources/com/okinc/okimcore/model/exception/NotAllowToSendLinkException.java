package com.okinc.okimcore.model.exception;

import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class NotAllowToSendLinkException extends OKIMException {
    public static final int $stable = 0;
    private final OKConversationType conversationType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversationType getConversationType() {
        return this.conversationType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotAllowToSendLinkException(@NotNull OKConversationType oKConversationType) {
        super((String) null, 0, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        this.conversationType = oKConversationType;
    }
}
