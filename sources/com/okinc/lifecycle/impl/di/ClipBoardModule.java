package com.okinc.lifecycle.impl.di;

import android.content.ClipboardManager;
import com.okinc.lifecycle.impl.di.ClipBoardModule;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.GlobalScope;
import o.C38074pLg;
import o.C43246rlf;
import o.C43251rlk;
import o.C54819xWm;
import o.C56392yDr;
import o.InterfaceC38073pLf;
import o.InterfaceC56387yDm;
import o.InterfaceC8108awX;
import o.yCR;

/* JADX INFO: loaded from: classes9.dex */
public final class ClipBoardModule {
    @yCR
    public final InterfaceC38073pLf copydefault() {
        GlobalScope globalScope = GlobalScope.INSTANCE;
        InterfaceC56387yDm interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0() { // from class: o.pNa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ClipBoardModule.AEQbTJ();
            }
        });
        C54819xWm c54819xWmKWHzl = C54819xWm.KWHzl();
        Intrinsics.checkNotNullExpressionValue(c54819xWmKWHzl, "");
        return new C38074pLg(globalScope, interfaceC56387yDmCopydefault, c54819xWmKWHzl, (InterfaceC8108awX) C43251rlk.copydefault(InterfaceC8108awX.class));
    }

    public static final ClipboardManager AEQbTJ() {
        Object systemService = C43246rlf.OLrzqt.valueOf().getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        return (ClipboardManager) systemService;
    }
}
