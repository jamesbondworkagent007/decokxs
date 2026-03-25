package o;

import androidx.camera.video.AudioStats;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sZR extends AbstractC43215rlA implements qTB {
    @Override // o.qTB
    public InterfaceC40387qTz copydefault() {
        return new sZS(null, 1, null);
    }

    @Override // o.qTB
    public InterfaceC43032rhd OLrzqt() {
        return new sZN();
    }

    @Override // o.qTB
    public java.lang.String KWHzl(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        ValuationCurrencyBean valuationCurrencyBeanZLjUOn = ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).zLjUOn();
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Double.valueOf(C33129mqd.mulD$default(str, java.lang.Double.valueOf(valuationCurrencyBeanZLjUOn.getUsdToThisRate()), null, null, null, 14, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        }
        double dDoubleValue = ((java.lang.Number) objM7377constructorimpl).doubleValue();
        return C38305pTw.formatFiatSymbol$default(java.lang.Double.valueOf(dDoubleValue), valuationCurrencyBeanZLjUOn.getIsoCode(), RoundingMode.HALF_UP, C38307pTy.Companion.AEQbTJ(C54573xNj.copydefault.AEQbTJ(dDoubleValue)), null, null, null, 56, null);
    }

    @Override // o.qTB
    public Triple<java.lang.String, java.lang.String, java.lang.Integer> copydefault(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QOLQEE().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C59449zhJ.gEmmrt(((ValuationCurrencyBean) next).getIsoCode(), str, true)) {
                break;
            }
        }
        ValuationCurrencyBean valuationCurrencyBean = (ValuationCurrencyBean) next;
        if (valuationCurrencyBean == null) {
            valuationCurrencyBean = new ValuationCurrencyBean();
        }
        return new Triple<>(valuationCurrencyBean.getIsoCode(), valuationCurrencyBean.getSymbol(), java.lang.Integer.valueOf(valuationCurrencyBean.getPrecision()));
    }
}
