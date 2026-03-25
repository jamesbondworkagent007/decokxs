package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage;

/* JADX INFO: loaded from: classes21.dex */
public class DecoratorBreakerFactory implements IBreakerFactory {
    private IBreakerFactory breakerFactory;
    private IViewCacheStorage cacheStorage;
    private Integer maxViewsInRow;
    private IRowBreaker rowBreaker;

    public DecoratorBreakerFactory(@NonNull IViewCacheStorage iViewCacheStorage, @NonNull IRowBreaker iRowBreaker, @Nullable Integer num, @NonNull IBreakerFactory iBreakerFactory) {
        this.cacheStorage = iViewCacheStorage;
        this.rowBreaker = iRowBreaker;
        this.maxViewsInRow = num;
        this.breakerFactory = iBreakerFactory;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.IBreakerFactory
    public ILayoutRowBreaker createBackwardRowBreaker() {
        BackwardBreakerContract backwardBreakerContract = new BackwardBreakerContract(this.rowBreaker, new CacheRowBreaker(this.cacheStorage, this.breakerFactory.createBackwardRowBreaker()));
        Integer num = this.maxViewsInRow;
        return num != null ? new MaxViewsBreaker(num.intValue(), backwardBreakerContract) : backwardBreakerContract;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.IBreakerFactory
    public ILayoutRowBreaker createForwardRowBreaker() {
        ForwardBreakerContract forwardBreakerContract = new ForwardBreakerContract(this.rowBreaker, this.breakerFactory.createForwardRowBreaker());
        Integer num = this.maxViewsInRow;
        return num != null ? new MaxViewsBreaker(num.intValue(), forwardBreakerContract) : forwardBreakerContract;
    }
}
