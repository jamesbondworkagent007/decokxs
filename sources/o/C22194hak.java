package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.dex.trade.order.domain.model.OrderSide;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo;
import com.okinc.business.dexui.widget.DexEmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22194hak extends C43316rmw {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final boolean AEQbTJ;
    public int AYXKKw;
    public Function1<? super C20066gZq, Unit> AhwBna;
    public Function0<Unit> EZpvd;
    public Function0<Unit> KWHzl;
    public final LifecycleOwner OLrzqt;
    public Function0<Unit> djBIcL;
    public Function1<? super C20072gZw, Unit> gEmmrt;
    public Function1<? super C20064gZo, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.djBIcL = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function1<? super C20066gZq, Unit> function1) {
        this.AhwBna = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super C20072gZw, Unit> function1) {
        this.gEmmrt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super C20064gZo, Unit> function1) {
        this.valueOf = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (r2v0 androidx.lifecycle.LifecycleOwner)
 A[MD:(boolean, androidx.lifecycle.LifecycleOwner):void (m)] (LINE:27) call: o.hak.<init>(boolean, androidx.lifecycle.LifecycleOwner):void type: THIS */
    public /* synthetic */ C22194hak(boolean z, LifecycleOwner lifecycleOwner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, lifecycleOwner);
    }

    /* JADX INFO: renamed from: o.hak$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hak.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public C22194hak(boolean z, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.AEQbTJ = z;
        this.OLrzqt = lifecycleOwner;
    }

    public final void AEQbTJ() {
        register(C20064gZo.class, new C22255hbs(new Function1() { // from class: o.hai
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22194hak.KWHzl(this.AEQbTJ, (C20064gZo) obj);
            }
        }, new Function1() { // from class: o.hao
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22194hak.EZpvd(this.OLrzqt, (C20064gZo) obj);
            }
        }));
        register(C20074gZy.class, new C22258hbv(new Function1() { // from class: o.han
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22194hak.EZpvd(this.KWHzl, (C20074gZy) obj);
            }
        }, new Function1() { // from class: o.hap
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22194hak.AEQbTJ(this.EZpvd, (C20074gZy) obj);
            }
        }));
        register(DefiBridgeOrderInfo.class, new C24240iaB(this.AEQbTJ, this.OLrzqt, new Function1() { // from class: o.ham
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22194hak.copydefault(this.EZpvd, (DefiBridgeOrderInfo) obj);
            }
        }));
        register(C20061gZl.class, new C22261hby());
        register(C22254hbr.class, new C22252hbp(new Function0() { // from class: o.haq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22194hak.copydefault(this.EZpvd);
            }
        }));
        register(DexEmptyData.class, new C25449iwt(new Function0() { // from class: o.har
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22194hak.EZpvd(this.OLrzqt);
            }
        }));
        register(C22264hcA.class, new C22314hcy(0, 0, 0, new Function0() { // from class: o.hau
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22194hak.djBIcL(this.KWHzl);
            }
        }, 1, null));
        register(C20008gXm.class, new C22256hbt(new Function1() { // from class: o.hat
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22194hak.copydefault(this.EZpvd, (C20008gXm) obj);
            }
        }));
        register(C20050gZa.class, new C22249hbm(new Function1() { // from class: o.hav
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22194hak.copydefault(this.KWHzl, (C20050gZa) obj);
            }
        }));
    }

    public static final Unit KWHzl(C22194hak c22194hak, C20064gZo c20064gZo) {
        Intrinsics.checkNotNullParameter(c20064gZo, "");
        Function1<? super C20066gZq, Unit> function1 = c22194hak.AhwBna;
        if (function1 != null) {
            function1.invoke(new C20066gZq(c20064gZo.AYXKKw(), c20064gZo.EZpvd(), c20064gZo.zsXlph(), c20064gZo.djBIcL()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C22194hak c22194hak, C20064gZo c20064gZo) {
        Intrinsics.checkNotNullParameter(c20064gZo, "");
        Function1<? super C20072gZw, Unit> function1 = c22194hak.gEmmrt;
        if (function1 != null) {
            java.lang.String strAEQbTJ = c20064gZo.AEQbTJ();
            java.lang.String strEZpvd = c20064gZo.EZpvd();
            OrderSide orderSideAubY = c20064gZo.AubY();
            OrderSide orderSide = OrderSide.Buy;
            function1.invoke(new C20072gZw(strEZpvd, strAEQbTJ, orderSideAubY == orderSide ? c20064gZo.hDKMBd() : c20064gZo.isConnected(), c20064gZo.AubY() == orderSide ? c20064gZo.getFieldNames() : c20064gZo.AkhnZx(), c20064gZo.AubY() == orderSide ? c20064gZo.getNewProxyInstance() : c20064gZo.DbNXlk()));
        } else {
            Function1<? super C20066gZq, Unit> function12 = c22194hak.AhwBna;
            if (function12 != null) {
                function12.invoke(new C20066gZq(c20064gZo.AYXKKw(), c20064gZo.EZpvd(), c20064gZo.zsXlph(), c20064gZo.djBIcL()));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C22194hak c22194hak, C20074gZy c20074gZy) {
        Intrinsics.checkNotNullParameter(c20074gZy, "");
        Function1<? super C20066gZq, Unit> function1 = c22194hak.AhwBna;
        if (function1 != null) {
            function1.invoke(new C20066gZq(c20074gZy.valueOf(), c20074gZy.EZpvd(), c20074gZy.djBIcL(), c20074gZy.AYXKKw()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C22194hak c22194hak, C20074gZy c20074gZy) {
        Intrinsics.checkNotNullParameter(c20074gZy, "");
        Function1<? super C20072gZw, Unit> function1 = c22194hak.gEmmrt;
        if (function1 != null) {
            function1.invoke(new C20072gZw(c20074gZy.EZpvd(), c20074gZy.OLrzqt(), c20074gZy.AkhnZx(), c20074gZy.isConnected(), c20074gZy.values()));
        } else {
            Function1<? super C20066gZq, Unit> function12 = c22194hak.AhwBna;
            if (function12 != null) {
                function12.invoke(new C20066gZq(c20074gZy.valueOf(), c20074gZy.EZpvd(), c20074gZy.djBIcL(), c20074gZy.AYXKKw()));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C22194hak c22194hak, DefiBridgeOrderInfo defiBridgeOrderInfo) {
        Intrinsics.checkNotNullParameter(defiBridgeOrderInfo, "");
        Function1<? super C20066gZq, Unit> function1 = c22194hak.AhwBna;
        if (function1 != null) {
            function1.invoke(new C20066gZq(defiBridgeOrderInfo.getOrderId(), defiBridgeOrderInfo.getChainId(), 0, OrderStrategyType.Market));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C22194hak c22194hak) {
        Function0<Unit> function0 = c22194hak.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C22194hak c22194hak) {
        if (c22194hak.AYXKKw == 1) {
            Function0<Unit> function0 = c22194hak.EZpvd;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function0<Unit> function02 = c22194hak.djBIcL;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C22194hak c22194hak) {
        Function0<Unit> function0 = c22194hak.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C22194hak c22194hak, C20008gXm c20008gXm) {
        Intrinsics.checkNotNullParameter(c20008gXm, "");
        Function1<? super C20072gZw, Unit> function1 = c22194hak.gEmmrt;
        if (function1 != null) {
            java.lang.String strKWHzl = c20008gXm.KWHzl();
            java.lang.String strEZpvd = c20008gXm.EZpvd();
            OrderSide orderSideFetchVPNInfo = c20008gXm.fetchVPNInfo();
            OrderSide orderSide = OrderSide.Buy;
            function1.invoke(new C20072gZw(strKWHzl, strEZpvd, orderSideFetchVPNInfo == orderSide ? c20008gXm.isConnected() : c20008gXm.gEmmrt(), c20008gXm.fetchVPNInfo() == orderSide ? c20008gXm.AkhnZx() : c20008gXm.djBIcL(), c20008gXm.fetchVPNInfo() == orderSide ? c20008gXm.values() : c20008gXm.AhwBna()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C22194hak c22194hak, C20050gZa c20050gZa) {
        Intrinsics.checkNotNullParameter(c20050gZa, "");
        Function1<? super C20072gZw, Unit> function1 = c22194hak.gEmmrt;
        if (function1 != null) {
            function1.invoke(new C20072gZw(c20050gZa.copydefault().getChainId(), "", c20050gZa.copydefault().getTokenContractAddress(), c20050gZa.copydefault().getTokenLogoUrl(), c20050gZa.copydefault().getTokenSymbol()));
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        setItems(list);
        notifyDataSetChanged();
    }

    public final void OLrzqt(boolean z) {
        if (z) {
            setItems(C56402yEa.EZpvd(new C22264hcA(C33070mpX.AYXKKw(C23274hvD.Fragment.RFmUsE), null, 2, null)));
        } else {
            this.AYXKKw = 0;
            setItems(C56402yEa.EZpvd(new DexEmptyData(8, C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt), C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, 32, null)));
        }
        notifyDataSetChanged();
    }

    public static /* synthetic */ void showEmpty$default(C22194hak c22194hak, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        c22194hak.AEQbTJ(z, z2);
    }

    public final void AEQbTJ(boolean z, boolean z2) {
        DexEmptyData dexEmptyData;
        if (z) {
            this.AYXKKw = 1;
            dexEmptyData = new DexEmptyData(6, C33070mpX.AYXKKw(C23274hvD.Fragment.onMetadataChanged), null, C33070mpX.AYXKKw(C23274hvD.Fragment.zFZsbn), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, 36, null);
        } else if (!z2) {
            dexEmptyData = new DexEmptyData(6, C33070mpX.AYXKKw(C23274hvD.Fragment.QSAYLr), null, null, C55298xhM.dpInt$default(100, (android.content.Context) null, 1, (java.lang.Object) null), 0, 44, null);
        } else {
            dexEmptyData = new DexEmptyData(6, C33070mpX.AYXKKw(C23274hvD.Fragment.DMb), null, null, C55298xhM.dpInt$default(100, (android.content.Context) null, 1, (java.lang.Object) null), 0, 44, null);
        }
        setItems(C56402yEa.EZpvd(dexEmptyData));
        notifyDataSetChanged();
    }

    public final void KWHzl() {
        this.AYXKKw = 1;
        setItems(C56402yEa.EZpvd(new DexEmptyData(6, C33070mpX.AYXKKw(C23274hvD.Fragment.OqHLSf), null, C33070mpX.AYXKKw(C23274hvD.Fragment.BackHandlerKtBackHandler2), C55298xhM.dpInt$default(100, (android.content.Context) null, 1, (java.lang.Object) null), 0, 36, null)));
        notifyDataSetChanged();
    }
}
