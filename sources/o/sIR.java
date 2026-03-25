package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.group.VipGroupDismissState;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.GroupRecommendations;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sIR extends InterfaceC44267sJm, sIX, sIW, InterfaceC44257sJc, InterfaceC44265sJk, InterfaceC44263sJi, sJK {
    java.lang.Object EZpvd(long j, @NotNull Continuation<? super AbstractC44424sPh> continuation);

    java.lang.Object EZpvd(@NotNull GroupServiceType groupServiceType, @NotNull GroupScenarioType groupScenarioType, @NotNull Continuation<? super AbstractC44399sOj> continuation);

    Flow<java.util.List<GroupRecommendations>> KWHzl(java.lang.Boolean bool);

    java.lang.Object OLrzqt(long j, @NotNull Continuation<? super AbstractC44398sOi> continuation);

    Flow<GroupInfo> OLrzqt(@NotNull java.lang.String str);

    void OLrzqt(@NotNull OKMessage oKMessage);

    java.lang.Object copydefault(long j, @NotNull Continuation<? super VipGroupDismissState> continuation);

    java.lang.Object gEmmrt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);
}
