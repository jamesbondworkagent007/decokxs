package com.okinc.common.okcore.analytics;

import com.okinc.common.okcore.analytics.OKCoreAnalyticsImpl;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C3551AoA;
import o.C3554AoD;
import o.C3555AoE;
import o.C56390yDp;
import o.C56423yEv;
import o.C6769aVd;
import o.InterfaceC3591Aoo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class OKCoreAnalyticsImpl implements InterfaceC3591Aoo {
    @Override // o.InterfaceC3591Aoo
    public void KWHzl(@NotNull String str, @NotNull final List<C3555AoE> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.mfD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKCoreAnalyticsImpl.copydefault(list, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    @Override // o.InterfaceC3591Aoo
    public void AEQbTJ(@NotNull C3551AoA c3551AoA, boolean z) {
        Intrinsics.checkNotNullParameter(c3551AoA, "");
        ReportManager.AEQbTJ.EZpvd(EZpvd(c3551AoA), z);
    }

    @Override // o.InterfaceC3591Aoo
    public void AEQbTJ(@NotNull C3554AoD c3554AoD) {
        Intrinsics.checkNotNullParameter(c3554AoD, "");
        C6769aVd.OLrzqt.AEQbTJ(new OKCoreNonFatalException("Rust-" + c3554AoD.EZpvd(), c3554AoD.AEQbTJ()), C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.REASON, c3554AoD.AEQbTJ())));
    }

    public final EventData EZpvd(C3551AoA c3551AoA) {
        EventData eventData = new EventData();
        eventData.setAct(c3551AoA.copydefault());
        eventData.setSource(c3551AoA.valueOf());
        eventData.setPath(c3551AoA.EZpvd());
        eventData.setCode(c3551AoA.AEQbTJ());
        eventData.setMsg(c3551AoA.KWHzl());
        eventData.setAttrs(c3551AoA.OLrzqt());
        return eventData;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class OKCoreNonFatalException extends Exception {
        private final String exceptionType;
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OKCoreNonFatalException(@NotNull String str, @NotNull String str2) {
            super(str + ": " + str2);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.exceptionType = str;
            this.reason = str2;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return this.exceptionType + ": " + this.reason;
        }
    }

    public static final Unit copydefault(List list, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3555AoE c3555AoE = (C3555AoE) it.next();
            eventParamsList.put(c3555AoE.EZpvd(), c3555AoE.AEQbTJ(), c3555AoE.copydefault());
        }
        return Unit.INSTANCE;
    }
}
