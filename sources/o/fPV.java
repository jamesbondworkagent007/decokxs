package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.localization.util.format.DisplaySign;
import io.reactivex.BackpressureStrategy;
import java.math.RoundingMode;
import java.util.Deque;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes5.dex */
public final class fPV {
    public static final fPV OLrzqt = new fPV();
    public static java.lang.Boolean copydefault = java.lang.Boolean.FALSE;
    public static Deque<androidx.fragment.app.Fragment> EZpvd = new LinkedList();
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Deque<androidx.fragment.app.Fragment> EZpvd() {
        return EZpvd;
    }

    private fPV() {
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(long j, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String address;
        if (abstractC12782ctV == null) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, MultiTransferSignData.DEFAULT_INTERVAL));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        if (!EZpvd.isEmpty()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, MultiTransferSignData.DEFAULT_INTERVAL));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        if (c10854bwMKWHzl == null) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, MultiTransferSignData.DEFAULT_INTERVAL));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
            return abstractC58185ywXKWHzl3;
        }
        final C10854bwM c10854bwMKWHzl2 = c10854bwMKWHzl.KWHzl();
        if (c10854bwMKWHzl2 == null || !c10854bwMKWHzl2.OBJEWx() || !abstractC12782ctV.getFieldNames()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl4 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, MultiTransferSignData.DEFAULT_INTERVAL));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl4, "");
            return abstractC58185ywXKWHzl4;
        }
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.AhwBna() : -1L, null, 2, null);
        if (c10854bwMKWHzl2 != null) {
            long jFetchVPNInfo = c10854bwMKWHzl2.fetchVPNInfo();
            if (chainAddressAddressFromChainId$default == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) {
                AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl5 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, MultiTransferSignData.DEFAULT_INTERVAL));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl5, "");
                return abstractC58185ywXKWHzl5;
            }
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            AbstractActivityC33041mov abstractActivityC33041mov = activityAEQbTJ instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityAEQbTJ : null;
            final androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov != null ? abstractActivityC33041mov.getSupportFragmentManager() : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.showLoadingAtOnce();
            }
            AbstractC58185ywX abstractC58185ywXEZpvd = C8396bBt.buildOKWTransaction$default(C8396bBt.AEQbTJ, new SignDataArgs(abstractC12782ctV.DbNXlk(), null, jFetchVPNInfo, new TransferSignData(j, "", address, "0", null, null, 48, null), null, null, null, null, null, null, 1, null, null, null, null, null, null, false, false, null, false, false, false, false, 16776178, null), null, false, 6, null).EZpvd();
            final Function1 function1 = new Function1() { // from class: o.fPR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fPV.OLrzqt(c10854bwMKWHzl2, supportFragmentManager, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl6 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.fPU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fPV.OLrzqt(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl6, "");
            return abstractC58185ywXKWHzl6;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl7 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, MultiTransferSignData.DEFAULT_INTERVAL));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl7, "");
        return abstractC58185ywXKWHzl7;
    }

    public static final InterfaceC60096zvd OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C10854bwM c10854bwM, final androidx.fragment.app.FragmentManager fragmentManager, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Object first = pair.getFirst();
        InterfaceC9041bOB interfaceC9041bOB = first instanceof InterfaceC9041bOB ? (InterfaceC9041bOB) first : null;
        if (interfaceC9041bOB == null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            java.lang.String str = (java.lang.String) pair.getSecond();
            return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(bool, str != null ? str : ""));
        }
        C9225bRa c9225bRaIsConnected = interfaceC9041bOB.fJNWhG();
        if (c9225bRaIsConnected.djBIcL() != c10854bwM.AhwBna()) {
            c9225bRaIsConnected.AEQbTJ(c10854bwM);
        }
        java.lang.String strKWHzl = interfaceC9041bOB.getFieldNames().DarRvM().KWHzl(java.lang.Long.valueOf(c9225bRaIsConnected.djBIcL()), interfaceC9041bOB.getFieldNames().htlTjW());
        java.lang.String strDbNXlk = c9225bRaIsConnected.uzCIH().DbNXlk();
        if (!C33129mqd.gEmmrt(strKWHzl, strDbNXlk)) {
            return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, MultiTransferSignData.DEFAULT_INTERVAL));
        }
        final java.lang.String strKWHzl2 = C54870xYj.KWHzl(strDbNXlk, c10854bwM.valueOf(), c10854bwM.fZBcTu(), c10854bwM.fJNWhG(), (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
        return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.fPT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) throws java.lang.Throwable {
                fPV.OLrzqt(fragmentManager, strKWHzl2, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
    }

    public static final void OLrzqt(androidx.fragment.app.FragmentManager fragmentManager, final java.lang.String str, final InterfaceC58184ywW interfaceC58184ywW) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        fPH fph = fPH.OLrzqt;
        if (fragmentManager == null) {
            throw new java.lang.Throwable("supportFragmentManager is null");
        }
        fph.OLrzqt(fragmentManager, str, new Function0() { // from class: o.fPS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fPV.OLrzqt(interfaceC58184ywW, str);
            }
        });
    }

    public static final Unit OLrzqt(InterfaceC58184ywW interfaceC58184ywW, java.lang.String str) {
        interfaceC58184ywW.onNext(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, str));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }
}
