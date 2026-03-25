package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.market.bean.CompositeInfoBean;
import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22806hmM extends AbstractC22801hmH {
    public final AbstractC23101hrq KWHzl;
    public C23258huo OLrzqt;

    /* JADX INFO: renamed from: o.hmM$Activity */
    public interface Activity {
        void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull java.lang.String str, @NotNull java.lang.String str2);

        void EZpvd(@NotNull java.lang.Throwable th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22806hmM(@NotNull AbstractC23101hrq abstractC23101hrq) {
        super(abstractC23101hrq);
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.KWHzl = abstractC23101hrq;
    }

    public final void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull final java.lang.String str2, final Activity activity) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C22372heC.AEQbTJ(this.KWHzl.ffGIBT())) {
            return;
        }
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(C22380heK.OLrzqt.copydefault(this.KWHzl.ffGIBT()).isConnected().copydefault(str2, str), lifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.hmQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22806hmM.OLrzqt(activity, this, str2, (CompositeInfoBean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hmO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22806hmM.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hmT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22806hmM.OLrzqt(this.copydefault, activity, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hmR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22806hmM.EZpvd(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final Activity activity, final C22806hmM c22806hmM, java.lang.String str, CompositeInfoBean compositeInfoBean) {
        if (activity != null) {
            activity.AEQbTJ(c22806hmM.KWHzl.QUSxYX().valueOf(), compositeInfoBean.getPrice(), compositeInfoBean.getChange24H());
        }
        C23258huo c23258huo = c22806hmM.OLrzqt;
        if (c23258huo != null) {
            c23258huo.OLrzqt();
        }
        C23258huo c23258huo2 = new C23258huo(c22806hmM.KWHzl.ffGIBT(), compositeInfoBean.getTokenContractAddress(), str);
        c22806hmM.OLrzqt = c23258huo2;
        c23258huo2.EZpvd(new Function1() { // from class: o.hmN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22806hmM.EZpvd(activity, c22806hmM, (MarketTxWsInfoItemBean) obj);
            }
        });
        C23258huo c23258huo3 = c22806hmM.OLrzqt;
        if (c23258huo3 != null) {
            c23258huo3.KWHzl(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Activity activity, C22806hmM c22806hmM, MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
        Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
        if (activity != null) {
            activity.AEQbTJ(c22806hmM.KWHzl.QUSxYX().valueOf(), marketTxWsInfoItemBean.fIwbmz(), marketTxWsInfoItemBean.AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C22806hmM c22806hmM, Activity activity, java.lang.Throwable th) {
        C23258huo c23258huo = c22806hmM.OLrzqt;
        if (c23258huo != null) {
            c23258huo.OLrzqt();
        }
        if (activity != null) {
            Intrinsics.copydefault(th);
            activity.EZpvd(th);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C23258huo c23258huo = this.OLrzqt;
        if (c23258huo != null) {
            c23258huo.OLrzqt();
        }
        this.OLrzqt = null;
    }
}
