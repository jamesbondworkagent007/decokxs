package o;

import com.okinc.planet.biz_positions.data.ClosePositionType;
import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tGm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46064tGm {

    /* JADX INFO: renamed from: o.tGm$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PlanetTradeTypes.values().length];
            try {
                iArr[PlanetTradeTypes.Spot.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PlanetTradeTypes.Swap.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[ClosePositionType.values().length];
            try {
                iArr2[ClosePositionType.Partial.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[ClosePositionType.Full.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[ClosePositionType.Liquidated.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[ClosePositionType.ForceReduce.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[ClosePositionType.ADL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            KWHzl = iArr2;
        }
    }

    public static final int copydefault(@NotNull ClosePositionType closePositionType, @NotNull PlanetTradeTypes planetTradeTypes) {
        Intrinsics.checkNotNullParameter(closePositionType, "");
        Intrinsics.checkNotNullParameter(planetTradeTypes, "");
        int i = ActionBar.KWHzl[closePositionType.ordinal()];
        if (i == 1) {
            int i2 = ActionBar.EZpvd[planetTradeTypes.ordinal()];
            if (i2 == 1) {
                return C47501trL.Fragment.finit;
            }
            if (i2 == 2) {
                return C47501trL.Fragment.fFgQHt;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i == 2) {
            int i3 = ActionBar.EZpvd[planetTradeTypes.ordinal()];
            if (i3 == 1) {
                return C47501trL.Fragment.djSkpj;
            }
            if (i3 == 2) {
                return C47501trL.Fragment.dNCPSb;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i == 3) {
            return C47501trL.Fragment.RqmePg;
        }
        if (i == 4) {
            return C47501trL.Fragment.invokespecialDaTmkG;
        }
        if (i == 5) {
            return C47501trL.Fragment.UccSpe;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean AEQbTJ(ClosePositionType closePositionType) {
        return closePositionType == null || ActionBar.KWHzl[closePositionType.ordinal()] != 1;
    }
}
