package o;

import android.view.View;
import com.okinc.business.dex.utils.CDNSourceManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ieI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24459ieI extends android.widget.RelativeLayout {
    public final java.lang.Runnable djBIcL;
    public hGC valueOf;

    public static final void AhwBna(android.view.View view) {
    }

    public abstract android.view.View AEQbTJ();

    public android.view.View fetchVPNInfo() {
        return null;
    }

    public final android.widget.RelativeLayout DbNXlk() {
        hGC hgc = this.valueOf;
        if (hgc != null) {
            return hgc.copydefault;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC24459ieI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = new java.lang.Runnable() { // from class: o.ieN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC24459ieI.copydefault(this.AEQbTJ);
            }
        };
        KWHzl();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC24459ieI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC24459ieI(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private final void KWHzl() {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        C55113xdn c55113xdn3;
        hGC hgcAEQbTJ = hGC.AEQbTJ(android.view.LayoutInflater.from(getContext()), this);
        this.valueOf = hgcAEQbTJ;
        if (hgcAEQbTJ != null && (c55113xdn3 = hgcAEQbTJ.KWHzl) != null) {
            c55113xdn3.setAutoMirrored(true);
        }
        hGC hgc = this.valueOf;
        if (hgc != null && (c55113xdn2 = hgc.KWHzl) != null) {
            C22361hds.OLrzqt(c55113xdn2, CDNSourceManager.LottieSource.DEX_SWAP_LINE_LOADING);
        }
        hGC hgc2 = this.valueOf;
        if (hgc2 == null || (c55113xdn = hgc2.KWHzl) == null) {
            return;
        }
        c55113xdn.setOnClickListener(new View.OnClickListener() { // from class: o.ieL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC24459ieI.AhwBna(view);
            }
        });
    }

    public static final void copydefault(AbstractC24459ieI abstractC24459ieI) {
        android.view.View viewAEQbTJ = abstractC24459ieI.AEQbTJ();
        if (viewAEQbTJ != null) {
            viewAEQbTJ.setVisibility(4);
        }
        android.view.View viewFetchVPNInfo = abstractC24459ieI.fetchVPNInfo();
        if (viewFetchVPNInfo != null) {
            viewFetchVPNInfo.setVisibility(8);
        }
    }

    public static /* synthetic */ void startLoading$default(AbstractC24459ieI abstractC24459ieI, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoading");
        }
        if ((i & 1) != 0) {
            j = 500;
        }
        abstractC24459ieI.copydefault(j);
    }

    public void copydefault(long j) {
        C55113xdn c55113xdn;
        hGC hgc = this.valueOf;
        if (hgc != null && (c55113xdn = hgc.KWHzl) != null) {
            c55113xdn.KWHzl(j);
        }
        if (j > 0) {
            postDelayed(this.djBIcL, j);
        } else {
            this.djBIcL.run();
        }
    }

    public void gEmmrt() {
        C55113xdn c55113xdn;
        removeCallbacks(this.djBIcL);
        hGC hgc = this.valueOf;
        if (hgc != null && (c55113xdn = hgc.KWHzl) != null) {
            c55113xdn.copydefault();
        }
        android.view.View viewAEQbTJ = AEQbTJ();
        if (viewAEQbTJ != null) {
            viewAEQbTJ.setVisibility(0);
        }
        android.view.View viewFetchVPNInfo = fetchVPNInfo();
        if (viewFetchVPNInfo != null) {
            viewFetchVPNInfo.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.djBIcL);
    }

    public final android.view.View values() {
        hGC hgc = this.valueOf;
        if (hgc != null) {
            return hgc.KWHzl;
        }
        return null;
    }
}
