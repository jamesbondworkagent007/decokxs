package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wOR extends AbstractC59533zio<com.okinc.tradingbot.impl.dto.Message, Application> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final java.util.List<java.lang.String> copydefault = yDY.gEmmrt("MODIFY_OPEN_CONDITION", "MODIFY_CLOSE_CONDITION");
    public final java.lang.String EZpvd;

    public wOR(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wOR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uSH ushEZpvd = uSH.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ushEZpvd, "");
        return new Application(this, ushEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull com.okinc.tradingbot.impl.dto.Message message) {
        int i;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(message, "");
        if (copydefault.contains(this.EZpvd) && Intrinsics.EZpvd((java.lang.Object) message.OLrzqt(), (java.lang.Object) TtmlNode.RUBY_BEFORE)) {
            i = C52761wXj.Activity.QwvEab;
        } else {
            i = Intrinsics.EZpvd((java.lang.Object) message.copydefault(), (java.lang.Object) TtmlNode.RUBY_BEFORE) ? C52761wXj.Activity.v : C52761wXj.Activity.fdOvFl;
        }
        uSH ushCopydefault = application.copydefault();
        C55258xgZ c55258xgZ = ushCopydefault.OLrzqt;
        c55258xgZ.setTextValue(message.AEQbTJ());
        boolean z = Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) "REDUCE_POSITION") && Intrinsics.EZpvd((java.lang.Object) message.OLrzqt(), (java.lang.Object) "reduceReturnedAmt");
        c55258xgZ.setHelperLabelType(z ? 1 : 2);
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, z, c55258xgZ));
        android.widget.TextView textView = ushCopydefault.EZpvd;
        textView.setText(C53418wlC.KWHzl(message.EZpvd()));
        textView.setTextColor(C33070mpX.copydefault(i));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ wOR AEQbTJ;
        public final uSH EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uSH copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull wOR wor, uSH ush) {
            super(ush.getRoot());
            Intrinsics.checkNotNullParameter(ush, "");
            this.AEQbTJ = wor;
            this.EZpvd = ush;
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C55258xgZ OLrzqt;
        public final /* synthetic */ boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, boolean z, C55258xgZ c55258xgZ) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = z;
            this.OLrzqt = c55258xgZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.copydefault) {
                    android.content.Context context = this.OLrzqt.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.pause);
                    viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.idLUrz);
                    viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.DLWbHP, new ActionBar(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }
}
