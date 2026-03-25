package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SimpleModeParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC22824hme;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25293itw {
    public final SimpleModeParam EZpvd = new SimpleModeParam(-1, null, null);
    public final java.util.Set<java.lang.Integer> AEQbTJ = yEE.AhwBna(0, 1, 3, 4, 2);

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.itw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateSimpleModeParam$default(C25293itw c25293itw, C22901hoB c22901hoB, C22830hmk c22830hmk, C22873hna c22873hna, int i, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            function0 = null;
        }
        c25293itw.EZpvd(c22901hoB, c22830hmk, c22873hna, i, function0);
    }

    public final void EZpvd(C22901hoB c22901hoB, @NotNull C22830hmk c22830hmk, @NotNull C22873hna c22873hna, int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(c22830hmk, "");
        Intrinsics.checkNotNullParameter(c22873hna, "");
        if (i == 0) {
            OLrzqt(c22901hoB, c22830hmk, c22873hna, function0);
        } else if (i == 1) {
            KWHzl(c22901hoB, c22830hmk, c22873hna, function0);
        } else {
            if (i != 2) {
                return;
            }
            EZpvd(c22901hoB, c22830hmk, function0);
        }
    }

    public final void EZpvd(C22901hoB c22901hoB, C22830hmk c22830hmk, Function0<Unit> function0) {
        if (this.EZpvd.getTransactionType() != -1) {
            if (this.AEQbTJ.contains(java.lang.Integer.valueOf(this.EZpvd.getTransactionType()))) {
                AEQbTJ(c22901hoB, c22830hmk, 2, this.EZpvd.getFromToken(), this.EZpvd.getToToken());
            }
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(C22901hoB c22901hoB, C22830hmk c22830hmk, C22873hna c22873hna, Function0<Unit> function0) {
        java.lang.String chainId;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanKWHzl;
        if (this.EZpvd.getTransactionType() != -1) {
            if (this.EZpvd.getTransactionType() == 0) {
                AEQbTJ(c22901hoB, c22830hmk, 1, this.EZpvd.getToToken(), this.EZpvd.getFromToken());
            } else if (this.EZpvd.getTransactionType() == 2 || this.EZpvd.getTransactionType() == 3) {
                DexMultiTokenInfoBean fromToken = this.EZpvd.getFromToken();
                java.lang.String uniqueId = fromToken != null ? fromToken.getUniqueId() : null;
                DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = c22873hna.copydefault();
                if (Intrinsics.EZpvd((java.lang.Object) uniqueId, (java.lang.Object) (dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getUniqueId() : null))) {
                    DexMultiTokenInfoBean toToken = this.EZpvd.getToToken();
                    java.lang.String uniqueId2 = toToken != null ? toToken.getUniqueId() : null;
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = c22873hna.valueOf();
                    if (Intrinsics.EZpvd((java.lang.Object) uniqueId2, (java.lang.Object) (dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getUniqueId() : null))) {
                        AEQbTJ(c22901hoB, c22830hmk, 1, this.EZpvd.getFromToken(), this.EZpvd.getToToken());
                    }
                } else {
                    DexMultiTokenInfoBean fromToken2 = this.EZpvd.getFromToken();
                    if (c22873hna.EZpvd(this.EZpvd.getToToken())) {
                        dexMultiTokenInfoBeanKWHzl = this.EZpvd.getToToken();
                    } else {
                        DexMultiTokenInfoBean fromToken3 = this.EZpvd.getFromToken();
                        if (fromToken3 == null || (chainId = fromToken3.getChainId()) == null) {
                            chainId = "";
                        }
                        dexMultiTokenInfoBeanKWHzl = c22873hna.KWHzl(chainId, fromToken2, null);
                    }
                    AEQbTJ(c22901hoB, c22830hmk, 1, fromToken2, dexMultiTokenInfoBeanKWHzl);
                }
            }
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(C22901hoB c22901hoB, C22830hmk c22830hmk, C22873hna c22873hna, Function0<Unit> function0) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanKWHzl;
        java.lang.String chainId;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanKWHzl2;
        java.lang.String chainId2;
        if (this.EZpvd.getTransactionType() != -1) {
            if (this.EZpvd.getTransactionType() == 1) {
                AEQbTJ(c22901hoB, c22830hmk, 0, this.EZpvd.getToToken(), this.EZpvd.getFromToken());
            } else if (this.EZpvd.getTransactionType() == 2 || this.EZpvd.getTransactionType() == 3) {
                DexMultiTokenInfoBean fromToken = this.EZpvd.getFromToken();
                java.lang.String uniqueId = fromToken != null ? fromToken.getUniqueId() : null;
                DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = c22873hna.copydefault();
                boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) uniqueId, (java.lang.Object) (dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getUniqueId() : null));
                java.lang.String str = "";
                if (zEZpvd) {
                    DexMultiTokenInfoBean toToken = this.EZpvd.getToToken();
                    java.lang.String uniqueId2 = toToken != null ? toToken.getUniqueId() : null;
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = c22873hna.valueOf();
                    if (Intrinsics.EZpvd((java.lang.Object) uniqueId2, (java.lang.Object) (dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getUniqueId() : null))) {
                        if (c22873hna.EZpvd(this.EZpvd.getFromToken())) {
                            dexMultiTokenInfoBeanKWHzl2 = this.EZpvd.getFromToken();
                        } else {
                            DexMultiTokenInfoBean fromToken2 = this.EZpvd.getFromToken();
                            if (fromToken2 != null && (chainId2 = fromToken2.getChainId()) != null) {
                                str = chainId2;
                            }
                            dexMultiTokenInfoBeanKWHzl2 = c22873hna.KWHzl(str, this.EZpvd.getToToken(), null);
                        }
                        AEQbTJ(c22901hoB, c22830hmk, 0, dexMultiTokenInfoBeanKWHzl2, this.EZpvd.getToToken());
                    }
                } else {
                    if (c22873hna.EZpvd(this.EZpvd.getFromToken())) {
                        dexMultiTokenInfoBeanKWHzl = this.EZpvd.getFromToken();
                    } else {
                        DexMultiTokenInfoBean fromToken3 = this.EZpvd.getFromToken();
                        if (fromToken3 != null && (chainId = fromToken3.getChainId()) != null) {
                            str = chainId;
                        }
                        dexMultiTokenInfoBeanKWHzl = c22873hna.KWHzl(str, this.EZpvd.getToToken(), null);
                    }
                    AEQbTJ(c22901hoB, c22830hmk, 0, dexMultiTokenInfoBeanKWHzl, this.EZpvd.getToToken());
                }
            }
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void EZpvd(int i, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        SimpleModeParam simpleModeParam = this.EZpvd;
        simpleModeParam.setTransactionType(i);
        simpleModeParam.setFromToken(dexMultiTokenInfoBean);
        simpleModeParam.setToToken(dexMultiTokenInfoBean2);
    }

    public final void AEQbTJ(C22901hoB c22901hoB, C22830hmk c22830hmk, int i, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        if (c22901hoB != null) {
            c22901hoB.OLrzqt(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
        }
        EZpvd(i, dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
        InterfaceC22824hme.ActionBar.setCurrentFromCoin$default(c22830hmk, dexMultiTokenInfoBean, false, 2, null);
        InterfaceC22824hme.ActionBar.setCurrentToCoin$default(c22830hmk, dexMultiTokenInfoBean2, false, 2, null);
    }

    public final boolean KWHzl(int i) {
        return ((this.EZpvd.getTransactionType() == i || this.EZpvd.getTransactionType() == -1) && (this.EZpvd.getTransactionType() != -1 || this.EZpvd.getFromToken() == null || this.EZpvd.getToToken() == null)) ? false : true;
    }

    public final void KWHzl() {
        this.EZpvd.setTransactionType(-1);
    }
}
