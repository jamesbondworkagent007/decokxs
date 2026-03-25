package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.network.okg.response.ResponseData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.InterfaceC9737bbI;
import o.InterfaceC9740bbL;
import o.dTQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gLU implements gLS {
    public final InterfaceC9852bdR AEQbTJ;
    public final dTQ EZpvd;
    public final dTN KWHzl;
    public final InterfaceC9776bbv OLrzqt;
    public final InterfaceC9850bdP copydefault;

    @yCM
    public gLU(@NotNull InterfaceC9852bdR interfaceC9852bdR, @NotNull dTN dtn, @NotNull dTQ dtq, InterfaceC9776bbv interfaceC9776bbv, @NotNull InterfaceC9850bdP interfaceC9850bdP) {
        Intrinsics.checkNotNullParameter(interfaceC9852bdR, "");
        Intrinsics.checkNotNullParameter(dtn, "");
        Intrinsics.checkNotNullParameter(dtq, "");
        Intrinsics.checkNotNullParameter(interfaceC9850bdP, "");
        this.AEQbTJ = interfaceC9852bdR;
        this.KWHzl = dtn;
        this.EZpvd = dtq;
        this.OLrzqt = interfaceC9776bbv;
        this.copydefault = interfaceC9850bdP;
    }

    @Override // o.gLS
    public InterfaceC9738bbJ AEQbTJ() {
        return (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(this.AEQbTJ.gEmmrt().copydefault());
    }

    @Override // o.gLS
    public StateFlow<dTH> copydefault() {
        return this.KWHzl.OLrzqt();
    }

    @Override // o.gLS
    public AbstractC58260yxt<ResponseData<C9748bbT>> EZpvd(@NotNull SignDataArgs<?> signDataArgs, boolean z, @NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9740bbL.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return this.AEQbTJ.AEQbTJ().copydefault(signDataArgs, z, fragmentActivity, taskDescription);
    }

    @Override // o.gLS
    public boolean KWHzl(long j) {
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(this.AEQbTJ.copydefault(), j, false, 2, null);
        return chainMetaWithRealChainId$default != null && chainMetaWithRealChainId$default.ejfBZ();
    }

    @Override // o.gLS
    public java.lang.String EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.AEQbTJ(str, i);
    }

    @Override // o.gLS
    public dTM copydefault(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return dTQ.TaskDescription.queryTEEAccountAndChainStatus$default(this.EZpvd, str, java.lang.Long.valueOf(j), false, 4, (java.lang.Object) null);
    }

    @Override // o.gLS
    public java.util.Map<java.lang.Long, dTM> copydefault(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return dTQ.TaskDescription.queryTEEAccountAndChainStatus$default(this.EZpvd, str, (java.util.List) list, false, 4, (java.lang.Object) null);
    }

    @Override // o.gLS
    public boolean KWHzl() {
        dTQ dtq = this.EZpvd;
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = AEQbTJ();
        java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        return dtq.AEQbTJ(strDbNXlk);
    }

    @Override // o.gLS
    public boolean OLrzqt() {
        dTQ dtq = this.EZpvd;
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = AEQbTJ();
        java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        return dtq.copydefault(strDbNXlk);
    }

    @Override // o.gLS
    public long EZpvd() {
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = AEQbTJ();
        if (interfaceC9738bbJAEQbTJ != null) {
            return interfaceC9738bbJAEQbTJ.fIwbmz();
        }
        return Long.MAX_VALUE;
    }
}
