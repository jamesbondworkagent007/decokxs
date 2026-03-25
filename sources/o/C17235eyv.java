package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.drivers.bean.SupportCloudType;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eyv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17235eyv implements InterfaceC17234eyu {
    public final SupportCloudType AEQbTJ;
    public final boolean copydefault;

    /* JADX INFO: renamed from: o.eyv$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.HDWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[SupportCloudType.values().length];
            try {
                iArr2[SupportCloudType.GOOGLE_CLOUD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[SupportCloudType.HUAWEI_CLOUD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            AEQbTJ = iArr2;
        }
    }

    public C17235eyv(@NotNull SupportCloudType supportCloudType, boolean z) {
        Intrinsics.checkNotNullParameter(supportCloudType, "");
        this.AEQbTJ = supportCloudType;
        this.copydefault = z;
    }

    @Override // o.InterfaceC17234eyu
    public java.lang.String AEQbTJ(WalletType walletType) {
        if (walletType == null || TaskDescription.EZpvd[walletType.ordinal()] != 1) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ikIEnW);
        }
        if (this.copydefault) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.LocalActivityResultRegistryOwner);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ikIEnW);
    }

    @Override // o.InterfaceC17234eyu
    public java.lang.String EZpvd(WalletType walletType) {
        int i = walletType == null ? -1 : TaskDescription.EZpvd[walletType.ordinal()];
        if (i == 1) {
            if (this.copydefault) {
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.setContent);
            }
            int i2 = TaskDescription.AEQbTJ[this.AEQbTJ.ordinal()];
            if (i2 == 1) {
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeQueueItemAt);
            }
            if (i2 == 2) {
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendCommand);
            }
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.rewind);
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.registerCallbackListener);
        }
        if (i == 3) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.rateWithExtras);
        }
        if (i == 4) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.prepareFromUri);
        }
        if (i == 5) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeQueueItem);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.seekTo);
    }

    @Override // o.InterfaceC17234eyu
    public java.lang.String KWHzl(WalletType walletType) {
        if (walletType != null && TaskDescription.EZpvd[walletType.ordinal()] == 1) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.BackHandlerKtBackHandler2);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.zzJhsT);
    }

    @Override // o.InterfaceC17234eyu
    public java.lang.String copydefault(WalletType walletType) {
        if (walletType == null || TaskDescription.EZpvd[walletType.ordinal()] != 1) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.zzJhsT);
        }
        if (this.copydefault) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.BackHandlerKtBackHandler11);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.zzJhsT);
    }

    @Override // o.InterfaceC17234eyu
    public boolean OLrzqt(WalletType walletType) {
        return (walletType != null && TaskDescription.EZpvd[walletType.ordinal()] == 1 && this.copydefault) ? false : true;
    }
}
