package o;

import com.okinc.market.search.features.main.result.ui.SubPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39985qFb extends AbstractC39961qEe {
    public C39985qFb(@NotNull Function1<? super java.lang.Long, Unit> function1, @NotNull final C41607qtx c41607qtx) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(c41607qtx, "");
        register(qFA.class, new qEJ());
        register(C40002qFs.class, new qEF());
        SubPage subPage = SubPage.ALL;
        register(C39994qFk.class, new C39968qEl(subPage));
        register(C40005qFv.class, new qEG(subPage));
        register(C40003qFt.class, new qEE(function1));
        register(C39996qFm.class, new qEC());
        register(C39995qFl.class, new C39965qEi());
        register(C39999qFp.class).copydefault(new qEA(), new C39970qEn()).AEQbTJ(new InterfaceC59531zim() { // from class: o.qEX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i, java.lang.Object obj) {
                return C39985qFb.OLrzqt(c41607qtx, i, (C39999qFp) obj);
            }
        });
        register(C40000qFq.class, new C39978qEv());
        register(C40006qFw.class, new C39989qFf());
        register(C40009qFz.class, new qEK());
        register(C39992qFi.class, new C39966qEj());
        register(C39993qFj.class, new C39962qEf());
        register(C39991qFh.class, new C39976qEt());
        register(C39997qFn.class, new C39979qEw());
        register(C39986qFc.class, new C39990qFg());
        register(qES.class, new qEW());
        register(C40004qFu.class, new C39981qEy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int OLrzqt(C41607qtx c41607qtx, int i, C39999qFp c39999qFp) {
        Intrinsics.checkNotNullParameter(c39999qFp, "");
        return c41607qtx.AEQbTJ(Unit.INSTANCE).booleanValue() ? 1 : 0;
    }
}
