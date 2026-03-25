package o;

import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bkc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C10234bkc extends C10246bko {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10234bkc(@NotNull android.content.Context context, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        super(context, txIdOrHashHistoryDetail);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
    }

    @Override // o.C10246bko, o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> AYXKKw() {
        return yDY.AhwBna();
    }

    @Override // o.C10246bko, o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> DbNXlk() {
        return yDY.AhwBna();
    }
}
