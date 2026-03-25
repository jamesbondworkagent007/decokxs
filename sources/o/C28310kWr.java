package o;

import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28310kWr implements InterfaceC28301kWi {
    public final C28307kWo KWHzl;
    public final C28311kWs OLrzqt;
    public final C28309kWq copydefault;

    /* JADX INFO: renamed from: o.kWr$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MemeChainType.values().length];
            try {
                iArr[MemeChainType.MemeChainTypeSol.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MemeChainType.MemeChainTypeEVM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MemeChainType.MemeChainTypeOther.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public C28310kWr(@NotNull C28307kWo c28307kWo, @NotNull C28311kWs c28311kWs, @NotNull C28309kWq c28309kWq) {
        Intrinsics.checkNotNullParameter(c28307kWo, "");
        Intrinsics.checkNotNullParameter(c28311kWs, "");
        Intrinsics.checkNotNullParameter(c28309kWq, "");
        this.KWHzl = c28307kWo;
        this.OLrzqt = c28311kWs;
        this.copydefault = c28309kWq;
    }

    public final InterfaceC28301kWi KWHzl(java.lang.String str) {
        int i = StateListAnimator.OLrzqt[MemeChainType.Companion.EZpvd(str).ordinal()];
        if (i == 1) {
            return this.OLrzqt;
        }
        if (i == 2) {
            return this.KWHzl;
        }
        if (i == 3) {
            return this.copydefault;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // o.InterfaceC28301kWi
    public java.util.List<PrioritySelectionBean> copydefault(@NotNull java.util.List<FeeOption> list, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(interfaceC30984llU.KWHzl().getMemeChainType()).copydefault(list, interfaceC30984llU, z, str);
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String AEQbTJ(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(interfaceC30984llU.KWHzl().getMemeChainType()).AEQbTJ(i, interfaceC30984llU, z, str);
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return KWHzl(interfaceC30984llU.KWHzl().getMemeChainType()).OLrzqt(i, interfaceC30984llU, z, str, str2, str3, str4);
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(interfaceC30984llU.KWHzl().getMemeChainType()).OLrzqt(i, interfaceC30984llU, z, str);
    }
}
