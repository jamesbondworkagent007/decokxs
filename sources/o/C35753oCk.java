package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.im.usecase.banner.ObserveScamBannerUseCase$execute$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35753oCk {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final oFJ EZpvd;
    public final C35863oGm OLrzqt;
    public final oCI copydefault;

    @yCM
    public C35753oCk(@NotNull oCI oci, @NotNull C35863oGm c35863oGm, @NotNull oFJ ofj, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(ofj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = oci;
        this.OLrzqt = c35863oGm;
        this.EZpvd = ofj;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.oCk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final C36559odJ AEQbTJ(OKConversation oKConversation, RelationInfo relationInfo, IMPageType iMPageType) {
        java.lang.Boolean boolCopydefault;
        boolean zBooleanValue = false;
        boolean zEZpvd = (oKConversation == null || relationInfo == null) ? false : oBF.OLrzqt.EZpvd(oKConversation, relationInfo);
        if (oKConversation != null && (boolCopydefault = oBJ.EZpvd.copydefault(oKConversation.getTargetId())) != null) {
            zBooleanValue = boolCopydefault.booleanValue();
        }
        boolean zDbNXlk = this.EZpvd.KWHzl(iMPageType).DbNXlk();
        java.lang.String targetId = oKConversation != null ? oKConversation.getTargetId() : null;
        pUU.KWHzl("ObserveScamBannerUseCase", "[" + targetId + "]getScamBanner: isEligibleForShowScamBanner = " + zEZpvd);
        pUU.KWHzl("ObserveScamBannerUseCase", "[" + targetId + "]getScamBanner: isDismissBannerBefore = " + zBooleanValue);
        pUU.KWHzl("ObserveScamBannerUseCase", "[" + targetId + "]getScamBanner: isAllowScamBannerFromPageConfig = " + zDbNXlk);
        C36559odJ c36559odJ = C36559odJ.AEQbTJ;
        if (zEZpvd && !zBooleanValue && zDbNXlk) {
            return c36559odJ;
        }
        return null;
    }

    public final Flow<C36559odJ> AEQbTJ(@NotNull java.lang.String str, IMPageType iMPageType) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(FlowKt.combine(this.copydefault.KWHzl(str), this.OLrzqt.EZpvd(str), new ObserveScamBannerUseCase$execute$1(this, iMPageType, null)), this.AEQbTJ);
    }
}
