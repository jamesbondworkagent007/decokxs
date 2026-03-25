package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.business.invest_biz.ui.widget.risk.InvestRiskIconView$setClickListenerInternal$1$1;
import com.okinc.business.invest_biz.ui.widget.risk.InvestRiskRatingModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27439jvH extends android.widget.LinearLayout {
    public iMM OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27439jvH(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27439jvH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.jvH.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27439jvH(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27439jvH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(0);
        this.OLrzqt = iMM.EZpvd(android.view.LayoutInflater.from(context), this);
        setClickListenerInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LifecycleOwner KWHzl() {
        return ViewTreeLifecycleOwner.get(this);
    }

    public final void setRiskTag(java.lang.String str) {
        C55251xgS c55251xgS;
        C55251xgS c55251xgS2;
        android.widget.ImageView imageView;
        iMM imm = this.OLrzqt;
        if (imm != null && (imageView = imm.KWHzl) != null) {
            imageView.setVisibility((str == null || str.length() == 0) ? 0 : 8);
        }
        if (str != null) {
            iMM imm2 = this.OLrzqt;
            if (imm2 != null && (c55251xgS2 = imm2.copydefault) != null) {
                c55251xgS2.setVisibility(0);
            }
            iMM imm3 = this.OLrzqt;
            if (imm3 == null || (c55251xgS = imm3.copydefault) == null) {
                return;
            }
            c55251xgS.setText(str);
        }
    }

    public final void setRiskIconSize(int i, int i2) {
        android.widget.ImageView imageView;
        ViewGroup.LayoutParams layoutParams;
        iMM imm = this.OLrzqt;
        if (imm == null || (imageView = imm.KWHzl) == null || (layoutParams = imageView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
    }

    public final void setClickListenerInternal() {
        android.view.View root;
        iMM imm = this.OLrzqt;
        if (imm == null || (root = imm.getRoot()) == null) {
            return;
        }
        root.setOnClickListener(new ActionBar(root, 1000L, this));
    }

    public final void AEQbTJ(java.util.ArrayList<InvestRiskRatingModel> arrayList) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        FragmentActivity fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        if (fragmentActivity != null) {
            C27442jvK.Companion.copydefault(arrayList).show(fragmentActivity.getSupportFragmentManager(), (java.lang.String) null);
        }
    }

    /* JADX INFO: renamed from: o.jvH$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C27439jvH KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C27439jvH c27439jvH) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c27439jvH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            LifecycleCoroutineScope lifecycleScope;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                LifecycleOwner lifecycleOwnerKWHzl = this.KWHzl.KWHzl();
                if (lifecycleOwnerKWHzl == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerKWHzl)) == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getIO(), null, new InvestRiskIconView$setClickListenerInternal$1$1(this.KWHzl, null), 2, null);
            }
        }
    }
}
