package o;

import com.okinc.unify_trade.biz.BotRangeConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wTo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52658wTo {
    public static final C52658wTo AEQbTJ = new C52658wTo();

    private C52658wTo() {
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull C47988uAv c47988uAv, BotRangeConfig botRangeConfig, java.lang.String str, Function1<? super java.lang.String, java.lang.String> function1, @NotNull Function1<? super java.lang.String, java.lang.String> function12) {
        java.lang.String min;
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        Intrinsics.checkNotNullParameter(function12, "");
        int i = C48033uCm.Application.setSplitBackgroundDrawable;
        if (str == null) {
            min = botRangeConfig != null ? botRangeConfig.getMin() : null;
        } else {
            min = str;
        }
        c47988uAv.setTag(i, min);
        c47988uAv.setTag(C48033uCm.Application.setNavigationMode, botRangeConfig != null ? botRangeConfig.getMax() : null);
        java.lang.String max = botRangeConfig != null ? botRangeConfig.getMax() : null;
        if (max == null || max.length() == 0) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.invalidateMenu);
            java.lang.String strInvoke = function12.invoke(str);
            if (strInvoke == null) {
                strInvoke = function12.invoke(botRangeConfig != null ? botRangeConfig.getMin() : null);
            }
            c47988uAv.setInputHint(strAYXKKw + " " + strInvoke);
        } else {
            if (!C33129mqd.gEmmrt(botRangeConfig != null ? botRangeConfig.getMax() : null, botRangeConfig != null ? botRangeConfig.getMin() : null)) {
                java.lang.String strInvoke2 = function12.invoke(str);
                if (strInvoke2 == null) {
                    strInvoke2 = function12.invoke(botRangeConfig != null ? botRangeConfig.getMin() : null);
                }
                c47988uAv.setInputHint(strInvoke2 + "-" + ((java.lang.Object) function12.invoke(botRangeConfig != null ? botRangeConfig.getMax() : null)));
            }
        }
        if (C33129mqd.AEQbTJ(botRangeConfig != null ? botRangeConfig.getDefault() : null, 0)) {
            if (function1 == null) {
                str2 = botRangeConfig != null ? botRangeConfig.getDefault() : null;
            } else {
                java.lang.String strInvoke3 = function1.invoke(botRangeConfig != null ? botRangeConfig.getDefault() : null);
                if (strInvoke3 != null) {
                    str2 = strInvoke3;
                }
            }
            C47988uAv.setInputContent$default(c47988uAv, str2, false, false, 6, null);
        }
    }

    public final void OLrzqt(@NotNull C47988uAv c47988uAv, @NotNull java.lang.String str) {
        java.lang.String strCopydefault = "";
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(c47988uAv.getTag(C48033uCm.Application.setSplitBackgroundDrawable));
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(c47988uAv.getTag(C48033uCm.Application.setNavigationMode));
        java.lang.String strAkhnZx = c47988uAv.AkhnZx();
        if (C33129mqd.AEQbTJ(strGEmmrt2, 0) && C33129mqd.AEQbTJ(strAkhnZx, strGEmmrt2)) {
            strCopydefault = C33069mpW.copydefault(AEQbTJ(str, true), C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", c47988uAv.values()), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(strGEmmrt2)), C56390yDp.OLrzqt("unit", c47988uAv.fARcdN())));
        } else if (strAkhnZx.length() == 0 || C33129mqd.gEmmrt(strAkhnZx, strGEmmrt)) {
            strCopydefault = C33069mpW.copydefault(AEQbTJ(str, false), C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", c47988uAv.values()), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(strGEmmrt)), C56390yDp.OLrzqt("unit", c47988uAv.fARcdN())));
        }
        if (strCopydefault.length() == 0) {
            c47988uAv.copydefault();
        } else {
            c47988uAv.setInputErrorMsg(strCopydefault);
        }
    }

    public final int AEQbTJ(java.lang.String str, boolean z) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "%") ? z ? C55688xof.Application.QCjLjM : C55688xof.Application.USBtdM : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "") ? z ? C55688xof.Application.QSLkRj : C55688xof.Application.QwvEab : z ? C55688xof.Application.OJuSTm : C55688xof.Application.UlJrfe;
    }
}
