package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ContractDcaTriggerType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ContractDcaTriggerType[] $VALUES;
    public static final ActionBar Companion;
    private final String mode;
    private final int showMode;
    public static final ContractDcaTriggerType INSTANT = new ContractDcaTriggerType("INSTANT", 0, "instant", C55688xof.Application.DGGHxk);
    public static final ContractDcaTriggerType RSI = new ContractDcaTriggerType("RSI", 1, "rsi", C55688xof.Application.QslYrK);
    public static final ContractDcaTriggerType WEB_HOOK = new ContractDcaTriggerType("WEB_HOOK", 2, "webhook", C55688xof.Application.AlertController4);
    public static final ContractDcaTriggerType PRICE = new ContractDcaTriggerType("PRICE", 3, FirebaseAnalytics.Param.PRICE, C55688xof.Application.sendBehavioSecData);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ContractDcaTriggerType[] $values() {
        return new ContractDcaTriggerType[]{INSTANT, RSI, WEB_HOOK, PRICE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ContractDcaTriggerType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowMode() {
        return this.showMode;
    }

    private ContractDcaTriggerType(String str, @StringRes int i, String str2, int i2) {
        this.mode = str2;
        this.showMode = i2;
    }

    static {
        ContractDcaTriggerType[] contractDcaTriggerTypeArr$values = $values();
        $VALUES = contractDcaTriggerTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(contractDcaTriggerTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {

        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ContractDcaTriggerType.values().length];
                try {
                    iArr[ContractDcaTriggerType.PRICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.ContractDcaTriggerType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ContractDcaTriggerType EZpvd(String str) {
            for (ContractDcaTriggerType contractDcaTriggerType : ContractDcaTriggerType.values()) {
                if (Intrinsics.EZpvd((Object) contractDcaTriggerType.getMode(), (Object) str)) {
                    return contractDcaTriggerType;
                }
            }
            return null;
        }

        public final DcaTriggerParam OLrzqt(List<DcaTriggerParam> list) {
            Object obj = null;
            if (list == null) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                DcaTriggerParam dcaTriggerParam = (DcaTriggerParam) next;
                if (Intrinsics.EZpvd((Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerAction() : null), (Object) TtmlNode.START)) {
                    obj = next;
                    break;
                }
            }
            return (DcaTriggerParam) obj;
        }

        public final String EZpvd(List<DcaTriggerParam> list, String str) {
            String strAYXKKw;
            String str2;
            DcaTriggerParam dcaTriggerParamOLrzqt = OLrzqt(list);
            ContractDcaTriggerType contractDcaTriggerTypeEZpvd = EZpvd(dcaTriggerParamOLrzqt != null ? dcaTriggerParamOLrzqt.getTriggerStrategy() : null);
            if (contractDcaTriggerTypeEZpvd == null || StateListAnimator.copydefault[contractDcaTriggerTypeEZpvd.ordinal()] != 1) {
                return (contractDcaTriggerTypeEZpvd == null || (strAYXKKw = C33070mpX.AYXKKw(contractDcaTriggerTypeEZpvd.getShowMode())) == null) ? "" : strAYXKKw;
            }
            if ((dcaTriggerParamOLrzqt != null ? dcaTriggerParamOLrzqt.getTriggerPx() : null) == null) {
                str2 = "--";
            } else {
                xMR xmr = xMR.copydefault;
                String triggerPx = dcaTriggerParamOLrzqt.getTriggerPx();
                str2 = xmr.copydefault(triggerPx != null ? triggerPx : "") + " " + str;
            }
            return C33070mpX.AYXKKw(contractDcaTriggerTypeEZpvd.getShowMode()) + " | " + str2;
        }

        public final boolean OLrzqt(@NotNull DcaTriggerParam... dcaTriggerParamArr) {
            Intrinsics.checkNotNullParameter(dcaTriggerParamArr, "");
            int length = dcaTriggerParamArr.length;
            for (int i = 0; i < length; i++) {
                DcaTriggerParam dcaTriggerParam = dcaTriggerParamArr[i];
                if (Intrinsics.EZpvd((Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null), (Object) ContractDcaTriggerType.WEB_HOOK.getMode())) {
                    return true;
                }
            }
            return false;
        }
    }

    public static ContractDcaTriggerType valueOf(String str) {
        return (ContractDcaTriggerType) Enum.valueOf(ContractDcaTriggerType.class, str);
    }

    public static ContractDcaTriggerType[] values() {
        return (ContractDcaTriggerType[]) $VALUES.clone();
    }
}
