package com.immomo.mls;

import o.C7326ahi;
import org.luaj.vm2.Globals;

/* JADX INFO: loaded from: classes3.dex */
final class NativeBroadcastChannel {
    private static native void _openLib(long j);

    public static void AEQbTJ(Globals globals) {
        if (C7326ahi.copydefault("mlnbc")) {
            _openLib(globals.ejfBZ());
        }
    }
}
