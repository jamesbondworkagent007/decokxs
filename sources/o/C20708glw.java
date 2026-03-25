package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.FactionInfo;
import com.okinc.business.defi.biz.net.bean.SearchCoinMetaBean;
import com.okinc.business.defi.biz.net.bean.SearchCoinReq;
import com.okinc.business.defi.biz.net.bean.SearchCoinResp;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeyModule;
import com.okinc.business.defi.wallet.transfer.ButtonType;
import com.okinc.business.defi.wallet.transfer.TransferViewModel$getWalletBindToken$1;
import com.okinc.business.defi.wallet.transfer.TransferViewModel$startCeFiBind$1;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C10407bnq;
import o.C10525bqB;
import o.C10614brl;
import o.C12827cuN;
import o.C13754dXa;
import o.C20708glw;
import o.InterfaceC9742bbN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.glw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C20708glw extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final MutableSharedFlow<java.lang.String> AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final java.util.ArrayList<C10525bqB> AhwBna;
    public boolean AkhnZx;
    public final java.lang.String AuCTel;
    public java.util.ArrayList<C20598gjs> AuCTelauCTel;
    public java.util.HashMap<java.lang.Long, C10525bqB> AubY;
    public final AbstractC32952mnL<C20603gjx> AwvSrB;
    public java.lang.String AxsJAY;
    public java.lang.String DTwDnp;
    public final java.lang.String DbNXlk;
    public java.util.List<C10525bqB> EZpvd;
    public final MutableSharedFlow<java.lang.String> KWHzl;
    public final MutableSharedFlow<kotlin.Pair<java.lang.String, java.lang.String>> OLrzqt;
    public WalletSelectedChainBean OcIXYQ;
    public AbstractC12782ctV QKVWgx;
    public final InterfaceC56387yDm QOLQEE;
    public final StateListAnimator djBIcL;
    public boolean ejfBZ;
    public boolean fARcdN;
    public final C13934dbu fIwbmz;
    public java.lang.Integer fJNWhG;
    public final java.util.ArrayList<C10594brR> fetchVPNInfo;
    public final TaskDescription gEmmrt;
    public final AbstractC32952mnL<C20603gjx> gHZMYf;
    public final SharedFlow<java.lang.String> getFieldNames;
    public final java.util.ArrayList<C20598gjs> getNewProxyInstance;
    public final java.util.ArrayList<C10525bqB> hDKMBd;
    public int isConnected;
    public final SharedFlow<java.lang.String> iwGUEr;
    public java.lang.String sSMYrx;
    public final SharedFlow<kotlin.Pair<java.lang.String, java.lang.String>> uzCIH;
    public java.util.HashSet<java.lang.String> valueOf;
    public java.lang.String values;
    public java.lang.String wlaJM;
    public int zLjUOn;
    public TransactionInfo zsXlph;
    public java.util.List<java.lang.Long> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionInfo AYXKKw() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<kotlin.Pair<java.lang.String, java.lang.String>> AhwBna() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC32952mnL<C20603gjx> DbNXlk() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        this.QKVWgx = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSelectedChainBean fARcdN() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC32952mnL<C20603gjx> fetchVPNInfo() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.String> gEmmrt() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.String> valueOf() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV values() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void zsXlph() {
        this.ejfBZ = true;
    }

    public C20708glw() {
        java.lang.String str = getClass().getName() + "-coin";
        this.AuCTel = str;
        java.lang.String str2 = getClass().getName() + "-chain";
        this.DbNXlk = str2;
        this.fIwbmz = new C13934dbu();
        this.values = "";
        this.DTwDnp = "";
        this.sSMYrx = "";
        this.wlaJM = "";
        this.valueOf = new java.util.HashSet<>();
        this.hDKMBd = new java.util.ArrayList<>();
        this.fetchVPNInfo = new java.util.ArrayList<>();
        java.util.ArrayList<C10525bqB> arrayList = new java.util.ArrayList<>();
        this.AhwBna = arrayList;
        this.getNewProxyInstance = new java.util.ArrayList<>();
        this.fARcdN = true;
        this.djBIcL = new StateListAnimator(str);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((C10525bqB) it.next()).OLrzqt()));
        }
        this.gEmmrt = new TaskDescription(str2, arrayList2);
        this.AwvSrB = new TaskStackBuilder();
        this.gHZMYf = new PictureInPictureParams();
        this.AxsJAY = "Search-Receive";
        this.AuCTelauCTel = new java.util.ArrayList<>();
        this.AubY = new java.util.HashMap<>();
        MutableSharedFlow<java.lang.String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.iwGUEr = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<java.lang.String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default2;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.QOLQEE = C56392yDr.copydefault(new Function0() { // from class: o.gmd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20708glw.copydefault();
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.gmh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20708glw.isConnected(this.copydefault);
            }
        });
        MutableSharedFlow<kotlin.Pair<java.lang.String, java.lang.String>> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default3;
        this.uzCIH = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
    }

    /* JADX INFO: renamed from: o.glw$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.glw.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.glw$StateListAnimator */
    public static final class StateListAnimator extends WalletCoinAssetSubManager.TaskDescription {
        public StateListAnimator(java.lang.String str) {
            super(str, null, null, false, 14, null);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletCoinAssetSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (C20708glw.this.AkhnZx().length() == 0) {
                C20708glw.this.fetchVPNInfo().copydefault();
            } else {
                C20708glw c20708glw = C20708glw.this;
                c20708glw.KWHzl(c20708glw.AkhnZx());
            }
        }
    }

    /* JADX INFO: renamed from: o.glw$Dialog */
    public static final class Dialog<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((C10525bqB) t).KWHzl().QfsBiF()), java.lang.Integer.valueOf(((C10525bqB) t2).KWHzl().QfsBiF()));
        }
    }

    /* JADX INFO: renamed from: o.glw$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        public final /* synthetic */ C20708glw KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(java.lang.String str, C20708glw c20708glw) {
            this.OLrzqt = str;
            this.KWHzl = c20708glw;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(T t, T t2) {
            int i;
            C10525bqB c10525bqB = (C10525bqB) t;
            int i2 = 3;
            if (this.OLrzqt.length() == 0) {
                WalletSelectedChainBean walletSelectedChainBeanFARcdN = this.KWHzl.fARcdN();
                i = ((walletSelectedChainBeanFARcdN == null || !walletSelectedChainBeanFARcdN.isAllNetwork()) && c10525bqB.KWHzl().AuCTel()) ? 3 : 4;
            } else if (C59449zhJ.gEmmrt(c10525bqB.KWHzl().fJNWhG(), this.OLrzqt, true)) {
                i = 0;
            } else if (C59449zhJ.AYXKKw(c10525bqB.KWHzl().fJNWhG(), this.OLrzqt, true)) {
                i = 1;
            } else if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c10525bqB.KWHzl().fJNWhG(), (java.lang.CharSequence) this.OLrzqt, true)) {
                i = 2;
            }
            C10525bqB c10525bqB2 = (C10525bqB) t2;
            if (this.OLrzqt.length() == 0) {
                WalletSelectedChainBean walletSelectedChainBeanFARcdN2 = this.KWHzl.fARcdN();
                if ((walletSelectedChainBeanFARcdN2 != null && walletSelectedChainBeanFARcdN2.isAllNetwork()) || !c10525bqB2.KWHzl().AuCTel()) {
                    i2 = 4;
                }
            } else if (C59449zhJ.gEmmrt(c10525bqB2.KWHzl().fJNWhG(), this.OLrzqt, true)) {
                i2 = 0;
            } else if (C59449zhJ.AYXKKw(c10525bqB2.KWHzl().fJNWhG(), this.OLrzqt, true)) {
                i2 = 1;
            } else if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c10525bqB2.KWHzl().fJNWhG(), (java.lang.CharSequence) this.OLrzqt, true)) {
                i2 = 2;
            }
            return yET.KWHzl(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: o.glw$FragmentManager */
    public static final class FragmentManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((C10525bqB) t).KWHzl().QfsBiF()), java.lang.Integer.valueOf(((C10525bqB) t2).KWHzl().QfsBiF()));
        }
    }

    /* JADX INFO: renamed from: o.glw$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((C10525bqB) t).KWHzl().QfsBiF()), java.lang.Integer.valueOf(((C10525bqB) t2).KWHzl().QfsBiF()));
        }
    }

    /* JADX INFO: renamed from: o.glw$PendingIntent */
    public static final class PendingIntent<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((C10525bqB) t).KWHzl().QfsBiF()), java.lang.Integer.valueOf(((C10525bqB) t2).KWHzl().QfsBiF()));
        }
    }

    /* JADX INFO: renamed from: o.glw$TaskDescription */
    public static final class TaskDescription extends WalletCoinAssetSubManager.TaskDescription {
        public TaskDescription(java.lang.String str, java.util.List<java.lang.Long> list) {
            super(str, null, list, false, 10, null);
        }

        public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletCoinAssetSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(C20708glw.this.fIwbmz(), true);
            final C20708glw c20708glw = C20708glw.this;
            final Function1 function1 = new Function1() { // from class: o.gmJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20708glw.TaskDescription.OLrzqt(c20708glw, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gmL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20708glw.TaskDescription.OLrzqt(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.gmN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20708glw.TaskDescription.OLrzqt((java.lang.Throwable) obj);
                }
            };
            C20708glw.this.call().AEQbTJ(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gmM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20708glw.TaskDescription.copydefault(function12, obj);
                }
            }));
        }

        public static final Unit OLrzqt(C20708glw c20708glw, AbstractC12782ctV abstractC12782ctV) {
            c20708glw.OLrzqt(abstractC12782ctV);
            java.util.ArrayList arrayList = c20708glw.AhwBna;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C10525bqB c10525bqBAEQbTJ = abstractC12782ctV.AEQbTJ(java.lang.Long.valueOf(((C10525bqB) it.next()).OLrzqt()));
                Intrinsics.copydefault(c10525bqBAEQbTJ);
                arrayList2.add(c10525bqBAEQbTJ);
            }
            c20708glw.AhwBna.clear();
            c20708glw.AhwBna.addAll(arrayList2);
            java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(c20708glw.AhwBna, C20690gle.OLrzqt.KWHzl());
            AbstractC32952mnL<C20603gjx> abstractC32952mnLDbNXlk = c20708glw.DbNXlk();
            if (!c20708glw.iwGUEr()) {
                listEZpvd = c20708glw.AhwBna;
            }
            C33024moe.OLrzqt(abstractC32952mnLDbNXlk, C20555gjB.OLrzqt(c20708glw.OLrzqt((java.util.List<C10525bqB>) listEZpvd), false, c20708glw.KWHzl(c20708glw.AhwBna)));
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(java.lang.Throwable th) {
            return Unit.INSTANCE;
        }

        public static final void copydefault(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.glw$TaskStackBuilder */
    public static final class TaskStackBuilder extends AbstractC32952mnL<C20603gjx> {
        public TaskStackBuilder() {
        }

        @Override // o.AbstractC32952mnL
        public InterfaceC58217yxC EZpvd(long j) {
            return (C20708glw.this.getFieldNames() && C20708glw.this.ejfBZ()) ? C20708glw.this.getNewProxyInstance() : C20708glw.this.uzCIH();
        }
    }

    /* JADX INFO: renamed from: o.glw$PictureInPictureParams */
    public static final class PictureInPictureParams extends AbstractC32952mnL<C20603gjx> {
        public PictureInPictureParams() {
        }

        @Override // o.AbstractC32952mnL
        public InterfaceC58217yxC EZpvd(long j) {
            if (!C20708glw.this.getFieldNames() || !C20708glw.this.ejfBZ()) {
                C20708glw c20708glw = C20708glw.this;
                return c20708glw.copydefault(c20708glw.sSMYrx);
            }
            C20708glw c20708glw2 = C20708glw.this;
            return c20708glw2.AEQbTJ(c20708glw2.sSMYrx);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.glw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void init$default(C20708glw c20708glw, java.lang.String str, java.lang.String str2, TransactionInfo transactionInfo, java.util.ArrayList arrayList, java.lang.Integer num, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
        c20708glw.copydefault(str, str2, (i & 4) != 0 ? null : transactionInfo, (i & 8) != 0 ? null : arrayList, (i & 16) != 0 ? null : num);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, TransactionInfo transactionInfo, java.util.ArrayList<java.lang.Long> arrayList, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.values = str;
        this.DTwDnp = str2;
        this.zsXlph = transactionInfo;
        this.zuBGHE = arrayList;
        this.fJNWhG = num;
        if (transactionInfo != null) {
            java.util.List<C10854bwM> listOLrzqt = C10954byG.EZpvd.valueOf().OLrzqt(transactionInfo.getNetwork());
            if (listOLrzqt.isEmpty()) {
                listOLrzqt = C13847daM.Companion.OLrzqt(transactionInfo.getAddress());
            }
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                this.valueOf.add(((C10854bwM) it.next()).djBIcL());
            }
        }
        this.fARcdN = C43453rpa.AEQbTJ.KWHzl(C9678baC.Companion.AEQbTJ());
        this.OcIXYQ = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(str2);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.ctV> */
    public final AbstractC58260yxt<AbstractC12782ctV> AubY() {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.DTwDnp, true);
        final Function1 function1 = new Function1() { // from class: o.gmm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.gEmmrt(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.gmp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20708glw.aKErDB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final AbstractC12782ctV aKErDB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12782ctV) function1.invoke(obj);
    }

    public static final AbstractC12782ctV gEmmrt(C20708glw c20708glw, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c20708glw.QKVWgx = abstractC12782ctV;
        return abstractC12782ctV;
    }

    public final void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sSMYrx = str;
        this.gHZMYf.copydefault();
    }

    public final boolean AuCTel() {
        return Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) "from_receive");
    }

    public final boolean ejfBZ() {
        return Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) "from_send");
    }

    public final boolean getFieldNames() {
        java.lang.Integer num = this.fJNWhG;
        int value = MultiTransferMode.MODE_MANY_TO_ONE.getValue();
        if (num == null || num.intValue() != value) {
            java.lang.Integer num2 = this.fJNWhG;
            int value2 = MultiTransferMode.MODE_MANY_TO_MANY.getValue();
            if (num2 == null || num2.intValue() != value2) {
                java.lang.Integer num3 = this.fJNWhG;
                int value3 = MultiTransferMode.MODE_ONE_TO_MANY.getValue();
                if (num3 == null || num3.intValue() != value3) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean hDKMBd() {
        AbstractC12782ctV abstractC12782ctV = this.QKVWgx;
        return abstractC12782ctV != null && abstractC12782ctV.QfsBiF();
    }

    public final InterfaceC58217yxC getNewProxyInstance() {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.DTwDnp, false);
        final Function1 function1 = new Function1() { // from class: o.gmx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.AYXKKw(this.KWHzl, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.gmH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20708glw.AwvSrB(function1, obj);
            }
        }).OLrzqt(yBP.KWHzl());
        final Function1 function12 = new Function1() { // from class: o.gmG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.AhwBna(this.KWHzl, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.gmK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20708glw.wlaJM(function12, obj);
            }
        }).OLrzqt(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.glz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.EZpvd(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.glB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20708glw.AubY(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.gly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.valueOf(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt3.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.glA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20708glw.sSMYrx(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final AbstractC12782ctV AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12782ctV) function1.invoke(obj);
    }

    public static final AbstractC12782ctV AYXKKw(C20708glw c20708glw, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c20708glw.QKVWgx = abstractC12782ctV;
        return abstractC12782ctV;
    }

    public static final kotlin.Pair wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AhwBna(C20708glw c20708glw, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        java.util.List<C10854bwM> listCopydefault = C10954byG.EZpvd.valueOf().copydefault(c20708glw.zuBGHE);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(c20708glw.KWHzl((C10854bwM) it.next(), abstractC12782ctV));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).EZpvd(arrayList, C56402yEa.EZpvd(1)), C10533bqJ.EZpvd);
        arrayList2.addAll(listEZpvd);
        arrayList3.addAll(listEZpvd);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList3) {
            if (((C10525bqB) obj).KWHzl().DcqEDu()) {
                arrayList4.add(obj);
            }
        }
        return C56390yDp.OLrzqt(arrayList2, CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c20708glw.AEQbTJ(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList4, 100))));
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C20708glw c20708glw, kotlin.Pair pair) {
        c20708glw.hDKMBd.clear();
        c20708glw.hDKMBd.addAll((java.util.Collection) pair.getFirst());
        C33024moe.OLrzqt(c20708glw.AwvSrB, C20555gjB.OLrzqt((java.util.List) pair.getSecond(), false, false));
        c20708glw.zuBGHE();
        return Unit.INSTANCE;
    }

    public static final void sSMYrx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(C20708glw c20708glw, java.lang.Throwable th) {
        AbstractC32952mnL<C20603gjx> abstractC32952mnL = c20708glw.AwvSrB;
        Intrinsics.copydefault(th);
        C33024moe.setErrorValue$default(abstractC32952mnL, th, null, 2, null);
        return Unit.INSTANCE;
    }

    public final C10525bqB KWHzl(C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV) {
        return C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwM, abstractC12782ctV, null, 4, null);
    }

    public final InterfaceC58217yxC uzCIH() {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.DTwDnp, true);
        final Function1 function1 = new Function1() { // from class: o.gmz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.djBIcL(this.EZpvd, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.gmA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20708glw.QbewEr(function1, obj);
            }
        }).OLrzqt(yBP.KWHzl());
        final Function1 function12 = new Function1() { // from class: o.gmB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.valueOf(this.KWHzl, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.gmF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20708glw.RJOkX(function12, obj);
            }
        }).OLrzqt(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.gmD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.EZpvd(this.KWHzl, (Triple) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gmC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20708glw.QUSxYX(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.gmE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.fetchVPNInfo(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt3.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gmI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20708glw.RcXXUw(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final AbstractC12782ctV QbewEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12782ctV) function1.invoke(obj);
    }

    public static final AbstractC12782ctV djBIcL(C20708glw c20708glw, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c20708glw.QKVWgx = abstractC12782ctV;
        return abstractC12782ctV;
    }

    public static final Triple RJOkX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final Triple valueOf(C20708glw c20708glw, AbstractC12782ctV abstractC12782ctV) {
        WalletSelectedChainBean walletSelectedChainBean;
        java.lang.String chainId;
        WalletSelectedChainBean walletSelectedChainBean2;
        java.lang.String chainId2;
        java.util.List<java.lang.Integer> listEZpvd;
        java.util.List<java.lang.Integer> listEZpvd2;
        java.util.List<java.lang.Integer> listEZpvd3;
        WalletSelectedChainBean walletSelectedChainBean3;
        WalletSelectedChainBean walletSelectedChainBean4;
        java.lang.String chainId3;
        WalletSelectedChainBean walletSelectedChainBean5;
        java.lang.String chainId4;
        WalletSelectedChainBean walletSelectedChainBean6;
        java.lang.String chainId5;
        java.lang.String chainId6;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.String str = c20708glw.values;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "from_receive")) {
            WalletSelectedChainBean walletSelectedChainBean7 = c20708glw.OcIXYQ;
            if (walletSelectedChainBean7 == null || !walletSelectedChainBean7.isSingleMode()) {
                java.util.List<C10525bqB> listAEQbTJ = c20708glw.AEQbTJ(abstractC12782ctV);
                if (listAEQbTJ != null) {
                    for (C10525bqB c10525bqB : listAEQbTJ) {
                        WalletSelectedChainBean walletSelectedChainBean8 = c20708glw.OcIXYQ;
                        if ((walletSelectedChainBean8 != null && walletSelectedChainBean8.isAllNetwork()) || ((walletSelectedChainBean6 = c20708glw.OcIXYQ) != null && (chainId5 = walletSelectedChainBean6.getChainId()) != null && c10525bqB.KWHzl().AEQbTJ() == java.lang.Long.parseLong(chainId5))) {
                            map.put(java.lang.Long.valueOf(c10525bqB.OLrzqt()), c10525bqB);
                            arrayList.add(c10525bqB);
                        }
                    }
                }
                for (C10525bqB c10525bqB2 : abstractC12782ctV.iRxXKY()) {
                    WalletSelectedChainBean walletSelectedChainBean9 = c20708glw.OcIXYQ;
                    if ((walletSelectedChainBean9 != null && walletSelectedChainBean9.isAllNetwork()) || ((walletSelectedChainBean5 = c20708glw.OcIXYQ) != null && (chainId4 = walletSelectedChainBean5.getChainId()) != null && c10525bqB2.KWHzl().AEQbTJ() == java.lang.Long.parseLong(chainId4))) {
                        map2.put(java.lang.Long.valueOf(c10525bqB2.OLrzqt()), c10525bqB2);
                        arrayList2.add(c10525bqB2);
                    }
                }
                for (C10854bwM c10854bwM : abstractC12782ctV.QVsKAR()) {
                    if (!map.containsKey(java.lang.Long.valueOf(c10854bwM.AhwBna())) && !map2.containsKey(java.lang.Long.valueOf(c10854bwM.AhwBna())) && (((walletSelectedChainBean3 = c20708glw.OcIXYQ) != null && walletSelectedChainBean3.isAllNetwork()) || ((walletSelectedChainBean4 = c20708glw.OcIXYQ) != null && (chainId3 = walletSelectedChainBean4.getChainId()) != null && c10854bwM.AEQbTJ() == java.lang.Long.parseLong(chainId3)))) {
                        if (c10854bwM.dxcTrN()) {
                            java.util.List<C10525bqB> listAYXKKw = abstractC12782ctV.AYXKKw(c10854bwM.AhwBna());
                            if (listAYXKKw == null || listAYXKKw.isEmpty()) {
                                arrayList3.add(C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwM, abstractC12782ctV, null, 4, null));
                            } else {
                                java.util.Iterator<T> it = listAYXKKw.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add((C10525bqB) it.next());
                                }
                            }
                        } else if (c10854bwM.giSNqX()) {
                            C10525bqB c10525bqBAEQbTJ = abstractC12782ctV.AEQbTJ(java.lang.Long.valueOf(c10854bwM.AhwBna()));
                            if (c10525bqBAEQbTJ == null) {
                                c10525bqBAEQbTJ = C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwM, abstractC12782ctV, null, 4, null);
                            }
                            arrayList3.add(c10525bqBAEQbTJ);
                        } else if (c10854bwM.DcqEDu()) {
                            C10525bqB c10525bqBAEQbTJ2 = abstractC12782ctV.AEQbTJ(java.lang.Long.valueOf(c10854bwM.AhwBna()));
                            if (c10525bqBAEQbTJ2 == null) {
                                c10525bqBAEQbTJ2 = C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwM, abstractC12782ctV, null, 4, null);
                            }
                            arrayList3.add(c10525bqBAEQbTJ2);
                        }
                    }
                }
            } else {
                for (C10594brR c10594brR : abstractC12782ctV.OxVOHk()) {
                    WalletSelectedChainBean walletSelectedChainBean10 = c20708glw.OcIXYQ;
                    if (walletSelectedChainBean10 != null && (chainId6 = walletSelectedChainBean10.getChainId()) != null && c10594brR.AEQbTJ() == java.lang.Long.parseLong(chainId6)) {
                        arrayList4.add(c10594brR);
                    }
                }
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "from_send")) {
            if (c20708glw.zsXlph == null) {
                WalletSelectedChainBean walletSelectedChainBean11 = c20708glw.OcIXYQ;
                if (walletSelectedChainBean11 == null || !walletSelectedChainBean11.isSingleMode()) {
                    java.util.List<C10525bqB> listAEQbTJ2 = c20708glw.AEQbTJ(abstractC12782ctV);
                    if (listAEQbTJ2 != null) {
                        for (C10525bqB c10525bqB3 : listAEQbTJ2) {
                            WalletSelectedChainBean walletSelectedChainBean12 = c20708glw.OcIXYQ;
                            if ((walletSelectedChainBean12 != null && walletSelectedChainBean12.isAllNetwork()) || ((walletSelectedChainBean = c20708glw.OcIXYQ) != null && (chainId = walletSelectedChainBean.getChainId()) != null && c10525bqB3.KWHzl().AEQbTJ() == java.lang.Long.parseLong(chainId))) {
                                if (C33129mqd.AEQbTJ(c10525bqB3.copydefault(), "0")) {
                                    arrayList.add(c10525bqB3);
                                }
                            }
                        }
                    }
                } else {
                    for (C10594brR c10594brR2 : abstractC12782ctV.QkdxfA()) {
                        if (C33129mqd.AEQbTJ(c10594brR2.values(), "0") && (walletSelectedChainBean2 = c20708glw.OcIXYQ) != null && (chainId2 = walletSelectedChainBean2.getChainId()) != null && c10594brR2.AEQbTJ() == java.lang.Long.parseLong(chainId2)) {
                            arrayList4.add(c10594brR2);
                        }
                    }
                }
            } else {
                for (C10594brR c10594brR3 : abstractC12782ctV.QkdxfA()) {
                    if (C33129mqd.AEQbTJ(c10594brR3.values(), "0") && c20708glw.valueOf.contains(c10594brR3.KWHzl().djBIcL())) {
                        arrayList4.add(c10594brR3);
                    }
                }
                java.util.List<C10525bqB> listAEQbTJ3 = c20708glw.AEQbTJ(abstractC12782ctV);
                if (listAEQbTJ3 != null) {
                    for (C10525bqB c10525bqB4 : listAEQbTJ3) {
                        if (C33129mqd.AEQbTJ(c10525bqB4.copydefault(), "0") && c20708glw.valueOf.contains(c10525bqB4.KWHzl().djBIcL())) {
                            arrayList.add(c10525bqB4);
                        }
                    }
                }
            }
        }
        C10407bnq.ActionBar actionBar = C10407bnq.Companion;
        C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(actionBar, null, 1, null);
        java.util.List<C10525bqB> listEZpvd4 = CollectionsKt___CollectionsKt.EZpvd(arrayList, new FragmentManager());
        WalletSelectedChainBean walletSelectedChainBean13 = c20708glw.OcIXYQ;
        if (walletSelectedChainBean13 != null && walletSelectedChainBean13.isAllNetwork()) {
            listEZpvd = yDY.gEmmrt(1, 2);
        } else {
            listEZpvd = C56402yEa.EZpvd(2);
        }
        java.util.List listEZpvd5 = CollectionsKt___CollectionsKt.EZpvd(instance$default.EZpvd(listEZpvd4, listEZpvd), c20708glw.new ActionBar());
        C10407bnq instance$default2 = C10407bnq.ActionBar.getInstance$default(actionBar, null, 1, null);
        java.util.List<C10525bqB> listEZpvd6 = CollectionsKt___CollectionsKt.EZpvd(arrayList2, new Dialog());
        WalletSelectedChainBean walletSelectedChainBean14 = c20708glw.OcIXYQ;
        if (walletSelectedChainBean14 != null && walletSelectedChainBean14.isAllNetwork()) {
            listEZpvd2 = yDY.gEmmrt(1, 2);
        } else {
            listEZpvd2 = C56402yEa.EZpvd(2);
        }
        java.util.List listEZpvd7 = CollectionsKt___CollectionsKt.EZpvd(instance$default2.EZpvd(listEZpvd6, listEZpvd2), c20708glw.new Application());
        C10407bnq instance$default3 = C10407bnq.ActionBar.getInstance$default(actionBar, null, 1, null);
        java.util.List<C10525bqB> listEZpvd8 = CollectionsKt___CollectionsKt.EZpvd(arrayList3, new PendingIntent());
        WalletSelectedChainBean walletSelectedChainBean15 = c20708glw.OcIXYQ;
        if (walletSelectedChainBean15 != null && walletSelectedChainBean15.isAllNetwork()) {
            listEZpvd3 = yDY.gEmmrt(1, 2);
        } else {
            listEZpvd3 = C56402yEa.EZpvd(2);
        }
        java.util.List<C10525bqB> listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listEZpvd5, (java.lang.Iterable) listEZpvd7), (java.lang.Iterable) CollectionsKt___CollectionsKt.EZpvd(instance$default3.EZpvd(listEZpvd8, listEZpvd3), c20708glw.new ActionBar()));
        java.util.ArrayList<C20598gjs> arrayListAEQbTJ = c20708glw.AEQbTJ(listDjBIcL);
        arrayListAEQbTJ.addAll(c20708glw.copydefault(arrayList4));
        return new Triple(listDjBIcL, arrayListAEQbTJ, arrayList4);
    }

    public static final void QUSxYX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C20708glw c20708glw, Triple triple) {
        c20708glw.hDKMBd.clear();
        c20708glw.fetchVPNInfo.clear();
        c20708glw.hDKMBd.addAll((java.util.Collection) triple.getFirst());
        C33024moe.OLrzqt(c20708glw.AwvSrB, C20555gjB.OLrzqt((java.util.List) triple.getSecond(), false, false));
        c20708glw.fetchVPNInfo.addAll((java.util.Collection) triple.getThird());
        c20708glw.zuBGHE();
        return Unit.INSTANCE;
    }

    public static final void RcXXUw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fetchVPNInfo(C20708glw c20708glw, java.lang.Throwable th) {
        AbstractC32952mnL<C20603gjx> abstractC32952mnL = c20708glw.AwvSrB;
        Intrinsics.copydefault(th);
        C33024moe.setErrorValue$default(abstractC32952mnL, th, null, 2, null);
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC copydefault(final java.lang.String str) {
        java.util.List<C10525bqB> listAhwBna;
        AbstractC12782ctV abstractC12782ctV;
        java.util.Map<java.lang.String, java.util.List<C10525bqB>> mapHrNTAI;
        java.util.List<C10525bqB> list;
        AbstractC58260yxt abstractC58260yxtCopydefault;
        java.util.Map<java.lang.String, java.util.List<C10525bqB>> mapHrNTAI2;
        if (this.ejfBZ) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.DTwDnp, true);
            final Function1 function1 = new Function1() { // from class: o.glC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20708glw.EZpvd(this.AEQbTJ, str, (AbstractC12782ctV) obj);
                }
            };
            AbstractC58260yxt<R> abstractC58260yxtCopydefault2 = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.glH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C20708glw.AxsJAY(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.glE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20708glw.djBIcL(this.EZpvd, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.glF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20708glw.gHZMYf(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.glD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20708glw.gEmmrt(this.KWHzl, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.glG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20708glw.zuBGHE(function13, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            call().AEQbTJ(interfaceC58217yxCAEQbTJ);
            return interfaceC58217yxCAEQbTJ;
        }
        if (this.QKVWgx == null) {
            abstractC58260yxtCopydefault = AbstractC58260yxt.AEQbTJ(new java.lang.Throwable("Wallet is null."));
        } else {
            java.lang.String str2 = this.values;
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "from_receive")) {
                AbstractC12782ctV abstractC12782ctV2 = this.QKVWgx;
                if (abstractC12782ctV2 == null || (mapHrNTAI2 = abstractC12782ctV2.hrNTAI()) == null || (listAhwBna = mapHrNTAI2.get(str)) == null) {
                    listAhwBna = yDY.AhwBna();
                }
            } else if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "from_send") || (abstractC12782ctV = this.QKVWgx) == null || (mapHrNTAI = abstractC12782ctV.hrNTAI()) == null || (list = mapHrNTAI.get(str)) == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    C10525bqB c10525bqB = (C10525bqB) obj;
                    boolean zContains = this.valueOf.isEmpty() ^ true ? this.valueOf.contains(c10525bqB.KWHzl().djBIcL()) : true;
                    if (C33129mqd.AEQbTJ(c10525bqB.copydefault(), "0") && zContains) {
                        arrayList.add(obj);
                    }
                }
                listAhwBna = arrayList;
            }
            this.AhwBna.clear();
            this.AhwBna.addAll(listAhwBna);
            java.util.List<C10525bqB> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listAhwBna, C20690gle.OLrzqt.KWHzl());
            if (iwGUEr()) {
                listAhwBna = listEZpvd;
            }
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(OLrzqt(listAhwBna));
        }
        final Function1 function14 = new Function1() { // from class: o.glL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C20708glw.gEmmrt(this.EZpvd, (java.util.List) obj2);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.glK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                C20708glw.ORxRYg(function14, obj2);
            }
        };
        final Function1 function15 = new Function1() { // from class: o.glI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C20708glw.AYXKKw(this.OLrzqt, (java.lang.Throwable) obj2);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.glM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                C20708glw.DTwDnp(function15, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ2, "");
        call().AEQbTJ(interfaceC58217yxCAEQbTJ2);
        return interfaceC58217yxCAEQbTJ2;
    }

    public static final java.util.List AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List EZpvd(C20708glw c20708glw, java.lang.String str, AbstractC12782ctV abstractC12782ctV) {
        java.util.List<C10525bqB> listAhwBna;
        AbstractC12782ctV abstractC12782ctV2;
        java.util.Map<java.lang.String, java.util.List<C10525bqB>> mapHrNTAI;
        java.util.List<C10525bqB> list;
        java.util.Map<java.lang.String, java.util.List<C10525bqB>> mapHrNTAI2;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c20708glw.QKVWgx = abstractC12782ctV;
        java.lang.String str2 = c20708glw.values;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "from_receive")) {
            AbstractC12782ctV abstractC12782ctV3 = c20708glw.QKVWgx;
            if (abstractC12782ctV3 == null || (mapHrNTAI2 = abstractC12782ctV3.hrNTAI()) == null || (listAhwBna = mapHrNTAI2.get(str)) == null) {
                listAhwBna = yDY.AhwBna();
            }
        } else if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "from_send") || (abstractC12782ctV2 = c20708glw.QKVWgx) == null || (mapHrNTAI = abstractC12782ctV2.hrNTAI()) == null || (list = mapHrNTAI.get(str)) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (C33129mqd.AEQbTJ(((C10525bqB) obj).copydefault(), "0")) {
                    arrayList.add(obj);
                }
            }
            listAhwBna = arrayList;
        }
        c20708glw.AhwBna.clear();
        c20708glw.AhwBna.addAll(listAhwBna);
        java.util.List<C10525bqB> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listAhwBna, C20690gle.OLrzqt.KWHzl());
        if (c20708glw.iwGUEr()) {
            listAhwBna = listEZpvd;
        }
        return c20708glw.OLrzqt(listAhwBna);
    }

    public static final void gHZMYf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C20708glw c20708glw, java.util.List list) {
        c20708glw.ejfBZ = false;
        AbstractC32952mnL<C20603gjx> abstractC32952mnL = c20708glw.gHZMYf;
        Intrinsics.copydefault(list);
        C33024moe.OLrzqt(abstractC32952mnL, C20555gjB.OLrzqt(list, false, c20708glw.KWHzl(c20708glw.AhwBna)));
        return Unit.INSTANCE;
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(C20708glw c20708glw, java.lang.Throwable th) {
        c20708glw.ejfBZ = false;
        AbstractC32952mnL<C20603gjx> abstractC32952mnL = c20708glw.gHZMYf;
        Intrinsics.copydefault(th);
        C33024moe.setErrorValue$default(abstractC32952mnL, th, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final void ORxRYg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(C20708glw c20708glw, java.util.List list) {
        boolean zKWHzl = c20708glw.KWHzl(c20708glw.AhwBna);
        c20708glw.AkhnZx = zKWHzl;
        AbstractC32952mnL<C20603gjx> abstractC32952mnL = c20708glw.gHZMYf;
        Intrinsics.copydefault(list);
        C33024moe.OLrzqt(abstractC32952mnL, C20555gjB.OLrzqt(list, false, zKWHzl));
        c20708glw.AuCTelauCTel();
        return Unit.INSTANCE;
    }

    public static final void DTwDnp(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C20708glw c20708glw, java.lang.Throwable th) {
        AbstractC32952mnL<C20603gjx> abstractC32952mnL = c20708glw.gHZMYf;
        Intrinsics.copydefault(th);
        C33024moe.setErrorValue$default(abstractC32952mnL, th, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.glw */
    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC58217yxC AEQbTJ(final java.lang.String str) {
        java.util.List listAhwBna;
        AbstractC58260yxt abstractC58260yxtCopydefault;
        if (this.ejfBZ) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.DTwDnp, true);
            final Function1 function1 = new Function1() { // from class: o.glS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20708glw.KWHzl(this.EZpvd, str, (AbstractC12782ctV) obj);
                }
            };
            AbstractC58260yxt<R> abstractC58260yxtCopydefault2 = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.glV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C20708glw.QKVWgx(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.glZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20708glw.AYXKKw(this.KWHzl, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gmb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20708glw.QOLQEE(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.glX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20708glw.DbNXlk(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.glY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20708glw.OcIXYQ(function13, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            call().AEQbTJ(interfaceC58217yxCAEQbTJ);
            return interfaceC58217yxCAEQbTJ;
        }
        AbstractC12782ctV abstractC12782ctV = this.QKVWgx;
        if (abstractC12782ctV == null) {
            abstractC58260yxtCopydefault = AbstractC58260yxt.AEQbTJ(new java.lang.Throwable("Wallet is null."));
        } else {
            Intrinsics.copydefault(abstractC12782ctV);
            java.util.List<C10525bqB> list = KWHzl(abstractC12782ctV).get(str);
            if (list == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (KWHzl((C10525bqB) obj, this.zuBGHE)) {
                        listAhwBna.add(obj);
                    }
                }
            }
            this.AhwBna.clear();
            this.AhwBna.addAll(listAhwBna);
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(OLrzqt((java.util.List<C10525bqB>) listAhwBna));
        }
        final Function1 function14 = new Function1() { // from class: o.gma
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C20708glw.AkhnZx(this.EZpvd, (java.util.List) obj2);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.gme
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                C20708glw.QVAiDq(function14, obj2);
            }
        };
        final Function1 function15 = new Function1() { // from class: o.gmf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C20708glw.values(this.AEQbTJ, (java.lang.Throwable) obj2);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.gmc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                C20708glw.QfsBiF(function15, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ2, "");
        call().AEQbTJ(interfaceC58217yxCAEQbTJ2);
        return interfaceC58217yxCAEQbTJ2;
    }

    public static final java.util.List QKVWgx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.glw */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.util.List KWHzl(C20708glw c20708glw, java.lang.String str, AbstractC12782ctV abstractC12782ctV) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c20708glw.QKVWgx = abstractC12782ctV;
        java.util.List<C10525bqB> list = c20708glw.KWHzl(abstractC12782ctV).get(str);
        if (list == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (c20708glw.KWHzl((C10525bqB) obj, c20708glw.zuBGHE)) {
                    listAhwBna.add(obj);
                }
            }
        }
        c20708glw.AhwBna.clear();
        c20708glw.AhwBna.addAll(listAhwBna);
        return c20708glw.OLrzqt((java.util.List<C10525bqB>) listAhwBna);
    }

    public static final void QOLQEE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C20708glw c20708glw, java.util.List list) {
        c20708glw.ejfBZ = false;
        AbstractC32952mnL<C20603gjx> abstractC32952mnL = c20708glw.gHZMYf;
        Intrinsics.copydefault(list);
        C33024moe.OLrzqt(abstractC32952mnL, C20555gjB.OLrzqt(list, false, false));
        return Unit.INSTANCE;
    }

    public static final void OcIXYQ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit DbNXlk(C20708glw c20708glw, java.lang.Throwable th) {
        c20708glw.ejfBZ = false;
        AbstractC32952mnL<C20603gjx> abstractC32952mnL = c20708glw.gHZMYf;
        Intrinsics.copydefault(th);
        C33024moe.setErrorValue$default(abstractC32952mnL, th, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final void QVAiDq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(C20708glw c20708glw, java.util.List list) {
        AbstractC32952mnL<C20603gjx> abstractC32952mnL = c20708glw.gHZMYf;
        Intrinsics.copydefault(list);
        C33024moe.OLrzqt(abstractC32952mnL, C20555gjB.OLrzqt(list, false, false));
        c20708glw.AuCTelauCTel();
        return Unit.INSTANCE;
    }

    public static final void QfsBiF(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit values(C20708glw c20708glw, java.lang.Throwable th) {
        AbstractC32952mnL<C20603gjx> abstractC32952mnL = c20708glw.gHZMYf;
        Intrinsics.copydefault(th);
        C33024moe.setErrorValue$default(abstractC32952mnL, th, null, 2, null);
        return Unit.INSTANCE;
    }

    public final boolean wlaJM() {
        WalletSelectedChainBean walletSelectedChainBean;
        return AuCTel() && this.fARcdN && (walletSelectedChainBean = this.OcIXYQ) != null && !walletSelectedChainBean.isSingleMode() && this.wlaJM.length() > 0;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.wlaJM = str;
        if (str.length() == 0) {
            this.AuCTelauCTel.clear();
            this.AubY.clear();
        }
        if (wlaJM()) {
            djBIcL(str);
        } else {
            valueOf(str);
        }
    }

    public final void EZpvd(@NotNull java.util.List<C20598gjs> list) {
        Intrinsics.checkNotNullParameter(list, "");
        try {
            if (this.getNewProxyInstance.isEmpty() && (!list.isEmpty())) {
                this.getNewProxyInstance.addAll(list);
                pUU.EZpvd("TransferViewModel", "Captured initial converted chain order with " + this.getNewProxyInstance.size() + " chains");
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("TransferViewModel", "Error capturing initial chain order" + e);
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            this.wlaJM = str;
            EZpvd(str);
        } catch (java.lang.Exception e) {
            pUU.copydefault("TransferViewModel", "Error in searchChains" + e);
        }
    }

    public final void EZpvd(final java.lang.String str) {
        try {
            AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.just(this.getNewProxyInstance).observeOn(yBP.KWHzl());
            final Function1 function1 = new Function1() { // from class: o.glu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20708glw.OLrzqt(str, (java.util.ArrayList) obj);
                }
            };
            AbstractC58247yxg abstractC58247yxgObserveOn2 = abstractC58247yxgObserveOn.map(new InterfaceC58229yxO() { // from class: o.glx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C20708glw.djSkpj(function1, obj);
                }
            }).observeOn(C58266yxz.OLrzqt());
            final Function1 function12 = new Function1() { // from class: o.glJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20708glw.OLrzqt(this.copydefault, str, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.glU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20708glw.dNCPSb(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.gmg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20708glw.AkhnZx(this.KWHzl, (java.lang.Throwable) obj);
                }
            };
            call().AEQbTJ(abstractC58247yxgObserveOn2.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gmo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20708glw.UeEOUB(function13, obj);
                }
            }));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("TransferViewModel", "Error in searchChainsFromLocal setup", e);
        }
    }

    public static final java.util.List djSkpj(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List OLrzqt(java.lang.String str, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (str.length() == 0) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            C20598gjs c20598gjs = (C20598gjs) obj;
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c20598gjs.djBIcL(), (java.lang.CharSequence) str, true) || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c20598gjs.copydefault(), (java.lang.CharSequence) str, true)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final void dNCPSb(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C20708glw c20708glw, java.lang.String str, java.util.List list) {
        Intrinsics.copydefault(list);
        c20708glw.KWHzl((java.util.List<C20598gjs>) list, str);
        return Unit.INSTANCE;
    }

    public static final void UeEOUB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(C20708glw c20708glw, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        c20708glw.gEmmrt(th);
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.util.List<C20598gjs> list, java.lang.String str) {
        C33024moe.OLrzqt(this.gHZMYf, C20555gjB.OLrzqt(list, true, this.AkhnZx && str.length() == 0 && (list.isEmpty() ^ true)));
        if (Intrinsics.EZpvd((java.lang.Object) this.wlaJM, (java.lang.Object) str)) {
            this.gHZMYf.OLrzqt();
        }
    }

    public final void gEmmrt(java.lang.Throwable th) {
        pUU.AEQbTJ("TransferViewModel", "Error in searchChainsFromLocal: " + th.getMessage(), th);
        C33024moe.setErrorValue$default(this.gHZMYf, th, null, 2, null);
    }

    public final void valueOf(final java.lang.String str) {
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.just(this.hDKMBd).observeOn(yBP.KWHzl());
        final Function1 function1 = new Function1() { // from class: o.gmr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.copydefault(this.copydefault, str, (java.util.ArrayList) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn2 = abstractC58247yxgObserveOn.map(new InterfaceC58229yxO() { // from class: o.gmt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20708glw.fFgQHt(function1, obj);
            }
        }).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.gms
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.copydefault(this.OLrzqt, str, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gmv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20708glw.finit(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.gmw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58247yxgObserveOn2.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gmy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20708glw.fZBcTu(function13, obj);
            }
        }));
    }

    public static final java.util.List fFgQHt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final void finit(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C20708glw c20708glw, java.lang.String str, java.util.List list) {
        AbstractC32952mnL<C20603gjx> abstractC32952mnL = c20708glw.AwvSrB;
        Intrinsics.copydefault(list);
        C33024moe.OLrzqt(abstractC32952mnL, C20555gjB.OLrzqt(list, true, false));
        if (Intrinsics.EZpvd((java.lang.Object) c20708glw.wlaJM, (java.lang.Object) str)) {
            c20708glw.AwvSrB.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final void fZBcTu(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        pUU.KWHzl("TransferViewModel", C56379yDe.AEQbTJ(th));
        return Unit.INSTANCE;
    }

    public final void djBIcL(final java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.glR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C20708glw.AEQbTJ(this.AEQbTJ, str);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.glQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.KWHzl(this.AEQbTJ, str, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.glP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20708glw.dvKsVJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        call().AEQbTJ(C33024moe.subscribeOnIO$default(abstractC58185ywXKWHzl, new Function1() { // from class: o.glN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.djBIcL((java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.glO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.AEQbTJ(this.AEQbTJ, str, (java.util.ArrayList) obj);
            }
        }, 2, (java.lang.Object) null));
    }

    public static final kotlin.Pair AEQbTJ(C20708glw c20708glw, java.lang.String str) {
        WalletSelectedChainBean walletSelectedChainBean;
        java.lang.String chainId;
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<C10525bqB> listAEQbTJ = c20708glw.AEQbTJ(c20708glw.QKVWgx);
        if (listAEQbTJ != null) {
            for (C10525bqB c10525bqB : listAEQbTJ) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c10525bqB.KWHzl().fJNWhG(), (java.lang.CharSequence) str, true) || C59449zhJ.gEmmrt(c10525bqB.KWHzl().OLrzqt(), str, true)) {
                    WalletSelectedChainBean walletSelectedChainBean2 = c20708glw.OcIXYQ;
                    if ((walletSelectedChainBean2 != null && walletSelectedChainBean2.isAllNetwork()) || ((walletSelectedChainBean = c20708glw.OcIXYQ) != null && (chainId = walletSelectedChainBean.getChainId()) != null && c10525bqB.AEQbTJ() == java.lang.Long.parseLong(chainId))) {
                        map.put(java.lang.Long.valueOf(c10525bqB.OLrzqt()), c10525bqB);
                        arrayList.add(c10525bqB);
                    }
                }
            }
        }
        return C56390yDp.OLrzqt(map, arrayList);
    }

    public static final InterfaceC60096zvd dvKsVJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(final C20708glw c20708glw, java.lang.String str, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        AbstractC58185ywX<java.util.List<C20598gjs>> abstractC58185ywXEZpvd = c20708glw.EZpvd(str, c20708glw.isConnected, (java.util.HashMap<java.lang.Long, C10525bqB>) pair.getFirst());
        final Function1 function1 = new Function1() { // from class: o.gmj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.valueOf((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<java.util.List<C20598gjs>> abstractC58185ywXDjBIcL = abstractC58185ywXEZpvd.djBIcL(new InterfaceC58229yxO() { // from class: o.gmi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20708glw.dxcTrN(function1, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.gmk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C20708glw.KWHzl(pair, c20708glw);
            }
        });
        final Function2 function2 = new Function2() { // from class: o.gml
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20708glw.AEQbTJ(this.AEQbTJ, pair, (java.util.List) obj, (java.util.List) obj2);
            }
        };
        return AbstractC58185ywX.EZpvd(abstractC58185ywXDjBIcL, abstractC58185ywXAEQbTJ, new InterfaceC58223yxI() { // from class: o.gmq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C20708glw.KWHzl(function2, obj, obj2);
            }
        });
    }

    public static final java.util.List dxcTrN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List valueOf(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return yDY.AhwBna();
    }

    public static final java.util.List KWHzl(kotlin.Pair pair, C20708glw c20708glw) {
        java.util.List<java.lang.Integer> listEZpvd;
        C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null);
        java.util.List<C10525bqB> listEZpvd2 = CollectionsKt___CollectionsKt.EZpvd((java.lang.Iterable) pair.getSecond(), new LoaderManager());
        WalletSelectedChainBean walletSelectedChainBean = c20708glw.OcIXYQ;
        if (walletSelectedChainBean != null && walletSelectedChainBean.isAllNetwork()) {
            listEZpvd = yDY.gEmmrt(1, 2);
        } else {
            listEZpvd = C56402yEa.EZpvd(2);
        }
        return CollectionsKt___CollectionsKt.EZpvd(instance$default.EZpvd(listEZpvd2, listEZpvd), c20708glw.new ActionBar());
    }

    public static final java.util.ArrayList KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.util.ArrayList) function2.invoke(obj, obj2);
    }

    public static final java.util.ArrayList AEQbTJ(C20708glw c20708glw, kotlin.Pair pair, java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        c20708glw.AubY = (java.util.HashMap) pair.getFirst();
        java.util.ArrayList<C20598gjs> arrayListAEQbTJ = c20708glw.AEQbTJ((java.util.List<C10525bqB>) list2);
        arrayListAEQbTJ.addAll(list);
        c20708glw.AuCTelauCTel = arrayListAEQbTJ;
        return arrayListAEQbTJ;
    }

    public static final Unit AEQbTJ(C20708glw c20708glw, java.lang.String str, java.util.ArrayList arrayList) {
        AbstractC32952mnL<C20603gjx> abstractC32952mnL = c20708glw.AwvSrB;
        Intrinsics.copydefault(arrayList);
        C33024moe.OLrzqt(abstractC32952mnL, C20555gjB.OLrzqt(arrayList, true, false));
        if (Intrinsics.EZpvd((java.lang.Object) c20708glw.wlaJM, (java.lang.Object) str)) {
            c20708glw.AwvSrB.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.KWHzl("TransferViewModel", C56379yDe.AEQbTJ(th));
        return Unit.INSTANCE;
    }

    public final java.util.List<C10525bqB> AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
        java.util.List<C10525bqB> listAhwBna;
        java.util.List<C10525bqB> listAhwBna2;
        java.util.List<C10525bqB> list = this.EZpvd;
        if (list == null || list.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) "from_send")) {
                if (abstractC12782ctV == null || (listAhwBna2 = abstractC12782ctV.QHmsKR()) == null) {
                    listAhwBna2 = yDY.AhwBna();
                }
                arrayList.addAll(listAhwBna2);
            } else {
                if (abstractC12782ctV == null || (listAhwBna = abstractC12782ctV.QHmsKR()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                arrayList.addAll(listAhwBna);
            }
            this.EZpvd = arrayList;
        }
        return this.EZpvd;
    }

    public final void zLjUOn() {
        call().AEQbTJ(C33024moe.subscribeOnIO$default(EZpvd(this.wlaJM, this.zLjUOn + 1, this.AubY), new Function1() { // from class: o.glW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.AhwBna((java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.glT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.values(this.AEQbTJ, (java.util.List) obj);
            }
        }, 2, (java.lang.Object) null));
    }

    public static final Unit values(C20708glw c20708glw, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c20708glw.AuCTelauCTel.addAll(list);
        C33024moe.OLrzqt(c20708glw.AwvSrB, C20555gjB.OLrzqt(c20708glw.AuCTelauCTel, true, false));
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.KWHzl("TransferViewModel", C56379yDe.AEQbTJ(th));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r13v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<o.gjs>> */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC58185ywX<java.util.List<C20598gjs>> EZpvd(java.lang.String str, final int i, final java.util.HashMap<java.lang.Long, C10525bqB> map) {
        java.util.List listEZpvd;
        java.lang.String chainId;
        java.util.List list;
        java.util.List<C10854bwM> listOFhtUX;
        C13934dbu c13934dbu = this.fIwbmz;
        java.lang.Long fieldNames = null;
        java.lang.String strAhwBna = WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna();
        java.lang.String str2 = this.DTwDnp;
        java.util.List listAhwBna = yDY.AhwBna();
        WalletSelectedChainBean walletSelectedChainBean = this.OcIXYQ;
        if (walletSelectedChainBean == null || !walletSelectedChainBean.isAllNetwork()) {
            C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
            WalletSelectedChainBean walletSelectedChainBean2 = this.OcIXYQ;
            if (walletSelectedChainBean2 != null && (chainId = walletSelectedChainBean2.getChainId()) != null) {
                fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(chainId);
            }
            C10854bwM c10854bwMKWHzl = c10948byAValueOf.KWHzl(fieldNames);
            listEZpvd = C56402yEa.EZpvd(java.lang.Long.valueOf(c10854bwMKWHzl != null ? c10854bwMKWHzl.fetchVPNInfo() : 0L));
        } else {
            AbstractC12782ctV abstractC12782ctV = this.QKVWgx;
            if (abstractC12782ctV == null || (listOFhtUX = abstractC12782ctV.OFhtUX()) == null) {
                listEZpvd = yDY.AhwBna();
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOFhtUX, 10));
                java.util.Iterator<T> it = listOFhtUX.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Long.valueOf(((C10854bwM) it.next()).fetchVPNInfo()));
                }
                list = arrayList;
                WalletSelectedChainBean walletSelectedChainBean3 = this.OcIXYQ;
                AbstractC58185ywX<ResponseData<SearchCoinResp>> abstractC58185ywXOLrzqt = c13934dbu.OLrzqt(new SearchCoinReq(strAhwBna, str2, str, listAhwBna, list, walletSelectedChainBean3 == null && walletSelectedChainBean3.isAllNetwork(), i));
                final Function1 function1 = new Function1() { // from class: o.gmn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20708glw.KWHzl(this.OLrzqt, i, map, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gmu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C20708glw.fvQaOB(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
                return abstractC58185ywXAEQbTJ;
            }
        }
        list = listEZpvd;
        WalletSelectedChainBean walletSelectedChainBean32 = this.OcIXYQ;
        AbstractC58185ywX<ResponseData<SearchCoinResp>> abstractC58185ywXOLrzqt2 = c13934dbu.OLrzqt(new SearchCoinReq(strAhwBna, str2, str, listAhwBna, list, walletSelectedChainBean32 == null && walletSelectedChainBean32.isAllNetwork(), i));
        final Function1 function12 = new Function1() { // from class: o.gmn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20708glw.KWHzl(this.OLrzqt, i, map, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXOLrzqt2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gmu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20708glw.fvQaOB(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final java.util.List fvQaOB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final C10525bqB AEQbTJ(C20708glw c20708glw, long j, int i) {
        AbstractC12782ctV abstractC12782ctV = c20708glw.QKVWgx;
        C10525bqB c10525bqB = null;
        java.util.List<InterfaceC9742bbN> listKWHzl = abstractC12782ctV != null ? abstractC12782ctV.KWHzl(j) : null;
        if (listKWHzl != null) {
            int i2 = 0;
            for (java.lang.Object obj : listKWHzl) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                C10525bqB c10525bqB2 = (C10525bqB) obj;
                if (i2 == 0 && i == 0) {
                    if (c10525bqB2.KWHzl().dxcTrN()) {
                        c10525bqB2.DbNXlk();
                    }
                    c10525bqB = c10525bqB2;
                }
                if (i2 > 0 && c10525bqB != null) {
                    c10525bqB.EZpvd(c10525bqB2);
                }
                i2++;
            }
        }
        return c10525bqB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int copydefault(C10525bqB c10525bqB, java.lang.String str) {
        if (str.length() == 0) {
            WalletSelectedChainBean walletSelectedChainBean = this.OcIXYQ;
            if ((walletSelectedChainBean == null || !walletSelectedChainBean.isAllNetwork()) && c10525bqB.KWHzl().AuCTel()) {
                return 3;
            }
        } else {
            if (C59449zhJ.gEmmrt(c10525bqB.KWHzl().fJNWhG(), str, true)) {
                return 0;
            }
            if (C59449zhJ.AYXKKw(c10525bqB.KWHzl().fJNWhG(), str, true)) {
                return 1;
            }
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c10525bqB.KWHzl().fJNWhG(), (java.lang.CharSequence) str, true)) {
                return 2;
            }
        }
        return 4;
    }

    public final int KWHzl(C10525bqB c10525bqB, java.lang.String str) {
        if (str.length() != 0) {
            if (C59449zhJ.gEmmrt(c10525bqB.KWHzl().fJNWhG(), str, true)) {
                return 0;
            }
            if (C59449zhJ.AYXKKw(c10525bqB.KWHzl().fJNWhG(), str, true)) {
                return 1;
            }
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c10525bqB.KWHzl().fJNWhG(), (java.lang.CharSequence) str, true)) {
                return 2;
            }
        }
        return 3;
    }

    /* JADX INFO: renamed from: o.glw$ActionBar */
    public final class ActionBar implements java.util.Comparator<C10525bqB> {
        public int EZpvd;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[ORIG_RETURN, RETURN] */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int compare(@NotNull C10525bqB c10525bqB, @NotNull C10525bqB c10525bqB2) {
            Intrinsics.checkNotNullParameter(c10525bqB, "");
            Intrinsics.checkNotNullParameter(c10525bqB2, "");
            C20708glw c20708glw = C20708glw.this;
            int iCopydefault = c20708glw.copydefault(c10525bqB, c20708glw.AkhnZx());
            C20708glw c20708glw2 = C20708glw.this;
            int iCopydefault2 = iCopydefault - c20708glw2.copydefault(c10525bqB2, c20708glw2.AkhnZx());
            this.EZpvd = iCopydefault2;
            if (iCopydefault2 != 0) {
                return iCopydefault2;
            }
            if (C33129mqd.OLrzqt(c10525bqB.AhwBna(), c10525bqB2.AhwBna())) {
                if (C33129mqd.OLrzqt(c10525bqB.fIwbmz(), c10525bqB2.fIwbmz())) {
                    return c10525bqB.KWHzl().QfsBiF() - c10525bqB2.KWHzl().QfsBiF();
                }
                return C33129mqd.AEQbTJ(c10525bqB.fIwbmz(), c10525bqB2.fIwbmz()) ? -1 : 1;
            }
            if (C33129mqd.AEQbTJ(c10525bqB.AhwBna(), c10525bqB2.AhwBna())) {
            }
        }
    }

    /* JADX INFO: renamed from: o.glw$Application */
    public final class Application implements java.util.Comparator<C10525bqB> {
        public int copydefault;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[ORIG_RETURN, RETURN] */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int compare(@NotNull C10525bqB c10525bqB, @NotNull C10525bqB c10525bqB2) {
            Intrinsics.checkNotNullParameter(c10525bqB, "");
            Intrinsics.checkNotNullParameter(c10525bqB2, "");
            C20708glw c20708glw = C20708glw.this;
            int iKWHzl = c20708glw.KWHzl(c10525bqB, c20708glw.AkhnZx());
            C20708glw c20708glw2 = C20708glw.this;
            int iKWHzl2 = iKWHzl - c20708glw2.KWHzl(c10525bqB2, c20708glw2.AkhnZx());
            this.copydefault = iKWHzl2;
            if (iKWHzl2 != 0) {
                return iKWHzl2;
            }
            if (C33129mqd.OLrzqt(c10525bqB.AhwBna(), c10525bqB2.AhwBna())) {
                if (C33129mqd.OLrzqt(c10525bqB.fIwbmz(), c10525bqB2.fIwbmz())) {
                    return c10525bqB.KWHzl().QfsBiF() - c10525bqB2.KWHzl().QfsBiF();
                }
                return C33129mqd.AEQbTJ(c10525bqB.fIwbmz(), c10525bqB2.fIwbmz()) ? -1 : 1;
            }
            if (C33129mqd.AEQbTJ(c10525bqB.AhwBna(), c10525bqB2.AhwBna())) {
            }
        }
    }

    public final void zuBGHE() {
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        c11205cFp.zLjUOn().OLrzqt(this.djBIcL);
        c11205cFp.zLjUOn().AEQbTJ(this.djBIcL);
    }

    public final void AuCTelauCTel() {
        if (this.AhwBna.isEmpty()) {
            return;
        }
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        c11205cFp.zLjUOn().OLrzqt(this.gEmmrt);
        c11205cFp.zLjUOn().AEQbTJ(this.gEmmrt);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<C20598gjs> AEQbTJ(java.util.List<C10525bqB> list) {
        java.lang.String strAwvSrB;
        ButtonType buttonType;
        C13852daR c13852daRODWQjV;
        ButtonType buttonType2;
        boolean z;
        boolean zKWHzl;
        java.util.ArrayList<C20598gjs> arrayList = new java.util.ArrayList<>();
        for (java.util.Iterator it = list.iterator(); it.hasNext(); it = it) {
            C10525bqB c10525bqB = (C10525bqB) it.next();
            boolean zCopydefault = copydefault(c10525bqB);
            long jOLrzqt = c10525bqB.OLrzqt();
            long jAEQbTJ = c10525bqB.KWHzl().AEQbTJ();
            boolean z2 = c10525bqB.KWHzl().gHZMYf() == 1;
            java.lang.String strDbNXlk = c10525bqB.KWHzl().DbNXlk();
            java.lang.String strFJNWhG = c10525bqB.KWHzl().fJNWhG();
            java.lang.String strDjBIcL = (c10525bqB.KWHzl().AuCTel() && c10525bqB.KWHzl().giSNqX()) ? c10525bqB.KWHzl().djBIcL() : c10525bqB.KWHzl().gEmmrt();
            java.lang.String strDjBIcL2 = c10525bqB.KWHzl().djBIcL();
            if (zCopydefault || (!c10525bqB.ORxRYg() && !c10525bqB.KWHzl().DCUTEIddSDPG() && (!c10525bqB.KWHzl().giSNqX() || !c10525bqB.KWHzl().AuCTel()))) {
                strAwvSrB = "";
            } else {
                strAwvSrB = c10525bqB.AwvSrB();
            }
            java.lang.String str = strAwvSrB;
            java.lang.String displayAmount$default = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, false, true, 1, null);
            java.lang.String strAhwBna = c10525bqB.AhwBna();
            if (getFieldNames()) {
                buttonType2 = ButtonType.NO_BUTTON;
            } else if (c10525bqB.KWHzl().OuxcSI() && (c13852daRODWQjV = c10525bqB.values().ODWQjV()) != null && c13852daRODWQjV.AhwBna()) {
                buttonType2 = ButtonType.CREATE_ACCOUNT_BUTTON;
            } else {
                buttonType = !c10525bqB.values().AhwBna(java.lang.Long.valueOf(c10525bqB.AEQbTJ())) ? ButtonType.ACTIVE_BUTTON : ButtonType.NO_BUTTON;
                AbstractC12782ctV abstractC12782ctVValues = c10525bqB.values();
                java.lang.String strOLrzqt = c10525bqB.KWHzl().OLrzqt();
                boolean zORxRYg = c10525bqB.ORxRYg();
                if (!c10525bqB.values().AxsJAY()) {
                    zKWHzl = xZX.OLrzqt.copydefault(c10525bqB.KWHzl());
                } else if (c10525bqB.values().zuBGHE()) {
                    zKWHzl = OneKeyModule.OLrzqt.AEQbTJ(c10525bqB.KWHzl());
                } else if (!c10525bqB.values().sSMYrx()) {
                    z = true;
                    arrayList.add(new C20598gjs(jOLrzqt, strDbNXlk, jAEQbTJ, z2, strFJNWhG, strDjBIcL, strDjBIcL2, str, displayAmount$default, strAhwBna, buttonType, abstractC12782ctVValues, strOLrzqt, zORxRYg, true, null, null, z, false, null, c10525bqB.fARcdN(), c10525bqB.KWHzl().fetchVPNInfo(), c10525bqB.KWHzl().fJNWhG(), zCopydefault ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.initializeReflectiveFields) : null, 884736, null));
                } else {
                    zKWHzl = LedgerSignHelper.AEQbTJ.KWHzl(c10525bqB.KWHzl());
                }
                z = zKWHzl;
                arrayList.add(new C20598gjs(jOLrzqt, strDbNXlk, jAEQbTJ, z2, strFJNWhG, strDjBIcL, strDjBIcL2, str, displayAmount$default, strAhwBna, buttonType, abstractC12782ctVValues, strOLrzqt, zORxRYg, true, null, null, z, false, null, c10525bqB.fARcdN(), c10525bqB.KWHzl().fetchVPNInfo(), c10525bqB.KWHzl().fJNWhG(), zCopydefault ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.initializeReflectiveFields) : null, 884736, null));
            }
            buttonType = buttonType2;
            AbstractC12782ctV abstractC12782ctVValues2 = c10525bqB.values();
            java.lang.String strOLrzqt2 = c10525bqB.KWHzl().OLrzqt();
            boolean zORxRYg2 = c10525bqB.ORxRYg();
            if (!c10525bqB.values().AxsJAY()) {
            }
            z = zKWHzl;
            arrayList.add(new C20598gjs(jOLrzqt, strDbNXlk, jAEQbTJ, z2, strFJNWhG, strDjBIcL, strDjBIcL2, str, displayAmount$default, strAhwBna, buttonType, abstractC12782ctVValues2, strOLrzqt2, zORxRYg2, true, null, null, z, false, null, c10525bqB.fARcdN(), c10525bqB.KWHzl().fetchVPNInfo(), c10525bqB.KWHzl().fJNWhG(), zCopydefault ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.initializeReflectiveFields) : null, 884736, null));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault(C10525bqB c10525bqB) {
        if (!AuCTel()) {
            java.lang.Integer num = this.fJNWhG;
            if (num != null) {
                int value = MultiTransferMode.MODE_NONE.getValue();
                if (num != null && num.intValue() == value) {
                    if (c10525bqB.QOLQEE() && (c10525bqB.values().AubY() || c10525bqB.values().AwvSrB())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<C20598gjs> OLrzqt(java.util.List<C10525bqB> list) {
        java.util.Iterator it;
        ButtonType buttonType;
        C13852daR c13852daRODWQjV;
        boolean z;
        boolean zKWHzl;
        java.lang.String strAYXKKw;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C10525bqB c10525bqB = (C10525bqB) it2.next();
            C10854bwM c10854bwMIsConnected = c10525bqB.isConnected();
            if (c10854bwMIsConnected != null) {
                long jOLrzqt = c10525bqB.OLrzqt();
                java.lang.String strAYXKKw2 = c10854bwMIsConnected.AYXKKw();
                long jAEQbTJ = c10525bqB.KWHzl().AEQbTJ();
                boolean z2 = c10525bqB.KWHzl().gHZMYf() == 1;
                java.lang.String strDNCPSb = c10525bqB.KWHzl().dNCPSb();
                java.lang.String strGEmmrt = c10525bqB.KWHzl().gEmmrt();
                java.lang.String strDjBIcL = c10525bqB.KWHzl().djBIcL();
                java.lang.String displayAmount$default = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, false, false, 3, null);
                java.lang.String strAhwBna = c10525bqB.AhwBna();
                if (getFieldNames()) {
                    buttonType = ButtonType.NO_BUTTON;
                } else if (c10525bqB.KWHzl().OuxcSI() && (c13852daRODWQjV = c10525bqB.values().ODWQjV()) != null && c13852daRODWQjV.AhwBna()) {
                    buttonType = ButtonType.CREATE_ACCOUNT_BUTTON;
                } else {
                    buttonType = !c10525bqB.values().AhwBna(java.lang.Long.valueOf(c10854bwMIsConnected.AEQbTJ())) ? ButtonType.ACTIVE_BUTTON : ButtonType.NO_BUTTON;
                }
                ButtonType buttonType2 = buttonType;
                AbstractC12782ctV abstractC12782ctVValues = c10525bqB.values();
                java.lang.String strOLrzqt = c10854bwMIsConnected.OLrzqt();
                if (c10525bqB.values().AxsJAY()) {
                    zKWHzl = xZX.OLrzqt.copydefault(c10525bqB.KWHzl());
                } else if (c10525bqB.values().zuBGHE()) {
                    zKWHzl = OneKeyModule.OLrzqt.AEQbTJ(c10525bqB.KWHzl());
                } else if (c10525bqB.values().sSMYrx()) {
                    zKWHzl = LedgerSignHelper.AEQbTJ.KWHzl(c10525bqB.KWHzl());
                } else {
                    z = true;
                    java.util.ArrayList<java.lang.Long> arrayListFARcdN = c10525bqB.fARcdN();
                    long jFetchVPNInfo = c10525bqB.KWHzl().fetchVPNInfo();
                    java.lang.String strFJNWhG = c10525bqB.KWHzl().fJNWhG();
                    if (copydefault(c10525bqB)) {
                        strAYXKKw = (c10525bqB.QVAiDq() && c10525bqB.KWHzl().fetchVPNInfo() == 196) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDisplayShowHomeEnabled) : null;
                    } else {
                        strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.initializeReflectiveFields);
                    }
                    it = it2;
                    arrayList.add(new C20598gjs(jOLrzqt, strAYXKKw2, jAEQbTJ, z2, strDNCPSb, strGEmmrt, strDjBIcL, "", displayAmount$default, strAhwBna, buttonType2, abstractC12782ctVValues, strOLrzqt, false, true, null, null, z, false, null, arrayListFARcdN, jFetchVPNInfo, strFJNWhG, strAYXKKw, 884736, null));
                }
                z = zKWHzl;
                java.util.ArrayList<java.lang.Long> arrayListFARcdN2 = c10525bqB.fARcdN();
                long jFetchVPNInfo2 = c10525bqB.KWHzl().fetchVPNInfo();
                java.lang.String strFJNWhG2 = c10525bqB.KWHzl().fJNWhG();
                if (copydefault(c10525bqB)) {
                }
                it = it2;
                arrayList.add(new C20598gjs(jOLrzqt, strAYXKKw2, jAEQbTJ, z2, strDNCPSb, strGEmmrt, strDjBIcL, "", displayAmount$default, strAhwBna, buttonType2, abstractC12782ctVValues, strOLrzqt, false, true, null, null, z, false, null, arrayListFARcdN2, jFetchVPNInfo2, strFJNWhG2, strAYXKKw, 884736, null));
            } else {
                it = it2;
            }
            it2 = it;
        }
        return arrayList;
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        c11205cFp.zLjUOn().OLrzqt(this.djBIcL);
        c11205cFp.zLjUOn().OLrzqt(this.gEmmrt);
    }

    public final boolean KWHzl(C10525bqB c10525bqB, java.util.List<java.lang.Long> list) {
        C10854bwM c10854bwMIsConnected;
        return C33129mqd.KWHzl((java.util.Collection) list) && ((list != null && list.contains(java.lang.Long.valueOf(c10525bqB.gEmmrt()))) || (list != null && list.contains(-2000L) && (c10854bwMIsConnected = c10525bqB.isConnected()) != null && c10854bwMIsConnected.ejfBZ())) && !c10525bqB.KWHzl().DarRvM();
    }

    public final java.util.Map<java.lang.String, java.util.List<C10525bqB>> KWHzl(AbstractC12782ctV abstractC12782ctV) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, java.util.List<C10854bwM>> entry : C10954byG.EZpvd.valueOf().KWHzl().entrySet()) {
            for (C10854bwM c10854bwM : entry.getValue()) {
                if (linkedHashMap.get(entry.getKey()) == null) {
                    linkedHashMap.put(entry.getKey(), new java.util.ArrayList());
                }
                java.util.ArrayList arrayList = (java.util.ArrayList) linkedHashMap.get(entry.getKey());
                if (arrayList != null) {
                    arrayList.add(C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwM, abstractC12782ctV, null, 4, null));
                }
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) linkedHashMap.get(entry.getKey());
            if (arrayList2 != null) {
                C56407yEf.copydefault(arrayList2, C10532bqI.AEQbTJ);
            }
        }
        return linkedHashMap;
    }

    public final Job fJNWhG() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TransferViewModel$getWalletBindToken$1(this, null), 3, null);
    }

    public static final C19330fzJ copydefault() {
        return new C19330fzJ();
    }

    public final C19330fzJ isConnected() {
        return (C19330fzJ) this.QOLQEE.getValue();
    }

    public final C19329fzI EZpvd() {
        return (C19329fzI) this.AYXKKw.getValue();
    }

    public static final C19329fzI isConnected(C20708glw c20708glw) {
        return new C19329fzI(c20708glw.isConnected());
    }

    public final Job KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TransferViewModel$startCeFiBind$1(this, str, str2, null), 3, null);
    }

    public final boolean KWHzl(java.util.List<C10525bqB> list) {
        java.lang.Object next;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C10525bqB) next).gEmmrt() == 196) {
                break;
            }
        }
        C10525bqB c10525bqB = (C10525bqB) next;
        return AuCTel() && c10525bqB != null && c10525bqB.QVAiDq();
    }

    public final java.util.List<C20598gjs> copydefault(java.util.List<C10594brR> list) {
        java.lang.String strIsConnected;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C10594brR c10594brR : list) {
            long jOLrzqt = c10594brR.OLrzqt();
            long jCopydefault = c10594brR.fetchVPNInfo().copydefault();
            boolean z = c10594brR.KWHzl().gHZMYf() == 1;
            java.lang.String strFetchVPNInfo = c10594brR.fetchVPNInfo().fetchVPNInfo();
            java.lang.String strFJNWhG = c10594brR.KWHzl().fJNWhG();
            java.lang.String strValues = c10594brR.KWHzl().values();
            java.lang.String strDjBIcL = c10594brR.KWHzl().djBIcL();
            java.lang.String strEZpvd = C54870xYj.EZpvd(c10594brR.values(), c10594brR.KWHzl().valueOf(), c10594brR.KWHzl().AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            java.lang.String strAhwBna = c10594brR.AhwBna();
            ButtonType buttonType = ButtonType.NO_BUTTON;
            AbstractC12782ctV abstractC12782ctVDbNXlk = c10594brR.DbNXlk();
            java.lang.String strDjBIcL2 = c10594brR.fetchVPNInfo().djBIcL();
            CustomChainMeta customChainMetaOLrzqt = c10594brR.fetchVPNInfo().OLrzqt();
            if (customChainMetaOLrzqt == null || (strIsConnected = customChainMetaOLrzqt.isConnected()) == null) {
                strIsConnected = "";
            }
            arrayList.add(new C20598gjs(jOLrzqt, strFetchVPNInfo, jCopydefault, z, strFJNWhG, strValues, strDjBIcL, "", strEZpvd, strAhwBna, buttonType, abstractC12782ctVDbNXlk, strDjBIcL2, false, true, "", "", true, true, strIsConnected, null, c10594brR.KWHzl().fetchVPNInfo(), c10594brR.KWHzl().fJNWhG(), null, 8388608, null));
        }
        return arrayList;
    }

    public final boolean iwGUEr() {
        java.lang.Object next;
        java.util.Iterator<T> it = this.AhwBna.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C10525bqB) next).gEmmrt() == 196) {
                break;
            }
        }
        C10525bqB c10525bqB = (C10525bqB) next;
        return c10525bqB != null && c10525bqB.QVAiDq();
    }

    public static final java.util.List copydefault(C20708glw c20708glw, java.lang.String str, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            C10525bqB c10525bqB = (C10525bqB) obj;
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c10525bqB.KWHzl().fJNWhG(), (java.lang.CharSequence) str, true) || C59449zhJ.gEmmrt(c10525bqB.KWHzl().OLrzqt(), str, true)) {
                arrayList2.add(obj);
            }
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList2, new Fragment(str, c20708glw));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listEZpvd) {
            if (((C10525bqB) obj2).ORxRYg()) {
                arrayList3.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj3 : arrayList3) {
            java.lang.String strFJNWhG = ((C10525bqB) obj3).KWHzl().fJNWhG();
            java.lang.Object arrayList4 = linkedHashMap.get(strFJNWhG);
            if (arrayList4 == null) {
                arrayList4 = new java.util.ArrayList();
                linkedHashMap.put(strFJNWhG, arrayList4);
            }
            ((java.util.List) arrayList4).add(obj3);
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj4 : listEZpvd) {
            C10525bqB c10525bqB2 = (C10525bqB) obj4;
            if ((!c10525bqB2.ORxRYg() && (c10525bqB2.values().fetchVPNInfo(c10525bqB2.wlaJM()) || linkedHashMap.get(c10525bqB2.KWHzl().fJNWhG()) == null)) || c10525bqB2.ORxRYg() || c10525bqB2.KWHzl().DcqEDu()) {
                arrayList5.add(obj4);
            }
        }
        java.util.ArrayList<C10594brR> arrayList6 = c20708glw.fetchVPNInfo;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        for (java.lang.Object obj5 : arrayList6) {
            C10594brR c10594brR = (C10594brR) obj5;
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c10594brR.KWHzl().fJNWhG(), (java.lang.CharSequence) str, true) || C59449zhJ.gEmmrt(c10594brR.fetchVPNInfo().djBIcL(), str, true)) {
                arrayList7.add(obj5);
            }
        }
        java.util.List<C10594brR> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList7);
        java.util.List listFJNWhG2 = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c20708glw.AEQbTJ(arrayList5));
        listFJNWhG2.addAll(c20708glw.copydefault(listFJNWhG));
        return listFJNWhG2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: o.bqB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, o.bqB] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, o.bqB] */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, o.bqB] */
    public static final java.util.List KWHzl(C20708glw c20708glw, int i, java.util.HashMap map, ResponseData responseData) {
        java.util.List<SearchCoinMetaBean> coinInfo;
        T t;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            SearchCoinResp searchCoinResp = (SearchCoinResp) responseData.getData();
            java.util.List<SearchCoinMetaBean> coinInfo2 = searchCoinResp != null ? searchCoinResp.getCoinInfo() : null;
            if (coinInfo2 != null && !coinInfo2.isEmpty()) {
                c20708glw.zLjUOn = i;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        SearchCoinResp searchCoinResp2 = (SearchCoinResp) responseData.getData();
        if (searchCoinResp2 != null && (coinInfo = searchCoinResp2.getCoinInfo()) != null) {
            for (SearchCoinMetaBean searchCoinMetaBean : coinInfo) {
                java.lang.Long lM6405getCoinId = searchCoinMetaBean.m6405getCoinId();
                if (lM6405getCoinId != null) {
                    long jLongValue = lM6405getCoinId.longValue();
                    if (!map.containsKey(java.lang.Long.valueOf(jLongValue))) {
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        if (searchCoinMetaBean.m6406isAggregation()) {
                            java.util.ArrayList<java.lang.Long> coinIds = searchCoinMetaBean.getCoinIds();
                            if (coinIds != null) {
                                int i2 = 0;
                                for (java.lang.Object obj : coinIds) {
                                    if (i2 < 0) {
                                        yDY.AYXKKw();
                                    }
                                    ?? AEQbTJ = AEQbTJ(c20708glw, ((java.lang.Number) obj).longValue(), i2);
                                    if (AEQbTJ != 0) {
                                        if (i2 == 0 || (t = objectRef.element) == 0) {
                                            objectRef.element = AEQbTJ;
                                            AEQbTJ.DbNXlk();
                                        } else {
                                            C10525bqB c10525bqB = (C10525bqB) t;
                                            if (c10525bqB != 0) {
                                                c10525bqB.EZpvd((C10525bqB) AEQbTJ);
                                            }
                                        }
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            objectRef.element = AEQbTJ(c20708glw, jLongValue, 0);
                        }
                        if (objectRef.element == 0) {
                            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(searchCoinMetaBean.m6405getCoinId());
                            C10525bqB.StateListAnimator stateListAnimator = C10525bqB.Companion;
                            java.lang.Long lM6405getCoinId2 = searchCoinMetaBean.m6405getCoinId();
                            long jLongValue2 = lM6405getCoinId2 != null ? lM6405getCoinId2.longValue() : 0L;
                            java.lang.Long chainId = searchCoinMetaBean.getChainId();
                            long jLongValue3 = chainId != null ? chainId.longValue() : 0L;
                            java.lang.String symbol = searchCoinMetaBean.getSymbol();
                            C10854bwM c10854bwM = new C10854bwM(new CoinMetaBean(jLongValue2, jLongValue3, 0L, 0L, searchCoinMetaBean.getName(), searchCoinMetaBean.getChainName(), symbol, searchCoinMetaBean.getImageUrl(), (java.lang.String) null, searchCoinMetaBean.getAddress(), 0, 0, 0, 0, searchCoinMetaBean.getTokenType(), false, false, (java.lang.Integer) null, false, 0, searchCoinMetaBean.aggregationType(), 0, false, false, (java.lang.String) null, (FactionInfo) null, (java.lang.Boolean) null, 0, 0, false, (java.lang.Boolean) null, (java.lang.Long) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, 0, (java.lang.Integer) null, (java.lang.Integer) null, c10854bwMKWHzl != null ? c10854bwMKWHzl.getNewProxyInstance() : false, c10854bwMKWHzl != null ? c10854bwMKWHzl.AkhnZx() : 6, c10854bwMKWHzl != null ? c10854bwMKWHzl.RcXXUw() : false, (java.lang.String) null, -1065716, 575, (DefaultConstructorMarker) null));
                            AbstractC12782ctV abstractC12782ctV = c20708glw.QKVWgx;
                            Intrinsics.copydefault(abstractC12782ctV);
                            ?? FromCoinMeta$default = C10525bqB.StateListAnimator.fromCoinMeta$default(stateListAnimator, c10854bwM, abstractC12782ctV, null, 4, null);
                            if (FromCoinMeta$default.KWHzl().giSNqX()) {
                                FromCoinMeta$default.DbNXlk();
                                FromCoinMeta$default.KWHzl(searchCoinMetaBean.getCoinIds());
                            }
                            objectRef.element = FromCoinMeta$default;
                        }
                        T t2 = objectRef.element;
                        Intrinsics.copydefault(t2);
                        arrayList.add(t2);
                    }
                }
            }
        }
        return c20708glw.AEQbTJ(arrayList);
    }
}
