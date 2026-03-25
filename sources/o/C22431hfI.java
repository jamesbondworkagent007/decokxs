package o;

import androidx.lifecycle.MutableLiveData;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.dexlogic.bean.ApproveResultInfo;
import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DefiMultiTokenAllowanceOut;
import com.okinc.business.dexlogic.bean.DefiPlatformInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SwapApproveInfoReq;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hfI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22431hfI implements InterfaceC22432hfJ {
    public android.util.LruCache<java.lang.String, DefiMultiTokenAllowanceOut> EZpvd;
    public final java.lang.String KWHzl;
    public MutableLiveData<gKW> OLrzqt;
    public final C23237huT copydefault;

    public C22431hfI(@NotNull java.lang.String str, @NotNull C23237huT c23237huT) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c23237huT, "");
        this.KWHzl = str;
        this.copydefault = c23237huT;
        this.EZpvd = new android.util.LruCache<>(10);
        this.OLrzqt = new MutableLiveData<>();
    }

    @Override // o.InterfaceC22432hfJ
    public void copydefault() {
        this.EZpvd.evictAll();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dexlogic.bean.DefiMultiTokenAllowanceOut.copy$default(com.okinc.business.dexlogic.bean.DefiMultiTokenAllowanceOut, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.okinc.business.dexlogic.bean.DefiMultiTokenAllowanceOut */
    @Override // o.InterfaceC22432hfJ
    public boolean KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String originContractAddress = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getOriginContractAddress() : null;
        if (originContractAddress == null) {
            originContractAddress = "";
        }
        java.lang.String originContractAddress2 = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getOriginContractAddress() : null;
        if (originContractAddress2 == null) {
            originContractAddress2 = "";
        }
        java.lang.String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        java.lang.String str2 = chainId != null ? chainId : "";
        DefiMultiTokenAllowanceOut defiMultiTokenAllowanceOut = this.EZpvd.get(EZpvd(str2, originContractAddress, originContractAddress2));
        if (defiMultiTokenAllowanceOut != null) {
            if (C23311hvo.copydefault(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null, defiMultiTokenAllowanceOut.getTokenContractAddress(), dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getOriginContractAddress() : null)) {
                this.EZpvd.put(EZpvd(str2, originContractAddress, originContractAddress2), DefiMultiTokenAllowanceOut.copy$default(defiMultiTokenAllowanceOut, null, "", str, null, false, 25, null));
                return true;
            }
        }
        return false;
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    public AbstractC58185ywX<ApproveUnsignedData> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull DefiChainInfo defiChainInfo, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C23237huT.getApproveUnsignedData$default(this.copydefault, str, str2, defiChainInfo.getChainId(), str3, str4, null, 32, null);
    }

    @Override // o.InterfaceC22432hfJ
    public AbstractC58185ywX<ApproveSwapData> KWHzl(@NotNull final DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull final DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull final DefiPlatformInfo defiPlatformInfo, final java.lang.Integer num, @NotNull final java.lang.String str, @NotNull final DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
        Intrinsics.checkNotNullParameter(defiPlatformInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        AbstractC58185ywX<ApproveSwapData> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hfM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22431hfI.AEQbTJ(objectRef, this, dexMultiTokenInfoBean, objectRef2, defiChainInfo, dexMultiTokenInfoBean2, str, num, defiPlatformInfo, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hfO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22431hfI.OLrzqt(objectRef, objectRef2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, o.yxC] */
    public static final void AEQbTJ(Ref.ObjectRef objectRef, final C22431hfI c22431hfI, final DexMultiTokenInfoBean dexMultiTokenInfoBean, final Ref.ObjectRef objectRef2, final DefiChainInfo defiChainInfo, final DexMultiTokenInfoBean dexMultiTokenInfoBean2, final java.lang.String str, final java.lang.Integer num, final DefiPlatformInfo defiPlatformInfo, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(c22431hfI.KWHzl).fARcdN().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hfG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22431hfI.EZpvd(dexMultiTokenInfoBean, objectRef2, c22431hfI, defiChainInfo, dexMultiTokenInfoBean2, str, num, defiPlatformInfo, interfaceC58184ywW, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hfP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22431hfI.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hfN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22431hfI.EZpvd(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hfL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22431hfI.djBIcL(function12, obj);
            }
        });
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, o.yxC] */
    public static final Unit EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, Ref.ObjectRef objectRef, C22431hfI c22431hfI, final DefiChainInfo defiChainInfo, DexMultiTokenInfoBean dexMultiTokenInfoBean2, java.lang.String str, final java.lang.Integer num, final DefiPlatformInfo defiPlatformInfo, final InterfaceC58184ywW interfaceC58184ywW, final InterfaceC9738bbJ interfaceC9738bbJ) {
        AbstractC58185ywX<ApproveUnsignedData> abstractC58185ywXAEQbTJ = c22431hfI.AEQbTJ(interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(dexMultiTokenInfoBean.getChainId())), dexMultiTokenInfoBean.getOriginContractAddress(), defiChainInfo, dexMultiTokenInfoBean2.getOriginContractAddress(), str);
        final Function1 function1 = new Function1() { // from class: o.hfQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22431hfI.EZpvd(defiChainInfo, num, defiPlatformInfo, interfaceC58184ywW, interfaceC9738bbJ, (ApproveUnsignedData) obj);
            }
        };
        InterfaceC58227yxM<? super ApproveUnsignedData> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hfU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22431hfI.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hfT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22431hfI.KWHzl(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hfR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22431hfI.valueOf(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(DefiChainInfo defiChainInfo, java.lang.Integer num, DefiPlatformInfo defiPlatformInfo, InterfaceC58184ywW interfaceC58184ywW, InterfaceC9738bbJ interfaceC9738bbJ, ApproveUnsignedData approveUnsignedData) {
        java.lang.String str = null;
        interfaceC58184ywW.onNext(new ApproveSwapData(defiChainInfo.getChainId(), defiChainInfo.getNetwork(), approveUnsignedData.getSignDataJson(defiChainInfo.isEvm(), num), interfaceC9738bbJ.DbNXlk(), new PlatformItem(C33129mqd.valueOf(defiPlatformInfo.getId()), defiPlatformInfo.getDefiPlatformName(), defiPlatformInfo.getLogoUrl(), str, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16376, (DefaultConstructorMarker) null), approveUnsignedData.getId(), approveUnsignedData.getDexContractAddress(), false, (UnsignedSwapData) null, str, FaceDetector.NUM_BOXES, (DefaultConstructorMarker) (0 == true ? 1 : 0)));
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = (InterfaceC58217yxC) objectRef2.element;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    @Override // o.InterfaceC22432hfJ
    public AbstractC58185ywX<ResponseData<ApproveResultInfo>> EZpvd(@NotNull final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final SwapApproveInfoReq swapApproveInfoReq) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(swapApproveInfoReq, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<ApproveResultInfo>> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hfY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22431hfI.copydefault(objectRef, this, map, swapApproveInfoReq, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hfV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22431hfI.AEQbTJ(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, o.yxC] */
    public static final void copydefault(Ref.ObjectRef objectRef, C22431hfI c22431hfI, java.util.Map map, SwapApproveInfoReq swapApproveInfoReq, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AbstractC58185ywX<ResponseData<ApproveResultInfo>> abstractC58185ywXKWHzl = c22431hfI.copydefault.KWHzl((java.util.Map<java.lang.String, java.lang.String>) map, swapApproveInfoReq);
        final Function1 function1 = new Function1() { // from class: o.hfS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22431hfI.EZpvd(interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<ApproveResultInfo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hfZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22431hfI.isConnected(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22431hfI.djBIcL(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hfX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22431hfI.DbNXlk(function12, obj);
            }
        });
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public static final Unit EZpvd(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Intrinsics.copydefault(responseData);
            interfaceC58184ywW.onNext(responseData);
        } else {
            interfaceC58184ywW.onError(new java.lang.Exception(responseData.getMsg()));
        }
        return Unit.INSTANCE;
    }
}
