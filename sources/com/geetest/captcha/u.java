package com.geetest.captcha;

import android.content.Context;
import com.geetest.captcha.utils.LogUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class u {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return a(context, str, TtmlNode.TAG_STYLE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static int a(Context context, String str, String str2) {
        int identifier = context.getApplicationContext().getResources().getIdentifier(str, str2, context.getPackageName());
        if (identifier == 0) {
            LogUtils.f375a.release("ID.getIdentifier resource: " + str + ", type: " + str2 + ", undefined");
        }
        return identifier;
    }
}
