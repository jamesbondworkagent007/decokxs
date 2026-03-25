package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.LiquidityListItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hjL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22646hjL {
    void AEQbTJ();

    void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list);

    void EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<LiquidityListItem> list);

    boolean EZpvd();

    java.util.Map<java.lang.String, java.util.List<LiquidityListItem>> KWHzl();

    MutableLiveData<java.util.List<java.lang.String>> OLrzqt();

    void copydefault(boolean z);
}
