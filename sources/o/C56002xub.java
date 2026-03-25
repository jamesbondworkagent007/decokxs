package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56002xub {
    public static final C56002xub KWHzl = new C56002xub();

    private C56002xub() {
    }

    public final java.lang.String KWHzl(BizInstrument bizInstrument) {
        java.lang.String quoteSymbol;
        return (bizInstrument == null || (quoteSymbol = bizInstrument.getQuoteSymbol()) == null) ? "" : quoteSymbol;
    }

    public final java.lang.String EZpvd(BizInstrument bizInstrument) {
        java.lang.String displayQuoteSymbol;
        return (bizInstrument == null || (displayQuoteSymbol = bizInstrument.getDisplayQuoteSymbol()) == null) ? "" : displayQuoteSymbol;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault(C33129mqd.divS$default(str, "86400000", 0, null, null, 12, null));
        java.lang.String strRemS$default = C33129mqd.remS$default(str, "86400000", null, null, null, 14, null);
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda3), C56424yEw.gEmmrt(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, strCopydefault), C56390yDp.OLrzqt("hour", xmr.copydefault(C33129mqd.divS$default(strRemS$default, "3600000", 0, null, null, 12, null))), C56390yDp.OLrzqt("minute", xmr.copydefault(C33129mqd.divS$default(C33129mqd.remS$default(strRemS$default, "3600000", null, null, null, 14, null), "60000", 0, null, null, 12, null)))));
    }

    public static /* synthetic */ java.lang.String getSignalSupportType$default(C56002xub c56002xub, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c56002xub.copydefault(str, z);
    }

    public final java.lang.String copydefault(java.lang.String str, boolean z) {
        java.util.List listSplit$default;
        if (str != null && (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) != null) {
            if (listSplit$default.size() == 1) {
                return (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(listSplit$default);
            }
            if (listSplit$default.contains("profit_sharing") && listSplit$default.contains("subscription") && listSplit$default.size() == 2) {
                return (!z || AEQbTJ()) ? "subscription,profit_sharing" : "profit_sharing";
            }
        }
        return "";
    }

    public final void OLrzqt() {
        C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C55688xof.Application.fERRXa), 0, 1, (java.lang.Object) null);
    }

    public final java.util.List<java.lang.String> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listSplit$default) {
            if (!Intrinsics.EZpvd(obj, (java.lang.Object) "subscription") || KWHzl.AEQbTJ()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean AEQbTJ() {
        return Intrinsics.EZpvd((java.lang.Object) C48787ucK.AEQbTJ.copydefault("botSignalConfig.subscribeSwitch", "0"), (java.lang.Object) "0");
    }
}
