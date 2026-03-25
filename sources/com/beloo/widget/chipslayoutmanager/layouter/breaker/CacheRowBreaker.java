package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class CacheRowBreaker extends RowBreakerDecorator {
    private IViewCacheStorage cacheStorage;

    public CacheRowBreaker(IViewCacheStorage iViewCacheStorage, ILayoutRowBreaker iLayoutRowBreaker) {
        super(iLayoutRowBreaker);
        this.cacheStorage = iViewCacheStorage;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.RowBreakerDecorator, com.beloo.widget.chipslayoutmanager.layouter.breaker.ILayoutRowBreaker
    public boolean isRowBroke(AbstractLayouter abstractLayouter) {
        return super.isRowBroke(abstractLayouter) || this.cacheStorage.isPositionEndsRow(abstractLayouter.getCurrentViewPosition());
    }
}
