package com.okinc.buysell.ui.recurring;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;
import o.C31940mJo;
import o.C32989mnw;
import o.lPM;
import o.mHA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RecurringBuyPlanHostActivityViewModel extends C31940mJo {
    public final MutableLiveData<C32989mnw<lPM>> KWHzl;
    public final LiveData<C32989mnw<lPM>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<lPM>> KWHzl() {
        return this.OLrzqt;
    }

    @yCM
    public RecurringBuyPlanHostActivityViewModel() {
        MutableLiveData<C32989mnw<lPM>> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        this.OLrzqt = mutableLiveData;
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        mHA.OLrzqt.OLrzqt(this.KWHzl, new lPM.TaskDescription(str));
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        mHA.OLrzqt.OLrzqt(this.KWHzl, new lPM.Application(str));
    }

    public static /* synthetic */ void onNavigateBack$default(RecurringBuyPlanHostActivityViewModel recurringBuyPlanHostActivityViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        recurringBuyPlanHostActivityViewModel.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        mHA.OLrzqt.OLrzqt(this.KWHzl, new lPM.ActionBar(z));
    }
}
