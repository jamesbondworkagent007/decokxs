package com.okinc.buysell.ui.transaction.buysell;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean;
import kotlin.jvm.internal.Intrinsics;
import o.C31940mJo;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellOrderDetailActivityViewModel extends C31940mJo {
    public final MutableLiveData<OrderDetailBean> OLrzqt = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<OrderDetailBean> copydefault() {
        return this.OLrzqt;
    }

    @yCM
    public BuySellOrderDetailActivityViewModel() {
    }

    public final void AEQbTJ(@NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        this.OLrzqt.setValue(orderDetailBean);
    }
}
