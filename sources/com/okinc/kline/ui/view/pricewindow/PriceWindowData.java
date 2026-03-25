package com.okinc.kline.ui.view.pricewindow;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class PriceWindowData {
    public static int EZpvd;
    public static final PriceWindowData AEQbTJ = new PriceWindowData();
    public static final String djBIcL = "priceWindowData";
    public static int OLrzqt = 6;
    public static boolean valueOf = true;
    public static int KWHzl = 1;
    public static final int copydefault = 8;

    public static final class TaskDescription extends TypeToken<ArrayList<PriceWindowItem>> {
    }

    private PriceWindowData() {
    }

    public static final class PriceWindowItem {
        public static final int $stable = 8;
        private String changePercent;
        private String contract;
        private String displayId;
        private boolean isPreMarket;
        private int klineType;
        private String leverage;
        private String price;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChangePercent() {
            return this.changePercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContract() {
            return this.contract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDisplayId() {
            return this.displayId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getKlineType() {
            return this.klineType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLeverage() {
            return this.leverage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPrice() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isPreMarket() {
            return this.isPreMarket;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChangePercent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.changePercent = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setContract(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.contract = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDisplayId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.displayId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setKlineType(int i) {
            this.klineType = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLeverage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.leverage = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPreMarket(boolean z) {
            this.isPreMarket = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPrice(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.price = str;
        }

        public PriceWindowItem() {
            this.contract = "";
            this.price = "- -";
            this.changePercent = "- -";
            this.leverage = "";
            this.displayId = "";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("- -") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("- -") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:34) call: com.okinc.kline.ui.view.pricewindow.PriceWindowData.PriceWindowItem.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
        public /* synthetic */ PriceWindowItem(String str, int i, String str2, String str3, String str4, boolean z, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? "- -" : str2, (i2 & 8) != 0 ? "- -" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? "" : str5);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PriceWindowItem(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5) {
            this();
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.contract = str;
            this.klineType = i;
            this.price = str2;
            this.changePercent = str3;
            this.leverage = str4;
            this.isPreMarket = z;
            str5 = C33129mqd.OLrzqt((CharSequence) str5) ? str5 : null;
            this.displayId = str5 != null ? str5 : str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.util.ArrayList<com.okinc.kline.ui.view.pricewindow.PriceWindowData$PriceWindowItem> */
    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList<PriceWindowItem> AEQbTJ() {
        ArrayList<PriceWindowItem> arrayList = new ArrayList();
        String string = SPUtils.getString(djBIcL, null);
        if (!TextUtils.isEmpty(string)) {
            arrayList = (ArrayList) new Gson().fromJson(string, new TaskDescription().getType());
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (PriceWindowItem priceWindowItem : arrayList) {
            if (priceWindowItem.getKlineType() == 0) {
                priceWindowItem.setKlineType(1);
            }
            arrayList2.add(Unit.INSTANCE);
        }
        HashSet hashSet = new HashSet();
        ArrayList<PriceWindowItem> arrayList3 = new ArrayList<>();
        for (Object obj : arrayList) {
            PriceWindowItem priceWindowItem2 = (PriceWindowItem) obj;
            if (hashSet.add(priceWindowItem2.getContract() + "_" + priceWindowItem2.getKlineType())) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    public final void OLrzqt(@NotNull List<PriceWindowItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        for (PriceWindowItem priceWindowItem : list) {
            priceWindowItem.setPrice("- -");
            priceWindowItem.setChangePercent("- -");
        }
        SPUtils.put(djBIcL, new Gson().toJson(list));
        if (EZpvd < EZpvd() || EZpvd() == 0) {
            return;
        }
        int i = EZpvd - 1;
        EZpvd = i;
        EZpvd(i);
    }

    public final ArrayList<PriceWindowItem> OLrzqt() {
        int iCopydefault;
        ArrayList<PriceWindowItem> arrayList = new ArrayList<>();
        if (!AEQbTJ().isEmpty()) {
            if (copydefault() >= EZpvd() - 1) {
                iCopydefault = AEQbTJ().size();
            } else {
                iCopydefault = (copydefault() + 1) * KWHzl();
            }
            for (int iCopydefault2 = copydefault() * KWHzl(); iCopydefault2 < iCopydefault; iCopydefault2++) {
                arrayList.add(AEQbTJ().get(iCopydefault2));
            }
        }
        return arrayList;
    }

    public final int copydefault() {
        int iIntValue = SPUtils.getInt("price_window_page", 0).intValue();
        EZpvd = iIntValue;
        if (iIntValue < 0) {
            return 0;
        }
        return iIntValue > EZpvd() + (-1) ? EZpvd() - 1 : EZpvd;
    }

    public final int EZpvd() {
        return (int) Math.ceil((AEQbTJ().size() * 1.0f) / KWHzl());
    }

    public final void EZpvd(int i) {
        EZpvd = i;
        SPUtils.put("price_window_page", Integer.valueOf(i));
    }

    public final boolean djBIcL() {
        boolean z = SPUtils.getBoolean("chart_price_window_change_percent", false);
        valueOf = z;
        return z;
    }

    public final int AhwBna() {
        int iIntValue = SPUtils.getInt("chart_price_window_text_level", 1).intValue();
        KWHzl = iIntValue;
        return iIntValue;
    }

    public final int KWHzl() {
        int iIntValue = SPUtils.getInt("chart_price_window_page_size", 6).intValue();
        OLrzqt = iIntValue;
        if (iIntValue > 8) {
            return 8;
        }
        return iIntValue;
    }

    public final void KWHzl(int i) {
        OLrzqt = i;
        SPUtils.put("chart_price_window_page_size", Integer.valueOf(i));
    }

    public final boolean AYXKKw() {
        return AEQbTJ().size() > KWHzl();
    }
}
