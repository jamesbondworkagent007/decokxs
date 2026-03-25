package o;

import com.okinc.tradingbot.impl.strategy.bean.SignalTriggerCard;
import com.okinc.tradingbot.impl.strategy.bean.SignalTriggerData;
import com.okinc.unify_trade.biz.CoinPairTrigger;
import com.okinc.unify_trade.biz.SignalTriggerDetails;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wtk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53876wtk implements InterfaceC54501xKt<java.util.List<? extends SignalTriggerDetails>, SignalTriggerCard> {
    public static final Application Companion = new Application(null);

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* bridge */ /* synthetic */ SignalTriggerCard KWHzl(java.util.List<? extends SignalTriggerDetails> list) {
        return KWHzl2((java.util.List<SignalTriggerDetails>) list);
    }

    /* JADX INFO: renamed from: o.wtk$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wtk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [50=4, 58=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SignalTriggerCard KWHzl2(@NotNull java.util.List<SignalTriggerDetails> list) {
        java.lang.String str;
        java.lang.String strAYXKKw;
        java.lang.String str2;
        java.lang.String strAYXKKw2;
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(list, "");
        SignalTriggerDetails signalTriggerDetails = (SignalTriggerDetails) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (signalTriggerDetails == null) {
            signalTriggerDetails = new SignalTriggerDetails(null, null, null, 7, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<CoinPairTrigger> details = signalTriggerDetails.getDetails();
        if (details != null) {
            for (CoinPairTrigger coinPairTrigger : details) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt != null) {
                    java.lang.String upperCase = TaskDescription.AEQbTJ(coinPairTrigger.getInstId()).copydefault().toUpperCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    java.lang.String strValueOf = interfaceC54581xNrOLrzqt.valueOf(upperCase);
                    str = strValueOf == null ? "" : strValueOf;
                }
                java.lang.String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, coinPairTrigger.getInstId(), coinPairTrigger.getInstType(), false, false, 12, null);
                java.lang.String action = coinPairTrigger.getAction();
                switch (action.hashCode()) {
                    case -826731499:
                        strAYXKKw = action.equals("ENTER_SHORT") ? C33070mpX.AYXKKw(C55688xof.Application.dbAction) : "";
                        break;
                    case -303965277:
                        strAYXKKw = action.equals("ENTER_LONG") ? C33070mpX.AYXKKw(C55688xof.Application.ZNPcth) : "";
                        break;
                    case 1446365437:
                        strAYXKKw = action.equals("EXIT_LONG") ? C33070mpX.AYXKKw(C55688xof.Application.identifier) : "";
                        break;
                    case 1893913083:
                        strAYXKKw = action.equals("EXIT_SHORT") ? C33070mpX.AYXKKw(C55688xof.Application.ZaDspl) : "";
                        break;
                    default:
                        strAYXKKw = "";
                        break;
                }
                java.lang.String investmentType = coinPairTrigger.getInvestmentType();
                switch (investmentType.hashCode()) {
                    case -1465375442:
                        if (investmentType.equals("percentage_position")) {
                            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.dXhJGx);
                            str2 = strAYXKKw2;
                        } else {
                            str2 = "";
                        }
                        break;
                    case -1081309778:
                        if (investmentType.equals("margin")) {
                            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.requestPostMessageChannel);
                            str2 = strAYXKKw2;
                        } else {
                            str2 = "";
                        }
                        break;
                    case -964768201:
                        if (investmentType.equals("percentage_balance")) {
                            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.postMessage);
                            str2 = strAYXKKw2;
                        } else {
                            str2 = "";
                        }
                        break;
                    case -566947566:
                        if (investmentType.equals("contract")) {
                            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.receiveFile);
                            str2 = strAYXKKw2;
                        } else {
                            str2 = "";
                        }
                        break;
                    case 1071436184:
                        if (investmentType.equals("percentage_investment")) {
                            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda0);
                            str2 = strAYXKKw2;
                        } else {
                            str2 = "";
                        }
                        break;
                    default:
                        str2 = "";
                        break;
                }
                java.lang.String investmentType2 = coinPairTrigger.getInvestmentType();
                int iHashCode = investmentType2.hashCode();
                if (iHashCode == -1465375442 ? investmentType2.equals("percentage_position") : iHashCode == -964768201 ? investmentType2.equals("percentage_balance") : iHashCode == 1071436184 && investmentType2.equals("percentage_investment")) {
                    xMR xmr = xMR.copydefault;
                    strCopydefault = xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) coinPairTrigger.getAmount()), null, C38307pTy.Companion.copydefault(0), null, null, null, 58, null);
                } else {
                    strCopydefault = xMR.copydefault.copydefault(coinPairTrigger.getAmount());
                }
                arrayList.add(new SignalTriggerData(str, titleByIdAndType$default + ", " + strAYXKKw, str2, strCopydefault, pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(coinPairTrigger.getTime())), null, 1, null)));
            }
        }
        return new SignalTriggerCard(arrayList, C33129mqd.AEQbTJ(signalTriggerDetails.getTotalCount(), 3));
    }
}
