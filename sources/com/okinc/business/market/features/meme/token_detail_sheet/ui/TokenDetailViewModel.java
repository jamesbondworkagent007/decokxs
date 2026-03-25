package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC28867kiq;
import o.C28779khH;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenDetailViewModel extends ViewModel {
    public final C28779khH EZpvd;
    public final MutableStateFlow<AbstractC28867kiq> KWHzl;
    public final StateFlow<AbstractC28867kiq> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC28867kiq> EZpvd() {
        return this.OLrzqt;
    }

    @yCM
    public TokenDetailViewModel(@NotNull C28779khH c28779khH) {
        Intrinsics.checkNotNullParameter(c28779khH, "");
        this.EZpvd = c28779khH;
        MutableStateFlow<AbstractC28867kiq> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC28867kiq.StateListAnimator.AEQbTJ);
        this.KWHzl = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenDetailViewModel$fetchKLineData$1(this, str, str2, str3, null), 3, null);
    }
}
