package com.okinc.business.market.features.scanner.surge.ui;

import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C29250kqB;
import o.C29401ksu;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class SurgeTabFragment$setupComposeView$1$1$6$1 extends FunctionReferenceImpl implements Function2<C29250kqB, TokenDetailTabType, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SurgeTabFragment$setupComposeView$1$1$6$1(Object obj) {
        super(2, obj, C29401ksu.class, "openTokenDetailBottomSheet", "openTokenDetailBottomSheet(Lcom/okinc/business/market/features/scanner/surge/trending/domain/model/TrendingTokenUiModel;Lcom/okinc/business/market/features/meme/token_detail_sheet/ui/TokenDetailTabType;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(C29250kqB c29250kqB, TokenDetailTabType tokenDetailTabType) {
        invoke2(c29250kqB, tokenDetailTabType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C29250kqB c29250kqB, TokenDetailTabType tokenDetailTabType) {
        Intrinsics.checkNotNullParameter(c29250kqB, "");
        Intrinsics.checkNotNullParameter(tokenDetailTabType, "");
        ((C29401ksu) this.receiver).KWHzl(c29250kqB, tokenDetailTabType);
    }
}
