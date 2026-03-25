package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xPw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54640xPw extends C54637xPt {
    public final qTI EZpvd;
    public final LifecycleOwner KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54640xPw(@NotNull java.util.ArrayList<TradeCoinInfo> arrayList, @NotNull MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData, @NotNull LifecycleOwner lifecycleOwner, @NotNull qTI qti, java.lang.String str) {
        super(arrayList, mutableLiveData, str, null, false, false, 56, null);
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(qti, "");
        this.KWHzl = lifecycleOwner;
        this.EZpvd = qti;
    }

    @Override // o.C54637xPt
    public void OLrzqt() {
        xSZ xszDjBIcL;
        if (djBIcL() != null && (xszDjBIcL = djBIcL()) != null) {
            xszDjBIcL.KWHzl();
        }
        OLrzqt(new xSJ(LifecycleOwnerKt.getLifecycleScope(this.KWHzl), this.EZpvd, gEmmrt(), new Function2() { // from class: o.xPv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C54640xPw.EZpvd(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        }, copydefault(), true));
    }

    public static final Unit EZpvd(C54640xPw c54640xPw, boolean z, java.lang.Exception exc) {
        if (z) {
            c54640xPw.AkhnZx();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC54646xQb
    public void AEQbTJ() {
        xSZ xszDjBIcL = djBIcL();
        if (xszDjBIcL != null) {
            xszDjBIcL.AuCTel();
        }
    }

    @Override // o.AbstractC54646xQb
    public void EZpvd(int i, int i2) {
        xSZ xszDjBIcL;
        java.lang.String strAhwBna = AhwBna();
        if ((strAhwBna == null || strAhwBna.length() == 0) && (xszDjBIcL = djBIcL()) != null) {
            xszDjBIcL.AEQbTJ(AEQbTJ(gEmmrt(), i, i2));
        }
    }

    public final <T> java.util.ArrayList<T> AEQbTJ(java.util.ArrayList<T> arrayList, int i, int i2) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList.subList(java.lang.Math.max(i, i - 3), java.lang.Math.min(arrayList.size(), i2 + 3)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
            arrayList = (java.util.ArrayList<T>) objM7377constructorimpl;
        }
        return new java.util.ArrayList<>(arrayList);
    }
}
