package com.okinc.planet.domain.usecase;

import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.planet.domain.remote.dto.PublisherTopicInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C46352tRd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetGetPublisherTopicUserUseCase$execute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C46352tRd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetGetPublisherTopicUserUseCase$execute$1(C46352tRd c46352tRd, Continuation<? super PlanetGetPublisherTopicUserUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = c46352tRd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ2((CacheStrategy) null, (Continuation<? super Pair<? extends List<PublisherTopicInfo>, Boolean>>) this);
    }
}
