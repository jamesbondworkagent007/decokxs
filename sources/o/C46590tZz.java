package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.tZz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C46590tZz {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt(int i) {
        return i != 0 ? i != 1 ? "unknown" : "modern" : "classic";
    }

    @yCM
    public C46590tZz() {
    }

    /* JADX INFO: renamed from: o.tZz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tZz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        C32866mlf.onEvent$default("UserCenter_ColorPreference_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.tZI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46590tZz.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public final void copydefault(final int i) {
        C32866mlf.onEvent$default("UserCenter_ColorPreference_ColorPalette_Click", (TrackChannel[]) null, new Function1() { // from class: o.tZA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46590tZz.EZpvd(this.AEQbTJ, i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(C46590tZz c46590tZz, int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "colorstyle", c46590tZz.OLrzqt(i), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final int i) {
        C32866mlf.onEvent$default("UserCenter_ColorPreference_ChartColor_Click", (TrackChannel[]) null, new Function1() { // from class: o.tZE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46590tZz.AEQbTJ(i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "chartcolor", java.lang.String.valueOf(i), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        C32866mlf.onEvent$default("Preferences_ColorPreference_RedUP_Click", (TrackChannel[]) null, new Function1() { // from class: o.tZG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46590tZz.gEmmrt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C32866mlf.onEvent$default("Preferences_ColorPreference_GreenUP_Click", (TrackChannel[]) null, new Function1() { // from class: o.tZD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46590tZz.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }
}
