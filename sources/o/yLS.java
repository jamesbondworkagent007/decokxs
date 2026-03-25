package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yLS {
    public static final yLS EZpvd = new yLS();
    public static final yXX copydefault = yXX.gEmmrt;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            try {
                iArr[KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[KParameter.Kind.INSTANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[KParameter.Kind.VALUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    private yLS() {
    }

    public final void KWHzl(java.lang.StringBuilder sb, InterfaceC56679yOh interfaceC56679yOh) {
        if (interfaceC56679yOh != null) {
            AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56679yOh.uzCIH();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
            sb.append(OLrzqt(abstractC59233zdFUzCIH));
            sb.append(JwtUtilsKt.JWT_DELIMITER);
        }
    }

    public final void copydefault(java.lang.StringBuilder sb, InterfaceC56657yNm interfaceC56657yNm) {
        InterfaceC56679yOh interfaceC56679yOhEZpvd = yLX.EZpvd(interfaceC56657yNm);
        InterfaceC56679yOh interfaceC56679yOhDjBIcL = interfaceC56657yNm.djBIcL();
        KWHzl(sb, interfaceC56679yOhEZpvd);
        boolean z = (interfaceC56679yOhEZpvd == null || interfaceC56679yOhDjBIcL == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        KWHzl(sb, interfaceC56679yOhDjBIcL);
        if (z) {
            sb.append(")");
        }
    }

    public final java.lang.String EZpvd(InterfaceC56657yNm interfaceC56657yNm) {
        if (interfaceC56657yNm instanceof InterfaceC56676yOe) {
            return AEQbTJ((InterfaceC56676yOe) interfaceC56657yNm);
        }
        if (interfaceC56657yNm instanceof yNG) {
            return KWHzl((yNG) interfaceC56657yNm);
        }
        throw new java.lang.IllegalStateException(("Illegal callable: " + interfaceC56657yNm).toString());
    }

    public final java.lang.String AEQbTJ(@NotNull InterfaceC56676yOe interfaceC56676yOe) {
        Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(interfaceC56676yOe.AubY() ? "var " : "val ");
        yLS yls = EZpvd;
        yls.copydefault(sb, interfaceC56676yOe);
        yXX yxx = copydefault;
        C56935yXu c56935yXuBR_ = interfaceC56676yOe.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        sb.append(yxx.EZpvd(c56935yXuBR_, true));
        sb.append(": ");
        AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56676yOe.uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        sb.append(yls.OLrzqt(abstractC59233zdFUzCIH));
        return sb.toString();
    }

    public final java.lang.String KWHzl(@NotNull yNG yng) {
        Intrinsics.checkNotNullParameter(yng, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("fun ");
        yLS yls = EZpvd;
        yls.copydefault(sb, yng);
        yXX yxx = copydefault;
        C56935yXu c56935yXuBR_ = yng.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        sb.append(yxx.EZpvd(c56935yXuBR_, true));
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = yng.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        CollectionsKt___CollectionsKt.joinTo$default(listFetchVPNInfo, sb, ", ", "(", ")", 0, null, yLR.copydefault, 48, null);
        sb.append(": ");
        AbstractC59233zdF abstractC59233zdFGEmmrt = yng.gEmmrt();
        Intrinsics.copydefault(abstractC59233zdFGEmmrt);
        sb.append(yls.OLrzqt(abstractC59233zdFGEmmrt));
        return sb.toString();
    }

    public static final java.lang.CharSequence OLrzqt(InterfaceC56695yOx interfaceC56695yOx) {
        yLS yls = EZpvd;
        AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56695yOx.uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        return yls.OLrzqt(abstractC59233zdFUzCIH);
    }

    public final java.lang.String EZpvd(@NotNull yNG yng) {
        Intrinsics.checkNotNullParameter(yng, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        yLS yls = EZpvd;
        yls.copydefault(sb, yng);
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = yng.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        CollectionsKt___CollectionsKt.joinTo$default(listFetchVPNInfo, sb, ", ", "(", ")", 0, null, yLV.KWHzl, 48, null);
        sb.append(" -> ");
        AbstractC59233zdF abstractC59233zdFGEmmrt = yng.gEmmrt();
        Intrinsics.copydefault(abstractC59233zdFGEmmrt);
        sb.append(yls.OLrzqt(abstractC59233zdFGEmmrt));
        return sb.toString();
    }

    public static final java.lang.CharSequence KWHzl(InterfaceC56695yOx interfaceC56695yOx) {
        yLS yls = EZpvd;
        AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56695yOx.uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        return yls.OLrzqt(abstractC59233zdFUzCIH);
    }

    public final java.lang.String AEQbTJ(@NotNull C56607yLq c56607yLq) {
        Intrinsics.checkNotNullParameter(c56607yLq, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = Activity.AEQbTJ[c56607yLq.OLrzqt().ordinal()];
        if (i == 1) {
            sb.append("extension receiver parameter");
        } else if (i == 2) {
            sb.append("instance parameter");
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sb.append("parameter #" + c56607yLq.AEQbTJ() + ' ' + c56607yLq.KWHzl());
        }
        sb.append(" of ");
        sb.append(EZpvd.EZpvd(c56607yLq.AhwBna().values()));
        return sb.toString();
    }

    public final java.lang.String OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return copydefault.KWHzl(abstractC59233zdF);
    }
}
