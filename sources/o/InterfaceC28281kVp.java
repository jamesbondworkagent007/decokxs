package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kVp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28281kVp {
    java.util.ArrayList<MemeCurrencyBean> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<MemeCurrencyBean> list);

    DexMultiTokenInfoBean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.util.List<MemeCurrencyBean> KWHzl(@NotNull java.lang.String str);

    void KWHzl();

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<MemeCurrencyBean>, OKServerException>> continuation);

    void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    MemeCurrencyBean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);
}
