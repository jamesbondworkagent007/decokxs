package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.BotWebHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oXl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36321oXl extends oWO {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public final C36312oXc djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.oWO
    public java.lang.String KWHzl() {
        return "StateZoom";
    }

    public C36321oXl(@NotNull C36312oXc c36312oXc) {
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        this.djBIcL = c36312oXc;
    }

    @Override // o.oWO
    public boolean AkhnZx(@NotNull android.view.MotionEvent motionEvent) {
        C36250oUv c36250oUvDbNXlk;
        oWN own;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (C36246oUr.copydefault().DNMMPQ() && C36246oUr.copydefault().zLjUOn().getChartMode() != 2 && ((Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().zLjUOn().getMode(), (java.lang.Object) "pro_mode") || Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().zLjUOn().getMode(), (java.lang.Object) "lite_mode")) && (own = c36246oUrCopydefault.DCJXGO().get("ds0")) != null)) {
            C36246oUr.copydefault().AEQbTJ = (int) ((own.AhwBna() * 2) - own.fetchVPNInfo());
        }
        if (c36246oUrCopydefault.zLjUOn().isCeFiMCapMode()) {
            AYXKKw();
        } else {
            copydefault();
        }
        C36312oXc c36312oXc = this.djBIcL;
        c36312oXc.EZpvd(c36312oXc.zLjUOn);
        if (motionEvent.getPointerCount() <= 2 && (c36250oUvDbNXlk = this.djBIcL.DbNXlk()) != null) {
            c36250oUvDbNXlk.EZpvd(false);
        }
        return true;
    }

    @Override // o.oWO
    public boolean DbNXlk(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.DbNXlk(motionEvent);
        float fCopydefault = C36326oXq.copydefault(motionEvent);
        if (java.lang.Math.abs(fCopydefault - this.djBIcL.fetchVPNInfo()) > 5.0f) {
            C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
            if (c36246oUrCopydefault.DCJXGO().get("ds0") != null) {
                oWN own = c36246oUrCopydefault.DCJXGO().get("ds0");
                Intrinsics.copydefault(own);
                own.EZpvd(true);
                oWN own2 = c36246oUrCopydefault.DCJXGO().get("ds0");
                Intrinsics.copydefault(own2);
                own2.EZpvd(fCopydefault - this.djBIcL.fetchVPNInfo(), fCopydefault > this.djBIcL.fetchVPNInfo() ? 1 : -1);
            }
            this.djBIcL.EZpvd(fCopydefault);
            C36250oUv c36250oUvDbNXlk = this.djBIcL.DbNXlk();
            if (c36250oUvDbNXlk != null) {
                c36250oUvDbNXlk.invalidate();
            }
            C36250oUv c36250oUvDbNXlk2 = this.djBIcL.DbNXlk();
            if (c36250oUvDbNXlk2 != null) {
                c36250oUvDbNXlk2.EZpvd(true);
            }
        }
        return true;
    }

    @Override // o.oWO
    public boolean AYXKKw(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.AYXKKw(motionEvent);
        C36312oXc c36312oXc = this.djBIcL;
        c36312oXc.EZpvd(c36312oXc.zLjUOn);
        return false;
    }

    @Override // o.oWO
    public void EZpvd() {
        super.EZpvd();
        oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
        if (own != null) {
            C43296rmc.KWHzl("eddie", "zoomout stateDrag setScaleCenterAt onActionPointerDown" + own.AubY());
            own.valueOf(own.fJNWhG());
            own.AYXKKw(own.AhwBna());
            own.OLrzqt(0, 0);
        }
    }

    @Override // o.oWO
    public void OLrzqt() {
        super.OLrzqt();
        oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
        if (own != null) {
            own.gEmmrt();
            own.EZpvd(false);
        }
    }

    /* JADX INFO: renamed from: o.oXl$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oXl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void copydefault() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KLine_Mid_Chart_Interact", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oXp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36321oXl.EZpvd((EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(BotWebHook.KEY_ACTION, "zoom", true);
        eventParamsList.put("chart_location", "kline_page", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        EventParamsList.put$default(eventParamsList, "is_cedefi", C36246oUr.copydefault().RKDWNf() ? "1" : "0", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        C32866mlf.onEvent$default("Chart_MarketCap_Chart_Zoom", (TrackChannel[]) null, new Function1() { // from class: o.oXo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36321oXl.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }
}
