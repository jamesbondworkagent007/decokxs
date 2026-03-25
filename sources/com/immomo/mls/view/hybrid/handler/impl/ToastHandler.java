package com.immomo.mls.view.hybrid.handler.impl;

import android.content.Context;
import android.widget.Toast;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import o.C7961ath;
import o.InterfaceC7973att;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ToastHandler implements InterfaceC7973att {
    public static final int $stable = 0;

    @SerializedName("text")
    private final String text;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ToastHandler copy$default(ToastHandler toastHandler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toastHandler.text;
        }
        return toastHandler.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1$MLN_mlnservics() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ToastHandler copy(String str) {
        return new ToastHandler(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToastHandler) && Intrinsics.EZpvd((Object) this.text, (Object) ((ToastHandler) obj).text);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText$MLN_mlnservics() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.text;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ToastHandler(text=" + this.text + ")";
    }

    public ToastHandler(String str) {
        this.text = str;
    }

    @Override // o.InterfaceC7973att
    public void execute(@NotNull C7961ath c7961ath, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(c7961ath, "");
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("HybridWebView", "ToastHandler: [text: " + this.text + "]");
        String str = this.text;
        if (str == null || str.length() == 0) {
            return;
        }
        Toast.makeText(context, this.text, 0).show();
    }
}
