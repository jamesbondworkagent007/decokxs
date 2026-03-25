package o;

import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28396kZw implements InterfaceC28389kZp {
    public final kYC EZpvd;
    public final kYA KWHzl;
    public final kKG OLrzqt;

    public C28396kZw(@NotNull kYA kya, @NotNull kYC kyc, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(kya, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.KWHzl = kya;
        this.EZpvd = kyc;
        this.OLrzqt = kkg;
    }

    @Override // o.InterfaceC28389kZp
    public java.lang.Object AEQbTJ(@NotNull C28378kZe c28378kZe, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        if (c28378kZe.KWHzl().length() == 0) {
            return EZpvd(c28378kZe, continuation);
        }
        return copydefault(c28378kZe, continuation);
    }

    private final java.lang.Object EZpvd(C28378kZe c28378kZe, Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        kYA kya = this.KWHzl;
        java.lang.String strCopydefault = c28378kZe.valueOf() ? null : c28378kZe.copydefault();
        java.lang.String strOLrzqt = this.EZpvd.OLrzqt();
        java.lang.String strKWHzl = this.EZpvd.KWHzl();
        java.lang.String strAYXKKw = c28378kZe.AYXKKw();
        java.lang.String strCopydefault2 = this.OLrzqt.copydefault();
        java.lang.String str = c28378kZe.valueOf() ? "FROM" : "TO";
        java.lang.String strGEmmrt = c28378kZe.valueOf() ? c28378kZe.gEmmrt() : null;
        java.lang.String strOLrzqt2 = c28378kZe.valueOf() ? "" : c28378kZe.OLrzqt();
        java.lang.String strAEQbTJ = c28378kZe.AEQbTJ();
        return kya.AEQbTJ(new C28380kZg(strOLrzqt, strCopydefault, strGEmmrt, strKWHzl, str, strOLrzqt2, strAYXKKw, strAEQbTJ == null ? "" : strAEQbTJ, strCopydefault2), continuation);
    }

    private final java.lang.Object copydefault(C28378kZe c28378kZe, Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        return this.KWHzl.OLrzqt(new C28381kZh(c28378kZe.KWHzl(), c28378kZe.valueOf() ? null : c28378kZe.copydefault(), !c28378kZe.valueOf() ? null : c28378kZe.gEmmrt(), this.EZpvd.OLrzqt(), this.EZpvd.KWHzl(), c28378kZe.valueOf() ? "" : c28378kZe.OLrzqt(), c28378kZe.valueOf() ? "FROM" : "TO", "COLLECTION", c28378kZe.AYXKKw(), this.OLrzqt.copydefault()), continuation);
    }
}
