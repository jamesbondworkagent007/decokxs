package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vZY extends AbstractC59533zio<SignalMultiCoinPairSelectItemData, Activity> {
    public final Function1<SignalMultiCoinPairSelectItemData, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public vZY(@NotNull Function1<? super SignalMultiCoinPairSelectItemData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ vZY EZpvd;
        public final uSR OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uSR KWHzl() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull vZY vzy, uSR usr) {
            super(usr.getRoot());
            Intrinsics.checkNotNullParameter(usr, "");
            this.EZpvd = vzy;
            this.OLrzqt = usr;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uSR usrCopydefault = uSR.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(usrCopydefault, "");
        return new Activity(this, usrCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull final SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemData) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(signalMultiCoinPairSelectItemData, "");
        C52834waB root = activity.KWHzl().getRoot();
        root.setTitle(signalMultiCoinPairSelectItemData.KWHzl());
        root.setTitleIcon(signalMultiCoinPairSelectItemData.AEQbTJ());
        root.setRightClickEnable(signalMultiCoinPairSelectItemData.gEmmrt());
        root.setRightIconCheck(signalMultiCoinPairSelectItemData.valueOf());
        C52834waB.setRightIconClick$default(root, false, new Function1() { // from class: o.waa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vZY.copydefault(this.KWHzl, signalMultiCoinPairSelectItemData, ((java.lang.Boolean) obj).booleanValue());
            }
        }, 1, null);
    }

    public static final Unit copydefault(vZY vzy, SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemData, boolean z) {
        vzy.AEQbTJ.invoke(signalMultiCoinPairSelectItemData);
        return Unit.INSTANCE;
    }
}
