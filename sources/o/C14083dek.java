package o;

import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.model.tx.signdata.PiRegisterSignData;
import com.okinc.business.defi.api.model.tx.signdata.StarkNetRegisterSignData;
import com.okinc.business.defi.api.model.tx.signdata.ZKSyncRegisterSignData;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14083dek {
    public static final C14083dek OLrzqt = new C14083dek();

    private C14083dek() {
    }

    public final void AEQbTJ() {
        C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setIcon), 0, 1, (java.lang.Object) null);
    }

    public final void KWHzl() {
        C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOnDismissListener), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.dek */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleUnregisteredStatus$default(C14083dek c14083dek, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function1 = null;
        }
        c14083dek.EZpvd(context, fragmentManager, str, j, function1);
    }

    public final void EZpvd(@NotNull final android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final java.lang.String str, final long j, final Function1<? super android.os.Bundle, Unit> function1) {
        Triple triple;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        final C10854bwM c10854bwMKWHzl2 = c10854bwMKWHzl != null ? c10854bwMKWHzl.KWHzl() : null;
        if ((c10854bwMKWHzl2 != null && c10854bwMKWHzl2.hCLrkq()) || (c10854bwMKWHzl2 != null && c10854bwMKWHzl2.heceqZ())) {
            triple = new Triple(C33070mpX.AYXKKw(C13754dXa.FragmentManager.prepareFromMediaId), C33070mpX.AYXKKw(C13754dXa.FragmentManager.prepare), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getPlaybackState));
        } else if (c10854bwMKWHzl2 != null && c10854bwMKWHzl2.DCUTEIdCUTEI()) {
            triple = new Triple(C33070mpX.AYXKKw(C13754dXa.FragmentManager.prepareFromMediaId), C33070mpX.AYXKKw(C13754dXa.FragmentManager.prepare), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getPlaybackState));
        } else {
            triple = new Triple(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMedia), C33070mpX.AYXKKw(C13754dXa.FragmentManager.newUnratedRating), C33070mpX.AYXKKw(C13754dXa.FragmentManager.subscribe));
        }
        DefiWalletVReminderDFragment.Companion.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(C52761wXj.TaskDescription.NRYds, null, (java.lang.String) triple.component1(), (java.lang.String) triple.component2(), (java.lang.String) triple.component3(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getServiceComponent), 2, null)).AEQbTJ(fragmentManager, new Function1() { // from class: o.del
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14083dek.copydefault(c10854bwMKWHzl, c10854bwMKWHzl2, j, str, context, function1, (java.lang.Integer) obj);
            }
        });
    }

    public static final Unit copydefault(C10854bwM c10854bwM, C10854bwM c10854bwM2, long j, java.lang.String str, android.content.Context context, final Function1 function1, java.lang.Integer num) {
        if (num != null && num.intValue() == 1) {
            java.lang.String string = c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()).toString() : null;
            java.lang.String json = "";
            java.lang.String str2 = string == null ? "" : string;
            if (c10854bwM2 != null && c10854bwM2.DCUTEIdCUTEI()) {
                json = new Gson().toJson(new StarkNetRegisterSignData(null, null, null, null, 15, null));
            } else if (c10854bwM2 != null && c10854bwM2.hCLrkq()) {
                json = new Gson().toJson(new ZKSyncRegisterSignData(null, c10854bwM.OLrzqt(), C33129mqd.gEmmrt(java.lang.Long.valueOf(j)), 1, null));
            } else if (c10854bwM2 != null && c10854bwM2.UlJrfe()) {
                json = new Gson().toJson(new PiRegisterSignData(j, c10854bwM.fJNWhG(), c10854bwM.OLrzqt(), c10854bwM.DbNXlk()));
            }
            java.lang.String str3 = json;
            Intrinsics.copydefault((java.lang.Object) str3);
            C13502dNs.Companion.KWHzl(context, new DappInteractionArgs(str, null, str2, null, str3, java.lang.Long.valueOf(j), null, 1, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, -67109046, null), new Function1() { // from class: o.deo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14083dek.AEQbTJ(function1, (android.os.Bundle) obj);
                }
            }, null, null, OKWBaseTransaction.TransactionType.Register);
        } else if (((num != null && num.intValue() == 2) || num == null) && function1 != null) {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function1 function1, android.os.Bundle bundle) {
        if (function1 != null) {
            function1.invoke(bundle);
        }
        return Unit.INSTANCE;
    }
}
