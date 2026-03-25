package com.okinc.business.market.features.watch_list_groups.repo;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C27774kCw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistGroupRepositoryImpl$createWatchlistGroup$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C27774kCw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistGroupRepositoryImpl$createWatchlistGroup$1(C27774kCw c27774kCw, Continuation<? super WatchlistGroupRepositoryImpl$createWatchlistGroup$1> continuation) {
        super(continuation);
        this.this$0 = c27774kCw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((String) null, (String) null, (String) null, this);
    }
}
