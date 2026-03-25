package com.reown.android.internal.common;

import kotlin.jvm.internal.Intrinsics;
import o.C60018ztu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class KoinApplicationKt {
    public static C60018ztu wcKoinApp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C60018ztu getWcKoinApp() {
        return wcKoinApp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void setWcKoinApp(@NotNull C60018ztu c60018ztu) {
        Intrinsics.checkNotNullParameter(c60018ztu, "");
        wcKoinApp = c60018ztu;
    }

    static {
        C60018ztu c60018ztuAEQbTJ = C60018ztu.OLrzqt.AEQbTJ();
        c60018ztuAEQbTJ.AEQbTJ();
        wcKoinApp = c60018ztuAEQbTJ;
    }
}
