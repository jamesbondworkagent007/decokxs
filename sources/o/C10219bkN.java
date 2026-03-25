package o;

import com.okinc.business.defi.biz.constant.WalletType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC9742bbN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bkN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10219bkN {
    public final java.lang.String AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final AbstractC12782ctV OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final int valueOf;

    /* JADX INFO: renamed from: o.bkN$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.ConnectWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.valueOf;
    }

    public C10219bkN(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = abstractC12782ctV;
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.bkS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10219bkN.EZpvd(this.KWHzl);
            }
        });
        this.valueOf = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "nft") ? C13754dXa.FragmentManager.DcMfJKDSqxTE : C13754dXa.FragmentManager.OmJATG;
        this.EZpvd = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "nft") ? C13754dXa.FragmentManager.HJWChP : C13754dXa.FragmentManager.GzAsTt;
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.bkT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10219bkN.AYXKKw(this.OLrzqt);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.bkQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10219bkN.copydefault(this.copydefault);
            }
        });
    }

    public final java.lang.CharSequence gEmmrt() {
        return C14733dqy.copydefault.KWHzl(this.OLrzqt);
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String EZpvd(C10219bkN c10219bkN) {
        int i = StateListAnimator.KWHzl[c10219bkN.OLrzqt.QwvEab().ordinal()];
        if (i == 1) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.RFmUsE);
        }
        if (i != 2) {
            return null;
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPRGtXKCRGtXKC);
    }

    public final java.lang.String copydefault() {
        return (java.lang.String) this.AhwBna.getValue();
    }

    public static final java.lang.String AYXKKw(C10219bkN c10219bkN) {
        java.lang.String displayAmount$default;
        java.lang.String strCopydefault;
        java.lang.String str = c10219bkN.AEQbTJ;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "nft")) {
            C10528bqE c10528bqE = (C10528bqE) c10219bkN.OLrzqt.gEmmrt(c10219bkN.KWHzl);
            return C54862xYb.OLrzqt(c10528bqE != null ? C33129mqd.AYXKKw(java.lang.Integer.valueOf(c10528bqE.AkhnZx())) : null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "defi")) {
            C10527bqD c10527bqD = (C10527bqD) c10219bkN.OLrzqt.gEmmrt(c10219bkN.KWHzl);
            if (c10527bqD != null && (strCopydefault = c10527bqD.copydefault()) != null) {
                return strCopydefault;
            }
        } else {
            C10525bqB c10525bqB = (C10525bqB) c10219bkN.OLrzqt.gEmmrt(c10219bkN.KWHzl);
            if (c10525bqB != null && (displayAmount$default = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, true, false, 2, null)) != null) {
                return displayAmount$default;
            }
        }
        return "";
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String copydefault(C10219bkN c10219bkN) {
        AbstractC12782ctV abstractC12782ctV = c10219bkN.OLrzqt;
        AbstractC10406bnp abstractC10406bnpGEmmrt = abstractC12782ctV.gEmmrt(c10219bkN.KWHzl);
        return abstractC12782ctV.EZpvd(abstractC10406bnpGEmmrt != null ? abstractC10406bnpGEmmrt.gEmmrt() : -1L);
    }
}
