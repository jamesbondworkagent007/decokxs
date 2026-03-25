package o;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C43035rhg;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qMW extends AbstractC40510qYn<C41646quj, C42803rdM> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42803rdM AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42803rdM c42803rdMEZpvd = C42803rdM.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42803rdMEZpvd, "");
        return c42803rdMEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42803rdM c42803rdM, int i, @NotNull C41646quj c41646quj) {
        Intrinsics.checkNotNullParameter(c42803rdM, "");
        Intrinsics.checkNotNullParameter(c41646quj, "");
        c42803rdM.KWHzl.setText(C33069mpW.copydefault(qZH.PendingIntent.RcvFxC, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, c41646quj.AEQbTJ()))));
        AppCompatTextView appCompatTextView = c42803rdM.KWHzl;
        android.graphics.drawable.Drawable drawable = ResourcesCompat.getDrawable(c42803rdM.getRoot().getContext().getResources(), C43035rhg.ActionBar.AEQbTJ, null);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(c42803rdM.getRoot().getContext(), C52761wXj.Activity.fdOvFl), PorterDuff.Mode.SRC_IN));
        } else {
            drawable = null;
        }
        android.graphics.drawable.Drawable drawable2 = ResourcesCompat.getDrawable(c42803rdM.getRoot().getContext().getResources(), C52761wXj.TaskDescription.DGUQLI, null);
        if (drawable2 != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(c42803rdM.getRoot().getContext(), C52761wXj.Activity.QwvEab), PorterDuff.Mode.SRC_IN));
            Unit unit = Unit.INSTANCE;
        } else {
            drawable2 = null;
        }
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, drawable2, (android.graphics.drawable.Drawable) null);
        AppCompatTextView root = c42803rdM.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, c42803rdM, c41646quj));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C42803rdM OLrzqt;
        public final /* synthetic */ C41646quj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42803rdM c42803rdM, C41646quj c41646quj) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c42803rdM;
            this.copydefault = c41646quj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                AppCompatTextView root = this.OLrzqt.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    android.content.Context context = this.OLrzqt.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    qplAEQbTJ.OLrzqt(context, this.copydefault.copydefault());
                }
            }
        }
    }
}
