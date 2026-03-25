package com.immomo.mls.view.hybrid.handler.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import o.C7961ath;
import o.InterfaceC7973att;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class DomHeightChangeHandler implements InterfaceC7973att {
    public static final int $stable = 0;

    @SerializedName("height")
    private final int height;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DomHeightChangeHandler copy$default(DomHeightChangeHandler domHeightChangeHandler, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = domHeightChangeHandler.height;
        }
        return domHeightChangeHandler.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1$MLN_mlnservics() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DomHeightChangeHandler copy(int i) {
        return new DomHeightChangeHandler(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DomHeightChangeHandler) && this.height == ((DomHeightChangeHandler) obj).height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHeight$MLN_mlnservics() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.height);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DomHeightChangeHandler(height=" + this.height + ")";
    }

    public DomHeightChangeHandler(int i) {
        this.height = i;
    }

    @Override // o.InterfaceC7973att
    public void execute(@NotNull C7961ath c7961ath, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(c7961ath, "");
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("HybridWebView", "DomHeightChangeHandler: [height: " + this.height + "]");
    }

    private final void updateWebViewHeight(C7961ath c7961ath, int i) {
        int iFloor = (int) Math.floor(i * c7961ath.getContext().getResources().getDisplayMetrics().density);
        ViewGroup.LayoutParams layoutParams = c7961ath.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iFloor;
            c7961ath.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
