package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dex.api.bean.LimitParam;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeConfig;
import com.okinc.business.dexlogic.error.BizException;
import com.okinc.business.dexlogic.main.limmitorder.bean.BizMode;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitSuggestCoinBean;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22506hge implements InterfaceC22502hga {
    public final MutableLiveData<LimitParam> AEQbTJ;
    public final C23224huG EZpvd;
    public final ConcurrentHashMap<BizMode, java.util.List<ExpireTimeConfig>> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22502hga
    public MutableLiveData<LimitParam> OLrzqt() {
        return this.AEQbTJ;
    }

    public C22506hge(@NotNull java.lang.String str, @NotNull C23224huG c23224huG) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c23224huG, "");
        this.copydefault = str;
        this.EZpvd = c23224huG;
        this.OLrzqt = new ConcurrentHashMap<>();
        this.AEQbTJ = new MutableLiveData<>();
    }

    @Override // o.InterfaceC22502hga
    public AbstractC58185ywX<java.util.List<ExpireTimeConfig>> EZpvd(@NotNull final BizMode bizMode) {
        Intrinsics.checkNotNullParameter(bizMode, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<java.util.List<ExpireTimeConfig>> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hgc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22506hge.EZpvd(this.OLrzqt, bizMode, objectRef, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hgj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22506hge.EZpvd(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, o.yxC] */
    public static final void EZpvd(final C22506hge c22506hge, final BizMode bizMode, Ref.ObjectRef objectRef, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        java.util.List<ExpireTimeConfig> list = c22506hge.OLrzqt.get(bizMode);
        if (list != null && !list.isEmpty()) {
            interfaceC58184ywW.onNext(list);
            return;
        }
        AbstractC58185ywX<ResponseData<java.util.List<ExpireTimeConfig>>> abstractC58185ywXOLrzqt = c22506hge.EZpvd.OLrzqt(bizMode);
        final Function1 function1 = new Function1() { // from class: o.hgf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22506hge.copydefault(this.AEQbTJ, bizMode, interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.util.List<ExpireTimeConfig>>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22506hge.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hgi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22506hge.copydefault(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hgg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22506hge.valueOf(function12, obj);
            }
        });
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC22502hga
    public java.util.List<ExpireTimeConfig> OLrzqt(@NotNull BizMode bizMode) {
        Intrinsics.checkNotNullParameter(bizMode, "");
        java.util.List<ExpireTimeConfig> list = this.OLrzqt.get(bizMode);
        return list == null ? yDY.AhwBna() : list;
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult> */
    @Override // o.InterfaceC22502hga
    public AbstractC58185ywX<LimitCalResult> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        AbstractC58185ywX<ResponseData<LimitCalResult>> abstractC58185ywXCopydefault = this.EZpvd.copydefault(str, str2, str3, str4, str5, str6, str7);
        final Function1 function1 = new Function1() { // from class: o.hgm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22506hge.copydefault((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hgk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22506hge.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final LimitCalResult gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (LimitCalResult) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.dexlogic.main.limmitorder.bean.LimitSuggestCoinBean> */
    @Override // o.InterfaceC22502hga
    public AbstractC58185ywX<LimitSuggestCoinBean> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58185ywX<ResponseData<LimitSuggestCoinBean>> abstractC58185ywXOLrzqt = this.EZpvd.OLrzqt(str, str2, str3);
        final Function1 function1 = new Function1() { // from class: o.hgd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22506hge.EZpvd((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hgb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22506hge.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final LimitSuggestCoinBean OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (LimitSuggestCoinBean) function1.invoke(obj);
    }

    public static final Unit copydefault(C22506hge c22506hge, BizMode bizMode, InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            ExpireTimeConfig expireTimeConfig = new ExpireTimeConfig("custom", C33070mpX.AYXKKw(C23274hvD.Fragment.DRuYWY), false, (java.lang.Long) null, 8, (DefaultConstructorMarker) null);
            java.util.List listAhwBna = (java.util.List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.List<ExpireTimeConfig> listCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends ExpireTimeConfig>) listAhwBna, expireTimeConfig);
            c22506hge.OLrzqt.put(bizMode, listCopydefault);
            interfaceC58184ywW.onNext(listCopydefault);
        } else {
            interfaceC58184ywW.onError(new java.lang.Exception(responseData.getMsg()));
        }
        return Unit.INSTANCE;
    }

    public static final LimitCalResult copydefault(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return (LimitCalResult) responseData.getData();
        }
        throw new java.lang.Exception(responseData.getMsg());
    }

    public static final LimitSuggestCoinBean EZpvd(ResponseData responseData) throws BizException {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return (LimitSuggestCoinBean) responseData.getData();
        }
        throw new BizException(responseData);
    }
}
