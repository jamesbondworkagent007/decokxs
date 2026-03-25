package o;

import com.okinc.business.market.bean.CoinQuote;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kEO extends C59534zip {
    public static final ActionBar Companion = new ActionBar(null);
    public static final java.util.Map<java.lang.String, java.lang.Integer> EZpvd = C56424yEw.gEmmrt(C56390yDp.OLrzqt("COIN", 0), C56390yDp.OLrzqt("SPOT", 1), C56390yDp.OLrzqt("MARGIN", 2), C56390yDp.OLrzqt("SWAP", 3), C56390yDp.OLrzqt("FUTURES", 4), C56390yDp.OLrzqt("OPTION", 5));

    public kEO(@NotNull C41421qqW c41421qqW, Function2<? super CoinQuote, ? super java.lang.Integer, Unit> function2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(c41421qqW, "");
        OLrzqt(c41421qqW, function2, function0);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kEO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.kEO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void registerItemTemplates$default(kEO keo, C41421qqW c41421qqW, Function2 function2, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        keo.OLrzqt(c41421qqW, function2, function0);
    }

    public final void OLrzqt(C41421qqW c41421qqW, Function2<? super CoinQuote, ? super java.lang.Integer, Unit> function2, final Function0<Unit> function0) {
        register(C27622jyf.class, new C27956kJo(new Function1() { // from class: o.kEQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kEO.OLrzqt(function0, (android.view.View) obj);
            }
        }));
        C42955rgF c42955rgF = C42955rgF.copydefault;
        register(InterfaceC41655qus.class, new C27981kKm(c42955rgF.copydefault(), c41421qqW));
        InterfaceC59537zis interfaceC59537zisRegister = register(CoinQuote.class);
        C27971kKc c27971kKc = new C27971kKc(null, 1, 0 == true ? 1 : 0);
        c27971kKc.OLrzqt(function2);
        c27971kKc.AEQbTJ("home");
        c27971kKc.EZpvd("favorites");
        c27971kKc.KWHzl("homepage");
        Unit unit = Unit.INSTANCE;
        int i = 2;
        C27979kKk c27979kKk = new C27979kKk(c42955rgF.copydefault(), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        c27979kKk.copydefault("Home_Fav");
        c27979kKk.EZpvd("favorites");
        c27979kKk.OLrzqt(function2);
        C27974kKf c27974kKf = new C27974kKf(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        c27974kKf.copydefault("Home_Fav");
        c27974kKf.EZpvd("favorites");
        c27974kKf.OLrzqt(function2);
        c27974kKf.AEQbTJ("home");
        C27972kKd c27972kKd = new C27972kKd(c42955rgF.copydefault(), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        c27972kKd.copydefault("Home_Fav");
        c27972kKd.EZpvd("favorites");
        c27972kKd.OLrzqt(function2);
        c27972kKd.AEQbTJ("home");
        C27973kKe c27973kKe = new C27973kKe(c42955rgF.copydefault(), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        c27973kKe.copydefault("Home_Fav");
        c27973kKe.EZpvd("favorites");
        c27973kKe.OLrzqt(function2);
        c27973kKe.AEQbTJ("home");
        C27975kKg c27975kKg = new C27975kKg(c42955rgF.copydefault(), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        c27975kKg.EZpvd("favorites");
        c27975kKg.copydefault("Home_Fav");
        c27975kKg.OLrzqt(function2);
        c27975kKg.AEQbTJ("home");
        interfaceC59537zisRegister.copydefault(c27971kKc, c27979kKk, c27974kKf, c27972kKd, c27973kKe, c27975kKg).AEQbTJ(new InterfaceC59531zim() { // from class: o.kES
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i2, java.lang.Object obj) {
                return kEO.AEQbTJ(i2, (CoinQuote) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(Function0 function0, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AEQbTJ(int i, CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.Integer num = EZpvd.get(coinQuote.getInstType());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
