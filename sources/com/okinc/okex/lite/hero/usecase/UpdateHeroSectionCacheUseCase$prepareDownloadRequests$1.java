package com.okinc.okex.lite.hero.usecase;

import com.okinc.okex.lite.hero.data.model.HeroSection;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import o.C45708svD;
import o.svM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class UpdateHeroSectionCacheUseCase$prepareDownloadRequests$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C45708svD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateHeroSectionCacheUseCase$prepareDownloadRequests$1(C45708svD c45708svD, Continuation<? super UpdateHeroSectionCacheUseCase$prepareDownloadRequests$1> continuation) {
        super(continuation);
        this.this$0 = c45708svD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((HeroSection) null, (HeroSection) null, (Continuation<? super List<? extends Pair<? extends Flow<? extends svM>, String>>>) this);
    }
}
