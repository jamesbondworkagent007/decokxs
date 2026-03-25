package o;

import com.okinc.business.defi.api.constant.ChainRegisterStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainCheckType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cUW extends AbstractC43215rlA implements InterfaceC9844bdJ {

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChainStatus.values().length];
            try {
                iArr[ChainStatus.REGISTERED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChainStatus.REGISTERING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Type inference failed for r8v7. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.defi.api.constant.ChainRegisterStatus> */
    @Override // o.InterfaceC9844bdJ
    public AbstractC58185ywX<ChainRegisterStatus> AEQbTJ(long j, @NotNull java.lang.String str) {
        C10854bwM c10854bwMAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        if (j >= 0) {
            c10854bwMAEQbTJ = C10954byG.EZpvd.valueOf().copydefault(j);
            if (c10854bwMAEQbTJ == null) {
                AbstractC58185ywX<ChainRegisterStatus> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.IllegalArgumentException("not supported chain"));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
                return abstractC58185ywXAEQbTJ;
            }
        } else {
            c10854bwMAEQbTJ = C10598brV.AEQbTJ.AEQbTJ(j);
            if (c10854bwMAEQbTJ == null) {
                AbstractC58185ywX<ChainRegisterStatus> abstractC58185ywXAEQbTJ2 = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.IllegalArgumentException("not supported chain"));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
                return abstractC58185ywXAEQbTJ2;
            }
        }
        if (!c10854bwMAEQbTJ.DCUTEIdCUTEI()) {
            AbstractC58185ywX<ChainRegisterStatus> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(ChainRegisterStatus.REGISTERED);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ChainStatus> abstractC58185ywXOLrzqt = ChainStatusChecker.OLrzqt.OLrzqt(c10854bwMAEQbTJ.AhwBna(), str, c10854bwMAEQbTJ.OLrzqt(), C56402yEa.EZpvd(ChainCheckType.CHECK_REGISTER));
        final Function1 function1 = new Function1() { // from class: o.cUU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cUW.EZpvd((ChainStatus) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ3 = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cUX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cUW.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ3, "");
        return abstractC58185ywXAEQbTJ3;
    }

    public static final ChainRegisterStatus copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ChainRegisterStatus) function1.invoke(obj);
    }

    public static final ChainRegisterStatus EZpvd(ChainStatus chainStatus) {
        Intrinsics.checkNotNullParameter(chainStatus, "");
        int i = StateListAnimator.copydefault[chainStatus.ordinal()];
        if (i == 1) {
            return ChainRegisterStatus.REGISTERED;
        }
        if (i == 2) {
            return ChainRegisterStatus.REGISTERING;
        }
        return ChainRegisterStatus.UNREGISTERED;
    }

    @Override // o.InterfaceC9844bdJ
    public void EZpvd(long j, @NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(java.lang.Boolean.TRUE);
    }
}
