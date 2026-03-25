package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fDP;
import o.fEA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class fEA implements fDP {
    public final Function2<java.lang.Object, java.lang.Integer, Unit> EZpvd;
    public final Function2<java.lang.Object, java.lang.Integer, Unit> KWHzl;
    public final Function2<java.lang.Object, java.lang.Integer, Unit> OLrzqt;
    public final yHO<RecyclerView.ViewHolder, java.lang.Object, java.lang.Integer, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<java.lang.Object, java.lang.Integer, Unit> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<java.lang.Object, java.lang.Integer, Unit> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<java.lang.Object, java.lang.Integer, Unit> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<java.lang.Object, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<java.lang.Object, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<java.lang.Object, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fEA(@NotNull yHO<? super RecyclerView.ViewHolder, java.lang.Object, ? super java.lang.Integer, Unit> yho, @NotNull Function2<java.lang.Object, ? super java.lang.Integer, Unit> function2, @NotNull Function2<java.lang.Object, ? super java.lang.Integer, Unit> function22, @NotNull Function2<java.lang.Object, ? super java.lang.Integer, Unit> function23) {
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(function23, "");
        this.copydefault = yho;
        this.KWHzl = function2;
        this.OLrzqt = function22;
        this.EZpvd = function23;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.gkZNMa, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Application(viewInflate);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull final RecyclerView.ViewHolder viewHolder, @NotNull final java.lang.Object obj, final int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Application application = (Application) viewHolder;
        eCF ecf = (eCF) obj;
        application.AEQbTJ(ecf.copydefault(), ecf.OLrzqt());
        application.copydefault().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.fEB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return fEA.KWHzl(this.copydefault, viewHolder, obj, i, view);
            }
        });
        android.widget.TextView textViewEZpvd = application.EZpvd();
        textViewEZpvd.setOnClickListener(new ActionBar(textViewEZpvd, 1000L, this, ecf, i));
        android.widget.ImageView imageViewOLrzqt = application.OLrzqt();
        imageViewOLrzqt.setOnClickListener(new StateListAnimator(imageViewOLrzqt, 1000L, this, ecf, i));
        android.widget.ImageView imageViewKWHzl = application.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this, ecf, i));
    }

    public static final boolean KWHzl(fEA fea, RecyclerView.ViewHolder viewHolder, java.lang.Object obj, int i, android.view.View view) {
        fea.copydefault.invoke(viewHolder, obj, java.lang.Integer.valueOf(i));
        return true;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.ImageView AYXKKw;
        public final InterfaceC56387yDm AhwBna;
        public final android.widget.TextView EZpvd;
        public final android.widget.ImageView KWHzl;
        public final android.widget.ImageView OLrzqt;
        public final C55251xgS copydefault;
        public final android.widget.ImageView djBIcL;
        public final android.widget.ImageView gEmmrt;
        public final C55251xgS valueOf;

        /* JADX INFO: renamed from: o.fEA$Application$Application, reason: collision with other inner class name */
        public final /* synthetic */ class C0840Application {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[WalletType.values().length];
                try {
                    iArr[WalletType.AAWallet.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[WalletType.MPCWallet.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView copydefault() {
            return this.djBIcL;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.fEE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fEA.Application.djBIcL();
                }
            });
            this.OLrzqt = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.GCXiNH);
            this.KWHzl = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.ejfBZ);
            this.AEQbTJ = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.uzCIH);
            this.EZpvd = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.AuCTel);
            this.djBIcL = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.MediaSessionCompatCallbackStubApi21);
            this.gEmmrt = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.QUeTTI);
            this.valueOf = (C55251xgS) view.findViewById(C13754dXa.ActionBar.OgHfcT);
            this.AYXKKw = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.sEcTXd);
            this.copydefault = (C55251xgS) view.findViewById(C13754dXa.ActionBar.EZpvd);
        }

        public final C17412fEj valueOf() {
            return (C17412fEj) this.AhwBna.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17412fEj djBIcL() {
            return new C17412fEj();
        }

        public final void AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull EIP7702WalletStatus eIP7702WalletStatus) {
            java.util.List<AbstractC12782ctV> listKWHzl;
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            Intrinsics.checkNotNullParameter(eIP7702WalletStatus, "");
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            boolean z = (abstractC12784ctXGwTjWJ == null || (listKWHzl = abstractC12784ctXGwTjWJ.KWHzl()) == null || !C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listKWHzl.size()), 1)) ? false : true;
            android.widget.ImageView imageView = this.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C14725dqq.copydefault(imageView, abstractC12782ctV.AEQbTJ(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fEI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fEA.Application.OLrzqt((C5335Nt) obj);
                }
            }, 32.0f);
            this.OLrzqt.setVisibility(valueOf().KWHzl(abstractC12782ctV));
            this.AEQbTJ.setText(abstractC12782ctV.AkhnZx());
            this.EZpvd.setText(valueOf().OLrzqt(abstractC12782ctV));
            C17927fXl.KWHzl.OLrzqt(C17922fXg.OLrzqt(abstractC12782ctV), this.gEmmrt, false, this.AEQbTJ);
            int i = C0840Application.OLrzqt[abstractC12782ctV.QwvEab().ordinal()];
            if (i != 1 && i == 2) {
                this.copydefault.setVisibility(8);
            } else {
                this.copydefault.setVisibility(8);
            }
            this.djBIcL.setVisibility(z ? 0 : 8);
            ViewGroup.LayoutParams layoutParams = this.KWHzl.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            if (this.OLrzqt.getVisibility() == 0) {
                layoutParams2.setMarginStart(C55298xhM.dp2px$default(12.0f, null, 1, null));
            } else {
                layoutParams2.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            }
            this.KWHzl.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.AYXKKw.getLayoutParams();
            FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            if (z) {
                layoutParams4.setMarginEnd(C55298xhM.dp2px$default(16.0f, null, 1, null));
            } else {
                layoutParams4.setMarginEnd(C55298xhM.dp2px$default(24.0f, null, 1, null));
            }
            this.AYXKKw.setLayoutParams(layoutParams4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit OLrzqt(C5335Nt c5335Nt) {
            Intrinsics.checkNotNullParameter(c5335Nt, "");
            c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ eCF EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ fEA OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, fEA fea, eCF ecf, int i) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = fea;
            this.EZpvd = ecf;
            this.AEQbTJ = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt().invoke(this.EZpvd.copydefault(), java.lang.Integer.valueOf(this.AEQbTJ));
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ fEA EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ eCF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, fEA fea, eCF ecf, int i) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = fea;
            this.copydefault = ecf;
            this.AEQbTJ = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.EZpvd().invoke(this.copydefault.copydefault(), java.lang.Integer.valueOf(this.AEQbTJ));
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ eCF OLrzqt;
        public final /* synthetic */ fEA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, fEA fea, eCF ecf, int i) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = fea;
            this.OLrzqt = ecf;
            this.AEQbTJ = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.KWHzl().invoke(this.OLrzqt.copydefault(), java.lang.Integer.valueOf(this.AEQbTJ));
            }
        }
    }
}
