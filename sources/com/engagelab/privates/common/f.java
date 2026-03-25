package com.engagelab.privates.common;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.engagelab.privates.analysis.MTAnalysis;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;

/* JADX INFO: loaded from: classes21.dex */
public class f implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f329a;
    public Context b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(Context context) {
        this.b = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f329a < 100) {
            MTCommonPrivatesApi.removeMessages(this.b, MTAnalysis.f319a, MTAnalysisConstants.MainWhat.ON_DRAW_DONE);
        }
        this.f329a = jCurrentTimeMillis;
        MTCommonPrivatesApi.sendMessage(this.b, MTAnalysis.f319a, MTAnalysisConstants.MainWhat.ON_DRAW_DONE, null);
    }
}
