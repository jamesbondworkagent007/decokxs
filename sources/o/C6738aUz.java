package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC32801mkT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aUz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6738aUz {
    public static final void EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        try {
            InterfaceC32801mkT.ActionBar.setupClickProtection$default((InterfaceC32801mkT) C43248rlh.KWHzl.AEQbTJ(InterfaceC32801mkT.class), view, null, view.getContext(), null, null, 26, null);
        } catch (java.lang.Exception e) {
            pUU.copydefault("OKAuth", "enableClickProtection e: " + e.getMessage());
        }
    }
}
