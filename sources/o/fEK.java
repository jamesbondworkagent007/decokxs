package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.WalletType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C17351fCc;
import o.fDP;
import o.fEK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fEK implements fDP {
    public final Function2<C17351fCc.TaskDescription, java.lang.Integer, Unit> AEQbTJ;
    public final fDW EZpvd;
    public boolean KWHzl;
    public final Function1<C17351fCc.TaskDescription, Unit> OLrzqt;
    public final Function1<C17351fCc.TaskDescription, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<C17351fCc.TaskDescription, Unit> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<C17351fCc.TaskDescription, Unit> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super o.fCc$TaskDescription, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fCc$TaskDescription, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.fCc$TaskDescription, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fEK(@NotNull Function2<? super C17351fCc.TaskDescription, ? super java.lang.Integer, Unit> function2, @NotNull Function1<? super C17351fCc.TaskDescription, Unit> function1, @NotNull Function1<? super C17351fCc.TaskDescription, Unit> function12, @NotNull fDW fdw) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(fdw, "");
        this.AEQbTJ = function2;
        this.copydefault = function1;
        this.OLrzqt = function12;
        this.EZpvd = fdw;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.DBAlnt, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        Activity activity = new Activity(viewInflate);
        this.KWHzl = C55296xhK.AEQbTJ(viewGroup);
        return activity;
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull final java.lang.Object obj, final int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Activity activity = (Activity) viewHolder;
        activity.copydefault((C17351fCc.TaskDescription) obj);
        activity.KWHzl().copydefault(this.KWHzl);
        activity.KWHzl().OLrzqt(this.EZpvd);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fEL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                fEK.EZpvd(this.EZpvd, obj, i, view);
            }
        });
        android.widget.TextView textViewAEQbTJ = activity.AEQbTJ();
        textViewAEQbTJ.setOnClickListener(new StateListAnimator(textViewAEQbTJ, 1000L, this, obj));
        android.widget.TextView textViewCopydefault = activity.copydefault();
        textViewCopydefault.setOnClickListener(new TaskDescription(textViewCopydefault, 1000L, this, obj));
    }

    public static final void EZpvd(fEK fek, java.lang.Object obj, int i, android.view.View view) {
        fek.AEQbTJ.invoke(obj, java.lang.Integer.valueOf(i));
    }

    public static final class Activity extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final C55251xgS AYXKKw;
        public final android.widget.TextView AhwBna;
        public final android.widget.TextView EZpvd;
        public final fDY KWHzl;
        public final android.widget.TextView OLrzqt;
        public final AppCompatImageView copydefault;
        public final C55251xgS gEmmrt;
        public final InterfaceC56387yDm valueOf;

        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[WalletType.values().length];
                try {
                    iArr[WalletType.HDWallet.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[WalletType.HardwareWallet.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[WalletType.MPCWallet.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[WalletType.TonWallet.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final fDY KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.onSessionEvent);
            this.AhwBna = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.getIControllerCallback);
            this.copydefault = (AppCompatImageView) view.findViewById(C13754dXa.ActionBar.DPVBvL);
            this.OLrzqt = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.sILrnl);
            this.AYXKKw = (C55251xgS) view.findViewById(C13754dXa.ActionBar.MediaSessionCompatApi21);
            this.gEmmrt = (C55251xgS) view.findViewById(C13754dXa.ActionBar.RcvFxC);
            this.EZpvd = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.Dfm);
            this.KWHzl = (fDY) view.findViewById(C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplBaseMediaSessionStub);
            this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.fEJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fEK.Activity.AhwBna();
                }
            });
        }

        private final C17412fEj EZpvd() {
            return (C17412fEj) this.valueOf.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17412fEj AhwBna() {
            return new C17412fEj();
        }

        public final void copydefault(@NotNull C17351fCc.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            AbstractC12784ctX abstractC12784ctXGEmmrt = taskDescription.gEmmrt();
            this.KWHzl.OLrzqt(EZpvd().OLrzqt());
            this.AEQbTJ.setText(EZpvd().AYXKKw(abstractC12784ctXGEmmrt));
            this.AhwBna.setText(C13912dbY.copydefault.fetchVPNInfo() ? "*****" : EZpvd().djBIcL(abstractC12784ctXGEmmrt));
            int i = 8;
            if (taskDescription.AYXKKw()) {
                this.copydefault.setRotation(taskDescription.values() ? 0.0f : 180.0f);
                this.copydefault.setVisibility(0);
            } else {
                this.copydefault.setVisibility(8);
            }
            this.OLrzqt.setVisibility(EZpvd().EZpvd(abstractC12784ctXGEmmrt) ? 0 : 8);
            android.widget.TextView textView = this.EZpvd;
            WalletType walletTypeFJNWhG = abstractC12784ctXGEmmrt.fJNWhG();
            int[] iArr = ActionBar.copydefault;
            int i2 = iArr[walletTypeFJNWhG.ordinal()];
            textView.setVisibility((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? 0 : 8);
            this.AYXKKw.setVisibility(iArr[abstractC12784ctXGEmmrt.fJNWhG().ordinal()] == 3 ? 0 : 8);
            C55251xgS c55251xgS = this.gEmmrt;
            int i3 = iArr[abstractC12784ctXGEmmrt.fJNWhG().ordinal()];
            if (i3 != 1) {
                if (i3 == 3 && abstractC12784ctXGEmmrt.getNewProxyInstance()) {
                    this.gEmmrt.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.shouldCenterSingleButton));
                    i = 0;
                }
            } else if (!abstractC12784ctXGEmmrt.AEQbTJ()) {
                this.gEmmrt.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMetadata));
                i = 0;
            }
            c55251xgS.setVisibility(i);
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ java.lang.Object KWHzl;
        public final /* synthetic */ fEK copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, fEK fek, java.lang.Object obj) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = fek;
            this.KWHzl = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: kotlin.jvm.functions.Function1<o.fCc$TaskDescription, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.EZpvd().invoke(this.KWHzl);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ fEK KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, fEK fek, java.lang.Object obj) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = fek;
            this.AEQbTJ = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: kotlin.jvm.functions.Function1<o.fCc$TaskDescription, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.OLrzqt().invoke(this.AEQbTJ);
            }
        }
    }
}
