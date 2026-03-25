package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ptI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39485ptI extends AbstractC59533zio<MarketTypeSelect, Activity> {
    public final android.content.Context AEQbTJ;
    public final Function1<MarketTypeSelect, Unit> KWHzl;
    public final Function1<MarketTypeSelect, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.kline.ui.view.model.MarketTypeSelect, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.kline.ui.view.model.MarketTypeSelect, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39485ptI(@NotNull android.content.Context context, @NotNull Function1<? super MarketTypeSelect, Unit> function1, @NotNull Function1<? super MarketTypeSelect, Unit> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ = context;
        this.KWHzl = function1;
        this.copydefault = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.Dmq, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new Activity(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull final MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        android.widget.TextView textViewOLrzqt = activity.OLrzqt();
        if (textViewOLrzqt != null) {
            textViewOLrzqt.setSelected(marketTypeSelect.isSelect());
        }
        android.widget.TextView textViewOLrzqt2 = activity.OLrzqt();
        if (textViewOLrzqt2 != null) {
            textViewOLrzqt2.setText(OLrzqt(marketTypeSelect.getSelectTypeName(), marketTypeSelect.isSelect()));
        }
        activity.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.ptJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39485ptI.copydefault(this.EZpvd, marketTypeSelect, view);
            }
        });
    }

    public static final void copydefault(C39485ptI c39485ptI, MarketTypeSelect marketTypeSelect, android.view.View view) {
        Function1<MarketTypeSelect, Unit> function1 = c39485ptI.KWHzl;
        if (function1 != null) {
            function1.invoke(marketTypeSelect);
        }
        Function1<MarketTypeSelect, Unit> function12 = c39485ptI.copydefault;
        if (function12 != null) {
            function12.invoke(marketTypeSelect);
        }
    }

    private final java.lang.CharSequence OLrzqt(java.lang.String str, boolean z) {
        if (z) {
            return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.ptH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39485ptI.OLrzqt(this.AEQbTJ, (java.util.List) obj);
                }
            }, 14, null);
        }
        return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.ptM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39485ptI.EZpvd(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit OLrzqt(C39485ptI c39485ptI, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c39485ptI.AEQbTJ, C35964oKf.Dialog.copydefault));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C39485ptI c39485ptI, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c39485ptI.AEQbTJ, C35964oKf.Dialog.OLrzqt));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ptI$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.dTTfOR);
        }
    }
}
