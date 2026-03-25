package o;

import android.app.Activity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.business.defi.biz.constant.EOSState;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.scan.EnCodeResult;
import com.okinc.business.defi.biz.core.scan.EosOpenInfo;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.tx.check.ChainCheckType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.ScanStatusResponseBody;
import com.okinc.business.defi.biz.net.bean.UploadScanStatusRequestBody;
import com.okinc.business.defi.biz.walletconnect.ShowWCAuthRequestArgs;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult;
import com.okinc.business.defi.wallet.home.ScanResultHandlerImpl$handleScanResult$1;
import com.okinc.business.defi.wallet.home.WcConnectExtra;
import com.okinc.business.defi.wallet.mine.scan.bean.MpcQRCodeParseBean;
import com.okinc.core.util.ScannerActivity;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractActivityC33041mov;
import o.ActivityC18887fqr;
import o.C10525bqB;
import o.C12827cuN;
import o.C13754dXa;
import o.C54819xWm;
import o.C8347bAx;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eTg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15733eTg implements InterfaceC15734eTh {

    /* JADX INFO: renamed from: o.eTg$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChainStatus.values().length];
            try {
                iArr[ChainStatus.CANNOT_TRANSFER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChainStatus.UNREGISTERED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChainStatus.REGISTERING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ChainStatus.REGISTERED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX INFO: renamed from: o.eTg$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.InterfaceC15734eTh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, WcConnectExtra wcConnectExtra, @NotNull Continuation<? super Unit> continuation) {
        ScanResultHandlerImpl$handleScanResult$1 scanResultHandlerImpl$handleScanResult$1;
        final AbstractActivityC33041mov abstractActivityC33041mov2;
        C15733eTg c15733eTg;
        final java.lang.String str2;
        WcConnectExtra wcConnectExtra2;
        if (continuation instanceof ScanResultHandlerImpl$handleScanResult$1) {
            scanResultHandlerImpl$handleScanResult$1 = (ScanResultHandlerImpl$handleScanResult$1) continuation;
            int i = scanResultHandlerImpl$handleScanResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scanResultHandlerImpl$handleScanResult$1.label = i - Integer.MIN_VALUE;
            } else {
                scanResultHandlerImpl$handleScanResult$1 = new ScanResultHandlerImpl$handleScanResult$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = scanResultHandlerImpl$handleScanResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = scanResultHandlerImpl$handleScanResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C8349bAz c8349bAz = C8349bAz.OLrzqt;
            scanResultHandlerImpl$handleScanResult$1.L$0 = this;
            abstractActivityC33041mov2 = abstractActivityC33041mov;
            scanResultHandlerImpl$handleScanResult$1.L$1 = abstractActivityC33041mov2;
            scanResultHandlerImpl$handleScanResult$1.L$2 = str;
            scanResultHandlerImpl$handleScanResult$1.L$3 = wcConnectExtra;
            scanResultHandlerImpl$handleScanResult$1.label = 1;
            objOLrzqt = c8349bAz.OLrzqt(str, scanResultHandlerImpl$handleScanResult$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c15733eTg = this;
            str2 = str;
            wcConnectExtra2 = wcConnectExtra;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                return Unit.INSTANCE;
            }
            wcConnectExtra2 = (WcConnectExtra) scanResultHandlerImpl$handleScanResult$1.L$3;
            java.lang.String str3 = (java.lang.String) scanResultHandlerImpl$handleScanResult$1.L$2;
            AbstractActivityC33041mov abstractActivityC33041mov3 = (AbstractActivityC33041mov) scanResultHandlerImpl$handleScanResult$1.L$1;
            C15733eTg c15733eTg2 = (C15733eTg) scanResultHandlerImpl$handleScanResult$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            str2 = str3;
            abstractActivityC33041mov2 = abstractActivityC33041mov3;
            c15733eTg = c15733eTg2;
        }
        final EnCodeResult enCodeResult = (EnCodeResult) objOLrzqt;
        if (enCodeResult.getParsed()) {
            int type = enCodeResult.getType();
            if (type != 11) {
                switch (type) {
                    case 1:
                        final C15733eTg c15733eTg3 = c15733eTg;
                        c15733eTg3.copydefault(abstractActivityC33041mov2, new Function0() { // from class: o.eTp
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C15733eTg.EZpvd(enCodeResult, c15733eTg3, abstractActivityC33041mov2);
                            }
                        });
                        break;
                    case 2:
                        if (enCodeResult.getData() instanceof EosOpenInfo) {
                            EosOpenInfo eosOpenInfo = (EosOpenInfo) enCodeResult.getData();
                            ActivityC18568fkp.Companion.AEQbTJ(abstractActivityC33041mov2, (28 & 2) != 0 ? "" : null, (28 & 4) != 0 ? "" : eosOpenInfo.getAccountName(), (28 & 8) != 0 ? "" : eosOpenInfo.getActiveKey(), (28 & 16) != 0 ? "" : eosOpenInfo.getOwnerKey());
                            c15733eTg.KWHzl(abstractActivityC33041mov2);
                        }
                        break;
                    case 3:
                        c15733eTg.copydefault(abstractActivityC33041mov2, str2, wcConnectExtra2, C56443yFo.AEQbTJ(0));
                        break;
                    case 4:
                        c15733eTg.copydefault(abstractActivityC33041mov2, StringsKt__StringsKt.KWHzl(str2, (java.lang.CharSequence) "okx_metax:"), wcConnectExtra2, C56443yFo.AEQbTJ(1));
                        break;
                    case 5:
                        if (abstractActivityC33041mov2 instanceof ScannerActivity) {
                            abstractActivityC33041mov2.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.business.defi.wallet.home.ScanResultHandlerImpl$handleScanResult$5
                                @Override // androidx.lifecycle.DefaultLifecycleObserver
                                public void onDestroy(LifecycleOwner lifecycleOwner) {
                                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                                    super.onDestroy(lifecycleOwner);
                                    C8347bAx c8347bAx = C8347bAx.EZpvd;
                                    Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                                    c8347bAx.EZpvd(activityAEQbTJ instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityAEQbTJ : null, str2);
                                    abstractActivityC33041mov2.getLifecycle().removeObserver(this);
                                }
                            });
                            c15733eTg.KWHzl(abstractActivityC33041mov2);
                        } else {
                            C8347bAx.EZpvd.EZpvd(abstractActivityC33041mov2, str2);
                        }
                        break;
                    case 6:
                        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), abstractActivityC33041mov2, str2, null, new Function1() { // from class: o.eTr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C15733eTg.AEQbTJ((AbstractC43238rlX) obj);
                            }
                        }, 4, null);
                        c15733eTg.KWHzl(abstractActivityC33041mov2);
                        break;
                    case 7:
                        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), abstractActivityC33041mov2, str2, null, new Function1() { // from class: o.eTs
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C15733eTg.OLrzqt((AbstractC43238rlX) obj);
                            }
                        }, 4, null);
                        c15733eTg.KWHzl(abstractActivityC33041mov2);
                        break;
                    case 8:
                        c15733eTg.OLrzqt(abstractActivityC33041mov2, enCodeResult);
                        break;
                    default:
                        c15733eTg.OLrzqt(abstractActivityC33041mov2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.profile));
                        break;
                }
            } else {
                scanResultHandlerImpl$handleScanResult$1.L$0 = null;
                scanResultHandlerImpl$handleScanResult$1.L$1 = null;
                scanResultHandlerImpl$handleScanResult$1.L$2 = null;
                scanResultHandlerImpl$handleScanResult$1.L$3 = null;
                scanResultHandlerImpl$handleScanResult$1.label = 2;
                if (c15733eTg.OLrzqt(abstractActivityC33041mov2, str2, wcConnectExtra2, scanResultHandlerImpl$handleScanResult$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        } else {
            c15733eTg.OLrzqt(abstractActivityC33041mov2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.profile));
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(EnCodeResult enCodeResult, C15733eTg c15733eTg, AbstractActivityC33041mov abstractActivityC33041mov) {
        java.lang.Object data = enCodeResult.getData();
        if (data instanceof TransactionInfo) {
            c15733eTg.OLrzqt(abstractActivityC33041mov, (TransactionInfo) data);
        } else {
            c15733eTg.OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.hOMIpD));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, final Function0<Unit> function0) {
        C11607cUn.subscribeOnIO$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), (Function1) null, new Function1() { // from class: o.eTt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15733eTg.EZpvd(this.EZpvd, abstractActivityC33041mov, function0, (AbstractC12782ctV) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(C15733eTg c15733eTg, AbstractActivityC33041mov abstractActivityC33041mov, Function0 function0, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (abstractC12782ctV.QfsBiF()) {
            c15733eTg.OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPfvRMlC));
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    public final void OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, final TransactionInfo transactionInfo) {
        C10854bwM c10854bwMAhwBna;
        final java.util.List<C10854bwM> listKWHzl = C8349bAz.OLrzqt.KWHzl(transactionInfo);
        if (!listKWHzl.isEmpty()) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl);
            java.lang.String lowerCase = transactionInfo.getName().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (Intrinsics.EZpvd((java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) lowerCase).toString(), (java.lang.Object) "eos") && (c10854bwMAhwBna = C10954byG.EZpvd.valueOf().AhwBna()) != null) {
                transactionInfo.setName(c10854bwMAhwBna.AwvSrB());
                transactionInfo.setTokenId(java.lang.String.valueOf(c10854bwMAhwBna.AhwBna()));
            }
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
            final Function1 function1 = new Function1() { // from class: o.eTf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15733eTg.copydefault(objectRef, transactionInfo, listKWHzl, (AbstractC12782ctV) obj);
                }
            };
            AbstractC58260yxt<R> abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.eTv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C15733eTg.fJNWhG(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.eTC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15733eTg.KWHzl(objectRef, objectRef2, this, abstractActivityC33041mov, transactionInfo, (java.util.ArrayList) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eTz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15733eTg.ejfBZ(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.eTB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15733eTg.KWHzl(this.EZpvd, abstractActivityC33041mov, objectRef, objectRef2, (java.lang.Throwable) obj);
                }
            };
            Intrinsics.copydefault(abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eTA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15733eTg.fARcdN(function13, obj);
                }
            }));
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) transactionInfo.getContractAddress()) && C33129mqd.OLrzqt((java.lang.CharSequence) transactionInfo.getNetwork())) {
            java.lang.String string = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.otherwise);
            Intrinsics.checkNotNullExpressionValue(string, "");
            OLrzqt(abstractActivityC33041mov, string);
        } else {
            java.lang.String string2 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.hOMIpD);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            OLrzqt(abstractActivityC33041mov, string2);
        }
    }

    public static final java.util.ArrayList fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r27v0, resolved type: o.ctV */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.util.ArrayList copydefault(Ref.ObjectRef objectRef, TransactionInfo transactionInfo, java.util.List list, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        objectRef.element = abstractC12782ctV;
        if (abstractC12782ctV == 0) {
            return null;
        }
        if (transactionInfo.getContractAddress().length() == 0) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(java.lang.Long.valueOf(((C10854bwM) it.next()).AEQbTJ()));
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            T t = objectRef.element;
            Intrinsics.copydefault(t);
            for (C10594brR c10594brR : ((AbstractC12782ctV) t).QkdxfA()) {
                if (hashSet.contains(java.lang.Long.valueOf(c10594brR.KWHzl().EZpvd()))) {
                    C10525bqB c10525bqBFromCoinMeta$default = C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10594brR.fetchVPNInfo().AEQbTJ(), abstractC12782ctV, null, 4, null);
                    C10525bqB.setValues$default(c10525bqBFromCoinMeta$default, c10594brR.values(), c10594brR.AhwBna(), "0.00", "", null, null, null, null, null, 16, null);
                    arrayList.add(c10525bqBFromCoinMeta$default);
                }
            }
            T t2 = objectRef.element;
            Intrinsics.copydefault(t2);
            for (C10525bqB c10525bqB : ((AbstractC12782ctV) t2).QHmsKR()) {
                if (hashSet.contains(java.lang.Long.valueOf(c10525bqB.AEQbTJ()))) {
                    arrayList.add(c10525bqB);
                }
            }
            return arrayList;
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            hashSet2.add(java.lang.Long.valueOf(((C10854bwM) it2.next()).AhwBna()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        T t3 = objectRef.element;
        Intrinsics.copydefault(t3);
        for (C10594brR c10594brR2 : ((AbstractC12782ctV) t3).QkdxfA()) {
            if (hashSet2.contains(java.lang.Long.valueOf(c10594brR2.OLrzqt()))) {
                C10525bqB c10525bqBFromCoinMeta$default2 = C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10594brR2.fetchVPNInfo().AEQbTJ(), abstractC12782ctV, null, 4, null);
                C10525bqB.setValues$default(c10525bqBFromCoinMeta$default2, c10594brR2.values(), c10594brR2.AhwBna(), "0.00", "", null, null, null, null, null, 16, null);
                arrayList2.add(c10525bqBFromCoinMeta$default2);
            }
        }
        T t4 = objectRef.element;
        Intrinsics.copydefault(t4);
        for (C10525bqB c10525bqB2 : ((AbstractC12782ctV) t4).QHmsKR()) {
            if (hashSet2.contains(java.lang.Long.valueOf(c10525bqB2.OLrzqt()))) {
                arrayList2.add(c10525bqB2);
            }
        }
        return arrayList2;
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v35, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v24, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v49, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v52, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v55, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v58, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v62, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v72, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v76, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v17, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c3  */
    /* JADX WARN: Type inference failed for: r10v13, types: [T, o.bwM] */
    /* JADX WARN: Type inference failed for: r3v13, types: [T, o.bwM] */
    /* JADX WARN: Type inference failed for: r3v40, types: [T, o.bwM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, C15733eTg c15733eTg, AbstractActivityC33041mov abstractActivityC33041mov, TransactionInfo transactionInfo, java.util.ArrayList arrayList) {
        AbstractC12782ctV abstractC12782ctV;
        AbstractC12782ctV abstractC12782ctV2;
        AbstractC12782ctV abstractC12782ctV3;
        long jAhwBna;
        long j;
        boolean z;
        AbstractC12782ctV abstractC12782ctV4;
        java.util.List<C10525bqB> listFARcdN;
        int i;
        java.lang.String strZuBGHE;
        C10854bwM c10854bwMKWHzl;
        ChainAddress chainAddressAddressFromChainId$default;
        java.lang.String strDbNXlk;
        int i2;
        java.lang.String strZuBGHE2;
        ChainAddress chainAddressAddressFromChainId$default2;
        java.lang.String strDbNXlk2;
        AbstractC12782ctV abstractC12782ctV5;
        java.util.List<C10525bqB> listFARcdN2;
        ChainAddress chainAddressAddressFromChainId$default3;
        java.lang.String strDbNXlk3;
        if (arrayList == null || arrayList.isEmpty() || (((abstractC12782ctV = (AbstractC12782ctV) objectRef.element) != null && abstractC12782ctV.QfsBiF()) || (((abstractC12782ctV2 = (AbstractC12782ctV) objectRef.element) != null && abstractC12782ctV2.sSMYrx() && !LedgerSignHelper.AEQbTJ.KWHzl((C10854bwM) objectRef2.element)) || ((abstractC12782ctV3 = (AbstractC12782ctV) objectRef.element) != null && abstractC12782ctV3.getFieldNames() && ((C10854bwM) objectRef2.element).QHmsKR())))) {
            c15733eTg.OLrzqt(abstractActivityC33041mov, (AbstractC12782ctV) objectRef.element, (C10854bwM) objectRef2.element);
        } else {
            java.lang.String address = null;
            java.lang.String str = "";
            if (arrayList.size() == 1) {
                ?? KWHzl = ((C10525bqB) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).KWHzl();
                objectRef2.element = KWHzl;
                java.lang.String strValues = KWHzl.values();
                java.util.Locale locale = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = strValues.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "eos") && c15733eTg.EZpvd((AbstractC12782ctV) objectRef.element, (C10854bwM) objectRef2.element)) {
                    java.lang.String string = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.ORWKdN);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    c15733eTg.OLrzqt(abstractActivityC33041mov, string);
                } else {
                    transactionInfo.setTokenId(java.lang.String.valueOf(((C10854bwM) objectRef2.element).AhwBna()));
                    C10525bqB c10525bqB = (C10525bqB) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
                    C10854bwM c10854bwMKWHzl2 = ((C10854bwM) objectRef2.element).KWHzl();
                    if (c10854bwMKWHzl2 != null && c10854bwMKWHzl2.heceqZ()) {
                        if (C33129mqd.valueOf(c10525bqB.copydefault(), "0")) {
                            C20690gle c20690gle = C20690gle.OLrzqt;
                            AbstractC12782ctV abstractC12782ctV6 = (AbstractC12782ctV) objectRef.element;
                            java.lang.String str2 = (abstractC12782ctV6 == null || (strDbNXlk3 = abstractC12782ctV6.DbNXlk()) == null) ? "" : strDbNXlk3;
                            long jAhwBna2 = ((C10854bwM) objectRef2.element).AhwBna();
                            C10854bwM c10854bwMKWHzl3 = ((C10854bwM) objectRef2.element).KWHzl();
                            if (c10854bwMKWHzl3 != null) {
                                long jAEQbTJ = c10854bwMKWHzl3.AEQbTJ();
                                AbstractC12782ctV abstractC12782ctV7 = (AbstractC12782ctV) objectRef.element;
                                if (abstractC12782ctV7 != null && (chainAddressAddressFromChainId$default3 = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV7, jAEQbTJ, null, 2, null)) != null) {
                                    address = chainAddressAddressFromChainId$default3.getAddress();
                                }
                                if (address != null) {
                                    str = address;
                                }
                            }
                            c20690gle.KWHzl((106 & 1) != 0 ? null : null, (106 & 2) != 0 ? null : abstractActivityC33041mov, str2, (106 & 8) != 0 ? null : java.lang.Long.valueOf(jAhwBna2), str, (106 & 32) != 0 ? null : transactionInfo, (106 & 64) != 0 ? false : false, (106 & 128) != 0 ? null : null);
                            c15733eTg.KWHzl(abstractActivityC33041mov);
                        } else {
                            c15733eTg.OLrzqt(abstractActivityC33041mov, (C10854bwM) objectRef2.element, (AbstractC12782ctV) objectRef.element, transactionInfo);
                        }
                    } else {
                        C10854bwM c10854bwMKWHzl4 = ((C10854bwM) objectRef2.element).KWHzl();
                        if (c10854bwMKWHzl4 != null && c10854bwMKWHzl4.hCLrkq()) {
                            c15733eTg.OLrzqt(abstractActivityC33041mov, (C10854bwM) objectRef2.element, (AbstractC12782ctV) objectRef.element, transactionInfo);
                        } else {
                            C10854bwM c10854bwMKWHzl5 = ((C10854bwM) objectRef2.element).KWHzl();
                            if (c10854bwMKWHzl5 != null && c10854bwMKWHzl5.DCUTEIdCUTEI()) {
                                c15733eTg.OLrzqt(abstractActivityC33041mov, (C10854bwM) objectRef2.element, (AbstractC12782ctV) objectRef.element, transactionInfo);
                            } else {
                                C10854bwM c10854bwMKWHzl6 = ((C10854bwM) objectRef2.element).KWHzl();
                                if (c10854bwMKWHzl6 != null && c10854bwMKWHzl6.QCjLjM()) {
                                    c15733eTg.OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.Dmq));
                                } else {
                                    if (!((C10854bwM) objectRef2.element).dxcTrN() || (abstractC12782ctV5 = (AbstractC12782ctV) objectRef.element) == null || (listFARcdN2 = abstractC12782ctV5.fARcdN(((C10854bwM) objectRef2.element).AhwBna())) == null) {
                                        i2 = 0;
                                        strZuBGHE2 = "";
                                    } else {
                                        i2 = 0;
                                        strZuBGHE2 = "";
                                        for (C10525bqB c10525bqB2 : listFARcdN2) {
                                            if (C33129mqd.AEQbTJ(c10525bqB2.copydefault(), "0")) {
                                                i2++;
                                                strZuBGHE2 = c10525bqB2.zuBGHE();
                                            }
                                        }
                                    }
                                    C20690gle c20690gle2 = C20690gle.OLrzqt;
                                    AbstractC12782ctV abstractC12782ctV8 = (AbstractC12782ctV) objectRef.element;
                                    java.lang.String str3 = (abstractC12782ctV8 == null || (strDbNXlk2 = abstractC12782ctV8.DbNXlk()) == null) ? "" : strDbNXlk2;
                                    long jAhwBna3 = ((C10854bwM) objectRef2.element).AhwBna();
                                    if (i2 == 1) {
                                        str = strZuBGHE2;
                                    } else {
                                        C10854bwM c10854bwMKWHzl7 = ((C10854bwM) objectRef2.element).KWHzl();
                                        if (c10854bwMKWHzl7 != null) {
                                            long jAEQbTJ2 = c10854bwMKWHzl7.AEQbTJ();
                                            AbstractC12782ctV abstractC12782ctV9 = (AbstractC12782ctV) objectRef.element;
                                            if (abstractC12782ctV9 != null && (chainAddressAddressFromChainId$default2 = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV9, jAEQbTJ2, null, 2, null)) != null) {
                                                address = chainAddressAddressFromChainId$default2.getAddress();
                                            }
                                            if (address != null) {
                                                str = address;
                                            }
                                        }
                                    }
                                    c20690gle2.KWHzl((106 & 1) != 0 ? null : null, (106 & 2) != 0 ? null : abstractActivityC33041mov, str3, (106 & 8) != 0 ? null : java.lang.Long.valueOf(jAhwBna3), str, (106 & 32) != 0 ? null : transactionInfo, (106 & 64) != 0 ? false : i2 > 1, (106 & 128) != 0 ? null : null);
                                    c15733eTg.KWHzl(abstractActivityC33041mov);
                                }
                            }
                        }
                    }
                }
            } else {
                if (C33129mqd.AEQbTJ(transactionInfo.getAmount(), "0.0") && C33129mqd.OLrzqt((java.lang.CharSequence) transactionInfo.getNetwork())) {
                    C10854bwM c10854bwMKWHzl8 = C10954byG.EZpvd.valueOf().KWHzl(transactionInfo.getNetwork());
                    transactionInfo.setTokenId(C33129mqd.gEmmrt(c10854bwMKWHzl8 != null ? java.lang.Long.valueOf(c10854bwMKWHzl8.AhwBna()) : null));
                } else {
                    java.util.ArrayList<C10525bqB> arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : arrayList) {
                        if (C33129mqd.AEQbTJ(((C10525bqB) obj).copydefault(), "0")) {
                            arrayList2.add(obj);
                        }
                    }
                    int size = arrayList2.size();
                    if (size == 0) {
                        objectRef2.element = ((C10525bqB) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).KWHzl();
                        jAhwBna = ((C10525bqB) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).KWHzl().AhwBna();
                    } else if (size == 1) {
                        objectRef2.element = ((C10525bqB) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList2)).KWHzl();
                        jAhwBna = ((C10525bqB) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList2)).KWHzl().AhwBna();
                    } else {
                        j = -1;
                        z = true;
                        long j2 = -1;
                        for (C10525bqB c10525bqB3 : arrayList2) {
                            long jOLrzqt = c10525bqB3.OLrzqt();
                            java.util.Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                if (c10525bqB3.OLrzqt() != ((C10525bqB) it.next()).OLrzqt()) {
                                    z = false;
                                }
                            }
                            j2 = jOLrzqt;
                        }
                        if (z) {
                            j = j2;
                        }
                        transactionInfo.setTokenId(java.lang.String.valueOf(j));
                        if (!((C10854bwM) objectRef2.element).dxcTrN() && ((C33129mqd.AhwBna(transactionInfo.getTokenId()) != -1 || z) && (abstractC12782ctV4 = (AbstractC12782ctV) objectRef.element) != null && (listFARcdN = abstractC12782ctV4.fARcdN(((C10854bwM) objectRef2.element).AhwBna())) != null)) {
                            i = 0;
                            strZuBGHE = "";
                            for (C10525bqB c10525bqB4 : listFARcdN) {
                                if (C33129mqd.AEQbTJ(c10525bqB4.copydefault(), "0")) {
                                    i++;
                                    strZuBGHE = c10525bqB4.zuBGHE();
                                }
                            }
                        }
                        C20690gle c20690gle3 = C20690gle.OLrzqt;
                        AbstractC12782ctV abstractC12782ctV10 = (AbstractC12782ctV) objectRef.element;
                        java.lang.String str4 = (abstractC12782ctV10 != null || (strDbNXlk = abstractC12782ctV10.DbNXlk()) == null) ? "" : strDbNXlk;
                        long jValueOf = C33129mqd.valueOf(transactionInfo.getTokenId());
                        if (i != 1) {
                            str = strZuBGHE;
                        } else {
                            C10854bwM c10854bwMKWHzl9 = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(transactionInfo.getTokenId())));
                            if (c10854bwMKWHzl9 != null && (c10854bwMKWHzl = c10854bwMKWHzl9.KWHzl()) != null) {
                                long jAEQbTJ3 = c10854bwMKWHzl.AEQbTJ();
                                AbstractC12782ctV abstractC12782ctV11 = (AbstractC12782ctV) objectRef.element;
                                if (abstractC12782ctV11 != null && (chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV11, jAEQbTJ3, null, 2, null)) != null) {
                                    address = chainAddressAddressFromChainId$default.getAddress();
                                }
                                if (address != null) {
                                    str = address;
                                }
                            }
                        }
                        c20690gle3.KWHzl((106 & 1) != 0 ? null : null, (106 & 2) != 0 ? null : abstractActivityC33041mov, str4, (106 & 8) != 0 ? null : java.lang.Long.valueOf(jValueOf), str, (106 & 32) != 0 ? null : transactionInfo, (106 & 64) != 0 ? false : i <= 1, (106 & 128) != 0 ? null : null);
                        c15733eTg.KWHzl(abstractActivityC33041mov);
                    }
                    j = jAhwBna;
                    z = true;
                    transactionInfo.setTokenId(java.lang.String.valueOf(j));
                    if (!((C10854bwM) objectRef2.element).dxcTrN()) {
                    }
                }
                i = 0;
                strZuBGHE = "";
                C20690gle c20690gle32 = C20690gle.OLrzqt;
                AbstractC12782ctV abstractC12782ctV102 = (AbstractC12782ctV) objectRef.element;
                if (abstractC12782ctV102 != null) {
                    long jValueOf2 = C33129mqd.valueOf(transactionInfo.getTokenId());
                    if (i != 1) {
                    }
                    c20690gle32.KWHzl((106 & 1) != 0 ? null : null, (106 & 2) != 0 ? null : abstractActivityC33041mov, str4, (106 & 8) != 0 ? null : java.lang.Long.valueOf(jValueOf2), str, (106 & 32) != 0 ? null : transactionInfo, (106 & 64) != 0 ? false : i <= 1, (106 & 128) != 0 ? null : null);
                    c15733eTg.KWHzl(abstractActivityC33041mov);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C15733eTg c15733eTg, AbstractActivityC33041mov abstractActivityC33041mov, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, java.lang.Throwable th) {
        c15733eTg.OLrzqt(abstractActivityC33041mov, (AbstractC12782ctV) objectRef.element, (C10854bwM) objectRef2.element);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM) {
        C10854bwM c10854bwMKWHzl;
        if (abstractC12782ctV != null && abstractC12782ctV.QfsBiF()) {
            java.lang.String string = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.HJWChPfvRMlC);
            Intrinsics.checkNotNullExpressionValue(string, "");
            OLrzqt(abstractActivityC33041mov, string);
            return;
        }
        if (abstractC12782ctV != null && abstractC12782ctV.AwvSrB()) {
            if (abstractC12782ctV.AuCTelauCTel() && (c10854bwMKWHzl = c10854bwM.KWHzl()) != null && c10854bwMKWHzl.ejfBZ()) {
                OLrzqt(abstractActivityC33041mov, C33069mpW.KWHzl(abstractActivityC33041mov, C13754dXa.FragmentManager.GiPPlLgiPPlL, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", c10854bwM.fJNWhG()))));
                return;
            } else {
                OLrzqt(abstractActivityC33041mov, C33069mpW.KWHzl(abstractActivityC33041mov, C13754dXa.FragmentManager.HJWChPdNQGVJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chain_name", c10854bwM.djBIcL()))));
                return;
            }
        }
        if (abstractC12782ctV != null && abstractC12782ctV.sSMYrx() && !LedgerSignHelper.AEQbTJ.KWHzl(c10854bwM)) {
            OLrzqt(abstractActivityC33041mov, C33069mpW.KWHzl(abstractActivityC33041mov, C13754dXa.FragmentManager.getExtraBinder, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainname", c10854bwM.djBIcL()))));
            return;
        }
        if (abstractC12782ctV != null && abstractC12782ctV.getFieldNames() && c10854bwM.QHmsKR()) {
            OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setPosition));
            return;
        }
        java.lang.String strValues = c10854bwM.values();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = strValues.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "eos")) {
            java.lang.String string2 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.ORWKdN);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            OLrzqt(abstractActivityC33041mov, string2);
            return;
        }
        OLrzqt(abstractActivityC33041mov, C33069mpW.KWHzl(abstractActivityC33041mov, C13754dXa.FragmentManager.GiPPlLgiPPlL, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", c10854bwM.fJNWhG()))));
    }

    private final boolean EZpvd(AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM) {
        C13852daR c13852daRODWQjV;
        boolean z = c10854bwM != null && c10854bwM.OuxcSI();
        EOSState eOSStateValueOf = (abstractC12782ctV == null || (c13852daRODWQjV = abstractC12782ctV.ODWQjV()) == null) ? null : c13852daRODWQjV.valueOf();
        return (!z || eOSStateValueOf == null || eOSStateValueOf == EOSState.Opened) ? false : true;
    }

    public final void OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, final C10854bwM c10854bwM, final AbstractC12782ctV abstractC12782ctV, final TransactionInfo transactionInfo) {
        java.util.List<? extends ChainCheckType> listEZpvd;
        ChainAddress chainAddressAddressFromChainId$default;
        abstractActivityC33041mov.showLoadingAtOnce();
        C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.hCLrkq()) {
            listEZpvd = yDY.gEmmrt(ChainCheckType.CHECK_TRANSFER, ChainCheckType.CHECK_REGISTER);
        } else {
            listEZpvd = C56402yEa.EZpvd(ChainCheckType.CHECK_REGISTER);
        }
        java.util.List<? extends ChainCheckType> list = listEZpvd;
        ChainStatusChecker chainStatusChecker = ChainStatusChecker.OLrzqt;
        long jAhwBna = c10854bwM.AhwBna();
        java.lang.String address = (abstractC12782ctV == null || (chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null)) == null) ? null : chainAddressAddressFromChainId$default.getAddress();
        if (address == null) {
            address = "";
        }
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(chainStatusChecker.OLrzqt(jAhwBna, address, c10854bwM.OLrzqt(), list), abstractActivityC33041mov, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.eTy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15733eTg.copydefault(abstractActivityC33041mov, this, abstractC12782ctV, c10854bwM, transactionInfo, (ChainStatus) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eTD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15733eTg.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eTH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15733eTg.copydefault(abstractActivityC33041mov, this, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eTl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15733eTg.fetchVPNInfo(function12, obj);
            }
        });
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, C15733eTg c15733eTg, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, TransactionInfo transactionInfo, ChainStatus chainStatus) {
        ChainAddress chainAddressAddressFromChainId$default;
        java.lang.String strDbNXlk;
        abstractActivityC33041mov.dismissLoading();
        int i = chainStatus == null ? -1 : ActionBar.KWHzl[chainStatus.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C14083dek c14083dek = C14083dek.OLrzqt;
                androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
                C14083dek.handleUnregisteredStatus$default(c14083dek, abstractActivityC33041mov, supportFragmentManager, strDbNXlk == null ? "" : strDbNXlk, c10854bwM.AhwBna(), null, 16, null);
                c15733eTg.KWHzl(abstractActivityC33041mov);
            } else if (i == 3) {
                C14083dek.OLrzqt.KWHzl();
            } else if (i == 4) {
                C20690gle c20690gle = C20690gle.OLrzqt;
                java.lang.String str = (abstractC12782ctV == null || (strDbNXlk = abstractC12782ctV.DbNXlk()) == null) ? "" : strDbNXlk;
                long jAhwBna = c10854bwM.AhwBna();
                C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
                if (c10854bwMKWHzl != null) {
                    long jAEQbTJ = c10854bwMKWHzl.AEQbTJ();
                    if (abstractC12782ctV != null && (chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, jAEQbTJ, null, 2, null)) != null) {
                        strDbNXlk = chainAddressAddressFromChainId$default.getAddress();
                    }
                    java.lang.String str2 = strDbNXlk == null ? "" : strDbNXlk;
                    c20690gle.KWHzl((106 & 1) != 0 ? null : null, (106 & 2) != 0 ? null : abstractActivityC33041mov, str, (106 & 8) != 0 ? null : java.lang.Long.valueOf(jAhwBna), str2, (106 & 32) != 0 ? null : transactionInfo, (106 & 64) != 0 ? false : false, (106 & 128) != 0 ? null : null);
                    c15733eTg.KWHzl(abstractActivityC33041mov);
                }
            }
        } else {
            c15733eTg.OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setIcon));
        }
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, C15733eTg c15733eTg, java.lang.Throwable th) {
        abstractActivityC33041mov.dismissLoading();
        java.lang.String message = th.getMessage();
        if (message != null) {
            c15733eTg.OLrzqt(abstractActivityC33041mov, message);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.Integer num, java.lang.Integer num2, WcConnectExtra wcConnectExtra) {
        C18355fgo c18355fgo = C18355fgo.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.String strKWHzl = wcConnectExtra != null ? wcConnectExtra.KWHzl() : null;
        java.lang.String str = strKWHzl == null ? "" : strKWHzl;
        java.lang.String strAEQbTJ = wcConnectExtra != null ? wcConnectExtra.AEQbTJ() : null;
        c18355fgo.EZpvd(abstractActivityC33041mov, iIntValue, iIntValue2, str, strAEQbTJ == null ? "" : strAEQbTJ);
    }

    public final java.lang.Object OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, final WcConnectExtra wcConnectExtra, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        C16057ecj c16057ecj = new C16057ecj(null, null, 3, null);
        abstractActivityC33041mov.showLoadingWithLogo();
        c16057ecj.AEQbTJ().observe(abstractActivityC33041mov, new Activity(new Function1() { // from class: o.eTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15733eTg.KWHzl(abstractActivityC33041mov, this, wcConnectExtra, (ValidateCanConnectResult) obj);
            }
        }));
        java.lang.Object objEZpvd = c16057ecj.EZpvd(str, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, C15733eTg c15733eTg, WcConnectExtra wcConnectExtra, ValidateCanConnectResult validateCanConnectResult) {
        if (validateCanConnectResult == null) {
            return Unit.INSTANCE;
        }
        abstractActivityC33041mov.dismissLoadingWithLogo();
        if (validateCanConnectResult.EZpvd()) {
            c15733eTg.AEQbTJ(abstractActivityC33041mov, 2, 0, wcConnectExtra);
            c15733eTg.KWHzl(abstractActivityC33041mov);
        } else {
            java.lang.Integer numCopydefault = validateCanConnectResult.copydefault();
            if (numCopydefault != null) {
                c15733eTg.OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(numCopydefault.intValue()));
            }
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, EnCodeResult enCodeResult) {
        final java.lang.Object data = enCodeResult.getData();
        if (!(data instanceof MpcQRCodeParseBean)) {
            OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerIndicatorEnabled));
            return;
        }
        if (java.lang.System.currentTimeMillis() - ((MpcQRCodeParseBean) data).getTime() < 300000) {
            AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), abstractActivityC33041mov);
            final Function1 function1 = new Function1() { // from class: o.eTn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15733eTg.OLrzqt(this.copydefault, abstractActivityC33041mov, data, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eTj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15733eTg.AkhnZx(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eTm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15733eTg.EZpvd(this.OLrzqt, abstractActivityC33041mov, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eTk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15733eTg.values(function12, obj);
                }
            });
            abstractActivityC33041mov.addDisposable(interfaceC58217yxCAEQbTJ);
            Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
            return;
        }
        OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setItems));
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final C15733eTg c15733eTg, final AbstractActivityC33041mov abstractActivityC33041mov, final java.lang.Object obj, final AbstractC12782ctV abstractC12782ctV) {
        java.lang.String mpcId;
        if (abstractC12782ctV.QwvEab() != WalletType.MPCWallet) {
            c15733eTg.OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerIndicatorEnabled));
            return Unit.INSTANCE;
        }
        if (!abstractC12782ctV.AxsJAYaxsJAY() && !abstractC12782ctV.ffGIBT()) {
            c15733eTg.OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setNegativeButtonIcon));
            return Unit.INSTANCE;
        }
        if (abstractC12782ctV.DCUTEIdCUTEI()) {
            c15733eTg.OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setNeutralButtonIcon));
            return Unit.INSTANCE;
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        MpcQRCodeParseBean mpcQRCodeParseBean = (MpcQRCodeParseBean) obj;
        if (Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getUid() : null), (java.lang.Object) mpcQRCodeParseBean.getUId())) {
            C13934dbu c13934dbu = new C13934dbu();
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
            if (mpcWalletEncodeInfoQSBOWP2 == null || (mpcId = mpcWalletEncodeInfoQSBOWP2.getMpcId()) == null) {
                mpcId = "";
            }
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(c13934dbu.EZpvd(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), abstractC12782ctV.aUsmxb(), new UploadScanStatusRequestBody(mpcId, mpcQRCodeParseBean.getUId(), mpcQRCodeParseBean.getPublicKey(), 0)), abstractActivityC33041mov);
            final Function1 function1 = new Function1() { // from class: o.eTq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C15733eTg.copydefault(abstractActivityC33041mov, obj, abstractC12782ctV, c15733eTg, (ResponseData) obj2);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eTo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    C15733eTg.DbNXlk(function1, obj2);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eTx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C15733eTg.KWHzl(this.KWHzl, abstractActivityC33041mov, (java.lang.Throwable) obj2);
                }
            };
            abstractActivityC33041mov.addDisposable(abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eTw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    C15733eTg.isConnected(function12, obj2);
                }
            }));
        } else {
            c15733eTg.OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerIndicatorEnabled));
        }
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C15733eTg c15733eTg, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        if (message != null) {
            c15733eTg.OLrzqt(abstractActivityC33041mov, message);
        }
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C15733eTg c15733eTg, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.Throwable th) {
        c15733eTg.OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerIndicatorEnabled));
        return Unit.INSTANCE;
    }

    public final void copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, WcConnectExtra wcConnectExtra, final java.lang.Integer num) {
        if (wcConnectExtra != null) {
            KWHzl(abstractActivityC33041mov);
            AEQbTJ(abstractActivityC33041mov, num, 0, wcConnectExtra);
        } else {
            final C16055ech c16055ech = new C16055ech();
            abstractActivityC33041mov.showLoadingWithLogo();
            c16055ech.AEQbTJ(abstractActivityC33041mov, str);
            c16055ech.AEQbTJ().observe(abstractActivityC33041mov, new Activity(new Function1() { // from class: o.eTu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15733eTg.EZpvd(abstractActivityC33041mov, this, num, c16055ech, (kotlin.Pair) obj);
                }
            }));
        }
    }

    public static final Unit EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, C15733eTg c15733eTg, java.lang.Integer num, C16055ech c16055ech, kotlin.Pair pair) {
        int iIntValue = ((java.lang.Number) pair.component1()).intValue();
        java.lang.String str = (java.lang.String) pair.component2();
        if (iIntValue == -1 || iIntValue == 2) {
            abstractActivityC33041mov.dismissLoadingWithLogo();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                if (str == null) {
                    str = "";
                }
                c15733eTg.OLrzqt(abstractActivityC33041mov, str);
            }
        } else if (iIntValue == 3) {
            abstractActivityC33041mov.dismissLoadingWithLogo();
            java.lang.String strEZpvd = c16055ech.EZpvd();
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            java.lang.String strKWHzl = c16055ech.KWHzl();
            c15733eTg.AEQbTJ(abstractActivityC33041mov, num, 0, new WcConnectExtra(strEZpvd, strKWHzl != null ? strKWHzl : ""));
            c15733eTg.KWHzl(abstractActivityC33041mov);
        } else if (iIntValue == 4) {
            abstractActivityC33041mov.dismissLoadingWithLogo();
            ShowWCAuthRequestArgs showWCAuthRequestArgsOLrzqt = c16055ech.OLrzqt();
            if (showWCAuthRequestArgsOLrzqt != null) {
                WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).copydefault(abstractActivityC33041mov, showWCAuthRequestArgsOLrzqt);
            }
            c15733eTg.KWHzl(abstractActivityC33041mov);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str) {
        if (abstractActivityC33041mov instanceof ScannerActivity) {
            ((ScannerActivity) abstractActivityC33041mov).EZpvd(str);
        } else {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        }
    }

    public final void KWHzl(AbstractActivityC33041mov abstractActivityC33041mov) {
        if (abstractActivityC33041mov instanceof ScannerActivity) {
            abstractActivityC33041mov.finish();
        }
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.Object obj, AbstractC12782ctV abstractC12782ctV, C15733eTg c15733eTg, ResponseData responseData) {
        java.lang.String mpcId;
        if (responseData.getCode() == 0) {
            ScanStatusResponseBody scanStatusResponseBody = (ScanStatusResponseBody) responseData.getData();
            if (scanStatusResponseBody != null && scanStatusResponseBody.getStatus() == 0) {
                ActivityC18887fqr.Application application = ActivityC18887fqr.Companion;
                MpcQRCodeParseBean mpcQRCodeParseBean = (MpcQRCodeParseBean) obj;
                java.lang.String publicKey = mpcQRCodeParseBean.getPublicKey();
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
                if (mpcWalletEncodeInfoQSBOWP == null || (mpcId = mpcWalletEncodeInfoQSBOWP.getMpcId()) == null) {
                    mpcId = "";
                }
                application.OLrzqt(abstractActivityC33041mov, publicKey, mpcId, mpcQRCodeParseBean.getUId());
                c15733eTg.KWHzl(abstractActivityC33041mov);
            } else {
                c15733eTg.OLrzqt(abstractActivityC33041mov, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setItems));
            }
        } else {
            c15733eTg.OLrzqt(abstractActivityC33041mov, responseData.getMsg());
        }
        return Unit.INSTANCE;
    }
}
