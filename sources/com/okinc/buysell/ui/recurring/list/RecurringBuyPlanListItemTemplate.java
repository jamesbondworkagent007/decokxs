package com.okinc.buysell.ui.recurring.list;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.buysell.ui.recurring.list.RecurringBuyPlanListItemTemplate;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC31560lwN;
import o.AbstractC31591lwt;
import o.C31351lsQ;
import o.C31703mAu;
import o.C33054mpH;
import o.C33069mpW;
import o.C33070mpX;
import o.C3903Auj;
import o.C43312rms;
import o.C43316rmw;
import o.C43318rmy;
import o.C52761wXj;
import o.C56390yDp;
import o.C56424yEw;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class RecurringBuyPlanListItemTemplate extends C43318rmy<C3903Auj, AbstractC31591lwt> {
    public final Function1<C3903Auj, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.Auj, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringBuyPlanListItemTemplate(@NotNull Function1<? super C3903Auj, Unit> function1) {
        super(C31351lsQ.ActionBar.DXXBbs, 0);
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31591lwt> c43312rms, @NotNull final C3903Auj c3903Auj) {
        String strEZpvd;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c3903Auj, "");
        super.onBindViewHolder((C43312rms) c43312rms, c3903Auj);
        AbstractC31591lwt abstractC31591lwt = (AbstractC31591lwt) c43312rms.OLrzqt();
        if (abstractC31591lwt != null) {
            ImageView imageView = abstractC31591lwt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.loadUrl$default(imageView, c3903Auj.copydefault(), null, 0, 0, 14, null);
            TextView textView = abstractC31591lwt.AEQbTJ;
            Context context = abstractC31591lwt.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setText(C33069mpW.KWHzl(context, C31351lsQ.Activity.YFmri, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("fiatAmount", c3903Auj.OLrzqt()), C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, c3903Auj.AEQbTJ()))));
            abstractC31591lwt.copydefault.setText(c3903Auj.KWHzl());
            boolean z = c3903Auj.AhwBna() || c3903Auj.djBIcL();
            if (z || (strEZpvd = c3903Auj.EZpvd()) == null || strEZpvd.length() == 0) {
                TextView textView2 = abstractC31591lwt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            } else {
                TextView textView3 = abstractC31591lwt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(0);
                abstractC31591lwt.OLrzqt.setText(c3903Auj.EZpvd());
            }
            if (z) {
                RecyclerView recyclerView = abstractC31591lwt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                recyclerView.setVisibility(0);
                RecyclerView recyclerView2 = abstractC31591lwt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                KWHzl(recyclerView2);
                RecyclerView.Adapter adapter = abstractC31591lwt.KWHzl.getAdapter();
                C43316rmw c43316rmw = adapter instanceof C43316rmw ? (C43316rmw) adapter : null;
                if (c43316rmw != null) {
                    RecurringBuyPlanTag[] recurringBuyPlanTagArr = new RecurringBuyPlanTag[2];
                    RecurringBuyPlanTag recurringBuyPlanTag = RecurringBuyPlanTag.ACTION_REQUIRED;
                    if (!c3903Auj.AhwBna()) {
                        recurringBuyPlanTag = null;
                    }
                    recurringBuyPlanTagArr[0] = recurringBuyPlanTag;
                    recurringBuyPlanTagArr[1] = c3903Auj.djBIcL() ? RecurringBuyPlanTag.PAUSED : null;
                    c43316rmw.setItems(yDY.valueOf(recurringBuyPlanTagArr));
                    c43316rmw.notifyDataSetChanged();
                }
            } else {
                RecyclerView recyclerView3 = abstractC31591lwt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                recyclerView3.setVisibility(8);
            }
            abstractC31591lwt.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lRY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    RecurringBuyPlanListItemTemplate.AEQbTJ(this.EZpvd, c3903Auj, view);
                }
            });
        }
    }

    public static final void AEQbTJ(RecurringBuyPlanListItemTemplate recurringBuyPlanListItemTemplate, C3903Auj c3903Auj, View view) {
        recurringBuyPlanListItemTemplate.copydefault.invoke(c3903Auj);
    }

    public final void KWHzl(RecyclerView recyclerView) {
        if (recyclerView.getAdapter() != null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new C31703mAu(recyclerView.getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QOLQEE), 0));
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(RecurringBuyPlanTag.class, new StateListAnimator());
        recyclerView.setAdapter(c43316rmw);
    }

    public static final class StateListAnimator extends C43318rmy<RecurringBuyPlanTag, AbstractC31560lwN> {
        public StateListAnimator() {
            super(C31351lsQ.ActionBar.OuxcSI, 0);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC31560lwN> c43312rms, @NotNull RecurringBuyPlanTag recurringBuyPlanTag) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(recurringBuyPlanTag, "");
            super.onBindViewHolder((C43312rms) c43312rms, recurringBuyPlanTag);
            AbstractC31560lwN abstractC31560lwN = (AbstractC31560lwN) c43312rms.OLrzqt();
            if (abstractC31560lwN != null) {
                if (recurringBuyPlanTag == RecurringBuyPlanTag.ACTION_REQUIRED) {
                    abstractC31560lwN.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.QWpYiD));
                    abstractC31560lwN.KWHzl.setImageResource(C52761wXj.TaskDescription.shErWi);
                    abstractC31560lwN.KWHzl.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
                } else {
                    abstractC31560lwN.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.invokespecialRtjmuc));
                    abstractC31560lwN.KWHzl.setImageResource(C52761wXj.TaskDescription.OAhWiU);
                    abstractC31560lwN.KWHzl.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RecurringBuyPlanTag {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RecurringBuyPlanTag[] $VALUES;
        public static final RecurringBuyPlanTag ACTION_REQUIRED = new RecurringBuyPlanTag("ACTION_REQUIRED", 0);
        public static final RecurringBuyPlanTag PAUSED = new RecurringBuyPlanTag("PAUSED", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RecurringBuyPlanTag[] $values() {
            return new RecurringBuyPlanTag[]{ACTION_REQUIRED, PAUSED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RecurringBuyPlanTag> getEntries() {
            return $ENTRIES;
        }

        private RecurringBuyPlanTag(String str, int i) {
        }

        static {
            RecurringBuyPlanTag[] recurringBuyPlanTagArr$values = $values();
            $VALUES = recurringBuyPlanTagArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(recurringBuyPlanTagArr$values);
        }

        public static RecurringBuyPlanTag valueOf(String str) {
            return (RecurringBuyPlanTag) Enum.valueOf(RecurringBuyPlanTag.class, str);
        }

        public static RecurringBuyPlanTag[] values() {
            return (RecurringBuyPlanTag[]) $VALUES.clone();
        }
    }
}
