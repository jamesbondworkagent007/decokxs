package o;

import com.okinc.unify_trade.biz.HomeStrategyCardInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC51545voz;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51514voU extends AbstractC51545voz {
    public C51514voU(boolean z, Function2<? super HomeStrategyCardInfo, ? super java.lang.Integer, Unit> function2) {
        super(z, function2, null, null, null, 28, null);
    }

    /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NotNull AbstractC51545voz.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        super.onViewDetachedFromWindow(actionBar);
        if (actionBar.uzCIH().isAnimating()) {
            actionBar.uzCIH().clearAnimation();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.apHBvG, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Activity(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC51545voz.ActionBar actionBar, @NotNull HomeStrategyCardInfo homeStrategyCardInfo) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(homeStrategyCardInfo, "");
        KWHzl(actionBar, homeStrategyCardInfo);
        android.widget.TextView textViewDbNXlk = actionBar.DbNXlk();
        java.lang.String username = homeStrategyCardInfo.getUsername();
        if (username == null) {
            username = "";
        }
        java.lang.String strKWHzl = C55945xtX.OLrzqt.KWHzl();
        textViewDbNXlk.setText(KWHzl(username, strKWHzl != null ? strKWHzl : ""));
    }

    public final java.lang.CharSequence KWHzl(java.lang.String str, java.lang.String str2) {
        return C33061mpO.KWHzl(str, str2, new Function1() { // from class: o.voX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51514voU.AEQbTJ((java.util.List) obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.BackgroundColorSpan(C33070mpX.copydefault(C48033uCm.StateListAnimator.isConnected)));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dSJNDS)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.voU$Activity */
    public static final class Activity extends AbstractC51545voz.ActionBar {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }
    }
}
