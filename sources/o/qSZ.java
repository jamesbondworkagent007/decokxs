package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.okmarket.ui.market.quote.WrapContentLinearLayoutManager;
import com.okinc.unify_trade.biz.ChargeGroupData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.qSZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qSZ extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final Application EZpvd;
    public Function1<? super ChargeGroupVo, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qSZ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qSZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwitchTypeListener(Function1<? super ChargeGroupVo, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:34) call: o.qSZ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ qSZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qSZ(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qTc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qSZ.EZpvd(context);
            }
        });
        Application application = new Application(new Function1() { // from class: o.qTa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qSZ.AEQbTJ(this.EZpvd, (ChargeGroupVo) obj);
            }
        }, new Function1() { // from class: o.qTd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qSZ.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
        this.EZpvd = application;
        addView(KWHzl());
        KWHzl().setAdapter(application);
        if (isInEditMode()) {
            java.lang.String str = null;
            java.util.ArrayList arrayList = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            int i2 = 53;
            DefaultConstructorMarker defaultConstructorMarker = null;
            java.util.List<ChargeGroupVo> listGEmmrt = yDY.gEmmrt(new ChargeGroupVo(new ChargeGroupData(str, "USDT", arrayList, "USDT", str2, str3, i2, defaultConstructorMarker)), new ChargeGroupVo(new ChargeGroupData(str, "USDC", arrayList, "USDC", str2, str3, i2, defaultConstructorMarker)), ChargeGroupVo.Companion.KWHzl());
            setSubList(listGEmmrt, (ChargeGroupVo) CollectionsKt___CollectionsKt.AuCTelauCTel(listGEmmrt), true);
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qSZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C54989xbV AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            C54989xbV c54989xbV = new C54989xbV(context, null, 0, 6, null);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, C55298xhM.dp2px$default(24.0f, null, 1, null));
            marginLayoutParams.setMarginEnd(C55298xhM.OLrzqt(12, context));
            c54989xbV.setLayoutParams(marginLayoutParams);
            c54989xbV.setStyle(1);
            c54989xbV.setOKDSSize(-6);
            c54989xbV.setLongClickable(false);
            return c54989xbV;
        }

        public final RecyclerView KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            RecyclerView recyclerView = new RecyclerView(context);
            recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(context, 0, false));
            int iOLrzqt = C55298xhM.OLrzqt(4, context);
            recyclerView.setHorizontalFadingEdgeEnabled(true);
            recyclerView.setFadingEdgeLength(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
            recyclerView.setOverScrollMode(2);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), iOLrzqt, recyclerView.getPaddingRight(), iOLrzqt);
            recyclerView.setItemAnimator(null);
            return recyclerView;
        }
    }

    private final RecyclerView KWHzl() {
        return (RecyclerView) this.AEQbTJ.getValue();
    }

    public static final RecyclerView EZpvd(android.content.Context context) {
        return Companion.KWHzl(context);
    }

    public static final Unit AEQbTJ(qSZ qsz, ChargeGroupVo chargeGroupVo) {
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Function1<? super ChargeGroupVo, Unit> function1 = qsz.KWHzl;
        if (function1 != null) {
            function1.invoke(chargeGroupVo);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final qSZ qsz, final int i) {
        try {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(java.lang.Boolean.valueOf(qsz.KWHzl().post(new java.lang.Runnable() { // from class: o.qTf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    qSZ.OLrzqt(this.EZpvd, i);
                }
            })));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(qSZ qsz, int i) {
        qsz.KWHzl().smoothScrollToPosition(i);
    }

    public final void setSubList(java.util.List<ChargeGroupVo> list, ChargeGroupVo chargeGroupVo, boolean z) {
        java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> mapCopydefault = C40380qTs.KWHzl.copydefault();
        java.util.ArrayList arrayList = null;
        java.util.List<java.lang.String> list2 = mapCopydefault != null ? mapCopydefault.get("quoteSymbol") : null;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                ChargeGroupVo chargeGroupVo2 = (ChargeGroupVo) obj;
                if (!Intrinsics.EZpvd(chargeGroupVo2, ChargeGroupVo.Companion.KWHzl()) && (list2 == null || list2.contains(chargeGroupVo2.OLrzqt().getName()))) {
                    arrayList.add(obj);
                }
            }
        }
        C40375qTn.AEQbTJ.copydefault("NavSearchSpotUnitSwitchView", "setSubList, dataList: " + arrayList + ", selectedChargeGroup: " + chargeGroupVo + ", isShow: " + z);
        if (C33129mqd.KWHzl((java.util.Collection) arrayList) && z) {
            setVisibility(0);
            Application application = this.EZpvd;
            Intrinsics.copydefault(arrayList);
            application.OLrzqt(arrayList, chargeGroupVo);
            return;
        }
        setVisibility(8);
    }

    public static final class Application extends AbstractC40513qYq<ActionBar, C54989xbV> {
        public final Function1<java.lang.Integer, Unit> EZpvd;
        public java.util.List<ChargeGroupVo> KWHzl;
        public final Function1<ChargeGroupVo, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.market.quotation.ui.model.ChargeGroupVo, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull Function1<? super ChargeGroupVo, Unit> function1, @NotNull Function1<? super java.lang.Integer, Unit> function12) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            this.copydefault = function1;
            this.EZpvd = function12;
            this.KWHzl = yDY.AhwBna();
        }

        public static final class ActionBar implements InterfaceC40516qYt {
            public static final int AEQbTJ = ChargeGroupVo.EZpvd;
            public final boolean EZpvd;
            public final ChargeGroupVo copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, ChargeGroupVo chargeGroupVo, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    chargeGroupVo = actionBar.copydefault;
                }
                if ((i & 2) != 0) {
                    z = actionBar.EZpvd;
                }
                return actionBar.copydefault(chargeGroupVo, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ChargeGroupVo KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(@NotNull ChargeGroupVo chargeGroupVo, boolean z) {
                Intrinsics.checkNotNullParameter(chargeGroupVo, "");
                return new ActionBar(chargeGroupVo, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && this.EZpvd == actionBar.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SelectableChargeGroupVo(vo=" + this.copydefault + ", isSelected=" + this.EZpvd + ")";
            }

            public ActionBar(@NotNull ChargeGroupVo chargeGroupVo, boolean z) {
                Intrinsics.checkNotNullParameter(chargeGroupVo, "");
                this.copydefault = chargeGroupVo;
                this.EZpvd = z;
            }

            @Override // o.InterfaceC40516qYt
            public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
                Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
                return (interfaceC40516qYt instanceof ActionBar) && Intrinsics.EZpvd(this.copydefault, ((ActionBar) interfaceC40516qYt).copydefault);
            }

            @Override // o.InterfaceC40516qYt
            public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
                Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
                return Intrinsics.EZpvd(this, interfaceC40516qYt);
            }
        }

        public final void OLrzqt(@NotNull java.util.List<ChargeGroupVo> list, ChargeGroupVo chargeGroupVo) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
            final Ref.IntRef intRef = new Ref.IntRef();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                ChargeGroupVo chargeGroupVo2 = (ChargeGroupVo) obj;
                if (Intrinsics.EZpvd(chargeGroupVo, chargeGroupVo2)) {
                    intRef.element = i;
                }
                arrayList.add(new ActionBar(chargeGroupVo2, Intrinsics.EZpvd(chargeGroupVo, chargeGroupVo2)));
                i++;
            }
            submitList(arrayList, new java.lang.Runnable() { // from class: o.qTe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    qSZ.Application.AEQbTJ(this.copydefault, intRef);
                }
            });
        }

        public static final void AEQbTJ(Application application, Ref.IntRef intRef) {
            application.EZpvd.invoke(java.lang.Integer.valueOf(intRef.element));
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // o.AbstractC40513qYq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public C54989xbV copydefault(@NotNull android.content.Context context, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return qSZ.Companion.AEQbTJ(context);
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/qYt;)V */
        @Override // o.AbstractC40513qYq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void OLrzqt(@NotNull C54989xbV c54989xbV, int i, @NotNull final ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(c54989xbV, "");
            Intrinsics.checkNotNullParameter(actionBar, "");
            java.lang.String displayName = actionBar.KWHzl().OLrzqt().getDisplayName();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) displayName)) {
                displayName = null;
            }
            if (displayName == null) {
                displayName = actionBar.KWHzl().OLrzqt().getName();
            }
            c54989xbV.EZpvd().setIncludeFontPadding(false);
            c54989xbV.EZpvd().setText(C33061mpO.setupSpanStyles$default(displayName, new java.lang.String[]{"Ⓢ"}, 0, null, false, new Function1() { // from class: o.qTi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qSZ.Application.EZpvd((java.util.List) obj);
                }
            }, 14, null));
            c54989xbV.setSelected(actionBar.EZpvd());
            c54989xbV.setOnClickListener(new View.OnClickListener() { // from class: o.qTg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    qSZ.Application.copydefault(this.AEQbTJ, actionBar, view);
                }
            });
        }

        public static final Unit EZpvd(java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new C40351qSq());
            return Unit.INSTANCE;
        }

        public static final void copydefault(Application application, ActionBar actionBar, android.view.View view) {
            application.OLrzqt(application.KWHzl, actionBar.KWHzl());
            application.copydefault.invoke(actionBar.KWHzl());
        }
    }
}
