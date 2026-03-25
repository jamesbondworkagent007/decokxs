package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.material.tabs.TabLayout;
import com.okinc.planet.widget.TradeOrderFilterView$initBizInfo$1;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.C55688xof;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tVv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46478tVv extends android.widget.LinearLayout {
    public kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> AYXKKw;
    public yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> AhwBna;
    public C54982xbO AkhnZx;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public boolean djBIcL;
    public java.lang.String fetchVPNInfo;
    public C54990xbW gEmmrt;
    public C54982xbO valueOf;
    public Observer<java.util.List<TradeSearchGroup>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46478tVv(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46478tVv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final java.util.List OLrzqt(java.util.List list) {
        return list;
    }

    public static final java.util.List copydefault(java.util.List list) {
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentInstrument(java.lang.String str, java.lang.String str2) {
        this.EZpvd = str;
        this.KWHzl = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterBarEnable(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSelectCallback(Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        this.AYXKKw = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:46) call: o.tVv.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C46478tVv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46478tVv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.fetchVPNInfo = C33070mpX.AYXKKw(C47501trL.Fragment.RlQdEF);
        this.OLrzqt = C33070mpX.AYXKKw(C47501trL.Fragment.DAIeex);
        this.copydefault = C33070mpX.AYXKKw(C55688xof.Application.getLaunchPendingIntent);
        this.djBIcL = true;
        this.gEmmrt = (C54990xbW) android.view.LayoutInflater.from(context).inflate(C47501trL.Application.gSBher, this).findViewById(C47501trL.TaskDescription.DTg);
    }

    public static /* synthetic */ void refreshFilter$default(C46478tVv c46478tVv, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c46478tVv.KWHzl(str, str2, z);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, boolean z) {
        this.EZpvd = str;
        this.KWHzl = str2;
        C54982xbO c54982xbO = this.valueOf;
        C54982xbO c54982xbO2 = null;
        if (c54982xbO != null) {
            C54990xbW c54990xbW = this.gEmmrt;
            if (c54982xbO == null) {
                Intrinsics.gEmmrt("");
                c54982xbO = null;
            }
            c54990xbW.OLrzqt(0, copydefault(c54982xbO, z));
            C54990xbW c54990xbW2 = this.gEmmrt;
            C54982xbO c54982xbO3 = this.AkhnZx;
            if (c54982xbO3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c54982xbO2 = c54982xbO3;
            }
            c54990xbW2.OLrzqt(1, OLrzqt(c54982xbO2));
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = this.AYXKKw;
            if (function2 != null) {
                function2.invoke(this.EZpvd, this.KWHzl);
                return;
            }
            return;
        }
        this.valueOf = getBizTypeItem$default(this, null, z, 1, null);
        this.AkhnZx = getBizInfoTypeItem$default(this, null, 1, null);
        C54982xbO[] c54982xbOArr = new C54982xbO[2];
        C54982xbO c54982xbO4 = this.valueOf;
        if (c54982xbO4 == null) {
            Intrinsics.gEmmrt("");
            c54982xbO4 = null;
        }
        c54982xbOArr[0] = c54982xbO4;
        C54982xbO c54982xbO5 = this.AkhnZx;
        if (c54982xbO5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c54982xbO2 = c54982xbO5;
        }
        c54982xbOArr[1] = c54982xbO2;
        C54990xbW.setData$default(this.gEmmrt, yDY.copydefault(c54982xbOArr), new Function2() { // from class: o.tVL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C46478tVv.copydefault(this.OLrzqt, (TabLayout.Tab) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: renamed from: o.tVv$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            FutureGroupInfo futureGroupInfoEZpvd;
            FutureGroupInfo futureGroupInfoEZpvd2;
            kotlin.Pair pair = (kotlin.Pair) t;
            C46392tSq c46392tSq = C46392tSq.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrEZpvd = c46392tSq.EZpvd();
            java.lang.String sort = null;
            int iAhwBna = C33129mqd.AhwBna((interfaceC54581xNrEZpvd == null || (futureGroupInfoEZpvd2 = interfaceC54581xNrEZpvd.EZpvd("SWAP", (java.lang.String) pair.getFirst())) == null) ? null : futureGroupInfoEZpvd2.getSort());
            kotlin.Pair pair2 = (kotlin.Pair) t2;
            InterfaceC54581xNr interfaceC54581xNrEZpvd2 = c46392tSq.EZpvd();
            if (interfaceC54581xNrEZpvd2 != null && (futureGroupInfoEZpvd = interfaceC54581xNrEZpvd2.EZpvd("SWAP", (java.lang.String) pair2.getFirst())) != null) {
                sort = futureGroupInfoEZpvd.getSort();
            }
            return yET.KWHzl(java.lang.Integer.valueOf(iAhwBna), java.lang.Integer.valueOf(C33129mqd.AhwBna(sort)));
        }
    }

    /* JADX INFO: renamed from: o.tVv$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            FutureGroupInfo futureGroupInfoEZpvd;
            FutureGroupInfo futureGroupInfoEZpvd2;
            kotlin.Pair pair = (kotlin.Pair) t;
            C46392tSq c46392tSq = C46392tSq.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrEZpvd = c46392tSq.EZpvd();
            java.lang.String sort = null;
            int iAhwBna = C33129mqd.AhwBna((interfaceC54581xNrEZpvd == null || (futureGroupInfoEZpvd2 = interfaceC54581xNrEZpvd.EZpvd("FUTURES", (java.lang.String) pair.getFirst())) == null) ? null : futureGroupInfoEZpvd2.getSort());
            kotlin.Pair pair2 = (kotlin.Pair) t2;
            InterfaceC54581xNr interfaceC54581xNrEZpvd2 = c46392tSq.EZpvd();
            if (interfaceC54581xNrEZpvd2 != null && (futureGroupInfoEZpvd = interfaceC54581xNrEZpvd2.EZpvd("FUTURES", (java.lang.String) pair2.getFirst())) != null) {
                sort = futureGroupInfoEZpvd.getSort();
            }
            return yET.KWHzl(java.lang.Integer.valueOf(iAhwBna), java.lang.Integer.valueOf(C33129mqd.AhwBna(sort)));
        }
    }

    public static final Unit copydefault(C46478tVv c46478tVv, TabLayout.Tab tab, int i) {
        if (i == 1) {
            C54990xbW c54990xbW = c46478tVv.gEmmrt;
            C54982xbO c54982xbO = c46478tVv.AkhnZx;
            if (c54982xbO == null) {
                Intrinsics.gEmmrt("");
                c54982xbO = null;
            }
            c54990xbW.OLrzqt(1, c46478tVv.OLrzqt(c54982xbO));
        }
        return Unit.INSTANCE;
    }

    public final void setSelectIconVisibility(boolean z) {
        this.gEmmrt.setSelectIconVisibility(z);
    }

    public final void setDividerVisibility(boolean z) {
        android.view.View view = this.gEmmrt.KWHzl().copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
    }

    public final void setSelectClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.gEmmrt.setSelectClickListener(onClickListener);
    }

    public static /* synthetic */ C54982xbO getBizTypeItem$default(C46478tVv c46478tVv, C54982xbO c54982xbO, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c54982xbO = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return c46478tVv.copydefault(c54982xbO, z);
    }

    public final C54982xbO copydefault(C54982xbO c54982xbO, boolean z) {
        java.util.ArrayList<java.lang.String> arrayListEjfBZ;
        InterfaceC54581xNr interfaceC54581xNrEZpvd = C46392tSq.EZpvd.EZpvd();
        final java.util.ArrayList arrayList = null;
        if (interfaceC54581xNrEZpvd != null && (arrayListEjfBZ = interfaceC54581xNrEZpvd.ejfBZ()) != null) {
            if (z) {
                arrayListEjfBZ.add(0, "CONVERT");
            }
            arrayListEjfBZ.add(0, "ANY");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListEjfBZ, 10));
            for (java.lang.String str : arrayListEjfBZ) {
                java.lang.Integer num = tIX.KWHzl.copydefault().get(str);
                java.lang.String strAYXKKw = num != null ? C33070mpX.AYXKKw(num.intValue()) : null;
                arrayList2.add(new C55276xgr(strAYXKKw == null ? "" : strAYXKKw, new tUL(null, null, null, str, 7, null), null, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.KWHzl), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
            }
            arrayList = arrayList2;
        }
        if (c54982xbO != null) {
            java.lang.String str2 = this.KWHzl;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String strCopydefault = copydefault(str2);
            c54982xbO.EZpvd(strCopydefault != null ? strCopydefault : "");
            c54982xbO.AEQbTJ(new Function0() { // from class: o.tVx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46478tVv.OLrzqt(arrayList);
                }
            });
            c54982xbO.AEQbTJ(OLrzqt());
            return c54982xbO;
        }
        java.lang.String str3 = this.KWHzl;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String strCopydefault2 = copydefault(str3);
        return new C54982xbO(strCopydefault2 == null ? "" : strCopydefault2, null, null, false, false, null, null, new Function0() { // from class: o.tVy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46478tVv.copydefault(arrayList);
            }
        }, null, null, new yHO() { // from class: o.tVJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C46478tVv.OLrzqt(this.OLrzqt, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        }, null, null, null, null, null, null, null, null, 523134, null);
    }

    public static final Unit OLrzqt(C46478tVv c46478tVv, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.String strKWHzl;
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        tUL tul = objOLrzqt instanceof tUL ? (tUL) objOLrzqt : null;
        if (tul != null && (strKWHzl = tul.KWHzl()) != null) {
            if (!Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "ANY")) {
                android.content.Context context = c46478tVv.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c46478tVv.EZpvd(context, strKWHzl, new Function0() { // from class: o.tVO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C46478tVv.AhwBna();
                    }
                });
            }
            java.lang.String str = Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "ANY") ? null : strKWHzl;
            c46478tVv.KWHzl = str;
            c46478tVv.EZpvd = null;
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c46478tVv.AYXKKw;
            if (function2 != null) {
                function2.invoke(null, str);
            }
            java.lang.CharSequence charSequenceAYXKKw = Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "ANY") ? C33070mpX.AYXKKw(C47501trL.Fragment.QKudOq) : c55276xgr.AhwBna();
            C54990xbW c54990xbW = c46478tVv.gEmmrt;
            C54982xbO c54982xbO = c46478tVv.valueOf;
            if (c54982xbO == null) {
                Intrinsics.gEmmrt("");
                c54982xbO = null;
            }
            c54982xbO.EZpvd(charSequenceAYXKKw);
            c54982xbO.AEQbTJ(c46478tVv.OLrzqt());
            Unit unit = Unit.INSTANCE;
            c54990xbW.OLrzqt(0, c54982xbO);
            C54990xbW c54990xbW2 = c46478tVv.gEmmrt;
            C54982xbO c54982xbO2 = c46478tVv.AkhnZx;
            if (c54982xbO2 == null) {
                Intrinsics.gEmmrt("");
                c54982xbO2 = null;
            }
            c54982xbO2.EZpvd(c46478tVv.KWHzl(null, c46478tVv.KWHzl));
            c54982xbO2.AEQbTJ(c46478tVv.EZpvd());
            c54990xbW2.OLrzqt(1, c54982xbO2);
            android.widget.PopupWindow popupWindowAEQbTJ = c46478tVv.gEmmrt.AEQbTJ();
            if (popupWindowAEQbTJ != null) {
                popupWindowAEQbTJ.dismiss();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(android.content.Context context, java.lang.String str, Function0<Unit> function0) {
        if (context instanceof LifecycleOwner) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) context), null, null, new TradeOrderFilterView$initBizInfo$1(str, function0, null), 3, null);
        } else {
            function0.invoke();
        }
    }

    public static /* synthetic */ C54982xbO getBizInfoTypeItemWithoutInstType$default(C46478tVv c46478tVv, C54982xbO c54982xbO, C46455tUz c46455tUz, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c54982xbO = null;
        }
        if ((i & 2) != 0) {
            c46455tUz = null;
        }
        return c46478tVv.copydefault(c54982xbO, c46455tUz);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.util.ArrayList] */
    public final C54982xbO copydefault(C54982xbO c54982xbO, final C46455tUz c46455tUz) {
        Function1<? super InterfaceC55274xgp, java.lang.Boolean> function1;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.util.ArrayList<BizInstrument> arrayListEZpvd;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        java.lang.String str = this.KWHzl;
        if (str != null) {
            final TradeLiveData tradeLiveData = new TradeLiveData();
            C46392tSq c46392tSq = C46392tSq.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrEZpvd = c46392tSq.EZpvd();
            if (interfaceC54581xNrEZpvd != null) {
                C55608xnE.createTradeSearchLoader$default(interfaceC54581xNrEZpvd, str, tradeLiveData, false, 4, null);
            }
            final Function2 function2 = new Function2() { // from class: o.tVA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C46478tVv.EZpvd(this.KWHzl, tradeLiveData, (java.lang.CharSequence) obj, (MutableLiveData) obj2);
                }
            };
            Function1<? super InterfaceC55274xgp, java.lang.Boolean> function12 = new Function1() { // from class: o.tVz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C46478tVv.EZpvd(this.copydefault, function2, (InterfaceC55274xgp) obj));
                }
            };
            InterfaceC54581xNr interfaceC54581xNrEZpvd2 = c46392tSq.EZpvd();
            if (interfaceC54581xNrEZpvd2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrEZpvd2.OLrzqt(str)) != null && (arrayListEZpvd = abstractC54531xLwOLrzqt.EZpvd()) != null) {
                objectRef.element = copydefault(str, arrayListEZpvd, c46455tUz);
            }
            function1 = function12;
        } else {
            function1 = null;
        }
        if (c54982xbO != null) {
            c54982xbO.EZpvd(getSwapCallbackTitle$default(this, this.EZpvd, "SWAP", this.AEQbTJ, null, 8, null));
            c54982xbO.AEQbTJ(EZpvd());
            c54982xbO.AEQbTJ(new Function0() { // from class: o.tVD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46478tVv.djBIcL(objectRef);
                }
            });
            c54982xbO.EZpvd(new Function1() { // from class: o.tVC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46478tVv.djBIcL((C55276xgr) obj);
                }
            });
            c54982xbO.OLrzqt(null);
            c54982xbO.copydefault(function1);
            return c54982xbO;
        }
        return new C54982xbO(getSwapCallbackTitle$default(this, this.EZpvd, "SWAP", this.AEQbTJ, null, 8, null), null, null, EZpvd(), false, null, function1, new Function0() { // from class: o.tVG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46478tVv.valueOf(objectRef);
            }
        }, new Function1() { // from class: o.tVE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46478tVv.AhwBna((C55276xgr) obj);
            }
        }, null, new yHO() { // from class: o.tVF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C46478tVv.OLrzqt(this.EZpvd, c46455tUz, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        }, null, null, null, null, null, null, null, null, 522294, null);
    }

    public static final Unit EZpvd(C46478tVv c46478tVv, TradeLiveData tradeLiveData, java.lang.CharSequence charSequence, MutableLiveData mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        c46478tVv.EZpvd(charSequence, tradeLiveData, (MutableLiveData<java.util.List<C55276xgr>>) mutableLiveData);
        return Unit.INSTANCE;
    }

    public static final boolean EZpvd(C46478tVv c46478tVv, Function2 function2, InterfaceC55274xgp interfaceC55274xgp) {
        Intrinsics.checkNotNullParameter(interfaceC55274xgp, "");
        c46478tVv.copydefault(interfaceC55274xgp, (Function2<? super java.lang.CharSequence, ? super MutableLiveData<java.util.List<C55276xgr>>, Unit>) function2, false);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.util.ArrayList djBIcL(Ref.ObjectRef objectRef) {
        return (java.util.ArrayList) objectRef.element;
    }

    public static final java.util.List djBIcL(C55276xgr c55276xgr) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        if (objOLrzqt instanceof java.util.List) {
            return (java.util.List) objOLrzqt;
        }
        return null;
    }

    public static final java.util.List valueOf(Ref.ObjectRef objectRef) {
        return (java.util.List) objectRef.element;
    }

    public static final java.util.List AhwBna(C55276xgr c55276xgr) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        if (objOLrzqt instanceof java.util.List) {
            return (java.util.List) objOLrzqt;
        }
        return null;
    }

    public static final Unit OLrzqt(C46478tVv c46478tVv, C46455tUz c46455tUz, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        FutureGroupInfo futureGroupInfoEZpvd;
        if (c55276xgr2 != null) {
            java.lang.Object objOLrzqt = c55276xgr2.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            tUL tul = (tUL) objOLrzqt;
            java.lang.String text = null;
            C54982xbO c54982xbO = null;
            text = null;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) tul.EZpvd())) {
                c46478tVv.setCurrentInstrument(null, c46478tVv.KWHzl);
                yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho = c46478tVv.AhwBna;
                if (yho != null) {
                    java.lang.String str = c46478tVv.KWHzl;
                    java.lang.String strKWHzl = tul.KWHzl();
                    if (strKWHzl == null) {
                        strKWHzl = "";
                    }
                    yho.invoke(null, str, strKWHzl);
                }
                C54990xbW c54990xbW = c46478tVv.gEmmrt;
                C54982xbO c54982xbO2 = c46478tVv.valueOf;
                if (c54982xbO2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c54982xbO = c54982xbO2;
                }
                c54982xbO.EZpvd(java.lang.String.valueOf(tul.EZpvd()));
                c46478tVv.AEQbTJ = new kotlin.Pair<>(java.lang.String.valueOf(tul.EZpvd()), java.lang.String.valueOf(tul.KWHzl()));
                Unit unit = Unit.INSTANCE;
                c54990xbW.OLrzqt(0, c46478tVv.copydefault(c54982xbO, c46455tUz));
            } else {
                java.lang.Object objOLrzqt2 = c55276xgr2.OLrzqt();
                tUL tul2 = objOLrzqt2 instanceof tUL ? (tUL) objOLrzqt2 : null;
                java.lang.Object objCopydefault = tul2 != null ? tul2.copydefault() : null;
                BizInstrument bizInstrument = objCopydefault instanceof BizInstrument ? (BizInstrument) objCopydefault : null;
                if (bizInstrument != null) {
                    c46478tVv.setCurrentInstrument(bizInstrument.getInstId(), bizInstrument.getInstType());
                    InterfaceC54581xNr interfaceC54581xNrEZpvd = C46392tSq.EZpvd.EZpvd();
                    if (interfaceC54581xNrEZpvd != null && (futureGroupInfoEZpvd = interfaceC54581xNrEZpvd.EZpvd("SWAP", bizInstrument.getCcyType())) != null) {
                        text = futureGroupInfoEZpvd.getText();
                    }
                    if (text == null) {
                        text = "";
                    }
                    c46478tVv.AEQbTJ = new kotlin.Pair<>(text, java.lang.String.valueOf(tul.KWHzl()));
                    yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho2 = c46478tVv.AhwBna;
                    if (yho2 != null) {
                        java.lang.String instId = bizInstrument.getInstId();
                        java.lang.String instType = bizInstrument.getInstType();
                        java.lang.String strKWHzl2 = tul.KWHzl();
                        yho2.invoke(instId, instType, strKWHzl2 != null ? strKWHzl2 : "");
                    }
                }
            }
        }
        android.widget.PopupWindow popupWindowAEQbTJ = c46478tVv.gEmmrt.AEQbTJ();
        if (popupWindowAEQbTJ != null) {
            popupWindowAEQbTJ.dismiss();
        }
        c46478tVv.KWHzl(false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ C54982xbO getBizInfoTypeItem$default(C46478tVv c46478tVv, C54982xbO c54982xbO, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c54982xbO = null;
        }
        return c46478tVv.OLrzqt(c54982xbO);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.util.ArrayList] */
    public final C54982xbO OLrzqt(C54982xbO c54982xbO) {
        Function1<? super InterfaceC55274xgp, java.lang.Boolean> function1;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.util.ArrayList<BizInstrument> arrayListOLrzqt;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        java.lang.String str = this.KWHzl;
        if (str != null) {
            final MutableLiveData mutableLiveData = new MutableLiveData();
            C46392tSq c46392tSq = C46392tSq.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrEZpvd = c46392tSq.EZpvd();
            if (interfaceC54581xNrEZpvd != null) {
                C55608xnE.EZpvd(interfaceC54581xNrEZpvd, str, (MutableLiveData<xRQ>) mutableLiveData, true);
            }
            final Function2 function2 = new Function2() { // from class: o.tVQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C46478tVv.AEQbTJ(this.KWHzl, mutableLiveData, (java.lang.CharSequence) obj, (MutableLiveData) obj2);
                }
            };
            function1 = new Function1() { // from class: o.tVP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C46478tVv.KWHzl(this.EZpvd, function2, (InterfaceC55274xgp) obj));
                }
            };
            InterfaceC54581xNr interfaceC54581xNrEZpvd2 = c46392tSq.EZpvd();
            if (interfaceC54581xNrEZpvd2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrEZpvd2.OLrzqt(str)) != null && (arrayListOLrzqt = abstractC54531xLwOLrzqt.OLrzqt()) != null) {
                objectRef.element = generateSourceData$default(this, str, arrayListOLrzqt, null, 4, null);
            }
        } else {
            function1 = null;
        }
        if (c54982xbO != null) {
            java.lang.String strKWHzl = KWHzl(this.EZpvd, this.KWHzl);
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            c54982xbO.EZpvd(strKWHzl);
            c54982xbO.AEQbTJ(EZpvd());
            c54982xbO.AEQbTJ(new Function0() { // from class: o.tVN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46478tVv.OLrzqt(objectRef);
                }
            });
            c54982xbO.EZpvd(new Function1() { // from class: o.tVS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46478tVv.AEQbTJ((C55276xgr) obj);
                }
            });
            c54982xbO.OLrzqt(Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) "FUTURES") ? new Function2() { // from class: o.tVT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C46478tVv.OLrzqt((C55276xgr) obj, (C55276xgr) obj2);
                }
            } : null);
            c54982xbO.copydefault(function1);
            return c54982xbO;
        }
        return new C54982xbO(KWHzl(this.EZpvd, this.KWHzl), null, null, EZpvd(), false, null, function1, new Function0() { // from class: o.tVU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46478tVv.gEmmrt(objectRef);
            }
        }, new Function1() { // from class: o.tVV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46478tVv.AYXKKw((C55276xgr) obj);
            }
        }, null, new yHO() { // from class: o.tVB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C46478tVv.AEQbTJ(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        }, null, null, null, null, null, null, null, null, 522806, null);
    }

    public static final Unit AEQbTJ(C46478tVv c46478tVv, MutableLiveData mutableLiveData, java.lang.CharSequence charSequence, MutableLiveData mutableLiveData2) {
        Intrinsics.checkNotNullParameter(mutableLiveData2, "");
        c46478tVv.EZpvd(charSequence, (MutableLiveData<xRQ>) mutableLiveData, (MutableLiveData<java.util.List<C55276xgr>>) mutableLiveData2);
        return Unit.INSTANCE;
    }

    public static final boolean KWHzl(C46478tVv c46478tVv, Function2 function2, InterfaceC55274xgp interfaceC55274xgp) {
        Intrinsics.checkNotNullParameter(interfaceC55274xgp, "");
        c46478tVv.copydefault(interfaceC55274xgp, (Function2<? super java.lang.CharSequence, ? super MutableLiveData<java.util.List<C55276xgr>>, Unit>) function2, true);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.util.ArrayList OLrzqt(Ref.ObjectRef objectRef) {
        return (java.util.ArrayList) objectRef.element;
    }

    public static final java.util.List AEQbTJ(C55276xgr c55276xgr) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        if (objOLrzqt instanceof java.util.List) {
            return (java.util.List) objOLrzqt;
        }
        return null;
    }

    public static final java.util.List OLrzqt(C55276xgr c55276xgr, C55276xgr c55276xgr2) {
        java.lang.Object objOLrzqt = c55276xgr2 != null ? c55276xgr2.OLrzqt() : null;
        if (objOLrzqt instanceof java.util.List) {
            return (java.util.List) objOLrzqt;
        }
        return null;
    }

    public static final java.util.List gEmmrt(Ref.ObjectRef objectRef) {
        return (java.util.List) objectRef.element;
    }

    public static final java.util.List AYXKKw(C55276xgr c55276xgr) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        if (objOLrzqt instanceof java.util.List) {
            return (java.util.List) objOLrzqt;
        }
        return null;
    }

    public static final Unit AEQbTJ(C46478tVv c46478tVv, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        if (c55276xgr != null) {
            C54982xbO c54982xbO = null;
            if (c55276xgr.OLrzqt() == null) {
                c46478tVv.setCurrentInstrument(null, c46478tVv.KWHzl);
                Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c46478tVv.AYXKKw;
                if (function2 != null) {
                    function2.invoke(null, c46478tVv.KWHzl);
                }
                C54990xbW c54990xbW = c46478tVv.gEmmrt;
                C54982xbO c54982xbO2 = c46478tVv.AkhnZx;
                if (c54982xbO2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c54982xbO = c54982xbO2;
                }
                c54990xbW.OLrzqt(1, c46478tVv.OLrzqt(c54982xbO));
            } else {
                if (c55276xgr3 != null) {
                    c55276xgr2 = c55276xgr3;
                }
                java.lang.Object objOLrzqt = c55276xgr2 != null ? c55276xgr2.OLrzqt() : null;
                tUL tul = objOLrzqt instanceof tUL ? (tUL) objOLrzqt : null;
                java.lang.Object objCopydefault = tul != null ? tul.copydefault() : null;
                BizInstrument bizInstrument = objCopydefault instanceof BizInstrument ? (BizInstrument) objCopydefault : null;
                if (bizInstrument != null) {
                    c46478tVv.setCurrentInstrument(bizInstrument.getInstId(), bizInstrument.getInstType());
                    Function2<? super java.lang.String, ? super java.lang.String, Unit> function22 = c46478tVv.AYXKKw;
                    if (function22 != null) {
                        function22.invoke(bizInstrument.getInstId(), bizInstrument.getInstType());
                    }
                }
            }
        }
        android.widget.PopupWindow popupWindowAEQbTJ = c46478tVv.gEmmrt.AEQbTJ();
        if (popupWindowAEQbTJ != null) {
            popupWindowAEQbTJ.dismiss();
        }
        c46478tVv.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.util.ArrayList generateSourceData$default(C46478tVv c46478tVv, java.lang.String str, java.util.ArrayList arrayList, C46455tUz c46455tUz, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            c46455tUz = null;
        }
        return c46478tVv.copydefault(str, (java.util.ArrayList<? extends BizInstrument>) arrayList, c46455tUz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [377=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r2.equals("SPOT") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r2.equals("MARGIN") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return KWHzl(r3);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<C55276xgr> copydefault(java.lang.String str, java.util.ArrayList<? extends BizInstrument> arrayList, C46455tUz c46455tUz) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2027980370:
                    break;
                case -1956807563:
                    if (str.equals("OPTION")) {
                        return EZpvd(arrayList);
                    }
                    break;
                case 2552066:
                    break;
                case 2558355:
                    if (str.equals("SWAP")) {
                        return copydefault(arrayList, c46455tUz);
                    }
                    break;
                case 214415088:
                    if (str.equals("FUTURES")) {
                        return AEQbTJ(arrayList);
                    }
                    break;
            }
        }
        return null;
    }

    public final void EZpvd(java.lang.CharSequence charSequence, MutableLiveData<xRQ> mutableLiveData, final MutableLiveData<java.util.List<C55276xgr>> mutableLiveData2) {
        LifecycleOwner lifecycleOwner;
        if (C33129mqd.OLrzqt(charSequence)) {
            xRQ value = mutableLiveData.getValue();
            C54712xSn c54712xSn = value instanceof C54712xSn ? (C54712xSn) value : null;
            if (c54712xSn == null || (lifecycleOwner = ViewTreeLifecycleOwner.get(this)) == null) {
                return;
            }
            final TradeLiveData tradeLiveData = new TradeLiveData();
            Observer<java.util.List<TradeSearchGroup>> observer = new Observer() { // from class: o.tVH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(java.lang.Object obj) {
                    C46478tVv.copydefault(mutableLiveData2, tradeLiveData, this, (java.util.List) obj);
                }
            };
            this.values = observer;
            Intrinsics.copydefault(observer);
            tradeLiveData.observe(lifecycleOwner, observer);
            java.lang.String string = charSequence != null ? charSequence.toString() : null;
            C54712xSn.search$default(c54712xSn, string == null ? "" : string, tradeLiveData, null, null, null, false, 60, null);
        }
    }

    public static final void copydefault(MutableLiveData mutableLiveData, TradeLiveData tradeLiveData, C46478tVv c46478tVv, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        TradeSearchGroup tradeSearchGroup = (TradeSearchGroup) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (tradeSearchGroup == null) {
            mutableLiveData.postValue(yDY.AhwBna());
        } else {
            java.util.ArrayList<BizInstrument> bizInstList = tradeSearchGroup.getBizInstList();
            if (bizInstList.isEmpty()) {
                mutableLiveData.postValue(yDY.AhwBna());
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(bizInstList, 10));
                for (BizInstrument bizInstrument : bizInstList) {
                    arrayList.add(new C55276xgr(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, 12, null), new tUL(bizInstrument, null, null, null, 14, null), null, false, false, null, null, 124, null));
                }
                mutableLiveData.postValue(arrayList);
            }
        }
        Observer<java.util.List<TradeSearchGroup>> observer = c46478tVv.values;
        Intrinsics.copydefault(observer);
        tradeLiveData.removeObserver(observer);
    }

    public final void copydefault(InterfaceC55274xgp interfaceC55274xgp, Function2<? super java.lang.CharSequence, ? super MutableLiveData<java.util.List<C55276xgr>>, Unit> function2, final boolean z) {
        interfaceC55274xgp.EZpvd(new Function1() { // from class: o.tVK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46478tVv.KWHzl((C55230xfy) obj);
            }
        }, function2, new Function1() { // from class: o.tVM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46478tVv.OLrzqt(this.KWHzl, z, (C55276xgr) obj);
            }
        }, ViewTreeLifecycleOwner.get(this));
    }

    public static final Unit KWHzl(C55230xfy c55230xfy) {
        Intrinsics.checkNotNullParameter(c55230xfy, "");
        c55230xfy.setOKDSSize(-3);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C46478tVv c46478tVv, boolean z, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        tUL tul = objOLrzqt instanceof tUL ? (tUL) objOLrzqt : null;
        java.lang.Object objCopydefault = tul != null ? tul.copydefault() : null;
        BizInstrument bizInstrument = objCopydefault instanceof BizInstrument ? (BizInstrument) objCopydefault : null;
        if (bizInstrument != null) {
            c46478tVv.setCurrentInstrument(bizInstrument.getInstId(), bizInstrument.getInstType());
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c46478tVv.AYXKKw;
            if (function2 != null) {
                function2.invoke(bizInstrument.getInstId(), bizInstrument.getInstType());
            }
        }
        c46478tVv.KWHzl(z);
        android.widget.PopupWindow popupWindowAEQbTJ = c46478tVv.gEmmrt.AEQbTJ();
        if (popupWindowAEQbTJ != null) {
            popupWindowAEQbTJ.dismiss();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z) {
        if (z) {
            AEQbTJ();
        } else {
            KWHzl();
        }
    }

    public final void KWHzl() {
        if (this.EZpvd == null || this.KWHzl == null) {
            return;
        }
        C54990xbW c54990xbW = this.gEmmrt;
        C54982xbO c54982xbO = this.valueOf;
        if (c54982xbO == null) {
            Intrinsics.gEmmrt("");
            c54982xbO = null;
        }
        c54982xbO.EZpvd(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, this.EZpvd, this.KWHzl, false, false, 8, null));
        Unit unit = Unit.INSTANCE;
        c54990xbW.OLrzqt(0, c54982xbO);
    }

    public final void AEQbTJ() {
        if (this.EZpvd == null || this.KWHzl == null) {
            return;
        }
        C54990xbW c54990xbW = this.gEmmrt;
        C54982xbO c54982xbO = this.AkhnZx;
        if (c54982xbO == null) {
            Intrinsics.gEmmrt("");
            c54982xbO = null;
        }
        c54982xbO.EZpvd(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, this.EZpvd, this.KWHzl, false, false, 8, null));
        Unit unit = Unit.INSTANCE;
        c54990xbW.OLrzqt(1, c54982xbO);
    }

    public final java.util.ArrayList<C55276xgr> KWHzl(java.util.ArrayList<? extends BizInstrument> arrayList) {
        java.util.List<ChargeGroupData> listAEQbTJ;
        java.util.ArrayList<C55276xgr> arrayList2 = new java.util.ArrayList<>();
        arrayList2.add(new C55276xgr(this.copydefault, null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        InterfaceC54581xNr interfaceC54581xNrEZpvd = C46392tSq.EZpvd.EZpvd();
        if (interfaceC54581xNrEZpvd != null && (listAEQbTJ = interfaceC54581xNrEZpvd.AEQbTJ()) != null) {
            for (ChargeGroupData chargeGroupData : listAEQbTJ) {
                java.util.ArrayList<BizInstrument> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList) {
                    if (chargeGroupData.getTypes().contains(((BizInstrument) obj).getDisplayQuoteSymbol())) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    C55276xgr c55276xgr = new C55276xgr(chargeGroupData.getName(), new java.util.ArrayList(), null, false, false, null, null, 124, null);
                    arrayList2.add(c55276xgr);
                    for (BizInstrument bizInstrument : arrayList3) {
                        C55276xgr c55276xgr2 = new C55276xgr(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, 8, null), new tUL(bizInstrument, null, null, null, 14, null), null, false, false, null, null, 124, null);
                        if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) bizInstrument.getInstId()) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) bizInstrument.getInstType())) {
                            c55276xgr.copydefault(true);
                            c55276xgr2.copydefault(true);
                        }
                        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                        Intrinsics.copydefault(objOLrzqt, "");
                        ((java.util.ArrayList) objOLrzqt).add(c55276xgr2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final java.util.ArrayList<C55276xgr> AEQbTJ(java.util.ArrayList<? extends BizInstrument> arrayList) {
        FutureGroupInfo futureGroupInfoEZpvd;
        java.util.ArrayList<C55276xgr> arrayList2 = new java.util.ArrayList<>();
        arrayList2.add(new C55276xgr(this.OLrzqt, null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
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
        for (Map.Entry entry : C56424yEw.copydefault(CollectionsKt___CollectionsKt.EZpvd(C56427yEz.AkhnZx(linkedHashMap), new Application())).entrySet()) {
            InterfaceC54581xNr interfaceC54581xNrEZpvd = C46392tSq.EZpvd.EZpvd();
            java.lang.String text = (interfaceC54581xNrEZpvd == null || (futureGroupInfoEZpvd = interfaceC54581xNrEZpvd.EZpvd("SWAP", (java.lang.String) entry.getKey())) == null) ? null : futureGroupInfoEZpvd.getText();
            C55276xgr c55276xgr = new C55276xgr(text == null ? "" : text, new java.util.ArrayList(), null, false, false, null, null, 124, null);
            arrayList2.add(c55276xgr);
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
                C55276xgr c55276xgr2 = new C55276xgr((java.lang.CharSequence) entry2.getKey(), new java.util.ArrayList(), null, false, false, null, null, 124, null);
                java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                ((java.util.ArrayList) objOLrzqt).add(c55276xgr2);
                for (BizInstrument bizInstrument : (java.lang.Iterable) entry2.getValue()) {
                    C55276xgr c55276xgr3 = new C55276xgr(xVE.copydefault.OLrzqt(bizInstrument.getInstId(), bizInstrument.isPreMarketPair()), new tUL(bizInstrument, null, null, null, 14, null), null, false, false, null, null, 124, null);
                    if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) bizInstrument.getInstId()) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) bizInstrument.getInstType())) {
                        c55276xgr.copydefault(true);
                        c55276xgr2.copydefault(true);
                        c55276xgr3.copydefault(true);
                    }
                    java.lang.Object objOLrzqt2 = c55276xgr2.OLrzqt();
                    Intrinsics.copydefault(objOLrzqt2, "");
                    ((java.util.ArrayList) objOLrzqt2).add(c55276xgr3);
                }
            }
        }
        return arrayList2;
    }

    public static /* synthetic */ java.util.ArrayList buildSwapDataSource$default(C46478tVv c46478tVv, java.util.ArrayList arrayList, C46455tUz c46455tUz, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c46455tUz = null;
        }
        return c46478tVv.copydefault((java.util.ArrayList<? extends BizInstrument>) arrayList, c46455tUz);
    }

    public final java.util.ArrayList<C55276xgr> copydefault(java.util.ArrayList<? extends BizInstrument> arrayList, C46455tUz c46455tUz) {
        FutureGroupInfo futureGroupInfoEZpvd;
        FutureGroupInfo futureGroupInfoEZpvd2;
        FutureGroupInfo futureGroupInfoEZpvd3;
        java.util.ArrayList<C55276xgr> arrayList2 = new java.util.ArrayList<>();
        if (c46455tUz == null || !Intrinsics.EZpvd(c46455tUz.EZpvd(), java.lang.Boolean.FALSE)) {
            arrayList2.add(new C55276xgr(this.OLrzqt, null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        }
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
            C46392tSq c46392tSq = C46392tSq.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrEZpvd = c46392tSq.EZpvd();
            java.lang.String text = (interfaceC54581xNrEZpvd == null || (futureGroupInfoEZpvd3 = interfaceC54581xNrEZpvd.EZpvd("SWAP", (java.lang.String) entry.getKey())) == null) ? null : futureGroupInfoEZpvd3.getText();
            C55276xgr c55276xgr = new C55276xgr(text == null ? "" : text, new java.util.ArrayList(), null, false, false, null, null, 124, null);
            arrayList2.add(c55276xgr);
            if (c46455tUz != null && Intrinsics.EZpvd(c46455tUz.OLrzqt(), java.lang.Boolean.TRUE)) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = "";
                KWHzl(this.EZpvd, "SWAP", this.AEQbTJ, new Function1() { // from class: o.tVI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C46478tVv.AEQbTJ(objectRef, this, (kotlin.Pair) obj2);
                    }
                });
                java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                java.util.ArrayList arrayList4 = (java.util.ArrayList) objOLrzqt;
                java.lang.String strKWHzl = c46455tUz.KWHzl();
                java.lang.String strValueOf = java.lang.String.valueOf(c55276xgr.AhwBna());
                InterfaceC54581xNr interfaceC54581xNrEZpvd2 = c46392tSq.EZpvd();
                java.lang.String ccyType2 = (interfaceC54581xNrEZpvd2 == null || (futureGroupInfoEZpvd2 = interfaceC54581xNrEZpvd2.EZpvd("SWAP", (java.lang.String) entry.getKey())) == null) ? null : futureGroupInfoEZpvd2.getCcyType();
                arrayList4.add(new C55276xgr(strKWHzl, new tUL(null, null, strValueOf, ccyType2 == null ? "" : ccyType2, 2, null), null, Intrinsics.EZpvd(c55276xgr.AhwBna(), objectRef.element), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
                c55276xgr.copydefault(Intrinsics.EZpvd(c55276xgr.AhwBna(), objectRef.element));
            }
            for (BizInstrument bizInstrument : (java.lang.Iterable) entry.getValue()) {
                java.lang.String str = bizInstrument.getTradeSymbol() + bizInstrument.getQuoteSymbol() + " " + this.fetchVPNInfo;
                InterfaceC54581xNr interfaceC54581xNrEZpvd3 = C46392tSq.EZpvd.EZpvd();
                java.lang.String ccyType3 = (interfaceC54581xNrEZpvd3 == null || (futureGroupInfoEZpvd = interfaceC54581xNrEZpvd3.EZpvd("SWAP", (java.lang.String) entry.getKey())) == null) ? null : futureGroupInfoEZpvd.getCcyType();
                C55276xgr c55276xgr2 = new C55276xgr(str, new tUL(bizInstrument, null, null, ccyType3 == null ? "" : ccyType3, 6, null), null, false, false, null, null, 124, null);
                if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) bizInstrument.getInstId()) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) bizInstrument.getInstType())) {
                    c55276xgr.copydefault(true);
                    c55276xgr2.copydefault(true);
                }
                java.lang.Object objOLrzqt2 = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt2, "");
                ((java.util.ArrayList) objOLrzqt2).add(c55276xgr2);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:8:0x001b */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    public static final Unit AEQbTJ(Ref.ObjectRef objectRef, C46478tVv c46478tVv, kotlin.Pair pair) {
        T t = "";
        Intrinsics.checkNotNullParameter(pair, "");
        kotlin.Pair<java.lang.String, java.lang.String> pair2 = c46478tVv.AEQbTJ;
        if (pair2 == null) {
            t = (java.lang.String) pair.getFirst();
        } else {
            java.lang.String first = pair2 != null ? pair2.getFirst() : null;
            if (first != null) {
                t = first;
            }
        }
        objectRef.element = t;
        return Unit.INSTANCE;
    }

    public final java.util.ArrayList<C55276xgr> EZpvd(java.util.ArrayList<? extends BizInstrument> arrayList) {
        java.util.ArrayList<C55276xgr> arrayList2 = new java.util.ArrayList<>();
        arrayList2.add(new C55276xgr(this.OLrzqt, null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
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
                C55276xgr c55276xgr2 = new C55276xgr(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, 8, null), new tUL(bizInstrument, null, null, null, 14, null), null, false, false, null, null, 124, null);
                if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) bizInstrument.getInstId()) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) bizInstrument.getInstType())) {
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

    public final java.lang.String copydefault(java.lang.String str) {
        if (str == null || str.length() == 0) {
            java.lang.Integer num = tIX.KWHzl.copydefault().get("ANY");
            if (num != null) {
                return getContext().getString(num.intValue());
            }
        } else {
            java.lang.Integer num2 = tIX.KWHzl.copydefault().get(str);
            if (num2 != null) {
                return getContext().getString(num2.intValue());
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.tVv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.String getSwapCallbackTitle$default(C46478tVv c46478tVv, java.lang.String str, java.lang.String str2, kotlin.Pair pair, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            pair = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        return c46478tVv.KWHzl(str, str2, (kotlin.Pair<java.lang.String, java.lang.String>) pair, (Function1<? super kotlin.Pair<java.lang.String, java.lang.String>, Unit>) function1);
    }

    public final java.lang.String KWHzl(java.lang.String str, @NotNull java.lang.String str2, kotlin.Pair<java.lang.String, java.lang.String> pair, Function1<? super kotlin.Pair<java.lang.String, java.lang.String>, Unit> function1) {
        java.util.List<FutureGroupInfo> listFARcdN;
        FutureGroupInfo futureGroupInfo;
        java.util.List<FutureGroupInfo> listFARcdN2;
        FutureGroupInfo futureGroupInfo2;
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String first = pair != null ? pair.getFirst() : null;
        if (first == null || first.length() == 0) {
            C46392tSq c46392tSq = C46392tSq.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrEZpvd = c46392tSq.EZpvd();
            java.lang.String text = (interfaceC54581xNrEZpvd == null || (listFARcdN2 = interfaceC54581xNrEZpvd.fARcdN()) == null || (futureGroupInfo2 = (FutureGroupInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(listFARcdN2)) == null) ? null : futureGroupInfo2.getText();
            if (text == null) {
                text = "";
            }
            if (function1 != null) {
                InterfaceC54581xNr interfaceC54581xNrEZpvd2 = c46392tSq.EZpvd();
                if (interfaceC54581xNrEZpvd2 != null && (listFARcdN = interfaceC54581xNrEZpvd2.fARcdN()) != null && (futureGroupInfo = (FutureGroupInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(listFARcdN)) != null) {
                    ccyType = futureGroupInfo.getCcyType();
                }
                function1.invoke(new kotlin.Pair(text, ccyType != null ? ccyType : ""));
            }
            return text;
        }
        if (str == null || str.length() == 0) {
            if (function1 != null) {
                java.lang.String first2 = pair != null ? pair.getFirst() : null;
                if (first2 == null) {
                    first2 = "";
                }
                java.lang.String second = pair != null ? pair.getSecond() : null;
                if (second == null) {
                    second = "";
                }
                function1.invoke(new kotlin.Pair(first2, second));
            }
            ccyType = pair != null ? pair.getFirst() : null;
            return ccyType == null ? "" : ccyType;
        }
        return C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, false, false, 12, null);
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        return AEQbTJ(str, str2);
    }

    public final boolean EZpvd() {
        java.lang.String str = this.KWHzl;
        return (str == null || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ANY") || Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) "CONVERT") || !this.djBIcL) ? false : true;
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        java.lang.String strAYXKKw;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && str2 != null) {
            strAYXKKw = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, false, false, 8, null);
        } else {
            java.lang.Integer num = tIX.KWHzl.KWHzl().get("ANY");
            strAYXKKw = num != null ? C33070mpX.AYXKKw(num.intValue()) : null;
        }
        return strAYXKKw == null ? C33070mpX.AYXKKw(C47501trL.Fragment.DAIeex) : strAYXKKw;
    }
}
