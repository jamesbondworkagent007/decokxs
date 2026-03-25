package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinWatchInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tcK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46708tcK {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = BizInstrument.$stable;
    public final BizInstrument KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizInstrument EZpvd() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.tcK$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tcK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.util.ArrayList<C46708tcK> OLrzqt(@NotNull java.util.ArrayList<BizInstrument> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C46708tcK((BizInstrument) it.next()));
            }
            return new java.util.ArrayList<>(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2));
        }
    }

    public C46708tcK(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.KWHzl = bizInstrument;
    }

    public final java.lang.String AEQbTJ(SpotInstrument spotInstrument) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) spotInstrument.getLevel())) {
            return "";
        }
        return " " + spotInstrument.getLevel() + "X";
    }

    public final java.lang.CharSequence copydefault(@NotNull android.text.style.TextAppearanceSpan textAppearanceSpan) {
        java.lang.String instId;
        Intrinsics.checkNotNullParameter(textAppearanceSpan, "");
        BizInstrument bizInstrument = this.KWHzl;
        if (bizInstrument instanceof CoinWatchInstrument) {
            CoinWatchInstrument coinWatchInstrument = (CoinWatchInstrument) bizInstrument;
            return (coinWatchInstrument == null || (instId = coinWatchInstrument.getInstId()) == null) ? "" : instId;
        }
        if (bizInstrument instanceof SpotInstrument) {
            SpotInstrument spotInstrument = (SpotInstrument) bizInstrument;
            java.lang.String strKWHzl = pXH.AEQbTJ.KWHzl(spotInstrument != null ? spotInstrument.getInstId() : null);
            if (strKWHzl == null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                strKWHzl = "".toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(strKWHzl, "");
            }
            java.lang.String strReplace$default = C59449zhJ.replace$default(strKWHzl, "_", "/", false, 4, (java.lang.Object) null);
            BizInstrument bizInstrument2 = this.KWHzl;
            Intrinsics.copydefault(bizInstrument2, "");
            return strReplace$default + AEQbTJ((SpotInstrument) bizInstrument2);
        }
        if (bizInstrument instanceof FutureInstrument) {
            return C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, bizInstrument, false, 2, null);
        }
        if (bizInstrument instanceof SwapInstrument) {
            return C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, bizInstrument, false, 2, null);
        }
        if (bizInstrument instanceof OptionInstrument) {
            return pXH.AEQbTJ.EZpvd(bizInstrument.getInstId());
        }
        return null;
    }
}
