package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.InHouseIMChannelType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rZw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42627rZw extends AbstractC43215rlA implements rXO {
    @Override // o.rXO
    public Flow<java.lang.Integer> copydefault() {
        rXE rxe;
        Flow<java.lang.Integer> flowCopydefault;
        java.util.List listKWHzl = C43251rlk.KWHzl(rXE.class);
        return (listKWHzl == null || (rxe = (rXE) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null || (flowCopydefault = rxe.copydefault()) == null) ? FlowKt.emptyFlow() : flowCopydefault;
    }

    @Override // o.rXO
    public boolean AEQbTJ() {
        rXE rxe;
        java.util.List listKWHzl = C43251rlk.KWHzl(rXE.class);
        return (listKWHzl == null || (rxe = (rXE) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null || !rxe.OLrzqt()) ? false : true;
    }

    @Override // o.rXO
    public boolean OLrzqt() {
        rXE rxe;
        java.util.List listKWHzl = C43251rlk.KWHzl(rXE.class);
        return (listKWHzl == null || (rxe = (rXE) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null || !rxe.KWHzl()) ? false : true;
    }

    @Override // o.rXO
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull InHouseIMChannelType inHouseIMChannelType, int i, @NotNull Continuation<? super Unit> continuation) {
        rXE rxe;
        java.util.List listKWHzl = C43251rlk.KWHzl(rXE.class);
        if (listKWHzl == null || (rxe = (rXE) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
            return Unit.INSTANCE;
        }
        java.lang.Object objEZpvd = rxe.EZpvd(str, inHouseIMChannelType, i, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }
}
