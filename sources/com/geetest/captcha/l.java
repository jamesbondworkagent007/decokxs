package com.geetest.captcha;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.utils.LogUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class l extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f369a;
    public GTCaptcha4Client.OnDialogShowListener b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context) {
        super(context, u.a(context, "gt4_captcha_dialog_style"));
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(1280);
        }
        Window window2 = getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        y yVarA = h.a(context);
        int i = yVarA.f387a;
        int i2 = yVarA.b;
        if (Build.VERSION.SDK_INT >= 28 || getContext().getResources().getConfiguration().orientation != 2) {
            if (attributes != null) {
                attributes.width = i;
            }
            if (attributes != null) {
                attributes.height = i2;
            }
        } else {
            if (attributes != null) {
                attributes.width = -1;
            }
            if (attributes != null) {
                attributes.height = -1;
            }
        }
        LogUtils logUtils = LogUtils.f375a;
        StringBuilder sb = new StringBuilder("ScreenWidth: ");
        sb.append(i);
        sb.append(", ScreenHeight: ");
        sb.append(i2);
        sb.append(", DialogWidth: ");
        sb.append(attributes != null ? Integer.valueOf(attributes.width) : null);
        sb.append(", DialogHeight: ");
        sb.append(attributes != null ? Integer.valueOf(attributes.height) : null);
        logUtils.release(sb.toString());
        if (attributes != null) {
            attributes.gravity = 17;
        }
        Window window3 = getWindow();
        if (window3 == null) {
            return;
        }
        window3.setAttributes(attributes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intrinsics.checkNotNullExpressionValue(LayoutInflater.from(getContext()), "");
        View view = this.f369a;
        if (view != null) {
            setContentView(view);
        }
        setCanceledOnTouchOutside(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        GTCaptcha4Client.OnDialogShowListener onDialogShowListener = this.b;
        if (onDialogShowListener != null) {
            onDialogShowListener.onDialogFocusChanged(this, z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void show() {
        GTCaptcha4Client.OnDialogShowListener onDialogShowListener = this.b;
        if (onDialogShowListener != null) {
            onDialogShowListener.actionBeforeDialogShow(this);
        }
        super.show();
        GTCaptcha4Client.OnDialogShowListener onDialogShowListener2 = this.b;
        if (onDialogShowListener2 != null) {
            onDialogShowListener2.actionAfterDialogShow(this);
        }
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context, @NotNull String str) {
        super(context, u.a(context, str));
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
    }
}
