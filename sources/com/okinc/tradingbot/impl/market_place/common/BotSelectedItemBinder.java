package com.okinc.tradingbot.impl.market_place.common;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.tradingbot.impl.market_place.common.BotSelectedItemBinder;
import com.okinc.unify_trade.biz.CategoryTag;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.bot.data.BotSelectedData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC50845vbo;
import o.AbstractC59533zio;
import o.C32866mlf;
import o.C33061mpO;
import o.C33070mpX;
import o.C33129mqd;
import o.C51359vlY;
import o.C52563wQa;
import o.C52761wXj;
import o.C55251xgS;
import o.C55688xof;
import o.C56403yEb;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotSelectedItemBinder extends AbstractC59533zio<BotSelectedData, C51359vlY> {
    public final Function1<String, Unit> OLrzqt;
    public BotSelectedData copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public BotSelectedItemBinder(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C51359vlY onCreateViewHolder(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC50845vbo abstractC50845vboOLrzqt = AbstractC50845vbo.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC50845vboOLrzqt, "");
        return new C51359vlY(abstractC50845vboOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51359vlY c51359vlY, @NotNull final BotSelectedData botSelectedData) {
        Intrinsics.checkNotNullParameter(c51359vlY, "");
        Intrinsics.checkNotNullParameter(botSelectedData, "");
        boolean zEZpvd = Intrinsics.EZpvd(botSelectedData.isCopyTradeRole(), Boolean.FALSE);
        float f = zEZpvd ? 1.0f : 0.5f;
        AbstractC50845vbo abstractC50845vboEZpvd = c51359vlY.EZpvd();
        abstractC50845vboEZpvd.OLrzqt.setBackgroundResource(botSelectedData.getBotIconRes());
        abstractC50845vboEZpvd.OLrzqt.setAlpha(f);
        abstractC50845vboEZpvd.copydefault.setText(botSelectedData.getBotName());
        abstractC50845vboEZpvd.copydefault.setAlpha(f);
        if (botSelectedData.isDescSeparator()) {
            abstractC50845vboEZpvd.EZpvd.setText(C33061mpO.setupSpanStyles$default(botSelectedData.getBotDesc(), new String[]{"  /  "}, 0, MatchPattern.CONTAINS, false, new Function1() { // from class: o.vlX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotSelectedItemBinder.AEQbTJ((java.util.List) obj);
                }
            }, 10, null));
            abstractC50845vboEZpvd.EZpvd.setAlpha(f);
        } else {
            abstractC50845vboEZpvd.EZpvd.setText(botSelectedData.getBotDesc());
        }
        if (botSelectedData.getBotDescColor() > 0) {
            abstractC50845vboEZpvd.EZpvd.setTextColor(C33070mpX.copydefault(botSelectedData.getBotDescColor()));
        }
        AppCompatTextView appCompatTextView = abstractC50845vboEZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(zEZpvd ^ true ? 0 : 8);
        abstractC50845vboEZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickVisualMediaImageAndVideo));
        abstractC50845vboEZpvd.AYXKKw.setAlpha(f);
        abstractC50845vboEZpvd.djBIcL.setAlpha(f);
        AppCompatTextView appCompatTextView2 = abstractC50845vboEZpvd.djBIcL;
        xMR xmr = xMR.copydefault;
        String botUserCount = botSelectedData.getBotUserCount();
        if (botUserCount == null) {
            botUserCount = "";
        }
        appCompatTextView2.setText(xmr.copydefault(botUserCount));
        Group group = abstractC50845vboEZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(C33129mqd.AEQbTJ(botSelectedData.getBotUserCount(), 0) ? 0 : 8);
        abstractC50845vboEZpvd.KWHzl.removeAllViews();
        Context context = c51359vlY.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        List<View> listAEQbTJ = AEQbTJ(context, botSelectedData.getTags());
        if (listAEQbTJ != null) {
            Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                abstractC50845vboEZpvd.KWHzl.addView((View) it.next());
            }
        }
        View view = c51359vlY.itemView;
        Intrinsics.copydefault(view, "");
        Boolean boolIsSelected = botSelectedData.isSelected();
        Boolean bool = Boolean.TRUE;
        ((ConstraintLayout) view).setSelected(Intrinsics.EZpvd(boolIsSelected, bool));
        View view2 = c51359vlY.itemView;
        Intrinsics.copydefault(view2, "");
        ((ConstraintLayout) view2).setEnabled(zEZpvd);
        if (Intrinsics.EZpvd(botSelectedData.isSelected(), bool)) {
            this.copydefault = botSelectedData;
        }
        c51359vlY.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.vlV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view3) {
                BotSelectedItemBinder.OLrzqt(this.copydefault, botSelectedData, view3);
            }
        });
    }

    public static final Unit AEQbTJ(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.GiPPlLgiPPlL)));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(BotSelectedItemBinder botSelectedItemBinder, BotSelectedData botSelectedData, View view) {
        BotSelectedData botSelectedData2 = botSelectedItemBinder.copydefault;
        if (botSelectedData2 != null) {
            botSelectedData2.setSelected(Boolean.FALSE);
        }
        botSelectedData.setSelected(Boolean.TRUE);
        botSelectedItemBinder.OLrzqt.invoke(botSelectedData.getBotType());
        botSelectedItemBinder.copydefault(botSelectedData.getBotType());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BotTagType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ BotTagType[] $VALUES;
        private final String type;
        public static final BotTagType NORMAL = new BotTagType("NORMAL", 0, "normal");
        public static final BotTagType LOSS_INSURANCE = new BotTagType("LOSS_INSURANCE", 1, "loss_insurance");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ BotTagType[] $values() {
            return new BotTagType[]{NORMAL, LOSS_INSURANCE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<BotTagType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        private BotTagType(String str, int i, String str2) {
            this.type = str2;
        }

        static {
            BotTagType[] botTagTypeArr$values = $values();
            $VALUES = botTagTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(botTagTypeArr$values);
        }

        public static BotTagType valueOf(String str) {
            return (BotTagType) Enum.valueOf(BotTagType.class, str);
        }

        public static BotTagType[] values() {
            return (BotTagType[]) $VALUES.clone();
        }
    }

    public final void copydefault(String str) {
        C32866mlf.onEvent$default("BotPlaceOrder_Sheet_BotList_Click", "bot_type", str, null, null, null, 28, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x007d */
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.widget.TextView, o.xgS] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [o.wQa] */
    public final List<View> AEQbTJ(Context context, List<CategoryTag> list) {
        ?? c55251xgS;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (CategoryTag categoryTag : list) {
            if (Intrinsics.EZpvd((Object) categoryTag.getType(), (Object) BotTagType.LOSS_INSURANCE.getType())) {
                c55251xgS = new C52563wQa(context, null, 0, 6, null);
                c55251xgS.setData(new LossInsuranceDisplayData(categoryTag.getVoucherValue(), "issued", null, null, null, false, null, null, null, null, null, false, null, 8156, null));
            } else {
                c55251xgS = new C55251xgS(context, null, 0, 6, null);
                c55251xgS.setOKDSStyle(7);
                c55251xgS.setOKDSSize(-5);
                c55251xgS.setText(categoryTag.getName());
            }
            arrayList.add(c55251xgS);
        }
        return arrayList;
    }
}
