package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.tradingbot.impl.strategy.bean.SignalTypeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vmO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51402vmO extends AbstractC59533zio<SignalTypeData, C51405vmR> {
    public final Function1<java.lang.String, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51402vmO(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C51405vmR onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.OEgNct, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new C51405vmR((uVX) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51405vmR c51405vmR, @NotNull SignalTypeData signalTypeData) {
        Intrinsics.checkNotNullParameter(c51405vmR, "");
        Intrinsics.checkNotNullParameter(signalTypeData, "");
        android.view.View view = c51405vmR.itemView;
        view.setOnClickListener(new ActionBar(view, 1000L, this, signalTypeData));
        uVX uvxKWHzl = c51405vmR.KWHzl();
        uvxKWHzl.EZpvd.setText(signalTypeData.OLrzqt());
        uvxKWHzl.AEQbTJ.setText(signalTypeData.EZpvd());
        uvxKWHzl.copydefault.setImageResource(signalTypeData.AEQbTJ());
    }

    /* JADX INFO: renamed from: o.vmO$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ SignalTypeData EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C51402vmO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51402vmO c51402vmO, SignalTypeData signalTypeData) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c51402vmO;
            this.EZpvd = signalTypeData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.copydefault().invoke(this.EZpvd.KWHzl());
            }
        }
    }
}
