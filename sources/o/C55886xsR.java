package o;

import androidx.lifecycle.TradeLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55886xsR implements InterfaceC55878xsJ {
    public static C55879xsK AEQbTJ;
    public static InterfaceC55881xsM EZpvd;
    public static final C55886xsR OLrzqt = new C55886xsR();
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55879xsK AEQbTJ() {
        return AEQbTJ;
    }

    private C55886xsR() {
    }

    public InterfaceC55881xsM copydefault() {
        if (EZpvd == null) {
            EZpvd = new C55880xsL();
        }
        return EZpvd;
    }

    public void KWHzl(@NotNull final TradeLiveData<SourceResp<C55879xsK>> tradeLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(tradeLiveData, "");
        C55879xsK c55879xsK = AEQbTJ;
        if (c55879xsK == null) {
            C55879xsK c55879xsK2 = new C55879xsK();
            AEQbTJ = c55879xsK2;
            c55879xsK2.EZpvd(new Function1() { // from class: o.xsQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C55886xsR.copydefault(tradeLiveData, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else {
            if (z) {
                if (c55879xsK != null && c55879xsK.AEQbTJ()) {
                    tradeLiveData.postValue(new SourceResp<>(java.lang.Boolean.TRUE, AEQbTJ, null, 4, null));
                }
                C55879xsK c55879xsK3 = AEQbTJ;
                if (c55879xsK3 != null) {
                    c55879xsK3.EZpvd(new Function1() { // from class: o.xsO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C55886xsR.EZpvd(tradeLiveData, ((java.lang.Boolean) obj).booleanValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (c55879xsK != null && c55879xsK.AEQbTJ()) {
                tradeLiveData.postValue(new SourceResp<>(java.lang.Boolean.TRUE, AEQbTJ, null, 4, null));
            } else {
                tradeLiveData.postValue(new SourceResp<>(java.lang.Boolean.FALSE, null, null, 4, null));
            }
        }
    }

    public static final Unit copydefault(TradeLiveData tradeLiveData, boolean z) {
        tradeLiveData.postValue(new SourceResp(java.lang.Boolean.valueOf(z), AEQbTJ, null, 4, null));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(TradeLiveData tradeLiveData, boolean z) {
        tradeLiveData.postValue(new SourceResp(java.lang.Boolean.valueOf(z), AEQbTJ, null, 4, null));
        return Unit.INSTANCE;
    }
}
