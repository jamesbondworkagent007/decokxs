package com.okinc.auth.impl.passkey.ui.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.auth.impl.passkey.ui.bottomsheet.Error50162BottomSheet;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C32868mlh;
import o.C33054mpH;
import o.C43454rpb;
import o.C52781wYc;
import o.C52794wYp;
import o.C55296xhK;
import o.C56390yDp;
import o.C56392yDr;
import o.C56444yFp;
import o.C8291azv;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.wXX;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class Error50162BottomSheet extends wXX {
    public Function0<Unit> OLrzqt;
    public Function0<Unit> copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.aId
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(Error50162BottomSheet.EZpvd(this.KWHzl));
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.aIf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return Error50162BottomSheet.AEQbTJ(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EventFlow {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EventFlow[] $VALUES;
        private final String value;
        public static final EventFlow EXCHANGE = new EventFlow("EXCHANGE", 0, "exchange");
        public static final EventFlow PAY = new EventFlow("PAY", 1, "pay");
        public static final EventFlow CEDEFI = new EventFlow("CEDEFI", 2, "cedefi");
        public static final EventFlow ASSET = new EventFlow("ASSET", 3, "asset");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EventFlow[] $values() {
            return new EventFlow[]{EXCHANGE, PAY, CEDEFI, ASSET};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EventFlow> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private EventFlow(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            EventFlow[] eventFlowArr$values = $values();
            $VALUES = eventFlowArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(eventFlowArr$values);
        }

        public static EventFlow valueOf(String str) {
            return (EventFlow) Enum.valueOf(EventFlow.class, str);
        }

        public static EventFlow[] values() {
            return (EventFlow[]) $VALUES.clone();
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.bottomsheet.Error50162BottomSheet.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final Error50162BottomSheet EZpvd(boolean z, @NotNull EventFlow eventFlow) {
            Intrinsics.checkNotNullParameter(eventFlow, "");
            Error50162BottomSheet error50162BottomSheet = new Error50162BottomSheet();
            error50162BottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_SUPPORT_REMOVE_PASSKEY", Boolean.valueOf(z)), C56390yDp.OLrzqt("KEY_EVENT_FLOW", eventFlow)));
            return error50162BottomSheet;
        }
    }

    public final boolean copydefault() {
        return ((Boolean) this.KWHzl.getValue()).booleanValue();
    }

    public static final boolean EZpvd(Error50162BottomSheet error50162BottomSheet) {
        Bundle arguments = error50162BottomSheet.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("KEY_SUPPORT_REMOVE_PASSKEY", true);
        }
        return true;
    }

    public final EventFlow KWHzl() {
        return (EventFlow) this.EZpvd.getValue();
    }

    public static final EventFlow AEQbTJ(Error50162BottomSheet error50162BottomSheet) {
        Object parcelable;
        Bundle arguments = error50162BottomSheet.getArguments();
        return (arguments == null || (parcelable = arguments.getParcelable("KEY_EVENT_FLOW")) == null) ? EventFlow.EXCHANGE : (EventFlow) parcelable;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C8291azv c8291azvOLrzqt = C8291azv.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        ImageView imageView = c8291azvOLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        Context context = c8291azvOLrzqt.EZpvd.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/auth/android/passkey/google_play_service.png", context, false), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        C52794wYp c52794wYp = c8291azvOLrzqt.AEQbTJ;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = c8291azvOLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
        c52794wYp2.setVisibility(copydefault() ? 0 : 8);
        C52794wYp c52794wYp3 = c8291azvOLrzqt.KWHzl;
        c52794wYp3.setOnClickListener(new Application(c52794wYp3, 1000L, this));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Experiment_Passkey50162Issue_ButtonSheet_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aHX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return Error50162BottomSheet.copydefault(this.OLrzqt, (EventParamsList) obj);
            }
        });
    }

    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "guide", false, 4, null);
            EventParamsList.put$default(eventParamsList, "flow", Error50162BottomSheet.this.KWHzl().getValue(), false, 4, null);
        }
    }

    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "remove", false, 4, null);
            EventParamsList.put$default(eventParamsList, "flow", Error50162BottomSheet.this.KWHzl().getValue(), false, 4, null);
        }
    }

    public static final Unit copydefault(Error50162BottomSheet error50162BottomSheet, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "experiment_name", "account_passkey_phase1_experiment", false, 4, null);
        EventParamsList.put$default(eventParamsList, "experiment_variant", "treatment", false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow", error50162BottomSheet.KWHzl().getValue(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
        this.OLrzqt = null;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ Error50162BottomSheet OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, Error50162BottomSheet error50162BottomSheet) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = error50162BottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
                Function0<Unit> function0EZpvd = this.OLrzqt.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("Account_Passkey50162Issue_ButtonSheet_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), this.OLrzqt.new StateListAnimator());
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ Error50162BottomSheet OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, Error50162BottomSheet error50162BottomSheet) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = error50162BottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
                Function0<Unit> function0AEQbTJ = this.OLrzqt.AEQbTJ();
                if (function0AEQbTJ != null) {
                    function0AEQbTJ.invoke();
                }
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("Account_Passkey50162Issue_ButtonSheet_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), this.OLrzqt.new ActionBar());
            }
        }
    }
}
