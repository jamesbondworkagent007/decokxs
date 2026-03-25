package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexui.widget.DexEmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C22366hdx;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kZH extends C43316rmw {
    public Function1<? super DexMultiTokenInfoBean, Unit> AEQbTJ;
    public final androidx.fragment.app.FragmentManager EZpvd;
    public final Function1<DexMultiTokenInfoBean, Unit> KWHzl;
    public Function1<? super DexMultiTokenInfoBean, Unit> OLrzqt;
    public Function0<Unit> copydefault;
    public final Function0<Unit> djBIcL;
    public final Function1<DexMultiTokenInfoBean, Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super DexMultiTokenInfoBean, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super DexMultiTokenInfoBean, Unit> function1) {
        this.AEQbTJ = function1;
    }

    public kZH(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.EZpvd = fragmentManager;
        this.gEmmrt = new Function1() { // from class: o.kZK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kZH.EZpvd(this.EZpvd, (DexMultiTokenInfoBean) obj);
            }
        };
        this.KWHzl = new Function1() { // from class: o.kZI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kZH.copydefault(this.AEQbTJ, (DexMultiTokenInfoBean) obj);
            }
        };
        this.djBIcL = new Function0() { // from class: o.kZL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kZH.AEQbTJ(this.KWHzl);
            }
        };
    }

    public static final Unit EZpvd(kZH kzh, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Function1<? super DexMultiTokenInfoBean, Unit> function1 = kzh.AEQbTJ;
        if (function1 != null) {
            function1.invoke(dexMultiTokenInfoBean);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(kZH kzh, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Function1<? super DexMultiTokenInfoBean, Unit> function1 = kzh.OLrzqt;
        if (function1 != null) {
            function1.invoke(dexMultiTokenInfoBean);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(kZH kzh) {
        Function0<Unit> function0 = kzh.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        register(C28375kZb.class, new C30426lat(this.gEmmrt, this.KWHzl, this.EZpvd));
        register(C28384kZk.class, new C30432laz());
        register(DexEmptyData.class, new C25449iwt(this.djBIcL));
    }

    public final void AEQbTJ(boolean z) {
        setItems(C56402yEa.EZpvd(new DexEmptyData(7, C33070mpX.AYXKKw(C23274hvD.Fragment.isCurrent), !z ? C33070mpX.AYXKKw(C22366hdx.StateListAnimator.DTwDnp) : "", null, 0, 0, 56, null)));
        notifyDataSetChanged();
    }

    public final void AEQbTJ() {
        setItems(C56402yEa.EZpvd(new DexEmptyData(8, C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt), C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd), 0, 0, 48, null)));
        notifyDataSetChanged();
    }

    public final void copydefault() {
        setItems(C56402yEa.EZpvd(new DexEmptyData(7, C33070mpX.AYXKKw(C22366hdx.StateListAnimator.AwvSrB), null, null, 0, 0, 60, null)));
        notifyDataSetChanged();
    }

    public final void OLrzqt(@NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        setItems(list);
        notifyDataSetChanged();
    }
}
