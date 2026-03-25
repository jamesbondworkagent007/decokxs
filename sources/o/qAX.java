package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qAX extends AbstractC40510qYn<C40174qMb, C42894rey> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42894rey AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42894rey c42894reyOLrzqt = C42894rey.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42894reyOLrzqt, "");
        return c42894reyOLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [148=4] */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105 A[ADDED_TO_REGION, REMOVE] */
    @Override // o.AbstractC40510qYn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull final C42894rey c42894rey, int i, @NotNull C40174qMb c40174qMb) {
        java.lang.CharSequence instId;
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC49497upf interfaceC49497upf;
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(c42894rey, "");
        Intrinsics.checkNotNullParameter(c40174qMb, "");
        InterfaceC55797xqi interfaceC55797xqiCopydefault = c40174qMb.copydefault();
        if (interfaceC55797xqiCopydefault instanceof BizInstrument) {
            BizInstrument bizInstrument = (BizInstrument) interfaceC55797xqiCopydefault;
            java.lang.String instType = bizInstrument.getInstType();
            java.lang.String tradeSymbol = bizInstrument.getTradeSymbol();
            java.lang.String displayQuoteSymbol = bizInstrument.getDisplayQuoteSymbol();
            switch (instType.hashCode()) {
                case -1956807563:
                    instId = (instType.equals("OPTION") && (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) != null && (interfaceC49497upf = (InterfaceC49497upf) interfaceC49425uoM.KWHzl(TradeKey.TRADE_UI)) != null && (strOLrzqt = interfaceC49497upf.OLrzqt(instType, bizInstrument.getInstId(), c40174qMb.KWHzl().getIndex(), c40174qMb.KWHzl().getAlias())) != null) ? strOLrzqt : bizInstrument.getInstId();
                    break;
                case 2552066:
                    if (instType.equals("SPOT")) {
                        instId = C33061mpO.setupSpanStyles$default(tradeSymbol + " /" + displayQuoteSymbol, new java.lang.String[]{"/" + displayQuoteSymbol}, 0, null, false, new Function1() { // from class: o.qAV
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return qAX.AEQbTJ(c42894rey, (java.util.List) obj);
                            }
                        }, 14, null);
                    }
                    break;
                case 2558355:
                    if (instType.equals("SWAP")) {
                        instId = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, false, 28, null);
                        break;
                    }
                    break;
                case 214415088:
                    if (instType.equals("FUTURES")) {
                        instId = !bizInstrument.isPreMarketPair() ? C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, false, 28, null) : C59449zhJ.replace$default(bizInstrument.getInstFamily(), "-", "", false, 4, (java.lang.Object) null);
                        break;
                    }
                    break;
            }
            c42894rey.getRoot().setText(instId);
            AppCompatTextView root = c42894rey.getRoot();
            root.setOnClickListener(new TaskDescription(root, 1000L, c42894rey, interfaceC55797xqiCopydefault, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(C42894rey c42894rey, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c42894rey.getRoot().getContext(), C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C42894rey KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ InterfaceC55797xqi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C42894rey c42894rey, InterfaceC55797xqi interfaceC55797xqi, int i) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c42894rey;
            this.copydefault = interfaceC55797xqi;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                AppCompatTextView root = this.KWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    AppCompatTextView root2 = this.KWHzl.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "");
                    qplAEQbTJ.KWHzl(root2, (BizInstrument) this.copydefault, this.OLrzqt, C27989kKu.Companion.AYXKKw(), "all", "", true);
                }
            }
        }
    }
}
