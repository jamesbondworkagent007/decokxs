package o;

import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kZC implements InterfaceC28389kZp {
    public final kYA EZpvd;
    public final kKG KWHzl;
    public final kYC copydefault;

    public kZC(@NotNull kYA kya, @NotNull kYC kyc, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(kya, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.EZpvd = kya;
        this.copydefault = kyc;
        this.KWHzl = kkg;
    }

    @Override // o.InterfaceC28389kZp
    public java.lang.Object AEQbTJ(@NotNull C28378kZe c28378kZe, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        if (c28378kZe.KWHzl().length() == 0) {
            return copydefault(c28378kZe, continuation);
        }
        return OLrzqt(c28378kZe, continuation);
    }

    private final java.lang.Object copydefault(C28378kZe c28378kZe, Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        java.lang.String strCopydefault;
        kYA kya = this.EZpvd;
        if (!c28378kZe.djBIcL()) {
            strCopydefault = null;
        } else if (c28378kZe.valueOf()) {
            strCopydefault = c28378kZe.gEmmrt();
        } else {
            strCopydefault = c28378kZe.copydefault();
        }
        java.lang.String str = strCopydefault;
        java.lang.String strOLrzqt = this.copydefault.OLrzqt();
        java.lang.String strKWHzl = this.copydefault.KWHzl();
        java.lang.String strKWHzl2 = this.copydefault.KWHzl();
        java.lang.String strCopydefault2 = this.KWHzl.copydefault();
        java.lang.String strAEQbTJ = c28378kZe.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        return kya.AEQbTJ(new C28382kZi(str, strOLrzqt, strKWHzl, strKWHzl2, strCopydefault2, null, C56443yFo.AEQbTJ(c28378kZe.AhwBna().toTokenListType()), strAEQbTJ, null, 288, null), continuation);
    }

    private final java.lang.Object OLrzqt(C28378kZe c28378kZe, Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        java.lang.String strCopydefault;
        kYA kya = this.EZpvd;
        java.lang.String strKWHzl = c28378kZe.KWHzl();
        if (!c28378kZe.djBIcL()) {
            strCopydefault = null;
        } else if (c28378kZe.valueOf()) {
            strCopydefault = c28378kZe.gEmmrt();
        } else {
            strCopydefault = c28378kZe.copydefault();
        }
        return kya.copydefault(new C28382kZi(strCopydefault, this.copydefault.OLrzqt(), this.copydefault.KWHzl(), this.copydefault.KWHzl(), this.KWHzl.copydefault(), C56443yFo.AEQbTJ(2), C56443yFo.AEQbTJ(c28378kZe.AhwBna().toTokenListType()), null, strKWHzl, 128, null), continuation);
    }
}
