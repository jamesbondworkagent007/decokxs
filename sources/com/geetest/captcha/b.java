package com.geetest.captcha;

import android.content.Context;
import com.geetest.captcha.GTCaptcha4Client;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f359a;
    public String b;
    public GTCaptcha4Client.OnSuccessListener c;
    public GTCaptcha4Client.OnFailureListener d;
    public GTCaptcha4Client.OnWebViewShowListener e;
    public GTCaptcha4Config f;
    public x g;
    public w h;
    public b0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f359a = context;
    }
}
