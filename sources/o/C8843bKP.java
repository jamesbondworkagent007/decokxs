package o;

import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosFeeItemInfo;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bKP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8843bKP extends AbstractC8485bDc<CosmosFeeItemInfo> {
    public java.lang.String AYXKKw;
    public final InterfaceC8802bJb djBIcL;
    public java.lang.String valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8843bKP(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC8802bJb interfaceC8802bJb) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC8802bJb, "");
        this.djBIcL = interfaceC8802bJb;
    }

    @Override // o.AbstractC8485bDc
    public void AEQbTJ(int i) {
        this.valueOf = null;
        this.AYXKKw = null;
        KWHzl(4);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = str;
        this.AYXKKw = str2;
        OLrzqt(4);
        KWHzl(4);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(I)Lo/bDi; */
    @Override // o.AbstractC8485bDc
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public CosmosFeeItemInfo EZpvd(int i) {
        return calFeeItemInfo$default(this, i, false, null, null, 14, null);
    }

    @Override // o.AbstractC8426bCW
    public java.util.List<CosmosFeeItemInfo> OLrzqt() {
        return yDY.gEmmrt(EZpvd(31), EZpvd(32), EZpvd(33), EZpvd(4));
    }

    public final CosmosFeeItemInfo OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return AEQbTJ(4, true, str, str2);
    }

    public static /* synthetic */ CosmosFeeItemInfo calFeeItemInfo$default(C8843bKP c8843bKP, int i, boolean z, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        return c8843bKP.AEQbTJ(i, z, str, str2);
    }

    public final CosmosFeeItemInfo AEQbTJ(int i, boolean z, java.lang.String str, java.lang.String str2) throws CoinMetaError {
        if (!z) {
            str = djBIcL(i);
        } else if (str == null) {
            str = "";
        }
        if (!z) {
            str2 = valueOf(i);
        } else if (str2 == null) {
            str2 = "";
        }
        C10854bwM c10854bwMAYXKKw = AYXKKw();
        java.lang.String strEZpvd = EZpvd(str, str2);
        java.lang.String feeDemon = this.djBIcL.EZpvd().getFeeDemon();
        java.lang.String str3 = feeDemon == null ? "" : feeDemon;
        java.lang.String min = this.djBIcL.EZpvd().getMin();
        return new CosmosFeeItemInfo(i, c10854bwMAYXKKw, strEZpvd, str3, new CosmosFeeItemInfo.GasPrice(str, min != null ? min : ""), new CosmosFeeItemInfo.GasLimit(str2, "0"));
    }

    private final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(str, str2), false, RoundingMode.UP, 1, (java.lang.Object) null);
    }

    public static /* synthetic */ java.lang.String getGasPrice$default(C8843bKP c8843bKP, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c8843bKP.DbNXlk();
        }
        return c8843bKP.djBIcL(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String djBIcL(int i) {
        if (i == 4) {
            return fJNWhG();
        }
        switch (i) {
            case 31:
                java.lang.String min = this.djBIcL.EZpvd().getMin();
                return min == null ? "" : min;
            case 32:
                java.lang.String normal = this.djBIcL.EZpvd().getNormal();
                if (normal != null) {
                    return normal;
                }
                break;
            case 33:
                java.lang.String max = this.djBIcL.EZpvd().getMax();
                if (max != null) {
                    return max;
                }
                break;
        }
    }

    public static /* synthetic */ java.lang.String getGasLimit$default(C8843bKP c8843bKP, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c8843bKP.DbNXlk();
        }
        return c8843bKP.valueOf(i);
    }

    public final java.lang.String valueOf(int i) {
        if (i == 4) {
            return fARcdN();
        }
        java.lang.String strAEQbTJ = this.djBIcL.AEQbTJ();
        return strAEQbTJ == null ? "" : strAEQbTJ;
    }

    public final java.lang.String fJNWhG() {
        java.lang.String str = this.valueOf;
        if (str == null || str.length() == 0) {
            java.lang.String normal = this.djBIcL.EZpvd().getNormal();
            return normal == null ? "" : normal;
        }
        java.lang.String str2 = this.valueOf;
        Intrinsics.copydefault((java.lang.Object) str2);
        return str2;
    }

    public final java.lang.String fARcdN() {
        java.lang.String str = this.AYXKKw;
        if (str == null || str.length() == 0) {
            java.lang.String strAEQbTJ = this.djBIcL.AEQbTJ();
            return strAEQbTJ == null ? "" : strAEQbTJ;
        }
        java.lang.String str2 = this.AYXKKw;
        Intrinsics.copydefault((java.lang.Object) str2);
        return str2;
    }
}
