package com.okinc.im.imui.conversation.message.menu.api;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import com.okinc.im.menu.IMMenuItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface IMenuItemPerformer extends Parcelable {

    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void EZpvd(@NotNull IMenuItemPerformer iMenuItemPerformer, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
        }

        public static IMMenuItem KWHzl(@NotNull IMenuItemPerformer iMenuItemPerformer) {
            return null;
        }
    }

    IMMenuItem AEQbTJ();

    void AEQbTJ(@NotNull Context context);

    CharSequence EZpvd();

    Drawable copydefault();
}
