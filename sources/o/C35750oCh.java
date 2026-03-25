package o;

import com.okinc.im.usecase.banner.ObserveGroupAnnouncementBannerUseCase$execute$1;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35750oCh {
    public final oDG AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C35750oCh(@NotNull oDG odg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(odg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = odg;
        this.KWHzl = coroutineDispatcher;
    }

    public final C36551odB EZpvd(GroupInfo groupInfo) {
        if (!oBF.OLrzqt.KWHzl(groupInfo)) {
            return null;
        }
        long noticeEditTime = groupInfo.getNoticeEditTime();
        oBI obi = oBI.AEQbTJ;
        java.lang.Long lAEQbTJ = obi.AEQbTJ(groupInfo.getGroupId(), groupInfo.getGroupNoticeId());
        java.lang.Long lCopydefault = obi.copydefault(groupInfo.getGroupId(), groupInfo.getGroupNoticeId());
        if (lAEQbTJ != null && noticeEditTime <= lAEQbTJ.longValue()) {
            long groupNoticeId = groupInfo.getGroupNoticeId();
            if (lCopydefault != null && groupNoticeId == lCopydefault.longValue()) {
                return null;
            }
        }
        return new C36551odB(groupInfo.getNotice(), java.lang.Long.valueOf(noticeEditTime));
    }

    public final Flow<C36551odB> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(FlowKt.flow(new ObserveGroupAnnouncementBannerUseCase$execute$1(this.AEQbTJ.AEQbTJ(str), this, null)), this.KWHzl);
    }
}
