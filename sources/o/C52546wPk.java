package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import com.okinc.unify_trade.bot.data.TacticsRecInfoDetailItem;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52546wPk extends AbstractC59533zio<TacticsRecInfoDetailItem, C52547wPl> {
    public final android.content.Context EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context KWHzl() {
        return this.EZpvd;
    }

    public C52546wPk(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C52547wPl onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.DsfknC, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new C52547wPl((AbstractC50824vbT) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52547wPl c52547wPl, @NotNull TacticsRecInfoDetailItem tacticsRecInfoDetailItem) {
        java.util.ArrayList<TradeCoinInfo> arrayListOLrzqt;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(c52547wPl, "");
        Intrinsics.checkNotNullParameter(tacticsRecInfoDetailItem, "");
        java.lang.String str = tacticsRecInfoDetailItem.getCcy() + "-" + tacticsRecInfoDetailItem.getInvestCcy();
        java.lang.String str2 = (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(0);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String url = null;
        if (interfaceC54581xNrOLrzqt != null && (arrayListOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt()) != null) {
            java.util.Iterator<T> it = arrayListOLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((TradeCoinInfo) next).getSymbol(), (java.lang.Object) str2)) {
                        break;
                    }
                }
            }
            TradeCoinInfo tradeCoinInfo = (TradeCoinInfo) next;
            if (tradeCoinInfo != null) {
                url = tradeCoinInfo.getUrl();
            }
        }
        Glide.KWHzl(c52547wPl.OLrzqt().OLrzqt).EZpvd(url).EZpvd(c52547wPl.OLrzqt().OLrzqt);
        c52547wPl.OLrzqt().KWHzl.setText(tacticsRecInfoDetailItem.getCcy());
        c52547wPl.OLrzqt().EZpvd.setText(pTB.KWHzl(xMR.copydefault.OLrzqt((java.lang.Object) tacticsRecInfoDetailItem.getRatio()), 0, RoundingMode.DOWN));
        java.lang.String botPrice$default = tacticsRecInfoDetailItem.getPx().length() == 0 ? "--" : C56033xvF.getBotPrice$default(tacticsRecInfoDetailItem.getInstType(), str, tacticsRecInfoDetailItem.getPx(), false, false, null, null, 120, null);
        if (tacticsRecInfoDetailItem.isHistory()) {
            android.widget.TextView textView = c52547wPl.OLrzqt().AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
        } else {
            android.widget.TextView textView2 = c52547wPl.OLrzqt().AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            c52547wPl.OLrzqt().AhwBna.setText(botPrice$default);
        }
        android.widget.ImageView imageView = c52547wPl.OLrzqt().AEQbTJ;
        imageView.setOnClickListener(new Application(imageView, 1000L, str, this));
        c52547wPl.OLrzqt().gEmmrt.setLayoutManager(new LinearLayoutManager(this.EZpvd));
        c52547wPl.OLrzqt().gEmmrt.setNestedScrollingEnabled(false);
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(ItemData.class, new wNH(null, null, null, null, null, 31, null));
        c52547wPl.OLrzqt().gEmmrt.setAdapter(c59534zip);
        C33064mpR.OLrzqt(c59534zip, EZpvd(tacticsRecInfoDetailItem));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<ItemData> EZpvd(TacticsRecInfoDetailItem tacticsRecInfoDetailItem) {
        java.lang.String investCcy;
        java.lang.String instType;
        java.lang.String str;
        java.lang.String maxPx;
        java.lang.String str2;
        java.lang.String minPx;
        java.lang.String totalAmt;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String botAmount$default;
        java.lang.String profit;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String avgPx;
        java.lang.String avgPx2;
        java.lang.String profit2;
        java.lang.String totalAmt2;
        java.lang.String minPx2;
        java.lang.String maxPx2;
        java.lang.String minPx3;
        if (tacticsRecInfoDetailItem == null || (investCcy = tacticsRecInfoDetailItem.getTradeQuoteCcy()) == null) {
            investCcy = tacticsRecInfoDetailItem != null ? tacticsRecInfoDetailItem.getInvestCcy() : null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str7 = (tacticsRecInfoDetailItem != null ? tacticsRecInfoDetailItem.getCcy() : null) + "-" + (tacticsRecInfoDetailItem != null ? tacticsRecInfoDetailItem.getInvestCcy() : null);
        if (tacticsRecInfoDetailItem == null || (instType = tacticsRecInfoDetailItem.getInstType()) == null) {
            instType = "SPOT";
        }
        java.lang.String botPrice$default = C56033xvF.getBotPrice$default(instType, str7, (tacticsRecInfoDetailItem == null || (minPx3 = tacticsRecInfoDetailItem.getMinPx()) == null) ? "" : minPx3, false, false, null, null, 120, null);
        java.lang.String botPrice$default2 = C56033xvF.getBotPrice$default(instType, str7, (tacticsRecInfoDetailItem == null || (maxPx2 = tacticsRecInfoDetailItem.getMaxPx()) == null) ? "" : maxPx2, false, false, null, null, 120, null);
        java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(instType, str7);
        java.lang.String str8 = "--";
        if (tacticsRecInfoDetailItem != null && (minPx2 = tacticsRecInfoDetailItem.getMinPx()) != null && minPx2.length() > 0 && tacticsRecInfoDetailItem.getMaxPx().length() > 0) {
            str2 = botPrice$default + "-" + botPrice$default2 + " (" + strAEQbTJ + ")";
        } else if (tacticsRecInfoDetailItem != null && (minPx = tacticsRecInfoDetailItem.getMinPx()) != null && minPx.length() > 0) {
            str2 = ">" + botPrice$default + " (" + strAEQbTJ + ")";
        } else if (tacticsRecInfoDetailItem != null && (maxPx = tacticsRecInfoDetailItem.getMaxPx()) != null && maxPx.length() > 0) {
            str2 = "<" + botPrice$default2 + " (" + strAEQbTJ + ")";
        } else {
            str = "--";
            arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), str, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
            totalAmt = tacticsRecInfoDetailItem == null ? tacticsRecInfoDetailItem.getTotalAmt() : null;
            if (totalAmt != null || totalAmt.length() == 0) {
                str3 = " (";
                str4 = ")";
                botAmount$default = "--";
            } else {
                java.lang.String str9 = (tacticsRecInfoDetailItem == null || (totalAmt2 = tacticsRecInfoDetailItem.getTotalAmt()) == null) ? "" : totalAmt2;
                str3 = " (";
                str4 = ")";
                botAmount$default = C56033xvF.getBotAmount$default(instType, str7, str9, null, false, null, 56, null);
            }
            arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onTabReselected), botAmount$default, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
            profit = tacticsRecInfoDetailItem == null ? tacticsRecInfoDetailItem.getProfit() : null;
            if (profit != null || profit.length() == 0) {
                str5 = strAEQbTJ;
                str6 = "--";
            } else {
                str5 = strAEQbTJ;
                str6 = C56033xvF.getBotPnl$default("", instType, (tacticsRecInfoDetailItem == null || (profit2 = tacticsRecInfoDetailItem.getProfit()) == null) ? "" : profit2, investCcy == null ? "" : investCcy, false, false, null, false, null, null, null, 2032, null) + str3 + investCcy + str4;
            }
            arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncherresultContract2), str6, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
            avgPx = tacticsRecInfoDetailItem == null ? tacticsRecInfoDetailItem.getAvgPx() : null;
            if (avgPx != null && avgPx.length() != 0) {
                str8 = C56033xvF.getBotPrice$default(instType, str7, (tacticsRecInfoDetailItem != null || (avgPx2 = tacticsRecInfoDetailItem.getAvgPx()) == null) ? "" : avgPx2, false, false, null, null, 120, null) + str3 + str5 + str4;
            }
            arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.setBufferedPosition), str8, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
            return arrayList;
        }
        str = str2;
        arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), str, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
        if (tacticsRecInfoDetailItem == null) {
        }
        if (totalAmt != null) {
            str3 = " (";
            str4 = ")";
            botAmount$default = "--";
        }
        arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onTabReselected), botAmount$default, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
        if (tacticsRecInfoDetailItem == null) {
        }
        if (profit != null) {
            str5 = strAEQbTJ;
            str6 = "--";
        }
        arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncherresultContract2), str6, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
        if (tacticsRecInfoDetailItem == null) {
        }
        if (avgPx != null) {
            if (tacticsRecInfoDetailItem != null) {
                str8 = C56033xvF.getBotPrice$default(instType, str7, (tacticsRecInfoDetailItem != null || (avgPx2 = tacticsRecInfoDetailItem.getAvgPx()) == null) ? "" : avgPx2, false, false, null, null, 120, null) + str3 + str5 + str4;
            }
        }
        arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.setBufferedPosition), str8, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
        return arrayList;
    }

    /* JADX INFO: renamed from: o.wPk$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52546wPk copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, java.lang.String str, C52546wPk c52546wPk) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = str;
            this.copydefault = c52546wPk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                MarketCoinInfo marketCoinInfo = new MarketCoinInfo(this.AEQbTJ, "SPOT", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, this.copydefault.KWHzl(), marketCoinInfo, null, null, null, null, java.lang.Boolean.FALSE, null, null, null, null, 1980, null);
                }
            }
        }
    }
}
