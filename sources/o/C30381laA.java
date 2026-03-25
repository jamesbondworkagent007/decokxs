package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22366hdx;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.laA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30381laA extends LinearLayoutCompat {
    public final C22322hdF EZpvd;
    public ActionBar copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30381laA(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:20) call: o.laA.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30381laA(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30381laA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = ActionBar.Application.KWHzl;
        C22322hdF c22322hdFCopydefault = C22322hdF.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c22322hdFCopydefault, "");
        this.EZpvd = c22322hdFCopydefault;
        setOrientation(0);
        setPaddingRelative(C55298xhM.OLrzqt(12, context), C55298xhM.OLrzqt(8, context), C55298xhM.OLrzqt(12, context), C55298xhM.OLrzqt(8, context));
    }

    public final void EZpvd(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.copydefault = actionBar;
        if (Intrinsics.EZpvd(actionBar, ActionBar.Activity.OLrzqt)) {
            AppCompatImageView appCompatImageView = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(8);
            AppCompatTextView appCompatTextView = this.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            AppCompatImageView appCompatImageView2 = this.EZpvd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(8);
            this.EZpvd.copydefault.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.KWHzl));
            AppCompatTextView appCompatTextView2 = this.EZpvd.copydefault;
            int i = C52761wXj.Activity.fdOvFl;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatTextView2.setTextColor(C25382ivf.copydefault(i, context));
            setContentDescription("web3_dex_token_list_all_network_button");
            return;
        }
        if (actionBar instanceof ActionBar.StateListAnimator) {
            AppCompatImageView appCompatImageView3 = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            appCompatImageView3.setVisibility(8);
            AppCompatTextView appCompatTextView3 = this.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            appCompatTextView3.setVisibility(0);
            AppCompatImageView appCompatImageView4 = this.EZpvd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
            appCompatImageView4.setVisibility(8);
            ActionBar.StateListAnimator stateListAnimator = (ActionBar.StateListAnimator) actionBar;
            this.EZpvd.copydefault.setText(stateListAnimator.OLrzqt().getChainName());
            AppCompatImageView appCompatImageView5 = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView5, "");
            C57659ymb.EZpvd(appCompatImageView5, stateListAnimator.OLrzqt().getLogoUrl(), C57406yhn.Activity.QKVWgx);
            AppCompatTextView appCompatTextView4 = this.EZpvd.copydefault;
            int i2 = C52761wXj.Activity.fdOvFl;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            appCompatTextView4.setTextColor(C25382ivf.copydefault(i2, context2));
            java.lang.String lowerCase = stateListAnimator.OLrzqt().getChainName().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            setContentDescription("web3_dex_token_list_network_" + lowerCase + "_button");
            return;
        }
        if (!Intrinsics.EZpvd(actionBar, ActionBar.Application.KWHzl)) {
            throw new NoWhenBranchMatchedException();
        }
        AppCompatImageView appCompatImageView6 = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView6, "");
        appCompatImageView6.setVisibility(8);
        AppCompatTextView appCompatTextView5 = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "");
        appCompatTextView5.setVisibility(8);
        AppCompatImageView appCompatImageView7 = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView7, "");
        appCompatImageView7.setVisibility(0);
        setContentDescription("web3_dex_token_list_favorites_button");
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            setBackgroundResource(C22366hdx.Application.AEQbTJ);
            AppCompatTextView appCompatTextView = this.EZpvd.copydefault;
            int i = C52761wXj.Activity.htlTjW;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatTextView.setTextColor(C25382ivf.copydefault(i, context));
            AppCompatTextView appCompatTextView2 = this.EZpvd.copydefault;
            int i2 = C52761wXj.Activity.htlTjW;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            TextViewCompat.setCompoundDrawableTintList(appCompatTextView2, android.content.res.ColorStateList.valueOf(C25382ivf.copydefault(i2, context2)));
            AppCompatImageView appCompatImageView = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(this.copydefault instanceof ActionBar.StateListAnimator ? 0 : 8);
            return;
        }
        setBackgroundResource(C22366hdx.Application.OLrzqt);
        AppCompatTextView appCompatTextView3 = this.EZpvd.copydefault;
        int i3 = C52761wXj.Activity.fdOvFl;
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        appCompatTextView3.setTextColor(C25382ivf.copydefault(i3, context3));
        AppCompatTextView appCompatTextView4 = this.EZpvd.copydefault;
        int i4 = C52761wXj.Activity.fdOvFl;
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TextViewCompat.setCompoundDrawableTintList(appCompatTextView4, android.content.res.ColorStateList.valueOf(C25382ivf.copydefault(i4, context4)));
        AppCompatImageView appCompatImageView2 = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        appCompatImageView2.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.laA$ActionBar */
    public interface ActionBar {

        /* JADX INFO: renamed from: o.laA$ActionBar$Application */
        public static final class Application implements ActionBar {
            public static final Application KWHzl = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1341226935;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Collection";
            }

            private Application() {
            }
        }

        /* JADX INFO: renamed from: o.laA$ActionBar$Activity */
        public static final class Activity implements ActionBar {
            public static final Activity OLrzqt = new Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1715061416;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "All";
            }

            private Activity() {
            }
        }

        /* JADX INFO: renamed from: o.laA$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements ActionBar {
            public static final int AEQbTJ = DefiChainInfo.$stable;
            public final DefiChainInfo OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, DefiChainInfo defiChainInfo, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    defiChainInfo = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.KWHzl(defiChainInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull DefiChainInfo defiChainInfo) {
                Intrinsics.checkNotNullParameter(defiChainInfo, "");
                return new StateListAnimator(defiChainInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DefiChainInfo OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Chain(defiChainInfo=" + this.OLrzqt + ")";
            }

            public StateListAnimator(@NotNull DefiChainInfo defiChainInfo) {
                Intrinsics.checkNotNullParameter(defiChainInfo, "");
                this.OLrzqt = defiChainInfo;
            }
        }
    }
}
