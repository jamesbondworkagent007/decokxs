package com.engagelab.privates.analysis.api;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.common.log.MTCommonLog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class ExposureEvent extends Event {
    private static final int CUSTOM_SIZE = 2;
    private static final String TAG = "ExposureEvent";
    public Activity activity;
    public String tag;
    public View view;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExposureEvent(Activity activity, String str, View view) {
        super(MTAnalysisConstants.TYPE_EXPOSURE);
        if (activity != null) {
            this.activity = (Activity) new WeakReference(activity).get();
        }
        if (view != null) {
            this.view = view;
        }
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcom/engagelab/privates/analysis/api/Event; */
    @Override // com.engagelab.privates.analysis.api.Event
    public ExposureEvent putExtraAttr(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        str.hashCode();
        if (str.equals("tag") || str.equals("count")) {
            MTCommonLog.d(TAG, "key [" + str + "] is invalid");
            return this;
        }
        if (this.extraAttrMap.size() < 48) {
            return (ExposureEvent) super.putExtraAttr(str, obj);
        }
        MTCommonLog.d(TAG, "can't put [" + str + "], exposure event extraAttrMap size can't be no more than 48");
        return this;
    }
}
