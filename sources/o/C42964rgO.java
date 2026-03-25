package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.market_widget.ScrollSpeedLinearLayoutManger;
import com.okinc.widget.data.TradeItemBean;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C42964rgO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42964rgO extends android.widget.FrameLayout {
    public java.util.ArrayList<TradeItemBean> AEQbTJ;
    public boolean EZpvd;
    public int KWHzl;
    public Activity OLrzqt;
    public RecyclerView copydefault;
    public Function1<? super java.lang.String, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickItemListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.valueOf = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42964rgO(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42964rgO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42964rgO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new java.util.ArrayList<>();
        this.KWHzl = -1;
        EZpvd();
    }

    public final void EZpvd() {
        this.copydefault = new RecyclerView(getContext());
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            RecyclerView recyclerView = this.copydefault;
            if (recyclerView != null) {
                recyclerView.setPadding(0, 0, (int) C55298xhM.dp$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0);
            }
        } else {
            RecyclerView recyclerView2 = this.copydefault;
            if (recyclerView2 != null) {
                recyclerView2.setPadding((int) C55298xhM.dp$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0, 0);
            }
        }
        RecyclerView recyclerView3 = this.copydefault;
        if (recyclerView3 != null) {
            recyclerView3.setClipToPadding(false);
        }
        RecyclerView recyclerView4 = this.copydefault;
        if (recyclerView4 != null) {
            recyclerView4.setNestedScrollingEnabled(false);
        }
        addView(this.copydefault, new FrameLayout.LayoutParams(-1, -2, 16));
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        ScrollSpeedLinearLayoutManger scrollSpeedLinearLayoutManger = new ScrollSpeedLinearLayoutManger(context2);
        scrollSpeedLinearLayoutManger.setOrientation(0);
        RecyclerView recyclerView5 = this.copydefault;
        if (recyclerView5 != null) {
            recyclerView5.setLayoutManager(scrollSpeedLinearLayoutManger);
        }
        Activity activity = new Activity();
        this.OLrzqt = activity;
        RecyclerView recyclerView6 = this.copydefault;
        if (recyclerView6 != null) {
            recyclerView6.setAdapter(activity);
        }
    }

    public static /* synthetic */ void setItems$default(C42964rgO c42964rgO, java.util.ArrayList arrayList, int i, java.lang.Boolean bool, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        c42964rgO.setItems(arrayList, i, bool);
    }

    public final void setItems(java.util.ArrayList<java.lang.String> arrayList, int i, java.lang.Boolean bool) {
        this.EZpvd = bool != null ? bool.booleanValue() : false;
        this.AEQbTJ.clear();
        int i2 = i == -1 ? 0 : i;
        if (arrayList != null) {
            int i3 = 0;
            for (java.lang.Object obj : arrayList) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str = (java.lang.String) obj;
                if (bool != null && bool.booleanValue()) {
                    this.AEQbTJ.add(new TradeItemBean(pTA.formatDate$default(new Date(C33129mqd.copydefault(C56521yIl.copydefault, (java.lang.Object) str)), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null), i3 == i2, false, str, false, 20, null));
                } else {
                    this.AEQbTJ.add(new TradeItemBean(str, i3 == i2, false, null, false, 28, null));
                }
                i3++;
            }
        }
        this.KWHzl = i2;
        Activity activity = this.OLrzqt;
        if (activity != null) {
            activity.notifyDataSetChanged();
        }
        if (i != -1) {
            try {
                RecyclerView recyclerView = this.copydefault;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(i);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: o.rgO$Activity */
    public final class Activity extends RecyclerView.Adapter<Application> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
            appCompatTextView.setBackgroundResource(C32113mPz.TaskDescription.fARcdN);
            android.content.Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iAEQbTJ = (int) C55298xhM.AEQbTJ(5, context);
            android.content.Context context2 = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iAEQbTJ2 = (int) C55298xhM.AEQbTJ(8, context2);
            appCompatTextView.setPadding(iAEQbTJ2, iAEQbTJ, iAEQbTJ2, iAEQbTJ);
            appCompatTextView.setTextColor(ContextCompat.getColorStateList(appCompatTextView.getContext(), C32113mPz.ActionBar.QUSxYX));
            appCompatTextView.setTextAppearance(C32113mPz.Dialog.DbNXlk);
            appCompatTextView.setGravity(17);
            return new Application(appCompatTextView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return C42964rgO.this.AEQbTJ.size();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Application application, final int i) {
            int iEZpvd;
            Intrinsics.checkNotNullParameter(application, "");
            application.copydefault().setText(((TradeItemBean) C42964rgO.this.AEQbTJ.get(i)).getTitle());
            application.copydefault().setSelected(((TradeItemBean) C42964rgO.this.AEQbTJ.get(i)).isSelect());
            application.copydefault().setTextColor(C33070mpX.copydefault(application.copydefault().isSelected() ? C32113mPz.ActionBar.zLjUOn : C32113mPz.ActionBar.iwGUEr));
            android.view.View view = application.itemView;
            final C42964rgO c42964rgO = C42964rgO.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.rgQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C42964rgO.Activity.copydefault(c42964rgO, i, this, view2);
                }
            });
            ViewGroup.LayoutParams layoutParams = application.copydefault().getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                if (i == yDY.AuCTel(C42964rgO.this.AEQbTJ)) {
                    android.content.Context context = application.copydefault().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iEZpvd = C33052mpF.EZpvd(16.0f, context);
                } else {
                    iEZpvd = 0;
                }
                layoutParams2.rightMargin = iEZpvd;
            }
        }

        public static final void copydefault(C42964rgO c42964rgO, int i, Activity activity, android.view.View view) {
            RecyclerView recyclerView;
            int size = c42964rgO.AEQbTJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((TradeItemBean) c42964rgO.AEQbTJ.get(i2)).setSelect(false);
            }
            ((TradeItemBean) c42964rgO.AEQbTJ.get(i)).setSelect(true);
            activity.notifyDataSetChanged();
            if (c42964rgO.EZpvd) {
                Function1 function1 = c42964rgO.valueOf;
                if (function1 != null) {
                    function1.invoke(((TradeItemBean) c42964rgO.AEQbTJ.get(i)).getData());
                }
            } else {
                Function1 function12 = c42964rgO.valueOf;
                if (function12 != null) {
                    function12.invoke(((TradeItemBean) c42964rgO.AEQbTJ.get(i)).getTitle());
                }
            }
            RecyclerView recyclerView2 = c42964rgO.copydefault;
            RecyclerView.LayoutManager layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            int iFindFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : 0;
            int iFindLastVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findLastVisibleItemPosition() : 0;
            if (i < iFindFirstVisibleItemPosition + 1) {
                RecyclerView recyclerView3 = c42964rgO.copydefault;
                if (recyclerView3 != null) {
                    recyclerView3.smoothScrollToPosition(java.lang.Math.max(i - 1, 0));
                    return;
                }
                return;
            }
            if (i <= iFindLastVisibleItemPosition - 1 || (recyclerView = c42964rgO.copydefault) == null) {
                return;
            }
            recyclerView.smoothScrollToPosition(java.lang.Math.min(i + 1, c42964rgO.AEQbTJ.size()));
        }
    }

    /* JADX INFO: renamed from: o.rgO$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final android.widget.TextView EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.widget.TextView textView) {
            super(textView);
            Intrinsics.checkNotNullParameter(textView, "");
            this.EZpvd = textView;
        }
    }
}
