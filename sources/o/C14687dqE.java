package o;

import com.okinc.business.defi.common.utils.Web3FunctionCheckUtil$dappFeatureIsHidden$1;
import com.okinc.business.defi.common.utils.Web3FunctionCheckUtil$dexFeatureIsHidden$1;
import com.okinc.business.defi.common.utils.Web3FunctionCheckUtil$investFeatureIsHidden$1;
import com.okinc.business.defi.common.utils.Web3FunctionCheckUtil$nftFeatureIsHidden$1;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* JADX INFO: renamed from: o.dqE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14687dqE {
    public static final C14687dqE OLrzqt = new C14687dqE();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.dqJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C14687dqE.gEmmrt();
        }
    });
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.dqH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C14687dqE.EZpvd();
        }
    });
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.dqG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C14687dqE.copydefault();
        }
    });
    public static final int EZpvd = 8;

    private C14687dqE() {
    }

    public static final java.util.List gEmmrt() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
    }

    public final java.util.List<InterfaceC9774bbt> AYXKKw() {
        return (java.util.List) copydefault.getValue();
    }

    public static final java.util.List EZpvd() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9774bbt.class));
    }

    public final java.util.List<InterfaceC9769bbo> valueOf() {
        return (java.util.List) AEQbTJ.getValue();
    }

    public static final java.util.List copydefault() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9769bbo.class));
    }

    public final boolean djBIcL() {
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new Web3FunctionCheckUtil$dexFeatureIsHidden$1(null), 1, null)).booleanValue();
    }

    public final boolean AkhnZx() {
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new Web3FunctionCheckUtil$nftFeatureIsHidden$1(null), 1, null)).booleanValue();
    }

    public final boolean isConnected() {
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new Web3FunctionCheckUtil$investFeatureIsHidden$1(null), 1, null)).booleanValue();
    }

    public final boolean AhwBna() {
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new Web3FunctionCheckUtil$dappFeatureIsHidden$1(null), 1, null)).booleanValue();
    }
}
