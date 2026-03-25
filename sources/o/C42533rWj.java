package o;

import com.okinc.okapm.okqpl.reporter.EmptyQPLRepository$addQPLRecord$1;
import com.okinc.okapm.okqpl.reporter.EmptyQPLRepository$addQPLRecords$1;
import com.okinc.okapm.okqpl.reporter.EmptyQPLRepository$deleteQPLRecord$1;
import com.okinc.okapm.okqpl.reporter.EmptyQPLRepository$queryAllQPL$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rWj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42533rWj implements InterfaceC42541rWr {
    @Override // o.InterfaceC42541rWr
    public Flow<java.lang.Long> OLrzqt(@NotNull C42540rWq c42540rWq) {
        Intrinsics.checkNotNullParameter(c42540rWq, "");
        return FlowKt.flow(new EmptyQPLRepository$addQPLRecord$1(null));
    }

    @Override // o.InterfaceC42541rWr
    public Flow<java.util.List<java.lang.Long>> OLrzqt(@NotNull java.util.List<C42540rWq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return FlowKt.flow(new EmptyQPLRepository$addQPLRecords$1(null));
    }

    @Override // o.InterfaceC42541rWr
    public Flow<java.lang.Integer> KWHzl(@NotNull java.util.List<C42540rWq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return FlowKt.flow(new EmptyQPLRepository$deleteQPLRecord$1(null));
    }

    @Override // o.InterfaceC42541rWr
    public Flow<java.util.List<C42540rWq>> AEQbTJ() {
        return FlowKt.flow(new EmptyQPLRepository$queryAllQPL$1(null));
    }
}
