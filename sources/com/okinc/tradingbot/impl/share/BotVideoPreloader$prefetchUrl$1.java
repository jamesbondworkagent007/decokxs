package com.okinc.tradingbot.impl.share;

import android.content.Context;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.offline.ProgressiveDownloader;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.okinc.tradingbot.impl.share.BotVideoPreloader$prefetchUrl$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C53769wrj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class BotVideoPreloader$prefetchUrl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SimpleCache $currentCache;
    final /* synthetic */ String $url;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotVideoPreloader$prefetchUrl$1(Context context, SimpleCache simpleCache, String str, Continuation<? super BotVideoPreloader$prefetchUrl$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$currentCache = simpleCache;
        this.$url = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(long j, long j2, float f) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotVideoPreloader$prefetchUrl$1(this.$context, this.$currentCache, this.$url, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotVideoPreloader$prefetchUrl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                CacheDataSource.Factory upstreamDataSourceFactory = new CacheDataSource.Factory().setCache(this.$currentCache).setUpstreamDataSourceFactory(new DefaultDataSourceFactory(this.$context, "OKX"));
                Intrinsics.checkNotNullExpressionValue(upstreamDataSourceFactory, "");
                new ProgressiveDownloader(MediaItem.fromUri(this.$url), upstreamDataSourceFactory).download(new Downloader.ProgressListener() { // from class: o.wrh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.google.android.exoplayer2.offline.Downloader.ProgressListener
                    public final void onProgress(long j, long j2, float f) {
                        BotVideoPreloader$prefetchUrl$1.invokeSuspend$lambda$0(j, j2, f);
                    }
                });
            } catch (Exception unused) {
                C53769wrj.copydefault.remove(this.$url);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
