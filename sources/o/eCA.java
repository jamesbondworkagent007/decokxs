package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702ChainStatus;
import com.okinc.business.defi.wallet.eip7702.ui.model.EIP7702UIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eCA extends AbstractC43310rmq<EIP7702UIState.Activity, AbstractC16806eqq> {
    public final Function1<EIP7702UIState.Activity, Unit> KWHzl;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EIP7702ChainStatus.values().length];
            try {
                iArr[EIP7702ChainStatus.NeedUpgrade.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EIP7702ChainStatus.Upgrading.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[EIP7702ChainStatus.UpgradedOKX.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[EIP7702ChainStatus.UpgradedNonOKX.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[EIP7702ChainStatus.Revoking.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C13754dXa.TaskDescription.DFbvW;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.eip7702.ui.model.EIP7702UIState$Activity, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public eCA(@NotNull Function1<? super EIP7702UIState.Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16806eqq> c43312rms, @NotNull EIP7702UIState.Activity activity) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(activity, "");
        super.onBindViewHolder((C43312rms) c43312rms, activity);
        AbstractC16806eqq abstractC16806eqq = (AbstractC16806eqq) c43312rms.OLrzqt();
        AppCompatImageView appCompatImageView = abstractC16806eqq.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C57659ymb.loadFixSizeBorderImage$default(appCompatImageView, activity.EZpvd(), C52761wXj.TaskDescription.aHXSQp, 0.0f, 0.0f, 12, null);
        abstractC16806eqq.copydefault.setText(activity.copydefault());
        C52794wYp c52794wYp = abstractC16806eqq.OLrzqt;
        int i = StateListAnimator.AEQbTJ[EIP7702ChainStatus.Companion.copydefault(java.lang.Integer.valueOf(activity.AEQbTJ().getStatus())).ordinal()];
        if (i == 1) {
            c52794wYp.setOKDSType(257);
            c52794wYp.fIwbmz();
            c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaButtonReceiver));
        } else if (i == 2) {
            c52794wYp.setOKDSType(257);
            c52794wYp.OLrzqt(0L);
            c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMetadata));
        } else if (i == 3) {
            c52794wYp.setOKDSType(260);
            c52794wYp.fIwbmz();
            c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isActive));
        } else if (i == 4) {
            c52794wYp.setOKDSType(260);
            c52794wYp.fIwbmz();
            c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getController));
        } else if (i == 5) {
            c52794wYp.setOKDSType(260);
            c52794wYp.OLrzqt(0L);
            c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setActive));
        }
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this, activity));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ EIP7702UIState.Activity AEQbTJ;
        public final /* synthetic */ eCA EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, eCA eca, EIP7702UIState.Activity activity) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = eca;
            this.AEQbTJ = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.KWHzl.invoke(this.AEQbTJ);
            }
        }
    }
}
