package o;

import android.app.ActivityManager;
import androidx.core.os.BundleKt;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.NewSignCallbackBean;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.web.WebActivity;
import java.net.URLDecoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC26670jgh;
import o.InterfaceC43294rma;
import o.InterfaceC54828xWv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27508jwX {
    public static final C27508jwX AEQbTJ = new C27508jwX();

    private C27508jwX() {
    }

    public static /* synthetic */ void toInvestDetail$default(C27508jwX c27508jwX, android.content.Context context, java.lang.Long l, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        c27508jwX.copydefault(context, l, str, num);
    }

    public final void copydefault(@NotNull android.content.Context context, java.lang.Long l, java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        startInvestDetailActivity$default(this, context, l, num, str, null, false, 24, null);
    }

    public final void OLrzqt(@NotNull android.content.Context context, long j, boolean z, java.util.List<InvestInputData> list, long j2, java.lang.Long l, java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC23992iQx.class).putExtra("investment_id", j).putExtra("is_single", z).putParcelableArrayListExtra("input_list", list != null ? new java.util.ArrayList<>(list) : null).putExtra("chainId", j2).putExtra("relatedInvestmentId", l != null ? l.longValue() : 0L).putExtra("source", str).putExtra("investmentCategory", num).putExtra("poolID", str2).putExtra("walletAddress", str3));
    }

    public final void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        toWalletHomepageDefiTab$default(this, context, null, 1, null);
    }

    public static /* synthetic */ void openUrl$default(C27508jwX c27508jwX, android.content.Context context, java.lang.String str, boolean z, int i, java.lang.Object obj) throws java.io.UnsupportedEncodingException {
        if ((i & 2) != 0) {
            z = false;
        }
        c27508jwX.copydefault(context, str, z);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z) throws java.io.UnsupportedEncodingException {
        android.app.Activity activityOLrzqt;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.AYXKKw(str, "http", true) || C59449zhJ.AYXKKw(str, "https", true) || C59449zhJ.AYXKKw(str, "/", true)) {
            java.lang.String strDecode = URLDecoder.decode(str, "utf-8");
            if (!z && (activityOLrzqt = C33569myt.OLrzqt(context)) != null) {
                C27508jwX c27508jwX = AEQbTJ;
                Intrinsics.copydefault((java.lang.Object) strDecode);
                c27508jwX.copydefault(activityOLrzqt, strDecode);
                return;
            }
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", strDecode), C56390yDp.OLrzqt("is_skip_storage_permission", java.lang.Boolean.TRUE), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
            return;
        }
        java.lang.String[] strArrKWHzl = C34704nhP.copydefault.KWHzl();
        int length = strArrKWHzl.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (C59449zhJ.AYXKKw(str, strArrKWHzl[i], true)) {
                    break;
                } else {
                    i++;
                }
            } else if (!C59449zhJ.AYXKKw(str, "okx", true) && !C59449zhJ.AYXKKw(str, "okex", true)) {
                return;
            }
        }
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC23916iOb.class), context, str, null, new Function1() { // from class: o.jxh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27508jwX.AYXKKw((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit AYXKKw(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void toInvestHomepage$default(C27508jwX c27508jwX, android.content.Context context, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        c27508jwX.OLrzqt(context, bundle);
    }

    public final void OLrzqt(@NotNull android.content.Context context, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        C34704nhP c34704nhP = C34704nhP.copydefault;
        java.lang.String strAEQbTJ = (java.lang.String) yDV.zsXlph(c34704nhP.KWHzl());
        if (strAEQbTJ == null) {
            strAEQbTJ = c34704nhP.AEQbTJ();
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = C56390yDp.OLrzqt("source", C33129mqd.gEmmrt(bundle != null ? bundle.getString("source") : null));
        pairArr[1] = C56390yDp.OLrzqt("defiTabId", java.lang.Integer.valueOf(C33129mqd.AhwBna(bundle != null ? java.lang.Integer.valueOf(bundle.getInt("defiTabId")) : null)));
        java.util.Map<java.lang.String, ? extends java.lang.Object> mapGEmmrt = C56424yEw.gEmmrt(pairArr);
        ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).KWHzl(context, strAEQbTJ + "://wallet/invest/home", mapGEmmrt, new Function1() { // from class: o.jxa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27508jwX.djBIcL((AbstractC43238rlX) obj);
            }
        });
    }

    public static final Unit djBIcL(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jwX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void toWalletHomepageDefiTab$default(C27508jwX c27508jwX, android.content.Context context, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: o.jwZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C27508jwX.AhwBna((AbstractC43238rlX) obj2);
                }
            };
        }
        c27508jwX.EZpvd(context, function1);
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull final Function1<? super AbstractC43238rlX, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C34704nhP c34704nhP = C34704nhP.copydefault;
        java.lang.String strAEQbTJ = (java.lang.String) yDV.zsXlph(c34704nhP.KWHzl());
        if (strAEQbTJ == null) {
            strAEQbTJ = c34704nhP.AEQbTJ();
        }
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC23916iOb.class), context, strAEQbTJ + "://" + DeeplinkMode.WALLET.getMode() + "/wallet/home/defi", null, new Function1() { // from class: o.jxd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27508jwX.KWHzl(function1, (AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit KWHzl(Function1 function1, AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        function1.invoke(abstractC43238rlX);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void toTransactionResultPage$default(C27508jwX c27508jwX, android.content.Context context, android.os.Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData, int i, java.lang.Integer num, TransactionConfig transactionConfig, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        c27508jwX.OLrzqt(context, bundle, transactionResultExtraData, i, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : transactionConfig);
    }

    public final void OLrzqt(@NotNull android.content.Context context, android.os.Bundle bundle, @NotNull InvestTradeManager.TransactionResultExtraData transactionResultExtraData, int i, java.lang.Integer num, TransactionConfig transactionConfig) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) InvestTransactionResultActivity.class);
        if (bundle != null) {
            bundle.putParcelable("key.trx_config", transactionConfig);
            intent.putExtra("bundle", bundle);
        }
        context.startActivity(intent.putExtra("extraData", transactionResultExtraData).putExtra("investmentCategory", i).putExtra("investProduct", num));
    }

    public final void copydefault(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) iVU.class).putExtra("txHash", str).putExtra("uopHash", str2).putExtra("source", str3));
    }

    public static /* synthetic */ void startInvestDetailActivity$default(C27508jwX c27508jwX, android.content.Context context, java.lang.Long l, java.lang.Integer num, java.lang.String str, java.lang.Long l2, boolean z, int i, java.lang.Object obj) {
        c27508jwX.EZpvd(context, l, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? false : z);
    }

    public final void EZpvd(@NotNull android.content.Context context, java.lang.Long l, java.lang.Integer num, java.lang.String str, java.lang.Long l2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        C27542jxE.copydefault.OLrzqt(context, l, l2, str, num, z);
    }

    public final void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) iPX.class));
    }

    public final void OLrzqt(@NotNull android.content.Context context, long j, long j2, @NotNull java.lang.String str, boolean z, java.util.List<InvestInputData> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        TransactionConfig transactionConfigOLrzqt = OLrzqt(j, j2, z, list == null ? new java.util.ArrayList() : (java.util.ArrayList) list, str, 6);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC26830jji.class);
        intent.putExtra("key.trx_config", transactionConfigOLrzqt);
        context.startActivity(intent);
    }

    public final void EZpvd(@NotNull android.content.Context context, long j, long j2, @NotNull java.lang.String str, boolean z, java.util.List<InvestInputData> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        context.startActivity(KWHzl(context, OLrzqt(j, j2, z, list, str, 4)));
    }

    public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull TransactionConfig transactionConfig) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) ABTestManager.AEQbTJ.AEQbTJ("mobile_defi_univ3_redeem_v2_enabled", AmplitudeName.WEB3), (java.lang.Object) "true");
        pUU.EZpvd("Univ3Zap", "AB = " + zEZpvd);
        if (zEZpvd) {
            return ActivityC26670jgh.Activity.intent$default(ActivityC26670jgh.Companion, context, transactionConfig, 0, 4, null);
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC26853jkE.class);
        intent.putExtra("key.trx_config", transactionConfig);
        return intent;
    }

    public final void AEQbTJ(@NotNull android.content.Context context, long j, long j2, @NotNull java.lang.String str, boolean z, java.util.List<InvestInputData> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        TransactionConfig transactionConfigOLrzqt = OLrzqt(j, j2, z, list, str, 5);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC26816jjU.class);
        intent.putExtra("key.trx_config", transactionConfigOLrzqt);
        context.startActivity(intent);
    }

    public final TransactionConfig OLrzqt(long j, long j2, boolean z, java.util.List<InvestInputData> list, java.lang.String str, int i) {
        java.util.ArrayList arrayList;
        if (list == null) {
            arrayList = new java.util.ArrayList();
        } else {
            arrayList = (java.util.ArrayList) list;
        }
        return new TransactionConfig(0, i, j, z, 0L, j2, null, null, arrayList, -1, null, 0L, 0, str, null, null, null, null, false, false, null, null, false, false, null, 33545424, null);
    }

    public final void EZpvd(@NotNull android.content.Context context, long j, long j2, @NotNull java.lang.String str, boolean z, java.util.ArrayList<InvestInputData> arrayList, InvestPoolV3 investPoolV3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        TransactionConfig transactionConfigOLrzqt = OLrzqt(j, j2, z, arrayList, str, 3);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) InvestUniv3SubscribeActivity.class);
        intent.putExtra("key.trx_config", transactionConfigOLrzqt);
        intent.putExtra("poolInvestV3", investPoolV3);
        context.startActivity(intent);
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC26379jbH.class));
    }

    public final void OLrzqt(@NotNull android.content.Context context, long j, long j2, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC26384jbM.class);
        intent.putExtra("investment_id", j);
        intent.putExtra("chainId", j2);
        intent.putExtra("investType", i);
        intent.putExtra("poolVersion", i2);
        context.startActivity(intent);
    }

    public static /* synthetic */ void startInvestSingleHomeActivity$default(C27508jwX c27508jwX, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c27508jwX.OLrzqt(context, str);
    }

    public final void OLrzqt(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC25487ixe.class);
        intent.putExtra("source", str);
        context.startActivity(intent);
    }

    public final void copydefault(@NotNull android.app.Activity activity, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String[] strArrKWHzl = C34704nhP.copydefault.KWHzl();
        int length = strArrKWHzl.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (C59449zhJ.AYXKKw(str, strArrKWHzl[i], true)) {
                    break;
                } else {
                    i++;
                }
            } else if (!C59449zhJ.AYXKKw(str, "okx", true) && !C59449zhJ.AYXKKw(str, "okex", true)) {
                InterfaceC54828xWv.ActionBar.enterDAppWebView$default((InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC23916iOb.class), activity, str, null, null, null, null, null, "defi", 96, null);
                return;
            }
        }
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC23916iOb.class), activity, str, null, new Function1() { // from class: o.jwY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27508jwX.valueOf((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit valueOf(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void dashboardGotoDAPPPage$default(C27508jwX c27508jwX, android.app.Activity activity, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            fragmentManager = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        c27508jwX.KWHzl(activity, str, fragmentManager, num);
    }

    public final void KWHzl(@NotNull android.app.Activity activity, @NotNull java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String[] strArrKWHzl = C34704nhP.copydefault.KWHzl();
        int length = strArrKWHzl.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (C59449zhJ.AYXKKw(str, strArrKWHzl[i], true)) {
                    break;
                } else {
                    i++;
                }
            } else if (!C59449zhJ.AYXKKw(str, "okx", true) && !C59449zhJ.AYXKKw(str, "okex", true)) {
                InterfaceC54828xWv.ActionBar.enterDAppWebView$default((InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC23916iOb.class), activity, str, null, null, null, null, null, "wallet_defi", fragmentManager, num, null, 1120, null);
                return;
            }
        }
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC23916iOb.class), activity, str, null, new Function1() { // from class: o.jxb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27508jwX.gEmmrt((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit gEmmrt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jgh.Activity.intent$default(o.jgh$Activity, android.content.Context, com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig, int, int, java.lang.Object):android.content.Intent */
    public final void AEQbTJ(@NotNull android.content.Context context, long j, boolean z, java.util.List<InvestInputData> list, long j2, java.lang.Long l, java.lang.String str, java.lang.Integer num, java.lang.String str2, int i, int i2, java.lang.Integer num2, InvestOrder investOrder, @NotNull TransactionMethod transactionMethod, boolean z2) {
        java.util.ArrayList arrayListCopydefault;
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(transactionMethod, "");
        long jLongValue = l != null ? l.longValue() : 0L;
        if (list != null) {
            arrayList = new java.util.ArrayList(list);
        } else {
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                InvestInputData[] investInputDataArr = new InvestInputData[1];
                investInputDataArr[0] = new InvestInputData(investOrder != null ? investOrder.getStakedAmount() : null, (java.lang.String) null, (java.lang.String) null, false, true, 14, (DefaultConstructorMarker) null);
                arrayListCopydefault = yDY.copydefault(investInputDataArr);
            } else {
                arrayListCopydefault = new java.util.ArrayList();
            }
            arrayList = arrayListCopydefault;
        }
        context.startActivity(ActivityC26670jgh.Activity.intent$default(ActivityC26670jgh.Companion, context, new TransactionConfig(num != null ? num.intValue() : 0, i, j, z, jLongValue, j2, str2 == null ? "" : str2, str == null ? "" : str, arrayList, i2, num2, 0L, 0, null, investOrder, transactionMethod, null, null, z2, false, null, null, false, false, null, 33241088, null), 0, 4, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.jwX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startContractInteraction$default(C27508jwX c27508jwX, android.content.Context context, DappInteractionArgs dappInteractionArgs, Function1 function1, Function1 function12, Function1 function13, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function13 = null;
        }
        c27508jwX.EZpvd(context, dappInteractionArgs, (Function1<? super android.os.Bundle, Unit>) function1, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function12, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function13);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jwX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startSignDapp$default(C27508jwX c27508jwX, android.content.Context context, DappSignArgs dappSignArgs, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function12 = null;
        }
        c27508jwX.copydefault(context, dappSignArgs, (Function1<? super android.os.Bundle, Unit>) function1, (Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function12);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC26413jbp.class);
        intent.putExtra("specialZoneTabId", i);
        context.startActivity(intent);
    }

    public final void EZpvd(@NotNull android.content.Context context, int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC24156iWz.class);
        intent.putExtra("aggregate_tab_id", i);
        intent.putExtra("aggregate_item_key", str);
        intent.putExtra("aggregate_token_amount", str2);
        intent.putExtra("aggregate_source", str3);
        context.startActivity(intent);
    }

    public final boolean EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        java.util.Iterator<ActivityManager.AppTask> it = ((android.app.ActivityManager) systemService).getAppTasks().iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            android.content.ComponentName componentName = taskInfo != null ? taskInfo.topActivity : null;
            if (Intrinsics.EZpvd((java.lang.Object) (componentName != null ? componentName.getClassName() : null), (java.lang.Object) ActivityC25487ixe.class.getName())) {
                return true;
            }
        }
        return false;
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).AEQbTJ(context, dappInteractionArgs, function1, function12, function13);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull DappSignArgs dappSignArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappSignArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).EZpvd(context, dappSignArgs, function1, function12);
    }
}
