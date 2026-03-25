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

/* JADX INFO: loaded from: classes23.dex */
public final class rBW extends AbstractC52788wYj {
    public final java.lang.CharSequence valueOf = "";
    public java.util.HashMap<java.lang.String, java.lang.String> OLrzqt = new java.util.HashMap<>();
    public final java.lang.String EZpvd = "app mode";
    public final java.lang.String AEQbTJ = "cefi mode";
    public final java.util.List<C55276xgr> copydefault = yDY.gEmmrt(new C55276xgr("cefi web3", yDY.gEmmrt("cefi", "web3"), null, false, false, null, null, 124, null), new C55276xgr("web3 cefi", yDY.gEmmrt("web3", "cefi"), null, false, false, null, null, 124, null), new C55276xgr("cefi", C56402yEa.EZpvd("cefi"), null, false, false, null, null, 124, null), new C55276xgr("web3", C56402yEa.EZpvd("web3"), null, false, false, null, null, 124, null));
    public final java.util.List<C55276xgr> KWHzl = yDY.gEmmrt(new C55276xgr("pro lite", yDY.gEmmrt("pro", "lite"), null, false, false, null, null, 124, null), new C55276xgr("lite pro", yDY.gEmmrt("lite", "pro"), null, false, false, null, null, 124, null), new C55276xgr("pro", C56402yEa.EZpvd("pro"), null, false, false, null, null, 124, null), new C55276xgr("lite", C56402yEa.EZpvd("lite"), null, false, false, null, null, 124, null));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52788wYj
    public java.lang.CharSequence EZpvd() {
        return this.valueOf;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.isConnected().setVisibility(8);
        C41992rCi c41992rCi = (C41992rCi) SPUtils.getObject("debug_sectiondata", C41992rCi.class);
        if (c41992rCi != null) {
            this.OLrzqt = c41992rCi.AEQbTJ();
        }
        pUU.EZpvd("qjf", "sectionDataModel = " + c41992rCi);
        if (c41992rCi != null) {
            for (C55276xgr c55276xgr : this.copydefault) {
                Gson gson = new Gson();
                java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                c55276xgr.copydefault(Intrinsics.EZpvd((java.lang.Object) gson.toJson((java.util.List) objOLrzqt), (java.lang.Object) c41992rCi.AEQbTJ().get(this.EZpvd)));
            }
        }
        if (c41992rCi != null) {
            for (C55276xgr c55276xgr2 : this.KWHzl) {
                Gson gson2 = new Gson();
                java.lang.Object objOLrzqt2 = c55276xgr2.OLrzqt();
                Intrinsics.copydefault(objOLrzqt2, "");
                c55276xgr2.copydefault(Intrinsics.EZpvd((java.lang.Object) gson2.toJson((java.util.List) objOLrzqt2), (java.lang.Object) c41992rCi.AEQbTJ().get(this.AEQbTJ)));
            }
        }
        InterfaceC55274xgp.StateListAnimator.setMultipleColumnData$default(c55198xfS, yDY.gEmmrt(new C55276xgr(this.EZpvd, this.copydefault, null, true, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(this.AEQbTJ, this.KWHzl, null, false, false, null, null, 124, null)), new Function1() { // from class: o.rBY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rBW.EZpvd((C55276xgr) obj);
            }
        }, null, new yHO() { // from class: o.rBU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return rBW.OLrzqt(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        }, 4, null);
    }

    public static final java.util.List EZpvd(C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        if (objOLrzqt instanceof java.util.List) {
            return (java.util.List) objOLrzqt;
        }
        return null;
    }

    public static final Unit OLrzqt(rBW rbw, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.String strValueOf = java.lang.String.valueOf(c55276xgr != null ? c55276xgr.AhwBna() : null);
        java.lang.Object objOLrzqt = c55276xgr2 != null ? c55276xgr2.OLrzqt() : null;
        Intrinsics.copydefault(objOLrzqt, "");
        java.lang.String json = new Gson().toJson((java.util.List) objOLrzqt);
        pUU.EZpvd("qjf", "groupTitle = " + strValueOf + " ,sectionDataStr = " + json);
        if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) rbw.EZpvd)) {
            SPUtils.put("debug_mode_list", json);
            rbw.OLrzqt.put(rbw.EZpvd, json);
            SPUtils.put("debug_sectiondata", new C41992rCi(rbw.OLrzqt));
        } else if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) rbw.AEQbTJ)) {
            if (Intrinsics.EZpvd((java.lang.Object) rbw.OLrzqt.get(rbw.EZpvd), (java.lang.Object) new Gson().toJson(C56402yEa.EZpvd("web3"))) && Intrinsics.EZpvd((java.lang.Object) rbw.OLrzqt.get(rbw.EZpvd), (java.lang.Object) new Gson().toJson(C56402yEa.EZpvd("web3")))) {
                SPUtils.put("debug_cefi_list", "");
                rbw.OLrzqt.put(rbw.AEQbTJ, "");
                SPUtils.put("debug_sectiondata", new C41992rCi(rbw.OLrzqt));
                C55326xho.toast$default("web3 unsupport cefi mode！", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else {
                SPUtils.put("debug_cefi_list", json);
                rbw.OLrzqt.put(rbw.AEQbTJ, json);
                SPUtils.put("debug_sectiondata", new C41992rCi(rbw.OLrzqt));
            }
        }
        rbw.AEQbTJ();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C41992rCi c41992rCi = (C41992rCi) SPUtils.getObject("debug_sectiondata", C41992rCi.class);
        if (c41992rCi != null) {
            for (C55276xgr c55276xgr : this.copydefault) {
                Gson gson = new Gson();
                java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                c55276xgr.copydefault(Intrinsics.EZpvd((java.lang.Object) gson.toJson((java.util.List) objOLrzqt), (java.lang.Object) c41992rCi.AEQbTJ().get(this.EZpvd)));
            }
        }
        if (c41992rCi != null) {
            for (C55276xgr c55276xgr2 : this.KWHzl) {
                Gson gson2 = new Gson();
                java.lang.Object objOLrzqt2 = c55276xgr2.OLrzqt();
                Intrinsics.copydefault(objOLrzqt2, "");
                c55276xgr2.copydefault(Intrinsics.EZpvd((java.lang.Object) gson2.toJson((java.util.List) objOLrzqt2), (java.lang.Object) c41992rCi.AEQbTJ().get(this.AEQbTJ)));
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
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new StateListAnimator(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt() {
        SPUtils.put("debug_mode_list", "");
        SPUtils.put("debug_cefi_list", "");
        SPUtils.put("debug_sectiondata", new java.util.HashMap());
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ rBW OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, rBW rbw) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = rbw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.dismiss();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ rBW KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, rBW rbw) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = rbw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.OLrzqt();
                this.KWHzl.dismiss();
            }
        }
    }
}
