package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.home.bean.QuickCopyAddressItemBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eBA extends ConstraintLayout {
    public C16910eso AEQbTJ;

    public interface StateListAnimator {
        void KWHzl(@NotNull QuickCopyAddressItemBean quickCopyAddressItemBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eBA(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eBA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.eBA.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ eBA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eBA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C16910eso c16910esoEZpvd = C16910eso.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c16910esoEZpvd, "");
        this.AEQbTJ = c16910esoEZpvd;
    }

    public final void KWHzl(@NotNull QuickCopyAddressItemBean quickCopyAddressItemBean, StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(quickCopyAddressItemBean, "");
        this.AEQbTJ.OLrzqt.setText(quickCopyAddressItemBean.getChainName());
        this.AEQbTJ.AEQbTJ.setText(quickCopyAddressItemBean.getAddress());
        if (quickCopyAddressItemBean.getAddressTypeContent().length() > 0) {
            this.AEQbTJ.EZpvd.setVisibility(0);
            this.AEQbTJ.EZpvd.setText(quickCopyAddressItemBean.getAddressTypeContent());
        }
        if (quickCopyAddressItemBean.getNeedGenerateAddress()) {
            C55251xgS c55251xgS = this.AEQbTJ.EZpvd;
            java.lang.String addressTypeContent = quickCopyAddressItemBean.getAddressTypeContent();
            if (addressTypeContent.length() == 0) {
                addressTypeContent = "other address";
            }
            c55251xgS.setText(addressTypeContent);
            this.AEQbTJ.EZpvd.setVisibility(0);
        } else {
            this.AEQbTJ.EZpvd.setText(quickCopyAddressItemBean.getAddressTypeContent());
            this.AEQbTJ.EZpvd.setVisibility(quickCopyAddressItemBean.getAddressTypeContent().length() == 0 ? 8 : 0);
        }
        if (quickCopyAddressItemBean.getAddress().length() == 0) {
            this.AEQbTJ.AEQbTJ.setVisibility(8);
            this.AEQbTJ.KWHzl.setVisibility(8);
            this.AEQbTJ.copydefault.setVisibility(0);
            if (quickCopyAddressItemBean.getNeedGenerateAddress()) {
                this.AEQbTJ.copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getClipDataUrisactivity_release));
            } else {
                this.AEQbTJ.copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsRequestPermission));
            }
        } else {
            this.AEQbTJ.AEQbTJ.setVisibility(0);
            this.AEQbTJ.KWHzl.setVisibility(0);
            this.AEQbTJ.copydefault.setVisibility(8);
        }
        if (stateListAnimator != null) {
            android.view.View root = this.AEQbTJ.getRoot();
            root.setOnClickListener(new Activity(root, 1000L, stateListAnimator, quickCopyAddressItemBean));
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ StateListAnimator AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ QuickCopyAddressItemBean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, StateListAnimator stateListAnimator, QuickCopyAddressItemBean quickCopyAddressItemBean) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = stateListAnimator;
            this.OLrzqt = quickCopyAddressItemBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl(this.OLrzqt);
            }
        }
    }
}
