package o;

import com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dex.trade.common.reminder.data.ReminderTierType;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class gOS {
    public static final gOS OLrzqt = new gOS();

    private gOS() {
    }

    public final ReminderListConfig copydefault(C19783gPd c19783gPd) {
        if (c19783gPd == null) {
            return KWHzl();
        }
        java.util.Map<ReminderTierType, C19781gPb> mapAEQbTJ = AEQbTJ(c19783gPd);
        if (mapAEQbTJ.isEmpty()) {
            return KWHzl();
        }
        C19781gPb c19781gPb = mapAEQbTJ.get(ReminderTierType.Blocking);
        boolean zCopydefault = copydefault(c19781gPb);
        java.util.List<TradeReminderType> listEZpvd = EZpvd(c19781gPb, mapAEQbTJ, zCopydefault);
        return KWHzl(AEQbTJ(listEZpvd, c19783gPd), KWHzl(listEZpvd, c19783gPd), zCopydefault);
    }

    public final java.util.Map<ReminderTierType, C19781gPb> AEQbTJ(C19783gPd c19783gPd) {
        java.util.List<InterfaceC19785gPf> listAEQbTJ = AEQbTJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC19785gPf interfaceC19785gPf : listAEQbTJ) {
            C19781gPb c19781gPbOLrzqt = interfaceC19785gPf.OLrzqt(c19783gPd);
            if (KWHzl(c19781gPbOLrzqt)) {
                linkedHashMap.put(interfaceC19785gPf.AEQbTJ(), c19781gPbOLrzqt);
            }
        }
        return linkedHashMap;
    }

    public final java.util.List<InterfaceC19785gPf> AEQbTJ() {
        return yDY.gEmmrt(new C19790gPk(), new C19804gPy(), new gPB(), new gPE(), new gPD(), new gPG());
    }

    public final boolean KWHzl(C19781gPb c19781gPb) {
        return c19781gPb.KWHzl();
    }

    public final boolean copydefault(C19781gPb c19781gPb) {
        return c19781gPb != null && c19781gPb.KWHzl();
    }

    public final java.util.List<TradeReminderType> EZpvd(C19781gPb c19781gPb, java.util.Map<ReminderTierType, C19781gPb> map, boolean z) {
        java.util.List<TradeReminderType> listCopydefault;
        if (z) {
            return (c19781gPb == null || (listCopydefault = c19781gPb.copydefault()) == null) ? yDY.AhwBna() : listCopydefault;
        }
        return EZpvd(map);
    }

    public final java.util.List<TradeReminderType> EZpvd(java.util.Map<ReminderTierType, C19781gPb> map) {
        TradeReminderType tradeReminderTypeEZpvd;
        if (map.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.List<ReminderTierType> listOLrzqt = OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<ReminderTierType> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            C19781gPb c19781gPb = map.get(it.next());
            if (c19781gPb != null && EZpvd(c19781gPb) && (tradeReminderTypeEZpvd = c19781gPb.EZpvd()) != null) {
                arrayList.add(tradeReminderTypeEZpvd);
                if (arrayList.size() >= 5) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<ReminderTierType> OLrzqt() {
        return yDY.gEmmrt(ReminderTierType.TokenAttribute, ReminderTierType.TradeFailure, ReminderTierType.TradeRisk, ReminderTierType.TradeRule, ReminderTierType.AccountStatus);
    }

    public final boolean EZpvd(C19781gPb c19781gPb) {
        return c19781gPb.KWHzl() && c19781gPb.EZpvd() != null;
    }

    public final ReminderInfoConfig AEQbTJ(java.util.List<? extends TradeReminderType> list, C19783gPd c19783gPd) {
        TradeReminderType tradeReminderType = (TradeReminderType) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (tradeReminderType == null) {
            return null;
        }
        return copydefault(tradeReminderType, c19783gPd);
    }

    public final ReminderInfoConfig copydefault(TradeReminderType tradeReminderType, C19783gPd c19783gPd) {
        return gOL.EZpvd.OLrzqt(tradeReminderType, c19783gPd.gEmmrt(), c19783gPd.AEQbTJ(), c19783gPd.KWHzl(), c19783gPd.fetchVPNInfo(), c19783gPd.AkhnZx(), c19783gPd.valueOf(), c19783gPd.ejfBZ(), c19783gPd.fARcdN(), c19783gPd.AYXKKw(), c19783gPd.AhwBna(), c19783gPd.OLrzqt(), c19783gPd.fJNWhG(), c19783gPd.copydefault(), c19783gPd.values(), c19783gPd.getNewProxyInstance(), c19783gPd.fIwbmz(), c19783gPd.DbNXlk(), c19783gPd.EZpvd(), c19783gPd.uzCIH(), c19783gPd.getFieldNames(), c19783gPd.isConnected(), c19783gPd.hDKMBd());
    }

    public final java.util.List<ReminderInfoConfig> KWHzl(java.util.List<? extends TradeReminderType> list, C19783gPd c19783gPd) {
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ReminderInfoConfig reminderInfoConfigCopydefault = OLrzqt.copydefault((TradeReminderType) it.next(), c19783gPd);
            if (reminderInfoConfigCopydefault != null) {
                arrayList.add(reminderInfoConfigCopydefault);
            }
        }
        return arrayList;
    }

    public final ReminderListConfig KWHzl(ReminderInfoConfig reminderInfoConfig, java.util.List<ReminderInfoConfig> list, boolean z) {
        return new ReminderListConfig(reminderInfoConfig, list, list.size(), !z && list.size() > 1, z);
    }

    public final ReminderListConfig KWHzl() {
        return new ReminderListConfig(null, yDY.AhwBna(), 0, false, false);
    }
}
