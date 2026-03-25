package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dbY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13912dbY {
    public static final C13912dbY copydefault = new C13912dbY();
    public static boolean AEQbTJ = true;
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.dbX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C13912dbY.copydefault();
        }
    });
    public static final int EZpvd = 8;

    /* JADX INFO: renamed from: o.dbY$StateListAnimator */
    public static final class StateListAnimator extends TypeToken<java.util.ArrayList<java.lang.Long>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return "usd";
    }

    private C13912dbY() {
    }

    public final cPO OLrzqt() {
        return (cPO) OLrzqt.getValue();
    }

    public static final cPO copydefault() {
        return new cPO(C9678baC.Companion.AEQbTJ());
    }

    public final boolean djBIcL() {
        return SPUtils.getBoolean("defi_show_asset_key", true);
    }

    public final boolean OLrzqt(boolean z) {
        return SPUtils.commit("defi_show_asset_key", java.lang.Boolean.valueOf(z));
    }

    public final boolean gEmmrt() {
        return SPUtils.getBoolean("show_first_backup_wallet", true);
    }

    public final void AEQbTJ(boolean z) {
        SPUtils.commit("show_first_backup_wallet", java.lang.Boolean.valueOf(z));
    }

    public final boolean fetchVPNInfo() {
        return AkhnZx() || isConnected();
    }

    public final boolean AkhnZx() {
        return SPUtils.getBoolean("show_wallet_list_optimize_guide", true);
    }

    public final void AhwBna(boolean z) {
        SPUtils.commit("show_wallet_list_optimize_guide", java.lang.Boolean.valueOf(z));
    }

    public final boolean isConnected() {
        dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
        return dtq != null && dtq.copydefault() && SPUtils.getBoolean("show_wallet_list_tee_guide_again", true);
    }

    public final void AYXKKw(boolean z) {
        SPUtils.commit("show_wallet_list_tee_guide_again", java.lang.Boolean.valueOf(z));
    }

    public final boolean values() {
        return SPUtils.getBoolean("show_edit_wallet_list_optimize_guide", true);
    }

    public final void KWHzl(boolean z) {
        SPUtils.commit("show_edit_wallet_list_optimize_guide", java.lang.Boolean.valueOf(z));
    }

    /* JADX DEBUG: Type inference failed for r5v3. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Boolean> */
    public final AbstractC58260yxt<java.lang.Boolean> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtAEQbTJ = OLrzqt().AEQbTJ("show_manual_backup_dialog_" + str, -1L);
        final Function1 function1 = new Function1() { // from class: o.dcc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13912dbY.djBIcL((java.lang.Long) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.dca
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13912dbY.isConnected(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Boolean isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean djBIcL(java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return java.lang.Boolean.valueOf(l.longValue() == -1 || (l.longValue() != 0 && java.lang.System.currentTimeMillis() - l.longValue() > java.util.concurrent.TimeUnit.DAYS.toMillis(30L)));
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.lang.String str2 = "show_manual_backup_dialog_" + str;
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtAEQbTJ = OLrzqt().AEQbTJ(str2, -1L);
        final Function1 function1 = new Function1() { // from class: o.dce
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13912dbY.AEQbTJ(str2, (java.lang.Long) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.dch
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13912dbY.valueOf(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dcg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13912dbY.EZpvd((java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dcf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C13912dbY.djBIcL(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dcl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13912dbY.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dbZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C13912dbY.gEmmrt(function13, obj);
            }
        });
    }

    public static final InterfaceC58261yxu valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(java.lang.String str, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return copydefault.OLrzqt().EZpvd(l.longValue() == -1 ? java.lang.System.currentTimeMillis() : 0L, str);
    }

    public static final Unit EZpvd(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtEZpvd = OLrzqt().EZpvd(0L, "show_manual_backup_dialog_" + str);
        final Function1 function1 = new Function1() { // from class: o.dbV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13912dbY.OLrzqt((java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dcb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C13912dbY.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dcd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13912dbY.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dci
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C13912dbY.DbNXlk(function12, obj);
            }
        });
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public final boolean DbNXlk() {
        return SPUtils.getBoolean("show_set_fingerprint_dialog_dialog", true);
    }

    public final void copydefault(boolean z) {
        SPUtils.commit("show_set_fingerprint_dialog_dialog", java.lang.Boolean.valueOf(z));
    }

    public final boolean AYXKKw() {
        return SPUtils.getBoolean("expand_hidden_asset", false);
    }

    public final void EZpvd(boolean z) {
        SPUtils.put("expand_hidden_asset", java.lang.Boolean.valueOf(z));
    }

    public final void AEQbTJ(@NotNull java.util.ArrayList<java.lang.Long> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        SPUtils.commit("showed_upgrade_chain_list", C33488mxR.EZpvd(CollectionsKt___CollectionsKt.OqFWZa(arrayList)));
    }

    public final java.util.ArrayList<java.lang.Long> AEQbTJ() {
        try {
            java.util.ArrayList<java.lang.Long> arrayList = (java.util.ArrayList) new Gson().fromJson(SPUtils.getString("showed_upgrade_chain_list", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI), new StateListAnimator().getType());
            Intrinsics.copydefault(arrayList);
            return arrayList;
        } catch (java.lang.Exception unused) {
            return new java.util.ArrayList<>(0);
        }
    }

    public final java.lang.String valueOf() {
        java.lang.String string = SPUtils.getString("wallet_terms_version_sp_key", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return SPUtils.commit("wallet_terms_version_sp_key", str);
    }
}
