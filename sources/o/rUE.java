package o;

import android.view.View;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.gson.Gson;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55274xgp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rUE extends AbstractC52788wYj {
    public final java.lang.CharSequence gEmmrt = "";
    public java.util.HashMap<java.lang.String, java.lang.String> EZpvd = new java.util.HashMap<>();
    public final java.lang.String AEQbTJ = "app mode";
    public final java.lang.String OLrzqt = "cefi mode";
    public final java.util.List<C55276xgr> copydefault = yDY.gEmmrt(new C55276xgr("cefi web3", yDY.gEmmrt("cefi", "web3"), null, false, false, null, null, 124, null), new C55276xgr("web3 cefi", yDY.gEmmrt("web3", "cefi"), null, false, false, null, null, 124, null), new C55276xgr("cefi", C56402yEa.EZpvd("cefi"), null, false, false, null, null, 124, null), new C55276xgr("web3", C56402yEa.EZpvd("web3"), null, false, false, null, null, 124, null));
    public final java.util.List<C55276xgr> KWHzl = yDY.gEmmrt(new C55276xgr("pro lite", yDY.gEmmrt("pro", "lite"), null, false, false, null, null, 124, null), new C55276xgr("lite pro", yDY.gEmmrt("lite", "pro"), null, false, false, null, null, 124, null), new C55276xgr("pro", C56402yEa.EZpvd("pro"), null, false, false, null, null, 124, null), new C55276xgr("lite", C56402yEa.EZpvd("lite"), null, false, false, null, null, 124, null));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52788wYj
    public java.lang.CharSequence EZpvd() {
        return this.gEmmrt;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        java.util.HashMap<java.lang.String, java.lang.String> mapKWHzl;
        java.util.HashMap<java.lang.String, java.lang.String> mapKWHzl2;
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.isConnected().setVisibility(8);
        C42495rUz c42495rUzValueOf = rUO.OLrzqt.valueOf();
        if ((c42495rUzValueOf != null && (mapKWHzl2 = c42495rUzValueOf.KWHzl()) != null && mapKWHzl2.containsKey(this.AEQbTJ)) || (c42495rUzValueOf != null && (mapKWHzl = c42495rUzValueOf.KWHzl()) != null && mapKWHzl.containsKey(this.OLrzqt))) {
            this.EZpvd = c42495rUzValueOf.KWHzl();
            for (C55276xgr c55276xgr : this.copydefault) {
                Gson gson = new Gson();
                java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                c55276xgr.copydefault(Intrinsics.EZpvd((java.lang.Object) gson.toJson((java.util.List) objOLrzqt), (java.lang.Object) c42495rUzValueOf.KWHzl().get(this.AEQbTJ)));
            }
            for (C55276xgr c55276xgr2 : this.KWHzl) {
                Gson gson2 = new Gson();
                java.lang.Object objOLrzqt2 = c55276xgr2.OLrzqt();
                Intrinsics.copydefault(objOLrzqt2, "");
                c55276xgr2.copydefault(Intrinsics.EZpvd((java.lang.Object) gson2.toJson((java.util.List) objOLrzqt2), (java.lang.Object) c42495rUzValueOf.KWHzl().get(this.OLrzqt)));
            }
        } else {
            OLrzqt();
        }
        InterfaceC55274xgp.StateListAnimator.setMultipleColumnData$default(c55198xfS, yDY.gEmmrt(new C55276xgr(this.AEQbTJ, this.copydefault, null, true, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(this.OLrzqt, this.KWHzl, null, false, false, null, null, 124, null)), new Function1() { // from class: o.rUC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rUE.KWHzl((C55276xgr) obj);
            }
        }, null, new yHO() { // from class: o.rUG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return rUE.OLrzqt(this.OLrzqt, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        }, 4, null);
    }

    public static final java.util.List KWHzl(C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        if (objOLrzqt instanceof java.util.List) {
            return (java.util.List) objOLrzqt;
        }
        return null;
    }

    public static final Unit OLrzqt(rUE rue, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.String strValueOf = java.lang.String.valueOf(c55276xgr != null ? c55276xgr.AhwBna() : null);
        java.lang.Object objOLrzqt = c55276xgr2 != null ? c55276xgr2.OLrzqt() : null;
        Intrinsics.copydefault(objOLrzqt, "");
        java.lang.String json = new Gson().toJson((java.util.List) objOLrzqt);
        if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) rue.AEQbTJ)) {
            rue.EZpvd.put(rue.AEQbTJ, json);
            C42495rUz c42495rUz = new C42495rUz(rue.EZpvd);
            SPUtils.put("debug_mode_list", json);
            rUO.OLrzqt.KWHzl(c42495rUz);
        } else if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) rue.OLrzqt)) {
            if (Intrinsics.EZpvd((java.lang.Object) rue.EZpvd.get(rue.AEQbTJ), (java.lang.Object) new Gson().toJson(C56402yEa.EZpvd("web3")))) {
                rue.EZpvd.put(rue.OLrzqt, "");
                C42495rUz c42495rUz2 = new C42495rUz(rue.EZpvd);
                SPUtils.put("debug_cefi_list", "");
                rUO.OLrzqt.KWHzl(c42495rUz2);
                C55326xho.toast$default("web3 unsupport cefi mode！", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else {
                rue.EZpvd.put(rue.OLrzqt, json);
                C42495rUz c42495rUz3 = new C42495rUz(rue.EZpvd);
                SPUtils.put("debug_cefi_list", json);
                rUO.OLrzqt.KWHzl(c42495rUz3);
            }
        }
        rue.copydefault();
        return Unit.INSTANCE;
    }

    private final void copydefault() {
        C42495rUz c42495rUz = (C42495rUz) SPUtils.getObject("debug_sectiondata", C42495rUz.class);
        if (c42495rUz != null) {
            for (C55276xgr c55276xgr : this.copydefault) {
                Gson gson = new Gson();
                java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                c55276xgr.copydefault(Intrinsics.EZpvd((java.lang.Object) gson.toJson((java.util.List) objOLrzqt), (java.lang.Object) c42495rUz.KWHzl().get(this.AEQbTJ)));
            }
        }
        if (c42495rUz != null) {
            for (C55276xgr c55276xgr2 : this.KWHzl) {
                Gson gson2 = new Gson();
                java.lang.Object objOLrzqt2 = c55276xgr2.OLrzqt();
                Intrinsics.copydefault(objOLrzqt2, "");
                c55276xgr2.copydefault(Intrinsics.EZpvd((java.lang.Object) gson2.toJson((java.util.List) objOLrzqt2), (java.lang.Object) c42495rUz.KWHzl().get(this.OLrzqt)));
            }
        }
    }

    @Override // o.AbstractC52788wYj, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText("Confirm");
        wyf.setSecondaryText("Reset");
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt() {
        rUO.OLrzqt.AEQbTJ();
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ rUE KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, rUE rue) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = rue;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismiss();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ rUE KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, rUE rue) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = rue;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.OLrzqt();
                this.KWHzl.dismiss();
            }
        }
    }
}
