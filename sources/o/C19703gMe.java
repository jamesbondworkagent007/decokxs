package o;

import com.okinc.business.defi.tee.bean.CacheState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.gLQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gMe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19703gMe {
    public final gLS KWHzl;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.gMe$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gMe.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @yCM
    public C19703gMe(@NotNull gLS gls) {
        Intrinsics.checkNotNullParameter(gls, "");
        this.KWHzl = gls;
    }

    public final gLQ AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("CheckSmartAccountStateUseCase", "checkSmartAccountState(chainId=" + str + ", isChainSupported=" + z + ", isLimitOrder=" + z2 + ")");
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = this.KWHzl.AEQbTJ();
        if (interfaceC9738bbJAEQbTJ == null) {
            return null;
        }
        gLS gls = this.KWHzl;
        java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ.DbNXlk();
        java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str);
        if (fieldNames == null) {
            return null;
        }
        dTM dtmCopydefault = gls.copydefault(strDbNXlk, fieldNames.longValue());
        pUU.KWHzl("CheckSmartAccountStateUseCase", "walletTeeStatus: " + dtmCopydefault);
        pUU.KWHzl("CheckSmartAccountStateUseCase", "mainWallet.teeExpireTimeStamp: " + interfaceC9738bbJAEQbTJ.fIwbmz());
        CacheState cacheStateCopydefault = dtmCopydefault.copydefault();
        CacheState cacheState = CacheState.Ready;
        if (cacheStateCopydefault != cacheState) {
            pUU.copydefault("CheckSmartAccountStateUseCase", "Wallet TEE status not ready: " + dtmCopydefault.copydefault());
        }
        if (dtmCopydefault.EZpvd() && dtmCopydefault.copydefault() == cacheState) {
            return gLQ.Dialog.OLrzqt;
        }
        if (!z) {
            return gLQ.LoaderManager.AEQbTJ;
        }
        if (!dtmCopydefault.KWHzl() && dtmCopydefault.copydefault() == cacheState) {
            return new gLQ.Activity(z2, interfaceC9738bbJAEQbTJ.DbNXlk(), false, 4, null);
        }
        if (!interfaceC9738bbJAEQbTJ.zLjUOn() || !interfaceC9738bbJAEQbTJ.AubY() || interfaceC9738bbJAEQbTJ.djBIcL()) {
            return new gLQ.ActionBar(z2, interfaceC9738bbJAEQbTJ.DbNXlk());
        }
        if (!dtmCopydefault.OLrzqt() && dtmCopydefault.copydefault() == cacheState) {
            return new gLQ.AssistContent(z2, interfaceC9738bbJAEQbTJ.DbNXlk(), false, 4, null);
        }
        if (!interfaceC9738bbJAEQbTJ.DTwDnp() || interfaceC9738bbJAEQbTJ.QUSxYX() || interfaceC9738bbJAEQbTJ.AuCTel()) {
            return new gLQ.FragmentManager(z2, interfaceC9738bbJAEQbTJ.DbNXlk(), false, false, 12, null);
        }
        if (interfaceC9738bbJAEQbTJ.DTwDnp() && !this.KWHzl.KWHzl()) {
            return new gLQ.PendingIntent(interfaceC9738bbJAEQbTJ.DbNXlk());
        }
        if (interfaceC9738bbJAEQbTJ.DTwDnp()) {
            return AEQbTJ(interfaceC9738bbJAEQbTJ.fIwbmz(), z2, interfaceC9738bbJAEQbTJ.DbNXlk());
        }
        return null;
    }

    public final gLQ AEQbTJ(long j, boolean z, java.lang.String str) {
        if (this.KWHzl.OLrzqt()) {
            return gLQ.TaskDescription.copydefault;
        }
        long jCurrentTimeMillis = j - java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            return new gLQ.FragmentManager(z, str, false, false, 12, null);
        }
        long jCeil = (long) java.lang.Math.ceil(jCurrentTimeMillis / java.util.concurrent.TimeUnit.DAYS.toMillis(1L));
        if (jCeil <= 3) {
            return new gLQ.Application(C56548yJl.copydefault(jCeil, 1L), str);
        }
        return gLQ.TaskDescription.copydefault;
    }
}
