package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.okinc.dexkline.market.features.position.ui.widget.PnLDetailsUiModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC34465ncb;
import o.xHC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ndn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34530ndn extends android.widget.FrameLayout {
    public xHC.ActionBar AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public InterfaceC34464nca KWHzl;
    public PnLDetailsUiModel OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34530ndn(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34530ndn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:58) call: o.ndn.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C34530ndn(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34530ndn(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ndp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34530ndn.KWHzl(context, this);
            }
        });
        C36090oOx c36090oOxKWHzl = KWHzl();
        LinearLayoutCompat linearLayoutCompat = c36090oOxKWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(8);
        LinearLayoutCompat linearLayoutCompat2 = c36090oOxKWHzl.KWHzl;
        linearLayoutCompat2.setOnClickListener(new Activity(linearLayoutCompat2, 1000L, this, c36090oOxKWHzl));
    }

    private final C36090oOx KWHzl() {
        return (C36090oOx) this.EZpvd.getValue();
    }

    public static final C36090oOx KWHzl(android.content.Context context, C34530ndn c34530ndn) {
        return C36090oOx.copydefault(android.view.LayoutInflater.from(context), c34530ndn, true);
    }

    public final void setData(@NotNull PnLDetailsUiModel pnLDetailsUiModel, InterfaceC34464nca interfaceC34464nca, @NotNull xHC.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(pnLDetailsUiModel, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.KWHzl = interfaceC34464nca;
        this.OLrzqt = pnLDetailsUiModel;
        this.AEQbTJ = actionBar;
        LinearLayoutCompat linearLayoutCompat = KWHzl().KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(pnLDetailsUiModel.AEQbTJ() ? 0 : 8);
        copydefault(pnLDetailsUiModel);
        setTotalPnL(pnLDetailsUiModel, actionBar);
        setUnRealizedPnL(pnLDetailsUiModel, actionBar);
        setRealizedPnL(pnLDetailsUiModel, actionBar);
        setBoughtPositionAndVolume(pnLDetailsUiModel, actionBar);
        setSoldPositionAndVolume(pnLDetailsUiModel, actionBar);
    }

    public final void setSoldPositionAndVolume(PnLDetailsUiModel pnLDetailsUiModel, xHC.ActionBar actionBar) {
        C36090oOx c36090oOxKWHzl = KWHzl();
        c36090oOxKWHzl.gEmmrt.setText(actionBar.AEQbTJ());
        C55258xgZ c55258xgZ = c36090oOxKWHzl.AhwBna;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
        c36090oOxKWHzl.ejfBZ.setText(actionBar.iwGUEr());
        C55258xgZ c55258xgZ2 = c36090oOxKWHzl.fIwbmz;
        c55258xgZ2.setOnClickListener(new ActionBar(c55258xgZ2, 1000L, this));
    }

    public final void setBoughtPositionAndVolume(PnLDetailsUiModel pnLDetailsUiModel, xHC.ActionBar actionBar) {
        C36090oOx c36090oOxKWHzl = KWHzl();
        c36090oOxKWHzl.valueOf.setText(actionBar.gEmmrt());
        C55258xgZ c55258xgZ = c36090oOxKWHzl.AYXKKw;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
        c36090oOxKWHzl.isConnected.setText(actionBar.valueOf());
        C55258xgZ c55258xgZ2 = c36090oOxKWHzl.values;
        c55258xgZ2.setOnClickListener(new TaskDescription(c55258xgZ2, 1000L, this));
    }

    public final void setRealizedPnL(PnLDetailsUiModel pnLDetailsUiModel, xHC.ActionBar actionBar) {
        C36090oOx c36090oOxKWHzl = KWHzl();
        c36090oOxKWHzl.fetchVPNInfo.setText(actionBar.fJNWhG());
        c36090oOxKWHzl.DbNXlk.setText(actionBar.getNewProxyInstance());
        android.widget.TextView textView = c36090oOxKWHzl.DbNXlk;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setTextColor(mUO.KWHzl(context, pnLDetailsUiModel.OLrzqt()));
    }

    /* JADX INFO: renamed from: o.ndn$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C34530ndn AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C34530ndn c34530ndn) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c34530ndn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl(C33070mpX.AYXKKw(C35964oKf.Fragment.DPHOMC), C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialaVhqwO));
            }
        }
    }

    /* JADX INFO: renamed from: o.ndn$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C36090oOx EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C34530ndn OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C34530ndn c34530ndn, C36090oOx c36090oOx) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c34530ndn;
            this.EZpvd = c36090oOx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C34530ndn c34530ndn = this.OLrzqt;
                LinearLayoutCompat linearLayoutCompat = this.EZpvd.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                c34530ndn.AEQbTJ(!(linearLayoutCompat.getVisibility() == 0));
            }
        }
    }

    /* JADX INFO: renamed from: o.ndn$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C34530ndn OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C34530ndn c34530ndn) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c34530ndn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.KWHzl(C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialhOMIpD), C33070mpX.AYXKKw(C35964oKf.Fragment.iqMDAV));
            }
        }
    }

    /* JADX INFO: renamed from: o.ndn$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C34530ndn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C34530ndn c34530ndn) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c34530ndn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.KWHzl(C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialsiEkQe), C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialaGOrKO));
            }
        }
    }

    /* JADX INFO: renamed from: o.ndn$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C34530ndn AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C34530ndn c34530ndn) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c34530ndn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl(C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialatDTRm), C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialDaTmkG));
            }
        }
    }

    public final void setUnRealizedPnL(PnLDetailsUiModel pnLDetailsUiModel, xHC.ActionBar actionBar) {
        C36090oOx c36090oOxKWHzl = KWHzl();
        c36090oOxKWHzl.fJNWhG.setText(actionBar.AuCTel());
        c36090oOxKWHzl.uzCIH.setText(actionBar.fIwbmz());
        android.widget.TextView textView = c36090oOxKWHzl.uzCIH;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setTextColor(mUO.KWHzl(context, pnLDetailsUiModel.copydefault()));
    }

    private final void copydefault(PnLDetailsUiModel pnLDetailsUiModel) {
        C55258xgZ c55258xgZ = KWHzl().fARcdN;
        android.content.Context context = c55258xgZ.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55258xgZ.setTextColor(mUO.KWHzl(context, pnLDetailsUiModel.EZpvd()));
    }

    public final void setTotalPnL(PnLDetailsUiModel pnLDetailsUiModel, xHC.ActionBar actionBar) {
        C36090oOx c36090oOxKWHzl = KWHzl();
        c36090oOxKWHzl.AuCTel.setText(actionBar.fetchVPNInfo() + " (" + actionBar.DbNXlk() + ")");
        android.widget.TextView textView = c36090oOxKWHzl.AuCTel;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setTextColor(mUO.KWHzl(context, pnLDetailsUiModel.EZpvd()));
    }

    public final void AEQbTJ(boolean z) {
        C36090oOx c36090oOxKWHzl = KWHzl();
        c36090oOxKWHzl.OLrzqt.setImageDrawable(ContextCompat.getDrawable(getContext(), z ? C52761wXj.TaskDescription.OxVOHk : C52761wXj.TaskDescription.OJuSTm));
        LinearLayoutCompat linearLayoutCompat = c36090oOxKWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(z ? 0 : 8);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        InterfaceC34464nca interfaceC34464nca = this.KWHzl;
        if (interfaceC34464nca != null) {
            interfaceC34464nca.AEQbTJ(new InterfaceC34465ncb.TaskDescription(str, str2));
        }
    }
}
