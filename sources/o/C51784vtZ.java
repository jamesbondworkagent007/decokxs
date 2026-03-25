package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.vtZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51784vtZ extends android.widget.LinearLayout {
    public final int AEQbTJ;
    public final C43316rmw EZpvd;
    public Function1<? super SignalCoinPairItemData, Unit> KWHzl;
    public Function0<Unit> OLrzqt;
    public final AbstractC50826vbV copydefault;
    public Function0<Unit> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51784vtZ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51784vtZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemoveCoinPairCallback(Function1<? super SignalCoinPairItemData, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectCoinPairCallback(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSelectedPairCallback(Function0<Unit> function0) {
        this.djBIcL = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.vtZ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51784vtZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51784vtZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new C43316rmw();
        this.AEQbTJ = 6;
        this.copydefault = (AbstractC50826vbV) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.DtnWsU, this, true);
        setOrientation(1);
        AEQbTJ();
        OLrzqt();
    }

    public final void AEQbTJ() {
        this.EZpvd.register(SignalCoinPairItemData.class, new vZR(new Function1() { // from class: o.vui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51784vtZ.EZpvd(this.KWHzl, (SignalCoinPairItemData) obj);
            }
        }, new Function0() { // from class: o.vuh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51784vtZ.KWHzl(this.AEQbTJ);
            }
        }));
        RecyclerView recyclerView = this.copydefault.copydefault;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new ActionBar());
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(new C57584ylF(2, C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null)));
        recyclerView.setAdapter(this.EZpvd);
    }

    public static final Unit EZpvd(C51784vtZ c51784vtZ, SignalCoinPairItemData signalCoinPairItemData) {
        Intrinsics.checkNotNullParameter(signalCoinPairItemData, "");
        Function1<? super SignalCoinPairItemData, Unit> function1 = c51784vtZ.KWHzl;
        if (function1 != null) {
            function1.invoke(signalCoinPairItemData);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51784vtZ c51784vtZ) {
        Function0<Unit> function0 = c51784vtZ.djBIcL;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vtZ$ActionBar */
    public static final class ActionBar extends GridLayoutManager.SpanSizeLookup {
        public ActionBar() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            return C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C51784vtZ.this.EZpvd.getItemCount()), 1) ? 1 : 2;
        }
    }

    public final void EZpvd(@NotNull java.util.List<? extends SignalCoinPairItemData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<?> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(list);
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(this.AEQbTJ))) {
            arrayList = arrayList.subList(0, this.AEQbTJ - 1);
            arrayList.add(new SignalCoinPairItemData(Marker.ANY_NON_NULL_MARKER + xMR.copydefault.copydefault(C33129mqd.subS$default(java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(this.AEQbTJ - 1), null, null, null, 14, null)), (java.lang.String) null, java.lang.Integer.valueOf(C55688xof.TaskDescription.OLrzqt), java.lang.Integer.valueOf(C55688xof.TaskDescription.KWHzl), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, true, false, false, 0, false, 7410, (DefaultConstructorMarker) null));
        }
        this.EZpvd.AhwBna(arrayList);
    }

    public final void OLrzqt() {
        android.widget.LinearLayout linearLayout = this.copydefault.OLrzqt;
        linearLayout.setOnClickListener(new Application(linearLayout, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vtZ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C51784vtZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51784vtZ c51784vtZ) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c51784vtZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0<Unit> function0EZpvd = this.copydefault.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
            }
        }
    }
}
