package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.nft.extensionimpl.NFTHomePageStatusExtensionImpl$onHomeCreated$4$1;
import com.okinc.nft.extensionimpl.NFTHomePageStatusExtensionImpl$onHomeCreated$5;
import com.okinc.rxutils.RxBus;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rpQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43443rpQ extends AbstractC43215rlA implements InterfaceC9770bbp {
    public Job AEQbTJ;

    @Override // o.InterfaceC9770bbp
    public void AEQbTJ(@NotNull final FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, fragmentActivity);
        final Function1 function1 = new Function1() { // from class: o.rqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43443rpQ.OLrzqt((xXO) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C43443rpQ.AkhnZx(function1, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(xXI.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXKWHzl2, fragmentActivity);
        final Function1 function12 = new Function1() { // from class: o.rpZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43443rpQ.KWHzl((xXI) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rpY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C43443rpQ.isConnected(function12, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl3 = RxBus.KWHzl(xXM.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        AbstractC58185ywX abstractC58185ywXEZpvd3 = C58156yvv.EZpvd(abstractC58185ywXKWHzl3, fragmentActivity);
        final Function1 function13 = new Function1() { // from class: o.rqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43443rpQ.EZpvd((xXM) obj);
            }
        };
        abstractC58185ywXEZpvd3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rqg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C43443rpQ.gEmmrt(function13, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl4 = RxBus.KWHzl(xXH.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl4, "");
        AbstractC58185ywX abstractC58185ywXEZpvd4 = C58156yvv.EZpvd(abstractC58185ywXKWHzl4, fragmentActivity);
        final Function1 function14 = new Function1() { // from class: o.rpT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43443rpQ.KWHzl(this.EZpvd, fragmentActivity, (xXH) obj);
            }
        };
        abstractC58185ywXEZpvd4.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rpW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C43443rpQ.AYXKKw(function14, obj);
            }
        });
        Job job = this.AEQbTJ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.AEQbTJ = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new NFTHomePageStatusExtensionImpl$onHomeCreated$5(fragmentActivity, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(xXO xxo) {
        C7323ahf.KWHzl().AEQbTJ("MAIN_WALLET_CHANGE", null, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(xXI xxi) {
        C7323ahf.KWHzl().AEQbTJ("RELOAD_WALLET", null, null);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(xXM xxm) {
        C7323ahf.KWHzl().AEQbTJ("WALLET_DELETED", null, null);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C43443rpQ c43443rpQ, FragmentActivity fragmentActivity, xXH xxh) {
        Job job = c43443rpQ.AEQbTJ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        c43443rpQ.AEQbTJ = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new NFTHomePageStatusExtensionImpl$onHomeCreated$4$1(null), 3, null);
        C7323ahf.KWHzl().AEQbTJ("WALLET_ADDED", null, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC9770bbp
    public void KWHzl(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Job job = this.AEQbTJ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        C43483rqD.OLrzqt.OLrzqt("nft-operate");
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt(FragmentActivity fragmentActivity) {
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(false), fragmentActivity);
        final Function1 function1 = new Function1() { // from class: o.rpS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43443rpQ.OLrzqt((java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rpU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C43443rpQ.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rpX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43443rpQ.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rpV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C43443rpQ.valueOf(function12, obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            C43483rqD.OLrzqt.AEQbTJ("nft-operate", ((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).values());
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
