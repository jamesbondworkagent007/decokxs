package o;

import com.okinc.business.defi.api.bean.GasLimitBean;
import com.okinc.business.defi.api.bean.GasPriceBean;
import com.okinc.business.defi.api.bean.OKWalletCloseTokenModel;
import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9852bdR extends InterfaceC43217rlC {
    java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z);

    InterfaceC9740bbL AEQbTJ();

    AbstractC58260yxt<java.util.List<OKWalletCloseTokenModel>> AEQbTJ(@NotNull java.lang.String str);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback);

    AbstractC58185ywX<Unit> AYXKKw();

    InterfaceC9739bbK AhwBna();

    InterfaceC9732bbD EZpvd();

    InterfaceC9733bbE KWHzl();

    AbstractC58185ywX<ResponseData<GasPriceBean>> KWHzl(long j);

    AbstractC58185ywX<Unit> KWHzl(@NotNull java.lang.String str);

    AbstractC58185ywX<ResponseData<GasLimitBean>> KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.Long l, java.lang.String str4);

    OKWalletHiddenSmallAssetTokenModel OLrzqt();

    java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    AbstractC58185ywX<ResponseData<GasPriceBean>> OLrzqt(@NotNull java.lang.String str);

    AbstractC58185ywX<Unit> OLrzqt(@NotNull java.lang.String str, java.lang.Long l);

    java.lang.String copydefault(@NotNull java.lang.String str);

    InterfaceC9737bbI copydefault();

    AbstractC58185ywX<Unit> copydefault(@NotNull java.util.List<java.lang.Long> list);

    java.lang.String djBIcL();

    InterfaceC9741bbM gEmmrt();

    AbstractC58185ywX<Unit> valueOf();
}
