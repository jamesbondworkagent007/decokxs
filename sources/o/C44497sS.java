package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C44443sQ;
import o.InterfaceC44254sJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C44497sS {
    public static final java.util.Map<java.lang.String, Function2<C44443sQ.TaskDescription, BX, Unit>> EZpvd = C56424yEw.KWHzl();

    public static final C44443sQ AEQbTJ(@NotNull InterfaceC44254sJ.Application application, @NotNull BX bx) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(bx, "");
        C44443sQ.ActionBar actionBar = C44443sQ.OLrzqt;
        C44443sQ.TaskDescription taskDescription = new C44443sQ.TaskDescription();
        taskDescription.OLrzqt(application.DbNXlk());
        EZpvd(taskDescription, application, bx);
        DL dlGEmmrt = application.gEmmrt();
        taskDescription.AEQbTJ(dlGEmmrt != null ? dlGEmmrt.toString() : null);
        Function2<C44443sQ.TaskDescription, BX, Unit> function2 = EZpvd.get((java.lang.String) C58108yv.OLrzqt(bx.OLrzqt(), C57578yl.EZpvd.copydefault()));
        if (function2 != null) {
            function2.invoke(taskDescription, bx);
        }
        return taskDescription.copydefault();
    }

    public static final void EZpvd(C44443sQ.TaskDescription taskDescription, InterfaceC44254sJ.Application application, BX bx) {
        taskDescription.AEQbTJ(java.lang.Boolean.valueOf(application.fIwbmz()));
        taskDescription.OLrzqt(java.lang.Boolean.valueOf(application.fJNWhG()));
    }
}
