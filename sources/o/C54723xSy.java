package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.lang.ref.SoftReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xSy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54723xSy {
    public static volatile SoftReference<java.util.List<TickersData>> EZpvd;
    public static final C54723xSy OLrzqt = new C54723xSy();
    public static C56131xwy AEQbTJ = new C56131xwy();
    public static final int KWHzl = 8;

    private C54723xSy() {
    }

    /* JADX INFO: renamed from: o.xSy$Activity */
    public static final class Activity implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Function1<java.util.List<TickersData>, Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<com.okinc.unify_trade.biz.subscribe.TickersData>, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(Function1<? super java.util.List<TickersData>, Unit> function1) {
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends TickersData> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<TickersData>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            if (z) {
                C54723xSy c54723xSy = C54723xSy.OLrzqt;
                C54723xSy.EZpvd = new SoftReference(list);
            }
            this.OLrzqt.invoke(list);
        }
    }

    public final void copydefault(@NotNull Function1<? super java.util.List<TickersData>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        SoftReference<java.util.List<TickersData>> softReference = EZpvd;
        function1.invoke(softReference != null ? softReference.get() : null);
        AEQbTJ.KWHzl(new Activity(function1));
    }
}
