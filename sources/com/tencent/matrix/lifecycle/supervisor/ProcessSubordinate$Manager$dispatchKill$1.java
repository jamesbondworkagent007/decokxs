package com.tencent.matrix.lifecycle.supervisor;

import android.os.RemoteException;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.InterfaceC57963ysN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ProcessSubordinate$Manager$dispatchKill$1 extends Lambda implements Function1<Map.Entry<? extends ProcessToken, ? extends InterfaceC57963ysN>, Unit> {
    final /* synthetic */ String $scene;
    final /* synthetic */ int $targetPid;
    final /* synthetic */ String $targetProcess;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessSubordinate$Manager$dispatchKill$1(String str, String str2, int i) {
        super(1);
        this.$scene = str;
        this.$targetProcess = str2;
        this.$targetPid = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map.Entry<? extends ProcessToken, ? extends InterfaceC57963ysN> entry) throws RemoteException {
        invoke2((Map.Entry<ProcessToken, ? extends InterfaceC57963ysN>) entry);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Map.Entry<ProcessToken, ? extends InterfaceC57963ysN> entry) throws RemoteException {
        Intrinsics.checkNotNullParameter(entry, "");
        entry.getValue().EZpvd(this.$scene, this.$targetProcess, this.$targetPid);
    }
}
