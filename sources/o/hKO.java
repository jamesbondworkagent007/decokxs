package o;

import androidx.lifecycle.ViewModelProvider;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hKO extends AbstractC19760gOh {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int isConnected = 8;
    public final InterfaceC56387yDm AuCTel = C31200lpY.copydefault(this);
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.hKS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return hKO.copydefault(this.AEQbTJ);
        }
    });

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hKO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final hKO OLrzqt(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            hKO hko = new hKO();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putBoolean("data", z);
            hko.setArguments(bundle);
            return hko;
        }
    }

    private final java.lang.String OLrzqt() {
        return (java.lang.String) this.AuCTel.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/gOJ; */
    /* JADX DEBUG: Possible override for method o.gOh.copydefault()V */
    @Override // o.AbstractC19760gOh
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C22479hgD KWHzl() {
        return (C22479hgD) this.DbNXlk.getValue();
    }

    public static final C22479hgD copydefault(hKO hko) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = hko.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return (C22479hgD) new ViewModelProvider(fragmentRequireParentFragment).get(C22479hgD.class);
    }

    @Override // o.AbstractC19760gOh
    public Calendar EZpvd() {
        return C22380heK.OLrzqt.copydefault(OLrzqt()).AYXKKw().OLrzqt();
    }

    @Override // o.AbstractC19760gOh
    public void copydefault(Calendar calendar) {
        C22380heK.OLrzqt.copydefault(OLrzqt()).AYXKKw().EZpvd(calendar);
    }
}
