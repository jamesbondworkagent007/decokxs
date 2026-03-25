package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.features.smart_money.signal.ui.binder.SignalOverviewAddressItemBinder$1;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC29579kwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kvU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29534kvU extends AbstractC25436iwg<C29468kuH, C21597hFg> {
    public final Function0<Unit> AEQbTJ;
    public final InterfaceC29581kwO KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29534kvU(InterfaceC29581kwO interfaceC29581kwO, @NotNull Function0<Unit> function0) {
        super(SignalOverviewAddressItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = interfaceC29581kwO;
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[PHI: r2
  0x003d: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v14 java.lang.String) binds: [B:6:0x002c, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull C25435iwf<C21597hFg> c25435iwf, @NotNull C29468kuH c29468kuH) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c29468kuH, "");
        C21597hFg c21597hFg = (C21597hFg) c25435iwf.EZpvd();
        java.lang.String strOLrzqt = C25352ivB.OLrzqt(c29468kuH.values(), 4, 2, "..");
        java.lang.String strCopydefault = c29468kuH.copydefault();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
            strCopydefault = null;
        }
        if (strCopydefault == null) {
            strCopydefault = c29468kuH.djBIcL();
            if (c29468kuH.KWHzl() == null) {
                strCopydefault = null;
            }
            if (strCopydefault != null) {
                strOLrzqt = strCopydefault;
            }
        }
        android.widget.TextView textView = c21597hFg.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C31258lqd.copydefault(textView, strOLrzqt, c29468kuH.OLrzqt(), C52761wXj.Activity.fdOvFl);
        android.widget.ImageView imageView = c21597hFg.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C25386ivj.loadWalletProfileImage$default(imageView, c29468kuH.AEQbTJ(), c29468kuH.KWHzl(), c29468kuH.values(), 0.0f, 8, null);
        LinearLayoutCompat linearLayoutCompat = c21597hFg.copydefault;
        linearLayoutCompat.setOnClickListener(new StateListAnimator(linearLayoutCompat, 1000L, this, c29468kuH));
        android.widget.TextView textView2 = c21597hFg.gEmmrt;
        textView2.setText(pTF.KWHzl.AEQbTJ(C23271hvA.getLocalCurrencyWithPrecision$default(C23271hvA.copydefault, C23311hvo.copydefault(c29468kuH.DbNXlk()), null, 1, null)));
        int iAEQbTJ = TxType.Companion.AEQbTJ(c29468kuH.AYXKKw());
        android.content.Context context = textView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView2.setTextColor(C25382ivf.copydefault(iAEQbTJ, context));
        c21597hFg.djBIcL.setText(C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, c29468kuH.AhwBna(), false, false, RoundingMode.DOWN, false, 20, null));
        c21597hFg.AhwBna.setText(pTA.format$default(new Date(C33129mqd.valueOf(c29468kuH.valueOf())), OKDateEnum.NONE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null));
    }

    /* JADX INFO: renamed from: o.kvU$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C29468kuH KWHzl;
        public final /* synthetic */ C29534kvU OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29534kvU c29534kvU, C29468kuH c29468kuH) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c29534kvU;
            this.KWHzl = c29468kuH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ.invoke();
                InterfaceC29581kwO interfaceC29581kwO = this.OLrzqt.KWHzl;
                if (interfaceC29581kwO != null) {
                    interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.Activity(this.KWHzl.values(), this.KWHzl.EZpvd()));
                }
                C29408ktA.KWHzl.copydefault(this.KWHzl.gEmmrt(), "sm_profile");
            }
        }
    }
}
