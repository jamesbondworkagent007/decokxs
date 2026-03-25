package o;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.tradingbot.impl.botDetail.ui.DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$1;
import com.okinc.tradingbot.impl.botDetail.ui.DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uId, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48186uId {
    public static final void EZpvd(@NotNull C52207wCw c52207wCw, @NotNull AbstractC48457uSc abstractC48457uSc, @NotNull TacticsDetailPresenter tacticsDetailPresenter, @NotNull BotOperatorButtonDisposer botOperatorButtonDisposer, @NotNull Function0<TacticsData> function0) {
        Intrinsics.checkNotNullParameter(c52207wCw, "");
        Intrinsics.checkNotNullParameter(abstractC48457uSc, "");
        Intrinsics.checkNotNullParameter(tacticsDetailPresenter, "");
        Intrinsics.checkNotNullParameter(botOperatorButtonDisposer, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Flow flowAsFlow = FlowLiveDataConversions.asFlow(tacticsDetailPresenter.iwGUEr());
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c52207wCw);
        SharingStarted.Companion companion = SharingStarted.Companion;
        Flow flowCombine = FlowKt.combine(FlowKt.stateIn(FlowLiveDataConversions.asFlow(tacticsDetailPresenter.getNewProxyInstance()), LifecycleOwnerKt.getLifecycleScope(c52207wCw), companion.getLazily(), null), FlowKt.stateIn(flowAsFlow, lifecycleScope, companion.getLazily(), yDY.AhwBna()), new DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$1(null));
        LifecycleOwner viewLifecycleOwner = c52207wCw.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C52692wUv.copydefault(flowCombine, viewLifecycleOwner, Lifecycle.State.CREATED, new DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2(abstractC48457uSc, tacticsDetailPresenter, c52207wCw, botOperatorButtonDisposer, function0, null));
    }
}
