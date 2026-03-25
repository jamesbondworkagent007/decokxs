package com.beloo.widget.chipslayoutmanager.layouter.breaker;

/* JADX INFO: loaded from: classes21.dex */
public class ColumnBreakerFactory implements IBreakerFactory {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.IBreakerFactory
    public ILayoutRowBreaker createBackwardRowBreaker() {
        return new LTRBackwardColumnBreaker();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.breaker.IBreakerFactory
    public ILayoutRowBreaker createForwardRowBreaker() {
        return new LTRForwardColumnBreaker();
    }
}
