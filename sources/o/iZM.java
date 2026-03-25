package o;

import android.view.View;
import android.view.ViewGroup;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC27286jsN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iZM {
    public static /* synthetic */ void addAssetsSection$default(android.content.Context context, C24224iZm c24224iZm, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = C55298xhM.dp2px$default(8.0f, null, 1, null);
        }
        KWHzl(context, c24224iZm, list, i);
    }

    public static final void KWHzl(@NotNull android.content.Context context, @NotNull C24224iZm c24224iZm, @NotNull java.util.List<android.view.View> list, int i) {
        java.lang.String strKWHzl;
        java.lang.String strKWHzl2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c24224iZm, "");
        Intrinsics.checkNotNullParameter(list, "");
        iZQ izq = new iZQ(context, null, 0, 6, null);
        izq.setLabel(c24224iZm.AEQbTJ(), c24224iZm.KWHzl());
        list.add(izq);
        list.add(EZpvd(context, i));
        int i2 = 0;
        for (java.lang.Object obj : c24224iZm.OLrzqt()) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            C24227iZp c24227iZp = (C24227iZp) obj;
            java.lang.String strCopydefault = c24227iZp.copydefault();
            if (strCopydefault != null) {
                C27488jwD c27488jwD = C27488jwD.copydefault;
                C27586jxw c27586jxw = C27586jxw.OLrzqt;
                strKWHzl = c27488jwD.KWHzl(C27586jxw.localizeCryptoAmount$default(c27586jxw, C33129mqd.EZpvd(strCopydefault), 0, c27586jxw.OLrzqt(c24227iZp.OLrzqt(), c24227iZp.AYXKKw()), null, null, null, 58, null));
            } else {
                strKWHzl = null;
            }
            java.lang.String str = strKWHzl;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c24227iZp.KWHzl())) {
                strKWHzl2 = C27488jwD.copydefault.KWHzl(C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(c24227iZp.KWHzl()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null));
            } else {
                strKWHzl2 = "--";
            }
            java.lang.String str2 = strKWHzl2;
            if (i2 > 0) {
                list.add(EZpvd(context, i));
            }
            iZS izs = new iZS(context, null, 0, 6, null);
            izs.setTwoLineValueData(c24227iZp.djBIcL(), str2, c24227iZp.valueOf(), str, c24227iZp.EZpvd(), c24227iZp.AEQbTJ());
            list.add(izs);
            i2++;
        }
    }

    public static final void copydefault(@NotNull android.view.ViewGroup viewGroup, @NotNull java.util.List<? extends android.view.View> list) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(list, "");
        viewGroup.removeAllViews();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView((android.view.View) it.next());
        }
    }

    public static final android.view.View EZpvd(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View view = new android.view.View(context);
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, i));
        return view;
    }

    public static /* synthetic */ void addActionButton$default(android.content.Context context, C24236iZy c24236iZy, InterfaceC27287jsO interfaceC27287jsO, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function0 = null;
        }
        copydefault(context, c24236iZy, interfaceC27287jsO, list, function0);
    }

    public static final void copydefault(@NotNull android.content.Context context, @NotNull final C24236iZy c24236iZy, final InterfaceC27287jsO interfaceC27287jsO, @NotNull java.util.List<android.view.View> list, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c24236iZy, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c24236iZy.EZpvd())) {
            list.add(EZpvd(context, C55298xhM.dp2px$default(16.0f, null, 1, null)));
            android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C25493ixk.Activity.fdOvFl, (android.view.ViewGroup) null);
            C52794wYp c52794wYp = (C52794wYp) viewInflate.findViewById(C25493ixk.ActionBar.AEQbTJ);
            c52794wYp.setText(c24236iZy.EZpvd());
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.iZO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    iZM.EZpvd(c24236iZy, interfaceC27287jsO, function0, view);
                }
            });
            Intrinsics.copydefault(viewInflate);
            list.add(viewInflate);
        }
    }

    public static final void EZpvd(C24236iZy c24236iZy, InterfaceC27287jsO interfaceC27287jsO, Function0 function0, android.view.View view) {
        java.lang.String strDjBIcL = c24236iZy.djBIcL();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strDjBIcL) && interfaceC27287jsO != null) {
            if (function0 != null) {
                function0.invoke();
            }
            Intrinsics.copydefault((java.lang.Object) strDjBIcL);
            interfaceC27287jsO.OLrzqt(new InterfaceC27286jsN.TaskDescription(strDjBIcL));
            return;
        }
        Function0<Unit> function0AYXKKw = c24236iZy.AYXKKw();
        if (function0AYXKKw != null) {
            function0AYXKKw.invoke();
        }
    }

    public static final android.view.View EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View view = new android.view.View(context);
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, C55298xhM.dp2px$default(0.5f, null, 1, null)));
        view.setBackgroundColor(context.getColor(C52761wXj.Activity.zuBGHE));
        return view;
    }

    public static /* synthetic */ iZH calculateExpandState$default(C24236iZy c24236iZy, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return EZpvd(c24236iZy, z, z2);
    }

    public static final iZH EZpvd(@NotNull C24236iZy c24236iZy, boolean z, boolean z2) {
        java.lang.Long lGEmmrt;
        Intrinsics.checkNotNullParameter(c24236iZy, "");
        boolean zKWHzl = z2 ? KWHzl(c24236iZy) : false;
        boolean z3 = c24236iZy.gEmmrt() == null || ((lGEmmrt = c24236iZy.gEmmrt()) != null && lGEmmrt.longValue() == 0);
        if (zKWHzl) {
            return new iZH(false, true, false);
        }
        if (z) {
            if (z3) {
                return new iZH(true, true, true);
            }
            return new iZH(false, true, false);
        }
        if (z3) {
            return new iZH(false, false, true);
        }
        return new iZH(false, true, false);
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ iZH AEQbTJ;
        public final /* synthetic */ Function0 AYXKKw;
        public final /* synthetic */ boolean AhwBna;
        public final /* synthetic */ C24236iZy AkhnZx;
        public final /* synthetic */ android.view.View DbNXlk;
        public final /* synthetic */ java.util.Map EZpvd;
        public final /* synthetic */ android.view.ViewGroup KWHzl;
        public final /* synthetic */ InterfaceC27287jsO OLrzqt;
        public final /* synthetic */ android.widget.ImageView copydefault;
        public final /* synthetic */ Function1 djBIcL;
        public final /* synthetic */ boolean gEmmrt;
        public final /* synthetic */ Function0 valueOf;
        public final /* synthetic */ long values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, boolean z, boolean z2, InterfaceC27287jsO interfaceC27287jsO, C24236iZy c24236iZy, Function0 function0, iZH izh, Function0 function02, Function1 function1, android.widget.ImageView imageView, android.view.ViewGroup viewGroup, java.util.Map map) {
            this.DbNXlk = view;
            this.values = j;
            this.AhwBna = z;
            this.gEmmrt = z2;
            this.OLrzqt = interfaceC27287jsO;
            this.AkhnZx = c24236iZy;
            this.AYXKKw = function0;
            this.AEQbTJ = izh;
            this.valueOf = function02;
            this.djBIcL = function1;
            this.copydefault = imageView;
            this.KWHzl = viewGroup;
            this.EZpvd = map;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            InterfaceC27287jsO interfaceC27287jsO;
            InterfaceC27287jsO interfaceC27287jsO2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.DbNXlk) > this.values || (this.DbNXlk instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.DbNXlk, jCurrentTimeMillis);
                if (!this.AhwBna) {
                    if (this.AEQbTJ.KWHzl()) {
                        boolean z = !((java.lang.Boolean) this.valueOf.invoke()).booleanValue();
                        this.djBIcL.invoke(java.lang.Boolean.valueOf(z));
                        iZM.copydefault(this.copydefault, this.AEQbTJ, z);
                        iZJ.OLrzqt.EZpvd(this.KWHzl, z, this.EZpvd);
                        return;
                    }
                    if (this.AkhnZx.gEmmrt() != null && (interfaceC27287jsO = this.OLrzqt) != null) {
                        interfaceC27287jsO.OLrzqt(new InterfaceC27286jsN.ActionBar(this.AkhnZx.gEmmrt().longValue(), null, null, null, null, 30, null));
                    }
                    Function0 function0 = this.AYXKKw;
                    if (function0 != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                if (!this.gEmmrt) {
                    if (this.AkhnZx.gEmmrt() != null && (interfaceC27287jsO2 = this.OLrzqt) != null) {
                        interfaceC27287jsO2.OLrzqt(new InterfaceC27286jsN.ActionBar(this.AkhnZx.gEmmrt().longValue(), null, null, null, null, 30, null));
                    }
                    Function0 function02 = this.AYXKKw;
                    if (function02 != null) {
                        function02.invoke();
                        return;
                    }
                    return;
                }
                InterfaceC27287jsO interfaceC27287jsO3 = this.OLrzqt;
                if (interfaceC27287jsO3 != null) {
                    java.lang.String strDjBIcL = this.AkhnZx.djBIcL();
                    if (strDjBIcL == null) {
                        strDjBIcL = "";
                    }
                    interfaceC27287jsO3.OLrzqt(new InterfaceC27286jsN.TaskDescription(strDjBIcL));
                }
                Function0 function03 = this.AYXKKw;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        }
    }

    public static final boolean KWHzl(@NotNull C24236iZy c24236iZy) {
        Intrinsics.checkNotNullParameter(c24236iZy, "");
        return c24236iZy.isConnected() == ProductType.Borrow;
    }

    public static final void copydefault(@NotNull android.widget.ImageView imageView, @NotNull iZH izh, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(izh, "");
        if (izh.copydefault()) {
            if (izh.KWHzl()) {
                imageView.setImageResource(z ? C52761wXj.TaskDescription.DGGHxk : C52761wXj.TaskDescription.DwQSDd);
            } else {
                imageView.setImageResource(C52761wXj.TaskDescription.DzkRMH);
            }
        }
    }

    public static final void AEQbTJ(@NotNull android.view.View view, @NotNull iZH izh, @NotNull Function0<java.lang.Boolean> function0, @NotNull C24236iZy c24236iZy, @NotNull android.widget.ImageView imageView, @NotNull android.view.ViewGroup viewGroup, InterfaceC27287jsO interfaceC27287jsO, Function0<Unit> function02, @NotNull java.util.Map<android.view.View, android.animation.ValueAnimator> map, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        java.lang.Long lGEmmrt;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(izh, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(c24236iZy, "");
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        view.setOnClickListener(new TaskDescription(view, 1000L, KWHzl(c24236iZy), c24236iZy.gEmmrt() == null || ((lGEmmrt = c24236iZy.gEmmrt()) != null && lGEmmrt.longValue() == 0), interfaceC27287jsO, c24236iZy, function02, izh, function0, function1, imageView, viewGroup, map));
    }

    public static final java.lang.String OLrzqt(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i == 1 && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return C27488jwD.copydefault.KWHzl(C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(str), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : DisplaySign.EXCEPT_ZERO, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null));
        }
        return null;
    }

    public static final java.lang.String copydefault(@NotNull android.content.Context context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!z2) {
            java.lang.String string = context.getString(C25493ixk.FragmentManager.aJFbMH);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (z) {
            java.lang.String string2 = context.getString(C25493ixk.FragmentManager.akftKQ);
            Intrinsics.copydefault((java.lang.Object) string2);
            return string2;
        }
        java.lang.String string3 = context.getString(C25493ixk.FragmentManager.alsFma);
        Intrinsics.copydefault((java.lang.Object) string3);
        return string3;
    }

    public static /* synthetic */ C24227iZp toAssetItem$default(InvestBaseDefiTokenInfo investBaseDefiTokenInfo, long j, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return AEQbTJ(investBaseDefiTokenInfo, j, z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public static final C24227iZp AEQbTJ(@NotNull InvestBaseDefiTokenInfo investBaseDefiTokenInfo, long j, boolean z, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(investBaseDefiTokenInfo, "");
        java.lang.String tokenSymbol = investBaseDefiTokenInfo.getTokenSymbol();
        java.lang.String str3 = tokenSymbol == null ? "" : tokenSymbol;
        java.lang.String currencyAmount = investBaseDefiTokenInfo.getCurrencyAmount();
        return new C24227iZp(str3, currencyAmount == null ? "" : currencyAmount, z, investBaseDefiTokenInfo.getCoinAmount(), investBaseDefiTokenInfo.getTokenAddress(), java.lang.Long.valueOf(j), str, str2);
    }

    public static final C24224iZm AEQbTJ(@NotNull java.util.List<InvestUserRewardInfoByInvestment> list, @NotNull android.content.Context context, long j, boolean z) {
        java.util.Collection collectionAhwBna;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (list.isEmpty()) {
            return null;
        }
        java.lang.String string = context.getString(C25493ixk.FragmentManager.GQzpsZgQzpsZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) string).toString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment : list) {
            java.util.List<InvestUserRewardElementInfo> baseDefiTokenInfos = investUserRewardInfoByInvestment.getBaseDefiTokenInfos();
            if (baseDefiTokenInfos == null) {
                collectionAhwBna = yDY.AhwBna();
            } else {
                collectionAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(baseDefiTokenInfos, 10));
                for (InvestUserRewardElementInfo investUserRewardElementInfo : baseDefiTokenInfos) {
                    java.lang.String tokenSymbol = investUserRewardElementInfo.getTokenSymbol();
                    java.lang.String str = tokenSymbol == null ? "" : tokenSymbol;
                    java.lang.String currencyAmount = investUserRewardElementInfo.getCurrencyAmount();
                    java.lang.String str2 = currencyAmount == null ? "" : currencyAmount;
                    java.lang.String coinAmount = investUserRewardElementInfo.getCoinAmount();
                    java.lang.String tokenAddress = investUserRewardElementInfo.getTokenAddress();
                    java.lang.Long chainId = investUserRewardInfoByInvestment.getChainId();
                    collectionAhwBna.add(new C24227iZp(str, str2, z, coinAmount, tokenAddress, java.lang.Long.valueOf(chainId != null ? chainId.longValue() : j), null, null, 192, null));
                }
            }
            C56406yEe.KWHzl(arrayList, collectionAhwBna);
        }
        return new C24224iZm(string2, null, arrayList, 2, null);
    }

    public static final void AEQbTJ(@NotNull android.view.ViewGroup viewGroup, boolean z, @NotNull iZH izh) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(izh, "");
        viewGroup.setVisibility(z ? 0 : 8);
        viewGroup.getLayoutParams().height = z ? -2 : 0;
    }
}
