package o;

import androidx.core.app.NotificationCompat;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.gson.Gson;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bEJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8519bEJ {
    public static SignDataArgs<?> EZpvd;
    public static final C8519bEJ copydefault = new C8519bEJ();
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.bEJ$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.TonWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletType.AAWallet.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[OKWBaseTransaction.TransactionType.values().length];
            try {
                iArr2[OKWBaseTransaction.TransactionType.Transfer.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[OKWBaseTransaction.TransactionType.Approve.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[OKWBaseTransaction.TransactionType.CancelApprove.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[OKWBaseTransaction.TransactionType.DappTransfer.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[OKWBaseTransaction.TransactionType.Message.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[OKWBaseTransaction.TransactionType.Register.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            AEQbTJ = iArr2;
        }
    }

    private C8519bEJ() {
    }

    public final void EZpvd(final int i, final WalletType walletType, final OKWBaseTransaction.TransactionType transactionType, final C10854bwM c10854bwM, final java.lang.String str, final Function1<? super EventData, Unit> function1) {
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.copydefault(Unit.INSTANCE).OLrzqt(yBP.AEQbTJ());
        final Function1 function12 = new Function1() { // from class: o.bEK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8519bEJ.AEQbTJ(i, walletType, transactionType, c10854bwM, str, function1, (Unit) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bEM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8519bEJ.KWHzl(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.bEO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8519bEJ.copydefault((Unit) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bEL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8519bEJ.OLrzqt(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.bEP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8519bEJ.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bEN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8519bEJ.AYXKKw(function14, obj);
            }
        });
    }

    public static final Unit KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(int i, WalletType walletType, OKWBaseTransaction.TransactionType transactionType, C10854bwM c10854bwM, java.lang.String str, Function1 function1, Unit unit) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(unit, "");
        EventData eventData = new EventData();
        eventData.setAct("web3_wallet_transaction");
        java.lang.String str3 = "unknown";
        if (i != 11) {
            switch (i) {
                case 1:
                case 6:
                    str2 = "wallet";
                    break;
                case 2:
                    str2 = "dapp";
                    break;
                case 3:
                    str2 = "dex";
                    break;
                case 4:
                    str2 = "nft";
                    break;
                case 5:
                    str2 = "walletconnect";
                    break;
                case 7:
                    str2 = "defi";
                    break;
                default:
                    str2 = "unknown";
                    break;
            }
        }
        eventData.setSource(str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        switch (TaskDescription.OLrzqt[walletType.ordinal()]) {
            case 1:
                str3 = "HD";
                break;
            case 2:
                str3 = "private key";
                break;
            case 3:
                str3 = "Hardware";
                break;
            case 4:
                str3 = "MPC";
                break;
            case 5:
                str3 = "Ton";
                break;
            case 6:
                str3 = "Smart";
                break;
        }
        linkedHashMap.put("walletType", str3);
        int i2 = TaskDescription.AEQbTJ[transactionType.ordinal()];
        linkedHashMap.put("txType", i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? "contract" : "register" : "sign" : "cancel approve" : "approve" : ExtJson.BRC20TYPE_TRANSFER);
        linkedHashMap.put("chainName", c10854bwM.djBIcL());
        linkedHashMap.put("attr_1", str);
        eventData.setAttrs(linkedHashMap);
        function1.invoke(eventData);
        ReportManager.AEQbTJ.EZpvd(eventData);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Unit unit) {
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(java.lang.Object obj) {
        xZW xzw = xZW.EZpvd;
        java.lang.String json = new Gson().toJson(obj);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return xzw.EZpvd(json);
    }

    public final void KWHzl(int i, @NotNull WalletType walletType, @NotNull OKWBaseTransaction.TransactionType transactionType, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final SignDataArgs<?> signDataArgs) {
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        EZpvd(i, walletType, transactionType, c10854bwM, str, new Function1() { // from class: o.bES
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8519bEJ.EZpvd(str2, signDataArgs, (EventData) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, SignDataArgs signDataArgs, EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "");
        eventData.setCode("1");
        eventData.setMsg(str);
        java.util.Map<java.lang.String, java.lang.String> attrs = eventData.getAttrs();
        Intrinsics.checkNotNullExpressionValue(attrs, "");
        attrs.put(MetricsSQLiteCacheKt.METRICS_PARAMS, copydefault.AEQbTJ(signDataArgs));
        PlatformItem dapp = signDataArgs.getDapp();
        eventData.setPath(dapp != null ? dapp.getUrl() : null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(int i, @NotNull WalletType walletType, @NotNull OKWBaseTransaction.TransactionType transactionType, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull final SignDataArgs<?> signDataArgs, final SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        EZpvd(i, walletType, transactionType, c10854bwM, str, new Function1() { // from class: o.bEQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8519bEJ.EZpvd(signDataArgs, submitTxExpandBean, (EventData) obj);
            }
        });
    }

    public static final Unit EZpvd(SignDataArgs signDataArgs, SubmitTxExpandBean submitTxExpandBean, EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "");
        eventData.setCode("0");
        PlatformItem dapp = signDataArgs.getDapp();
        eventData.setPath(dapp != null ? dapp.getUrl() : null);
        java.util.Map<java.lang.String, java.lang.String> attrs = eventData.getAttrs();
        Intrinsics.checkNotNullExpressionValue(attrs, "");
        attrs.put("passwordSource", (submitTxExpandBean == null || !Intrinsics.EZpvd(submitTxExpandBean.getSilentSign(), java.lang.Boolean.TRUE)) ? "normal" : NotificationCompat.GROUP_KEY_SILENT);
        return Unit.INSTANCE;
    }

    public final void EZpvd(int i, @NotNull WalletType walletType, @NotNull OKWBaseTransaction.TransactionType transactionType, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final SignDataArgs<?> signDataArgs, final SubmitTxExpandBean submitTxExpandBean, @NotNull final BatchBroadcastModel batchBroadcastModel) {
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        Intrinsics.checkNotNullParameter(batchBroadcastModel, "");
        EZpvd = signDataArgs;
        EZpvd(i, walletType, transactionType, c10854bwM, str, new Function1() { // from class: o.bER
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8519bEJ.KWHzl(str2, signDataArgs, batchBroadcastModel, submitTxExpandBean, (EventData) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, SignDataArgs signDataArgs, BatchBroadcastModel batchBroadcastModel, SubmitTxExpandBean submitTxExpandBean, EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "");
        eventData.setCode("2");
        eventData.setMsg(str);
        java.util.Map<java.lang.String, java.lang.String> attrs = eventData.getAttrs();
        Intrinsics.checkNotNullExpressionValue(attrs, "");
        attrs.put(MetricsSQLiteCacheKt.METRICS_PARAMS, copydefault.AEQbTJ(C56424yEw.gEmmrt(C56390yDp.OLrzqt("signData", signDataArgs), C56390yDp.OLrzqt("broadcastModel", batchBroadcastModel))));
        PlatformItem dapp = signDataArgs.getDapp();
        eventData.setPath(dapp != null ? dapp.getUrl() : null);
        java.util.Map<java.lang.String, java.lang.String> attrs2 = eventData.getAttrs();
        Intrinsics.checkNotNullExpressionValue(attrs2, "");
        attrs2.put("passwordSource", (submitTxExpandBean == null || !Intrinsics.EZpvd(submitTxExpandBean.getSilentSign(), java.lang.Boolean.TRUE)) ? "normal" : NotificationCompat.GROUP_KEY_SILENT);
        return Unit.INSTANCE;
    }

    public final void copydefault(int i, @NotNull WalletType walletType, @NotNull OKWBaseTransaction.TransactionType transactionType, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final SignDataArgs<?> signDataArgs, final SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        if (!Intrinsics.EZpvd(signDataArgs, EZpvd)) {
            EZpvd(i, walletType, transactionType, c10854bwM, str, new Function1() { // from class: o.bET
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8519bEJ.EZpvd(str2, signDataArgs, submitTxExpandBean, (EventData) obj);
                }
            });
        }
        EZpvd = null;
    }

    public static final Unit EZpvd(java.lang.String str, SignDataArgs signDataArgs, SubmitTxExpandBean submitTxExpandBean, EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "");
        eventData.setCode("3");
        eventData.setMsg(str);
        java.util.Map<java.lang.String, java.lang.String> attrs = eventData.getAttrs();
        Intrinsics.checkNotNullExpressionValue(attrs, "");
        attrs.put(MetricsSQLiteCacheKt.METRICS_PARAMS, copydefault.AEQbTJ(signDataArgs));
        PlatformItem dapp = signDataArgs.getDapp();
        eventData.setPath(dapp != null ? dapp.getUrl() : null);
        java.util.Map<java.lang.String, java.lang.String> attrs2 = eventData.getAttrs();
        Intrinsics.checkNotNullExpressionValue(attrs2, "");
        attrs2.put("passwordSource", (submitTxExpandBean == null || !Intrinsics.EZpvd(submitTxExpandBean.getSilentSign(), java.lang.Boolean.TRUE)) ? "normal" : NotificationCompat.GROUP_KEY_SILENT);
        return Unit.INSTANCE;
    }
}
