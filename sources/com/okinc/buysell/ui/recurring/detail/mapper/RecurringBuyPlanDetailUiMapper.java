package com.okinc.buysell.ui.recurring.detail.mapper;

import com.okinc.cruilib.view.listitem.share.OKCRTrend;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C30325lUe;
import o.C31351lsQ;
import o.C3818AtC;
import o.C3820AtE;
import o.C52761wXj;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.lQA;
import o.lQC;
import o.lQF;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.Trend;

/* JADX INFO: loaded from: classes15.dex */
public final class RecurringBuyPlanDetailUiMapper {
    public final C30325lUe EZpvd;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PnlBlockType.values().length];
            try {
                iArr[PnlBlockType.AveragePrice.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PnlBlockType.CurrentPrice.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PnlBlockType.TotalPaymentAmount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PnlBlockType.Performance.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[Trend.values().length];
            try {
                iArr2[Trend.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Trend.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Trend.FLAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            copydefault = iArr2;
        }
    }

    @yCM
    public RecurringBuyPlanDetailUiMapper(@NotNull C30325lUe c30325lUe) {
        Intrinsics.checkNotNullParameter(c30325lUe, "");
        this.EZpvd = c30325lUe;
    }

    public final lQC copydefault(@NotNull C3818AtC c3818AtC) {
        Intrinsics.checkNotNullParameter(c3818AtC, "");
        return new lQC(EZpvd(c3818AtC.OLrzqt(), PnlBlockType.AveragePrice), EZpvd(c3818AtC.EZpvd(), PnlBlockType.CurrentPrice), EZpvd(c3818AtC.copydefault(), PnlBlockType.TotalPaymentAmount), EZpvd(c3818AtC.KWHzl(), PnlBlockType.Performance));
    }

    public final lQF EZpvd(C3820AtE c3820AtE, PnlBlockType pnlBlockType) {
        return new lQF(c3820AtE.EZpvd(), AEQbTJ(c3820AtE, pnlBlockType), KWHzl(pnlBlockType), AEQbTJ(pnlBlockType));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class PnlBlockType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PnlBlockType[] $VALUES;
        public static final PnlBlockType AveragePrice = new PnlBlockType("AveragePrice", 0);
        public static final PnlBlockType CurrentPrice = new PnlBlockType("CurrentPrice", 1);
        public static final PnlBlockType TotalPaymentAmount = new PnlBlockType("TotalPaymentAmount", 2);
        public static final PnlBlockType Performance = new PnlBlockType("Performance", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PnlBlockType[] $values() {
            return new PnlBlockType[]{AveragePrice, CurrentPrice, TotalPaymentAmount, Performance};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PnlBlockType> getEntries() {
            return $ENTRIES;
        }

        private PnlBlockType(String str, int i) {
        }

        static {
            PnlBlockType[] pnlBlockTypeArr$values = $values();
            $VALUES = pnlBlockTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pnlBlockTypeArr$values);
        }

        public static PnlBlockType valueOf(String str) {
            return (PnlBlockType) Enum.valueOf(PnlBlockType.class, str);
        }

        public static PnlBlockType[] values() {
            return (PnlBlockType[]) $VALUES.clone();
        }
    }

    public final lQA AEQbTJ(C3820AtE c3820AtE, PnlBlockType pnlBlockType) {
        lQA lqa;
        int i = StateListAnimator.OLrzqt[pnlBlockType.ordinal()];
        if (i == 1) {
            lqa = new lQA(OKCRTrend.FLAT, false, c3820AtE.KWHzl() ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.QwvEab);
        } else if (i != 2) {
            if (i == 3) {
                lqa = new lQA(OKCRTrend.FLAT, false, (c3820AtE.KWHzl() && c3820AtE.copydefault()) ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.QwvEab);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (c3820AtE.KWHzl() && c3820AtE.copydefault()) {
                    return new lQA(AEQbTJ(c3820AtE.AEQbTJ()), true, 0);
                }
                lqa = new lQA(OKCRTrend.FLAT, false, C52761wXj.Activity.QwvEab);
            }
        } else {
            if (c3820AtE.KWHzl() && c3820AtE.copydefault()) {
                return new lQA(AEQbTJ(c3820AtE.AEQbTJ()), true, 0);
            }
            lqa = new lQA(OKCRTrend.FLAT, false, C52761wXj.Activity.fdOvFl);
        }
        return lqa;
    }

    public final OKCRTrend AEQbTJ(Trend trend) {
        int i = StateListAnimator.copydefault[trend.ordinal()];
        if (i == 1) {
            return OKCRTrend.UP;
        }
        if (i == 2) {
            return OKCRTrend.DOWN;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return OKCRTrend.FLAT;
    }

    public final String KWHzl(PnlBlockType pnlBlockType) {
        int i = StateListAnimator.OLrzqt[pnlBlockType.ordinal()];
        if (i == 1) {
            return this.EZpvd.EZpvd(C31351lsQ.Activity.jNexW);
        }
        if (i == 2) {
            return this.EZpvd.EZpvd(C31351lsQ.Activity.QKDJJA);
        }
        if (i == 3) {
            return this.EZpvd.EZpvd(C31351lsQ.Activity.gsvlRV);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return this.EZpvd.EZpvd(C31351lsQ.Activity.DGGHxk);
    }

    public final int AEQbTJ(PnlBlockType pnlBlockType) {
        int i = StateListAnimator.OLrzqt[pnlBlockType.ordinal()];
        if (i == 1) {
            return C52761wXj.TaskDescription.QYvkLl;
        }
        if (i == 2) {
            return C52761wXj.TaskDescription.OHqIaq;
        }
        if (i == 3) {
            return C52761wXj.TaskDescription.QwvEab;
        }
        if (i == 4) {
            return C52761wXj.TaskDescription.zzJhsT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
