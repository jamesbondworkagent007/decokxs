package o;

import android.widget.RelativeLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35887oHj extends AbstractC57946yrx implements InterfaceC57927yre {
    public boolean EZpvd;
    public C31699mAq copydefault;

    /* JADX INFO: renamed from: o.oHj$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RefreshState.values().length];
            try {
                iArr[RefreshState.PullUpToLoad.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshState.ReleaseToLoad.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RefreshState.Refreshing.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[RefreshState.RefreshFinish.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentView(@NotNull C31699mAq c31699mAq) {
        Intrinsics.checkNotNullParameter(c31699mAq, "");
        this.copydefault = c31699mAq;
    }

    public final C31699mAq OLrzqt() {
        C31699mAq c31699mAq = this.copydefault;
        if (c31699mAq != null) {
            return c31699mAq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public C35887oHj(android.content.Context context) {
        this(context, null);
    }

    public C35887oHj(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public C35887oHj(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        copydefault(context);
    }

    private final void copydefault(android.content.Context context) {
        setCurrentView(new C31699mAq(context, null, 0, 6, null));
        OLrzqt().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        addView(OLrzqt());
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57908yrL
    public void OLrzqt(@NotNull InterfaceC57934yrl interfaceC57934yrl, @NotNull RefreshState refreshState, @NotNull RefreshState refreshState2) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        Intrinsics.checkNotNullParameter(refreshState, "");
        Intrinsics.checkNotNullParameter(refreshState2, "");
        super.OLrzqt(interfaceC57934yrl, refreshState, refreshState2);
        int i = StateListAnimator.OLrzqt[refreshState2.ordinal()];
        if (i == 1) {
            OLrzqt().valueOf();
            return;
        }
        if (i == 2) {
            OLrzqt().gEmmrt();
        } else if (i == 3) {
            OLrzqt().djBIcL();
        } else {
            if (i != 4) {
                return;
            }
            OLrzqt().AYXKKw();
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public int EZpvd(@NotNull InterfaceC57934yrl interfaceC57934yrl, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        OLrzqt().DbNXlk();
        return super.EZpvd(interfaceC57934yrl, z);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57927yre
    public boolean AEQbTJ(boolean z) {
        OLrzqt().DbNXlk();
        this.EZpvd = z;
        return true;
    }
}
