package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pMq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38111pMq implements InterfaceC38110pMp {
    public final Function0<java.lang.Boolean> EZpvd;
    public final OKComplianceRestrictionService OLrzqt;

    /* JADX INFO: renamed from: o.pMq$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DeeplinkMode.values().length];
            try {
                iArr[DeeplinkMode.PRO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DeeplinkMode.LITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DeeplinkMode.WALLET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[DeeplinkMode.PAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public C38111pMq(@NotNull OKComplianceRestrictionService oKComplianceRestrictionService, @NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = oKComplianceRestrictionService;
        this.EZpvd = function0;
    }

    @Override // o.InterfaceC38110pMp
    public java.lang.Object KWHzl(@NotNull DeeplinkMode deeplinkMode, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        int i = Application.copydefault[deeplinkMode.ordinal()];
        boolean zAEQbTJ = true;
        if (i == 1) {
            zAEQbTJ = this.OLrzqt.AEQbTJ(OKComplianceRestrictionService.CefiMode.PRO);
        } else if (i == 2) {
            zAEQbTJ = this.OLrzqt.AEQbTJ(OKComplianceRestrictionService.CefiMode.LITE);
        } else if (i == 3) {
            zAEQbTJ = this.OLrzqt.OLrzqt(OKComplianceRestrictionService.AppMode.WEB3);
        } else if (i == 4) {
            zAEQbTJ = this.EZpvd.invoke().booleanValue();
        }
        return C56443yFo.KWHzl(zAEQbTJ);
    }
}
