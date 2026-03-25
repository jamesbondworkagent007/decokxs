package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorSelectionParams;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC26764jiV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27529jws extends android.widget.FrameLayout {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27529jws(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27529jws(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.jws.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27529jws(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: o.jws$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jws.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27529jws(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jwt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27529jws.AEQbTJ(context, this);
            }
        });
    }

    private final C23839iLf AEQbTJ() {
        return (C23839iLf) this.EZpvd.getValue();
    }

    public static final C23839iLf AEQbTJ(android.content.Context context, C27529jws c27529jws) {
        return C23839iLf.copydefault(android.view.LayoutInflater.from(context), c27529jws, true);
    }

    public final void setMenu(@NotNull InterfaceC26764jiV interfaceC26764jiV, InterfaceC26677jgo interfaceC26677jgo) {
        Intrinsics.checkNotNullParameter(interfaceC26764jiV, "");
        C23839iLf c23839iLfAEQbTJ = AEQbTJ();
        LinearLayoutCompat linearLayoutCompat = c23839iLfAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        boolean z = interfaceC26764jiV instanceof InterfaceC26764jiV.Activity;
        linearLayoutCompat.setVisibility(z ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat2 = c23839iLfAEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        boolean z2 = interfaceC26764jiV instanceof InterfaceC26764jiV.StateListAnimator;
        linearLayoutCompat2.setVisibility(z2 ? 0 : 8);
        android.widget.FrameLayout root = c23839iLfAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        boolean z3 = interfaceC26764jiV instanceof InterfaceC26764jiV.Application;
        root.setVisibility(z3 ^ true ? 0 : 8);
        if (z) {
            OLrzqt(((InterfaceC26764jiV.Activity) interfaceC26764jiV).copydefault(), interfaceC26677jgo);
        } else if (z2) {
            EZpvd(((InterfaceC26764jiV.StateListAnimator) interfaceC26764jiV).EZpvd(), interfaceC26677jgo);
        } else if (!(interfaceC26764jiV instanceof InterfaceC26764jiV.TaskDescription) && !z3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void OLrzqt(TransactionMethod transactionMethod, InterfaceC26677jgo interfaceC26677jgo) {
        C23839iLf c23839iLfAEQbTJ = AEQbTJ();
        c23839iLfAEQbTJ.AEQbTJ.setTag(transactionMethod);
        KWHzl(transactionMethod);
        LinearLayoutCompat linearLayoutCompat = c23839iLfAEQbTJ.AEQbTJ;
        linearLayoutCompat.setOnClickListener(new StateListAnimator(linearLayoutCompat, 1000L, c23839iLfAEQbTJ, this, interfaceC26677jgo));
    }

    public final void EZpvd(TransactionMethod transactionMethod, InterfaceC26677jgo interfaceC26677jgo) {
        C23839iLf c23839iLfAEQbTJ = AEQbTJ();
        c23839iLfAEQbTJ.KWHzl.animate().rotationBy(transactionMethod == TransactionMethod.MULTI ? -180.0f : 180.0f).setDuration(300L).start();
        KWHzl(transactionMethod);
        c23839iLfAEQbTJ.AEQbTJ.setTag(transactionMethod);
        if (interfaceC26677jgo != null) {
            interfaceC26677jgo.copydefault(transactionMethod);
        }
    }

    private final void KWHzl(TransactionMethod transactionMethod) {
        AEQbTJ().djBIcL.setText(getContext().getString(transactionMethod == TransactionMethod.MULTI ? C25493ixk.FragmentManager.OmJATG : C25493ixk.FragmentManager.zzJhsT));
    }

    public final void EZpvd(ValidatorSelectionParams validatorSelectionParams, InterfaceC26677jgo interfaceC26677jgo) {
        C23839iLf c23839iLfAEQbTJ = AEQbTJ();
        c23839iLfAEQbTJ.copydefault.setImageResource(validatorSelectionParams.AEQbTJ() ? C52761wXj.TaskDescription.GGlJim : C52761wXj.TaskDescription.DRuYWY);
        c23839iLfAEQbTJ.AYXKKw.setText(validatorSelectionParams.OLrzqt());
        LinearLayoutCompat linearLayoutCompat = c23839iLfAEQbTJ.EZpvd;
        linearLayoutCompat.setOnClickListener(new Application(linearLayoutCompat, 1000L, interfaceC26677jgo, validatorSelectionParams));
    }

    /* JADX INFO: renamed from: o.jws$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ InterfaceC26677jgo OLrzqt;
        public final /* synthetic */ ValidatorSelectionParams copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, InterfaceC26677jgo interfaceC26677jgo, ValidatorSelectionParams validatorSelectionParams) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = interfaceC26677jgo;
            this.copydefault = validatorSelectionParams;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC26677jgo interfaceC26677jgo = this.OLrzqt;
                if (interfaceC26677jgo != null) {
                    interfaceC26677jgo.copydefault(this.copydefault);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jws$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C23839iLf AEQbTJ;
        public final /* synthetic */ C27529jws EZpvd;
        public final /* synthetic */ InterfaceC26677jgo KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C23839iLf c23839iLf, C27529jws c27529jws, InterfaceC26677jgo interfaceC26677jgo) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c23839iLf;
            this.EZpvd = c27529jws;
            this.KWHzl = interfaceC26677jgo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                java.lang.Object tag = this.AEQbTJ.AEQbTJ.getTag();
                TransactionMethod transactionMethod = TransactionMethod.MULTI;
                if (tag == transactionMethod) {
                    transactionMethod = TransactionMethod.SINGLE;
                }
                this.EZpvd.EZpvd(transactionMethod, this.KWHzl);
            }
        }
    }
}
