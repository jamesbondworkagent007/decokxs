package o;

import com.okinc.business.defi.api.bean.ReserveInfoBean;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.network.okg.response.ResponseData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9734bbF {
    AbstractC58185ywX<ResponseData<C9748bbT>> AEQbTJ(@NotNull java.lang.String str);

    AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(@NotNull BaseSignData baseSignData);

    InterfaceC9731bbC AYXKKw();

    AbstractC58185ywX<? extends InterfaceC9752bbX> AkhnZx();

    InterfaceC9738bbJ DbNXlk();

    AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(@NotNull java.lang.String str);

    void copydefault();

    java.lang.String fetchVPNInfo();

    InterfaceC9752bbX gEmmrt();

    AbstractC58185ywX<AbstractC9832bcy> isConnected();

    AbstractC9832bcy valueOf();

    ReserveInfoBean values();
}
