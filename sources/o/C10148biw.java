package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.assets.detail.TransactionDetailViewModel$cancelBTCTransaction$1;
import com.okinc.business.defi.assets.detail.TransactionDetailViewModel$rebroadcastBTCTransaction$1;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.customchain.sub.CustomChainTxSubject;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10148biw;
import o.C10407bnq;
import o.C10614brl;
import o.C12827cuN;
import o.InterfaceC9739bbK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.biw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10148biw extends AbstractC33073mpa {
    public StateListAnimator AEQbTJ;
    public final MutableLiveData<TxIdOrHashHistoryDetail> AYXKKw;
    public final LiveData<C10185bjg> AhwBna;
    public final C12827cuN DbNXlk;
    public final MutableLiveData<C10185bjg> EZpvd;
    public InterfaceC58217yxC KWHzl;
    public boolean OLrzqt;
    public final MutableLiveData<C10052bhF> copydefault;
    public final C10407bnq djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final LiveData<TxIdOrHashHistoryDetail> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C10148biw() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<TxIdOrHashHistoryDetail> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C10185bjg> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C10052bhF> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:o.bnq:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bnq:0x0008: INVOKE 
  (wrap:o.bnq$ActionBar:0x0006: SGET  A[WRAPPED] (LINE:31) o.bnq.Companion o.bnq$ActionBar)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.bnq.ActionBar.getInstance$default(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq A[MD:(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq (m), WRAPPED] (LINE:31)) : (r3v0 o.bnq))
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0012: INVOKE 
  (wrap:o.cuN$Application:0x0010: SGET  A[WRAPPED] (LINE:32) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:32)) : (r4v0 o.cuN))
 A[MD:(o.bnq, o.cuN):void (m)] (LINE:30) call: o.biw.<init>(o.bnq, o.cuN):void type: THIS */
    public /* synthetic */ C10148biw(C10407bnq c10407bnq, C12827cuN c12827cuN, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null) : c10407bnq, (i & 2) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN);
    }

    public C10148biw(@NotNull C10407bnq c10407bnq, @NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c10407bnq, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.djBIcL = c10407bnq;
        this.DbNXlk = c12827cuN;
        MutableLiveData<TxIdOrHashHistoryDetail> mutableLiveData = new MutableLiveData<>();
        this.AYXKKw = mutableLiveData;
        MutableLiveData<C10185bjg> mutableLiveData2 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData2;
        this.OLrzqt = true;
        this.copydefault = new MutableLiveData<>();
        this.valueOf = mutableLiveData;
        this.AhwBna = mutableLiveData2;
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.biE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10148biw.OLrzqt();
            }
        });
    }

    private final C13934dbu valueOf() {
        return (C13934dbu) this.gEmmrt.getValue();
    }

    public static final C13934dbu OLrzqt() {
        return new C13934dbu();
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final long j, @NotNull final java.lang.String str4, final java.lang.String str5, final java.lang.String str6, final java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.biM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10148biw.EZpvd(this.KWHzl, str, str2, str3, j, str4, str5, str6, str7, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEnsureInitialized$default.KWHzl(new InterfaceC58229yxO() { // from class: o.biO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10148biw.uzCIH(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.biQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10148biw.EZpvd(this.OLrzqt, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.biS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10148biw.iwGUEr(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.biP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10148biw.OLrzqt(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.biR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10148biw.zLjUOn(function13, obj);
            }
        });
        call().AEQbTJ(interfaceC58217yxCAEQbTJ);
        this.KWHzl = interfaceC58217yxCAEQbTJ;
    }

    public static final InterfaceC60096zvd uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C10148biw c10148biw, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return c10148biw.valueOf().copydefault(str, str2, str3, j, str4, str5, str6, str7);
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C10148biw c10148biw, java.lang.Throwable th) {
        MutableLiveData<C10185bjg> mutableLiveData = c10148biw.EZpvd;
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        mutableLiveData.setValue(new C10185bjg(null, message));
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<C10746buK> abstractC58260yxtEZpvd = C10747buL.AEQbTJ.EZpvd(str);
        final Function1 function1 = new Function1() { // from class: o.biD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10148biw.copydefault(str2, (C10746buK) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtEZpvd.OLrzqt(new InterfaceC58229yxO() { // from class: o.biC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10148biw.hDKMBd(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.biA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10148biw.copydefault(this.copydefault, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.biJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10148biw.getFieldNames(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.biI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10148biw.EZpvd(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.biH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10148biw.getNewProxyInstance(function13, obj);
            }
        }));
    }

    public static final InterfaceC58261yxu copydefault(java.lang.String str, final C10746buK c10746buK) {
        CustomChainMeta customChainMetaOLrzqt;
        java.lang.String strIsConnected;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(c10746buK, "");
        if (c10746buK.isConnected() == 4) {
            java.lang.String strEZpvd = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).EZpvd(str, java.lang.String.valueOf(c10746buK.AEQbTJ()));
            C10598brV c10598brV = C10598brV.AEQbTJ;
            CustomChainCoinMeta customChainCoinMetaCopydefault = c10598brV.copydefault(c10746buK.copydefault(), strEZpvd);
            if (customChainCoinMetaCopydefault != null && (customChainMetaOLrzqt = customChainCoinMetaCopydefault.OLrzqt()) != null && (strIsConnected = customChainMetaOLrzqt.isConnected()) != null) {
                str2 = strIsConnected;
            }
            AbstractC58260yxt<ContractAddressResp> abstractC58260yxtAEQbTJ = c10598brV.AEQbTJ(str2, c10746buK.AhwBna());
            final Function1 function1 = new Function1() { // from class: o.biv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10148biw.EZpvd(c10746buK, (ContractAddressResp) obj);
                }
            };
            InterfaceC58261yxu interfaceC58261yxuCopydefault = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.biB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10148biw.AuCTel(function1, obj);
                }
            });
            Intrinsics.copydefault(interfaceC58261yxuCopydefault);
            return interfaceC58261yxuCopydefault;
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(c10746buK, null));
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final kotlin.Pair AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(C10746buK c10746buK, ContractAddressResp contractAddressResp) {
        Intrinsics.checkNotNullParameter(contractAddressResp, "");
        return C56390yDp.OLrzqt(c10746buK, contractAddressResp);
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C10148biw c10148biw, kotlin.Pair pair) {
        c10148biw.AYXKKw.setValue(((C10746buK) pair.getFirst()).OLrzqt((ContractAddressResp) pair.getSecond()));
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C10148biw c10148biw, java.lang.Throwable th) {
        MutableLiveData<C10185bjg> mutableLiveData = c10148biw.EZpvd;
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        mutableLiveData.setValue(new C10185bjg(null, message));
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str, final java.lang.Long l) {
        if (str == null || str.length() <= 0) {
            return;
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true);
        final Function1 function1 = new Function1() { // from class: o.bix
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10148biw.EZpvd(l, this, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.biz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10148biw.AuCTelauCTel(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.biF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10148biw.EZpvd((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.biT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10148biw.wlaJM(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        call().AEQbTJ(interfaceC58217yxCAEQbTJ);
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Long l, C10148biw c10148biw, AbstractC12782ctV abstractC12782ctV) {
        java.util.List<ChainAddress> listDbNXlk;
        if (l != null && (listDbNXlk = abstractC12782ctV.DbNXlk(l.longValue())) != null) {
            MutableLiveData<C10052bhF> mutableLiveData = c10148biw.copydefault;
            Intrinsics.copydefault(abstractC12782ctV);
            mutableLiveData.setValue(new C10052bhF(listDbNXlk, abstractC12782ctV));
        }
        return Unit.INSTANCE;
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.biw$ActionBar */
    public static final class ActionBar extends StateListAnimator {
        public final /* synthetic */ C10148biw copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(java.lang.String str, C10148biw c10148biw, java.lang.String str2, long j, long j2, java.lang.String str3, java.util.List<java.lang.String> list) {
            super(str, str2, j, j2, str3, list);
            this.copydefault = c10148biw;
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)V */
        @Override // o.C10148biw.StateListAnimator, o.AbstractC10707btY
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void OLrzqt(final C10746buK c10746buK) {
            CustomChainMeta customChainMetaOLrzqt;
            java.lang.String strIsConnected;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(c10746buK, "");
            super.OLrzqt(c10746buK);
            if (c10746buK.isConnected() != 4) {
                this.copydefault.AYXKKw.setValue(C10746buK.convertToTxIdOrHashHistoryDetail$default(c10746buK, null, 1, null));
                return;
            }
            C10598brV c10598brV = C10598brV.AEQbTJ;
            CustomChainCoinMeta customChainCoinMetaOLrzqt = c10598brV.OLrzqt(c10746buK.copydefault());
            if (customChainCoinMetaOLrzqt != null && (customChainMetaOLrzqt = customChainCoinMetaOLrzqt.OLrzqt()) != null && (strIsConnected = customChainMetaOLrzqt.isConnected()) != null) {
                str = strIsConnected;
            }
            AbstractC58260yxt<ContractAddressResp> abstractC58260yxtAEQbTJ = c10598brV.AEQbTJ(str, c10746buK.AhwBna());
            final C10148biw c10148biw = this.copydefault;
            final Function1 function1 = new Function1() { // from class: o.bja
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10148biw.ActionBar.EZpvd(c10148biw, c10746buK, (ContractAddressResp) obj);
                }
            };
            InterfaceC58227yxM<? super ContractAddressResp> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bjb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C10148biw.ActionBar.KWHzl(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.bjc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10148biw.ActionBar.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            Intrinsics.copydefault(abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.biZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C10148biw.ActionBar.OLrzqt(function12, obj);
                }
            }));
        }

        public static final void KWHzl(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(C10148biw c10148biw, C10746buK c10746buK, ContractAddressResp contractAddressResp) {
            c10148biw.AYXKKw.setValue(c10746buK.OLrzqt(contractAddressResp));
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(java.lang.Throwable th) {
            return Unit.INSTANCE;
        }

        public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str5 = str2 == null ? "" : str2;
        C10598brV c10598brV = C10598brV.AEQbTJ;
        CustomChainCoinMeta customChainCoinMetaOLrzqt = c10598brV.OLrzqt(j);
        long jCopydefault = customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.copydefault() : -1L;
        CustomChainCoinMeta customChainCoinMetaOLrzqt2 = c10598brV.OLrzqt(j);
        this.AEQbTJ = new ActionBar(str, this, str5, jCopydefault, customChainCoinMetaOLrzqt2 != null ? customChainCoinMetaOLrzqt2.valueOf() : -1L, str4 == null ? "" : str4, C56402yEa.EZpvd(str3 != null ? str3 : ""));
        CustomChainTxSubject customChainTxSubjectKWHzl = C10762bua.AEQbTJ.KWHzl();
        StateListAnimator stateListAnimator = this.AEQbTJ;
        Intrinsics.copydefault(stateListAnimator);
        customChainTxSubjectKWHzl.KWHzl(stateListAnimator);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        StateListAnimator stateListAnimator = this.AEQbTJ;
        if (stateListAnimator != null) {
            C10762bua.AEQbTJ.KWHzl().OLrzqt(stateListAnimator);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        TransactionDetailViewModel$rebroadcastBTCTransaction$1 transactionDetailViewModel$rebroadcastBTCTransaction$1;
        if (continuation instanceof TransactionDetailViewModel$rebroadcastBTCTransaction$1) {
            transactionDetailViewModel$rebroadcastBTCTransaction$1 = (TransactionDetailViewModel$rebroadcastBTCTransaction$1) continuation;
            int i = transactionDetailViewModel$rebroadcastBTCTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionDetailViewModel$rebroadcastBTCTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionDetailViewModel$rebroadcastBTCTransaction$1 = new TransactionDetailViewModel$rebroadcastBTCTransaction$1(this, continuation);
            }
        }
        TransactionDetailViewModel$rebroadcastBTCTransaction$1 transactionDetailViewModel$rebroadcastBTCTransaction$12 = transactionDetailViewModel$rebroadcastBTCTransaction$1;
        java.lang.Object objKWHzl = transactionDetailViewModel$rebroadcastBTCTransaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionDetailViewModel$rebroadcastBTCTransaction$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
            C13934dbu c13934dbuValueOf = valueOf();
            java.lang.String strUSBtdM = abstractC12782ctV != null ? abstractC12782ctV.USBtdM() : null;
            if (strUSBtdM == null) {
                strUSBtdM = "";
            }
            java.lang.String strAUsmxb = abstractC12782ctV != null ? abstractC12782ctV.aUsmxb() : null;
            java.lang.String str3 = strAUsmxb != null ? strAUsmxb : "";
            transactionDetailViewModel$rebroadcastBTCTransaction$12.label = 1;
            objKWHzl = c13934dbuValueOf.KWHzl(str2, strUSBtdM, str3, str, j, transactionDetailViewModel$rebroadcastBTCTransaction$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return C56443yFo.KWHzl(((AbstractC43419rot) objKWHzl).EZpvd());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        TransactionDetailViewModel$cancelBTCTransaction$1 transactionDetailViewModel$cancelBTCTransaction$1;
        if (continuation instanceof TransactionDetailViewModel$cancelBTCTransaction$1) {
            transactionDetailViewModel$cancelBTCTransaction$1 = (TransactionDetailViewModel$cancelBTCTransaction$1) continuation;
            int i = transactionDetailViewModel$cancelBTCTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionDetailViewModel$cancelBTCTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionDetailViewModel$cancelBTCTransaction$1 = new TransactionDetailViewModel$cancelBTCTransaction$1(this, continuation);
            }
        }
        TransactionDetailViewModel$cancelBTCTransaction$1 transactionDetailViewModel$cancelBTCTransaction$12 = transactionDetailViewModel$cancelBTCTransaction$1;
        java.lang.Object objAEQbTJ = transactionDetailViewModel$cancelBTCTransaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionDetailViewModel$cancelBTCTransaction$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
            C13934dbu c13934dbuValueOf = valueOf();
            java.lang.String strUSBtdM = abstractC12782ctV != null ? abstractC12782ctV.USBtdM() : null;
            if (strUSBtdM == null) {
                strUSBtdM = "";
            }
            java.lang.String strAUsmxb = abstractC12782ctV != null ? abstractC12782ctV.aUsmxb() : null;
            java.lang.String str3 = strAUsmxb != null ? strAUsmxb : "";
            transactionDetailViewModel$cancelBTCTransaction$12.label = 1;
            objAEQbTJ = c13934dbuValueOf.AEQbTJ(str2, strUSBtdM, str3, str, j, transactionDetailViewModel$cancelBTCTransaction$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return C56443yFo.KWHzl(((AbstractC43419rot) objAEQbTJ).EZpvd());
    }

    /* JADX INFO: renamed from: o.biw$StateListAnimator */
    public static class StateListAnimator extends AbstractC10767buf {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)V */
        @Override // o.AbstractC10707btY
        /* JADX INFO: renamed from: copydefault */
        public void OLrzqt(@NotNull C10746buK c10746buK) {
            Intrinsics.checkNotNullParameter(c10746buK, "");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, long j2, @NotNull java.lang.String str3, @NotNull java.util.List<java.lang.String> list) {
            super(str, str2, j, j2, str3, list);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
        }
    }

    public final void EZpvd(final java.lang.Long l, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(l);
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.DbNXlk.copydefault(false);
        final Function1 function12 = new Function1() { // from class: o.biY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10148biw.AEQbTJ(c10854bwMKWHzl, this, l, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.biX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10148biw.ejfBZ(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.biW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10148biw.OLrzqt(function1, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.biU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10148biw.fARcdN(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.biV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10148biw.KWHzl(function1, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bjd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10148biw.fIwbmz(function14, obj);
            }
        }));
    }

    public static final InterfaceC58261yxu ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C10854bwM c10854bwM, C10148biw c10148biw, java.lang.Long l, AbstractC12782ctV abstractC12782ctV) {
        C10854bwM c10854bwMKWHzl;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (c10854bwM != null && abstractC12782ctV.KWHzl(c10854bwM.OcIXYQ())) {
            if (!c10854bwM.DarRvM()) {
                AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtCopydefault = c10148biw.djBIcL.copydefault(c10854bwM.OcIXYQ(), true);
                final Function1 function1 = new Function1() { // from class: o.biG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10148biw.OLrzqt((java.util.List) obj);
                    }
                };
                return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.biK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C10148biw.isConnected(function1, obj);
                    }
                });
            }
            return AbstractC58260yxt.copydefault(java.lang.Boolean.FALSE);
        }
        AbstractC58185ywX abstractC58185ywXOLrzqt = c10148biw.djBIcL.OLrzqt((c10854bwM == null || (c10854bwMKWHzl = c10854bwM.KWHzl()) == null) ? -1L : c10854bwMKWHzl.AhwBna(), "", "", 0, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : l);
        final Function1 function12 = new Function1() { // from class: o.biL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10148biw.copydefault((ResponseData) obj);
            }
        };
        return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.biN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10148biw.fJNWhG(function12, obj);
            }
        }).gEmmrt();
    }

    public static final java.lang.Boolean isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return java.lang.Boolean.valueOf(responseData.getData() != null);
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function1 function1, java.lang.Throwable th) {
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C10148biw c10148biw, ResponseData responseData) {
        TxIdOrHashHistoryDetail txIdOrHashHistoryDetail;
        TxIdOrHashHistoryDetail txIdOrHashHistoryDetail2;
        TxIdOrHashHistoryDetail txIdOrHashHistoryDetail3;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            if (c10148biw.OLrzqt && (((txIdOrHashHistoryDetail = (TxIdOrHashHistoryDetail) responseData.getData()) != null && txIdOrHashHistoryDetail.getTxType() == 32) || (((txIdOrHashHistoryDetail2 = (TxIdOrHashHistoryDetail) responseData.getData()) != null && txIdOrHashHistoryDetail2.getTxType() == 31) || ((txIdOrHashHistoryDetail3 = (TxIdOrHashHistoryDetail) responseData.getData()) != null && txIdOrHashHistoryDetail3.getTxType() == 30)))) {
                c10148biw.OLrzqt = false;
            }
            MutableLiveData<TxIdOrHashHistoryDetail> mutableLiveData = c10148biw.AYXKKw;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            mutableLiveData.setValue((TxIdOrHashHistoryDetail) data);
        } else {
            c10148biw.EZpvd.setValue(new C10185bjg(java.lang.Integer.valueOf(responseData.getCode()), responseData.getMsg()));
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.Boolean OLrzqt(java.util.List list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "");
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((java.lang.Number) it.next()).longValue() <= 0) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
