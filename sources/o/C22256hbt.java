package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dex.trade.order.domain.model.OrderSide;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hbt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22256hbt extends AbstractC31189lpN<C20008gXm, hCT> {
    public final Function1<C20008gXm, Unit> AEQbTJ;

    /* JADX INFO: renamed from: o.hbt$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.Buy.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderSide.Sell.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ() {
        return "--";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.gXm, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C22256hbt(Function1<? super C20008gXm, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public hCT KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCT hctOLrzqt = hCT.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hctOLrzqt, "");
        return hctOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hCT hct, @NotNull C20008gXm c20008gXm) {
        java.lang.String localizedNumberWithSymbol$default;
        java.lang.String localizedNumberWithSymbol$default2;
        java.lang.String localizedNumberWithSymbol$default3;
        Intrinsics.checkNotNullParameter(hct, "");
        Intrinsics.checkNotNullParameter(c20008gXm, "");
        hct.EZpvd.OLrzqt(c20008gXm.djBIcL(), c20008gXm.AkhnZx(), c20008gXm.OLrzqt());
        if (c20008gXm.AEQbTJ().length() > 0) {
            hct.valueOf.setText(c20008gXm.AEQbTJ());
            AppCompatTextView appCompatTextView = hct.valueOf;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
        } else {
            AppCompatTextView appCompatTextView2 = hct.valueOf;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(8);
        }
        int i = ActionBar.copydefault[c20008gXm.fetchVPNInfo().ordinal()];
        java.lang.String str = "--";
        if (i == 1) {
            hct.fetchVPNInfo.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getState));
            hct.isConnected.setText(c20008gXm.values());
            hct.djBIcL.setOKDSStyle(14);
            hct.AYXKKw.setOKDSStyle(14);
            C55251xgS c55251xgS = hct.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(8);
            AppCompatTextView appCompatTextView3 = hct.gEmmrt;
            java.lang.String strDbNXlk = c20008gXm.DbNXlk();
            java.lang.String str2 = strDbNXlk.length() > 0 ? strDbNXlk : null;
            if (str2 != null && (localizedNumberWithSymbol$default = C23322hvz.toLocalizedNumberWithSymbol$default(str2, c20008gXm.values(), false, null, true, false, 22, null)) != null) {
                str = localizedNumberWithSymbol$default;
            }
            appCompatTextView3.setText(str);
        } else if (i == 2) {
            hct.fetchVPNInfo.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.NRYds));
            hct.isConnected.setText(c20008gXm.values());
            hct.djBIcL.setOKDSStyle(14);
            hct.AYXKKw.setOKDSStyle(14);
            C55251xgS c55251xgS2 = hct.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
            c55251xgS2.setVisibility(0);
            hct.AYXKKw.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.fJNWhG));
            AppCompatTextView appCompatTextView4 = hct.gEmmrt;
            java.lang.String strAYXKKw = c20008gXm.AYXKKw();
            java.lang.String str3 = strAYXKKw.length() > 0 ? strAYXKKw : null;
            if (str3 != null && (localizedNumberWithSymbol$default2 = C23322hvz.toLocalizedNumberWithSymbol$default(str3, c20008gXm.AhwBna(), false, null, true, false, 22, null)) != null) {
                str = localizedNumberWithSymbol$default2;
            }
            appCompatTextView4.setText(str);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            hct.fetchVPNInfo.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal));
            hct.isConnected.setText(c20008gXm.AhwBna());
            hct.djBIcL.setOKDSStyle(13);
            hct.AYXKKw.setOKDSStyle(13);
            C55251xgS c55251xgS3 = hct.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
            c55251xgS3.setVisibility(0);
            hct.AYXKKw.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.AuCTel));
            AppCompatTextView appCompatTextView5 = hct.gEmmrt;
            java.lang.String strDbNXlk2 = c20008gXm.DbNXlk();
            java.lang.String str4 = strDbNXlk2.length() > 0 ? strDbNXlk2 : null;
            if (str4 != null && (localizedNumberWithSymbol$default3 = C23322hvz.toLocalizedNumberWithSymbol$default(str4, c20008gXm.DbNXlk(), false, null, true, false, 22, null)) != null) {
                str = localizedNumberWithSymbol$default3;
            }
            appCompatTextView5.setText(str);
        }
        hct.djBIcL.setText(C33070mpX.AYXKKw(c20008gXm.valueOf().getStrRes()));
        hct.AhwBna.setText(c20008gXm.copydefault());
        AppCompatTextView appCompatTextView6 = hct.DbNXlk;
        java.lang.String strFJNWhG = c20008gXm.fJNWhG();
        appCompatTextView6.setText(C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) strFJNWhG) ? pTA.format$default(new Date(C33129mqd.valueOf(strFJNWhG)), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null) : "", (Function0<java.lang.String>) new Function0() { // from class: o.hbq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22256hbt.AEQbTJ();
            }
        }));
        for (android.view.View view : yDY.gEmmrt(hct.EZpvd, hct.isConnected, hct.AYXKKw, hct.djBIcL)) {
            view.setOnClickListener(new TaskDescription(view, 1000L, this, c20008gXm));
        }
    }

    /* JADX INFO: renamed from: o.hbt$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C22256hbt KWHzl;
        public final /* synthetic */ C20008gXm OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C22256hbt c22256hbt, C20008gXm c20008gXm) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c22256hbt;
            this.OLrzqt = c20008gXm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1 function1 = this.KWHzl.AEQbTJ;
                if (function1 != null) {
                    function1.invoke(this.OLrzqt);
                }
            }
        }
    }
}
