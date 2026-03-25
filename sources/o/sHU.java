package o;

import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.okimcore.feature.contact.repository.remote.inhouseim.InHouseIMRelationService;
import com.okinc.okimcore.feature.core.InHouseIMClient$1;
import com.okinc.okimcore.model.im.ChannelConnectionStatus;
import dagger.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sHU {
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final Lazy<InterfaceC44301sKt> AYXKKw;
    public final Lazy<sGI> AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public final android.content.Context EZpvd;
    public final sIC OLrzqt;
    public final CoroutineScope copydefault;
    public Function1<? super ChannelConnectionStatus, Unit> djBIcL;
    public final InHouseIMRelationService gEmmrt;
    public Function1<? super java.lang.String, Unit> valueOf;
    public InterfaceC44228sIa values;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKWsConnectionState.values().length];
            try {
                iArr[OKWsConnectionState.OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKWsConnectionState.FAILURE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super java.lang.String, Unit> function1) {
        this.valueOf = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super ChannelConnectionStatus, Unit> function1) {
        this.djBIcL = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.im.ChannelConnectionStatus, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.okimcore.model.im.ChannelConnectionStatus, kotlin.Unit> */
    public final Function1<ChannelConnectionStatus, Unit> valueOf() {
        return this.djBIcL;
    }

    @yCM
    public sHU(@NotNull sIC sic, @NotNull InHouseIMRelationService inHouseIMRelationService, @NotNull Lazy<InterfaceC44301sKt> lazy, @NotNull Lazy<sGI> lazy2, @NotNull android.content.Context context, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(inHouseIMRelationService, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        Intrinsics.checkNotNullParameter(lazy2, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.OLrzqt = sic;
        this.gEmmrt = inHouseIMRelationService;
        this.AYXKKw = lazy;
        this.AhwBna = lazy2;
        this.EZpvd = context;
        this.copydefault = coroutineScope;
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.sHV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sHU.EZpvd(this.KWHzl);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sHT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sHU.AEQbTJ(this.copydefault);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, sDN.copydefault.copydefault(), null, new InHouseIMClient$1(this, null), 2, null);
    }

    public final sGI OLrzqt() {
        sGI sgi = this.AhwBna.get();
        Intrinsics.checkNotNullExpressionValue(sgi, "");
        return sgi;
    }

    public final InterfaceC44301sKt AkhnZx() {
        java.lang.Object value = this.DbNXlk.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (InterfaceC44301sKt) value;
    }

    public static final InterfaceC44301sKt EZpvd(sHU shu) {
        return shu.AYXKKw.get();
    }

    public final InterfaceC44178sGe AEQbTJ() {
        return (InterfaceC44178sGe) this.AEQbTJ.getValue();
    }

    public static final C44176sGc AEQbTJ(sHU shu) {
        return new C44176sGc(shu.OLrzqt, shu.gEmmrt, sDZ.AEQbTJ.fJNWhG());
    }

    public final boolean fetchVPNInfo() {
        int i = TaskDescription.EZpvd[AkhnZx().KWHzl().getValue().ordinal()];
        return i == 1 || i == 2;
    }

    public final OKWsConnectionState gEmmrt() {
        return AkhnZx().KWHzl().getValue();
    }

    public final java.lang.String isConnected() {
        return AkhnZx().valueOf().getValue();
    }

    public final StateFlow<sNJ> AYXKKw() {
        return AkhnZx().EZpvd();
    }

    public final SharedFlow<C44391sOb> AhwBna() {
        return AkhnZx().OLrzqt();
    }

    public final void OLrzqt(@NotNull InterfaceC44228sIa interfaceC44228sIa) {
        Intrinsics.checkNotNullParameter(interfaceC44228sIa, "");
        this.values = interfaceC44228sIa;
        AkhnZx().copydefault(this.values);
    }

    public final void DbNXlk() {
        if (fetchVPNInfo()) {
            AkhnZx().gEmmrt();
        }
    }

    public final void EZpvd() {
        AkhnZx().copydefault(this.values);
        AkhnZx().AEQbTJ();
    }

    public final void copydefault() {
        AkhnZx().copydefault(null);
        AkhnZx().copydefault();
    }
}
