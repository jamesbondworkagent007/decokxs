package o;

import com.okinc.business.dex.api.bean.ChainListInfo;
import com.okinc.business.dexlogic.bean.CandleResultBean;
import com.okinc.business.dexlogic.bean.CheckContinueBean;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.FaqSwapBean;
import com.okinc.business.dexlogic.bean.MemeTokenInfo;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.dexlogic.main.datasource.MainDataSourceImpl$getCoreBridgeChainList$1;
import com.okinc.business.dexlogic.main.datasource.MainDataSourceImpl$getCoreSingleChainList$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.rx2.RxFlowableKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.heO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C22384heO implements InterfaceC22387heR {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public java.util.ArrayList<DefiChainInfo> AEQbTJ;
    public final C23230huM AYXKKw;
    public java.util.ArrayList<SlippageConfigVo> AhwBna;
    public java.util.ArrayList<DefiChainInfo> AkhnZx;
    public final InterfaceC56387yDm EZpvd;
    public final C23237huT KWHzl;
    public ChainListInfo copydefault;
    public java.util.ArrayList<DefiChainInfo> djBIcL;
    public java.util.ArrayList<DefiChainInfo> gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22387heR
    public java.util.ArrayList<SlippageConfigVo> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22387heR
    public java.util.ArrayList<DefiChainInfo> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22387heR
    public java.util.ArrayList<DefiChainInfo> OLrzqt() {
        return this.AEQbTJ;
    }

    public C22384heO(@NotNull C23237huT c23237huT, @NotNull C23230huM c23230huM) {
        Intrinsics.checkNotNullParameter(c23237huT, "");
        Intrinsics.checkNotNullParameter(c23230huM, "");
        this.KWHzl = c23237huT;
        this.AYXKKw = c23230huM;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hfr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22384heO.djBIcL(this.AEQbTJ);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.hfs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22384heO.gEmmrt(this.KWHzl);
            }
        });
        this.AhwBna = new java.util.ArrayList<>();
        this.AEQbTJ = new java.util.ArrayList<>();
        this.gEmmrt = new java.util.ArrayList<>();
        this.AkhnZx = new java.util.ArrayList<>();
        this.djBIcL = new java.util.ArrayList<>();
        this.copydefault = new ChainListInfo((java.util.List) null, (java.util.List) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: o.heO$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.heO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final C2149AAq aD_() {
        return (C2149AAq) this.EZpvd.getValue();
    }

    public static final C2149AAq djBIcL(C22384heO c22384heO) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            C58114yvF c58114yvF = C58114yvF.EZpvd;
            objM7377constructorimpl = Result.m7377constructorimpl(((InterfaceC22383heN) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), InterfaceC22383heN.class)).isConnected());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (C2149AAq) objM7377constructorimpl;
    }

    public final InterfaceC25414iwK aE_() {
        return (InterfaceC25414iwK) this.valueOf.getValue();
    }

    public static final InterfaceC25414iwK gEmmrt(C22384heO c22384heO) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            C58114yvF c58114yvF = C58114yvF.EZpvd;
            objM7377constructorimpl = Result.m7377constructorimpl(((InterfaceC25418iwO) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), InterfaceC25418iwO.class)).zuBGHE().get());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (InterfaceC25414iwK) objM7377constructorimpl;
    }

    public final boolean aG_() {
        InterfaceC25414iwK interfaceC25414iwKAE_ = aE_();
        return (interfaceC25414iwKAE_ == null || !interfaceC25414iwKAE_.copydefault() || aD_() == null) ? false : true;
    }

    @Override // o.InterfaceC22387heR
    public AbstractC58185ywX<java.util.List<DefiChainInfo>> OLrzqt(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (aG_()) {
            AbstractC58185ywX<java.util.List<DefiChainInfo>> abstractC58185ywXAEQbTJ = AEQbTJ(z);
            final Function1 function1 = new Function1() { // from class: o.hfu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22384heO.AEQbTJ(this.EZpvd, str, z, (java.lang.Throwable) obj);
                }
            };
            AbstractC58185ywX<java.util.List<DefiChainInfo>> abstractC58185ywXOLrzqt = abstractC58185ywXAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.hft
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C22384heO.zsXlph(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
            return abstractC58185ywXOLrzqt;
        }
        return KWHzl(str, z);
    }

    public static final InterfaceC60096zvd zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C22384heO c22384heO, java.lang.String str, boolean z, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.AEQbTJ("MainDataSourceImpl", "Core getSupportChainList (bridge) failed, fallback to native", th);
        return c22384heO.KWHzl(str, z);
    }

    public final AbstractC58185ywX<java.util.List<DefiChainInfo>> AEQbTJ(boolean z) {
        if (C33129mqd.KWHzl((java.util.Collection) this.AEQbTJ) && !z) {
            AbstractC58185ywX<java.util.List<DefiChainInfo>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.AEQbTJ));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        return RxFlowableKt.rxFlowable$default(null, new MainDataSourceImpl$getCoreBridgeChainList$1(this, null), 1, null);
    }

    public final AbstractC58185ywX<java.util.List<DefiChainInfo>> KWHzl(final java.lang.String str, final boolean z) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<java.util.List<DefiChainInfo>> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hfe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22384heO.KWHzl(this.AEQbTJ, z, objectRef, str, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hfd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22384heO.valueOf(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, o.yxC] */
    public static final void KWHzl(final C22384heO c22384heO, boolean z, Ref.ObjectRef objectRef, java.lang.String str, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (C33129mqd.KWHzl((java.util.Collection) c22384heO.AEQbTJ) && !z) {
            interfaceC58184ywW.onNext(c22384heO.AEQbTJ);
            return;
        }
        AbstractC58185ywX<ResponseData<java.util.List<DefiChainInfo>>> abstractC58185ywXOLrzqt = c22384heO.AYXKKw.OLrzqt(str);
        final Function1 function1 = new Function1() { // from class: o.hfz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22384heO.AYXKKw(this.copydefault, interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.util.List<DefiChainInfo>>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hfF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22384heO.uzCIH(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hfB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22384heO.EZpvd(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hfD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22384heO.iwGUEr(function12, obj);
            }
        });
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC22387heR
    public AbstractC58185ywX<java.util.List<DefiChainInfo>> EZpvd(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (aG_()) {
            AbstractC58185ywX<java.util.List<DefiChainInfo>> abstractC58185ywXKWHzl = KWHzl(z);
            final Function1 function1 = new Function1() { // from class: o.hfn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22384heO.copydefault(this.EZpvd, str, z, (java.lang.Throwable) obj);
                }
            };
            AbstractC58185ywX<java.util.List<DefiChainInfo>> abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.hfm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C22384heO.AuCTelauCTel(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
            return abstractC58185ywXOLrzqt;
        }
        return copydefault(str, z);
    }

    public static final InterfaceC60096zvd AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C22384heO c22384heO, java.lang.String str, boolean z, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.AEQbTJ("MainDataSourceImpl", "Core getSupportSingleChainList failed, fallback to native", th);
        return c22384heO.copydefault(str, z);
    }

    public final AbstractC58185ywX<java.util.List<DefiChainInfo>> KWHzl(boolean z) {
        if (C33129mqd.KWHzl((java.util.Collection) this.AkhnZx) && !z) {
            AbstractC58185ywX<java.util.List<DefiChainInfo>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.AkhnZx));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        return RxFlowableKt.rxFlowable$default(null, new MainDataSourceImpl$getCoreSingleChainList$1(this, null), 1, null);
    }

    public final AbstractC58185ywX<java.util.List<DefiChainInfo>> copydefault(final java.lang.String str, final boolean z) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<java.util.List<DefiChainInfo>> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hfw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22384heO.AEQbTJ(this.copydefault, z, objectRef, str, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hfA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22384heO.djBIcL(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, o.yxC] */
    public static final void AEQbTJ(final C22384heO c22384heO, boolean z, Ref.ObjectRef objectRef, java.lang.String str, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (C33129mqd.KWHzl((java.util.Collection) c22384heO.AkhnZx) && !z) {
            interfaceC58184ywW.onNext(c22384heO.AkhnZx);
            return;
        }
        AbstractC58185ywX<ResponseData<java.util.List<DefiChainInfo>>> abstractC58185ywXAEQbTJ = c22384heO.AYXKKw.AEQbTJ(str);
        final Function1 function1 = new Function1() { // from class: o.hfb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22384heO.djBIcL(this.KWHzl, interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.util.List<DefiChainInfo>>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.heZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22384heO.getFieldNames(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.heX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22384heO.gEmmrt(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hfa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22384heO.zLjUOn(function12, obj);
            }
        });
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC22387heR
    public boolean AEQbTJ(@NotNull java.lang.String str, boolean z) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = (z ? this.djBIcL : this.gEmmrt).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                break;
            }
        }
        return next != null;
    }

    @Override // o.InterfaceC22387heR
    public DefiChainInfo KWHzl(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = OLrzqt().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((DefiChainInfo) next).getChainId())) {
                break;
            }
        }
        return (DefiChainInfo) next;
    }

    public static final CandleResultBean fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CandleResultBean) function1.invoke(obj);
    }

    @Override // o.InterfaceC22387heR
    public AbstractC58185ywX<CandleResultBean> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX<ResponseData<CandleResultBean>> abstractC58185ywXOLrzqt = this.AYXKKw.OLrzqt(str, str2, str3);
        final Function1 function1 = new Function1() { // from class: o.hfc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22384heO.OLrzqt((ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hff
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22384heO.fARcdN(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.hfk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22384heO.copydefault((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<CandleResultBean> abstractC58185ywXDjBIcL = abstractC58185ywXAEQbTJ.djBIcL(new InterfaceC58229yxO() { // from class: o.hfj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22384heO.ejfBZ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
        return abstractC58185ywXDjBIcL;
    }

    public static final CandleResultBean ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CandleResultBean) function1.invoke(obj);
    }

    public static final CandleResultBean copydefault(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new CandleResultBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.util.List) null, 1007, (DefaultConstructorMarker) null);
    }

    @Override // o.InterfaceC22387heR
    public AbstractC58185ywX<CandleResultBean> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        AbstractC58185ywX<ResponseData<CandleResultBean>> abstractC58185ywXOLrzqt = this.AYXKKw.OLrzqt(str, str2, str3, str4, str5);
        final Function1 function1 = new Function1() { // from class: o.heT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22384heO.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.heV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22384heO.fJNWhG(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.heU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22384heO.EZpvd((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<CandleResultBean> abstractC58185ywXDjBIcL = abstractC58185ywXAEQbTJ.djBIcL(new InterfaceC58229yxO() { // from class: o.heY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22384heO.AuCTel(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
        return abstractC58185ywXDjBIcL;
    }

    public static final CandleResultBean fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CandleResultBean) function1.invoke(obj);
    }

    public static final CandleResultBean AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CandleResultBean) function1.invoke(obj);
    }

    public static final CandleResultBean EZpvd(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if ((th instanceof OKServerException) && ((OKServerException) th).getCode() == 40002) {
            return new CandleResultBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, true, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.util.List) null, 1007, (DefaultConstructorMarker) null);
        }
        return new CandleResultBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.util.List) null, 1007, (DefaultConstructorMarker) null);
    }

    @Override // o.InterfaceC22387heR
    public AbstractC58185ywX<FaqSwapBean> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C23223huF.EZpvd(this.AYXKKw.KWHzl(str, str2, str3));
    }

    @Override // o.InterfaceC22387heR
    public AbstractC58185ywX<CheckContinueBean> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C23223huF.EZpvd(this.KWHzl.KWHzl(str, str2, str3, str4));
    }

    @Override // o.InterfaceC22387heR
    public AbstractC58185ywX<java.util.List<SlippageConfigVo>> copydefault() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<java.util.List<SlippageConfigVo>> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.heW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22384heO.KWHzl(this.EZpvd, objectRef, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.heS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22384heO.AYXKKw(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, o.yxC] */
    public static final void KWHzl(final C22384heO c22384heO, Ref.ObjectRef objectRef, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (C33129mqd.KWHzl((java.util.Collection) c22384heO.AhwBna)) {
            interfaceC58184ywW.onNext(c22384heO.AhwBna);
            return;
        }
        AbstractC58185ywX<ResponseData<java.util.List<SlippageConfigVo>>> abstractC58185ywXEZpvd = c22384heO.KWHzl.EZpvd();
        final Function1 function1 = new Function1() { // from class: o.hfi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22384heO.AhwBna(this.OLrzqt, interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.util.List<SlippageConfigVo>>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hfl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22384heO.getNewProxyInstance(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hfh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22384heO.EZpvd(this.EZpvd, interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hfo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22384heO.hDKMBd(function12, obj);
            }
        });
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C22384heO c22384heO, InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        c22384heO.AhwBna.clear();
        java.util.ArrayList<SlippageConfigVo> arrayList = c22384heO.AhwBna;
        SlippageConfigVo.Companion companion = SlippageConfigVo.Companion;
        arrayList.addAll(yDY.copydefault(companion.EZpvd(), companion.KWHzl()));
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC22387heR
    public java.lang.String copydefault(boolean z) {
        java.lang.String minValue;
        java.lang.String minValue2;
        java.lang.Object obj = null;
        if (z) {
            java.util.Iterator<T> it = this.AhwBna.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((SlippageConfigVo) next).isSingle()) {
                    obj = next;
                    break;
                }
            }
            SlippageConfigVo slippageConfigVo = (SlippageConfigVo) obj;
            return (slippageConfigVo == null || (minValue2 = slippageConfigVo.getMinValue()) == null) ? "0.01" : minValue2;
        }
        java.util.Iterator<T> it2 = this.AhwBna.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next2 = it2.next();
            if (((SlippageConfigVo) next2).isCross()) {
                obj = next2;
                break;
            }
        }
        SlippageConfigVo slippageConfigVo2 = (SlippageConfigVo) obj;
        return (slippageConfigVo2 == null || (minValue = slippageConfigVo2.getMinValue()) == null) ? "0.03" : minValue;
    }

    @Override // o.InterfaceC22387heR
    public AbstractC58185ywX<ChainListInfo> aF_() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ChainListInfo> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hfp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22384heO.OLrzqt(this.EZpvd, objectRef, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hfv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22384heO.AEQbTJ(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, o.yxC] */
    public static final void OLrzqt(final C22384heO c22384heO, Ref.ObjectRef objectRef, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (!c22384heO.copydefault.isNeedUpdate()) {
            interfaceC58184ywW.onNext(c22384heO.copydefault);
            return;
        }
        AbstractC58185ywX<ResponseData<ChainListInfo>> abstractC58185ywXOLrzqt = c22384heO.AYXKKw.OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hfg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22384heO.AEQbTJ(this.OLrzqt, interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<ChainListInfo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hfq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22384heO.isConnected(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hfx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22384heO.AEQbTJ(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hfy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22384heO.fIwbmz(function12, obj);
            }
        });
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC22387heR
    public AbstractC58185ywX<MemeTokenInfo> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C23223huF.EZpvd(this.KWHzl.OLrzqt(str, str2));
    }

    public static final Unit AYXKKw(C22384heO c22384heO, InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c22384heO.AEQbTJ.clear();
            java.util.ArrayList<DefiChainInfo> arrayList = c22384heO.AEQbTJ;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            arrayList.addAll((java.util.Collection) data);
            c22384heO.gEmmrt.clear();
            java.util.List list = (java.util.List) responseData.getData();
            if (list != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (((DefiChainInfo) obj).isSupportAAWallet()) {
                        arrayList2.add(obj);
                    }
                }
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c22384heO.gEmmrt.add((DefiChainInfo) it.next());
                }
            }
            C22380heK.OLrzqt.AEQbTJ().AEQbTJ((java.util.List<DefiChainInfo>) responseData.getData());
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            interfaceC58184ywW.onNext(data2);
        } else {
            interfaceC58184ywW.onError(new java.lang.Exception(responseData.getMsg()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C22384heO c22384heO, InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c22384heO.AkhnZx.clear();
            java.util.ArrayList<DefiChainInfo> arrayList = c22384heO.AkhnZx;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            arrayList.addAll((java.util.Collection) data);
            c22384heO.djBIcL.clear();
            java.util.List list = (java.util.List) responseData.getData();
            if (list != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (((DefiChainInfo) obj).isSupportAAWallet()) {
                        arrayList2.add(obj);
                    }
                }
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c22384heO.djBIcL.add((DefiChainInfo) it.next());
                }
            }
            C22380heK.OLrzqt.AEQbTJ().AEQbTJ((java.util.List<DefiChainInfo>) responseData.getData());
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            interfaceC58184ywW.onNext(data2);
        } else {
            interfaceC58184ywW.onError(new java.lang.Exception(responseData.getMsg()));
        }
        return Unit.INSTANCE;
    }

    public static final CandleResultBean OLrzqt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return (CandleResultBean) data;
        }
        return new CandleResultBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.util.List) null, 1007, (DefaultConstructorMarker) null);
    }

    public static final CandleResultBean KWHzl(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return (CandleResultBean) data;
        }
        return new CandleResultBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.util.List) null, 1007, (DefaultConstructorMarker) null);
    }

    public static final Unit AhwBna(C22384heO c22384heO, InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c22384heO.AhwBna.clear();
            java.util.ArrayList<SlippageConfigVo> arrayList = c22384heO.AhwBna;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            arrayList.addAll((java.util.Collection) data);
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            interfaceC58184ywW.onNext(data2);
        } else {
            c22384heO.AhwBna.clear();
            java.util.ArrayList<SlippageConfigVo> arrayList2 = c22384heO.AhwBna;
            SlippageConfigVo.Companion companion = SlippageConfigVo.Companion;
            arrayList2.addAll(yDY.copydefault(companion.EZpvd(), companion.KWHzl()));
            interfaceC58184ywW.onError(new java.lang.Exception(responseData.getMsg()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C22384heO c22384heO, InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        java.util.List<java.lang.String> listAhwBna;
        java.util.List<java.lang.String> listAhwBna2;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            ChainListInfo chainListInfo = c22384heO.copydefault;
            ChainListInfo chainListInfo2 = (ChainListInfo) responseData.getData();
            if (chainListInfo2 == null || (listAhwBna = chainListInfo2.getSwap()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            ChainListInfo chainListInfo3 = (ChainListInfo) responseData.getData();
            if (chainListInfo3 == null || (listAhwBna2 = chainListInfo3.getBridge()) == null) {
                listAhwBna2 = yDY.AhwBna();
            }
            ChainListInfo chainListInfoCopy = chainListInfo.copy(listAhwBna, listAhwBna2);
            c22384heO.copydefault = chainListInfoCopy;
            interfaceC58184ywW.onNext(chainListInfoCopy);
        } else {
            interfaceC58184ywW.onError(new java.lang.Exception(responseData.getMsg()));
        }
        return Unit.INSTANCE;
    }
}
