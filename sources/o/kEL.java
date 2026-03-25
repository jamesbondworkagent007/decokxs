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
public final class kEL extends C59534zip {
    public static final Activity Companion = new Activity(null);
    public static final java.util.Map<java.lang.String, java.lang.Integer> KWHzl = C56424yEw.gEmmrt(C56390yDp.OLrzqt("COIN", 0), C56390yDp.OLrzqt("SPOT", 1), C56390yDp.OLrzqt("MARGIN", 2), C56390yDp.OLrzqt("SWAP", 3), C56390yDp.OLrzqt("FUTURES", 4), C56390yDp.OLrzqt("OPTION", 5));

    public kEL(@NotNull C41421qqW c41421qqW, Function2<? super CoinQuote, ? super java.lang.Integer, Unit> function2, Function2<? super qWK, ? super java.lang.Integer, Unit> function22, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(c41421qqW, "");
        copydefault(c41421qqW, function2, function22, function0);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kEL.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.kEL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void registerItemTemplates$default(kEL kel, C41421qqW c41421qqW, Function2 function2, Function2 function22, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        kel.copydefault(c41421qqW, function2, function22, function0);
    }

    public final void copydefault(C41421qqW c41421qqW, Function2<? super CoinQuote, ? super java.lang.Integer, Unit> function2, Function2<? super qWK, ? super java.lang.Integer, Unit> function22, final Function0<Unit> function0) {
        register(C27622jyf.class, new kJB(new Function1() { // from class: o.kEJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kEL.AEQbTJ(function0, (android.view.View) obj);
            }
        }));
        register(qWK.class, new C27962kJu(c41421qqW, function22));
        InterfaceC59537zis interfaceC59537zisRegister = register(CoinQuote.class);
        C27966kJy c27966kJy = new C27966kJy(null, 1, null);
        c27966kJy.EZpvd(function2);
        c27966kJy.EZpvd("explore");
        c27966kJy.OLrzqt("favorites");
        c27966kJy.AEQbTJ("explore_card");
        Unit unit = Unit.INSTANCE;
        kJE kje = new kJE(null, null, 3, null);
        kje.copydefault("explore_card");
        kje.OLrzqt("favorites");
        kje.EZpvd(function2);
        kje.EZpvd("explore");
        kJC kjc = new kJC(null, null, 3, null);
        kjc.copydefault("explore_card");
        kjc.OLrzqt("favorites");
        kjc.EZpvd(function2);
        kjc.EZpvd("explore");
        kJF kjf = new kJF(null, false, 3, null);
        kjf.copydefault("explore_card");
        kjf.OLrzqt("favorites");
        kjf.EZpvd(function2);
        kjf.EZpvd("explore");
        kJA kja = new kJA(null, 1, null);
        kja.copydefault("explore_card");
        kja.OLrzqt("favorites");
        kja.EZpvd(function2);
        kja.EZpvd("explore");
        kJG kjg = new kJG(C42955rgF.copydefault.copydefault(), null, 2, null);
        kjg.OLrzqt("explore_card");
        kjg.copydefault("favorites");
        kjg.EZpvd(function2);
        kjg.EZpvd("explore");
        interfaceC59537zisRegister.copydefault(c27966kJy, kje, kjc, kjf, kja, kjg).AEQbTJ(new InterfaceC59531zim() { // from class: o.kEK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i, java.lang.Object obj) {
                return kEL.AEQbTJ(i, (CoinQuote) obj);
            }
        });
    }

    public static final Unit AEQbTJ(Function0 function0, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final int AEQbTJ(int i, CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.Integer num = KWHzl.get(coinQuote.getInstType());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
