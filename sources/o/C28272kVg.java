package o;

import com.okinc.business.dexlogic.bean.ApproveResultInfo;
import com.okinc.business.dexlogic.bean.SwapApproveInfoReq;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC23234huQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kVg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28272kVg implements InterfaceC28273kVh {
    public final InterfaceC23234huQ copydefault;

    @yCM
    public C28272kVg(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        this.copydefault = interfaceC23234huQ;
    }

    @Override // o.InterfaceC28273kVh
    public AbstractC58185ywX<ResponseData<ApproveResultInfo>> AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull SwapApproveInfoReq swapApproveInfoReq) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(swapApproveInfoReq, "");
        return C33024moe.KWHzl(InterfaceC23234huQ.Application.saveApproveBroadCast$default(this.copydefault, map, swapApproveInfoReq, null, 4, null));
    }
}
