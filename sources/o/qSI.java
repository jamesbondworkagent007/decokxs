package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.qSI;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qSI extends android.widget.FrameLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public Function1<? super FuturesUnitVo, Unit> EZpvd;
    public final Activity KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qSI(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qSI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwitchTypeListener(Function1<? super FuturesUnitVo, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.qSI.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ qSI(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qSI(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qSH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qSI.EZpvd(context);
            }
        });
        Activity activity = new Activity(new Function1() { // from class: o.qSK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qSI.copydefault(this.EZpvd, (FuturesUnitVo) obj);
            }
        }, new Function1() { // from class: o.qSN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qSI.OLrzqt(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        });
        this.KWHzl = activity;
        addView(EZpvd());
        EZpvd().setAdapter(activity);
        if (isInEditMode()) {
            java.util.List<FuturesUnitVo> listGEmmrt = yDY.gEmmrt(new FuturesUnitVo("USDT", "USDT", "USDT", null, false, 16, null), new FuturesUnitVo("USDC", "USDC", "USDC", null, false, 16, null));
            setSubList(listGEmmrt, (FuturesUnitVo) CollectionsKt___CollectionsKt.AuCTelauCTel(listGEmmrt), true);
        }
    }

    private final RecyclerView EZpvd() {
        return (RecyclerView) this.AEQbTJ.getValue();
    }

    public static final RecyclerView EZpvd(android.content.Context context) {
        return qSZ.Companion.KWHzl(context);
    }

    public static final Unit copydefault(qSI qsi, FuturesUnitVo futuresUnitVo) {
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Function1<? super FuturesUnitVo, Unit> function1 = qsi.EZpvd;
        if (function1 != null) {
            function1.invoke(futuresUnitVo);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final qSI qsi, final int i) {
        try {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(java.lang.Boolean.valueOf(qsi.EZpvd().post(new java.lang.Runnable() { // from class: o.qSL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    qSI.copydefault(this.KWHzl, i);
                }
            })));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(qSI qsi, int i) {
        qsi.EZpvd().smoothScrollToPosition(i);
    }

    public final void setSubList(java.util.List<FuturesUnitVo> list, FuturesUnitVo futuresUnitVo, boolean z) {
        java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> mapCopydefault = C40380qTs.KWHzl.copydefault();
        java.util.ArrayList arrayList = null;
        java.util.List<java.lang.String> list2 = mapCopydefault != null ? mapCopydefault.get("quoteSymbol") : null;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                FuturesUnitVo futuresUnitVo2 = (FuturesUnitVo) obj;
                if (list2 == null || CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) list2), futuresUnitVo2.EZpvd())) {
                    arrayList.add(obj);
                }
            }
        }
        C40375qTn.AEQbTJ.copydefault("NavSearchFuturesUnitSwitchView", "setSubList, dataList: " + arrayList + ", selectedChargeGroup: " + futuresUnitVo + ", isShow: " + z);
        if (C33129mqd.KWHzl((java.util.Collection) arrayList) && z) {
            setVisibility(0);
            Activity activity = this.KWHzl;
            Intrinsics.copydefault(arrayList);
            activity.KWHzl(arrayList, futuresUnitVo);
            return;
        }
        setVisibility(8);
    }

    public static final class Activity extends AbstractC40513qYq<TaskDescription, C54989xbV> {
        public final Function1<java.lang.Integer, Unit> AEQbTJ;
        public java.util.List<FuturesUnitVo> EZpvd;
        public final Function1<FuturesUnitVo, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.market.quotation.ui.model.FuturesUnitVo, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull Function1<? super FuturesUnitVo, Unit> function1, @NotNull Function1<? super java.lang.Integer, Unit> function12) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            this.copydefault = function1;
            this.AEQbTJ = function12;
            this.EZpvd = yDY.AhwBna();
        }

        public static final class TaskDescription implements InterfaceC40516qYt {
            public static final int KWHzl = FuturesUnitVo.KWHzl;
            public final boolean EZpvd;
            public final FuturesUnitVo OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, FuturesUnitVo futuresUnitVo, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    futuresUnitVo = taskDescription.OLrzqt;
                }
                if ((i & 2) != 0) {
                    z = taskDescription.EZpvd;
                }
                return taskDescription.OLrzqt(futuresUnitVo, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FuturesUnitVo OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(@NotNull FuturesUnitVo futuresUnitVo, boolean z) {
                Intrinsics.checkNotNullParameter(futuresUnitVo, "");
                return new TaskDescription(futuresUnitVo, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && this.EZpvd == taskDescription.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SelectableChargeGroupVo(vo=" + this.OLrzqt + ", isSelected=" + this.EZpvd + ")";
            }

            public TaskDescription(@NotNull FuturesUnitVo futuresUnitVo, boolean z) {
                Intrinsics.checkNotNullParameter(futuresUnitVo, "");
                this.OLrzqt = futuresUnitVo;
                this.EZpvd = z;
            }

            @Override // o.InterfaceC40516qYt
            public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
                Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
                return (interfaceC40516qYt instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) interfaceC40516qYt).OLrzqt);
            }

            @Override // o.InterfaceC40516qYt
            public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
                Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
                return Intrinsics.EZpvd(this, interfaceC40516qYt);
            }
        }

        public final void KWHzl(@NotNull java.util.List<FuturesUnitVo> list, FuturesUnitVo futuresUnitVo) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
            final Ref.IntRef intRef = new Ref.IntRef();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                FuturesUnitVo futuresUnitVo2 = (FuturesUnitVo) obj;
                if (Intrinsics.EZpvd(futuresUnitVo, futuresUnitVo2)) {
                    intRef.element = i;
                }
                arrayList.add(new TaskDescription(futuresUnitVo2, Intrinsics.EZpvd(futuresUnitVo, futuresUnitVo2)));
                i++;
            }
            submitList(arrayList, new java.lang.Runnable() { // from class: o.qST
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    qSI.Activity.EZpvd(this.copydefault, intRef);
                }
            });
        }

        public static final void EZpvd(Activity activity, Ref.IntRef intRef) {
            activity.AEQbTJ.invoke(java.lang.Integer.valueOf(intRef.element));
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // o.AbstractC40513qYq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public C54989xbV copydefault(@NotNull android.content.Context context, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return qSZ.Companion.AEQbTJ(context);
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/qYt;)V */
        /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00e6  */
        @Override // o.AbstractC40513qYq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void OLrzqt(@NotNull C54989xbV c54989xbV, int i, @NotNull final TaskDescription taskDescription) {
            java.lang.String strKWHzl;
            java.lang.Object next;
            java.lang.Object next2;
            java.lang.Object next3;
            Intrinsics.checkNotNullParameter(c54989xbV, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            java.util.List<FutureGroupInfo> listFARcdN = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.fARcdN() : null;
            java.lang.String strEZpvd = taskDescription.OLrzqt().EZpvd();
            if (strEZpvd == null) {
                strKWHzl = taskDescription.OLrzqt().KWHzl();
            } else {
                int iHashCode = strEZpvd.hashCode();
                if (iHashCode != 84326) {
                    if (iHashCode != 2614173) {
                        if (iHashCode == 2614190 && strEZpvd.equals("USDT")) {
                            if (listFARcdN != null) {
                                java.util.Iterator<T> it = listFARcdN.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next3 = null;
                                        break;
                                    } else {
                                        next3 = it.next();
                                        if (Intrinsics.EZpvd((java.lang.Object) ((FutureGroupInfo) next3).getCcyType(), (java.lang.Object) "USDT")) {
                                            break;
                                        }
                                    }
                                }
                                FutureGroupInfo futureGroupInfo = (FutureGroupInfo) next3;
                                if (futureGroupInfo == null || (strKWHzl = futureGroupInfo.getText()) == null) {
                                    strKWHzl = C33070mpX.AYXKKw(qZH.PendingIntent.GiPPlLQAswws);
                                }
                            }
                        }
                    } else if (strEZpvd.equals("USDC")) {
                        if (listFARcdN != null) {
                            java.util.Iterator<T> it2 = listFARcdN.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                } else {
                                    next2 = it2.next();
                                    if (Intrinsics.EZpvd((java.lang.Object) ((FutureGroupInfo) next2).getCcyType(), (java.lang.Object) "USDC")) {
                                        break;
                                    }
                                }
                            }
                            FutureGroupInfo futureGroupInfo2 = (FutureGroupInfo) next2;
                            if (futureGroupInfo2 == null || (strKWHzl = futureGroupInfo2.getText()) == null) {
                                strKWHzl = C33070mpX.AYXKKw(qZH.PendingIntent.setLocationManually);
                            }
                        }
                    }
                } else if (strEZpvd.equals("USD")) {
                    if (listFARcdN != null) {
                        java.util.Iterator<T> it3 = listFARcdN.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it3.next();
                                if (Intrinsics.EZpvd((java.lang.Object) ((FutureGroupInfo) next).getCcyType(), (java.lang.Object) "USD")) {
                                    break;
                                }
                            }
                        }
                        FutureGroupInfo futureGroupInfo3 = (FutureGroupInfo) next;
                        if (futureGroupInfo3 == null || (strKWHzl = futureGroupInfo3.getText()) == null) {
                            strKWHzl = C33070mpX.AYXKKw(qZH.PendingIntent.sElUiK);
                        }
                    }
                }
            }
            java.lang.String str = strKWHzl;
            c54989xbV.EZpvd().setText(str != null ? C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{"Ⓢ"}, 0, null, false, new Function1() { // from class: o.qSO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qSI.Activity.AEQbTJ((java.util.List) obj);
                }
            }, 14, null) : null);
            c54989xbV.EZpvd().setIncludeFontPadding(false);
            c54989xbV.setSelected(taskDescription.copydefault());
            c54989xbV.setOnClickListener(new View.OnClickListener() { // from class: o.qSM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    qSI.Activity.OLrzqt(this.KWHzl, taskDescription, view);
                }
            });
        }

        public static final Unit AEQbTJ(java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new C40351qSq());
            return Unit.INSTANCE;
        }

        public static final void OLrzqt(Activity activity, TaskDescription taskDescription, android.view.View view) {
            activity.KWHzl(activity.EZpvd, taskDescription.OLrzqt());
            activity.copydefault.invoke(taskDescription.OLrzqt());
        }
    }
}
