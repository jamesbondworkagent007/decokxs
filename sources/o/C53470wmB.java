package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import o.vSY;
import o.wYX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wmB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53470wmB extends ConstraintLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public C55887xsS AEQbTJ;
    public final AbstractC50869vcL EZpvd;
    public final java.util.List<java.lang.String> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53470wmB(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53470wmB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.AEQbTJ = c55887xsS;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:46) call: o.wmB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53470wmB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53470wmB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.dGrqPl, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC50869vcL) viewDataBindingInflate;
        this.KWHzl = new java.util.ArrayList();
        OLrzqt(attributeSet);
    }

    /* JADX INFO: renamed from: o.wmB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wmB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void OLrzqt(android.util.AttributeSet attributeSet) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int[] iArr = C48033uCm.LoaderManager.values;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.isConnected, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.wmG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53470wmB.EZpvd(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        });
        C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.fetchVPNInfo, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.wmF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53470wmB.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final Unit EZpvd(C53470wmB c53470wmB, int i) {
        c53470wmB.setTitle(C33070mpX.AYXKKw(i));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53470wmB c53470wmB, int i) {
        setDoubtOrCallback$default(c53470wmB, C33070mpX.AYXKKw(i), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd() {
        int i;
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault == null) {
            i = 8;
        } else {
            C55887xsS c55887xsS = this.AEQbTJ;
            if (c55887xsS == null) {
                Intrinsics.gEmmrt("");
                c55887xsS = null;
            }
            if (interfaceC55881xsMCopydefault.OLrzqt(c55887xsS.ejfBZ(), "contract_grid")) {
                i = 0;
            }
        }
        setVisibility(i);
        copydefault();
    }

    public final void copydefault() {
        java.util.List<java.lang.String> profitSharingRange;
        if (C55697xoo.OLrzqt.isConnected()) {
            InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
            BotUserConfigInfo botUserConfigInfoCopydefault = interfaceC55881xsMCopydefault != null ? interfaceC55881xsMCopydefault.copydefault() : null;
            if (botUserConfigInfoCopydefault == null || (profitSharingRange = botUserConfigInfoCopydefault.getProfitSharingRange()) == null || profitSharingRange.isEmpty()) {
                return;
            }
            this.KWHzl.clear();
            this.KWHzl.addAll(profitSharingRange);
            java.lang.String defaultProfitSharingRatio = botUserConfigInfoCopydefault.getDefaultProfitSharingRatio();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(profitSharingRange, 10));
            for (java.lang.String str : profitSharingRange) {
                arrayList.add(new wYO(pTB.formatICUPercent$default(C33129mqd.EZpvd(str), null, C38307pTy.Companion.AEQbTJ(2), null, java.lang.Double.valueOf(100.0d), null, 21, null), 36, C33129mqd.OLrzqt(str, defaultProfitSharingRatio), true));
            }
            wYX wyx = this.EZpvd.KWHzl;
            wyx.setColumnCount(C56548yJl.valueOf(profitSharingRange.size(), 4));
            wyx.setSelectionChipBeans(arrayList);
            wyx.setOnChipClickListener(new Activity());
            wyx.setOnChipSelectionChangeListener(new TaskDescription(wyx, this));
        }
    }

    /* JADX INFO: renamed from: o.wmB$Activity */
    public static final class Activity implements wYX.ActionBar {
        @Override // o.wYX.ActionBar
        public void OLrzqt(wYS wys) {
            Intrinsics.checkNotNullParameter(wys, "");
            wys.setSelected(!wys.isSelected());
        }
    }

    /* JADX INFO: renamed from: o.wmB$TaskDescription */
    public static final class TaskDescription implements wYX.TaskDescription {
        public final /* synthetic */ wYX OLrzqt;
        public final /* synthetic */ C53470wmB copydefault;

        public TaskDescription(wYX wyx, C53470wmB c53470wmB) {
            this.OLrzqt = wyx;
            this.copydefault = c53470wmB;
        }

        @Override // o.wYX.TaskDescription
        public void copydefault(wYS wys, wYO wyo, boolean z) {
            int i;
            Intrinsics.checkNotNullParameter(wys, "");
            Intrinsics.checkNotNullParameter(wyo, "");
            if (z) {
                java.util.Iterator<T> it = this.OLrzqt.EZpvd().iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    wYS wys2 = (wYS) it.next();
                    if (!Intrinsics.EZpvd(wys2, wys)) {
                        wys2.setSelected(false);
                    }
                }
                java.util.Iterator<wYO> it2 = this.OLrzqt.OLrzqt().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.EZpvd(it2.next().EZpvd(), wyo.EZpvd())) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0 || i >= this.copydefault.KWHzl.size()) {
                    return;
                }
                C56028xvA.OLrzqt("shareRatio", C56423yEv.EZpvd(C56390yDp.OLrzqt("ratio", (java.lang.String) this.copydefault.KWHzl.get(i))));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        boolean z;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (C55697xoo.OLrzqt.isConnected()) {
            vSY.TaskDescription taskDescription = vSY.Companion;
            if (SPUtils.getBoolean(taskDescription.AEQbTJ(), false)) {
                return;
            }
            SPUtils.put(taskDescription.AEQbTJ(), java.lang.Boolean.TRUE);
            InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
            if (interfaceC55881xsMCopydefault == null) {
                z = false;
            } else {
                C55887xsS c55887xsS = this.AEQbTJ;
                if (c55887xsS == null) {
                    Intrinsics.gEmmrt("");
                    c55887xsS = null;
                }
                if (interfaceC55881xsMCopydefault.OLrzqt(c55887xsS.ejfBZ(), "contract_dca")) {
                    z = true;
                }
            }
            if ((!z) || fragmentManager.isStateSaved()) {
                return;
            }
            java.util.List<java.lang.String> list = this.KWHzl;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str = (java.lang.String) obj;
                wYO wyo = (wYO) CollectionsKt___CollectionsKt.AkhnZx(this.EZpvd.KWHzl.OLrzqt(), i);
                arrayList.add(new vSX(str, wyo != null && wyo.OLrzqt(), i));
                i++;
            }
            C49662usl.EZpvd(vSY.Companion.copydefault(new java.util.ArrayList<>(arrayList), new Function1() { // from class: o.wmC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C53470wmB.djBIcL(this.KWHzl, ((java.lang.Integer) obj2).intValue());
                }
            }), fragmentManager, "KolLeadingSettingFragment");
        }
    }

    /* JADX INFO: renamed from: o.wmB$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C53470wmB KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53470wmB c53470wmB, java.lang.String str) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c53470wmB;
            this.AEQbTJ = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(this.AEQbTJ);
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.QWSkGZ, new PendingIntent(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wmB$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.invoke();
            }
        }
    }

    public static final Unit djBIcL(C53470wmB c53470wmB, int i) {
        c53470wmB.copydefault(i);
        return Unit.INSTANCE;
    }

    public final void copydefault(int i) {
        int i2 = 0;
        for (java.lang.Object obj : this.EZpvd.KWHzl.EZpvd()) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            ((wYS) obj).setSelected(i2 == i);
            i2++;
        }
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.AEQbTJ.setText(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.wmB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setDoubtOrCallback$default(C53470wmB c53470wmB, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        c53470wmB.setDoubtOrCallback(str, function0);
    }

    public final void setDoubtOrCallback(java.lang.String str, Function0<Unit> function0) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            C55258xgZ c55258xgZ = this.EZpvd.AEQbTJ;
            c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, this, str));
        } else if (function0 != null) {
            C55258xgZ c55258xgZ2 = this.EZpvd.AEQbTJ;
            c55258xgZ2.setOnClickListener(new Application(c55258xgZ2, 1000L, function0));
        } else {
            this.EZpvd.AEQbTJ.setHelperLabelType(2);
        }
    }

    /* JADX INFO: renamed from: o.wmB$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    public final java.lang.String OLrzqt() {
        java.util.Iterator<wYO> it = this.EZpvd.KWHzl.OLrzqt().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().OLrzqt()) {
                break;
            }
            i++;
        }
        return (i < 0 || i >= this.KWHzl.size()) ? "" : this.KWHzl.get(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wmB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setShareModes$default(C53470wmB c53470wmB, java.util.List list, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        c53470wmB.setShareModes(list, fragmentManager, function1);
    }

    public final void setShareModes(@NotNull java.util.List<TradeMenuItemBean> list, @NotNull androidx.fragment.app.FragmentManager fragmentManager, final Function1<? super TradeMenuItemBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        C50196vFl c50196vFl = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c50196vFl, "");
        c50196vFl.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        this.EZpvd.copydefault.setData(list, fragmentManager, new Function1() { // from class: o.wmD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53470wmB.OLrzqt(function1, (TradeMenuItemBean) obj);
            }
        });
    }

    public static final Unit OLrzqt(Function1 function1, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        if (function1 != null) {
            function1.invoke(tradeMenuItemBean);
        }
        return Unit.INSTANCE;
    }

    public final TradeMenuItemBean KWHzl() {
        return this.EZpvd.copydefault.OLrzqt();
    }

    public final void AEQbTJ(java.lang.String str) {
        if (str == null) {
            return;
        }
        java.util.Iterator<java.lang.String> it = this.KWHzl.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C33129mqd.OLrzqt(it.next(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            copydefault(i);
        }
    }
}
