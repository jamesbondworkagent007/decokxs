package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.xZF;
import o.xZF.ActionBar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xZH<R1 extends xZF.ActionBar, R2 extends xZF.ActionBar, R3 extends xZF.ActionBar> extends xZB<R1, R2> {
    public final InterfaceC56387yDm djBIcL;

    public abstract void AEQbTJ(@NotNull java.util.List<? extends R1> list, @NotNull java.util.List<? extends R2> list2, @NotNull java.util.List<? extends R3> list3);

    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: o.xZF$TaskDescription$ActionBar<R3>, o.xZF$TaskDescription$ActionBar<R extends o.xZF$ActionBar> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xZH(xZA xza, @NotNull xZF.TaskDescription<R1> taskDescription, @NotNull xZF.TaskDescription<R2> taskDescription2, @NotNull xZF.TaskDescription<R3> taskDescription3) {
        super(xza, taskDescription, taskDescription2);
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(taskDescription2, "");
        Intrinsics.checkNotNullParameter(taskDescription3, "");
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.xZD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xZH.valueOf();
            }
        });
        taskDescription3.EZpvd(new xZF.TaskDescription.ActionBar<R3>(this) { // from class: o.xZH.1
            public final /* synthetic */ xZH<R1, R2, R3> EZpvd;

            {
                this.EZpvd = this;
            }

            @Override // o.xZF.TaskDescription.ActionBar
            public void copydefault(java.util.List<? extends R3> list) {
                Intrinsics.checkNotNullParameter(list, "");
                if (list.isEmpty()) {
                    return;
                }
                this.EZpvd.fetchVPNInfo().addAll(list);
                this.EZpvd.gEmmrt();
            }
        });
    }

    public final java.util.ArrayList<R3> fetchVPNInfo() {
        return (java.util.ArrayList) this.djBIcL.getValue();
    }

    public static final java.util.ArrayList valueOf() {
        return new java.util.ArrayList();
    }

    @Override // o.xZB
    public void KWHzl(@NotNull java.util.List<? extends R1> list, @NotNull java.util.List<? extends R2> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(fetchVPNInfo());
        fetchVPNInfo().clear();
        AEQbTJ(list, list2, arrayList);
    }
}
