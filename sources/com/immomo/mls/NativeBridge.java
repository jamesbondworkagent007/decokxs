package com.immomo.mls;

import o.C7326ahi;
import org.luaj.vm2.Globals;

/* JADX INFO: loaded from: classes3.dex */
public class NativeBridge {
    public static native int _callGencoveragereport(long j);

    public static native void _openLib(long j, boolean z);

    public static void OLrzqt(Globals globals) {
        _openLib(globals.ejfBZ(), C7326ahi.EZpvd);
        NativeBroadcastChannel.AEQbTJ(globals);
    }
}
