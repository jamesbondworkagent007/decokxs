package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.business.dexlogic.main.market.bean.DexTokenCandleParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hit, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC22627hit extends AbstractC33073mpa {
    public C23245hub AEQbTJ;
    public final MutableLiveData<java.util.List<oUO>> EZpvd = new MutableLiveData<>();
    public C23184htT KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23245hub AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(C23184htT c23184htT) {
        this.KWHzl = c23184htT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(C23245hub c23245hub) {
        this.AEQbTJ = c23245hub;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<oUO>> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23184htT copydefault() {
        return this.KWHzl;
    }

    public static /* synthetic */ AbstractC58185ywX getKLineCandlesticks$default(AbstractC22627hit abstractC22627hit, java.lang.String str, DexTokenCandleParam dexTokenCandleParam, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKLineCandlesticks");
        }
        if ((i & 1) != 0) {
            str = "default_trade";
        }
        return abstractC22627hit.EZpvd(str, dexTokenCandleParam);
    }

    public final AbstractC58185ywX<java.util.List<CandlesticksBean>> EZpvd(java.lang.String str, DexTokenCandleParam dexTokenCandleParam) {
        return C22380heK.OLrzqt.copydefault(str).isConnected().AEQbTJ(dexTokenCandleParam);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull DexTokenCandleParam dexTokenCandleParam, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexTokenCandleParam, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        java.lang.String strSubstring = dexTokenCandleParam.getBar().substring(6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        dexTokenCandleParam.setBar(strSubstring);
        dexTokenCandleParam.setLimit("300");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(EZpvd(str, dexTokenCandleParam), lifecycleOwner, Lifecycle.Event.ON_STOP);
        final Function1 function1 = new Function1() { // from class: o.his
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22627hit.copydefault(this.copydefault, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hir
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC22627hit.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hiu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22627hit.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hiq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC22627hit.OLrzqt(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractC22627hit abstractC22627hit, java.util.List list) {
        MutableLiveData<java.util.List<oUO>> mutableLiveData = abstractC22627hit.EZpvd;
        C21950hSi c21950hSi = C21950hSi.OLrzqt;
        Intrinsics.copydefault(list);
        mutableLiveData.postValue(c21950hSi.AEQbTJ((java.util.List<CandlesticksBean>) list));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
