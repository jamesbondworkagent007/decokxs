package o;

import android.view.View;
import androidx.core.os.BundleKt;
import com.okinc.unify_trade.bot.data.BotGuideLinkItem;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wJY extends AbstractC59533zio<BotGuideLinkItem, C52404wKd> {
    public final Function0<Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> OLrzqt() {
        return this.AEQbTJ;
    }

    public wJY(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C52404wKd onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.zzQwtT, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C52404wKd(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52404wKd c52404wKd, @NotNull BotGuideLinkItem botGuideLinkItem) {
        Intrinsics.checkNotNullParameter(c52404wKd, "");
        Intrinsics.checkNotNullParameter(botGuideLinkItem, "");
        c52404wKd.copydefault().setText(botGuideLinkItem.getTitle());
        android.widget.TextView textViewCopydefault = c52404wKd.copydefault();
        textViewCopydefault.setOnClickListener(new StateListAnimator(textViewCopydefault, 1000L, this, botGuideLinkItem));
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ wJY AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ BotGuideLinkItem copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, wJY wjy, BotGuideLinkItem botGuideLinkItem) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = wjy;
            this.copydefault = botGuideLinkItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.widget.TextView textView = (android.widget.TextView) this.OLrzqt;
                this.AEQbTJ.OLrzqt().invoke();
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(textView), BundleKt.bundleOf(C56390yDp.OLrzqt("url", this.copydefault.getLink())), null, 4, null);
            }
        }
    }
}
