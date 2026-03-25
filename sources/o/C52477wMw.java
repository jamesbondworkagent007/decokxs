package o;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wMw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52477wMw extends android.widget.LinearLayout {
    public java.lang.String AEQbTJ;
    public final C43316rmw OLrzqt;
    public uXS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52477wMw(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52477wMw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndexDesc(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.wMw.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52477wMw(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52477wMw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        uXS uxsOLrzqt = uXS.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(uxsOLrzqt, "");
        this.copydefault = uxsOLrzqt;
        this.OLrzqt = new C43316rmw();
        this.AEQbTJ = "";
        setOrientation(1);
        KWHzl();
    }

    public final void setData(@NotNull java.util.ArrayList<TacticsInsideItemData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C33064mpR.OLrzqt(this.OLrzqt, (java.util.List<? extends java.lang.Object>) arrayList);
    }

    public final void KWHzl() {
        OLrzqt();
        copydefault();
    }

    public final void copydefault() {
        this.OLrzqt.register(TacticsInsideItemData.class, new wMU());
        RecyclerView recyclerView = this.copydefault.copydefault;
        recyclerView.setAdapter(this.OLrzqt);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C57584ylF(2, C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null)));
        }
    }

    public final void OLrzqt() {
        C55320xhi c55320xhiKWHzl;
        uXS uxs = this.copydefault;
        C55312xha c55312xhaValueOf = uxs.AEQbTJ.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.getFieldNames));
        }
        C55258xgZ c55258xgZ = uxs.AEQbTJ;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
    }

    /* JADX INFO: renamed from: o.wMw$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.wMw$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C52477wMw AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52477wMw c52477wMw) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c52477wMw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.getFieldNames));
                viewOnClickListenerC54939xaY.EZpvd(this.AEQbTJ.AEQbTJ);
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new StateListAnimator(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
