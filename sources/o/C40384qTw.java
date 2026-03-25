package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qTw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40384qTw {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [15=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.String copydefault(@NotNull BizInstrument bizInstrument) {
        java.lang.String str;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        java.lang.String instType = bizInstrument.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                if (!instType.equals("MARGIN")) {
                    return "";
                }
                break;
            case -1956807563:
                return !instType.equals("OPTION") ? "" : C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, false, 24, null);
            case 2552066:
                if (!instType.equals("SPOT")) {
                    return "";
                }
                break;
            case 2558355:
                return !instType.equals("SWAP") ? "" : C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, false, 24, null);
            case 214415088:
                return !instType.equals("FUTURES") ? "" : C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, false, 28, null);
            default:
                return "";
        }
        boolean z = bizInstrument instanceof SpotInstrument;
        SpotInstrument spotInstrument = z ? (SpotInstrument) bizInstrument : null;
        java.lang.String level = spotInstrument != null ? spotInstrument.getLevel() : null;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) level)) {
            level = null;
        }
        if (level == null) {
            SpotInstrument spotInstrument2 = z ? (SpotInstrument) bizInstrument : null;
            level = spotInstrument2 != null ? spotInstrument2.getCoinLever() : null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) level, (java.lang.Object) "0") || level == null || level.length() == 0) {
            str = "";
        } else {
            str = level + "X";
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) bizInstrument.getDisplayId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() < 2) {
            return "";
        }
        java.lang.Object obj = listSplit$default.get(0);
        java.lang.Object obj2 = listSplit$default.get(1);
        if (str == null) {
            str2 = null;
        } else if (str.length() != 0) {
            str2 = " " + str;
        }
        return obj + "/" + obj2 + str2;
    }

    public static final java.lang.String AEQbTJ(@NotNull DexInstrument dexInstrument) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        return pWR.AEQbTJ(dexInstrument.getTokenSymbol(), dexInstrument.getChainName(), dexInstrument.getTokenContractAddress());
    }
}
