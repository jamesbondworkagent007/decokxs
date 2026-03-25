package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.detail.binders.walletDetail.DefiWalletDetailWalletItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.eBX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eBU extends AbstractC14584doH<eBX.LoaderManager, C16761epy> {
    public final Function1<eBX.LoaderManager, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<eBX.LoaderManager, Unit> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.eBX$LoaderManager, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public eBU(@NotNull Function1<? super eBX.LoaderManager, Unit> function1) {
        super(DefiWalletDetailWalletItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16761epy c16761epy, @NotNull eBX.LoaderManager loaderManager) {
        Intrinsics.checkNotNullParameter(c16761epy, "");
        Intrinsics.checkNotNullParameter(loaderManager, "");
        c16761epy.valueOf.setText(loaderManager.OLrzqt());
        android.widget.ImageView imageView = c16761epy.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C14725dqq.copydefault(imageView, loaderManager.copydefault(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.eCa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eBU.OLrzqt((C5335Nt) obj);
            }
        }, 32.0f);
        c16761epy.AhwBna.setText(C13821dZn.EZpvd.OLrzqt(C54880xYt.formatValuationFromAsset$default(loaderManager.EZpvd(), null, false, C14455dll.KWHzl.copydefault(loaderManager.EZpvd()), false, 11, null)));
        C55251xgS c55251xgS = c16761epy.AYXKKw;
        loaderManager.valueOf();
        c55251xgS.setVisibility(8);
        C17927fXl.KWHzl.OLrzqt(loaderManager.AEQbTJ(), c16761epy.AEQbTJ, false, c16761epy.valueOf);
        ConstraintLayout constraintLayout = c16761epy.OLrzqt;
        constraintLayout.setOnClickListener(new ActionBar(constraintLayout, 1000L, this, loaderManager, c16761epy));
    }

    public static final Unit OLrzqt(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C16761epy EZpvd;
        public final /* synthetic */ eBU KWHzl;
        public final /* synthetic */ eBX.LoaderManager OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, eBU ebu, eBX.LoaderManager loaderManager, C16761epy c16761epy) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = ebu;
            this.OLrzqt = loaderManager;
            this.EZpvd = c16761epy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.AEQbTJ;
                this.KWHzl.AEQbTJ().invoke(this.OLrzqt);
                C13825dZr c13825dZr = C13825dZr.AEQbTJ;
                android.content.Context context = constraintLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ConstraintLayout constraintLayout2 = this.EZpvd.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                c13825dZr.KWHzl(context, constraintLayout2);
            }
        }
    }
}
