package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeModeCommonDexInfo;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.InterfaceC30983llT;

/* JADX INFO: renamed from: o.llW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30986llW implements InterfaceC30984llU {
    public final MemeModeCommonDexInfo KWHzl;
    public final DeFiPlatformForSwap copydefault;

    public C30986llW(MemeModeCommonDexInfo memeModeCommonDexInfo, DeFiPlatformForSwap deFiPlatformForSwap) {
        this.KWHzl = memeModeCommonDexInfo;
        this.copydefault = deFiPlatformForSwap;
    }

    /* JADX INFO: renamed from: o.llW$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC30983llT {
        public final DexMultiTokenInfoBean EZpvd;
        public final DexMultiTokenInfoBean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC30983llT
        public DexMultiTokenInfoBean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC30983llT
        public DexMultiTokenInfoBean copydefault() {
            return this.EZpvd;
        }

        public StateListAnimator(C30986llW c30986llW) {
            DexMultiTokenInfoBean toToken;
            DexMultiTokenInfoBean fromToken;
            MemeModeCommonDexInfo memeModeCommonDexInfo = c30986llW.KWHzl;
            this.EZpvd = (memeModeCommonDexInfo == null || (fromToken = memeModeCommonDexInfo.getFromToken()) == null) ? new DexMultiTokenInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : fromToken;
            MemeModeCommonDexInfo memeModeCommonDexInfo2 = c30986llW.KWHzl;
            this.OLrzqt = (memeModeCommonDexInfo2 == null || (toToken = memeModeCommonDexInfo2.getToToken()) == null) ? new DexMultiTokenInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : toToken;
        }

        @Override // o.InterfaceC30983llT
        public kotlin.Pair<java.lang.Boolean, DexMultiTokenInfoBean> AEQbTJ() {
            return InterfaceC30983llT.StateListAnimator.OLrzqt(this);
        }
    }

    @Override // o.InterfaceC30984llU
    public InterfaceC30983llT copydefault() {
        return new StateListAnimator(this);
    }

    /* JADX INFO: renamed from: o.llW$TaskDescription */
    public static final class TaskDescription implements InterfaceC30985llV {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AhwBna;
        public final boolean EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC30985llV
        public boolean getEnableJito() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC30985llV
        public java.lang.String isEnableMev() {
            return this.KWHzl;
        }

        public TaskDescription() {
            java.lang.String strIsEnableMev;
            MemeModeCommonDexInfo memeModeCommonDexInfo = C30986llW.this.KWHzl;
            java.lang.String fromTokenPrice = memeModeCommonDexInfo != null ? memeModeCommonDexInfo.getFromTokenPrice() : null;
            this.copydefault = fromTokenPrice == null ? "" : fromTokenPrice;
            MemeModeCommonDexInfo memeModeCommonDexInfo2 = C30986llW.this.KWHzl;
            java.lang.String fromTokenAmount = memeModeCommonDexInfo2 != null ? memeModeCommonDexInfo2.getFromTokenAmount() : null;
            this.AEQbTJ = fromTokenAmount == null ? "" : fromTokenAmount;
            MemeModeCommonDexInfo memeModeCommonDexInfo3 = C30986llW.this.KWHzl;
            this.EZpvd = memeModeCommonDexInfo3 != null ? memeModeCommonDexInfo3.getEnableJito() : false;
            DeFiPlatformForSwap deFiPlatformForSwap = C30986llW.this.copydefault;
            java.lang.String receiveAmount = deFiPlatformForSwap != null ? deFiPlatformForSwap.getReceiveAmount() : null;
            this.OLrzqt = receiveAmount == null ? "" : receiveAmount;
            DeFiPlatformForSwap deFiPlatformForSwap2 = C30986llW.this.copydefault;
            java.lang.String toTokenPrice = deFiPlatformForSwap2 != null ? deFiPlatformForSwap2.getToTokenPrice() : null;
            this.AhwBna = toTokenPrice != null ? toTokenPrice : "";
            MemeModeCommonDexInfo memeModeCommonDexInfo4 = C30986llW.this.KWHzl;
            this.KWHzl = (memeModeCommonDexInfo4 == null || (strIsEnableMev = memeModeCommonDexInfo4.isEnableMev()) == null) ? "0" : strIsEnableMev;
        }

        @Override // o.InterfaceC30985llV
        public boolean getSupportEip1559() {
            MemeModeCommonDexInfo memeModeCommonDexInfo = C30986llW.this.KWHzl;
            if (memeModeCommonDexInfo != null) {
                return memeModeCommonDexInfo.getSupportEip1559();
            }
            return false;
        }

        @Override // o.InterfaceC30985llV
        public java.lang.String getMemeChainType() {
            java.lang.String memeChainType;
            MemeModeCommonDexInfo memeModeCommonDexInfo = C30986llW.this.KWHzl;
            if (memeModeCommonDexInfo == null || (memeChainType = memeModeCommonDexInfo.getMemeChainType()) == null) {
                throw new java.lang.IllegalStateException("memeChainType is null");
            }
            return memeChainType;
        }
    }

    @Override // o.InterfaceC30984llU
    public InterfaceC30985llV KWHzl() {
        return new TaskDescription();
    }

    /* JADX INFO: renamed from: o.llW$Activity */
    public static final class Activity implements InterfaceC30979llP {
        public Activity() {
        }

        /* JADX INFO: renamed from: o.llW$Activity$Activity, reason: collision with other inner class name */
        public static final class C0871Activity implements InterfaceC30981llR {
            public final /* synthetic */ C30986llW OLrzqt;

            public C0871Activity(C30986llW c30986llW) {
                this.OLrzqt = c30986llW;
            }

            @Override // o.InterfaceC30981llR
            public java.util.List<MevInfoBean> EZpvd() {
                java.util.List<MevInfoBean> mevList;
                MemeModeCommonDexInfo memeModeCommonDexInfo = this.OLrzqt.KWHzl;
                return (memeModeCommonDexInfo == null || (mevList = memeModeCommonDexInfo.getMevList()) == null) ? new java.util.ArrayList() : mevList;
            }

            @Override // o.InterfaceC30981llR
            public NonMevPriorityFeeInfo KWHzl() {
                NonMevPriorityFeeInfo nonMevPriorityFeeInfo;
                MemeModeCommonDexInfo memeModeCommonDexInfo = this.OLrzqt.KWHzl;
                return (memeModeCommonDexInfo == null || (nonMevPriorityFeeInfo = memeModeCommonDexInfo.getNonMevPriorityFeeInfo()) == null) ? new NonMevPriorityFeeInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 262143, (DefaultConstructorMarker) null) : nonMevPriorityFeeInfo;
            }

            @Override // o.InterfaceC30981llR
            public java.lang.String copydefault() {
                MemeModeCommonDexInfo memeModeCommonDexInfo = this.OLrzqt.KWHzl;
                java.lang.String nativeTokenPrice = memeModeCommonDexInfo != null ? memeModeCommonDexInfo.getNativeTokenPrice() : null;
                return nativeTokenPrice == null ? "" : nativeTokenPrice;
            }

            @Override // o.InterfaceC30981llR
            public java.lang.String AEQbTJ() {
                DeFiPlatformForSwap deFiPlatformForSwap = this.OLrzqt.copydefault;
                java.lang.String estimateGasFee = deFiPlatformForSwap != null ? deFiPlatformForSwap.getEstimateGasFee() : null;
                return estimateGasFee == null ? "" : estimateGasFee;
            }
        }

        @Override // o.InterfaceC30979llP
        public InterfaceC30981llR OLrzqt() {
            return new C0871Activity(C30986llW.this);
        }
    }

    @Override // o.InterfaceC30984llU
    public InterfaceC30979llP EZpvd() {
        return new Activity();
    }
}
