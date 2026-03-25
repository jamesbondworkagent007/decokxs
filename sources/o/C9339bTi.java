package o;

import com.okinc.business.defi.biz.core.error.CoinMetaError;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C9215bRQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bTi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9339bTi extends AbstractC9346bTp {
    public final InterfaceC9218bRT gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8426bCW
    public java.lang.String copydefault(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        return "";
    }

    @Override // o.AbstractC9346bTp
    public boolean ejfBZ() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9339bTi(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC9218bRT interfaceC9218bRT) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC9218bRT, "");
        this.gEmmrt = interfaceC9218bRT;
    }

    @Override // o.AbstractC8426bCW
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AhwBna() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC8485bDc
    public void AEQbTJ(int i) {
        copydefault((java.lang.String) null);
        EZpvd((java.lang.String) null);
        KWHzl(4);
    }

    @Override // o.AbstractC9346bTp
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        super.AEQbTJ(str, str2, z, z2);
        copydefault(str);
        EZpvd(str2);
        OLrzqt(4);
        KWHzl(4);
    }

    @Override // o.AbstractC9346bTp
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AEQbTJ(C54862xYb.convertToString$default(C54862xYb.KWHzl(str, str2), false, null, null, 7, null), str3, z, z2);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(I)Lo/bDi; */
    @Override // o.AbstractC8485bDc
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public C9215bRQ EZpvd(int i) {
        return calFeeItemInfo$default(this, i, false, null, null, 14, null);
    }

    @Override // o.AbstractC8426bCW
    public java.util.List<C9215bRQ> OLrzqt() {
        return yDY.gEmmrt(EZpvd(32), EZpvd(4));
    }

    @Override // o.AbstractC9346bTp
    public C9215bRQ copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return KWHzl(4, true, str, str2);
    }

    @Override // o.AbstractC9346bTp
    public C9215bRQ AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return copydefault(C54862xYb.convertToString$default(C54862xYb.KWHzl(str, str2), false, null, null, 7, null), str3);
    }

    public static /* synthetic */ C9215bRQ calFeeItemInfo$default(C9339bTi c9339bTi, int i, boolean z, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calFeeItemInfo");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            str = "";
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        return c9339bTi.KWHzl(i, z, str, str2);
    }

    public final C9215bRQ KWHzl(int i, boolean z, java.lang.String str, java.lang.String str2) throws CoinMetaError {
        java.lang.String strAYXKKw;
        java.lang.String strDjBIcL;
        java.lang.String strKWHzl;
        java.lang.String strKWHzl2;
        if (z) {
            strAYXKKw = str;
            strDjBIcL = str2;
            strKWHzl = KWHzl(strAYXKKw, strDjBIcL);
            strKWHzl2 = strKWHzl;
        } else {
            strAYXKKw = str;
            strDjBIcL = str2;
            strKWHzl = KWHzl(AYXKKw(i), djBIcL(i));
            strKWHzl2 = KWHzl(AYXKKw(i), valueOf(i));
        }
        C10854bwM c10854bwMAYXKKw = AYXKKw();
        java.lang.String strAYXKKw2 = z ? strAYXKKw : AYXKKw(i);
        if (!z) {
            strAYXKKw = AYXKKw(i);
        }
        java.lang.String str3 = strAYXKKw;
        java.lang.String minGasPrice = this.gEmmrt.isConnected().getGasPrice().getMinGasPrice();
        C9215bRQ.ActionBar actionBar = new C9215bRQ.ActionBar(false, "", "", "", strAYXKKw2, str3, "", minGasPrice == null ? "" : minGasPrice);
        if (!z) {
            strDjBIcL = djBIcL(i);
        }
        java.lang.String minGasLimit = this.gEmmrt.AYXKKw().getMinGasLimit();
        if (minGasLimit == null) {
            minGasLimit = "";
        }
        java.lang.String maxGasLimit = this.gEmmrt.AYXKKw().getMaxGasLimit();
        if (maxGasLimit == null) {
            maxGasLimit = "";
        }
        return new C9215bRQ(i, c10854bwMAYXKKw, strKWHzl, "", "", strKWHzl2, actionBar, new C9215bRQ.Activity(strDjBIcL, "", minGasLimit, maxGasLimit), getNewProxyInstance());
    }

    private final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(str, str2), false, RoundingMode.UP, 1, (java.lang.Object) null);
    }

    public static /* synthetic */ java.lang.String getGasPrice$default(C9339bTi c9339bTi, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGasPrice");
        }
        if ((i2 & 1) != 0) {
            i = c9339bTi.DbNXlk();
        }
        return c9339bTi.AYXKKw(i);
    }

    public java.lang.String AYXKKw(int i) {
        java.lang.String strFJNWhG;
        if (i == 4) {
            strFJNWhG = fJNWhG();
        } else {
            strFJNWhG = i != 32 ? null : this.gEmmrt.isConnected().getGasPrice().getNormal();
        }
        return strFJNWhG == null ? "" : strFJNWhG;
    }

    @Override // o.AbstractC9346bTp
    public java.lang.String djBIcL(int i) {
        return AhwBna(i);
    }

    public final java.lang.String valueOf(int i) {
        java.lang.String strAhwBna = AhwBna(i);
        if (C33129mqd.valueOf(strAhwBna, this.gEmmrt.AYXKKw().getOriginGasLimit())) {
            return strAhwBna;
        }
        java.lang.String originGasLimit = this.gEmmrt.AYXKKw().getOriginGasLimit();
        return originGasLimit == null ? "" : originGasLimit;
    }

    public final java.lang.String AhwBna(int i) {
        if (i == 4) {
            return fIwbmz();
        }
        java.lang.String gasLimit = this.gEmmrt.AYXKKw().getGasLimit();
        return gasLimit == null ? "" : gasLimit;
    }

    private final java.lang.String fJNWhG() {
        java.lang.String strIwGUEr = iwGUEr();
        if (strIwGUEr == null || strIwGUEr.length() == 0) {
            java.lang.String normal = this.gEmmrt.isConnected().getGasPrice().getNormal();
            if (normal != null) {
                return normal;
            }
        } else {
            java.lang.String strIwGUEr2 = iwGUEr();
            if (strIwGUEr2 != null) {
                return strIwGUEr2;
            }
        }
        return "";
    }

    private final java.lang.String fIwbmz() {
        java.lang.String strHDKMBd = hDKMBd();
        if (strHDKMBd == null || strHDKMBd.length() == 0) {
            java.lang.String gasLimit = this.gEmmrt.AYXKKw().getGasLimit();
            if (gasLimit != null) {
                return gasLimit;
            }
        } else {
            java.lang.String strHDKMBd2 = hDKMBd();
            if (strHDKMBd2 != null) {
                return strHDKMBd2;
            }
        }
        return "";
    }
}
