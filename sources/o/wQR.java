package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.material.tabs.TabLayout;
import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.trade.source.search.TradeSearchGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C48033uCm;
import o.C55688xof;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wQR extends android.widget.LinearLayout {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final android.util.ArrayMap<java.lang.String, java.lang.Integer> AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> AkhnZx;
    public Observer<java.util.List<TradeSearchGroup>> AuCTel;
    public java.lang.String DbNXlk;
    public final android.util.ArrayMap<java.lang.String, java.lang.Integer> EZpvd;
    public java.lang.String KWHzl;
    public final android.util.ArrayMap<java.lang.String, java.lang.Integer> OLrzqt;
    public java.lang.String djBIcL;
    public java.lang.String ejfBZ;
    public C54982xbO fARcdN;
    public C54982xbO fIwbmz;
    public Function1<? super java.lang.String, Unit> fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public C54990xbW isConnected;
    public java.lang.String valueOf;
    public C54982xbO values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wQR(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wQR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final java.util.List AYXKKw(java.util.List list) {
        return list;
    }

    public static final java.util.List AhwBna(java.util.List list) {
        return list;
    }

    public static final java.util.List EZpvd(java.util.List list) {
        return list;
    }

    public static final java.util.List djBIcL(java.util.List list) {
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentInstrument(java.lang.String str, java.lang.String str2) {
        this.AhwBna = str;
        this.DbNXlk = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnBotSelectCallback(Function1<? super java.lang.String, Unit> function1) {
        this.fetchVPNInfo = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSelectCallback(yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        this.AkhnZx = yho;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:50) call: o.wQR.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wQR(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wQR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.ejfBZ = C33070mpX.AYXKKw(C55688xof.Application.pXZxY);
        this.KWHzl = C33070mpX.AYXKKw(C55688xof.Application.profile);
        this.valueOf = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerKtExternalSyntheticLambda1);
        this.djBIcL = C33070mpX.AYXKKw(C55688xof.Application.HJWChPdIKEqB);
        this.AYXKKw = "iceberg";
        final ComponentActivity componentActivity = (ComponentActivity) context;
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(BotOrderListPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.view.TacticsFilterView$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.view.TacticsFilterView$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = componentActivity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.view.TacticsFilterView$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        this.isConnected = (C54990xbW) android.view.LayoutInflater.from(context).inflate(C48033uCm.Activity.getConnectivityMgr, this).findViewById(C48033uCm.Application.OqhRBMiKdSzF);
        android.util.ArrayMap<java.lang.String, java.lang.Integer> arrayMap = new android.util.ArrayMap<>();
        arrayMap.put("SPOT", java.lang.Integer.valueOf(C55688xof.Application.getVolumeAttributes));
        arrayMap.put("MARGIN", java.lang.Integer.valueOf(C55688xof.Application.getTag));
        arrayMap.put("SWAP", java.lang.Integer.valueOf(C55688xof.Application.getRepeatMode));
        arrayMap.put("FUTURES", java.lang.Integer.valueOf(C55688xof.Application.getShuffleMode));
        arrayMap.put("OPTION", java.lang.Integer.valueOf(C55688xof.Application.getUriFromString));
        arrayMap.put("ANY", java.lang.Integer.valueOf(C55688xof.Application.profile));
        this.AEQbTJ = arrayMap;
        android.util.ArrayMap<java.lang.String, java.lang.Integer> arrayMap2 = new android.util.ArrayMap<>();
        arrayMap2.put("SPOT", java.lang.Integer.valueOf(C55688xof.Application.zpGcln));
        arrayMap2.put("MARGIN", java.lang.Integer.valueOf(C55688xof.Application.ActivityResultLauncher));
        arrayMap2.put("SWAP", java.lang.Integer.valueOf(C55688xof.Application.finit));
        arrayMap2.put("FUTURES", java.lang.Integer.valueOf(C55688xof.Application.component2));
        arrayMap2.put("OPTION", java.lang.Integer.valueOf(C55688xof.Application.launchUnitdefault));
        arrayMap2.put("CONVERT", java.lang.Integer.valueOf(C48033uCm.Fragment.RIsQag));
        arrayMap2.put("ANY", java.lang.Integer.valueOf(C55688xof.Application.setTag));
        this.EZpvd = arrayMap2;
        android.util.ArrayMap<java.lang.String, java.lang.Integer> arrayMap3 = new android.util.ArrayMap<>();
        arrayMap3.put("CONVERT", java.lang.Integer.valueOf(C48033uCm.Fragment.RIsQag));
        arrayMap3.put("SPOT", java.lang.Integer.valueOf(C55688xof.Application.zpGcln));
        arrayMap3.put("MARGIN", java.lang.Integer.valueOf(C55688xof.Application.ActivityResultLauncher));
        arrayMap3.put("SWAP", java.lang.Integer.valueOf(C55688xof.Application.finit));
        arrayMap3.put("FUTURES", java.lang.Integer.valueOf(C55688xof.Application.component2));
        arrayMap3.put("OPTION", java.lang.Integer.valueOf(C55688xof.Application.launchUnitdefault));
        arrayMap3.put("ANY", java.lang.Integer.valueOf(C55688xof.Application.siEkQe));
        this.OLrzqt = arrayMap3;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wQR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final BotOrderListPresenter KWHzl() {
        return (BotOrderListPresenter) this.gEmmrt.getValue();
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.AhwBna = str;
        this.DbNXlk = str2;
        C54982xbO c54982xbO = null;
        if (str3 == null) {
            C56059xvf c56059xvf = C56059xvf.EZpvd;
            if (str2 == null) {
                str2 = "ANY";
            }
            TacticsType tacticsType = (TacticsType) CollectionsKt___CollectionsKt.firstOrNull(c56059xvf.copydefault(str2));
            str3 = tacticsType != null ? tacticsType.getConstant() : null;
            if (str3 == null) {
                str3 = "grid";
            }
        }
        this.AYXKKw = str3;
        C54982xbO c54982xbO2 = this.values;
        if (c54982xbO2 != null) {
            C54990xbW c54990xbW = this.isConnected;
            if (c54982xbO2 == null) {
                Intrinsics.gEmmrt("");
                c54982xbO2 = null;
            }
            c54990xbW.OLrzqt(0, OLrzqt(c54982xbO2));
            C54990xbW c54990xbW2 = this.isConnected;
            C54982xbO c54982xbO3 = this.fIwbmz;
            if (c54982xbO3 == null) {
                Intrinsics.gEmmrt("");
                c54982xbO3 = null;
            }
            c54990xbW2.OLrzqt(1, KWHzl(c54982xbO3));
            C54990xbW c54990xbW3 = this.isConnected;
            C54982xbO c54982xbO4 = this.fARcdN;
            if (c54982xbO4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c54982xbO = c54982xbO4;
            }
            c54990xbW3.OLrzqt(2, AEQbTJ(c54982xbO));
            return;
        }
        this.values = getBizTypeItem$default(this, null, 1, null);
        this.fIwbmz = getBizInfoTypeItem$default(this, null, 1, null);
        this.fARcdN = getBotTypeItem$default(this, null, 1, null);
        C54982xbO[] c54982xbOArr = new C54982xbO[3];
        C54982xbO c54982xbO5 = this.values;
        if (c54982xbO5 == null) {
            Intrinsics.gEmmrt("");
            c54982xbO5 = null;
        }
        c54982xbOArr[0] = c54982xbO5;
        C54982xbO c54982xbO6 = this.fIwbmz;
        if (c54982xbO6 == null) {
            Intrinsics.gEmmrt("");
            c54982xbO6 = null;
        }
        c54982xbOArr[1] = c54982xbO6;
        C54982xbO c54982xbO7 = this.fARcdN;
        if (c54982xbO7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c54982xbO = c54982xbO7;
        }
        c54982xbOArr[2] = c54982xbO;
        C54990xbW.setData$default(this.isConnected, yDY.copydefault(c54982xbOArr), new Function2() { // from class: o.wRf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return wQR.copydefault(this.OLrzqt, (TabLayout.Tab) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, null, null, 12, null);
    }

    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            FutureGroupInfo futureGroupInfoEZpvd;
            FutureGroupInfo futureGroupInfoEZpvd2;
            kotlin.Pair pair = (kotlin.Pair) t;
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            java.lang.String sort = null;
            int iAhwBna = C33129mqd.AhwBna((interfaceC54581xNrOLrzqt == null || (futureGroupInfoEZpvd2 = interfaceC54581xNrOLrzqt.EZpvd("SWAP", (java.lang.String) pair.getFirst())) == null) ? null : futureGroupInfoEZpvd2.getSort());
            kotlin.Pair pair2 = (kotlin.Pair) t2;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (futureGroupInfoEZpvd = interfaceC54581xNrOLrzqt2.EZpvd("SWAP", (java.lang.String) pair2.getFirst())) != null) {
                sort = futureGroupInfoEZpvd.getSort();
            }
            return yET.KWHzl(java.lang.Integer.valueOf(iAhwBna), java.lang.Integer.valueOf(C33129mqd.AhwBna(sort)));
        }
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            FutureGroupInfo futureGroupInfoEZpvd;
            FutureGroupInfo futureGroupInfoEZpvd2;
            kotlin.Pair pair = (kotlin.Pair) t;
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            java.lang.String sort = null;
            int iAhwBna = C33129mqd.AhwBna((interfaceC54581xNrOLrzqt == null || (futureGroupInfoEZpvd2 = interfaceC54581xNrOLrzqt.EZpvd("FUTURES", (java.lang.String) pair.getFirst())) == null) ? null : futureGroupInfoEZpvd2.getSort());
            kotlin.Pair pair2 = (kotlin.Pair) t2;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (futureGroupInfoEZpvd = interfaceC54581xNrOLrzqt2.EZpvd("FUTURES", (java.lang.String) pair2.getFirst())) != null) {
                sort = futureGroupInfoEZpvd.getSort();
            }
            return yET.KWHzl(java.lang.Integer.valueOf(iAhwBna), java.lang.Integer.valueOf(C33129mqd.AhwBna(sort)));
        }
    }

    public static final Unit copydefault(wQR wqr, TabLayout.Tab tab, int i) {
        C54982xbO c54982xbO = null;
        if (i == 1) {
            C54990xbW c54990xbW = wqr.isConnected;
            C54982xbO c54982xbO2 = wqr.fIwbmz;
            if (c54982xbO2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c54982xbO = c54982xbO2;
            }
            c54990xbW.OLrzqt(1, wqr.KWHzl(c54982xbO));
        } else if (i == 2) {
            C54990xbW c54990xbW2 = wqr.isConnected;
            C54982xbO c54982xbO3 = wqr.fARcdN;
            if (c54982xbO3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c54982xbO = c54982xbO3;
            }
            c54990xbW2.OLrzqt(2, wqr.AEQbTJ(c54982xbO));
        }
        return Unit.INSTANCE;
    }

    public final void setSelectIconVisibility(boolean z) {
        this.isConnected.setSelectIconVisibility(z);
    }

    public final void setDividerVisibility(boolean z) {
        android.view.View view = this.isConnected.KWHzl().copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
    }

    public final void setSelectIconSize(float f, float f2) {
        ViewGroup.LayoutParams layoutParams = this.isConnected.KWHzl().AYXKKw.getLayoutParams();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        layoutParams.width = C33052mpF.EZpvd(f, context);
        ViewGroup.LayoutParams layoutParams2 = this.isConnected.KWHzl().AYXKKw.getLayoutParams();
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        layoutParams2.height = C33052mpF.EZpvd(f2, context2);
    }

    public final void setSelectClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.isConnected.setSelectClickListener(onClickListener);
    }

    public static /* synthetic */ C54982xbO getBizTypeItem$default(wQR wqr, C54982xbO c54982xbO, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c54982xbO = null;
        }
        return wqr.OLrzqt(c54982xbO);
    }

    public final C54982xbO OLrzqt(C54982xbO c54982xbO) {
        final java.util.ArrayList arrayList;
        java.util.ArrayList<java.lang.String> arrayListEjfBZ;
        java.lang.String strAYXKKw;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (arrayListEjfBZ = interfaceC54581xNrOLrzqt.ejfBZ()) == null) {
            arrayList = null;
        } else {
            arrayListEjfBZ.add(0, "ANY");
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayListEjfBZ) {
                if (!Intrinsics.EZpvd(obj, (java.lang.Object) "OPTION")) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (java.lang.String str : arrayList2) {
                java.lang.Integer num = this.EZpvd.get(str);
                arrayList.add(new C55276xgr((num == null || (strAYXKKw = C33070mpX.AYXKKw(num.intValue())) == null) ? "" : strAYXKKw, str, null, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.DbNXlk), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
            }
        }
        if (c54982xbO != null) {
            java.lang.String str2 = this.DbNXlk;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String strCopydefault = copydefault(str2);
            c54982xbO.EZpvd(strCopydefault != null ? strCopydefault : "");
            c54982xbO.AEQbTJ(new Function0() { // from class: o.wQT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wQR.EZpvd(arrayList);
                }
            });
            return c54982xbO;
        }
        java.lang.String str3 = this.DbNXlk;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String strCopydefault2 = copydefault(str3);
        return new C54982xbO(strCopydefault2 == null ? "" : strCopydefault2, null, null, false, false, null, null, new Function0() { // from class: o.wQQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wQR.AYXKKw(arrayList);
            }
        }, null, null, new yHO() { // from class: o.wRd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return wQR.OLrzqt(this.copydefault, (C55276xgr) obj2, (C55276xgr) obj3, (C55276xgr) obj4);
            }
        }, null, null, null, null, null, null, null, null, 523134, null);
    }

    public static final Unit OLrzqt(wQR wqr, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.Object objOLrzqt;
        java.lang.Object next;
        java.lang.CharSequence charSequenceAhwBna;
        java.lang.String constant;
        if (c55276xgr != null && (objOLrzqt = c55276xgr.OLrzqt()) != null) {
            java.lang.String string = Intrinsics.EZpvd(objOLrzqt, (java.lang.Object) "ANY") ? null : objOLrzqt.toString();
            wqr.DbNXlk = string;
            C56059xvf c56059xvf = C56059xvf.EZpvd;
            if (string == null) {
                string = "ANY";
            }
            java.util.Iterator<T> it = c56059xvf.copydefault(string).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((TacticsType) next).getConstant(), (java.lang.Object) wqr.AYXKKw)) {
                    break;
                }
            }
            if (((TacticsType) next) == null) {
                C56059xvf c56059xvf2 = C56059xvf.EZpvd;
                java.lang.String str = wqr.DbNXlk;
                if (str == null) {
                    str = "ANY";
                }
                TacticsType tacticsType = (TacticsType) CollectionsKt___CollectionsKt.firstOrNull(c56059xvf2.copydefault(str));
                if (tacticsType == null || (constant = tacticsType.getConstant()) == null) {
                    constant = "grid";
                }
                wqr.AYXKKw = constant;
            }
            wqr.AhwBna = null;
            yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho = wqr.AkhnZx;
            if (yho != null) {
                yho.invoke(null, wqr.DbNXlk, wqr.AYXKKw);
            }
            if (Intrinsics.EZpvd(c55276xgr.OLrzqt(), (java.lang.Object) "ANY")) {
                charSequenceAhwBna = wqr.copydefault("ANY");
                if (charSequenceAhwBna == null) {
                    charSequenceAhwBna = "";
                }
            } else {
                charSequenceAhwBna = c55276xgr.AhwBna();
            }
            C54990xbW c54990xbW = wqr.isConnected;
            C54982xbO c54982xbO = wqr.values;
            if (c54982xbO == null) {
                Intrinsics.gEmmrt("");
                c54982xbO = null;
            }
            c54982xbO.EZpvd(charSequenceAhwBna);
            Unit unit = Unit.INSTANCE;
            c54990xbW.OLrzqt(0, c54982xbO);
            C54990xbW c54990xbW2 = wqr.isConnected;
            C54982xbO c54982xbO2 = wqr.fIwbmz;
            if (c54982xbO2 == null) {
                Intrinsics.gEmmrt("");
                c54982xbO2 = null;
            }
            java.lang.String strAEQbTJ = wqr.AEQbTJ((java.lang.String) null, wqr.DbNXlk);
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            c54982xbO2.EZpvd(strAEQbTJ);
            c54982xbO2.AEQbTJ(wqr.AEQbTJ());
            c54990xbW2.OLrzqt(1, c54982xbO2);
            C54990xbW c54990xbW3 = wqr.isConnected;
            C54982xbO c54982xbO3 = wqr.fARcdN;
            if (c54982xbO3 == null) {
                Intrinsics.gEmmrt("");
                c54982xbO3 = null;
            }
            c54982xbO3.EZpvd(BotOrderListPresenter.getBotTitle$default(wqr.KWHzl(), wqr.AYXKKw, false, 2, null));
            c54990xbW3.OLrzqt(2, c54982xbO3);
            android.widget.PopupWindow popupWindowAEQbTJ = wqr.isConnected.AEQbTJ();
            if (popupWindowAEQbTJ != null) {
                popupWindowAEQbTJ.dismiss();
            }
        }
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ() {
        java.lang.String str = this.DbNXlk;
        return (str == null || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ANY") || C55946xtY.OLrzqt.gEmmrt(this.AYXKKw)) ? false : true;
    }

    public static /* synthetic */ C54982xbO getBizInfoTypeItem$default(wQR wqr, C54982xbO c54982xbO, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c54982xbO = null;
        }
        return wqr.KWHzl(c54982xbO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [250=4] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:? */
    /* JADX DEBUG: Multi-variable search result rejected for r3v18, resolved type: T */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C54982xbO KWHzl(C54982xbO c54982xbO) {
        Function1<? super InterfaceC55274xgp, java.lang.Boolean> function1;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.util.ArrayList<BizInstrument> arrayListOLrzqt;
        T tOLrzqt;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        java.lang.String str = this.DbNXlk;
        if (str != null) {
            final TradeLiveData tradeLiveData = new TradeLiveData();
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                C55608xnE.EZpvd(interfaceC54581xNrOLrzqt, str, (MutableLiveData<xRQ>) tradeLiveData, true);
            }
            final Function2 function2 = new Function2() { // from class: o.wRj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return wQR.AEQbTJ(tradeLiveData, this, (java.lang.CharSequence) obj, (MutableLiveData) obj2);
                }
            };
            Function1<? super InterfaceC55274xgp, java.lang.Boolean> function12 = new Function1() { // from class: o.wQS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(wQR.EZpvd(function2, this, (InterfaceC55274xgp) obj));
                }
            };
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(str)) != null && (arrayListOLrzqt = abstractC54531xLwOLrzqt.OLrzqt()) != null) {
                switch (str.hashCode()) {
                    case -2027980370:
                        tOLrzqt = !str.equals("MARGIN") ? 0 : OLrzqt((java.util.ArrayList<? extends BizInstrument>) arrayListOLrzqt);
                        break;
                    case -1956807563:
                        tOLrzqt = !str.equals("OPTION") ? 0 : AEQbTJ((java.util.ArrayList<? extends BizInstrument>) arrayListOLrzqt);
                        break;
                    case 2552066:
                        if (!str.equals("SPOT")) {
                            tOLrzqt = 0;
                            break;
                        }
                        break;
                    case 2558355:
                        tOLrzqt = !str.equals("SWAP") ? 0 : EZpvd((java.util.ArrayList<? extends BizInstrument>) arrayListOLrzqt);
                        break;
                    case 214415088:
                        tOLrzqt = !str.equals("FUTURES") ? 0 : KWHzl((java.util.ArrayList<? extends BizInstrument>) arrayListOLrzqt);
                        break;
                    default:
                        tOLrzqt = 0;
                        break;
                }
                objectRef.element = tOLrzqt;
            }
            function1 = function12;
        } else {
            function1 = null;
        }
        if (c54982xbO == null) {
            java.lang.String strAEQbTJ = AEQbTJ(this.AhwBna, this.DbNXlk);
            return new C54982xbO(strAEQbTJ == null ? "" : strAEQbTJ, null, null, AEQbTJ(), false, null, function1, new Function0() { // from class: o.wQY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wQR.KWHzl(objectRef);
                }
            }, new Function1() { // from class: o.wQU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return wQR.EZpvd((C55276xgr) obj);
                }
            }, Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) "FUTURES") ? new Function2() { // from class: o.wQW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return wQR.copydefault((C55276xgr) obj, (C55276xgr) obj2);
                }
            } : null, new yHO() { // from class: o.wRb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return wQR.EZpvd(this.KWHzl, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
                }
            }, null, null, null, null, null, null, null, null, 522294, null);
        }
        java.lang.String strAEQbTJ2 = AEQbTJ(this.AhwBna, this.DbNXlk);
        c54982xbO.EZpvd(strAEQbTJ2 != null ? strAEQbTJ2 : "");
        c54982xbO.AEQbTJ(AEQbTJ());
        c54982xbO.AEQbTJ(new Function0() { // from class: o.wQP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wQR.AEQbTJ(objectRef);
            }
        });
        c54982xbO.EZpvd(new Function1() { // from class: o.wQX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wQR.KWHzl((C55276xgr) obj);
            }
        });
        c54982xbO.OLrzqt(Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) "FUTURES") ? new Function2() { // from class: o.wQV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return wQR.EZpvd((C55276xgr) obj, (C55276xgr) obj2);
            }
        } : null);
        c54982xbO.copydefault(function1);
        return c54982xbO;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(TradeLiveData tradeLiveData, final wQR wqr, java.lang.CharSequence charSequence, final MutableLiveData mutableLiveData) {
        LifecycleOwner lifecycleOwner;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        if (C33129mqd.OLrzqt(charSequence)) {
            T value = tradeLiveData.getValue();
            C54712xSn c54712xSn = value instanceof C54712xSn ? (C54712xSn) value : null;
            if (c54712xSn != null && (lifecycleOwner = ViewTreeLifecycleOwner.get(wqr)) != null) {
                final TradeLiveData tradeLiveData2 = new TradeLiveData();
                Observer<java.util.List<TradeSearchGroup>> observer = new Observer() { // from class: o.wRi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(java.lang.Object obj) {
                        wQR.copydefault(mutableLiveData, tradeLiveData2, wqr, (java.util.List) obj);
                    }
                };
                wqr.AuCTel = observer;
                Intrinsics.copydefault(observer);
                tradeLiveData2.observe(lifecycleOwner, observer);
                C54712xSn.search$default(c54712xSn, (charSequence == null || (string = charSequence.toString()) == null) ? "" : string, tradeLiveData2, null, null, null, false, 60, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(MutableLiveData mutableLiveData, TradeLiveData tradeLiveData, wQR wqr, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        TradeSearchGroup tradeSearchGroup = (TradeSearchGroup) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (tradeSearchGroup != null) {
            java.util.ArrayList<BizInstrument> bizInstList = tradeSearchGroup.getBizInstList();
            if (bizInstList.isEmpty()) {
                mutableLiveData.postValue(yDY.AhwBna());
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(bizInstList, 10));
                for (BizInstrument bizInstrument : bizInstList) {
                    arrayList.add(new C55276xgr(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, 12, null), bizInstrument, null, false, false, null, null, 124, null));
                }
                mutableLiveData.postValue(arrayList);
            }
        } else {
            mutableLiveData.postValue(yDY.AhwBna());
        }
        Observer<java.util.List<TradeSearchGroup>> observer = wqr.AuCTel;
        Intrinsics.copydefault(observer);
        tradeLiveData.removeObserver(observer);
    }

    public static final boolean EZpvd(Function2 function2, final wQR wqr, InterfaceC55274xgp interfaceC55274xgp) {
        Intrinsics.checkNotNullParameter(interfaceC55274xgp, "");
        interfaceC55274xgp.EZpvd(new Function1() { // from class: o.wRg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wQR.KWHzl((C55230xfy) obj);
            }
        }, function2, new Function1() { // from class: o.wRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wQR.AEQbTJ(this.copydefault, (C55276xgr) obj);
            }
        }, ViewTreeLifecycleOwner.get(wqr));
        return false;
    }

    public static final Unit KWHzl(C55230xfy c55230xfy) {
        Intrinsics.checkNotNullParameter(c55230xfy, "");
        c55230xfy.EZpvd().setHint(C33070mpX.AYXKKw(C48033uCm.Fragment.RZNAhV));
        c55230xfy.setOKDSSize(-3);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(wQR wqr, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        BizInstrument bizInstrument = objOLrzqt instanceof BizInstrument ? (BizInstrument) objOLrzqt : null;
        if (bizInstrument != null) {
            wqr.setCurrentInstrument(bizInstrument.getInstId(), bizInstrument.getInstType());
            yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho = wqr.AkhnZx;
            if (yho != null) {
                yho.invoke(bizInstrument.getInstId(), bizInstrument.getInstType(), wqr.AYXKKw);
            }
        }
        wqr.EZpvd();
        android.widget.PopupWindow popupWindowAEQbTJ = wqr.isConnected.AEQbTJ();
        if (popupWindowAEQbTJ != null) {
            popupWindowAEQbTJ.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.util.ArrayList AEQbTJ(Ref.ObjectRef objectRef) {
        return (java.util.ArrayList) objectRef.element;
    }

    public static final java.util.List KWHzl(C55276xgr c55276xgr) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        if (objOLrzqt instanceof java.util.List) {
            return (java.util.List) objOLrzqt;
        }
        return null;
    }

    public static final java.util.List EZpvd(C55276xgr c55276xgr, C55276xgr c55276xgr2) {
        java.lang.Object objOLrzqt = c55276xgr2 != null ? c55276xgr2.OLrzqt() : null;
        if (objOLrzqt instanceof java.util.List) {
            return (java.util.List) objOLrzqt;
        }
        return null;
    }

    public static final java.util.List KWHzl(Ref.ObjectRef objectRef) {
        return (java.util.List) objectRef.element;
    }

    public static final java.util.List EZpvd(C55276xgr c55276xgr) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        if (objOLrzqt instanceof java.util.List) {
            return (java.util.List) objOLrzqt;
        }
        return null;
    }

    public static final java.util.List copydefault(C55276xgr c55276xgr, C55276xgr c55276xgr2) {
        java.lang.Object objOLrzqt = c55276xgr2 != null ? c55276xgr2.OLrzqt() : null;
        if (objOLrzqt instanceof java.util.List) {
            return (java.util.List) objOLrzqt;
        }
        return null;
    }

    public static final Unit EZpvd(wQR wqr, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        if (c55276xgr != null) {
            if (c55276xgr.OLrzqt() == null) {
                wqr.setCurrentInstrument(null, wqr.DbNXlk);
                yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho = wqr.AkhnZx;
                if (yho != null) {
                    yho.invoke(null, wqr.DbNXlk, wqr.AYXKKw);
                }
            } else {
                if (c55276xgr3 != null) {
                    c55276xgr2 = c55276xgr3;
                }
                java.lang.Object objOLrzqt = c55276xgr2 != null ? c55276xgr2.OLrzqt() : null;
                BizInstrument bizInstrument = objOLrzqt instanceof BizInstrument ? (BizInstrument) objOLrzqt : null;
                if (bizInstrument != null) {
                    wqr.setCurrentInstrument(bizInstrument.getInstId(), bizInstrument.getInstType());
                    yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho2 = wqr.AkhnZx;
                    if (yho2 != null) {
                        yho2.invoke(bizInstrument.getInstId(), bizInstrument.getInstType(), wqr.AYXKKw);
                    }
                }
            }
        }
        android.widget.PopupWindow popupWindowAEQbTJ = wqr.isConnected.AEQbTJ();
        if (popupWindowAEQbTJ != null) {
            popupWindowAEQbTJ.dismiss();
        }
        wqr.EZpvd();
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        C54982xbO c54982xbO = null;
        if (this.AhwBna != null && this.DbNXlk != null) {
            C54990xbW c54990xbW = this.isConnected;
            C54982xbO c54982xbO2 = this.fIwbmz;
            if (c54982xbO2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c54982xbO = c54982xbO2;
            }
            c54982xbO.EZpvd(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, this.AhwBna, this.DbNXlk, false, false, 8, null));
            Unit unit = Unit.INSTANCE;
            c54990xbW.OLrzqt(1, c54982xbO);
            return;
        }
        java.lang.Integer num = this.AEQbTJ.get("ANY");
        if (num != null) {
            int iIntValue = num.intValue();
            C54990xbW c54990xbW2 = this.isConnected;
            C54982xbO c54982xbO3 = this.fIwbmz;
            if (c54982xbO3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c54982xbO = c54982xbO3;
            }
            c54982xbO.EZpvd(getContext().getString(iIntValue));
            Unit unit2 = Unit.INSTANCE;
            c54990xbW2.OLrzqt(1, c54982xbO);
        }
    }

    public final java.util.ArrayList<C55276xgr> OLrzqt(java.util.ArrayList<? extends BizInstrument> arrayList) {
        java.util.List<ChargeGroupData> listAEQbTJ;
        C55276xgr c55276xgr;
        java.util.ArrayList<C55276xgr> arrayList2 = new java.util.ArrayList<>();
        arrayList2.add(new C55276xgr(this.valueOf, null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (listAEQbTJ = interfaceC54581xNrOLrzqt.AEQbTJ()) != null) {
            for (ChargeGroupData chargeGroupData : listAEQbTJ) {
                java.util.ArrayList<BizInstrument> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList) {
                    if (chargeGroupData.getTypes().contains(((BizInstrument) obj).getQuoteSymbol())) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    C55276xgr c55276xgr2 = new C55276xgr(chargeGroupData.getName(), new java.util.ArrayList(), null, false, false, null, null, 124, null);
                    arrayList2.add(c55276xgr2);
                    for (BizInstrument bizInstrument : arrayList3) {
                        C55276xgr c55276xgr3 = new C55276xgr(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, 8, null), bizInstrument, null, false, false, null, null, 124, null);
                        if (Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) bizInstrument.getInstId()) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) bizInstrument.getInstType())) {
                            c55276xgr2.copydefault(true);
                            c55276xgr = c55276xgr3;
                            c55276xgr.copydefault(true);
                        } else {
                            c55276xgr = c55276xgr3;
                        }
                        java.lang.Object objOLrzqt = c55276xgr2.OLrzqt();
                        Intrinsics.copydefault(objOLrzqt, "");
                        ((java.util.ArrayList) objOLrzqt).add(c55276xgr);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final java.util.ArrayList<C55276xgr> KWHzl(java.util.ArrayList<? extends BizInstrument> arrayList) {
        C55276xgr c55276xgr;
        FutureGroupInfo futureGroupInfoEZpvd;
        java.lang.String text;
        java.util.ArrayList<C55276xgr> arrayList2 = new java.util.ArrayList<>();
        arrayList2.add(new C55276xgr(this.KWHzl, null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : arrayList) {
            java.lang.String ccyType = ((BizInstrument) obj).getCcyType();
            java.lang.Object arrayList3 = linkedHashMap.get(ccyType);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(ccyType, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj);
        }
        for (Map.Entry entry : C56424yEw.copydefault(CollectionsKt___CollectionsKt.EZpvd(C56427yEz.AkhnZx(linkedHashMap), new StateListAnimator())).entrySet()) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            C55276xgr c55276xgr2 = new C55276xgr((interfaceC54581xNrOLrzqt == null || (futureGroupInfoEZpvd = interfaceC54581xNrOLrzqt.EZpvd("SWAP", (java.lang.String) entry.getKey())) == null || (text = futureGroupInfoEZpvd.getText()) == null) ? "" : text, new java.util.ArrayList(), null, false, false, null, null, 124, null);
            arrayList2.add(c55276xgr2);
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (java.lang.Object obj2 : iterable) {
                java.lang.String tradeSymbol = ((BizInstrument) obj2).getTradeSymbol();
                java.lang.Object arrayList4 = linkedHashMap2.get(tradeSymbol);
                if (arrayList4 == null) {
                    arrayList4 = new java.util.ArrayList();
                    linkedHashMap2.put(tradeSymbol, arrayList4);
                }
                ((java.util.List) arrayList4).add(obj2);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                C55276xgr c55276xgr3 = new C55276xgr((java.lang.CharSequence) entry2.getKey(), new java.util.ArrayList(), null, false, false, null, null, 124, null);
                java.lang.Object objOLrzqt = c55276xgr2.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                ((java.util.ArrayList) objOLrzqt).add(c55276xgr3);
                for (BizInstrument bizInstrument : (java.lang.Iterable) entry2.getValue()) {
                    C55276xgr c55276xgr4 = new C55276xgr(xVE.copydefault.OLrzqt(bizInstrument.getInstId(), bizInstrument.isPreMarketPair()), bizInstrument, null, false, false, null, null, 124, null);
                    if (Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) bizInstrument.getInstId()) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) bizInstrument.getInstType())) {
                        c55276xgr2.copydefault(true);
                        c55276xgr3.copydefault(true);
                        c55276xgr = c55276xgr4;
                        c55276xgr.copydefault(true);
                    } else {
                        c55276xgr = c55276xgr4;
                    }
                    java.lang.Object objOLrzqt2 = c55276xgr3.OLrzqt();
                    Intrinsics.copydefault(objOLrzqt2, "");
                    ((java.util.ArrayList) objOLrzqt2).add(c55276xgr);
                }
            }
        }
        return arrayList2;
    }

    public final java.util.ArrayList<C55276xgr> EZpvd(java.util.ArrayList<? extends BizInstrument> arrayList) {
        C55276xgr c55276xgr;
        FutureGroupInfo futureGroupInfoEZpvd;
        java.lang.String text;
        java.util.ArrayList<C55276xgr> arrayList2 = new java.util.ArrayList<>();
        arrayList2.add(new C55276xgr(this.KWHzl, null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : arrayList) {
            java.lang.String ccyType = ((BizInstrument) obj).getCcyType();
            java.lang.Object arrayList3 = linkedHashMap.get(ccyType);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(ccyType, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj);
        }
        for (Map.Entry entry : C56424yEw.copydefault(CollectionsKt___CollectionsKt.EZpvd(C56427yEz.AkhnZx(linkedHashMap), new ActionBar())).entrySet()) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            C55276xgr c55276xgr2 = new C55276xgr((interfaceC54581xNrOLrzqt == null || (futureGroupInfoEZpvd = interfaceC54581xNrOLrzqt.EZpvd("SWAP", (java.lang.String) entry.getKey())) == null || (text = futureGroupInfoEZpvd.getText()) == null) ? "" : text, new java.util.ArrayList(), null, false, false, null, null, 124, null);
            arrayList2.add(c55276xgr2);
            for (BizInstrument bizInstrument : (java.lang.Iterable) entry.getValue()) {
                C55276xgr c55276xgr3 = new C55276xgr(C54799xVt.AEQbTJ.OLrzqt(bizInstrument), bizInstrument, null, false, false, null, null, 124, null);
                if (Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) bizInstrument.getInstId()) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) bizInstrument.getInstType())) {
                    c55276xgr2.copydefault(true);
                    c55276xgr = c55276xgr3;
                    c55276xgr.copydefault(true);
                } else {
                    c55276xgr = c55276xgr3;
                }
                java.lang.Object objOLrzqt = c55276xgr2.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                ((java.util.ArrayList) objOLrzqt).add(c55276xgr);
            }
        }
        return arrayList2;
    }

    public final java.util.ArrayList<C55276xgr> AEQbTJ(java.util.ArrayList<? extends BizInstrument> arrayList) {
        java.util.ArrayList<C55276xgr> arrayList2 = new java.util.ArrayList<>();
        arrayList2.add(new C55276xgr(this.djBIcL, null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : arrayList) {
            java.lang.String instFamily = ((BizInstrument) obj).getInstFamily();
            java.lang.Object arrayList3 = linkedHashMap.get(instFamily);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(instFamily, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C55276xgr c55276xgr = new C55276xgr(C59449zhJ.replace$default((java.lang.String) entry.getKey(), "-", "", false, 4, (java.lang.Object) null), new java.util.ArrayList(), null, false, false, null, null, 124, null);
            arrayList2.add(c55276xgr);
            for (BizInstrument bizInstrument : (java.lang.Iterable) entry.getValue()) {
                C55276xgr c55276xgr2 = new C55276xgr(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, 8, null), bizInstrument, null, false, false, null, null, 124, null);
                if (Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) bizInstrument.getInstId()) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) bizInstrument.getInstType())) {
                    c55276xgr.copydefault(true);
                    c55276xgr2.copydefault(true);
                }
                java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                ((java.util.ArrayList) objOLrzqt).add(c55276xgr2);
            }
        }
        return arrayList2;
    }

    public static /* synthetic */ C54982xbO getBotTypeItem$default(wQR wqr, C54982xbO c54982xbO, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c54982xbO = null;
        }
        return wqr.AEQbTJ(c54982xbO);
    }

    public final C54982xbO AEQbTJ(C54982xbO c54982xbO) {
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        java.lang.String str = this.DbNXlk;
        if (str == null) {
            str = "ANY";
        }
        java.util.List<TacticsType> listCopydefault = c56059xvf.copydefault(str);
        final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (TacticsType tacticsType : listCopydefault) {
            arrayList.add(new C55276xgr(BotOrderListPresenter.getBotTitle$default(KWHzl(), tacticsType.getConstant(), false, 2, null), tacticsType, null, Intrinsics.EZpvd((java.lang.Object) tacticsType.getConstant(), (java.lang.Object) this.AYXKKw), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        if (c54982xbO != null) {
            c54982xbO.EZpvd(BotOrderListPresenter.getBotTitle$default(KWHzl(), this.AYXKKw, false, 2, null));
            c54982xbO.AEQbTJ(new Function0() { // from class: o.wQZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wQR.djBIcL(arrayList);
                }
            });
            return c54982xbO;
        }
        return new C54982xbO(BotOrderListPresenter.getBotTitle$default(KWHzl(), this.AYXKKw, false, 2, null), null, null, false, false, null, new Function1() { // from class: o.wRa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(wQR.copydefault(this.AEQbTJ, (InterfaceC55274xgp) obj));
            }
        }, new Function0() { // from class: o.wRc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wQR.AhwBna(arrayList);
            }
        }, null, null, null, null, null, null, null, null, null, null, null, 524094, null);
    }

    public static final boolean copydefault(final wQR wqr, InterfaceC55274xgp interfaceC55274xgp) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(interfaceC55274xgp, "");
        android.content.Context context = wqr.getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return true;
        }
        C50405vNe c50405vNe = new C50405vNe();
        c50405vNe.EZpvd(new Function2() { // from class: o.wRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return wQR.AEQbTJ(this.OLrzqt, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        c50405vNe.AEQbTJ(new Function0() { // from class: o.wRk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wQR.KWHzl(this.OLrzqt);
            }
        });
        c50405vNe.show(supportFragmentManager, C56524yIo.AEQbTJ(C50405vNe.class).valueOf());
        return true;
    }

    public static final Unit AEQbTJ(wQR wqr, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        wqr.AYXKKw = str;
        Function1<? super java.lang.String, Unit> function1 = wqr.fetchVPNInfo;
        if (function1 != null) {
            function1.invoke(str);
        }
        C54990xbW c54990xbW = wqr.isConnected;
        C54982xbO c54982xbO = wqr.fARcdN;
        C54982xbO c54982xbO2 = null;
        if (c54982xbO == null) {
            Intrinsics.gEmmrt("");
            c54982xbO = null;
        }
        c54982xbO.EZpvd(str2);
        Unit unit = Unit.INSTANCE;
        c54990xbW.OLrzqt(2, c54982xbO);
        wqr.isConnected.KWHzl(2);
        C54990xbW c54990xbW2 = wqr.isConnected;
        C54982xbO c54982xbO3 = wqr.fIwbmz;
        if (c54982xbO3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c54982xbO2 = c54982xbO3;
        }
        c54990xbW2.OLrzqt(1, wqr.KWHzl(c54982xbO2));
        return unit;
    }

    public static final Unit KWHzl(wQR wqr) {
        wqr.isConnected.KWHzl(2);
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(java.lang.String str) {
        if (str == null || str.length() == 0) {
            java.lang.Integer num = this.OLrzqt.get("ANY");
            if (num != null) {
                return getContext().getString(num.intValue());
            }
        } else {
            java.lang.Integer num2 = this.OLrzqt.get(str);
            if (num2 != null) {
                return getContext().getString(num2.intValue());
            }
        }
        return null;
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (str != null && str2 != null) {
            return C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, false, false, 8, null);
        }
        java.lang.Integer num = this.AEQbTJ.get("ANY");
        if (num == null) {
            return null;
        }
        return getContext().getString(num.intValue());
    }
}
