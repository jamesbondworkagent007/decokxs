package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gMb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19700gMb {
    public final gLS AEQbTJ;
    public final InterfaceC25414iwK EZpvd;

    @yCM
    public C19700gMb(@NotNull gLS gls, @NotNull InterfaceC25414iwK interfaceC25414iwK) {
        Intrinsics.checkNotNullParameter(gls, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        this.AEQbTJ = gls;
        this.EZpvd = interfaceC25414iwK;
    }

    public final InterfaceC9738bbJ KWHzl() {
        return this.AEQbTJ.AEQbTJ();
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = KWHzl();
        java.lang.String strEZpvd = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.EZpvd(C33129mqd.valueOf(str)) : null;
        return strEZpvd == null ? "" : strEZpvd;
    }

    public final java.lang.String isConnected() {
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = KWHzl();
        java.lang.String strEjfBZ = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.ejfBZ() : null;
        return strEjfBZ == null ? "" : strEjfBZ;
    }

    public final boolean djBIcL() {
        return valueOf() && this.EZpvd.valueOf();
    }

    public final boolean AYXKKw() {
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = KWHzl();
        if (interfaceC9738bbJKWHzl != null) {
            return interfaceC9738bbJKWHzl.RJOkX();
        }
        return false;
    }

    public final boolean valueOf() {
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = KWHzl();
        if (interfaceC9738bbJKWHzl != null) {
            return interfaceC9738bbJKWHzl.DTwDnp();
        }
        return false;
    }

    public final boolean AhwBna() {
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = KWHzl();
        if (interfaceC9738bbJKWHzl != null) {
            return interfaceC9738bbJKWHzl.QUSxYX();
        }
        return false;
    }

    public final TeeSaStatus OLrzqt() {
        return djBIcL() ? TeeSaStatus.TEE_ACTIVE : AhwBna() ? TeeSaStatus.TEE_EXPIRED : TeeSaStatus.NON_TEE_ACTIVE_AND_EXPIRED;
    }

    public final StateFlow<dTH> AEQbTJ() {
        return this.AEQbTJ.copydefault();
    }

    public static /* synthetic */ AbstractC58260yxt teeSignTransactionWithMessage$default(C19700gMb c19700gMb, SignDataArgs signDataArgs, boolean z, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c19700gMb.AEQbTJ(signDataArgs, z, fragmentActivity, taskDescription);
    }

    public final AbstractC58260yxt<ResponseData<C9748bbT>> AEQbTJ(@NotNull SignDataArgs<?> signDataArgs, boolean z, @NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9740bbL.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return this.AEQbTJ.EZpvd(signDataArgs, z, fragmentActivity, taskDescription);
    }

    public final boolean OLrzqt(long j) {
        return this.AEQbTJ.KWHzl(j);
    }

    public final AccountInfo OLrzqt(boolean z, boolean z2) {
        java.lang.String strDbNXlk;
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = KWHzl();
        if (z) {
            java.lang.String strEjfBZ = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.ejfBZ() : null;
            strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
            return new AccountInfo(strEjfBZ, 1, java.lang.Boolean.valueOf(z2), strDbNXlk != null ? strDbNXlk : "");
        }
        strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
        return new AccountInfo((java.lang.String) null, (java.lang.Integer) 2, java.lang.Boolean.valueOf(z2), strDbNXlk == null ? "" : strDbNXlk, 1, (DefaultConstructorMarker) null);
    }

    public final boolean gEmmrt() {
        return this.AEQbTJ.OLrzqt();
    }

    public final boolean copydefault() {
        return this.AEQbTJ.KWHzl();
    }

    public final long EZpvd() {
        return this.AEQbTJ.EZpvd();
    }
}
