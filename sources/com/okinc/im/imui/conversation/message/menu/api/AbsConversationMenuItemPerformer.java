package com.okinc.im.imui.conversation.message.menu.api;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.menu.IMMenuItem;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AbsConversationMenuItemPerformer implements IMenuItemPerformer {
    public OKConversation KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKConversation OLrzqt() {
        return this.KWHzl;
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public Drawable copydefault() {
        return null;
    }

    public AbsConversationMenuItemPerformer(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.KWHzl = oKConversation;
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public IMMenuItem AEQbTJ() {
        return IMenuItemPerformer.StateListAnimator.KWHzl(this);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public void AEQbTJ(@NotNull Context context) {
        IMenuItemPerformer.StateListAnimator.EZpvd(this, context);
    }
}
