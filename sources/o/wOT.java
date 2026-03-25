package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wOT extends AbstractC59533zio<TransDetailsData, Application> {
    public final android.content.Context EZpvd;
    public final Function2<java.lang.String, java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public wOT(@NotNull android.content.Context context, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = context;
        this.KWHzl = function2;
    }

    public static final class Application extends RecyclerView.ViewHolder {
        public final C50816vbL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C50816vbL AEQbTJ() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C50816vbL c50816vbL) {
            super(c50816vbL.getRoot());
            Intrinsics.checkNotNullParameter(c50816vbL, "");
            this.copydefault = c50816vbL;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C50816vbL c50816vbLEZpvd = C50816vbL.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c50816vbLEZpvd, "");
        return new Application(c50816vbLEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull TransDetailsData transDetailsData) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(transDetailsData, "");
        C50816vbL c50816vbLAEQbTJ = application.AEQbTJ();
        C55251xgS c55251xgS = c50816vbLAEQbTJ.copydefault;
        c55251xgS.setText(transDetailsData.getTradeType());
        c55251xgS.setOKDSStyle(transDetailsData.getTradeTypeTagStyle());
        C55251xgS c55251xgS2 = c50816vbLAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        c55251xgS2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) transDetailsData.getDealOrdType()) ? 0 : 8);
        c50816vbLAEQbTJ.AEQbTJ.setText(transDetailsData.getDealOrdType());
        android.widget.TextView textView = c50816vbLAEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) transDetailsData.getState()) ? 0 : 8);
        c50816vbLAEQbTJ.AYXKKw.setText(transDetailsData.getState());
        c50816vbLAEQbTJ.AYXKKw.setTextColor(transDetailsData.getStateColor());
        C52794wYp c52794wYp = c50816vbLAEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(transDetailsData.getStateClickable() ? 0 : 8);
        C52794wYp c52794wYp2 = c50816vbLAEQbTJ.EZpvd;
        c52794wYp2.setOnClickListener(new Dialog(c52794wYp2, 1000L, this, transDetailsData));
        android.widget.TextView textView2 = c50816vbLAEQbTJ.AYXKKw;
        textView2.setOnClickListener(new LoaderManager(textView2, 1000L, transDetailsData, this));
        c50816vbLAEQbTJ.KWHzl.setLayoutManager(C33047mpA.copydefault(this.EZpvd, 2));
        RecyclerView recyclerView = c50816vbLAEQbTJ.KWHzl;
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(TacticsInsideItemData.class, new C52518wOj(this.EZpvd, null, true, 0, true, null, null, null, 234, null));
        c59534zip.setItems(transDetailsData.getList());
        recyclerView.setAdapter(c59534zip);
        if (c50816vbLAEQbTJ.KWHzl.getItemDecorationCount() == 0) {
            c50816vbLAEQbTJ.KWHzl.addItemDecoration(new C57584ylF(2, C55298xhM.copydefault(8.0f, this.EZpvd), C55298xhM.copydefault(16.0f, this.EZpvd)));
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(wOT.this.EZpvd), BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C48033uCm.Fragment.WS))), null, 4, null);
            this.KWHzl.dismiss();
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(wOT.this.EZpvd), BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C48033uCm.Fragment.WS))), null, 4, null);
            this.OLrzqt.dismiss();
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ wOT OLrzqt;
        public final /* synthetic */ TransDetailsData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, wOT wot, TransDetailsData transDetailsData) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = wot;
            this.copydefault = transDetailsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function2 function2 = this.OLrzqt.KWHzl;
                java.lang.String algoId = this.copydefault.getAlgoId();
                if (algoId == null) {
                    algoId = "";
                }
                java.lang.String orderId = this.copydefault.getOrderId();
                function2.invoke(algoId, orderId != null ? orderId : "");
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ TransDetailsData AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ wOT KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, TransDetailsData transDetailsData, wOT wot) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = transDetailsData;
            this.KWHzl = wot;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ.getOrderTag(), (java.lang.Object) "orderRetry")) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.KWHzl.EZpvd);
                    viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.RdAHlO);
                    viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.hBpjJd);
                    viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new StateListAnimator(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.OLrzqt(C55688xof.Application.onScrollChanged, this.KWHzl.new Activity(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.show();
                    return;
                }
                if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ.getOrderTag(), (java.lang.Object) "orderFail")) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(this.KWHzl.EZpvd);
                    viewOnClickListenerC54939xaY2.setTitle(C55688xof.Application.QkdxfA);
                    viewOnClickListenerC54939xaY2.copydefault(C55688xof.Application.dHguZz);
                    viewOnClickListenerC54939xaY2.EZpvd(C55688xof.Application.onCreate, new TaskDescription(viewOnClickListenerC54939xaY2));
                    viewOnClickListenerC54939xaY2.OLrzqt(C55688xof.Application.onScrollChanged, this.KWHzl.new ActionBar(viewOnClickListenerC54939xaY2));
                    viewOnClickListenerC54939xaY2.show();
                }
            }
        }
    }
}
