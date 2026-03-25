package o;

import androidx.camera.video.AudioStats;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qTo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40376qTo {
    public static final <T extends InterfaceC41791qxV<T>> java.util.List<T> OLrzqt(@NotNull java.util.List<? extends T> list, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>> map) {
        Intrinsics.checkNotNullParameter(list, "");
        if (map == null || !(!map.isEmpty())) {
            map = null;
        }
        if (map == null) {
            map = C56424yEw.KWHzl();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC41791qxV interfaceC41791qxV = (InterfaceC41791qxV) it.next();
            BizInstrument bizInstrumentKWHzl = interfaceC41791qxV.KWHzl();
            java.util.Map<java.lang.String, ? extends BizInstrument> map2 = map.get(bizInstrumentKWHzl.getInstType());
            arrayList.add(interfaceC41791qxV.EZpvd((map2 != null ? map2.get(bizInstrumentKWHzl.getInstId()) : null) != null));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.util.List<? extends T extends o.qxV<T>> */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends InterfaceC41791qxV<T>> java.util.List<T> AEQbTJ(@NotNull java.util.List<? extends T> list, java.util.Map<java.lang.String, C41787qxR> map) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(list, "");
        if (map == null || map.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC41791qxV interfaceC41791qxVOLrzqt = (InterfaceC41791qxV) it.next();
            BizInstrument bizInstrumentKWHzl = interfaceC41791qxVOLrzqt.KWHzl();
            C41787qxR c41787qxR = map.get(interfaceC41791qxVOLrzqt.KWHzl().getInstId());
            if (c41787qxR != null) {
                java.lang.String instType = bizInstrumentKWHzl.getInstType();
                switch (instType.hashCode()) {
                    case -2027980370:
                        strCopydefault = !instType.equals("MARGIN") ? c41787qxR.copydefault() : copydefault(bizInstrumentKWHzl, c41787qxR.AYXKKw());
                        break;
                    case -1956807563:
                        if (instType.equals("OPTION")) {
                            strCopydefault = EZpvd(bizInstrumentKWHzl, c41787qxR.AYXKKw());
                            break;
                        }
                        break;
                    case 2074257:
                        if (instType.equals("COIN")) {
                            strCopydefault = KWHzl(bizInstrumentKWHzl, c41787qxR.AYXKKw());
                            break;
                        }
                        break;
                    case 2552066:
                        if (!instType.equals("SPOT")) {
                        }
                        break;
                    case 2558355:
                        if (instType.equals("SWAP")) {
                            strCopydefault = OLrzqt(bizInstrumentKWHzl, c41787qxR.AYXKKw());
                            break;
                        }
                        break;
                    case 214415088:
                        if (!instType.equals("FUTURES")) {
                        }
                        break;
                }
                interfaceC41791qxVOLrzqt = interfaceC41791qxVOLrzqt.OLrzqt(C41787qxR.copy$default(c41787qxR, null, null, null, strCopydefault, AudioStats.AUDIO_AMPLITUDE_NONE, null, 55, null));
            }
            arrayList.add(interfaceC41791qxVOLrzqt);
        }
        return arrayList;
    }

    public static final java.lang.String KWHzl(BizInstrument bizInstrument, TickersData tickersData) {
        C54536xML c54536xMLValues;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        xMW xmwKWHzl;
        if (tickersData.getLast().length() == 0) {
            return "--";
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        C54536xML c54536xMLAYXKKw = (interfaceC54581xNrCopydefault == null || (xmwKWHzl = interfaceC54581xNrCopydefault.KWHzl()) == null) ? null : xmwKWHzl.AYXKKw(tickersData.getLast());
        return (c54536xMLAYXKKw == null || (c54536xMLValues = c54536xMLAYXKKw.values()) == null || (c54536xMLIsConnected = c54536xMLValues.isConnected()) == null || (c54536xMLAkhnZx = c54536xMLIsConnected.AkhnZx()) == null || (c54536xMLDjBIcL = c54536xMLAkhnZx.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "" : safeString$default;
    }

    public static final java.lang.String copydefault(@NotNull BizInstrument bizInstrument, @NotNull TickersData tickersData) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(tickersData, "");
        if (tickersData.getLast().length() == 0) {
            return "--";
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        AbstractC54531xLw abstractC54531xLwDjBIcL = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.djBIcL(bizInstrument.getInstType()) : null;
        xMS xmsGEmmrt = abstractC54531xLwDjBIcL != null ? abstractC54531xLwDjBIcL.gEmmrt(bizInstrument.getInstFamily()) : null;
        return (xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(tickersData.getLast())) == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "" : safeString$default;
    }

    public static final java.lang.String OLrzqt(BizInstrument bizInstrument, TickersData tickersData) {
        xMS xmsGEmmrt;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        AbstractC54531xLw abstractC54531xLwDjBIcL = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.djBIcL(bizInstrument.getInstType()) : null;
        if (bizInstrument.isPositiveContract()) {
            if (abstractC54531xLwDjBIcL instanceof InterfaceC54532xLx) {
                return C54536xML.toSafeString$default(abstractC54531xLwDjBIcL.gEmmrt(bizInstrument.getInstFamily()).AYXKKw(tickersData.getLast()).djBIcL(), false, 1, null);
            }
        } else if (abstractC54531xLwDjBIcL != null && (xmsGEmmrt = abstractC54531xLwDjBIcL.gEmmrt(bizInstrument.getInstFamily())) != null && (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(tickersData.getLast())) != null && (c54536xMLAkhnZx = c54536xMLAYXKKw.AkhnZx()) != null && (c54536xMLIsConnected = c54536xMLAkhnZx.isConnected()) != null && (c54536xMLDjBIcL = c54536xMLIsConnected.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
            return safeString$default;
        }
        return "";
    }

    public static final java.lang.String EZpvd(BizInstrument bizInstrument, TickersData tickersData) {
        xMS xmsGEmmrt;
        java.lang.String strValues;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        AbstractC54531xLw abstractC54531xLwDjBIcL = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.djBIcL(bizInstrument.getInstType()) : null;
        return (abstractC54531xLwDjBIcL == null || (xmsGEmmrt = abstractC54531xLwDjBIcL.gEmmrt(bizInstrument.getInstFamily())) == null || (strValues = xmsGEmmrt.values(tickersData.getLast())) == null) ? "" : strValues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [104=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends InterfaceC41791qxV<T>> T copydefault(@NotNull T t, C41787qxR c41787qxR) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(t, "");
        BizInstrument bizInstrumentKWHzl = t.KWHzl();
        if (c41787qxR == null) {
            return t;
        }
        java.lang.String instType = bizInstrumentKWHzl.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                strCopydefault = !instType.equals("MARGIN") ? c41787qxR.copydefault() : copydefault(bizInstrumentKWHzl, c41787qxR.AYXKKw());
                break;
            case -1956807563:
                if (instType.equals("OPTION")) {
                    strCopydefault = EZpvd(bizInstrumentKWHzl, c41787qxR.AYXKKw());
                    break;
                }
                break;
            case 2074257:
                if (instType.equals("COIN")) {
                    strCopydefault = KWHzl(bizInstrumentKWHzl, c41787qxR.AYXKKw());
                    break;
                }
                break;
            case 2552066:
                if (!instType.equals("SPOT")) {
                }
                break;
            case 2558355:
                if (instType.equals("SWAP")) {
                    strCopydefault = OLrzqt(bizInstrumentKWHzl, c41787qxR.AYXKKw());
                    break;
                }
                break;
            case 214415088:
                if (!instType.equals("FUTURES")) {
                }
                break;
        }
        return (T) t.OLrzqt(C41787qxR.copy$default(c41787qxR, null, null, null, strCopydefault, AudioStats.AUDIO_AMPLITUDE_NONE, null, 55, null));
    }
}
