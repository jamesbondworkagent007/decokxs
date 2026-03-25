package com.tencent.matrix.lifecycle.supervisor;

import android.os.RemoteException;
import com.tencent.matrix.util.MemInfo;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.InterfaceC57963ysN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ProcessSubordinate$Manager$getMemInfo$1 extends Lambda implements Function1<Map.Entry<? extends ProcessToken, ? extends InterfaceC57963ysN>, Unit> {
    final /* synthetic */ ArrayList<MemInfo> $memInfoList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessSubordinate$Manager$getMemInfo$1(ArrayList<MemInfo> arrayList) {
        super(1);
        this.$memInfoList = arrayList;
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
        MemInfo memInfoCopydefault = entry.getValue().copydefault();
        if (memInfoCopydefault != null) {
            this.$memInfoList.add(memInfoCopydefault);
        }
    }
}
