package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.assets.utxo.explanation.InvestUtxoExplanationDialog$displayChainInfo$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bkV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C10227bkV extends AbstractC10226bkU {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public C16978euC AhwBna;

    /* JADX INFO: Access modifiers changed from: private */
    public final long valueOf() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getLong("key.chain_id");
        }
        throw new java.lang.IllegalStateException("Must provide chain id");
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16978euC c16978euCOLrzqt = C16978euC.OLrzqt(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, true);
        this.AhwBna = c16978euCOLrzqt;
        if (c16978euCOLrzqt != null) {
            wYC wyc = c16978euCOLrzqt.KWHzl;
            wyc.setOnClickListener(new StateListAnimator(wyc, 1000L, this));
            C52794wYp c52794wYp = c16978euCOLrzqt.copydefault;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        }
        EZpvd();
    }

    public final void EZpvd() {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUtxoExplanationDialog$displayChainInfo$1(this, null), 3, null);
        if (valueOf() != 0) {
            C16978euC c16978euC = this.AhwBna;
            if (c16978euC == null || (imageView = c16978euC.OLrzqt) == null) {
                return;
            }
            imageView.setImageResource(C13754dXa.Activity.DbNXlk);
            return;
        }
        C16978euC c16978euC2 = this.AhwBna;
        if (c16978euC2 == null || (imageView2 = c16978euC2.OLrzqt) == null) {
            return;
        }
        C10353bmp c10353bmp = C10353bmp.OLrzqt;
        android.content.Context context = imageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c10353bmp.copydefault(imageView2, C43454rpb.copydefault("images/web3_defi/btc_ecosystem.png", context, true), C52761wXj.TaskDescription.getUriFromString);
    }

    /* JADX INFO: renamed from: o.bkV$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bkV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C10227bkV KWHzl(long j) {
            C10227bkV c10227bkV = new C10227bkV();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("key.chain_id", j);
            c10227bkV.setArguments(bundle);
            return c10227bkV;
        }
    }

    /* JADX INFO: renamed from: o.bkV$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C10227bkV EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C10227bkV c10227bkV) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c10227bkV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.bkV$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C10227bkV AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C10227bkV c10227bkV) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c10227bkV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
