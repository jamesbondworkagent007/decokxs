package o;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.okinc.core.ok_app.homepage.domain.usecases.LiteAmpCommonParamUseCase$invoke$2;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mtK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C33269mtK {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;

    public final void copydefault(@NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "");
        if (!this.AEQbTJ) {
            this.AEQbTJ = true;
            RxBus.AEQbTJ("EVENT_OKEX_HOME_MODE_CHANGE").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.core.ok_app.homepage.domain.usecases.LiteAmpCommonParamUseCase$invoke$1
                {
                    super(this.this$0);
                }

                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(String str) {
                    this.this$0.EZpvd();
                }
            });
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, null, null, new LiteAmpCommonParamUseCase$invoke$2(this, null), 3, null);
    }

    public final void EZpvd() {
        InterfaceC33171mrS interfaceC33171mrS;
        InterfaceC33171mrS interfaceC33171mrS2 = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
        if (interfaceC33171mrS2 != null && !interfaceC33171mrS2.fIwbmz() && (interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class)) != null && interfaceC33171mrS.ejfBZ()) {
            copydefault();
        } else {
            AEQbTJ();
        }
    }

    public final void copydefault() {
        C43292rmY.OLrzqt.AEQbTJ("sub_mode", ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).KWHzl().getValue().AEQbTJ());
    }

    public final void AEQbTJ() {
        C43292rmY.OLrzqt.djBIcL();
    }

    /* JADX INFO: renamed from: o.mtK$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mtK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
