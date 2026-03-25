package o;

import com.okinc.im.OKIMNotificationExtension$getAllUnReadCountFlow$1;
import com.okinc.im.OKIMNotificationExtension$getAllUnReadCountFlow$2;
import com.okinc.im.config.ImEnabledStatus;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.InHouseIMChannelType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35170nqK extends AbstractC43215rlA implements rXE {

    /* JADX INFO: renamed from: o.nqK$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InHouseIMChannelType.values().length];
            try {
                iArr[InHouseIMChannelType.Individual.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InHouseIMChannelType.Group.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InHouseIMChannelType.Unknown.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[InHouseIMChannelType.SystemNotification.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    @Override // o.rXE
    public Flow<java.lang.Integer> copydefault() {
        return FlowKt.m7441catch(FlowKt.onEach(((sEZ) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), sEZ.class)).ggKfIT().OLrzqt().EZpvd(false, yDY.gEmmrt(com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType.Individual, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType.Group)), new OKIMNotificationExtension$getAllUnReadCountFlow$1(null)), new OKIMNotificationExtension$getAllUnReadCountFlow$2(null));
    }

    @Override // o.rXE
    public boolean OLrzqt() {
        return sDZ.AEQbTJ.uzCIH();
    }

    @Override // o.rXE
    public boolean KWHzl() {
        return oGU.KWHzl.AEQbTJ() == ImEnabledStatus.Limited;
    }

    @Override // o.rXE
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull InHouseIMChannelType inHouseIMChannelType, int i, @NotNull Continuation<? super Unit> continuation) {
        com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType inHouseIMChannelType2;
        InterfaceC44375sNm interfaceC44375sNmEZpvd = sDZ.AEQbTJ.AhwBna().EZpvd();
        int i2 = StateListAnimator.EZpvd[inHouseIMChannelType.ordinal()];
        if (i2 == 1) {
            inHouseIMChannelType2 = com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType.Individual;
        } else if (i2 == 2) {
            inHouseIMChannelType2 = com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType.Group;
        } else if (i2 == 3) {
            inHouseIMChannelType2 = com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType.Unknown;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            inHouseIMChannelType2 = com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType.SystemNotification;
        }
        java.lang.Object objAEQbTJ = interfaceC44375sNmEZpvd.AEQbTJ(str, inHouseIMChannelType2, i, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    @Override // o.rXE
    public Flow<java.lang.Integer> EZpvd() {
        return sDZ.AEQbTJ.AhwBna().djBIcL().copydefault();
    }
}
