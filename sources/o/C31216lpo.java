package o;

import android.view.View;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31216lpo extends android.widget.FrameLayout {
    public StateListAnimator copydefault;

    /* JADX INFO: renamed from: o.lpo$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31216lpo(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKDex_dex_impl(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:16) call: o.lpo.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C31216lpo(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31216lpo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View.inflate(context, C23274hvD.Activity.RidNCX, this);
    }

    public final void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(C23274hvD.Application.isGmsPickerAvailableactivity_release);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(C23274hvD.Application.ActivityResultContractsOpenDocument);
        android.view.View viewFindViewById = findViewById(C23274hvD.Application.RatingCompatStyle);
        android.view.View viewFindViewById2 = findViewById(C23274hvD.Application.getDefaultImpl);
        C31222lpu c31222lpu = (C31222lpu) findViewById(C23274hvD.Application.DAIeex);
        Intrinsics.copydefault(viewFindViewById);
        viewFindViewById.setVisibility(dexMultiTokenInfoBean.isMainChainCoin() ^ true ? 0 : 8);
        c31222lpu.AEQbTJ(dexMultiTokenInfoBean.getTokenLogoUrl(), dexMultiTokenInfoBean.getChainLogoUrl());
        textView.setText(dexMultiTokenInfoBean.getTokenSymbol());
        textView2.setText(C25352ivB.OLrzqt(dexMultiTokenInfoBean.getTokenContractAddress()));
        setOnClickListener(new ActionBar(this, 1000L, this));
        Intrinsics.copydefault(viewFindViewById2);
        viewFindViewById2.setVisibility(dexMultiTokenInfoBean.isHighRisk() ^ true ? 4 : 0);
        viewFindViewById2.setOnClickListener(new TaskDescription(viewFindViewById2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.lpo$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C31216lpo EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C31216lpo c31216lpo) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c31216lpo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                StateListAnimator stateListAnimatorKWHzl = this.EZpvd.KWHzl();
                if (stateListAnimatorKWHzl != null) {
                    stateListAnimatorKWHzl.AEQbTJ();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.lpo$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C31216lpo AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C31216lpo c31216lpo) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c31216lpo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.copydefault(C23274hvD.Fragment.initializeReflectiveFields);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
