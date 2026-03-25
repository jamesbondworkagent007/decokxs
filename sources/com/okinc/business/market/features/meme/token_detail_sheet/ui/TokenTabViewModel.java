package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC28871kiu;
import o.C28774khC;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenTabViewModel extends ViewModel {
    public final C28774khC AEQbTJ;
    public final MutableStateFlow<AbstractC28871kiu> EZpvd;
    public final StateFlow<AbstractC28871kiu> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC28871kiu> KWHzl() {
        return this.KWHzl;
    }

    @yCM
    public TokenTabViewModel(@NotNull C28774khC c28774khC) {
        Intrinsics.checkNotNullParameter(c28774khC, "");
        this.AEQbTJ = c28774khC;
        MutableStateFlow<AbstractC28871kiu> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC28871kiu.Application.EZpvd);
        this.EZpvd = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static /* synthetic */ void fetchSimilarTokens$default(TokenTabViewModel tokenTabViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        tokenTabViewModel.KWHzl(str, str2, str3);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenTabViewModel$fetchSimilarTokens$1(this, str, str2, str3, null), 3, null);
    }
}
