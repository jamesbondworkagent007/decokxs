package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xto, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55962xto {
    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() == 0 ? "--" : xMR.copydefault.copydefault(str);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0) ? OLrzqt("0") : C56033xvF.getBotPnl$default(str2, str3, str, null, false, true, null, false, null, null, null, 2008, null);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) ? C56068xvo.copydefault.copydefault(str, true) : C56068xvo.copydefault.copydefault("0", true);
    }

    public static final java.lang.String KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 3), ",", null, null, 0, null, null, 62, null) + (list.size() > 3 ? "..." : "") + str;
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C56071xvr.gEmmrt.ejfBZ()) {
            return C33069mpW.copydefault(C55688xof.Application.gEmmrt, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str)));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(C33070mpX.AYXKKw(C55688xof.Application.DAIeex));
        sb.append(" ");
        sb.append("(" + str + ")");
        return sb.toString();
    }

    public static final java.util.List<DcaTriggerParam> OLrzqt(java.util.ArrayList<SignParamItem> arrayList) {
        if (arrayList == null) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (SignParamItem signParamItem : arrayList) {
            arrayList2.add(new DcaTriggerParam(signParamItem.getTriggerAction(), signParamItem.getIndicator(), signParamItem.getTriggerCond(), signParamItem.getTriggerPx(), signParamItem.getThold(), (java.lang.String) null, signParamItem.getTimePeriod(), signParamItem.getTimeframe(), (java.lang.String) null, (java.lang.String) null, 800, (DefaultConstructorMarker) null));
        }
        return arrayList2;
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.List<DcaTriggerParam> list) {
        DcaTriggerParam dcaTriggerParam;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DcaTriggerParam) next).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                    break;
                }
            }
            dcaTriggerParam = (DcaTriggerParam) next;
        } else {
            dcaTriggerParam = null;
        }
        java.lang.String triggerStrategy = dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null;
        GridStartTriggerType gridStartTriggerType = GridStartTriggerType.INSTANT;
        if (Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) gridStartTriggerType.getMode())) {
            return C33070mpX.AYXKKw(gridStartTriggerType.getDesc());
        }
        GridStartTriggerType gridStartTriggerType2 = GridStartTriggerType.PRICE;
        if (Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) gridStartTriggerType2.getMode())) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(gridStartTriggerType2.getDesc());
            java.lang.String triggerPx = dcaTriggerParam.getTriggerPx();
            return strAYXKKw + " | " + C56033xvF.getBotPrice$default(str, str2, triggerPx == null ? "" : triggerPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) GridStartTriggerType.RSI_14.getMode())) {
            return C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatSearchCallback);
        }
        GridStartTriggerType gridStartTriggerType3 = GridStartTriggerType.TRADINGVIEW;
        return Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) gridStartTriggerType3.getMode()) ? C33070mpX.AYXKKw(gridStartTriggerType3.getDesc()) : "";
    }
}
