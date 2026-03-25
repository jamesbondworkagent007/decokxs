package com.beloo.widget.chipslayoutmanager.layouter.breaker;

/* JADX INFO: loaded from: classes21.dex */
public class RTLRowBreakerFactory implements IBreakerFactory {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.IBreakerFactory
    public ILayoutRowBreaker createBackwardRowBreaker() {
        return new RTLBackwardRowBreaker();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.IBreakerFactory
    public ILayoutRowBreaker createForwardRowBreaker() {
        return new RTLForwardRowBreaker();
    }
}
