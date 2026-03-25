package o;

import androidx.lifecycle.Observer;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC22818hmY extends AbstractC22801hmH {
    public Observer<TradeStep> AEQbTJ;
    public final AbstractC23101hrq KWHzl;
    public Observer<java.lang.Boolean> OLrzqt;

    /* JADX INFO: renamed from: o.hmY$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CheckStep.values().length];
            try {
                iArr[CheckStep.INIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CheckStep.WALLET.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckStep.INPUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckStep.QUOTES.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckStep.BALANCE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckStep.APPROVE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckStep.SWAP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            copydefault = iArr;
        }
    }

    public abstract void KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC23101hrq gEmmrt() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC22818hmY(@NotNull AbstractC23101hrq abstractC23101hrq) {
        super(abstractC23101hrq);
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.KWHzl = abstractC23101hrq;
        this.OLrzqt = new Observer() { // from class: o.hmX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                AbstractC22818hmY.AEQbTJ(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        };
        this.AEQbTJ = new Observer() { // from class: o.hmZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                AbstractC22818hmY.OLrzqt(this.EZpvd, (TradeStep) obj);
            }
        };
    }

    public static final void AEQbTJ(AbstractC22818hmY abstractC22818hmY, boolean z) {
        if (z) {
            abstractC22818hmY.KWHzl.dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.SWITCH_COIN, true, false));
            abstractC22818hmY.KWHzl.finit().OLrzqt();
        } else {
            abstractC22818hmY.KWHzl.AubY().setValue(new QuotePriceRes((java.util.List) null, (java.util.List) null, (java.lang.String) null, (CommonDexInfo) null, false, true, false, (java.lang.String) null, (TraceData) null, (SwapPriorityFeeInfo) null, (java.lang.String) null, (java.lang.String) null, 4063, (DefaultConstructorMarker) null));
            abstractC22818hmY.KWHzl.dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.SWAP_INPUT, true, false));
            abstractC22818hmY.KWHzl.finit().OLrzqt();
        }
    }

    public static final void OLrzqt(AbstractC22818hmY abstractC22818hmY, TradeStep tradeStep) {
        Intrinsics.checkNotNullParameter(tradeStep, "");
        switch (ActionBar.copydefault[tradeStep.getStep().ordinal()]) {
            case 1:
                abstractC22818hmY.KWHzl.dHguZz().refreshStatePool(new TradeStep(CheckStep.INIT, true, SwapState.INIT_SUCCESS, false, true));
                return;
            case 2:
                abstractC22818hmY.KWHzl.copydefault();
                return;
            case 3:
                abstractC22818hmY.KWHzl.OLrzqt();
                return;
            case 4:
                abstractC22818hmY.KWHzl.EZpvd();
                return;
            case 5:
                abstractC22818hmY.EZpvd();
                return;
            case 6:
                abstractC22818hmY.KWHzl();
                return;
            case 7:
                if (abstractC22818hmY.KWHzl.UlJrfe()) {
                    AbstractC23101hrq abstractC23101hrq = abstractC22818hmY.KWHzl;
                    Result<DexPresetResultVO> resultOLrzqt = abstractC23101hrq.OLrzqt(abstractC23101hrq.hDKMBd());
                    if (resultOLrzqt == null || !Result.m7384isSuccessimpl(resultOLrzqt.m7386unboximpl())) {
                        return;
                    }
                }
                abstractC22818hmY.KWHzl.dHguZz().refreshStatePool(new TradeStep(CheckStep.SWAP, true, SwapState.SWAP, true, false));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void OLrzqt() {
        this.KWHzl.fZBcTu().getInputFinish().observeForever(this.OLrzqt);
    }

    public final void AhwBna() {
        this.KWHzl.fZBcTu().getInputFinish().removeObserver(this.OLrzqt);
    }

    public final void copydefault() {
        this.KWHzl.dHguZz().getCurrentStep().observeForever(this.AEQbTJ);
    }

    public final void AYXKKw() {
        this.KWHzl.dHguZz().getCurrentStep().removeObserver(this.AEQbTJ);
    }

    public final void AEQbTJ() {
        OLrzqt();
        copydefault();
    }

    public final void djBIcL() {
        AhwBna();
        AYXKKw();
    }

    public final void EZpvd() {
        this.KWHzl.iwGUEr().checkFromBalance(this.KWHzl.dmfpNf(), this.KWHzl, new Function0() { // from class: o.hnc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC22818hmY.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final Unit EZpvd(AbstractC22818hmY abstractC22818hmY) {
        abstractC22818hmY.KWHzl.fJNWhG().setValue(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final SwapState valueOf() {
        SwapState value = this.KWHzl.dHguZz().getCurrentState().getValue();
        return value == null ? SwapState.INIT_SUCCESS : value;
    }
}
