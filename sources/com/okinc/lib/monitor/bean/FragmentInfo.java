package com.okinc.lib.monitor.bean;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes16.dex */
public class FragmentInfo {
    public static final int FRAGMENT_COST_FAST = 500;
    public static final int FRAGMENT_COST_SLOW = 1000;
    public String activityName;
    public WeakReference<Fragment> fragment;
    public String fragmentName;
    public long onActivityCreatedCost;
    public long onAttachCost;
    public long onCreateCost;
    public long onCreateViewCost;
    public long onHiddenChangedCost;
    public long onResumeCost;
    public long onStartCost;
    public long onViewCreatedCost;
    public long setUserVisibleHintCost;
    public long time;
    public long totalCost;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void calculateTotalCost() {
        this.totalCost = this.onAttachCost + this.onCreateCost + this.onActivityCreatedCost + this.onCreateViewCost + this.onViewCreatedCost + this.onStartCost + this.onResumeCost;
    }

    public void setCost(String str, long j) {
        try {
            getClass().getDeclaredField(str + "Cost").set(this, Long.valueOf(j));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return "FragmentInfo{, fragmentName='" + this.fragmentName + "', totalCost=" + this.totalCost + ", onAttachCost=" + this.onAttachCost + ", onCreateCost=" + this.onCreateCost + ", onActivityCreatedCost=" + this.onActivityCreatedCost + ", onCreateViewCost=" + this.onCreateViewCost + ", onViewCreatedCost=" + this.onViewCreatedCost + ", onStartCost=" + this.onStartCost + ", onResumeCost=" + this.onResumeCost + ", onHiddenChangedCost=" + this.onHiddenChangedCost + ", setUserVisibleHintCost=" + this.setUserVisibleHintCost + ", time=" + this.time + ", activityName='" + this.activityName + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
