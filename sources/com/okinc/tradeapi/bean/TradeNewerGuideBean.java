package com.okinc.tradeapi.bean;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class TradeNewerGuideBean {
    public static final int $stable = 8;
    private View newerGuideFifth;
    private View newerGuideFour;
    private View newerGuideOne;
    private View newerGuideSix;
    private View newerGuideThree;
    private View newerGuideTwo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void clear() {
        this.newerGuideOne = null;
        this.newerGuideTwo = null;
        this.newerGuideThree = null;
        this.newerGuideFour = null;
        this.newerGuideFifth = null;
        this.newerGuideSix = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View getNewerGuideFifth() {
        return this.newerGuideFifth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View getNewerGuideFour() {
        return this.newerGuideFour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View getNewerGuideOne() {
        return this.newerGuideOne;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View getNewerGuideSix() {
        return this.newerGuideSix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View getNewerGuideThree() {
        return this.newerGuideThree;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View getNewerGuideTwo() {
        return this.newerGuideTwo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewerGuideFifth(View view) {
        this.newerGuideFifth = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewerGuideFour(View view) {
        this.newerGuideFour = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewerGuideOne(View view) {
        this.newerGuideOne = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewerGuideSix(View view) {
        this.newerGuideSix = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewerGuideThree(View view) {
        this.newerGuideThree = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewerGuideTwo(View view) {
        this.newerGuideTwo = view;
    }

    public static /* synthetic */ boolean canUse$default(TradeNewerGuideBean tradeNewerGuideBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        return tradeNewerGuideBean.canUse(str, str2, str3, str4);
    }

    public final boolean canUse(String str, String str2, String str3, String str4) {
        return (Intrinsics.EZpvd((Object) str2, (Object) str) || Intrinsics.EZpvd((Object) str3, (Object) str) || Intrinsics.EZpvd((Object) str4, (Object) str)) ? this.newerGuideSix != null : (this.newerGuideOne == null || this.newerGuideTwo == null || this.newerGuideFour == null || this.newerGuideSix == null) ? false : true;
    }
}
