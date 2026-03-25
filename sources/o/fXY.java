package o;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.components.track.TrackChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C20537gik;
import o.C20540gin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fXY extends AbstractActivityC17933fXr implements InterfaceC20523giW {
    public static final Application Companion = new Application(null);

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKWBaseTransaction.TransactionType.values().length];
            try {
                iArr[OKWBaseTransaction.TransactionType.Approve.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.CancelApprove.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.Message.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.DappTransfer.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.Transfer.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.Register.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            OLrzqt = iArr;
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fXY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull OKWBaseTransaction<?> oKWBaseTransaction, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
            android.content.Intent intentAEQbTJ = AbstractActivityC17933fXr.Companion.AEQbTJ(oKWBaseTransaction);
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            intentAEQbTJ.putExtras(bundle);
            intentAEQbTJ.setClass(context, fXY.class);
            return intentAEQbTJ;
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull SignDataArgs<?> signDataArgs, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(signDataArgs, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            android.content.Intent intentEZpvd = AbstractActivityC17933fXr.Companion.EZpvd(signDataArgs);
            intentEZpvd.putExtra(MTAnalysisConstants.Account.KEY_ACCOUNT, str);
            intentEZpvd.putExtra("deposit_limit", str2);
            intentEZpvd.putExtra("exchange_account_name", str3);
            intentEZpvd.putExtra("is_smart_account", z);
            intentEZpvd.putExtra("ens_domain", str4);
            intentEZpvd.setClass(context, fXY.class);
            return intentEZpvd;
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull SignDataArgs<?> signDataArgs) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(signDataArgs, "");
            android.content.Intent intentEZpvd = AbstractActivityC17933fXr.Companion.EZpvd(signDataArgs);
            intentEZpvd.setClass(context, fXY.class);
            return intentEZpvd;
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
            android.content.Intent intentAEQbTJ = AbstractActivityC17933fXr.Companion.AEQbTJ(oKWBaseTransaction);
            intentAEQbTJ.setClass(context, fXY.class);
            return intentAEQbTJ;
        }
    }

    @Override // o.AbstractActivityC17933fXr
    public void AEQbTJ(@NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
        androidx.fragment.app.Fragment c20191gcI;
        C9758bbd c9758bbdCopydefault;
        PreExecTransactionRes preExecTransactionResQSLkRj;
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        if (oKWBaseTransaction.DCUTEIddSDPG()) {
            if (!(oKWBaseTransaction instanceof AbstractC8564bFB)) {
                if (!(oKWBaseTransaction instanceof AbstractC8610bFv)) {
                    C10857bwP.AEQbTJ("OKWalletTransactionActivity", "onTransactionPrepared ui3 " + oKWBaseTransaction.getClass().getName());
                    finish();
                    return;
                }
                C20537gik.StateListAnimator stateListAnimator = C20537gik.Companion;
                c20191gcI = new C20537gik();
            } else {
                C20540gin.ActionBar actionBar = C20540gin.Companion;
                c20191gcI = new C20540gin();
            }
        } else if (oKWBaseTransaction.zblBkD()) {
            if (oKWBaseTransaction instanceof AbstractC8601bFm) {
                if ((oKWBaseTransaction instanceof C8972bMm) && ((C8972bMm) oKWBaseTransaction).heceqZ()) {
                    c20191gcI = new C20261gdZ();
                } else {
                    c20191gcI = new C20250gdO();
                }
            } else {
                if (!(oKWBaseTransaction instanceof AbstractC8610bFv)) {
                    C10857bwP.AEQbTJ("OKWalletTransactionActivity", "onTransactionPrepared " + oKWBaseTransaction.getClass().getName());
                    finish();
                    return;
                }
                c20191gcI = new C20321geg();
            }
        } else {
            C10854bwM c10854bwMDHguZz = oKWBaseTransaction.dHguZz();
            switch (ActionBar.OLrzqt[oKWBaseTransaction.aUsmxb().ordinal()]) {
                case 1:
                    if (c10854bwMDHguZz.DarRvM()) {
                        c20191gcI = new C20266gde();
                    } else if (!c10854bwMDHguZz.QkdxfA() && !c10854bwMDHguZz.run()) {
                        return;
                    } else {
                        c20191gcI = new C20191gcI();
                    }
                    break;
                case 2:
                    if (!c10854bwMDHguZz.QkdxfA() && !c10854bwMDHguZz.run()) {
                        return;
                    } else {
                        c20191gcI = new C20207gcY();
                    }
                    break;
                case 3:
                    if (oKWBaseTransaction.dUDNAs().getFieldNames()) {
                        c20191gcI = new C20290geB();
                    } else if (c10854bwMDHguZz.run()) {
                        java.util.HashMap<java.lang.Integer, AbstractC9832bcy> mapCopydefault = oKWBaseTransaction.UlJrfe().copydefault();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<java.lang.Integer, AbstractC9832bcy> entry : mapCopydefault.entrySet()) {
                            if (entry.getValue() instanceof C9835bdA) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        java.lang.Object objRcXXUw = CollectionsKt___CollectionsKt.RcXXUw(linkedHashMap.values());
                        C9835bdA c9835bdA = objRcXXUw instanceof C9835bdA ? (C9835bdA) objRcXXUw : null;
                        if (((c9835bdA == null || (c9758bbdCopydefault = c9835bdA.copydefault()) == null) ? null : c9758bbdCopydefault.OLrzqt()) != null) {
                            c20191gcI = new C20293geE();
                        } else {
                            c20191gcI = new C20299geK();
                        }
                    } else if (c10854bwMDHguZz.QkdxfA()) {
                        KYSPreTxCheckInfo kYSPreTxCheckInfoValueOf = ((AbstractC8918bLl) oKWBaseTransaction).valueOf();
                        java.lang.String strategy = kYSPreTxCheckInfoValueOf != null ? kYSPreTxCheckInfoValueOf.getStrategy() : null;
                        if (Intrinsics.EZpvd((java.lang.Object) strategy, (java.lang.Object) TxToastCheckRes.RESULT_STRATEGY_PERMIT2) || Intrinsics.EZpvd((java.lang.Object) strategy, (java.lang.Object) TxToastCheckRes.RESULT_STRATEGY_PERMIT)) {
                            c20191gcI = new C20335geu();
                        } else {
                            c20191gcI = new C20290geB();
                        }
                    } else if (!c10854bwMDHguZz.iRxXKY()) {
                        c20191gcI = new C20290geB();
                    } else if (((C12152chZ) oKWBaseTransaction).values()) {
                        c20191gcI = new C20330gep();
                    } else {
                        c20191gcI = new C20324gej();
                    }
                    break;
                case 4:
                    if (c10854bwMDHguZz.DarRvM()) {
                        c20191gcI = new C20274gdm();
                    } else if (c10854bwMDHguZz.run()) {
                        c20191gcI = new C20279gdr();
                    } else {
                        c20191gcI = new C20277gdp();
                    }
                    break;
                case 5:
                    if (oKWBaseTransaction instanceof AbstractC8727bIF) {
                        c20191gcI = new C20368gfa();
                    } else if (oKWBaseTransaction instanceof C12266cjh) {
                        c20191gcI = new C20305geQ();
                    } else if (oKWBaseTransaction instanceof C12207cib) {
                        c20191gcI = C20308geT.Companion.copydefault(getIntent().getExtras());
                    } else if (oKWBaseTransaction instanceof C12149chW) {
                        c20191gcI = new C20371gfd();
                    } else if (oKWBaseTransaction instanceof OKWBaseMultiTransfer) {
                        c20191gcI = C20358gfQ.Companion.EZpvd(getIntent().getExtras());
                    } else if (oKWBaseTransaction.dUDNAs().getFieldNames()) {
                        c20191gcI = C20298geJ.Companion.OLrzqt(getIntent().getExtras());
                    } else if (oKWBaseTransaction.dHguZz().fARcdN()) {
                        c20191gcI = C20445ggy.Companion.copydefault(getIntent().getExtras());
                    } else if (oKWBaseTransaction.dHguZz().getPostValueLengthLimit()) {
                        c20191gcI = C20379gfl.Companion.KWHzl(getIntent().getExtras());
                    } else if (oKWBaseTransaction.dHguZz().DarRvM()) {
                        c20191gcI = C20311geW.Companion.KWHzl(getIntent().getExtras());
                    } else {
                        c20191gcI = C20446ggz.Companion.AEQbTJ(getIntent().getExtras());
                    }
                    break;
                case 6:
                    if (!c10854bwMDHguZz.DCUTEIdCUTEI() && !c10854bwMDHguZz.hCLrkq()) {
                        return;
                    } else {
                        c20191gcI = new C20268gdg();
                    }
                    break;
                default:
                    if (oKWBaseTransaction.dUDNAs().getFieldNames()) {
                        c20191gcI = new C20142gbM();
                    } else if (c10854bwMDHguZz.DarRvM()) {
                        c20191gcI = new C20233gcy();
                    } else if (c10854bwMDHguZz.QkdxfA()) {
                        if (((AbstractC8601bFm) oKWBaseTransaction).ak_()) {
                            c20191gcI = new C20183gcA();
                        } else {
                            c20191gcI = new C20150gbU();
                        }
                    } else if (c10854bwMDHguZz.fARcdN()) {
                        if (((AbstractC8601bFm) oKWBaseTransaction).ak_()) {
                            c20191gcI = new C20183gcA();
                        } else {
                            c20191gcI = new C20232gcx();
                        }
                    } else if (c10854bwMDHguZz.run()) {
                        if (((AbstractC8601bFm) oKWBaseTransaction).ak_()) {
                            c20191gcI = new C20183gcA();
                        } else {
                            c20191gcI = new C20184gcB();
                        }
                    } else {
                        c20191gcI = new C20150gbU();
                    }
                    break;
            }
        }
        getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.DfrfUJ, c20191gcI).commitAllowingStateLoss();
        C32866mlf.onEvent$default("AllConfirmation_Full_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        if (oKWBaseTransaction.OJuSTm().isChangedCustomRpc() || (preExecTransactionResQSLkRj = oKWBaseTransaction.QSLkRj()) == null) {
            return;
        }
        fXJ.KWHzl.copydefault(this, C13754dXa.ActionBar.DfrfUJ, preExecTransactionResQSLkRj);
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
