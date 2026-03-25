package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.tradingbot.impl.planet.domain.BotDisplayName;
import com.okinc.tradingbot.impl.planet.dto.BotDirection;
import com.okinc.tradingbot.impl.planet.dto.BotDto;
import com.okinc.tradingbot.impl.planet.dto.ContractBotDto;
import com.okinc.tradingbot.impl.planet.dto.RecurringBotDto;
import com.okinc.tradingbot.impl.planet.dto.SignalBotDto;
import com.okinc.tradingbot.impl.planet.dto.SmartArbitrageBotDto;
import com.okinc.tradingbot.impl.planet.dto.SpotBotDto;
import com.okinc.tradingbot.impl.planet.model.BotDisplayType;
import com.okinc.tradingbot.impl.planet.model.PlanetBotMetadata;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.bot.Portfolio;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C53661wph;
import o.C53667wpn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53669wpp extends vNA<BotDto, PlanetBotMetadata> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final C53734wrA AEQbTJ;
    public final C53667wpn OLrzqt;
    public final C53661wph copydefault;

    @yCM
    public C53669wpp(@NotNull C53661wph c53661wph, @NotNull C53667wpn c53667wpn, @NotNull C53734wrA c53734wrA) {
        Intrinsics.checkNotNullParameter(c53661wph, "");
        Intrinsics.checkNotNullParameter(c53667wpn, "");
        Intrinsics.checkNotNullParameter(c53734wrA, "");
        this.copydefault = c53661wph;
        this.OLrzqt = c53667wpn;
        this.AEQbTJ = c53734wrA;
    }

    /* JADX INFO: renamed from: o.wpp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wpp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C53669wpp KWHzl() {
            return ((InterfaceC51009vet) C58114yvF.OLrzqt(C32979mnm.EZpvd.OLrzqt(), InterfaceC51009vet.class)).invokespecialaVhqwO();
        }

        public final java.lang.String OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            if (str == null) {
                str = "";
            }
            return str.length() == 0 ? C53669wpp.Companion.AEQbTJ(str2) : str;
        }

        public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return "https://static.coinall.ltd/cdn/oksupport/asset/currency/icon/" + lowerCase + ".png";
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dd  */
    @Override // o.vNA
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlanetBotMetadata KWHzl(@NotNull BotDto botDto) {
        java.util.List<java.lang.String> listAhwBna;
        java.util.List<java.lang.String> listEZpvd;
        java.lang.String strFetchVPNInfo;
        java.lang.String strIsConnected;
        java.lang.String strHDKMBd;
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(botDto, "");
        C53667wpn c53667wpn = this.OLrzqt;
        java.lang.String strValueOf = botDto.valueOf();
        java.lang.String strOLrzqt = botDto.OLrzqt();
        java.lang.String strDjBIcL = botDto.djBIcL();
        java.lang.String strCopydefault = botDto.copydefault();
        boolean z = botDto instanceof SignalBotDto;
        if (z) {
            listAhwBna = ((SignalBotDto) botDto).fJNWhG();
        } else {
            listAhwBna = yDY.AhwBna();
        }
        boolean z2 = botDto instanceof InterfaceC53635wpH;
        BotDisplayName botDisplayNameAEQbTJ = c53667wpn.AEQbTJ(new C53667wpn.StateListAnimator(strValueOf, strOLrzqt, strDjBIcL, strCopydefault, listAhwBna, z2 ? ((InterfaceC53635wpH) botDto).DbNXlk() : ""));
        if (z2) {
            java.util.List<Portfolio> listValues = ((InterfaceC53635wpH) botDto).values();
            listEZpvd = new java.util.ArrayList<>(C56403yEb.AYXKKw(listValues, 10));
            java.util.Iterator<T> it = listValues.iterator();
            while (it.hasNext()) {
                java.lang.String upperCase = ((Portfolio) it.next()).getCcy().toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                listEZpvd.add(upperCase);
            }
        } else if (z) {
            listEZpvd = ((SignalBotDto) botDto).fJNWhG();
        } else {
            if (!(botDto instanceof SpotBotDto) && !(botDto instanceof ContractBotDto) && !(botDto instanceof SmartArbitrageBotDto)) {
                throw new NoWhenBranchMatchedException();
            }
            listEZpvd = C56402yEa.EZpvd(botDto.OLrzqt());
        }
        java.util.List<java.lang.String> list = listEZpvd;
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> listOLrzqt = OLrzqt(botDto);
        java.lang.String strAEQbTJ2 = this.copydefault.AEQbTJ(new C53661wph.ActionBar(botDto.KWHzl(), botDto.djBIcL(), botDto.OLrzqt(), botDto.valueOf(), botDto.EZpvd(), botDto.gEmmrt(), true, true, z ? new C53661wph.Application(((SignalBotDto) botDto).fIwbmz(), "published") : null, "2", this.AEQbTJ.copydefault(botDto.valueOf())));
        java.lang.String strEZpvd = botDto.EZpvd();
        java.lang.String strDjBIcL2 = botDto.djBIcL();
        boolean z3 = botDto instanceof InterfaceC53632wpE;
        if (z3) {
            InterfaceC53632wpE interfaceC53632wpE = (InterfaceC53632wpE) botDto;
            if (interfaceC53632wpE.fJNWhG().length() > 0) {
                strFetchVPNInfo = interfaceC53632wpE.getFieldNames();
            } else {
                strFetchVPNInfo = botDto.fetchVPNInfo();
            }
        }
        java.lang.String str = strFetchVPNInfo;
        if (z3) {
            InterfaceC53632wpE interfaceC53632wpE2 = (InterfaceC53632wpE) botDto;
            if (interfaceC53632wpE2.fJNWhG().length() > 0) {
                strIsConnected = interfaceC53632wpE2.AuCTel();
            } else {
                strIsConnected = botDto.isConnected();
            }
        }
        java.lang.String str2 = strIsConnected;
        java.lang.String string = botDisplayNameAEQbTJ.toString();
        java.lang.String strValueOf2 = botDto.valueOf();
        java.util.List<StrategyProfitResponse> listAhwBna2 = botDto.AhwBna();
        C56066xvm c56066xvm = C56066xvm.EZpvd;
        java.lang.String strOLrzqt2 = botDto.OLrzqt();
        java.lang.String strDjBIcL3 = botDto.djBIcL();
        if (z3) {
            InterfaceC53632wpE interfaceC53632wpE3 = (InterfaceC53632wpE) botDto;
            if (interfaceC53632wpE3.fJNWhG().length() > 0) {
                strHDKMBd = interfaceC53632wpE3.fJNWhG();
            } else if (botDto instanceof InterfaceC53630wpC) {
                strHDKMBd = ((InterfaceC53630wpC) botDto).DbNXlk();
            } else {
                if (!(botDto instanceof InterfaceC53634wpG)) {
                    throw new NoWhenBranchMatchedException();
                }
                strHDKMBd = ((InterfaceC53634wpG) botDto).hDKMBd();
            }
        }
        if (strHDKMBd.length() <= 0) {
            strHDKMBd = null;
        }
        java.lang.String strKWHzl = c56066xvm.KWHzl(strOLrzqt2, strDjBIcL3, strHDKMBd);
        java.lang.String strAYXKKw = botDto.AYXKKw();
        int iAEQbTJ = c56066xvm.AEQbTJ(botDto.OLrzqt(), botDto.djBIcL());
        java.lang.String value = BotDisplayType.YieldRatioOnly.getValue();
        java.util.List listAhwBna3 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna3, 10));
        java.util.Iterator it2 = listAhwBna3.iterator();
        while (it2.hasNext()) {
            java.lang.String str3 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((java.lang.CharSequence) it2.next(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null));
            Application application = Companion;
            if (str3 != null) {
                java.lang.String upperCase2 = str3.toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                strAEQbTJ = upperCase2 != null ? C52684wUn.AEQbTJ(upperCase2) : null;
            }
            if (str3 == null) {
                str3 = "";
            }
            arrayList.add(application.OLrzqt(strAEQbTJ, str3));
        }
        return new PlanetBotMetadata(strEZpvd, list, strDjBIcL2, str, str2, listAhwBna2, listOLrzqt, string, strValueOf2, strAEQbTJ2, value, strKWHzl, strAYXKKw, java.lang.String.valueOf(iAEQbTJ), arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<java.util.Map<java.lang.String, java.lang.String>> OLrzqt(BotDto botDto) {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strValues = botDto instanceof InterfaceC53679wpz ? ((InterfaceC53679wpz) botDto).values() : "";
        if (botDto instanceof InterfaceC53633wpF) {
            BotDirection botDirectionFIwbmz = ((InterfaceC53633wpF) botDto).fIwbmz();
            string = botDirectionFIwbmz != null ? botDirectionFIwbmz.toString() : null;
            if (string == null) {
            }
        } else {
            string = "";
        }
        arrayList.add(C56423yEv.EZpvd(C56390yDp.OLrzqt(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, strValues)));
        arrayList.add(C56423yEv.EZpvd(C56390yDp.OLrzqt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, string)));
        if (botDto instanceof InterfaceC53628wpA) {
            InterfaceC53628wpA interfaceC53628wpA = (InterfaceC53628wpA) botDto;
            if (interfaceC53628wpA.AkhnZx().length() > 0) {
                arrayList.add(C56423yEv.EZpvd(C56390yDp.OLrzqt("last", interfaceC53628wpA.AkhnZx())));
            } else {
                arrayList.add(C56423yEv.EZpvd(C56390yDp.OLrzqt("last", "")));
            }
        }
        arrayList.add(C56423yEv.EZpvd(C56390yDp.OLrzqt("runtime", botDto.AYXKKw() + "," + botDto.AEQbTJ())));
        if (botDto instanceof SmartArbitrageBotDto) {
            SmartArbitrageBotDto smartArbitrageBotDto = (SmartArbitrageBotDto) botDto;
            if (smartArbitrageBotDto.AuCTel().length() > 0) {
                arrayList.add(C56423yEv.EZpvd(C56390yDp.OLrzqt("apy", smartArbitrageBotDto.AuCTel())));
            } else {
                arrayList.add(C56423yEv.EZpvd(C56390yDp.OLrzqt("apy", "")));
            }
        }
        if (botDto instanceof RecurringBotDto) {
            RecurringBotDto recurringBotDto = (RecurringBotDto) botDto;
            arrayList.add(C56423yEv.EZpvd(C56390yDp.OLrzqt("recurringInfo", recurringBotDto.fARcdN() + "," + recurringBotDto.ejfBZ() + "," + recurringBotDto.fIwbmz() + "," + recurringBotDto.AuCTel())));
        } else {
            arrayList.add(C56423yEv.EZpvd(C56390yDp.OLrzqt("recurringInfo", "")));
        }
        if (botDto instanceof SignalBotDto) {
            java.lang.Long lValueOf = java.lang.Long.valueOf(((SignalBotDto) botDto).ejfBZ());
            if (lValueOf.longValue() == 0) {
                lValueOf = null;
            }
            java.lang.String string2 = lValueOf != null ? lValueOf.toString() : null;
            arrayList.add(C56423yEv.EZpvd(C56390yDp.OLrzqt("triggerTime", string2 != null ? string2 : "")));
        } else {
            arrayList.add(C56423yEv.EZpvd(C56390yDp.OLrzqt("triggerTime", "")));
        }
        return arrayList;
    }
}
