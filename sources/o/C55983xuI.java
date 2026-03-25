package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.InstTierItem;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xuI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55983xuI implements InterfaceC54501xKt<java.util.List<? extends InstTierItem>, java.util.ArrayList<SignalCoinPairItemData>> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.ArrayList<SignalCoinPairItemData> KWHzl(@NotNull java.util.List<InstTierItem> list) {
        java.lang.String str;
        java.lang.String strValueOf;
        java.lang.String tradeSymbol;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<SignalCoinPairItemData> arrayList = new java.util.ArrayList<>();
        for (InstTierItem instTierItem : list) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null) {
                str = "";
            } else {
                java.lang.String instType = instTierItem.getInstType();
                if (instType == null) {
                    instType = "";
                }
                java.lang.String instId = instTierItem.getInstId();
                if (instId == null) {
                    instId = "";
                }
                BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instType, instId, null, null, 12, null);
                if (suggestedInstrument$default != null && (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) != null) {
                    str = tradeSymbol;
                }
            }
            C54799xVt c54799xVt = C54799xVt.AEQbTJ;
            java.lang.String instId2 = instTierItem.getInstId();
            if (instId2 == null) {
                instId2 = "";
            }
            java.lang.String instType2 = instTierItem.getInstType();
            if (instType2 == null) {
                instType2 = "";
            }
            java.lang.String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(c54799xVt, instId2, instType2, false, false, 12, null);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            java.lang.String str2 = (interfaceC54581xNrOLrzqt2 == null || (strValueOf = interfaceC54581xNrOLrzqt2.valueOf(str)) == null) ? "" : strValueOf;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt3 != null) {
                java.lang.String instId3 = instTierItem.getInstId();
                if (instId3 == null) {
                    instId3 = "";
                }
                java.lang.String instType3 = instTierItem.getInstType();
                if (instType3 == null) {
                    instType3 = "";
                }
                if (interfaceC54581xNrOLrzqt3.OLrzqt(instId3, instType3)) {
                    java.lang.String instId4 = instTierItem.getInstId();
                    java.lang.String str3 = instId4 == null ? "" : instId4;
                    java.lang.String instType4 = instTierItem.getInstType();
                    java.lang.String str4 = instType4 == null ? "" : instType4;
                    java.lang.String maxLeverage = instTierItem.getMaxLeverage();
                    arrayList.add(new SignalCoinPairItemData(titleByIdAndType$default, str2, (java.lang.Integer) null, (java.lang.Integer) null, str3, str4, str, maxLeverage == null ? "" : maxLeverage, false, false, false, 0, false, 7948, (DefaultConstructorMarker) null));
                }
            }
        }
        return arrayList;
    }
}
