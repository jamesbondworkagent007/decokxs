package com.okinc.tradeapi.bean;

import android.view.View;

/* JADX INFO: loaded from: classes24.dex */
public final class TradeNewerSwapStudyGuideBean {
    public static final int $stable = 8;
    private View leverageView;
    private View mgnModeView;
    private View moreView;
    private View reduceOnlyView;
    private View tpslView;
    private View tradeUnitView;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clear() {
        this.mgnModeView = null;
        this.leverageView = null;
        this.tradeUnitView = null;
        this.reduceOnlyView = null;
        this.tpslView = null;
        this.moreView = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View getLeverageView() {
        return this.leverageView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View getMgnModeView() {
        return this.mgnModeView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View getMoreView() {
        return this.moreView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View getReduceOnlyView() {
        return this.reduceOnlyView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View getTpslView() {
        return this.tpslView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View getTradeUnitView() {
        return this.tradeUnitView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVaild() {
        return (this.mgnModeView == null || this.leverageView == null || this.tpslView == null || this.moreView == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverageView(View view) {
        this.leverageView = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnModeView(View view) {
        this.mgnModeView = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMoreView(View view) {
        this.moreView = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnlyView(View view) {
        this.reduceOnlyView = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpslView(View view) {
        this.tpslView = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeUnitView(View view) {
        this.tradeUnitView = view;
    }
}
