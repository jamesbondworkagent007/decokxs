package o;

import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewStubProxy;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18055fbF extends android.widget.FrameLayout {
    public AbstractC17099ewR AEQbTJ;
    public final int KWHzl;
    public AbstractC16674eoQ OLrzqt;
    public AbstractC16677eoT copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18055fbF(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        int i = C13754dXa.TaskDescription.dkJJWw;
        this.KWHzl = i;
        this.AEQbTJ = (AbstractC17099ewR) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), i, this, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public final void copydefault() {
        if (this.AEQbTJ != null) {
            java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(this).iterator();
            while (it.hasNext()) {
                it.next().setVisibility(8);
            }
        }
    }

    public final void copydefault(@NotNull final Function0<Unit> function0) {
        ViewStubProxy viewStubProxy;
        android.view.View root;
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC17099ewR abstractC17099ewR = this.AEQbTJ;
        if (abstractC17099ewR != null) {
            if (!abstractC17099ewR.OLrzqt.isInflated()) {
                ViewStubProxy viewStubProxy2 = abstractC17099ewR.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(viewStubProxy2, "");
                this.OLrzqt = (AbstractC16674eoQ) C33131mqf.OLrzqt(viewStubProxy2);
            }
            copydefault();
            AbstractC16674eoQ abstractC16674eoQ = this.OLrzqt;
            if (abstractC16674eoQ != null) {
                AbstractC17099ewR abstractC17099ewR2 = this.AEQbTJ;
                if (abstractC17099ewR2 != null && (viewStubProxy = abstractC17099ewR2.OLrzqt) != null && (root = viewStubProxy.getRoot()) != null) {
                    root.setVisibility(0);
                }
                setVisibility(0);
                abstractC16674eoQ.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.fbD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C18055fbF.OLrzqt(function0, view);
                    }
                });
            }
        }
    }

    public static final void OLrzqt(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public final void EZpvd() {
        CDNSourceManager.LottieSource lottieSource;
        ViewStubProxy viewStubProxy;
        android.view.View root;
        LottieAnimationView lottieAnimationView;
        AbstractC17099ewR abstractC17099ewR = this.AEQbTJ;
        if (abstractC17099ewR != null) {
            if (!abstractC17099ewR.KWHzl.isInflated()) {
                ViewStubProxy viewStubProxy2 = abstractC17099ewR.KWHzl;
                Intrinsics.checkNotNullExpressionValue(viewStubProxy2, "");
                this.copydefault = (AbstractC16677eoT) C33131mqf.OLrzqt(viewStubProxy2);
            }
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (C55302xhQ.OLrzqt(context) > 2280) {
                lottieSource = CDNSourceManager.LottieSource.HomeKlineXLargeLoading;
            } else {
                lottieSource = CDNSourceManager.LottieSource.HomeKlineLoading;
            }
            AbstractC16677eoT abstractC16677eoT = this.copydefault;
            if (abstractC16677eoT != null && (lottieAnimationView = abstractC16677eoT.OLrzqt) != null) {
                C14677dpv.KWHzl(lottieAnimationView, lottieSource);
            }
            copydefault();
            AbstractC16677eoT abstractC16677eoT2 = this.copydefault;
            if (abstractC16677eoT2 != null) {
                AbstractC17099ewR abstractC17099ewR2 = this.AEQbTJ;
                if (abstractC17099ewR2 != null && (viewStubProxy = abstractC17099ewR2.KWHzl) != null && (root = viewStubProxy.getRoot()) != null) {
                    root.setVisibility(0);
                }
                setVisibility(0);
                abstractC16677eoT2.OLrzqt.setVisibility(0);
            }
        }
    }
}
