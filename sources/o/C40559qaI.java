package o;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.framework.constant.TradeKey;
import kotlin.jvm.internal.Intrinsics;
import o.C43035rhg;
import o.C52761wXj;
import o.InterfaceC27809kEc;
import o.InterfaceC49497upf;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qaI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40559qaI extends AbstractC40510qYn<C41646quj, C42791rdA> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42791rdA AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42791rdA c42791rdAOLrzqt = C42791rdA.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42791rdAOLrzqt, "");
        return c42791rdAOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42791rdA c42791rdA, int i, @NotNull C41646quj c41646quj) {
        Intrinsics.checkNotNullParameter(c42791rdA, "");
        Intrinsics.checkNotNullParameter(c41646quj, "");
        c42791rdA.copydefault.setText(C33069mpW.copydefault(qZH.PendingIntent.RcvFxC, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, c41646quj.AEQbTJ()))));
        AppCompatTextView appCompatTextView = c42791rdA.copydefault;
        android.graphics.drawable.Drawable drawable = ResourcesCompat.getDrawable(c42791rdA.getRoot().getContext().getResources(), C43035rhg.ActionBar.AEQbTJ, null);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(c42791rdA.getRoot().getContext(), C52761wXj.Activity.fdOvFl), PorterDuff.Mode.SRC_IN));
        } else {
            drawable = null;
        }
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        AppCompatTextView root = c42791rdA.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, c42791rdA, c41646quj, i));
    }

    /* JADX INFO: renamed from: o.qaI$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C42791rdA AEQbTJ;
        public final /* synthetic */ C41646quj EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42791rdA c42791rdA, C41646quj c41646quj, int i) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c42791rdA;
            this.EZpvd = c41646quj;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
                android.content.Context context = this.AEQbTJ.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                InterfaceC49497upf.ActionBar.openAllOptionsWithInstFamily$default(interfaceC49497upf, context, TaskDescription.copydefault(this.EZpvd.copydefault()), null, 4, null);
                C46688tbr.KWHzl.KWHzl("Market_Options_Chain", C56423yEv.EZpvd(C56390yDp.OLrzqt("Market_Options_Chain", this.EZpvd.AEQbTJ())));
                AppCompatTextView root = this.AEQbTJ.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC27809kEc interfaceC27809kEcOLrzqt = C27811kEe.OLrzqt(root);
                if (interfaceC27809kEcOLrzqt != null) {
                    InterfaceC27809kEc.TaskDescription.trackTradingPairClick$default(interfaceC27809kEcOLrzqt, "options", TaskDescription.copydefault(this.EZpvd.copydefault()), this.OLrzqt, null, 8, null);
                }
            }
        }
    }
}
