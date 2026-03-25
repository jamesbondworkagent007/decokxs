package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.xZA;
import o.xZF;
import o.xZF.ActionBar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xZB<R1 extends xZF.ActionBar, R2 extends xZF.ActionBar> {
    public boolean AEQbTJ;
    public xZA AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public final Activity KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    public abstract void KWHzl(@NotNull java.util.List<? extends R1> list, @NotNull java.util.List<? extends R2> list2);

    /* JADX DEBUG: Type inference failed for r2v6. Raw type applied. Possible types: o.xZF$TaskDescription$ActionBar<R1>, o.xZF$TaskDescription$ActionBar<R extends o.xZF$ActionBar> */
    /* JADX DEBUG: Type inference failed for r2v7. Raw type applied. Possible types: o.xZF$TaskDescription$ActionBar<R2>, o.xZF$TaskDescription$ActionBar<R extends o.xZF$ActionBar> */
    public xZB(xZA xza, @NotNull xZF.TaskDescription<R1> taskDescription, @NotNull xZF.TaskDescription<R2> taskDescription2) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(taskDescription2, "");
        this.AYXKKw = xza;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xZE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xZB.OLrzqt();
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xZG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xZB.copydefault();
            }
        });
        Activity activity = new Activity(this);
        this.KWHzl = activity;
        xZA xza2 = this.AYXKKw;
        if (xza2 != null) {
            xza2.AEQbTJ(activity);
        }
        taskDescription.EZpvd(new xZF.TaskDescription.ActionBar<R1>(this) { // from class: o.xZB.2
            public final /* synthetic */ xZB<R1, R2> OLrzqt;

            {
                this.OLrzqt = this;
            }

            @Override // o.xZF.TaskDescription.ActionBar
            public void copydefault(java.util.List<? extends R1> list) {
                Intrinsics.checkNotNullParameter(list, "");
                if (list.isEmpty()) {
                    return;
                }
                this.OLrzqt.KWHzl().addAll(list);
                this.OLrzqt.gEmmrt();
            }
        });
        taskDescription2.EZpvd(new xZF.TaskDescription.ActionBar<R2>(this) { // from class: o.xZB.3
            public final /* synthetic */ xZB<R1, R2> copydefault;

            {
                this.copydefault = this;
            }

            @Override // o.xZF.TaskDescription.ActionBar
            public void copydefault(java.util.List<? extends R2> list) {
                Intrinsics.checkNotNullParameter(list, "");
                if (list.isEmpty()) {
                    return;
                }
                this.copydefault.djBIcL().addAll(list);
                this.copydefault.gEmmrt();
            }
        });
    }

    public final java.util.ArrayList<R1> KWHzl() {
        return (java.util.ArrayList) this.EZpvd.getValue();
    }

    public static final java.util.ArrayList OLrzqt() {
        return new java.util.ArrayList();
    }

    public final java.util.ArrayList<R2> djBIcL() {
        return (java.util.ArrayList) this.OLrzqt.getValue();
    }

    public static final java.util.ArrayList copydefault() {
        return new java.util.ArrayList();
    }

    public static final class Activity implements xZA.ActionBar {
        public final /* synthetic */ xZB<R1, R2> copydefault;

        public Activity(xZB<R1, R2> xzb) {
            this.copydefault = xzb;
        }

        @Override // o.xZA.ActionBar
        public void KWHzl(xZA xza) {
            Intrinsics.checkNotNullParameter(xza, "");
            if (this.copydefault.AEQbTJ) {
                this.copydefault.AYXKKw();
            }
        }
    }

    public final void gEmmrt() {
        xZA xza;
        this.AEQbTJ = true;
        xZA xza2 = this.AYXKKw;
        if (xza2 != null && xza2.copydefault()) {
            xZA xza3 = this.AYXKKw;
            if (xza3 != null) {
                xza3.KWHzl(true);
            }
            xZA xza4 = this.AYXKKw;
            if (xza4 == null || xza4.KWHzl() || (xza = this.AYXKKw) == null) {
                return;
            }
            xza.EZpvd();
            return;
        }
        AYXKKw();
    }

    public final void AYXKKw() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(KWHzl());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(djBIcL());
        KWHzl().clear();
        djBIcL().clear();
        KWHzl(arrayList, arrayList2);
        this.AEQbTJ = false;
    }
}
