package o;

import com.okinc.biz.statistics.repository.StatisticsAPI;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import retrofit2.Converter;

/* JADX INFO: renamed from: o.aYT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6918aYT extends C43280rmM {
    public static final ActionBar Companion = new ActionBar(null);
    public static final InterfaceC56387yDm<C6918aYT> EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.aYP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6918aYT.KWHzl();
        }
    });

    public C6918aYT() {
        super(null, 1, null);
    }

    /* JADX INFO: renamed from: o.aYT$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aYT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C6918aYT OLrzqt() {
            return (C6918aYT) C6918aYT.EZpvd.getValue();
        }

        public final StatisticsAPI KWHzl() {
            return (StatisticsAPI) C43393roT.EZpvd(C56524yIo.AEQbTJ(StatisticsAPI.class), OLrzqt());
        }
    }

    public static final C6918aYT KWHzl() {
        return new C6918aYT();
    }

    @Override // o.C43395roV
    public java.util.List<Converter.Factory> getConvertFactories() {
        return C56402yEa.EZpvd(C6915aYQ.OLrzqt());
    }
}
