package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.data.BoundWallet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fAF;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fAF implements fDP {
    public final Function1<BoundWallet, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<BoundWallet, Unit> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.mine.data.BoundWallet, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fAF(@NotNull Function1<? super BoundWallet, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.zpGcln, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Activity(viewInflate);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ((Activity) viewHolder).AEQbTJ((BoundWallet) obj);
        android.view.View view = viewHolder.itemView;
        view.setOnClickListener(new Application(view, 1000L, this, obj));
    }

    public static final class Activity extends RecyclerView.ViewHolder {
        public final android.widget.TextView EZpvd;
        public final android.widget.TextView KWHzl;
        public final android.widget.ImageView OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.ejfBZ);
            this.EZpvd = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.uzCIH);
            this.KWHzl = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.fARcdN);
        }

        public final void AEQbTJ(@NotNull BoundWallet boundWallet) {
            Intrinsics.checkNotNullParameter(boundWallet, "");
            android.widget.ImageView imageView = this.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C14725dqq.copydefault(imageView, boundWallet.copydefault(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fAD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fAF.Activity.EZpvd((C5335Nt) obj);
                }
            }, 32.0f);
            this.EZpvd.setText(boundWallet.EZpvd());
            this.KWHzl.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) boundWallet.AEQbTJ()) ? 0 : 8);
            this.KWHzl.setText(boundWallet.AEQbTJ());
        }

        public static final Unit EZpvd(C5335Nt c5335Nt) {
            Intrinsics.checkNotNullParameter(c5335Nt, "");
            c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
            return Unit.INSTANCE;
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ java.lang.Object EZpvd;
        public final /* synthetic */ fAF OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, fAF faf, java.lang.Object obj) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = faf;
            this.EZpvd = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: kotlin.jvm.functions.Function1<com.okinc.business.defi.wallet.mine.data.BoundWallet, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.copydefault().invoke(this.EZpvd);
            }
        }
    }
}
