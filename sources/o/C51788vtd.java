package o;

import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.market_place.home.create_bot.config.BotCategoryType;
import com.okinc.unify_trade.biz.CategoryItem;
import com.okinc.unify_trade.biz.MpCategory;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import com.okinc.unify_trade.bot.data.BotSelectedData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vtd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51788vtd {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = C56111xwe.AEQbTJ;
    public final C56111xwe<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault = new C56111xwe<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.vtd$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vtd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault(@NotNull java.lang.String str) {
        xOU xouWlaJM;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        this.copydefault.setValue(new kotlin.Pair<>(java.lang.Boolean.valueOf(!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt()))), str));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BotSelectedData KWHzl(OrderCategory orderCategory) {
        boolean z;
        java.lang.String strAYXKKw;
        UserTradeConfigInfo userTradeConfigInfoGHZMYf;
        xOU xouWlaJM;
        java.lang.String strOLrzqt = null;
        C51469vnc c51469vncConvertSelectBotConfig$default = C51468vnb.convertSelectBotConfig$default(orderCategory.getStrategyType(), false, 2, null);
        if (c51469vncConvertSelectBotConfig$default == null) {
            return null;
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null && (xouWlaJM = interfaceC54581xNrCopydefault.wlaJM()) != null) {
            strOLrzqt = xouWlaJM.OLrzqt();
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault2 == null || (userTradeConfigInfoGHZMYf = interfaceC54581xNrCopydefault2.gHZMYf()) == null) {
            z = false;
        } else {
            z = true;
            if (userTradeConfigInfoGHZMYf.getRoleType() != 1) {
            }
        }
        java.lang.String strategyType = orderCategory.getStrategyType();
        int iCopydefault = c51469vncConvertSelectBotConfig$default.copydefault();
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(orderCategory.getStrategyType());
        if (tacticsTypeAEQbTJ == null || (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) == null) {
            strAYXKKw = "";
        }
        return new BotSelectedData(strategyType, iCopydefault, strAYXKKw, c51469vncConvertSelectBotConfig$default.OLrzqt(), orderCategory.getUserCount(), java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) orderCategory.getStrategyType())), java.lang.Boolean.valueOf(C51468vnb.DbNXlk().contains(orderCategory.getStrategyType()) ? z : false), orderCategory.getTags(), false, 0, 768, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<java.lang.Object> AEQbTJ() {
        java.util.List<java.lang.String> listAhwBna;
        java.util.List<CategoryItem> listAhwBna2;
        BotSelectedData botSelectedDataKWHzl;
        java.lang.Object next;
        java.util.List<MpCategory> listKWHzl;
        xOR xorCopydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.util.List<OrderCategory> listAEQbTJ = (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null) ? null : xorCopydefault.AEQbTJ();
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        MpCategory mpCategory = (interfaceC55881xsMCopydefault == null || (listKWHzl = interfaceC55881xsMCopydefault.KWHzl()) == null) ? null : (MpCategory) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
        if (mpCategory == null || (listAhwBna = mpCategory.getDefaultContent()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List<java.lang.String> bots = listAhwBna.isEmpty() ? BotCategoryType.DEFAULT.getBots() : listAhwBna;
        if (mpCategory == null || (listAhwBna2 = mpCategory.getExtra()) == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        if (listAhwBna2.isEmpty()) {
            if (listAhwBna.isEmpty()) {
                java.util.List<BotCategoryType> listGEmmrt = yDY.gEmmrt(BotCategoryType.POPULAR, BotCategoryType.ADVANCED, BotCategoryType.ARBITRAGE);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
                for (BotCategoryType botCategoryType : listGEmmrt) {
                    arrayList2.add(new CategoryItem(botCategoryType.getConst(), botCategoryType.getBots()));
                }
                listAhwBna2 = arrayList2;
            } else {
                listAhwBna2 = C56402yEa.EZpvd(new CategoryItem(BotCategoryType.POPULAR.getConst(), listAhwBna));
            }
        }
        for (CategoryItem categoryItem : listAhwBna2) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.addAll(categoryItem.getContent());
            if (!arrayList3.isEmpty() && BotCategoryType.Companion.OLrzqt(categoryItem.getName()) != null) {
                if (listAEQbTJ != null) {
                    if (!listAEQbTJ.isEmpty()) {
                        java.util.Iterator<T> it = listAEQbTJ.iterator();
                        while (it.hasNext()) {
                            if (arrayList3.contains(((OrderCategory) it.next()).getStrategyType())) {
                            }
                        }
                    }
                }
                if (Intrinsics.EZpvd((java.lang.Object) categoryItem.getName(), (java.lang.Object) BotCategoryType.POPULAR.getConst())) {
                    arrayList3.addAll(0, bots);
                }
                arrayList.add(BotCategoryType.Companion.EZpvd(categoryItem.getName()));
                java.util.List<java.lang.String> listQbewEr = CollectionsKt___CollectionsKt.QbewEr(arrayList3);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.String str : listQbewEr) {
                    if (listAEQbTJ != null) {
                        java.util.Iterator<T> it2 = listAEQbTJ.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (Intrinsics.EZpvd((java.lang.Object) ((OrderCategory) next).getStrategyType(), (java.lang.Object) str)) {
                                break;
                            }
                        }
                        OrderCategory orderCategory = (OrderCategory) next;
                        botSelectedDataKWHzl = orderCategory == null ? null : KWHzl(orderCategory);
                    }
                    if (botSelectedDataKWHzl != null) {
                        arrayList4.add(botSelectedDataKWHzl);
                    }
                }
                arrayList.addAll(arrayList4);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ java.lang.String getTitleText$default(C51788vtd c51788vtd, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c51788vtd.EZpvd(str);
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        TacticsType tacticsTypeAEQbTJ;
        java.lang.String strAYXKKw;
        xOU xouWlaJM;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            str = (interfaceC54581xNrCopydefault == null || (xouWlaJM = interfaceC54581xNrCopydefault.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
        }
        return (str == null || (tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(str)) == null || (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) == null) ? "" : strAYXKKw;
    }
}
