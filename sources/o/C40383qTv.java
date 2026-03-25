package o;

import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qTv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40383qTv {
    public static final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("search_page_path", str);
    }

    public static final java.lang.String AEQbTJ() {
        java.lang.String string = SPUtils.getString("search_page_path", "page_trade");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        final BizInstrument bizInstrumentEZpvd = new xLY(BizInfoConfig.DefaultBizConfig.copydefault).EZpvd();
        C32866mlf.KWHzl("BizNav_List_Token_Click", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.qTx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40383qTv.KWHzl(str, str2, bizInstrumentEZpvd, str3, str4, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, BizInstrument bizInstrument, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        java.lang.String instType;
        java.lang.String instId;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("token_pair", str, true);
        eventParamsList.put("biz_type", C27993kKy.OLrzqt(str2), true);
        if (bizInstrument != null && (instId = bizInstrument.getInstId()) != null) {
            eventParamsList.put("from_token_pair", instId, true);
        }
        if (bizInstrument != null && (instType = bizInstrument.getInstType()) != null) {
            eventParamsList.put("from_biz_type", instType, true);
        }
        eventParamsList.put("to_page_id", AEQbTJ(), true);
        eventParamsList.put("bizType", java.lang.String.valueOf(C27993kKy.copydefault(str3)), true);
        eventParamsList.put(C27989kKu.Companion.AhwBna(), java.lang.String.valueOf(C27993kKy.copydefault(str3)), true);
        eventParamsList.put("tab", str4, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r1.equals("announcement") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r1.equals("feed") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r1.equals("chat") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r1.equals("campaign") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -2027980370:
                return !str.equals("MARGIN") ? "all" : "margin";
            case -1956807563:
                if (str.equals("OPTION")) {
                    return "option";
                }
                break;
            case -1916277982:
                if (str.equals("WEB3_DEX_GROUP_TYPE")) {
                    return ((InterfaceC49494upc) C43251rlk.copydefault(InterfaceC49494upc.class)).EZpvd() ? "cedefi" : "dex";
                }
            case -139919088:
                str2 = "campaign";
                break;
            case 2552066:
                if (str.equals("SPOT")) {
                    return "spot";
                }
                break;
            case 2558355:
                if (str.equals("SWAP")) {
                    return "perpetual";
                }
                break;
            case 3052376:
                str2 = "chat";
                break;
            case 3138974:
                str2 = "feed";
                break;
            case 156781895:
                str2 = "announcement";
                break;
            case 214415088:
                if (str.equals("FUTURES")) {
                    return "futures";
                }
                break;
            case 644518246:
                if (str.equals("STRATEGY_GROUP_TYPE")) {
                    return "bots";
                }
                break;
            case 1059131125:
                if (str.equals("TRADE_GROUP_TYPE")) {
                    return "users";
                }
                break;
            case 1131295064:
                if (str.equals("pre_market")) {
                    return "premarket";
                }
                break;
            case 1535187594:
                if (str.equals("PRODUCT_GROUP_TYPE")) {
                    return "finance";
                }
                break;
        }
    }
}
