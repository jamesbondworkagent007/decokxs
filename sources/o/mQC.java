package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.okinc.dexkline.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.dexkline.dexlogic.main.market.bean.DexTokenCandleParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mQC extends AbstractC33073mpa {
    public C32144mRc EZpvd;
    public final MutableLiveData<java.util.List<oUO>> KWHzl = new MutableLiveData<>();
    public mQW copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32144mRc AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(mQW mqw) {
        this.copydefault = mqw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mQW KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(C32144mRc c32144mRc) {
        this.EZpvd = c32144mRc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<oUO>> copydefault() {
        return this.KWHzl;
    }

    public static /* synthetic */ AbstractC58185ywX getKLineCandlesticks$default(mQC mqc, java.lang.String str, DexTokenCandleParam dexTokenCandleParam, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKLineCandlesticks");
        }
        if ((i & 1) != 0) {
            str = "default_trade";
        }
        return mqc.copydefault(str, dexTokenCandleParam);
    }

    public final AbstractC58185ywX<java.util.List<CandlesticksBean>> copydefault(java.lang.String str, DexTokenCandleParam dexTokenCandleParam) {
        return mPY.OLrzqt.copydefault(str).KWHzl().KWHzl(dexTokenCandleParam);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull DexTokenCandleParam dexTokenCandleParam, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexTokenCandleParam, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        java.lang.String strSubstring = dexTokenCandleParam.getBar().substring(6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        dexTokenCandleParam.setBar(strSubstring);
        dexTokenCandleParam.setLimit("300");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(copydefault(str, dexTokenCandleParam), lifecycleOwner, Lifecycle.Event.ON_STOP);
        final Function1 function1 = new Function1() { // from class: o.mQE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mQC.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mQD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mQC.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.mQF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mQC.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mQH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mQC.copydefault(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(mQC mqc, java.util.List list) {
        MutableLiveData<java.util.List<oUO>> mutableLiveData = mqc.KWHzl;
        mTT mtt = mTT.EZpvd;
        Intrinsics.copydefault(list);
        mutableLiveData.postValue(mtt.EZpvd((java.util.List<CandlesticksBean>) list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
