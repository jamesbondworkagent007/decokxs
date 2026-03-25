package com.okinc.business.market.features.meme;

import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C28575kdP;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class MemePumpFragment$adapter$2$5 extends FunctionReferenceImpl implements yHO<Pair<? extends Integer, ? extends Integer>, MemeUiModel, Integer, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemePumpFragment$adapter$2$5(Object obj) {
        super(3, obj, C28575kdP.class, "showBlacklist", "showBlacklist(Lkotlin/Pair;Lcom/okinc/business/market/features/meme/domain/model/MemeUiModel;I)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends Integer> pair, MemeUiModel memeUiModel, Integer num) {
        invoke((Pair<Integer, Integer>) pair, memeUiModel, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Pair<Integer, Integer> pair, MemeUiModel memeUiModel, int i) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        ((C28575kdP) this.receiver).KWHzl((Pair<Integer, Integer>) pair, memeUiModel, i);
    }
}
