package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.widget.TradingCalendarAppBar$showCalendarMenu$1$1$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.widget.TradingCalendarAppBar$showCalendarMenu$1$2$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.widget.TradingCalendarAppBar$updateData$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C33537myN;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41002qib extends C33537myN {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41002qib(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41002qib(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.qib.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41002qib(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41002qib(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setPaddingRelative(C55298xhM.dp2px$default(8.0f, null, 1, null), 0, C55298xhM.dp2px$default(8.0f, null, 1, null), 0);
        setBackClickable(true);
        setBackImageResource(C52761wXj.TaskDescription.fHqPtx);
        setDividerVisibility(8);
        setTitleClickable(true);
        setTitleMenuVisible(true);
        android.widget.TextView title = getTitle();
        ViewGroup.LayoutParams layoutParams = title.getLayoutParams();
        layoutParams.width = -2;
        title.setLayoutParams(layoutParams);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qib */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void init$default(C41002qib c41002qib, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function02 = null;
        }
        c41002qib.EZpvd((Function0<Unit>) function0, (Function0<Unit>) function02);
    }

    public final void EZpvd(@NotNull Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        setTitleMenu(C52761wXj.TaskDescription.OJuSTm);
        android.widget.ImageView backImage = getBackImage();
        backImage.setOnClickListener(new ActionBar(backImage, 200L, function0));
        android.widget.ImageView doImage = getDoImage();
        doImage.setOnClickListener(new Activity(doImage, 1000L, function02));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.qib */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateData$default(C41002qib c41002qib, java.util.List list, java.util.List list2, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        c41002qib.AEQbTJ(list, list2, fragmentManager, function0, function1);
    }

    public static final void OLrzqt(Function0 function0, C41002qib c41002qib, java.util.List list, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
        c41002qib.copydefault(list, fragmentManager, new TradingCalendarAppBar$updateData$2$1(function1));
    }

    public static final /* synthetic */ java.lang.Object OLrzqt(Function1 function1, C33537myN.ActionBar actionBar, Continuation continuation) {
        function1.invoke(actionBar);
        return Unit.INSTANCE;
    }

    public final void copydefault(java.util.List<C55276xgr> list, androidx.fragment.app.FragmentManager fragmentManager, final Function2<? super C33537myN.ActionBar, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        EZpvd(true);
        final C40932qhK c40932qhK = new C40932qhK();
        c40932qhK.OLrzqt(list, new Function1() { // from class: o.qic
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41002qib.AEQbTJ(c40932qhK, this, function2, (C55276xgr) obj);
            }
        }, new Function0() { // from class: o.qie
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41002qib.OLrzqt(c40932qhK, this);
            }
        });
        c40932qhK.show(fragmentManager);
    }

    public static final Unit AEQbTJ(C40932qhK c40932qhK, C41002qib c41002qib, Function2 function2, C55276xgr c55276xgr) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c40932qhK), null, null, new TradingCalendarAppBar$showCalendarMenu$1$1$1(c41002qib, function2, c55276xgr, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C40932qhK c40932qhK, C41002qib c41002qib) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c40932qhK), null, null, new TradingCalendarAppBar$showCalendarMenu$1$2$1(c41002qib, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z) {
        setTitleMenu(z ? C52761wXj.TaskDescription.OxVOHk : C52761wXj.TaskDescription.OJuSTm);
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends C33537myN.ActionBar> list, @NotNull final java.util.List<C55276xgr> list2, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, final Function0<Unit> function0, @NotNull final Function1<? super C33537myN.ActionBar, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        for (C33537myN.ActionBar actionBar : list) {
            if (actionBar.OLrzqt) {
                setTitle(actionBar.copydefault);
            }
        }
        setMenuItems(list);
        setTitleListener(new View.OnClickListener() { // from class: o.qif
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C41002qib.OLrzqt(function0, this, list2, fragmentManager, function1, view);
            }
        });
        getDoImage().setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl)));
        TextViewCompat.setCompoundDrawableTintList(getTitle(), android.content.res.ColorStateList.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl)));
    }

    /* JADX INFO: renamed from: o.qib$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.qib$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
